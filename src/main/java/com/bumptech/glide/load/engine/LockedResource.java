package com.bumptech.glide.load.engine;

import android.support.annotation.NonNull;
import android.support.v4.util.Pools;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier;

public final class LockedResource<Z> implements Resource<Z>, FactoryPools.Poolable {
    private static final Pools.Pool<LockedResource<?>> POOL = FactoryPools.threadSafe(20, new FactoryPools.Factory<LockedResource<?>>() {
        public LockedResource<?> create() {
            return new LockedResource<>();
        }
    });
    private boolean isLocked;
    private boolean isRecycled;
    private final StateVerifier stateVerifier = StateVerifier.newInstance();
    private Resource<Z> toWrap;

    @NonNull
    public final StateVerifier getVerifier() {
        return this.stateVerifier;
    }

    @NonNull
    public final Z get() {
        return this.toWrap.get();
    }

    @NonNull
    public final Class<Z> getResourceClass() {
        return this.toWrap.getResourceClass();
    }

    public final int getSize() {
        return this.toWrap.getSize();
    }

    LockedResource() {
    }

    private void release() {
        this.toWrap = null;
        POOL.release(this);
    }

    public final synchronized void recycle() {
        this.stateVerifier.throwIfRecycled();
        this.isRecycled = true;
        if (!this.isLocked) {
            this.toWrap.recycle();
            release();
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void unlock() {
        this.stateVerifier.throwIfRecycled();
        if (this.isLocked) {
            this.isLocked = false;
            if (this.isRecycled) {
                recycle();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    private void init(Resource<Z> resource) {
        this.isRecycled = false;
        this.isLocked = true;
        this.toWrap = resource;
    }

    @NonNull
    static <Z> LockedResource<Z> obtain(Resource<Z> resource) {
        LockedResource<Z> lockedResource = (LockedResource) Preconditions.checkNotNull((LockedResource) POOL.acquire());
        lockedResource.init(resource);
        return lockedResource;
    }
}
