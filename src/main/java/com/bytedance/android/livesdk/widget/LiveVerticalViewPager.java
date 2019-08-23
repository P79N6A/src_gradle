package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.VelocityTrackerCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewConfigurationCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.view.WindowInsetsCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.support.v4.widget.EdgeEffectCompat;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.bytedance.android.live.base.annotation.IgnoreStyleCheck;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LiveVerticalViewPager extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18271a;
    private static final h am = new h();

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f18272b = {16842931};
    static Field g;
    private static final Comparator<b> i = new Comparator<b>() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return ((b) obj).f18290b - ((b) obj2).f18290b;
        }
    };
    private static final Interpolator j = new Interpolator() {
        public final float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    };
    private int A;
    private boolean B;
    private boolean C;
    private boolean D;
    private int E = 1;
    private boolean F;
    private boolean G;
    private int H;
    private int I;
    private int J;
    private float K;
    private float L;
    private float M;
    private float N;
    private int O = -1;
    private VelocityTracker P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private EdgeEffectCompat U;
    private EdgeEffectCompat V;
    private boolean W = false;
    private boolean aa = false;
    private boolean ab = true;
    private boolean ac = false;
    private boolean ad;
    private int ae;
    private ViewPager.OnPageChangeListener af;
    private ViewPager.OnPageChangeListener ag;
    private d ah;
    private ViewPager.PageTransformer ai;
    private Method aj;
    private int ak;
    private ArrayList<View> al;
    private final Runnable an = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f18277a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f18277a, false, 14589, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f18277a, false, 14589, new Class[0], Void.TYPE);
                return;
            }
            LiveVerticalViewPager.this.setScrollState(0);
            LiveVerticalViewPager.this.b();
        }
    };
    private int ao = 0;

    /* renamed from: c  reason: collision with root package name */
    public PagerAdapter f18273c;

    /* renamed from: d  reason: collision with root package name */
    public int f18274d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f18275e;

    /* renamed from: f  reason: collision with root package name */
    public e f18276f = null;
    private int h;
    private final ArrayList<b> k = new ArrayList<>();
    private final b l = new b();
    private final Rect m = new Rect();
    private int n = -1;
    private Parcelable o = null;
    private ClassLoader p = null;
    private Scroller q;
    private boolean r;
    private f s;
    private int t;
    private Drawable u;
    private int v;
    private int w;
    private float x = -3.4028235E38f;
    private float y = Float.MAX_VALUE;
    private int z;

    class MyAccessibilityDelegate extends AccessibilityDelegateCompat {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f18286a;

        private boolean a() {
            if (PatchProxy.isSupport(new Object[0], this, f18286a, false, 14596, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f18286a, false, 14596, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (LiveVerticalViewPager.this.f18273c == null || LiveVerticalViewPager.this.f18273c.getCount() <= 1) {
                return false;
            } else {
                return true;
            }
        }

        MyAccessibilityDelegate() {
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (PatchProxy.isSupport(new Object[]{view, accessibilityEvent}, this, f18286a, false, 14593, new Class[]{View.class, AccessibilityEvent.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, accessibilityEvent}, this, f18286a, false, 14593, new Class[]{View.class, AccessibilityEvent.class}, Void.TYPE);
                return;
            }
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            AccessibilityRecordCompat obtain = AccessibilityRecordCompat.obtain();
            obtain.setScrollable(a());
            if (accessibilityEvent.getEventType() == 4096 && LiveVerticalViewPager.this.f18273c != null) {
                obtain.setItemCount(LiveVerticalViewPager.this.f18273c.getCount());
                obtain.setFromIndex(LiveVerticalViewPager.this.f18274d);
                obtain.setToIndex(LiveVerticalViewPager.this.f18274d);
            }
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (PatchProxy.isSupport(new Object[]{view, accessibilityNodeInfoCompat}, this, f18286a, false, 14594, new Class[]{View.class, AccessibilityNodeInfoCompat.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, accessibilityNodeInfoCompat}, this, f18286a, false, 14594, new Class[]{View.class, AccessibilityNodeInfoCompat.class}, Void.TYPE);
                return;
            }
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setClassName(ViewPager.class.getName());
            accessibilityNodeInfoCompat.setScrollable(a());
            if (LiveVerticalViewPager.this.canScrollVertically(1)) {
                accessibilityNodeInfoCompat.addAction(4096);
            }
            if (LiveVerticalViewPager.this.canScrollVertically(-1)) {
                accessibilityNodeInfoCompat.addAction(8192);
            }
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), bundle}, this, f18286a, false, 14595, new Class[]{View.class, Integer.TYPE, Bundle.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), bundle}, this, f18286a, false, 14595, new Class[]{View.class, Integer.TYPE, Bundle.class}, Boolean.TYPE)).booleanValue();
            } else if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            } else {
                if (i2 != 4096) {
                    if (i2 != 8192 || !LiveVerticalViewPager.this.canScrollVertically(-1)) {
                        return false;
                    }
                    LiveVerticalViewPager.this.setCurrentItem(LiveVerticalViewPager.this.f18274d - 1);
                    return true;
                } else if (!LiveVerticalViewPager.this.canScrollVertically(1)) {
                    return false;
                } else {
                    LiveVerticalViewPager.this.setCurrentItem(LiveVerticalViewPager.this.f18274d + 1);
                    return true;
                }
            }
        }
    }

    interface a {
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        Object f18289a;

        /* renamed from: b  reason: collision with root package name */
        int f18290b;

        /* renamed from: c  reason: collision with root package name */
        boolean f18291c;

        /* renamed from: d  reason: collision with root package name */
        float f18292d;

        /* renamed from: e  reason: collision with root package name */
        float f18293e;

        b() {
        }
    }

    public static class c extends ViewGroup.LayoutParams {
        @IgnoreStyleCheck

        /* renamed from: a  reason: collision with root package name */
        public boolean f18294a;
        @IgnoreStyleCheck

        /* renamed from: b  reason: collision with root package name */
        public int f18295b;

        /* renamed from: c  reason: collision with root package name */
        float f18296c;

        /* renamed from: d  reason: collision with root package name */
        boolean f18297d;

        /* renamed from: e  reason: collision with root package name */
        int f18298e;

        /* renamed from: f  reason: collision with root package name */
        int f18299f;

        public c() {
            super(-1, -1);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LiveVerticalViewPager.f18272b);
            this.f18295b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    interface d {
    }

    public interface e {
        void a();

        void b();
    }

    class f extends DataSetObserver {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f18300a;

        public void onChanged() {
            if (PatchProxy.isSupport(new Object[0], this, f18300a, false, 14597, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f18300a, false, 14597, new Class[0], Void.TYPE);
                return;
            }
            LiveVerticalViewPager.this.a();
        }

        public void onInvalidated() {
            if (PatchProxy.isSupport(new Object[0], this, f18300a, false, 14598, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f18300a, false, 14598, new Class[0], Void.TYPE);
                return;
            }
            LiveVerticalViewPager.this.a();
        }

        private f() {
        }

        /* synthetic */ f(LiveVerticalViewPager liveVerticalViewPager, byte b2) {
            this();
        }
    }

    public static class g extends View.BaseSavedState {
        public static final Parcelable.Creator<g> CREATOR = ParcelableCompat.newCreator(new LiveVerticalViewPager$SavedState$1());

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f18302a;

        /* renamed from: b  reason: collision with root package name */
        int f18303b;

        /* renamed from: c  reason: collision with root package name */
        Parcelable f18304c;

        /* renamed from: d  reason: collision with root package name */
        ClassLoader f18305d;

        public String toString() {
            if (PatchProxy.isSupport(new Object[0], this, f18302a, false, 14600, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f18302a, false, 14600, new Class[0], String.class);
            }
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f18303b + "}";
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        g(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f18303b = parcel.readInt();
            this.f18304c = parcel.readParcelable(classLoader);
            this.f18305d = classLoader;
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, f18302a, false, 14599, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, f18302a, false, 14599, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f18303b);
            parcel.writeParcelable(this.f18304c, i);
        }
    }

    static class h implements Comparator<View> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f18306a;

        h() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            View view = (View) obj;
            View view2 = (View) obj2;
            int i = 1;
            if (PatchProxy.isSupport(new Object[]{view, view2}, this, f18306a, false, 14602, new Class[]{View.class, View.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{view, view2}, this, f18306a, false, 14602, new Class[]{View.class, View.class}, Integer.TYPE)).intValue();
            }
            c cVar = (c) view.getLayoutParams();
            c cVar2 = (c) view2.getLayoutParams();
            if (cVar.f18294a == cVar2.f18294a) {
                i = cVar.f18298e - cVar2.f18298e;
            } else if (!cVar.f18294a) {
                return -1;
            }
            return i;
        }
    }

    public PagerAdapter getAdapter() {
        return this.f18273c;
    }

    public int getCurrentItem() {
        return this.f18274d;
    }

    public int getOffscreenPageLimit() {
        return this.E;
    }

    public int getPageMargin() {
        return this.t;
    }

    public final void a(int i2, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f18271a, false, 14517, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2)}, this, f18271a, false, 14517, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.D = false;
        a(i2, z2, false);
    }

    private void a(int i2, boolean z2, boolean z3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f18271a, false, 14519, new Class[]{Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2), Byte.valueOf(z3)}, this, f18271a, false, 14519, new Class[]{Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(i2, z2, z3, 0);
    }

    private void a(int i2, boolean z2, boolean z3, int i3) {
        int i4;
        int i5 = i2;
        boolean z4 = true;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0), Integer.valueOf(i3)}, this, f18271a, false, 14520, new Class[]{Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2), Byte.valueOf(z3), Integer.valueOf(i3)}, this, f18271a, false, 14520, new Class[]{Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.f18273c == null || this.f18273c.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z3 || this.f18274d != i5 || this.k.size() == 0) {
            if (i5 < 0) {
                i4 = 0;
            } else {
                i4 = i5 >= this.f18273c.getCount() ? this.f18273c.getCount() - 1 : i5;
            }
            int i6 = this.E;
            if (i4 > this.f18274d + i6 || i4 < this.f18274d - i6) {
                for (int i7 = 0; i7 < this.k.size(); i7++) {
                    this.k.get(i7).f18291c = true;
                }
            }
            if (this.f18274d == i4) {
                z4 = false;
            }
            if (this.ab) {
                this.f18274d = i4;
                if (z4 && this.af != null) {
                    this.af.onPageSelected(i4);
                }
                if (z4 && this.ag != null) {
                    this.ag.onPageSelected(i4);
                }
                requestLayout();
                return;
            }
            a(i4);
            a(i4, z2, i3, z4);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    private void a(int i2, boolean z2, int i3, boolean z3) {
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : 0), Integer.valueOf(i3), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f18271a, false, 14521, new Class[]{Integer.TYPE, Boolean.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2), Integer.valueOf(i3), Byte.valueOf(z3)}, this, f18271a, false, 14521, new Class[]{Integer.TYPE, Boolean.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        b b2 = b(i2);
        int clientHeight = b2 != null ? (int) (((float) getClientHeight()) * Math.max(this.x, Math.min(b2.f18293e, this.y))) : 0;
        if (z2) {
            a(0, clientHeight, i3);
            if (z3 && this.af != null) {
                this.af.onPageSelected(i2);
            }
            if (z3 && this.ag != null) {
                this.ag.onPageSelected(i2);
            }
        } else {
            if (z3 && this.af != null) {
                this.af.onPageSelected(i2);
            }
            if (z3 && this.ag != null) {
                this.ag.onPageSelected(i2);
            }
            a(false);
            scrollTo(0, clientHeight);
            c(clientHeight);
        }
    }

    private void a(int i2, int i3, int i4) {
        int i5;
        int i6;
        if (PatchProxy.isSupport(new Object[]{0, Integer.valueOf(i3), Integer.valueOf(i4)}, this, f18271a, false, 14533, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{0, Integer.valueOf(i3), Integer.valueOf(i4)}, this, f18271a, false, 14533, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            if (this.q != null && !this.q.isFinished()) {
                i5 = this.r ? this.q.getCurrY() : this.q.getStartY();
                this.q.abortAnimation();
                setScrollingCacheEnabled(false);
            } else {
                i5 = getScrollY();
            }
            int i7 = i5;
            int scrollX = getScrollX();
            int i8 = 0 - scrollX;
            int i9 = i3 - i7;
            if (i8 == 0 && i9 == 0) {
                a(false);
                b();
                setScrollState(0);
                return;
            }
            setScrollingCacheEnabled(true);
            setScrollState(2);
            int clientHeight = getClientHeight();
            int i10 = clientHeight / 2;
            float f2 = (float) clientHeight;
            float f3 = (float) i10;
            float a2 = f3 + (a(Math.min(1.0f, (((float) Math.abs(i8)) * 1.0f) / f2)) * f3);
            int abs = Math.abs(i4);
            if (abs > 0) {
                i6 = Math.round(Math.abs(a2 / ((float) abs)) * 1000.0f) * 4;
            } else {
                i6 = (int) (((((float) Math.abs(i8)) / ((f2 * this.f18273c.getPageWidth(this.f18274d)) + ((float) this.t))) + 1.0f) * 100.0f);
            }
            int min = Math.min(i6, 600);
            this.r = false;
            this.q.startScroll(scrollX, i7, i8, i9, min);
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f18271a, false, 14535, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18271a, false, 14535, new Class[0], Void.TYPE);
            return;
        }
        int count = this.f18273c.getCount();
        this.h = count;
        boolean z2 = this.k.size() < (this.E * 2) + 1 && this.k.size() < count;
        int i2 = this.f18274d;
        int i3 = 0;
        boolean z3 = false;
        while (i3 < this.k.size()) {
            b bVar = this.k.get(i3);
            int itemPosition = this.f18273c.getItemPosition(bVar.f18289a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.k.remove(i3);
                    i3--;
                    if (!z3) {
                        this.f18273c.startUpdate((ViewGroup) this);
                        z3 = true;
                    }
                    this.f18273c.destroyItem((ViewGroup) this, bVar.f18290b, bVar.f18289a);
                    if (this.f18274d == bVar.f18290b) {
                        i2 = Math.max(0, Math.min(this.f18274d, count - 1));
                    }
                } else if (bVar.f18290b != itemPosition) {
                    if (bVar.f18290b == this.f18274d) {
                        i2 = itemPosition;
                    }
                    bVar.f18290b = itemPosition;
                }
                z2 = true;
            }
            i3++;
        }
        if (z3) {
            this.f18273c.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.k, i);
        if (z2) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                c cVar = (c) getChildAt(i4).getLayoutParams();
                if (!cVar.f18294a) {
                    cVar.f18296c = 0.0f;
                }
            }
            a(i2, false, true);
            requestLayout();
        }
    }

    private void a(b bVar, int i2, b bVar2) {
        b bVar3;
        b bVar4;
        b bVar5 = bVar;
        b bVar6 = bVar2;
        if (PatchProxy.isSupport(new Object[]{bVar5, Integer.valueOf(i2), bVar6}, this, f18271a, false, 14539, new Class[]{b.class, Integer.TYPE, b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar5, Integer.valueOf(i2), bVar6}, this, f18271a, false, 14539, new Class[]{b.class, Integer.TYPE, b.class}, Void.TYPE);
            return;
        }
        int count = this.f18273c.getCount();
        int clientHeight = getClientHeight();
        float f2 = clientHeight > 0 ? ((float) this.t) / ((float) clientHeight) : 0.0f;
        if (bVar6 != null) {
            int i3 = bVar6.f18290b;
            if (i3 < bVar5.f18290b) {
                int i4 = i3 + 1;
                float f3 = bVar6.f18293e + bVar6.f18292d + f2;
                int i5 = 0;
                while (i4 <= bVar5.f18290b && i5 < this.k.size()) {
                    Object obj = this.k.get(i5);
                    while (true) {
                        bVar4 = (b) obj;
                        if (i4 > bVar4.f18290b && i5 < this.k.size() - 1) {
                            i5++;
                            obj = this.k.get(i5);
                        }
                    }
                    while (i4 < bVar4.f18290b) {
                        f3 += this.f18273c.getPageWidth(i4) + f2;
                        i4++;
                    }
                    bVar4.f18293e = f3;
                    f3 += bVar4.f18292d + f2;
                    i4++;
                }
            } else if (i3 > bVar5.f18290b) {
                int size = this.k.size() - 1;
                float f4 = bVar6.f18293e;
                int i6 = i3 - 1;
                while (i6 >= bVar5.f18290b && size >= 0) {
                    Object obj2 = this.k.get(size);
                    while (true) {
                        bVar3 = (b) obj2;
                        if (i6 < bVar3.f18290b && size > 0) {
                            size--;
                            obj2 = this.k.get(size);
                        }
                    }
                    while (i6 > bVar3.f18290b) {
                        f4 -= this.f18273c.getPageWidth(i6) + f2;
                        i6--;
                    }
                    f4 -= bVar3.f18292d + f2;
                    bVar3.f18293e = f4;
                    i6--;
                }
            }
        }
        int size2 = this.k.size();
        float f5 = bVar5.f18293e;
        int i7 = bVar5.f18290b - 1;
        this.x = bVar5.f18290b == 0 ? bVar5.f18293e : -3.4028235E38f;
        int i8 = count - 1;
        this.y = bVar5.f18290b == i8 ? (bVar5.f18293e + bVar5.f18292d) - 1.0f : Float.MAX_VALUE;
        int i9 = i2 - 1;
        while (i9 >= 0) {
            b bVar7 = this.k.get(i9);
            while (i7 > bVar7.f18290b) {
                f5 -= this.f18273c.getPageWidth(i7) + f2;
                i7--;
            }
            f5 -= bVar7.f18292d + f2;
            bVar7.f18293e = f5;
            if (bVar7.f18290b == 0) {
                this.x = f5;
            }
            i9--;
            i7--;
        }
        float f6 = bVar5.f18293e + bVar5.f18292d + f2;
        int i10 = bVar5.f18290b + 1;
        int i11 = i2 + 1;
        while (i11 < size2) {
            b bVar8 = this.k.get(i11);
            while (i10 < bVar8.f18290b) {
                f6 += this.f18273c.getPageWidth(i10) + f2;
                i10++;
            }
            if (bVar8.f18290b == i8) {
                this.y = (bVar8.f18292d + f6) - 1.0f;
            }
            bVar8.f18293e = f6;
            f6 += bVar8.f18292d + f2;
            i11++;
            i10++;
        }
        this.ac = false;
    }

    private void a(int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f18271a, false, 14550, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f18271a, false, 14550, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (i3 <= 0 || this.k.isEmpty()) {
            b b2 = b(this.f18274d);
            int min = (int) ((b2 != null ? Math.min(b2.f18293e, this.y) : 0.0f) * ((float) ((i2 - getPaddingTop()) - getPaddingBottom())));
            if (min != getScrollY()) {
                a(false);
                scrollTo(getScrollX(), min);
            }
        } else if (!this.q.isFinished()) {
            this.q.setFinalY(getCurrentItem() * getClientHeight());
        } else {
            scrollTo(getScrollX(), (int) ((((float) getScrollY()) / ((float) (((i3 - getPaddingTop()) - getPaddingBottom()) + i5))) * ((float) (((i2 - getPaddingTop()) - getPaddingBottom()) + i4))));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(int r18, float r19, int r20) {
        /*
            r17 = this;
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = 3
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r12 = 0
            r0[r12] = r1
            java.lang.Float r1 = java.lang.Float.valueOf(r19)
            r13 = 1
            r0[r13] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            r14 = 2
            r0[r14] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f18271a
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 14554(0x38da, float:2.0394E-41)
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x006c
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r0[r12] = r1
            java.lang.Float r1 = java.lang.Float.valueOf(r19)
            r0[r13] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            r0[r14] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f18271a
            r3 = 0
            r4 = 14554(0x38da, float:2.0394E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x006c:
            int r0 = r7.ae
            if (r0 <= 0) goto L_0x00db
            int r0 = r17.getScrollY()
            int r1 = r17.getPaddingTop()
            int r2 = r17.getPaddingBottom()
            int r3 = r17.getHeight()
            int r4 = r17.getChildCount()
            r5 = r2
            r2 = r1
            r1 = 0
        L_0x0087:
            if (r1 >= r4) goto L_0x00db
            android.view.View r6 = r7.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r11 = r6.getLayoutParams()
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$c r11 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.c) r11
            boolean r15 = r11.f18294a
            if (r15 == 0) goto L_0x00d8
            int r11 = r11.f18295b
            r11 = r11 & 112(0x70, float:1.57E-43)
            r15 = 16
            if (r11 == r15) goto L_0x00bc
            r15 = 48
            if (r11 == r15) goto L_0x00b6
            r15 = 80
            if (r11 == r15) goto L_0x00a9
            r11 = r2
            goto L_0x00cc
        L_0x00a9:
            int r11 = r3 - r5
            int r15 = r6.getMeasuredHeight()
            int r11 = r11 - r15
            int r15 = r6.getMeasuredHeight()
            int r5 = r5 + r15
            goto L_0x00c7
        L_0x00b6:
            int r11 = r6.getHeight()
            int r11 = r11 + r2
            goto L_0x00cc
        L_0x00bc:
            int r11 = r6.getMeasuredHeight()
            int r11 = r3 - r11
            int r11 = r11 / r14
            int r11 = java.lang.Math.max(r11, r2)
        L_0x00c7:
            r16 = r11
            r11 = r2
            r2 = r16
        L_0x00cc:
            int r2 = r2 + r0
            int r15 = r6.getTop()
            int r2 = r2 - r15
            if (r2 == 0) goto L_0x00d7
            r6.offsetTopAndBottom(r2)
        L_0x00d7:
            r2 = r11
        L_0x00d8:
            int r1 = r1 + 1
            goto L_0x0087
        L_0x00db:
            android.support.v4.view.ViewPager$OnPageChangeListener r0 = r7.af
            if (r0 == 0) goto L_0x00e4
            android.support.v4.view.ViewPager$OnPageChangeListener r0 = r7.af
            r0.onPageScrolled(r8, r9, r10)
        L_0x00e4:
            android.support.v4.view.ViewPager$OnPageChangeListener r0 = r7.ag
            if (r0 == 0) goto L_0x00ed
            android.support.v4.view.ViewPager$OnPageChangeListener r0 = r7.ag
            r0.onPageScrolled(r8, r9, r10)
        L_0x00ed:
            android.support.v4.view.ViewPager$PageTransformer r0 = r7.ai
            if (r0 == 0) goto L_0x011d
            int r0 = r17.getScrollY()
            int r1 = r17.getChildCount()
        L_0x00f9:
            if (r12 >= r1) goto L_0x011d
            android.view.View r2 = r7.getChildAt(r12)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$c r3 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.c) r3
            boolean r3 = r3.f18294a
            if (r3 != 0) goto L_0x011a
            int r3 = r2.getTop()
            int r3 = r3 - r0
            float r3 = (float) r3
            int r4 = r17.getClientHeight()
            float r4 = (float) r4
            float r3 = r3 / r4
            android.support.v4.view.ViewPager$PageTransformer r4 = r7.ai
            r4.transformPage(r2, r3)
        L_0x011a:
            int r12 = r12 + 1
            goto L_0x00f9
        L_0x011d:
            r7.ad = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.LiveVerticalViewPager.a(int, float, int):void");
    }

    private void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f18271a, false, 14555, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f18271a, false, 14555, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        boolean z3 = this.ao == 2;
        if (z3) {
            setScrollingCacheEnabled(false);
            if (!this.q.isFinished()) {
                this.q.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.q.getCurrX();
                int currY = this.q.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currY != scrollY) {
                        c(currY);
                    }
                }
            }
        }
        this.D = false;
        boolean z4 = z3;
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            b bVar = this.k.get(i2);
            if (bVar.f18291c) {
                bVar.f18291c = false;
                z4 = true;
            }
        }
        if (z4) {
            if (z2) {
                ViewCompat.postOnAnimation(this, this.an);
                return;
            }
            this.an.run();
        }
    }

    private void a(MotionEvent motionEvent) {
        int i2 = 1;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f18271a, false, 14570, new Class[]{MotionEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f18271a, false, 14570, new Class[]{MotionEvent.class}, Void.TYPE);
            return;
        }
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (MotionEventCompat.getPointerId(motionEvent, actionIndex) == this.O) {
            if (actionIndex != 0) {
                i2 = 0;
            }
            this.L = MotionEventCompat.getY(motionEvent, i2);
            this.O = MotionEventCompat.getPointerId(motionEvent, i2);
            if (this.P != null) {
                this.P.clear();
            }
        }
    }

    private boolean a(View view, boolean z2, int i2, int i3, int i4) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Byte.valueOf(z2 ? (byte) 1 : 0), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f18271a, false, 14573, new Class[]{View.class, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, Byte.valueOf(z2), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f18271a, false, 14573, new Class[]{View.class, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i4 + scrollY;
                if (i5 >= childAt.getTop() && i5 < childAt.getBottom()) {
                    int i6 = i3 + scrollX;
                    if (i6 >= childAt.getLeft() && i6 < childAt.getRight()) {
                        if (a(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                            return true;
                        }
                    }
                }
            }
        }
        return z2 && ViewCompat.canScrollVertically(view2, -i2);
    }

    private void a(PagerAdapter pagerAdapter, f fVar) {
        PagerAdapter pagerAdapter2 = pagerAdapter;
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{pagerAdapter2, fVar2}, this, f18271a, false, 14588, new Class[]{PagerAdapter.class, f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pagerAdapter2, fVar2}, this, f18271a, false, 14588, new Class[]{PagerAdapter.class, f.class}, Void.TYPE);
            return;
        }
        try {
            g.set(pagerAdapter2, fVar2);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        }
    }

    static {
        try {
            Field declaredField = PagerAdapter.class.getDeclaredField("mViewPagerObserver");
            g = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            throw new RuntimeException(e2);
        }
    }

    private boolean e() {
        if (PatchProxy.isSupport(new Object[0], this, f18271a, false, 14560, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f18271a, false, 14560, new Class[0], Boolean.TYPE)).booleanValue();
        }
        this.O = -1;
        g();
        return this.U.onRelease() | this.V.onRelease();
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f18271a, false, 14571, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18271a, false, 14571, new Class[0], Void.TYPE);
            return;
        }
        this.F = false;
        this.G = false;
        if (this.P != null) {
            this.P.recycle();
            this.P = null;
        }
    }

    private int getClientHeight() {
        if (!PatchProxy.isSupport(new Object[0], this, f18271a, false, 14515, new Class[0], Integer.TYPE)) {
            return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f18271a, false, 14515, new Class[0], Integer.TYPE)).intValue();
    }

    private boolean h() {
        if (PatchProxy.isSupport(new Object[0], this, f18271a, false, 14578, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f18271a, false, 14578, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f18274d <= 0) {
            return false;
        } else {
            a(this.f18274d - 1, true);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f18271a, false, 14536, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18271a, false, 14536, new Class[0], Void.TYPE);
            return;
        }
        a(this.f18274d);
    }

    public void drawableStateChanged() {
        if (PatchProxy.isSupport(new Object[0], this, f18271a, false, 14530, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18271a, false, 14530, new Class[0], Void.TYPE);
            return;
        }
        super.drawableStateChanged();
        Drawable drawable = this.u;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        if (!PatchProxy.isSupport(new Object[0], this, f18271a, false, 14584, new Class[0], ViewGroup.LayoutParams.class)) {
            return new c();
        }
        return (ViewGroup.LayoutParams) PatchProxy.accessDispatch(new Object[0], this, f18271a, false, 14584, new Class[0], ViewGroup.LayoutParams.class);
    }

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f18271a, false, 14547, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18271a, false, 14547, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        this.ab = true;
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f18271a, false, 14511, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18271a, false, 14511, new Class[0], Void.TYPE);
            return;
        }
        removeCallbacks(this.an);
        if (this.q != null && !this.q.isFinished()) {
            this.q.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public Parcelable onSaveInstanceState() {
        if (PatchProxy.isSupport(new Object[0], this, f18271a, false, 14540, new Class[0], Parcelable.class)) {
            return (Parcelable) PatchProxy.accessDispatch(new Object[0], this, f18271a, false, 14540, new Class[0], Parcelable.class);
        }
        g gVar = new g(super.onSaveInstanceState());
        gVar.f18303b = this.f18274d;
        if (this.f18273c != null) {
            gVar.f18304c = this.f18273c.saveState();
        }
        return gVar;
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f18271a, false, 14538, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18271a, false, 14538, new Class[0], Void.TYPE);
            return;
        }
        if (this.ak != 0) {
            if (this.al == null) {
                this.al = new ArrayList<>();
            } else {
                this.al.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.al.add(getChildAt(i2));
            }
            Collections.sort(this.al, am);
        }
    }

    private boolean i() {
        if (PatchProxy.isSupport(new Object[0], this, f18271a, false, 14579, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f18271a, false, 14579, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f18273c == null || this.f18274d >= this.f18273c.getCount() - 1) {
            return false;
        } else {
            a(this.f18274d + 1, true);
            return true;
        }
    }

    public void computeScroll() {
        if (PatchProxy.isSupport(new Object[0], this, f18271a, false, 14552, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18271a, false, 14552, new Class[0], Void.TYPE);
            return;
        }
        this.r = true;
        if (this.q.isFinished() || !this.q.computeScrollOffset()) {
            a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.q.getCurrX();
        int currY = this.q.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!c(currY)) {
                this.q.abortAnimation();
                scrollTo(currX, 0);
            }
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f18271a, false, 14510, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18271a, false, 14510, new Class[0], Void.TYPE);
            return;
        }
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.q = new Scroller(context, j);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.J = ViewConfigurationCompat.getScaledPagingTouchSlop(viewConfiguration);
        this.Q = (int) (400.0f * f2);
        this.R = viewConfiguration.getScaledMaximumFlingVelocity();
        this.U = new EdgeEffectCompat(context);
        this.V = new EdgeEffectCompat(context);
        this.S = (int) (25.0f * f2);
        this.T = (int) (2.0f * f2);
        this.H = (int) (f2 * 16.0f);
        ViewCompat.setAccessibilityDelegate(this, new MyAccessibilityDelegate());
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f18279a;

            /* renamed from: c  reason: collision with root package name */
            private final Rect f18281c = new Rect();

            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                if (PatchProxy.isSupport(new Object[]{view, windowInsetsCompat}, this, f18279a, false, 14590, new Class[]{View.class, WindowInsetsCompat.class}, WindowInsetsCompat.class)) {
                    return (WindowInsetsCompat) PatchProxy.accessDispatch(new Object[]{view, windowInsetsCompat}, this, f18279a, false, 14590, new Class[]{View.class, WindowInsetsCompat.class}, WindowInsetsCompat.class);
                }
                WindowInsetsCompat onApplyWindowInsets = ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
                if (onApplyWindowInsets.isConsumed()) {
                    return onApplyWindowInsets;
                }
                Rect rect = this.f18281c;
                rect.left = onApplyWindowInsets.getSystemWindowInsetLeft();
                rect.top = onApplyWindowInsets.getSystemWindowInsetTop();
                rect.right = onApplyWindowInsets.getSystemWindowInsetRight();
                rect.bottom = onApplyWindowInsets.getSystemWindowInsetBottom();
                int childCount = LiveVerticalViewPager.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    WindowInsetsCompat dispatchApplyWindowInsets = ViewCompat.dispatchApplyWindowInsets(LiveVerticalViewPager.this.getChildAt(i), onApplyWindowInsets);
                    rect.left = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetLeft(), rect.left);
                    rect.top = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetTop(), rect.top);
                    rect.right = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetRight(), rect.right);
                    rect.bottom = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetBottom(), rect.bottom);
                }
                return onApplyWindowInsets.replaceSystemWindowInsets(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    private b f() {
        float f2;
        float f3;
        if (PatchProxy.isSupport(new Object[0], this, f18271a, false, 14563, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], this, f18271a, false, 14563, new Class[0], b.class);
        }
        int clientHeight = getClientHeight();
        if (clientHeight > 0) {
            f2 = ((float) getScrollY()) / ((float) clientHeight);
        } else {
            f2 = 0.0f;
        }
        if (clientHeight > 0) {
            f3 = ((float) this.t) / ((float) clientHeight);
        } else {
            f3 = 0.0f;
        }
        b bVar = null;
        int i2 = 0;
        boolean z2 = true;
        int i3 = -1;
        float f4 = 0.0f;
        float f5 = 0.0f;
        while (i2 < this.k.size()) {
            b bVar2 = this.k.get(i2);
            if (!z2) {
                int i4 = i3 + 1;
                if (bVar2.f18290b != i4) {
                    bVar2 = this.l;
                    bVar2.f18293e = f4 + f5 + f3;
                    bVar2.f18290b = i4;
                    bVar2.f18292d = this.f18273c.getPageWidth(bVar2.f18290b);
                    i2--;
                }
            }
            f4 = bVar2.f18293e;
            float f6 = bVar2.f18292d + f4 + f3;
            if (!z2 && f2 < f4) {
                return bVar;
            }
            if (f2 < f6 || i2 == this.k.size() - 1) {
                return bVar2;
            }
            i3 = bVar2.f18290b;
            f5 = bVar2.f18292d;
            i2++;
            bVar = bVar2;
            z2 = false;
        }
        return bVar;
    }

    /* access modifiers changed from: package-private */
    public void setOnAdapterChangeListener(d dVar) {
        this.ah = dVar;
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.af = onPageChangeListener;
    }

    public void setOverScrollListener(e eVar) {
        this.f18276f = eVar;
    }

    private void setScrollingCacheEnabled(boolean z2) {
        if (this.C != z2) {
            this.C = z2;
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!PatchProxy.isSupport(new Object[]{layoutParams}, this, f18271a, false, 14585, new Class[]{ViewGroup.LayoutParams.class}, ViewGroup.LayoutParams.class)) {
            return generateDefaultLayoutParams();
        }
        return (ViewGroup.LayoutParams) PatchProxy.accessDispatch(new Object[]{layoutParams}, this, f18271a, false, 14585, new Class[]{ViewGroup.LayoutParams.class}, ViewGroup.LayoutParams.class);
    }

    public void removeView(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f18271a, false, 14543, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f18271a, false, 14543, new Class[]{View.class}, Void.TYPE);
        } else if (this.B) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setCurrentItemWithDefaultVelocity(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18271a, false, 14518, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18271a, false, 14518, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.D = false;
        a(i2, true, true, 1);
    }

    public LiveVerticalViewPager(Context context) {
        super(context);
        c();
    }

    private float a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f18271a, false, 14531, new Class[]{Float.TYPE}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f18271a, false, 14531, new Class[]{Float.TYPE}, Float.TYPE)).floatValue();
        }
        double d2 = (double) (f2 - 0.5f);
        Double.isNaN(d2);
        return (float) Math.sin((double) ((float) (d2 * 0.4712389167638204d)));
    }

    private b b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18271a, false, 14546, new Class[]{Integer.TYPE}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18271a, false, 14546, new Class[]{Integer.TYPE}, b.class);
        }
        for (int i3 = 0; i3 < this.k.size(); i3++) {
            b bVar = this.k.get(i3);
            if (bVar.f18290b == i2) {
                return bVar;
            }
        }
        return null;
    }

    private void c(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f18271a, false, 14561, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f18271a, false, 14561, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        if (PatchProxy.isSupport(new Object[]{arrayList}, this, f18271a, false, 14581, new Class[]{ArrayList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arrayList}, this, f18271a, false, 14581, new Class[]{ArrayList.class}, Void.TYPE);
            return;
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                b a2 = a(childAt);
                if (a2 != null && a2.f18290b == this.f18274d) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    public boolean canScrollVertically(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18271a, false, 14572, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18271a, false, 14572, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.f18273c == null) {
            return false;
        } else {
            int clientHeight = getClientHeight();
            int scrollY = getScrollY();
            if (i2 < 0) {
                if (scrollY > ((int) (((float) clientHeight) * this.x))) {
                    return true;
                }
                return false;
            } else if (i2 <= 0 || scrollY >= ((int) (((float) clientHeight) * this.y))) {
                return false;
            } else {
                return true;
            }
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParams2 = layoutParams;
        if (PatchProxy.isSupport(new Object[]{layoutParams2}, this, f18271a, false, 14586, new Class[]{ViewGroup.LayoutParams.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{layoutParams2}, this, f18271a, false, 14586, new Class[]{ViewGroup.LayoutParams.class}, Boolean.TYPE)).booleanValue();
        } else if (!(layoutParams2 instanceof c) || !super.checkLayoutParams(layoutParams)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (PatchProxy.isSupport(new Object[]{accessibilityEvent}, this, f18271a, false, 14583, new Class[]{AccessibilityEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{accessibilityEvent}, this, f18271a, false, 14583, new Class[]{AccessibilityEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        } else {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    b a2 = a(childAt);
                    if (a2 != null && a2.f18290b == this.f18274d && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AttributeSet attributeSet2 = attributeSet;
        if (!PatchProxy.isSupport(new Object[]{attributeSet2}, this, f18271a, false, 14587, new Class[]{AttributeSet.class}, ViewGroup.LayoutParams.class)) {
            return new c(getContext(), attributeSet2);
        }
        return (ViewGroup.LayoutParams) PatchProxy.accessDispatch(new Object[]{attributeSet2}, this, f18271a, false, 14587, new Class[]{AttributeSet.class}, ViewGroup.LayoutParams.class);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (PatchProxy.isSupport(new Object[]{parcelable}, this, f18271a, false, 14541, new Class[]{Parcelable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcelable}, this, f18271a, false, 14541, new Class[]{Parcelable.class}, Void.TYPE);
        } else if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
        } else {
            g gVar = (g) parcelable;
            super.onRestoreInstanceState(gVar.getSuperState());
            if (this.f18273c != null) {
                this.f18273c.restoreState(gVar.f18304c, gVar.f18305d);
                a(gVar.f18303b, false, true);
                return;
            }
            this.n = gVar.f18303b;
            this.o = gVar.f18304c;
            this.p = gVar.f18305d;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:6|(3:8|9|10)|11|12|13) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0051 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setChildrenDrawingOrderEnabledCompat(boolean r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r10)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f18271a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 14523(0x38bb, float:2.0351E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r10)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f18271a
            r3 = 0
            r4 = 14523(0x38bb, float:2.0351E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 7
            if (r0 < r1) goto L_0x005f
            java.lang.reflect.Method r0 = r9.aj
            if (r0 != 0) goto L_0x0051
            java.lang.Class<android.view.ViewGroup> r0 = android.view.ViewGroup.class
            java.lang.String r1 = "setChildrenDrawingOrderEnabled"
            java.lang.Class[] r2 = new java.lang.Class[r7]     // Catch:{ NoSuchMethodException -> 0x0051 }
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch:{ NoSuchMethodException -> 0x0051 }
            r2[r8] = r3     // Catch:{ NoSuchMethodException -> 0x0051 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch:{ NoSuchMethodException -> 0x0051 }
            r9.aj = r0     // Catch:{ NoSuchMethodException -> 0x0051 }
        L_0x0051:
            java.lang.reflect.Method r0 = r9.aj     // Catch:{ Exception -> 0x005f }
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x005f }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)     // Catch:{ Exception -> 0x005f }
            r1[r8] = r2     // Catch:{ Exception -> 0x005f }
            r0.invoke(r9, r1)     // Catch:{ Exception -> 0x005f }
            return
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.LiveVerticalViewPager.setChildrenDrawingOrderEnabledCompat(boolean):void");
    }

    public void setCurrentItem(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18271a, false, 14516, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18271a, false, 14516, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.D = false;
        a(i2, !this.ab, false);
    }

    public void setOffscreenPageLimit(int i2) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18271a, false, 14525, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18271a, false, 14525, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 <= 0) {
            i3 = 1;
        } else {
            i3 = i2;
        }
        if (i3 != this.E) {
            this.E = i3;
            b();
        }
    }

    public void setPageMargin(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18271a, false, 14526, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18271a, false, 14526, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        int i3 = this.t;
        this.t = i2;
        int height = getHeight();
        a(height, height, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18271a, false, 14528, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18271a, false, 14528, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        setPageMarginDrawable(com.ss.android.ugc.bytex.a.a.a.a(getContext().getResources(), i2));
    }

    public void setScrollState(int i2) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18271a, false, 14512, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18271a, false, 14512, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.ao != i2) {
            this.ao = i2;
            if (this.ai != null) {
                if (i2 == 0) {
                    z2 = false;
                }
                b(z2);
            }
            if (this.af != null) {
                this.af.onPageScrollStateChanged(i2);
            }
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = drawable;
        if (PatchProxy.isSupport(new Object[]{drawable2}, this, f18271a, false, 14529, new Class[]{Drawable.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{drawable2}, this, f18271a, false, 14529, new Class[]{Drawable.class}, Boolean.TYPE)).booleanValue();
        }
        if (!super.verifyDrawable(drawable)) {
            if (drawable2 == this.u) {
                return true;
            }
            return false;
        }
        return true;
    }

    private b b(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f18271a, false, 14545, new Class[]{View.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{view}, this, f18271a, false, 14545, new Class[]{View.class}, b.class);
        }
        View view2 = view;
        while (true) {
            ViewParent parent = view2.getParent();
            if (parent == this) {
                return a(view2);
            }
            if (parent != null && (parent instanceof View)) {
                view2 = (View) parent;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean d(int r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f18271a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r3 = 0
            r4 = 14576(0x38f0, float:2.0425E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003f
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f18271a
            r3 = 0
            r4 = 14576(0x38f0, float:2.0425E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x003f:
            android.view.View r0 = r9.findFocus()
            if (r0 == r9) goto L_0x0088
            if (r0 == 0) goto L_0x0089
            android.view.ViewParent r1 = r0.getParent()
        L_0x004b:
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x0058
            if (r1 != r9) goto L_0x0053
            r1 = 1
            goto L_0x0059
        L_0x0053:
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x004b
        L_0x0058:
            r1 = 0
        L_0x0059:
            if (r1 != 0) goto L_0x0089
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            android.view.ViewParent r0 = r0.getParent()
        L_0x006f:
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x0088
            java.lang.String r2 = " => "
            r1.append(r2)
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x006f
        L_0x0088:
            r0 = 0
        L_0x0089:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r9, r0, r10)
            r2 = 130(0x82, float:1.82E-43)
            r3 = 33
            if (r1 == 0) goto L_0x00d9
            if (r1 == r0) goto L_0x00d9
            if (r10 != r3) goto L_0x00b9
            android.graphics.Rect r2 = r9.m
            android.graphics.Rect r2 = r9.a((android.graphics.Rect) r2, (android.view.View) r1)
            int r2 = r2.top
            android.graphics.Rect r3 = r9.m
            android.graphics.Rect r3 = r9.a((android.graphics.Rect) r3, (android.view.View) r0)
            int r3 = r3.top
            if (r0 == 0) goto L_0x00b4
            if (r2 < r3) goto L_0x00b4
            boolean r8 = r9.h()
            goto L_0x00ec
        L_0x00b4:
            boolean r8 = r1.requestFocus()
            goto L_0x00ec
        L_0x00b9:
            if (r10 != r2) goto L_0x00ec
            android.graphics.Rect r2 = r9.m
            android.graphics.Rect r2 = r9.a((android.graphics.Rect) r2, (android.view.View) r1)
            int r2 = r2.bottom
            android.graphics.Rect r3 = r9.m
            android.graphics.Rect r3 = r9.a((android.graphics.Rect) r3, (android.view.View) r0)
            int r3 = r3.bottom
            if (r0 == 0) goto L_0x00d4
            if (r2 > r3) goto L_0x00d4
            boolean r8 = r9.i()
            goto L_0x00ec
        L_0x00d4:
            boolean r8 = r1.requestFocus()
            goto L_0x00ec
        L_0x00d9:
            if (r10 == r3) goto L_0x00e8
            if (r10 != r7) goto L_0x00de
            goto L_0x00e8
        L_0x00de:
            if (r10 == r2) goto L_0x00e3
            r0 = 2
            if (r10 != r0) goto L_0x00ec
        L_0x00e3:
            boolean r8 = r9.i()
            goto L_0x00ec
        L_0x00e8:
            boolean r8 = r9.h()
        L_0x00ec:
            if (r8 == 0) goto L_0x00f5
            int r0 = android.view.SoundEffectConstants.getContantForFocusDirection(r10)
            r9.playSoundEffect(r0)
        L_0x00f5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.LiveVerticalViewPager.d(int):boolean");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{keyEvent}, this, f18271a, false, 14574, new Class[]{KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{keyEvent}, this, f18271a, false, 14574, new Class[]{KeyEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (PatchProxy.isSupport(new Object[]{keyEvent}, this, f18271a, false, 14575, new Class[]{KeyEvent.class}, Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{keyEvent}, this, f18271a, false, 14575, new Class[]{KeyEvent.class}, Boolean.TYPE)).booleanValue();
            } else {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode != 61) {
                        switch (keyCode) {
                            case 21:
                                z2 = d(17);
                                break;
                            case 22:
                                z2 = d(66);
                                break;
                        }
                    } else if (Build.VERSION.SDK_INT >= 11) {
                        if (keyEvent.hasNoModifiers()) {
                            z2 = d(2);
                        } else if (keyEvent.hasModifiers(1)) {
                            z2 = d(1);
                        }
                    }
                }
                z2 = false;
            }
            if (z2) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void onDraw(Canvas canvas) {
        float f2;
        float f3;
        float f4;
        float f5;
        Canvas canvas2 = canvas;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{canvas2}, this, f18271a, false, 14566, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2}, this, f18271a, false, 14566, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        if (this.t > 0 && this.u != null && this.k.size() > 0 && this.f18273c != null) {
            int scrollY = getScrollY();
            int height = getHeight();
            float f6 = (float) height;
            float f7 = ((float) this.t) / f6;
            b bVar = this.k.get(0);
            float f8 = bVar.f18293e;
            int size = this.k.size();
            int i3 = bVar.f18290b;
            int i4 = this.k.get(size - 1).f18290b;
            while (i3 < i4) {
                while (i3 > bVar.f18290b && i2 < size) {
                    i2++;
                    bVar = this.k.get(i2);
                }
                if (i3 == bVar.f18290b) {
                    f3 = (bVar.f18293e + bVar.f18292d) * f6;
                    f2 = bVar.f18293e + bVar.f18292d + f7;
                } else {
                    float pageWidth = this.f18273c.getPageWidth(i3);
                    f2 = f8 + pageWidth + f7;
                    f3 = (f8 + pageWidth) * f6;
                }
                if (((float) this.t) + f3 > ((float) scrollY)) {
                    f5 = f7;
                    f4 = f6;
                    this.u.setBounds(this.v, (int) f3, this.w, (int) (((float) this.t) + f3 + 0.5f));
                    this.u.draw(canvas2);
                } else {
                    f5 = f7;
                    f4 = f6;
                }
                if (f3 > ((float) (scrollY + height))) {
                    break;
                }
                i3++;
                f8 = f2;
                f7 = f5;
                f6 = f4;
            }
        }
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        if (PatchProxy.isSupport(new Object[]{pagerAdapter}, this, f18271a, false, 14513, new Class[]{PagerAdapter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pagerAdapter}, this, f18271a, false, 14513, new Class[]{PagerAdapter.class}, Void.TYPE);
            return;
        }
        if (this.f18273c != null) {
            a(this.f18273c, (f) null);
            this.f18273c.startUpdate((ViewGroup) this);
            for (int i2 = 0; i2 < this.k.size(); i2++) {
                b bVar = this.k.get(i2);
                this.f18273c.destroyItem((ViewGroup) this, bVar.f18290b, bVar.f18289a);
            }
            this.f18273c.finishUpdate((ViewGroup) this);
            this.k.clear();
            if (PatchProxy.isSupport(new Object[0], this, f18271a, false, 14514, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f18271a, false, 14514, new Class[0], Void.TYPE);
            } else {
                int i3 = 0;
                while (i3 < getChildCount()) {
                    if (!((c) getChildAt(i3).getLayoutParams()).f18294a) {
                        removeViewAt(i3);
                        i3--;
                    }
                    i3++;
                }
            }
            this.f18274d = 0;
            scrollTo(0, 0);
        }
        this.f18273c = pagerAdapter;
        this.h = 0;
        if (this.f18273c != null) {
            if (this.s == null) {
                this.s = new f(this, (byte) 0);
            }
            a(this.f18273c, this.s);
            this.D = false;
            boolean z2 = this.ab;
            this.ab = true;
            this.h = this.f18273c.getCount();
            if (this.n >= 0) {
                this.f18273c.restoreState(this.o, this.p);
                a(this.n, false, true);
                this.n = -1;
                this.o = null;
                this.p = null;
            } else if (!z2) {
                b();
            } else {
                requestLayout();
            }
        }
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{drawable}, this, f18271a, false, 14527, new Class[]{Drawable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable}, this, f18271a, false, 14527, new Class[]{Drawable.class}, Void.TYPE);
            return;
        }
        this.u = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        if (drawable != null) {
            z2 = false;
        }
        setWillNotDraw(z2);
        invalidate();
    }

    private void b(boolean z2) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f18271a, false, 14557, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f18271a, false, 14557, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            if (z2) {
                i2 = 2;
            } else {
                i2 = 0;
            }
            ViewCompat.setLayerType(getChildAt(i3), i2, null);
        }
    }

    private boolean c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18271a, false, 14553, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18271a, false, 14553, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.k.size() != 0) {
            b f2 = f();
            int clientHeight = getClientHeight();
            int i3 = this.t + clientHeight;
            float f3 = (float) clientHeight;
            float f4 = ((float) this.t) / f3;
            int i4 = f2.f18290b;
            float f5 = ((((float) i2) / f3) - f2.f18293e) / (f2.f18292d + f4);
            this.ad = false;
            a(i4, f5, (int) (((float) i3) * f5));
            if (this.ad) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.ab) {
            return false;
        } else {
            this.ad = false;
            a(0, 0.0f, 0);
            if (this.ad) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00fc A[Catch:{ Throwable -> 0x010d }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0100 A[Catch:{ Throwable -> 0x010d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r11) {
        /*
            r10 = this;
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r9 = 0
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f18271a
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<android.graphics.Canvas> r2 = android.graphics.Canvas.class
            r6[r9] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 14565(0x38e5, float:2.041E-41)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0030
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f18271a
            r4 = 0
            r5 = 14565(0x38e5, float:2.041E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<android.graphics.Canvas> r0 = android.graphics.Canvas.class
            r6[r9] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0030:
            super.draw(r11)     // Catch:{ Throwable -> 0x010d }
            int r1 = android.support.v4.view.ViewCompat.getOverScrollMode(r10)     // Catch:{ Throwable -> 0x010d }
            if (r1 == 0) goto L_0x0055
            if (r1 != r8) goto L_0x0048
            android.support.v4.view.PagerAdapter r1 = r10.f18273c     // Catch:{ Throwable -> 0x010d }
            if (r1 == 0) goto L_0x0048
            android.support.v4.view.PagerAdapter r1 = r10.f18273c     // Catch:{ Throwable -> 0x010d }
            int r1 = r1.getCount()     // Catch:{ Throwable -> 0x010d }
            if (r1 <= r8) goto L_0x0048
            goto L_0x0055
        L_0x0048:
            android.support.v4.widget.EdgeEffectCompat r0 = r10.U     // Catch:{ Throwable -> 0x010d }
            r0.finish()     // Catch:{ Throwable -> 0x010d }
            android.support.v4.widget.EdgeEffectCompat r0 = r10.V     // Catch:{ Throwable -> 0x010d }
            r0.finish()     // Catch:{ Throwable -> 0x010d }
            r2 = 0
            goto L_0x00fa
        L_0x0055:
            android.support.v4.widget.EdgeEffectCompat r1 = r10.U     // Catch:{ Throwable -> 0x010d }
            boolean r1 = r1.isFinished()     // Catch:{ Throwable -> 0x010d }
            if (r1 != 0) goto L_0x00a2
            int r1 = r11.save()     // Catch:{ Throwable -> 0x010d }
            int r2 = r10.getHeight()     // Catch:{ Throwable -> 0x010d }
            int r3 = r10.getWidth()     // Catch:{ Throwable -> 0x010d }
            int r4 = r10.getPaddingLeft()     // Catch:{ Throwable -> 0x010d }
            int r3 = r3 - r4
            int r4 = r10.getPaddingRight()     // Catch:{ Throwable -> 0x010d }
            int r3 = r3 - r4
            int r4 = r10.getPaddingLeft()     // Catch:{ Throwable -> 0x010d }
            float r4 = (float) r4     // Catch:{ Throwable -> 0x010d }
            float r5 = r10.x     // Catch:{ Throwable -> 0x010d }
            float r6 = (float) r2     // Catch:{ Throwable -> 0x010d }
            float r5 = r5 * r6
            r11.translate(r4, r5)     // Catch:{ Throwable -> 0x010d }
            android.support.v4.widget.EdgeEffectCompat r4 = r10.U     // Catch:{ Throwable -> 0x010d }
            r4.setSize(r3, r2)     // Catch:{ Throwable -> 0x010d }
            android.support.v4.widget.EdgeEffectCompat r2 = r10.U     // Catch:{ Throwable -> 0x010d }
            boolean r2 = r2.draw(r11)     // Catch:{ Throwable -> 0x010d }
            r2 = r2 | r9
            r11.restoreToCount(r1)     // Catch:{ Throwable -> 0x010d }
            boolean r1 = r10.W     // Catch:{ Throwable -> 0x010d }
            if (r1 != 0) goto L_0x00a3
            r10.W = r8     // Catch:{ Throwable -> 0x010d }
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$e r1 = r10.f18276f     // Catch:{ Throwable -> 0x010d }
            if (r1 == 0) goto L_0x00a3
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$5 r1 = new com.bytedance.android.livesdk.widget.LiveVerticalViewPager$5     // Catch:{ Throwable -> 0x010d }
            r1.<init>()     // Catch:{ Throwable -> 0x010d }
            r10.post(r1)     // Catch:{ Throwable -> 0x010d }
            goto L_0x00a3
        L_0x00a2:
            r2 = 0
        L_0x00a3:
            android.support.v4.widget.EdgeEffectCompat r1 = r10.V     // Catch:{ Throwable -> 0x010d }
            boolean r1 = r1.isFinished()     // Catch:{ Throwable -> 0x010d }
            if (r1 != 0) goto L_0x00fa
            int r1 = r11.save()     // Catch:{ Throwable -> 0x010d }
            int r3 = r10.getHeight()     // Catch:{ Throwable -> 0x010d }
            int r4 = r10.getWidth()     // Catch:{ Throwable -> 0x010d }
            int r5 = r10.getPaddingLeft()     // Catch:{ Throwable -> 0x010d }
            int r4 = r4 - r5
            int r5 = r10.getPaddingRight()     // Catch:{ Throwable -> 0x010d }
            int r4 = r4 - r5
            r5 = 1127481344(0x43340000, float:180.0)
            r11.rotate(r5)     // Catch:{ Throwable -> 0x010d }
            int r5 = -r4
            int r6 = r10.getPaddingLeft()     // Catch:{ Throwable -> 0x010d }
            int r5 = r5 - r6
            float r5 = (float) r5     // Catch:{ Throwable -> 0x010d }
            float r6 = r10.y     // Catch:{ Throwable -> 0x010d }
            r7 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 + r7
            float r6 = -r6
            float r7 = (float) r3     // Catch:{ Throwable -> 0x010d }
            float r6 = r6 * r7
            r11.translate(r5, r6)     // Catch:{ Throwable -> 0x010d }
            android.support.v4.widget.EdgeEffectCompat r5 = r10.V     // Catch:{ Throwable -> 0x010d }
            r5.setSize(r4, r3)     // Catch:{ Throwable -> 0x010d }
            android.support.v4.widget.EdgeEffectCompat r3 = r10.V     // Catch:{ Throwable -> 0x010d }
            boolean r3 = r3.draw(r11)     // Catch:{ Throwable -> 0x010d }
            r2 = r2 | r3
            r11.restoreToCount(r1)     // Catch:{ Throwable -> 0x010d }
            boolean r0 = r10.aa     // Catch:{ Throwable -> 0x010d }
            if (r0 != 0) goto L_0x00fa
            r10.aa = r8     // Catch:{ Throwable -> 0x010d }
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$e r0 = r10.f18276f     // Catch:{ Throwable -> 0x010d }
            if (r0 == 0) goto L_0x00fa
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$6 r0 = new com.bytedance.android.livesdk.widget.LiveVerticalViewPager$6     // Catch:{ Throwable -> 0x010d }
            r0.<init>()     // Catch:{ Throwable -> 0x010d }
            r10.post(r0)     // Catch:{ Throwable -> 0x010d }
        L_0x00fa:
            if (r2 == 0) goto L_0x0100
            android.support.v4.view.ViewCompat.postInvalidateOnAnimation(r10)     // Catch:{ Throwable -> 0x010d }
            goto L_0x0113
        L_0x0100:
            boolean r0 = r10.W     // Catch:{ Throwable -> 0x010d }
            if (r0 == 0) goto L_0x0106
            r10.W = r9     // Catch:{ Throwable -> 0x010d }
        L_0x0106:
            boolean r0 = r10.aa     // Catch:{ Throwable -> 0x010d }
            if (r0 == 0) goto L_0x010c
            r10.aa = r9     // Catch:{ Throwable -> 0x010d }
        L_0x010c:
            return
        L_0x010d:
            r0 = move-exception
            java.lang.String r1 = "LiveVerticalViewPager"
            com.bytedance.android.live.core.c.a.a((java.lang.String) r1, (java.lang.Throwable) r0)
        L_0x0113:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.LiveVerticalViewPager.draw(android.graphics.Canvas):void");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f2;
        boolean z2;
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f18271a, false, 14558, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f18271a, false, 14558, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!isEnabled()) {
            return false;
        } else {
            try {
                if (this.f18275e) {
                    return false;
                }
                int action = motionEvent.getAction() & 255;
                if (action != 3) {
                    if (action != 1) {
                        if (action != 0) {
                            if (this.F) {
                                return true;
                            }
                            if (this.G) {
                                return false;
                            }
                        }
                        if (action == 0) {
                            this.K = motionEvent.getX();
                            this.M = motionEvent.getX();
                            this.L = motionEvent.getY();
                            this.N = motionEvent.getY();
                            this.O = MotionEventCompat.getPointerId(motionEvent2, 0);
                            this.G = false;
                            this.r = true;
                            this.q.computeScrollOffset();
                            if (this.ao != 2 || Math.abs(this.q.getFinalY() - this.q.getCurrY()) <= this.T) {
                                a(false);
                                this.F = false;
                            } else {
                                this.q.abortAnimation();
                                this.D = false;
                                b();
                                this.F = true;
                                c(true);
                                setScrollState(1);
                            }
                        } else if (action == 2) {
                            int i2 = this.O;
                            if (i2 != -1) {
                                int findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent2, i2);
                                float y2 = MotionEventCompat.getY(motionEvent2, findPointerIndex);
                                float f3 = y2 - this.L;
                                float abs = Math.abs(f3);
                                float x2 = MotionEventCompat.getX(motionEvent2, findPointerIndex);
                                float abs2 = Math.abs(x2 - this.M);
                                if (f3 != 0.0f) {
                                    float f4 = this.L;
                                    float f5 = f4;
                                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(f4), Float.valueOf(f3)}, this, f18271a, false, 14556, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                                        z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f5), Float.valueOf(f3)}, this, f18271a, false, 14556, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
                                    } else if ((f5 >= ((float) this.I) || f3 <= 0.0f) && (f5 <= ((float) (getHeight() - this.I)) || f3 >= 0.0f)) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    if (!z2) {
                                        if (a(this, false, (int) f3, (int) x2, (int) y2)) {
                                            this.K = x2;
                                            this.L = y2;
                                            this.G = true;
                                            return false;
                                        }
                                    }
                                }
                                if (abs > ((float) this.J) && abs * 0.5f > abs2) {
                                    this.F = true;
                                    c(true);
                                    setScrollState(1);
                                    if (f3 > 0.0f) {
                                        f2 = this.N + ((float) this.J);
                                    } else {
                                        f2 = this.N - ((float) this.J);
                                    }
                                    this.L = f2;
                                    this.K = x2;
                                    setScrollingCacheEnabled(true);
                                } else if (abs2 > ((float) this.J)) {
                                    this.G = true;
                                }
                                if (this.F && b(y2)) {
                                    ViewCompat.postInvalidateOnAnimation(this);
                                }
                            }
                        } else if (action == 6) {
                            a(motionEvent);
                        }
                        if (this.P == null) {
                            this.P = VelocityTracker.obtain();
                        }
                        this.P.addMovement(motionEvent2);
                        return this.F;
                    }
                }
                e();
                return false;
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    private b a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f18271a, false, 14544, new Class[]{View.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{view}, this, f18271a, false, 14544, new Class[]{View.class}, b.class);
        }
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            b bVar = this.k.get(i2);
            if (this.f18273c.isViewFromObject(view, bVar.f18289a)) {
                return bVar;
            }
        }
        return null;
    }

    private boolean b(float f2) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = false;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f18271a, false, 14562, new Class[]{Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f18271a, false, 14562, new Class[]{Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        this.L = f2;
        float scrollY = ((float) getScrollY()) + (this.L - f2);
        float clientHeight = (float) getClientHeight();
        float f3 = this.x * clientHeight;
        float f4 = this.y * clientHeight;
        b bVar = this.k.get(0);
        b bVar2 = this.k.get(this.k.size() - 1);
        if (bVar.f18290b != 0) {
            f3 = bVar.f18293e * clientHeight;
            z2 = false;
        } else {
            z2 = true;
        }
        if (bVar2.f18290b != this.f18273c.getCount() - 1) {
            f4 = bVar2.f18293e * clientHeight;
            z3 = false;
        }
        if (scrollY < f3) {
            if (z2) {
                z4 = this.U.onPull(Math.abs(f3 - scrollY) / clientHeight);
            }
            scrollY = f3;
        } else if (scrollY > f4) {
            if (z3) {
                z4 = this.V.onPull(Math.abs(scrollY - f4) / clientHeight);
            }
            scrollY = f4;
        }
        int i2 = (int) scrollY;
        this.K += scrollY - ((float) i2);
        scrollTo(getScrollX(), i2);
        c(i2);
        return z4;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i2;
        float f2;
        float f3;
        MotionEvent motionEvent2 = motionEvent;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f18271a, false, 14559, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f18271a, false, 14559, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!isEnabled()) {
            return false;
        } else {
            try {
                if (this.f18275e) {
                    return true;
                }
                if ((motionEvent.getAction() != 0 || motionEvent.getEdgeFlags() == 0) && this.f18273c != null) {
                    if (this.f18273c.getCount() != 0) {
                        if (this.P == null) {
                            this.P = VelocityTracker.obtain();
                        }
                        this.P.addMovement(motionEvent2);
                        switch (motionEvent.getAction() & 255) {
                            case 0:
                                this.q.abortAnimation();
                                this.D = false;
                                b();
                                this.M = motionEvent.getX();
                                this.K = motionEvent.getX();
                                this.L = motionEvent.getY();
                                this.N = motionEvent.getY();
                                this.O = MotionEventCompat.getPointerId(motionEvent2, 0);
                                break;
                            case 1:
                                if (this.F) {
                                    VelocityTracker velocityTracker = this.P;
                                    velocityTracker.computeCurrentVelocity(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, (float) this.R);
                                    int yVelocity = (int) VelocityTrackerCompat.getYVelocity(velocityTracker, this.O);
                                    this.D = true;
                                    int clientHeight = getClientHeight();
                                    int scrollY = getScrollY();
                                    b f4 = f();
                                    float f5 = (float) clientHeight;
                                    float f6 = ((float) this.t) / f5;
                                    int i3 = f4.f18290b;
                                    float f7 = ((((float) scrollY) / f5) - f4.f18293e) / (f4.f18292d + f6);
                                    int y2 = (int) (MotionEventCompat.getY(motionEvent2, MotionEventCompat.findPointerIndex(motionEvent2, this.O)) - this.N);
                                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i3), Float.valueOf(f7), Integer.valueOf(yVelocity), Integer.valueOf(y2)}, this, f18271a, false, 14564, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
                                        i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3), Float.valueOf(f7), Integer.valueOf(yVelocity), Integer.valueOf(y2)}, this, f18271a, false, 14564, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
                                    } else {
                                        if (Math.abs(y2) <= this.S || Math.abs(yVelocity) <= this.Q) {
                                            if (i3 >= this.f18274d) {
                                                f2 = 0.6f;
                                            } else {
                                                f2 = 0.4f;
                                            }
                                            i3 = (int) (((float) i3) + f7 + f2);
                                        } else if (yVelocity <= 0) {
                                            i3++;
                                        }
                                        if (this.k.size() > 0) {
                                            i2 = Math.max(this.k.get(0).f18290b, Math.min(i3, this.k.get(this.k.size() - 1).f18290b));
                                        } else {
                                            i2 = i3;
                                        }
                                    }
                                    a(i2, true, true, yVelocity);
                                    z2 = e();
                                    break;
                                }
                                break;
                            case 2:
                                if (!this.F) {
                                    int findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent2, this.O);
                                    if (findPointerIndex == -1) {
                                        z2 = e();
                                        break;
                                    } else {
                                        float y3 = MotionEventCompat.getY(motionEvent2, findPointerIndex);
                                        float abs = Math.abs(y3 - this.L);
                                        float x2 = MotionEventCompat.getX(motionEvent2, findPointerIndex);
                                        float abs2 = Math.abs(x2 - this.K);
                                        if (abs > ((float) this.J) && abs > abs2) {
                                            this.F = true;
                                            c(true);
                                            if (y3 - this.N > 0.0f) {
                                                f3 = this.N + ((float) this.J);
                                            } else {
                                                f3 = this.N - ((float) this.J);
                                            }
                                            this.L = f3;
                                            this.K = x2;
                                            setScrollState(1);
                                            setScrollingCacheEnabled(true);
                                            ViewParent parent = getParent();
                                            if (parent != null) {
                                                parent.requestDisallowInterceptTouchEvent(true);
                                            }
                                        }
                                    }
                                }
                                if (this.F) {
                                    z2 = false | b(MotionEventCompat.getY(motionEvent2, MotionEventCompat.findPointerIndex(motionEvent2, this.O)));
                                    break;
                                }
                                break;
                            case 3:
                                if (this.F) {
                                    a(this.f18274d, true, 0, false);
                                    z2 = e();
                                    break;
                                }
                                break;
                            case 5:
                                int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                                this.L = MotionEventCompat.getY(motionEvent2, actionIndex);
                                this.O = MotionEventCompat.getPointerId(motionEvent2, actionIndex);
                                break;
                            case 6:
                                a(motionEvent);
                                this.L = MotionEventCompat.getY(motionEvent2, MotionEventCompat.findPointerIndex(motionEvent2, this.O));
                                break;
                        }
                        if (z2) {
                            ViewCompat.postInvalidateOnAnimation(this);
                        }
                        return true;
                    }
                }
                return false;
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a9, code lost:
        if (r8.f18290b == r7.f18274d) goto L_0x00b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(int r18) {
        /*
            r17 = this;
            r7 = r17
            r8 = r18
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r10 = 0
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f18271a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 14537(0x38c9, float:2.037E-41)
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003e
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f18271a
            r3 = 0
            r4 = 14537(0x38c9, float:2.037E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003e:
            r0 = 2
            int r1 = r7.f18274d
            if (r1 == r8) goto L_0x0055
            int r0 = r7.f18274d
            if (r0 >= r8) goto L_0x004a
            r0 = 130(0x82, float:1.82E-43)
            goto L_0x004c
        L_0x004a:
            r0 = 33
        L_0x004c:
            int r1 = r7.f18274d
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r1 = r7.b((int) r1)
            r7.f18274d = r8
            goto L_0x0056
        L_0x0055:
            r1 = 0
        L_0x0056:
            android.support.v4.view.PagerAdapter r3 = r7.f18273c
            if (r3 != 0) goto L_0x005e
            r17.d()
            return
        L_0x005e:
            boolean r3 = r7.D
            if (r3 == 0) goto L_0x0066
            r17.d()
            return
        L_0x0066:
            android.os.IBinder r3 = r17.getWindowToken()
            if (r3 != 0) goto L_0x006d
            return
        L_0x006d:
            android.support.v4.view.PagerAdapter r3 = r7.f18273c
            r3.startUpdate((android.view.ViewGroup) r7)
            int r3 = r7.E
            int r4 = r7.f18274d
            int r4 = r4 - r3
            int r4 = java.lang.Math.max(r10, r4)
            android.support.v4.view.PagerAdapter r5 = r7.f18273c
            int r5 = r5.getCount()
            int r6 = r5 + -1
            int r8 = r7.f18274d
            int r8 = r8 + r3
            int r3 = java.lang.Math.min(r6, r8)
            int r6 = r7.h
            if (r5 != r6) goto L_0x025d
            r6 = 0
        L_0x008f:
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r8 = r7.k
            int r8 = r8.size()
            if (r6 >= r8) goto L_0x00af
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r8 = r7.k
            java.lang.Object r8 = r8.get(r6)
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r8 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.b) r8
            int r11 = r8.f18290b
            int r12 = r7.f18274d
            if (r11 < r12) goto L_0x00ac
            int r11 = r8.f18290b
            int r12 = r7.f18274d
            if (r11 != r12) goto L_0x00af
            goto L_0x00b0
        L_0x00ac:
            int r6 = r6 + 1
            goto L_0x008f
        L_0x00af:
            r8 = 0
        L_0x00b0:
            if (r8 != 0) goto L_0x00ba
            if (r5 <= 0) goto L_0x00ba
            int r8 = r7.f18274d
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r8 = r7.a((int) r8, (int) r6)
        L_0x00ba:
            if (r8 == 0) goto L_0x01dc
            int r12 = r6 + -1
            if (r12 < 0) goto L_0x00c9
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r13 = r7.k
            java.lang.Object r13 = r13.get(r12)
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r13 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.b) r13
            goto L_0x00ca
        L_0x00c9:
            r13 = 0
        L_0x00ca:
            int r14 = r17.getClientHeight()
            r15 = 1073741824(0x40000000, float:2.0)
            if (r14 > 0) goto L_0x00d4
            r11 = 0
            goto L_0x00e1
        L_0x00d4:
            float r2 = r8.f18292d
            float r2 = r15 - r2
            int r10 = r17.getPaddingLeft()
            float r10 = (float) r10
            float r11 = (float) r14
            float r10 = r10 / r11
            float r11 = r2 + r10
        L_0x00e1:
            int r2 = r7.f18274d
            int r2 = r2 - r9
            r10 = r6
            r6 = 0
        L_0x00e6:
            if (r2 < 0) goto L_0x0145
            int r16 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r16 < 0) goto L_0x0113
            if (r2 >= r4) goto L_0x0113
            if (r13 == 0) goto L_0x0145
            int r9 = r13.f18290b
            if (r2 != r9) goto L_0x0141
            boolean r9 = r13.f18291c
            if (r9 != 0) goto L_0x0141
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r9 = r7.k
            r9.remove(r12)
            android.support.v4.view.PagerAdapter r9 = r7.f18273c
            java.lang.Object r13 = r13.f18289a
            r9.destroyItem((android.view.ViewGroup) r7, (int) r2, (java.lang.Object) r13)
            int r12 = r12 + -1
            int r10 = r10 + -1
            if (r12 < 0) goto L_0x013f
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r9 = r7.k
            java.lang.Object r9 = r9.get(r12)
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r9 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.b) r9
            goto L_0x0140
        L_0x0113:
            if (r13 == 0) goto L_0x0129
            int r9 = r13.f18290b
            if (r2 != r9) goto L_0x0129
            float r9 = r13.f18292d
            float r6 = r6 + r9
            int r12 = r12 + -1
            if (r12 < 0) goto L_0x013f
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r9 = r7.k
            java.lang.Object r9 = r9.get(r12)
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r9 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.b) r9
            goto L_0x0140
        L_0x0129:
            int r9 = r12 + 1
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r9 = r7.a((int) r2, (int) r9)
            float r9 = r9.f18292d
            float r6 = r6 + r9
            int r10 = r10 + 1
            if (r12 < 0) goto L_0x013f
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r9 = r7.k
            java.lang.Object r9 = r9.get(r12)
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r9 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.b) r9
            goto L_0x0140
        L_0x013f:
            r9 = 0
        L_0x0140:
            r13 = r9
        L_0x0141:
            int r2 = r2 + -1
            r9 = 1
            goto L_0x00e6
        L_0x0145:
            float r2 = r8.f18292d
            int r4 = r10 + 1
            int r6 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r6 >= 0) goto L_0x01d9
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r6 = r7.k
            int r6 = r6.size()
            if (r4 >= r6) goto L_0x015e
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r6 = r7.k
            java.lang.Object r6 = r6.get(r4)
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r6 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.b) r6
            goto L_0x015f
        L_0x015e:
            r6 = 0
        L_0x015f:
            if (r14 > 0) goto L_0x0163
            r11 = 0
            goto L_0x016c
        L_0x0163:
            int r9 = r17.getPaddingRight()
            float r9 = (float) r9
            float r11 = (float) r14
            float r9 = r9 / r11
            float r11 = r9 + r15
        L_0x016c:
            int r9 = r7.f18274d
            r12 = 1
            int r9 = r9 + r12
        L_0x0170:
            if (r9 >= r5) goto L_0x01d9
            int r12 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r12 < 0) goto L_0x01a1
            if (r9 <= r3) goto L_0x01a1
            if (r6 == 0) goto L_0x01d9
            int r12 = r6.f18290b
            if (r9 != r12) goto L_0x01d6
            boolean r12 = r6.f18291c
            if (r12 != 0) goto L_0x01d6
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r12 = r7.k
            r12.remove(r4)
            android.support.v4.view.PagerAdapter r12 = r7.f18273c
            java.lang.Object r6 = r6.f18289a
            r12.destroyItem((android.view.ViewGroup) r7, (int) r9, (java.lang.Object) r6)
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r6 = r7.k
            int r6 = r6.size()
            if (r4 >= r6) goto L_0x019f
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r6 = r7.k
            java.lang.Object r6 = r6.get(r4)
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r6 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.b) r6
            goto L_0x01d6
        L_0x019f:
            r6 = 0
            goto L_0x01d6
        L_0x01a1:
            if (r6 == 0) goto L_0x01bd
            int r12 = r6.f18290b
            if (r9 != r12) goto L_0x01bd
            float r6 = r6.f18292d
            float r2 = r2 + r6
            int r4 = r4 + 1
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r6 = r7.k
            int r6 = r6.size()
            if (r4 >= r6) goto L_0x019f
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r6 = r7.k
            java.lang.Object r6 = r6.get(r4)
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r6 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.b) r6
            goto L_0x01d6
        L_0x01bd:
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r6 = r7.a((int) r9, (int) r4)
            int r4 = r4 + 1
            float r6 = r6.f18292d
            float r2 = r2 + r6
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r6 = r7.k
            int r6 = r6.size()
            if (r4 >= r6) goto L_0x019f
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r6 = r7.k
            java.lang.Object r6 = r6.get(r4)
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r6 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.b) r6
        L_0x01d6:
            int r9 = r9 + 1
            goto L_0x0170
        L_0x01d9:
            r7.a((com.bytedance.android.livesdk.widget.LiveVerticalViewPager.b) r8, (int) r10, (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.b) r1)
        L_0x01dc:
            android.support.v4.view.PagerAdapter r1 = r7.f18273c
            int r2 = r7.f18274d
            if (r8 == 0) goto L_0x01e5
            java.lang.Object r3 = r8.f18289a
            goto L_0x01e6
        L_0x01e5:
            r3 = 0
        L_0x01e6:
            r1.setPrimaryItem((android.view.ViewGroup) r7, (int) r2, (java.lang.Object) r3)
            android.support.v4.view.PagerAdapter r1 = r7.f18273c
            r1.finishUpdate((android.view.ViewGroup) r7)
            int r1 = r17.getChildCount()
            r2 = 0
        L_0x01f3:
            if (r2 >= r1) goto L_0x021f
            android.view.View r3 = r7.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$c r4 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.c) r4
            r4.f18299f = r2
            boolean r5 = r4.f18294a
            if (r5 != 0) goto L_0x021b
            float r5 = r4.f18296c
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x021c
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r3 = r7.a((android.view.View) r3)
            if (r3 == 0) goto L_0x021c
            float r5 = r3.f18292d
            r4.f18296c = r5
            int r3 = r3.f18290b
            r4.f18298e = r3
            goto L_0x021c
        L_0x021b:
            r6 = 0
        L_0x021c:
            int r2 = r2 + 1
            goto L_0x01f3
        L_0x021f:
            r17.d()
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x025c
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x0233
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r2 = r7.b((android.view.View) r1)
            goto L_0x0234
        L_0x0233:
            r2 = 0
        L_0x0234:
            if (r2 == 0) goto L_0x023c
            int r1 = r2.f18290b
            int r2 = r7.f18274d
            if (r1 == r2) goto L_0x025c
        L_0x023c:
            r1 = 0
        L_0x023d:
            int r2 = r17.getChildCount()
            if (r1 >= r2) goto L_0x025c
            android.view.View r2 = r7.getChildAt(r1)
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r3 = r7.a((android.view.View) r2)
            if (r3 == 0) goto L_0x0259
            int r3 = r3.f18290b
            int r4 = r7.f18274d
            if (r3 != r4) goto L_0x0259
            boolean r2 = r2.requestFocus(r0)
            if (r2 != 0) goto L_0x025c
        L_0x0259:
            int r1 = r1 + 1
            goto L_0x023d
        L_0x025c:
            return
        L_0x025d:
            android.content.res.Resources r0 = r17.getResources()     // Catch:{ NotFoundException -> 0x026a }
            int r1 = r17.getId()     // Catch:{ NotFoundException -> 0x026a }
            java.lang.String r0 = r0.getResourceName(r1)     // Catch:{ NotFoundException -> 0x026a }
            goto L_0x0272
        L_0x026a:
            int r0 = r17.getId()
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
        L_0x0272:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r2.<init>(r3)
            int r3 = r7.h
            r2.append(r3)
            java.lang.String r3 = ", found: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = " Pager id: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " Pager class: "
            r2.append(r0)
            java.lang.Class r0 = r17.getClass()
            r2.append(r0)
            java.lang.String r0 = " Problematic adapter: "
            r2.append(r0)
            android.support.v4.view.PagerAdapter r0 = r7.f18273c
            java.lang.Class r0 = r0.getClass()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.LiveVerticalViewPager.a(int):void");
    }

    public int getChildDrawingOrder(int i2, int i3) {
        int i4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f18271a, false, 14524, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f18271a, false, 14524, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        if (this.ak == 2) {
            i4 = (i2 - 1) - i3;
        } else {
            i4 = i3;
        }
        return ((c) this.al.get(i4).getLayoutParams()).f18299f;
    }

    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), rect}, this, f18271a, false, 14582, new Class[]{Integer.TYPE, Rect.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), rect}, this, f18271a, false, 14582, new Class[]{Integer.TYPE, Rect.class}, Boolean.TYPE)).booleanValue();
        }
        int childCount = getChildCount();
        int i5 = -1;
        if ((i2 & 2) != 0) {
            i5 = childCount;
            i4 = 0;
            i3 = 1;
        } else {
            i4 = childCount - 1;
            i3 = -1;
        }
        while (i4 != i5) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0) {
                b a2 = a(childAt);
                if (a2 != null && a2.f18290b == this.f18274d && childAt.requestFocus(i2, rect)) {
                    return true;
                }
            }
            i4 += i3;
        }
        return false;
    }

    public LiveVerticalViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    private Rect a(Rect rect, View view) {
        Rect rect2;
        if (PatchProxy.isSupport(new Object[]{rect, view}, this, f18271a, false, 14577, new Class[]{Rect.class, View.class}, Rect.class)) {
            return (Rect) PatchProxy.accessDispatch(new Object[]{rect, view}, this, f18271a, false, 14577, new Class[]{Rect.class, View.class}, Rect.class);
        }
        if (rect == null) {
            rect2 = new Rect();
        } else {
            rect2 = rect;
        }
        if (view == null) {
            rect2.set(0, 0, 0, 0);
            return rect2;
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        rect2.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while (true) {
            if (parent instanceof ViewGroup) {
                if (parent == this) {
                    break;
                }
                ViewGroup viewGroup = (ViewGroup) parent;
                rect2.left += viewGroup.getLeft();
                rect2.right += viewGroup.getRight();
                rect2.top += viewGroup.getTop();
                rect2.bottom += viewGroup.getBottom();
                parent = viewGroup.getParent();
            } else {
                break;
            }
        }
        return rect2;
    }

    private b a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f18271a, false, 14534, new Class[]{Integer.TYPE, Integer.TYPE}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f18271a, false, 14534, new Class[]{Integer.TYPE, Integer.TYPE}, b.class);
        }
        b bVar = new b();
        bVar.f18290b = i2;
        bVar.f18289a = this.f18273c.instantiateItem((ViewGroup) this, i2);
        bVar.f18292d = this.f18273c.getPageWidth(i2);
        if (i3 < 0 || i3 >= this.k.size()) {
            this.k.add(bVar);
        } else {
            this.k.add(i3, bVar);
        }
        return bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r17, int r18) {
        /*
            r16 = this;
            r7 = r16
            r8 = 2
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r9 = 0
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r10 = 1
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f18271a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 14548(0x38d4, float:2.0386E-41)
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0051
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f18271a
            r3 = 0
            r4 = 14548(0x38d4, float:2.0386E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0051:
            r0 = r17
            int r0 = getDefaultSize(r9, r0)
            r1 = r18
            int r1 = getDefaultSize(r9, r1)
            r7.setMeasuredDimension(r0, r1)
            int r0 = r16.getMeasuredHeight()
            int r1 = r0 / 10
            int r2 = r7.H
            int r1 = java.lang.Math.min(r1, r2)
            r7.I = r1
            int r1 = r16.getMeasuredWidth()
            int r2 = r16.getPaddingLeft()
            int r1 = r1 - r2
            int r2 = r16.getPaddingRight()
            int r1 = r1 - r2
            int r2 = r16.getPaddingTop()
            int r0 = r0 - r2
            int r2 = r16.getPaddingBottom()
            int r0 = r0 - r2
            int r2 = r16.getChildCount()
            r3 = r0
            r0 = 0
        L_0x008c:
            r4 = 8
            r5 = 1073741824(0x40000000, float:2.0)
            if (r0 >= r2) goto L_0x0115
            android.view.View r6 = r7.getChildAt(r0)
            int r8 = r6.getVisibility()
            if (r8 == r4) goto L_0x010f
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$c r4 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.c) r4
            if (r4 == 0) goto L_0x010f
            boolean r8 = r4.f18294a
            if (r8 == 0) goto L_0x010f
            int r8 = r4.f18295b
            r8 = r8 & 7
            int r11 = r4.f18295b
            r11 = r11 & 112(0x70, float:1.57E-43)
            r12 = 48
            if (r11 == r12) goto L_0x00bb
            r12 = 80
            if (r11 != r12) goto L_0x00b9
            goto L_0x00bb
        L_0x00b9:
            r11 = 0
            goto L_0x00bc
        L_0x00bb:
            r11 = 1
        L_0x00bc:
            r12 = 3
            if (r8 == r12) goto L_0x00c5
            r12 = 5
            if (r8 != r12) goto L_0x00c3
            goto L_0x00c5
        L_0x00c3:
            r8 = 0
            goto L_0x00c6
        L_0x00c5:
            r8 = 1
        L_0x00c6:
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 == 0) goto L_0x00cf
            r12 = 1073741824(0x40000000, float:2.0)
        L_0x00cc:
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x00d3
        L_0x00cf:
            if (r8 == 0) goto L_0x00cc
            r13 = 1073741824(0x40000000, float:2.0)
        L_0x00d3:
            int r14 = r4.width
            r15 = -1
            r9 = -2
            if (r14 == r9) goto L_0x00e5
            int r12 = r4.width
            if (r12 == r15) goto L_0x00e1
            int r12 = r4.width
            r14 = r12
            goto L_0x00e2
        L_0x00e1:
            r14 = r1
        L_0x00e2:
            r12 = 1073741824(0x40000000, float:2.0)
            goto L_0x00e6
        L_0x00e5:
            r14 = r1
        L_0x00e6:
            int r10 = r4.height
            if (r10 == r9) goto L_0x00f3
            int r9 = r4.height
            if (r9 == r15) goto L_0x00f1
            int r4 = r4.height
            goto L_0x00f5
        L_0x00f1:
            r4 = r3
            goto L_0x00f5
        L_0x00f3:
            r4 = r3
            r5 = r13
        L_0x00f5:
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r12)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r5)
            r6.measure(r9, r4)
            if (r11 == 0) goto L_0x0108
            int r4 = r6.getMeasuredHeight()
            int r3 = r3 - r4
            goto L_0x010f
        L_0x0108:
            if (r8 == 0) goto L_0x010f
            int r4 = r6.getMeasuredWidth()
            int r1 = r1 - r4
        L_0x010f:
            int r0 = r0 + 1
            r9 = 0
            r10 = 1
            goto L_0x008c
        L_0x0115:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r5)
            r7.z = r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r5)
            r7.A = r0
            r0 = 1
            r7.B = r0
            r16.b()
            r0 = 0
            r7.B = r0
            int r1 = r16.getChildCount()
        L_0x012e:
            if (r0 >= r1) goto L_0x0158
            android.view.View r2 = r7.getChildAt(r0)
            int r6 = r2.getVisibility()
            if (r6 == r4) goto L_0x0155
            android.view.ViewGroup$LayoutParams r6 = r2.getLayoutParams()
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$c r6 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.c) r6
            if (r6 == 0) goto L_0x0146
            boolean r8 = r6.f18294a
            if (r8 != 0) goto L_0x0155
        L_0x0146:
            float r8 = (float) r3
            float r6 = r6.f18296c
            float r8 = r8 * r6
            int r6 = (int) r8
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r5)
            int r8 = r7.z
            r2.measure(r8, r6)
        L_0x0155:
            int r0 = r0 + 1
            goto L_0x012e
        L_0x0158:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.LiveVerticalViewPager.onMeasure(int, int):void");
    }

    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        ArrayList<View> arrayList2 = arrayList;
        int i4 = i3;
        if (PatchProxy.isSupport(new Object[]{arrayList2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f18271a, false, 14580, new Class[]{ArrayList.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arrayList2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f18271a, false, 14580, new Class[]{ArrayList.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                if (childAt.getVisibility() == 0) {
                    b a2 = a(childAt);
                    if (a2 != null && a2.f18290b == this.f18274d) {
                        childAt.addFocusables(arrayList, i2, i4);
                    }
                }
                int i6 = i2;
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i4 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList2 != null) {
            arrayList.add(this);
        }
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParams2;
        View view2 = view;
        int i3 = i2;
        ViewGroup.LayoutParams layoutParams3 = layoutParams;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i2), layoutParams3}, this, f18271a, false, 14542, new Class[]{View.class, Integer.TYPE, ViewGroup.LayoutParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i2), layoutParams3}, this, f18271a, false, 14542, new Class[]{View.class, Integer.TYPE, ViewGroup.LayoutParams.class}, Void.TYPE);
            return;
        }
        if (!checkLayoutParams(layoutParams3)) {
            layoutParams2 = generateLayoutParams(layoutParams3);
        } else {
            layoutParams2 = layoutParams3;
        }
        c cVar = (c) layoutParams2;
        cVar.f18294a |= view2 instanceof a;
        if (!this.B) {
            super.addView(view2, i3, layoutParams2);
        } else if (cVar == null || !cVar.f18294a) {
            cVar.f18297d = true;
            addViewInLayout(view2, i3, layoutParams2);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        int i6 = i3;
        int i7 = i5;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f18271a, false, 14549, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f18271a, false, 14549, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onSizeChanged(i2, i3, i4, i5);
        if (i6 != i7) {
            a(i6, i7, this.t, this.t);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r7 = r19
            r8 = 5
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r20)
            r9 = 0
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
            r10 = 1
            r0[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r11 = 2
            r0[r11] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
            r12 = 3
            r0[r12] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)
            r13 = 4
            r0[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f18271a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 14551(0x38d7, float:2.039E-41)
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0090
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r20)
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
            r0[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r0[r11] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
            r0[r12] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)
            r0[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f18271a
            r3 = 0
            r4 = 14551(0x38d7, float:2.039E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0090:
            int r0 = r19.getChildCount()
            int r1 = r23 - r21
            int r2 = r24 - r22
            int r3 = r19.getPaddingLeft()
            int r4 = r19.getPaddingTop()
            int r5 = r19.getPaddingRight()
            int r6 = r19.getPaddingBottom()
            int r13 = r19.getScrollY()
            r14 = r5
            r15 = 0
            r5 = r3
            r3 = 0
        L_0x00b0:
            r9 = 8
            if (r3 >= r0) goto L_0x0153
            android.view.View r11 = r7.getChildAt(r3)
            int r8 = r11.getVisibility()
            if (r8 == r9) goto L_0x014b
            android.view.ViewGroup$LayoutParams r8 = r11.getLayoutParams()
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$c r8 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.c) r8
            boolean r9 = r8.f18294a
            if (r9 == 0) goto L_0x014b
            int r9 = r8.f18295b
            r9 = r9 & 7
            int r8 = r8.f18295b
            r8 = r8 & 112(0x70, float:1.57E-43)
            if (r9 == r10) goto L_0x00ef
            if (r9 == r12) goto L_0x00e8
            r10 = 5
            if (r9 == r10) goto L_0x00d9
            r9 = r5
            goto L_0x0103
        L_0x00d9:
            int r9 = r1 - r14
            int r17 = r11.getMeasuredWidth()
            int r9 = r9 - r17
            int r17 = r11.getMeasuredWidth()
            int r14 = r14 + r17
            goto L_0x00fe
        L_0x00e8:
            r10 = 5
            int r9 = r11.getMeasuredWidth()
            int r9 = r9 + r5
            goto L_0x0103
        L_0x00ef:
            r10 = 5
            int r9 = r11.getMeasuredWidth()
            int r9 = r1 - r9
            r16 = 2
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r5)
        L_0x00fe:
            r18 = r9
            r9 = r5
            r5 = r18
        L_0x0103:
            r10 = 16
            if (r8 == r10) goto L_0x0126
            r10 = 48
            if (r8 == r10) goto L_0x0120
            r10 = 80
            if (r8 == r10) goto L_0x0112
            r8 = r4
        L_0x0110:
            r10 = 2
            goto L_0x0137
        L_0x0112:
            int r8 = r2 - r6
            int r10 = r11.getMeasuredHeight()
            int r8 = r8 - r10
            int r10 = r11.getMeasuredHeight()
            int r6 = r6 + r10
            r10 = 2
            goto L_0x0132
        L_0x0120:
            int r8 = r11.getMeasuredHeight()
            int r8 = r8 + r4
            goto L_0x0110
        L_0x0126:
            int r8 = r11.getMeasuredHeight()
            int r8 = r2 - r8
            r10 = 2
            int r8 = r8 / r10
            int r8 = java.lang.Math.max(r8, r4)
        L_0x0132:
            r18 = r8
            r8 = r4
            r4 = r18
        L_0x0137:
            int r4 = r4 + r13
            int r16 = r11.getMeasuredWidth()
            int r10 = r5 + r16
            int r16 = r11.getMeasuredHeight()
            int r12 = r4 + r16
            r11.layout(r5, r4, r10, r12)
            int r15 = r15 + 1
            r4 = r8
            r5 = r9
        L_0x014b:
            int r3 = r3 + 1
            r8 = 5
            r10 = 1
            r11 = 2
            r12 = 3
            goto L_0x00b0
        L_0x0153:
            int r2 = r2 - r4
            int r2 = r2 - r6
            r3 = 0
        L_0x0156:
            if (r3 >= r0) goto L_0x01a5
            android.view.View r6 = r7.getChildAt(r3)
            int r8 = r6.getVisibility()
            if (r8 == r9) goto L_0x01a2
            android.view.ViewGroup$LayoutParams r8 = r6.getLayoutParams()
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$c r8 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.c) r8
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r10 = r7.a((android.view.View) r6)
            boolean r11 = r8.f18294a
            if (r11 != 0) goto L_0x01a2
            if (r10 == 0) goto L_0x01a2
            float r11 = (float) r2
            float r10 = r10.f18293e
            float r10 = r10 * r11
            int r10 = (int) r10
            int r10 = r10 + r4
            boolean r12 = r8.f18297d
            if (r12 == 0) goto L_0x0195
            r12 = 0
            r8.f18297d = r12
            int r12 = r1 - r5
            int r12 = r12 - r14
            r13 = 1073741824(0x40000000, float:2.0)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r13)
            float r8 = r8.f18296c
            float r11 = r11 * r8
            int r8 = (int) r11
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r13)
            r6.measure(r12, r8)
        L_0x0195:
            int r8 = r6.getMeasuredWidth()
            int r8 = r8 + r5
            int r11 = r6.getMeasuredHeight()
            int r11 = r11 + r10
            r6.layout(r5, r10, r8, r11)
        L_0x01a2:
            int r3 = r3 + 1
            goto L_0x0156
        L_0x01a5:
            r7.v = r5
            int r1 = r1 - r14
            r7.w = r1
            r7.ae = r15
            boolean r0 = r7.ab
            if (r0 == 0) goto L_0x01b7
            int r0 = r7.f18274d
            r1 = 0
            r7.a((int) r0, (boolean) r1, (int) r1, (boolean) r1)
            goto L_0x01b8
        L_0x01b7:
            r1 = 0
        L_0x01b8:
            r7.ab = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.LiveVerticalViewPager.onLayout(boolean, int, int, int, int):void");
    }
}
