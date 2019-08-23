package com.ss.android.ugc.aweme.shortvideo.sticker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\u0018\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\nH\u0014J\u000e\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\nJ\u000e\u0010!\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\nJ\u000e\u0010\"\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\nJ\u000e\u0010#\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\nJ\u000e\u0010$\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\nJ\u000e\u0010%\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\nJ\u000e\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\nR\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000f¨\u0006("}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/AVCircleProgressView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bgPaint", "Landroid/graphics/Paint;", "circleHalfWidth", "", "height", "getHeight$tools_avdmtview_douyinCnRelease", "()I", "setHeight$tools_avdmtview_douyinCnRelease", "(I)V", "maxProgress", "progress", "progressPaint", "startAngle", "width", "getWidth$tools_avdmtview_douyinCnRelease", "setWidth$tools_avdmtview_douyinCnRelease", "init", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setBgCircleColor", "color", "setBgCircleWidth", "setCircleWidth", "setMaxProgress", "setProgress", "setProgressColor", "setStartAngle", "angle", "tools.avdmtview_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AVCircleProgressView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69171a;

    /* renamed from: b  reason: collision with root package name */
    private Paint f69172b;

    /* renamed from: c  reason: collision with root package name */
    private Paint f69173c;

    /* renamed from: d  reason: collision with root package name */
    private int f69174d;

    /* renamed from: e  reason: collision with root package name */
    private int f69175e;

    /* renamed from: f  reason: collision with root package name */
    private int f69176f;
    private int g;
    private int h;
    private int i;

    @JvmOverloads
    public AVCircleProgressView(@NotNull Context context) {
        this(context, null, 2, null);
    }

    public final int getHeight$tools_avdmtview_douyinCnRelease() {
        return this.f69175e;
    }

    public final int getWidth$tools_avdmtview_douyinCnRelease() {
        return this.f69174d;
    }

    public final void setHeight$tools_avdmtview_douyinCnRelease(int i2) {
        this.f69175e = i2;
    }

    public final void setMaxProgress(int i2) {
        this.g = i2;
    }

    public final void setStartAngle(int i2) {
        this.h = i2;
    }

    public final void setWidth$tools_avdmtview_douyinCnRelease(int i2) {
        this.f69174d = i2;
    }

    public final void setBgCircleColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f69171a, false, 78529, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f69171a, false, 78529, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        Paint paint = this.f69172b;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bgPaint");
        }
        paint.setColor(i2);
    }

    public final void setBgCircleWidth(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f69171a, false, 78532, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f69171a, false, 78532, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.i = i2 / 2;
        Paint paint = this.f69172b;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bgPaint");
        }
        paint.setStrokeWidth((float) i2);
    }

    public final void setCircleWidth(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f69171a, false, 78531, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f69171a, false, 78531, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        Paint paint = this.f69173c;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressPaint");
        }
        paint.setStrokeWidth((float) i2);
    }

    public final void setProgress(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f69171a, false, 78528, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f69171a, false, 78528, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f69176f = i2;
        invalidate();
    }

    public final void setProgressColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f69171a, false, 78530, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f69171a, false, 78530, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        Paint paint = this.f69173c;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressPaint");
        }
        paint.setColor(i2);
    }

    public final void onDraw(@NotNull Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f69171a, false, 78527, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f69171a, false, 78527, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        super.onDraw(canvas);
        float f2 = ((float) this.f69174d) / 2.0f;
        float f3 = ((float) this.f69175e) / 2.0f;
        float f4 = (((float) this.f69174d) / 2.0f) - ((float) this.i);
        Paint paint = this.f69172b;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bgPaint");
        }
        canvas.drawCircle(f2, f3, f4, paint);
        RectF rectF = new RectF((float) this.i, (float) this.i, (float) (this.f69174d - this.i), (float) (this.f69175e - this.i));
        float f5 = (float) (this.h - 90);
        float f6 = 360.0f * ((((float) this.f69176f) * 1.0f) / ((float) this.g));
        Paint paint2 = this.f69173c;
        if (paint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressPaint");
        }
        canvas.drawArc(rectF, f5, f6, false, paint2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AVCircleProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.g = 100;
        if (PatchProxy.isSupport(new Object[0], this, f69171a, false, 78525, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69171a, false, 78525, new Class[0], Void.TYPE);
            return;
        }
        this.f69172b = new Paint();
        Paint paint = this.f69172b;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bgPaint");
        }
        paint.setAntiAlias(true);
        Paint paint2 = this.f69172b;
        if (paint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bgPaint");
        }
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint3 = this.f69172b;
        if (paint3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bgPaint");
        }
        this.f69173c = new Paint(paint3);
        Paint paint4 = this.f69173c;
        if (paint4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressPaint");
        }
        paint4.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f69171a, false, 78526, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f69171a, false, 78526, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
        this.f69174d = View.MeasureSpec.getSize(i2);
        this.f69175e = View.MeasureSpec.getSize(i3);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AVCircleProgressView(Context context, AttributeSet attributeSet, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet);
    }
}
