package com.ss.android.ugc.aweme.common.widget.datepicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewConfigurationCompat;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.R$styleable;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c;
import java.util.HashSet;
import java.util.Set;

public class NumberPicker extends View {
    private static final int S = Color.rgb(255, 255, 255);

    /* renamed from: a  reason: collision with root package name */
    private static final int f40543a = Color.rgb(0, 150, 136);

    /* renamed from: b  reason: collision with root package name */
    private static final int f40544b = Color.rgb(0, 150, 136);

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f40545c;
    protected int A;
    protected RectF B;
    protected Rect C;
    protected int D;
    protected Scroller E;
    protected Scroller F;
    protected int G;
    protected int H;
    protected int I;
    protected int J;
    protected int K;
    protected boolean L;
    protected b M;
    protected Set<String> N;
    protected int O;
    protected a P;
    protected boolean Q;
    protected String[] R;
    private int T;
    private int U;
    private int V;
    private int W;
    private VelocityTracker aa;
    private float ab;

    /* renamed from: d  reason: collision with root package name */
    protected int f40546d;

    /* renamed from: e  reason: collision with root package name */
    protected int f40547e;

    /* renamed from: f  reason: collision with root package name */
    protected TextPaint f40548f;
    protected TextPaint g;
    protected TextPaint h;
    protected Paint i;
    protected Rect j;
    protected a[] k;
    protected int l;
    protected int m;
    protected int n;
    protected int o;
    protected float p;
    protected int q;
    protected int r;
    protected int s;
    protected float t;
    protected float u;
    protected int v;
    protected String w;
    protected int x;
    protected float y;
    protected int[] z;

    class a {

        /* renamed from: a  reason: collision with root package name */
        public int f40549a;

        /* renamed from: b  reason: collision with root package name */
        public int f40550b;

        a(int i, int i2) {
            this.f40549a = i;
            this.f40550b = i2;
        }
    }

    public interface b {
        void a(NumberPicker numberPicker, int i, int i2);
    }

    public int getCurrentNumber() {
        return this.s;
    }

    public void b() {
        this.k = new a[(this.O + 4)];
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f40545c, false, 33907, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40545c, false, 33907, new Class[0], Void.TYPE);
            return;
        }
        this.j = new Rect();
        this.C = new Rect();
    }

    private void h() {
        if (PatchProxy.isSupport(new Object[0], this, f40545c, false, 33908, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40545c, false, 33908, new Class[0], Void.TYPE);
            return;
        }
        int length = String.valueOf(this.r).length();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(PushConstants.PUSH_TYPE_NOTIFY);
        }
        String sb2 = sb.toString();
        this.f40548f.getTextBounds(sb2, 0, sb2.length(), this.j);
        if (this.w != null) {
            this.g.getTextBounds(this.w, 0, this.w.length(), this.C);
        }
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f40545c, false, 33912, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40545c, false, 33912, new Class[0], Void.TYPE);
            return;
        }
        for (int i2 = 0; i2 < this.k.length; i2++) {
            a aVar = new a((this.A - 3) + i2, this.l + (this.K * i2));
            if (aVar.f40549a > this.z.length - 1) {
                aVar.f40549a -= this.z.length;
            } else if (aVar.f40549a < 0) {
                aVar.f40549a += this.z.length;
            }
            this.k[i2] = aVar;
        }
    }

    public void computeScroll() {
        if (PatchProxy.isSupport(new Object[0], this, f40545c, false, 33914, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40545c, false, 33914, new Class[0], Void.TYPE);
            return;
        }
        Scroller scroller = this.E;
        if (scroller.isFinished()) {
            j(0);
            scroller = this.F;
            if (scroller.isFinished()) {
                return;
            }
        }
        scroller.computeScrollOffset();
        this.I = scroller.getCurrY();
        this.J = this.I - this.H;
        a(this.J);
        invalidate();
        this.H = this.I;
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f40545c, false, 33905, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40545c, false, 33905, new Class[0], Void.TYPE);
        } else if (this.q < 0 || this.r < 0) {
            throw new IllegalArgumentException("number can not be negative");
        } else {
            if (this.q > this.r) {
                this.r = this.q;
            }
            if (this.s < this.q) {
                this.s = this.q;
            }
            if (this.s > this.r) {
                this.s = this.r;
            }
            if (this.R != null) {
                this.z = new int[this.R.length];
            } else {
                this.z = new int[((this.r - this.q) + 1)];
            }
            for (int i2 = 0; i2 < this.z.length; i2++) {
                this.z[i2] = this.q + i2;
            }
            this.A = this.s - this.q;
        }
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f40545c, false, 33906, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40545c, false, 33906, new Class[0], Void.TYPE);
            return;
        }
        this.f40548f = new TextPaint();
        this.f40548f.setTextSize(this.p);
        this.f40548f.setColor(this.n);
        this.f40548f.setFlags(1);
        this.f40548f.setTextAlign(Paint.Align.CENTER);
        this.h = new TextPaint(this.f40548f);
        this.h.setColor(Color.argb((int) (((float) Color.alpha(this.n)) * 0.3f), Color.red(this.n), Color.green(this.n), Color.blue(this.n)));
        this.g = new TextPaint();
        this.g.setTextSize(this.y);
        this.g.setColor(this.x);
        this.g.setFlags(1);
        this.g.setTextAlign(Paint.Align.LEFT);
        this.i = new Paint();
        this.i.setColor(this.o);
        this.i.setStyle(Paint.Style.STROKE);
        this.i.setStrokeWidth(this.t);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f40545c, false, 33904, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40545c, false, 33904, new Class[0], Void.TYPE);
            return;
        }
        e();
        f();
        g();
        h();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.T = ViewConfigurationCompat.getScaledPagingTouchSlop(viewConfiguration);
        this.V = viewConfiguration.getScaledMinimumFlingVelocity();
        this.W = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        this.E = new Scroller(getContext(), null);
        this.F = new Scroller(getContext(), new DecelerateInterpolator(2.5f));
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f40545c, false, 33910, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40545c, false, 33910, new Class[0], Void.TYPE);
            return;
        }
        if (this.F.isFinished()) {
            this.H = 0;
            int round = (this.l + (Math.round(((float) (this.k[0].f40550b - this.l)) / ((float) this.K)) * this.K)) - this.k[0].f40550b;
            if (round != 0) {
                this.F.startScroll(0, 0, 0, round, c.f69428f);
            }
        }
    }

    public final NumberPicker a(b bVar) {
        this.M = bVar;
        return this;
    }

    public NumberPicker(Context context) {
        this(context, null);
    }

    public final String i(int i2) {
        if (this.R == null || i2 > this.r || i2 < this.q) {
            return "";
        }
        return this.R[i2];
    }

    public final NumberPicker a(String[] strArr) {
        if (PatchProxy.isSupport(new Object[]{strArr}, this, f40545c, false, 33929, new Class[]{String[].class}, NumberPicker.class)) {
            return (NumberPicker) PatchProxy.accessDispatch(new Object[]{strArr}, this, f40545c, false, 33929, new Class[]{String[].class}, NumberPicker.class);
        }
        this.R = strArr;
        e();
        invalidate();
        return this;
    }

    private void j(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40545c, false, 33927, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40545c, false, 33927, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.U != i2) {
            this.U = i2;
        }
    }

    public final NumberPicker b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40545c, false, 33917, new Class[]{Integer.TYPE}, NumberPicker.class)) {
            return (NumberPicker) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40545c, false, 33917, new Class[]{Integer.TYPE}, NumberPicker.class);
        }
        this.q = i2;
        e();
        a();
        invalidate();
        return this;
    }

    public final NumberPicker c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40545c, false, 33918, new Class[]{Integer.TYPE}, NumberPicker.class)) {
            return (NumberPicker) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40545c, false, 33918, new Class[]{Integer.TYPE}, NumberPicker.class);
        }
        this.r = i2;
        e();
        a();
        invalidate();
        return this;
    }

    public final NumberPicker d(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40545c, false, 33919, new Class[]{Integer.TYPE}, NumberPicker.class)) {
            return (NumberPicker) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40545c, false, 33919, new Class[]{Integer.TYPE}, NumberPicker.class);
        }
        this.s = i2;
        e();
        a();
        invalidate();
        return this;
    }

    public final NumberPicker e(int i2) {
        if (PatchProxy.isSupport(new Object[]{3}, this, f40545c, false, 33920, new Class[]{Integer.TYPE}, NumberPicker.class)) {
            return (NumberPicker) PatchProxy.accessDispatch(new Object[]{3}, this, f40545c, false, 33920, new Class[]{Integer.TYPE}, NumberPicker.class);
        }
        this.O = 3;
        e();
        a();
        invalidate();
        return this;
    }

    public final NumberPicker f(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40545c, false, 33921, new Class[]{Integer.TYPE}, NumberPicker.class)) {
            return (NumberPicker) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40545c, false, 33921, new Class[]{Integer.TYPE}, NumberPicker.class);
        }
        this.n = i2;
        f();
        invalidate();
        return this;
    }

    public final NumberPicker g(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40545c, false, 33922, new Class[]{Integer.TYPE}, NumberPicker.class)) {
            return (NumberPicker) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40545c, false, 33922, new Class[]{Integer.TYPE}, NumberPicker.class);
        }
        this.x = i2;
        f();
        invalidate();
        return this;
    }

    public void setSoundEffectsEnabled(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f40545c, false, 33928, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f40545c, false, 33928, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setSoundEffectsEnabled(z2);
        this.Q = z2;
    }

    public final NumberPicker h(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40545c, false, 33923, new Class[]{Integer.TYPE}, NumberPicker.class)) {
            return (NumberPicker) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40545c, false, 33923, new Class[]{Integer.TYPE}, NumberPicker.class);
        }
        this.o = i2;
        f();
        invalidate();
        return this;
    }

    public void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40545c, false, 33915, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40545c, false, 33915, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        for (int i3 = 0; i3 < this.k.length; i3++) {
            this.k[i3].f40550b += i2;
            if (this.k[i3].f40550b >= this.m + this.K) {
                this.k[i3].f40550b -= (this.O + 2) * this.K;
                this.k[i3].f40549a -= this.O + 2;
                while (this.k[i3].f40549a < 0) {
                    this.k[i3].f40549a += this.z.length;
                }
            }
            if (this.k[i3].f40550b <= this.l - this.K) {
                this.k[i3].f40550b += (this.O + 2) * this.K;
                this.k[i3].f40549a += this.O + 2;
                while (this.k[i3].f40549a > this.z.length - 1) {
                    this.k[i3].f40549a -= this.z.length;
                }
            }
            if (Math.abs(this.k[i3].f40550b - (this.f40547e / 2)) < this.K / 4) {
                this.A = Math.min(this.k[i3].f40549a, this.z.length - 1);
                int i4 = this.s;
                if (this.A >= 0) {
                    this.s = this.z[this.A];
                }
                if (i4 != this.s) {
                    if (this.M != null) {
                        this.M.a(this, i4, this.s);
                    }
                    if (this.P != null && this.Q) {
                        this.P.a();
                    }
                }
            }
        }
    }

    public void onDraw(Canvas canvas) {
        float f2;
        TextPaint textPaint;
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f40545c, false, 33909, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f40545c, false, 33909, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        canvas.drawColor(this.G);
        if (this.u == 0.0f) {
            this.u = (float) this.f40546d;
        }
        if (this.u > ((float) this.f40546d)) {
            f2 = (float) this.f40546d;
        } else {
            f2 = this.u;
        }
        float f3 = f2 / 2.0f;
        float f4 = ((float) (this.f40546d / 2)) - f3;
        float f5 = f4;
        float f6 = ((float) (this.f40546d / 2)) + f3;
        canvas.drawLine(f5, this.B.top, f6, this.B.top, this.i);
        canvas.drawLine(f5, this.B.bottom, f6, this.B.bottom, this.i);
        if (this.w != null) {
            canvas.drawText(this.w, (float) ((int) (((float) ((this.f40546d + this.j.width()) / 2)) + (this.ab * 4.0f))), (float) (((this.f40547e / 2) + (this.j.height() / 2)) - 4), this.g);
        }
        for (int i2 = 0; i2 < this.k.length; i2++) {
            if (this.k[i2].f40549a >= 0 && this.k[i2].f40549a <= this.r - this.q) {
                String str = "";
                if (this.k[i2].f40549a >= 0 && this.k[i2].f40549a < this.z.length) {
                    str = this.R != null ? this.R[this.k[i2].f40549a] : String.valueOf(this.z[this.k[i2].f40549a]);
                }
                float f7 = (float) (this.f40546d / 2);
                float height = (float) (this.k[i2].f40550b + (this.j.height() / 2));
                if (this.k[i2].f40549a == this.A) {
                    textPaint = this.f40548f;
                } else {
                    textPaint = this.h;
                }
                canvas.drawText(str, f7, height, textPaint);
                this.N.add(str);
            }
        }
        this.N.clear();
        if (1 == this.D && this.E.isFinished()) {
            d();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f40545c, false, 33913, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f40545c, false, 33913, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!isEnabled()) {
            return false;
        } else {
            if (this.aa == null) {
                this.aa = VelocityTracker.obtain();
            }
            this.aa.addMovement(motionEvent2);
            int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
            this.D = actionMasked;
            if (actionMasked == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.H = (int) motionEvent.getY();
                if (!this.E.isFinished() || !this.F.isFinished()) {
                    this.E.forceFinished(true);
                    this.F.forceFinished(true);
                    j(0);
                }
            } else if (2 == actionMasked) {
                this.I = (int) motionEvent.getY();
                this.J = this.I - this.H;
                if (!this.L && Math.abs(this.J) < this.T) {
                    return false;
                }
                this.L = true;
                if (this.J > this.T) {
                    this.J -= this.T;
                } else if (this.J < (-this.T)) {
                    this.J += this.T;
                }
                this.H = this.I;
                a(this.J);
                j(1);
                invalidate();
            } else if (1 == actionMasked) {
                this.L = false;
                VelocityTracker velocityTracker = this.aa;
                velocityTracker.computeCurrentVelocity(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, (float) this.W);
                int yVelocity = (int) velocityTracker.getYVelocity();
                if (Math.abs(yVelocity) > this.V) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(yVelocity)}, this, f40545c, false, 33916, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(yVelocity)}, this, f40545c, false, 33916, new Class[]{Integer.TYPE}, Void.TYPE);
                    } else {
                        if (yVelocity > 0) {
                            this.H = 0;
                            this.E.fling(0, 0, 0, yVelocity, 0, 0, 0, (int) (this.p * 10.0f));
                        } else if (yVelocity < 0) {
                            int i2 = (int) (this.p * 10.0f);
                            this.H = i2;
                            this.E.fling(0, i2, 0, yVelocity, 0, 0, 0, i2);
                        }
                        invalidate();
                    }
                    j(2);
                } else {
                    d();
                    invalidate();
                }
                this.aa.recycle();
                this.aa = null;
            }
            return true;
        }
    }

    public NumberPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f40545c, false, 33911, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f40545c, false, 33911, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode == 1073741824) {
            this.f40546d = size;
        } else {
            this.f40546d = this.j.width() + getPaddingLeft() + getPaddingRight() + this.C.width() + 6;
        }
        if (mode2 == 1073741824) {
            this.f40547e = size2;
        } else {
            this.f40547e = (this.O * this.j.height()) + ((this.O - 1) * this.v) + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(this.f40546d, this.f40547e);
        if (this.B == null) {
            this.B = new RectF();
            this.B.left = 0.0f;
            this.B.right = (float) this.f40546d;
            this.B.top = (float) (((this.f40547e - this.j.height()) - this.v) / 2);
            this.B.bottom = (float) (((this.f40547e + this.j.height()) + this.v) / 2);
            this.K = this.v + this.j.height();
            this.l = (this.f40547e / 2) - (this.K * 3);
            this.m = (this.f40547e / 2) + (this.K * 3);
            a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NumberPicker(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        this.D = 3;
        this.N = new HashSet();
        this.Q = true;
        this.ab = getResources().getDisplayMetrics().density;
        if (PatchProxy.isSupport(new Object[]{context2, attributeSet2, Integer.valueOf(i2)}, this, f40545c, false, 33903, new Class[]{Context.class, AttributeSet.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, attributeSet2, Integer.valueOf(i2)}, this, f40545c, false, 33903, new Class[]{Context.class, AttributeSet.class, Integer.TYPE}, Void.TYPE);
        } else {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, R$styleable.NumberPicker, i2, 0);
            this.n = obtainStyledAttributes.getColor(2, f40543a);
            this.p = obtainStyledAttributes.getDimension(3, this.ab * 32.0f);
            this.o = obtainStyledAttributes.getColor(4, f40543a);
            this.q = obtainStyledAttributes.getInteger(12, 0);
            this.r = obtainStyledAttributes.getInteger(7, 0);
            this.s = obtainStyledAttributes.getInteger(1, 0);
            this.v = (int) obtainStyledAttributes.getDimension(13, this.ab * 16.0f);
            this.w = obtainStyledAttributes.getString(8);
            this.x = obtainStyledAttributes.getColor(9, f40544b);
            this.y = obtainStyledAttributes.getDimension(10, this.ab * 12.0f);
            this.G = obtainStyledAttributes.getColor(0, S);
            this.O = obtainStyledAttributes.getInteger(11, 5);
            this.t = obtainStyledAttributes.getDimension(6, this.ab * 2.0f);
            this.u = obtainStyledAttributes.getDimension(5, 0.0f);
            obtainStyledAttributes.recycle();
        }
        c();
        b();
    }
}
