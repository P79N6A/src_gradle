package com.ss.android.ugc.aweme.story.comment.widget;

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
import com.ss.android.ugc.aweme.story.viewpager2.widget.ViewPager2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;

public class CommentBottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72308a;
    private float A;
    private final ViewDragHelper.Callback B = new ViewDragHelper.Callback() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72314a;

        public int getViewVerticalDragRange(View view) {
            if (CommentBottomSheetBehavior.this.f72312e) {
                return CommentBottomSheetBehavior.this.i - CommentBottomSheetBehavior.this.f72310c;
            }
            return CommentBottomSheetBehavior.this.f72311d - CommentBottomSheetBehavior.this.f72310c;
        }

        public void onViewDragStateChanged(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f72314a, false, 83060, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f72314a, false, 83060, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (i == 1) {
                CommentBottomSheetBehavior.this.b(1);
            }
        }

        public boolean tryCaptureView(View view, int i) {
            View view2;
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f72314a, false, 83058, new Class[]{View.class, Integer.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f72314a, false, 83058, new Class[]{View.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
            } else if (CommentBottomSheetBehavior.this.g == 1 || CommentBottomSheetBehavior.this.o) {
                return false;
            } else {
                if (CommentBottomSheetBehavior.this.g == 3 && CommentBottomSheetBehavior.this.m == i) {
                    if (CommentBottomSheetBehavior.this.k == null) {
                        view2 = null;
                    } else {
                        view2 = (View) CommentBottomSheetBehavior.this.k.get();
                    }
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                if (CommentBottomSheetBehavior.this.j == null || CommentBottomSheetBehavior.this.j.get() != view) {
                    return false;
                }
                return true;
            }
        }

        public int clampViewPositionHorizontal(View view, int i, int i2) {
            if (!PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2)}, this, f72314a, false, 83063, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
                return view.getLeft();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2)}, this, f72314a, false, 83063, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }

        public int clampViewPositionVertical(View view, int i, int i2) {
            int i3;
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2)}, this, f72314a, false, 83062, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2)}, this, f72314a, false, 83062, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
            }
            int i4 = CommentBottomSheetBehavior.this.f72310c;
            if (CommentBottomSheetBehavior.this.f72312e) {
                i3 = CommentBottomSheetBehavior.this.i;
            } else {
                i3 = CommentBottomSheetBehavior.this.f72311d;
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
            if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3)}, this, f72314a, false, 83061, new Class[]{View.class, Float.TYPE, Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3)}, this, f72314a, false, 83061, new Class[]{View.class, Float.TYPE, Float.TYPE}, Void.TYPE);
                return;
            }
            if (f4 < 0.0f) {
                i = CommentBottomSheetBehavior.this.f72310c;
            } else if (!CommentBottomSheetBehavior.this.f72312e || !CommentBottomSheetBehavior.this.a(view, f4)) {
                if (f4 == 0.0f) {
                    int top = view.getTop();
                    if (Math.abs(top - CommentBottomSheetBehavior.this.f72310c) < Math.abs(top - CommentBottomSheetBehavior.this.f72311d)) {
                        i = CommentBottomSheetBehavior.this.f72310c;
                    } else {
                        i2 = CommentBottomSheetBehavior.this.f72311d;
                    }
                } else {
                    i2 = CommentBottomSheetBehavior.this.f72311d;
                }
                i = i2;
                i3 = 4;
            } else {
                if (CommentBottomSheetBehavior.this.p) {
                    i = CommentBottomSheetBehavior.this.i;
                } else {
                    i = view.getTop();
                }
                i3 = 5;
            }
            if (CommentBottomSheetBehavior.this.h.settleCapturedViewAt(view.getLeft(), i)) {
                CommentBottomSheetBehavior.this.b(2);
                ViewCompat.postOnAnimation(view, new b(view, i3));
                return;
            }
            CommentBottomSheetBehavior.this.b(i3);
        }

        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f72314a, false, 83059, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f72314a, false, 83059, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            CommentBottomSheetBehavior.this.c(i2);
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public int f72309b;

    /* renamed from: c  reason: collision with root package name */
    int f72310c;

    /* renamed from: d  reason: collision with root package name */
    int f72311d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f72312e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f72313f;
    public int g = 4;
    ViewDragHelper h;
    int i;
    public WeakReference<V> j;
    public WeakReference<View> k;
    public a l;
    int m;
    public boolean n;
    boolean o;
    public boolean p = true;
    public boolean q;
    private float r;
    private int s;
    private boolean t;
    private boolean u;
    private int v;
    private boolean w;
    private VelocityTracker x;
    private int y;
    private float z;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72318a;

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f72318a, false, 83066, new Class[]{Parcel.class}, SavedState.class)) {
                    return new SavedState(parcel2, (ClassLoader) null);
                }
                return (SavedState) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f72318a, false, 83066, new Class[]{Parcel.class}, SavedState.class);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                Parcel parcel2 = parcel;
                ClassLoader classLoader2 = classLoader;
                if (!PatchProxy.isSupport(new Object[]{parcel2, classLoader2}, this, f72318a, false, 83065, new Class[]{Parcel.class, ClassLoader.class}, SavedState.class)) {
                    return new SavedState(parcel2, classLoader2);
                }
                return (SavedState) PatchProxy.accessDispatch(new Object[]{parcel2, classLoader2}, this, f72318a, false, 83065, new Class[]{Parcel.class, ClassLoader.class}, SavedState.class);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72316a;

        /* renamed from: b  reason: collision with root package name */
        final int f72317b;

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f72317b = i;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f72317b = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            Parcel parcel2 = parcel;
            if (PatchProxy.isSupport(new Object[]{parcel2, Integer.valueOf(i)}, this, f72316a, false, 83064, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{parcel2, Integer.valueOf(i)}, this, f72316a, false, 83064, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.writeToParcel(parcel, i);
            parcel2.writeInt(this.f72317b);
        }
    }

    public static abstract class a {
        public abstract void a(@NonNull View view, float f2);

        public abstract void a(@NonNull View view, int i);
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72319a;

        /* renamed from: c  reason: collision with root package name */
        private final View f72321c;

        /* renamed from: d  reason: collision with root package name */
        private final int f72322d;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f72319a, false, 83067, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f72319a, false, 83067, new Class[0], Void.TYPE);
            } else if (CommentBottomSheetBehavior.this.h == null || !CommentBottomSheetBehavior.this.h.continueSettling(true)) {
                CommentBottomSheetBehavior.this.b(this.f72322d);
            } else {
                ViewCompat.postOnAnimation(this.f72321c, this);
            }
        }

        b(View view, int i) {
            this.f72321c = view;
            this.f72322d = i;
        }
    }

    public CommentBottomSheetBehavior() {
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f72308a, false, 83048, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72308a, false, 83048, new Class[0], Void.TYPE);
            return;
        }
        this.m = -1;
        if (this.x != null) {
            this.x.recycle();
            this.x = null;
        }
    }

    public static <V extends View> CommentBottomSheetBehavior<V> b(V v2) {
        if (PatchProxy.isSupport(new Object[]{v2}, null, f72308a, true, 83055, new Class[]{View.class}, CommentBottomSheetBehavior.class)) {
            return (CommentBottomSheetBehavior) PatchProxy.accessDispatch(new Object[]{v2}, null, f72308a, true, 83055, new Class[]{View.class}, CommentBottomSheetBehavior.class);
        }
        ViewGroup.LayoutParams layoutParams = v2.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
            if (behavior instanceof CommentBottomSheetBehavior) {
                return (CommentBottomSheetBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    @VisibleForTesting
    public final View a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f72308a, false, 83051, new Class[]{View.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{view}, this, f72308a, false, 83051, new Class[]{View.class}, View.class);
        } else if (view instanceof ViewPager2) {
            return null;
        } else {
            if (ViewCompat.isNestedScrollingEnabled(view)) {
                return view;
            }
            if (view instanceof ViewPager) {
                View a2 = a.a((ViewPager) view);
                if (a2 == null) {
                    return null;
                }
                View a3 = a(a2);
                if (a3 != null) {
                    return a3;
                }
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View a4 = a(viewGroup.getChildAt(i2));
                    if (a4 != null) {
                        return a4;
                    }
                }
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f72308a, false, 83054, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f72308a, false, 83054, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        View view = (View) this.j.get();
        if (!(view == null || this.l == null)) {
            if (i2 > this.f72311d) {
                this.l.a(view, ((float) (this.f72311d - i2)) / ((float) (this.i - this.f72311d)));
                return;
            }
            this.l.a(view, ((float) (this.f72311d - i2)) / ((float) (this.f72311d - this.f72310c)));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f72308a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 83045(0x14465, float:1.16371E-40)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003a
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f72308a
            r3 = 0
            r4 = 83045(0x14465, float:1.16371E-40)
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
            boolean r0 = r9.t
            if (r0 != 0) goto L_0x004d
            r9.t = r7
            goto L_0x005c
        L_0x0044:
            boolean r0 = r9.t
            if (r0 != 0) goto L_0x004f
            int r0 = r9.s
            if (r0 == r10) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r7 = 0
            goto L_0x005c
        L_0x004f:
            r9.t = r8
            int r0 = java.lang.Math.max(r8, r10)
            r9.s = r0
            int r0 = r9.i
            int r0 = r0 - r10
            r9.f72311d = r0
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.comment.widget.CommentBottomSheetBehavior.a(int):void");
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f72308a, false, 83047, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f72308a, false, 83047, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.g != i2) {
            this.g = i2;
            View view = (View) this.j.get();
            if (!(view == null || this.l == null)) {
                this.l.a(view, i2);
            }
        }
    }

    public CommentBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BottomSheetBehavior_Layout);
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue == null || peekValue.data != -1) {
            a(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            a(peekValue.data);
        }
        this.f72312e = obtainStyledAttributes.getBoolean(3, false);
        this.f72313f = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        this.r = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v2) {
        if (!PatchProxy.isSupport(new Object[]{coordinatorLayout, v2}, this, f72308a, false, 83036, new Class[]{CoordinatorLayout.class, View.class}, Parcelable.class)) {
            return new SavedState(super.onSaveInstanceState(coordinatorLayout, v2), this.g);
        }
        return (Parcelable) PatchProxy.accessDispatch(new Object[]{coordinatorLayout, v2}, this, f72308a, false, 83036, new Class[]{CoordinatorLayout.class, View.class}, Parcelable.class);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(View view, float f2) {
        if (PatchProxy.isSupport(new Object[]{view, Float.valueOf(f2)}, this, f72308a, false, 83049, new Class[]{View.class, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, Float.valueOf(f2)}, this, f72308a, false, 83049, new Class[]{View.class, Float.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.f72313f) {
            return true;
        } else {
            if (view.getTop() >= this.f72311d && Math.abs((((float) view.getTop()) + (0.1f * f2)) - ((float) this.f72311d)) / ((float) this.s) > 0.25f) {
                return true;
            }
            return false;
        }
    }

    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v2, Parcelable parcelable) {
        CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
        V v3 = v2;
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout2, v3, parcelable}, this, f72308a, false, 83037, new Class[]{CoordinatorLayout.class, View.class, Parcelable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{coordinatorLayout2, v3, parcelable}, this, f72308a, false, 83037, new Class[]{CoordinatorLayout.class, View.class, Parcelable.class}, Void.TYPE);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v3, savedState.getSuperState());
        if (savedState.f72317b == 1 || savedState.f72317b == 2) {
            this.g = 4;
        } else {
            this.g = savedState.f72317b;
        }
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        V v3 = v2;
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout, v3, motionEvent2}, this, f72308a, false, 83041, new Class[]{CoordinatorLayout.class, View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{coordinatorLayout, v3, motionEvent2}, this, f72308a, false, 83041, new Class[]{CoordinatorLayout.class, View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
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
            if (this.x == null) {
                this.x = VelocityTracker.obtain();
            }
            this.x.addMovement(motionEvent2);
            if (actionMasked == 2 && !this.u && Math.abs(((float) this.y) - motionEvent.getY()) > ((float) this.h.getTouchSlop())) {
                this.h.captureChildView(v3, motionEvent2.getPointerId(motionEvent.getActionIndex()));
            }
            if (!this.u) {
                return true;
            }
            return false;
        }
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        boolean z2;
        View view;
        boolean z3;
        CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
        V v3 = v2;
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout2, v3, motionEvent2}, this, f72308a, false, 83039, new Class[]{CoordinatorLayout.class, View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{coordinatorLayout2, v3, motionEvent2}, this, f72308a, false, 83039, new Class[]{CoordinatorLayout.class, View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!v2.isShown()) {
            this.u = true;
            return false;
        } else {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                a();
            }
            if (this.x == null) {
                this.x = VelocityTracker.obtain();
            }
            this.x.addMovement(motionEvent2);
            View view2 = null;
            if (actionMasked != 3) {
                switch (actionMasked) {
                    case 0:
                        this.z = motionEvent.getX();
                        this.A = motionEvent.getY();
                        int x2 = (int) motionEvent.getX();
                        this.y = (int) motionEvent.getY();
                        if (this.k != null) {
                            view = (View) this.k.get();
                        } else {
                            view = null;
                        }
                        if (view != null && coordinatorLayout2.isPointInChildBounds(view, x2, this.y)) {
                            this.m = motionEvent2.getPointerId(motionEvent.getActionIndex());
                            this.o = true;
                        }
                        if (this.m != -1 || coordinatorLayout2.isPointInChildBounds(v3, x2, this.y)) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        this.u = z3;
                        break;
                    case 1:
                        break;
                }
            }
            this.o = false;
            this.m = -1;
            if (this.u) {
                this.u = false;
                return false;
            }
            if (!this.u && this.h.shouldInterceptTouchEvent(motionEvent2)) {
                return true;
            }
            if (this.k != null) {
                view2 = (View) this.k.get();
            }
            if (actionMasked == 2 && view2 != null && !this.u && this.g != 1 && !coordinatorLayout2.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) && Math.abs(((float) this.y) - motionEvent.getY()) > ((float) this.h.getTouchSlop())) {
                if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f72308a, false, 83040, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f72308a, false, 83040, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
                } else {
                    if (this.q) {
                        float y2 = motionEvent.getY();
                        float x3 = motionEvent.getX();
                        double abs = (double) Math.abs(y2 - this.A);
                        double abs2 = (double) Math.abs(x3 - this.z);
                        Double.isNaN(abs2);
                        if (abs <= abs2 * 1.5d) {
                            z2 = false;
                        }
                    }
                    z2 = true;
                }
                if (z2) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        int i3;
        CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
        V v3 = v2;
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout2, v3, Integer.valueOf(i2)}, this, f72308a, false, 83038, new Class[]{CoordinatorLayout.class, View.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{coordinatorLayout2, v3, Integer.valueOf(i2)}, this, f72308a, false, 83038, new Class[]{CoordinatorLayout.class, View.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(v2)) {
            ViewCompat.setFitsSystemWindows(v3, true);
        }
        int top = v2.getTop();
        coordinatorLayout.onLayoutChild(v2, i2);
        this.i = coordinatorLayout.getHeight();
        if (this.t) {
            if (this.f72309b == 0) {
                this.f72309b = coordinatorLayout.getResources().getDimensionPixelSize(C0906R.dimen.ea);
            }
            i3 = Math.max(this.f72309b, this.i - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            i3 = this.s;
        }
        this.f72310c = Math.max(0, this.i - v2.getHeight());
        this.f72311d = Math.max(this.i - i3, this.f72310c);
        if (this.g == 3) {
            ViewCompat.offsetTopAndBottom(v3, this.f72310c);
        } else if (this.f72312e && this.g == 5) {
            ViewCompat.offsetTopAndBottom(v3, this.i);
        } else if (this.g == 4) {
            ViewCompat.offsetTopAndBottom(v3, this.f72311d);
        } else if (this.g == 1 || this.g == 2) {
            ViewCompat.offsetTopAndBottom(v3, top - v2.getTop());
        }
        if (this.h == null) {
            this.h = ViewDragHelper.create(coordinatorLayout, this.B);
        }
        this.j = new WeakReference<>(v3);
        if (!this.n) {
            this.k = new WeakReference<>(a((View) v3));
        }
        return true;
    }

    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v2, View view) {
        int i2;
        float f2;
        V v3 = v2;
        View view2 = view;
        int i3 = 3;
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout, v3, view2}, this, f72308a, false, 83043, new Class[]{CoordinatorLayout.class, View.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{coordinatorLayout, v3, view2}, this, f72308a, false, 83043, new Class[]{CoordinatorLayout.class, View.class, View.class}, Void.TYPE);
        } else if (v2.getTop() == this.f72310c) {
            b(3);
        } else if (this.k != null && view2 == this.k.get() && this.w) {
            if (this.v > 0) {
                i2 = this.f72310c;
            } else {
                if (this.f72312e) {
                    if (PatchProxy.isSupport(new Object[0], this, f72308a, false, 83052, new Class[0], Float.TYPE)) {
                        f2 = ((Float) PatchProxy.accessDispatch(new Object[0], this, f72308a, false, 83052, new Class[0], Float.TYPE)).floatValue();
                    } else {
                        this.x.computeCurrentVelocity(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, this.r);
                        f2 = this.x.getYVelocity(this.m);
                    }
                    if (a(v3, f2)) {
                        i2 = this.i;
                        i3 = 5;
                    }
                }
                if (this.v == 0) {
                    int top = v2.getTop();
                    if (Math.abs(top - this.f72310c) < Math.abs(top - this.f72311d)) {
                        i2 = this.f72310c;
                    } else {
                        i2 = this.f72311d;
                    }
                } else {
                    i2 = this.f72311d;
                }
                i3 = 4;
            }
            if (this.h.smoothSlideViewTo(v3, v2.getLeft(), i2)) {
                b(2);
                ViewCompat.postOnAnimation(v3, new b(v3, i3));
            } else {
                b(i3);
            }
            this.w = false;
        }
    }

    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i2) {
        this.v = 0;
        this.w = false;
        if ((i2 & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v2, View view, float f2, float f3) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout, v2, view2, Float.valueOf(f2), Float.valueOf(f3)}, this, f72308a, false, 83044, new Class[]{CoordinatorLayout.class, View.class, View.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{coordinatorLayout, v2, view2, Float.valueOf(f2), Float.valueOf(f3)}, this, f72308a, false, 83044, new Class[]{CoordinatorLayout.class, View.class, View.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.k == null || view2 != this.k.get() || (this.g == 3 && !super.onNestedPreFling(coordinatorLayout, v2, view, f2, f3))) {
            return false;
        } else {
            return true;
        }
    }

    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int[] iArr) {
        V v3 = v2;
        View view2 = view;
        int i4 = i3;
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout, v3, view2, Integer.valueOf(i2), Integer.valueOf(i3), iArr}, this, f72308a, false, 83042, new Class[]{CoordinatorLayout.class, View.class, View.class, Integer.TYPE, Integer.TYPE, int[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{coordinatorLayout, v3, view2, Integer.valueOf(i2), Integer.valueOf(i3), iArr}, this, f72308a, false, 83042, new Class[]{CoordinatorLayout.class, View.class, View.class, Integer.TYPE, Integer.TYPE, int[].class}, Void.TYPE);
        } else if (this.k != null && view2 == ((View) this.k.get())) {
            int top = v2.getTop();
            int i5 = top - i4;
            if (i4 > 0) {
                if (i5 < this.f72310c) {
                    iArr[1] = top - this.f72310c;
                    ViewCompat.offsetTopAndBottom(v3, -iArr[1]);
                    b(3);
                } else {
                    iArr[1] = i4;
                    ViewCompat.offsetTopAndBottom(v3, -i4);
                    b(1);
                }
            } else if (i4 < 0 && !view2.canScrollVertically(-1)) {
                if (i5 <= this.f72311d || this.f72312e) {
                    iArr[1] = i4;
                    ViewCompat.offsetTopAndBottom(v3, -i4);
                    b(1);
                } else {
                    iArr[1] = top - this.f72311d;
                    ViewCompat.offsetTopAndBottom(v3, -iArr[1]);
                    b(4);
                }
            }
            c(v2.getTop());
            this.v = i4;
            this.w = true;
        }
    }
}
