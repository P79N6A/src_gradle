package com.ss.android.ugc.aweme.poi.ui.detail.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.FloatRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.VisibleForTesting;
import android.support.coreui.R$styleable;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.math.MathUtils;
import android.support.v4.util.ObjectsCompat;
import android.support.v4.util.Pools;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.NestedScrollingParent2;
import android.support.v4.view.NestedScrollingParentHelper;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.taobao.android.dexposed.ClassUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements NestedScrollingParent2 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60744a;

    /* renamed from: b  reason: collision with root package name */
    static final String f60745b;

    /* renamed from: c  reason: collision with root package name */
    static final Class<?>[] f60746c = {Context.class, AttributeSet.class};

    /* renamed from: d  reason: collision with root package name */
    static final ThreadLocal<Map<String, Constructor<b>>> f60747d = new ThreadLocal<>();

    /* renamed from: e  reason: collision with root package name */
    static final Comparator<View> f60748e;
    private static final Pools.Pool<Rect> k = new Pools.SynchronizedPool(12);

    /* renamed from: f  reason: collision with root package name */
    final a<View> f60749f;
    final List<View> g;
    WindowInsetsCompat h;
    boolean i;
    ViewGroup.OnHierarchyChangeListener j;
    private final List<View> l;
    private final List<View> m;
    private final int[] n;
    private Paint o;
    private boolean p;
    private boolean q;
    private int[] r;
    private View s;
    private View t;
    private e u;
    private boolean v;
    private Drawable w;
    private OnApplyWindowInsetsListener x;
    private final NestedScrollingParentHelper y;

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    public @interface DefaultBehavior {
        Class<? extends b> a();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface DispatchChangeEvent {
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60754a;

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f60754a, false, 66554, new Class[]{Parcel.class}, SavedState.class)) {
                    return new SavedState(parcel2, null);
                }
                return (SavedState) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f60754a, false, 66554, new Class[]{Parcel.class}, SavedState.class);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                Parcel parcel2 = parcel;
                ClassLoader classLoader2 = classLoader;
                if (!PatchProxy.isSupport(new Object[]{parcel2, classLoader2}, this, f60754a, false, 66553, new Class[]{Parcel.class, ClassLoader.class}, SavedState.class)) {
                    return new SavedState(parcel2, classLoader2);
                }
                return (SavedState) PatchProxy.accessDispatch(new Object[]{parcel2, classLoader2}, this, f60754a, false, 66553, new Class[]{Parcel.class, ClassLoader.class}, SavedState.class);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60752a;

        /* renamed from: b  reason: collision with root package name */
        SparseArray<Parcelable> f60753b;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f60753b = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f60753b.append(iArr[i], readParcelableArray[i]);
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            int i2;
            if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, f60752a, false, 66552, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, f60752a, false, 66552, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.writeToParcel(parcel, i);
            if (this.f60753b != null) {
                i2 = this.f60753b.size();
            } else {
                i2 = 0;
            }
            parcel.writeInt(i2);
            int[] iArr = new int[i2];
            Parcelable[] parcelableArr = new Parcelable[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = this.f60753b.keyAt(i3);
                parcelableArr[i3] = this.f60753b.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    public interface a {
        @NonNull
        b a();
    }

    public static abstract class b<V extends View> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Rect rect) {
            return false;
        }

        @ColorInt
        public int getScrimColor(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        @FloatRange(from = 0.0d, to = 1.0d)
        public float getScrimOpacity(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        @NonNull
        public WindowInsetsCompat onApplyWindowInsets(CoordinatorLayout coordinatorLayout, V v, WindowInsetsCompat windowInsetsCompat) {
            return windowInsetsCompat;
        }

        public void onAttachedToLayoutParams(@NonNull d dVar) {
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void onDetachedFromLayoutParams() {
        }

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean onNestedFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, float f2, float f3, boolean z) {
            return false;
        }

        public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, float f2, float f3) {
            return false;
        }

        @Deprecated
        public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr) {
        }

        @Deprecated
        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        public void onNestedScrollAccepted(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i) {
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        @Deprecated
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i) {
            return false;
        }

        @Deprecated
        public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view) {
        }

        public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public void toggleAppBarLayout(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        }

        public b() {
        }

        public static Object getTag(View view) {
            if (!PatchProxy.isSupport(new Object[]{view}, null, changeQuickRedirect, true, 66533, new Class[]{View.class}, Object.class)) {
                return ((d) view.getLayoutParams()).q;
            }
            return PatchProxy.accessDispatch(new Object[]{view}, null, changeQuickRedirect, true, 66533, new Class[]{View.class}, Object.class);
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public b(Context context, AttributeSet attributeSet) {
        }

        public static void setTag(View view, Object obj) {
            Object obj2 = obj;
            if (PatchProxy.isSupport(new Object[]{view, obj2}, null, changeQuickRedirect, true, 66532, new Class[]{View.class, Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, obj2}, null, changeQuickRedirect, true, 66532, new Class[]{View.class, Object.class}, Void.TYPE);
                return;
            }
            ((d) view.getLayoutParams()).q = obj2;
        }

        public boolean blocksInteractionBelow(CoordinatorLayout coordinatorLayout, V v) {
            if (PatchProxy.isSupport(new Object[]{coordinatorLayout, v}, this, changeQuickRedirect, false, 66531, new Class[]{CoordinatorLayout.class, View.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{coordinatorLayout, v}, this, changeQuickRedirect, false, 66531, new Class[]{CoordinatorLayout.class, View.class}, Boolean.TYPE)).booleanValue();
            } else if (getScrimOpacity(coordinatorLayout, v) > 0.0f) {
                return true;
            } else {
                return false;
            }
        }

        public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i) {
            if (PatchProxy.isSupport(new Object[]{coordinatorLayout, v, view, Integer.valueOf(i)}, this, changeQuickRedirect, false, 66536, new Class[]{CoordinatorLayout.class, View.class, View.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{coordinatorLayout, v, view, Integer.valueOf(i)}, this, changeQuickRedirect, false, 66536, new Class[]{CoordinatorLayout.class, View.class, View.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (i == 0) {
                onStopNestedScroll(coordinatorLayout, v, view);
            }
        }

        public void onNestedScrollAccepted(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{coordinatorLayout, v, view, view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 66535, new Class[]{CoordinatorLayout.class, View.class, View.class, View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                Object[] objArr = {coordinatorLayout, v, view, view2, Integer.valueOf(i), Integer.valueOf(i2)};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 66535, new Class[]{CoordinatorLayout.class, View.class, View.class, View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (i2 == 0) {
                onNestedScrollAccepted(coordinatorLayout, v, view, view2, i);
            }
        }

        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{coordinatorLayout, v, view, view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 66534, new Class[]{CoordinatorLayout.class, View.class, View.class, View.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
                Object[] objArr = {coordinatorLayout, v, view, view2, Integer.valueOf(i), Integer.valueOf(i2)};
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, 66534, new Class[]{CoordinatorLayout.class, View.class, View.class, View.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
            } else if (i2 == 0) {
                return onStartNestedScroll(coordinatorLayout, v, view, view2, i);
            } else {
                return false;
            }
        }

        public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
            if (PatchProxy.isSupport(new Object[]{coordinatorLayout, v, view, Integer.valueOf(i), Integer.valueOf(i2), iArr, Integer.valueOf(i3)}, this, changeQuickRedirect, false, 66538, new Class[]{CoordinatorLayout.class, View.class, View.class, Integer.TYPE, Integer.TYPE, int[].class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{coordinatorLayout, v, view, Integer.valueOf(i), Integer.valueOf(i2), iArr, Integer.valueOf(i3)}, this, changeQuickRedirect, false, 66538, new Class[]{CoordinatorLayout.class, View.class, View.class, Integer.TYPE, Integer.TYPE, int[].class, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (i3 == 0) {
                onNestedPreScroll(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4, int i5) {
            if (PatchProxy.isSupport(new Object[]{coordinatorLayout, v, view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, changeQuickRedirect, false, 66537, new Class[]{CoordinatorLayout.class, View.class, View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{coordinatorLayout, v, view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, changeQuickRedirect, false, 66537, new Class[]{CoordinatorLayout.class, View.class, View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (i5 == 0) {
                onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }
    }

    class c implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60755a;

        c() {
        }

        public final void onChildViewAdded(View view, View view2) {
            if (PatchProxy.isSupport(new Object[]{view, view2}, this, f60755a, false, 66539, new Class[]{View.class, View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, view2}, this, f60755a, false, 66539, new Class[]{View.class, View.class}, Void.TYPE);
                return;
            }
            if (CoordinatorLayout.this.j != null) {
                CoordinatorLayout.this.j.onChildViewAdded(view, view2);
            }
        }

        public final void onChildViewRemoved(View view, View view2) {
            if (PatchProxy.isSupport(new Object[]{view, view2}, this, f60755a, false, 66540, new Class[]{View.class, View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, view2}, this, f60755a, false, 66540, new Class[]{View.class, View.class}, Void.TYPE);
                return;
            }
            CoordinatorLayout.this.a(2);
            if (CoordinatorLayout.this.j != null) {
                CoordinatorLayout.this.j.onChildViewRemoved(view, view2);
            }
        }
    }

    public static class d extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60757a;

        /* renamed from: b  reason: collision with root package name */
        public b f60758b;

        /* renamed from: c  reason: collision with root package name */
        boolean f60759c;

        /* renamed from: d  reason: collision with root package name */
        public int f60760d;

        /* renamed from: e  reason: collision with root package name */
        public int f60761e;

        /* renamed from: f  reason: collision with root package name */
        public int f60762f = -1;
        public int g = -1;
        public int h;
        public int i;
        int j;
        int k;
        View l;
        View m;
        boolean n;
        public boolean o;
        public final Rect p = new Rect();
        Object q;
        private boolean r;
        private boolean s;

        /* access modifiers changed from: package-private */
        public final void a() {
            this.n = false;
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            this.o = false;
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public final void a(@Nullable b bVar) {
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f60757a, false, 66542, new Class[]{b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f60757a, false, 66542, new Class[]{b.class}, Void.TYPE);
                return;
            }
            if (this.f60758b != bVar) {
                if (this.f60758b != null) {
                    this.f60758b.onDetachedFromLayoutParams();
                }
                this.f60758b = bVar;
                this.q = null;
                this.f60759c = true;
                if (bVar != null) {
                    bVar.onAttachedToLayoutParams(this);
                }
            }
        }

        public d(d dVar) {
            super(dVar);
        }

        public d(int i2, int i3) {
            super(-2, -2);
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2, boolean z) {
            switch (i2) {
                case 0:
                    this.r = z;
                    return;
                case 1:
                    this.s = z;
                    break;
            }
        }

        d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CoordinatorLayout_Layout);
            this.f60760d = obtainStyledAttributes.getInteger(0, 0);
            this.g = obtainStyledAttributes.getResourceId(2, -1);
            this.f60761e = obtainStyledAttributes.getInteger(3, 0);
            this.f60762f = obtainStyledAttributes.getInteger(6, -1);
            this.h = obtainStyledAttributes.getInt(5, 0);
            this.i = obtainStyledAttributes.getInt(4, 0);
            this.f60759c = obtainStyledAttributes.hasValue(1);
            if (this.f60759c) {
                this.f60758b = CoordinatorLayout.a(context, attributeSet, obtainStyledAttributes.getString(1));
            }
            obtainStyledAttributes.recycle();
            if (this.f60758b != null) {
                this.f60758b.onAttachedToLayoutParams(this);
            }
        }
    }

    class e implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60763a;

        public final boolean onPreDraw() {
            if (PatchProxy.isSupport(new Object[0], this, f60763a, false, 66551, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f60763a, false, 66551, new Class[0], Boolean.TYPE)).booleanValue();
            }
            CoordinatorLayout.this.a(0);
            return true;
        }

        e() {
        }
    }

    static class f implements Comparator<View> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60765a;

        f() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            View view = (View) obj;
            View view2 = (View) obj2;
            if (PatchProxy.isSupport(new Object[]{view, view2}, this, f60765a, false, 66555, new Class[]{View.class, View.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{view, view2}, this, f60765a, false, 66555, new Class[]{View.class, View.class}, Integer.TYPE)).intValue();
            }
            float z = ViewCompat.getZ(view);
            float z2 = ViewCompat.getZ(view2);
            if (z > z2) {
                return -1;
            }
            if (z < z2) {
                return 1;
            }
            return 0;
        }
    }

    private static int c(int i2) {
        if ((i2 & 7) == 0) {
            i2 |= 8388611;
        }
        return (i2 & SearchJediMixFeedAdapter.f42516e) == 0 ? i2 | 48 : i2;
    }

    private static int d(int i2) {
        if (i2 == 0) {
            return 8388661;
        }
        return i2;
    }

    private static int e(int i2) {
        if (i2 == 0) {
            return 17;
        }
        return i2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final WindowInsetsCompat getLastWindowInsets() {
        return this.h;
    }

    @Nullable
    public Drawable getStatusBarBackground() {
        return this.w;
    }

    private void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f60744a, false, 66465, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f60744a, false, 66465, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            b bVar = ((d) childAt.getLayoutParams()).f60758b;
            if (bVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    bVar.onInterceptTouchEvent(this, childAt, obtain);
                } else {
                    bVar.onTouchEvent(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((d) getChildAt(i3).getLayoutParams()).a();
        }
        this.s = null;
        this.p = false;
    }

    private void a(List<View> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f60744a, false, 66466, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f60744a, false, 66466, new Class[]{List.class}, Void.TYPE);
            return;
        }
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        if (f60748e != null) {
            Collections.sort(list, f60748e);
        }
    }

    private boolean a(MotionEvent motionEvent, int i2) {
        boolean z;
        boolean z2;
        MotionEvent motionEvent2 = motionEvent;
        int i3 = 2;
        char c2 = 1;
        if (PatchProxy.isSupport(new Object[]{motionEvent2, Integer.valueOf(i2)}, this, f60744a, false, 66467, new Class[]{MotionEvent.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2, Integer.valueOf(i2)}, this, f60744a, false, 66467, new Class[]{MotionEvent.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.m;
        a(list);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        int i4 = 0;
        boolean z3 = false;
        boolean z4 = false;
        while (i4 < size) {
            View view = list.get(i4);
            d dVar = (d) view.getLayoutParams();
            b bVar = dVar.f60758b;
            if ((z3 || z4) && actionMasked != 0) {
                if (bVar != null) {
                    if (motionEvent3 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    switch (i2) {
                        case 0:
                            bVar.onInterceptTouchEvent(this, view, motionEvent3);
                            break;
                        case 1:
                            bVar.onTouchEvent(this, view, motionEvent3);
                            break;
                    }
                }
            } else {
                if (!z3 && bVar != null) {
                    switch (i2) {
                        case 0:
                            z3 = bVar.onInterceptTouchEvent(this, view, motionEvent2);
                            break;
                        case 1:
                            z3 = bVar.onTouchEvent(this, view, motionEvent2);
                            break;
                    }
                    if (z3) {
                        this.s = view;
                    }
                }
                if (dVar.f60758b == null) {
                    dVar.n = false;
                }
                boolean z5 = dVar.n;
                Object[] objArr = new Object[i3];
                objArr[0] = this;
                objArr[c2] = view;
                ChangeQuickRedirect changeQuickRedirect = d.f60757a;
                Class[] clsArr = new Class[i3];
                clsArr[0] = CoordinatorLayout.class;
                clsArr[1] = View.class;
                if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, 66544, clsArr, Boolean.TYPE)) {
                    Object[] objArr2 = new Object[i3];
                    objArr2[0] = this;
                    c2 = 1;
                    objArr2[1] = view;
                    ChangeQuickRedirect changeQuickRedirect2 = d.f60757a;
                    Class[] clsArr2 = new Class[i3];
                    clsArr2[0] = CoordinatorLayout.class;
                    clsArr2[1] = View.class;
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, 66544, clsArr2, Boolean.TYPE)).booleanValue();
                } else {
                    c2 = 1;
                    if (dVar.n) {
                        z = true;
                    } else {
                        boolean z6 = dVar.n;
                        if (dVar.f60758b != null) {
                            z2 = dVar.f60758b.blocksInteractionBelow(this, view);
                        } else {
                            z2 = false;
                        }
                        boolean z7 = z2 | z6;
                        dVar.n = z7;
                        z = z7;
                    }
                }
                z4 = z && !z5;
                if (z && !z4) {
                    list.clear();
                    return z3;
                }
            }
            i4++;
            i3 = 2;
        }
        list.clear();
        return z3;
    }

    public final void a(View view, int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f60744a, false, 66477, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f60744a, false, 66477, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    public final void a(View view, int i2) {
        Rect rect;
        View view2 = view;
        int i3 = i2;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i2)}, this, f60744a, false, 66480, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i2)}, this, f60744a, false, 66480, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        d dVar = (d) view.getLayoutParams();
        if (!(dVar.l == null && dVar.g != -1)) {
            if (dVar.l != null) {
                View view3 = dVar.l;
                if (PatchProxy.isSupport(new Object[]{view2, view3, Integer.valueOf(i2)}, this, f60744a, false, 66490, new Class[]{View.class, View.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2, view3, Integer.valueOf(i2)}, this, f60744a, false, 66490, new Class[]{View.class, View.class, Integer.TYPE}, Void.TYPE);
                } else {
                    view.getLayoutParams();
                    Rect a2 = a();
                    Rect a3 = a();
                    try {
                        a(view3, a2);
                        rect = a3;
                        try {
                            if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i2), a2, a3}, this, f60744a, false, 66489, new Class[]{View.class, Integer.TYPE, Rect.class, Rect.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i2), a2, rect}, this, f60744a, false, 66489, new Class[]{View.class, Integer.TYPE, Rect.class, Rect.class}, Void.TYPE);
                            } else {
                                d dVar2 = (d) view.getLayoutParams();
                                int measuredWidth = view.getMeasuredWidth();
                                int measuredHeight = view.getMeasuredHeight();
                                a(view, i2, a2, rect, dVar2, measuredWidth, measuredHeight);
                                a(dVar2, rect, measuredWidth, measuredHeight);
                            }
                            view2.layout(rect.left, rect.top, rect.right, rect.bottom);
                            a(a2);
                            a(rect);
                        } catch (Throwable th) {
                            th = th;
                            a(a2);
                            a(rect);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        rect = a3;
                        a(a2);
                        a(rect);
                        throw th;
                    }
                }
            } else if (dVar.f60762f >= 0) {
                int i5 = dVar.f60762f;
                if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i5), Integer.valueOf(i2)}, this, f60744a, false, 66491, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i5), Integer.valueOf(i2)}, this, f60744a, false, 66491, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                } else {
                    d dVar3 = (d) view.getLayoutParams();
                    int absoluteGravity = GravityCompat.getAbsoluteGravity(d(dVar3.f60760d), i3);
                    int i6 = absoluteGravity & 7;
                    int i7 = absoluteGravity & SearchJediMixFeedAdapter.f42516e;
                    int width = getWidth();
                    int height = getHeight();
                    int measuredWidth2 = view.getMeasuredWidth();
                    int measuredHeight2 = view.getMeasuredHeight();
                    if (i3 == 1) {
                        i5 = width - i5;
                    }
                    int b2 = b(i5) - measuredWidth2;
                    if (i6 == 1) {
                        b2 += measuredWidth2 / 2;
                    } else if (i6 == 5) {
                        b2 += measuredWidth2;
                    }
                    if (i7 == 16) {
                        i4 = 0 + (measuredHeight2 / 2);
                    } else if (i7 == 80) {
                        i4 = measuredHeight2 + 0;
                    }
                    int max = Math.max(getPaddingLeft() + dVar3.leftMargin, Math.min(b2, ((width - getPaddingRight()) - measuredWidth2) - dVar3.rightMargin));
                    int max2 = Math.max(getPaddingTop() + dVar3.topMargin, Math.min(i4, ((height - getPaddingBottom()) - measuredHeight2) - dVar3.bottomMargin));
                    view2.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                    return;
                }
            } else {
                if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i2)}, this, f60744a, false, 66492, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i2)}, this, f60744a, false, 66492, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                d dVar4 = (d) view.getLayoutParams();
                Rect a4 = a();
                a4.set(getPaddingLeft() + dVar4.leftMargin, getPaddingTop() + dVar4.topMargin, (getWidth() - getPaddingRight()) - dVar4.rightMargin, (getHeight() - getPaddingBottom()) - dVar4.bottomMargin);
                if (this.h != null && ViewCompat.getFitsSystemWindows(this) && !ViewCompat.getFitsSystemWindows(view)) {
                    a4.left += this.h.getSystemWindowInsetLeft();
                    a4.top += this.h.getSystemWindowInsetTop();
                    a4.right -= this.h.getSystemWindowInsetRight();
                    a4.bottom -= this.h.getSystemWindowInsetBottom();
                }
                Rect a5 = a();
                GravityCompat.apply(c(dVar4.f60760d), view.getMeasuredWidth(), view.getMeasuredHeight(), a4, a5, i2);
                view2.layout(a5.left, a5.top, a5.right, a5.bottom);
                a(a4);
                a(a5);
            }
            return;
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    private void a(d dVar, Rect rect, int i2, int i3) {
        d dVar2 = dVar;
        Rect rect2 = rect;
        if (PatchProxy.isSupport(new Object[]{dVar2, rect2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60744a, false, 66488, new Class[]{d.class, Rect.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {dVar2, rect2, Integer.valueOf(i2), Integer.valueOf(i3)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f60744a, false, 66488, new Class[]{d.class, Rect.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + dVar2.leftMargin, Math.min(rect2.left, ((width - getPaddingRight()) - i2) - dVar2.rightMargin));
        int max2 = Math.max(getPaddingTop() + dVar2.topMargin, Math.min(rect2.top, ((height - getPaddingBottom()) - i3) - dVar2.bottomMargin));
        rect2.set(max, max2, max + i2, max2 + i3);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x046e  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x033e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r35) {
        /*
            r34 = this;
            r8 = r34
            r9 = r35
            r10 = 1
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r35)
            r11 = 0
            r0[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f60744a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 66494(0x103be, float:9.3178E-41)
            r1 = r34
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0040
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r35)
            r0[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f60744a
            r3 = 0
            r4 = 66494(0x103be, float:9.3178E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r34
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0040:
            int r12 = android.support.v4.view.ViewCompat.getLayoutDirection(r34)
            java.util.List<android.view.View> r0 = r8.l
            int r13 = r0.size()
            android.graphics.Rect r14 = a()
            android.graphics.Rect r15 = a()
            android.graphics.Rect r7 = a()
            r6 = 0
        L_0x0057:
            if (r6 >= r13) goto L_0x04b0
            java.util.List<android.view.View> r0 = r8.l
            java.lang.Object r0 = r0.get(r6)
            r5 = r0
            android.view.View r5 = (android.view.View) r5
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            r4 = r0
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$d r4 = (com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout.d) r4
            if (r9 != 0) goto L_0x007b
            int r0 = r5.getVisibility()
            r1 = 8
            if (r0 == r1) goto L_0x0074
            goto L_0x007b
        L_0x0074:
            r17 = r6
            r0 = r13
            r1 = 1
            r3 = 0
            goto L_0x04a9
        L_0x007b:
            r3 = 0
        L_0x007c:
            r2 = 2
            if (r3 >= r6) goto L_0x018f
            java.util.List<android.view.View> r0 = r8.l
            java.lang.Object r0 = r0.get(r3)
            android.view.View r0 = (android.view.View) r0
            android.view.View r1 = r4.m
            if (r1 != r0) goto L_0x0175
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r11] = r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r16 = f60744a
            r17 = 0
            r18 = 66506(0x103ca, float:9.3195E-41)
            java.lang.Class[] r1 = new java.lang.Class[r2]
            java.lang.Class<android.view.View> r19 = android.view.View.class
            r1[r11] = r19
            java.lang.Class r19 = java.lang.Integer.TYPE
            r1[r10] = r19
            java.lang.Class r19 = java.lang.Void.TYPE
            r20 = r1
            r1 = r34
            r10 = 2
            r2 = r16
            r16 = r3
            r3 = r17
            r21 = r4
            r4 = r18
            r11 = r5
            r5 = r20
            r17 = r6
            r6 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00ed
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r1 = 0
            r0[r1] = r11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r3 = 1
            r0[r3] = r2
            com.meituan.robust.ChangeQuickRedirect r2 = f60744a
            r4 = 0
            r5 = 66506(0x103ca, float:9.3195E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class<android.view.View> r10 = android.view.View.class
            r6[r1] = r10
            java.lang.Class r1 = java.lang.Integer.TYPE
            r6[r3] = r1
            java.lang.Class r10 = java.lang.Void.TYPE
            r1 = r34
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x017c
        L_0x00ed:
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()
            r10 = r0
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$d r10 = (com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout.d) r10
            android.view.View r0 = r10.l
            if (r0 == 0) goto L_0x017c
            android.graphics.Rect r6 = a()
            android.graphics.Rect r5 = a()
            android.graphics.Rect r4 = a()
            android.view.View r0 = r10.l
            r8.a((android.view.View) r0, (android.graphics.Rect) r6)
            r0 = 0
            r8.a((android.view.View) r11, (boolean) r0, (android.graphics.Rect) r5)
            int r3 = r11.getMeasuredWidth()
            int r2 = r11.getMeasuredHeight()
            r0 = r34
            r1 = r11
            r22 = r2
            r2 = r12
            r23 = r3
            r3 = r6
            r24 = r4
            r25 = r13
            r13 = r5
            r5 = r10
            r18 = r6
            r6 = r23
            r26 = r7
            r7 = r22
            r0.a(r1, r2, r3, r4, r5, r6, r7)
            r0 = r24
            int r1 = r0.left
            int r2 = r13.left
            if (r1 != r2) goto L_0x0144
            int r1 = r0.top
            int r2 = r13.top
            if (r1 == r2) goto L_0x013e
            goto L_0x0144
        L_0x013e:
            r2 = r22
            r1 = r23
            r3 = 0
            goto L_0x0149
        L_0x0144:
            r2 = r22
            r1 = r23
            r3 = 1
        L_0x0149:
            r8.a(r10, r0, r1, r2)
            int r1 = r0.left
            int r2 = r13.left
            int r1 = r1 - r2
            int r2 = r0.top
            int r4 = r13.top
            int r2 = r2 - r4
            if (r1 == 0) goto L_0x015b
            android.support.v4.view.ViewCompat.offsetLeftAndRight(r11, r1)
        L_0x015b:
            if (r2 == 0) goto L_0x0160
            android.support.v4.view.ViewCompat.offsetTopAndBottom(r11, r2)
        L_0x0160:
            if (r3 == 0) goto L_0x016b
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$b r1 = r10.f60758b
            if (r1 == 0) goto L_0x016b
            android.view.View r2 = r10.l
            r1.onDependentViewChanged(r8, r11, r2)
        L_0x016b:
            a((android.graphics.Rect) r18)
            a((android.graphics.Rect) r13)
            a((android.graphics.Rect) r0)
            goto L_0x0180
        L_0x0175:
            r16 = r3
            r21 = r4
            r11 = r5
            r17 = r6
        L_0x017c:
            r26 = r7
            r25 = r13
        L_0x0180:
            int r3 = r16 + 1
            r5 = r11
            r6 = r17
            r4 = r21
            r13 = r25
            r7 = r26
            r10 = 1
            r11 = 0
            goto L_0x007c
        L_0x018f:
            r21 = r4
            r11 = r5
            r17 = r6
            r26 = r7
            r25 = r13
            r0 = 1
            r10 = 2
            r8.a((android.view.View) r11, (boolean) r0, (android.graphics.Rect) r15)
            r0 = r21
            int r1 = r0.h
            r7 = 5
            r13 = 80
            r6 = 48
            r5 = 3
            if (r1 == 0) goto L_0x01f7
            boolean r1 = r15.isEmpty()
            if (r1 != 0) goto L_0x01f7
            int r1 = r0.h
            int r1 = android.support.v4.view.GravityCompat.getAbsoluteGravity(r1, r12)
            r2 = r1 & 112(0x70, float:1.57E-43)
            if (r2 == r6) goto L_0x01cc
            if (r2 == r13) goto L_0x01bc
            goto L_0x01d6
        L_0x01bc:
            int r2 = r14.bottom
            int r3 = r34.getHeight()
            int r4 = r15.top
            int r3 = r3 - r4
            int r2 = java.lang.Math.max(r2, r3)
            r14.bottom = r2
            goto L_0x01d6
        L_0x01cc:
            int r2 = r14.top
            int r3 = r15.bottom
            int r2 = java.lang.Math.max(r2, r3)
            r14.top = r2
        L_0x01d6:
            r1 = r1 & 7
            if (r1 == r5) goto L_0x01ed
            if (r1 == r7) goto L_0x01dd
            goto L_0x01f7
        L_0x01dd:
            int r1 = r14.right
            int r2 = r34.getWidth()
            int r3 = r15.left
            int r2 = r2 - r3
            int r1 = java.lang.Math.max(r1, r2)
            r14.right = r1
            goto L_0x01f7
        L_0x01ed:
            int r1 = r14.left
            int r2 = r15.right
            int r1 = java.lang.Math.max(r1, r2)
            r14.left = r1
        L_0x01f7:
            int r0 = r0.i
            if (r0 == 0) goto L_0x035f
            int r0 = r11.getVisibility()
            if (r0 != 0) goto L_0x035f
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r1 = 0
            r0[r1] = r11
            r2 = 1
            r0[r2] = r14
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r0[r10] = r3
            com.meituan.robust.ChangeQuickRedirect r3 = f60744a
            r4 = 0
            r16 = 66495(0x103bf, float:9.318E-41)
            java.lang.Class[] r6 = new java.lang.Class[r5]
            java.lang.Class<android.view.View> r18 = android.view.View.class
            r6[r1] = r18
            java.lang.Class<android.graphics.Rect> r1 = android.graphics.Rect.class
            r6[r2] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r6[r10] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r1 = r34
            r2 = r3
            r3 = r4
            r4 = r16
            r7 = 3
            r5 = r6
            r13 = 48
            r6 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0267
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r1 = 0
            r0[r1] = r11
            r2 = 1
            r0[r2] = r14
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r0[r10] = r3
            com.meituan.robust.ChangeQuickRedirect r3 = f60744a
            r4 = 0
            r5 = 66495(0x103bf, float:9.318E-41)
            java.lang.Class[] r6 = new java.lang.Class[r7]
            java.lang.Class<android.view.View> r7 = android.view.View.class
            r6[r1] = r7
            java.lang.Class<android.graphics.Rect> r1 = android.graphics.Rect.class
            r6[r2] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r6[r10] = r1
            java.lang.Class r7 = java.lang.Void.TYPE
            r1 = r34
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x035f
        L_0x0267:
            boolean r0 = android.support.v4.view.ViewCompat.isLaidOut(r11)
            if (r0 == 0) goto L_0x035f
            int r0 = r11.getWidth()
            if (r0 <= 0) goto L_0x035f
            int r0 = r11.getHeight()
            if (r0 > 0) goto L_0x027b
            goto L_0x035f
        L_0x027b:
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$d r0 = (com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout.d) r0
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$b r1 = r0.f60758b
            android.graphics.Rect r2 = a()
            android.graphics.Rect r3 = a()
            int r4 = r11.getLeft()
            int r5 = r11.getTop()
            int r6 = r11.getRight()
            int r10 = r11.getBottom()
            r3.set(r4, r5, r6, r10)
            if (r1 == 0) goto L_0x02d1
            boolean r1 = r1.getInsetDodgeRect(r8, r11, r2)
            if (r1 == 0) goto L_0x02d1
            boolean r1 = r3.contains(r2)
            if (r1 == 0) goto L_0x02ad
            goto L_0x02d4
        L_0x02ad:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Rect should be within the child's bounds. Rect:"
            r1.<init>(r4)
            java.lang.String r2 = r2.toShortString()
            r1.append(r2)
            java.lang.String r2 = " | Bounds:"
            r1.append(r2)
            java.lang.String r2 = r3.toShortString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x02d1:
            r2.set(r3)
        L_0x02d4:
            a((android.graphics.Rect) r3)
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x035c
            int r1 = r0.i
            int r1 = android.support.v4.view.GravityCompat.getAbsoluteGravity(r1, r12)
            r3 = r1 & 48
            if (r3 != r13) goto L_0x02fb
            int r3 = r2.top
            int r4 = r0.topMargin
            int r3 = r3 - r4
            int r4 = r0.k
            int r3 = r3 - r4
            int r4 = r14.top
            if (r3 >= r4) goto L_0x02fb
            int r4 = r14.top
            int r4 = r4 - r3
            r8.c(r11, r4)
            r10 = 1
            goto L_0x02fc
        L_0x02fb:
            r10 = 0
        L_0x02fc:
            r3 = r1 & 80
            r4 = 80
            if (r3 != r4) goto L_0x031a
            int r3 = r34.getHeight()
            int r4 = r2.bottom
            int r3 = r3 - r4
            int r4 = r0.bottomMargin
            int r3 = r3 - r4
            int r4 = r0.k
            int r3 = r3 + r4
            int r4 = r14.bottom
            if (r3 >= r4) goto L_0x031a
            int r4 = r14.bottom
            int r3 = r3 - r4
            r8.c(r11, r3)
            r10 = 1
        L_0x031a:
            if (r10 != 0) goto L_0x0320
            r3 = 0
            r8.c(r11, r3)
        L_0x0320:
            r3 = r1 & 3
            if (r3 != r7) goto L_0x0338
            int r3 = r2.left
            int r4 = r0.leftMargin
            int r3 = r3 - r4
            int r4 = r0.j
            int r3 = r3 - r4
            int r4 = r14.left
            if (r3 >= r4) goto L_0x0338
            int r4 = r14.left
            int r4 = r4 - r3
            r8.b(r11, r4)
            r10 = 1
            goto L_0x0339
        L_0x0338:
            r10 = 0
        L_0x0339:
            r1 = r1 & 5
            r3 = 5
            if (r1 != r3) goto L_0x0356
            int r1 = r34.getWidth()
            int r3 = r2.right
            int r1 = r1 - r3
            int r3 = r0.rightMargin
            int r1 = r1 - r3
            int r0 = r0.j
            int r1 = r1 + r0
            int r0 = r14.right
            if (r1 >= r0) goto L_0x0356
            int r0 = r14.right
            int r1 = r1 - r0
            r8.b(r11, r1)
            r10 = 1
        L_0x0356:
            if (r10 != 0) goto L_0x035c
            r0 = 0
            r8.b(r11, r0)
        L_0x035c:
            a((android.graphics.Rect) r2)
        L_0x035f:
            r0 = 2
            if (r9 == r0) goto L_0x0465
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r11
            r7 = r26
            r3 = 1
            r1[r3] = r7
            com.meituan.robust.ChangeQuickRedirect r4 = f60744a
            r5 = 0
            r6 = 66485(0x103b5, float:9.3165E-41)
            java.lang.Class[] r10 = new java.lang.Class[r0]
            java.lang.Class<android.view.View> r0 = android.view.View.class
            r10[r2] = r0
            java.lang.Class<android.graphics.Rect> r0 = android.graphics.Rect.class
            r10[r3] = r0
            java.lang.Class r13 = java.lang.Void.TYPE
            r0 = r1
            r1 = r34
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r10
            r6 = r13
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x03b3
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r11
            r3 = 1
            r1[r3] = r7
            com.meituan.robust.ChangeQuickRedirect r4 = f60744a
            r5 = 0
            r6 = 66485(0x103b5, float:9.3165E-41)
            java.lang.Class[] r10 = new java.lang.Class[r0]
            java.lang.Class<android.view.View> r0 = android.view.View.class
            r10[r2] = r0
            java.lang.Class<android.graphics.Rect> r0 = android.graphics.Rect.class
            r10[r3] = r0
            java.lang.Class r13 = java.lang.Void.TYPE
            r0 = r1
            r1 = r34
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r10
            r6 = r13
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x03be
        L_0x03b3:
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$d r0 = (com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout.d) r0
            android.graphics.Rect r0 = r0.p
            r7.set(r0)
        L_0x03be:
            boolean r0 = r7.equals(r15)
            if (r0 != 0) goto L_0x0461
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r11
            r3 = 1
            r1[r3] = r15
            com.meituan.robust.ChangeQuickRedirect r4 = f60744a
            r5 = 0
            r6 = 66484(0x103b4, float:9.3164E-41)
            java.lang.Class[] r10 = new java.lang.Class[r0]
            java.lang.Class<android.view.View> r0 = android.view.View.class
            r10[r2] = r0
            java.lang.Class<android.graphics.Rect> r0 = android.graphics.Rect.class
            r10[r3] = r0
            java.lang.Class r13 = java.lang.Void.TYPE
            r0 = r1
            r1 = r34
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r10
            r6 = r13
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0414
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r11
            r3 = 1
            r1[r3] = r15
            com.meituan.robust.ChangeQuickRedirect r4 = f60744a
            r5 = 0
            r6 = 66484(0x103b4, float:9.3164E-41)
            java.lang.Class[] r10 = new java.lang.Class[r0]
            java.lang.Class<android.view.View> r0 = android.view.View.class
            r10[r2] = r0
            java.lang.Class<android.graphics.Rect> r0 = android.graphics.Rect.class
            r10[r3] = r0
            java.lang.Class r13 = java.lang.Void.TYPE
            r0 = r1
            r1 = r34
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r10
            r6 = r13
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0467
        L_0x0414:
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$d r0 = (com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout.d) r0
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r15
            com.meituan.robust.ChangeQuickRedirect r29 = com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout.d.f60757a
            r30 = 0
            r31 = 66543(0x103ef, float:9.3247E-41)
            java.lang.Class[] r4 = new java.lang.Class[r1]
            java.lang.Class<android.graphics.Rect> r1 = android.graphics.Rect.class
            r4[r3] = r1
            java.lang.Class r33 = java.lang.Void.TYPE
            r27 = r2
            r28 = r0
            r32 = r4
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r27, r28, r29, r30, r31, r32, r33)
            if (r1 == 0) goto L_0x045a
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r15
            com.meituan.robust.ChangeQuickRedirect r29 = com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout.d.f60757a
            r30 = 0
            r31 = 66543(0x103ef, float:9.3247E-41)
            java.lang.Class[] r4 = new java.lang.Class[r1]
            java.lang.Class<android.graphics.Rect> r1 = android.graphics.Rect.class
            r4[r3] = r1
            java.lang.Class r33 = java.lang.Void.TYPE
            r27 = r2
            r28 = r0
            r32 = r4
            com.meituan.robust.PatchProxy.accessDispatch(r27, r28, r29, r30, r31, r32, r33)
            goto L_0x0468
        L_0x045a:
            r3 = 0
            android.graphics.Rect r0 = r0.p
            r0.set(r15)
            goto L_0x0468
        L_0x0461:
            r3 = 0
            r0 = r25
            goto L_0x04a8
        L_0x0465:
            r7 = r26
        L_0x0467:
            r3 = 0
        L_0x0468:
            int r6 = r17 + 1
            r0 = r25
        L_0x046c:
            if (r6 >= r0) goto L_0x04a8
            java.util.List<android.view.View> r1 = r8.l
            java.lang.Object r1 = r1.get(r6)
            android.view.View r1 = (android.view.View) r1
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$d r2 = (com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout.d) r2
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$b r4 = r2.f60758b
            if (r4 == 0) goto L_0x04a3
            boolean r5 = r4.layoutDependsOn(r8, r1, r11)
            if (r5 == 0) goto L_0x04a3
            if (r9 != 0) goto L_0x0490
            boolean r5 = r2.o
            if (r5 == 0) goto L_0x0490
            r2.b()
            goto L_0x04a3
        L_0x0490:
            r5 = 2
            if (r9 == r5) goto L_0x0499
            boolean r10 = r4.onDependentViewChanged(r8, r1, r11)
            r1 = 1
            goto L_0x049e
        L_0x0499:
            r4.onDependentViewRemoved(r8, r1, r11)
            r1 = 1
            r10 = 1
        L_0x049e:
            if (r9 != r1) goto L_0x04a5
            r2.o = r10
            goto L_0x04a5
        L_0x04a3:
            r1 = 1
            r5 = 2
        L_0x04a5:
            int r6 = r6 + 1
            goto L_0x046c
        L_0x04a8:
            r1 = 1
        L_0x04a9:
            int r6 = r17 + 1
            r13 = r0
            r10 = 1
            r11 = 0
            goto L_0x0057
        L_0x04b0:
            a((android.graphics.Rect) r14)
            a((android.graphics.Rect) r15)
            a((android.graphics.Rect) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout.a(int):void");
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f60744a, false, 66498, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f60744a, false, 66498, new Class[]{View.class}, Void.TYPE);
            return;
        }
        List b2 = this.f60749f.b(view);
        if (b2 != null && !b2.isEmpty()) {
            for (int i2 = 0; i2 < b2.size(); i2++) {
                View view2 = (View) b2.get(i2);
                b bVar = ((d) view2.getLayoutParams()).f60758b;
                if (bVar != null) {
                    bVar.onDependentViewChanged(this, view2, view);
                }
            }
        }
    }

    public final boolean a(View view, int i2, int i3) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60744a, false, 66507, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60744a, false, 66507, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        Rect a2 = a();
        a(view2, a2);
        try {
            boolean contains = a2.contains(i2, i3);
            a(a2);
            return contains;
        } catch (Throwable th) {
            Throwable th2 = th;
            a(a2);
            throw th2;
        }
    }

    @NonNull
    private static Rect a() {
        if (PatchProxy.isSupport(new Object[0], null, f60744a, true, 66454, new Class[0], Rect.class)) {
            return (Rect) PatchProxy.accessDispatch(new Object[0], null, f60744a, true, 66454, new Class[0], Rect.class);
        }
        Rect rect = (Rect) k.acquire();
        if (rect == null) {
            rect = new Rect();
        }
        return rect;
    }

    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        if (!PatchProxy.isSupport(new Object[0], this, f60744a, false, 66511, new Class[0], d.class)) {
            return new d(-2, -2);
        }
        return (d) PatchProxy.accessDispatch(new Object[0], this, f60744a, false, 66511, new Class[0], d.class);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final List<View> getDependencySortedChildren() {
        if (PatchProxy.isSupport(new Object[0], this, f60744a, false, 66501, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f60744a, false, 66501, new Class[0], List.class);
        }
        b();
        return Collections.unmodifiableList(this.l);
    }

    public int getNestedScrollAxes() {
        if (!PatchProxy.isSupport(new Object[0], this, f60744a, false, 66525, new Class[0], Integer.TYPE)) {
            return this.y.getNestedScrollAxes();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f60744a, false, 66525, new Class[0], Integer.TYPE)).intValue();
    }

    public int getSuggestedMinimumHeight() {
        if (!PatchProxy.isSupport(new Object[0], this, f60744a, false, 66476, new Class[0], Integer.TYPE)) {
            return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f60744a, false, 66476, new Class[0], Integer.TYPE)).intValue();
    }

    public int getSuggestedMinimumWidth() {
        if (!PatchProxy.isSupport(new Object[0], this, f60744a, false, 66475, new Class[0], Integer.TYPE)) {
            return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f60744a, false, 66475, new Class[0], Integer.TYPE)).intValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout> r0 = com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            r1 = 0
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.getName()
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            f60745b = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r0 < r2) goto L_0x001f
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$f r0 = new com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$f
            r0.<init>()
            f60748e = r0
            goto L_0x0021
        L_0x001f:
            f60748e = r1
        L_0x0021:
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            f60746c = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            f60747d = r0
            android.support.v4.util.Pools$SynchronizedPool r0 = new android.support.v4.util.Pools$SynchronizedPool
            r1 = 12
            r0.<init>(r1)
            k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout.<clinit>():void");
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f60744a, false, 66529, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60744a, false, 66529, new Class[0], Void.TYPE);
        } else if (Build.VERSION.SDK_INT >= 21) {
            if (ViewCompat.getFitsSystemWindows(this)) {
                if (this.x == null) {
                    this.x = new OnApplyWindowInsetsListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f60750a;

                        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                            boolean z;
                            boolean z2;
                            WindowInsetsCompat windowInsetsCompat2 = windowInsetsCompat;
                            if (PatchProxy.isSupport(new Object[]{view, windowInsetsCompat2}, this, f60750a, false, 66530, new Class[]{View.class, WindowInsetsCompat.class}, WindowInsetsCompat.class)) {
                                return (WindowInsetsCompat) PatchProxy.accessDispatch(new Object[]{view, windowInsetsCompat2}, this, f60750a, false, 66530, new Class[]{View.class, WindowInsetsCompat.class}, WindowInsetsCompat.class);
                            }
                            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
                            if (PatchProxy.isSupport(new Object[]{windowInsetsCompat2}, coordinatorLayout, CoordinatorLayout.f60744a, false, 66464, new Class[]{WindowInsetsCompat.class}, WindowInsetsCompat.class)) {
                                return (WindowInsetsCompat) PatchProxy.accessDispatch(new Object[]{windowInsetsCompat2}, coordinatorLayout, CoordinatorLayout.f60744a, false, 66464, new Class[]{WindowInsetsCompat.class}, WindowInsetsCompat.class);
                            }
                            if (!ObjectsCompat.equals(coordinatorLayout.h, windowInsetsCompat2)) {
                                coordinatorLayout.h = windowInsetsCompat2;
                                if (windowInsetsCompat2 == null || windowInsetsCompat.getSystemWindowInsetTop() <= 0) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                coordinatorLayout.i = z;
                                if (coordinatorLayout.i || coordinatorLayout.getBackground() != null) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                coordinatorLayout.setWillNotDraw(z2);
                                if (PatchProxy.isSupport(new Object[]{windowInsetsCompat2}, coordinatorLayout, CoordinatorLayout.f60744a, false, 66479, new Class[]{WindowInsetsCompat.class}, WindowInsetsCompat.class)) {
                                    Object[] objArr = {windowInsetsCompat2};
                                    CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
                                    windowInsetsCompat2 = (WindowInsetsCompat) PatchProxy.accessDispatch(objArr, coordinatorLayout2, CoordinatorLayout.f60744a, false, 66479, new Class[]{WindowInsetsCompat.class}, WindowInsetsCompat.class);
                                } else if (!windowInsetsCompat.isConsumed()) {
                                    int childCount = coordinatorLayout.getChildCount();
                                    for (int i = 0; i < childCount; i++) {
                                        View childAt = coordinatorLayout.getChildAt(i);
                                        if (ViewCompat.getFitsSystemWindows(childAt)) {
                                            b bVar = ((d) childAt.getLayoutParams()).f60758b;
                                            if (bVar != null) {
                                                windowInsetsCompat2 = bVar.onApplyWindowInsets(coordinatorLayout, childAt, windowInsetsCompat2);
                                                if (windowInsetsCompat2.isConsumed()) {
                                                    break;
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                coordinatorLayout.requestLayout();
                            }
                            return windowInsetsCompat2;
                        }
                    };
                }
                ViewCompat.setOnApplyWindowInsetsListener(this, this.x);
                setSystemUiVisibility(1280);
                return;
            }
            ViewCompat.setOnApplyWindowInsetsListener(this, null);
        }
    }

    public void drawableStateChanged() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f60744a, false, 66459, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60744a, false, 66459, new Class[0], Void.TYPE);
            return;
        }
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.w;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f60744a, false, 66456, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60744a, false, 66456, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        a(false);
        if (this.v) {
            if (this.u == null) {
                this.u = new e();
            }
            getViewTreeObserver().addOnPreDrawListener(this.u);
        }
        if (this.h == null && ViewCompat.getFitsSystemWindows(this)) {
            ViewCompat.requestApplyInsets(this);
        }
        this.q = true;
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f60744a, false, 66457, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60744a, false, 66457, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        a(false);
        if (this.v && this.u != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.u);
        }
        if (this.t != null) {
            onStopNestedScroll(this.t);
        }
        this.q = false;
    }

    public Parcelable onSaveInstanceState() {
        if (PatchProxy.isSupport(new Object[0], this, f60744a, false, 66527, new Class[0], Parcelable.class)) {
            return (Parcelable) PatchProxy.accessDispatch(new Object[0], this, f60744a, false, 66527, new Class[0], Parcelable.class);
        }
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            b bVar = ((d) childAt.getLayoutParams()).f60758b;
            if (!(id == -1 || bVar == null)) {
                Parcelable onSaveInstanceState = bVar.onSaveInstanceState(this, childAt);
                if (onSaveInstanceState != null) {
                    sparseArray.append(id, onSaveInstanceState);
                }
            }
        }
        savedState.f60753b = sparseArray;
        return savedState;
    }

    private void c() {
        boolean z;
        boolean z2;
        if (PatchProxy.isSupport(new Object[0], this, f60744a, false, 66502, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60744a, false, 66502, new Class[0], Void.TYPE);
            return;
        }
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                z = false;
                break;
            }
            View childAt = getChildAt(i2);
            if (!PatchProxy.isSupport(new Object[]{childAt}, this, f60744a, false, 66503, new Class[]{View.class}, Boolean.TYPE)) {
                a<View> aVar = this.f60749f;
                if (!PatchProxy.isSupport(new Object[]{childAt}, aVar, a.f60766a, false, 66561, new Class[]{Object.class}, Boolean.TYPE)) {
                    int size = aVar.f60768c.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            z2 = false;
                            break;
                        }
                        ArrayList arrayList = (ArrayList) aVar.f60768c.valueAt(i3);
                        if (arrayList != null && arrayList.contains(childAt)) {
                            z2 = true;
                            break;
                        }
                        i3++;
                    }
                } else {
                    a<View> aVar2 = aVar;
                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{childAt}, aVar2, a.f60766a, false, 66561, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
                }
            } else {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{childAt}, this, f60744a, false, 66503, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
            }
            if (z2) {
                z = true;
                break;
            }
            i2++;
        }
        if (z != this.v) {
            if (z) {
                if (PatchProxy.isSupport(new Object[0], this, f60744a, false, 66504, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f60744a, false, 66504, new Class[0], Void.TYPE);
                } else {
                    if (this.q) {
                        if (this.u == null) {
                            this.u = new e();
                        }
                        getViewTreeObserver().addOnPreDrawListener(this.u);
                    }
                    this.v = true;
                }
            } else {
                if (PatchProxy.isSupport(new Object[0], this, f60744a, false, 66505, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f60744a, false, 66505, new Class[0], Void.TYPE);
                    return;
                }
                if (this.q && this.u != null) {
                    getViewTreeObserver().removeOnPreDrawListener(this.u);
                }
                this.v = false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x017f, code lost:
        if (r6 != false) goto L_0x021e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
            r19 = this;
            r7 = r19
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f60744a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 66473(0x103a9, float:9.3149E-41)
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0029
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f60744a
            r3 = 0
            r4 = 66473(0x103a9, float:9.3149E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0029:
            java.util.List<android.view.View> r0 = r7.l
            r0.clear()
            com.ss.android.ugc.aweme.poi.ui.detail.widget.a<android.view.View> r0 = r7.f60749f
            java.lang.Object[] r9 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.poi.ui.detail.widget.a.f60766a
            r12 = 0
            r13 = 66562(0x10402, float:9.3273E-41)
            java.lang.Class[] r14 = new java.lang.Class[r8]
            java.lang.Class r15 = java.lang.Void.TYPE
            r10 = r0
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
            r2 = 1
            if (r1 == 0) goto L_0x0055
            java.lang.Object[] r9 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.poi.ui.detail.widget.a.f60766a
            r12 = 0
            r13 = 66562(0x10402, float:9.3273E-41)
            java.lang.Class[] r14 = new java.lang.Class[r8]
            java.lang.Class r15 = java.lang.Void.TYPE
            r10 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x00a8
        L_0x0055:
            android.support.v4.util.SimpleArrayMap<T, java.util.ArrayList<T>> r1 = r0.f60768c
            int r1 = r1.size()
            r3 = 0
        L_0x005c:
            if (r3 >= r1) goto L_0x00a3
            android.support.v4.util.SimpleArrayMap<T, java.util.ArrayList<T>> r4 = r0.f60768c
            java.lang.Object r4 = r4.valueAt(r3)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 == 0) goto L_0x00a0
            java.lang.Object[] r9 = new java.lang.Object[r2]
            r9[r8] = r4
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.poi.ui.detail.widget.a.f60766a
            r12 = 0
            r13 = 66567(0x10407, float:9.328E-41)
            java.lang.Class[] r14 = new java.lang.Class[r2]
            java.lang.Class<java.util.ArrayList> r5 = java.util.ArrayList.class
            r14[r8] = r5
            java.lang.Class r15 = java.lang.Void.TYPE
            r10 = r0
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
            if (r5 == 0) goto L_0x0098
            java.lang.Object[] r9 = new java.lang.Object[r2]
            r9[r8] = r4
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.poi.ui.detail.widget.a.f60766a
            r12 = 0
            r13 = 66567(0x10407, float:9.328E-41)
            java.lang.Class[] r14 = new java.lang.Class[r2]
            java.lang.Class<java.util.ArrayList> r4 = java.util.ArrayList.class
            r14[r8] = r4
            java.lang.Class r15 = java.lang.Void.TYPE
            r10 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x00a0
        L_0x0098:
            r4.clear()
            android.support.v4.util.Pools$Pool<java.util.ArrayList<T>> r5 = r0.f60767b
            r5.release(r4)
        L_0x00a0:
            int r3 = r3 + 1
            goto L_0x005c
        L_0x00a3:
            android.support.v4.util.SimpleArrayMap<T, java.util.ArrayList<T>> r0 = r0.f60768c
            r0.clear()
        L_0x00a8:
            int r0 = r19.getChildCount()
            r1 = 0
        L_0x00ad:
            if (r1 >= r0) goto L_0x044f
            android.view.View r3 = r7.getChildAt(r1)
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$d r4 = r7.c((android.view.View) r3)
            r5 = 2
            java.lang.Object[] r9 = new java.lang.Object[r5]
            r9[r8] = r7
            r9[r2] = r3
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout.d.f60757a
            r12 = 0
            r13 = 66547(0x103f3, float:9.3252E-41)
            java.lang.Class[] r14 = new java.lang.Class[r5]
            java.lang.Class<com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout> r6 = com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout.class
            r14[r8] = r6
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r14[r2] = r6
            java.lang.Class<android.view.View> r15 = android.view.View.class
            r10 = r4
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
            if (r6 == 0) goto L_0x00f8
            java.lang.Object[] r9 = new java.lang.Object[r5]
            r9[r8] = r7
            r9[r2] = r3
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout.d.f60757a
            r12 = 0
            r13 = 66547(0x103f3, float:9.3252E-41)
            java.lang.Class[] r14 = new java.lang.Class[r5]
            java.lang.Class<com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout> r6 = com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout.class
            r14[r8] = r6
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r14[r2] = r6
            java.lang.Class<android.view.View> r15 = android.view.View.class
            r10 = r4
            java.lang.Object r6 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            android.view.View r6 = (android.view.View) r6
            goto L_0x0220
        L_0x00f8:
            int r6 = r4.g
            r9 = -1
            r15 = 0
            if (r6 != r9) goto L_0x0104
            r4.m = r15
            r4.l = r15
            goto L_0x0220
        L_0x0104:
            android.view.View r6 = r4.l
            if (r6 == 0) goto L_0x0181
            java.lang.Object[] r9 = new java.lang.Object[r5]
            r9[r8] = r3
            r9[r2] = r7
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout.d.f60757a
            r12 = 0
            r13 = 66549(0x103f5, float:9.3255E-41)
            java.lang.Class[] r14 = new java.lang.Class[r5]
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r14[r8] = r6
            java.lang.Class<com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout> r6 = com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout.class
            r14[r2] = r6
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r10 = r4
            r15 = r6
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
            if (r6 == 0) goto L_0x014d
            java.lang.Object[] r9 = new java.lang.Object[r5]
            r9[r8] = r3
            r9[r2] = r7
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout.d.f60757a
            r12 = 0
            r13 = 66549(0x103f5, float:9.3255E-41)
            java.lang.Class[] r14 = new java.lang.Class[r5]
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r14[r8] = r6
            java.lang.Class<com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout> r6 = com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout.class
            r14[r2] = r6
            java.lang.Class r15 = java.lang.Boolean.TYPE
            r10 = r4
            java.lang.Object r6 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
        L_0x014b:
            r15 = 0
            goto L_0x017f
        L_0x014d:
            android.view.View r6 = r4.l
            int r6 = r6.getId()
            int r9 = r4.g
            if (r6 == r9) goto L_0x0159
            r6 = 0
            goto L_0x014b
        L_0x0159:
            android.view.View r6 = r4.l
            android.view.View r9 = r4.l
            android.view.ViewParent r9 = r9.getParent()
        L_0x0161:
            if (r9 == r7) goto L_0x017b
            if (r9 == 0) goto L_0x0174
            if (r9 != r3) goto L_0x0168
            goto L_0x0174
        L_0x0168:
            boolean r10 = r9 instanceof android.view.View
            if (r10 == 0) goto L_0x016f
            r6 = r9
            android.view.View r6 = (android.view.View) r6
        L_0x016f:
            android.view.ViewParent r9 = r9.getParent()
            goto L_0x0161
        L_0x0174:
            r15 = 0
            r4.m = r15
            r4.l = r15
            r6 = 0
            goto L_0x017f
        L_0x017b:
            r15 = 0
            r4.m = r6
            r6 = 1
        L_0x017f:
            if (r6 != 0) goto L_0x021e
        L_0x0181:
            java.lang.Object[] r9 = new java.lang.Object[r5]
            r9[r8] = r3
            r9[r2] = r7
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout.d.f60757a
            r12 = 0
            r13 = 66548(0x103f4, float:9.3254E-41)
            java.lang.Class[] r14 = new java.lang.Class[r5]
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r14[r8] = r6
            java.lang.Class<com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout> r6 = com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout.class
            r14[r2] = r6
            java.lang.Class r6 = java.lang.Void.TYPE
            r10 = r4
            r15 = r6
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
            if (r6 == 0) goto L_0x01be
            java.lang.Object[] r9 = new java.lang.Object[r5]
            r9[r8] = r3
            r9[r2] = r7
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout.d.f60757a
            r12 = 0
            r13 = 66548(0x103f4, float:9.3254E-41)
            java.lang.Class[] r14 = new java.lang.Class[r5]
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r14[r8] = r6
            java.lang.Class<com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout> r6 = com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout.class
            r14[r2] = r6
            java.lang.Class r15 = java.lang.Void.TYPE
            r10 = r4
            com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x021e
        L_0x01be:
            int r6 = r4.g
            android.view.View r6 = r7.findViewById(r6)
            r4.l = r6
            android.view.View r6 = r4.l
            if (r6 == 0) goto L_0x0213
            android.view.View r6 = r4.l
            if (r6 != r7) goto L_0x01e2
            boolean r6 = r19.isInEditMode()
            if (r6 == 0) goto L_0x01da
            r6 = 0
            r4.m = r6
            r4.l = r6
            goto L_0x021e
        L_0x01da:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "View can not be anchored to the the parent CoordinatorLayout"
            r0.<init>(r1)
            throw r0
        L_0x01e2:
            r6 = 0
            android.view.View r9 = r4.l
            android.view.View r10 = r4.l
            android.view.ViewParent r10 = r10.getParent()
        L_0x01eb:
            if (r10 == r7) goto L_0x0210
            if (r10 == 0) goto L_0x0210
            if (r10 != r3) goto L_0x0204
            boolean r9 = r19.isInEditMode()
            if (r9 == 0) goto L_0x01fc
            r4.m = r6
            r4.l = r6
            goto L_0x021e
        L_0x01fc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Anchor must not be a descendant of the anchored view"
            r0.<init>(r1)
            throw r0
        L_0x0204:
            boolean r11 = r10 instanceof android.view.View
            if (r11 == 0) goto L_0x020b
            r9 = r10
            android.view.View r9 = (android.view.View) r9
        L_0x020b:
            android.view.ViewParent r10 = r10.getParent()
            goto L_0x01eb
        L_0x0210:
            r4.m = r9
            goto L_0x021e
        L_0x0213:
            r6 = 0
            boolean r9 = r19.isInEditMode()
            if (r9 == 0) goto L_0x0429
            r4.m = r6
            r4.l = r6
        L_0x021e:
            android.view.View r6 = r4.l
        L_0x0220:
            com.ss.android.ugc.aweme.poi.ui.detail.widget.a<android.view.View> r6 = r7.f60749f
            r6.a(r3)
            r6 = 0
        L_0x0226:
            if (r6 >= r0) goto L_0x0422
            if (r6 == r1) goto L_0x0418
            android.view.View r15 = r7.getChildAt(r6)
            r14 = 3
            java.lang.Object[] r9 = new java.lang.Object[r14]
            r9[r8] = r7
            r9[r2] = r3
            r9[r5] = r15
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout.d.f60757a
            r12 = 0
            r13 = 66546(0x103f2, float:9.3251E-41)
            java.lang.Class[] r10 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout> r16 = com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout.class
            r10[r8] = r16
            java.lang.Class<android.view.View> r16 = android.view.View.class
            r10[r2] = r16
            java.lang.Class<android.view.View> r16 = android.view.View.class
            r10[r5] = r16
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r17 = r10
            r10 = r4
            r5 = 3
            r14 = r17
            r18 = r15
            r15 = r16
            boolean r9 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
            if (r9 == 0) goto L_0x028d
            java.lang.Object[] r9 = new java.lang.Object[r5]
            r9[r8] = r7
            r9[r2] = r3
            r15 = r18
            r10 = 2
            r9[r10] = r15
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout.d.f60757a
            r12 = 0
            r13 = 66546(0x103f2, float:9.3251E-41)
            java.lang.Class[] r14 = new java.lang.Class[r5]
            java.lang.Class<com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout> r5 = com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout.class
            r14[r8] = r5
            java.lang.Class<android.view.View> r5 = android.view.View.class
            r14[r2] = r5
            java.lang.Class<android.view.View> r5 = android.view.View.class
            r14[r10] = r5
            java.lang.Class r5 = java.lang.Boolean.TYPE
            r10 = r4
            r2 = r15
            r15 = r5
            java.lang.Object r5 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            goto L_0x031a
        L_0x028d:
            r2 = r18
            android.view.View r5 = r4.m
            if (r2 == r5) goto L_0x0319
            int r5 = android.support.v4.view.ViewCompat.getLayoutDirection(r19)
            r9 = 2
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r10[r8] = r2
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
            r12 = 1
            r10[r12] = r11
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout.d.f60757a
            r13 = 0
            r14 = 66550(0x103f6, float:9.3256E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class<android.view.View> r9 = android.view.View.class
            r15[r8] = r9
            java.lang.Class r9 = java.lang.Integer.TYPE
            r15[r12] = r9
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r9 = r10
            r10 = r4
            r12 = r13
            r13 = r14
            r14 = r15
            r15 = r16
            boolean r9 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
            if (r9 == 0) goto L_0x02ee
            r9 = 2
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r10[r8] = r2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r11 = 1
            r10[r11] = r5
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout.d.f60757a
            r12 = 0
            r13 = 66550(0x103f6, float:9.3256E-41)
            java.lang.Class[] r14 = new java.lang.Class[r9]
            java.lang.Class<android.view.View> r9 = android.view.View.class
            r14[r8] = r9
            java.lang.Class r9 = java.lang.Integer.TYPE
            r14[r11] = r9
            java.lang.Class r15 = java.lang.Boolean.TYPE
            r9 = r10
            r10 = r4
            r11 = r5
            java.lang.Object r5 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            goto L_0x0308
        L_0x02ee:
            android.view.ViewGroup$LayoutParams r9 = r2.getLayoutParams()
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$d r9 = (com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout.d) r9
            int r9 = r9.h
            int r9 = android.support.v4.view.GravityCompat.getAbsoluteGravity(r9, r5)
            if (r9 == 0) goto L_0x0307
            int r10 = r4.i
            int r5 = android.support.v4.view.GravityCompat.getAbsoluteGravity(r10, r5)
            r5 = r5 & r9
            if (r5 != r9) goto L_0x0307
            r5 = 1
            goto L_0x0308
        L_0x0307:
            r5 = 0
        L_0x0308:
            if (r5 != 0) goto L_0x0319
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$b r5 = r4.f60758b
            if (r5 == 0) goto L_0x0317
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$b r5 = r4.f60758b
            boolean r5 = r5.layoutDependsOn(r7, r3, r2)
            if (r5 == 0) goto L_0x0317
            goto L_0x0319
        L_0x0317:
            r5 = 0
            goto L_0x031a
        L_0x0319:
            r5 = 1
        L_0x031a:
            if (r5 == 0) goto L_0x0418
            com.ss.android.ugc.aweme.poi.ui.detail.widget.a<android.view.View> r5 = r7.f60749f
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r10[r8] = r2
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.poi.ui.detail.widget.a.f60766a
            r12 = 0
            r13 = 66557(0x103fd, float:9.3266E-41)
            java.lang.Class[] r14 = new java.lang.Class[r9]
            java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
            r14[r8] = r9
            java.lang.Class r15 = java.lang.Boolean.TYPE
            r9 = r10
            r10 = r5
            boolean r9 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
            if (r9 == 0) goto L_0x0359
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r10[r8] = r2
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.poi.ui.detail.widget.a.f60766a
            r12 = 0
            r13 = 66557(0x103fd, float:9.3266E-41)
            java.lang.Class[] r14 = new java.lang.Class[r9]
            java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
            r14[r8] = r9
            java.lang.Class r15 = java.lang.Boolean.TYPE
            r9 = r10
            r10 = r5
            java.lang.Object r5 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            goto L_0x035f
        L_0x0359:
            android.support.v4.util.SimpleArrayMap<T, java.util.ArrayList<T>> r5 = r5.f60768c
            boolean r5 = r5.containsKey(r2)
        L_0x035f:
            if (r5 != 0) goto L_0x0366
            com.ss.android.ugc.aweme.poi.ui.detail.widget.a<android.view.View> r5 = r7.f60749f
            r5.a(r2)
        L_0x0366:
            com.ss.android.ugc.aweme.poi.ui.detail.widget.a<android.view.View> r5 = r7.f60749f
            r9 = 2
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r10[r8] = r2
            r11 = 1
            r10[r11] = r3
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.poi.ui.detail.widget.a.f60766a
            r13 = 0
            r14 = 66558(0x103fe, float:9.3268E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
            r15[r8] = r9
            java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
            r15[r11] = r9
            java.lang.Class r16 = java.lang.Void.TYPE
            r9 = r10
            r10 = r5
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            r15 = r16
            boolean r9 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
            if (r9 == 0) goto L_0x03b3
            r15 = 2
            java.lang.Object[] r9 = new java.lang.Object[r15]
            r9[r8] = r2
            r16 = 1
            r9[r16] = r3
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.poi.ui.detail.widget.a.f60766a
            r12 = 0
            r13 = 66558(0x103fe, float:9.3268E-41)
            java.lang.Class[] r14 = new java.lang.Class[r15]
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r14[r8] = r2
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r14[r16] = r2
            java.lang.Class r2 = java.lang.Void.TYPE
            r10 = r5
            r17 = 2
            r15 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x041c
        L_0x03b3:
            r16 = 1
            r17 = 2
            android.support.v4.util.SimpleArrayMap<T, java.util.ArrayList<T>> r9 = r5.f60768c
            boolean r9 = r9.containsKey(r2)
            if (r9 == 0) goto L_0x0410
            android.support.v4.util.SimpleArrayMap<T, java.util.ArrayList<T>> r9 = r5.f60768c
            boolean r9 = r9.containsKey(r3)
            if (r9 == 0) goto L_0x0410
            android.support.v4.util.SimpleArrayMap<T, java.util.ArrayList<T>> r9 = r5.f60768c
            java.lang.Object r9 = r9.get(r2)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 != 0) goto L_0x040c
            java.lang.Object[] r9 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.poi.ui.detail.widget.a.f60766a
            r12 = 0
            r13 = 66566(0x10406, float:9.3279E-41)
            java.lang.Class[] r14 = new java.lang.Class[r8]
            java.lang.Class<java.util.ArrayList> r15 = java.util.ArrayList.class
            r10 = r5
            boolean r9 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
            if (r9 == 0) goto L_0x03f8
            java.lang.Object[] r9 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.poi.ui.detail.widget.a.f60766a
            r12 = 0
            r13 = 66566(0x10406, float:9.3279E-41)
            java.lang.Class[] r14 = new java.lang.Class[r8]
            java.lang.Class<java.util.ArrayList> r15 = java.util.ArrayList.class
            r10 = r5
            java.lang.Object r9 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            goto L_0x0407
        L_0x03f8:
            android.support.v4.util.Pools$Pool<java.util.ArrayList<T>> r9 = r5.f60767b
            java.lang.Object r9 = r9.acquire()
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 != 0) goto L_0x0407
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x0407:
            android.support.v4.util.SimpleArrayMap<T, java.util.ArrayList<T>> r5 = r5.f60768c
            r5.put(r2, r9)
        L_0x040c:
            r9.add(r3)
            goto L_0x041c
        L_0x0410:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "All nodes must be present in the graph before being added as an edge"
            r0.<init>(r1)
            throw r0
        L_0x0418:
            r16 = 1
            r17 = 2
        L_0x041c:
            int r6 = r6 + 1
            r2 = 1
            r5 = 2
            goto L_0x0226
        L_0x0422:
            r16 = 1
            int r1 = r1 + 1
            r2 = 1
            goto L_0x00ad
        L_0x0429:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Could not find CoordinatorLayout descendant view with id "
            r1.<init>(r2)
            android.content.res.Resources r2 = r19.getResources()
            int r4 = r4.g
            java.lang.String r2 = r2.getResourceName(r4)
            r1.append(r2)
            java.lang.String r2 = " to anchor view "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x044f:
            java.util.List<android.view.View> r0 = r7.l
            com.ss.android.ugc.aweme.poi.ui.detail.widget.a<android.view.View> r1 = r7.f60749f
            java.util.ArrayList r1 = r1.a()
            r0.addAll(r1)
            java.util.List<android.view.View> r0 = r7.l
            java.util.Collections.reverse(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout.b():void");
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.j = onHierarchyChangeListener;
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    private int b(int i2) {
        if (this.r != null && i2 >= 0 && i2 < this.r.length) {
            return this.r[i2];
        }
        return 0;
    }

    public void onStopNestedScroll(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f60744a, false, 66517, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f60744a, false, 66517, new Class[]{View.class}, Void.TYPE);
            return;
        }
        onStopNestedScroll(view2, 0);
    }

    private static void a(@NonNull Rect rect) {
        Rect rect2 = rect;
        if (PatchProxy.isSupport(new Object[]{rect2}, null, f60744a, true, 66455, new Class[]{Rect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect2}, null, f60744a, true, 66455, new Class[]{Rect.class}, Void.TYPE);
            return;
        }
        rect.setEmpty();
        k.release(rect2);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParams2 = layoutParams;
        if (PatchProxy.isSupport(new Object[]{layoutParams2}, this, f60744a, false, 66512, new Class[]{ViewGroup.LayoutParams.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{layoutParams2}, this, f60744a, false, 66512, new Class[]{ViewGroup.LayoutParams.class}, Boolean.TYPE)).booleanValue();
        } else if (!(layoutParams2 instanceof d) || !super.checkLayoutParams(layoutParams)) {
            return false;
        } else {
            return true;
        }
    }

    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AttributeSet attributeSet2 = attributeSet;
        if (!PatchProxy.isSupport(new Object[]{attributeSet2}, this, f60744a, false, 66509, new Class[]{AttributeSet.class}, d.class)) {
            return new d(getContext(), attributeSet2);
        }
        return (d) PatchProxy.accessDispatch(new Object[]{attributeSet2}, this, f60744a, false, 66509, new Class[]{AttributeSet.class}, d.class);
    }

    public void onDraw(Canvas canvas) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f60744a, false, 66482, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f60744a, false, 66482, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        if (this.i && this.w != null) {
            if (this.h != null) {
                i2 = this.h.getSystemWindowInsetTop();
            } else {
                i2 = 0;
            }
            if (i2 > 0) {
                this.w.setBounds(0, 0, getWidth(), i2);
                this.w.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f60744a, false, 66468, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f60744a, false, 66468, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            a(true);
        }
        boolean a2 = a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            a(true);
        }
        return a2;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (PatchProxy.isSupport(new Object[]{parcelable}, this, f60744a, false, 66526, new Class[]{Parcelable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcelable}, this, f60744a, false, 66526, new Class[]{Parcelable.class}, Void.TYPE);
        } else if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
        } else {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            SparseArray<Parcelable> sparseArray = savedState.f60753b;
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                int id = childAt.getId();
                b bVar = c(childAt).f60758b;
                if (!(id == -1 || bVar == null)) {
                    Parcelable parcelable2 = sparseArray.get(id);
                    if (parcelable2 != null) {
                        bVar.onRestoreInstanceState(this, childAt, parcelable2);
                    }
                }
            }
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f60744a, false, 66470, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f60744a, false, 66470, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.p) {
            a(false);
            this.p = true;
        }
    }

    public void setFitsSystemWindows(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f60744a, false, 66483, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f60744a, false, 66483, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setFitsSystemWindows(z);
        d();
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{drawable}, this, f60744a, false, 66458, new Class[]{Drawable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable}, this, f60744a, false, 66458, new Class[]{Drawable.class}, Void.TYPE);
            return;
        }
        if (this.w != drawable) {
            Drawable drawable2 = null;
            if (this.w != null) {
                this.w.setCallback(null);
            }
            if (drawable != null) {
                drawable2 = drawable.mutate();
            }
            this.w = drawable2;
            if (this.w != null) {
                if (this.w.isStateful()) {
                    this.w.setState(getDrawableState());
                }
                DrawableCompat.setLayoutDirection(this.w, ViewCompat.getLayoutDirection(this));
                Drawable drawable3 = this.w;
                if (getVisibility() != 0) {
                    z = false;
                }
                drawable3.setVisible(z, false);
                this.w.setCallback(this);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setStatusBarBackgroundColor(@ColorInt int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f60744a, false, 66463, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f60744a, false, 66463, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(@DrawableRes int i2) {
        Drawable drawable;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f60744a, false, 66462, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f60744a, false, 66462, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i3 != 0) {
            drawable = ContextCompat.getDrawable(getContext(), i3);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    public void setVisibility(int i2) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f60744a, false, 66461, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f60744a, false, 66461, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.setVisibility(i2);
        if (i2 != 0) {
            z = false;
        }
        if (!(this.w == null || this.w.isVisible() == z)) {
            this.w.setVisible(z, false);
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = drawable;
        if (PatchProxy.isSupport(new Object[]{drawable2}, this, f60744a, false, 66460, new Class[]{Drawable.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{drawable2}, this, f60744a, false, 66460, new Class[]{Drawable.class}, Boolean.TYPE)).booleanValue();
        }
        if (!super.verifyDrawable(drawable)) {
            if (drawable2 == this.w) {
                return true;
            }
            return false;
        }
        return true;
    }

    private d c(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f60744a, false, 66472, new Class[]{View.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{view2}, this, f60744a, false, 66472, new Class[]{View.class}, d.class);
        }
        d dVar = (d) view.getLayoutParams();
        if (!dVar.f60759c) {
            if (view2 instanceof a) {
                dVar.a(((a) view2).a());
                dVar.f60759c = true;
            } else {
                DefaultBehavior defaultBehavior = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    defaultBehavior = (DefaultBehavior) cls.getAnnotation(DefaultBehavior.class);
                    if (defaultBehavior != null) {
                        break;
                    }
                }
                if (defaultBehavior != null) {
                    try {
                        dVar.a((b) defaultBehavior.a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception unused) {
                    }
                }
                dVar.f60759c = true;
            }
        }
        return dVar;
    }

    @NonNull
    public final List<View> b(@NonNull View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f60744a, false, 66499, new Class[]{View.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{view}, this, f60744a, false, 66499, new Class[]{View.class}, List.class);
        }
        List c2 = this.f60749f.c(view);
        this.g.clear();
        if (c2 != null) {
            this.g.addAll(c2);
        }
        return this.g;
    }

    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParams2 = layoutParams;
        if (PatchProxy.isSupport(new Object[]{layoutParams2}, this, f60744a, false, 66510, new Class[]{ViewGroup.LayoutParams.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{layoutParams2}, this, f60744a, false, 66510, new Class[]{ViewGroup.LayoutParams.class}, d.class);
        } else if (layoutParams2 instanceof d) {
            return new d((d) layoutParams2);
        } else {
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                return new d((ViewGroup.MarginLayoutParams) layoutParams2);
            }
            return new d(layoutParams2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004c, code lost:
        if (r2 != false) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f60744a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r3 = 0
            r4 = 66469(0x103a5, float:9.3143E-41)
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003f
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f60744a
            r3 = 0
            r4 = 66469(0x103a5, float:9.3143E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r19
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x003f:
            r0 = 0
            int r1 = r20.getActionMasked()
            android.view.View r2 = r7.s
            if (r2 != 0) goto L_0x0051
            boolean r2 = r7.a((android.view.MotionEvent) r8, (int) r9)
            if (r2 == 0) goto L_0x004f
            goto L_0x0052
        L_0x004f:
            r3 = 0
            goto L_0x0064
        L_0x0051:
            r2 = 0
        L_0x0052:
            android.view.View r3 = r7.s
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$d r3 = (com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout.d) r3
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$b r3 = r3.f60758b
            if (r3 == 0) goto L_0x004f
            android.view.View r4 = r7.s
            boolean r3 = r3.onTouchEvent(r7, r4, r8)
        L_0x0064:
            android.view.View r4 = r7.s
            if (r4 != 0) goto L_0x006e
            boolean r2 = super.onTouchEvent(r20)
            r3 = r3 | r2
            goto L_0x0083
        L_0x006e:
            if (r2 == 0) goto L_0x0083
            long r13 = android.os.SystemClock.uptimeMillis()
            r15 = 3
            r16 = 0
            r17 = 0
            r18 = 0
            r11 = r13
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r11, r13, r15, r16, r17, r18)
            super.onTouchEvent(r0)
        L_0x0083:
            if (r0 == 0) goto L_0x0088
            r0.recycle()
        L_0x0088:
            if (r1 == r9) goto L_0x008d
            r0 = 3
            if (r1 != r0) goto L_0x0090
        L_0x008d:
            r7.a((boolean) r10)
        L_0x0090:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0906R.attr.gu);
    }

    private void b(View view, int i2) {
        View view2 = view;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i2)}, this, f60744a, false, 66496, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i2)}, this, f60744a, false, 66496, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        d dVar = (d) view.getLayoutParams();
        if (dVar.j != i3) {
            ViewCompat.offsetLeftAndRight(view2, i3 - dVar.j);
            dVar.j = i3;
        }
    }

    private void c(View view, int i2) {
        View view2 = view;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i2)}, this, f60744a, false, 66497, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i2)}, this, f60744a, false, 66497, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        d dVar = (d) view.getLayoutParams();
        if (dVar.k != i3) {
            ViewCompat.offsetTopAndBottom(view2, i3 - dVar.k);
            dVar.k = i3;
        }
    }

    public void onStopNestedScroll(View view, int i2) {
        View view2 = view;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i2)}, this, f60744a, false, 66518, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i2)}, this, f60744a, false, 66518, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.y.onStopNestedScroll(view2, i3);
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            d dVar = (d) childAt.getLayoutParams();
            b bVar = dVar.f60758b;
            if (bVar != null) {
                bVar.onStopNestedScroll(this, childAt, view2, i3);
            }
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, dVar, d.f60757a, false, 66545, new Class[]{Integer.TYPE}, Void.TYPE)) {
                d dVar2 = dVar;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, dVar2, d.f60757a, false, 66545, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                dVar.a(i3, false);
            }
            dVar.b();
        }
        this.t = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0166, code lost:
        if (r0.onMeasureChild(r31, r19, r23, r20, r25, 0) == false) goto L_0x0177;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0169  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r32, int r33) {
        /*
            r31 = this;
            r7 = r31
            r8 = 2
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r32)
            r9 = 0
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r33)
            r10 = 1
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f60744a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 66478(0x103ae, float:9.3156E-41)
            r1 = r31
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0053
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r32)
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r33)
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f60744a
            r3 = 0
            r4 = 66478(0x103ae, float:9.3156E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r31
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0053:
            r31.b()
            r31.c()
            int r8 = r31.getPaddingLeft()
            int r0 = r31.getPaddingTop()
            int r11 = r31.getPaddingRight()
            int r1 = r31.getPaddingBottom()
            int r12 = android.support.v4.view.ViewCompat.getLayoutDirection(r31)
            if (r12 != r10) goto L_0x0071
            r13 = 1
            goto L_0x0072
        L_0x0071:
            r13 = 0
        L_0x0072:
            int r14 = android.view.View.MeasureSpec.getMode(r32)
            int r15 = android.view.View.MeasureSpec.getSize(r32)
            int r6 = android.view.View.MeasureSpec.getMode(r33)
            int r16 = android.view.View.MeasureSpec.getSize(r33)
            int r17 = r8 + r11
            int r18 = r0 + r1
            int r0 = r31.getSuggestedMinimumWidth()
            int r1 = r31.getSuggestedMinimumHeight()
            android.support.v4.view.WindowInsetsCompat r2 = r7.h
            if (r2 == 0) goto L_0x0099
            boolean r2 = android.support.v4.view.ViewCompat.getFitsSystemWindows(r31)
            if (r2 == 0) goto L_0x0099
            goto L_0x009a
        L_0x0099:
            r10 = 0
        L_0x009a:
            java.util.List<android.view.View> r2 = r7.l
            int r5 = r2.size()
            r3 = r0
            r2 = 0
            r4 = 0
        L_0x00a3:
            if (r4 >= r5) goto L_0x01cb
            java.util.List<android.view.View> r0 = r7.l
            java.lang.Object r0 = r0.get(r4)
            r19 = r0
            android.view.View r19 = (android.view.View) r19
            int r0 = r19.getVisibility()
            r9 = 8
            if (r0 == r9) goto L_0x01b5
            android.view.ViewGroup$LayoutParams r0 = r19.getLayoutParams()
            r9 = r0
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$d r9 = (com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout.d) r9
            int r0 = r9.f60762f
            if (r0 < 0) goto L_0x0102
            if (r14 == 0) goto L_0x0102
            int r0 = r9.f60762f
            int r0 = r7.b((int) r0)
            r21 = r1
            int r1 = r9.f60760d
            int r1 = d(r1)
            int r1 = android.support.v4.view.GravityCompat.getAbsoluteGravity(r1, r12)
            r1 = r1 & 7
            r22 = r2
            r2 = 3
            if (r1 != r2) goto L_0x00df
            if (r13 == 0) goto L_0x00e4
        L_0x00df:
            r2 = 5
            if (r1 != r2) goto L_0x00f0
            if (r13 == 0) goto L_0x00f0
        L_0x00e4:
            int r1 = r15 - r11
            int r1 = r1 - r0
            r0 = 0
            int r1 = java.lang.Math.max(r0, r1)
            r20 = r1
            r2 = 0
            goto L_0x0109
        L_0x00f0:
            if (r1 != r2) goto L_0x00f4
            if (r13 == 0) goto L_0x00f9
        L_0x00f4:
            r2 = 3
            if (r1 != r2) goto L_0x0106
            if (r13 == 0) goto L_0x0106
        L_0x00f9:
            int r0 = r0 - r8
            r2 = 0
            int r0 = java.lang.Math.max(r2, r0)
            r20 = r0
            goto L_0x0109
        L_0x0102:
            r21 = r1
            r22 = r2
        L_0x0106:
            r2 = 0
            r20 = 0
        L_0x0109:
            if (r10 == 0) goto L_0x013c
            boolean r0 = android.support.v4.view.ViewCompat.getFitsSystemWindows(r19)
            if (r0 != 0) goto L_0x013c
            android.support.v4.view.WindowInsetsCompat r0 = r7.h
            int r0 = r0.getSystemWindowInsetLeft()
            android.support.v4.view.WindowInsetsCompat r1 = r7.h
            int r1 = r1.getSystemWindowInsetRight()
            int r0 = r0 + r1
            android.support.v4.view.WindowInsetsCompat r1 = r7.h
            int r1 = r1.getSystemWindowInsetTop()
            android.support.v4.view.WindowInsetsCompat r2 = r7.h
            int r2 = r2.getSystemWindowInsetBottom()
            int r1 = r1 + r2
            int r0 = r15 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r14)
            int r1 = r16 - r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r6)
            r23 = r0
            r25 = r1
            goto L_0x0140
        L_0x013c:
            r23 = r32
            r25 = r33
        L_0x0140:
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$b r0 = r9.f60758b
            if (r0 == 0) goto L_0x0169
            r26 = 0
            r2 = r21
            r1 = r31
            r28 = r2
            r27 = r22
            r21 = 0
            r2 = r19
            r29 = r3
            r3 = r23
            r22 = r4
            r4 = r20
            r24 = r5
            r5 = r25
            r30 = r6
            r6 = r26
            boolean r0 = r0.onMeasureChild(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x0185
            goto L_0x0177
        L_0x0169:
            r29 = r3
            r24 = r5
            r30 = r6
            r28 = r21
            r27 = r22
            r21 = 0
            r22 = r4
        L_0x0177:
            r5 = 0
            r0 = r31
            r1 = r19
            r2 = r23
            r3 = r20
            r4 = r25
            r0.a(r1, r2, r3, r4, r5)
        L_0x0185:
            int r0 = r19.getMeasuredWidth()
            int r0 = r17 + r0
            int r1 = r9.leftMargin
            int r0 = r0 + r1
            int r1 = r9.rightMargin
            int r0 = r0 + r1
            r1 = r29
            int r0 = java.lang.Math.max(r1, r0)
            int r1 = r19.getMeasuredHeight()
            int r1 = r18 + r1
            int r2 = r9.topMargin
            int r1 = r1 + r2
            int r2 = r9.bottomMargin
            int r1 = r1 + r2
            r2 = r28
            int r1 = java.lang.Math.max(r2, r1)
            int r2 = r19.getMeasuredState()
            r9 = r27
            int r2 = android.view.View.combineMeasuredStates(r9, r2)
            r3 = r0
            goto L_0x01c2
        L_0x01b5:
            r9 = r2
            r22 = r4
            r24 = r5
            r30 = r6
            r21 = 0
            r2 = r1
            r1 = r3
            r1 = r2
            r2 = r9
        L_0x01c2:
            int r4 = r22 + 1
            r5 = r24
            r6 = r30
            r9 = 0
            goto L_0x00a3
        L_0x01cb:
            r9 = r2
            r2 = r1
            r1 = r3
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r9
            r3 = r32
            int r0 = android.view.View.resolveSizeAndState(r1, r3, r0)
            int r1 = r9 << 16
            r3 = r33
            int r1 = android.view.View.resolveSizeAndState(r2, r3, r1)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    private void a(View view, Rect rect) {
        if (PatchProxy.isSupport(new Object[]{view, rect}, this, f60744a, false, 66474, new Class[]{View.class, Rect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, rect}, this, f60744a, false, 66474, new Class[]{View.class, Rect.class}, Void.TYPE);
            return;
        }
        e.a((ViewGroup) this, view, rect);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray typedArray;
        this.l = new ArrayList();
        this.f60749f = new a<>();
        this.m = new ArrayList();
        this.g = new ArrayList();
        this.n = new int[2];
        this.y = new NestedScrollingParentHelper(this);
        if (i2 == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, R$styleable.CoordinatorLayout, 0, C0906R.style.q6);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, R$styleable.CoordinatorLayout, i2, 0);
        }
        int resourceId = typedArray.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.r = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = this.r.length;
            for (int i3 = 0; i3 < length; i3++) {
                int[] iArr = this.r;
                iArr[i3] = (int) (((float) iArr[i3]) * f2);
            }
        }
        this.w = typedArray.getDrawable(1);
        typedArray.recycle();
        d();
        super.setOnHierarchyChangeListener(new c());
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        View view3 = view;
        View view4 = view2;
        if (PatchProxy.isSupport(new Object[]{view3, view4, Integer.valueOf(i2)}, this, f60744a, false, 66515, new Class[]{View.class, View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view3, view4, Integer.valueOf(i2)}, this, f60744a, false, 66515, new Class[]{View.class, View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        onNestedScrollAccepted(view3, view4, i2, 0);
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        View view3 = view;
        View view4 = view2;
        if (!PatchProxy.isSupport(new Object[]{view3, view4, Integer.valueOf(i2)}, this, f60744a, false, 66513, new Class[]{View.class, View.class, Integer.TYPE}, Boolean.TYPE)) {
            return onStartNestedScroll(view3, view4, i2, 0);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view3, view4, Integer.valueOf(i2)}, this, f60744a, false, 66513, new Class[]{View.class, View.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    static b a(Context context, AttributeSet attributeSet, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, attributeSet, str2}, null, f60744a, true, 66471, new Class[]{Context.class, AttributeSet.class, String.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{context, attributeSet, str2}, null, f60744a, true, 66471, new Class[]{Context.class, AttributeSet.class, String.class}, b.class);
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            if (str2.startsWith(ClassUtils.PACKAGE_SEPARATOR)) {
                str2 = context.getPackageName() + str2;
            } else if (str2.indexOf(46) < 0 && !TextUtils.isEmpty(f60745b)) {
                str2 = f60745b + '.' + str2;
            }
            try {
                Map map = f60747d.get();
                if (map == null) {
                    map = new HashMap();
                    f60747d.set(map);
                }
                Constructor<?> constructor = (Constructor) map.get(str2);
                if (constructor == null) {
                    constructor = context.getClassLoader().loadClass(str2).getConstructor(f60746c);
                    constructor.setAccessible(true);
                    map.put(str2, constructor);
                }
                return (b) constructor.newInstance(new Object[]{context, attributeSet});
            } catch (Exception e2) {
                throw new RuntimeException("Could not inflate Behavior subclass " + str2, e2);
            }
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        Canvas canvas2 = canvas;
        View view2 = view;
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{canvas2, view2, new Long(j3)}, this, f60744a, false, 66493, new Class[]{Canvas.class, View.class, Long.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{canvas2, view2, new Long(j3)}, this, f60744a, false, 66493, new Class[]{Canvas.class, View.class, Long.TYPE}, Boolean.TYPE)).booleanValue();
        }
        d dVar = (d) view.getLayoutParams();
        if (dVar.f60758b != null) {
            float scrimOpacity = dVar.f60758b.getScrimOpacity(this, view2);
            if (scrimOpacity > 0.0f) {
                if (this.o == null) {
                    this.o = new Paint();
                }
                this.o.setColor(dVar.f60758b.getScrimColor(this, view2));
                this.o.setAlpha(MathUtils.clamp(Math.round(scrimOpacity * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.o);
                canvas2.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{view, Float.valueOf(f2), Float.valueOf(f3)}, this, f60744a, false, 66524, new Class[]{View.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, Float.valueOf(f2), Float.valueOf(f3)}, this, f60744a, false, 66524, new Class[]{View.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                b bVar = ((d) childAt.getLayoutParams()).f60758b;
                if (bVar != null) {
                    z = bVar.onNestedPreFling(this, childAt, view, f2, f3) | z;
                }
            }
        }
        return z;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        View view2 = view;
        Rect rect2 = rect;
        if (PatchProxy.isSupport(new Object[]{view2, rect2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f60744a, false, 66528, new Class[]{View.class, Rect.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, rect2, Byte.valueOf(z)}, this, f60744a, false, 66528, new Class[]{View.class, Rect.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        b bVar = ((d) view.getLayoutParams()).f60758b;
        if (bVar == null) {
            boolean z2 = z;
        } else if (bVar.onRequestChildRectangleOnScreen(this, view2, rect2, z)) {
            return true;
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    private void a(View view, boolean z, Rect rect) {
        View view2 = view;
        Rect rect2 = rect;
        if (PatchProxy.isSupport(new Object[]{view2, Byte.valueOf(z ? (byte) 1 : 0), rect2}, this, f60744a, false, 66486, new Class[]{View.class, Boolean.TYPE, Rect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Byte.valueOf(z), rect2}, this, f60744a, false, 66486, new Class[]{View.class, Boolean.TYPE, Rect.class}, Void.TYPE);
        } else if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            a(view2, rect2);
        } else {
            rect2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3), iArr}, this, f60744a, false, 66521, new Class[]{View.class, Integer.TYPE, Integer.TYPE, int[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3), iArr}, this, f60744a, false, 66521, new Class[]{View.class, Integer.TYPE, Integer.TYPE, int[].class}, Void.TYPE);
            return;
        }
        onNestedPreScroll(view, i2, i3, iArr, 0);
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (PatchProxy.isSupport(new Object[]{view, Float.valueOf(f2), Float.valueOf(f3), Byte.valueOf(z ? (byte) 1 : 0)}, this, f60744a, false, 66523, new Class[]{View.class, Float.TYPE, Float.TYPE, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, Float.valueOf(f2), Float.valueOf(f3), Byte.valueOf(z)}, this, f60744a, false, 66523, new Class[]{View.class, Float.TYPE, Float.TYPE, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                b bVar = ((d) childAt.getLayoutParams()).f60758b;
                if (bVar != null) {
                    z2 = bVar.onNestedFling(this, childAt, view, f2, f3, z) | z2;
                }
            }
        }
        if (z2) {
            a(1);
        }
        return z2;
    }

    public void onNestedScrollAccepted(View view, View view2, int i2, int i3) {
        View view3 = view;
        View view4 = view2;
        if (PatchProxy.isSupport(new Object[]{view3, view4, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60744a, false, 66516, new Class[]{View.class, View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view3, view4, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60744a, false, 66516, new Class[]{View.class, View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.y.onNestedScrollAccepted(view3, view4, i2, i3);
        this.t = view4;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            b bVar = ((d) childAt.getLayoutParams()).f60758b;
            if (bVar != null) {
                bVar.onNestedScrollAccepted(this, childAt, view, view2, i2, i3);
            }
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i2, int i3) {
        int i4 = i3;
        if (PatchProxy.isSupport(new Object[]{view, view2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60744a, false, 66514, new Class[]{View.class, View.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            Object[] objArr = {view, view2, Integer.valueOf(i2), Integer.valueOf(i3)};
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, f60744a, false, 66514, new Class[]{View.class, View.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                b bVar = dVar.f60758b;
                if (bVar != null) {
                    boolean onStartNestedScroll = bVar.onStartNestedScroll(this, childAt, view, view2, i2, i3);
                    dVar.a(i4, onStartNestedScroll);
                    StringBuilder sb = new StringBuilder("CoordinatorLayout---onStartNestedScroll...");
                    sb.append(onStartNestedScroll);
                    sb.append("/");
                    sb.append(i2);
                    z |= onStartNestedScroll;
                } else {
                    int i6 = i2;
                    dVar.a(i4, false);
                }
            } else {
                int i7 = i2;
            }
        }
        return z;
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f60744a, false, 66481, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f60744a, false, 66481, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int size = this.l.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = this.l.get(i6);
            if (view.getVisibility() != 8) {
                b bVar = ((d) view.getLayoutParams()).f60758b;
                if (bVar == null || !bVar.onLayoutChild(this, view, layoutDirection)) {
                    a(view, layoutDirection);
                }
            }
        }
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr, int i4) {
        int i5;
        int i6;
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3), iArr, Integer.valueOf(i4)}, this, f60744a, false, 66522, new Class[]{View.class, Integer.TYPE, Integer.TYPE, int[].class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3), iArr, Integer.valueOf(i4)}, this, f60744a, false, 66522, new Class[]{View.class, Integer.TYPE, Integer.TYPE, int[].class, Integer.TYPE}, Void.TYPE);
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                b bVar = ((d) childAt.getLayoutParams()).f60758b;
                if (bVar != null) {
                    int[] iArr2 = this.n;
                    this.n[1] = 0;
                    iArr2[0] = 0;
                    int i10 = i7;
                    bVar.onNestedPreScroll(this, childAt, view, i2, i3, this.n, i4);
                    if (i2 > 0) {
                        i5 = Math.max(i8, this.n[0]);
                    } else {
                        i5 = Math.min(i8, this.n[0]);
                    }
                    if (i3 > 0) {
                        i6 = Math.max(i10, this.n[1]);
                    } else {
                        i6 = Math.min(i10, this.n[1]);
                    }
                    i8 = i5;
                    i7 = i6;
                    z = true;
                }
            }
            i7 = i7;
        }
        iArr[0] = i8;
        iArr[1] = i7;
        if (z) {
            a(1);
        }
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f60744a, false, 66519, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f60744a, false, 66519, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        onNestedScroll(view, i2, i3, i4, i5, 0);
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)}, this, f60744a, false, 66520, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)}, this, f60744a, false, 66520, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                b bVar = ((d) childAt.getLayoutParams()).f60758b;
                if (bVar != null) {
                    bVar.onNestedScroll(this, childAt, view, i2, i3, i4, i5, i6);
                    z = true;
                }
            }
        }
        if (z) {
            a(1);
        }
    }

    private void a(View view, int i2, Rect rect, Rect rect2, d dVar, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i2;
        Rect rect3 = rect;
        Rect rect4 = rect2;
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2), rect3, rect4, dVar2, Integer.valueOf(i3), Integer.valueOf(i4)}, this, f60744a, false, 66487, new Class[]{View.class, Integer.TYPE, Rect.class, Rect.class, d.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2), rect3, rect4, dVar2, Integer.valueOf(i3), Integer.valueOf(i4)}, this, f60744a, false, 66487, new Class[]{View.class, Integer.TYPE, Rect.class, Rect.class, d.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int absoluteGravity = GravityCompat.getAbsoluteGravity(e(dVar2.f60760d), i7);
        int absoluteGravity2 = GravityCompat.getAbsoluteGravity(c(dVar2.f60761e), i7);
        int i8 = absoluteGravity & 7;
        int i9 = absoluteGravity & SearchJediMixFeedAdapter.f42516e;
        int i10 = absoluteGravity2 & 7;
        int i11 = absoluteGravity2 & SearchJediMixFeedAdapter.f42516e;
        if (i10 == 1) {
            i5 = rect3.left + (rect.width() / 2);
        } else if (i10 != 5) {
            i5 = rect3.left;
        } else {
            i5 = rect3.right;
        }
        if (i11 == 16) {
            i6 = rect3.top + (rect.height() / 2);
        } else if (i11 != 80) {
            i6 = rect3.top;
        } else {
            i6 = rect3.bottom;
        }
        if (i8 == 1) {
            i5 -= i3 / 2;
        } else if (i8 != 5) {
            i5 -= i3;
        }
        if (i9 == 16) {
            i6 -= i4 / 2;
        } else if (i9 != 80) {
            i6 -= i4;
        }
        rect4.set(i5, i6, i5 + i3, i6 + i4);
    }
}
