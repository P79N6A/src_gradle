package com.ss.android.ugc.aweme.discover.widget;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.v7.widget.AppCompatImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0014J\u0018\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0014R$\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006 "}, d2 = {"Lcom/ss/android/ugc/aweme/discover/widget/RoundRectangleSolidImageView;", "Landroid/support/v7/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "color", "getColor$main_douyinCnRelease", "()I", "setColor$main_douyinCnRelease", "(I)V", "mRectF", "Landroid/graphics/RectF;", "mRoundedRectPath", "Landroid/graphics/Path;", "", "radius", "getRadius$main_douyinCnRelease", "()F", "setRadius$main_douyinCnRelease", "(F)V", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RoundRectangleSolidImageView extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43311a;

    /* renamed from: b  reason: collision with root package name */
    private float f43312b;

    /* renamed from: c  reason: collision with root package name */
    private int f43313c;

    /* renamed from: d  reason: collision with root package name */
    private Path f43314d;

    /* renamed from: e  reason: collision with root package name */
    private RectF f43315e;

    public final int getColor$main_douyinCnRelease() {
        return this.f43313c;
    }

    public final float getRadius$main_douyinCnRelease() {
        return this.f43312b;
    }

    public final void onDraw(@NotNull Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f43311a, false, 38268, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f43311a, false, 38268, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        canvas.clipPath(this.f43314d);
        canvas.drawColor(this.f43313c);
        super.onDraw(canvas);
    }

    public final void setColor$main_douyinCnRelease(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f43311a, false, 38266, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f43311a, false, 38266, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f43313c = i;
        invalidate();
    }

    public final void setRadius$main_douyinCnRelease(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f43311a, false, 38265, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f43311a, false, 38265, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.f43312b = f2;
        invalidate();
    }

    public final void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f43311a, false, 38267, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f43311a, false, 38267, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i, i2);
        this.f43315e.set(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight());
        this.f43314d.addRoundRect(this.f43315e, this.f43312b, this.f43312b, Path.Direction.CW);
    }
}
