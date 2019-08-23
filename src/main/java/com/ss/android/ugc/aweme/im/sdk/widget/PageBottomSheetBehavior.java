package com.ss.android.ugc.aweme.im.sdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.RestrictTo;
import android.support.annotation.VisibleForTesting;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.math.MathUtils;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.ViewCompat;
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
import com.ss.android.ugc.aweme.im.sdk.R$styleable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;

public class PageBottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52796a;

    /* renamed from: b  reason: collision with root package name */
    public int f52797b;

    /* renamed from: c  reason: collision with root package name */
    int f52798c;

    /* renamed from: d  reason: collision with root package name */
    int f52799d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f52800e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f52801f;
    public int g = 4;
    ViewDragHelper h;
    int i;
    WeakReference<V> j;
    WeakReference<View> k;
    int l;
    boolean m;
    public boolean n = true;
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
        public static ChangeQuickRedirect f52802a;

        public int getViewVerticalDragRange(View view) {
            if (PageBottomSheetBehavior.this.f52800e) {
                return PageBottomSheetBehavior.this.i - PageBottomSheetBehavior.this.f52798c;
            }
            return PageBottomSheetBehavior.this.f52799d - PageBottomSheetBehavior.this.f52798c;
        }

        public void onViewDragStateChanged(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f52802a, false, 54170, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f52802a, false, 54170, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (i == 1) {
                PageBottomSheetBehavior.this.a(1);
            }
        }

        public boolean tryCaptureView(View view, int i) {
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f52802a, false, 54168, new Class[]{View.class, Integer.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f52802a, false, 54168, new Class[]{View.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
            } else if (PageBottomSheetBehavior.this.g == 1 || PageBottomSheetBehavior.this.m) {
                return false;
            } else {
                if (PageBottomSheetBehavior.this.g == 3 && PageBottomSheetBehavior.this.l == i) {
                    View view2 = (View) PageBottomSheetBehavior.this.k.get();
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                if (PageBottomSheetBehavior.this.j == null || PageBottomSheetBehavior.this.j.get() != view) {
                    return false;
                }
                return true;
            }
        }

        public int clampViewPositionHorizontal(View view, int i, int i2) {
            if (!PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2)}, this, f52802a, false, 54173, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
                return view.getLeft();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2)}, this, f52802a, false, 54173, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }

        public int clampViewPositionVertical(View view, int i, int i2) {
            int i3;
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2)}, this, f52802a, false, 54172, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2)}, this, f52802a, false, 54172, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
            }
            int i4 = PageBottomSheetBehavior.this.f52798c;
            if (PageBottomSheetBehavior.this.f52800e) {
                i3 = PageBottomSheetBehavior.this.i;
            } else {
                i3 = PageBottomSheetBehavior.this.f52799d;
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
            if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3)}, this, f52802a, false, 54171, new Class[]{View.class, Float.TYPE, Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3)}, this, f52802a, false, 54171, new Class[]{View.class, Float.TYPE, Float.TYPE}, Void.TYPE);
                return;
            }
            if (f4 < 0.0f) {
                i = PageBottomSheetBehavior.this.f52798c;
            } else if (!PageBottomSheetBehavior.this.f52800e || !PageBottomSheetBehavior.this.a(view, f4)) {
                if (f4 == 0.0f) {
                    int top = view.getTop();
                    if (Math.abs(top - PageBottomSheetBehavior.this.f52798c) < Math.abs(top - PageBottomSheetBehavior.this.f52799d)) {
                        i = PageBottomSheetBehavior.this.f52798c;
                    } else {
                        i2 = PageBottomSheetBehavior.this.f52799d;
                    }
                } else {
                    i2 = PageBottomSheetBehavior.this.f52799d;
                }
                i = i2;
                i3 = 4;
            } else {
                if (PageBottomSheetBehavior.this.n) {
                    i = PageBottomSheetBehavior.this.i;
                } else {
                    i = view.getTop();
                }
                i3 = 5;
            }
            if (PageBottomSheetBehavior.this.h.settleCapturedViewAt(view.getLeft(), i)) {
                PageBottomSheetBehavior.this.a(2);
                ViewCompat.postOnAnimation(view, new a(view, i3));
                return;
            }
            PageBottomSheetBehavior.this.a(i3);
        }

        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f52802a, false, 54169, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f52802a, false, 54169, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            PageBottomSheetBehavior.this.b(i2);
        }
    };

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52806a;

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f52806a, false, 54176, new Class[]{Parcel.class}, SavedState.class)) {
                    return new SavedState(parcel2, (ClassLoader) null);
                }
                return (SavedState) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f52806a, false, 54176, new Class[]{Parcel.class}, SavedState.class);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                Parcel parcel2 = parcel;
                ClassLoader classLoader2 = classLoader;
                if (!PatchProxy.isSupport(new Object[]{parcel2, classLoader2}, this, f52806a, false, 54175, new Class[]{Parcel.class, ClassLoader.class}, SavedState.class)) {
                    return new SavedState(parcel2, classLoader2);
                }
                return (SavedState) PatchProxy.accessDispatch(new Object[]{parcel2, classLoader2}, this, f52806a, false, 54175, new Class[]{Parcel.class, ClassLoader.class}, SavedState.class);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52804a;

        /* renamed from: b  reason: collision with root package name */
        final int f52805b;

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f52805b = i;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f52805b = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            Parcel parcel2 = parcel;
            if (PatchProxy.isSupport(new Object[]{parcel2, Integer.valueOf(i)}, this, f52804a, false, 54174, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{parcel2, Integer.valueOf(i)}, this, f52804a, false, 54174, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.writeToParcel(parcel, i);
            parcel2.writeInt(this.f52805b);
        }
    }

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52807a;

        /* renamed from: c  reason: collision with root package name */
        private final View f52809c;

        /* renamed from: d  reason: collision with root package name */
        private final int f52810d;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f52807a, false, 54177, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f52807a, false, 54177, new Class[0], Void.TYPE);
            } else if (PageBottomSheetBehavior.this.h == null || !PageBottomSheetBehavior.this.h.continueSettling(true)) {
                PageBottomSheetBehavior.this.a(this.f52810d);
            } else {
                ViewCompat.postOnAnimation(this.f52809c, this);
            }
        }

        a(View view, int i) {
            this.f52809c = view;
            this.f52810d = i;
        }
    }

    public PageBottomSheetBehavior() {
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f52796a, false, 54159, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52796a, false, 54159, new Class[0], Void.TYPE);
            return;
        }
        this.l = -1;
        if (this.u != null) {
            this.u.recycle();
            this.u = null;
        }
    }

    @VisibleForTesting
    private View a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f52796a, false, 54161, new Class[]{View.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{view2}, this, f52796a, false, 54161, new Class[]{View.class}, View.class);
        } else if (ViewCompat.isNestedScrollingEnabled(view)) {
            return view2;
        } else {
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View a2 = a(viewGroup.getChildAt(i2));
                    if (a2 != null) {
                        return a2;
                    }
                }
            }
            return null;
        }
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
            com.meituan.robust.ChangeQuickRedirect r2 = f52796a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 54156(0xd38c, float:7.5889E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003a
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f52796a
            r3 = 0
            r4 = 54156(0xd38c, float:7.5889E-41)
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
            r9.f52799d = r0
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.widget.PageBottomSheetBehavior.c(int):void");
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f52796a, false, 54164, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f52796a, false, 54164, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.j.get();
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f52796a, false, 54158, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f52796a, false, 54158, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.g != i2) {
            this.g = i2;
            this.j.get();
        }
    }

    public PageBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BottomSheetBehavior_Layout);
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue == null || peekValue.data != -1) {
            c(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            c(peekValue.data);
        }
        this.f52800e = obtainStyledAttributes.getBoolean(3, false);
        this.f52801f = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        this.o = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v2) {
        if (!PatchProxy.isSupport(new Object[]{coordinatorLayout, v2}, this, f52796a, false, 54148, new Class[]{CoordinatorLayout.class, View.class}, Parcelable.class)) {
            return new SavedState(super.onSaveInstanceState(coordinatorLayout, v2), this.g);
        }
        return (Parcelable) PatchProxy.accessDispatch(new Object[]{coordinatorLayout, v2}, this, f52796a, false, 54148, new Class[]{CoordinatorLayout.class, View.class}, Parcelable.class);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(View view, float f2) {
        if (PatchProxy.isSupport(new Object[]{view, Float.valueOf(f2)}, this, f52796a, false, 54160, new Class[]{View.class, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, Float.valueOf(f2)}, this, f52796a, false, 54160, new Class[]{View.class, Float.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.f52801f) {
            return true;
        } else {
            if (view.getTop() >= this.f52799d && Math.abs((((float) view.getTop()) + (0.1f * f2)) - ((float) this.f52799d)) / ((float) this.p) > 0.25f) {
                return true;
            }
            return false;
        }
    }

    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v2, Parcelable parcelable) {
        CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
        V v3 = v2;
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout2, v3, parcelable}, this, f52796a, false, 54149, new Class[]{CoordinatorLayout.class, View.class, Parcelable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{coordinatorLayout2, v3, parcelable}, this, f52796a, false, 54149, new Class[]{CoordinatorLayout.class, View.class, Parcelable.class}, Void.TYPE);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v3, savedState.getSuperState());
        if (savedState.f52805b == 1 || savedState.f52805b == 2) {
            this.g = 4;
        } else {
            this.g = savedState.f52805b;
        }
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        V v3 = v2;
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout, v3, motionEvent2}, this, f52796a, false, 54152, new Class[]{CoordinatorLayout.class, View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{coordinatorLayout, v3, motionEvent2}, this, f52796a, false, 54152, new Class[]{CoordinatorLayout.class, View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
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
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout2, v3, motionEvent2}, this, f52796a, false, 54151, new Class[]{CoordinatorLayout.class, View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{coordinatorLayout2, v3, motionEvent2}, this, f52796a, false, 54151, new Class[]{CoordinatorLayout.class, View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
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
                            this.l = motionEvent2.getPointerId(motionEvent.getActionIndex());
                            this.m = true;
                        }
                        if (this.l != -1 || coordinatorLayout2.isPointInChildBounds(v3, x, this.v)) {
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
            this.m = false;
            this.l = -1;
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
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout2, v3, Integer.valueOf(i2)}, this, f52796a, false, 54150, new Class[]{CoordinatorLayout.class, View.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{coordinatorLayout2, v3, Integer.valueOf(i2)}, this, f52796a, false, 54150, new Class[]{CoordinatorLayout.class, View.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(v2)) {
            ViewCompat.setFitsSystemWindows(v3, true);
        }
        int top = v2.getTop();
        coordinatorLayout.onLayoutChild(v2, i2);
        this.i = coordinatorLayout.getHeight();
        if (this.q) {
            if (this.f52797b == 0) {
                this.f52797b = coordinatorLayout.getResources().getDimensionPixelSize(C0906R.dimen.ea);
            }
            i3 = Math.max(this.f52797b, this.i);
        } else {
            i3 = this.p;
        }
        this.f52798c = Math.max(0, this.i - v2.getHeight());
        this.f52799d = Math.max(this.i - i3, this.f52798c);
        if (this.g == 3) {
            ViewCompat.offsetTopAndBottom(v3, this.f52798c);
        } else if (this.f52800e && this.g == 5) {
            ViewCompat.offsetTopAndBottom(v3, this.i);
        } else if (this.g == 4) {
            ViewCompat.offsetTopAndBottom(v3, this.f52799d);
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
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout, v3, view2}, this, f52796a, false, 54154, new Class[]{CoordinatorLayout.class, View.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{coordinatorLayout, v3, view2}, this, f52796a, false, 54154, new Class[]{CoordinatorLayout.class, View.class, View.class}, Void.TYPE);
        } else if (v2.getTop() == this.f52798c) {
            a(3);
        } else if (this.k != null && view2 == this.k.get() && this.t) {
            if (this.s > 0) {
                i2 = this.f52798c;
            } else {
                if (this.f52800e) {
                    if (PatchProxy.isSupport(new Object[0], this, f52796a, false, 54162, new Class[0], Float.TYPE)) {
                        f2 = ((Float) PatchProxy.accessDispatch(new Object[0], this, f52796a, false, 54162, new Class[0], Float.TYPE)).floatValue();
                    } else {
                        this.u.computeCurrentVelocity(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, this.o);
                        f2 = this.u.getYVelocity(this.l);
                    }
                    if (a(v3, f2)) {
                        i2 = this.i;
                        i3 = 5;
                    }
                }
                if (this.s == 0) {
                    int top = v2.getTop();
                    if (Math.abs(top - this.f52798c) < Math.abs(top - this.f52799d)) {
                        i2 = this.f52798c;
                    } else {
                        i2 = this.f52799d;
                    }
                } else {
                    i2 = this.f52799d;
                }
                i3 = 4;
            }
            if (this.h.smoothSlideViewTo(v3, v2.getLeft(), i2)) {
                a(2);
                ViewCompat.postOnAnimation(v3, new a(v3, i3));
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
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout, v2, view2, Float.valueOf(f2), Float.valueOf(f3)}, this, f52796a, false, 54155, new Class[]{CoordinatorLayout.class, View.class, View.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{coordinatorLayout, v2, view2, Float.valueOf(f2), Float.valueOf(f3)}, this, f52796a, false, 54155, new Class[]{CoordinatorLayout.class, View.class, View.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
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
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout, v3, view2, Integer.valueOf(i2), Integer.valueOf(i3), iArr}, this, f52796a, false, 54153, new Class[]{CoordinatorLayout.class, View.class, View.class, Integer.TYPE, Integer.TYPE, int[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{coordinatorLayout, v3, view2, Integer.valueOf(i2), Integer.valueOf(i3), iArr}, this, f52796a, false, 54153, new Class[]{CoordinatorLayout.class, View.class, View.class, Integer.TYPE, Integer.TYPE, int[].class}, Void.TYPE);
        } else if (view2 == ((View) this.k.get())) {
            int top = v2.getTop();
            int i5 = top - i4;
            if (i4 > 0) {
                if (i5 < this.f52798c) {
                    iArr[1] = top - this.f52798c;
                    ViewCompat.offsetTopAndBottom(v3, -iArr[1]);
                    a(3);
                } else {
                    iArr[1] = i4;
                    ViewCompat.offsetTopAndBottom(v3, -i4);
                    a(1);
                }
            } else if (i4 < 0 && !view2.canScrollVertically(-1)) {
                if (i5 <= this.f52799d || this.f52800e) {
                    iArr[1] = i4;
                    ViewCompat.offsetTopAndBottom(v3, -i4);
                    a(1);
                } else {
                    iArr[1] = top - this.f52799d;
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
