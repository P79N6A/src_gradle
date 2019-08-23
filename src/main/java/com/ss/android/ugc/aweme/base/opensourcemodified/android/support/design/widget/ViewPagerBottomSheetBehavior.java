package com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.annotation.VisibleForTesting;
import android.support.design.R$styleable;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.math.MathUtils;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.ViewDragHelper;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;

public class ViewPagerBottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34772a;

    /* renamed from: b  reason: collision with root package name */
    public int f34773b;

    /* renamed from: c  reason: collision with root package name */
    int f34774c;

    /* renamed from: d  reason: collision with root package name */
    int f34775d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f34776e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f34777f;
    public int g = 4;
    ViewDragHelper h;
    int i;
    WeakReference<V> j;
    WeakReference<View> k;
    public a l;
    int m;
    boolean n;
    private float o;
    private int p;
    private boolean q;
    private boolean r;
    private int s;
    private boolean t;
    private VelocityTracker u;
    private int v;
    private boolean w;
    private final ViewDragHelper.Callback x = new ViewDragHelper.Callback() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34782a;

        public int getViewVerticalDragRange(View view) {
            if (ViewPagerBottomSheetBehavior.this.f34776e) {
                return ViewPagerBottomSheetBehavior.this.i - ViewPagerBottomSheetBehavior.this.f34774c;
            }
            return ViewPagerBottomSheetBehavior.this.f34775d - ViewPagerBottomSheetBehavior.this.f34774c;
        }

        public void onViewDragStateChanged(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f34782a, false, 24697, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f34782a, false, 24697, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (i == 1) {
                ViewPagerBottomSheetBehavior.this.c(1);
            }
        }

        public boolean tryCaptureView(View view, int i) {
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f34782a, false, 24695, new Class[]{View.class, Integer.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f34782a, false, 24695, new Class[]{View.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
            } else if (ViewPagerBottomSheetBehavior.this.g == 1 || ViewPagerBottomSheetBehavior.this.n) {
                return false;
            } else {
                if (ViewPagerBottomSheetBehavior.this.g == 3 && ViewPagerBottomSheetBehavior.this.m == i) {
                    View view2 = (View) ViewPagerBottomSheetBehavior.this.k.get();
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                if (ViewPagerBottomSheetBehavior.this.j == null || ViewPagerBottomSheetBehavior.this.j.get() != view) {
                    return false;
                }
                return true;
            }
        }

        public int clampViewPositionHorizontal(View view, int i, int i2) {
            if (!PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2)}, this, f34782a, false, 24700, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
                return view.getLeft();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2)}, this, f34782a, false, 24700, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }

        public int clampViewPositionVertical(View view, int i, int i2) {
            int i3;
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2)}, this, f34782a, false, 24699, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2)}, this, f34782a, false, 24699, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
            }
            int i4 = ViewPagerBottomSheetBehavior.this.f34774c;
            if (ViewPagerBottomSheetBehavior.this.f34776e) {
                i3 = ViewPagerBottomSheetBehavior.this.i;
            } else {
                i3 = ViewPagerBottomSheetBehavior.this.f34775d;
            }
            int i5 = i3;
            int i6 = i;
            return MathUtils.clamp(i, i4, i5);
        }

        public void onViewReleased(View view, float f2, float f3) {
            int i;
            int i2;
            View view2 = view;
            float f4 = f3;
            int i3 = 3;
            if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3)}, this, f34782a, false, 24698, new Class[]{View.class, Float.TYPE, Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3)}, this, f34782a, false, 24698, new Class[]{View.class, Float.TYPE, Float.TYPE}, Void.TYPE);
                return;
            }
            if (f4 < 0.0f) {
                i = ViewPagerBottomSheetBehavior.this.f34774c;
            } else if (!ViewPagerBottomSheetBehavior.this.f34776e || !ViewPagerBottomSheetBehavior.this.a(view, f4)) {
                if (f4 == 0.0f) {
                    int top = view.getTop();
                    if (Math.abs(top - ViewPagerBottomSheetBehavior.this.f34774c) < Math.abs(top - ViewPagerBottomSheetBehavior.this.f34775d)) {
                        i = ViewPagerBottomSheetBehavior.this.f34774c;
                    } else {
                        i2 = ViewPagerBottomSheetBehavior.this.f34775d;
                    }
                } else {
                    i2 = ViewPagerBottomSheetBehavior.this.f34775d;
                }
                i = i2;
                i3 = 4;
            } else {
                i = ViewPagerBottomSheetBehavior.this.i;
                i3 = 5;
            }
            if (ViewPagerBottomSheetBehavior.this.h.settleCapturedViewAt(view.getLeft(), i)) {
                ViewPagerBottomSheetBehavior.this.c(2);
                ViewCompat.postOnAnimation(view, new b(view, i3));
                return;
            }
            ViewPagerBottomSheetBehavior.this.c(i3);
        }

        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f34782a, false, 24696, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f34782a, false, 24696, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            ViewPagerBottomSheetBehavior.this.d(i2);
        }
    };

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    static class BottomSheetViewPagerListener extends ViewPager.SimpleOnPageChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34784a;

        /* renamed from: b  reason: collision with root package name */
        public final ViewPagerBottomSheetBehavior f34785b;

        /* renamed from: c  reason: collision with root package name */
        private final ViewPager f34786c;

        public void onPageSelected(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f34784a, false, 24701, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f34784a, false, 24701, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f34786c.post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f34787a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f34787a, false, 24702, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f34787a, false, 24702, new Class[0], Void.TYPE);
                    } else if (BottomSheetViewPagerListener.this.f34785b.j != null) {
                        BottomSheetViewPagerListener.this.f34785b.a();
                    }
                }
            });
        }

        private BottomSheetViewPagerListener(ViewPager viewPager, ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior) {
            this.f34786c = viewPager;
            this.f34785b = viewPagerBottomSheetBehavior;
        }

        /* synthetic */ BottomSheetViewPagerListener(ViewPager viewPager, ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior, byte b2) {
            this(viewPager, viewPagerBottomSheetBehavior);
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f34791a;

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f34791a, false, 24705, new Class[]{Parcel.class}, SavedState.class)) {
                    return new SavedState(parcel2, (ClassLoader) null);
                }
                return (SavedState) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f34791a, false, 24705, new Class[]{Parcel.class}, SavedState.class);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                Parcel parcel2 = parcel;
                ClassLoader classLoader2 = classLoader;
                if (!PatchProxy.isSupport(new Object[]{parcel2, classLoader2}, this, f34791a, false, 24704, new Class[]{Parcel.class, ClassLoader.class}, SavedState.class)) {
                    return new SavedState(parcel2, classLoader2);
                }
                return (SavedState) PatchProxy.accessDispatch(new Object[]{parcel2, classLoader2}, this, f34791a, false, 24704, new Class[]{Parcel.class, ClassLoader.class}, SavedState.class);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34789a;

        /* renamed from: b  reason: collision with root package name */
        final int f34790b;

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f34790b = i;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f34790b = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            Parcel parcel2 = parcel;
            if (PatchProxy.isSupport(new Object[]{parcel2, Integer.valueOf(i)}, this, f34789a, false, 24703, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{parcel2, Integer.valueOf(i)}, this, f34789a, false, 24703, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.writeToParcel(parcel, i);
            parcel2.writeInt(this.f34790b);
        }
    }

    public static abstract class a {
        public abstract void a(@NonNull View view, float f2);

        public abstract void a(@NonNull View view, int i);
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34792a;

        /* renamed from: c  reason: collision with root package name */
        private final View f34794c;

        /* renamed from: d  reason: collision with root package name */
        private final int f34795d;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f34792a, false, 24706, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f34792a, false, 24706, new Class[0], Void.TYPE);
            } else if (ViewPagerBottomSheetBehavior.this.h == null || !ViewPagerBottomSheetBehavior.this.h.continueSettling(true)) {
                ViewPagerBottomSheetBehavior.this.c(this.f34795d);
            } else {
                ViewCompat.postOnAnimation(this.f34794c, this);
            }
        }

        b(View view, int i) {
            this.f34794c = view;
            this.f34795d = i;
        }
    }

    public ViewPagerBottomSheetBehavior() {
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f34772a, false, 24685, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34772a, false, 24685, new Class[0], Void.TYPE);
            return;
        }
        this.m = -1;
        if (this.u != null) {
            this.u.recycle();
            this.u = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f34772a, false, 24681, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34772a, false, 24681, new Class[0], Void.TYPE);
            return;
        }
        this.k = new WeakReference<>(c((View) this.j.get()));
    }

    public static <V extends View> ViewPagerBottomSheetBehavior<V> a(V v2) {
        if (PatchProxy.isSupport(new Object[]{v2}, null, f34772a, true, 24691, new Class[]{View.class}, ViewPagerBottomSheetBehavior.class)) {
            return (ViewPagerBottomSheetBehavior) PatchProxy.accessDispatch(new Object[]{v2}, null, f34772a, true, 24691, new Class[]{View.class}, ViewPagerBottomSheetBehavior.class);
        }
        ViewGroup.LayoutParams layoutParams = v2.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
            if (behavior instanceof ViewPagerBottomSheetBehavior) {
                return (ViewPagerBottomSheetBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with ViewPagerBottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    @VisibleForTesting
    private View c(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f34772a, false, 24687, new Class[]{View.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{view}, this, f34772a, false, 24687, new Class[]{View.class}, View.class);
        } else if (view == null) {
            return null;
        } else {
            if (this.w) {
                return (View) this.k.get();
            }
            if (ViewCompat.isNestedScrollingEnabled(view)) {
                return view;
            }
            if (view instanceof ViewPager) {
                View c2 = c(a.a((ViewPager) view));
                if (c2 != null) {
                    return c2;
                }
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (viewGroup.getVisibility() == 0) {
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View c3 = c(viewGroup.getChildAt(i2));
                        if (c3 != null) {
                            return c3;
                        }
                    }
                }
            }
            return null;
        }
    }

    public final void b(final int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f34772a, false, 24683, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f34772a, false, 24683, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 != this.g) {
            if (this.j == null) {
                if (i2 == 4 || i2 == 3 || (this.f34776e && i2 == 5)) {
                    this.g = i2;
                }
                return;
            }
            final View view = (View) this.j.get();
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent == null || !parent.isLayoutRequested() || !ViewCompat.isAttachedToWindow(view)) {
                    a(view, i2);
                } else {
                    view.post(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f34778a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f34778a, false, 24694, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f34778a, false, 24694, new Class[0], Void.TYPE);
                                return;
                            }
                            ViewPagerBottomSheetBehavior.this.a(view, i2);
                        }
                    });
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void d(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f34772a, false, 24690, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f34772a, false, 24690, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        View view = (View) this.j.get();
        if (!(view == null || this.l == null)) {
            if (i2 > this.f34775d) {
                this.l.a(view, ((float) (this.f34775d - i2)) / ((float) (this.i - this.f34775d)));
                return;
            }
            this.l.a(view, ((float) (this.f34775d - i2)) / ((float) (this.f34775d - this.f34774c)));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f34772a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 24682(0x606a, float:3.4587E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f34772a
            r3 = 0
            r4 = 24682(0x606a, float:3.4587E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            r0 = -1
            if (r10 != r0) goto L_0x0042
            boolean r0 = r9.q
            if (r0 != 0) goto L_0x004b
            r9.q = r7
            goto L_0x005a
        L_0x0042:
            boolean r0 = r9.q
            if (r0 != 0) goto L_0x004d
            int r0 = r9.p
            if (r0 == r10) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r7 = 0
            goto L_0x005a
        L_0x004d:
            r9.q = r8
            int r0 = java.lang.Math.max(r8, r10)
            r9.p = r0
            int r0 = r9.i
            int r0 = r0 - r10
            r9.f34775d = r0
        L_0x005a:
            if (r7 == 0) goto L_0x0072
            int r0 = r9.g
            r1 = 4
            if (r0 != r1) goto L_0x0072
            java.lang.ref.WeakReference<V> r0 = r9.j
            if (r0 == 0) goto L_0x0072
            java.lang.ref.WeakReference<V> r0 = r9.j
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x0072
            r0.requestLayout()
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.a(int):void");
    }

    public final void b(View view) {
        View view2;
        if (PatchProxy.isSupport(new Object[]{view}, this, f34772a, false, 24693, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f34772a, false, 24693, new Class[]{View.class}, Void.TYPE);
            return;
        }
        View view3 = (View) this.j.get();
        if (view3 != null) {
            if (view != null) {
                ViewParent parent = view.getParent();
                while (parent != null && parent != view3) {
                    parent = parent.getParent();
                }
                if (parent != null) {
                    view2 = c(view);
                } else {
                    throw new IllegalArgumentException("child is not a child of current View.");
                }
            } else {
                view2 = view;
            }
            if (view2 != null) {
                this.k = new WeakReference<>(view2);
                this.w = true;
                return;
            }
            if (this.w) {
                this.w = false;
                a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f34772a, false, 24684, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f34772a, false, 24684, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.g != i2) {
            this.g = i2;
            View view = (View) this.j.get();
            if (!(view == null || this.l == null)) {
                this.l.a(view, i2);
            }
        }
    }

    public final void a(ViewPager viewPager) {
        ViewPager viewPager2 = viewPager;
        if (PatchProxy.isSupport(new Object[]{viewPager2}, this, f34772a, false, 24692, new Class[]{ViewPager.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewPager2}, this, f34772a, false, 24692, new Class[]{ViewPager.class}, Void.TYPE);
            return;
        }
        viewPager2.addOnPageChangeListener(new BottomSheetViewPagerListener(viewPager2, this, (byte) 0));
    }

    public ViewPagerBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BottomSheetBehavior_Layout);
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue == null || peekValue.data != -1) {
            a(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            a(peekValue.data);
        }
        this.f34776e = obtainStyledAttributes.getBoolean(3, false);
        this.f34777f = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        this.o = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v2) {
        if (!PatchProxy.isSupport(new Object[]{coordinatorLayout, v2}, this, f34772a, false, 24673, new Class[]{CoordinatorLayout.class, View.class}, Parcelable.class)) {
            return new SavedState(super.onSaveInstanceState(coordinatorLayout, v2), this.g);
        }
        return (Parcelable) PatchProxy.accessDispatch(new Object[]{coordinatorLayout, v2}, this, f34772a, false, 24673, new Class[]{CoordinatorLayout.class, View.class}, Parcelable.class);
    }

    /* access modifiers changed from: package-private */
    public final void a(View view, int i2) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2)}, this, f34772a, false, 24689, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2)}, this, f34772a, false, 24689, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 == 4) {
            i3 = this.f34775d;
        } else if (i2 == 3) {
            i3 = this.f34774c;
        } else if (!this.f34776e || i2 != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + i2);
        } else {
            i3 = this.i;
        }
        if (this.h.smoothSlideViewTo(view, view.getLeft(), i3)) {
            c(2);
            ViewCompat.postOnAnimation(view, new b(view, i2));
            return;
        }
        c(i2);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(View view, float f2) {
        if (PatchProxy.isSupport(new Object[]{view, Float.valueOf(f2)}, this, f34772a, false, 24686, new Class[]{View.class, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, Float.valueOf(f2)}, this, f34772a, false, 24686, new Class[]{View.class, Float.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.f34777f) {
            return true;
        } else {
            if (view.getTop() >= this.f34775d && Math.abs((((float) view.getTop()) + (0.1f * f2)) - ((float) this.f34775d)) / ((float) this.p) > 0.5f) {
                return true;
            }
            return false;
        }
    }

    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v2, Parcelable parcelable) {
        CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
        V v3 = v2;
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout2, v3, parcelable}, this, f34772a, false, 24674, new Class[]{CoordinatorLayout.class, View.class, Parcelable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{coordinatorLayout2, v3, parcelable}, this, f34772a, false, 24674, new Class[]{CoordinatorLayout.class, View.class, Parcelable.class}, Void.TYPE);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v3, savedState.getSuperState());
        if (savedState.f34790b == 1 || savedState.f34790b == 2) {
            this.g = 4;
        } else {
            this.g = savedState.f34790b;
        }
    }

    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v2, View view) {
        int i2;
        float f2;
        V v3 = v2;
        View view2 = view;
        int i3 = 3;
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout, v3, view2}, this, f34772a, false, 24679, new Class[]{CoordinatorLayout.class, View.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{coordinatorLayout, v3, view2}, this, f34772a, false, 24679, new Class[]{CoordinatorLayout.class, View.class, View.class}, Void.TYPE);
        } else if (v2.getTop() == this.f34774c) {
            c(3);
        } else if (this.k != null && view2 == this.k.get() && this.t) {
            if (this.s > 0) {
                i2 = this.f34774c;
            } else {
                if (this.f34776e) {
                    if (PatchProxy.isSupport(new Object[0], this, f34772a, false, 24688, new Class[0], Float.TYPE)) {
                        f2 = ((Float) PatchProxy.accessDispatch(new Object[0], this, f34772a, false, 24688, new Class[0], Float.TYPE)).floatValue();
                    } else {
                        this.u.computeCurrentVelocity(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, this.o);
                        f2 = this.u.getYVelocity(this.m);
                    }
                    if (a((View) v3, f2)) {
                        i2 = this.i;
                        i3 = 5;
                    }
                }
                if (this.s == 0) {
                    int top = v2.getTop();
                    if (Math.abs(top - this.f34774c) < Math.abs(top - this.f34775d)) {
                        i2 = this.f34774c;
                    } else {
                        i2 = this.f34775d;
                    }
                } else {
                    i2 = this.f34775d;
                }
                i3 = 4;
            }
            if (this.h.smoothSlideViewTo(v3, v2.getLeft(), i2)) {
                c(2);
                ViewCompat.postOnAnimation(v3, new b(v3, i3));
            } else {
                c(i3);
            }
            this.t = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00dd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00de A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.support.design.widget.CoordinatorLayout r15, V r16, android.view.MotionEvent r17) {
        /*
            r14 = this;
            r7 = r14
            r8 = r16
            r9 = r17
            r10 = 3
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r15
            r12 = 1
            r0[r12] = r8
            r13 = 2
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f34772a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.support.design.widget.CoordinatorLayout> r1 = android.support.design.widget.CoordinatorLayout.class
            r5[r11] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r12] = r1
            java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r3 = 0
            r4 = 24677(0x6065, float:3.458E-41)
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0056
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r15
            r0[r12] = r8
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f34772a
            r3 = 0
            r4 = 24677(0x6065, float:3.458E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.support.design.widget.CoordinatorLayout> r1 = android.support.design.widget.CoordinatorLayout.class
            r5[r11] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r12] = r1
            java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r14
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0056:
            boolean r0 = r16.isShown()
            if (r0 != 0) goto L_0x005d
            return r11
        L_0x005d:
            int r0 = r17.getActionMasked()
            int r1 = r7.g
            if (r1 != r12) goto L_0x0068
            if (r0 != 0) goto L_0x0068
            return r12
        L_0x0068:
            int r1 = r17.getAction()
            if (r1 == r13) goto L_0x0075
            int r1 = r17.getAction()
            r2 = 6
            if (r1 != r2) goto L_0x008f
        L_0x0075:
            android.support.v4.widget.ViewDragHelper r1 = r7.h
            int r1 = r1.getActivePointerId()
            int r1 = r9.findPointerIndex(r1)
            android.support.v4.widget.ViewDragHelper r2 = r7.h
            if (r2 == 0) goto L_0x008f
            android.support.v4.widget.ViewDragHelper r2 = r7.h
            int r2 = r2.getViewDragState()
            if (r2 != r12) goto L_0x008f
            if (r1 >= 0) goto L_0x008f
            r1 = 0
            goto L_0x0090
        L_0x008f:
            r1 = 1
        L_0x0090:
            android.support.v4.widget.ViewDragHelper r2 = r7.h
            if (r2 == 0) goto L_0x009b
            if (r1 == 0) goto L_0x009b
            android.support.v4.widget.ViewDragHelper r1 = r7.h
            r1.processTouchEvent(r9)
        L_0x009b:
            if (r0 != 0) goto L_0x00a0
            r14.b()
        L_0x00a0:
            android.view.VelocityTracker r1 = r7.u
            if (r1 != 0) goto L_0x00aa
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r7.u = r1
        L_0x00aa:
            android.view.VelocityTracker r1 = r7.u
            r1.addMovement(r9)
            if (r0 != r13) goto L_0x00d9
            boolean r0 = r7.r
            if (r0 != 0) goto L_0x00d9
            int r0 = r7.v
            float r0 = (float) r0
            float r1 = r17.getY()
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            android.support.v4.widget.ViewDragHelper r1 = r7.h
            int r1 = r1.getTouchSlop()
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d9
            android.support.v4.widget.ViewDragHelper r0 = r7.h
            int r1 = r17.getActionIndex()
            int r1 = r9.getPointerId(r1)
            r0.captureChildView(r8, r1)
        L_0x00d9:
            boolean r0 = r7.r
            if (r0 != 0) goto L_0x00de
            return r12
        L_0x00de:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.onTouchEvent(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        View view;
        boolean z;
        CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
        V v3 = v2;
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout2, v3, motionEvent2}, this, f34772a, false, 24676, new Class[]{CoordinatorLayout.class, View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{coordinatorLayout2, v3, motionEvent2}, this, f34772a, false, 24676, new Class[]{CoordinatorLayout.class, View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!v2.isShown()) {
            this.r = true;
            return false;
        } else {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                b();
            }
            if (this.u == null) {
                this.u = VelocityTracker.obtain();
            }
            this.u.addMovement(motionEvent2);
            if (actionMasked != 3) {
                switch (actionMasked) {
                    case 0:
                        int x2 = (int) motionEvent.getX();
                        this.v = (int) motionEvent.getY();
                        if (this.k != null) {
                            view = (View) this.k.get();
                        } else {
                            view = null;
                        }
                        if (view != null && coordinatorLayout2.isPointInChildBounds(view, x2, this.v)) {
                            this.m = motionEvent2.getPointerId(motionEvent.getActionIndex());
                            this.n = true;
                        }
                        if (this.m != -1 || coordinatorLayout2.isPointInChildBounds(v3, x2, this.v)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        this.r = z;
                        break;
                    case 1:
                        break;
                }
            }
            this.n = false;
            this.m = -1;
            if (this.r) {
                this.r = false;
                return false;
            }
            if (!this.r && this.h.shouldInterceptTouchEvent(motionEvent2)) {
                return true;
            }
            View view2 = (View) this.k.get();
            if (actionMasked != 2 || view2 == null || this.r || this.g == 1 || coordinatorLayout2.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || Math.abs(((float) this.v) - motionEvent.getY()) <= ((float) this.h.getTouchSlop())) {
                return false;
            }
            return true;
        }
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        int i3;
        CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
        V v3 = v2;
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout2, v3, Integer.valueOf(i2)}, this, f34772a, false, 24675, new Class[]{CoordinatorLayout.class, View.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{coordinatorLayout2, v3, Integer.valueOf(i2)}, this, f34772a, false, 24675, new Class[]{CoordinatorLayout.class, View.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(v2)) {
            ViewCompat.setFitsSystemWindows(v3, true);
        }
        int top = v2.getTop();
        coordinatorLayout.onLayoutChild(v2, i2);
        this.i = coordinatorLayout.getHeight();
        if (this.q) {
            if (this.f34773b == 0) {
                this.f34773b = coordinatorLayout.getResources().getDimensionPixelSize(C0906R.dimen.ea);
            }
            i3 = Math.max(this.f34773b, this.i - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            i3 = this.p;
        }
        this.f34774c = Math.max(0, this.i - v2.getHeight());
        this.f34775d = Math.max(this.i - i3, this.f34774c);
        if (this.g == 3) {
            ViewCompat.offsetTopAndBottom(v3, this.f34774c);
        } else if (this.f34776e && this.g == 5) {
            ViewCompat.offsetTopAndBottom(v3, this.i);
        } else if (this.g == 4) {
            ViewCompat.offsetTopAndBottom(v3, this.f34775d);
        } else if (this.g == 1 || this.g == 2) {
            ViewCompat.offsetTopAndBottom(v3, top - v2.getTop());
        }
        if (this.h == null) {
            this.h = ViewDragHelper.create(coordinatorLayout, this.x);
        }
        this.j = new WeakReference<>(v3);
        this.k = new WeakReference<>(c((View) v3));
        return true;
    }

    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i2) {
        this.s = 0;
        this.t = false;
        if ((i2 & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v2, View view, float f2, float f3) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout, v2, view2, Float.valueOf(f2), Float.valueOf(f3)}, this, f34772a, false, 24680, new Class[]{CoordinatorLayout.class, View.class, View.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{coordinatorLayout, v2, view2, Float.valueOf(f2), Float.valueOf(f3)}, this, f34772a, false, 24680, new Class[]{CoordinatorLayout.class, View.class, View.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (view2 != this.k.get() || (this.g == 3 && !super.onNestedPreFling(coordinatorLayout, v2, view, f2, f3))) {
            return false;
        } else {
            return true;
        }
    }

    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int[] iArr) {
        V v3 = v2;
        View view2 = view;
        int i4 = i3;
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout, v3, view2, Integer.valueOf(i2), Integer.valueOf(i3), iArr}, this, f34772a, false, 24678, new Class[]{CoordinatorLayout.class, View.class, View.class, Integer.TYPE, Integer.TYPE, int[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{coordinatorLayout, v3, view2, Integer.valueOf(i2), Integer.valueOf(i3), iArr}, this, f34772a, false, 24678, new Class[]{CoordinatorLayout.class, View.class, View.class, Integer.TYPE, Integer.TYPE, int[].class}, Void.TYPE);
        } else if (view2 == ((View) this.k.get())) {
            int top = v2.getTop();
            int i5 = top - i4;
            if (i4 > 0) {
                if (i5 < this.f34774c) {
                    iArr[1] = top - this.f34774c;
                    ViewCompat.offsetTopAndBottom(v3, -iArr[1]);
                    c(3);
                } else {
                    iArr[1] = i4;
                    ViewCompat.offsetTopAndBottom(v3, -i4);
                    c(1);
                }
            } else if (i4 < 0 && !view2.canScrollVertically(-1)) {
                if (i5 <= this.f34775d || this.f34776e) {
                    iArr[1] = i4;
                    ViewCompat.offsetTopAndBottom(v3, -i4);
                    c(1);
                } else {
                    iArr[1] = top - this.f34775d;
                    ViewCompat.offsetTopAndBottom(v3, -iArr[1]);
                    c(4);
                }
            }
            d(v2.getTop());
            this.s = i4;
            this.t = true;
        }
    }
}
