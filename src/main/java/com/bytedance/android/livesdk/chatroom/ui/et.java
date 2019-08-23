package com.bytedance.android.livesdk.chatroom.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class et extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12223a;

    /* renamed from: b  reason: collision with root package name */
    public int f12224b;

    /* renamed from: c  reason: collision with root package name */
    public int f12225c;

    /* renamed from: d  reason: collision with root package name */
    public Context f12226d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f12227e;

    /* renamed from: f  reason: collision with root package name */
    private Paint f12228f = new Paint();
    private int g;
    private int h;
    private int i;
    private int j;
    private int k = 12;
    private int l;
    private RectF m;
    private a n;
    private a o;
    private PathEffect p;
    private float q;
    private float r;
    private float s;

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12229a;

        /* renamed from: b  reason: collision with root package name */
        public float f12230b;

        /* renamed from: c  reason: collision with root package name */
        public float f12231c;

        /* renamed from: d  reason: collision with root package name */
        float f12232d = 2.0f;

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f12229a, false, 6412, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f12229a, false, 6412, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            float dip2Px = (((float) et.this.f12224b) - UIUtils.dip2Px(et.this.f12226d, 2.0f)) / this.f12232d;
            double d2 = (double) i;
            Double.isNaN(d2);
            double d3 = (d2 * 3.141592653589793d) / 180.0d;
            this.f12230b = (((float) et.this.f12224b) / this.f12232d) + (((float) Math.cos(d3)) * dip2Px);
            this.f12231c = (((float) et.this.f12225c) / this.f12232d) + (((float) Math.sin(d3)) * dip2Px);
        }

        public a(int i) {
            a(0);
        }
    }

    public final void setColor(int i2) {
        this.l = i2;
    }

    public et(Context context) {
        super(context);
        if (PatchProxy.isSupport(new Object[]{context}, this, f12223a, false, 6408, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f12223a, false, 6408, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.f12226d = context;
        this.g = 0;
        this.h = 0;
        this.m = new RectF();
        this.n = new a(0);
        this.o = new a(0);
        this.p = new DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f);
        this.q = UIUtils.dip2Px(this.f12226d, 1.9f);
        this.r = UIUtils.dip2Px(this.f12226d, 2.0f);
        this.s = UIUtils.dip2Px(this.f12226d, 2.0f) / 2.0f;
    }

    public final void onDraw(Canvas canvas) {
        int sin;
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f12223a, false, 6410, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f12223a, false, 6410, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        if (this.f12227e == null) {
            this.f12227e = new Paint();
            this.f12227e.setAntiAlias(true);
            this.f12227e.setStyle(Paint.Style.STROKE);
        }
        this.f12227e.setColor(this.l);
        this.f12227e.setPathEffect(this.p);
        this.f12227e.setStrokeWidth(this.q);
        canvas.drawArc(this.m, ((float) this.g) / 4.0f, 359.0f, false, this.f12227e);
        this.f12227e.setPathEffect(null);
        int i2 = this.g;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f12223a, false, 6411, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            sin = ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f12223a, false, 6411, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else {
            double d2 = (double) i2;
            Double.isNaN(d2);
            sin = (int) (Math.sin((d2 * 3.141592653589793d) / 90.0d) * 345.0d * -1.0d);
            if ((i2 >= 0 && i2 < 45) || ((135 <= i2 && i2 < 225) || (315 <= i2 && i2 < 360))) {
                sin = -sin;
            }
        }
        int i3 = sin;
        if (this.g % 90 == 45) {
            this.j = (this.h - this.i) - 1;
            this.h = this.i + 1;
        }
        if (i3 == 0) {
            this.h += this.j;
        }
        this.f12227e.setStrokeWidth(this.r);
        canvas.drawArc(this.m, (float) (this.h - this.k), (float) i3, false, this.f12227e);
        this.n.a(this.h - this.k);
        this.o.a((this.h - this.k) + i3);
        this.f12228f.setColor(this.l);
        canvas.drawCircle(this.n.f12230b, this.n.f12231c, this.s, this.f12228f);
        canvas.drawCircle(this.o.f12230b, this.o.f12231c, this.s, this.f12228f);
        this.i = this.h + i3;
        this.g = (this.g + 1) % 360;
        this.h = (this.h + 1) % 360;
        postInvalidateDelayed(15);
    }

    public final void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f12223a, false, 6409, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f12223a, false, 6409, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
        this.f12224b = View.MeasureSpec.getSize(i2);
        this.f12225c = View.MeasureSpec.getSize(i3);
        float dip2Px = UIUtils.dip2Px(this.f12226d, 1.0f);
        this.m.set(dip2Px, dip2Px, ((float) this.f12224b) - dip2Px, ((float) this.f12225c) - dip2Px);
    }
}
