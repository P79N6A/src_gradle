package com.bytedance.android.live.excitingvideoad.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.widget.TextView;
import com.bytedance.android.live.excitingvideoad.c.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a extends TextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8441a;

    /* renamed from: b  reason: collision with root package name */
    int f8442b;

    /* renamed from: c  reason: collision with root package name */
    int f8443c;

    /* renamed from: d  reason: collision with root package name */
    int f8444d;

    /* renamed from: e  reason: collision with root package name */
    int f8445e;

    /* renamed from: f  reason: collision with root package name */
    int f8446f;
    private int g;
    @DrawableRes
    private int h;
    @DrawableRes
    private int i;
    @DrawableRes
    private int j;
    private volatile float k;
    private Paint l;
    private Paint m;
    private Path n = new Path();
    private Path o = new Path();
    private Path p = new Path();
    private RectF q = new RectF();
    private volatile C0064a r = C0064a.IDLE;
    private Bitmap s;
    private float t;

    /* renamed from: com.bytedance.android.live.excitingvideoad.sdk.a$a  reason: collision with other inner class name */
    public enum C0064a {
        IDLE,
        DOWNLOADING,
        FINISH;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public final float getProgress() {
        return this.k;
    }

    public final C0064a getStatus() {
        return this.r;
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f8441a, false, 1586, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8441a, false, 1586, new Class[0], Void.TYPE);
        } else if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            invalidate();
        } else {
            postInvalidate();
        }
    }

    public final void setReachedColor(@ColorInt int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8441a, false, 1577, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8441a, false, 1577, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f8442b = i2;
        this.l.setColor(i2);
    }

    public final void setUnreachedColor(@ColorInt int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8441a, false, 1578, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8441a, false, 1578, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f8443c = i2;
        this.m.setColor(i2);
    }

    public final void setDownloadingTextColor(@ColorInt int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8441a, false, 1580, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8441a, false, 1580, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f8445e = i2;
        if (this.r == C0064a.DOWNLOADING) {
            setTextColor(i2);
        }
    }

    public final void setFinishBackroundRes(@DrawableRes int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8441a, false, 1576, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8441a, false, 1576, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.j = i2;
        if (this.r == C0064a.FINISH) {
            setBackgroundDrawable(com.ss.android.ugc.bytex.a.a.a.a(getResources(), i2));
        }
    }

    public final void setFinishTextColor(@ColorInt int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8441a, false, 1581, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8441a, false, 1581, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f8446f = i2;
        if (this.r == C0064a.FINISH) {
            setTextColor(i2);
        }
    }

    public final void setIdleBackroundRes(@DrawableRes int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8441a, false, 1575, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8441a, false, 1575, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.h = i2;
        if (this.r == C0064a.IDLE) {
            setBackgroundDrawable(com.ss.android.ugc.bytex.a.a.a.a(getResources(), i2));
        }
    }

    public final void setIdleTextColor(@ColorInt int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8441a, false, 1579, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8441a, false, 1579, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f8444d = i2;
        if (this.r == C0064a.IDLE) {
            setTextColor(i2);
        }
    }

    public final void setProgressFloat(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f8441a, false, 1583, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f8441a, false, 1583, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.r == C0064a.DOWNLOADING) {
            this.k = f2;
            a();
        }
    }

    public final void setProgressInt(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8441a, false, 1584, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8441a, false, 1584, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.r == C0064a.DOWNLOADING) {
            this.k = ((float) i2) / 100.0f;
            a();
        }
    }

    public final void setRadius(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8441a, false, 1582, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8441a, false, 1582, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.g = i2;
        a();
    }

    public a(Context context) {
        super(context, null, 16843563);
        if (PatchProxy.isSupport(new Object[]{context}, this, f8441a, false, 1574, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f8441a, false, 1574, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.h = 2130838651;
        this.j = 2130838651;
        this.f8442b = Color.parseColor("#f85959");
        this.f8443c = Color.parseColor("#1a000000");
        this.f8444d = Color.parseColor("#ffffffff");
        this.f8445e = Color.parseColor("#ffffffff");
        this.f8446f = Color.parseColor("#ffffffff");
        this.g = (int) c.a(context, 4.0f);
        setMaxLines(1);
        setGravity(17);
        setTextColor(this.f8444d);
        setBackgroundDrawable(com.ss.android.ugc.bytex.a.a.a.a(getResources(), this.h));
        this.l = new Paint(5);
        this.l.setColor(this.f8442b);
        this.l.setStyle(Paint.Style.FILL);
        this.m = new Paint(5);
        this.m.setColor(this.f8443c);
        this.m.setStyle(Paint.Style.FILL);
    }

    public final void setStatus(C0064a aVar) {
        Drawable drawable;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f8441a, false, 1589, new Class[]{C0064a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f8441a, false, 1589, new Class[]{C0064a.class}, Void.TYPE);
            return;
        }
        switch (aVar) {
            case IDLE:
                setBackgroundDrawable(com.ss.android.ugc.bytex.a.a.a.a(getResources(), this.h));
                setTextColor(this.f8444d);
                this.k = 0.0f;
                break;
            case DOWNLOADING:
                if (this.i != 0) {
                    drawable = com.ss.android.ugc.bytex.a.a.a.a(getResources(), this.i);
                } else {
                    drawable = null;
                }
                setBackgroundDrawable(drawable);
                setTextColor(this.f8445e);
                if (this.r != C0064a.DOWNLOADING) {
                    this.k = 0.0f;
                    break;
                }
                break;
            case FINISH:
                setBackgroundDrawable(com.ss.android.ugc.bytex.a.a.a.a(getResources(), this.j));
                setTextColor(this.f8446f);
                this.k = 1.0f;
                break;
        }
        this.r = aVar;
    }

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        if (PatchProxy.isSupport(new Object[]{canvas2}, this, f8441a, false, 1587, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2}, this, f8441a, false, 1587, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        if (this.r == C0064a.DOWNLOADING) {
            int width = (int) (((float) getWidth()) * this.k);
            this.o.reset();
            this.n.reset();
            if (width >= this.g && width <= getWidth() - this.g) {
                float f2 = (float) width;
                this.n.moveTo(f2, (float) getHeight());
                this.n.lineTo((float) this.g, (float) getHeight());
                this.q.set(0.0f, (float) (getHeight() - (this.g * 2)), (float) (this.g * 2), (float) getHeight());
                this.n.arcTo(this.q, 90.0f, 90.0f, false);
                this.n.lineTo(0.0f, (float) this.g);
                this.q.set(0.0f, 0.0f, (float) (this.g * 2), (float) (this.g * 2));
                this.n.arcTo(this.q, 180.0f, 90.0f, false);
                this.n.lineTo(f2, 0.0f);
                this.o.moveTo(f2, 0.0f);
                this.o.lineTo((float) (getWidth() - this.g), 0.0f);
                this.q.set((float) (getWidth() - (this.g * 2)), 0.0f, (float) getWidth(), (float) (this.g * 2));
                this.o.arcTo(this.q, 270.0f, 90.0f, false);
                this.o.lineTo((float) getWidth(), (float) (getHeight() - this.g));
                this.q.set((float) (getWidth() - (this.g * 2)), (float) (getHeight() - (this.g * 2)), (float) getWidth(), (float) getHeight());
                this.o.arcTo(this.q, 0.0f, 90.0f, false);
                this.o.lineTo(f2, (float) getHeight());
            } else if (width < this.g) {
                float acos = (float) ((Math.acos((double) (((float) (this.g - width)) / ((float) this.g))) * 180.0d) / 3.141592653589793d);
                this.q.set(0.0f, (float) (getHeight() - (this.g * 2)), (float) (this.g * 2), (float) getHeight());
                this.n.addArc(this.q, 180.0f - acos, acos);
                this.n.lineTo(0.0f, (float) this.g);
                this.q.set(0.0f, 0.0f, (float) (this.g * 2), (float) (this.g * 2));
                this.n.arcTo(this.q, 180.0f, acos, false);
                this.q.set(0.0f, 0.0f, (float) (this.g * 2), (float) (this.g * 2));
                float f3 = 180.0f + acos;
                float f4 = 90.0f - acos;
                this.o.addArc(this.q, f3, f4);
                this.o.lineTo((float) (getWidth() - this.g), 0.0f);
                this.q.set((float) (getWidth() - (this.g * 2)), 0.0f, (float) getWidth(), (float) (this.g * 2));
                this.o.arcTo(this.q, 270.0f, 90.0f, false);
                this.o.lineTo((float) getWidth(), (float) (getHeight() - this.g));
                this.q.set((float) (getWidth() - (this.g * 2)), (float) (getHeight() - (this.g * 2)), (float) getWidth(), (float) getHeight());
                this.o.arcTo(this.q, 0.0f, 90.0f, false);
                this.o.lineTo((float) this.g, (float) getHeight());
                this.q.set(0.0f, (float) (getHeight() - (this.g * 2)), (float) (this.g * 2), (float) getHeight());
                this.o.arcTo(this.q, 90.0f, f4, false);
            } else if (width > getWidth() - this.g) {
                float acos2 = (float) ((Math.acos((double) (((float) ((this.g + width) - getWidth())) / ((float) this.g))) * 180.0d) / 3.141592653589793d);
                this.q.set((float) (getWidth() - (this.g * 2)), (float) (getHeight() - (this.g * 2)), (float) getWidth(), (float) getHeight());
                float f5 = 90.0f - acos2;
                this.n.addArc(this.q, acos2, f5);
                this.n.lineTo((float) this.g, (float) getHeight());
                this.q.set(0.0f, (float) (getHeight() - (this.g * 2)), (float) (this.g * 2), (float) getHeight());
                this.n.arcTo(this.q, 90.0f, 90.0f, false);
                this.n.lineTo(0.0f, (float) this.g);
                this.q.set(0.0f, 0.0f, (float) (this.g * 2), (float) (this.g * 2));
                this.n.arcTo(this.q, 180.0f, 90.0f, false);
                this.n.lineTo((float) (getWidth() - this.g), 0.0f);
                this.q.set((float) (getWidth() - (this.g * 2)), 0.0f, (float) getWidth(), (float) (this.g * 2));
                this.n.arcTo(this.q, -90.0f, f5, false);
                this.q.set((float) (getWidth() - (this.g * 2)), 0.0f, (float) getWidth(), (float) (this.g * 2));
                this.o.addArc(this.q, -acos2, acos2);
                this.o.lineTo((float) getWidth(), (float) (getHeight() - this.g));
                this.q.set((float) (getWidth() - (this.g * 2)), (float) (getHeight() - (this.g * 2)), (float) getWidth(), (float) getHeight());
                this.o.arcTo(this.q, 0.0f, acos2, false);
            }
            canvas2.drawPath(this.o, this.m);
            canvas2.drawPath(this.n, this.l);
        }
        super.onDraw(canvas);
        if (this.s != null) {
            canvas.save();
            canvas2.clipPath(this.p);
            float height = ((float) getHeight()) / ((float) this.s.getHeight());
            canvas2.scale(height, height);
            canvas2.drawBitmap(this.s, (((float) (-this.s.getWidth())) + (this.t * ((float) (getWidth() + this.s.getWidth())))) / height, 0.0f, null);
            canvas.restore();
        }
    }

    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        int i6 = i2;
        int i7 = i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f8441a, false, 1588, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f8441a, false, 1588, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onSizeChanged(i2, i3, i4, i5);
        if (!(i6 == 0 || i7 == 0)) {
            this.p.reset();
            this.q.set(0.0f, 0.0f, (float) i6, (float) i7);
            this.p.addRoundRect(this.q, (float) this.g, (float) this.g, Path.Direction.CW);
        }
    }
}
