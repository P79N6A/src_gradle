package com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.NestedScrollingChild;
import android.support.v4.view.NestedScrollingChildHelper;
import android.support.v4.view.NestedScrollingParent;
import android.support.v4.view.NestedScrollingParentHelper;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class SwipeRefreshLayout extends ViewGroup implements NestedScrollingChild, NestedScrollingParent, a {
    private static final int[] H = {16842766};

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34833a = null;
    private static final String o = "SwipeRefreshLayout";
    private static final String p = "SwipeRefreshLayout";
    private int A;
    private float B;
    private float C;
    private boolean D;
    private int E;
    private boolean F;
    private final DecelerateInterpolator G;
    private int I;
    private Animation J;
    private Animation K;
    private Animation L;
    private Animation M;
    private Animation N;
    private int O;
    private a P;
    private Animation.AnimationListener Q;
    private final Animation R;
    private final Animation S;

    /* renamed from: b  reason: collision with root package name */
    b f34834b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f34835c;

    /* renamed from: d  reason: collision with root package name */
    int f34836d;

    /* renamed from: e  reason: collision with root package name */
    boolean f34837e;

    /* renamed from: f  reason: collision with root package name */
    CircleImageView f34838f;
    protected int g;
    float h;
    protected int i;
    int j;
    MaterialProgressDrawable k;
    boolean l;
    boolean m;
    b n;
    private View q;
    private int r;
    private float s;
    private boolean t;
    private float u;
    private final NestedScrollingParentHelper v;
    private final NestedScrollingChildHelper w;
    private final int[] x;
    private final int[] y;
    private boolean z;

    public interface a {
        boolean a();
    }

    public interface b {
        void a();
    }

    public int getProgressCircleDiameter() {
        return this.O;
    }

    public int getProgressViewEndOffset() {
        return this.j;
    }

    public int getProgressViewStartOffset() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f34833a, false, 24800, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34833a, false, 24800, new Class[0], Void.TYPE);
            return;
        }
        this.n.a();
        this.f34838f.clearAnimation();
        this.k.stop();
        this.f34838f.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f34837e) {
            setAnimationProgress(0.0f);
        } else {
            a(this.i - this.f34836d, true);
        }
        this.f34836d = this.f34838f.getTop();
    }

    public final void a(boolean z2, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f34833a, false, 24804, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f34833a, false, 24804, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f34837e = z2;
        this.i = i2;
        this.j = i3;
        this.m = true;
        a();
        this.f34835c = false;
    }

    /* access modifiers changed from: package-private */
    public final void a(Animation.AnimationListener animationListener) {
        if (PatchProxy.isSupport(new Object[]{animationListener}, this, f34833a, false, 24812, new Class[]{Animation.AnimationListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{animationListener}, this, f34833a, false, 24812, new Class[]{Animation.AnimationListener.class}, Void.TYPE);
            return;
        }
        this.K = new Animation() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f34843a;

            public final void applyTransformation(float f2, Transformation transformation) {
                if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), transformation}, this, f34843a, false, 24856, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), transformation}, this, f34843a, false, 24856, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE);
                    return;
                }
                SwipeRefreshLayout.this.setAnimationProgress(1.0f - f2);
            }
        };
        this.K.setDuration(150);
        this.f34838f.setAnimationListener(animationListener);
        this.f34838f.clearAnimation();
        this.f34838f.startAnimation(this.K);
    }

    /* access modifiers changed from: package-private */
    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f34833a, false, 24850, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f34833a, false, 24850, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        a((this.g + ((int) (((float) (this.i - this.g)) * f2))) - this.f34838f.getTop(), false);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f34833a, false, 24852, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2)}, this, f34833a, false, 24852, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f34838f.bringToFront();
        ViewCompat.offsetTopAndBottom(this.f34838f, i2);
        this.f34836d = this.f34838f.getTop();
        if (z2 && Build.VERSION.SDK_INT < 11) {
            invalidate();
        }
    }

    private static boolean b() {
        if (Build.VERSION.SDK_INT < 11) {
            return true;
        }
        return false;
    }

    @SuppressLint({"NewApi"})
    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f34833a, false, 24813, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34833a, false, 24813, new Class[0], Void.TYPE);
            return;
        }
        this.L = a(this.k.getAlpha(), 76);
    }

    @SuppressLint({"NewApi"})
    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f34833a, false, 24814, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34833a, false, 24814, new Class[0], Void.TYPE);
            return;
        }
        this.M = a(this.k.getAlpha(), 255);
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f34833a, false, 24820, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34833a, false, 24820, new Class[0], Void.TYPE);
            return;
        }
        if (this.q == null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (!childAt.equals(this.f34838f)) {
                    this.q = childAt;
                    return;
                }
            }
        }
    }

    public int getNestedScrollAxes() {
        if (!PatchProxy.isSupport(new Object[0], this, f34833a, false, 24829, new Class[0], Integer.TYPE)) {
            return this.v.getNestedScrollAxes();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f34833a, false, 24829, new Class[0], Integer.TYPE)).intValue();
    }

    public boolean hasNestedScrollingParent() {
        if (!PatchProxy.isSupport(new Object[0], this, f34833a, false, 24836, new Class[0], Boolean.TYPE)) {
            return this.w.hasNestedScrollingParent();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f34833a, false, 24836, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean isNestedScrollingEnabled() {
        if (!PatchProxy.isSupport(new Object[0], this, f34833a, false, 24833, new Class[0], Boolean.TYPE)) {
            return this.w.isNestedScrollingEnabled();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f34833a, false, 24833, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f34833a, false, 24802, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34833a, false, 24802, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        a();
    }

    public void stopNestedScroll() {
        if (PatchProxy.isSupport(new Object[0], this, f34833a, false, 24835, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34833a, false, 24835, new Class[0], Void.TYPE);
            return;
        }
        this.w.stopNestedScroll();
    }

    private boolean f() {
        if (PatchProxy.isSupport(new Object[0], this, f34833a, false, 24823, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f34833a, false, 24823, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.P != null) {
            return this.P.a();
        } else {
            if (Build.VERSION.SDK_INT >= 14) {
                return ViewCompat.canScrollVertically(this.q, -1);
            }
            if (this.q instanceof AbsListView) {
                AbsListView absListView = (AbsListView) this.q;
                if (absListView.getChildCount() <= 0 || (absListView.getFirstVisiblePosition() <= 0 && absListView.getChildAt(0).getTop() >= absListView.getPaddingTop())) {
                    return false;
                }
                return true;
            } else if (ViewCompat.canScrollVertically(this.q, -1) || this.q.getScrollY() > 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Deprecated
    public void setColorScheme(@ColorInt int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setDistanceToTriggerSync(int i2) {
        this.s = (float) i2;
    }

    public void setDoNotCatchException(boolean z2) {
        this.t = z2;
    }

    public void setOnChildScrollUpCallback(@Nullable a aVar) {
        this.P = aVar;
    }

    public void setOnRefreshListener(b bVar) {
        this.f34834b = bVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i2) {
        setProgressBackgroundColorSchemeResource(i2);
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f34833a, false, 24825, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f34833a, false, 24825, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    private void c(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f34833a, false, 24845, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f34833a, false, 24845, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (f2 > this.s) {
            a(true, true);
        } else {
            this.f34835c = false;
            this.k.a(0.0f, 0.0f);
            AnonymousClass5 r0 = null;
            if (!this.f34837e) {
                r0 = new Animation.AnimationListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f34849a;

                    public final void onAnimationRepeat(Animation animation) {
                    }

                    public final void onAnimationStart(Animation animation) {
                    }

                    public final void onAnimationEnd(Animation animation) {
                        if (PatchProxy.isSupport(new Object[]{animation}, this, f34849a, false, 24858, new Class[]{Animation.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animation}, this, f34849a, false, 24858, new Class[]{Animation.class}, Void.TYPE);
                            return;
                        }
                        if (!SwipeRefreshLayout.this.f34837e) {
                            SwipeRefreshLayout.this.a((Animation.AnimationListener) null);
                        }
                    }
                };
            }
            b(this.f34836d, this.n.a((Animation.AnimationListener) r0));
            this.k.a(false);
        }
    }

    @SuppressLint({"NewApi"})
    private void d(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f34833a, false, 24847, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f34833a, false, 24847, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (f2 - this.C > ((float) this.r) && !this.D) {
            this.B = this.C + ((float) this.r);
            this.D = true;
            this.k.setAlpha(76);
        }
    }

    @SuppressLint({"NewApi"})
    private void setColorViewAlpha(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f34833a, false, 24803, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f34833a, false, 24803, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f34838f.getBackground().setAlpha(i2);
        this.k.setAlpha(i2);
    }

    public void onStopNestedScroll(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f34833a, false, 24830, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f34833a, false, 24830, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.v.onStopNestedScroll(view);
        this.z = false;
        if (this.u > 0.0f) {
            c(this.u);
            this.u = 0.0f;
        }
        stopNestedScroll();
    }

    /* access modifiers changed from: package-private */
    public void setAnimationProgress(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f34833a, false, 24810, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f34833a, false, 24810, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (b()) {
            setColorViewAlpha((int) (255.0f * f2));
        } else {
            ViewCompat.setScaleX(this.f34838f, f2);
            ViewCompat.setScaleY(this.f34838f, f2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setColorSchemeColors(@android.support.annotation.ColorInt int... r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f34833a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<int[]> r3 = int[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 24819(0x60f3, float:3.4779E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f34833a
            r13 = 0
            r14 = 24819(0x60f3, float:3.4779E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<int[]> r0 = int[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0034:
            r17.e()
            r2 = r17
            com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.MaterialProgressDrawable r3 = r2.k
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.MaterialProgressDrawable.f34809a
            r13 = 0
            r14 = 24726(0x6096, float:3.4649E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<int[]> r4 = int[].class
            r15[r9] = r4
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r3
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r4 == 0) goto L_0x0069
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.MaterialProgressDrawable.f34809a
            r13 = 0
            r14 = 24726(0x6096, float:3.4649E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<int[]> r0 = int[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0069:
            com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.MaterialProgressDrawable$a r1 = r3.f34811c
            r1.a((int[]) r0)
            com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.MaterialProgressDrawable$a r0 = r3.f34811c
            r0.a((int) r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout.setColorSchemeColors(int[]):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setColorSchemeResources(@android.support.annotation.ColorRes int... r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f34833a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<int[]> r3 = int[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 24818(0x60f2, float:3.4777E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f34833a
            r13 = 0
            r14 = 24818(0x60f2, float:3.4777E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<int[]> r0 = int[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0034:
            android.content.Context r1 = r17.getContext()
            int r2 = r0.length
            int[] r2 = new int[r2]
        L_0x003b:
            int r3 = r0.length
            if (r9 >= r3) goto L_0x0049
            r3 = r0[r9]
            int r3 = android.support.v4.content.ContextCompat.getColor(r1, r3)
            r2[r9] = r3
            int r9 = r9 + 1
            goto L_0x003b
        L_0x0049:
            r3 = r17
            r3.setColorSchemeColors(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout.setColorSchemeResources(int[]):void");
    }

    public void setEnabled(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f34833a, false, 24801, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f34833a, false, 24801, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setEnabled(z2);
        if (!z2) {
            a();
        }
    }

    public void setNestedScrollingEnabled(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f34833a, false, 24832, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f34833a, false, 24832, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.w.setNestedScrollingEnabled(z2);
    }

    public void setProgressBackgroundColorSchemeColor(@ColorInt int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f34833a, false, 24817, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f34833a, false, 24817, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f34838f.setBackgroundColor(i2);
        this.k.b(i2);
    }

    public void setProgressBackgroundColorSchemeResource(@ColorRes int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f34833a, false, 24816, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f34833a, false, 24816, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        setProgressBackgroundColorSchemeColor(ContextCompat.getColor(getContext(), i2));
    }

    public void setSize(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f34833a, false, 24806, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f34833a, false, 24806, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 == 0 || i2 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i2 == 0) {
                this.O = (int) (displayMetrics.density * 56.0f);
            } else {
                this.O = (int) (displayMetrics.density * 40.0f);
            }
            this.f34838f.setImageDrawable(null);
            this.k.a(i2);
            this.f34838f.setImageDrawable(this.k);
        }
    }

    public boolean startNestedScroll(int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f34833a, false, 24834, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return this.w.startNestedScroll(i2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f34833a, false, 24834, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f34833a, false, 24824, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f34833a, false, 24824, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        e();
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (this.F && actionMasked == 0) {
            this.F = false;
        }
        if (!isEnabled() || this.F || f() || this.f34835c || this.z) {
            return false;
        }
        if (actionMasked != 6) {
            switch (actionMasked) {
                case 0:
                    a(this.i - this.f34838f.getTop(), true);
                    this.E = motionEvent.getPointerId(0);
                    this.D = false;
                    int findPointerIndex = motionEvent.findPointerIndex(this.E);
                    if (findPointerIndex >= 0) {
                        this.C = motionEvent.getY(findPointerIndex);
                        break;
                    } else {
                        return false;
                    }
                case 1:
                case 3:
                    this.D = false;
                    this.E = -1;
                    break;
                case 2:
                    if (this.E != -1) {
                        int findPointerIndex2 = motionEvent.findPointerIndex(this.E);
                        if (findPointerIndex2 >= 0) {
                            d(motionEvent.getY(findPointerIndex2));
                            break;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
            }
        } else {
            a(motionEvent);
        }
        return this.D;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f34833a, false, 24846, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f34833a, false, 24846, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (this.F && actionMasked == 0) {
            this.F = false;
        }
        if (!isEnabled() || this.F || f() || this.f34835c || this.z) {
            return false;
        }
        switch (actionMasked) {
            case 0:
                this.E = motionEvent.getPointerId(0);
                this.D = false;
                break;
            case 1:
            case 3:
                int findPointerIndex = motionEvent.findPointerIndex(this.E);
                if (findPointerIndex < 0) {
                    return false;
                }
                if (this.D) {
                    this.D = false;
                    c((motionEvent.getY(findPointerIndex) - this.B) * 0.5f);
                }
                this.E = -1;
                return false;
            case 2:
                int findPointerIndex2 = motionEvent.findPointerIndex(this.E);
                if (findPointerIndex2 < 0) {
                    return false;
                }
                float y2 = motionEvent.getY(findPointerIndex2);
                d(y2);
                if (this.D) {
                    float f2 = (y2 - this.B) * 0.5f;
                    if (f2 > 0.0f) {
                        b(f2);
                        break;
                    } else {
                        b(0.0f);
                        return false;
                    }
                }
                break;
            case 5:
                int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                if (actionIndex >= 0) {
                    this.E = motionEvent.getPointerId(actionIndex);
                    break;
                } else {
                    return false;
                }
            case 6:
                a(motionEvent);
                break;
        }
        return true;
    }

    public void setRefreshing(boolean z2) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f34833a, false, 24808, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f34833a, false, 24808, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!z2 || this.f34835c == z2) {
            a(z2, false);
        } else {
            this.f34835c = z2;
            if (!this.m) {
                i2 = this.j + this.i;
            } else {
                i2 = this.j;
            }
            a(i2 - this.f34836d, true);
            this.l = false;
            Animation.AnimationListener animationListener = this.Q;
            if (PatchProxy.isSupport(new Object[]{animationListener}, this, f34833a, false, 24809, new Class[]{Animation.AnimationListener.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animationListener}, this, f34833a, false, 24809, new Class[]{Animation.AnimationListener.class}, Void.TYPE);
            } else {
                this.f34838f.setVisibility(0);
                if (Build.VERSION.SDK_INT >= 11) {
                    this.k.setAlpha(255);
                }
                this.J = new Animation() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f34841a;

                    public final void applyTransformation(float f2, Transformation transformation) {
                        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), transformation}, this, f34841a, false, 24855, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), transformation}, this, f34841a, false, 24855, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE);
                            return;
                        }
                        SwipeRefreshLayout.this.setAnimationProgress(f2);
                    }
                };
                this.J.setDuration((long) this.A);
                if (animationListener != null) {
                    this.f34838f.setAnimationListener(animationListener);
                }
                this.f34838f.clearAnimation();
                this.f34838f.startAnimation(this.J);
            }
        }
    }

    private void a(MotionEvent motionEvent) {
        int i2 = 1;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f34833a, false, 24853, new Class[]{MotionEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f34833a, false, 24853, new Class[]{MotionEvent.class}, Void.TYPE);
            return;
        }
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (motionEvent.getPointerId(actionIndex) == this.E) {
            if (actionIndex != 0) {
                i2 = 0;
            }
            this.E = motionEvent.getPointerId(i2);
        }
    }

    @SuppressLint({"NewApi"})
    private void b(float f2) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f34833a, false, 24844, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f34833a, false, 24844, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.k.a(true);
        float min = Math.min(1.0f, Math.abs(f2 / this.s));
        double d2 = (double) min;
        Double.isNaN(d2);
        float max = (Math.max((float) (d2 - 0.4d), 0.0f) * 5.0f) / 3.0f;
        float abs = Math.abs(f2) - this.s;
        if (this.m) {
            i2 = this.j - this.i;
        } else {
            i2 = this.j;
        }
        float f3 = (float) i2;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f3 * 2.0f) / f3) / 4.0f);
        double pow = Math.pow(max2, 2.0d);
        Double.isNaN(max2);
        float f4 = ((float) (max2 - pow)) * 2.0f;
        int i3 = this.i + ((int) ((f3 * min) + (f3 * f4 * 2.0f)));
        if (this.f34838f.getVisibility() != 0) {
            this.f34838f.setVisibility(0);
        }
        if (!this.f34837e) {
            ViewCompat.setScaleX(this.f34838f, 1.0f);
            ViewCompat.setScaleY(this.f34838f, 1.0f);
        }
        if (this.f34837e) {
            setAnimationProgress(Math.min(1.0f, f2 / this.s));
        }
        if (f2 < this.s) {
            if (this.k.getAlpha() > 76 && !a(this.L)) {
                c();
            }
        } else if (this.k.getAlpha() < 255 && !a(this.M)) {
            d();
        }
        this.k.a(0.0f, Math.min(0.8f, max * 0.8f));
        this.k.a(Math.min(1.0f, max));
        this.k.b((((max * 0.4f) - 16.0f) + (f4 * 2.0f)) * 0.5f);
        a(i3 - this.f34836d, true);
        this.n.a(min);
    }

    private boolean a(Animation animation) {
        if (PatchProxy.isSupport(new Object[]{animation}, this, f34833a, false, 24843, new Class[]{Animation.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{animation}, this, f34833a, false, 24843, new Class[]{Animation.class}, Boolean.TYPE)).booleanValue();
        } else if (animation == null || !animation.hasStarted() || animation.hasEnded()) {
            return false;
        } else {
            return true;
        }
    }

    public int getChildDrawingOrder(int i2, int i3) {
        if (this.I < 0) {
            return i3;
        }
        if (i3 == i2 - 1) {
            return this.I;
        }
        if (i3 >= this.I) {
            return i3 + 1;
        }
        return i3;
    }

    @SuppressLint({"NewApi"})
    private Animation a(final int i2, final int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f34833a, false, 24815, new Class[]{Integer.TYPE, Integer.TYPE}, Animation.class)) {
            return (Animation) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f34833a, false, 24815, new Class[]{Integer.TYPE, Integer.TYPE}, Animation.class);
        } else if (this.f34837e && b()) {
            return null;
        } else {
            AnonymousClass4 r0 = new Animation() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f34845a;

                public final void applyTransformation(float f2, Transformation transformation) {
                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), transformation}, this, f34845a, false, 24857, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), transformation}, this, f34845a, false, 24857, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE);
                        return;
                    }
                    SwipeRefreshLayout.this.k.setAlpha((int) (((float) i2) + (((float) (i3 - i2)) * f2)));
                }
            };
            r0.setDuration(300);
            this.f34838f.setAnimationListener(null);
            this.f34838f.clearAnimation();
            this.f34838f.startAnimation(r0);
            return r0;
        }
    }

    private void b(int i2, Animation.AnimationListener animationListener) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), animationListener}, this, f34833a, false, 24849, new Class[]{Integer.TYPE, Animation.AnimationListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), animationListener}, this, f34833a, false, 24849, new Class[]{Integer.TYPE, Animation.AnimationListener.class}, Void.TYPE);
            return;
        }
        this.n.b(i2, animationListener);
        if (this.f34837e) {
            c(i2, animationListener);
            return;
        }
        this.g = i2;
        this.S.reset();
        this.S.setDuration(200);
        this.S.setInterpolator(this.G);
        if (animationListener != null) {
            this.f34838f.setAnimationListener(animationListener);
        }
        this.f34838f.clearAnimation();
        this.f34838f.startAnimation(this.S);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        if (!PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f34833a, false, 24842, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return this.w.dispatchNestedPreFling(f2, f3);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f34833a, false, 24842, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.s = -1.0f;
        this.x = new int[2];
        this.y = new int[2];
        this.E = -1;
        this.I = -1;
        this.Q = new Animation.AnimationListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f34839a;

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            @SuppressLint({"NewApi"})
            public final void onAnimationEnd(Animation animation) {
                if (PatchProxy.isSupport(new Object[]{animation}, this, f34839a, false, 24854, new Class[]{Animation.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animation}, this, f34839a, false, 24854, new Class[]{Animation.class}, Void.TYPE);
                } else if (SwipeRefreshLayout.this.f34835c) {
                    SwipeRefreshLayout.this.n.b();
                    SwipeRefreshLayout.this.k.setAlpha(255);
                    SwipeRefreshLayout.this.k.start();
                    if (SwipeRefreshLayout.this.l && SwipeRefreshLayout.this.f34834b != null) {
                        SwipeRefreshLayout.this.f34834b.a();
                    }
                    SwipeRefreshLayout.this.f34836d = SwipeRefreshLayout.this.f34838f.getTop();
                } else {
                    SwipeRefreshLayout.this.a();
                }
            }
        };
        this.R = new Animation() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f34851a;

            public final void applyTransformation(float f2, Transformation transformation) {
                int i;
                if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), transformation}, this, f34851a, false, 24859, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), transformation}, this, f34851a, false, 24859, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE);
                    return;
                }
                if (!SwipeRefreshLayout.this.m) {
                    i = SwipeRefreshLayout.this.j - Math.abs(SwipeRefreshLayout.this.i);
                } else {
                    i = SwipeRefreshLayout.this.j;
                }
                SwipeRefreshLayout.this.a((SwipeRefreshLayout.this.g + ((int) (((float) (i - SwipeRefreshLayout.this.g)) * f2))) - SwipeRefreshLayout.this.f34838f.getTop(), false);
                SwipeRefreshLayout.this.k.a(1.0f - f2);
            }
        };
        this.S = new Animation() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f34853a;

            public final void applyTransformation(float f2, Transformation transformation) {
                if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), transformation}, this, f34853a, false, 24860, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), transformation}, this, f34853a, false, 24860, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE);
                    return;
                }
                SwipeRefreshLayout.this.a(f2);
            }
        };
        this.n = new b() {
            public final void a(boolean z) {
            }
        };
        this.r = ViewConfiguration.get(context).getScaledTouchSlop();
        this.A = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.G = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.O = (int) (displayMetrics.density * 40.0f);
        if (PatchProxy.isSupport(new Object[0], this, f34833a, false, 24807, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34833a, false, 24807, new Class[0], Void.TYPE);
        } else {
            this.f34838f = new CircleImageView(getContext(), -328966);
            this.k = new MaterialProgressDrawable(getContext(), this);
            this.k.b(-328966);
            this.f34838f.setImageDrawable(this.k);
            this.f34838f.setVisibility(8);
            addView(this.f34838f);
        }
        ViewCompat.setChildrenDrawingOrderEnabled(this, true);
        this.j = (int) (displayMetrics.density * 64.0f);
        this.s = (float) this.j;
        this.v = new NestedScrollingParentHelper(this);
        this.w = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.O;
        this.f34836d = i2;
        this.i = i2;
        a(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private void a(int i2, Animation.AnimationListener animationListener) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), animationListener}, this, f34833a, false, 24848, new Class[]{Integer.TYPE, Animation.AnimationListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), animationListener}, this, f34833a, false, 24848, new Class[]{Integer.TYPE, Animation.AnimationListener.class}, Void.TYPE);
            return;
        }
        this.n.a(i2, animationListener);
        this.g = i2;
        this.R.reset();
        this.R.setDuration(200);
        this.R.setInterpolator(this.G);
        if (animationListener != null) {
            this.f34838f.setAnimationListener(animationListener);
        }
        this.f34838f.clearAnimation();
        this.f34838f.startAnimation(this.R);
    }

    @SuppressLint({"NewApi"})
    private void c(int i2, Animation.AnimationListener animationListener) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), animationListener}, this, f34833a, false, 24851, new Class[]{Integer.TYPE, Animation.AnimationListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), animationListener}, this, f34833a, false, 24851, new Class[]{Integer.TYPE, Animation.AnimationListener.class}, Void.TYPE);
            return;
        }
        this.g = i2;
        if (b()) {
            this.h = (float) this.k.getAlpha();
        } else {
            this.h = ViewCompat.getScaleX(this.f34838f);
        }
        this.N = new Animation() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f34855a;

            public final void applyTransformation(float f2, Transformation transformation) {
                if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), transformation}, this, f34855a, false, 24861, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), transformation}, this, f34855a, false, 24861, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE);
                    return;
                }
                SwipeRefreshLayout.this.setAnimationProgress(SwipeRefreshLayout.this.h + ((-SwipeRefreshLayout.this.h) * f2));
                SwipeRefreshLayout.this.a(f2);
            }
        };
        this.N.setDuration(150);
        if (animationListener != null) {
            this.f34838f.setAnimationListener(animationListener);
        }
        this.f34838f.clearAnimation();
        this.f34838f.startAnimation(this.N);
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f34833a, false, 24822, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f34833a, false, 24822, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
        if (this.q == null) {
            e();
        }
        if (this.q != null) {
            try {
                this.q.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            } catch (IllegalStateException e2) {
                com.ss.android.ugc.aweme.framework.a.a.a((Exception) e2);
                ExceptionMonitor.ensureNotReachHere((Throwable) e2, o);
                if (this.t) {
                    throw e2;
                }
            }
            this.f34838f.measure(View.MeasureSpec.makeMeasureSpec(this.O, 1073741824), View.MeasureSpec.makeMeasureSpec(this.O, 1073741824));
            this.I = -1;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                if (getChildAt(i4) == this.f34838f) {
                    this.I = i4;
                    return;
                }
            }
        }
    }

    private void a(boolean z2, boolean z3) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f34833a, false, 24811, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Byte.valueOf(z3)}, this, f34833a, false, 24811, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.n.a(z2, z3);
        if (this.f34835c != z2) {
            this.l = z3;
            e();
            this.f34835c = z2;
            if (this.f34835c) {
                a(this.f34836d, this.Q);
                return;
            }
            a(this.Q);
        }
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        if (!PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f34833a, false, 24841, new Class[]{Float.TYPE, Float.TYPE, Boolean.TYPE}, Boolean.TYPE)) {
            return this.w.dispatchNestedFling(f2, f3, z2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Byte.valueOf(z2)}, this, f34833a, false, 24841, new Class[]{Float.TYPE, Float.TYPE, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        if (!PatchProxy.isSupport(new Object[]{view, Float.valueOf(f2), Float.valueOf(f3)}, this, f34833a, false, 24839, new Class[]{View.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return dispatchNestedPreFling(f2, f3);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, Float.valueOf(f2), Float.valueOf(f3)}, this, f34833a, false, 24839, new Class[]{View.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        View view3 = view;
        View view4 = view2;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{view3, view4, Integer.valueOf(i2)}, this, f34833a, false, 24827, new Class[]{View.class, View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view3, view4, Integer.valueOf(i2)}, this, f34833a, false, 24827, new Class[]{View.class, View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.v.onNestedScrollAccepted(view3, view4, i3);
        startNestedScroll(i3 & 2);
        this.u = 0.0f;
        this.z = true;
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if (PatchProxy.isSupport(new Object[]{view, view2, Integer.valueOf(i2)}, this, f34833a, false, 24826, new Class[]{View.class, View.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, view2, Integer.valueOf(i2)}, this, f34833a, false, 24826, new Class[]{View.class, View.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (!isEnabled() || this.F || this.f34835c || (i2 & 2) == 0) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchNestedPreScroll(int r22, int r23, int[] r24, int[] r25) {
        /*
            r21 = this;
            r0 = r24
            r1 = r25
            r2 = 4
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r22)
            r10 = 0
            r3[r10] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r23)
            r11 = 1
            r3[r11] = r4
            r12 = 2
            r3[r12] = r0
            r13 = 3
            r3[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f34833a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8[r10] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8[r11] = r4
            java.lang.Class<int[]> r4 = int[].class
            r8[r12] = r4
            java.lang.Class<int[]> r4 = int[].class
            r8[r13] = r4
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r6 = 0
            r7 = 24838(0x6106, float:3.4805E-41)
            r4 = r21
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0077
            java.lang.Object[] r14 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r22)
            r14[r10] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r23)
            r14[r11] = r3
            r14[r12] = r0
            r14[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r16 = f34833a
            r17 = 0
            r18 = 24838(0x6106, float:3.4805E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r11] = r1
            java.lang.Class<int[]> r1 = int[].class
            r0[r12] = r1
            java.lang.Class<int[]> r1 = int[].class
            r0[r13] = r1
            java.lang.Class r20 = java.lang.Boolean.TYPE
            r15 = r21
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0077:
            r2 = r21
            android.support.v4.view.NestedScrollingChildHelper r3 = r2.w
            r4 = r22
            r5 = r23
            boolean r0 = r3.dispatchNestedPreScroll(r4, r5, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout.dispatchNestedPreScroll(int, int, int[], int[]):boolean");
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!PatchProxy.isSupport(new Object[]{view, Float.valueOf(f2), Float.valueOf(f3), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f34833a, false, 24840, new Class[]{View.class, Float.TYPE, Float.TYPE, Boolean.TYPE}, Boolean.TYPE)) {
            return dispatchNestedFling(f2, f3, z2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, Float.valueOf(f2), Float.valueOf(f3), Byte.valueOf(z2)}, this, f34833a, false, 24840, new Class[]{View.class, Float.TYPE, Float.TYPE, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        int i4 = i3;
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3), iArr}, this, f34833a, false, 24828, new Class[]{View.class, Integer.TYPE, Integer.TYPE, int[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3), iArr}, this, f34833a, false, 24828, new Class[]{View.class, Integer.TYPE, Integer.TYPE, int[].class}, Void.TYPE);
            return;
        }
        if (i4 > 0 && this.u > 0.0f) {
            float f2 = (float) i4;
            if (f2 > this.u) {
                iArr[1] = i4 - ((int) this.u);
                this.u = 0.0f;
            } else {
                this.u -= f2;
                iArr[1] = i4;
            }
            b(this.u);
        }
        if (this.m && i4 > 0 && this.u == 0.0f && Math.abs(i4 - iArr[1]) > 0) {
            this.f34838f.setVisibility(8);
        }
        int[] iArr2 = this.x;
        if (dispatchNestedPreScroll(i2 - iArr[0], i4 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), iArr}, this, f34833a, false, 24837, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, int[].class}, Boolean.TYPE)) {
            return this.w.dispatchNestedScroll(i2, i3, i4, i5, iArr);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), iArr}, this, f34833a, false, 24837, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, int[].class}, Boolean.TYPE)).booleanValue();
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f34833a, false, 24821, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f34833a, false, 24821, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.q == null) {
                e();
            }
            if (this.q != null) {
                View view = this.q;
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                try {
                    view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                } catch (Exception e2) {
                    Exception exc = e2;
                    com.ss.android.ugc.aweme.framework.a.a.a(exc);
                    ExceptionMonitor.ensureNotReachHere((Throwable) exc, o);
                    if (this.t) {
                        throw exc;
                    }
                }
                int measuredWidth2 = this.f34838f.getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int i7 = measuredWidth2 / 2;
                this.f34838f.layout(i6 - i7, this.f34836d, i6 + i7, this.f34836d + this.f34838f.getMeasuredHeight());
            }
        }
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f34833a, false, 24831, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f34833a, false, 24831, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        dispatchNestedScroll(i2, i3, i4, i5, this.y);
        int i6 = i5 + this.y[1];
        if (i6 < 0 && !f()) {
            this.u += (float) Math.abs(i6);
            b(this.u);
        }
    }
}
