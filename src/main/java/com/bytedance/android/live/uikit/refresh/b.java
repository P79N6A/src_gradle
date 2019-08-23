package com.bytedance.android.live.uikit.refresh;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v4.view.MotionEventCompat;
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
import com.bytedance.android.live.uikit.refresh.MaterialProgressDrawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class b extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8625a = null;
    private static final String n = "b";
    private static final int[] z = {16842766};
    private int A;
    private Animation B;
    private Animation C;
    private Animation D;
    private Animation E;
    private Animation F;
    private int G;
    private int H;
    private Animation.AnimationListener I;
    private final Animation J;
    private final Animation K;

    /* renamed from: b  reason: collision with root package name */
    public C0070b f8626b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8627c;

    /* renamed from: d  reason: collision with root package name */
    public int f8628d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8629e;

    /* renamed from: f  reason: collision with root package name */
    public a f8630f;
    protected int g;
    public float h;
    protected int i;
    public MaterialProgressDrawable j;
    public float k;
    public boolean l;
    public boolean m;
    private View o;
    private a p;
    private int q;
    private float r;
    private int s;
    private boolean t;
    private float u;
    private boolean v;
    private int w;
    private boolean x;
    private final DecelerateInterpolator y;

    public interface a {
        void a();

        void b();
    }

    /* renamed from: com.bytedance.android.live.uikit.refresh.b$b  reason: collision with other inner class name */
    public interface C0070b {
        void a();
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
    }

    public final void a(Animation.AnimationListener animationListener) {
        if (PatchProxy.isSupport(new Object[]{animationListener}, this, f8625a, false, 2160, new Class[]{Animation.AnimationListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{animationListener}, this, f8625a, false, 2160, new Class[]{Animation.AnimationListener.class}, Void.TYPE);
            return;
        }
        this.C = new Animation() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f8635a;

            public final void applyTransformation(float f2, Transformation transformation) {
                if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), transformation}, this, f8635a, false, 2183, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), transformation}, this, f8635a, false, 2183, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE);
                    return;
                }
                b.this.setAnimationProgress(1.0f - f2);
            }
        };
        this.C.setDuration(150);
        this.f8630f.setAnimationListener(animationListener);
        this.f8630f.clearAnimation();
        this.f8630f.startAnimation(this.C);
    }

    private boolean a(Animation animation) {
        if (!PatchProxy.isSupport(new Object[]{animation}, this, f8625a, false, 2173, new Class[]{Animation.class}, Boolean.TYPE)) {
            return animation != null && animation.hasStarted() && !animation.hasEnded();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{animation}, this, f8625a, false, 2173, new Class[]{Animation.class}, Boolean.TYPE)).booleanValue();
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f8625a, false, 2177, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f8625a, false, 2177, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        a((this.g + ((int) (((float) (this.i - this.g)) * f2))) - this.f8630f.getTop(), false);
    }

    public final void a(int i2, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f8625a, false, 2179, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2)}, this, f8625a, false, 2179, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f8630f.bringToFront();
        this.f8630f.offsetTopAndBottom(i2);
        this.f8628d = this.f8630f.getTop();
        if (z2 && Build.VERSION.SDK_INT < 11) {
            invalidate();
        }
    }

    private static boolean a() {
        if (Build.VERSION.SDK_INT < 11) {
            return true;
        }
        return false;
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f8625a, false, 2167, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8625a, false, 2167, new Class[0], Void.TYPE);
            return;
        }
        if (this.o == null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (!childAt.equals(this.f8630f)) {
                    this.o = childAt;
                    return;
                }
            }
        }
    }

    private boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f8625a, false, 2170, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f8625a, false, 2170, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (Build.VERSION.SDK_INT >= 14) {
            return ViewCompat.canScrollVertically(this.o, -1);
        } else {
            if (this.o instanceof AbsListView) {
                AbsListView absListView = (AbsListView) this.o;
                if (absListView.getChildCount() <= 0 || (absListView.getFirstVisiblePosition() <= 0 && absListView.getChildAt(0).getTop() >= absListView.getPaddingTop())) {
                    return false;
                }
                return true;
            } else if (this.o.getScrollY() > 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setDistanceToTriggerSync(int i2) {
        this.r = (float) i2;
    }

    public void setOnRefreshListener(C0070b bVar) {
        this.f8626b = bVar;
    }

    public void setStartEndRefreshListener(a aVar) {
        this.p = aVar;
    }

    public b(Context context) {
        this(context, null);
    }

    public void setAnimationProgress(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f8625a, false, 2158, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f8625a, false, 2158, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (a()) {
            setColorViewAlpha((int) (255.0f * f2));
        } else {
            ViewCompat.setScaleX(this.f8630f, f2);
            ViewCompat.setScaleY(this.f8630f, f2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setColorSchemeColors(int... r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f8625a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<int[]> r3 = int[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 2166(0x876, float:3.035E-42)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f8625a
            r13 = 0
            r14 = 2166(0x876, float:3.035E-42)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<int[]> r0 = int[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0034:
            r17.b()
            r2 = r17
            com.bytedance.android.live.uikit.refresh.MaterialProgressDrawable r3 = r2.j
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.live.uikit.refresh.MaterialProgressDrawable.f8594a
            r13 = 0
            r14 = 2195(0x893, float:3.076E-42)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<int[]> r4 = int[].class
            r15[r9] = r4
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r3
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r4 == 0) goto L_0x0069
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.live.uikit.refresh.MaterialProgressDrawable.f8594a
            r13 = 0
            r14 = 2195(0x893, float:3.076E-42)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<int[]> r0 = int[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0069:
            com.bytedance.android.live.uikit.refresh.MaterialProgressDrawable$b r1 = r3.f8597d
            r1.a((int[]) r0)
            com.bytedance.android.live.uikit.refresh.MaterialProgressDrawable$b r0 = r3.f8597d
            r0.k = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.uikit.refresh.b.setColorSchemeColors(int[]):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setColorSchemeResources(int... r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f8625a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<int[]> r3 = int[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 2165(0x875, float:3.034E-42)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f8625a
            r13 = 0
            r14 = 2165(0x875, float:3.034E-42)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<int[]> r0 = int[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0034:
            android.content.res.Resources r1 = r17.getResources()
            int r2 = r0.length
            int[] r2 = new int[r2]
        L_0x003b:
            int r3 = r0.length
            if (r9 >= r3) goto L_0x0049
            r3 = r0[r9]
            int r3 = r1.getColor(r3)
            r2[r9] = r3
            int r9 = r9 + 1
            goto L_0x003b
        L_0x0049:
            r3 = r17
            r3.setColorSchemeColors(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.uikit.refresh.b.setColorSchemeResources(int[]):void");
    }

    public void setColorViewAlpha(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8625a, false, 2151, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8625a, false, 2151, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f8630f.getBackground().setAlpha(i2);
        this.j.setAlpha(i2);
    }

    public void setProgressBackgroundColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8625a, false, 2164, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8625a, false, 2164, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f8630f.setBackgroundColor(i2);
        this.j.b(getResources().getColor(i2));
    }

    public void setSize(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8625a, false, 2154, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8625a, false, 2154, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 == 0 || i2 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i2 == 0) {
                int i3 = (int) (displayMetrics.density * 56.0f);
                this.G = i3;
                this.H = i3;
            } else {
                int i4 = (int) (displayMetrics.density * 40.0f);
                this.G = i4;
                this.H = i4;
            }
            this.f8630f.setImageDrawable(null);
            this.j.a(i2);
            this.f8630f.setImageDrawable(this.j);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f8625a, false, 2171, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f8625a, false, 2171, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        b();
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (this.x && actionMasked == 0) {
            this.x = false;
        }
        if (!isEnabled() || this.x || c() || this.f8627c) {
            return false;
        }
        if (actionMasked != 6) {
            switch (actionMasked) {
                case 0:
                    a(this.i - this.f8630f.getTop(), true);
                    this.w = MotionEventCompat.getPointerId(motionEvent, 0);
                    this.v = false;
                    float a2 = a(motionEvent, this.w);
                    if (a2 != -1.0f) {
                        this.u = a2;
                        break;
                    } else {
                        return false;
                    }
                case 1:
                case 3:
                    this.v = false;
                    if (this.p != null) {
                        this.p.b();
                    }
                    this.w = -1;
                    break;
                case 2:
                    break;
            }
            if (this.w == -1) {
                return false;
            }
            float a3 = a(motionEvent, this.w);
            if (a3 == -1.0f) {
                return false;
            }
            if (a3 - this.u > ((float) this.q) && !this.v) {
                this.v = true;
                if (this.p != null) {
                    this.p.a();
                }
                this.j.setAlpha(76);
            }
        } else {
            a(motionEvent);
        }
        return this.v;
    }

    public void setRefreshing(boolean z2) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f8625a, false, 2156, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f8625a, false, 2156, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!z2 || this.f8627c == z2) {
            a(z2, false);
        } else {
            this.f8627c = z2;
            if (!this.m) {
                i2 = (int) (this.k + ((float) this.i));
            } else {
                i2 = (int) this.k;
            }
            a(i2 - this.f8628d, true);
            this.l = false;
            Animation.AnimationListener animationListener = this.I;
            if (PatchProxy.isSupport(new Object[]{animationListener}, this, f8625a, false, 2157, new Class[]{Animation.AnimationListener.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animationListener}, this, f8625a, false, 2157, new Class[]{Animation.AnimationListener.class}, Void.TYPE);
            } else {
                this.f8630f.setVisibility(0);
                if (Build.VERSION.SDK_INT >= 11) {
                    this.j.setAlpha(255);
                }
                this.B = new Animation() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f8633a;

                    public final void applyTransformation(float f2, Transformation transformation) {
                        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), transformation}, this, f8633a, false, 2182, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), transformation}, this, f8633a, false, 2182, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE);
                            return;
                        }
                        b.this.setAnimationProgress(f2);
                    }
                };
                this.B.setDuration((long) this.s);
                if (animationListener != null) {
                    this.f8630f.setAnimationListener(animationListener);
                }
                this.f8630f.clearAnimation();
                this.f8630f.startAnimation(this.B);
            }
        }
    }

    private void a(MotionEvent motionEvent) {
        int i2 = 1;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f8625a, false, 2180, new Class[]{MotionEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f8625a, false, 2180, new Class[]{MotionEvent.class}, Void.TYPE);
            return;
        }
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (MotionEventCompat.getPointerId(motionEvent, actionIndex) == this.w) {
            if (actionIndex != 0) {
                i2 = 0;
            }
            this.w = MotionEventCompat.getPointerId(motionEvent, i2);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f2;
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f8625a, false, 2174, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f8625a, false, 2174, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (this.x && actionMasked == 0) {
            this.x = false;
        }
        if (!isEnabled() || this.x || c()) {
            return false;
        }
        switch (actionMasked) {
            case 0:
                this.w = MotionEventCompat.getPointerId(motionEvent2, 0);
                this.v = false;
                break;
            case 1:
            case 3:
                if (this.w == -1) {
                    return false;
                }
                try {
                    float y2 = MotionEventCompat.getY(motionEvent2, MotionEventCompat.findPointerIndex(motionEvent2, this.w));
                    this.v = false;
                    if ((y2 - this.u) * 0.5f > this.r) {
                        a(true, true);
                    } else {
                        this.f8627c = false;
                        this.j.a(0.0f, 0.0f);
                        AnonymousClass5 r0 = null;
                        if (!this.f8629e) {
                            r0 = new Animation.AnimationListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f8641a;

                                public final void onAnimationRepeat(Animation animation) {
                                }

                                public final void onAnimationStart(Animation animation) {
                                }

                                public final void onAnimationEnd(Animation animation) {
                                    if (PatchProxy.isSupport(new Object[]{animation}, this, f8641a, false, 2185, new Class[]{Animation.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{animation}, this, f8641a, false, 2185, new Class[]{Animation.class}, Void.TYPE);
                                        return;
                                    }
                                    if (!b.this.f8629e) {
                                        b.this.a((Animation.AnimationListener) null);
                                    }
                                }
                            };
                        }
                        AnonymousClass5 r8 = r0;
                        int i2 = this.f8628d;
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), r8}, this, f8625a, false, 2176, new Class[]{Integer.TYPE, Animation.AnimationListener.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), r8}, this, f8625a, false, 2176, new Class[]{Integer.TYPE, Animation.AnimationListener.class}, Void.TYPE);
                        } else if (this.f8629e) {
                            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), r8}, this, f8625a, false, 2178, new Class[]{Integer.TYPE, Animation.AnimationListener.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), r8}, this, f8625a, false, 2178, new Class[]{Integer.TYPE, Animation.AnimationListener.class}, Void.TYPE);
                            } else {
                                this.g = i2;
                                if (a()) {
                                    this.h = (float) this.j.getAlpha();
                                } else {
                                    this.h = ViewCompat.getScaleX(this.f8630f);
                                }
                                this.F = new Animation() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f8647a;

                                    public final void applyTransformation(float f2, Transformation transformation) {
                                        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), transformation}, this, f8647a, false, 2188, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), transformation}, this, f8647a, false, 2188, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE);
                                            return;
                                        }
                                        b.this.setAnimationProgress(b.this.h + ((-b.this.h) * f2));
                                        b.this.a(f2);
                                    }
                                };
                                this.F.setDuration(150);
                                if (r8 != null) {
                                    this.f8630f.setAnimationListener(r8);
                                }
                                this.f8630f.clearAnimation();
                                this.f8630f.startAnimation(this.F);
                            }
                        } else {
                            this.g = i2;
                            this.K.reset();
                            this.K.setDuration(200);
                            this.K.setInterpolator(this.y);
                            if (r8 != null) {
                                this.f8630f.setAnimationListener(r8);
                            }
                            this.f8630f.clearAnimation();
                            this.f8630f.startAnimation(this.K);
                        }
                        this.j.a(false);
                        if (this.p != null) {
                            this.p.b();
                        }
                    }
                    this.w = -1;
                    return false;
                } catch (Exception unused) {
                    return true;
                }
            case 2:
                int findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent2, this.w);
                if (findPointerIndex < 0) {
                    return false;
                }
                try {
                    float y3 = (MotionEventCompat.getY(motionEvent2, findPointerIndex) - this.u) * 0.5f;
                    if (this.v) {
                        this.j.a(true);
                        float f3 = y3 / this.r;
                        if (f3 >= 0.0f) {
                            float min = Math.min(1.0f, Math.abs(f3));
                            double d2 = (double) min;
                            Double.isNaN(d2);
                            float max = (Math.max((float) (d2 - 0.4d), 0.0f) * 5.0f) / 3.0f;
                            float abs = Math.abs(y3) - this.r;
                            if (this.m) {
                                f2 = this.k - ((float) this.i);
                            } else {
                                f2 = this.k;
                            }
                            double max2 = (double) (Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2) / 4.0f);
                            double pow = Math.pow(max2, 2.0d);
                            Double.isNaN(max2);
                            float f4 = ((float) (max2 - pow)) * 2.0f;
                            int i3 = this.i + ((int) ((f2 * min) + (f2 * f4 * 2.0f)));
                            if (this.f8630f.getVisibility() != 0) {
                                this.f8630f.setVisibility(0);
                            }
                            if (!this.f8629e) {
                                ViewCompat.setScaleX(this.f8630f, 1.0f);
                                ViewCompat.setScaleY(this.f8630f, 1.0f);
                            }
                            if (y3 < this.r) {
                                if (this.f8629e) {
                                    setAnimationProgress(y3 / this.r);
                                }
                                if (this.j.getAlpha() > 76 && !a(this.D)) {
                                    if (PatchProxy.isSupport(new Object[0], this, f8625a, false, 2161, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f8625a, false, 2161, new Class[0], Void.TYPE);
                                    } else {
                                        this.D = a(this.j.getAlpha(), 76);
                                    }
                                }
                                this.j.a(0.0f, Math.min(0.8f, max * 0.8f));
                                MaterialProgressDrawable materialProgressDrawable = this.j;
                                float min2 = Math.min(1.0f, max);
                                Object[] objArr = {Float.valueOf(min2)};
                                if (PatchProxy.isSupport(objArr, materialProgressDrawable, MaterialProgressDrawable.f8594a, false, 2192, new Class[]{Float.TYPE}, Void.TYPE)) {
                                    Object[] objArr2 = {Float.valueOf(min2)};
                                    Object[] objArr3 = objArr2;
                                    MaterialProgressDrawable materialProgressDrawable2 = materialProgressDrawable;
                                    PatchProxy.accessDispatch(objArr3, materialProgressDrawable2, MaterialProgressDrawable.f8594a, false, 2192, new Class[]{Float.TYPE}, Void.TYPE);
                                } else {
                                    MaterialProgressDrawable.b bVar = materialProgressDrawable.f8597d;
                                    Object[] objArr4 = {Float.valueOf(min2)};
                                    if (PatchProxy.isSupport(objArr4, bVar, MaterialProgressDrawable.b.f8609a, false, 2219, new Class[]{Float.TYPE}, Void.TYPE)) {
                                        Object[] objArr5 = {Float.valueOf(min2)};
                                        Object[] objArr6 = objArr5;
                                        MaterialProgressDrawable.b bVar2 = bVar;
                                        PatchProxy.accessDispatch(objArr6, bVar2, MaterialProgressDrawable.b.f8609a, false, 2219, new Class[]{Float.TYPE}, Void.TYPE);
                                    } else if (min2 != bVar.q) {
                                        bVar.q = min2;
                                        bVar.c();
                                    }
                                }
                            } else if (this.j.getAlpha() < 255 && !a(this.E)) {
                                if (PatchProxy.isSupport(new Object[0], this, f8625a, false, 2162, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f8625a, false, 2162, new Class[0], Void.TYPE);
                                } else {
                                    this.E = a(this.j.getAlpha(), 255);
                                }
                            }
                            float f5 = (((max * 0.4f) - 16.0f) + (f4 * 2.0f)) * 0.5f;
                            MaterialProgressDrawable materialProgressDrawable3 = this.j;
                            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f5)}, materialProgressDrawable3, MaterialProgressDrawable.f8594a, false, 2194, new Class[]{Float.TYPE}, Void.TYPE)) {
                                MaterialProgressDrawable materialProgressDrawable4 = materialProgressDrawable3;
                                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f5)}, materialProgressDrawable4, MaterialProgressDrawable.f8594a, false, 2194, new Class[]{Float.TYPE}, Void.TYPE);
                            } else {
                                materialProgressDrawable3.f8597d.c(f5);
                            }
                            a(i3 - this.f8628d, true);
                            break;
                        } else {
                            return false;
                        }
                    }
                } catch (Exception unused2) {
                    return true;
                }
                break;
            case 5:
                this.w = MotionEventCompat.getPointerId(motionEvent2, MotionEventCompat.getActionIndex(motionEvent));
                break;
            case 6:
                a(motionEvent);
                break;
        }
        return true;
    }

    public int getChildDrawingOrder(int i2, int i3) {
        if (this.A < 0) {
            return i3;
        }
        if (i3 == i2 - 1) {
            return this.A;
        }
        if (i3 >= this.A) {
            return i3 + 1;
        }
        return i3;
    }

    private float a(MotionEvent motionEvent, int i2) {
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{motionEvent2, Integer.valueOf(i2)}, this, f8625a, false, 2172, new Class[]{MotionEvent.class, Integer.TYPE}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{motionEvent2, Integer.valueOf(i2)}, this, f8625a, false, 2172, new Class[]{MotionEvent.class, Integer.TYPE}, Float.TYPE)).floatValue();
        }
        int findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, i2);
        if (findPointerIndex < 0) {
            return -1.0f;
        }
        return MotionEventCompat.getY(motionEvent2, findPointerIndex);
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.r = -1.0f;
        this.w = -1;
        this.A = -1;
        this.I = new Animation.AnimationListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f8631a;

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                if (PatchProxy.isSupport(new Object[]{animation}, this, f8631a, false, 2181, new Class[]{Animation.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animation}, this, f8631a, false, 2181, new Class[]{Animation.class}, Void.TYPE);
                    return;
                }
                if (b.this.f8627c) {
                    b.this.j.setAlpha(255);
                    b.this.j.start();
                    if (b.this.l && b.this.f8626b != null) {
                        b.this.f8626b.a();
                    }
                } else {
                    b.this.j.stop();
                    b.this.f8630f.setVisibility(8);
                    b.this.setColorViewAlpha(255);
                    if (b.this.f8629e) {
                        b.this.setAnimationProgress(0.0f);
                    } else {
                        b.this.a(b.this.i - b.this.f8628d, true);
                    }
                }
                b.this.f8628d = b.this.f8630f.getTop();
            }
        };
        this.J = new Animation() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f8643a;

            public final void applyTransformation(float f2, Transformation transformation) {
                int i;
                if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), transformation}, this, f8643a, false, 2186, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), transformation}, this, f8643a, false, 2186, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE);
                    return;
                }
                if (!b.this.m) {
                    i = (int) (b.this.k - ((float) Math.abs(b.this.i)));
                } else {
                    i = (int) b.this.k;
                }
                b.this.a((b.this.g + ((int) (((float) (i - b.this.g)) * f2))) - b.this.f8630f.getTop(), false);
            }
        };
        this.K = new Animation() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f8645a;

            public final void applyTransformation(float f2, Transformation transformation) {
                if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), transformation}, this, f8645a, false, 2187, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), transformation}, this, f8645a, false, 2187, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE);
                    return;
                }
                b.this.a(f2);
            }
        };
        this.q = ViewConfiguration.get(context).getScaledTouchSlop();
        this.s = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.y = new DecelerateInterpolator(2.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.G = (int) (displayMetrics.density * 40.0f);
        this.H = (int) (displayMetrics.density * 40.0f);
        if (PatchProxy.isSupport(new Object[0], this, f8625a, false, 2155, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8625a, false, 2155, new Class[0], Void.TYPE);
        } else {
            this.f8630f = new a(getContext(), -328966, 20.0f);
            this.j = new MaterialProgressDrawable(getContext(), this);
            this.j.b(-328966);
            this.f8630f.setImageDrawable(this.j);
            this.f8630f.setVisibility(8);
            addView(this.f8630f);
        }
        ViewCompat.setChildrenDrawingOrderEnabled(this, true);
        this.k = displayMetrics.density * 64.0f;
        this.r = this.k;
    }

    private Animation a(final int i2, final int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f8625a, false, 2163, new Class[]{Integer.TYPE, Integer.TYPE}, Animation.class)) {
            return (Animation) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f8625a, false, 2163, new Class[]{Integer.TYPE, Integer.TYPE}, Animation.class);
        } else if (this.f8629e && a()) {
            return null;
        } else {
            AnonymousClass4 r0 = new Animation() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f8637a;

                public final void applyTransformation(float f2, Transformation transformation) {
                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), transformation}, this, f8637a, false, 2184, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), transformation}, this, f8637a, false, 2184, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE);
                        return;
                    }
                    b.this.j.setAlpha((int) (((float) i2) + (((float) (i3 - i2)) * f2)));
                }
            };
            r0.setDuration(300);
            this.f8630f.setAnimationListener(null);
            this.f8630f.clearAnimation();
            this.f8630f.startAnimation(r0);
            return r0;
        }
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f8625a, false, 2169, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f8625a, false, 2169, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
        if (this.o == null) {
            b();
        }
        if (this.o != null) {
            this.o.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.f8630f.measure(View.MeasureSpec.makeMeasureSpec(this.G, 1073741824), View.MeasureSpec.makeMeasureSpec(this.H, 1073741824));
            if (!this.m && !this.t) {
                this.t = true;
                int i4 = -this.f8630f.getMeasuredHeight();
                this.i = i4;
                this.f8628d = i4;
            }
            this.A = -1;
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                if (getChildAt(i5) == this.f8630f) {
                    this.A = i5;
                    return;
                }
            }
        }
    }

    private void a(int i2, Animation.AnimationListener animationListener) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), animationListener}, this, f8625a, false, 2175, new Class[]{Integer.TYPE, Animation.AnimationListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), animationListener}, this, f8625a, false, 2175, new Class[]{Integer.TYPE, Animation.AnimationListener.class}, Void.TYPE);
            return;
        }
        this.g = i2;
        this.J.reset();
        this.J.setDuration(200);
        this.J.setInterpolator(this.y);
        if (animationListener != null) {
            this.f8630f.setAnimationListener(animationListener);
        }
        this.f8630f.clearAnimation();
        this.f8630f.startAnimation(this.J);
    }

    private void a(boolean z2, boolean z3) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f8625a, false, 2159, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Byte.valueOf(z3)}, this, f8625a, false, 2159, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f8627c != z2) {
            this.l = z3;
            b();
            this.f8627c = z2;
            if (this.f8627c) {
                a(this.f8628d, this.I);
                return;
            }
            a(this.I);
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f8625a, false, 2168, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f8625a, false, 2168, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.o == null) {
                b();
            }
            if (this.o != null) {
                View view = this.o;
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.f8630f.getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int i7 = measuredWidth2 / 2;
                this.f8630f.layout(i6 - i7, this.f8628d, i6 + i7, this.f8628d + this.f8630f.getMeasuredHeight());
            }
        }
    }
}
