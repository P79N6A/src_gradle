package com.bytedance.android.livesdk.floatwindow;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.android.livesdk.floatwindow.h;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class g extends b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14547a;

    /* renamed from: b  reason: collision with root package name */
    public f f14548b;

    /* renamed from: c  reason: collision with root package name */
    public h.a f14549c;

    /* renamed from: d  reason: collision with root package name */
    public ValueAnimator f14550d;

    /* renamed from: e  reason: collision with root package name */
    public float f14551e;

    /* renamed from: f  reason: collision with root package name */
    public float f14552f;
    public float g;
    public float h;
    public boolean i;
    public int j;
    private FloatWindowLifecycle k;
    private TimeInterpolator l;
    private boolean m = true;
    private boolean n;

    public final boolean c() {
        return this.n;
    }

    private g() {
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f14547a, false, 9076, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14547a, false, 9076, new Class[0], Void.TYPE);
        } else if (!this.m && this.n) {
            d().setVisibility(4);
            this.n = false;
        }
    }

    public final View d() {
        if (PatchProxy.isSupport(new Object[0], this, f14547a, false, 9078, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f14547a, false, 9078, new Class[0], View.class);
        }
        this.j = ViewConfiguration.get(this.f14549c.f14572b).getScaledTouchSlop();
        return this.f14549c.f14573c;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f14547a, false, 9075, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14547a, false, 9075, new Class[0], Void.TYPE);
        } else if (this.m) {
            f fVar = this.f14548b;
            if (PatchProxy.isSupport(new Object[0], fVar, f.f14541a, false, 9066, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], fVar, f.f14541a, false, 9066, new Class[0], Void.TYPE);
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    fVar.f14543c.type = 2038;
                } else {
                    fVar.f14543c.type = 2002;
                }
                fVar.f14542b.addView(fVar.f14544d, fVar.f14543c);
            }
            this.m = false;
            this.n = true;
        } else if (!this.n) {
            d().setVisibility(0);
            this.n = true;
        }
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f14547a, false, 9077, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14547a, false, 9077, new Class[0], Void.TYPE);
            return;
        }
        String str = this.f14549c.q;
        if (PatchProxy.isSupport(new Object[]{str}, null, h.f14567a, true, 9090, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, null, h.f14567a, true, 9090, new Class[]{String.class}, Void.TYPE);
        } else {
            h.f14568b.remove(str);
        }
        this.f14548b.dismiss();
        this.n = false;
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f14547a, false, 9073, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14547a, false, 9073, new Class[0], Void.TYPE);
            return;
        }
        if (this.f14549c.p == null) {
            if (this.l == null) {
                this.l = new DecelerateInterpolator();
            }
            this.f14549c.p = this.l;
        }
        this.f14550d.setInterpolator(this.f14549c.p);
        this.f14550d.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f14565a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f14565a, false, 9088, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f14565a, false, 9088, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                g.this.f14550d.removeAllUpdateListeners();
                g.this.f14550d.removeAllListeners();
                g.this.f14550d = null;
                if (g.this.f14549c.t != null) {
                    g.this.f14549c.t.a();
                }
            }
        });
        this.f14550d.setDuration(this.f14549c.o).start();
    }

    g(h.a aVar) {
        this.f14549c = aVar;
        this.f14548b = new f(aVar.f14572b, aVar.s);
        if (PatchProxy.isSupport(new Object[0], this, f14547a, false, 9072, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14547a, false, 9072, new Class[0], Void.TYPE);
        } else {
            d().setOnTouchListener(new View.OnTouchListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f14555a;

                /* renamed from: b  reason: collision with root package name */
                float f14556b;

                /* renamed from: c  reason: collision with root package name */
                float f14557c;

                /* renamed from: d  reason: collision with root package name */
                float f14558d;

                /* renamed from: e  reason: collision with root package name */
                float f14559e;

                /* renamed from: f  reason: collision with root package name */
                int f14560f;
                int g;

                @SuppressLint({"ClickableViewAccessibility"})
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean z;
                    int i;
                    if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f14555a, false, 9085, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f14555a, false, 9085, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
                    }
                    switch (motionEvent.getAction()) {
                        case 0:
                            g.this.f14551e = motionEvent.getRawX();
                            g.this.f14552f = motionEvent.getRawY();
                            this.f14556b = motionEvent.getRawX();
                            this.f14557c = motionEvent.getRawY();
                            g gVar = g.this;
                            if (!PatchProxy.isSupport(new Object[0], gVar, g.f14547a, false, 9074, new Class[0], Void.TYPE)) {
                                if (gVar.f14550d != null && gVar.f14550d.isRunning()) {
                                    gVar.f14550d.cancel();
                                    break;
                                }
                            } else {
                                PatchProxy.accessDispatch(new Object[0], gVar, g.f14547a, false, 9074, new Class[0], Void.TYPE);
                                break;
                            }
                        case 1:
                            g.this.g = motionEvent.getRawX();
                            g.this.h = motionEvent.getRawY();
                            g gVar2 = g.this;
                            if (Math.abs(g.this.g - g.this.f14551e) > ((float) g.this.j) || Math.abs(g.this.h - g.this.f14552f) > ((float) g.this.j)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            gVar2.i = z;
                            switch (g.this.f14549c.l) {
                                case 3:
                                    int a2 = g.this.f14548b.a();
                                    if ((a2 * 2) + view.getWidth() > UIUtils.getScreenWidth(g.this.f14549c.f14572b)) {
                                        i = (UIUtils.getScreenWidth(g.this.f14549c.f14572b) - view.getWidth()) - g.this.f14549c.n;
                                    } else {
                                        i = g.this.f14549c.m;
                                    }
                                    g.this.f14550d = ObjectAnimator.ofInt(new int[]{a2, i});
                                    g.this.f14550d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f14561a;

                                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f14561a, false, 9086, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f14561a, false, 9086, new Class[]{ValueAnimator.class}, Void.TYPE);
                                                return;
                                            }
                                            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                            g.this.f14548b.a(intValue);
                                            if (g.this.f14549c.t != null) {
                                                g.this.f14549c.t.a(intValue, (int) g.this.h);
                                            }
                                        }
                                    });
                                    g.this.e();
                                    break;
                                case 4:
                                    PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt("x", new int[]{g.this.f14548b.a(), g.this.f14549c.h});
                                    PropertyValuesHolder ofInt2 = PropertyValuesHolder.ofInt("y", new int[]{g.this.f14548b.b(), g.this.f14549c.i});
                                    g.this.f14550d = ObjectAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{ofInt, ofInt2});
                                    g.this.f14550d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f14563a;

                                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f14563a, false, 9087, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f14563a, false, 9087, new Class[]{ValueAnimator.class}, Void.TYPE);
                                                return;
                                            }
                                            int intValue = ((Integer) valueAnimator.getAnimatedValue("x")).intValue();
                                            int intValue2 = ((Integer) valueAnimator.getAnimatedValue("y")).intValue();
                                            g.this.f14548b.a(intValue, intValue2);
                                            if (g.this.f14549c.t != null) {
                                                g.this.f14549c.t.a(intValue, intValue2);
                                            }
                                        }
                                    });
                                    g.this.e();
                                    break;
                                default:
                                    if (!g.this.i && g.this.f14549c.t != null) {
                                        g.this.f14549c.t.b();
                                    }
                                    if (g.this.i && g.this.f14549c.t != null) {
                                        g.this.f14549c.t.a();
                                        break;
                                    }
                            }
                            break;
                        case 2:
                            this.f14558d = motionEvent.getRawX() - this.f14556b;
                            this.f14559e = motionEvent.getRawY() - this.f14557c;
                            this.f14560f = (int) (((float) g.this.f14548b.a()) + this.f14558d);
                            this.g = (int) (((float) g.this.f14548b.b()) + this.f14559e);
                            g.this.f14548b.a(this.f14560f, this.g);
                            if (g.this.f14549c.t != null) {
                                g.this.f14549c.t.a(this.f14560f, this.g);
                            }
                            this.f14556b = motionEvent.getRawX();
                            this.f14557c = motionEvent.getRawY();
                            break;
                    }
                    return g.this.i;
                }
            });
        }
        f fVar = this.f14548b;
        int i2 = aVar.f14575e;
        int i3 = aVar.f14576f;
        fVar.f14543c.width = i2;
        fVar.f14543c.height = i3;
        f fVar2 = this.f14548b;
        int i4 = aVar.g;
        int i5 = aVar.h;
        int i6 = aVar.i;
        fVar2.f14543c.gravity = i4;
        fVar2.f14543c.x = i5;
        fVar2.f14545e = i5;
        fVar2.f14543c.y = i6;
        fVar2.f14546f = i6;
        this.f14548b.f14544d = aVar.f14573c;
        this.k = new FloatWindowLifecycle(this.f14549c.f14572b, this.f14549c.j, this.f14549c.k, new c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f14553a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f14553a, false, 9084, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f14553a, false, 9084, new Class[0], Void.TYPE);
                    return;
                }
                if (!g.this.f14549c.r) {
                    g.this.b();
                }
            }
        });
    }
}
