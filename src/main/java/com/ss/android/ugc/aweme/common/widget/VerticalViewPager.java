package com.ss.android.ugc.aweme.common.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.view.AccessibilityDelegateCompat;
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
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VerticalViewPager extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40481a;
    private static final h am = new h();

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f40482b = {16842931};

    /* renamed from: c  reason: collision with root package name */
    public static final Interpolator f40483c = new Interpolator() {
        public final float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    };
    static Field p;
    private static final Comparator<c> t = new Comparator<c>() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return ((c) obj).f40496b - ((c) obj2).f40496b;
        }
    };
    private boolean A;
    private f B;
    private int C;
    private Drawable D;
    private int E;
    private int F;
    private int G;
    private int H;
    private boolean I;
    private boolean J;
    private boolean K;
    private int L = 1;
    private boolean M;
    private int N;
    private int O;
    private int P;
    private float Q;
    private float R;
    private int S = -1;
    private int T;
    private int U;
    private int V;
    private int W;
    private EdgeEffectCompat aa;
    private EdgeEffectCompat ab;
    private boolean ac = true;
    private boolean ad = false;
    private boolean ae;
    private int af;
    private ViewPager.OnPageChangeListener ag;
    private e ah;
    private ViewPager.PageTransformer ai;
    private Method aj;
    private int ak;
    private ArrayList<View> al;
    private final Runnable an = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40487a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f40487a, false, 33863, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f40487a, false, 33863, new Class[0], Void.TYPE);
                return;
            }
            VerticalViewPager.this.setScrollState(0);
            VerticalViewPager.this.b();
        }
    };
    private int ao = 0;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<c> f40484d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public PagerAdapter f40485e;

    /* renamed from: f  reason: collision with root package name */
    public int f40486f;
    public float g = -3.4028235E38f;
    public float h = Float.MAX_VALUE;
    public boolean i;
    public float j;
    public float k;
    public VelocityTracker l;
    public boolean m;
    public long n;
    public List<ViewPager.OnPageChangeListener> o = new ArrayList();
    public boolean q = false;
    private boolean r;
    private int s;
    private final c u = new c();
    private final Rect v = new Rect();
    private int w = -1;
    private Parcelable x = null;
    private ClassLoader y = null;
    private Scroller z;

    class MyAccessibilityDelegate extends AccessibilityDelegateCompat {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40492a;

        private boolean a() {
            if (PatchProxy.isSupport(new Object[0], this, f40492a, false, 33868, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f40492a, false, 33868, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (VerticalViewPager.this.f40485e == null || VerticalViewPager.this.f40485e.getCount() <= 1) {
                return false;
            } else {
                return true;
            }
        }

        MyAccessibilityDelegate() {
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (PatchProxy.isSupport(new Object[]{view, accessibilityEvent}, this, f40492a, false, 33865, new Class[]{View.class, AccessibilityEvent.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, accessibilityEvent}, this, f40492a, false, 33865, new Class[]{View.class, AccessibilityEvent.class}, Void.TYPE);
                return;
            }
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            AccessibilityRecordCompat obtain = AccessibilityRecordCompat.obtain();
            obtain.setScrollable(a());
            if (accessibilityEvent.getEventType() == 4096 && VerticalViewPager.this.f40485e != null) {
                obtain.setItemCount(VerticalViewPager.this.f40485e.getCount());
                obtain.setFromIndex(VerticalViewPager.this.f40486f);
                obtain.setToIndex(VerticalViewPager.this.f40486f);
            }
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (PatchProxy.isSupport(new Object[]{view, accessibilityNodeInfoCompat}, this, f40492a, false, 33866, new Class[]{View.class, AccessibilityNodeInfoCompat.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, accessibilityNodeInfoCompat}, this, f40492a, false, 33866, new Class[]{View.class, AccessibilityNodeInfoCompat.class}, Void.TYPE);
                return;
            }
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setClassName(ViewPager.class.getName());
            accessibilityNodeInfoCompat.setScrollable(a());
            if (VerticalViewPager.this.canScrollVertically(1)) {
                accessibilityNodeInfoCompat.addAction(4096);
            }
            if (VerticalViewPager.this.canScrollVertically(-1)) {
                accessibilityNodeInfoCompat.addAction(8192);
            }
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), bundle}, this, f40492a, false, 33867, new Class[]{View.class, Integer.TYPE, Bundle.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), bundle}, this, f40492a, false, 33867, new Class[]{View.class, Integer.TYPE, Bundle.class}, Boolean.TYPE)).booleanValue();
            } else if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            } else {
                if (i2 != 4096) {
                    if (i2 != 8192 || !VerticalViewPager.this.canScrollVertically(-1)) {
                        return false;
                    }
                    VerticalViewPager.this.setCurrentItem(VerticalViewPager.this.f40486f - 1);
                    return true;
                } else if (!VerticalViewPager.this.canScrollVertically(1)) {
                    return false;
                } else {
                    VerticalViewPager.this.setCurrentItem(VerticalViewPager.this.f40486f + 1);
                    return true;
                }
            }
        }
    }

    interface a {
    }

    public interface b {
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        Object f40495a;

        /* renamed from: b  reason: collision with root package name */
        public int f40496b;

        /* renamed from: c  reason: collision with root package name */
        boolean f40497c;

        /* renamed from: d  reason: collision with root package name */
        float f40498d;

        /* renamed from: e  reason: collision with root package name */
        public float f40499e;

        c() {
        }
    }

    public static class d extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f40500a;

        /* renamed from: b  reason: collision with root package name */
        public int f40501b;

        /* renamed from: c  reason: collision with root package name */
        float f40502c;

        /* renamed from: d  reason: collision with root package name */
        boolean f40503d;

        /* renamed from: e  reason: collision with root package name */
        int f40504e;

        /* renamed from: f  reason: collision with root package name */
        int f40505f;

        public d() {
            super(-1, -1);
        }

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, VerticalViewPager.f40482b);
            this.f40501b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public interface e {
        void a(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2);
    }

    class f extends DataSetObserver {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40506a;

        public void onChanged() {
            if (PatchProxy.isSupport(new Object[0], this, f40506a, false, 33869, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f40506a, false, 33869, new Class[0], Void.TYPE);
                return;
            }
            VerticalViewPager.this.a();
        }

        public void onInvalidated() {
            if (PatchProxy.isSupport(new Object[0], this, f40506a, false, 33870, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f40506a, false, 33870, new Class[0], Void.TYPE);
                return;
            }
            VerticalViewPager.this.a();
        }

        private f() {
        }

        /* synthetic */ f(VerticalViewPager verticalViewPager, byte b2) {
            this();
        }
    }

    public static class g extends View.BaseSavedState {
        public static final Parcelable.Creator<g> CREATOR = ParcelableCompat.newCreator(new VerticalViewPager$SavedState$1());

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40508a;

        /* renamed from: b  reason: collision with root package name */
        int f40509b;

        /* renamed from: c  reason: collision with root package name */
        Parcelable f40510c;

        /* renamed from: d  reason: collision with root package name */
        ClassLoader f40511d;

        public String toString() {
            if (PatchProxy.isSupport(new Object[0], this, f40508a, false, 33872, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f40508a, false, 33872, new Class[0], String.class);
            }
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f40509b + "}";
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        g(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f40509b = parcel.readInt();
            this.f40510c = parcel.readParcelable(classLoader);
            this.f40511d = classLoader;
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, f40508a, false, 33871, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, f40508a, false, 33871, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f40509b);
            parcel.writeParcelable(this.f40510c, i);
        }
    }

    static class h implements Comparator<View> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40512a;

        h() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            View view = (View) obj;
            View view2 = (View) obj2;
            int i = 1;
            if (PatchProxy.isSupport(new Object[]{view, view2}, this, f40512a, false, 33874, new Class[]{View.class, View.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{view, view2}, this, f40512a, false, 33874, new Class[]{View.class, View.class}, Integer.TYPE)).intValue();
            }
            d dVar = (d) view.getLayoutParams();
            d dVar2 = (d) view2.getLayoutParams();
            if (dVar.f40500a == dVar2.f40500a) {
                i = dVar.f40504e - dVar2.f40504e;
            } else if (!dVar.f40500a) {
                return -1;
            }
            return i;
        }
    }

    public PagerAdapter getAdapter() {
        return this.f40485e;
    }

    public int getCurrentItem() {
        return this.f40486f;
    }

    public int getExpectedAdapterCount() {
        return this.s;
    }

    public int getOffscreenPageLimit() {
        return this.L;
    }

    public int getPageMargin() {
        return this.C;
    }

    public final void a(int i2, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f40481a, false, 33788, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2)}, this, f40481a, false, 33788, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.K = false;
        a(i2, z2, false);
    }

    private void a(int i2, boolean z2, boolean z3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f40481a, false, 33790, new Class[]{Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2), Byte.valueOf(z3)}, this, f40481a, false, 33790, new Class[]{Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(i2, z2, z3, 0);
    }

    private void a(int i2, boolean z2, boolean z3, int i3) {
        int i4;
        int i5 = i2;
        boolean z4 = true;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0), Integer.valueOf(i3)}, this, f40481a, false, 33791, new Class[]{Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2), Byte.valueOf(z3), Integer.valueOf(i3)}, this, f40481a, false, 33791, new Class[]{Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.f40485e == null || this.f40485e.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z3 || this.f40486f != i5 || this.f40484d.size() == 0) {
            if (i5 < 0) {
                i4 = 0;
            } else {
                i4 = i5 >= this.f40485e.getCount() ? this.f40485e.getCount() - 1 : i5;
            }
            int i6 = this.L;
            if (i4 > this.f40486f + i6 || i4 < this.f40486f - i6) {
                for (int i7 = 0; i7 < this.f40484d.size(); i7++) {
                    this.f40484d.get(i7).f40497c = true;
                }
            }
            if (this.f40486f == i4) {
                z4 = false;
            }
            if (this.ac) {
                this.f40486f = i4;
                if (z4 && this.o != null && !this.o.isEmpty()) {
                    for (ViewPager.OnPageChangeListener onPageSelected : this.o) {
                        onPageSelected.onPageSelected(i4);
                    }
                }
                if (z4 && this.ag != null) {
                    this.ag.onPageSelected(i4);
                }
                requestLayout();
                return;
            }
            b(i4);
            a(i4, z2, i3, z4);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    private void a(int i2, boolean z2, int i3, boolean z3) {
        int i4;
        float f2;
        int i5;
        int i6 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : 0), Integer.valueOf(i3), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f40481a, false, 33792, new Class[]{Integer.TYPE, Boolean.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2), Integer.valueOf(i3), Byte.valueOf(z3)}, this, f40481a, false, 33792, new Class[]{Integer.TYPE, Boolean.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        c c2 = c(i2);
        int clientHeight = c2 != null ? (int) (((float) getClientHeight()) * Math.max(this.g, Math.min(c2.f40499e, this.h))) : 0;
        if (z2) {
            if (PatchProxy.isSupport(new Object[]{0, Integer.valueOf(clientHeight), Integer.valueOf(i3)}, this, f40481a, false, 33807, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{0, Integer.valueOf(clientHeight), Integer.valueOf(i3)}, this, f40481a, false, 33807, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                if (this.z != null && !this.z.isFinished()) {
                    i4 = this.A ? this.z.getCurrY() : this.z.getStartY();
                    this.z.abortAnimation();
                    setScrollingCacheEnabled(false);
                } else {
                    i4 = getScrollY();
                }
                int i7 = i4;
                int scrollX = getScrollX();
                int i8 = 0 - scrollX;
                int i9 = clientHeight - i7;
                if (i8 == 0 && i9 == 0) {
                    a(false);
                    b();
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientHeight2 = getClientHeight();
                    float f3 = (float) clientHeight2;
                    float min = Math.min(1.0f, (((float) Math.abs(i8)) * 1.0f) / f3);
                    float f4 = (float) (clientHeight2 / 2);
                    float f5 = f3;
                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(min)}, this, f40481a, false, 33805, new Class[]{Float.TYPE}, Float.TYPE)) {
                        f2 = ((Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(min)}, this, f40481a, false, 33805, new Class[]{Float.TYPE}, Float.TYPE)).floatValue();
                    } else {
                        double d2 = (double) (min - 0.5f);
                        Double.isNaN(d2);
                        f2 = (float) Math.sin((double) ((float) (d2 * 0.4712389167638204d)));
                    }
                    float f6 = f4 + (f4 * f2);
                    int abs = Math.abs(i3);
                    if (abs > 0) {
                        i5 = Math.round(Math.abs(f6 / ((float) abs)) * 1000.0f) * 4;
                    } else {
                        i5 = (int) (((((float) Math.abs(i8)) / ((f5 * this.f40485e.getPageWidth(this.f40486f)) + ((float) this.C))) + 1.0f) * 100.0f);
                    }
                    int min2 = Math.min(i5, 600);
                    this.A = false;
                    this.z.startScroll(scrollX, i7, i8, i9, min2);
                    ViewCompat.postInvalidateOnAnimation(this);
                }
            }
            if (z3 && this.o != null && !this.o.isEmpty()) {
                for (ViewPager.OnPageChangeListener onPageSelected : this.o) {
                    onPageSelected.onPageSelected(i6);
                }
            }
            if (z3 && this.ag != null) {
                this.ag.onPageSelected(i6);
            }
        } else {
            if (z3 && this.o != null && !this.o.isEmpty()) {
                for (ViewPager.OnPageChangeListener onPageSelected2 : this.o) {
                    onPageSelected2.onPageSelected(i6);
                }
            }
            if (z3 && this.ag != null) {
                this.ag.onPageSelected(i6);
            }
            a(false);
            scrollTo(0, clientHeight);
            a(clientHeight);
        }
    }

    public final void a(ViewPager.OnPageChangeListener onPageChangeListener) {
        ViewPager.OnPageChangeListener onPageChangeListener2 = onPageChangeListener;
        if (PatchProxy.isSupport(new Object[]{onPageChangeListener2}, this, f40481a, false, 33793, new Class[]{ViewPager.OnPageChangeListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onPageChangeListener2}, this, f40481a, false, 33793, new Class[]{ViewPager.OnPageChangeListener.class}, Void.TYPE);
        } else if (onPageChangeListener2 != null) {
            this.o.add(onPageChangeListener2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f40481a, false, 33809, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40481a, false, 33809, new Class[0], Void.TYPE);
            return;
        }
        int count = this.f40485e.getCount();
        this.s = count;
        boolean z2 = this.f40484d.size() < (this.L * 2) + 1 && this.f40484d.size() < count;
        int i2 = this.f40486f;
        int i3 = 0;
        boolean z3 = false;
        while (i3 < this.f40484d.size()) {
            c cVar = this.f40484d.get(i3);
            int itemPosition = this.f40485e.getItemPosition(cVar.f40495a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f40484d.remove(i3);
                    i3--;
                    if (!z3) {
                        this.f40485e.startUpdate((ViewGroup) this);
                        z3 = true;
                    }
                    this.f40485e.destroyItem((ViewGroup) this, cVar.f40496b, cVar.f40495a);
                    if (this.f40486f == cVar.f40496b) {
                        i2 = Math.max(0, Math.min(this.f40486f, count - 1));
                    }
                } else if (cVar.f40496b != itemPosition) {
                    if (cVar.f40496b == this.f40486f) {
                        i2 = itemPosition;
                    }
                    cVar.f40496b = itemPosition;
                }
                z2 = true;
            }
            i3++;
        }
        if (z3) {
            this.f40485e.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f40484d, t);
        if (z2) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                d dVar = (d) getChildAt(i4).getLayoutParams();
                if (!dVar.f40500a) {
                    dVar.f40502c = 0.0f;
                }
            }
            a(i2, false, true);
            requestLayout();
        }
    }

    private void a(c cVar, int i2, c cVar2) {
        c cVar3;
        c cVar4;
        c cVar5 = cVar;
        c cVar6 = cVar2;
        if (PatchProxy.isSupport(new Object[]{cVar5, Integer.valueOf(i2), cVar6}, this, f40481a, false, 33813, new Class[]{c.class, Integer.TYPE, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar5, Integer.valueOf(i2), cVar6}, this, f40481a, false, 33813, new Class[]{c.class, Integer.TYPE, c.class}, Void.TYPE);
            return;
        }
        int count = this.f40485e.getCount();
        int clientHeight = getClientHeight();
        float f2 = clientHeight > 0 ? ((float) this.C) / ((float) clientHeight) : 0.0f;
        if (cVar6 != null) {
            int i3 = cVar6.f40496b;
            if (i3 < cVar5.f40496b) {
                int i4 = i3 + 1;
                float f3 = cVar6.f40499e + cVar6.f40498d + f2;
                int i5 = 0;
                while (i4 <= cVar5.f40496b && i5 < this.f40484d.size()) {
                    Object obj = this.f40484d.get(i5);
                    while (true) {
                        cVar4 = (c) obj;
                        if (i4 > cVar4.f40496b && i5 < this.f40484d.size() - 1) {
                            i5++;
                            obj = this.f40484d.get(i5);
                        }
                    }
                    while (i4 < cVar4.f40496b) {
                        f3 += this.f40485e.getPageWidth(i4) + f2;
                        i4++;
                    }
                    cVar4.f40499e = f3;
                    f3 += cVar4.f40498d + f2;
                    i4++;
                }
            } else if (i3 > cVar5.f40496b) {
                int size = this.f40484d.size() - 1;
                float f4 = cVar6.f40499e;
                int i6 = i3 - 1;
                while (i6 >= cVar5.f40496b && size >= 0) {
                    Object obj2 = this.f40484d.get(size);
                    while (true) {
                        cVar3 = (c) obj2;
                        if (i6 < cVar3.f40496b && size > 0) {
                            size--;
                            obj2 = this.f40484d.get(size);
                        }
                    }
                    while (i6 > cVar3.f40496b) {
                        f4 -= this.f40485e.getPageWidth(i6) + f2;
                        i6--;
                    }
                    f4 -= cVar3.f40498d + f2;
                    cVar3.f40499e = f4;
                    i6--;
                }
            }
        }
        int size2 = this.f40484d.size();
        float f5 = cVar5.f40499e;
        int i7 = cVar5.f40496b - 1;
        this.g = cVar5.f40496b == 0 ? cVar5.f40499e : -3.4028235E38f;
        int i8 = count - 1;
        this.h = cVar5.f40496b == i8 ? (cVar5.f40499e + cVar5.f40498d) - 1.0f : Float.MAX_VALUE;
        int i9 = i2 - 1;
        while (i9 >= 0) {
            c cVar7 = this.f40484d.get(i9);
            while (i7 > cVar7.f40496b) {
                f5 -= this.f40485e.getPageWidth(i7) + f2;
                i7--;
            }
            f5 -= cVar7.f40498d + f2;
            cVar7.f40499e = f5;
            if (cVar7.f40496b == 0) {
                this.g = f5;
            }
            i9--;
            i7--;
        }
        float f6 = cVar5.f40499e + cVar5.f40498d + f2;
        int i10 = cVar5.f40496b + 1;
        int i11 = i2 + 1;
        while (i11 < size2) {
            c cVar8 = this.f40484d.get(i11);
            while (i10 < cVar8.f40496b) {
                f6 += this.f40485e.getPageWidth(i10) + f2;
                i10++;
            }
            if (cVar8.f40496b == i8) {
                this.h = (cVar8.f40498d + f6) - 1.0f;
            }
            cVar8.f40499e = f6;
            f6 += cVar8.f40498d + f2;
            i11++;
            i10++;
        }
        this.ad = false;
    }

    private void a(int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f40481a, false, 33824, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f40481a, false, 33824, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (i3 <= 0 || this.f40484d.isEmpty()) {
            c c2 = c(this.f40486f);
            int min = (int) ((c2 != null ? Math.min(c2.f40499e, this.h) : 0.0f) * ((float) ((i2 - getPaddingTop()) - getPaddingBottom())));
            if (min != getScrollY()) {
                a(false);
                scrollTo(getScrollX(), min);
            }
        } else if (!this.z.isFinished()) {
            this.z.setFinalY(getCurrentItem() * getClientHeight());
        } else {
            scrollTo(getScrollX(), (int) ((((float) getScrollY()) / ((float) (((i3 - getPaddingTop()) - getPaddingBottom()) + i5))) * ((float) (((i2 - getPaddingTop()) - getPaddingBottom()) + i4))));
        }
    }

    public boolean a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40481a, false, 33827, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40481a, false, 33827, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.f40484d.size() != 0) {
            c g2 = g();
            int clientHeight = getClientHeight();
            int i3 = this.C + clientHeight;
            float f2 = (float) clientHeight;
            float f3 = ((float) this.C) / f2;
            int i4 = g2.f40496b;
            float f4 = ((((float) i2) / f2) - g2.f40499e) / (g2.f40498d + f3);
            this.ae = false;
            a(i4, f4, (int) (((float) i3) * f4));
            if (this.ae) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.ac) {
            return false;
        } else {
            this.ae = false;
            a(0, 0.0f, 0);
            if (this.ae) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    private void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f40481a, false, 33829, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f40481a, false, 33829, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        boolean z3 = this.ao == 2;
        if (z3) {
            setScrollingCacheEnabled(false);
            if (!this.z.isFinished()) {
                this.z.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.z.getCurrX();
                int currY = this.z.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currY != scrollY) {
                        a(currY);
                    }
                }
            }
        }
        this.K = false;
        boolean z4 = z3;
        for (int i2 = 0; i2 < this.f40484d.size(); i2++) {
            c cVar = this.f40484d.get(i2);
            if (cVar.f40497c) {
                cVar.f40497c = false;
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

    private boolean a(float f2) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = false;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f40481a, false, 33836, new Class[]{Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f40481a, false, 33836, new Class[]{Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        this.j = f2;
        float scrollY = ((float) getScrollY()) + (this.j - f2);
        float clientHeight = (float) getClientHeight();
        float f3 = this.g * clientHeight;
        float f4 = this.h * clientHeight;
        if (this.f40484d.size() <= 0) {
            return false;
        }
        c cVar = this.f40484d.get(0);
        c cVar2 = this.f40484d.get(this.f40484d.size() - 1);
        if (cVar.f40496b != 0) {
            f3 = cVar.f40499e * clientHeight;
            z2 = false;
        } else {
            z2 = true;
        }
        if (cVar2.f40496b != this.f40485e.getCount() - 1) {
            f4 = cVar2.f40499e * clientHeight;
            z3 = false;
        }
        if (scrollY < f3) {
            if (z2) {
                z4 = this.aa.onPull(Math.abs(f3 - scrollY) / clientHeight);
            }
            scrollY = f3;
        } else if (scrollY > f4) {
            if (z3) {
                z4 = this.ab.onPull(Math.abs(scrollY - f4) / clientHeight);
            }
            scrollY = f4;
        }
        int i2 = (int) scrollY;
        this.Q += scrollY - ((float) i2);
        scrollTo(getScrollX(), i2);
        a(i2);
        return z4;
    }

    private void a(MotionEvent motionEvent) {
        int i2 = 1;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f40481a, false, 33844, new Class[]{MotionEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f40481a, false, 33844, new Class[]{MotionEvent.class}, Void.TYPE);
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.S) {
            if (actionIndex != 0) {
                i2 = 0;
            }
            this.j = motionEvent.getY(i2);
            this.S = motionEvent.getPointerId(i2);
            if (this.l != null) {
                this.l.clear();
            }
        }
    }

    private boolean a(View view, boolean z2, int i2, int i3, int i4) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Byte.valueOf(z2 ? (byte) 1 : 0), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f40481a, false, 33847, new Class[]{View.class, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, Byte.valueOf(z2), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f40481a, false, 33847, new Class[]{View.class, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (view2 instanceof b) {
            return false;
        } else {
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
    }

    private void a(PagerAdapter pagerAdapter, f fVar) {
        PagerAdapter pagerAdapter2 = pagerAdapter;
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{pagerAdapter2, fVar2}, this, f40481a, false, 33862, new Class[]{PagerAdapter.class, f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pagerAdapter2, fVar2}, this, f40481a, false, 33862, new Class[]{PagerAdapter.class, f.class}, Void.TYPE);
            return;
        }
        try {
            if (p != null) {
                p.set(pagerAdapter2, fVar2);
            }
        } catch (IllegalAccessException e2) {
            if (com.ss.android.ugc.aweme.g.a.a()) {
                throw new RuntimeException(e2);
            }
        }
    }

    static {
        try {
            Field declaredField = PagerAdapter.class.getDeclaredField("mViewPagerObserver");
            p = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            if (com.ss.android.ugc.aweme.g.a.a()) {
                throw new RuntimeException(e2);
            }
        }
    }

    private boolean f() {
        if (PatchProxy.isSupport(new Object[0], this, f40481a, false, 33834, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f40481a, false, 33834, new Class[0], Boolean.TYPE)).booleanValue();
        }
        this.S = -1;
        h();
        return this.aa.onRelease() | this.ab.onRelease();
    }

    private void h() {
        if (PatchProxy.isSupport(new Object[0], this, f40481a, false, 33845, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40481a, false, 33845, new Class[0], Void.TYPE);
            return;
        }
        this.i = false;
        this.M = false;
        if (this.l != null) {
            this.l.recycle();
            this.l = null;
        }
    }

    private boolean i() {
        if (PatchProxy.isSupport(new Object[0], this, f40481a, false, 33852, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f40481a, false, 33852, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f40486f <= 0) {
            return false;
        } else {
            a(this.f40486f - 1, true);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f40481a, false, 33810, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40481a, false, 33810, new Class[0], Void.TYPE);
            return;
        }
        b(this.f40486f);
    }

    public void drawableStateChanged() {
        if (PatchProxy.isSupport(new Object[0], this, f40481a, false, 33804, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40481a, false, 33804, new Class[0], Void.TYPE);
            return;
        }
        super.drawableStateChanged();
        Drawable drawable = this.D;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        if (!PatchProxy.isSupport(new Object[0], this, f40481a, false, 33858, new Class[0], ViewGroup.LayoutParams.class)) {
            return new d();
        }
        return (ViewGroup.LayoutParams) PatchProxy.accessDispatch(new Object[0], this, f40481a, false, 33858, new Class[0], ViewGroup.LayoutParams.class);
    }

    public int getClientHeight() {
        if (!PatchProxy.isSupport(new Object[0], this, f40481a, false, 33786, new Class[0], Integer.TYPE)) {
            return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f40481a, false, 33786, new Class[0], Integer.TYPE)).intValue();
    }

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f40481a, false, 33821, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40481a, false, 33821, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        this.ac = true;
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f40481a, false, 33782, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40481a, false, 33782, new Class[0], Void.TYPE);
            return;
        }
        removeCallbacks(this.an);
        if (this.z != null && !this.z.isFinished()) {
            this.z.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f40481a, false, 33812, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40481a, false, 33812, new Class[0], Void.TYPE);
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

    private boolean j() {
        if (PatchProxy.isSupport(new Object[0], this, f40481a, false, 33853, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f40481a, false, 33853, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f40485e == null || this.f40486f >= this.f40485e.getCount() - 1) {
            return false;
        } else {
            a(this.f40486f + 1, true);
            return true;
        }
    }

    public void computeScroll() {
        if (PatchProxy.isSupport(new Object[0], this, f40481a, false, 33826, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40481a, false, 33826, new Class[0], Void.TYPE);
            return;
        }
        this.A = true;
        if (this.z.isFinished() || !this.z.computeScrollOffset()) {
            a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.z.getCurrX();
        int currY = this.z.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!a(currY)) {
                this.z.abortAnimation();
                scrollTo(currX, 0);
            }
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public Parcelable onSaveInstanceState() {
        if (PatchProxy.isSupport(new Object[0], this, f40481a, false, 33814, new Class[0], Parcelable.class)) {
            return (Parcelable) PatchProxy.accessDispatch(new Object[0], this, f40481a, false, 33814, new Class[0], Parcelable.class);
        }
        g gVar = new g(super.onSaveInstanceState());
        gVar.f40509b = this.f40486f;
        if (this.f40485e != null) {
            gVar.f40510c = this.f40485e.saveState();
        }
        return gVar;
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f40481a, false, 33781, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40481a, false, 33781, new Class[0], Void.TYPE);
            return;
        }
        this.r = true;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.z = new Scroller(context, f40483c);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.P = ViewConfigurationCompat.getScaledPagingTouchSlop(viewConfiguration);
        this.T = (int) (400.0f * f2);
        this.U = viewConfiguration.getScaledMaximumFlingVelocity();
        this.aa = new EdgeEffectCompat(context);
        this.ab = new EdgeEffectCompat(context);
        this.V = (int) (25.0f * f2);
        this.W = (int) (2.0f * f2);
        this.N = (int) (f2 * 16.0f);
        ViewCompat.setAccessibilityDelegate(this, new MyAccessibilityDelegate());
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f40489a;

            /* renamed from: c  reason: collision with root package name */
            private final Rect f40491c = new Rect();

            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                if (PatchProxy.isSupport(new Object[]{view, windowInsetsCompat}, this, f40489a, false, 33864, new Class[]{View.class, WindowInsetsCompat.class}, WindowInsetsCompat.class)) {
                    return (WindowInsetsCompat) PatchProxy.accessDispatch(new Object[]{view, windowInsetsCompat}, this, f40489a, false, 33864, new Class[]{View.class, WindowInsetsCompat.class}, WindowInsetsCompat.class);
                }
                WindowInsetsCompat onApplyWindowInsets = ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
                if (onApplyWindowInsets.isConsumed()) {
                    return onApplyWindowInsets;
                }
                Rect rect = this.f40491c;
                rect.left = onApplyWindowInsets.getSystemWindowInsetLeft();
                rect.top = onApplyWindowInsets.getSystemWindowInsetTop();
                rect.right = onApplyWindowInsets.getSystemWindowInsetRight();
                rect.bottom = onApplyWindowInsets.getSystemWindowInsetBottom();
                int childCount = VerticalViewPager.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    WindowInsetsCompat dispatchApplyWindowInsets = ViewCompat.dispatchApplyWindowInsets(VerticalViewPager.this.getChildAt(i), onApplyWindowInsets);
                    rect.left = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetLeft(), rect.left);
                    rect.top = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetTop(), rect.top);
                    rect.right = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetRight(), rect.right);
                    rect.bottom = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetBottom(), rect.bottom);
                }
                return onApplyWindowInsets.replaceSystemWindowInsets(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    private c g() {
        float f2;
        float f3;
        if (PatchProxy.isSupport(new Object[0], this, f40481a, false, 33837, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], this, f40481a, false, 33837, new Class[0], c.class);
        }
        int clientHeight = getClientHeight();
        if (clientHeight > 0) {
            f2 = ((float) getScrollY()) / ((float) clientHeight);
        } else {
            f2 = 0.0f;
        }
        if (clientHeight > 0) {
            f3 = ((float) this.C) / ((float) clientHeight);
        } else {
            f3 = 0.0f;
        }
        c cVar = null;
        int i2 = 0;
        boolean z2 = true;
        int i3 = -1;
        float f4 = 0.0f;
        float f5 = 0.0f;
        while (i2 < this.f40484d.size()) {
            c cVar2 = this.f40484d.get(i2);
            if (!z2) {
                int i4 = i3 + 1;
                if (cVar2.f40496b != i4) {
                    cVar2 = this.u;
                    cVar2.f40499e = f4 + f5 + f3;
                    cVar2.f40496b = i4;
                    cVar2.f40498d = this.f40485e.getPageWidth(cVar2.f40496b);
                    i2--;
                }
            }
            f4 = cVar2.f40499e;
            float f6 = cVar2.f40498d + f4 + f3;
            if (!z2 && f2 < f4) {
                return cVar;
            }
            if (f2 < f6 || i2 == this.f40484d.size() - 1) {
                return cVar2;
            }
            i3 = cVar2.f40496b;
            f5 = cVar2.f40498d;
            i2++;
            cVar = cVar2;
            z2 = false;
        }
        return cVar;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f40481a, false, 33842, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40481a, false, 33842, new Class[0], Void.TYPE);
        } else if (this.m) {
            if (this.f40485e != null) {
                VelocityTracker velocityTracker = this.l;
                velocityTracker.computeCurrentVelocity(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, (float) this.U);
                int yVelocity = (int) VelocityTrackerCompat.getYVelocity(velocityTracker, this.S);
                this.K = true;
                int clientHeight = getClientHeight();
                int scrollY = getScrollY();
                c g2 = g();
                a(a(g2.f40496b, ((((float) scrollY) / ((float) clientHeight)) - g2.f40499e) / g2.f40498d, yVelocity, (int) (this.j - this.k)), true, true, yVelocity);
            }
            h();
            this.m = false;
        } else {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
    }

    public void setCanTouch(boolean z2) {
        this.r = z2;
    }

    public void setDisableScroll(boolean z2) {
        this.q = z2;
    }

    public void setOnAdapterChangeListener(e eVar) {
        this.ah = eVar;
    }

    public void setScroller(Scroller scroller) {
        this.z = scroller;
    }

    private void setScrollingCacheEnabled(boolean z2) {
        if (this.J != z2) {
            this.J = z2;
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!PatchProxy.isSupport(new Object[]{layoutParams}, this, f40481a, false, 33859, new Class[]{ViewGroup.LayoutParams.class}, ViewGroup.LayoutParams.class)) {
            return generateDefaultLayoutParams();
        }
        return (ViewGroup.LayoutParams) PatchProxy.accessDispatch(new Object[]{layoutParams}, this, f40481a, false, 33859, new Class[]{ViewGroup.LayoutParams.class}, ViewGroup.LayoutParams.class);
    }

    public void setCurrentItemWithDefaultVelocity(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40481a, false, 33789, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40481a, false, 33789, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.K = false;
        a(i2, true, true, 1);
    }

    public VerticalViewPager(Context context) {
        super(context);
        d();
    }

    private c b(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f40481a, false, 33819, new Class[]{View.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{view}, this, f40481a, false, 33819, new Class[]{View.class}, c.class);
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

    private c c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40481a, false, 33820, new Class[]{Integer.TYPE}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40481a, false, 33820, new Class[]{Integer.TYPE}, c.class);
        }
        for (int i3 = 0; i3 < this.f40484d.size(); i3++) {
            c cVar = this.f40484d.get(i3);
            if (cVar.f40496b == i2) {
                return cVar;
            }
        }
        return null;
    }

    public void addTouchables(ArrayList<View> arrayList) {
        if (PatchProxy.isSupport(new Object[]{arrayList}, this, f40481a, false, 33855, new Class[]{ArrayList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arrayList}, this, f40481a, false, 33855, new Class[]{ArrayList.class}, Void.TYPE);
            return;
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                c a2 = a(childAt);
                if (a2 != null && a2.f40496b == this.f40486f) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    public boolean canScrollVertically(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40481a, false, 33846, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40481a, false, 33846, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.f40485e == null) {
            return false;
        } else {
            int clientHeight = getClientHeight();
            int scrollY = getScrollY();
            if (i2 < 0) {
                if (scrollY > ((int) (((float) clientHeight) * this.g))) {
                    return true;
                }
                return false;
            } else if (i2 <= 0 || scrollY >= ((int) (((float) clientHeight) * this.h))) {
                return false;
            } else {
                return true;
            }
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParams2 = layoutParams;
        if (PatchProxy.isSupport(new Object[]{layoutParams2}, this, f40481a, false, 33860, new Class[]{ViewGroup.LayoutParams.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{layoutParams2}, this, f40481a, false, 33860, new Class[]{ViewGroup.LayoutParams.class}, Boolean.TYPE)).booleanValue();
        } else if (!(layoutParams2 instanceof d) || !super.checkLayoutParams(layoutParams)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (PatchProxy.isSupport(new Object[]{accessibilityEvent}, this, f40481a, false, 33857, new Class[]{AccessibilityEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{accessibilityEvent}, this, f40481a, false, 33857, new Class[]{AccessibilityEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        } else {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    c a2 = a(childAt);
                    if (a2 != null && a2.f40496b == this.f40486f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f40481a, false, 33780, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f40481a, false, 33780, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!this.r || !super.dispatchTouchEvent(motionEvent)) {
            return false;
        } else {
            return true;
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AttributeSet attributeSet2 = attributeSet;
        if (!PatchProxy.isSupport(new Object[]{attributeSet2}, this, f40481a, false, 33861, new Class[]{AttributeSet.class}, ViewGroup.LayoutParams.class)) {
            return new d(getContext(), attributeSet2);
        }
        return (ViewGroup.LayoutParams) PatchProxy.accessDispatch(new Object[]{attributeSet2}, this, f40481a, false, 33861, new Class[]{AttributeSet.class}, ViewGroup.LayoutParams.class);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (PatchProxy.isSupport(new Object[]{parcelable}, this, f40481a, false, 33815, new Class[]{Parcelable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcelable}, this, f40481a, false, 33815, new Class[]{Parcelable.class}, Void.TYPE);
        } else if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
        } else {
            g gVar = (g) parcelable;
            super.onRestoreInstanceState(gVar.getSuperState());
            if (this.f40485e != null) {
                this.f40485e.restoreState(gVar.f40510c, gVar.f40511d);
                a(gVar.f40509b, false, true);
                return;
            }
            this.w = gVar.f40509b;
            this.x = gVar.f40510c;
            this.y = gVar.f40511d;
        }
    }

    public void removeView(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f40481a, false, 33817, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f40481a, false, 33817, new Class[]{View.class}, Void.TYPE);
        } else if (this.I) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:6|(3:8|9|10)|11|12|13) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0053 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setChildrenDrawingOrderEnabledCompat(boolean r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r10)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f40481a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 33797(0x8405, float:4.736E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003a
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r10)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f40481a
            r3 = 0
            r4 = 33797(0x8405, float:4.736E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003a:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 7
            if (r0 < r1) goto L_0x0061
            java.lang.reflect.Method r0 = r9.aj
            if (r0 != 0) goto L_0x0053
            java.lang.Class<android.view.ViewGroup> r0 = android.view.ViewGroup.class
            java.lang.String r1 = "setChildrenDrawingOrderEnabled"
            java.lang.Class[] r2 = new java.lang.Class[r7]     // Catch:{ NoSuchMethodException -> 0x0053 }
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch:{ NoSuchMethodException -> 0x0053 }
            r2[r8] = r3     // Catch:{ NoSuchMethodException -> 0x0053 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch:{ NoSuchMethodException -> 0x0053 }
            r9.aj = r0     // Catch:{ NoSuchMethodException -> 0x0053 }
        L_0x0053:
            java.lang.reflect.Method r0 = r9.aj     // Catch:{ Exception -> 0x0061 }
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0061 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)     // Catch:{ Exception -> 0x0061 }
            r1[r8] = r2     // Catch:{ Exception -> 0x0061 }
            r0.invoke(r9, r1)     // Catch:{ Exception -> 0x0061 }
            return
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.widget.VerticalViewPager.setChildrenDrawingOrderEnabledCompat(boolean):void");
    }

    public void setCurrentItem(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40481a, false, 33787, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40481a, false, 33787, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.K = false;
        a(i2, !this.ac, false);
    }

    public void setOffscreenPageLimit(int i2) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40481a, false, 33799, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40481a, false, 33799, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 <= 0) {
            i3 = 1;
        } else {
            i3 = i2;
        }
        if (i3 != this.L) {
            this.L = i3;
            b();
        }
    }

    public void setPageMargin(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40481a, false, 33800, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40481a, false, 33800, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        int i3 = this.C;
        this.C = i2;
        int height = getHeight();
        a(height, height, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40481a, false, 33802, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40481a, false, 33802, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        setPageMarginDrawable(com.ss.android.ugc.bytex.a.a.a.a(getContext().getResources(), i2));
    }

    public void setScrollState(int i2) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40481a, false, 33783, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40481a, false, 33783, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.ao != i2) {
            this.ao = i2;
            if (this.ai != null) {
                if (i2 == 0) {
                    z2 = false;
                }
                b(z2);
            }
            if (this.o != null && !this.o.isEmpty()) {
                for (ViewPager.OnPageChangeListener onPageScrollStateChanged : this.o) {
                    onPageScrollStateChanged.onPageScrollStateChanged(i2);
                }
            }
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = drawable;
        if (PatchProxy.isSupport(new Object[]{drawable2}, this, f40481a, false, 33803, new Class[]{Drawable.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{drawable2}, this, f40481a, false, 33803, new Class[]{Drawable.class}, Boolean.TYPE)).booleanValue();
        }
        if (!super.verifyDrawable(drawable)) {
            if (drawable2 == this.D) {
                return true;
            }
            return false;
        }
        return true;
    }

    private void b(boolean z2) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f40481a, false, 33831, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f40481a, false, 33831, new Class[]{Boolean.TYPE}, Void.TYPE);
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

    private void c(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f40481a, false, 33835, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f40481a, false, 33835, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{keyEvent}, this, f40481a, false, 33848, new Class[]{KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{keyEvent}, this, f40481a, false, 33848, new Class[]{KeyEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (PatchProxy.isSupport(new Object[]{keyEvent}, this, f40481a, false, 33849, new Class[]{KeyEvent.class}, Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{keyEvent}, this, f40481a, false, 33849, new Class[]{KeyEvent.class}, Boolean.TYPE)).booleanValue();
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
                    } else if (keyEvent.hasNoModifiers()) {
                        z2 = d(2);
                    } else if (keyEvent.hasModifiers(1)) {
                        z2 = d(1);
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

    public void draw(Canvas canvas) {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f40481a, false, 33839, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f40481a, false, 33839, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        try {
            super.draw(canvas);
        } catch (Exception e2) {
            Exception exc = e2;
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) exc);
            ExceptionMonitor.ensureNotReachHere((Throwable) exc, "VerticalViewPager");
        }
        int overScrollMode = ViewCompat.getOverScrollMode(this);
        if (overScrollMode == 0 || (overScrollMode == 1 && this.f40485e != null && this.f40485e.getCount() > 1)) {
            if (!this.aa.isFinished()) {
                int save = canvas.save();
                int height = getHeight();
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.translate((float) getPaddingLeft(), this.g * ((float) height));
                this.aa.setSize(width, height);
                z2 = false | this.aa.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.ab.isFinished()) {
                int save2 = canvas.save();
                int height2 = getHeight();
                int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.rotate(180.0f);
                canvas.translate((float) ((-width2) - getPaddingLeft()), (-(this.h + 1.0f)) * ((float) height2));
                this.ab.setSize(width2, height2);
                z2 |= this.ab.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.aa.finish();
            this.ab.finish();
        }
        if (z2) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void onDraw(Canvas canvas) {
        float f2;
        float f3;
        float f4;
        float f5;
        Canvas canvas2 = canvas;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{canvas2}, this, f40481a, false, 33840, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2}, this, f40481a, false, 33840, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        if (this.C > 0 && this.D != null && this.f40484d.size() > 0 && this.f40485e != null) {
            int scrollY = getScrollY();
            int height = getHeight();
            float f6 = (float) height;
            float f7 = ((float) this.C) / f6;
            c cVar = this.f40484d.get(0);
            float f8 = cVar.f40499e;
            int size = this.f40484d.size();
            int i3 = cVar.f40496b;
            int i4 = this.f40484d.get(size - 1).f40496b;
            while (i3 < i4) {
                while (i3 > cVar.f40496b && i2 < size) {
                    i2++;
                    cVar = this.f40484d.get(i2);
                }
                if (i3 == cVar.f40496b) {
                    f3 = (cVar.f40499e + cVar.f40498d) * f6;
                    f2 = cVar.f40499e + cVar.f40498d + f7;
                } else {
                    float pageWidth = this.f40485e.getPageWidth(i3);
                    f2 = f8 + pageWidth + f7;
                    f3 = (f8 + pageWidth) * f6;
                }
                if (((float) this.C) + f3 > ((float) scrollY)) {
                    f5 = f7;
                    f4 = f6;
                    this.D.setBounds(this.E, (int) f3, this.F, (int) (((float) this.C) + f3 + 0.5f));
                    this.D.draw(canvas2);
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

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{drawable}, this, f40481a, false, 33801, new Class[]{Drawable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable}, this, f40481a, false, 33801, new Class[]{Drawable.class}, Void.TYPE);
            return;
        }
        this.D = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        if (drawable != null) {
            z2 = false;
        }
        setWillNotDraw(z2);
        invalidate();
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean d(int r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f40481a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r3 = 0
            r4 = 33850(0x843a, float:4.7434E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0041
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f40481a
            r3 = 0
            r4 = 33850(0x843a, float:4.7434E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0041:
            android.view.View r0 = r9.findFocus()
            if (r0 == r9) goto L_0x008a
            if (r0 == 0) goto L_0x008b
            android.view.ViewParent r1 = r0.getParent()
        L_0x004d:
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x005a
            if (r1 != r9) goto L_0x0055
            r1 = 1
            goto L_0x005b
        L_0x0055:
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x004d
        L_0x005a:
            r1 = 0
        L_0x005b:
            if (r1 != 0) goto L_0x008b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            android.view.ViewParent r0 = r0.getParent()
        L_0x0071:
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x008a
            java.lang.String r2 = " => "
            r1.append(r2)
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0071
        L_0x008a:
            r0 = 0
        L_0x008b:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r9, r0, r10)
            r2 = 130(0x82, float:1.82E-43)
            r3 = 33
            if (r1 == 0) goto L_0x00db
            if (r1 == r0) goto L_0x00db
            if (r10 != r3) goto L_0x00bb
            android.graphics.Rect r2 = r9.v
            android.graphics.Rect r2 = r9.a((android.graphics.Rect) r2, (android.view.View) r1)
            int r2 = r2.top
            android.graphics.Rect r3 = r9.v
            android.graphics.Rect r3 = r9.a((android.graphics.Rect) r3, (android.view.View) r0)
            int r3 = r3.top
            if (r0 == 0) goto L_0x00b6
            if (r2 < r3) goto L_0x00b6
            boolean r8 = r9.i()
            goto L_0x00ee
        L_0x00b6:
            boolean r8 = r1.requestFocus()
            goto L_0x00ee
        L_0x00bb:
            if (r10 != r2) goto L_0x00ee
            android.graphics.Rect r2 = r9.v
            android.graphics.Rect r2 = r9.a((android.graphics.Rect) r2, (android.view.View) r1)
            int r2 = r2.bottom
            android.graphics.Rect r3 = r9.v
            android.graphics.Rect r3 = r9.a((android.graphics.Rect) r3, (android.view.View) r0)
            int r3 = r3.bottom
            if (r0 == 0) goto L_0x00d6
            if (r2 > r3) goto L_0x00d6
            boolean r8 = r9.j()
            goto L_0x00ee
        L_0x00d6:
            boolean r8 = r1.requestFocus()
            goto L_0x00ee
        L_0x00db:
            if (r10 == r3) goto L_0x00ea
            if (r10 != r7) goto L_0x00e0
            goto L_0x00ea
        L_0x00e0:
            if (r10 == r2) goto L_0x00e5
            r0 = 2
            if (r10 != r0) goto L_0x00ee
        L_0x00e5:
            boolean r8 = r9.j()
            goto L_0x00ee
        L_0x00ea:
            boolean r8 = r9.i()
        L_0x00ee:
            if (r8 == 0) goto L_0x00f7
            int r0 = android.view.SoundEffectConstants.getContantForFocusDirection(r10)
            r9.playSoundEffect(r0)
        L_0x00f7:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.widget.VerticalViewPager.d(int):boolean");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f2;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f40481a, false, 33833, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f40481a, false, 33833, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.q) {
            return false;
        } else {
            try {
                if (this.m) {
                    return true;
                }
                if ((motionEvent.getAction() != 0 || motionEvent.getEdgeFlags() == 0) && this.f40485e != null) {
                    if (this.f40485e.getCount() != 0) {
                        if (this.l == null) {
                            this.l = VelocityTracker.obtain();
                        }
                        this.l.addMovement(motionEvent);
                        switch (motionEvent.getAction() & 255) {
                            case 0:
                                this.z.abortAnimation();
                                this.K = false;
                                b();
                                this.Q = motionEvent.getX();
                                this.R = motionEvent.getX();
                                this.j = motionEvent.getY();
                                this.k = motionEvent.getY();
                                this.S = motionEvent.getPointerId(0);
                                break;
                            case 1:
                                if (this.i) {
                                    VelocityTracker velocityTracker = this.l;
                                    velocityTracker.computeCurrentVelocity(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, (float) this.U);
                                    int yVelocity = (int) VelocityTrackerCompat.getYVelocity(velocityTracker, this.S);
                                    this.K = true;
                                    int clientHeight = getClientHeight();
                                    int scrollY = getScrollY();
                                    c g2 = g();
                                    if (g2 != null) {
                                        float f3 = (float) clientHeight;
                                        a(a(g2.f40496b, ((((float) scrollY) / f3) - g2.f40499e) / (g2.f40498d + (((float) this.C) / f3)), yVelocity, (int) (motionEvent.getY(motionEvent.findPointerIndex(this.S)) - this.k)), true, true, yVelocity);
                                    }
                                    z2 = f();
                                    break;
                                }
                                break;
                            case 2:
                                if (!this.i) {
                                    int findPointerIndex = motionEvent.findPointerIndex(this.S);
                                    if (findPointerIndex == -1) {
                                        z2 = f();
                                        break;
                                    } else {
                                        float y2 = motionEvent.getY(findPointerIndex);
                                        float abs = Math.abs(y2 - this.j);
                                        float x2 = motionEvent.getX(findPointerIndex);
                                        float abs2 = Math.abs(x2 - this.Q);
                                        if (abs > ((float) this.P) && abs > abs2) {
                                            this.i = true;
                                            c(true);
                                            if (y2 - this.k > 0.0f) {
                                                f2 = this.k + ((float) this.P);
                                            } else {
                                                f2 = this.k - ((float) this.P);
                                            }
                                            this.j = f2;
                                            this.Q = x2;
                                            setScrollState(1);
                                            setScrollingCacheEnabled(true);
                                            ViewParent parent = getParent();
                                            if (parent != null) {
                                                parent.requestDisallowInterceptTouchEvent(true);
                                            }
                                        }
                                    }
                                }
                                if (this.i) {
                                    z2 = false | a(motionEvent.getY(motionEvent.findPointerIndex(this.S)));
                                    break;
                                }
                                break;
                            case 3:
                                if (this.i) {
                                    a(this.f40486f, true, 0, false);
                                    z2 = f();
                                    break;
                                }
                                break;
                            case 5:
                                int actionIndex = motionEvent.getActionIndex();
                                this.j = motionEvent.getY(actionIndex);
                                this.S = motionEvent.getPointerId(actionIndex);
                                break;
                            case 6:
                                a(motionEvent);
                                this.j = motionEvent.getY(motionEvent.findPointerIndex(this.S));
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
            } catch (IllegalStateException unused2) {
                if (this.f40485e.getCount() != this.s) {
                    this.f40485e.notifyDataSetChanged();
                }
            }
        }
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        if (PatchProxy.isSupport(new Object[]{pagerAdapter}, this, f40481a, false, 33784, new Class[]{PagerAdapter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pagerAdapter}, this, f40481a, false, 33784, new Class[]{PagerAdapter.class}, Void.TYPE);
            return;
        }
        if (this.f40485e != null) {
            a(this.f40485e, (f) null);
            this.f40485e.startUpdate((ViewGroup) this);
            for (int i2 = 0; i2 < this.f40484d.size(); i2++) {
                c cVar = this.f40484d.get(i2);
                this.f40485e.destroyItem((ViewGroup) this, cVar.f40496b, cVar.f40495a);
            }
            this.f40485e.finishUpdate((ViewGroup) this);
            this.f40484d.clear();
            if (PatchProxy.isSupport(new Object[0], this, f40481a, false, 33785, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f40481a, false, 33785, new Class[0], Void.TYPE);
            } else {
                int i3 = 0;
                while (i3 < getChildCount()) {
                    if (!((d) getChildAt(i3).getLayoutParams()).f40500a) {
                        removeViewAt(i3);
                        i3--;
                    }
                    i3++;
                }
            }
            this.f40486f = 0;
            scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter2 = this.f40485e;
        this.f40485e = pagerAdapter;
        this.s = 0;
        if (this.f40485e != null) {
            if (this.B == null) {
                this.B = new f(this, (byte) 0);
            }
            a(this.f40485e, this.B);
            this.K = false;
            boolean z2 = this.ac;
            this.ac = true;
            this.s = this.f40485e.getCount();
            if (this.w >= 0) {
                this.f40485e.restoreState(this.x, this.y);
                a(this.w, false, true);
                this.w = -1;
                this.x = null;
                this.y = null;
            } else if (!z2) {
                b();
            } else {
                requestLayout();
            }
        }
        if (!(this.ah == null || pagerAdapter2 == pagerAdapter)) {
            this.ah.a(pagerAdapter2, pagerAdapter);
        }
    }

    private c a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f40481a, false, 33818, new Class[]{View.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{view}, this, f40481a, false, 33818, new Class[]{View.class}, c.class);
        }
        for (int i2 = 0; i2 < this.f40484d.size(); i2++) {
            c cVar = this.f40484d.get(i2);
            if (this.f40485e.isViewFromObject(view, cVar.f40495a)) {
                return cVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ab, code lost:
        if (r8.f40496b == r7.f40486f) goto L_0x00b2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(int r18) {
        /*
            r17 = this;
            r7 = r17
            r8 = r18
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r10 = 0
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f40481a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 33811(0x8413, float:4.738E-41)
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0040
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f40481a
            r3 = 0
            r4 = 33811(0x8413, float:4.738E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0040:
            r0 = 2
            int r1 = r7.f40486f
            if (r1 == r8) goto L_0x0057
            int r0 = r7.f40486f
            if (r0 >= r8) goto L_0x004c
            r0 = 130(0x82, float:1.82E-43)
            goto L_0x004e
        L_0x004c:
            r0 = 33
        L_0x004e:
            int r1 = r7.f40486f
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$c r1 = r7.c((int) r1)
            r7.f40486f = r8
            goto L_0x0058
        L_0x0057:
            r1 = 0
        L_0x0058:
            android.support.v4.view.PagerAdapter r3 = r7.f40485e
            if (r3 != 0) goto L_0x0060
            r17.e()
            return
        L_0x0060:
            boolean r3 = r7.K
            if (r3 == 0) goto L_0x0068
            r17.e()
            return
        L_0x0068:
            android.os.IBinder r3 = r17.getWindowToken()
            if (r3 != 0) goto L_0x006f
            return
        L_0x006f:
            android.support.v4.view.PagerAdapter r3 = r7.f40485e
            r3.startUpdate((android.view.ViewGroup) r7)
            int r3 = r7.L
            int r4 = r7.f40486f
            int r4 = r4 - r3
            int r4 = java.lang.Math.max(r10, r4)
            android.support.v4.view.PagerAdapter r5 = r7.f40485e
            int r5 = r5.getCount()
            int r6 = r5 + -1
            int r8 = r7.f40486f
            int r8 = r8 + r3
            int r3 = java.lang.Math.min(r6, r8)
            int r6 = r7.s
            if (r5 != r6) goto L_0x025f
            r6 = 0
        L_0x0091:
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$c> r8 = r7.f40484d
            int r8 = r8.size()
            if (r6 >= r8) goto L_0x00b1
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$c> r8 = r7.f40484d
            java.lang.Object r8 = r8.get(r6)
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$c r8 = (com.ss.android.ugc.aweme.common.widget.VerticalViewPager.c) r8
            int r11 = r8.f40496b
            int r12 = r7.f40486f
            if (r11 < r12) goto L_0x00ae
            int r11 = r8.f40496b
            int r12 = r7.f40486f
            if (r11 != r12) goto L_0x00b1
            goto L_0x00b2
        L_0x00ae:
            int r6 = r6 + 1
            goto L_0x0091
        L_0x00b1:
            r8 = 0
        L_0x00b2:
            if (r8 != 0) goto L_0x00bc
            if (r5 <= 0) goto L_0x00bc
            int r8 = r7.f40486f
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$c r8 = r7.a((int) r8, (int) r6)
        L_0x00bc:
            if (r8 == 0) goto L_0x01de
            int r12 = r6 + -1
            if (r12 < 0) goto L_0x00cb
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$c> r13 = r7.f40484d
            java.lang.Object r13 = r13.get(r12)
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$c r13 = (com.ss.android.ugc.aweme.common.widget.VerticalViewPager.c) r13
            goto L_0x00cc
        L_0x00cb:
            r13 = 0
        L_0x00cc:
            int r14 = r17.getClientHeight()
            r15 = 1073741824(0x40000000, float:2.0)
            if (r14 > 0) goto L_0x00d6
            r11 = 0
            goto L_0x00e3
        L_0x00d6:
            float r2 = r8.f40498d
            float r2 = r15 - r2
            int r10 = r17.getPaddingLeft()
            float r10 = (float) r10
            float r11 = (float) r14
            float r10 = r10 / r11
            float r11 = r2 + r10
        L_0x00e3:
            int r2 = r7.f40486f
            int r2 = r2 - r9
            r10 = r6
            r6 = 0
        L_0x00e8:
            if (r2 < 0) goto L_0x0147
            int r16 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r16 < 0) goto L_0x0115
            if (r2 >= r4) goto L_0x0115
            if (r13 == 0) goto L_0x0147
            int r9 = r13.f40496b
            if (r2 != r9) goto L_0x0143
            boolean r9 = r13.f40497c
            if (r9 != 0) goto L_0x0143
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$c> r9 = r7.f40484d
            r9.remove(r12)
            android.support.v4.view.PagerAdapter r9 = r7.f40485e
            java.lang.Object r13 = r13.f40495a
            r9.destroyItem((android.view.ViewGroup) r7, (int) r2, (java.lang.Object) r13)
            int r12 = r12 + -1
            int r10 = r10 + -1
            if (r12 < 0) goto L_0x0141
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$c> r9 = r7.f40484d
            java.lang.Object r9 = r9.get(r12)
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$c r9 = (com.ss.android.ugc.aweme.common.widget.VerticalViewPager.c) r9
            goto L_0x0142
        L_0x0115:
            if (r13 == 0) goto L_0x012b
            int r9 = r13.f40496b
            if (r2 != r9) goto L_0x012b
            float r9 = r13.f40498d
            float r6 = r6 + r9
            int r12 = r12 + -1
            if (r12 < 0) goto L_0x0141
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$c> r9 = r7.f40484d
            java.lang.Object r9 = r9.get(r12)
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$c r9 = (com.ss.android.ugc.aweme.common.widget.VerticalViewPager.c) r9
            goto L_0x0142
        L_0x012b:
            int r9 = r12 + 1
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$c r9 = r7.a((int) r2, (int) r9)
            float r9 = r9.f40498d
            float r6 = r6 + r9
            int r10 = r10 + 1
            if (r12 < 0) goto L_0x0141
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$c> r9 = r7.f40484d
            java.lang.Object r9 = r9.get(r12)
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$c r9 = (com.ss.android.ugc.aweme.common.widget.VerticalViewPager.c) r9
            goto L_0x0142
        L_0x0141:
            r9 = 0
        L_0x0142:
            r13 = r9
        L_0x0143:
            int r2 = r2 + -1
            r9 = 1
            goto L_0x00e8
        L_0x0147:
            float r2 = r8.f40498d
            int r4 = r10 + 1
            int r6 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r6 >= 0) goto L_0x01db
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$c> r6 = r7.f40484d
            int r6 = r6.size()
            if (r4 >= r6) goto L_0x0160
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$c> r6 = r7.f40484d
            java.lang.Object r6 = r6.get(r4)
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$c r6 = (com.ss.android.ugc.aweme.common.widget.VerticalViewPager.c) r6
            goto L_0x0161
        L_0x0160:
            r6 = 0
        L_0x0161:
            if (r14 > 0) goto L_0x0165
            r11 = 0
            goto L_0x016e
        L_0x0165:
            int r9 = r17.getPaddingRight()
            float r9 = (float) r9
            float r11 = (float) r14
            float r9 = r9 / r11
            float r11 = r9 + r15
        L_0x016e:
            int r9 = r7.f40486f
            r12 = 1
            int r9 = r9 + r12
        L_0x0172:
            if (r9 >= r5) goto L_0x01db
            int r12 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r12 < 0) goto L_0x01a3
            if (r9 <= r3) goto L_0x01a3
            if (r6 == 0) goto L_0x01db
            int r12 = r6.f40496b
            if (r9 != r12) goto L_0x01d8
            boolean r12 = r6.f40497c
            if (r12 != 0) goto L_0x01d8
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$c> r12 = r7.f40484d
            r12.remove(r4)
            android.support.v4.view.PagerAdapter r12 = r7.f40485e
            java.lang.Object r6 = r6.f40495a
            r12.destroyItem((android.view.ViewGroup) r7, (int) r9, (java.lang.Object) r6)
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$c> r6 = r7.f40484d
            int r6 = r6.size()
            if (r4 >= r6) goto L_0x01a1
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$c> r6 = r7.f40484d
            java.lang.Object r6 = r6.get(r4)
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$c r6 = (com.ss.android.ugc.aweme.common.widget.VerticalViewPager.c) r6
            goto L_0x01d8
        L_0x01a1:
            r6 = 0
            goto L_0x01d8
        L_0x01a3:
            if (r6 == 0) goto L_0x01bf
            int r12 = r6.f40496b
            if (r9 != r12) goto L_0x01bf
            float r6 = r6.f40498d
            float r2 = r2 + r6
            int r4 = r4 + 1
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$c> r6 = r7.f40484d
            int r6 = r6.size()
            if (r4 >= r6) goto L_0x01a1
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$c> r6 = r7.f40484d
            java.lang.Object r6 = r6.get(r4)
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$c r6 = (com.ss.android.ugc.aweme.common.widget.VerticalViewPager.c) r6
            goto L_0x01d8
        L_0x01bf:
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$c r6 = r7.a((int) r9, (int) r4)
            int r4 = r4 + 1
            float r6 = r6.f40498d
            float r2 = r2 + r6
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$c> r6 = r7.f40484d
            int r6 = r6.size()
            if (r4 >= r6) goto L_0x01a1
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$c> r6 = r7.f40484d
            java.lang.Object r6 = r6.get(r4)
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$c r6 = (com.ss.android.ugc.aweme.common.widget.VerticalViewPager.c) r6
        L_0x01d8:
            int r9 = r9 + 1
            goto L_0x0172
        L_0x01db:
            r7.a((com.ss.android.ugc.aweme.common.widget.VerticalViewPager.c) r8, (int) r10, (com.ss.android.ugc.aweme.common.widget.VerticalViewPager.c) r1)
        L_0x01de:
            android.support.v4.view.PagerAdapter r1 = r7.f40485e
            int r2 = r7.f40486f
            if (r8 == 0) goto L_0x01e7
            java.lang.Object r3 = r8.f40495a
            goto L_0x01e8
        L_0x01e7:
            r3 = 0
        L_0x01e8:
            r1.setPrimaryItem((android.view.ViewGroup) r7, (int) r2, (java.lang.Object) r3)
            android.support.v4.view.PagerAdapter r1 = r7.f40485e
            r1.finishUpdate((android.view.ViewGroup) r7)
            int r1 = r17.getChildCount()
            r2 = 0
        L_0x01f5:
            if (r2 >= r1) goto L_0x0221
            android.view.View r3 = r7.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$d r4 = (com.ss.android.ugc.aweme.common.widget.VerticalViewPager.d) r4
            r4.f40505f = r2
            boolean r5 = r4.f40500a
            if (r5 != 0) goto L_0x021d
            float r5 = r4.f40502c
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x021e
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$c r3 = r7.a((android.view.View) r3)
            if (r3 == 0) goto L_0x021e
            float r5 = r3.f40498d
            r4.f40502c = r5
            int r3 = r3.f40496b
            r4.f40504e = r3
            goto L_0x021e
        L_0x021d:
            r6 = 0
        L_0x021e:
            int r2 = r2 + 1
            goto L_0x01f5
        L_0x0221:
            r17.e()
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x025e
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x0235
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$c r2 = r7.b((android.view.View) r1)
            goto L_0x0236
        L_0x0235:
            r2 = 0
        L_0x0236:
            if (r2 == 0) goto L_0x023e
            int r1 = r2.f40496b
            int r2 = r7.f40486f
            if (r1 == r2) goto L_0x025e
        L_0x023e:
            r1 = 0
        L_0x023f:
            int r2 = r17.getChildCount()
            if (r1 >= r2) goto L_0x025e
            android.view.View r2 = r7.getChildAt(r1)
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$c r3 = r7.a((android.view.View) r2)
            if (r3 == 0) goto L_0x025b
            int r3 = r3.f40496b
            int r4 = r7.f40486f
            if (r3 != r4) goto L_0x025b
            boolean r2 = r2.requestFocus(r0)
            if (r2 != 0) goto L_0x025e
        L_0x025b:
            int r1 = r1 + 1
            goto L_0x023f
        L_0x025e:
            return
        L_0x025f:
            android.content.res.Resources r0 = r17.getResources()     // Catch:{ NotFoundException -> 0x026c }
            int r1 = r17.getId()     // Catch:{ NotFoundException -> 0x026c }
            java.lang.String r0 = r0.getResourceName(r1)     // Catch:{ NotFoundException -> 0x026c }
            goto L_0x0274
        L_0x026c:
            int r0 = r17.getId()
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
        L_0x0274:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r2.<init>(r3)
            int r3 = r7.s
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
            android.support.v4.view.PagerAdapter r0 = r7.f40485e
            java.lang.Class r0 = r0.getClass()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.widget.VerticalViewPager.b(int):void");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i2;
        float f2;
        float f3;
        boolean z2;
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f40481a, false, 33832, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f40481a, false, 33832, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.q) {
            return false;
        } else {
            try {
                if (this.m) {
                    return false;
                }
                int action = motionEvent.getAction() & 255;
                if (action != 3) {
                    if (action != 1) {
                        if (action != 0) {
                            if (this.i) {
                                return true;
                            }
                            if (this.M) {
                                return false;
                            }
                        }
                        if (action == 0) {
                            this.Q = motionEvent.getX();
                            this.R = motionEvent.getX();
                            this.j = motionEvent.getY();
                            this.k = motionEvent.getY();
                            this.S = motionEvent2.getPointerId(0);
                            this.M = false;
                            this.A = true;
                            this.z.computeScrollOffset();
                            if (this.ao != 2 || Math.abs(this.z.getFinalY() - this.z.getCurrY()) <= this.W) {
                                a(false);
                                this.i = false;
                            } else {
                                this.z.abortAnimation();
                                this.K = false;
                                b();
                                this.i = true;
                                c(true);
                                setScrollState(1);
                            }
                        } else if (action == 2) {
                            int i3 = this.S;
                            if (i3 != -1) {
                                int findPointerIndex = motionEvent2.findPointerIndex(i3);
                                float y2 = motionEvent2.getY(findPointerIndex);
                                float f4 = y2 - this.j;
                                float abs = Math.abs(f4);
                                float x2 = motionEvent2.getX(findPointerIndex);
                                float abs2 = Math.abs(x2 - this.R);
                                if (f4 != 0.0f) {
                                    float f5 = this.j;
                                    float f6 = f5;
                                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(f5), Float.valueOf(f4)}, this, f40481a, false, 33830, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                                        z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f6), Float.valueOf(f4)}, this, f40481a, false, 33830, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
                                    } else if ((f6 >= ((float) this.O) || f4 <= 0.0f) && (f6 <= ((float) (getHeight() - this.O)) || f4 >= 0.0f)) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    if (!z2) {
                                        if (a(this, false, (int) f4, (int) x2, (int) y2)) {
                                            this.Q = x2;
                                            this.j = y2;
                                            this.M = true;
                                            return false;
                                        }
                                    }
                                }
                                AbTestManager a2 = AbTestManager.a();
                                if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71694, new Class[0], Integer.TYPE)) {
                                    i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71694, new Class[0], Integer.TYPE)).intValue();
                                } else {
                                    a2.r = 0;
                                    AbTestModel d2 = a2.d();
                                    if (d2 != null) {
                                        a2.r = Integer.valueOf(d2.feedTouchAreaStrategy);
                                    }
                                    i2 = a2.r.intValue();
                                }
                                if (i2 == 0) {
                                    f2 = 0.5f;
                                } else {
                                    f2 = 1.0f;
                                }
                                if (abs <= ((float) this.P) || abs * f2 <= abs2) {
                                    if (abs2 > ((float) this.P)) {
                                        this.M = true;
                                    }
                                    AwemeAppData.p().aq = false;
                                } else {
                                    this.i = true;
                                    c(true);
                                    setScrollState(1);
                                    if (f4 > 0.0f) {
                                        f3 = this.k + ((float) this.P);
                                    } else {
                                        f3 = this.k - ((float) this.P);
                                    }
                                    this.j = f3;
                                    this.Q = x2;
                                    setScrollingCacheEnabled(true);
                                    AwemeAppData.p().aq = true;
                                }
                                if (this.i && a(y2)) {
                                    ViewCompat.postInvalidateOnAnimation(this);
                                }
                            }
                        } else if (action == 6) {
                            a(motionEvent);
                        }
                        if (this.l == null) {
                            this.l = VelocityTracker.obtain();
                        }
                        this.l.addMovement(motionEvent2);
                        return this.i;
                    }
                }
                f();
                return false;
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    private c a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f40481a, false, 33808, new Class[]{Integer.TYPE, Integer.TYPE}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f40481a, false, 33808, new Class[]{Integer.TYPE, Integer.TYPE}, c.class);
        }
        c cVar = new c();
        cVar.f40496b = i2;
        cVar.f40495a = this.f40485e.instantiateItem((ViewGroup) this, i2);
        cVar.f40498d = this.f40485e.getPageWidth(i2);
        if (i3 < 0 || i3 >= this.f40484d.size()) {
            this.f40484d.add(cVar);
        } else {
            this.f40484d.add(i3, cVar);
        }
        return cVar;
    }

    public int getChildDrawingOrder(int i2, int i3) {
        int i4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f40481a, false, 33798, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f40481a, false, 33798, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        if (this.ak == 2) {
            i4 = (i2 - 1) - i3;
        } else {
            i4 = i3;
        }
        return ((d) this.al.get(i4).getLayoutParams()).f40505f;
    }

    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), rect}, this, f40481a, false, 33856, new Class[]{Integer.TYPE, Rect.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), rect}, this, f40481a, false, 33856, new Class[]{Integer.TYPE, Rect.class}, Boolean.TYPE)).booleanValue();
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
                c a2 = a(childAt);
                if (a2 != null && a2.f40496b == this.f40486f && childAt.requestFocus(i2, rect)) {
                    return true;
                }
            }
            i4 += i3;
        }
        return false;
    }

    public VerticalViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d();
    }

    private Rect a(Rect rect, View view) {
        Rect rect2;
        if (PatchProxy.isSupport(new Object[]{rect, view}, this, f40481a, false, 33851, new Class[]{Rect.class, View.class}, Rect.class)) {
            return (Rect) PatchProxy.accessDispatch(new Object[]{rect, view}, this, f40481a, false, 33851, new Class[]{Rect.class, View.class}, Rect.class);
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

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010a  */
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
            com.meituan.robust.ChangeQuickRedirect r2 = f40481a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 33822(0x841e, float:4.7395E-41)
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0053
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f40481a
            r3 = 0
            r4 = 33822(0x841e, float:4.7395E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0053:
            r0 = r17
            int r0 = getDefaultSize(r9, r0)
            r1 = r18
            int r1 = getDefaultSize(r9, r1)
            r7.setMeasuredDimension(r0, r1)
            int r0 = r16.getMeasuredHeight()
            int r1 = r0 / 10
            int r2 = r7.N
            int r1 = java.lang.Math.min(r1, r2)
            r7.O = r1
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
        L_0x008e:
            r4 = 8
            r5 = 1073741824(0x40000000, float:2.0)
            if (r0 >= r2) goto L_0x0117
            android.view.View r6 = r7.getChildAt(r0)
            int r8 = r6.getVisibility()
            if (r8 == r4) goto L_0x0111
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$d r4 = (com.ss.android.ugc.aweme.common.widget.VerticalViewPager.d) r4
            if (r4 == 0) goto L_0x0111
            boolean r8 = r4.f40500a
            if (r8 == 0) goto L_0x0111
            int r8 = r4.f40501b
            r8 = r8 & 7
            int r11 = r4.f40501b
            r11 = r11 & 112(0x70, float:1.57E-43)
            r12 = 48
            if (r11 == r12) goto L_0x00bd
            r12 = 80
            if (r11 != r12) goto L_0x00bb
            goto L_0x00bd
        L_0x00bb:
            r11 = 0
            goto L_0x00be
        L_0x00bd:
            r11 = 1
        L_0x00be:
            r12 = 3
            if (r8 == r12) goto L_0x00c7
            r12 = 5
            if (r8 != r12) goto L_0x00c5
            goto L_0x00c7
        L_0x00c5:
            r8 = 0
            goto L_0x00c8
        L_0x00c7:
            r8 = 1
        L_0x00c8:
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 == 0) goto L_0x00d1
            r12 = 1073741824(0x40000000, float:2.0)
        L_0x00ce:
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x00d5
        L_0x00d1:
            if (r8 == 0) goto L_0x00ce
            r13 = 1073741824(0x40000000, float:2.0)
        L_0x00d5:
            int r14 = r4.width
            r15 = -1
            r9 = -2
            if (r14 == r9) goto L_0x00e7
            int r12 = r4.width
            if (r12 == r15) goto L_0x00e3
            int r12 = r4.width
            r14 = r12
            goto L_0x00e4
        L_0x00e3:
            r14 = r1
        L_0x00e4:
            r12 = 1073741824(0x40000000, float:2.0)
            goto L_0x00e8
        L_0x00e7:
            r14 = r1
        L_0x00e8:
            int r10 = r4.height
            if (r10 == r9) goto L_0x00f5
            int r9 = r4.height
            if (r9 == r15) goto L_0x00f3
            int r4 = r4.height
            goto L_0x00f7
        L_0x00f3:
            r4 = r3
            goto L_0x00f7
        L_0x00f5:
            r4 = r3
            r5 = r13
        L_0x00f7:
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r12)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r5)
            r6.measure(r9, r4)
            if (r11 == 0) goto L_0x010a
            int r4 = r6.getMeasuredHeight()
            int r3 = r3 - r4
            goto L_0x0111
        L_0x010a:
            if (r8 == 0) goto L_0x0111
            int r4 = r6.getMeasuredWidth()
            int r1 = r1 - r4
        L_0x0111:
            int r0 = r0 + 1
            r9 = 0
            r10 = 1
            goto L_0x008e
        L_0x0117:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r5)
            r7.G = r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r5)
            r7.H = r0
            r0 = 1
            r7.I = r0
            r16.b()
            r0 = 0
            r7.I = r0
            int r1 = r16.getChildCount()
        L_0x0130:
            if (r0 >= r1) goto L_0x015a
            android.view.View r2 = r7.getChildAt(r0)
            int r6 = r2.getVisibility()
            if (r6 == r4) goto L_0x0157
            android.view.ViewGroup$LayoutParams r6 = r2.getLayoutParams()
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$d r6 = (com.ss.android.ugc.aweme.common.widget.VerticalViewPager.d) r6
            if (r6 == 0) goto L_0x0148
            boolean r8 = r6.f40500a
            if (r8 != 0) goto L_0x0157
        L_0x0148:
            float r8 = (float) r3
            float r6 = r6.f40502c
            float r8 = r8 * r6
            int r6 = (int) r8
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r5)
            int r8 = r7.G
            r2.measure(r8, r6)
        L_0x0157:
            int r0 = r0 + 1
            goto L_0x0130
        L_0x015a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.widget.VerticalViewPager.onMeasure(int, int):void");
    }

    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        ArrayList<View> arrayList2 = arrayList;
        int i4 = i3;
        if (PatchProxy.isSupport(new Object[]{arrayList2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f40481a, false, 33854, new Class[]{ArrayList.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arrayList2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f40481a, false, 33854, new Class[]{ArrayList.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                if (childAt.getVisibility() == 0) {
                    c a2 = a(childAt);
                    if (a2 != null && a2.f40496b == this.f40486f) {
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
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i2), layoutParams3}, this, f40481a, false, 33816, new Class[]{View.class, Integer.TYPE, ViewGroup.LayoutParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i2), layoutParams3}, this, f40481a, false, 33816, new Class[]{View.class, Integer.TYPE, ViewGroup.LayoutParams.class}, Void.TYPE);
            return;
        }
        if (!checkLayoutParams(layoutParams3)) {
            layoutParams2 = generateLayoutParams(layoutParams3);
        } else {
            layoutParams2 = layoutParams3;
        }
        d dVar = (d) layoutParams2;
        dVar.f40500a |= view2 instanceof a;
        if (!this.I) {
            super.addView(view2, i3, layoutParams2);
        } else if (dVar == null || !dVar.f40500a) {
            dVar.f40503d = true;
            addViewInLayout(view2, i3, layoutParams2);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d6  */
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
            com.meituan.robust.ChangeQuickRedirect r2 = f40481a
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 33828(0x8424, float:4.7403E-41)
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x006e
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r0[r12] = r1
            java.lang.Float r1 = java.lang.Float.valueOf(r19)
            r0[r13] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            r0[r14] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f40481a
            r3 = 0
            r4 = 33828(0x8424, float:4.7403E-41)
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
        L_0x006e:
            int r0 = r7.af
            if (r0 <= 0) goto L_0x00dd
            int r0 = r17.getScrollY()
            int r1 = r17.getPaddingTop()
            int r2 = r17.getPaddingBottom()
            int r3 = r17.getHeight()
            int r4 = r17.getChildCount()
            r5 = r2
            r2 = r1
            r1 = 0
        L_0x0089:
            if (r1 >= r4) goto L_0x00dd
            android.view.View r6 = r7.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r11 = r6.getLayoutParams()
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$d r11 = (com.ss.android.ugc.aweme.common.widget.VerticalViewPager.d) r11
            boolean r15 = r11.f40500a
            if (r15 == 0) goto L_0x00da
            int r11 = r11.f40501b
            r11 = r11 & 112(0x70, float:1.57E-43)
            r15 = 16
            if (r11 == r15) goto L_0x00be
            r15 = 48
            if (r11 == r15) goto L_0x00b8
            r15 = 80
            if (r11 == r15) goto L_0x00ab
            r11 = r2
            goto L_0x00ce
        L_0x00ab:
            int r11 = r3 - r5
            int r15 = r6.getMeasuredHeight()
            int r11 = r11 - r15
            int r15 = r6.getMeasuredHeight()
            int r5 = r5 + r15
            goto L_0x00c9
        L_0x00b8:
            int r11 = r6.getHeight()
            int r11 = r11 + r2
            goto L_0x00ce
        L_0x00be:
            int r11 = r6.getMeasuredHeight()
            int r11 = r3 - r11
            int r11 = r11 / r14
            int r11 = java.lang.Math.max(r11, r2)
        L_0x00c9:
            r16 = r11
            r11 = r2
            r2 = r16
        L_0x00ce:
            int r2 = r2 + r0
            int r15 = r6.getTop()
            int r2 = r2 - r15
            if (r2 == 0) goto L_0x00d9
            r6.offsetTopAndBottom(r2)
        L_0x00d9:
            r2 = r11
        L_0x00da:
            int r1 = r1 + 1
            goto L_0x0089
        L_0x00dd:
            java.util.List<android.support.v4.view.ViewPager$OnPageChangeListener> r0 = r7.o
            if (r0 == 0) goto L_0x00ff
            java.util.List<android.support.v4.view.ViewPager$OnPageChangeListener> r0 = r7.o
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00ff
            java.util.List<android.support.v4.view.ViewPager$OnPageChangeListener> r0 = r7.o
            java.util.Iterator r0 = r0.iterator()
        L_0x00ef:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00ff
            java.lang.Object r1 = r0.next()
            android.support.v4.view.ViewPager$OnPageChangeListener r1 = (android.support.v4.view.ViewPager.OnPageChangeListener) r1
            r1.onPageScrolled(r8, r9, r10)
            goto L_0x00ef
        L_0x00ff:
            android.support.v4.view.ViewPager$OnPageChangeListener r0 = r7.ag
            if (r0 == 0) goto L_0x0108
            android.support.v4.view.ViewPager$OnPageChangeListener r0 = r7.ag
            r0.onPageScrolled(r8, r9, r10)
        L_0x0108:
            android.support.v4.view.ViewPager$PageTransformer r0 = r7.ai
            if (r0 == 0) goto L_0x0138
            int r0 = r17.getScrollY()
            int r1 = r17.getChildCount()
        L_0x0114:
            if (r12 >= r1) goto L_0x0138
            android.view.View r2 = r7.getChildAt(r12)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$d r3 = (com.ss.android.ugc.aweme.common.widget.VerticalViewPager.d) r3
            boolean r3 = r3.f40500a
            if (r3 != 0) goto L_0x0135
            int r3 = r2.getTop()
            int r3 = r3 - r0
            float r3 = (float) r3
            int r4 = r17.getClientHeight()
            float r4 = (float) r4
            float r3 = r3 / r4
            android.support.v4.view.ViewPager$PageTransformer r4 = r7.ai
            r4.transformPage(r2, r3)
        L_0x0135:
            int r12 = r12 + 1
            goto L_0x0114
        L_0x0138:
            r7.ae = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.widget.VerticalViewPager.a(int, float, int):void");
    }

    private int a(int i2, float f2, int i3, int i4) {
        int i5;
        float f3;
        int i6 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f40481a, false, 33838, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f40481a, false, 33838, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        if (Math.abs(i4) <= this.V || Math.abs(i3) <= this.T) {
            if (i6 >= this.f40486f) {
                f3 = 0.6f;
            } else {
                f3 = 0.4f;
            }
            i5 = (int) (((float) i6) + f2 + f3);
        } else if (i3 > 0) {
            i5 = i6;
        } else {
            i5 = i6 + 1;
        }
        if (this.f40484d.size() > 0) {
            i5 = Math.max(this.f40484d.get(0).f40496b, Math.min(i5, this.f40484d.get(this.f40484d.size() - 1).f40496b));
        }
        return i5;
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        int i6 = i3;
        int i7 = i5;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f40481a, false, 33823, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f40481a, false, 33823, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onSizeChanged(i2, i3, i4, i5);
        if (i6 != i7) {
            a(i6, i7, this.C, this.C);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0128  */
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
            com.meituan.robust.ChangeQuickRedirect r2 = f40481a
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
            r4 = 33825(0x8421, float:4.7399E-41)
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0092
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
            com.meituan.robust.ChangeQuickRedirect r2 = f40481a
            r3 = 0
            r4 = 33825(0x8421, float:4.7399E-41)
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
        L_0x0092:
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
        L_0x00b2:
            r9 = 8
            if (r3 >= r0) goto L_0x0155
            android.view.View r11 = r7.getChildAt(r3)
            int r8 = r11.getVisibility()
            if (r8 == r9) goto L_0x014d
            android.view.ViewGroup$LayoutParams r8 = r11.getLayoutParams()
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$d r8 = (com.ss.android.ugc.aweme.common.widget.VerticalViewPager.d) r8
            boolean r9 = r8.f40500a
            if (r9 == 0) goto L_0x014d
            int r9 = r8.f40501b
            r9 = r9 & 7
            int r8 = r8.f40501b
            r8 = r8 & 112(0x70, float:1.57E-43)
            if (r9 == r10) goto L_0x00f1
            if (r9 == r12) goto L_0x00ea
            r10 = 5
            if (r9 == r10) goto L_0x00db
            r9 = r5
            goto L_0x0105
        L_0x00db:
            int r9 = r1 - r14
            int r17 = r11.getMeasuredWidth()
            int r9 = r9 - r17
            int r17 = r11.getMeasuredWidth()
            int r14 = r14 + r17
            goto L_0x0100
        L_0x00ea:
            r10 = 5
            int r9 = r11.getMeasuredWidth()
            int r9 = r9 + r5
            goto L_0x0105
        L_0x00f1:
            r10 = 5
            int r9 = r11.getMeasuredWidth()
            int r9 = r1 - r9
            r16 = 2
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r5)
        L_0x0100:
            r18 = r9
            r9 = r5
            r5 = r18
        L_0x0105:
            r10 = 16
            if (r8 == r10) goto L_0x0128
            r10 = 48
            if (r8 == r10) goto L_0x0122
            r10 = 80
            if (r8 == r10) goto L_0x0114
            r8 = r4
        L_0x0112:
            r10 = 2
            goto L_0x0139
        L_0x0114:
            int r8 = r2 - r6
            int r10 = r11.getMeasuredHeight()
            int r8 = r8 - r10
            int r10 = r11.getMeasuredHeight()
            int r6 = r6 + r10
            r10 = 2
            goto L_0x0134
        L_0x0122:
            int r8 = r11.getMeasuredHeight()
            int r8 = r8 + r4
            goto L_0x0112
        L_0x0128:
            int r8 = r11.getMeasuredHeight()
            int r8 = r2 - r8
            r10 = 2
            int r8 = r8 / r10
            int r8 = java.lang.Math.max(r8, r4)
        L_0x0134:
            r18 = r8
            r8 = r4
            r4 = r18
        L_0x0139:
            int r4 = r4 + r13
            int r16 = r11.getMeasuredWidth()
            int r10 = r5 + r16
            int r16 = r11.getMeasuredHeight()
            int r12 = r4 + r16
            r11.layout(r5, r4, r10, r12)
            int r15 = r15 + 1
            r4 = r8
            r5 = r9
        L_0x014d:
            int r3 = r3 + 1
            r8 = 5
            r10 = 1
            r11 = 2
            r12 = 3
            goto L_0x00b2
        L_0x0155:
            int r2 = r2 - r4
            int r2 = r2 - r6
            r3 = 0
        L_0x0158:
            if (r3 >= r0) goto L_0x01a7
            android.view.View r6 = r7.getChildAt(r3)
            int r8 = r6.getVisibility()
            if (r8 == r9) goto L_0x01a4
            android.view.ViewGroup$LayoutParams r8 = r6.getLayoutParams()
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$d r8 = (com.ss.android.ugc.aweme.common.widget.VerticalViewPager.d) r8
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$c r10 = r7.a((android.view.View) r6)
            boolean r11 = r8.f40500a
            if (r11 != 0) goto L_0x01a4
            if (r10 == 0) goto L_0x01a4
            float r11 = (float) r2
            float r10 = r10.f40499e
            float r10 = r10 * r11
            int r10 = (int) r10
            int r10 = r10 + r4
            boolean r12 = r8.f40503d
            if (r12 == 0) goto L_0x0197
            r12 = 0
            r8.f40503d = r12
            int r12 = r1 - r5
            int r12 = r12 - r14
            r13 = 1073741824(0x40000000, float:2.0)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r13)
            float r8 = r8.f40502c
            float r11 = r11 * r8
            int r8 = (int) r11
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r13)
            r6.measure(r12, r8)
        L_0x0197:
            int r8 = r6.getMeasuredWidth()
            int r8 = r8 + r5
            int r11 = r6.getMeasuredHeight()
            int r11 = r11 + r10
            r6.layout(r5, r10, r8, r11)
        L_0x01a4:
            int r3 = r3 + 1
            goto L_0x0158
        L_0x01a7:
            r7.E = r5
            int r1 = r1 - r14
            r7.F = r1
            r7.af = r15
            boolean r0 = r7.ac
            if (r0 == 0) goto L_0x01b9
            int r0 = r7.f40486f
            r1 = 0
            r7.a((int) r0, (boolean) r1, (int) r1, (boolean) r1)
            goto L_0x01ba
        L_0x01b9:
            r1 = 0
        L_0x01ba:
            r7.ac = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.widget.VerticalViewPager.onLayout(boolean, int, int, int, int):void");
    }
}
