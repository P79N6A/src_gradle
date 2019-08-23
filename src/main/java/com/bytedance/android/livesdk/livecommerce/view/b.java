package com.bytedance.android.livesdk.livecommerce.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Random;

public final class b extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16312a;

    /* renamed from: b  reason: collision with root package name */
    private static int[] f16313b;

    /* renamed from: c  reason: collision with root package name */
    private int f16314c = 4;

    /* renamed from: d  reason: collision with root package name */
    private float f16315d = 10.0f;

    /* renamed from: e  reason: collision with root package name */
    private float f16316e = 5.0f;

    /* renamed from: f  reason: collision with root package name */
    private int f16317f = -65536;
    private float g;
    private int h = 20;
    private float i;
    private RectF j = new RectF();
    private Paint k = new Paint();
    private int[] l = null;
    private boolean m = false;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f16312a, false, 10807, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16312a, false, 10807, new Class[0], Void.TYPE);
            return;
        }
        this.m = true;
        invalidate();
    }

    public final void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f16312a, false, 10808, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16312a, false, 10808, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        a();
    }

    public final void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f16312a, false, 10809, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16312a, false, 10809, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        this.m = false;
    }

    public final void setWaveLineRadius(float f2) {
        this.f16316e = f2;
    }

    public final void setWavePerLineWidth(float f2) {
        this.f16315d = f2;
    }

    public final void setWaveLineColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f16312a, false, 10806, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f16312a, false, 10806, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f16317f = i2;
        this.k.setColor(this.f16317f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, null}, this, f16312a, false, 10805, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, null}, this, f16312a, false, 10805, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
            return;
        }
        this.f16314c = 4;
        this.f16315d = UIUtils.dip2Px(context2, 2.0f);
        this.f16316e = UIUtils.dip2Px(context2, 2.0f);
        this.f16317f = -65536;
        this.l = new int[this.f16314c];
        this.k.setAntiAlias(true);
        this.k.setColor(this.f16317f);
    }

    public final void onDraw(Canvas canvas) {
        float f2;
        int i2;
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f16312a, false, 10811, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f16312a, false, 10811, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        if (this.f16314c > 0 && this.f16315d > 0.0f && this.g > 0.0f) {
            int measuredHeight = getMeasuredHeight();
            for (int i3 = 0; i3 < this.f16314c; i3++) {
                if (i3 > 0) {
                    f2 = this.g * ((float) i3);
                } else {
                    f2 = 0.0f;
                }
                float f3 = (((float) i3) * this.f16315d) + f2;
                int i4 = this.l[i3];
                this.j.set(f3, (float) (measuredHeight - Math.abs(i4)), this.f16315d + f3, (float) measuredHeight);
                canvas.drawRoundRect(this.j, this.f16316e, this.f16316e, this.k);
                if (i4 >= 0) {
                    i2 = (int) (((float) i4) + this.i);
                    if (i2 >= measuredHeight) {
                        i2 = measuredHeight * -1;
                    }
                } else {
                    i2 = (int) (((float) i4) + this.i);
                    if (i2 >= 0) {
                        i2 = 0;
                    }
                }
                this.l[i3] = i2;
            }
            if (this.m) {
                invalidate();
            }
        }
    }

    private static int[] a(int i2, int i3) {
        int i4 = i2;
        int i5 = i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, null, f16312a, true, 10804, new Class[]{Integer.TYPE, Integer.TYPE}, int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, null, f16312a, true, 10804, new Class[]{Integer.TYPE, Integer.TYPE}, int[].class);
        } else if (f16313b != null) {
            return f16313b;
        } else {
            if (i4 == 4) {
                float f2 = (float) i5;
                f16313b = new int[]{(int) (0.8f * f2), (int) (0.3f * f2), (int) (0.6f * f2), (int) (f2 * 0.4f)};
            } else {
                f16313b = new int[i4];
                Random random = new Random();
                for (int i6 = 0; i6 < i4; i6++) {
                    f16313b[i6] = random.nextInt(i5);
                }
            }
            return f16313b;
        }
    }

    public final void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f16312a, false, 10810, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f16312a, false, 10810, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.f16314c > 0 && this.f16315d > 0.0f) {
            this.g = ((((float) measuredWidth) - (((float) this.f16314c) * this.f16315d)) * 1.0f) / ((float) (this.f16314c - 1));
            int[] a2 = a(this.f16314c, measuredHeight);
            for (int i4 = 0; i4 < a2.length; i4++) {
                this.l[i4] = a2[i4];
            }
            this.i = (((float) measuredHeight) * 1.0f) / ((float) this.h);
        }
    }
}
