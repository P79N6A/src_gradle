package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import com.bumptech.glide.util.Util;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class BitmapPreFillRunner implements Runnable {
    private static final Clock DEFAULT_CLOCK = new Clock();
    static final long MAX_BACKOFF_MS = TimeUnit.SECONDS.toMillis(1);
    private final BitmapPool bitmapPool;
    private final Clock clock;
    private long currentDelay;
    private final Handler handler;
    private boolean isCancelled;
    private final MemoryCache memoryCache;
    private final Set<PreFillType> seenTypes;
    private final PreFillQueue toPrefill;

    @VisibleForTesting
    static class Clock {
        Clock() {
        }

        /* access modifiers changed from: package-private */
        public long now() {
            return SystemClock.currentThreadTimeMillis();
        }
    }

    static final class UniqueKey implements Key {
        UniqueKey() {
        }

        public final void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
            throw new UnsupportedOperationException();
        }
    }

    public final void cancel() {
        this.isCancelled = true;
    }

    private long getFreeMemoryCacheBytes() {
        return this.memoryCache.getMaxSize() - this.memoryCache.getCurrentSize();
    }

    public final void run() {
        if (allocate()) {
            this.handler.postDelayed(this, getNextDelay());
        }
    }

    private long getNextDelay() {
        long j = this.currentDelay;
        this.currentDelay = Math.min(this.currentDelay * 4, MAX_BACKOFF_MS);
        return j;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final boolean allocate() {
        Bitmap bitmap;
        long now = this.clock.now();
        while (!this.toPrefill.isEmpty() && !isGcDetected(now)) {
            PreFillType remove = this.toPrefill.remove();
            if (!this.seenTypes.contains(remove)) {
                this.seenTypes.add(remove);
                bitmap = this.bitmapPool.getDirty(remove.getWidth(), remove.getHeight(), remove.getConfig());
            } else {
                bitmap = Bitmap.createBitmap(remove.getWidth(), remove.getHeight(), remove.getConfig());
            }
            if (getFreeMemoryCacheBytes() >= ((long) Util.getBitmapByteSize(bitmap))) {
                this.memoryCache.put(new UniqueKey(), BitmapResource.obtain(bitmap, this.bitmapPool));
            } else {
                this.bitmapPool.put(bitmap);
            }
        }
        if (this.isCancelled || this.toPrefill.isEmpty()) {
            return false;
        }
        return true;
    }

    private boolean isGcDetected(long j) {
        if (this.clock.now() - j >= 32) {
            return true;
        }
        return false;
    }

    public BitmapPreFillRunner(BitmapPool bitmapPool2, MemoryCache memoryCache2, PreFillQueue preFillQueue) {
        this(bitmapPool2, memoryCache2, preFillQueue, DEFAULT_CLOCK, new Handler(Looper.getMainLooper()));
    }

    @VisibleForTesting
    BitmapPreFillRunner(BitmapPool bitmapPool2, MemoryCache memoryCache2, PreFillQueue preFillQueue, Clock clock2, Handler handler2) {
        this.seenTypes = new HashSet();
        this.currentDelay = 40;
        this.bitmapPool = bitmapPool2;
        this.memoryCache = memoryCache2;
        this.toPrefill = preFillQueue;
        this.clock = clock2;
        this.handler = handler2;
    }
}
