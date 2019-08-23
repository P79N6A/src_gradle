package com.bytedance.android.live.uikit.b.a.b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8492a;

    /* renamed from: b  reason: collision with root package name */
    protected Bitmap f8493b;

    /* renamed from: c  reason: collision with root package name */
    protected Paint f8494c = new Paint();

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        if (!PatchProxy.isSupport(new Object[0], this, f8492a, false, 1932, new Class[0], Integer.TYPE)) {
            return this.f8493b.getHeight();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f8492a, false, 1932, new Class[0], Integer.TYPE)).intValue();
    }

    public final int getIntrinsicWidth() {
        if (!PatchProxy.isSupport(new Object[0], this, f8492a, false, 1931, new Class[0], Integer.TYPE)) {
            return this.f8493b.getWidth();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f8492a, false, 1931, new Class[0], Integer.TYPE)).intValue();
    }

    public final int getMinimumHeight() {
        if (!PatchProxy.isSupport(new Object[0], this, f8492a, false, 1934, new Class[0], Integer.TYPE)) {
            return this.f8493b.getHeight();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f8492a, false, 1934, new Class[0], Integer.TYPE)).intValue();
    }

    public final int getMinimumWidth() {
        if (!PatchProxy.isSupport(new Object[0], this, f8492a, false, 1933, new Class[0], Integer.TYPE)) {
            return this.f8493b.getWidth();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f8492a, false, 1933, new Class[0], Integer.TYPE)).intValue();
    }

    public a(Bitmap bitmap) {
        this.f8493b = bitmap;
        this.f8494c.setDither(true);
        this.f8494c.setFilterBitmap(true);
    }

    public final void draw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f8492a, false, 1928, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f8492a, false, 1928, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        canvas.drawBitmap(this.f8493b, 0.0f, 0.0f, this.f8494c);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        ColorFilter colorFilter2 = colorFilter;
        if (PatchProxy.isSupport(new Object[]{colorFilter2}, this, f8492a, false, 1930, new Class[]{ColorFilter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{colorFilter2}, this, f8492a, false, 1930, new Class[]{ColorFilter.class}, Void.TYPE);
            return;
        }
        this.f8494c.setColorFilter(colorFilter2);
    }

    public final void setAlpha(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f8492a, false, 1929, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f8492a, false, 1929, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f8494c.setAlpha(i);
    }
}
