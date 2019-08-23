package com.ss.android.ugc.aweme.poi.sothree.slidinguppanel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.VelocityTrackerCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ListView;
import android.widget.ScrollView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.R$styleable;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.poi.sothree.slidinguppanel.b;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SlidingUpPanelLayout extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60361a = null;
    private static final String r = "SlidingUpPanelLayout";
    private static d s = d.COLLAPSED;
    private static final int[] t = {16842927};
    private a A;
    private float B;
    private boolean C;
    private float D;
    private float E;
    private float F;
    private float G;
    private boolean H;
    private final List<Object> I;
    private View.OnClickListener J;
    private boolean K;
    private final Rect L;

    /* renamed from: b  reason: collision with root package name */
    int f60362b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f60363c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f60364d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f60365e;

    /* renamed from: f  reason: collision with root package name */
    public View f60366f;
    View g;
    public c h;
    public d i;
    d j;
    public float k;
    public int l;
    public float m;
    public boolean n;
    public final b o;
    public boolean p;
    public float q;
    private int u;
    private int v;
    private View w;
    private int x;
    private View y;
    private int z;

    class a extends b.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60370a;

        public final int a() {
            return SlidingUpPanelLayout.this.l;
        }

        private a() {
        }

        public final boolean a(View view) {
            if (SlidingUpPanelLayout.this.n || view != SlidingUpPanelLayout.this.f60366f) {
                return false;
            }
            return true;
        }

        public final void b(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60370a, false, 65804, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60370a, false, 65804, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            SlidingUpPanelLayout.this.p = true;
            SlidingUpPanelLayout.this.postDelayed(new Runnable() {
                public final void run() {
                    SlidingUpPanelLayout.this.p = false;
                }
            }, (long) i);
        }

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60370a, false, 65799, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60370a, false, 65799, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (SlidingUpPanelLayout.this.o != null && SlidingUpPanelLayout.this.o.f60377b == 0) {
                SlidingUpPanelLayout.this.k = SlidingUpPanelLayout.this.a(SlidingUpPanelLayout.this.f60366f.getTop());
                SlidingUpPanelLayout.this.d();
                if (SlidingUpPanelLayout.this.k == 1.0f) {
                    SlidingUpPanelLayout.this.b();
                    SlidingUpPanelLayout.this.setPanelStateInternal(d.EXPANDED);
                } else if (SlidingUpPanelLayout.this.k == 0.0f) {
                    SlidingUpPanelLayout.this.setPanelStateInternal(d.COLLAPSED);
                } else if (SlidingUpPanelLayout.this.k < 0.0f) {
                    SlidingUpPanelLayout.this.setPanelStateInternal(d.HIDDEN);
                    SlidingUpPanelLayout.this.f60366f.setVisibility(4);
                } else {
                    SlidingUpPanelLayout.this.b();
                    SlidingUpPanelLayout.this.setPanelStateInternal(d.ANCHORED);
                }
            }
        }

        /* synthetic */ a(SlidingUpPanelLayout slidingUpPanelLayout, byte b2) {
            this();
        }

        public final void a(View view, int i) {
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f60370a, false, 65800, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f60370a, false, 65800, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            SlidingUpPanelLayout.this.c();
        }

        public final int a(View view, int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2)}, this, f60370a, false, 65803, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2)}, this, f60370a, false, 65803, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
            }
            int a2 = SlidingUpPanelLayout.this.a(0.0f);
            int a3 = SlidingUpPanelLayout.this.a(1.0f);
            float f2 = (float) i;
            if (f2 <= SlidingUpPanelLayout.this.q) {
                f2 = SlidingUpPanelLayout.this.q;
            }
            int i3 = (int) f2;
            if (SlidingUpPanelLayout.this.f60363c) {
                return Math.min(Math.max(i3, a3), a2);
            }
            return Math.min(Math.max(i3, a2), a3);
        }

        public final void a(View view, float f2, float f3) {
            float f4;
            int i;
            if (PatchProxy.isSupport(new Object[]{view, Float.valueOf(f2), Float.valueOf(f3)}, this, f60370a, false, 65802, new Class[]{View.class, Float.TYPE, Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, Float.valueOf(f2), Float.valueOf(f3)}, this, f60370a, false, 65802, new Class[]{View.class, Float.TYPE, Float.TYPE}, Void.TYPE);
                return;
            }
            if (SlidingUpPanelLayout.this.f60363c) {
                f4 = -f3;
            } else {
                f4 = f3;
            }
            if (f4 > 0.0f && SlidingUpPanelLayout.this.k <= SlidingUpPanelLayout.this.m) {
                i = SlidingUpPanelLayout.this.a(SlidingUpPanelLayout.this.m);
            } else if (f4 > 0.0f && SlidingUpPanelLayout.this.k > SlidingUpPanelLayout.this.m) {
                i = SlidingUpPanelLayout.this.a(1.0f - (SlidingUpPanelLayout.this.q / ((float) SlidingUpPanelLayout.this.l)));
            } else if (f4 >= 0.0f || SlidingUpPanelLayout.this.k < SlidingUpPanelLayout.this.m) {
                if (f4 >= 0.0f || SlidingUpPanelLayout.this.k >= SlidingUpPanelLayout.this.m) {
                    if (SlidingUpPanelLayout.this.k >= (SlidingUpPanelLayout.this.m + 1.0f) / 2.0f) {
                        i = SlidingUpPanelLayout.this.a(1.0f - (SlidingUpPanelLayout.this.q / ((float) SlidingUpPanelLayout.this.l)));
                    } else if (SlidingUpPanelLayout.this.k >= SlidingUpPanelLayout.this.m / 2.0f) {
                        i = SlidingUpPanelLayout.this.a(SlidingUpPanelLayout.this.m);
                    }
                }
                i = SlidingUpPanelLayout.this.a(0.0f);
            } else {
                i = SlidingUpPanelLayout.this.a(SlidingUpPanelLayout.this.m);
            }
            if (SlidingUpPanelLayout.this.o != null) {
                b bVar = SlidingUpPanelLayout.this.o;
                int left = view.getLeft();
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(left), Integer.valueOf(i)}, bVar, b.f60376a, false, 65815, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
                    b bVar2 = bVar;
                    ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(left), Integer.valueOf(i)}, bVar2, b.f60376a, false, 65815, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
                } else if (bVar.o) {
                    bVar.a(left, i, (int) VelocityTrackerCompat.getXVelocity(bVar.h, bVar.f60379d), (int) VelocityTrackerCompat.getYVelocity(bVar.h, bVar.f60379d));
                } else {
                    throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
                }
            }
            SlidingUpPanelLayout.this.invalidate();
            if (SlidingUpPanelLayout.this.h != null) {
                SlidingUpPanelLayout.this.h.a(i);
            }
        }

        public final void a(View view, int i, int i2, int i3, int i4) {
            int i5;
            int i6 = i2;
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f60370a, false, 65801, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f60370a, false, 65801, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            SlidingUpPanelLayout slidingUpPanelLayout = SlidingUpPanelLayout.this;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, slidingUpPanelLayout, SlidingUpPanelLayout.f60361a, false, 65788, new Class[]{Integer.TYPE}, Void.TYPE)) {
                SlidingUpPanelLayout slidingUpPanelLayout2 = slidingUpPanelLayout;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, slidingUpPanelLayout2, SlidingUpPanelLayout.f60361a, false, 65788, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                if (slidingUpPanelLayout.i != d.DRAGGING) {
                    slidingUpPanelLayout.j = slidingUpPanelLayout.i;
                }
                slidingUpPanelLayout.setPanelStateInternal(d.DRAGGING);
                slidingUpPanelLayout.k = slidingUpPanelLayout.a(i6);
                slidingUpPanelLayout.d();
                slidingUpPanelLayout.a(slidingUpPanelLayout.f60366f);
                b bVar = (b) slidingUpPanelLayout.g.getLayoutParams();
                int height = ((slidingUpPanelLayout.getHeight() - slidingUpPanelLayout.getPaddingBottom()) - slidingUpPanelLayout.getPaddingTop()) - slidingUpPanelLayout.f60362b;
                if (slidingUpPanelLayout.k <= 0.0f && !slidingUpPanelLayout.f60364d) {
                    if (slidingUpPanelLayout.f60363c) {
                        i5 = i6 - slidingUpPanelLayout.getPaddingBottom();
                    } else {
                        i5 = ((slidingUpPanelLayout.getHeight() - slidingUpPanelLayout.getPaddingBottom()) - slidingUpPanelLayout.f60366f.getMeasuredHeight()) - i6;
                    }
                    bVar.height = i5;
                    if (bVar.height == height) {
                        bVar.height = -1;
                    }
                    slidingUpPanelLayout.g.requestLayout();
                } else if (bVar.height != -1 && !slidingUpPanelLayout.f60364d) {
                    bVar.height = -1;
                    slidingUpPanelLayout.g.requestLayout();
                }
            }
            SlidingUpPanelLayout.this.invalidate();
        }
    }

    public static class b extends ViewGroup.MarginLayoutParams {

        /* renamed from: b  reason: collision with root package name */
        private static final int[] f60373b = {16843137};

        /* renamed from: a  reason: collision with root package name */
        public float f60374a;

        public b() {
            super(-1, -1);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f60373b);
            if (obtainStyledAttributes != null) {
                this.f60374a = obtainStyledAttributes.getFloat(0, 0.0f);
                obtainStyledAttributes.recycle();
            }
        }
    }

    public interface c {
        void a(float f2);

        void a(int i);

        void a(d dVar);
    }

    public enum d {
        EXPANDED,
        COLLAPSED,
        ANCHORED,
        HIDDEN,
        DRAGGING;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public float getSlideRange() {
        return (float) this.l;
    }

    public float getAnchorHeight() {
        return this.B;
    }

    public float getAnchorPoint() {
        return this.m;
    }

    public float getHeaderPinnedHeight() {
        return this.q;
    }

    public int getMinFlingVelocity() {
        return this.u;
    }

    public int getPanelHeight() {
        return this.f60362b;
    }

    public d getPanelState() {
        return this.i;
    }

    public final boolean a() {
        if (!this.C || this.f60366f == null || this.i == d.HIDDEN) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f60361a, false, 65770, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60361a, false, 65770, new Class[0], Void.TYPE);
            return;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    @SuppressLint({"NewApi"})
    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f60361a, false, 65787, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60361a, false, 65787, new Class[0], Void.TYPE);
            return;
        }
        if (this.v > 0) {
            ViewCompat.setTranslationY(this.g, (float) getCurrentParallaxOffset());
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        if (!PatchProxy.isSupport(new Object[0], this, f60361a, false, 65792, new Class[0], ViewGroup.LayoutParams.class)) {
            return new b();
        }
        return (ViewGroup.LayoutParams) PatchProxy.accessDispatch(new Object[0], this, f60361a, false, 65792, new Class[0], ViewGroup.LayoutParams.class);
    }

    public int getCurrentParallaxOffset() {
        if (PatchProxy.isSupport(new Object[0], this, f60361a, false, 65759, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f60361a, false, 65759, new Class[0], Integer.TYPE)).intValue();
        }
        int max = (int) (((float) this.v) * Math.max(this.k, 0.0f));
        if (this.f60363c) {
            max = -max;
        }
        return max;
    }

    public float getPanelTop() {
        if (PatchProxy.isSupport(new Object[0], this, f60361a, false, 65760, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, f60361a, false, 65760, new Class[0], Float.TYPE)).floatValue();
        } else if (this.f60366f != null) {
            return (float) this.f60366f.getTop();
        } else {
            return 0.0f;
        }
    }

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f60361a, false, 65772, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60361a, false, 65772, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        this.K = true;
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f60361a, false, 65773, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60361a, false, 65773, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        this.K = true;
    }

    public void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f60361a, false, 65755, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60361a, false, 65755, new Class[0], Void.TYPE);
            return;
        }
        super.onFinishInflate();
        if (this.x != -1) {
            setDragView(findViewById(this.x));
        }
        if (this.z != -1) {
            setScrollableView(findViewById(this.z));
        }
    }

    public Parcelable onSaveInstanceState() {
        d dVar;
        if (PatchProxy.isSupport(new Object[0], this, f60361a, false, 65796, new Class[0], Parcelable.class)) {
            return (Parcelable) PatchProxy.accessDispatch(new Object[0], this, f60361a, false, 65796, new Class[0], Parcelable.class);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("superState", super.onSaveInstanceState());
        if (this.i != d.DRAGGING) {
            dVar = this.i;
        } else {
            dVar = this.j;
        }
        bundle.putSerializable("sliding_state", dVar);
        return bundle;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        int i6 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f60361a, false, 65769, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60361a, false, 65769, new Class[0], Void.TYPE);
        } else if (getChildCount() != 0) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            if (this.f60366f != null) {
                View view = this.f60366f;
                if (PatchProxy.isSupport(new Object[]{view}, null, f60361a, true, 65771, new Class[]{View.class}, Boolean.TYPE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{view}, null, f60361a, true, 65771, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
                } else {
                    Drawable background = view.getBackground();
                    if (background == null || background.getOpacity() != -1) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                }
                if (z2) {
                    i5 = this.f60366f.getLeft();
                    i4 = this.f60366f.getRight();
                    i3 = this.f60366f.getTop();
                    i2 = this.f60366f.getBottom();
                    View childAt = getChildAt(0);
                    int max = Math.max(paddingLeft, childAt.getLeft());
                    int max2 = Math.max(paddingTop, childAt.getTop());
                    int min = Math.min(width, childAt.getRight());
                    int min2 = Math.min(height, childAt.getBottom());
                    if (max >= i5 && max2 >= i3 && min <= i4 && min2 <= i2) {
                        i6 = 4;
                    }
                    childAt.setVisibility(i6);
                }
            }
            i5 = 0;
            i4 = 0;
            i3 = 0;
            i2 = 0;
            View childAt2 = getChildAt(0);
            int max3 = Math.max(paddingLeft, childAt2.getLeft());
            int max22 = Math.max(paddingTop, childAt2.getTop());
            int min3 = Math.min(width, childAt2.getRight());
            int min22 = Math.min(height, childAt2.getBottom());
            i6 = 4;
            childAt2.setVisibility(i6);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e9, code lost:
        if (r0.f60377b == 2) goto L_0x00ed;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void computeScroll() {
        /*
            r16 = this;
            r7 = r16
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f60361a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 65791(0x100ff, float:9.2193E-41)
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0029
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f60361a
            r3 = 0
            r4 = 65791(0x100ff, float:9.2193E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0029:
            com.ss.android.ugc.aweme.poi.sothree.slidinguppanel.b r0 = r7.o
            if (r0 == 0) goto L_0x00fe
            com.ss.android.ugc.aweme.poi.sothree.slidinguppanel.b r0 = r7.o
            r1 = 1
            java.lang.Object[] r9 = new java.lang.Object[r1]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r1)
            r9[r8] = r2
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.poi.sothree.slidinguppanel.b.f60376a
            r12 = 0
            r13 = 65823(0x1011f, float:9.2238E-41)
            java.lang.Class[] r14 = new java.lang.Class[r1]
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r14[r8] = r2
            java.lang.Class r15 = java.lang.Boolean.TYPE
            r10 = r0
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
            if (r2 == 0) goto L_0x0071
            java.lang.Object[] r9 = new java.lang.Object[r1]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r1)
            r9[r8] = r2
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.poi.sothree.slidinguppanel.b.f60376a
            r12 = 0
            r13 = 65823(0x1011f, float:9.2238E-41)
            java.lang.Class[] r14 = new java.lang.Class[r1]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r14[r8] = r1
            java.lang.Class r15 = java.lang.Boolean.TYPE
            r10 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
            r1 = r8
            goto L_0x00ed
        L_0x0071:
            android.view.View r2 = r0.n
            if (r2 == 0) goto L_0x00ec
            int r2 = r0.f60377b
            r3 = 2
            if (r2 != r3) goto L_0x00e7
            android.support.v4.widget.ScrollerCompat r2 = r0.l
            boolean r2 = r2.computeScrollOffset()
            android.support.v4.widget.ScrollerCompat r4 = r0.l
            int r4 = r4.getCurrX()
            android.support.v4.widget.ScrollerCompat r5 = r0.l
            int r5 = r5.getCurrY()
            android.view.View r6 = r0.n
            int r6 = r6.getLeft()
            int r13 = r4 - r6
            android.view.View r6 = r0.n
            int r6 = r6.getTop()
            int r14 = r5 - r6
            if (r2 != 0) goto L_0x00a6
            if (r14 == 0) goto L_0x00a6
            android.view.View r0 = r0.n
            r0.setTop(r8)
            goto L_0x00ed
        L_0x00a6:
            if (r13 == 0) goto L_0x00ad
            android.view.View r6 = r0.n
            r6.offsetLeftAndRight(r13)
        L_0x00ad:
            if (r14 == 0) goto L_0x00b4
            android.view.View r6 = r0.n
            r6.offsetTopAndBottom(r14)
        L_0x00b4:
            if (r13 != 0) goto L_0x00b8
            if (r14 == 0) goto L_0x00c1
        L_0x00b8:
            com.ss.android.ugc.aweme.poi.sothree.slidinguppanel.b$a r9 = r0.m
            android.view.View r10 = r0.n
            r11 = r4
            r12 = r5
            r9.a(r10, r11, r12, r13, r14)
        L_0x00c1:
            if (r2 == 0) goto L_0x00de
            android.support.v4.widget.ScrollerCompat r6 = r0.l
            int r6 = r6.getFinalX()
            if (r4 != r6) goto L_0x00de
            android.support.v4.widget.ScrollerCompat r4 = r0.l
            int r4 = r4.getFinalY()
            if (r5 != r4) goto L_0x00de
            android.support.v4.widget.ScrollerCompat r2 = r0.l
            r2.abortAnimation()
            android.support.v4.widget.ScrollerCompat r2 = r0.l
            boolean r2 = r2.isFinished()
        L_0x00de:
            if (r2 != 0) goto L_0x00e7
            android.view.ViewGroup r2 = r0.p
            java.lang.Runnable r4 = r0.q
            r2.post(r4)
        L_0x00e7:
            int r0 = r0.f60377b
            if (r0 != r3) goto L_0x00ec
            goto L_0x00ed
        L_0x00ec:
            r1 = 0
        L_0x00ed:
            if (r1 == 0) goto L_0x00fe
            boolean r0 = r16.isEnabled()
            if (r0 != 0) goto L_0x00fb
            com.ss.android.ugc.aweme.poi.sothree.slidinguppanel.b r0 = r7.o
            r0.b()
            return
        L_0x00fb:
            android.support.v4.view.ViewCompat.postInvalidateOnAnimation(r16)
        L_0x00fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.sothree.slidinguppanel.SlidingUpPanelLayout.computeScroll():void");
    }

    public void setAnchorHeight(float f2) {
        this.B = f2;
    }

    public void setClipPanel(boolean z2) {
        this.f60365e = z2;
    }

    public void setFadeOnClickListener(View.OnClickListener onClickListener) {
        this.J = onClickListener;
    }

    public void setHeaderPinnedHeight(float f2) {
        this.q = f2;
    }

    public void setMinFlingVelocity(int i2) {
        this.u = i2;
    }

    public void setOnPanelDraggedListener(c cVar) {
        this.h = cVar;
    }

    public void setOverlayed(boolean z2) {
        this.f60364d = z2;
    }

    public void setScrollableView(View view) {
        this.y = view;
    }

    public void setScrollableViewHelper(a aVar) {
        this.A = aVar;
    }

    public void setTouchEnabled(boolean z2) {
        this.C = z2;
    }

    public SlidingUpPanelLayout(Context context) {
        this(context, null);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParams2 = layoutParams;
        if (PatchProxy.isSupport(new Object[]{layoutParams2}, this, f60361a, false, 65794, new Class[]{ViewGroup.LayoutParams.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{layoutParams2}, this, f60361a, false, 65794, new Class[]{ViewGroup.LayoutParams.class}, Boolean.TYPE)).booleanValue();
        } else if (!(layoutParams2 instanceof b) || !super.checkLayoutParams(layoutParams)) {
            return false;
        } else {
            return true;
        }
    }

    public void dispatchDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f60361a, false, 65780, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f60361a, false, 65780, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        try {
            super.dispatchDraw(canvas);
        } catch (Exception e2) {
            n.a("poi_crash_log", com.ss.android.ugc.aweme.app.d.c.a().a("poi_service", "poi_crash").a("errorDesc", e2.getMessage()).a("poitype", "map").b());
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AttributeSet attributeSet2 = attributeSet;
        if (!PatchProxy.isSupport(new Object[]{attributeSet2}, this, f60361a, false, 65795, new Class[]{AttributeSet.class}, ViewGroup.LayoutParams.class)) {
            return new b(getContext(), attributeSet2);
        }
        return (ViewGroup.LayoutParams) PatchProxy.accessDispatch(new Object[]{attributeSet2}, this, f60361a, false, 65795, new Class[]{AttributeSet.class}, ViewGroup.LayoutParams.class);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        d dVar;
        if (PatchProxy.isSupport(new Object[]{parcelable}, this, f60361a, false, 65797, new Class[]{Parcelable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcelable}, this, f60361a, false, 65797, new Class[]{Parcelable.class}, Void.TYPE);
            return;
        }
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.i = (d) bundle.getSerializable("sliding_state");
            if (this.i == null) {
                dVar = s;
            } else {
                dVar = this.i;
            }
            this.i = dVar;
            parcelable2 = bundle.getParcelable("superState");
        } else {
            parcelable2 = parcelable;
        }
        super.onRestoreInstanceState(parcelable2);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f60361a, false, 65778, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f60361a, false, 65778, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!isEnabled() || !a()) {
            return super.onTouchEvent(motionEvent);
        } else {
            try {
                this.o.b(motionEvent2);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public void setAnchorPoint(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f60361a, false, 65766, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f60361a, false, 65766, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (f2 > 0.0f && f2 <= 1.0f) {
            this.m = f2;
            this.K = true;
            requestLayout();
        }
    }

    public void setDragView(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f60361a, false, 65765, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f60361a, false, 65765, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.x = i2;
        setDragView(findViewById(i2));
    }

    public void setGravity(int i2) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f60361a, false, 65756, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f60361a, false, 65756, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 == 48 || i2 == 80) {
            if (i2 != 80) {
                z2 = false;
            }
            this.f60363c = z2;
            if (!this.K) {
                requestLayout();
            }
        } else {
            throw new IllegalArgumentException("gravity must be set to either top or bottom");
        }
    }

    public void setParallaxOffset(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f60361a, false, 65761, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f60361a, false, 65761, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.v = i2;
        if (!this.K) {
            requestLayout();
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParams2 = layoutParams;
        if (PatchProxy.isSupport(new Object[]{layoutParams2}, this, f60361a, false, 65793, new Class[]{ViewGroup.LayoutParams.class}, ViewGroup.LayoutParams.class)) {
            return (ViewGroup.LayoutParams) PatchProxy.accessDispatch(new Object[]{layoutParams2}, this, f60361a, false, 65793, new Class[]{ViewGroup.LayoutParams.class}, ViewGroup.LayoutParams.class);
        } else if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams2);
        } else {
            return new b(layoutParams2);
        }
    }

    public void setDragView(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f60361a, false, 65764, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f60361a, false, 65764, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (this.w != null) {
            this.w.setOnClickListener(null);
        }
        this.w = view;
        if (this.w != null) {
            this.w.setClickable(true);
            this.w.setFocusable(false);
            this.w.setFocusableInTouchMode(false);
            this.w.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f60367a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f60367a, false, 65798, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f60367a, false, 65798, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (SlidingUpPanelLayout.this.isEnabled() && SlidingUpPanelLayout.this.a()) {
                        if (SlidingUpPanelLayout.this.i == d.EXPANDED || SlidingUpPanelLayout.this.i == d.ANCHORED) {
                            SlidingUpPanelLayout.this.setPanelState(d.COLLAPSED);
                        } else if (SlidingUpPanelLayout.this.m < 1.0f) {
                            SlidingUpPanelLayout.this.setPanelState(d.ANCHORED);
                        } else {
                            SlidingUpPanelLayout.this.setPanelState(d.EXPANDED);
                        }
                    }
                }
            });
        }
    }

    public void setPanelHeight(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f60361a, false, 65757, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f60361a, false, 65757, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (getPanelHeight() != i2) {
            this.f60362b = i2;
            if (!this.K) {
                this.K = true;
                requestLayout();
            }
            if (getPanelState() == d.COLLAPSED) {
                if (PatchProxy.isSupport(new Object[0], this, f60361a, false, 65758, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f60361a, false, 65758, new Class[0], Void.TYPE);
                } else {
                    a(0.0f, 0);
                }
                invalidate();
            }
        }
    }

    public void setPanelState(d dVar) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f60361a, false, 65785, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f60361a, false, 65785, new Class[]{d.class}, Void.TYPE);
            return;
        }
        if (this.o.f60377b == 2) {
            this.o.b();
        }
        if (dVar == null || dVar == d.DRAGGING) {
            throw new IllegalArgumentException("Panel state cannot be null or DRAGGING.");
        } else if (isEnabled() && ((this.K || this.f60366f != null) && dVar != this.i && this.i != d.DRAGGING)) {
            if (this.K) {
                setPanelStateInternal(dVar);
                return;
            }
            if (this.i == d.HIDDEN) {
                this.f60366f.setVisibility(0);
                requestLayout();
            }
            switch (dVar) {
                case EXPANDED:
                    a(1.0f, 0);
                    return;
                case ANCHORED:
                    a(this.m, 0);
                    return;
                case HIDDEN:
                    int a2 = a(0.0f);
                    if (this.f60363c) {
                        i2 = this.f60362b;
                    } else {
                        i2 = -this.f60362b;
                    }
                    a(a(a2 + i2), 0);
                    break;
                case COLLAPSED:
                    a(0.0f, 0);
                    return;
            }
        }
    }

    public void setPanelStateInternal(d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f60361a, false, 65786, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f60361a, false, 65786, new Class[]{d.class}, Void.TYPE);
        } else if (this.i != dVar) {
            d dVar2 = this.i;
            this.i = dVar;
            if (PatchProxy.isSupport(new Object[]{this, dVar2, dVar}, this, f60361a, false, 65768, new Class[]{View.class, d.class, d.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{this, dVar2, dVar}, this, f60361a, false, 65768, new Class[]{View.class, d.class, d.class}, Void.TYPE);
            } else {
                synchronized (this.I) {
                    Iterator<Object> it2 = this.I.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                }
                sendAccessibilityEvent(32);
            }
            if (this.h != null) {
                this.h.a(this.i);
            }
        }
    }

    public final float a(int i2) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f60361a, false, 65784, new Class[]{Integer.TYPE}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f60361a, false, 65784, new Class[]{Integer.TYPE}, Float.TYPE)).floatValue();
        }
        int a2 = a(0.0f);
        if (this.f60363c) {
            i3 = a2 - i2;
        } else {
            i3 = i2 - a2;
        }
        float f2 = ((float) i3) / ((float) this.l);
        if (this.h != null) {
            this.h.a(f2);
        }
        return f2;
    }

    public final int a(float f2) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f60361a, false, 65783, new Class[]{Float.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f60361a, false, 65783, new Class[]{Float.TYPE}, Integer.TYPE)).intValue();
        }
        if (this.f60366f != null) {
            i2 = this.f60366f.getMeasuredHeight();
        }
        int i3 = (int) (((float) this.l) * f2);
        if (this.f60363c) {
            return ((getMeasuredHeight() - getPaddingBottom()) - this.f60362b) - i3;
        }
        return (getPaddingTop() - i2) + this.f60362b + i3;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        int i2;
        int i3;
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f60361a, false, 65781, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f60361a, false, 65781, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.p) {
            return true;
        } else {
            if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f60361a, false, 65779, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f60361a, false, 65779, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            } else {
                int pointerCount = motionEvent.getPointerCount();
                if (pointerCount > 1) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= pointerCount) {
                            break;
                        }
                        if (a(this.w, (int) motionEvent2.getX(i4), (int) motionEvent2.getY(i4))) {
                            z2 = true;
                            break;
                        }
                        i4++;
                    }
                }
                z2 = false;
            }
            if (z2) {
                return true;
            }
            int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
            if (!isEnabled() || !a() || (this.n && actionMasked != 0)) {
                this.o.b();
                return super.dispatchTouchEvent(motionEvent);
            }
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (actionMasked == 0) {
                this.H = false;
                this.D = x2;
                this.E = y2;
            } else if (actionMasked == 2) {
                float f2 = y2 - this.E;
                this.D = x2;
                this.E = y2;
                if (Math.abs(x2 - this.D) > Math.abs(f2)) {
                    if (this.i == d.COLLAPSED) {
                        return true;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                } else if (!a(this.y, (int) this.F, (int) this.G)) {
                    return super.dispatchTouchEvent(motionEvent);
                } else {
                    int i5 = -1;
                    if (this.f60363c) {
                        i2 = 1;
                    } else {
                        i2 = -1;
                    }
                    if (((float) i2) * f2 > 0.0f) {
                        a aVar = this.A;
                        View view = this.y;
                        boolean z3 = this.f60363c;
                        if (PatchProxy.isSupport(new Object[]{view, Byte.valueOf(z3 ? (byte) 1 : 0)}, aVar, a.f60375a, false, 65754, new Class[]{View.class, Boolean.TYPE}, Integer.TYPE)) {
                            a aVar2 = aVar;
                            i3 = ((Integer) PatchProxy.accessDispatch(new Object[]{view, Byte.valueOf(z3)}, aVar2, a.f60375a, false, 65754, new Class[]{View.class, Boolean.TYPE}, Integer.TYPE)).intValue();
                        } else {
                            if (view != null) {
                                if (!(view instanceof ScrollView)) {
                                    if (view instanceof ListView) {
                                        ListView listView = (ListView) view;
                                        if (listView.getChildCount() > 0) {
                                            if (listView.getAdapter() != null) {
                                                if (z3) {
                                                    View childAt = listView.getChildAt(0);
                                                    i3 = (listView.getFirstVisiblePosition() * childAt.getHeight()) - childAt.getTop();
                                                } else {
                                                    View childAt2 = listView.getChildAt(listView.getChildCount() - 1);
                                                    i3 = ((((listView.getAdapter().getCount() - listView.getLastVisiblePosition()) - 1) * childAt2.getHeight()) + childAt2.getBottom()) - listView.getBottom();
                                                }
                                            }
                                        }
                                    }
                                    if (view instanceof RecyclerView) {
                                        RecyclerView recyclerView = (RecyclerView) view;
                                        if (recyclerView.getChildCount() > 0) {
                                            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                                            if (recyclerView.getAdapter() != null) {
                                                if (z3) {
                                                    View childAt3 = recyclerView.getChildAt(0);
                                                    i3 = (recyclerView.getChildLayoutPosition(childAt3) * layoutManager.getDecoratedMeasuredHeight(childAt3)) - layoutManager.getDecoratedTop(childAt3);
                                                } else {
                                                    View childAt4 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                                                    i3 = (((recyclerView.getAdapter().getItemCount() - 1) * layoutManager.getDecoratedMeasuredHeight(childAt4)) + layoutManager.getDecoratedBottom(childAt4)) - recyclerView.getBottom();
                                                }
                                            }
                                        }
                                    }
                                } else if (z3) {
                                    i3 = view.getScrollY();
                                } else {
                                    ScrollView scrollView = (ScrollView) view;
                                    i3 = scrollView.getChildAt(0).getBottom() - (scrollView.getHeight() + scrollView.getScrollY());
                                }
                            }
                            i3 = 0;
                        }
                        if (i3 > 0) {
                            this.H = true;
                            return super.dispatchTouchEvent(motionEvent);
                        }
                        if (this.H) {
                            MotionEvent obtain = MotionEvent.obtain(motionEvent);
                            obtain.setAction(3);
                            super.dispatchTouchEvent(obtain);
                            obtain.recycle();
                            motionEvent2.setAction(0);
                        }
                        this.H = false;
                        return onTouchEvent(motionEvent);
                    }
                    if (this.f60363c) {
                        i5 = 1;
                    }
                    if (f2 * ((float) i5) < 0.0f) {
                        if (this.k < (1.0f - (this.q / ((float) this.l))) - 0.001f) {
                            this.H = false;
                            return onTouchEvent(motionEvent);
                        }
                        if (!this.H && this.o.c()) {
                            this.o.a();
                            motionEvent2.setAction(0);
                        }
                        this.H = true;
                        return super.dispatchTouchEvent(motionEvent);
                    }
                }
            } else if (actionMasked == 1 && this.H) {
                this.o.b(0);
            }
            return super.dispatchTouchEvent(motionEvent);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f60361a, false, 65777, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f60361a, false, 65777, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.H || !a()) {
            this.o.b();
            return false;
        } else {
            int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float abs = Math.abs(x2 - this.F);
            float abs2 = Math.abs(y2 - this.G);
            int i2 = this.o.f60378c;
            switch (actionMasked) {
                case 0:
                    this.n = false;
                    this.F = x2;
                    this.G = y2;
                    if (!a(this.w, (int) x2, (int) y2)) {
                        this.o.a();
                        this.n = true;
                        return false;
                    }
                    break;
                case 1:
                case 3:
                    if (this.o.c()) {
                        this.o.b(motionEvent2);
                        return true;
                    }
                    float f2 = (float) i2;
                    if (abs2 <= f2 && abs <= f2 && this.k > 0.0f && !a(this.f60366f, (int) this.F, (int) this.G) && this.J != null) {
                        playSoundEffect(0);
                        this.J.onClick(this);
                        return true;
                    }
                case 2:
                    if (abs2 > ((float) i2) && abs > abs2) {
                        this.o.a();
                        this.n = true;
                        return false;
                    }
            }
            b bVar = this.o;
            if (PatchProxy.isSupport(new Object[]{motionEvent2}, bVar, b.f60376a, false, 65832, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, bVar, b.f60376a, false, 65832, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            int actionMasked2 = MotionEventCompat.getActionMasked(motionEvent);
            int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
            if (actionMasked2 == 0) {
                bVar.a();
            }
            if (bVar.h == null) {
                bVar.h = VelocityTracker.obtain();
            }
            bVar.h.addMovement(motionEvent2);
            switch (actionMasked2) {
                case 0:
                    float x3 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    int pointerId = MotionEventCompat.getPointerId(motionEvent2, 0);
                    bVar.a(x3, y3, pointerId);
                    View a2 = bVar.a((int) x3, (int) y3);
                    if (a2 == bVar.n && bVar.f60377b == 2) {
                        bVar.a(a2, pointerId);
                    }
                    int i3 = bVar.g[pointerId] & bVar.k;
                    break;
                case 1:
                case 3:
                    bVar.a();
                    break;
                case 2:
                    int pointerCount = MotionEventCompat.getPointerCount(motionEvent);
                    for (int i4 = 0; i4 < pointerCount && bVar.f60380e != null && bVar.f60381f != null; i4++) {
                        int pointerId2 = MotionEventCompat.getPointerId(motionEvent2, i4);
                        if (pointerId2 < bVar.f60380e.length && pointerId2 < bVar.f60381f.length) {
                            float x4 = MotionEventCompat.getX(motionEvent2, i4);
                            float y4 = MotionEventCompat.getY(motionEvent2, i4);
                            float f3 = x4 - bVar.f60380e[pointerId2];
                            float f4 = y4 - bVar.f60381f[pointerId2];
                            bVar.b(f3, f4, pointerId2);
                            if (bVar.f60377b != 1) {
                                View a3 = bVar.a((int) bVar.f60380e[pointerId2], (int) bVar.f60381f[pointerId2]);
                                if (a3 != null && bVar.a(a3, f3, f4) && bVar.a(a3, pointerId2)) {
                                }
                            }
                        }
                    }
                    bVar.a(motionEvent2);
                    break;
                case 5:
                    int pointerId3 = MotionEventCompat.getPointerId(motionEvent2, actionIndex);
                    float x5 = MotionEventCompat.getX(motionEvent2, actionIndex);
                    float y5 = MotionEventCompat.getY(motionEvent2, actionIndex);
                    bVar.a(x5, y5, pointerId3);
                    if (bVar.f60377b != 0 && bVar.f60377b == 2) {
                        View a4 = bVar.a((int) x5, (int) y5);
                        if (a4 == bVar.n) {
                            bVar.a(a4, pointerId3);
                            break;
                        }
                    }
                    break;
                case 6:
                    bVar.a(MotionEventCompat.getPointerId(motionEvent2, actionIndex));
                    break;
            }
            if (bVar.f60377b == 1) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f60361a, false, 65767, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f60361a, false, 65767, new Class[]{View.class}, Void.TYPE);
            return;
        }
        synchronized (this.I) {
            Iterator<Object> it2 = this.I.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    public SlidingUpPanelLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean a(float f2, int i2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), 0}, this, f60361a, false, 65790, new Class[]{Float.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), 0}, this, f60361a, false, 65790, new Class[]{Float.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (!isEnabled() || this.f60366f == null) {
            return false;
        } else {
            if (!this.o.a(this.f60366f, this.f60366f.getLeft(), a(f2))) {
                return false;
            }
            c();
            ViewCompat.postInvalidateOnAnimation(this);
            return true;
        }
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60361a, false, 65774, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60361a, false, 65774, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode != 1073741824 && mode != Integer.MIN_VALUE) {
            throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
        } else if (mode2 == 1073741824 || mode2 == Integer.MIN_VALUE) {
            int childCount = getChildCount();
            if (childCount == 2) {
                this.g = getChildAt(0);
                this.f60366f = getChildAt(1);
                if (this.w == null) {
                    setDragView(this.f60366f);
                }
                if (this.f60366f.getVisibility() != 0) {
                    this.i = d.HIDDEN;
                }
                int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                if (this.B > 0.0f && paddingTop > 0) {
                    this.m = 1.0f - ((this.B * 1.0f) / ((float) (paddingTop - this.f60362b)));
                }
                for (int i9 = 0; i9 < childCount; i9++) {
                    View childAt = getChildAt(i9);
                    b bVar = (b) childAt.getLayoutParams();
                    if (childAt.getVisibility() != 8 || i9 != 0) {
                        if (childAt == this.g) {
                            if (this.f60364d || this.i == d.HIDDEN) {
                                i5 = paddingTop;
                            } else {
                                i5 = paddingTop - this.f60362b;
                            }
                            i4 = paddingLeft - (bVar.leftMargin + bVar.rightMargin);
                        } else {
                            if (childAt == this.f60366f) {
                                i8 = (int) (((float) paddingTop) - (((float) bVar.topMargin) + this.q));
                            } else {
                                i8 = paddingTop;
                            }
                            i4 = paddingLeft;
                        }
                        if (bVar.width == -2) {
                            i6 = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
                        } else if (bVar.width == -1) {
                            i6 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                        } else {
                            i6 = View.MeasureSpec.makeMeasureSpec(bVar.width, 1073741824);
                        }
                        if (bVar.height == -2) {
                            i7 = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
                        } else {
                            if (bVar.f60374a > 0.0f) {
                                if (bVar.f60374a < 1.0f) {
                                    i5 = (int) (((float) i5) * bVar.f60374a);
                                    i7 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                                }
                            }
                            if (bVar.height != -1) {
                                i5 = bVar.height;
                            }
                            i7 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                        }
                        childAt.measure(i6, i7);
                        if (childAt == this.f60366f) {
                            this.l = (this.f60366f.getMeasuredHeight() - this.f60362b) + ((int) this.q);
                        }
                    }
                }
                setMeasuredDimension(size, size2);
                return;
            }
            throw new IllegalStateException("Sliding up panel layout must have exactly 2 children!");
        } else {
            throw new IllegalStateException("Height must have an exact value or MATCH_PARENT");
        }
    }

    private boolean a(View view, int i2, int i3) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60361a, false, 65782, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60361a, false, 65782, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (view2 == null) {
            return false;
        } else {
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            getLocationOnScreen(iArr2);
            int i4 = iArr2[0] + i2;
            int i5 = iArr2[1] + i3;
            if (i4 < iArr[0] || i4 >= iArr[0] + view.getWidth() || i5 < iArr[1] || i5 >= iArr[1] + view.getHeight()) {
                return false;
            }
            return true;
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        boolean z2;
        Canvas canvas2 = canvas;
        View view2 = view;
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{canvas2, view2, new Long(j3)}, this, f60361a, false, 65789, new Class[]{Canvas.class, View.class, Long.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{canvas2, view2, new Long(j3)}, this, f60361a, false, 65789, new Class[]{Canvas.class, View.class, Long.TYPE}, Boolean.TYPE)).booleanValue();
        }
        int save = canvas.save();
        try {
            if (this.f60366f == null || this.f60366f == view2) {
                z2 = super.drawChild(canvas, view, j2);
                canvas2.restoreToCount(save);
                return z2;
            }
            canvas2.getClipBounds(this.L);
            if (!this.f60364d) {
                if (this.f60363c) {
                    this.L.bottom = Math.min(this.L.bottom, this.f60366f.getTop());
                } else {
                    this.L.top = Math.max(this.L.top, this.f60366f.getBottom());
                }
            }
            if (this.f60365e) {
                canvas2.clipRect(this.L);
            }
            z2 = super.drawChild(canvas, view, j2);
            canvas2.restoreToCount(save);
            return z2;
        } catch (Exception unused) {
            z2 = false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SlidingUpPanelLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        b bVar;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        this.u = 400;
        this.f60362b = -1;
        this.v = -1;
        this.f60365e = true;
        this.x = -1;
        this.A = new a();
        this.i = s;
        this.j = s;
        this.m = 1.0f;
        this.B = 0.0f;
        this.H = false;
        this.I = new CopyOnWriteArrayList();
        this.p = false;
        this.K = true;
        this.L = new Rect();
        this.q = 0.0f;
        Interpolator interpolator = null;
        if (isInEditMode()) {
            this.o = null;
            return;
        }
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, t);
            if (obtainStyledAttributes != null) {
                setGravity(obtainStyledAttributes.getInt(0, 0));
                obtainStyledAttributes.recycle();
            }
            TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, R$styleable.SlidingUpPanelLayout);
            if (obtainStyledAttributes2 != null) {
                this.f60362b = obtainStyledAttributes2.getDimensionPixelSize(7, -1);
                this.v = obtainStyledAttributes2.getDimensionPixelSize(8, -1);
                this.u = obtainStyledAttributes2.getInt(4, 400);
                this.x = obtainStyledAttributes2.getResourceId(3, -1);
                this.z = obtainStyledAttributes2.getResourceId(10, -1);
                this.f60364d = obtainStyledAttributes2.getBoolean(6, false);
                this.f60365e = obtainStyledAttributes2.getBoolean(2, true);
                this.m = obtainStyledAttributes2.getFloat(1, 1.0f);
                this.B = (float) obtainStyledAttributes2.getDimensionPixelSize(0, 0);
                this.i = d.values()[obtainStyledAttributes2.getInt(5, s.ordinal())];
                int resourceId = obtainStyledAttributes2.getResourceId(9, -1);
                interpolator = resourceId != -1 ? AnimationUtils.loadInterpolator(context2, resourceId) : interpolator;
                obtainStyledAttributes2.recycle();
            }
        }
        float f2 = context.getResources().getDisplayMetrics().density;
        if (this.f60362b == -1) {
            this.f60362b = (int) ((68.0f * f2) + 0.5f);
        }
        if (this.v == -1) {
            this.v = (int) (0.0f * f2);
        }
        setWillNotDraw(false);
        a aVar = new a(this, (byte) 0);
        if (PatchProxy.isSupport(new Object[]{this, Float.valueOf(0.5f), interpolator, aVar}, null, b.f60376a, true, 65810, new Class[]{ViewGroup.class, Float.TYPE, Interpolator.class, b.a.class}, b.class)) {
            bVar = (b) PatchProxy.accessDispatch(new Object[]{this, Float.valueOf(0.5f), interpolator, aVar}, null, b.f60376a, true, 65810, new Class[]{ViewGroup.class, Float.TYPE, Interpolator.class, b.a.class}, b.class);
        } else {
            if (PatchProxy.isSupport(new Object[]{this, interpolator, aVar}, null, b.f60376a, true, 65808, new Class[]{ViewGroup.class, Interpolator.class, b.a.class}, b.class)) {
                bVar = (b) PatchProxy.accessDispatch(new Object[]{this, interpolator, aVar}, null, b.f60376a, true, 65808, new Class[]{ViewGroup.class, Interpolator.class, b.a.class}, b.class);
            } else {
                bVar = new b(getContext(), this, interpolator, aVar);
            }
            bVar.f60378c = (int) (((float) bVar.f60378c) * 2.0f);
        }
        this.o = bVar;
        this.o.i = ((float) this.u) * f2;
        this.C = true;
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f60361a, false, 65776, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f60361a, false, 65776, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onSizeChanged(i2, i3, i4, i5);
        if (i3 != i5) {
            this.K = true;
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f60361a, false, 65775, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f60361a, false, 65775, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.K) {
            switch (this.i) {
                case EXPANDED:
                    this.k = 1.0f;
                    break;
                case ANCHORED:
                    this.k = this.m;
                    break;
                case HIDDEN:
                    int a2 = a(0.0f);
                    if (this.f60363c) {
                        i7 = this.f60362b;
                    } else {
                        i7 = -this.f60362b;
                    }
                    this.k = a(a2 + i7);
                    break;
                default:
                    this.k = 0.0f;
                    break;
            }
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            b bVar = (b) childAt.getLayoutParams();
            if (childAt.getVisibility() != 8 || (i8 != 0 && !this.K)) {
                int measuredHeight = childAt.getMeasuredHeight();
                if (childAt == this.f60366f) {
                    i6 = a(this.k);
                } else {
                    i6 = paddingTop;
                }
                if (!this.f60363c && childAt == this.g && !this.f60364d) {
                    i6 = a(this.k) + this.f60366f.getMeasuredHeight();
                }
                int i9 = bVar.leftMargin + paddingLeft;
                childAt.layout(i9, i6, childAt.getMeasuredWidth() + i9, measuredHeight + i6);
            }
        }
        if (this.K) {
            b();
        }
        d();
        this.K = false;
    }
}
