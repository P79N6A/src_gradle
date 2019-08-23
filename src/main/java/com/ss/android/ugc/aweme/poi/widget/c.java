package com.ss.android.ugc.aweme.poi.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.b.a.d;
import com.ss.android.ugc.aweme.base.utils.p;

public class c extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61054a;

    /* renamed from: b  reason: collision with root package name */
    public static int f61055b;

    /* renamed from: c  reason: collision with root package name */
    public BubbleLayout f61056c;

    /* renamed from: d  reason: collision with root package name */
    public Activity f61057d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f61058e;

    /* renamed from: f  reason: collision with root package name */
    public int f61059f;
    public int g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public long o;
    public AnimatorSet p;
    public Runnable q;
    public long r;
    public long s;
    public d<Point> t;
    public a u;
    private int v;
    private int w;
    private boolean x;

    public interface a {
        void a();
    }

    public static int d(int i2) {
        if (i2 == 3) {
            return 2;
        }
        if (i2 != 5) {
            if (i2 == 48) {
                return 3;
            }
            if (i2 == 80) {
                return 0;
            }
        }
        return 1;
    }

    public final void a(View view, int i2, int i3) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f61054a, false, 66942, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f61054a, false, 66942, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.i = i3;
        this.v = i2;
        a(view, 80, true, 0.0f);
    }

    public final void a(View view, int i2, boolean z, float f2) {
        float f3;
        View view2 = view;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i2), (byte) 1, Float.valueOf(0.0f)}, this, f61054a, false, 66944, new Class[]{View.class, Integer.TYPE, Boolean.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i2), (byte) 1, Float.valueOf(0.0f)}, this, f61054a, false, 66944, new Class[]{View.class, Integer.TYPE, Boolean.TYPE, Float.TYPE}, Void.TYPE);
        } else if (!this.f61057d.isFinishing() && view2 != null && view.getWindowToken() != null) {
            getContentView().removeCallbacks(this.q);
            this.l = i3;
            if (!isShowing()) {
                int d2 = d(i2);
                if (this.f61059f == 0 || this.g == 0) {
                    getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
                } else {
                    getContentView().measure(View.MeasureSpec.makeMeasureSpec(this.f61059f, 1073741824), View.MeasureSpec.makeMeasureSpec(this.g, 1073741824));
                }
                if (i3 == 80 || i3 == 48) {
                    f3 = (float) (c() / 2);
                } else {
                    f3 = (float) (g() / 2);
                }
                this.f61056c.a(d2, f3 + ((float) this.v));
                int[] iArr = new int[2];
                if (this.t != null) {
                    Point point = (Point) this.t.a();
                    iArr[0] = point.x;
                    iArr[1] = point.y;
                } else {
                    view2.getLocationOnScreen(iArr);
                }
                a();
                if (i3 == 3) {
                    showAtLocation(view2, 0, ((iArr[0] + this.i) - c()) - f61055b, (iArr[1] + this.j) - ((view.getMeasuredHeight() - g()) / 2));
                    a(true, i3);
                } else if (i3 == 5) {
                    showAtLocation(view2, 0, iArr[0] + this.i + view.getWidth() + f61055b, (iArr[1] + this.j) - ((view.getMeasuredHeight() - g()) / 2));
                    a(true, i3);
                } else if (i3 == 48) {
                    showAtLocation(view2, 0, iArr[0] + this.i + ((view.getMeasuredWidth() - c()) / 2), ((iArr[1] - g()) + this.j) - f61055b);
                    a(true, i3);
                } else if (i3 == 80) {
                    showAsDropDown(view2, this.i + ((view.getMeasuredWidth() - c()) / 2), f61055b + this.j);
                    a(true, i3);
                }
                this.k = false;
                if (this.o > 0) {
                    getContentView().postDelayed(this.q, this.o);
                }
                return;
            }
            d.a(this);
        }
    }

    public final void a(final boolean z, final int i2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2)}, this, f61054a, false, 66947, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i2)}, this, f61054a, false, 66947, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        final BubbleLayout bubbleLayout = this.f61056c;
        if (!z) {
            this.k = true;
        }
        if (this.p == null) {
            this.p = new AnimatorSet();
        } else {
            this.p.removeAllListeners();
            this.p.cancel();
        }
        bubbleLayout.post(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61064a;

            public final void run() {
                int i;
                int i2;
                float f2;
                float f3;
                float f4;
                long j;
                if (PatchProxy.isSupport(new Object[0], this, f61064a, false, 66962, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f61064a, false, 66962, new Class[0], Void.TYPE);
                } else if (c.this.p != null) {
                    int i3 = i2;
                    if (i3 == 3) {
                        i2 = (int) (bubbleLayout.getX() + ((float) bubbleLayout.getMeasuredWidth()));
                        i = (int) (bubbleLayout.getY() + c.this.f61056c.getBubbleOffset());
                    } else if (i3 == 5) {
                        i2 = (int) bubbleLayout.getX();
                        i = (int) (bubbleLayout.getY() + c.this.f61056c.getBubbleOffset());
                    } else if (i3 == 48) {
                        i2 = (int) (bubbleLayout.getX() + c.this.f61056c.getBubbleOffset());
                        i = (int) (bubbleLayout.getY() + ((float) bubbleLayout.getMeasuredHeight()));
                    } else if (i3 != 80) {
                        i2 = 0;
                        i = 0;
                    } else {
                        i2 = (int) (bubbleLayout.getX() + c.this.f61056c.getBubbleOffset());
                        i = (int) bubbleLayout.getY();
                    }
                    bubbleLayout.setPivotY((float) i);
                    bubbleLayout.setPivotX((float) i2);
                    View view = bubbleLayout;
                    float[] fArr = new float[2];
                    float f5 = 0.0f;
                    if (z) {
                        f2 = 0.0f;
                    } else {
                        f2 = 1.0f;
                    }
                    fArr[0] = f2;
                    if (z) {
                        f3 = 1.0f;
                    } else {
                        f3 = 0.0f;
                    }
                    fArr[1] = f3;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", fArr);
                    View view2 = bubbleLayout;
                    float[] fArr2 = new float[2];
                    if (z) {
                        f4 = 0.0f;
                    } else {
                        f4 = 1.0f;
                    }
                    fArr2[0] = f4;
                    if (z) {
                        f5 = 1.0f;
                    }
                    fArr2[1] = f5;
                    c.this.p.play(ofFloat).with(ObjectAnimator.ofFloat(view2, "scaleY", fArr2));
                    AnimatorSet animatorSet = c.this.p;
                    if (z) {
                        j = c.this.r;
                    } else {
                        j = c.this.s;
                    }
                    animatorSet.setDuration(j);
                    if (c.this.n) {
                        c.this.p.setInterpolator(new OvershootInterpolator(1.0f));
                    }
                    c.this.p.addListener(new AnimatorListenerAdapter() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f61069a;

                        public final void onAnimationEnd(Animator animator) {
                            if (PatchProxy.isSupport(new Object[]{animator}, this, f61069a, false, 66963, new Class[]{Animator.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{animator}, this, f61069a, false, 66963, new Class[]{Animator.class}, Void.TYPE);
                                return;
                            }
                            if (!z) {
                                bubbleLayout.setVisibility(8);
                                c.this.d();
                            }
                        }

                        public final void onAnimationStart(Animator animator) {
                            if (PatchProxy.isSupport(new Object[]{animator}, this, f61069a, false, 66964, new Class[]{Animator.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{animator}, this, f61069a, false, 66964, new Class[]{Animator.class}, Void.TYPE);
                                return;
                            }
                            super.onAnimationStart(animator);
                            if (z) {
                                bubbleLayout.setVisibility(0);
                            }
                        }
                    });
                    c.this.p.start();
                }
            }
        });
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f61054a, false, 66957, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f61054a, false, 66957, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.x = false;
        if (this.f61056c != null) {
            this.f61056c.setNeedPath(false);
        }
    }

    private int g() {
        if (!PatchProxy.isSupport(new Object[0], this, f61054a, false, 66950, new Class[0], Integer.TYPE)) {
            return getContentView().getMeasuredHeight();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f61054a, false, 66950, new Class[0], Integer.TYPE)).intValue();
    }

    public final int c() {
        if (!PatchProxy.isSupport(new Object[0], this, f61054a, false, 66951, new Class[0], Integer.TYPE)) {
            return getContentView().getMeasuredWidth();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f61054a, false, 66951, new Class[0], Integer.TYPE)).intValue();
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f61054a, false, 66948, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61054a, false, 66948, new Class[0], Void.TYPE);
            return;
        }
        if (!this.k) {
            a(false, this.l);
            getContentView().removeCallbacks(this.q);
            this.i = 0;
            this.j = 0;
        }
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f61054a, false, 66932, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61054a, false, 66932, new Class[0], Void.TYPE);
        } else if (this.h) {
            if (Build.VERSION.SDK_INT < 19) {
                getContentView().setSystemUiVisibility(8);
                return;
            }
            if (Build.VERSION.SDK_INT >= 19) {
                getContentView().setSystemUiVisibility(4102);
            }
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f61054a, false, 66949, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61054a, false, 66949, new Class[0], Void.TYPE);
            return;
        }
        if (!this.k) {
            this.f61056c.setVisibility(8);
            d();
            getContentView().removeCallbacks(this.q);
            this.i = 0;
            this.j = 0;
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f61054a, false, 66952, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61054a, false, 66952, new Class[0], Void.TYPE);
            return;
        }
        if (this.p != null) {
            this.p.removeAllListeners();
            this.p.cancel();
            this.p = null;
        }
        if (!this.f61057d.isFinishing() && isShowing()) {
            try {
                d.a(this);
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
            }
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f61054a, false, 66954, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61054a, false, 66954, new Class[0], Void.TYPE);
        } else if (this.f61059f == 0 || this.g == 0) {
            getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
        } else {
            getContentView().measure(View.MeasureSpec.makeMeasureSpec(this.f61059f, 1073741824), View.MeasureSpec.makeMeasureSpec(this.g, 1073741824));
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f61054a, false, 66955, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61054a, false, 66955, new Class[0], Void.TYPE);
        } else if (this.f61059f == 0 || this.g == 0) {
            getContentView().measure(View.MeasureSpec.makeMeasureSpec(p.b(getContentView().getContext()), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(p.a(getContentView().getContext()), Integer.MIN_VALUE));
        } else {
            getContentView().measure(View.MeasureSpec.makeMeasureSpec(this.f61059f, 1073741824), View.MeasureSpec.makeMeasureSpec(this.g, 1073741824));
        }
    }

    public c(Activity activity) {
        this(activity, true);
    }

    public final void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f61054a, false, 66937, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f61054a, false, 66937, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f61058e.setText(i2);
    }

    public final void a(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f61054a, false, 66934, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f61054a, false, 66934, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.g = i3;
        setHeight(i2);
        BubbleLayout.i = i3;
    }

    public final void b(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f61054a, false, 66935, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f61054a, false, 66935, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f61059f = i3;
        setWidth(i2);
        BubbleLayout.h = i3;
    }

    public final void e(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f61054a, false, 66956, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f61054a, false, 66956, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.w = i2;
        if (this.f61056c != null) {
            this.f61056c.setBgColor(i2);
        }
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f61054a, false, 66931, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f61054a, false, 66931, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f61056c = new BubbleLayout(this.f61057d);
        this.f61056c.setBackgroundColor(0);
        this.f61056c.addView(view);
        this.f61056c.setGravity(17);
        this.f61056c.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        this.f61056c.setVisibility(8);
        if (this.w != 0) {
            this.f61056c.setBgColor(this.w);
        }
        this.f61056c.setNeedPath(this.x);
        this.f61056c.setNeedPressFade(this.m);
        this.f61056c.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61062a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f61062a, false, 66961, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f61062a, false, 66961, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (c.this.u != null) {
                    c.this.u.a();
                }
                c.this.dismiss();
            }
        });
        setContentView(this.f61056c);
    }

    public final void b(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f61054a, false, 66945, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f61054a, false, 66945, new Class[]{View.class}, Void.TYPE);
        } else if (!this.f61057d.isFinishing() && view != null && view.getWindowToken() != null) {
            float dip2Px = UIUtils.dip2Px(this.f61057d, 36.0f);
            float dip2Px2 = UIUtils.dip2Px(this.f61057d, 64.0f);
            float dip2Px3 = UIUtils.dip2Px(this.f61057d, 16.0f);
            getContentView().removeCallbacks(this.q);
            if (!isShowing()) {
                int[] iArr = new int[2];
                if (this.t != null) {
                    Point point = (Point) this.t.a();
                    iArr[0] = point.x;
                    iArr[1] = point.y;
                } else {
                    view.getLocationOnScreen(iArr);
                }
                this.l = 48;
                this.v = -((int) UIUtils.dip2Px(view.getContext(), 3.5f));
                if (((float) (iArr[1] - g())) - dip2Px < dip2Px2) {
                    this.l = 80;
                }
                if (((float) iArr[0]) - (((float) c()) / 2.0f) < dip2Px3) {
                    this.i = (int) (dip2Px3 - (((float) iArr[0]) - (((float) c()) / 2.0f)));
                }
                if (((float) p.b(this.f61057d)) - (((float) iArr[0]) + (((float) c()) / 2.0f)) < dip2Px3) {
                    this.i = (int) ((((float) p.b(this.f61057d)) - (((float) iArr[0]) + (((float) c()) / 2.0f))) - dip2Px3);
                }
                int d2 = d(this.l);
                float c2 = ((float) c()) / 2.0f;
                this.f61056c.a(d2, (((float) this.v) + c2) - ((float) this.i));
                a();
                int i2 = this.l;
                if (i2 == 48) {
                    showAtLocation(view, 0, (int) (((float) (iArr[0] + this.i)) - c2), (int) ((((float) (iArr[1] + this.j)) - dip2Px) - ((float) g())));
                    a(true, this.l);
                } else if (i2 == 80) {
                    showAtLocation(view, 0, (int) (((float) (iArr[0] + this.i)) - c2), (int) (((float) (iArr[1] + this.j)) + dip2Px));
                    a(true, this.l);
                }
                this.k = false;
                if (this.o > 0) {
                    getContentView().postDelayed(this.q, this.o);
                }
                return;
            }
            d.a(this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Activity activity, boolean z) {
        super(activity);
        float f2;
        this.x = true;
        this.o = 7000;
        this.q = new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61060a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f61060a, false, 66960, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f61060a, false, 66960, new Class[0], Void.TYPE);
                    return;
                }
                c.this.a(false, c.this.l);
            }
        };
        this.r = 800;
        this.s = 200;
        this.f61057d = activity;
        Activity activity2 = this.f61057d;
        if (PatchProxy.isSupport(new Object[]{activity2, Float.valueOf(3.0f)}, null, f61054a, true, 66953, new Class[]{Context.class, Float.TYPE}, Float.TYPE)) {
            f2 = ((Float) PatchProxy.accessDispatch(new Object[]{activity2, Float.valueOf(3.0f)}, null, f61054a, true, 66953, new Class[]{Context.class, Float.TYPE}, Float.TYPE)).floatValue();
        } else {
            f2 = (activity2.getResources().getDisplayMetrics().density * 3.0f) + 0.5f;
        }
        f61055b = (int) f2;
        setWidth(-2);
        setHeight(-2);
        setFocusable(false);
        setOutsideTouchable(false);
        setClippingEnabled(false);
        setBackgroundDrawable(new ColorDrawable(0));
        setInputMethodMode(1);
        setSoftInputMode(16);
        if (z) {
            if (PatchProxy.isSupport(new Object[0], this, f61054a, false, 66930, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f61054a, false, 66930, new Class[0], Void.TYPE);
                return;
            }
            this.f61058e = new DmtTextView(this.f61057d);
            this.f61058e.setTextColor(this.f61057d.getResources().getColor(C0906R.color.a08));
            this.f61058e.setTextSize(13.0f);
            this.f61058e.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            this.f61058e.setMaxLines(2);
            this.f61058e.setGravity(17);
            a((View) this.f61058e);
            this.h = true;
            getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f61054a, false, 66933, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f61054a, false, 66933, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f61059f = i2;
        this.g = i3;
        setWidth(i2);
        setHeight(i3);
        BubbleLayout.h = i2;
        BubbleLayout.i = i3;
    }

    public final void b(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f61054a, false, 66938, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f61054a, false, 66938, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f61058e.setTextSize(i2, (float) i3);
    }

    public final void a(View view, int i2) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, 48}, this, f61054a, false, 66941, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, 48}, this, f61054a, false, 66941, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(view2, 48, true, 0.0f);
    }

    public void showAtLocation(View view, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f61054a, false, 66946, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f61054a, false, 66946, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        try {
            super.showAtLocation(view, i2, i3, i4);
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
    }
}
