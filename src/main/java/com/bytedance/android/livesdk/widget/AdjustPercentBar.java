package com.bytedance.android.livesdk.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.R$styleable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class AdjustPercentBar extends View {
    static Drawable K;
    static Drawable L;

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18172a;
    float A;
    boolean B;
    boolean C;
    Context D;
    boolean E;
    Rect F;
    public String G;
    public int H;
    boolean I;
    boolean J;
    boolean M;
    ValueAnimator N;
    boolean O;
    public int P;
    public String Q;
    public ValueAnimator R;
    public float S;
    public Handler T;
    public Runnable U;
    private b V;
    private int W;
    private float aa;
    private float ab;
    private float ac;
    private float ad;
    private int ae;
    private int af;
    private int ag;
    private int ah;
    private Runnable ai;
    private int aj;
    private boolean ak;

    /* renamed from: b  reason: collision with root package name */
    int f18173b;

    /* renamed from: c  reason: collision with root package name */
    int f18174c;

    /* renamed from: d  reason: collision with root package name */
    int f18175d;

    /* renamed from: e  reason: collision with root package name */
    int f18176e;

    /* renamed from: f  reason: collision with root package name */
    int f18177f;
    int g;
    int h;
    int i;
    int j;
    int k;
    int l;
    int m;
    int n;
    int o;
    int p;
    float q;
    Paint r;
    Paint s;
    Paint t;
    Paint u;
    Paint v;
    Paint w;
    int x;
    int y;
    String z;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f18188a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f18188a, false, 14300, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f18188a, false, 14300, new Class[0], Void.TYPE);
            } else if (AdjustPercentBar.this.O) {
                if (AdjustPercentBar.this.N != null) {
                    AdjustPercentBar.this.N.removeAllListeners();
                    AdjustPercentBar.this.N.cancel();
                }
                AdjustPercentBar.this.w.setShadowLayer(0.0f, 0.0f, 0.0f, AdjustPercentBar.this.m);
                AdjustPercentBar.this.N = ValueAnimator.ofFloat(new float[]{1.0f});
                AdjustPercentBar.this.N.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f18190a;

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f18190a, false, 14301, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f18190a, false, 14301, new Class[]{ValueAnimator.class}, Void.TYPE);
                            return;
                        }
                        AdjustPercentBar.this.setTextAlpha((int) ((1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 255.0f));
                        AdjustPercentBar.this.invalidate();
                    }
                });
                AdjustPercentBar.this.N.addListener(new AnimatorListenerAdapter() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f18192a;

                    public final void onAnimationEnd(Animator animator) {
                        if (PatchProxy.isSupport(new Object[]{animator}, this, f18192a, false, 14302, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator}, this, f18192a, false, 14302, new Class[]{Animator.class}, Void.TYPE);
                            return;
                        }
                        super.onAnimationEnd(animator);
                    }
                });
                AdjustPercentBar.this.N.setDuration(300);
                AdjustPercentBar.this.N.start();
                AdjustPercentBar.this.O = false;
            }
        }

        private a() {
        }

        /* synthetic */ a(AdjustPercentBar adjustPercentBar, byte b2) {
            this();
        }
    }

    public interface b {
        void a();

        void a(int i);

        void b(int i);
    }

    public int getPercent() {
        return this.x;
    }

    private boolean b() {
        if (this.ah == 0 && (this.H == 0 || this.H == 100)) {
            return false;
        }
        return true;
    }

    private void c() {
        float f2;
        if (PatchProxy.isSupport(new Object[0], this, f18172a, false, 14281, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18172a, false, 14281, new Class[0], Void.TYPE);
            return;
        }
        removeCallbacks(this.ai);
        if (!this.O && !TextUtils.isEmpty(this.z)) {
            if (this.N != null) {
                this.N.removeAllListeners();
                this.N.cancel();
            }
            Paint paint = this.w;
            if (this.M) {
                f2 = 0.0f;
            } else {
                f2 = 3.0f;
            }
            paint.setShadowLayer((float) ac.a(f2), 0.0f, 0.0f, this.m);
            setTextAlpha(255);
            this.O = true;
            invalidate();
        }
    }

    public void buildDrawingCache() {
        if (PatchProxy.isSupport(new Object[0], this, f18172a, false, 14280, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18172a, false, 14280, new Class[0], Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 || ((long) getWidth()) * ((long) getHeight()) * 4 < 838860800) {
            super.buildDrawingCache();
        }
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f18172a, false, 14270, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18172a, false, 14270, new Class[0], Void.TYPE);
            return;
        }
        this.o = this.f18173b / 2;
        this.p = ac.a(32.0f);
        this.q = (((float) this.f18173b) - (this.ad * 2.0f)) / ((float) this.af);
        this.E = true;
        invalidate();
    }

    public void setIsTwoWayMode(boolean z2) {
        this.ak = z2;
    }

    public void setLevelAdjustBarTitle(String str) {
        this.G = str;
    }

    public void setTextInCenter(boolean z2) {
        this.J = z2;
    }

    public AdjustPercentBar(Context context) {
        this(context, null);
    }

    private int b(int i2) {
        if (((float) (i2 % this.ae)) >= ((float) this.ae) / 2.0f) {
            return ((i2 / this.ae) + 1) * this.ae;
        }
        return (i2 / this.ae) * this.ae;
    }

    public void setOnLevelChangeListener(final b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f18172a, false, 14278, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f18172a, false, 14278, new Class[]{b.class}, Void.TYPE);
            return;
        }
        this.V = new b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f18185a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f18185a, false, 14292, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f18185a, false, 14292, new Class[0], Void.TYPE);
                    return;
                }
                bVar.a();
            }

            public final void a(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f18185a, false, 14290, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f18185a, false, 14290, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                AdjustPercentBar.this.T.removeCallbacks(AdjustPercentBar.this.U);
                if (AdjustPercentBar.this.Q != null && i == AdjustPercentBar.this.H) {
                    AdjustPercentBar.this.T.postDelayed(AdjustPercentBar.this.U, 100);
                } else if (AdjustPercentBar.this.R != null) {
                    AdjustPercentBar.this.R.cancel();
                    AdjustPercentBar.this.R = null;
                }
                bVar.a(i);
            }

            public final void b(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f18185a, false, 14291, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f18185a, false, 14291, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                bVar.b(i);
            }
        };
    }

    private int a(int i2) {
        int i3;
        int i4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18172a, false, 14276, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18172a, false, 14276, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        if (this.ae > 1) {
            i3 = b(i2);
        } else {
            i3 = i2;
        }
        if (i3 > this.af) {
            i4 = this.ag;
        } else if (i3 <= 0) {
            i4 = this.ah;
        } else {
            i4 = i3 + this.ah;
        }
        if (b() && i4 >= this.H - 2 && i4 <= this.H + 2) {
            i4 = this.H;
        }
        return i4;
    }

    public void setPercent(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18172a, false, 14275, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18172a, false, 14275, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.x = i2;
        invalidate();
    }

    public void setTextAlpha(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18172a, false, 14285, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18172a, false, 14285, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.aj = i2;
        this.w.setAlpha(i2);
        this.v.setAlpha(i2);
    }

    public void buildDrawingCache(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f18172a, false, 14279, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f18172a, false, 14279, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 || ((long) getWidth()) * ((long) getHeight()) * 4 < 838860800) {
            super.buildDrawingCache(z2);
        }
    }

    public void setUpUiColor(boolean z2) {
        int i2;
        float f2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f3;
        int i7;
        int i8;
        int i9;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f18172a, false, 14267, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f18172a, false, 14267, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        Paint paint = this.r;
        if (z2) {
            i2 = this.k;
        } else {
            i2 = this.i;
        }
        paint.setColor(i2);
        Paint paint2 = this.r;
        float f4 = 1.0f;
        if (z2) {
            f2 = 0.0f;
        } else {
            f2 = 1.0f;
        }
        float a2 = (float) ac.a(f2);
        if (z2) {
            i3 = this.n;
        } else {
            i3 = this.m;
        }
        paint2.setShadowLayer(a2, 0.0f, 0.0f, i3);
        Paint paint3 = this.s;
        if (z2) {
            i4 = this.l;
        } else {
            i4 = this.j;
        }
        paint3.setColor(i4);
        Paint paint4 = this.s;
        if (z2) {
            f4 = 0.0f;
        }
        float a3 = (float) ac.a(f4);
        if (z2) {
            i5 = this.n;
        } else {
            i5 = this.m;
        }
        paint4.setShadowLayer(a3, 0.0f, 0.0f, i5);
        Paint paint5 = this.t;
        if (z2) {
            i6 = this.k;
        } else {
            i6 = 16731699;
        }
        paint5.setColor(i6);
        Paint paint6 = this.t;
        if (z2) {
            f3 = 0.0f;
        } else {
            f3 = 3.0f;
        }
        float a4 = (float) ac.a(f3);
        if (z2) {
            i7 = this.n;
        } else {
            i7 = this.m;
        }
        paint6.setShadowLayer(a4, 0.0f, 0.0f, i7);
        Paint paint7 = this.u;
        if (z2) {
            i8 = this.k;
        } else {
            i8 = this.i;
        }
        paint7.setColor(i8);
        this.v.setColor(this.i);
        Paint paint8 = this.w;
        if (z2) {
            i9 = this.k;
        } else {
            i9 = this.i;
        }
        paint8.setColor(i9);
        setTextAlpha(this.aj);
        this.M = z2;
        if (this.M && L == null) {
            L = com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130840899);
        }
        if (!this.M && K == null) {
            K = com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130840899);
        }
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        String str;
        Paint paint;
        int i2;
        Drawable drawable;
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f18172a, false, 14271, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f18172a, false, 14271, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        if (this.E) {
            float f2 = this.ad + (((float) (this.x - this.ah)) * this.q);
            float f3 = this.ad + (((float) (this.H - this.ah)) * this.q);
            canvas.drawLine(this.ad, (float) this.p, ((float) this.f18173b) - this.ad, (float) this.p, this.s);
            if (this.I) {
                canvas.drawLine(this.ad, (float) this.p, f2, (float) this.p, this.r);
            } else {
                canvas.drawLine(f2, (float) this.p, f3, (float) this.p, this.r);
            }
            int i3 = 255;
            this.t.setAlpha(255);
            this.u.setAlpha(255);
            this.w.setAlpha(255);
            this.v.setAlpha(255);
            canvas.drawCircle(f2, (float) this.p, this.ab, this.t);
            if (this.H >= this.ah && this.H <= this.ag && b()) {
                canvas.drawCircle(f3, (float) this.p, (float) this.f18177f, this.u);
            }
            int i4 = this.P;
            if (i4 == Integer.MIN_VALUE) {
                i4 = this.x;
            }
            if (this.S == 0.0f) {
                str = String.valueOf(i4);
            } else if (this.Q == null) {
                str = "";
            } else {
                str = this.Q;
            }
            if (TextUtils.isEmpty(this.G) || TextUtils.isEmpty(str)) {
                this.z = str;
            } else {
                this.z = this.G + " " + str;
            }
            if (!TextUtils.isEmpty(this.z)) {
                if (this.J) {
                    paint = this.w;
                } else {
                    paint = this.v;
                }
                this.v.getTextBounds(this.z, 0, this.z.length(), this.F);
                int width = this.F.width();
                int a2 = ac.a(14.0f);
                if (this.J) {
                    i2 = this.o;
                } else {
                    i2 = (int) f2;
                }
                int a3 = (i2 - (width / 2)) - ac.a(1.0f);
                int i5 = this.p - a2;
                if (this.M) {
                    drawable = L;
                } else {
                    drawable = K;
                }
                if (!this.J && drawable != null) {
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    int max = Math.max(width, intrinsicWidth);
                    if (this.S == 1.0f) {
                        i3 = this.aj;
                        max += intrinsicWidth;
                    } else if (this.S > 0.0f) {
                        float f4 = (float) intrinsicWidth;
                        max = (int) (((float) ((int) ((((float) (max - intrinsicWidth)) * this.S) + f4))) + (f4 * this.S));
                    } else {
                        i3 = this.aj;
                    }
                    drawable.setAlpha(i3);
                    drawable.setBounds(0, 0, max, drawable.getIntrinsicHeight());
                    canvas.save();
                    canvas.translate(((float) i2) - (((float) max) / 2.0f), (float) (this.p - ac.a(57.0f)));
                    drawable.draw(canvas);
                    canvas.restore();
                }
                if (this.S <= 0.0f || this.S >= 1.0f) {
                    canvas.drawText(this.z, (float) a3, (float) i5, paint);
                    return;
                }
                int alpha = paint.getAlpha();
                paint.setAlpha((int) (this.S * 255.0f));
                canvas.drawText(this.z, (float) a3, (float) i5, paint);
                paint.setAlpha(alpha);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f18172a, false, 14272, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f18172a, false, 14272, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!this.C) {
            return true;
        } else {
            if (motionEvent.getAction() == 0 && (motionEvent.getX() < this.ad - ((float) this.g) || motionEvent.getX() > ((float) ac.c()) - (this.ad - ((float) this.g)))) {
                return false;
            }
            if (motionEvent.getAction() == 0 && Math.abs(motionEvent.getY() - ((float) this.p)) > ((float) (this.f18174c - this.p))) {
                return false;
            }
            switch (motionEvent.getAction()) {
                case 0:
                    c();
                    this.y = this.x;
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(x2), Float.valueOf(y2)}, this, f18172a, false, 14277, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(x2), Float.valueOf(y2)}, this, f18172a, false, 14277, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
                    } else {
                        int i2 = this.x - this.ah;
                        double d2 = (double) this.f18176e;
                        Double.isNaN(d2);
                        if (((double) Math.abs(x2 - (this.ad + (((float) i2) * this.q)))) <= d2 * 2.5d) {
                            double d3 = (double) this.f18176e;
                            Double.isNaN(d3);
                            if (((double) Math.abs(y2 - ((float) this.p))) <= d3 * 2.5d) {
                                z2 = true;
                            }
                        }
                        z2 = false;
                    }
                    if (!z2) {
                        z3 = true;
                    }
                    this.B = z3;
                    this.A = motionEvent.getX();
                    int a2 = a((int) ((this.A - this.ad) / this.q));
                    if (this.x != a2) {
                        this.x = a2;
                        this.y = a2;
                        if (this.V != null) {
                            this.V.a(this.x);
                        }
                        invalidate();
                        break;
                    }
                    break;
                case 1:
                    float x3 = motionEvent.getX();
                    if (!this.B || Math.abs(x3 - this.A) > ((float) ac.a(3.0f))) {
                        if (this.V != null) {
                            this.V.b(this.x);
                            break;
                        }
                    } else {
                        final int a3 = a((int) ((x3 - this.ad) / this.q));
                        if (this.V != null) {
                            this.x = a3;
                            this.V.a(a3);
                            this.V.b(a3);
                        }
                        final int i3 = this.x;
                        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i3), Integer.valueOf(a3)}, this, f18172a, false, 14274, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                            this.C = false;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                            ofFloat.setTarget(this);
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f18179a;

                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f18179a, false, 14288, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f18179a, false, 14288, new Class[]{ValueAnimator.class}, Void.TYPE);
                                        return;
                                    }
                                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    AdjustPercentBar.this.x = (int) (((float) i3) + (((float) (a3 - i3)) * floatValue));
                                    AdjustPercentBar.this.invalidate();
                                }
                            });
                            ofFloat.addListener(new AnimatorListenerAdapter() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f18183a;

                                public final void onAnimationEnd(Animator animator) {
                                    if (PatchProxy.isSupport(new Object[]{animator}, this, f18183a, false, 14289, new Class[]{Animator.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{animator}, this, f18183a, false, 14289, new Class[]{Animator.class}, Void.TYPE);
                                        return;
                                    }
                                    AdjustPercentBar.this.C = true;
                                    super.onAnimationEnd(animator);
                                }
                            });
                            ofFloat.setDuration(50);
                            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                            ofFloat.start();
                            break;
                        } else {
                            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3), Integer.valueOf(a3)}, this, f18172a, false, 14274, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                            break;
                        }
                    }
                    break;
                case 2:
                    c();
                    int a4 = a((this.y - this.ah) + ((int) ((motionEvent.getX() - this.A) / this.q)));
                    if (!(this.V == null || this.x == a4)) {
                        this.x = a4;
                        this.V.a(this.x);
                    }
                    invalidate();
                    break;
                case 3:
                    if (this.V != null) {
                        this.V.b(this.x);
                        break;
                    }
                    break;
            }
            if (this.V != null) {
                this.V.a();
            }
            return true;
        }
    }

    public AdjustPercentBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdjustPercentBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f18175d = ac.a(4.0f);
        this.f18176e = ac.a(9.0f);
        this.f18177f = ac.a(2.0f);
        this.g = ac.a(10.0f);
        this.h = 1;
        this.C = true;
        this.E = false;
        this.F = new Rect();
        this.G = null;
        this.W = 0;
        this.aa = 0.0f;
        this.ab = 0.0f;
        this.ac = 0.0f;
        this.ad = (float) ac.a(40.0f);
        this.I = true;
        this.J = false;
        this.O = true;
        this.P = Integer.MIN_VALUE;
        this.ai = new a(this, (byte) 0);
        this.aj = 0;
        this.S = 0.1f;
        this.T = new Handler(Looper.getMainLooper());
        this.U = new Runnable() {
            public final void run() {
            }
        };
        if (PatchProxy.isSupport(new Object[]{context, attributeSet}, this, f18172a, false, 14266, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, attributeSet}, this, f18172a, false, 14266, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
            return;
        }
        this.D = context;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ttlive_AdjustPercentBar);
            this.G = obtainStyledAttributes.getString(4) == null ? "" : obtainStyledAttributes.getString(4);
            this.W = obtainStyledAttributes.getColor(5, -16777216);
            this.aa = obtainStyledAttributes.getDimension(6, (float) ac.a(14.0f));
            this.ad = obtainStyledAttributes.getDimension(0, (float) ac.a(40.0f));
            this.ab = obtainStyledAttributes.getDimension(2, (float) this.f18176e);
            this.ac = obtainStyledAttributes.getDimension(1, (float) this.f18175d);
            this.ae = obtainStyledAttributes.getInt(3, this.h);
            obtainStyledAttributes.recycle();
            setLayerType(1, null);
            this.i = ac.b((int) C0906R.color.ao4);
            this.j = 1040187391;
            this.k = ac.b((int) C0906R.color.d5);
            this.l = ac.b((int) C0906R.color.aek);
            this.m = 1073741824;
            this.n = ac.b((int) C0906R.color.a7l);
            this.r = new Paint();
            this.r.setStyle(Paint.Style.FILL);
            this.r.setStrokeWidth(this.ac);
            this.r.setStrokeCap(Paint.Cap.ROUND);
            this.r.setAntiAlias(true);
            this.s = new Paint();
            this.s.setStyle(Paint.Style.FILL);
            this.s.setStrokeWidth(this.ac);
            this.s.setStrokeCap(Paint.Cap.ROUND);
            this.s.setAntiAlias(true);
            this.t = new Paint();
            this.t.setStyle(Paint.Style.FILL);
            this.t.setAntiAlias(true);
            this.u = new Paint();
            this.u.setStyle(Paint.Style.FILL);
            this.u.setAntiAlias(true);
            this.v = new Paint();
            this.v.setTextSize(this.aa);
            this.v.setAntiAlias(true);
            this.w = new Paint();
            this.w.setTextSize(this.aa);
            this.w.setAntiAlias(true);
            setUpUiColor(false);
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f18172a, false, 14273, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f18172a, false, 14273, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onSizeChanged(i2, i3, i4, i5);
        if (!(this.f18174c == getMeasuredHeight() && this.f18173b == getMeasuredWidth())) {
            this.f18173b = getMeasuredWidth();
            this.f18174c = getMeasuredHeight();
            a();
        }
    }

    public final void a(int i2, int i3, int i4, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), 0, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f18172a, false, 14268, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), 0, Byte.valueOf(z2)}, this, f18172a, false, 14268, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(i2, i3, 0, null, z2);
    }

    private void a(int i2, int i3, int i4, String str, boolean z2) {
        int i5 = i4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), null, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f18172a, false, 14269, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), null, Byte.valueOf(z2)}, this, f18172a, false, 14269, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.ag = i2;
        this.ah = i3;
        if (i5 > this.ag || i5 < this.ah) {
            this.H = this.ag;
        } else {
            this.H = i5;
        }
        this.af = this.ag - this.ah;
        this.I = z2;
        if (this.f18173b > 0 && this.f18174c > 0) {
            a();
        }
        invalidate();
        this.Q = null;
        if (this.R != null) {
            this.R.cancel();
            this.R = null;
        }
        this.S = 0.0f;
    }
}
