package com.facebook.drawee.drawable;

import android.annotation.SuppressLint;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public int f23719a = -1;

    /* renamed from: b  reason: collision with root package name */
    private boolean f23720b;

    /* renamed from: c  reason: collision with root package name */
    private ColorFilter f23721c;

    /* renamed from: d  reason: collision with root package name */
    private int f23722d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f23723e = -1;

    public final void a(boolean z) {
        this.f23722d = z ? 1 : 0;
    }

    public final void b(boolean z) {
        this.f23723e = z ? 1 : 0;
    }

    public final void a(ColorFilter colorFilter) {
        this.f23721c = colorFilter;
        this.f23720b = true;
    }

    @SuppressLint({"Range"})
    public final void a(Drawable drawable) {
        boolean z;
        if (drawable != null) {
            if (this.f23719a != -1) {
                drawable.setAlpha(this.f23719a);
            }
            if (this.f23720b) {
                drawable.setColorFilter(this.f23721c);
            }
            boolean z2 = false;
            if (this.f23722d != -1) {
                if (this.f23722d != 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable.setDither(z);
            }
            if (this.f23723e != -1) {
                if (this.f23723e != 0) {
                    z2 = true;
                }
                drawable.setFilterBitmap(z2);
            }
        }
    }
}
