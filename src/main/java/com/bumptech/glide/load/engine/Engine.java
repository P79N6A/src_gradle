package com.bumptech.glide.load.engine;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.support.v4.util.Pools;
import android.util.Log;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.EngineResource;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.DiskCacheAdapter;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.request.ResourceCallback;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import com.bumptech.glide.util.pool.FactoryPools;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class Engine implements EngineJobListener, EngineResource.ResourceListener, MemoryCache.ResourceRemovedListener {
    private static final boolean VERBOSE_IS_LOGGABLE = Log.isLoggable("Engine", 2);
    private final ActiveResources activeResources;
    private final MemoryCache cache;
    private final DecodeJobFactory decodeJobFactory;
    private final LazyDiskCacheProvider diskCacheProvider;
    private final EngineJobFactory engineJobFactory;
    private final Jobs jobs;
    private final EngineKeyFactory keyFactory;
    private final ResourceRecycler resourceRecycler;

    @VisibleForTesting
    static class DecodeJobFactory {
        private int creationOrder;
        final DecodeJob.DiskCacheProvider diskCacheProvider;
        final Pools.Pool<DecodeJob<?>> pool = FactoryPools.simple(150, new FactoryPools.Factory<DecodeJob<?>>() {
            public DecodeJob<?> create() {
                return new DecodeJob<>(DecodeJobFactory.this.diskCacheProvider, DecodeJobFactory.this.pool);
            }
        });

        DecodeJobFactory(DecodeJob.DiskCacheProvider diskCacheProvider2) {
            this.diskCacheProvider = diskCacheProvider2;
        }

        /* access modifiers changed from: package-private */
        public <R> DecodeJob<R> build(GlideContext glideContext, Object obj, EngineKey engineKey, Key key, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, DiskCacheStrategy diskCacheStrategy, Map<Class<?>, Transformation<?>> map, boolean z, boolean z2, boolean z3, Options options, DecodeJob.Callback<R> callback) {
            DecodeJob decodeJob = (DecodeJob) Preconditions.checkNotNull((DecodeJob) this.pool.acquire());
            int i3 = this.creationOrder;
            int i4 = i3;
            this.creationOrder = i3 + 1;
            return decodeJob.init(glideContext, obj, engineKey, key, i, i2, cls, cls2, priority, diskCacheStrategy, map, z, z2, z3, options, callback, i4);
        }
    }

    @VisibleForTesting
    static class EngineJobFactory {
        final GlideExecutor animationExecutor;
        final GlideExecutor diskCacheExecutor;
        final EngineJobListener listener;
        final Pools.Pool<EngineJob<?>> pool = FactoryPools.simple(150, new FactoryPools.Factory<EngineJob<?>>() {
            public EngineJob<?> create() {
                EngineJob engineJob = new EngineJob(EngineJobFactory.this.diskCacheExecutor, EngineJobFactory.this.sourceExecutor, EngineJobFactory.this.sourceUnlimitedExecutor, EngineJobFactory.this.animationExecutor, EngineJobFactory.this.listener, EngineJobFactory.this.pool);
                return engineJob;
            }
        });
        final GlideExecutor sourceExecutor;
        final GlideExecutor sourceUnlimitedExecutor;

        /* access modifiers changed from: package-private */
        @VisibleForTesting
        public void shutdown() {
            shutdownAndAwaitTermination(this.diskCacheExecutor);
            shutdownAndAwaitTermination(this.sourceExecutor);
            shutdownAndAwaitTermination(this.sourceUnlimitedExecutor);
            shutdownAndAwaitTermination(this.animationExecutor);
        }

        private static void shutdownAndAwaitTermination(ExecutorService executorService) {
            executorService.shutdown();
            try {
                if (!executorService.awaitTermination(5, TimeUnit.SECONDS)) {
                    executorService.shutdownNow();
                    if (!executorService.awaitTermination(5, TimeUnit.SECONDS)) {
                        throw new RuntimeException("Failed to shutdown");
                    }
                }
            } catch (InterruptedException e2) {
                throw new RuntimeException(e2);
            }
        }

        EngineJobFactory(GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, EngineJobListener engineJobListener) {
            this.diskCacheExecutor = glideExecutor;
            this.sourceExecutor = glideExecutor2;
            this.sourceUnlimitedExecutor = glideExecutor3;
            this.animationExecutor = glideExecutor4;
            this.listener = engineJobListener;
        }

        /* access modifiers changed from: package-private */
        public <R> EngineJob<R> build(Key key, boolean z, boolean z2, boolean z3, boolean z4) {
            return ((EngineJob) Preconditions.checkNotNull((EngineJob) this.pool.acquire())).init(key, z, z2, z3, z4);
        }
    }

    static class LazyDiskCacheProvider implements DecodeJob.DiskCacheProvider {
        private volatile DiskCache diskCache;
        private final DiskCache.Factory factory;

        /* access modifiers changed from: package-private */
        @VisibleForTesting
        public synchronized void clearDiskCacheIfCreated() {
            if (this.diskCache != null) {
                this.diskCache.clear();
            }
        }

        public DiskCache getDiskCache() {
            if (this.diskCache == null) {
                synchronized (this) {
                    if (this.diskCache == null) {
                        this.diskCache = this.factory.build();
                    }
                    if (this.diskCache == null) {
                        this.diskCache = new DiskCacheAdapter();
                    }
                }
            }
            return this.diskCache;
        }

        LazyDiskCacheProvider(DiskCache.Factory factory2) {
            this.factory = factory2;
        }
    }

    public static class LoadStatus {
        private final ResourceCallback cb;
        private final EngineJob<?> engineJob;

        public void cancel() {
            this.engineJob.removeCallback(this.cb);
        }

        LoadStatus(ResourceCallback resourceCallback, EngineJob<?> engineJob2) {
            this.cb = resourceCallback;
            this.engineJob = engineJob2;
        }
    }

    private static void logWithTimeAndKey(String str, long j, Key key) {
    }

    public void clearDiskCache() {
        this.diskCacheProvider.getDiskCache().clear();
    }

    @VisibleForTesting
    public void shutdown() {
        this.engineJobFactory.shutdown();
        this.diskCacheProvider.clearDiskCacheIfCreated();
        this.activeResources.shutdown();
    }

    public void onResourceRemoved(@NonNull Resource<?> resource) {
        Util.assertMainThread();
        this.resourceRecycler.recycle(resource);
    }

    private EngineResource<?> getEngineResourceFromCache(Key key) {
        Resource remove = this.cache.remove(key);
        if (remove == null) {
            return null;
        }
        if (remove instanceof EngineResource) {
            return (EngineResource) remove;
        }
        return new EngineResource<>(remove, true, true);
    }

    public void release(Resource<?> resource) {
        Util.assertMainThread();
        if (resource instanceof EngineResource) {
            ((EngineResource) resource).release();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    @Nullable
    private EngineResource<?> loadFromActiveResources(Key key, boolean z) {
        if (!z) {
            return null;
        }
        EngineResource<?> engineResource = this.activeResources.get(key);
        if (engineResource != null) {
            engineResource.acquire();
        }
        return engineResource;
    }

    public void onEngineJobCancelled(EngineJob<?> engineJob, Key key) {
        Util.assertMainThread();
        this.jobs.removeIfCurrent(key, engineJob);
    }

    private EngineResource<?> loadFromCache(Key key, boolean z) {
        if (!z) {
            return null;
        }
        EngineResource<?> engineResourceFromCache = getEngineResourceFromCache(key);
        if (engineResourceFromCache != null) {
            engineResourceFromCache.acquire();
            this.activeResources.activate(key, engineResourceFromCache);
        }
        return engineResourceFromCache;
    }

    public void onResourceReleased(Key key, EngineResource<?> engineResource) {
        Util.assertMainThread();
        this.activeResources.deactivate(key);
        if (engineResource.isCacheable()) {
            this.cache.put(key, engineResource);
        } else {
            this.resourceRecycler.recycle(engineResource);
        }
    }

    public void onEngineJobComplete(EngineJob<?> engineJob, Key key, EngineResource<?> engineResource) {
        Util.assertMainThread();
        if (engineResource != null) {
            engineResource.setResourceListener(key, this);
            if (engineResource.isCacheable()) {
                this.activeResources.activate(key, engineResource);
            }
        }
        this.jobs.removeIfCurrent(key, engineJob);
    }

    public Engine(MemoryCache memoryCache, DiskCache.Factory factory, GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, boolean z) {
        this(memoryCache, factory, glideExecutor, glideExecutor2, glideExecutor3, glideExecutor4, null, null, null, null, null, null, z);
    }

    @VisibleForTesting
    Engine(MemoryCache memoryCache, DiskCache.Factory factory, GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, Jobs jobs2, EngineKeyFactory engineKeyFactory, ActiveResources activeResources2, EngineJobFactory engineJobFactory2, DecodeJobFactory decodeJobFactory2, ResourceRecycler resourceRecycler2, boolean z) {
        ActiveResources activeResources3;
        EngineKeyFactory engineKeyFactory2;
        Jobs jobs3;
        EngineJobFactory engineJobFactory3;
        DecodeJobFactory decodeJobFactory3;
        ResourceRecycler resourceRecycler3;
        this.cache = memoryCache;
        DiskCache.Factory factory2 = factory;
        this.diskCacheProvider = new LazyDiskCacheProvider(factory);
        if (activeResources2 == null) {
            activeResources3 = new ActiveResources(z);
        } else {
            activeResources3 = activeResources2;
        }
        this.activeResources = activeResources3;
        activeResources3.setListener(this);
        if (engineKeyFactory == null) {
            engineKeyFactory2 = new EngineKeyFactory();
        } else {
            engineKeyFactory2 = engineKeyFactory;
        }
        this.keyFactory = engineKeyFactory2;
        if (jobs2 == null) {
            jobs3 = new Jobs();
        } else {
            jobs3 = jobs2;
        }
        this.jobs = jobs3;
        if (engineJobFactory2 == null) {
            engineJobFactory3 = new EngineJobFactory(glideExecutor, glideExecutor2, glideExecutor3, glideExecutor4, this);
        } else {
            engineJobFactory3 = engineJobFactory2;
        }
        this.engineJobFactory = engineJobFactory3;
        if (decodeJobFactory2 == null) {
            decodeJobFactory3 = new DecodeJobFactory(this.diskCacheProvider);
        } else {
            decodeJobFactory3 = decodeJobFactory2;
        }
        this.decodeJobFactory = decodeJobFactory3;
        if (resourceRecycler2 == null) {
            resourceRecycler3 = new ResourceRecycler();
        } else {
            resourceRecycler3 = resourceRecycler2;
        }
        this.resourceRecycler = resourceRecycler3;
        memoryCache.setResourceRemovedListener(this);
    }

    public <R> LoadStatus load(GlideContext glideContext, Object obj, Key key, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, DiskCacheStrategy diskCacheStrategy, Map<Class<?>, Transformation<?>> map, boolean z, boolean z2, Options options, boolean z3, boolean z4, boolean z5, boolean z6, ResourceCallback resourceCallback) {
        long j;
        boolean z7 = z3;
        ResourceCallback resourceCallback2 = resourceCallback;
        Util.assertMainThread();
        if (VERBOSE_IS_LOGGABLE) {
            j = LogTime.getLogTime();
        } else {
            j = 0;
        }
        long j2 = j;
        EngineKey buildKey = this.keyFactory.buildKey(obj, key, i, i2, map, cls, cls2, options);
        EngineResource<?> loadFromActiveResources = loadFromActiveResources(buildKey, z7);
        if (loadFromActiveResources != null) {
            resourceCallback2.onResourceReady(loadFromActiveResources, DataSource.MEMORY_CACHE);
            if (VERBOSE_IS_LOGGABLE) {
                logWithTimeAndKey("Loaded resource from active resources", j2, buildKey);
            }
            return null;
        }
        EngineResource<?> loadFromCache = loadFromCache(buildKey, z7);
        if (loadFromCache != null) {
            resourceCallback2.onResourceReady(loadFromCache, DataSource.MEMORY_CACHE);
            if (VERBOSE_IS_LOGGABLE) {
                logWithTimeAndKey("Loaded resource from cache", j2, buildKey);
            }
            return null;
        }
        EngineJob engineJob = this.jobs.get(buildKey, z6);
        if (engineJob != null) {
            engineJob.addCallback(resourceCallback2);
            if (VERBOSE_IS_LOGGABLE) {
                logWithTimeAndKey("Added to existing load", j2, buildKey);
            }
            return new LoadStatus(resourceCallback2, engineJob);
        }
        EngineJob build = this.engineJobFactory.build(buildKey, z3, z4, z5, z6);
        DecodeJob<R> build2 = this.decodeJobFactory.build(glideContext, obj, buildKey, key, i, i2, cls, cls2, priority, diskCacheStrategy, map, z, z2, z6, options, build);
        this.jobs.put(buildKey, build);
        build.addCallback(resourceCallback2);
        build.start(build2);
        if (VERBOSE_IS_LOGGABLE) {
            logWithTimeAndKey("Started new load", j2, buildKey);
        }
        return new LoadStatus(resourceCallback2, build);
    }
}
