package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.facebook.common.internal.Preconditions;
import com.facebook.imageutils.a;
import javax.annotation.concurrent.GuardedBy;

public final class b {
    @GuardedBy

    /* renamed from: a  reason: collision with root package name */
    private int f23959a;
    @GuardedBy

    /* renamed from: b  reason: collision with root package name */
    private long f23960b;

    /* renamed from: c  reason: collision with root package name */
    private final int f23961c;

    /* renamed from: d  reason: collision with root package name */
    private final int f23962d;
    public final com.facebook.common.references.b<Bitmap> mUnpooledBitmapsReleaser;

    public final synchronized int getCount() {
        return this.f23959a;
    }

    public final synchronized int getMaxCount() {
        return this.f23961c;
    }

    public final synchronized int getMaxSize() {
        return this.f23962d;
    }

    public final synchronized long getSize() {
        return this.f23960b;
    }

    public final synchronized boolean increase(Bitmap bitmap) {
        int a2 = a.a(bitmap);
        if (this.f23959a < this.f23961c) {
            long j = (long) a2;
            if (this.f23960b + j <= ((long) this.f23962d)) {
                this.f23959a++;
                this.f23960b += j;
                return true;
            }
        }
        return false;
    }

    public final synchronized void decrease(Bitmap bitmap) {
        boolean z;
        boolean z2;
        int a2 = a.a(bitmap);
        if (this.f23959a > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "No bitmaps registered.");
        long j = (long) a2;
        if (j <= this.f23960b) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(a2), Long.valueOf(this.f23960b));
        this.f23960b -= j;
        this.f23959a--;
    }

    public b(int i, int i2) {
        boolean z;
        boolean z2 = false;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        Preconditions.checkArgument(i2 > 0 ? true : z2);
        this.f23961c = i;
        this.f23962d = i2;
        this.mUnpooledBitmapsReleaser = new com.facebook.common.references.b<Bitmap>() {
            public final void release(Bitmap bitmap) {
                try {
                    b.this.decrease(bitmap);
                } finally {
                    bitmap.recycle();
                }
            }
        };
    }
}
