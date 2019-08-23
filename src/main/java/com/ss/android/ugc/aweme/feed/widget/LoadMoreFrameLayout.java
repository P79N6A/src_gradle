package com.ss.android.ugc.aweme.feed.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.adapter.r;

public class LoadMoreFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46990a;

    /* renamed from: b  reason: collision with root package name */
    public r f46991b;

    /* renamed from: c  reason: collision with root package name */
    public int f46992c;

    /* renamed from: d  reason: collision with root package name */
    public int f46993d;

    /* renamed from: e  reason: collision with root package name */
    private DmtStatusView f46994e;

    /* renamed from: f  reason: collision with root package name */
    private VerticalViewPager f46995f;
    private SwipeRefreshLayout g;
    private int h;
    private boolean i;
    private float j;
    private float k;
    private int l;
    private ValueAnimator m;
    private long n;
    private String o;
    private boolean p;
    private Drawable q;
    private View r;
    private a s;

    public interface a {
        void a(int i);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f46990a, false, 43694, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46990a, false, 43694, new Class[0], Void.TYPE);
            return;
        }
        DmtStatusView a2 = a(true);
        if (a2 != null) {
            a2.d();
        }
        this.f46992c = 0;
        if (this.n == -1) {
            this.n = System.currentTimeMillis();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f46990a, false, 43695, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46990a, false, 43695, new Class[0], Void.TYPE);
            return;
        }
        DmtStatusView a2 = a(true);
        if (a2 != null) {
            a2.f();
        }
        this.f46992c = 2;
        d();
    }

    public int getViewPagerMarginTop() {
        if (PatchProxy.isSupport(new Object[0], this, f46990a, false, 43703, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f46990a, false, 43703, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f46995f == null) {
            return 0;
        } else {
            return ((ViewGroup.MarginLayoutParams) this.f46995f.getLayoutParams()).topMargin;
        }
    }

    public void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f46990a, false, 43690, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46990a, false, 43690, new Class[0], Void.TYPE);
            return;
        }
        try {
            super.onFinishInflate();
            this.p = true;
        } catch (Exception unused) {
        }
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f46990a, false, 43700, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46990a, false, 43700, new Class[0], Void.TYPE);
            return;
        }
        this.m = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        final int viewPagerMarginTop = getViewPagerMarginTop();
        this.m.setDuration((long) ((viewPagerMarginTop * -200) / this.l));
        this.m.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46998a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i;
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f46998a, false, 43707, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f46998a, false, 43707, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                float animatedFraction = valueAnimator.getAnimatedFraction();
                int viewPagerMarginTop = LoadMoreFrameLayout.this.getViewPagerMarginTop();
                LoadMoreFrameLayout loadMoreFrameLayout = LoadMoreFrameLayout.this;
                if (animatedFraction == 1.0f) {
                    i = -viewPagerMarginTop;
                } else {
                    double pow = 1.0d - Math.pow((double) animatedFraction, 3.0d);
                    double d2 = (double) viewPagerMarginTop;
                    Double.isNaN(d2);
                    double d3 = pow * d2;
                    double viewPagerMarginTop2 = (double) LoadMoreFrameLayout.this.getViewPagerMarginTop();
                    Double.isNaN(viewPagerMarginTop2);
                    i = (int) (d3 - viewPagerMarginTop2);
                }
                loadMoreFrameLayout.setViewPagerMarginTopByDelta(i);
            }
        });
        this.m.start();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f46990a, false, 43696, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46990a, false, 43696, new Class[0], Void.TYPE);
            return;
        }
        DmtStatusView a2 = a(true);
        if (a2 != null) {
            a2.e();
        }
        this.f46992c = 1;
        if (this.f46995f != null) {
            e();
        }
        if (this.n != -1 && !TextUtils.isEmpty(this.o)) {
            n.b("aweme_feed_load_more_duration", this.o, (float) (System.currentTimeMillis() - this.n));
            this.n = -1;
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f46990a, false, 43697, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46990a, false, 43697, new Class[0], Void.TYPE);
            return;
        }
        DmtStatusView a2 = a(false);
        if (a2 != null) {
            a2.b();
        }
        this.f46992c = -1;
        if (this.f46995f != null) {
            e();
        }
        if (this.n != -1 && !TextUtils.isEmpty(this.o)) {
            n.b("aweme_feed_load_more_duration", this.o, (float) (System.currentTimeMillis() - this.n));
            this.n = -1;
        }
    }

    public void setLabel(String str) {
        this.o = str;
    }

    public void setLoadMoreListener(r rVar) {
        this.f46991b = rVar;
    }

    public void setOnScrolledListener(a aVar) {
        this.s = aVar;
    }

    public LoadMoreFrameLayout(Context context) {
        this(context, null);
    }

    public void setLoadMoreEmptyView(View view) {
        this.r = view;
        this.f46994e = null;
    }

    public void setBottomViewBackground(Drawable drawable) {
        if (PatchProxy.isSupport(new Object[]{drawable}, this, f46990a, false, 43702, new Class[]{Drawable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable}, this, f46990a, false, 43702, new Class[]{Drawable.class}, Void.TYPE);
            return;
        }
        DmtStatusView a2 = a(false);
        if (a2 != null) {
            a2.setBackgroundDrawable(drawable);
        } else {
            this.q = drawable;
        }
    }

    public void setViewPagerMarginTopByDelta(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f46990a, false, 43704, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f46990a, false, 43704, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.f46995f != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f46995f.getLayoutParams();
            marginLayoutParams.topMargin += i2;
            marginLayoutParams.bottomMargin = -marginLayoutParams.topMargin;
            if (this.s != null) {
                this.s.a(marginLayoutParams.topMargin);
            }
            this.f46995f.setLayoutParams(marginLayoutParams);
        }
    }

    public DmtStatusView a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f46990a, false, 43691, new Class[]{Boolean.TYPE}, DmtStatusView.class)) {
            return (DmtStatusView) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f46990a, false, 43691, new Class[]{Boolean.TYPE}, DmtStatusView.class);
        }
        if (this.f46994e == null && z && this.p) {
            try {
                this.f46994e = new DmtStatusView(getContext());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, u.a(60.0d));
                layoutParams.gravity = 80;
                layoutParams.setMargins(0, 0, 0, u.a(49.0d));
                addView(this.f46994e, 0, layoutParams);
                if (this.r == null) {
                    TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C0906R.layout.aqm, null);
                    textView.setGravity(17);
                    this.r = textView;
                }
                this.f46994e.setBuilder(DmtStatusView.a.a(getContext()).a((int) C0906R.string.b6x, (View.OnClickListener) new View.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f46996a;

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f46996a, false, 43706, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f46996a, false, 43706, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ClickInstrumentation.onClick(view);
                        if (LoadMoreFrameLayout.this.f46991b != null) {
                            LoadMoreFrameLayout.this.f46991b.w_();
                        }
                    }
                }).b(this.r));
                if (this.q != null) {
                    this.f46994e.setBackgroundDrawable(this.q);
                }
            } catch (Exception unused) {
                this.f46994e = null;
                this.q = null;
            }
        }
        return this.f46994e;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f46990a, false, 43692, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f46990a, false, 43692, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        DmtStatusView a2 = a(true);
        if (a2 == null || this.f46995f == null || this.f46995f.getAdapter() == null || this.f46995f.getAdapter().getCount() == 0 || this.f46995f.getAdapter().getCount() - 1 != this.f46995f.getCurrentItem() || this.f46995f.q || (this.g != null && this.g.f34835c)) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.i = false;
                this.j = motionEvent.getY();
                this.k = this.j;
                if (a2.c()) {
                    this.f46992c = -1;
                    break;
                }
                break;
            case 1:
            case 3:
                this.i = false;
                break;
            case 2:
                float y = motionEvent.getY();
                if (this.j - y <= ((float) this.h) || this.i) {
                    if (y - this.j > ((float) this.h) && !this.i && this.f46995f.getTop() < 0) {
                        this.i = true;
                        if (this.m != null) {
                            this.m.cancel();
                            break;
                        }
                    }
                } else {
                    this.i = true;
                    if (this.m != null) {
                        this.m.cancel();
                        break;
                    }
                }
                break;
        }
        return this.i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0131, code lost:
        r9.i = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f46990a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r3 = 0
            r4 = 43693(0xaaad, float:6.1227E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0039
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f46990a
            r3 = 0
            r4 = 43693(0xaaad, float:6.1227E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0039:
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = r9.a(r7)
            if (r0 == 0) goto L_0x013b
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager r1 = r9.f46995f
            if (r1 == 0) goto L_0x013b
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager r1 = r9.f46995f
            android.support.v4.view.PagerAdapter r1 = r1.getAdapter()
            if (r1 == 0) goto L_0x013b
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager r1 = r9.f46995f
            android.support.v4.view.PagerAdapter r1 = r1.getAdapter()
            int r1 = r1.getCount()
            if (r1 == 0) goto L_0x013b
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager r1 = r9.f46995f
            android.support.v4.view.PagerAdapter r1 = r1.getAdapter()
            int r1 = r1.getCount()
            int r1 = r1 - r7
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager r2 = r9.f46995f
            int r2 = r2.getCurrentItem()
            if (r1 != r2) goto L_0x013b
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager r1 = r9.f46995f
            boolean r1 = r1.q
            if (r1 != 0) goto L_0x013b
            com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout r1 = r9.g
            if (r1 == 0) goto L_0x007c
            com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout r1 = r9.g
            boolean r1 = r1.f34835c
            if (r1 == 0) goto L_0x007c
            goto L_0x013b
        L_0x007c:
            int r1 = r10.getAction()
            switch(r1) {
                case 0: goto L_0x0134;
                case 1: goto L_0x00bc;
                case 2: goto L_0x008e;
                case 3: goto L_0x0085;
                default: goto L_0x0083;
            }
        L_0x0083:
            goto L_0x0136
        L_0x0085:
            boolean r0 = r9.i
            if (r0 == 0) goto L_0x0136
            r9.e()
            goto L_0x0131
        L_0x008e:
            boolean r1 = r9.i
            if (r1 == 0) goto L_0x0136
            float r1 = r10.getY()
            float r2 = r9.k
            float r2 = r1 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 / r3
            int r2 = (int) r2
            r9.k = r1
            int r1 = r9.getViewPagerMarginTop()
            int r3 = r1 + r2
            if (r3 <= 0) goto L_0x00a9
            int r2 = -r1
        L_0x00a9:
            int r1 = r9.l
            int r1 = -r1
            if (r3 < r1) goto L_0x0136
            r9.setViewPagerMarginTopByDelta(r2)
            boolean r1 = r0.c()
            if (r1 == 0) goto L_0x0136
            r0.d()
            goto L_0x0136
        L_0x00bc:
            boolean r0 = r9.i
            if (r0 == 0) goto L_0x0136
            int r0 = r9.getViewPagerMarginTop()
            int r1 = r9.f46993d
            int r1 = -r1
            if (r0 > r1) goto L_0x012e
            int r0 = r9.f46992c
            if (r0 == r7) goto L_0x012e
            int r0 = r9.f46992c
            r7 = 2
            if (r0 != r7) goto L_0x00d3
            goto L_0x012e
        L_0x00d3:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f46990a
            r3 = 0
            r4 = 43701(0xaab5, float:6.1238E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00f7
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f46990a
            r3 = 0
            r4 = 43701(0xaab5, float:6.1238E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0131
        L_0x00f7:
            float[] r0 = new float[r7]
            r0 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            r9.m = r0
            int r0 = r9.getViewPagerMarginTop()
            android.animation.ValueAnimator r1 = r9.m
            int r2 = r9.f46993d
            int r2 = r2 + r0
            int r2 = r2 * -200
            int r3 = r9.l
            int r2 = r2 / r3
            long r2 = (long) r2
            r1.setDuration(r2)
            android.animation.ValueAnimator r1 = r9.m
            com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout$3 r2 = new com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout$3
            r2.<init>(r0)
            r1.addUpdateListener(r2)
            android.animation.ValueAnimator r0 = r9.m
            com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout$4 r1 = new com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout$4
            r1.<init>()
            r0.addListener(r1)
            android.animation.ValueAnimator r0 = r9.m
            r0.start()
            goto L_0x0131
        L_0x012e:
            r9.e()
        L_0x0131:
            r9.i = r8
            goto L_0x0136
        L_0x0134:
            r9.i = r8
        L_0x0136:
            boolean r0 = super.onTouchEvent(r10)
            return r0
        L_0x013b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void a(VerticalViewPager verticalViewPager, SwipeRefreshLayout swipeRefreshLayout) {
        this.f46995f = verticalViewPager;
        this.g = swipeRefreshLayout;
    }

    public LoadMoreFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoadMoreFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f46992c = -1;
        this.n = -1;
        if (PatchProxy.isSupport(new Object[]{context}, this, f46990a, false, 43689, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f46990a, false, 43689, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.h = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f46993d = (int) (getContext().getResources().getDisplayMetrics().density * 109.0f);
        this.l = (int) (getContext().getResources().getDisplayMetrics().density * 218.0f);
    }
}
