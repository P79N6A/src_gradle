package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.facebook.common.memory.MemoryTrimType;

public final class r implements d {

    /* renamed from: a  reason: collision with root package name */
    protected final ac<Bitmap> f23983a = new e();

    /* renamed from: b  reason: collision with root package name */
    private final int f23984b;

    /* renamed from: c  reason: collision with root package name */
    private int f23985c;

    /* renamed from: d  reason: collision with root package name */
    private final ag f23986d;

    /* renamed from: e  reason: collision with root package name */
    private int f23987e;

    public final synchronized void release(Bitmap bitmap) {
        int size = this.f23983a.getSize(bitmap);
        if (size <= this.f23985c) {
            this.f23986d.onValueRelease(size);
            this.f23983a.put(bitmap);
            this.f23987e += size;
        }
    }

    public final void trim(MemoryTrimType memoryTrimType) {
        double d2 = (double) this.f23984b;
        Double.isNaN(d2);
        a((int) (d2 * (1.0d - memoryTrimType.getSuggestedTrimRatio())));
    }

    private synchronized void a(int i) {
        while (this.f23987e > i) {
            Bitmap bitmap = (Bitmap) this.f23983a.pop();
            if (bitmap == null) {
                break;
            }
            int size = this.f23983a.getSize(bitmap);
            this.f23987e -= size;
            this.f23986d.onFree(size);
        }
    }

    public final synchronized Bitmap get(int i) {
        if (this.f23987e > this.f23984b) {
            a(this.f23984b);
        }
        Bitmap bitmap = (Bitmap) this.f23983a.get(i);
        if (bitmap != null) {
            int size = this.f23983a.getSize(bitmap);
            this.f23987e -= size;
            this.f23986d.onValueReuse(size);
            return bitmap;
        }
        this.f23986d.onAlloc(i);
        return Bitmap.createBitmap(1, i, Bitmap.Config.ALPHA_8);
    }

    public r(int i, int i2, ag agVar) {
        this.f23984b = i;
        this.f23985c = i2;
        this.f23986d = agVar;
    }
}
