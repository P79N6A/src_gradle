package com.bumptech.glide.load.engine;

import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.util.Pools;
import android.util.Log;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.engine.DataFetcherGenerator;
import com.bumptech.glide.load.engine.DecodePath;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.GlideTrace;
import com.bumptech.glide.util.pool.StateVerifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DecodeJob<R> implements DataFetcherGenerator.FetcherReadyCallback, FactoryPools.Poolable, Comparable<DecodeJob<?>>, Runnable {
    private Callback<R> callback;
    private Key currentAttemptingKey;
    private Object currentData;
    private DataSource currentDataSource;
    private DataFetcher<?> currentFetcher;
    private volatile DataFetcherGenerator currentGenerator;
    private Key currentSourceKey;
    private Thread currentThread;
    private final DecodeHelper<R> decodeHelper = new DecodeHelper<>();
    private final DeferredEncodeManager<?> deferredEncodeManager = new DeferredEncodeManager<>();
    private final DiskCacheProvider diskCacheProvider;
    private DiskCacheStrategy diskCacheStrategy;
    private GlideContext glideContext;
    private int height;
    private volatile boolean isCallbackNotified;
    private volatile boolean isCancelled;
    private EngineKey loadKey;
    private Object model;
    private boolean onlyRetrieveFromCache;
    private Options options;
    private int order;
    private final Pools.Pool<DecodeJob<?>> pool;
    private Priority priority;
    private final ReleaseManager releaseManager = new ReleaseManager();
    private RunReason runReason;
    private Key signature;
    private Stage stage;
    private long startFetchTime;
    private final StateVerifier stateVerifier = StateVerifier.newInstance();
    private final List<Throwable> throwables = new ArrayList();
    private int width;

    interface Callback<R> {
        void onLoadFailed(GlideException glideException);

        void onResourceReady(Resource<R> resource, DataSource dataSource);

        void reschedule(DecodeJob<?> decodeJob);
    }

    final class DecodeCallback<Z> implements DecodePath.DecodeCallback<Z> {
        private final DataSource dataSource;

        @NonNull
        public final Resource<Z> onResourceDecoded(@NonNull Resource<Z> resource) {
            return DecodeJob.this.onResourceDecoded(this.dataSource, resource);
        }

        DecodeCallback(DataSource dataSource2) {
            this.dataSource = dataSource2;
        }
    }

    static class DeferredEncodeManager<Z> {
        private ResourceEncoder<Z> encoder;
        private Key key;
        private LockedResource<Z> toEncode;

        DeferredEncodeManager() {
        }

        /* access modifiers changed from: package-private */
        public void clear() {
            this.key = null;
            this.encoder = null;
            this.toEncode = null;
        }

        /* access modifiers changed from: package-private */
        public boolean hasResourceToEncode() {
            if (this.toEncode != null) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void encode(DiskCacheProvider diskCacheProvider, Options options) {
            GlideTrace.beginSection("DecodeJob.encode");
            try {
                diskCacheProvider.getDiskCache().put(this.key, new DataCacheWriter(this.encoder, this.toEncode, options));
            } finally {
                this.toEncode.unlock();
                GlideTrace.endSection();
            }
        }

        /* access modifiers changed from: package-private */
        public <X> void init(Key key2, ResourceEncoder<X> resourceEncoder, LockedResource<X> lockedResource) {
            this.key = key2;
            this.encoder = resourceEncoder;
            this.toEncode = lockedResource;
        }
    }

    interface DiskCacheProvider {
        DiskCache getDiskCache();
    }

    static class ReleaseManager {
        private boolean isEncodeComplete;
        private boolean isFailed;
        private boolean isReleased;

        ReleaseManager() {
        }

        /* access modifiers changed from: package-private */
        public synchronized boolean onEncodeComplete() {
            this.isEncodeComplete = true;
            return isComplete(false);
        }

        /* access modifiers changed from: package-private */
        public synchronized boolean onFailed() {
            this.isFailed = true;
            return isComplete(false);
        }

        /* access modifiers changed from: package-private */
        public synchronized void reset() {
            this.isEncodeComplete = false;
            this.isReleased = false;
            this.isFailed = false;
        }

        /* access modifiers changed from: package-private */
        public synchronized boolean release(boolean z) {
            this.isReleased = true;
            return isComplete(z);
        }

        private boolean isComplete(boolean z) {
            if ((this.isFailed || z || this.isEncodeComplete) && this.isReleased) {
                return true;
            }
            return false;
        }
    }

    enum RunReason {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    enum Stage {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    @NonNull
    public StateVerifier getVerifier() {
        return this.stateVerifier;
    }

    private int getPriority() {
        return this.priority.ordinal();
    }

    private void onEncodeComplete() {
        if (this.releaseManager.onEncodeComplete()) {
            releaseInternal();
        }
    }

    private void onLoadFailed() {
        if (this.releaseManager.onFailed()) {
            releaseInternal();
        }
    }

    public void cancel() {
        this.isCancelled = true;
        DataFetcherGenerator dataFetcherGenerator = this.currentGenerator;
        if (dataFetcherGenerator != null) {
            dataFetcherGenerator.cancel();
        }
    }

    public void reschedule() {
        this.runReason = RunReason.SWITCH_TO_SOURCE_SERVICE;
        this.callback.reschedule(this);
    }

    private void notifyFailed() {
        setNotifiedOrThrow();
        this.callback.onLoadFailed(new GlideException("Failed to load resource", (List<Throwable>) new ArrayList<Throwable>(this.throwables)));
        onLoadFailed();
    }

    private void setNotifiedOrThrow() {
        this.stateVerifier.throwIfRecycled();
        if (!this.isCallbackNotified) {
            this.isCallbackNotified = true;
            return;
        }
        throw new IllegalStateException("Already notified");
    }

    /* access modifiers changed from: package-private */
    public boolean willDecodeFromCache() {
        Stage nextStage = getNextStage(Stage.INITIALIZE);
        if (nextStage == Stage.RESOURCE_CACHE || nextStage == Stage.DATA_CACHE) {
            return true;
        }
        return false;
    }

    private void releaseInternal() {
        this.releaseManager.reset();
        this.deferredEncodeManager.clear();
        this.decodeHelper.clear();
        this.isCallbackNotified = false;
        this.glideContext = null;
        this.signature = null;
        this.options = null;
        this.priority = null;
        this.loadKey = null;
        this.callback = null;
        this.stage = null;
        this.currentGenerator = null;
        this.currentThread = null;
        this.currentSourceKey = null;
        this.currentData = null;
        this.currentDataSource = null;
        this.currentFetcher = null;
        this.startFetchTime = 0;
        this.isCancelled = false;
        this.model = null;
        this.throwables.clear();
        this.pool.release(this);
    }

    private void decodeFromRetrievedData() {
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.startFetchTime;
            logWithTimeAndKey("Retrieved data", j, "data: " + this.currentData + ", cache key: " + this.currentSourceKey + ", fetcher: " + this.currentFetcher);
        }
        Resource resource = null;
        try {
            resource = decodeFromData(this.currentFetcher, this.currentData, this.currentDataSource);
        } catch (GlideException e2) {
            e2.setLoggingDetails(this.currentAttemptingKey, this.currentDataSource);
            this.throwables.add(e2);
        }
        if (resource != null) {
            notifyEncodeAndRelease(resource, this.currentDataSource);
        } else {
            runGenerators();
        }
    }

    private DataFetcherGenerator getNextGenerator() {
        switch (this.stage) {
            case RESOURCE_CACHE:
                return new ResourceCacheGenerator(this.decodeHelper, this);
            case DATA_CACHE:
                return new DataCacheGenerator(this.decodeHelper, this);
            case SOURCE:
                return new SourceGenerator(this.decodeHelper, this);
            case FINISHED:
                return null;
            default:
                throw new IllegalStateException("Unrecognized stage: " + this.stage);
        }
    }

    private void runGenerators() {
        this.currentThread = Thread.currentThread();
        this.startFetchTime = LogTime.getLogTime();
        boolean z = false;
        while (!this.isCancelled && this.currentGenerator != null) {
            z = this.currentGenerator.startNext();
            if (z) {
                break;
            }
            this.stage = getNextStage(this.stage);
            this.currentGenerator = getNextGenerator();
            if (this.stage == Stage.SOURCE) {
                reschedule();
                return;
            }
        }
        if ((this.stage == Stage.FINISHED || this.isCancelled) && !z) {
            notifyFailed();
        }
    }

    private void runWrapped() {
        switch (this.runReason) {
            case INITIALIZE:
                this.stage = getNextStage(Stage.INITIALIZE);
                this.currentGenerator = getNextGenerator();
                runGenerators();
                return;
            case SWITCH_TO_SOURCE_SERVICE:
                runGenerators();
                return;
            case DECODE_DATA:
                decodeFromRetrievedData();
                return;
            default:
                throw new IllegalStateException("Unrecognized run reason: " + this.runReason);
        }
    }

    public void run() {
        GlideTrace.beginSectionFormat("DecodeJob#run(model=%s)", this.model);
        DataFetcher<?> dataFetcher = this.currentFetcher;
        try {
            if (this.isCancelled) {
                notifyFailed();
                if (dataFetcher != null) {
                    dataFetcher.cleanup();
                }
                GlideTrace.endSection();
                return;
            }
            runWrapped();
            if (dataFetcher != null) {
                dataFetcher.cleanup();
            }
            GlideTrace.endSection();
        } catch (Throwable th) {
            if (dataFetcher != null) {
                dataFetcher.cleanup();
            }
            GlideTrace.endSection();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public void release(boolean z) {
        if (this.releaseManager.release(z)) {
            releaseInternal();
        }
    }

    public int compareTo(@NonNull DecodeJob<?> decodeJob) {
        int priority2 = getPriority() - decodeJob.getPriority();
        if (priority2 == 0) {
            return this.order - decodeJob.order;
        }
        return priority2;
    }

    @NonNull
    private Options getOptionsWithHardwareConfig(DataSource dataSource) {
        boolean z;
        Options options2 = this.options;
        if (Build.VERSION.SDK_INT < 26) {
            return options2;
        }
        if (dataSource == DataSource.RESOURCE_DISK_CACHE || this.decodeHelper.isScaleOnlyOrNoTransform()) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool = (Boolean) options2.get(Downsampler.ALLOW_HARDWARE_CONFIG);
        if (bool != null && (!bool.booleanValue() || z)) {
            return options2;
        }
        Options options3 = new Options();
        options3.putAll(this.options);
        options3.set(Downsampler.ALLOW_HARDWARE_CONFIG, Boolean.valueOf(z));
        return options3;
    }

    private Stage getNextStage(Stage stage2) {
        while (true) {
            switch (stage2) {
                case RESOURCE_CACHE:
                    if (!this.diskCacheStrategy.decodeCachedData()) {
                        stage2 = Stage.DATA_CACHE;
                        break;
                    } else {
                        return Stage.DATA_CACHE;
                    }
                case DATA_CACHE:
                    if (this.onlyRetrieveFromCache) {
                        return Stage.FINISHED;
                    }
                    return Stage.SOURCE;
                case SOURCE:
                case FINISHED:
                    return Stage.FINISHED;
                case INITIALIZE:
                    if (!this.diskCacheStrategy.decodeCachedResource()) {
                        stage2 = Stage.RESOURCE_CACHE;
                        break;
                    } else {
                        return Stage.RESOURCE_CACHE;
                    }
                default:
                    throw new IllegalArgumentException("Unrecognized stage: " + stage2);
            }
        }
    }

    private void logWithTimeAndKey(String str, long j) {
        logWithTimeAndKey(str, j, null);
    }

    private <Data> Resource<R> decodeFromFetcher(Data data, DataSource dataSource) throws GlideException {
        return runLoadPath(data, dataSource, this.decodeHelper.getLoadPath(data.getClass()));
    }

    private void notifyComplete(Resource<R> resource, DataSource dataSource) {
        setNotifiedOrThrow();
        this.callback.onResourceReady(resource, dataSource);
    }

    DecodeJob(DiskCacheProvider diskCacheProvider2, Pools.Pool<DecodeJob<?>> pool2) {
        this.diskCacheProvider = diskCacheProvider2;
        this.pool = pool2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.bumptech.glide.load.engine.LockedResource} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.bumptech.glide.load.engine.Resource<R>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.bumptech.glide.load.engine.LockedResource} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: com.bumptech.glide.load.engine.Resource<R>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.bumptech.glide.load.engine.LockedResource} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void notifyEncodeAndRelease(com.bumptech.glide.load.engine.Resource<R> r3, com.bumptech.glide.load.DataSource r4) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.bumptech.glide.load.engine.Initializable
            if (r0 == 0) goto L_0x000a
            r0 = r3
            com.bumptech.glide.load.engine.Initializable r0 = (com.bumptech.glide.load.engine.Initializable) r0
            r0.initialize()
        L_0x000a:
            r0 = 0
            com.bumptech.glide.load.engine.DecodeJob$DeferredEncodeManager<?> r1 = r2.deferredEncodeManager
            boolean r1 = r1.hasResourceToEncode()
            if (r1 == 0) goto L_0x0018
            com.bumptech.glide.load.engine.LockedResource r3 = com.bumptech.glide.load.engine.LockedResource.obtain(r3)
            r0 = r3
        L_0x0018:
            r2.notifyComplete(r3, r4)
            com.bumptech.glide.load.engine.DecodeJob$Stage r3 = com.bumptech.glide.load.engine.DecodeJob.Stage.ENCODE
            r2.stage = r3
            com.bumptech.glide.load.engine.DecodeJob$DeferredEncodeManager<?> r3 = r2.deferredEncodeManager     // Catch:{ all -> 0x0039 }
            boolean r3 = r3.hasResourceToEncode()     // Catch:{ all -> 0x0039 }
            if (r3 == 0) goto L_0x0030
            com.bumptech.glide.load.engine.DecodeJob$DeferredEncodeManager<?> r3 = r2.deferredEncodeManager     // Catch:{ all -> 0x0039 }
            com.bumptech.glide.load.engine.DecodeJob$DiskCacheProvider r4 = r2.diskCacheProvider     // Catch:{ all -> 0x0039 }
            com.bumptech.glide.load.Options r1 = r2.options     // Catch:{ all -> 0x0039 }
            r3.encode(r4, r1)     // Catch:{ all -> 0x0039 }
        L_0x0030:
            if (r0 == 0) goto L_0x0035
            r0.unlock()
        L_0x0035:
            r2.onEncodeComplete()
            return
        L_0x0039:
            r3 = move-exception
            if (r0 == 0) goto L_0x003f
            r0.unlock()
        L_0x003f:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.DecodeJob.notifyEncodeAndRelease(com.bumptech.glide.load.engine.Resource, com.bumptech.glide.load.DataSource):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: com.bumptech.glide.load.engine.DataCacheKey} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: com.bumptech.glide.load.engine.ResourceCacheKey} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: com.bumptech.glide.load.engine.ResourceCacheKey} */
    /* JADX WARNING: type inference failed for: r12v5, types: [com.bumptech.glide.load.Key] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.support.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Z> com.bumptech.glide.load.engine.Resource<Z> onResourceDecoded(com.bumptech.glide.load.DataSource r12, @android.support.annotation.NonNull com.bumptech.glide.load.engine.Resource<Z> r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r13.get()
            java.lang.Class r8 = r0.getClass()
            com.bumptech.glide.load.DataSource r0 = com.bumptech.glide.load.DataSource.RESOURCE_DISK_CACHE
            r1 = 0
            if (r12 == r0) goto L_0x0020
            com.bumptech.glide.load.engine.DecodeHelper<R> r0 = r11.decodeHelper
            com.bumptech.glide.load.Transformation r0 = r0.getTransformation(r8)
            com.bumptech.glide.GlideContext r2 = r11.glideContext
            int r3 = r11.width
            int r4 = r11.height
            com.bumptech.glide.load.engine.Resource r2 = r0.transform(r2, r13, r3, r4)
            r7 = r0
            r0 = r2
            goto L_0x0022
        L_0x0020:
            r0 = r13
            r7 = r1
        L_0x0022:
            boolean r2 = r13.equals(r0)
            if (r2 != 0) goto L_0x002b
            r13.recycle()
        L_0x002b:
            com.bumptech.glide.load.engine.DecodeHelper<R> r13 = r11.decodeHelper
            boolean r13 = r13.isResourceEncoderAvailable(r0)
            if (r13 == 0) goto L_0x0041
            com.bumptech.glide.load.engine.DecodeHelper<R> r13 = r11.decodeHelper
            com.bumptech.glide.load.ResourceEncoder r1 = r13.getResultEncoder(r0)
            com.bumptech.glide.load.Options r13 = r11.options
            com.bumptech.glide.load.EncodeStrategy r13 = r1.getEncodeStrategy(r13)
        L_0x003f:
            r10 = r1
            goto L_0x0044
        L_0x0041:
            com.bumptech.glide.load.EncodeStrategy r13 = com.bumptech.glide.load.EncodeStrategy.NONE
            goto L_0x003f
        L_0x0044:
            com.bumptech.glide.load.engine.DecodeHelper<R> r1 = r11.decodeHelper
            com.bumptech.glide.load.Key r2 = r11.currentSourceKey
            boolean r1 = r1.isSourceKey(r2)
            r1 = r1 ^ 1
            com.bumptech.glide.load.engine.DiskCacheStrategy r2 = r11.diskCacheStrategy
            boolean r12 = r2.isResourceCacheable(r1, r12, r13)
            if (r12 == 0) goto L_0x00af
            if (r10 == 0) goto L_0x00a1
            int[] r12 = com.bumptech.glide.load.engine.DecodeJob.AnonymousClass1.$SwitchMap$com$bumptech$glide$load$EncodeStrategy
            int r1 = r13.ordinal()
            r12 = r12[r1]
            switch(r12) {
                case 1: goto L_0x008e;
                case 2: goto L_0x0077;
                default: goto L_0x0063;
            }
        L_0x0063:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown strategy: "
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
        L_0x0077:
            com.bumptech.glide.load.engine.ResourceCacheKey r12 = new com.bumptech.glide.load.engine.ResourceCacheKey
            com.bumptech.glide.load.engine.DecodeHelper<R> r13 = r11.decodeHelper
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2 = r13.getArrayPool()
            com.bumptech.glide.load.Key r3 = r11.currentSourceKey
            com.bumptech.glide.load.Key r4 = r11.signature
            int r5 = r11.width
            int r6 = r11.height
            com.bumptech.glide.load.Options r9 = r11.options
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0097
        L_0x008e:
            com.bumptech.glide.load.engine.DataCacheKey r12 = new com.bumptech.glide.load.engine.DataCacheKey
            com.bumptech.glide.load.Key r13 = r11.currentSourceKey
            com.bumptech.glide.load.Key r1 = r11.signature
            r12.<init>(r13, r1)
        L_0x0097:
            com.bumptech.glide.load.engine.LockedResource r0 = com.bumptech.glide.load.engine.LockedResource.obtain(r0)
            com.bumptech.glide.load.engine.DecodeJob$DeferredEncodeManager<?> r13 = r11.deferredEncodeManager
            r13.init(r12, r10, r0)
            goto L_0x00af
        L_0x00a1:
            com.bumptech.glide.Registry$NoResultEncoderAvailableException r12 = new com.bumptech.glide.Registry$NoResultEncoderAvailableException
            java.lang.Object r13 = r0.get()
            java.lang.Class r13 = r13.getClass()
            r12.<init>(r13)
            throw r12
        L_0x00af:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.DecodeJob.onResourceDecoded(com.bumptech.glide.load.DataSource, com.bumptech.glide.load.engine.Resource):com.bumptech.glide.load.engine.Resource");
    }

    private <Data> Resource<R> decodeFromData(DataFetcher<?> dataFetcher, Data data, DataSource dataSource) throws GlideException {
        if (data == null) {
            dataFetcher.cleanup();
            return null;
        }
        try {
            long logTime = LogTime.getLogTime();
            Resource<R> decodeFromFetcher = decodeFromFetcher(data, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                logWithTimeAndKey("Decoded result " + decodeFromFetcher, logTime);
            }
            return decodeFromFetcher;
        } finally {
            dataFetcher.cleanup();
        }
    }

    private <Data, ResourceType> Resource<R> runLoadPath(Data data, DataSource dataSource, LoadPath<Data, ResourceType, R> loadPath) throws GlideException {
        Options optionsWithHardwareConfig = getOptionsWithHardwareConfig(dataSource);
        DataRewinder rewinder = this.glideContext.getRegistry().getRewinder(data);
        try {
            return loadPath.load(rewinder, optionsWithHardwareConfig, this.width, this.height, new DecodeCallback(dataSource));
        } finally {
            rewinder.cleanup();
        }
    }

    private void logWithTimeAndKey(String str, long j, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(LogTime.getElapsedMillis(j));
        sb.append(", load key: ");
        sb.append(this.loadKey);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
    }

    public void onDataFetcherFailed(Key key, Exception exc, DataFetcher<?> dataFetcher, DataSource dataSource) {
        dataFetcher.cleanup();
        GlideException glideException = new GlideException("Fetching data failed", (Throwable) exc);
        glideException.setLoggingDetails(key, dataSource, dataFetcher.getDataClass());
        this.throwables.add(glideException);
        if (Thread.currentThread() != this.currentThread) {
            this.runReason = RunReason.SWITCH_TO_SOURCE_SERVICE;
            this.callback.reschedule(this);
            return;
        }
        runGenerators();
    }

    public void onDataFetcherReady(Key key, Object obj, DataFetcher<?> dataFetcher, DataSource dataSource, Key key2) {
        this.currentSourceKey = key;
        this.currentData = obj;
        this.currentFetcher = dataFetcher;
        this.currentDataSource = dataSource;
        this.currentAttemptingKey = key2;
        if (Thread.currentThread() != this.currentThread) {
            this.runReason = RunReason.DECODE_DATA;
            this.callback.reschedule(this);
            return;
        }
        GlideTrace.beginSection("DecodeJob.decodeFromRetrievedData");
        try {
            decodeFromRetrievedData();
        } finally {
            GlideTrace.endSection();
        }
    }

    /* access modifiers changed from: package-private */
    public DecodeJob<R> init(GlideContext glideContext2, Object obj, EngineKey engineKey, Key key, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority2, DiskCacheStrategy diskCacheStrategy2, Map<Class<?>, Transformation<?>> map, boolean z, boolean z2, boolean z3, Options options2, Callback<R> callback2, int i3) {
        this.decodeHelper.init(glideContext2, obj, key, i, i2, diskCacheStrategy2, cls, cls2, priority2, options2, map, z, z2, this.diskCacheProvider);
        this.glideContext = glideContext2;
        this.signature = key;
        this.priority = priority2;
        this.loadKey = engineKey;
        this.width = i;
        this.height = i2;
        this.diskCacheStrategy = diskCacheStrategy2;
        this.onlyRetrieveFromCache = z3;
        this.options = options2;
        this.callback = callback2;
        this.order = i3;
        this.runReason = RunReason.INITIALIZE;
        this.model = obj;
        return this;
    }
}
