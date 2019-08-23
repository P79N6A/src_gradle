package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog;

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
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;

public class ViewPagerBottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69905a;

    /* renamed from: b  reason: collision with root package name */
    public int f69906b;

    /* renamed from: c  reason: collision with root package name */
    int f69907c;

    /* renamed from: d  reason: collision with root package name */
    int f69908d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f69909e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f69910f;
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
    private final ViewDragHelper.Callback w = new ViewDragHelper.Callback() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69915a;

        public int getViewVerticalDragRange(View view) {
            if (ViewPagerBottomSheetBehavior.this.f69909e) {
                return ViewPagerBottomSheetBehavior.this.i - ViewPagerBottomSheetBehavior.this.f69907c;
            }
            return ViewPagerBottomSheetBehavior.this.f69908d - ViewPagerBottomSheetBehavior.this.f69907c;
        }

        public void onViewDragStateChanged(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f69915a, false, 79547, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f69915a, false, 79547, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (i == 1) {
                ViewPagerBottomSheetBehavior.this.a(1);
            }
        }

        public boolean tryCaptureView(View view, int i) {
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f69915a, false, 79545, new Class[]{View.class, Integer.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f69915a, false, 79545, new Class[]{View.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
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
            if (!PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2)}, this, f69915a, false, 79550, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
                return view.getLeft();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2)}, this, f69915a, false, 79550, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }

        public int clampViewPositionVertical(View view, int i, int i2) {
            int i3;
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2)}, this, f69915a, false, 79549, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2)}, this, f69915a, false, 79549, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
            }
            int i4 = ViewPagerBottomSheetBehavior.this.f69907c;
            if (ViewPagerBottomSheetBehavior.this.f69909e) {
                i3 = ViewPagerBottomSheetBehavior.this.i;
            } else {
                i3 = ViewPagerBottomSheetBehavior.this.f69908d;
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
            if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3)}, this, f69915a, false, 79548, new Class[]{View.class, Float.TYPE, Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3)}, this, f69915a, false, 79548, new Class[]{View.class, Float.TYPE, Float.TYPE}, Void.TYPE);
                return;
            }
            if (f4 < 0.0f) {
                i = ViewPagerBottomSheetBehavior.this.f69907c;
            } else if (!ViewPagerBottomSheetBehavior.this.f69909e || !ViewPagerBottomSheetBehavior.this.a(view, f4)) {
                if (f4 == 0.0f) {
                    int top = view.getTop();
                    if (Math.abs(top - ViewPagerBottomSheetBehavior.this.f69907c) < Math.abs(top - ViewPagerBottomSheetBehavior.this.f69908d)) {
                        i = ViewPagerBottomSheetBehavior.this.f69907c;
                    } else {
                        i2 = ViewPagerBottomSheetBehavior.this.f69908d;
                    }
                } else {
                    i2 = ViewPagerBottomSheetBehavior.this.f69908d;
                }
                i = i2;
                i3 = 4;
            } else {
                i = ViewPagerBottomSheetBehavior.this.i;
                i3 = 5;
            }
            if (ViewPagerBottomSheetBehavior.this.h.settleCapturedViewAt(view.getLeft(), i)) {
                ViewPagerBottomSheetBehavior.this.a(2);
                ViewCompat.postOnAnimation(view, new b(view, i3));
                return;
            }
            ViewPagerBottomSheetBehavior.this.a(i3);
        }

        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f69915a, false, 79546, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f69915a, false, 79546, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            ViewPagerBottomSheetBehavior.this.b(i2);
        }
    };

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f69919a;

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f69919a, false, 79553, new Class[]{Parcel.class}, SavedState.class)) {
                    return new SavedState(parcel2, (ClassLoader) null);
                }
                return (SavedState) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f69919a, false, 79553, new Class[]{Parcel.class}, SavedState.class);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                Parcel parcel2 = parcel;
                ClassLoader classLoader2 = classLoader;
                if (!PatchProxy.isSupport(new Object[]{parcel2, classLoader2}, this, f69919a, false, 79552, new Class[]{Parcel.class, ClassLoader.class}, SavedState.class)) {
                    return new SavedState(parcel2, classLoader2);
                }
                return (SavedState) PatchProxy.accessDispatch(new Object[]{parcel2, classLoader2}, this, f69919a, false, 79552, new Class[]{Parcel.class, ClassLoader.class}, SavedState.class);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69917a;

        /* renamed from: b  reason: collision with root package name */
        final int f69918b;

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f69918b = i;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f69918b = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            Parcel parcel2 = parcel;
            if (PatchProxy.isSupport(new Object[]{parcel2, Integer.valueOf(i)}, this, f69917a, false, 79551, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{parcel2, Integer.valueOf(i)}, this, f69917a, false, 79551, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.writeToParcel(parcel, i);
            parcel2.writeInt(this.f69918b);
        }
    }

    public static abstract class a {
        public abstract void a(@NonNull View view, int i);
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69920a;

        /* renamed from: c  reason: collision with root package name */
        private final View f69922c;

        /* renamed from: d  reason: collision with root package name */
        private final int f69923d;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f69920a, false, 79554, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f69920a, false, 79554, new Class[0], Void.TYPE);
            } else if (ViewPagerBottomSheetBehavior.this.h == null || !ViewPagerBottomSheetBehavior.this.h.continueSettling(true)) {
                ViewPagerBottomSheetBehavior.this.a(this.f69923d);
            } else {
                ViewCompat.postOnAnimation(this.f69922c, this);
            }
        }

        b(View view, int i) {
            this.f69922c = view;
            this.f69923d = i;
        }
    }

    public ViewPagerBottomSheetBehavior() {
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f69905a, false, 79537, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69905a, false, 79537, new Class[0], Void.TYPE);
            return;
        }
        this.m = -1;
        if (this.u != null) {
            this.u.recycle();
            this.u = null;
        }
    }

    public static <V extends View> ViewPagerBottomSheetBehavior<V> b(V v2) {
        if (PatchProxy.isSupport(new Object[]{v2}, null, f69905a, true, 79543, new Class[]{View.class}, ViewPagerBottomSheetBehavior.class)) {
            return (ViewPagerBottomSheetBehavior) PatchProxy.accessDispatch(new Object[]{v2}, null, f69905a, true, 79543, new Class[]{View.class}, ViewPagerBottomSheetBehavior.class);
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

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(int r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f69905a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 79534(0x136ae, float:1.11451E-40)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003a
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f69905a
            r3 = 0
            r4 = 79534(0x136ae, float:1.11451E-40)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003a:
            r0 = -1
            if (r10 != r0) goto L_0x0044
            boolean r0 = r9.q
            if (r0 != 0) goto L_0x004d
            r9.q = r7
            goto L_0x005c
        L_0x0044:
            boolean r0 = r9.q
            if (r0 != 0) goto L_0x004f
            int r0 = r9.p
            if (r0 == r10) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r7 = 0
            goto L_0x005c
        L_0x004f:
            r9.q = r8
            int r0 = java.lang.Math.max(r8, r10)
            r9.p = r0
            int r0 = r9.i
            int r0 = r0 - r10
            r9.f69908d = r0
        L_0x005c:
            if (r7 == 0) goto L_0x0074
            int r0 = r9.g
            r1 = 4
            if (r0 != r1) goto L_0x0074
            java.lang.ref.WeakReference<V> r0 = r9.j
            if (r0 == 0) goto L_0x0074
            java.lang.ref.WeakReference<V> r0 = r9.j
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x0074
            r0.requestLayout()
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior.c(int):void");
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final View a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f69905a, false, 79539, new Class[]{View.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{view}, this, f69905a, false, 79539, new Class[]{View.class}, View.class);
        } else if (ViewCompat.isNestedScrollingEnabled(view)) {
            return view;
        } else {
            if (view instanceof ViewPager) {
                View focusedChild = ((ViewPager) view).getFocusedChild();
                if (focusedChild == null) {
                    return null;
                }
                View a2 = a(focusedChild);
                if (a2 != null) {
                    return a2;
                }
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View a3 = a(viewGroup.getChildAt(i2));
                    if (a3 != null) {
                        return a3;
                    }
                }
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f69905a, false, 79536, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f69905a, false, 79536, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.g != i2) {
            this.g = i2;
            View view = (View) this.j.get();
            if (!(view == null || this.l == null)) {
                this.l.a(view, i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f69905a, false, 79542, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f69905a, false, 79542, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.j.get();
    }

    public ViewPagerBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BottomSheetBehavior_Layout);
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue == null || peekValue.data != -1) {
            c(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            c(peekValue.data);
        }
        this.f69909e = obtainStyledAttributes.getBoolean(3, false);
        this.f69910f = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        this.o = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v2) {
        if (!PatchProxy.isSupport(new Object[]{coordinatorLayout, v2}, this, f69905a, false, 79525, new Class[]{CoordinatorLayout.class, View.class}, Parcelable.class)) {
            return new SavedState(super.onSaveInstanceState(coordinatorLayout, v2), this.g);
        }
        return (Parcelable) PatchProxy.accessDispatch(new Object[]{coordinatorLayout, v2}, this, f69905a, false, 79525, new Class[]{CoordinatorLayout.class, View.class}, Parcelable.class);
    }

    /* access modifiers changed from: package-private */
    public final void a(View view, int i2) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2)}, this, f69905a, false, 79541, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2)}, this, f69905a, false, 79541, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 == 4) {
            i3 = this.f69908d;
        } else if (i2 == 3) {
            i3 = this.f69907c;
        } else if (!this.f69909e || i2 != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + i2);
        } else {
            i3 = this.i;
        }
        if (this.h.smoothSlideViewTo(view, view.getLeft(), i3)) {
            a(2);
            ViewCompat.postOnAnimation(view, new b(view, i2));
            return;
        }
        a(i2);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(View view, float f2) {
        if (PatchProxy.isSupport(new Object[]{view, Float.valueOf(f2)}, this, f69905a, false, 79538, new Class[]{View.class, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, Float.valueOf(f2)}, this, f69905a, false, 79538, new Class[]{View.class, Float.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.f69910f) {
            return true;
        } else {
            if (view.getTop() >= this.f69908d && Math.abs((((float) view.getTop()) + (0.1f * f2)) - ((float) this.f69908d)) / ((float) this.p) > 0.5f) {
                return true;
            }
            return false;
        }
    }

    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v2, Parcelable parcelable) {
        CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
        V v3 = v2;
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout2, v3, parcelable}, this, f69905a, false, 79526, new Class[]{CoordinatorLayout.class, View.class, Parcelable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{coordinatorLayout2, v3, parcelable}, this, f69905a, false, 79526, new Class[]{CoordinatorLayout.class, View.class, Parcelable.class}, Void.TYPE);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v3, savedState.getSuperState());
        if (savedState.f69918b == 1 || savedState.f69918b == 2) {
            this.g = 4;
        } else {
            this.g = savedState.f69918b;
        }
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        V v3 = v2;
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout, v3, motionEvent2}, this, f69905a, false, 79529, new Class[]{CoordinatorLayout.class, View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{coordinatorLayout, v3, motionEvent2}, this, f69905a, false, 79529, new Class[]{CoordinatorLayout.class, View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!v2.isShown()) {
            return false;
        } else {
            int actionMasked = motionEvent.getActionMasked();
            if (this.g == 1 && actionMasked == 0) {
                return true;
            }
            if (this.h != null) {
                this.h.processTouchEvent(motionEvent2);
            }
            if (actionMasked == 0) {
                a();
            }
            if (this.u == null) {
                this.u = VelocityTracker.obtain();
            }
            this.u.addMovement(motionEvent2);
            if (actionMasked == 2 && !this.r && Math.abs(((float) this.v) - motionEvent.getY()) > ((float) this.h.getTouchSlop())) {
                this.h.captureChildView(v3, motionEvent2.getPointerId(motionEvent.getActionIndex()));
            }
            if (!this.r) {
                return true;
            }
            return false;
        }
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        View view;
        boolean z;
        CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
        V v3 = v2;
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout2, v3, motionEvent2}, this, f69905a, false, 79528, new Class[]{CoordinatorLayout.class, View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{coordinatorLayout2, v3, motionEvent2}, this, f69905a, false, 79528, new Class[]{CoordinatorLayout.class, View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!v2.isShown()) {
            this.r = true;
            return false;
        } else {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                a();
            }
            if (this.u == null) {
                this.u = VelocityTracker.obtain();
            }
            this.u.addMovement(motionEvent2);
            if (actionMasked != 3) {
                switch (actionMasked) {
                    case 0:
                        int x = (int) motionEvent.getX();
                        this.v = (int) motionEvent.getY();
                        if (this.k != null) {
                            view = (View) this.k.get();
                        } else {
                            view = null;
                        }
                        if (view != null && coordinatorLayout2.isPointInChildBounds(view, x, this.v)) {
                            this.m = motionEvent2.getPointerId(motionEvent.getActionIndex());
                            this.n = true;
                        }
                        if (this.m != -1 || coordinatorLayout2.isPointInChildBounds(v3, x, this.v)) {
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
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout2, v3, Integer.valueOf(i2)}, this, f69905a, false, 79527, new Class[]{CoordinatorLayout.class, View.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{coordinatorLayout2, v3, Integer.valueOf(i2)}, this, f69905a, false, 79527, new Class[]{CoordinatorLayout.class, View.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(v2)) {
            ViewCompat.setFitsSystemWindows(v3, true);
        }
        int top = v2.getTop();
        coordinatorLayout.onLayoutChild(v2, i2);
        this.i = coordinatorLayout.getHeight();
        if (this.q) {
            if (this.f69906b == 0) {
                this.f69906b = coordinatorLayout.getResources().getDimensionPixelSize(C0906R.dimen.ea);
            }
            i3 = Math.max(this.f69906b, this.i - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            i3 = this.p;
        }
        this.f69907c = Math.max(0, this.i - v2.getHeight());
        this.f69908d = Math.max(this.i - i3, this.f69907c);
        if (this.g == 3) {
            ViewCompat.offsetTopAndBottom(v3, this.f69907c);
        } else if (this.f69909e && this.g == 5) {
            ViewCompat.offsetTopAndBottom(v3, this.i);
        } else if (this.g == 4) {
            ViewCompat.offsetTopAndBottom(v3, this.f69908d);
        } else if (this.g == 1 || this.g == 2) {
            ViewCompat.offsetTopAndBottom(v3, top - v2.getTop());
        }
        if (this.h == null) {
            this.h = ViewDragHelper.create(coordinatorLayout, this.w);
        }
        this.j = new WeakReference<>(v3);
        this.k = new WeakReference<>(a((View) v3));
        return true;
    }

    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v2, View view) {
        int i2;
        float f2;
        V v3 = v2;
        View view2 = view;
        int i3 = 3;
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout, v3, view2}, this, f69905a, false, 79531, new Class[]{CoordinatorLayout.class, View.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{coordinatorLayout, v3, view2}, this, f69905a, false, 79531, new Class[]{CoordinatorLayout.class, View.class, View.class}, Void.TYPE);
        } else if (v2.getTop() == this.f69907c) {
            a(3);
        } else if (this.k != null && view2 == this.k.get() && this.t) {
            if (this.s > 0) {
                i2 = this.f69907c;
            } else {
                if (this.f69909e) {
                    if (PatchProxy.isSupport(new Object[0], this, f69905a, false, 79540, new Class[0], Float.TYPE)) {
                        f2 = ((Float) PatchProxy.accessDispatch(new Object[0], this, f69905a, false, 79540, new Class[0], Float.TYPE)).floatValue();
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
                    if (Math.abs(top - this.f69907c) < Math.abs(top - this.f69908d)) {
                        i2 = this.f69907c;
                    } else {
                        i2 = this.f69908d;
                    }
                } else {
                    i2 = this.f69908d;
                }
                i3 = 4;
            }
            if (this.h.smoothSlideViewTo(v3, v2.getLeft(), i2)) {
                a(2);
                ViewCompat.postOnAnimation(v3, new b(v3, i3));
            } else {
                a(i3);
            }
            this.t = false;
        }
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
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout, v2, view2, Float.valueOf(f2), Float.valueOf(f3)}, this, f69905a, false, 79532, new Class[]{CoordinatorLayout.class, View.class, View.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{coordinatorLayout, v2, view2, Float.valueOf(f2), Float.valueOf(f3)}, this, f69905a, false, 79532, new Class[]{CoordinatorLayout.class, View.class, View.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
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
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout, v3, view2, Integer.valueOf(i2), Integer.valueOf(i3), iArr}, this, f69905a, false, 79530, new Class[]{CoordinatorLayout.class, View.class, View.class, Integer.TYPE, Integer.TYPE, int[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{coordinatorLayout, v3, view2, Integer.valueOf(i2), Integer.valueOf(i3), iArr}, this, f69905a, false, 79530, new Class[]{CoordinatorLayout.class, View.class, View.class, Integer.TYPE, Integer.TYPE, int[].class}, Void.TYPE);
        } else if (view2 == ((View) this.k.get())) {
            int top = v2.getTop();
            int i5 = top - i4;
            if (i4 > 0) {
                if (i5 < this.f69907c) {
                    iArr[1] = top - this.f69907c;
                    ViewCompat.offsetTopAndBottom(v3, -iArr[1]);
                    a(3);
                } else {
                    iArr[1] = i4;
                    ViewCompat.offsetTopAndBottom(v3, -i4);
                    a(1);
                }
            } else if (i4 < 0 && !view2.canScrollVertically(-1)) {
                if (i5 <= this.f69908d || this.f69909e) {
                    iArr[1] = i4;
                    ViewCompat.offsetTopAndBottom(v3, -i4);
                    a(1);
                } else {
                    iArr[1] = top - this.f69908d;
                    ViewCompat.offsetTopAndBottom(v3, -iArr[1]);
                    a(4);
                }
            }
            b(v2.getTop());
            this.s = i4;
            this.t = true;
        }
    }
}
