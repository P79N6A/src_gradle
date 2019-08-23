package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class d extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18458a;

    /* renamed from: b  reason: collision with root package name */
    private Paint f18459b;

    /* renamed from: c  reason: collision with root package name */
    private RectF f18460c = new RectF();

    /* renamed from: d  reason: collision with root package name */
    private float f18461d;

    /* renamed from: e  reason: collision with root package name */
    private int f18462e;

    /* renamed from: f  reason: collision with root package name */
    private float f18463f = 0.0f;

    public final float getProgress() {
        return this.f18463f;
    }

    public d(Context context) {
        super(context);
        if (PatchProxy.isSupport(new Object[0], this, f18458a, false, 14335, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18458a, false, 14335, new Class[0], Void.TYPE);
            return;
        }
        this.f18461d = getResources().getDimension(C0906R.dimen.q0);
        this.f18462e = getResources().getColor(C0906R.color.a86);
        this.f18459b = new Paint();
        this.f18459b.setAntiAlias(true);
        this.f18459b.setStyle(Paint.Style.STROKE);
        this.f18459b.setStrokeCap(Paint.Cap.ROUND);
        this.f18459b.setStrokeWidth(this.f18461d);
        this.f18459b.setColor(this.f18462e);
    }

    public final void draw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f18458a, false, 14339, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f18458a, false, 14339, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.draw(canvas);
        canvas.drawArc(this.f18460c, -90.0f, -this.f18463f, false, this.f18459b);
    }

    public final void setProgress(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f18458a, false, 14336, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f18458a, false, 14336, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.f18463f = f2;
        invalidate();
    }

    public final void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f18458a, false, 14337, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f18458a, false, 14337, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i, i2);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f18458a, false, 14338, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f18458a, false, 14338, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        float f2 = (float) i;
        this.f18460c.set(this.f18461d / 2.0f, this.f18461d / 2.0f, f2 - (this.f18461d / 2.0f), f2 - (this.f18461d / 2.0f));
    }
}
