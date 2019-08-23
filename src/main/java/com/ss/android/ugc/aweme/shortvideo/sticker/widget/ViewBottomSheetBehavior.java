package com.ss.android.ugc.aweme.shortvideo.sticker.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.RestrictTo;
import android.support.design.R$styleable;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.VelocityTrackerCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.ViewDragHelper;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;

public class ViewBottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70335a;

    /* renamed from: b  reason: collision with root package name */
    public int f70336b;

    /* renamed from: c  reason: collision with root package name */
    int f70337c;

    /* renamed from: d  reason: collision with root package name */
    int f70338d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f70339e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f70340f;
    public int g = 4;
    ViewDragHelper h;
    int i;
    WeakReference<V> j;
    WeakReference<View> k;
    int l;
    boolean m;
    private float n;
    private int o;
    private boolean p;
    private boolean q;
    private int r;
    private boolean s;
    private VelocityTracker t;
    private int u;
    private boolean v;
    private final ViewDragHelper.Callback w = new ViewDragHelper.Callback() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70341a;

        public int getViewVerticalDragRange(View view) {
            if (ViewBottomSheetBehavior.this.f70339e) {
                return ViewBottomSheetBehavior.this.i - ViewBottomSheetBehavior.this.f70337c;
            }
            return ViewBottomSheetBehavior.this.f70338d - ViewBottomSheetBehavior.this.f70337c;
        }

        public void onViewDragStateChanged(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f70341a, false, 79967, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f70341a, false, 79967, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (i == 1) {
                ViewBottomSheetBehavior.this.a(1);
            }
        }

        public boolean tryCaptureView(View view, int i) {
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f70341a, false, 79965, new Class[]{View.class, Integer.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f70341a, false, 79965, new Class[]{View.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
            } else if (ViewBottomSheetBehavior.this.g == 1 || ViewBottomSheetBehavior.this.m) {
                return false;
            } else {
                if (ViewBottomSheetBehavior.this.g == 3 && ViewBottomSheetBehavior.this.l == i) {
                    View view2 = (View) ViewBottomSheetBehavior.this.k.get();
                    if (view2 != null && ViewCompat.canScrollVertically(view2, -1)) {
                        return false;
                    }
                }
                if (ViewBottomSheetBehavior.this.j == null || ViewBottomSheetBehavior.this.j.get() != view) {
                    return false;
                }
                return true;
            }
        }

        public int clampViewPositionHorizontal(View view, int i, int i2) {
            if (!PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2)}, this, f70341a, false, 79970, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
                return view.getLeft();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2)}, this, f70341a, false, 79970, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }

        public int clampViewPositionVertical(View view, int i, int i2) {
            int i3;
            int i4 = i;
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2)}, this, f70341a, false, 79969, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2)}, this, f70341a, false, 79969, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
            }
            int i5 = ViewBottomSheetBehavior.this.f70337c;
            if (ViewBottomSheetBehavior.this.f70339e) {
                i3 = ViewBottomSheetBehavior.this.i;
            } else {
                i3 = ViewBottomSheetBehavior.this.f70338d;
            }
            if (i4 < i5) {
                return i5;
            }
            if (i4 > i3) {
                return i3;
            }
            return i4;
        }

        public void onViewReleased(View view, float f2, float f3) {
            int i;
            int i2;
            View view2 = view;
            float f4 = f3;
            int i3 = 3;
            if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3)}, this, f70341a, false, 79968, new Class[]{View.class, Float.TYPE, Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3)}, this, f70341a, false, 79968, new Class[]{View.class, Float.TYPE, Float.TYPE}, Void.TYPE);
                return;
            }
            if (f4 < 0.0f) {
                i = ViewBottomSheetBehavior.this.f70337c;
            } else if (!ViewBottomSheetBehavior.this.f70339e || !ViewBottomSheetBehavior.this.a(view, f4)) {
                if (f4 == 0.0f) {
                    int top = view.getTop();
                    if (Math.abs(top - ViewBottomSheetBehavior.this.f70337c) < Math.abs(top - ViewBottomSheetBehavior.this.f70338d)) {
                        i = ViewBottomSheetBehavior.this.f70337c;
                    } else {
                        i2 = ViewBottomSheetBehavior.this.f70338d;
                    }
                } else {
                    i2 = ViewBottomSheetBehavior.this.f70338d;
                }
                i = i2;
                i3 = 4;
            } else {
                i = ViewBottomSheetBehavior.this.i;
                i3 = 5;
            }
            if (ViewBottomSheetBehavior.this.h.settleCapturedViewAt(view.getLeft(), i)) {
                ViewBottomSheetBehavior.this.a(2);
                ViewCompat.postOnAnimation(view, new a(view, i3));
                return;
            }
            ViewBottomSheetBehavior.this.a(i3);
        }

        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f70341a, false, 79966, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f70341a, false, 79966, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            ViewBottomSheetBehavior.this.b(i2);
        }
    };

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks<SavedState>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f70345a;

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                Parcel parcel2 = parcel;
                ClassLoader classLoader2 = classLoader;
                if (!PatchProxy.isSupport(new Object[]{parcel2, classLoader2}, this, f70345a, false, 79972, new Class[]{Parcel.class, ClassLoader.class}, SavedState.class)) {
                    return new SavedState(parcel2, classLoader2);
                }
                return (SavedState) PatchProxy.accessDispatch(new Object[]{parcel2, classLoader2}, this, f70345a, false, 79972, new Class[]{Parcel.class, ClassLoader.class}, SavedState.class);
            }
        });

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70343a;

        /* renamed from: b  reason: collision with root package name */
        final int f70344b;

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f70344b = i;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f70344b = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            Parcel parcel2 = parcel;
            if (PatchProxy.isSupport(new Object[]{parcel2, Integer.valueOf(i)}, this, f70343a, false, 79971, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{parcel2, Integer.valueOf(i)}, this, f70343a, false, 79971, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.writeToParcel(parcel, i);
            parcel2.writeInt(this.f70344b);
        }
    }

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70346a;

        /* renamed from: c  reason: collision with root package name */
        private final View f70348c;

        /* renamed from: d  reason: collision with root package name */
        private final int f70349d;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f70346a, false, 79973, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f70346a, false, 79973, new Class[0], Void.TYPE);
            } else if (ViewBottomSheetBehavior.this.h == null || !ViewBottomSheetBehavior.this.h.continueSettling(true)) {
                ViewBottomSheetBehavior.this.a(this.f70349d);
            } else {
                ViewCompat.postOnAnimation(this.f70348c, this);
            }
        }

        a(View view, int i) {
            this.f70348c = view;
            this.f70349d = i;
        }
    }

    public ViewBottomSheetBehavior() {
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f70335a, false, 79956, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70335a, false, 79956, new Class[0], Void.TYPE);
            return;
        }
        this.l = -1;
        if (this.t != null) {
            this.t.recycle();
            this.t = null;
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
            com.meituan.robust.ChangeQuickRedirect r2 = f70335a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 79953(0x13851, float:1.12038E-40)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003a
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f70335a
            r3 = 0
            r4 = 79953(0x13851, float:1.12038E-40)
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
            boolean r0 = r9.p
            if (r0 != 0) goto L_0x004d
            r9.p = r7
            goto L_0x005c
        L_0x0044:
            boolean r0 = r9.p
            if (r0 != 0) goto L_0x004f
            int r0 = r9.o
            if (r0 == r10) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r7 = 0
            goto L_0x005c
        L_0x004f:
            r9.p = r8
            int r0 = java.lang.Math.max(r8, r10)
            r9.o = r0
            int r0 = r9.i
            int r0 = r0 - r10
            r9.f70338d = r0
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.widget.ViewBottomSheetBehavior.c(int):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f70335a, false, 79955, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f70335a, false, 79955, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.g != i2) {
            this.g = i2;
            this.j.get();
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f70335a, false, 79961, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f70335a, false, 79961, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.j.get();
    }

    public ViewBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BottomSheetBehavior_Layout);
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue == null || peekValue.data != -1) {
            c(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            c(peekValue.data);
        }
        this.f70339e = obtainStyledAttributes.getBoolean(3, false);
        this.f70340f = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        this.n = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v2) {
        if (!PatchProxy.isSupport(new Object[]{coordinatorLayout, v2}, this, f70335a, false, 79944, new Class[]{CoordinatorLayout.class, View.class}, Parcelable.class)) {
            return new SavedState(super.onSaveInstanceState(coordinatorLayout, v2), this.g);
        }
        return (Parcelable) PatchProxy.accessDispatch(new Object[]{coordinatorLayout, v2}, this, f70335a, false, 79944, new Class[]{CoordinatorLayout.class, View.class}, Parcelable.class);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(View view, float f2) {
        if (PatchProxy.isSupport(new Object[]{view, Float.valueOf(f2)}, this, f70335a, false, 79957, new Class[]{View.class, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, Float.valueOf(f2)}, this, f70335a, false, 79957, new Class[]{View.class, Float.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.f70340f) {
            return true;
        } else {
            if (view.getTop() >= this.f70338d && Math.abs((((float) view.getTop()) + (0.1f * f2)) - ((float) this.f70338d)) / ((float) this.o) > 0.5f) {
                return true;
            }
            return false;
        }
    }

    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v2, Parcelable parcelable) {
        CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
        V v3 = v2;
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout2, v3, parcelable}, this, f70335a, false, 79945, new Class[]{CoordinatorLayout.class, View.class, Parcelable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{coordinatorLayout2, v3, parcelable}, this, f70335a, false, 79945, new Class[]{CoordinatorLayout.class, View.class, Parcelable.class}, Void.TYPE);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v3, savedState.getSuperState());
        if (savedState.f70344b == 1 || savedState.f70344b == 2) {
            this.g = 4;
        } else {
            this.g = savedState.f70344b;
        }
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
        V v3 = v2;
        MotionEvent motionEvent2 = motionEvent;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout2, v3, motionEvent2}, this, f70335a, false, 79947, new Class[]{CoordinatorLayout.class, View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{coordinatorLayout2, v3, motionEvent2}, this, f70335a, false, 79947, new Class[]{CoordinatorLayout.class, View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!v2.isShown()) {
            this.q = true;
            return false;
        } else {
            int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
            if (actionMasked == 0) {
                a();
            }
            if (this.t == null) {
                this.t = VelocityTracker.obtain();
            }
            this.t.addMovement(motionEvent2);
            if (actionMasked != 3) {
                switch (actionMasked) {
                    case 0:
                        int x = (int) motionEvent.getX();
                        this.u = (int) motionEvent.getY();
                        View view = (View) this.k.get();
                        if (view != null && coordinatorLayout2.isPointInChildBounds(view, x, this.u)) {
                            this.l = motionEvent2.getPointerId(motionEvent.getActionIndex());
                            this.m = true;
                        }
                        if (this.l != -1 || coordinatorLayout2.isPointInChildBounds(v3, x, this.u)) {
                            z = false;
                        }
                        this.q = z;
                        break;
                    case 1:
                        break;
                }
            }
            this.m = false;
            this.l = -1;
            if (this.q) {
                this.q = false;
                return false;
            }
            if (!this.q && this.h.shouldInterceptTouchEvent(motionEvent2)) {
                return false;
            }
            this.k.get();
            return false;
        }
    }

    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v2, View view) {
        int i2;
        float f2;
        V v3 = v2;
        View view2 = view;
        int i3 = 3;
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout, v3, view2}, this, f70335a, false, 79950, new Class[]{CoordinatorLayout.class, View.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{coordinatorLayout, v3, view2}, this, f70335a, false, 79950, new Class[]{CoordinatorLayout.class, View.class, View.class}, Void.TYPE);
        } else if (v2.getTop() == this.f70337c) {
            a(3);
        } else if (view2 == this.k.get() && this.s) {
            if (this.r > 0) {
                i2 = this.f70337c;
            } else {
                if (this.f70339e) {
                    if (PatchProxy.isSupport(new Object[0], this, f70335a, false, 79959, new Class[0], Float.TYPE)) {
                        f2 = ((Float) PatchProxy.accessDispatch(new Object[0], this, f70335a, false, 79959, new Class[0], Float.TYPE)).floatValue();
                    } else {
                        this.t.computeCurrentVelocity(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, this.n);
                        f2 = VelocityTrackerCompat.getYVelocity(this.t, this.l);
                    }
                    if (a(v3, f2)) {
                        i2 = this.i;
                        i3 = 5;
                    }
                }
                if (this.r == 0) {
                    int top = v2.getTop();
                    if (Math.abs(top - this.f70337c) < Math.abs(top - this.f70338d)) {
                        i2 = this.f70337c;
                    } else {
                        i2 = this.f70338d;
                    }
                } else {
                    i2 = this.f70338d;
                }
                i3 = 4;
            }
            if (this.h.smoothSlideViewTo(v3, v2.getLeft(), i2)) {
                a(2);
                ViewCompat.postOnAnimation(v3, new a(v3, i3));
            } else {
                a(i3);
            }
            this.s = false;
        }
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        V v3 = v2;
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout, v3, motionEvent2}, this, f70335a, false, 79948, new Class[]{CoordinatorLayout.class, View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{coordinatorLayout, v3, motionEvent2}, this, f70335a, false, 79948, new Class[]{CoordinatorLayout.class, View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!v2.isShown()) {
            return false;
        } else {
            int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
            if (this.g == 1 && actionMasked == 0) {
                return true;
            }
            this.h.processTouchEvent(motionEvent2);
            if (actionMasked == 0) {
                a();
            }
            if (this.t == null) {
                this.t = VelocityTracker.obtain();
            }
            this.t.addMovement(motionEvent2);
            if (actionMasked == 2 && !this.q && Math.abs(((float) this.u) - motionEvent.getY()) > ((float) this.h.getTouchSlop())) {
                this.h.captureChildView(v3, motionEvent2.getPointerId(motionEvent.getActionIndex()));
            }
            if (!this.q) {
                return true;
            }
            return false;
        }
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        int i3;
        View view;
        CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
        V v3 = v2;
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout2, v3, Integer.valueOf(i2)}, this, f70335a, false, 79946, new Class[]{CoordinatorLayout.class, View.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{coordinatorLayout2, v3, Integer.valueOf(i2)}, this, f70335a, false, 79946, new Class[]{CoordinatorLayout.class, View.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(v2)) {
            ViewCompat.setFitsSystemWindows(v3, true);
        }
        int top = v2.getTop();
        coordinatorLayout.onLayoutChild(v2, i2);
        this.i = coordinatorLayout.getHeight();
        if (this.p) {
            if (this.f70336b == 0) {
                this.f70336b = coordinatorLayout.getResources().getDimensionPixelSize(C0906R.dimen.ea);
            }
            i3 = Math.max(this.f70336b, this.i - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            i3 = this.o;
        }
        this.f70337c = Math.max(0, this.i - v2.getHeight());
        this.f70338d = Math.max(this.i - i3, this.f70337c);
        if (this.g == 3) {
            ViewCompat.offsetTopAndBottom(v3, this.f70337c);
        } else if (this.f70339e && this.g == 5) {
            ViewCompat.offsetTopAndBottom(v3, this.i);
        } else if (this.g == 4) {
            ViewCompat.offsetTopAndBottom(v3, this.f70338d);
        } else if (this.g == 1 || this.g == 2) {
            ViewCompat.offsetTopAndBottom(v3, top - v2.getTop());
        }
        if (this.h == null) {
            this.h = ViewDragHelper.create(coordinatorLayout, this.w);
        }
        this.j = new WeakReference<>(v3);
        if (PatchProxy.isSupport(new Object[]{v3}, this, f70335a, false, 79958, new Class[]{View.class}, View.class)) {
            view = (View) PatchProxy.accessDispatch(new Object[]{v3}, this, f70335a, false, 79958, new Class[]{View.class}, View.class);
        } else if (this.v) {
            view = (View) this.k.get();
        } else {
            view = com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.a.a((ViewPager) v3.findViewById(C0906R.id.duz));
            if (view == null) {
                view = null;
            }
        }
        this.k = new WeakReference<>(view);
        return true;
    }

    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i2) {
        this.r = 0;
        this.s = false;
        if ((i2 & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v2, View view, float f2, float f3) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout, v2, view2, Float.valueOf(f2), Float.valueOf(f3)}, this, f70335a, false, 79951, new Class[]{CoordinatorLayout.class, View.class, View.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{coordinatorLayout, v2, view2, Float.valueOf(f2), Float.valueOf(f3)}, this, f70335a, false, 79951, new Class[]{CoordinatorLayout.class, View.class, View.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
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
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout, v3, view2, Integer.valueOf(i2), Integer.valueOf(i3), iArr}, this, f70335a, false, 79949, new Class[]{CoordinatorLayout.class, View.class, View.class, Integer.TYPE, Integer.TYPE, int[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{coordinatorLayout, v3, view2, Integer.valueOf(i2), Integer.valueOf(i3), iArr}, this, f70335a, false, 79949, new Class[]{CoordinatorLayout.class, View.class, View.class, Integer.TYPE, Integer.TYPE, int[].class}, Void.TYPE);
        } else if (view2 == ((View) this.k.get())) {
            int top = v2.getTop();
            int i5 = top - i4;
            if (Math.abs(i3) >= 10) {
                if (i4 > 0) {
                    if (i5 < this.f70337c) {
                        iArr[1] = top - this.f70337c;
                        ViewCompat.offsetTopAndBottom(v3, -iArr[1]);
                        a(3);
                    } else {
                        iArr[1] = i4;
                        ViewCompat.offsetTopAndBottom(v3, -i4);
                        a(1);
                    }
                } else if (i4 < 0 && !ViewCompat.canScrollVertically(view2, -1)) {
                    if (i5 <= this.f70338d || this.f70339e) {
                        iArr[1] = i4;
                        ViewCompat.offsetTopAndBottom(v3, -i4);
                        a(1);
                    } else {
                        iArr[1] = top - this.f70338d;
                        ViewCompat.offsetTopAndBottom(v3, -iArr[1]);
                        a(4);
                    }
                }
                b(v2.getTop());
                this.r = i4;
                this.s = true;
            }
        }
    }
}
