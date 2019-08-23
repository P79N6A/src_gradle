package com.ss.android.ugc.aweme.account.common.widget.datepicker;

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
import com.ss.android.ugc.aweme.account.R$styleable;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c;
import java.util.HashSet;
import java.util.Set;

public class NumberPicker extends View {
    private static final int R = Color.rgb(255, 255, 255);

    /* renamed from: a  reason: collision with root package name */
    private static final int f31819a = Color.rgb(0, 150, 136);

    /* renamed from: b  reason: collision with root package name */
    private static final int f31820b = Color.rgb(0, 150, 136);

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f31821c;
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
    protected Set<String> M;
    protected int N;
    protected a O;
    protected boolean P;
    protected String[] Q;
    private int S;
    private int T;
    private int U;
    private int V;
    private VelocityTracker W;
    private float aa;

    /* renamed from: d  reason: collision with root package name */
    protected int f31822d;

    /* renamed from: e  reason: collision with root package name */
    protected int f31823e;

    /* renamed from: f  reason: collision with root package name */
    protected TextPaint f31824f;
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
        public int f31825a;

        /* renamed from: b  reason: collision with root package name */
        public int f31826b;

        public a(int i, int i2) {
            this.f31825a = i;
            this.f31826b = i2;
        }
    }

    public int getCurrentNumber() {
        return this.s;
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f31821c, false, 19865, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31821c, false, 19865, new Class[0], Void.TYPE);
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
            if (this.Q != null) {
                this.z = new int[this.Q.length];
            } else {
                this.z = new int[((this.r - this.q) + 1)];
            }
            for (int i2 = 0; i2 < this.z.length; i2++) {
                this.z[i2] = this.q + i2;
            }
            this.A = this.s - this.q;
        }
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f31821c, false, 19868, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31821c, false, 19868, new Class[0], Void.TYPE);
            return;
        }
        int length = String.valueOf(this.r).length();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(PushConstants.PUSH_TYPE_NOTIFY);
        }
        String sb2 = sb.toString();
        this.f31824f.getTextBounds(sb2, 0, sb2.length(), this.j);
        if (this.w != null) {
            this.g.getTextBounds(this.w, 0, this.w.length(), this.C);
        }
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f31821c, false, 19870, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31821c, false, 19870, new Class[0], Void.TYPE);
            return;
        }
        if (this.F.isFinished()) {
            this.H = 0;
            int round = (this.l + (Math.round(((float) (this.k[0].f31826b - this.l)) / ((float) this.K)) * this.K)) - this.k[0].f31826b;
            if (round != 0) {
                this.F.startScroll(0, 0, 0, round, c.f69428f);
            }
        }
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f31821c, false, 19872, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31821c, false, 19872, new Class[0], Void.TYPE);
            return;
        }
        for (int i2 = 0; i2 < this.k.length; i2++) {
            a aVar = new a((this.A - 3) + i2, this.l + (this.K * i2));
            if (aVar.f31825a > this.z.length - 1) {
                aVar.f31825a -= this.z.length;
            } else if (aVar.f31825a < 0) {
                aVar.f31825a += this.z.length;
            }
            this.k[i2] = aVar;
        }
    }

    public void computeScroll() {
        if (PatchProxy.isSupport(new Object[0], this, f31821c, false, 19874, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31821c, false, 19874, new Class[0], Void.TYPE);
            return;
        }
        Scroller scroller = this.E;
        if (scroller.isFinished()) {
            b(0);
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

    public NumberPicker(Context context) {
        this(context, null);
    }

    private void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f31821c, false, 19886, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f31821c, false, 19886, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.T != i2) {
            this.T = i2;
        }
    }

    public void setSoundEffectsEnabled(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f31821c, false, 19887, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f31821c, false, 19887, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setSoundEffectsEnabled(z2);
        this.P = z2;
    }

    public void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f31821c, false, 19875, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f31821c, false, 19875, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        for (int i3 = 0; i3 < this.k.length; i3++) {
            this.k[i3].f31826b += i2;
            if (this.k[i3].f31826b >= this.m + this.K) {
                this.k[i3].f31826b -= (this.N + 2) * this.K;
                this.k[i3].f31825a -= this.N + 2;
                while (this.k[i3].f31825a < 0) {
                    this.k[i3].f31825a += this.z.length;
                }
            }
            if (this.k[i3].f31826b <= this.l - this.K) {
                this.k[i3].f31826b += (this.N + 2) * this.K;
                this.k[i3].f31825a += this.N + 2;
                while (this.k[i3].f31825a > this.z.length - 1) {
                    this.k[i3].f31825a -= this.z.length;
                }
            }
            if (Math.abs(this.k[i3].f31826b - (this.f31823e / 2)) < this.K / 4) {
                this.A = Math.min(this.k[i3].f31825a, this.z.length - 1);
                int i4 = this.s;
                if (this.A >= 0) {
                    this.s = this.z[this.A];
                }
                if (!(i4 == this.s || this.O == null || !this.P)) {
                    this.O.a();
                }
            }
        }
    }

    public void onDraw(Canvas canvas) {
        float f2;
        TextPaint textPaint;
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f31821c, false, 19869, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f31821c, false, 19869, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        canvas.drawColor(this.G);
        if (this.u == 0.0f) {
            this.u = (float) this.f31822d;
        }
        if (this.u > ((float) this.f31822d)) {
            f2 = (float) this.f31822d;
        } else {
            f2 = this.u;
        }
        float f3 = f2 / 2.0f;
        float f4 = ((float) (this.f31822d / 2)) - f3;
        float f5 = f4;
        float f6 = ((float) (this.f31822d / 2)) + f3;
        canvas.drawLine(f5, this.B.top, f6, this.B.top, this.i);
        canvas.drawLine(f5, this.B.bottom, f6, this.B.bottom, this.i);
        if (this.w != null) {
            canvas.drawText(this.w, (float) ((int) (((float) ((this.f31822d + this.j.width()) / 2)) + (this.aa * 4.0f))), (float) (((this.f31823e / 2) + (this.j.height() / 2)) - 4), this.g);
        }
        for (int i2 = 0; i2 < this.k.length; i2++) {
            if (this.k[i2].f31825a >= 0 && this.k[i2].f31825a <= this.r - this.q) {
                String str = "";
                if (this.k[i2].f31825a >= 0 && this.k[i2].f31825a < this.z.length) {
                    str = this.Q != null ? this.Q[this.k[i2].f31825a] : String.valueOf(this.z[this.k[i2].f31825a]);
                }
                this.M.contains(str);
                float f7 = (float) (this.f31822d / 2);
                float height = (float) (this.k[i2].f31826b + (this.j.height() / 2));
                if (this.k[i2].f31825a == this.A) {
                    textPaint = this.f31824f;
                } else {
                    textPaint = this.h;
                }
                canvas.drawText(str, f7, height, textPaint);
                this.M.add(str);
            }
        }
        this.M.clear();
        if (1 == this.D && this.E.isFinished()) {
            d();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f31821c, false, 19873, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f31821c, false, 19873, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!isEnabled()) {
            return false;
        } else {
            if (this.W == null) {
                this.W = VelocityTracker.obtain();
            }
            this.W.addMovement(motionEvent2);
            int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
            this.D = actionMasked;
            if (actionMasked == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.H = (int) motionEvent.getY();
                if (!this.E.isFinished() || !this.F.isFinished()) {
                    this.E.forceFinished(true);
                    this.F.forceFinished(true);
                    b(0);
                }
            } else if (2 == actionMasked) {
                this.I = (int) motionEvent.getY();
                this.J = this.I - this.H;
                if (!this.L && Math.abs(this.J) < this.S) {
                    return false;
                }
                this.L = true;
                if (this.J > this.S) {
                    this.J -= this.S;
                } else if (this.J < (-this.S)) {
                    this.J += this.S;
                }
                this.H = this.I;
                a(this.J);
                b(1);
                invalidate();
            } else if (1 == actionMasked) {
                this.L = false;
                VelocityTracker velocityTracker = this.W;
                velocityTracker.computeCurrentVelocity(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, (float) this.V);
                int yVelocity = (int) velocityTracker.getYVelocity();
                if (Math.abs(yVelocity) > this.U) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(yVelocity)}, this, f31821c, false, 19876, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(yVelocity)}, this, f31821c, false, 19876, new Class[]{Integer.TYPE}, Void.TYPE);
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
                    b(2);
                } else {
                    d();
                    invalidate();
                }
                this.W.recycle();
                this.W = null;
            }
            return true;
        }
    }

    public NumberPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f31821c, false, 19871, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f31821c, false, 19871, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode == 1073741824) {
            this.f31822d = size;
        } else {
            this.f31822d = this.j.width() + getPaddingLeft() + getPaddingRight() + this.C.width() + 6;
        }
        if (mode2 == 1073741824) {
            this.f31823e = size2;
        } else {
            this.f31823e = (this.N * this.j.height()) + ((this.N - 1) * this.v) + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(this.f31822d, this.f31823e);
        if (this.B == null) {
            this.B = new RectF();
            this.B.left = 0.0f;
            this.B.right = (float) this.f31822d;
            this.B.top = (float) (((this.f31823e - this.j.height()) - this.v) / 2);
            this.B.bottom = (float) (((this.f31823e + this.j.height()) + this.v) / 2);
            this.K = this.v + this.j.height();
            this.l = (this.f31823e / 2) - (this.K * 3);
            this.m = (this.f31823e / 2) + (this.K * 3);
            a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NumberPicker(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        this.D = 3;
        this.M = new HashSet();
        this.P = true;
        this.aa = getResources().getDisplayMetrics().density;
        if (PatchProxy.isSupport(new Object[]{context2, attributeSet2, Integer.valueOf(i2)}, this, f31821c, false, 19863, new Class[]{Context.class, AttributeSet.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, attributeSet2, Integer.valueOf(i2)}, this, f31821c, false, 19863, new Class[]{Context.class, AttributeSet.class, Integer.TYPE}, Void.TYPE);
        } else {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, R$styleable.NumberPicker, i2, 0);
            this.n = obtainStyledAttributes.getColor(2, f31819a);
            this.p = obtainStyledAttributes.getDimension(3, this.aa * 32.0f);
            this.o = obtainStyledAttributes.getColor(4, f31819a);
            this.q = obtainStyledAttributes.getInteger(12, 0);
            this.r = obtainStyledAttributes.getInteger(7, 0);
            this.s = obtainStyledAttributes.getInteger(1, 0);
            this.v = (int) obtainStyledAttributes.getDimension(13, this.aa * 16.0f);
            this.w = obtainStyledAttributes.getString(8);
            this.x = obtainStyledAttributes.getColor(9, f31820b);
            this.y = obtainStyledAttributes.getDimension(10, this.aa * 12.0f);
            this.G = obtainStyledAttributes.getColor(0, R);
            this.N = obtainStyledAttributes.getInteger(11, 5);
            this.t = obtainStyledAttributes.getDimension(6, this.aa * 2.0f);
            this.u = obtainStyledAttributes.getDimension(5, 0.0f);
            obtainStyledAttributes.recycle();
        }
        if (PatchProxy.isSupport(new Object[0], this, f31821c, false, 19864, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31821c, false, 19864, new Class[0], Void.TYPE);
        } else {
            b();
            if (PatchProxy.isSupport(new Object[0], this, f31821c, false, 19866, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f31821c, false, 19866, new Class[0], Void.TYPE);
            } else {
                this.f31824f = new TextPaint();
                this.f31824f.setTextSize(this.p);
                this.f31824f.setColor(this.n);
                this.f31824f.setFlags(1);
                this.f31824f.setTextAlign(Paint.Align.CENTER);
                this.h = new TextPaint(this.f31824f);
                this.h.setAlpha(77);
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
            if (PatchProxy.isSupport(new Object[0], this, f31821c, false, 19867, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f31821c, false, 19867, new Class[0], Void.TYPE);
            } else {
                this.j = new Rect();
                this.C = new Rect();
            }
            c();
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            this.S = ViewConfigurationCompat.getScaledPagingTouchSlop(viewConfiguration);
            this.U = viewConfiguration.getScaledMinimumFlingVelocity();
            this.V = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
            this.E = new Scroller(getContext(), null);
            this.F = new Scroller(getContext(), new DecelerateInterpolator(2.5f));
        }
        this.k = new a[(this.N + 4)];
    }
}
