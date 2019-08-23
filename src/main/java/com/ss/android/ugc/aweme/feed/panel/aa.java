package com.ss.android.ugc.aweme.feed.panel;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.guide.d;
import com.ss.android.ugc.aweme.main.bt;
import java.util.Map;

public final class aa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45701a = null;

    /* renamed from: b  reason: collision with root package name */
    static final String f45702b = "aa";

    /* renamed from: c  reason: collision with root package name */
    final VerticalViewPager f45703c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f45704d;

    /* renamed from: e  reason: collision with root package name */
    final AccelerateDecelerateInterpolator f45705e = new AccelerateDecelerateInterpolator();

    /* renamed from: f  reason: collision with root package name */
    bt f45706f = new bt();
    public long g = -1;
    public boolean h = false;
    public Runnable i = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f45707a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f45707a, false, 41951, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f45707a, false, 41951, new Class[0], Void.TYPE);
            } else if (!d.d() && aa.this.a()) {
                aa.this.h = true;
                aa.this.f45704d.post(aa.this);
            }
        }
    };
    public Runnable j = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f45709a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f45709a, false, 41952, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f45709a, false, 41952, new Class[0], Void.TYPE);
            } else if (aa.this.f45706f.d(true)) {
                aa.this.f45706f.e(false);
                aa.this.f45704d.post(aa.this);
            }
        }
    };
    public Runnable k = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f45711a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f45711a, false, 41953, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f45711a, false, 41953, new Class[0], Void.TYPE);
                return;
            }
            aa.this.f45704d.post(aa.this);
        }
    };
    public float l = 0.35f;
    private ViewStub m;
    private View n;
    private int o;
    private float p;
    private int q;
    private long r;

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f45701a, false, 41947, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45701a, false, 41947, new Class[0], Void.TYPE);
            return;
        }
        this.p = 0.0f;
        this.q = 0;
        this.r = 0;
        if (this.n != null) {
            this.n.setAlpha(0.0f);
        }
    }

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f45701a, false, 41941, new Class[0], Boolean.TYPE)) {
            return this.f45706f.b(true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f45701a, false, 41941, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f45701a, false, 41948, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45701a, false, 41948, new Class[0], Void.TYPE);
            return;
        }
        this.f45704d.removeCallbacksAndMessages(null);
        c();
        if (this.f45703c.m) {
            try {
                this.f45703c.c();
                if (this.h) {
                    this.f45706f.c(false);
                    this.h = false;
                }
            } catch (Exception unused) {
            }
        }
        if (this.n != null) {
            this.n.setVisibility(8);
        }
        this.o = 0;
    }

    public final void run() {
        float f2;
        float f3;
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f45701a, false, 41949, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45701a, false, 41949, new Class[0], Void.TYPE);
        } else if (this.f45703c.getChildCount() > 0) {
            if (this.r == 0) {
                if (this.n == null) {
                    this.n = this.m.inflate();
                }
                if (PatchProxy.isSupport(new Object[0], this, f45701a, false, 41942, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f45701a, false, 41942, new Class[0], Void.TYPE);
                } else {
                    this.r = SystemClock.uptimeMillis();
                    if (PatchProxy.isSupport(new Object[0], this, f45701a, false, 41943, new Class[0], Integer.TYPE)) {
                        i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], this, f45701a, false, 41943, new Class[0], Integer.TYPE)).intValue();
                    } else {
                        i2 = (int) (((float) UIUtils.getScreenHeight(this.f45703c.getContext())) * this.l);
                    }
                    this.q = i2;
                    VerticalViewPager verticalViewPager = this.f45703c;
                    if (PatchProxy.isSupport(new Object[0], verticalViewPager, VerticalViewPager.f40481a, false, 33841, new Class[0], Boolean.TYPE)) {
                        ((Boolean) PatchProxy.accessDispatch(new Object[0], verticalViewPager, VerticalViewPager.f40481a, false, 33841, new Class[0], Boolean.TYPE)).booleanValue();
                    } else if (!verticalViewPager.i) {
                        verticalViewPager.m = true;
                        verticalViewPager.setScrollState(1);
                        verticalViewPager.k = 0.0f;
                        verticalViewPager.j = 0.0f;
                        if (verticalViewPager.l == null) {
                            verticalViewPager.l = VelocityTracker.obtain();
                        } else {
                            verticalViewPager.l.clear();
                        }
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                        verticalViewPager.l.addMovement(obtain);
                        obtain.recycle();
                        verticalViewPager.n = uptimeMillis;
                    }
                    this.f45704d.post(this);
                }
                if (a.a()) {
                    r.a("new_user_guide_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("guide_type", "slide").f34114b);
                    r.a("swipe_up_guide_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("type", PushConstants.PUSH_TYPE_THROUGH_MESSAGE).f34114b);
                }
                this.n.setVisibility(0);
            } else {
                long uptimeMillis2 = SystemClock.uptimeMillis() - this.r;
                if (uptimeMillis2 < 800) {
                    long j2 = this.r;
                    int i3 = this.q;
                    if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i3)}, this, f45701a, false, 41944, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i3)}, this, f45701a, false, 41944, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE);
                    } else {
                        if (this.f45703c.m) {
                            long uptimeMillis3 = SystemClock.uptimeMillis();
                            float f4 = this.p;
                            float interpolation = this.f45705e.getInterpolation((((float) (uptimeMillis3 - j2)) * 1.0f) / 800.0f) * ((float) i3);
                            this.p = interpolation;
                            VerticalViewPager verticalViewPager2 = this.f45703c;
                            float f5 = f4 - interpolation;
                            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f5)}, verticalViewPager2, VerticalViewPager.f40481a, false, 33843, new Class[]{Float.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f5)}, verticalViewPager2, VerticalViewPager.f40481a, false, 33843, new Class[]{Float.TYPE}, Void.TYPE);
                            } else if (!verticalViewPager2.m) {
                                throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
                            } else if (verticalViewPager2.f40485e != null) {
                                try {
                                    verticalViewPager2.j += f5;
                                    float scrollY = ((float) verticalViewPager2.getScrollY()) - f5;
                                    float clientHeight = (float) verticalViewPager2.getClientHeight();
                                    float f6 = verticalViewPager2.g * clientHeight;
                                    float f7 = verticalViewPager2.h * clientHeight;
                                    VerticalViewPager.c cVar = verticalViewPager2.f40484d.get(0);
                                    VerticalViewPager.c cVar2 = verticalViewPager2.f40484d.get(verticalViewPager2.f40484d.size() - 1);
                                    if (cVar.f40496b != 0) {
                                        f2 = cVar.f40499e * clientHeight;
                                    } else {
                                        f2 = f6;
                                    }
                                    if (cVar2.f40496b != verticalViewPager2.f40485e.getCount() - 1) {
                                        f3 = cVar2.f40499e * clientHeight;
                                    } else {
                                        f3 = f7;
                                    }
                                    if (scrollY >= f2) {
                                        if (scrollY > f3) {
                                            f2 = f3;
                                        } else {
                                            f2 = scrollY;
                                        }
                                    }
                                    int i4 = (int) f2;
                                    verticalViewPager2.j += f2 - ((float) i4);
                                    verticalViewPager2.scrollTo(verticalViewPager2.getScrollX(), i4);
                                    verticalViewPager2.a(i4);
                                    MotionEvent obtain2 = MotionEvent.obtain(verticalViewPager2.n, SystemClock.uptimeMillis(), 2, 0.0f, verticalViewPager2.j, 0);
                                    if (verticalViewPager2.l == null) {
                                        verticalViewPager2.l = VelocityTracker.obtain();
                                    }
                                    if (verticalViewPager2.l != null) {
                                        verticalViewPager2.l.addMovement(obtain2);
                                        obtain2.recycle();
                                    }
                                } catch (Exception e2) {
                                    com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
                                    ExceptionMonitor.ensureNotReachHere((Throwable) e2, "VerticalViewPager");
                                }
                            }
                        }
                        this.f45704d.post(this);
                    }
                } else if (uptimeMillis2 < 1300) {
                    if (PatchProxy.isSupport(new Object[0], this, f45701a, false, 41945, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f45701a, false, 41945, new Class[0], Void.TYPE);
                    } else {
                        this.f45704d.post(this);
                    }
                } else {
                    this.n.setVisibility(8);
                    if (PatchProxy.isSupport(new Object[0], this, f45701a, false, 41946, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f45701a, false, 41946, new Class[0], Void.TYPE);
                    } else {
                        if (this.f45703c.m) {
                            this.f45703c.c();
                        }
                        if (this.o <= 0) {
                            c();
                            this.o++;
                            this.f45704d.postDelayed(this, 2000);
                        } else if (this.h) {
                            this.f45706f.c(false);
                            this.h = false;
                        }
                    }
                }
            }
            long uptimeMillis4 = SystemClock.uptimeMillis() - this.r;
            if (uptimeMillis4 <= 300) {
                this.n.setAlpha((((float) uptimeMillis4) * 1.0f) / 300.0f);
                return;
            }
            if (uptimeMillis4 >= 1000 && uptimeMillis4 <= 1300) {
                this.n.setAlpha((((float) (1300 - uptimeMillis4)) * 1.0f) / 300.0f);
            }
        }
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f45701a, false, 41950, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f45701a, false, 41950, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.n != null) {
            this.n.setTranslationY(f2);
        }
    }

    public aa(VerticalViewPager verticalViewPager, ViewStub viewStub) {
        this.f45703c = verticalViewPager;
        this.f45704d = new Handler(Looper.getMainLooper());
        this.m = viewStub;
    }
}
