package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.EngineResource;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class ActiveResources {
    @VisibleForTesting
    final Map<Key, ResourceWeakReference> activeEngineResources = new HashMap();
    @Nullable
    private volatile DequeuedResourceCallback cb;
    @Nullable
    private Thread cleanReferenceQueueThread;
    private final boolean isActiveResourceRetentionAllowed;
    private volatile boolean isShutdown;
    private EngineResource.ResourceListener listener;
    private final Handler mainHandler = new Handler(Looper.getMainLooper(), new Handler.Callback() {
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ActiveResources.this.cleanupActiveReference((ResourceWeakReference) message.obj);
            return true;
        }
    });
    @Nullable
    private ReferenceQueue<EngineResource<?>> resourceReferenceQueue;

    @VisibleForTesting
    interface DequeuedResourceCallback {
        void onResourceDequeued();
    }

    @VisibleForTesting
    static final class ResourceWeakReference extends WeakReference<EngineResource<?>> {
        final boolean isCacheable;
        final Key key;
        @Nullable
        Resource<?> resource;

        /* access modifiers changed from: package-private */
        public final void reset() {
            this.resource = null;
            clear();
        }

        ResourceWeakReference(@NonNull Key key2, @NonNull EngineResource<?> engineResource, @NonNull ReferenceQueue<? super EngineResource<?>> referenceQueue, boolean z) {
            super(engineResource, referenceQueue);
            Resource<?> resource2;
            this.key = (Key) Preconditions.checkNotNull(key2);
            if (!engineResource.isCacheable() || !z) {
                resource2 = null;
            } else {
                resource2 = (Resource) Preconditions.checkNotNull(engineResource.getResource());
            }
            this.resource = resource2;
            this.isCacheable = engineResource.isCacheable();
        }
    }

    private ReferenceQueue<EngineResource<?>> getReferenceQueue() {
        if (this.resourceReferenceQueue == null) {
            this.resourceReferenceQueue = new ReferenceQueue<>();
            this.cleanReferenceQueueThread = new Thread(new Runnable() {
                public void run() {
                    Process.setThreadPriority(10);
                    ActiveResources.this.cleanReferenceQueue();
                }
            }, "glide-active-resources");
            this.cleanReferenceQueueThread.start();
        }
        return this.resourceReferenceQueue;
    }

    /* access modifiers changed from: package-private */
    public final void cleanReferenceQueue() {
        while (!this.isShutdown) {
            try {
                this.mainHandler.obtainMessage(1, (ResourceWeakReference) this.resourceReferenceQueue.remove()).sendToTarget();
                DequeuedResourceCallback dequeuedResourceCallback = this.cb;
                if (dequeuedResourceCallback != null) {
                    dequeuedResourceCallback.onResourceDequeued();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final void shutdown() {
        this.isShutdown = true;
        if (this.cleanReferenceQueueThread != null) {
            this.cleanReferenceQueueThread.interrupt();
            try {
                this.cleanReferenceQueueThread.join(TimeUnit.SECONDS.toMillis(5));
                if (this.cleanReferenceQueueThread.isAlive()) {
                    throw new RuntimeException("Failed to join in time");
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final void setDequeuedResourceCallback(DequeuedResourceCallback dequeuedResourceCallback) {
        this.cb = dequeuedResourceCallback;
    }

    /* access modifiers changed from: package-private */
    public final void setListener(EngineResource.ResourceListener resourceListener) {
        this.listener = resourceListener;
    }

    /* access modifiers changed from: package-private */
    public final void deactivate(Key key) {
        ResourceWeakReference remove = this.activeEngineResources.remove(key);
        if (remove != null) {
            remove.reset();
        }
    }

    ActiveResources(boolean z) {
        this.isActiveResourceRetentionAllowed = z;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final EngineResource<?> get(Key key) {
        ResourceWeakReference resourceWeakReference = this.activeEngineResources.get(key);
        if (resourceWeakReference == null) {
            return null;
        }
        EngineResource<?> engineResource = (EngineResource) resourceWeakReference.get();
        if (engineResource == null) {
            cleanupActiveReference(resourceWeakReference);
        }
        return engineResource;
    }

    /* access modifiers changed from: package-private */
    public final void cleanupActiveReference(@NonNull ResourceWeakReference resourceWeakReference) {
        Util.assertMainThread();
        this.activeEngineResources.remove(resourceWeakReference.key);
        if (resourceWeakReference.isCacheable && resourceWeakReference.resource != null) {
            EngineResource engineResource = new EngineResource(resourceWeakReference.resource, true, false);
            engineResource.setResourceListener(resourceWeakReference.key, this.listener);
            this.listener.onResourceReleased(resourceWeakReference.key, engineResource);
        }
    }

    /* access modifiers changed from: package-private */
    public final void activate(Key key, EngineResource<?> engineResource) {
        ResourceWeakReference put = this.activeEngineResources.put(key, new ResourceWeakReference(key, engineResource, getReferenceQueue(), this.isActiveResourceRetentionAllowed));
        if (put != null) {
            put.reset();
        }
    }
}
