package com.ss.android.ugc.aweme.story.base.view;

import android.annotation.SuppressLint;
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
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class StorySwipeRefreshLayout extends ViewGroup implements NestedScrollingChild, NestedScrollingParent {
    private static final int[] H = {16842766};

    /* renamed from: a  reason: collision with root package name */
    private static final String f71990a = "StorySwipeRefreshLayout";

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f71991b = null;
    private static final String p = "StorySwipeRefreshLayout";
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

    /* renamed from: c  reason: collision with root package name */
    b f71992c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f71993d;

    /* renamed from: e  reason: collision with root package name */
    int f71994e;

    /* renamed from: f  reason: collision with root package name */
    boolean f71995f;
    CircleImageView g;
    protected int h;
    float i;
    protected int j;
    int k;
    MaterialProgressDrawable l;
    boolean m;
    boolean n;
    e o;
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

    public interface b {
    }

    public interface a {
        boolean a();
    }

    public int getProgressCircleDiameter() {
        return this.O;
    }

    public int getProgressViewEndOffset() {
        return this.k;
    }

    public int getProgressViewStartOffset() {
        return this.j;
    }

    private void a(boolean z2, boolean z3) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f71991b, false, 82472, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Byte.valueOf(z3)}, this, f71991b, false, 82472, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f71993d != z2) {
            this.m = z3;
            e();
            this.f71993d = z2;
            if (this.f71993d) {
                a(this.f71994e, this.Q);
                return;
            }
            a(this.Q);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Animation.AnimationListener animationListener) {
        if (PatchProxy.isSupport(new Object[]{animationListener}, this, f71991b, false, 82473, new Class[]{Animation.AnimationListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{animationListener}, this, f71991b, false, 82473, new Class[]{Animation.AnimationListener.class}, Void.TYPE);
            return;
        }
        this.K = new Animation() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f71998a;

            public final void applyTransformation(float f2, Transformation transformation) {
                if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), transformation}, this, f71998a, false, 82517, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), transformation}, this, f71998a, false, 82517, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE);
                    return;
                }
                StorySwipeRefreshLayout.this.setAnimationProgress(1.0f - f2);
            }
        };
        this.K.setDuration(150);
        this.g.setAnimationListener(animationListener);
        this.g.clearAnimation();
        this.g.startAnimation(this.K);
    }

    private boolean a(Animation animation) {
        if (!PatchProxy.isSupport(new Object[]{animation}, this, f71991b, false, 82504, new Class[]{Animation.class}, Boolean.TYPE)) {
            return animation != null && animation.hasStarted() && !animation.hasEnded();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{animation}, this, f71991b, false, 82504, new Class[]{Animation.class}, Boolean.TYPE)).booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f71991b, false, 82511, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f71991b, false, 82511, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        a((this.h + ((int) (((float) (this.j - this.h)) * f2))) - this.g.getTop(), false);
    }

    private static boolean b() {
        if (Build.VERSION.SDK_INT < 11) {
            return true;
        }
        return false;
    }

    @SuppressLint({"NewApi"})
    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f71991b, false, 82474, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71991b, false, 82474, new Class[0], Void.TYPE);
            return;
        }
        this.L = a(this.l.getAlpha(), 76);
    }

    @SuppressLint({"NewApi"})
    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f71991b, false, 82475, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71991b, false, 82475, new Class[0], Void.TYPE);
            return;
        }
        this.M = a(this.l.getAlpha(), 255);
    }

    public int getNestedScrollAxes() {
        if (!PatchProxy.isSupport(new Object[0], this, f71991b, false, 82490, new Class[0], Integer.TYPE)) {
            return this.v.getNestedScrollAxes();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f71991b, false, 82490, new Class[0], Integer.TYPE)).intValue();
    }

    public boolean hasNestedScrollingParent() {
        if (!PatchProxy.isSupport(new Object[0], this, f71991b, false, 82497, new Class[0], Boolean.TYPE)) {
            return this.w.hasNestedScrollingParent();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f71991b, false, 82497, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean isNestedScrollingEnabled() {
        if (!PatchProxy.isSupport(new Object[0], this, f71991b, false, 82494, new Class[0], Boolean.TYPE)) {
            return this.w.isNestedScrollingEnabled();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f71991b, false, 82494, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f71991b, false, 82463, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71991b, false, 82463, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        a();
    }

    public void stopNestedScroll() {
        if (PatchProxy.isSupport(new Object[0], this, f71991b, false, 82496, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71991b, false, 82496, new Class[0], Void.TYPE);
            return;
        }
        this.w.stopNestedScroll();
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f71991b, false, 82481, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71991b, false, 82481, new Class[0], Void.TYPE);
            return;
        }
        if (this.q == null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (!childAt.equals(this.g)) {
                    this.q = childAt;
                    return;
                }
            }
        }
    }

    private boolean f() {
        if (PatchProxy.isSupport(new Object[0], this, f71991b, false, 82484, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f71991b, false, 82484, new Class[0], Boolean.TYPE)).booleanValue();
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

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f71991b, false, 82461, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71991b, false, 82461, new Class[0], Void.TYPE);
            return;
        }
        e eVar = this.o;
        if (PatchProxy.isSupport(new Object[0], eVar, e.f72022a, false, 82526, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], eVar, e.f72022a, false, 82526, new Class[0], Void.TYPE);
        } else {
            eVar.a(true);
        }
        this.g.clearAnimation();
        this.l.stop();
        this.g.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f71995f) {
            setAnimationProgress(0.0f);
        } else {
            a(this.j - this.f71994e, true);
        }
        this.f71994e = this.g.getTop();
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
        this.f71992c = bVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i2) {
        setProgressBackgroundColorSchemeResource(i2);
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f71991b, false, 82486, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f71991b, false, 82486, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    private void c(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f71991b, false, 82506, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f71991b, false, 82506, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (f2 > this.s) {
            a(true, true);
        } else {
            this.f71993d = false;
            this.l.a(0.0f, 0.0f);
            AnonymousClass4 r0 = null;
            if (!this.f71995f) {
                r0 = new Animation.AnimationListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f72004a;

                    public final void onAnimationRepeat(Animation animation) {
                    }

                    public final void onAnimationStart(Animation animation) {
                    }

                    public final void onAnimationEnd(Animation animation) {
                        if (PatchProxy.isSupport(new Object[]{animation}, this, f72004a, false, 82519, new Class[]{Animation.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animation}, this, f72004a, false, 82519, new Class[]{Animation.class}, Void.TYPE);
                            return;
                        }
                        if (!StorySwipeRefreshLayout.this.f71995f) {
                            StorySwipeRefreshLayout.this.a((Animation.AnimationListener) null);
                        }
                    }
                };
            }
            b(this.f71994e, this.o.a((Animation.AnimationListener) r0));
            this.l.a(false);
        }
    }

    @SuppressLint({"NewApi"})
    private void d(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f71991b, false, 82508, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f71991b, false, 82508, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (f2 - this.C > ((float) this.r) && !this.D) {
            this.B = this.C + ((float) this.r);
            this.D = true;
            this.l.setAlpha(76);
        }
    }

    @SuppressLint({"NewApi"})
    private void setColorViewAlpha(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f71991b, false, 82464, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f71991b, false, 82464, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.g.getBackground().setAlpha(i2);
        this.l.setAlpha(i2);
    }

    public void onStopNestedScroll(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f71991b, false, 82491, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f71991b, false, 82491, new Class[]{View.class}, Void.TYPE);
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
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f71991b, false, 82471, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f71991b, false, 82471, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (b()) {
            setColorViewAlpha((int) (255.0f * f2));
        } else {
            ViewCompat.setScaleX(this.g, f2);
            ViewCompat.setScaleY(this.g, f2);
        }
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
            com.meituan.robust.ChangeQuickRedirect r4 = f71991b
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<int[]> r3 = int[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 82479(0x1422f, float:1.15578E-40)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0036
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f71991b
            r13 = 0
            r14 = 82479(0x1422f, float:1.15578E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<int[]> r0 = int[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0036:
            android.content.Context r1 = r17.getContext()
            int r2 = r0.length
            int[] r2 = new int[r2]
        L_0x003d:
            int r3 = r0.length
            if (r9 >= r3) goto L_0x004b
            r3 = r0[r9]
            int r3 = android.support.v4.content.ContextCompat.getColor(r1, r3)
            r2[r9] = r3
            int r9 = r9 + 1
            goto L_0x003d
        L_0x004b:
            r3 = r17
            r3.setColorSchemeColors(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.base.view.StorySwipeRefreshLayout.setColorSchemeResources(int[]):void");
    }

    public void setEnabled(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f71991b, false, 82462, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f71991b, false, 82462, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setEnabled(z2);
        if (!z2) {
            a();
        }
    }

    public void setNestedScrollingEnabled(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f71991b, false, 82493, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f71991b, false, 82493, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.w.setNestedScrollingEnabled(z2);
    }

    public void setProgressBackgroundColorSchemeColor(@ColorInt int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f71991b, false, 82478, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f71991b, false, 82478, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.g.setBackgroundColor(i2);
        this.l.f71968c.v = i2;
    }

    public void setProgressBackgroundColorSchemeResource(@ColorRes int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f71991b, false, 82477, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f71991b, false, 82477, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        setProgressBackgroundColorSchemeColor(ContextCompat.getColor(getContext(), i2));
    }

    public void setSize(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f71991b, false, 82467, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f71991b, false, 82467, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 == 0 || i2 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i2 == 0) {
                this.O = (int) (displayMetrics.density * 56.0f);
            } else {
                this.O = (int) (displayMetrics.density * 40.0f);
            }
            this.g.setImageDrawable(null);
            this.l.a(i2);
            this.g.setImageDrawable(this.l);
        }
    }

    public boolean startNestedScroll(int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f71991b, false, 82495, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return this.w.startNestedScroll(i2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f71991b, false, 82495, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f71991b, false, 82485, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f71991b, false, 82485, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        e();
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (this.F && actionMasked == 0) {
            this.F = false;
        }
        if (!isEnabled() || this.F || f() || this.f71993d || this.z) {
            return false;
        }
        if (actionMasked != 6) {
            switch (actionMasked) {
                case 0:
                    a(this.j - this.g.getTop(), true);
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
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f71991b, false, 82507, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f71991b, false, 82507, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (this.F && actionMasked == 0) {
            this.F = false;
        }
        if (!isEnabled() || this.F || f() || this.f71993d || this.z) {
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setColorSchemeColors(@android.support.annotation.ColorInt int... r25) {
        /*
            r24 = this;
            r0 = r25
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f71991b
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<int[]> r3 = int[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 82480(0x14230, float:1.15579E-40)
            r3 = r24
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0036
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f71991b
            r13 = 0
            r14 = 82480(0x14230, float:1.15579E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<int[]> r0 = int[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r24
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0036:
            r24.e()
            r2 = r24
            com.ss.android.ugc.aweme.story.base.view.MaterialProgressDrawable r3 = r2.l
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.story.base.view.MaterialProgressDrawable.f71965a
            r13 = 0
            r14 = 82396(0x141dc, float:1.15461E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<int[]> r4 = int[].class
            r15[r9] = r4
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r3
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r4 == 0) goto L_0x006d
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.story.base.view.MaterialProgressDrawable.f71965a
            r13 = 0
            r14 = 82396(0x141dc, float:1.15461E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<int[]> r0 = int[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x006d:
            com.ss.android.ugc.aweme.story.base.view.MaterialProgressDrawable$a r4 = r3.f71968c
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r19 = com.ss.android.ugc.aweme.story.base.view.MaterialProgressDrawable.a.f71971a
            r20 = 0
            r21 = 82414(0x141ee, float:1.15487E-40)
            java.lang.Class[] r6 = new java.lang.Class[r1]
            java.lang.Class<int[]> r7 = int[].class
            r6[r9] = r7
            java.lang.Class r23 = java.lang.Void.TYPE
            r17 = r5
            r18 = r4
            r22 = r6
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r17, r18, r19, r20, r21, r22, r23)
            if (r5 == 0) goto L_0x00ab
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r19 = com.ss.android.ugc.aweme.story.base.view.MaterialProgressDrawable.a.f71971a
            r20 = 0
            r21 = 82414(0x141ee, float:1.15487E-40)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class<int[]> r1 = int[].class
            r0[r9] = r1
            java.lang.Class r23 = java.lang.Void.TYPE
            r17 = r5
            r18 = r4
            r22 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r17, r18, r19, r20, r21, r22, r23)
            goto L_0x00b0
        L_0x00ab:
            r4.j = r0
            r4.a((int) r9)
        L_0x00b0:
            com.ss.android.ugc.aweme.story.base.view.MaterialProgressDrawable$a r0 = r3.f71968c
            r0.a((int) r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.base.view.StorySwipeRefreshLayout.setColorSchemeColors(int[]):void");
    }

    public void setRefreshing(boolean z2) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f71991b, false, 82469, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f71991b, false, 82469, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!z2 || this.f71993d == z2) {
            a(z2, false);
        } else {
            this.f71993d = z2;
            if (!this.n) {
                i2 = this.k + this.j;
            } else {
                i2 = this.k;
            }
            a(i2 - this.f71994e, true);
            this.m = false;
            Animation.AnimationListener animationListener = this.Q;
            if (PatchProxy.isSupport(new Object[]{animationListener}, this, f71991b, false, 82470, new Class[]{Animation.AnimationListener.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animationListener}, this, f71991b, false, 82470, new Class[]{Animation.AnimationListener.class}, Void.TYPE);
            } else {
                this.g.setVisibility(0);
                if (Build.VERSION.SDK_INT >= 11) {
                    this.l.setAlpha(255);
                }
                this.J = new Animation() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f71996a;

                    public final void applyTransformation(float f2, Transformation transformation) {
                        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), transformation}, this, f71996a, false, 82516, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), transformation}, this, f71996a, false, 82516, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE);
                            return;
                        }
                        StorySwipeRefreshLayout.this.setAnimationProgress(f2);
                    }
                };
                this.J.setDuration((long) this.A);
                if (animationListener != null) {
                    this.g.setAnimationListener(animationListener);
                }
                this.g.clearAnimation();
                this.g.startAnimation(this.J);
            }
        }
    }

    @SuppressLint({"NewApi"})
    private void b(float f2) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f71991b, false, 82505, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f71991b, false, 82505, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.l.a(true);
        float min = Math.min(1.0f, Math.abs(f2 / this.s));
        double d2 = (double) min;
        Double.isNaN(d2);
        float max = (Math.max((float) (d2 - 0.4d), 0.0f) * 5.0f) / 3.0f;
        float abs = Math.abs(f2) - this.s;
        if (this.n) {
            i2 = this.k - this.j;
        } else {
            i2 = this.k;
        }
        float f3 = (float) i2;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f3 * 2.0f) / f3) / 4.0f);
        double pow = Math.pow(max2, 2.0d);
        Double.isNaN(max2);
        float f4 = ((float) (max2 - pow)) * 2.0f;
        int i3 = this.j + ((int) ((f3 * min) + (f3 * f4 * 2.0f)));
        if (this.g.getVisibility() != 0) {
            this.g.setVisibility(0);
        }
        if (!this.f71995f) {
            ViewCompat.setScaleX(this.g, 1.0f);
            ViewCompat.setScaleY(this.g, 1.0f);
        }
        if (this.f71995f) {
            setAnimationProgress(Math.min(1.0f, f2 / this.s));
        }
        if (f2 < this.s) {
            if (this.l.getAlpha() > 76 && !a(this.L)) {
                c();
            }
        } else if (this.l.getAlpha() < 255 && !a(this.M)) {
            d();
        }
        this.l.a(0.0f, Math.min(0.8f, max * 0.8f));
        this.l.a(Math.min(1.0f, max));
        this.l.b((((max * 0.4f) - 16.0f) + (f4 * 2.0f)) * 0.5f);
        a(i3 - this.f71994e, true);
        this.o.a(min);
    }

    private void a(MotionEvent motionEvent) {
        int i2 = 1;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f71991b, false, 82514, new Class[]{MotionEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f71991b, false, 82514, new Class[]{MotionEvent.class}, Void.TYPE);
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
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f71991b, false, 82476, new Class[]{Integer.TYPE, Integer.TYPE}, Animation.class)) {
            return (Animation) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f71991b, false, 82476, new Class[]{Integer.TYPE, Integer.TYPE}, Animation.class);
        } else if (this.f71995f && b()) {
            return null;
        } else {
            AnonymousClass3 r0 = new Animation() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f72000a;

                public final void applyTransformation(float f2, Transformation transformation) {
                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), transformation}, this, f72000a, false, 82518, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), transformation}, this, f72000a, false, 82518, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE);
                        return;
                    }
                    StorySwipeRefreshLayout.this.l.setAlpha((int) (((float) i2) + (((float) (i3 - i2)) * f2)));
                }
            };
            r0.setDuration(300);
            this.g.setAnimationListener(null);
            this.g.clearAnimation();
            this.g.startAnimation(r0);
            return r0;
        }
    }

    private void b(int i2, Animation.AnimationListener animationListener) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), animationListener}, this, f71991b, false, 82510, new Class[]{Integer.TYPE, Animation.AnimationListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), animationListener}, this, f71991b, false, 82510, new Class[]{Integer.TYPE, Animation.AnimationListener.class}, Void.TYPE);
            return;
        }
        this.o.b(i2, animationListener);
        if (this.f71995f) {
            c(i2, animationListener);
            return;
        }
        this.h = i2;
        this.S.reset();
        this.S.setDuration(200);
        this.S.setInterpolator(this.G);
        if (animationListener != null) {
            this.g.setAnimationListener(animationListener);
        }
        this.g.clearAnimation();
        this.g.startAnimation(this.S);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        if (!PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f71991b, false, 82503, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return this.w.dispatchNestedPreFling(f2, f3);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f71991b, false, 82503, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
    }

    @SuppressLint({"NewApi"})
    private void c(int i2, Animation.AnimationListener animationListener) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), animationListener}, this, f71991b, false, 82512, new Class[]{Integer.TYPE, Animation.AnimationListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), animationListener}, this, f71991b, false, 82512, new Class[]{Integer.TYPE, Animation.AnimationListener.class}, Void.TYPE);
            return;
        }
        this.h = i2;
        if (b()) {
            this.i = (float) this.l.getAlpha();
        } else {
            this.i = ViewCompat.getScaleX(this.g);
        }
        this.N = new Animation() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72006a;

            public final void applyTransformation(float f2, Transformation transformation) {
                if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), transformation}, this, f72006a, false, 82522, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), transformation}, this, f72006a, false, 82522, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE);
                    return;
                }
                StorySwipeRefreshLayout.this.setAnimationProgress(StorySwipeRefreshLayout.this.i + ((-StorySwipeRefreshLayout.this.i) * f2));
                StorySwipeRefreshLayout.this.a(f2);
            }
        };
        this.N.setDuration(150);
        if (animationListener != null) {
            this.g.setAnimationListener(animationListener);
        }
        this.g.clearAnimation();
        this.g.startAnimation(this.N);
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f71991b, false, 82483, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f71991b, false, 82483, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
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
                if (this.t) {
                    throw e2;
                }
            }
            this.g.measure(View.MeasureSpec.makeMeasureSpec(this.O, 1073741824), View.MeasureSpec.makeMeasureSpec(this.O, 1073741824));
            this.I = -1;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                if (getChildAt(i4) == this.g) {
                    this.I = i4;
                    return;
                }
            }
        }
    }

    private void a(int i2, Animation.AnimationListener animationListener) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), animationListener}, this, f71991b, false, 82509, new Class[]{Integer.TYPE, Animation.AnimationListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), animationListener}, this, f71991b, false, 82509, new Class[]{Integer.TYPE, Animation.AnimationListener.class}, Void.TYPE);
            return;
        }
        this.o.a(i2, animationListener);
        this.h = i2;
        this.R.reset();
        this.R.setDuration(200);
        this.R.setInterpolator(this.G);
        if (animationListener != null) {
            this.g.setAnimationListener(animationListener);
        }
        this.g.clearAnimation();
        this.g.startAnimation(this.R);
    }

    private void a(int i2, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f71991b, false, 82513, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2)}, this, f71991b, false, 82513, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.g.bringToFront();
        ViewCompat.offsetTopAndBottom(this.g, i2);
        this.f71994e = this.g.getTop();
        if (z2 && Build.VERSION.SDK_INT < 11) {
            invalidate();
        }
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        if (!PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f71991b, false, 82502, new Class[]{Float.TYPE, Float.TYPE, Boolean.TYPE}, Boolean.TYPE)) {
            return this.w.dispatchNestedFling(f2, f3, z2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Byte.valueOf(z2)}, this, f71991b, false, 82502, new Class[]{Float.TYPE, Float.TYPE, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        if (!PatchProxy.isSupport(new Object[]{view, Float.valueOf(f2), Float.valueOf(f3)}, this, f71991b, false, 82500, new Class[]{View.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return dispatchNestedPreFling(f2, f3);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, Float.valueOf(f2), Float.valueOf(f3)}, this, f71991b, false, 82500, new Class[]{View.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        View view3 = view;
        View view4 = view2;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{view3, view4, Integer.valueOf(i2)}, this, f71991b, false, 82488, new Class[]{View.class, View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view3, view4, Integer.valueOf(i2)}, this, f71991b, false, 82488, new Class[]{View.class, View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.v.onNestedScrollAccepted(view3, view4, i3);
        startNestedScroll(i3 & 2);
        this.u = 0.0f;
        this.z = true;
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if (PatchProxy.isSupport(new Object[]{view, view2, Integer.valueOf(i2)}, this, f71991b, false, 82487, new Class[]{View.class, View.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, view2, Integer.valueOf(i2)}, this, f71991b, false, 82487, new Class[]{View.class, View.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (!isEnabled() || this.F || this.f71993d || (i2 & 2) == 0) {
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
            com.meituan.robust.ChangeQuickRedirect r5 = f71991b
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
            r7 = 82499(0x14243, float:1.15606E-40)
            r4 = r21
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0079
            java.lang.Object[] r14 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r22)
            r14[r10] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r23)
            r14[r11] = r3
            r14[r12] = r0
            r14[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r16 = f71991b
            r17 = 0
            r18 = 82499(0x14243, float:1.15606E-40)
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
        L_0x0079:
            r2 = r21
            android.support.v4.view.NestedScrollingChildHelper r3 = r2.w
            r4 = r22
            r5 = r23
            boolean r0 = r3.dispatchNestedPreScroll(r4, r5, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.base.view.StorySwipeRefreshLayout.dispatchNestedPreScroll(int, int, int[], int[]):boolean");
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!PatchProxy.isSupport(new Object[]{view, Float.valueOf(f2), Float.valueOf(f3), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f71991b, false, 82501, new Class[]{View.class, Float.TYPE, Float.TYPE, Boolean.TYPE}, Boolean.TYPE)) {
            return dispatchNestedFling(f2, f3, z2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, Float.valueOf(f2), Float.valueOf(f3), Byte.valueOf(z2)}, this, f71991b, false, 82501, new Class[]{View.class, Float.TYPE, Float.TYPE, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        int i4 = i3;
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3), iArr}, this, f71991b, false, 82489, new Class[]{View.class, Integer.TYPE, Integer.TYPE, int[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3), iArr}, this, f71991b, false, 82489, new Class[]{View.class, Integer.TYPE, Integer.TYPE, int[].class}, Void.TYPE);
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
        if (this.n && i4 > 0 && this.u == 0.0f && Math.abs(i4 - iArr[1]) > 0) {
            this.g.setVisibility(8);
        }
        int[] iArr2 = this.x;
        if (dispatchNestedPreScroll(i2 - iArr[0], i4 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), iArr}, this, f71991b, false, 82498, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, int[].class}, Boolean.TYPE)) {
            return this.w.dispatchNestedScroll(i2, i3, i4, i5, iArr);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), iArr}, this, f71991b, false, 82498, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, int[].class}, Boolean.TYPE)).booleanValue();
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f71991b, false, 82482, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f71991b, false, 82482, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
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
                    if (this.t) {
                        throw exc;
                    }
                }
                int measuredWidth2 = this.g.getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int i7 = measuredWidth2 / 2;
                this.g.layout(i6 - i7, this.f71994e, i6 + i7, this.f71994e + this.g.getMeasuredHeight());
            }
        }
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f71991b, false, 82492, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f71991b, false, 82492, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
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
