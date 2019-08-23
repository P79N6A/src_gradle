package com.ss.android.ugc.aweme.poi.ui.detail.widget;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.VisibleForTesting;
import android.support.design.R$styleable;
import android.support.v4.math.MathUtils;
import android.support.v4.util.ObjectsCompat;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@CoordinatorLayout.DefaultBehavior(a = Behavior.class)
public class AppBarLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60709a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f60710b;

    /* renamed from: c  reason: collision with root package name */
    int f60711c;

    /* renamed from: d  reason: collision with root package name */
    WindowInsetsCompat f60712d;

    /* renamed from: e  reason: collision with root package name */
    public int f60713e;

    /* renamed from: f  reason: collision with root package name */
    public int f60714f;
    private int g;
    private int h;
    private int i;
    private List<a> j;
    private boolean k;
    private boolean l;
    private int[] m;
    private int n;

    public static class Behavior extends b<AppBarLayout> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60717a;

        /* renamed from: b  reason: collision with root package name */
        public int f60718b;

        /* renamed from: c  reason: collision with root package name */
        public a f60719c;

        /* renamed from: f  reason: collision with root package name */
        private ValueAnimator f60720f;
        private int g = -1;
        private boolean h;
        private float i;
        private WeakReference<View> j;
        private HashMap<Integer, Object> k = new HashMap<>();
        private float l = 0.0f;
        private ValueAnimator m;
        private boolean n = false;

        protected static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f60741a;

                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new SavedState[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    Parcel parcel2 = parcel;
                    if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f60741a, false, 66446, new Class[]{Parcel.class}, SavedState.class)) {
                        return new SavedState(parcel2, null);
                    }
                    return (SavedState) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f60741a, false, 66446, new Class[]{Parcel.class}, SavedState.class);
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    Parcel parcel2 = parcel;
                    ClassLoader classLoader2 = classLoader;
                    if (!PatchProxy.isSupport(new Object[]{parcel2, classLoader2}, this, f60741a, false, 66445, new Class[]{Parcel.class, ClassLoader.class}, SavedState.class)) {
                        return new SavedState(parcel2, classLoader2);
                    }
                    return (SavedState) PatchProxy.accessDispatch(new Object[]{parcel2, classLoader2}, this, f60741a, false, 66445, new Class[]{Parcel.class, ClassLoader.class}, SavedState.class);
                }
            };

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60737a;

            /* renamed from: b  reason: collision with root package name */
            int f60738b;

            /* renamed from: c  reason: collision with root package name */
            float f60739c;

            /* renamed from: d  reason: collision with root package name */
            boolean f60740d;

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                boolean z;
                this.f60738b = parcel.readInt();
                this.f60739c = parcel.readFloat();
                if (parcel.readByte() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.f60740d = z;
            }

            public void writeToParcel(Parcel parcel, int i) {
                if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, f60737a, false, 66444, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, f60737a, false, 66444, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f60738b);
                parcel.writeFloat(this.f60739c);
                parcel.writeByte(this.f60740d ? (byte) 1 : 0);
            }
        }

        public static abstract class a {
            public abstract boolean a();
        }

        private static boolean a(int i2, int i3) {
            return (i2 & i3) == i3;
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ int a(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (!PatchProxy.isSupport(new Object[]{appBarLayout}, this, f60717a, false, 66429, new Class[]{AppBarLayout.class}, Integer.TYPE)) {
                return appBarLayout.getTotalScrollRange();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{appBarLayout}, this, f60717a, false, 66429, new Class[]{AppBarLayout.class}, Integer.TYPE)).intValue();
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ int a(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int i5, boolean z) {
            boolean z2;
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            int i6 = i3;
            int i7 = i5;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int i8 = 0;
            int i9 = 1;
            int i10 = 2;
            if (PatchProxy.isSupport(new Object[]{coordinatorLayout2, appBarLayout, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Byte.valueOf(z ? (byte) 1 : 0)}, this, f60717a, false, 66431, new Class[]{CoordinatorLayout.class, AppBarLayout.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{coordinatorLayout2, appBarLayout, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Byte.valueOf(z)}, this, f60717a, false, 66431, new Class[]{CoordinatorLayout.class, AppBarLayout.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)).intValue();
            }
            int b2 = b();
            if (i6 == 0 || b2 < i6 || b2 > i4) {
                this.f60718b = 0;
            } else {
                int clamp = MathUtils.clamp(i2, i3, i4);
                if (b2 != clamp) {
                    int b3 = appBarLayout.f60710b ? b(appBarLayout, clamp) : clamp;
                    i8 = b2 - clamp;
                    this.f60718b = clamp - b3;
                    if (!this.n || z) {
                        StringBuilder sb = new StringBuilder("setHeaderTopBottomOffset+++++curOffset:");
                        sb.append(b2);
                        sb.append("/newOffset:");
                        sb.append(clamp);
                        StringBuilder sb2 = new StringBuilder("setHeaderTopBottomOffset+++++getTopAndBottomOffset:");
                        sb2.append(getTopAndBottomOffset());
                        sb2.append("/");
                        sb2.append(b());
                        sb2.append("/");
                        sb2.append(appBarLayout.getHeight());
                        int i11 = -appBarLayout.f60714f;
                        StringBuilder sb3 = new StringBuilder("setHeaderTopBottomOffset+++++anchor : ");
                        sb3.append(i11);
                        sb3.append(" / interpolatedOffset : ");
                        sb3.append(b3);
                        sb3.append(" / touchType : ");
                        sb3.append(i7);
                        if (i11 > b3 || i7 != 1) {
                            z2 = setTopAndBottomOffset(b3);
                            i10 = 1;
                        } else if (i11 >= b3 || i7 != 1 || getTopAndBottomOffset() <= i11) {
                            z2 = setTopAndBottomOffset(i11);
                            i10 = 3;
                        } else {
                            z2 = setTopAndBottomOffset(b3);
                        }
                        StringBuilder sb4 = new StringBuilder("setHeaderTopBottomOffset+++++getTopAndBottomOffset:  interpolatedOffset : ");
                        sb4.append(b3);
                        sb4.append("****");
                        sb4.append(i10);
                        new StringBuilder("setHeaderTopBottomOffset+++++offsetChanged...").append(z2);
                        if (!z2 && appBarLayout.f60710b) {
                            coordinatorLayout2.a((View) appBarLayout);
                        }
                        appBarLayout.c(getTopAndBottomOffset());
                        if (clamp < b2) {
                            i9 = -1;
                        }
                        b(coordinatorLayout, appBarLayout, clamp, i9, false);
                    }
                }
            }
            return i8;
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void a(CoordinatorLayout coordinatorLayout, View view) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (PatchProxy.isSupport(new Object[]{coordinatorLayout2, appBarLayout}, this, f60717a, false, 66427, new Class[]{CoordinatorLayout.class, AppBarLayout.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{coordinatorLayout2, appBarLayout}, this, f60717a, false, 66427, new Class[]{CoordinatorLayout.class, AppBarLayout.class}, Void.TYPE);
                return;
            }
            a(coordinatorLayout2, appBarLayout);
        }

        public final /* synthetic */ boolean a(View view, float f2) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (PatchProxy.isSupport(new Object[]{appBarLayout, Float.valueOf(f2)}, this, f60717a, false, 66415, new Class[]{AppBarLayout.class, Float.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{appBarLayout, Float.valueOf(f2)}, this, f60717a, false, 66415, new Class[]{AppBarLayout.class, Float.TYPE}, Boolean.TYPE)).booleanValue();
            }
            return a(appBarLayout, -f2);
        }

        private boolean a(AppBarLayout appBarLayout, float f2) {
            if (PatchProxy.isSupport(new Object[]{appBarLayout, Float.valueOf(f2)}, this, f60717a, false, 66413, new Class[]{AppBarLayout.class, Float.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{appBarLayout, Float.valueOf(f2)}, this, f60717a, false, 66413, new Class[]{AppBarLayout.class, Float.TYPE}, Boolean.TYPE)).booleanValue();
            }
            int i2 = -appBarLayout.f60714f;
            int topAndBottomOffset = getTopAndBottomOffset();
            StringBuilder sb = new StringBuilder("+++AppBarLayoutTag...onNestedFling...");
            sb.append(topAndBottomOffset);
            sb.append("/velocityY:");
            sb.append(f2);
            if (topAndBottomOffset <= i2 || topAndBottomOffset >= 0) {
                return false;
            }
            if (f2 == 0.0f) {
                if (topAndBottomOffset >= i2 / 2) {
                    i2 = 0;
                }
                a(appBarLayout, topAndBottomOffset, i2, f2);
            } else if (topAndBottomOffset > i2 / 2) {
                if (f2 > 2000.0f) {
                    a(appBarLayout, topAndBottomOffset, i2, f2);
                } else {
                    a(appBarLayout, topAndBottomOffset, 0, 0.0f);
                }
            } else if (f2 < -2000.0f) {
                a(appBarLayout, topAndBottomOffset, 0, f2);
            } else {
                a(appBarLayout, topAndBottomOffset, i2, 0.0f);
            }
            return true;
        }

        public final /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        public final /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        public final boolean a() {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], this, f60717a, false, 66414, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f60717a, false, 66414, new Class[0], Boolean.TYPE)).booleanValue();
            }
            if (!this.k.isEmpty()) {
                z = true;
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        public final int b() {
            if (!PatchProxy.isSupport(new Object[0], this, f60717a, false, 66437, new Class[0], Integer.TYPE)) {
                return getTopAndBottomOffset() + this.f60718b;
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f60717a, false, 66437, new Class[0], Integer.TYPE)).intValue();
        }

        public final /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i2) {
            return super.setLeftAndRightOffset(i2);
        }

        public final /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i2) {
            return super.setTopAndBottomOffset(i2);
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ int b(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (!PatchProxy.isSupport(new Object[]{appBarLayout}, this, f60717a, false, 66428, new Class[]{AppBarLayout.class}, Integer.TYPE)) {
                return -appBarLayout.getDownNestedScrollRange();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{appBarLayout}, this, f60717a, false, 66428, new Class[]{AppBarLayout.class}, Integer.TYPE)).intValue();
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ boolean c(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (PatchProxy.isSupport(new Object[]{appBarLayout}, this, f60717a, false, 66426, new Class[]{AppBarLayout.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{appBarLayout}, this, f60717a, false, 66426, new Class[]{AppBarLayout.class}, Boolean.TYPE)).booleanValue();
            } else if (this.f60719c != null) {
                return this.f60719c.a();
            } else {
                if (this.j != null) {
                    View view2 = (View) this.j.get();
                    if (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                return true;
            }
        }

        private int a(AppBarLayout appBarLayout, int i2) {
            AppBarLayout appBarLayout2 = appBarLayout;
            if (PatchProxy.isSupport(new Object[]{appBarLayout2, Integer.valueOf(i2)}, this, f60717a, false, 66422, new Class[]{AppBarLayout.class, Integer.TYPE}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{appBarLayout2, Integer.valueOf(i2)}, this, f60717a, false, 66422, new Class[]{AppBarLayout.class, Integer.TYPE}, Integer.TYPE)).intValue();
            }
            int childCount = appBarLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = appBarLayout2.getChildAt(i3);
                int i4 = -i2;
                if (childAt.getTop() <= i4 && childAt.getBottom() >= i4) {
                    return i3;
                }
            }
            return -1;
        }

        private static View c(AppBarLayout appBarLayout, int i2) {
            AppBarLayout appBarLayout2 = appBarLayout;
            if (PatchProxy.isSupport(new Object[]{appBarLayout2, Integer.valueOf(i2)}, null, f60717a, true, 66436, new Class[]{AppBarLayout.class, Integer.TYPE}, View.class)) {
                return (View) PatchProxy.accessDispatch(new Object[]{appBarLayout2, Integer.valueOf(i2)}, null, f60717a, true, 66436, new Class[]{AppBarLayout.class, Integer.TYPE}, View.class);
            }
            int abs = Math.abs(i2);
            int childCount = appBarLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = appBarLayout2.getChildAt(i3);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int b(AppBarLayout appBarLayout, int i2) {
            AppBarLayout appBarLayout2 = appBarLayout;
            int i3 = 0;
            if (PatchProxy.isSupport(new Object[]{appBarLayout2, Integer.valueOf(i2)}, this, f60717a, false, 66433, new Class[]{AppBarLayout.class, Integer.TYPE}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{appBarLayout2, Integer.valueOf(i2)}, this, f60717a, false, 66433, new Class[]{AppBarLayout.class, Integer.TYPE}, Integer.TYPE)).intValue();
            }
            int abs = Math.abs(i2);
            int childCount = appBarLayout.getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    break;
                }
                View childAt = appBarLayout2.getChildAt(i4);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Interpolator interpolator = layoutParams.f60743b;
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i4++;
                } else if (interpolator != null) {
                    int i5 = layoutParams.f60742a;
                    if ((i5 & 1) != 0) {
                        i3 = 0 + childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                        if ((2 & i5) != 0) {
                            i3 -= ViewCompat.getMinimumHeight(childAt);
                        }
                    }
                    if (ViewCompat.getFitsSystemWindows(childAt)) {
                        i3 -= appBarLayout.getTopInset();
                    }
                    if (i3 > 0) {
                        float f2 = (float) i3;
                        return Integer.signum(i2) * (childAt.getTop() + Math.round(f2 * interpolator.getInterpolation(((float) (abs - childAt.getTop())) / f2)));
                    }
                }
            }
            return i2;
        }

        public final /* synthetic */ Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z = false;
            if (PatchProxy.isSupport(new Object[]{coordinatorLayout2, appBarLayout}, this, f60717a, false, 66438, new Class[]{CoordinatorLayout.class, AppBarLayout.class}, Parcelable.class)) {
                return (Parcelable) PatchProxy.accessDispatch(new Object[]{coordinatorLayout2, appBarLayout}, this, f60717a, false, 66438, new Class[]{CoordinatorLayout.class, AppBarLayout.class}, Parcelable.class);
            }
            Parcelable onSaveInstanceState = super.onSaveInstanceState(coordinatorLayout2, appBarLayout);
            int topAndBottomOffset = getTopAndBottomOffset();
            int childCount = appBarLayout.getChildCount();
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = appBarLayout.getChildAt(i2);
                int bottom = childAt.getBottom() + topAndBottomOffset;
                if (childAt.getTop() + topAndBottomOffset > 0 || bottom < 0) {
                    i2++;
                } else {
                    SavedState savedState = new SavedState(onSaveInstanceState);
                    savedState.f60738b = i2;
                    if (bottom == ViewCompat.getMinimumHeight(childAt) + appBarLayout.getTopInset()) {
                        z = true;
                    }
                    savedState.f60740d = z;
                    savedState.f60739c = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return onSaveInstanceState;
        }

        private void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            if (PatchProxy.isSupport(new Object[]{coordinatorLayout, appBarLayout}, this, f60717a, false, 66423, new Class[]{CoordinatorLayout.class, AppBarLayout.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{coordinatorLayout, appBarLayout}, this, f60717a, false, 66423, new Class[]{CoordinatorLayout.class, AppBarLayout.class}, Void.TYPE);
                return;
            }
            int b2 = b();
            int a2 = a(appBarLayout, b2);
            if (a2 >= 0) {
                View childAt = appBarLayout.getChildAt(a2);
                int i2 = ((LayoutParams) childAt.getLayoutParams()).f60742a;
                if ((i2 & 17) == 17) {
                    int i3 = -childAt.getTop();
                    int i4 = -childAt.getBottom();
                    if (a2 == appBarLayout.getChildCount() - 1) {
                        i4 += appBarLayout.getTopInset();
                    }
                    if (a(i2, 2)) {
                        i4 += ViewCompat.getMinimumHeight(childAt);
                    } else if (a(i2, 5)) {
                        int minimumHeight = ViewCompat.getMinimumHeight(childAt) + i4;
                        if (b2 < minimumHeight) {
                            i3 = minimumHeight;
                        } else {
                            i4 = minimumHeight;
                        }
                    }
                    int i5 = (i4 + i3) / 2;
                    a(coordinatorLayout, appBarLayout, MathUtils.clamp(i5, -appBarLayout.getTotalScrollRange(), 0), 0.0f);
                    new StringBuilder("+++AppBarLayout...snapToChildIfNeeded___executed...").append(i5);
                }
            }
        }

        private boolean b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            List<View> list;
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            AppBarLayout appBarLayout2 = appBarLayout;
            if (PatchProxy.isSupport(new Object[]{coordinatorLayout2, appBarLayout2}, this, f60717a, false, 66435, new Class[]{CoordinatorLayout.class, AppBarLayout.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{coordinatorLayout2, appBarLayout2}, this, f60717a, false, 66435, new Class[]{CoordinatorLayout.class, AppBarLayout.class}, Boolean.TYPE)).booleanValue();
            }
            if (PatchProxy.isSupport(new Object[]{appBarLayout2}, coordinatorLayout, CoordinatorLayout.f60744a, false, 66500, new Class[]{View.class}, List.class)) {
                CoordinatorLayout coordinatorLayout3 = coordinatorLayout;
                list = (List) PatchProxy.accessDispatch(new Object[]{appBarLayout2}, coordinatorLayout3, CoordinatorLayout.f60744a, false, 66500, new Class[]{View.class}, List.class);
            } else {
                List b2 = coordinatorLayout2.f60749f.b(appBarLayout2);
                coordinatorLayout2.g.clear();
                if (b2 != null) {
                    coordinatorLayout2.g.addAll(b2);
                }
                list = coordinatorLayout2.g;
            }
            int size = list.size();
            int i2 = 0;
            while (i2 < size) {
                CoordinatorLayout.b bVar = ((CoordinatorLayout.d) list.get(i2).getLayoutParams()).f60758b;
                if (!(bVar instanceof ScrollingViewBehavior)) {
                    i2++;
                } else if (((ScrollingViewBehavior) bVar).mOverlayTop != 0) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }

        public final /* synthetic */ void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            Parcelable parcelable2 = parcelable;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (PatchProxy.isSupport(new Object[]{coordinatorLayout2, appBarLayout, parcelable2}, this, f60717a, false, 66439, new Class[]{CoordinatorLayout.class, AppBarLayout.class, Parcelable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{coordinatorLayout2, appBarLayout, parcelable2}, this, f60717a, false, 66439, new Class[]{CoordinatorLayout.class, AppBarLayout.class, Parcelable.class}, Void.TYPE);
            } else if (parcelable2 instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable2;
                super.onRestoreInstanceState(coordinatorLayout2, appBarLayout, savedState.getSuperState());
                this.g = savedState.f60738b;
                this.i = savedState.f60739c;
                this.h = savedState.f60740d;
            } else {
                super.onRestoreInstanceState(coordinatorLayout2, appBarLayout, parcelable2);
                this.g = -1;
            }
        }

        public final /* synthetic */ void toggleAppBarLayout(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i2) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (PatchProxy.isSupport(new Object[]{coordinatorLayout, appBarLayout, Integer.valueOf(i2)}, this, f60717a, false, 66430, new Class[]{CoordinatorLayout.class, AppBarLayout.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{coordinatorLayout, appBarLayout, Integer.valueOf(i2)}, this, f60717a, false, 66430, new Class[]{CoordinatorLayout.class, AppBarLayout.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            a(coordinatorLayout, appBarLayout, i2, 200, true);
        }

        public final /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i2) {
            boolean z;
            int round;
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (PatchProxy.isSupport(new Object[]{coordinatorLayout2, appBarLayout, Integer.valueOf(i2)}, this, f60717a, false, 66425, new Class[]{CoordinatorLayout.class, AppBarLayout.class, Integer.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{coordinatorLayout2, appBarLayout, Integer.valueOf(i2)}, this, f60717a, false, 66425, new Class[]{CoordinatorLayout.class, AppBarLayout.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
            }
            boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, appBarLayout, i2);
            int pendingAction = appBarLayout.getPendingAction();
            if (this.g >= 0 && (pendingAction & 8) == 0) {
                View childAt = appBarLayout.getChildAt(this.g);
                int i3 = -childAt.getBottom();
                if (this.h) {
                    round = i3 + ViewCompat.getMinimumHeight(childAt) + appBarLayout.getTopInset();
                } else {
                    round = i3 + Math.round(((float) childAt.getHeight()) * this.i);
                }
                a(coordinatorLayout, appBarLayout, round, 0, false);
            } else if (pendingAction != 0) {
                if ((pendingAction & 4) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if ((pendingAction & 2) != 0) {
                    int i4 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z) {
                        a(coordinatorLayout, appBarLayout, i4, 0.0f);
                    } else {
                        a(coordinatorLayout, appBarLayout, i4, 0, false);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        a(coordinatorLayout, appBarLayout, 0, 0.0f);
                    } else {
                        a(coordinatorLayout, appBarLayout, 0, 0, false);
                    }
                }
            }
            appBarLayout.f60711c = 0;
            this.g = -1;
            setTopAndBottomOffset(MathUtils.clamp(getTopAndBottomOffset(), -appBarLayout.getTotalScrollRange(), 0));
            b(coordinatorLayout, appBarLayout, getTopAndBottomOffset(), 0, true);
            appBarLayout.c(getTopAndBottomOffset());
            return onLayoutChild;
        }

        private void a(AppBarLayout appBarLayout, int i2, int i3, float f2) {
            int i4;
            final AppBarLayout appBarLayout2 = appBarLayout;
            final int i5 = i3;
            if (PatchProxy.isSupport(new Object[]{appBarLayout2, Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2)}, this, f60717a, false, 66418, new Class[]{AppBarLayout.class, Integer.TYPE, Integer.TYPE, Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{appBarLayout2, Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2)}, this, f60717a, false, 66418, new Class[]{AppBarLayout.class, Integer.TYPE, Integer.TYPE, Float.TYPE}, Void.TYPE);
                return;
            }
            if (this.m == null) {
                int abs = Math.abs(b() - i5);
                float abs2 = Math.abs(f2);
                if (abs2 > 0.0f) {
                    i4 = Math.round((((float) abs) / abs2) * 1000.0f) * 1;
                } else {
                    i4 = (int) (((((float) abs) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f);
                }
                this.m = new ValueAnimator();
                this.m.setDuration((long) i4);
                this.m.setInterpolator(new DecelerateInterpolator());
                this.m.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f60721a;

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f60721a, false, 66440, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f60721a, false, 66440, new Class[]{ValueAnimator.class}, Void.TYPE);
                            return;
                        }
                        Behavior.this.setTopAndBottomOffset(((Integer) valueAnimator.getAnimatedValue()).intValue());
                        appBarLayout2.c(Behavior.this.getTopAndBottomOffset());
                    }
                });
            } else if (this.m.isRunning()) {
                this.m.removeAllListeners();
                this.m.cancel();
            }
            this.n = true;
            this.m.addListener(new AnimatorListenerAdapter() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f60724a;

                public final void onAnimationEnd(Animator animator) {
                    int i = 1;
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f60724a, false, 66441, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f60724a, false, 66441, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    if (i5 != 0) {
                        i = 0;
                    }
                    appBarLayout2.d(i);
                }
            });
            this.m.setIntValues(new int[]{i2, i5});
            this.m.start();
        }

        public final /* synthetic */ void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i2) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            View view3 = view2;
            int i3 = i2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int i4 = 0;
            if (PatchProxy.isSupport(new Object[]{coordinatorLayout2, appBarLayout, view3, Integer.valueOf(i2)}, this, f60717a, false, 66412, new Class[]{CoordinatorLayout.class, AppBarLayout.class, View.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{coordinatorLayout2, appBarLayout, view3, Integer.valueOf(i2)}, this, f60717a, false, 66412, new Class[]{CoordinatorLayout.class, AppBarLayout.class, View.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            new StringBuilder("+++AppBarLayoutTag...onStopNestedScroll...type : ").append(i3);
            if (i3 == 0) {
                a(coordinatorLayout2, appBarLayout);
            }
            this.j = new WeakReference<>(view3);
            this.k.remove(Integer.valueOf(i2));
            if (i3 == 1) {
                if (getTopAndBottomOffset() == 0) {
                    i4 = 1;
                }
                appBarLayout.d(i4);
                return;
            }
            a(appBarLayout, this.l);
            this.l = 0.0f;
        }

        private void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i2, float f2) {
            int i3;
            int height;
            AppBarLayout appBarLayout2 = appBarLayout;
            int i4 = i2;
            if (PatchProxy.isSupport(new Object[]{coordinatorLayout, appBarLayout2, Integer.valueOf(i2), Float.valueOf(0.0f)}, this, f60717a, false, 66420, new Class[]{CoordinatorLayout.class, AppBarLayout.class, Integer.TYPE, Float.TYPE}, Void.TYPE)) {
                Object[] objArr = {coordinatorLayout, appBarLayout2, Integer.valueOf(i2), Float.valueOf(0.0f)};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, this, f60717a, false, 66420, new Class[]{CoordinatorLayout.class, AppBarLayout.class, Integer.TYPE, Float.TYPE}, Void.TYPE);
                return;
            }
            if (i4 == (-appBarLayout.getHeight())) {
                i3 = appBarLayout2.f60713e + i4;
            } else {
                i3 = i4;
            }
            int abs = Math.abs(b() - i3);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0.0f) {
                height = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((((float) abs) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f);
            }
            a(coordinatorLayout, appBarLayout, i2, height, false);
        }

        public final /* synthetic */ boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, float f2, float f3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (!PatchProxy.isSupport(new Object[]{coordinatorLayout, appBarLayout, view2, Float.valueOf(f2), Float.valueOf(f3)}, this, f60717a, false, 66416, new Class[]{CoordinatorLayout.class, AppBarLayout.class, View.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                return super.onNestedPreFling(coordinatorLayout, appBarLayout, view2, f2, f3);
            }
            Object[] objArr = {coordinatorLayout, appBarLayout, view2, Float.valueOf(f2), Float.valueOf(f3)};
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, f60717a, false, 66416, new Class[]{CoordinatorLayout.class, AppBarLayout.class, View.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }

        private void b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i2, int i3, boolean z) {
            AppBarLayout appBarLayout2 = appBarLayout;
            int i4 = i2;
            boolean z2 = false;
            if (PatchProxy.isSupport(new Object[]{coordinatorLayout, appBarLayout2, Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : 0)}, this, f60717a, false, 66434, new Class[]{CoordinatorLayout.class, AppBarLayout.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                Object[] objArr = {coordinatorLayout, appBarLayout2, Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z)};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, this, f60717a, false, 66434, new Class[]{CoordinatorLayout.class, AppBarLayout.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                return;
            }
            View c2 = c(appBarLayout, i2);
            if (c2 != null) {
                int i5 = ((LayoutParams) c2.getLayoutParams()).f60742a;
                if ((i5 & 1) != 0) {
                    int minimumHeight = ViewCompat.getMinimumHeight(c2);
                    if (i3 <= 0 || (i5 & 12) == 0 ? !((i5 & 2) == 0 || (-i4) < (c2.getBottom() - minimumHeight) - appBarLayout.getTopInset()) : (-i4) >= (c2.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        z2 = true;
                    }
                }
                boolean a2 = appBarLayout2.a(z2);
                if (Build.VERSION.SDK_INT >= 11 && (z || (a2 && b(coordinatorLayout, appBarLayout)))) {
                    appBarLayout.jumpDrawablesToCurrentState();
                }
            }
        }

        private void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i2, int i3, boolean z) {
            final CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            final AppBarLayout appBarLayout2 = appBarLayout;
            final int i4 = i2;
            if (PatchProxy.isSupport(new Object[]{coordinatorLayout2, appBarLayout2, Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : 0)}, this, f60717a, false, 66421, new Class[]{CoordinatorLayout.class, AppBarLayout.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{coordinatorLayout2, appBarLayout2, Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z)}, this, f60717a, false, 66421, new Class[]{CoordinatorLayout.class, AppBarLayout.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                return;
            }
            int b2 = b();
            if (b2 == i4) {
                if (this.f60720f != null && this.f60720f.isRunning()) {
                    this.f60720f.cancel();
                }
                return;
            }
            if (this.f60720f == null) {
                this.f60720f = new ValueAnimator();
                this.f60720f.setInterpolator(new DecelerateInterpolator());
                final boolean z2 = z;
                this.f60720f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f60728a;

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int i;
                        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f60728a, false, 66442, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f60728a, false, 66442, new Class[]{ValueAnimator.class}, Void.TYPE);
                            return;
                        }
                        Behavior behavior = Behavior.this;
                        CoordinatorLayout coordinatorLayout = coordinatorLayout2;
                        AppBarLayout appBarLayout = appBarLayout2;
                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        if (z2) {
                            i = -1;
                        } else {
                            i = 1;
                        }
                        behavior.a(coordinatorLayout, appBarLayout, intValue, i, false);
                        appBarLayout2.c(Behavior.this.getTopAndBottomOffset());
                    }
                });
            } else {
                this.f60720f.removeAllListeners();
                this.f60720f.cancel();
            }
            this.f60720f.addListener(new AnimatorListenerAdapter() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f60733a;

                public final void onAnimationEnd(Animator animator) {
                    int i = 1;
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f60733a, false, 66443, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f60733a, false, 66443, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    if (i4 != 0) {
                        i = 0;
                    }
                    appBarLayout2.d(i);
                }
            });
            this.n = false;
            this.f60720f.setDuration((long) Math.min(i3, 600));
            this.f60720f.setIntValues(new int[]{b2, i4});
            this.f60720f.start();
        }

        public final /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int i5) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (PatchProxy.isSupport(new Object[]{coordinatorLayout, appBarLayout, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f60717a, false, 66424, new Class[]{CoordinatorLayout.class, AppBarLayout.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
                Object[] objArr = {coordinatorLayout, appBarLayout, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, f60717a, false, 66424, new Class[]{CoordinatorLayout.class, AppBarLayout.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
            } else if (((CoordinatorLayout.d) appBarLayout.getLayoutParams()).height != -2) {
                return super.onMeasureChild(coordinatorLayout, appBarLayout, i2, i3, i4, i5);
            } else {
                coordinatorLayout.a(appBarLayout, i2, i3, View.MeasureSpec.makeMeasureSpec(0, 0), i5);
                return true;
            }
        }

        public final /* synthetic */ boolean onNestedFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, float f2, float f3, boolean z) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (PatchProxy.isSupport(new Object[]{coordinatorLayout, appBarLayout, view2, Float.valueOf(f2), Float.valueOf(f3), Byte.valueOf(z ? (byte) 1 : 0)}, this, f60717a, false, 66417, new Class[]{CoordinatorLayout.class, AppBarLayout.class, View.class, Float.TYPE, Float.TYPE, Boolean.TYPE}, Boolean.TYPE)) {
                Object[] objArr = {coordinatorLayout, appBarLayout, view2, Float.valueOf(f2), Float.valueOf(f3), Byte.valueOf(z)};
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, f60717a, false, 66417, new Class[]{CoordinatorLayout.class, AppBarLayout.class, View.class, Float.TYPE, Float.TYPE, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
            }
            float f4 = f3;
            this.l = f4;
            return super.onNestedFling(coordinatorLayout, appBarLayout, view2, f2, f4, z);
        }

        public final /* synthetic */ boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {
            boolean z;
            boolean z2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z3 = true;
            if (PatchProxy.isSupport(new Object[]{coordinatorLayout, appBarLayout, view2, view3, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60717a, false, 66409, new Class[]{CoordinatorLayout.class, AppBarLayout.class, View.class, View.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{coordinatorLayout, appBarLayout, view2, view3, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60717a, false, 66409, new Class[]{CoordinatorLayout.class, AppBarLayout.class, View.class, View.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
            }
            new StringBuilder("+++AppBarLayoutTag...onStartNestedScroll...").append(i3);
            int i4 = i2 & 2;
            if (i4 == 0 || !appBarLayout.b() || coordinatorLayout.getHeight() - view2.getHeight() > appBarLayout.getHeight()) {
                z = false;
            } else {
                z = true;
            }
            StringBuilder sb = new StringBuilder("+++CoordinatorLayout...onStartNestedScroll...nestedScrollAxes...");
            if (i4 != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            sb.append(z2);
            new StringBuilder("+++CoordinatorLayout...onStartNestedScroll...hasScrollableChildren...").append(appBarLayout.b());
            StringBuilder sb2 = new StringBuilder("+++CoordinatorLayout...onStartNestedScroll...height...");
            if (coordinatorLayout.getHeight() - view2.getHeight() > appBarLayout.getHeight()) {
                z3 = false;
            }
            sb2.append(z3);
            new StringBuilder("+++CoordinatorLayout...onStartNestedScroll...child...").append(view2.getClass().getName());
            if (z && this.f60720f != null) {
                this.f60720f.cancel();
            }
            this.j = null;
            if (PatchProxy.isSupport(new Object[0], this, f60717a, false, 66419, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f60717a, false, 66419, new Class[0], Void.TYPE);
            } else {
                this.n = false;
                if (this.m != null) {
                    if (this.m.isRunning()) {
                        this.m.removeAllListeners();
                        this.m.cancel();
                    }
                    this.m = null;
                }
            }
            this.k.put(Integer.valueOf(i3), null);
            return z;
        }

        public final /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr, int i4) {
            int i5;
            int i6 = i3;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int i7 = 0;
            if (PatchProxy.isSupport(new Object[]{coordinatorLayout, appBarLayout, view2, Integer.valueOf(i2), Integer.valueOf(i3), iArr, Integer.valueOf(i4)}, this, f60717a, false, 66410, new Class[]{CoordinatorLayout.class, AppBarLayout.class, View.class, Integer.TYPE, Integer.TYPE, int[].class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{coordinatorLayout, appBarLayout, view2, Integer.valueOf(i2), Integer.valueOf(i3), iArr, Integer.valueOf(i4)}, this, f60717a, false, 66410, new Class[]{CoordinatorLayout.class, AppBarLayout.class, View.class, Integer.TYPE, Integer.TYPE, int[].class, Integer.TYPE}, Void.TYPE);
                return;
            }
            StringBuilder sb = new StringBuilder("+++AppBarLayout...onNestedPreScroll...dy : ");
            sb.append(i6);
            sb.append(" type : ");
            sb.append(i4);
            if (i6 != 0) {
                if (this.n) {
                    iArr[1] = i6;
                    return;
                }
                if (i6 < 0) {
                    i5 = -appBarLayout.getTotalScrollRange();
                    i7 = appBarLayout.getDownNestedPreScrollRange() + i5;
                } else {
                    i5 = -appBarLayout.getUpNestedPreScrollRange();
                }
                int i8 = i5;
                if (i8 != i7) {
                    iArr[1] = b(coordinatorLayout, appBarLayout, i3, i8, i7, i4, false);
                }
            }
        }

        public final /* synthetic */ void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int i4, int i5, int i6) {
            int i7 = i5;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (PatchProxy.isSupport(new Object[]{coordinatorLayout, appBarLayout, view2, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)}, this, f60717a, false, 66411, new Class[]{CoordinatorLayout.class, AppBarLayout.class, View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{coordinatorLayout, appBarLayout, view2, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)}, this, f60717a, false, 66411, new Class[]{CoordinatorLayout.class, AppBarLayout.class, View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            StringBuilder sb = new StringBuilder("+++AppBarLayout...onNestedScroll...dyUnconsumed : ");
            sb.append(i7);
            sb.append(" type : ");
            sb.append(i6);
            if (i7 < 0) {
                if (!this.n) {
                    b(coordinatorLayout, appBarLayout, i5, -appBarLayout.getDownNestedScrollRange(), 0, i6, false);
                }
            }
        }
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f60742a = 1;

        /* renamed from: b  reason: collision with root package name */
        public Interpolator f60743b;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        public @interface ScrollFlags {
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        @RequiresApi(19)
        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(-1, -2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AppBarLayout_Layout);
            this.f60742a = obtainStyledAttributes.getInt(0, 0);
            if (obtainStyledAttributes.hasValue(1)) {
                this.f60743b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(1, 0));
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class ScrollingViewBehavior extends c {
        public static ChangeQuickRedirect changeQuickRedirect;

        public ScrollingViewBehavior() {
        }

        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i) {
            return super.setLeftAndRightOffset(i);
        }

        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i) {
            return super.setTopAndBottomOffset(i);
        }

        private static int getAppBarLayoutOffset(AppBarLayout appBarLayout) {
            if (PatchProxy.isSupport(new Object[]{appBarLayout}, null, changeQuickRedirect, true, 66451, new Class[]{AppBarLayout.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{appBarLayout}, null, changeQuickRedirect, true, 66451, new Class[]{AppBarLayout.class}, Integer.TYPE)).intValue();
            }
            CoordinatorLayout.b bVar = ((CoordinatorLayout.d) appBarLayout.getLayoutParams()).f60758b;
            if (bVar instanceof Behavior) {
                return ((Behavior) bVar).b();
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        public AppBarLayout findFirstDependency(List<View> list) {
            List<View> list2 = list;
            if (PatchProxy.isSupport(new Object[]{list2}, this, changeQuickRedirect, false, 66452, new Class[]{List.class}, AppBarLayout.class)) {
                return (AppBarLayout) PatchProxy.accessDispatch(new Object[]{list2}, this, changeQuickRedirect, false, 66452, new Class[]{List.class}, AppBarLayout.class);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list2.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public float getOverlapRatioForOffset(View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, changeQuickRedirect, false, 66450, new Class[]{View.class}, Float.TYPE)) {
                return ((Float) PatchProxy.accessDispatch(new Object[]{view2}, this, changeQuickRedirect, false, 66450, new Class[]{View.class}, Float.TYPE)).floatValue();
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int appBarLayoutOffset = getAppBarLayoutOffset(appBarLayout);
                if (downNestedPreScrollRange != 0 && totalScrollRange + appBarLayoutOffset <= downNestedPreScrollRange) {
                    return 0.0f;
                }
                int i = totalScrollRange - downNestedPreScrollRange;
                if (i != 0) {
                    return (((float) appBarLayoutOffset) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* access modifiers changed from: package-private */
        public int getScrollRange(View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, changeQuickRedirect, false, 66453, new Class[]{View.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{view2}, this, changeQuickRedirect, false, 66453, new Class[]{View.class}, Integer.TYPE)).intValue();
            } else if (view2 instanceof AppBarLayout) {
                return ((AppBarLayout) view2).getTotalScrollRange();
            } else {
                return super.getScrollRange(view);
            }
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ScrollingViewBehavior_Layout);
            this.mOverlayTop = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.onLayoutChild(coordinatorLayout, view, i);
        }

        private void offsetChildAsNeeded(CoordinatorLayout coordinatorLayout, View view, View view2) {
            View view3 = view;
            View view4 = view2;
            if (PatchProxy.isSupport(new Object[]{coordinatorLayout, view3, view4}, this, changeQuickRedirect, false, 66449, new Class[]{CoordinatorLayout.class, View.class, View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{coordinatorLayout, view3, view4}, this, changeQuickRedirect, false, 66449, new Class[]{CoordinatorLayout.class, View.class, View.class}, Void.TYPE);
                return;
            }
            CoordinatorLayout.b bVar = ((CoordinatorLayout.d) view2.getLayoutParams()).f60758b;
            if (bVar instanceof Behavior) {
                ViewCompat.offsetTopAndBottom(view3, (((view2.getBottom() - view.getTop()) + ((Behavior) bVar).f60718b) + this.mVerticalLayoutGap) - getOverlapPixelsForOffset(view4));
            }
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (PatchProxy.isSupport(new Object[]{coordinatorLayout, view, view2}, this, changeQuickRedirect, false, 66447, new Class[]{CoordinatorLayout.class, View.class, View.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{coordinatorLayout, view, view2}, this, changeQuickRedirect, false, 66447, new Class[]{CoordinatorLayout.class, View.class, View.class}, Boolean.TYPE)).booleanValue();
            }
            offsetChildAsNeeded(coordinatorLayout, view, view2);
            return false;
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            Rect rect2 = rect;
            if (PatchProxy.isSupport(new Object[]{coordinatorLayout, view, rect2, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 66448, new Class[]{CoordinatorLayout.class, View.class, Rect.class, Boolean.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{coordinatorLayout, view, rect2, Byte.valueOf(z)}, this, changeQuickRedirect, false, 66448, new Class[]{CoordinatorLayout.class, View.class, Rect.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
            }
            AppBarLayout findFirstDependency = findFirstDependency(coordinatorLayout.b(view));
            if (findFirstDependency != null) {
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.mTempRect1;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    findFirstDependency.a(false, !z);
                    return true;
                }
            }
            return false;
        }

        public /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(coordinatorLayout, view, i, i2, i3, i4);
        }
    }

    public interface a {
        void a(int i);

        void a(AppBarLayout appBarLayout, int i);
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public int getAnchorHeight() {
        return this.f60714f;
    }

    /* access modifiers changed from: package-private */
    public int getPendingAction() {
        return this.f60711c;
    }

    public final void a(boolean z, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f60709a, false, 66390, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f60709a, false, 66390, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(z, z2, true);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f60709a, false, 66405, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f60709a, false, 66405, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.l == z) {
            return false;
        } else {
            this.l = z;
            refreshDrawableState();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.g = -1;
        this.h = -1;
        this.i = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public LayoutParams generateDefaultLayoutParams() {
        if (!PatchProxy.isSupport(new Object[0], this, f60709a, false, 66392, new Class[0], LayoutParams.class)) {
            return new LayoutParams(-1, -2);
        }
        return (LayoutParams) PatchProxy.accessDispatch(new Object[0], this, f60709a, false, 66392, new Class[0], LayoutParams.class);
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f60709a, false, 66396, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f60709a, false, 66396, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (getTotalScrollRange() != 0) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final int getTopInset() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f60709a, false, 66406, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f60709a, false, 66406, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.f60712d != null) {
            i2 = this.f60712d.getSystemWindowInsetTop();
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public int getUpNestedPreScrollRange() {
        if (!PatchProxy.isSupport(new Object[0], this, f60709a, false, 66397, new Class[0], Integer.TYPE)) {
            return getTotalScrollRange();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f60709a, false, 66397, new Class[0], Integer.TYPE)).intValue();
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedPreScrollRange() {
        if (PatchProxy.isSupport(new Object[0], this, f60709a, false, 66398, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f60709a, false, 66398, new Class[0], Integer.TYPE)).intValue();
        } else if (this.h != -1) {
            return this.h;
        } else {
            int i2 = 0;
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = getChildAt(childCount);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = layoutParams.f60742a;
                if ((i3 & 5) != 5) {
                    if (i2 > 0) {
                        break;
                    }
                } else {
                    int i4 = i2 + layoutParams.topMargin + layoutParams.bottomMargin;
                    if ((i3 & 8) != 0) {
                        i2 = i4 + ViewCompat.getMinimumHeight(childAt);
                    } else if ((i3 & 2) != 0) {
                        i2 = i4 + (measuredHeight - ViewCompat.getMinimumHeight(childAt));
                    } else {
                        i2 = i4 + (measuredHeight - getTopInset());
                    }
                }
            }
            int max = Math.max(0, i2);
            this.h = max;
            return max;
        }
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedScrollRange() {
        if (PatchProxy.isSupport(new Object[0], this, f60709a, false, 66399, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f60709a, false, 66399, new Class[0], Integer.TYPE)).intValue();
        } else if (this.i != -1) {
            return this.i;
        } else {
            int childCount = getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                int i4 = layoutParams.f60742a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight;
                if ((i4 & 2) != 0) {
                    i3 -= ViewCompat.getMinimumHeight(childAt) + getTopInset();
                    break;
                }
                i2++;
            }
            int max = Math.max(0, i3);
            this.i = max;
            return max;
        }
    }

    /* access modifiers changed from: package-private */
    public final int getMinimumHeightForVisibleOverlappingContent() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f60709a, false, 66402, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f60709a, false, 66402, new Class[0], Integer.TYPE)).intValue();
        }
        int topInset = getTopInset();
        int minimumHeight = ViewCompat.getMinimumHeight(this);
        if (minimumHeight != 0) {
            return (minimumHeight * 2) + topInset;
        }
        int childCount = getChildCount();
        if (childCount > 0) {
            i2 = ViewCompat.getMinimumHeight(getChildAt(childCount - 1));
        }
        if (i2 != 0) {
            return (i2 * 2) + topInset;
        }
        return getHeight() / 3;
    }

    public final int getTotalScrollRange() {
        if (PatchProxy.isSupport(new Object[0], this, f60709a, false, 66395, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f60709a, false, 66395, new Class[0], Integer.TYPE)).intValue();
        } else if (this.g != -1) {
            return this.g;
        } else {
            int childCount = getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = layoutParams.f60742a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight + layoutParams.topMargin + layoutParams.bottomMargin;
                if ((i4 & 2) != 0) {
                    i3 -= ViewCompat.getMinimumHeight(childAt);
                    break;
                }
                i2++;
            }
            int max = Math.max(0, i3 - getTopInset()) - this.f60713e;
            this.g = max;
            return max;
        }
    }

    private void c() {
        boolean z;
        boolean z2;
        if (PatchProxy.isSupport(new Object[0], this, f60709a, false, 66387, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60709a, false, 66387, new Class[0], Void.TYPE);
            return;
        }
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                z = false;
                break;
            }
            LayoutParams layoutParams = (LayoutParams) getChildAt(i2).getLayoutParams();
            if ((layoutParams.f60742a & 1) != 1 || (layoutParams.f60742a & 10) == 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                z = true;
                break;
            }
            i2++;
        }
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f60709a, false, 66404, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f60709a, false, 66404, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.k != z) {
            this.k = z;
            refreshDrawableState();
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public void setAnchorHeight(int i2) {
        if (i2 > 0) {
            this.f60714f = i2;
        }
    }

    @Deprecated
    public void setTargetElevation(float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            h.a(this, f2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AttributeSet attributeSet2 = attributeSet;
        if (!PatchProxy.isSupport(new Object[]{attributeSet2}, this, f60709a, false, 66393, new Class[]{AttributeSet.class}, LayoutParams.class)) {
            return new LayoutParams(getContext(), attributeSet2);
        }
        return (LayoutParams) PatchProxy.accessDispatch(new Object[]{attributeSet2}, this, f60709a, false, 66393, new Class[]{AttributeSet.class}, LayoutParams.class);
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f60709a, false, 66382, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f60709a, false, 66382, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        CoordinatorLayout.b bVar = ((CoordinatorLayout.d) getLayoutParams()).f60758b;
        if (bVar != null && (bVar instanceof b)) {
            bVar.toggleAppBarLayout((CoordinatorLayout) getParent(), this, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f60709a, false, 66400, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f60709a, false, 66400, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.j != null) {
            int size = this.j.size();
            for (int i3 = 0; i3 < size; i3++) {
                a aVar = this.j.get(i3);
                if (!(aVar == null || this.n == i2)) {
                    aVar.a(this, i2);
                    this.n = i2;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void d(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f60709a, false, 66401, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f60709a, false, 66401, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.j != null) {
            int size = this.j.size();
            for (int i3 = 0; i3 < size; i3++) {
                a aVar = this.j.get(i3);
                if (aVar != null) {
                    aVar.a(i2);
                }
            }
        }
    }

    public int[] onCreateDrawableState(int i2) {
        int i3;
        int i4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f60709a, false, 66403, new Class[]{Integer.TYPE}, int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f60709a, false, 66403, new Class[]{Integer.TYPE}, int[].class);
        }
        if (this.m == null) {
            this.m = new int[2];
        }
        int[] iArr = this.m;
        int[] onCreateDrawableState = super.onCreateDrawableState(iArr.length + i2);
        if (this.k) {
            i3 = C0906R.attr.a3r;
        } else {
            i3 = -2130773095;
        }
        iArr[0] = i3;
        if (!this.k || !this.l) {
            i4 = -2130773094;
        } else {
            i4 = C0906R.attr.a3q;
        }
        iArr[1] = i4;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    public void setExpanded(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f60709a, false, 66389, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f60709a, false, 66389, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(z, ViewCompat.isLaidOut(this));
    }

    public void setOrientation(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f60709a, false, 66388, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f60709a, false, 66388, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 == 1) {
            super.setOrientation(i2);
        } else {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParams2 = layoutParams;
        if (PatchProxy.isSupport(new Object[]{layoutParams2}, this, f60709a, false, 66394, new Class[]{ViewGroup.LayoutParams.class}, LayoutParams.class)) {
            return (LayoutParams) PatchProxy.accessDispatch(new Object[]{layoutParams2}, this, f60709a, false, 66394, new Class[]{ViewGroup.LayoutParams.class}, LayoutParams.class);
        } else if (Build.VERSION.SDK_INT >= 19 && (layoutParams2 instanceof LinearLayout.LayoutParams)) {
            return new LayoutParams((LinearLayout.LayoutParams) layoutParams2);
        } else {
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams2);
            }
            return new LayoutParams(layoutParams2);
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f60709a, false, 66381, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f60709a, false, 66381, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        CoordinatorLayout.b bVar = ((CoordinatorLayout.d) getLayoutParams()).f60758b;
        if (bVar != null && (bVar instanceof b)) {
            ((b) bVar).a((CoordinatorLayout) getParent(), this, i2, 0, false);
        }
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f60709a, false, 66383, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f60709a, false, 66383, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (this.j == null) {
            this.j = new ArrayList();
        }
        if (!this.j.contains(aVar)) {
            this.j.add(aVar);
        }
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60709a, false, 66385, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60709a, false, 66385, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
        a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        setOrientation(1);
        if (PatchProxy.isSupport(new Object[]{context2}, null, d.f60781a, true, 66583, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, d.f60781a, true, 66583, new Class[]{Context.class}, Void.TYPE);
        } else {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(d.f60782b);
            boolean z = !obtainStyledAttributes.hasValue(0);
            obtainStyledAttributes.recycle();
            if (z) {
                throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            if (PatchProxy.isSupport(new Object[]{this}, null, h.f60792a, true, 66595, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{this}, null, h.f60792a, true, 66595, new Class[]{View.class}, Void.TYPE);
            } else {
                setOutlineProvider(ViewOutlineProvider.BOUNDS);
            }
            if (PatchProxy.isSupport(new Object[]{this, attributeSet2, 0, Integer.valueOf(C0906R.style.ow)}, null, h.f60792a, true, 66596, new Class[]{View.class, AttributeSet.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{this, attributeSet2, 0, Integer.valueOf(C0906R.style.ow)}, null, h.f60792a, true, 66596, new Class[]{View.class, AttributeSet.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else {
                Context context3 = getContext();
                TypedArray obtainStyledAttributes2 = context3.obtainStyledAttributes(attributeSet2, h.f60793b, 0, C0906R.style.ow);
                try {
                    if (obtainStyledAttributes2.hasValue(0)) {
                        setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, obtainStyledAttributes2.getResourceId(0, 0)));
                    }
                } catch (Exception e2) {
                    com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
                } catch (Throwable th) {
                    obtainStyledAttributes2.recycle();
                    throw th;
                }
                obtainStyledAttributes2.recycle();
            }
        }
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet2, R$styleable.AppBarLayout, 0, C0906R.style.ow);
        ViewCompat.setBackground(this, obtainStyledAttributes3.getDrawable(0));
        if (obtainStyledAttributes3.hasValue(4)) {
            a(obtainStyledAttributes3.getBoolean(4, false), false, false);
        }
        if (Build.VERSION.SDK_INT >= 21 && obtainStyledAttributes3.hasValue(3)) {
            h.a(this, (float) obtainStyledAttributes3.getDimensionPixelSize(3, 0));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (obtainStyledAttributes3.hasValue(2)) {
                setKeyboardNavigationCluster(obtainStyledAttributes3.getBoolean(2, false));
            }
            if (obtainStyledAttributes3.hasValue(1)) {
                setTouchscreenBlocksFocus(obtainStyledAttributes3.getBoolean(1, false));
            }
        }
        obtainStyledAttributes3.recycle();
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60715a;

            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                if (PatchProxy.isSupport(new Object[]{view, windowInsetsCompat}, this, f60715a, false, 66408, new Class[]{View.class, WindowInsetsCompat.class}, WindowInsetsCompat.class)) {
                    return (WindowInsetsCompat) PatchProxy.accessDispatch(new Object[]{view, windowInsetsCompat}, this, f60715a, false, 66408, new Class[]{View.class, WindowInsetsCompat.class}, WindowInsetsCompat.class);
                }
                AppBarLayout appBarLayout = AppBarLayout.this;
                if (PatchProxy.isSupport(new Object[]{windowInsetsCompat}, appBarLayout, AppBarLayout.f60709a, false, 66407, new Class[]{WindowInsetsCompat.class}, WindowInsetsCompat.class)) {
                    return (WindowInsetsCompat) PatchProxy.accessDispatch(new Object[]{windowInsetsCompat}, appBarLayout, AppBarLayout.f60709a, false, 66407, new Class[]{WindowInsetsCompat.class}, WindowInsetsCompat.class);
                }
                WindowInsetsCompat windowInsetsCompat2 = null;
                if (ViewCompat.getFitsSystemWindows(appBarLayout)) {
                    windowInsetsCompat2 = windowInsetsCompat;
                }
                if (!ObjectsCompat.equals(appBarLayout.f60712d, windowInsetsCompat2)) {
                    appBarLayout.f60712d = windowInsetsCompat2;
                    appBarLayout.a();
                }
                return windowInsetsCompat;
            }
        });
    }

    private void a(boolean z, boolean z2, boolean z3) {
        int i2;
        int i3 = 0;
        int i4 = 1;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f60709a, false, 66391, new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2), Byte.valueOf(z3)}, this, f60709a, false, 66391, new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!z) {
            i4 = 2;
        }
        if (z2) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        int i5 = i2 | i4;
        if (z3) {
            i3 = 8;
        }
        this.f60711c = i5 | i3;
        requestLayout();
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f60709a, false, 66386, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f60709a, false, 66386, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onLayout(z, i2, i3, i4, i5);
        a();
        this.f60710b = false;
        int childCount = getChildCount();
        while (true) {
            if (i6 >= childCount) {
                break;
            } else if (((LayoutParams) getChildAt(i6).getLayoutParams()).f60743b != null) {
                this.f60710b = true;
                break;
            } else {
                i6++;
            }
        }
        c();
    }
}
