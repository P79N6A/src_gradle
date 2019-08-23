package com.ss.android.ugc.aweme.story.base.view.viewpager;

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
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.support.v4.widget.EdgeEffectCompat;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public abstract class StoryVerticalViewPager extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72091a;
    private static final f ag = new f();

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f72092b = {16842931};
    private static final Comparator<a> h = new Comparator<a>() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return ((a) obj).f72101b - ((a) obj2).f72101b;
        }
    };
    private static final Interpolator i = new Interpolator() {
        public final float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    };
    private boolean A;
    private int B;
    private boolean C;
    private boolean D;
    private int E;
    private int F;
    private int G;
    private float H;
    private float I;
    private float J;
    private float K;
    private int L;
    private VelocityTracker M;
    private int N;
    private int O;
    private int P;
    private EdgeEffectCompat Q;
    private EdgeEffectCompat R;
    private boolean S;
    private boolean T;
    private boolean U;
    private int V;
    private ArrayList<ViewPager.OnPageChangeListener> W;
    private ViewPager.OnPageChangeListener aa;
    private c ab;
    private ViewPager.PageTransformer ac;
    private Method ad;
    private int ae;
    private ArrayList<View> af;
    private final Runnable ah;
    private int ai;

    /* renamed from: c  reason: collision with root package name */
    public PagerAdapter f72093c;

    /* renamed from: d  reason: collision with root package name */
    public int f72094d;

    /* renamed from: e  reason: collision with root package name */
    protected float f72095e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f72096f;
    private int g;
    private final ArrayList<a> j;
    private final a k;
    private final Rect l;
    private int m;
    private Parcelable n;
    private ClassLoader o;
    private Scroller p;
    private d q;
    private int r;
    private Drawable s;
    private int t;
    private int u;
    private float v;
    private int w;
    private int x;
    private boolean y;
    private boolean z;

    class MyAccessibilityDelegate extends AccessibilityDelegateCompat {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72097a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryVerticalViewPager f72098b;

        private boolean a() {
            if (PatchProxy.isSupport(new Object[0], this, f72097a, false, 82679, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f72097a, false, 82679, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (this.f72098b.f72093c == null || this.f72098b.f72093c.getCount() <= 1) {
                return false;
            } else {
                return true;
            }
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (PatchProxy.isSupport(new Object[]{view, accessibilityEvent}, this, f72097a, false, 82676, new Class[]{View.class, AccessibilityEvent.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, accessibilityEvent}, this, f72097a, false, 82676, new Class[]{View.class, AccessibilityEvent.class}, Void.TYPE);
                return;
            }
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            AccessibilityRecordCompat obtain = AccessibilityRecordCompat.obtain();
            obtain.setScrollable(a());
            if (accessibilityEvent.getEventType() == 4096 && this.f72098b.f72093c != null) {
                obtain.setItemCount(this.f72098b.f72093c.getCount());
                obtain.setFromIndex(this.f72098b.f72094d);
                obtain.setToIndex(this.f72098b.f72094d);
            }
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (PatchProxy.isSupport(new Object[]{view, accessibilityNodeInfoCompat}, this, f72097a, false, 82677, new Class[]{View.class, AccessibilityNodeInfoCompat.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, accessibilityNodeInfoCompat}, this, f72097a, false, 82677, new Class[]{View.class, AccessibilityNodeInfoCompat.class}, Void.TYPE);
                return;
            }
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setClassName(ViewPager.class.getName());
            accessibilityNodeInfoCompat.setScrollable(a());
            if (this.f72098b.a(1)) {
                accessibilityNodeInfoCompat.addAction(4096);
            }
            if (this.f72098b.a(-1)) {
                accessibilityNodeInfoCompat.addAction(8192);
            }
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), bundle}, this, f72097a, false, 82678, new Class[]{View.class, Integer.TYPE, Bundle.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), bundle}, this, f72097a, false, 82678, new Class[]{View.class, Integer.TYPE, Bundle.class}, Boolean.TYPE)).booleanValue();
            } else if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            } else {
                if (i2 != 4096) {
                    if (i2 != 8192 || !this.f72098b.a(-1)) {
                        return false;
                    }
                    this.f72098b.setCurrentItem(this.f72098b.f72094d - 1);
                    return true;
                } else if (!this.f72098b.a(1)) {
                    return false;
                } else {
                    this.f72098b.setCurrentItem(this.f72098b.f72094d + 1);
                    return true;
                }
            }
        }
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        Object f72100a;

        /* renamed from: b  reason: collision with root package name */
        int f72101b;

        /* renamed from: c  reason: collision with root package name */
        boolean f72102c;

        /* renamed from: d  reason: collision with root package name */
        float f72103d;

        /* renamed from: e  reason: collision with root package name */
        float f72104e;

        a() {
        }
    }

    public static class b extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f72105a;

        /* renamed from: b  reason: collision with root package name */
        public int f72106b;

        /* renamed from: c  reason: collision with root package name */
        float f72107c;

        /* renamed from: d  reason: collision with root package name */
        boolean f72108d;

        /* renamed from: e  reason: collision with root package name */
        int f72109e;

        /* renamed from: f  reason: collision with root package name */
        int f72110f;

        public b() {
            super(-1, -1);
        }
    }

    interface c {
    }

    class d extends DataSetObserver {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72111a;

        public final void onChanged() {
            if (PatchProxy.isSupport(new Object[0], this, f72111a, false, 82680, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f72111a, false, 82680, new Class[0], Void.TYPE);
                return;
            }
            StoryVerticalViewPager.this.a();
        }

        public final void onInvalidated() {
            if (PatchProxy.isSupport(new Object[0], this, f72111a, false, 82681, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f72111a, false, 82681, new Class[0], Void.TYPE);
                return;
            }
            StoryVerticalViewPager.this.a();
        }

        private d() {
        }

        /* synthetic */ d(StoryVerticalViewPager storyVerticalViewPager, byte b2) {
            this();
        }
    }

    public static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = ParcelableCompat.newCreator(new StoryVerticalViewPager$SavedState$1());

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72113a;

        /* renamed from: b  reason: collision with root package name */
        int f72114b;

        /* renamed from: c  reason: collision with root package name */
        Parcelable f72115c;

        /* renamed from: d  reason: collision with root package name */
        ClassLoader f72116d;

        public String toString() {
            if (PatchProxy.isSupport(new Object[0], this, f72113a, false, 82683, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f72113a, false, 82683, new Class[0], String.class);
            }
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f72114b + "}";
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        e(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f72114b = parcel.readInt();
            this.f72115c = parcel.readParcelable(classLoader);
            this.f72116d = classLoader;
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, f72113a, false, 82682, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, f72113a, false, 82682, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f72114b);
            parcel.writeParcelable(this.f72115c, i);
        }
    }

    static class f implements Comparator<View> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72117a;

        f() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            View view = (View) obj;
            View view2 = (View) obj2;
            int i = 1;
            if (PatchProxy.isSupport(new Object[]{view, view2}, this, f72117a, false, 82685, new Class[]{View.class, View.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{view, view2}, this, f72117a, false, 82685, new Class[]{View.class, View.class}, Integer.TYPE)).intValue();
            }
            b bVar = (b) view.getLayoutParams();
            b bVar2 = (b) view2.getLayoutParams();
            if (bVar.f72105a == bVar2.f72105a) {
                i = bVar.f72109e - bVar2.f72109e;
            } else if (!bVar.f72105a) {
                return -1;
            }
            return i;
        }
    }

    /* access modifiers changed from: package-private */
    public abstract boolean b();

    /* access modifiers changed from: package-private */
    public abstract boolean c();

    public PagerAdapter getAdapter() {
        return this.f72093c;
    }

    public int getCurrentItem() {
        return this.f72094d;
    }

    public int getOffscreenPageLimit() {
        return this.B;
    }

    public int getPageMargin() {
        return this.r;
    }

    private void a(int i2, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), (byte) 1}, this, f72091a, false, 82603, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), (byte) 1}, this, f72091a, false, 82603, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.A = false;
        a(i2, true, false);
    }

    private void a(int i2, boolean z2, boolean z3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f72091a, false, 82604, new Class[]{Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2), Byte.valueOf(z3)}, this, f72091a, false, 82604, new Class[]{Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(i2, z2, z3, 0);
    }

    private void a(int i2, boolean z2, boolean z3, int i3) {
        int i4;
        int i5 = i2;
        boolean z4 = true;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0), Integer.valueOf(i3)}, this, f72091a, false, 82605, new Class[]{Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2), Byte.valueOf(z3), Integer.valueOf(i3)}, this, f72091a, false, 82605, new Class[]{Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.f72093c == null || this.f72093c.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z3 || this.f72094d != i5 || this.j.size() == 0) {
            if (i5 < 0) {
                i4 = 0;
            } else {
                i4 = i5 >= this.f72093c.getCount() ? this.f72093c.getCount() - 1 : i5;
            }
            int i6 = this.B;
            if (i4 > this.f72094d + i6 || i4 < this.f72094d - i6) {
                for (int i7 = 0; i7 < this.j.size(); i7++) {
                    this.j.get(i7).f72102c = true;
                }
            }
            if (this.f72094d == i4) {
                z4 = false;
            }
            if (this.S) {
                this.f72094d = i4;
                if (z4 && this.W != null) {
                    Iterator<ViewPager.OnPageChangeListener> it2 = this.W.iterator();
                    while (it2.hasNext()) {
                        it2.next().onPageSelected(i4);
                    }
                }
                if (z4 && this.aa != null) {
                    this.aa.onPageSelected(i4);
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
        float f2;
        int i4;
        int i5 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : 0), Integer.valueOf(i3), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f72091a, false, 82606, new Class[]{Integer.TYPE, Boolean.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2), Integer.valueOf(i3), Byte.valueOf(z3)}, this, f72091a, false, 82606, new Class[]{Integer.TYPE, Boolean.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a c2 = c(i2);
        int clientHeight = c2 != null ? (int) (((float) getClientHeight()) * Math.max(this.f72095e, Math.min(c2.f72104e, this.v))) : 0;
        if (z2) {
            if (PatchProxy.isSupport(new Object[]{0, Integer.valueOf(clientHeight), Integer.valueOf(i3)}, this, f72091a, false, 82619, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{0, Integer.valueOf(clientHeight), Integer.valueOf(i3)}, this, f72091a, false, 82619, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int i6 = 0 - scrollX;
                int i7 = clientHeight - scrollY;
                if (i6 == 0 && i7 == 0) {
                    a(false);
                    d();
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientHeight2 = getClientHeight();
                    float f3 = (float) clientHeight2;
                    float min = Math.min(1.0f, (((float) Math.abs(i6)) * 1.0f) / f3);
                    float f4 = (float) (clientHeight2 / 2);
                    float f5 = f3;
                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(min)}, this, f72091a, false, 82617, new Class[]{Float.TYPE}, Float.TYPE)) {
                        f2 = ((Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(min)}, this, f72091a, false, 82617, new Class[]{Float.TYPE}, Float.TYPE)).floatValue();
                    } else {
                        double d2 = (double) (min - 0.5f);
                        Double.isNaN(d2);
                        f2 = (float) Math.sin((double) ((float) (d2 * 0.4712389167638204d)));
                    }
                    float f6 = f4 + (f4 * f2);
                    int abs = Math.abs(i3);
                    if (abs > 0) {
                        i4 = Math.round(Math.abs(f6 / ((float) abs)) * 1000.0f) * 4;
                    } else {
                        i4 = (int) (((((float) Math.abs(i6)) / ((f5 * this.f72093c.getPageWidth(this.f72094d)) + ((float) this.r))) + 1.0f) * 100.0f);
                    }
                    this.p.startScroll(scrollX, scrollY, i6, i7, Math.min(i4, 600));
                    ViewCompat.postInvalidateOnAnimation(this);
                }
            }
            if (z3 && this.W != null) {
                Iterator<ViewPager.OnPageChangeListener> it2 = this.W.iterator();
                while (it2.hasNext()) {
                    it2.next().onPageSelected(i5);
                }
            }
            if (z3 && this.aa != null) {
                this.aa.onPageSelected(i5);
            }
        } else {
            if (z3 && this.W != null) {
                Iterator<ViewPager.OnPageChangeListener> it3 = this.W.iterator();
                while (it3.hasNext()) {
                    it3.next().onPageSelected(i5);
                }
            }
            if (z3 && this.aa != null) {
                this.aa.onPageSelected(i5);
            }
            a(false);
            scrollTo(0, clientHeight);
            d(clientHeight);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f72091a, false, 82621, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72091a, false, 82621, new Class[0], Void.TYPE);
            return;
        }
        int count = this.f72093c.getCount();
        this.g = count;
        boolean z2 = this.j.size() < (this.B * 2) + 1 && this.j.size() < count;
        int i2 = this.f72094d;
        int i3 = 0;
        boolean z3 = false;
        while (i3 < this.j.size()) {
            a aVar = this.j.get(i3);
            int itemPosition = this.f72093c.getItemPosition(aVar.f72100a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.j.remove(i3);
                    i3--;
                    if (!z3) {
                        this.f72093c.startUpdate((ViewGroup) this);
                        z3 = true;
                    }
                    this.f72093c.destroyItem((ViewGroup) this, aVar.f72101b, aVar.f72100a);
                    if (this.f72094d == aVar.f72101b) {
                        i2 = Math.max(0, Math.min(this.f72094d, count - 1));
                    }
                } else if (aVar.f72101b != itemPosition) {
                    if (aVar.f72101b == this.f72094d) {
                        i2 = itemPosition;
                    }
                    aVar.f72101b = itemPosition;
                }
                z2 = true;
            }
            i3++;
        }
        if (z3) {
            this.f72093c.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.j, h);
        if (z2) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                b bVar = (b) getChildAt(i4).getLayoutParams();
                if (!bVar.f72105a) {
                    bVar.f72107c = 0.0f;
                }
            }
            a(i2, false, true);
            requestLayout();
        }
    }

    private void a(a aVar, int i2, a aVar2) {
        a aVar3;
        a aVar4;
        a aVar5 = aVar;
        a aVar6 = aVar2;
        if (PatchProxy.isSupport(new Object[]{aVar5, Integer.valueOf(i2), aVar6}, this, f72091a, false, 82625, new Class[]{a.class, Integer.TYPE, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar5, Integer.valueOf(i2), aVar6}, this, f72091a, false, 82625, new Class[]{a.class, Integer.TYPE, a.class}, Void.TYPE);
            return;
        }
        int count = this.f72093c.getCount();
        int clientHeight = getClientHeight();
        float f2 = clientHeight > 0 ? ((float) this.r) / ((float) clientHeight) : 0.0f;
        if (aVar6 != null) {
            int i3 = aVar6.f72101b;
            if (i3 < aVar5.f72101b) {
                int i4 = i3 + 1;
                float f3 = aVar6.f72104e + aVar6.f72103d + f2;
                int i5 = 0;
                while (i4 <= aVar5.f72101b && i5 < this.j.size()) {
                    Object obj = this.j.get(i5);
                    while (true) {
                        aVar4 = (a) obj;
                        if (i4 > aVar4.f72101b && i5 < this.j.size() - 1) {
                            i5++;
                            obj = this.j.get(i5);
                        }
                    }
                    while (i4 < aVar4.f72101b) {
                        f3 += this.f72093c.getPageWidth(i4) + f2;
                        i4++;
                    }
                    aVar4.f72104e = f3;
                    f3 += aVar4.f72103d + f2;
                    i4++;
                }
            } else if (i3 > aVar5.f72101b) {
                int size = this.j.size() - 1;
                float f4 = aVar6.f72104e;
                int i6 = i3 - 1;
                while (i6 >= aVar5.f72101b && size >= 0) {
                    Object obj2 = this.j.get(size);
                    while (true) {
                        aVar3 = (a) obj2;
                        if (i6 < aVar3.f72101b && size > 0) {
                            size--;
                            obj2 = this.j.get(size);
                        }
                    }
                    while (i6 > aVar3.f72101b) {
                        f4 -= this.f72093c.getPageWidth(i6) + f2;
                        i6--;
                    }
                    f4 -= aVar3.f72103d + f2;
                    aVar3.f72104e = f4;
                    i6--;
                }
            }
        }
        int size2 = this.j.size();
        float f5 = aVar5.f72104e;
        int i7 = aVar5.f72101b - 1;
        this.f72095e = aVar5.f72101b == 0 ? aVar5.f72104e : -3.4028235E38f;
        int i8 = count - 1;
        this.v = aVar5.f72101b == i8 ? (aVar5.f72104e + aVar5.f72103d) - 1.0f : Float.MAX_VALUE;
        int i9 = i2 - 1;
        while (i9 >= 0) {
            a aVar7 = this.j.get(i9);
            while (i7 > aVar7.f72101b) {
                f5 -= this.f72093c.getPageWidth(i7) + f2;
                i7--;
            }
            f5 -= aVar7.f72103d + f2;
            aVar7.f72104e = f5;
            if (aVar7.f72101b == 0) {
                this.f72095e = f5;
            }
            i9--;
            i7--;
        }
        float f6 = aVar5.f72104e + aVar5.f72103d + f2;
        int i10 = aVar5.f72101b + 1;
        int i11 = i2 + 1;
        while (i11 < size2) {
            a aVar8 = this.j.get(i11);
            while (i10 < aVar8.f72101b) {
                f6 += this.f72093c.getPageWidth(i10) + f2;
                i10++;
            }
            if (aVar8.f72101b == i8) {
                this.v = (aVar8.f72103d + f6) - 1.0f;
            }
            aVar8.f72104e = f6;
            f6 += aVar8.f72103d + f2;
            i11++;
            i10++;
        }
        this.T = false;
    }

    private void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f72091a, false, 82641, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f72091a, false, 82641, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        boolean z3 = this.ai == 2;
        if (z3) {
            setScrollingCacheEnabled(false);
            this.p.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.p.getCurrX();
            int currY = this.p.getCurrY();
            if (!(scrollX == currX && scrollY == currY)) {
                scrollTo(currX, currY);
            }
        }
        this.A = false;
        boolean z4 = z3;
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            a aVar = this.j.get(i2);
            if (aVar.f72102c) {
                aVar.f72102c = false;
                z4 = true;
            }
        }
        if (z4) {
            if (z2) {
                ViewCompat.postOnAnimation(this, this.ah);
                return;
            }
            this.ah.run();
        }
    }

    public final boolean a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f72091a, false, 82657, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f72091a, false, 82657, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.f72093c == null) {
            return false;
        } else {
            int clientHeight = getClientHeight();
            int scrollY = getScrollY();
            return i2 < 0 ? scrollY > ((int) (((float) clientHeight) * this.f72095e)) : i2 > 0 && scrollY < ((int) (((float) clientHeight) * this.v));
        }
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f72091a, false, 82622, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72091a, false, 82622, new Class[0], Void.TYPE);
            return;
        }
        b(this.f72094d);
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f72091a, false, 82656, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72091a, false, 82656, new Class[0], Void.TYPE);
            return;
        }
        this.C = false;
        this.D = false;
        if (this.M != null) {
            this.M.recycle();
            this.M = null;
        }
    }

    private int getClientHeight() {
        if (!PatchProxy.isSupport(new Object[0], this, f72091a, false, 82601, new Class[0], Integer.TYPE)) {
            return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f72091a, false, 82601, new Class[0], Integer.TYPE)).intValue();
    }

    private boolean h() {
        if (PatchProxy.isSupport(new Object[0], this, f72091a, false, 82663, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f72091a, false, 82663, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f72094d <= 0) {
            return false;
        } else {
            a(this.f72094d - 1, true);
            return true;
        }
    }

    public void drawableStateChanged() {
        if (PatchProxy.isSupport(new Object[0], this, f72091a, false, 82616, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72091a, false, 82616, new Class[0], Void.TYPE);
            return;
        }
        super.drawableStateChanged();
        Drawable drawable = this.s;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public int getPaddedHeight() {
        if (!PatchProxy.isSupport(new Object[0], this, f72091a, false, 82673, new Class[0], Integer.TYPE)) {
            return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f72091a, false, 82673, new Class[0], Integer.TYPE)).intValue();
    }

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f72091a, false, 82633, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72091a, false, 82633, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        this.S = true;
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f72091a, false, 82597, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72091a, false, 82597, new Class[0], Void.TYPE);
            return;
        }
        removeCallbacks(this.ah);
        super.onDetachedFromWindow();
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f72091a, false, 82624, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72091a, false, 82624, new Class[0], Void.TYPE);
            return;
        }
        if (this.ae != 0) {
            if (this.af == null) {
                this.af = new ArrayList<>();
            } else {
                this.af.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.af.add(getChildAt(i2));
            }
            Collections.sort(this.af, ag);
        }
    }

    private boolean i() {
        if (PatchProxy.isSupport(new Object[0], this, f72091a, false, 82664, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f72091a, false, 82664, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f72093c == null || this.f72094d >= this.f72093c.getCount() - 1) {
            return false;
        } else {
            a(this.f72094d + 1, true);
            return true;
        }
    }

    public void computeScroll() {
        if (PatchProxy.isSupport(new Object[0], this, f72091a, false, 82638, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72091a, false, 82638, new Class[0], Void.TYPE);
        } else if (this.p.isFinished() || !this.p.computeScrollOffset()) {
            a(true);
        } else {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.p.getCurrX();
            int currY = this.p.getCurrY();
            if (!(scrollX == currX && scrollY == currY)) {
                scrollTo(currX, currY);
                if (!d(currY)) {
                    this.p.abortAnimation();
                    scrollTo(currX, 0);
                }
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public Parcelable onSaveInstanceState() {
        if (PatchProxy.isSupport(new Object[0], this, f72091a, false, 82626, new Class[0], Parcelable.class)) {
            return (Parcelable) PatchProxy.accessDispatch(new Object[0], this, f72091a, false, 82626, new Class[0], Parcelable.class);
        }
        e eVar = new e(super.onSaveInstanceState());
        eVar.f72114b = this.f72094d;
        if (this.f72093c != null) {
            eVar.f72115c = this.f72093c.saveState();
        }
        return eVar;
    }

    private a f() {
        float f2;
        float f3;
        if (PatchProxy.isSupport(new Object[0], this, f72091a, false, 82648, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], this, f72091a, false, 82648, new Class[0], a.class);
        }
        int clientHeight = getClientHeight();
        if (clientHeight > 0) {
            f2 = ((float) getScrollY()) / ((float) clientHeight);
        } else {
            f2 = 0.0f;
        }
        if (clientHeight > 0) {
            f3 = ((float) this.r) / ((float) clientHeight);
        } else {
            f3 = 0.0f;
        }
        a aVar = null;
        int i2 = 0;
        boolean z2 = true;
        int i3 = -1;
        float f4 = 0.0f;
        float f5 = 0.0f;
        while (i2 < this.j.size()) {
            a aVar2 = this.j.get(i2);
            if (!z2) {
                int i4 = i3 + 1;
                if (aVar2.f72101b != i4) {
                    aVar2 = this.k;
                    aVar2.f72104e = f4 + f5 + f3;
                    aVar2.f72101b = i4;
                    aVar2.f72103d = this.f72093c.getPageWidth(aVar2.f72101b);
                    i2--;
                }
            }
            f4 = aVar2.f72104e;
            float f6 = aVar2.f72103d + f4 + f3;
            if (!z2 && f2 < f4) {
                return aVar;
            }
            if (f2 < f6 || i2 == this.j.size() - 1) {
                return aVar2;
            }
            i3 = aVar2.f72101b;
            f5 = aVar2.f72103d;
            i2++;
            aVar = aVar2;
            z2 = false;
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    public void setOnAdapterChangeListener(c cVar) {
        this.ab = cVar;
    }

    private void setScrollingCacheEnabled(boolean z2) {
        if (this.z != z2) {
            this.z = z2;
        }
    }

    private a b(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f72091a, false, 82631, new Class[]{View.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{view}, this, f72091a, false, 82631, new Class[]{View.class}, a.class);
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

    private a c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f72091a, false, 82632, new Class[]{Integer.TYPE}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f72091a, false, 82632, new Class[]{Integer.TYPE}, a.class);
        }
        for (int i3 = 0; i3 < this.j.size(); i3++) {
            a aVar = this.j.get(i3);
            if (aVar.f72101b == i2) {
                return aVar;
            }
        }
        return null;
    }

    public void addTouchables(ArrayList<View> arrayList) {
        if (PatchProxy.isSupport(new Object[]{arrayList}, this, f72091a, false, 82666, new Class[]{ArrayList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arrayList}, this, f72091a, false, 82666, new Class[]{ArrayList.class}, Void.TYPE);
            return;
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                a a2 = a(childAt);
                if (a2 != null && a2.f72101b == this.f72094d) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    public boolean canScrollVertically(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f72091a, false, 82674, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f72091a, false, 82674, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (getAdapter() == null) {
            return false;
        } else {
            int paddedHeight = getPaddedHeight();
            int scrollY = getScrollY();
            if (i2 < 0) {
                if (scrollY > ((int) (((float) paddedHeight) * this.f72095e)) || b()) {
                    return true;
                }
                return false;
            } else if (i2 <= 0) {
                return false;
            } else {
                if (scrollY < ((int) (((float) paddedHeight) * this.v)) || c()) {
                    return true;
                }
                return false;
            }
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (PatchProxy.isSupport(new Object[]{accessibilityEvent}, this, f72091a, false, 82668, new Class[]{AccessibilityEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{accessibilityEvent}, this, f72091a, false, 82668, new Class[]{AccessibilityEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        } else {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    a a2 = a(childAt);
                    if (a2 != null && a2.f72101b == this.f72094d && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (PatchProxy.isSupport(new Object[]{parcelable}, this, f72091a, false, 82627, new Class[]{Parcelable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcelable}, this, f72091a, false, 82627, new Class[]{Parcelable.class}, Void.TYPE);
        } else if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
        } else {
            e eVar = (e) parcelable;
            super.onRestoreInstanceState(eVar.getSuperState());
            if (this.f72093c != null) {
                this.f72093c.restoreState(eVar.f72115c, eVar.f72116d);
                a(eVar.f72114b, false, true);
                return;
            }
            this.m = eVar.f72114b;
            this.n = eVar.f72115c;
            this.o = eVar.f72116d;
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
            com.meituan.robust.ChangeQuickRedirect r2 = f72091a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 82609(0x142b1, float:1.1576E-40)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003a
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r10)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f72091a
            r3 = 0
            r4 = 82609(0x142b1, float:1.1576E-40)
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
            java.lang.reflect.Method r0 = r9.ad
            if (r0 != 0) goto L_0x0053
            java.lang.Class<android.view.ViewGroup> r0 = android.view.ViewGroup.class
            java.lang.String r1 = "setChildrenDrawingOrderEnabled"
            java.lang.Class[] r2 = new java.lang.Class[r7]     // Catch:{ NoSuchMethodException -> 0x0053 }
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch:{ NoSuchMethodException -> 0x0053 }
            r2[r8] = r3     // Catch:{ NoSuchMethodException -> 0x0053 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch:{ NoSuchMethodException -> 0x0053 }
            r9.ad = r0     // Catch:{ NoSuchMethodException -> 0x0053 }
        L_0x0053:
            java.lang.reflect.Method r0 = r9.ad     // Catch:{ Exception -> 0x0061 }
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0061 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)     // Catch:{ Exception -> 0x0061 }
            r1[r8] = r2     // Catch:{ Exception -> 0x0061 }
            r0.invoke(r9, r1)     // Catch:{ Exception -> 0x0061 }
            return
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager.setChildrenDrawingOrderEnabledCompat(boolean):void");
    }

    public void setCurrentItem(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f72091a, false, 82602, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f72091a, false, 82602, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.A = false;
        a(i2, !this.S, false);
    }

    public void setOffscreenPageLimit(int i2) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f72091a, false, 82611, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f72091a, false, 82611, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 <= 0) {
            i3 = 1;
        } else {
            i3 = i2;
        }
        if (i3 != this.B) {
            this.B = i3;
            d();
        }
    }

    public void setPageMargin(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f72091a, false, 82612, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f72091a, false, 82612, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        int i3 = this.r;
        this.r = i2;
        int height = getHeight();
        a(height, height, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f72091a, false, 82614, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f72091a, false, 82614, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        setPageMarginDrawable(com.ss.android.ugc.bytex.a.a.a.a(getContext().getResources(), i2));
    }

    public void setScrollState(int i2) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f72091a, false, 82598, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f72091a, false, 82598, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.ai != i2) {
            this.ai = i2;
            if (this.ac != null) {
                if (i2 == 0) {
                    z2 = false;
                }
                b(z2);
            }
            if (this.W != null) {
                Iterator<ViewPager.OnPageChangeListener> it2 = this.W.iterator();
                while (it2.hasNext()) {
                    it2.next().onPageScrollStateChanged(i2);
                }
            }
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = drawable;
        if (PatchProxy.isSupport(new Object[]{drawable2}, this, f72091a, false, 82615, new Class[]{Drawable.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{drawable2}, this, f72091a, false, 82615, new Class[]{Drawable.class}, Boolean.TYPE)).booleanValue();
        }
        if (!super.verifyDrawable(drawable)) {
            if (drawable2 == this.s) {
                return true;
            }
            return false;
        }
        return true;
    }

    private void b(boolean z2) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f72091a, false, 82643, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f72091a, false, 82643, new Class[]{Boolean.TYPE}, Void.TYPE);
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

    private boolean d(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f72091a, false, 82639, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f72091a, false, 82639, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.j.size() == 0) {
            this.U = false;
            a(0, 0.0f, 0);
            if (this.U) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else {
            a f2 = f();
            int clientHeight = getClientHeight();
            int i3 = this.r + clientHeight;
            float f3 = (float) clientHeight;
            float f4 = ((float) this.r) / f3;
            int i4 = f2.f72101b;
            float f5 = ((((float) i2) / f3) - f2.f72104e) / (f2.f72103d + f4);
            this.U = false;
            a(i4, f5, (int) (((float) i3) * f5));
            if (this.U) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean e(int r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f72091a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r3 = 0
            r4 = 82661(0x142e5, float:1.15833E-40)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0041
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f72091a
            r3 = 0
            r4 = 82661(0x142e5, float:1.15833E-40)
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
            android.graphics.Rect r2 = r9.l
            android.graphics.Rect r2 = r9.a((android.graphics.Rect) r2, (android.view.View) r1)
            int r2 = r2.top
            android.graphics.Rect r3 = r9.l
            android.graphics.Rect r3 = r9.a((android.graphics.Rect) r3, (android.view.View) r0)
            int r3 = r3.top
            if (r0 == 0) goto L_0x00b6
            if (r2 < r3) goto L_0x00b6
            boolean r8 = r9.h()
            goto L_0x00ee
        L_0x00b6:
            boolean r8 = r1.requestFocus()
            goto L_0x00ee
        L_0x00bb:
            if (r10 != r2) goto L_0x00ee
            android.graphics.Rect r2 = r9.l
            android.graphics.Rect r2 = r9.a((android.graphics.Rect) r2, (android.view.View) r1)
            int r2 = r2.bottom
            android.graphics.Rect r3 = r9.l
            android.graphics.Rect r3 = r9.a((android.graphics.Rect) r3, (android.view.View) r0)
            int r3 = r3.bottom
            if (r0 == 0) goto L_0x00d6
            if (r2 > r3) goto L_0x00d6
            boolean r8 = r9.i()
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
            boolean r8 = r9.i()
            goto L_0x00ee
        L_0x00ea:
            boolean r8 = r9.h()
        L_0x00ee:
            if (r8 == 0) goto L_0x00f7
            int r0 = android.view.SoundEffectConstants.getContantForFocusDirection(r10)
            r9.playSoundEffect(r0)
        L_0x00f7:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager.e(int):boolean");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{keyEvent}, this, f72091a, false, 82659, new Class[]{KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{keyEvent}, this, f72091a, false, 82659, new Class[]{KeyEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (PatchProxy.isSupport(new Object[]{keyEvent}, this, f72091a, false, 82660, new Class[]{KeyEvent.class}, Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{keyEvent}, this, f72091a, false, 82660, new Class[]{KeyEvent.class}, Boolean.TYPE)).booleanValue();
            } else {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode != 61) {
                        switch (keyCode) {
                            case 21:
                                z2 = e(17);
                                break;
                            case 22:
                                z2 = e(66);
                                break;
                        }
                    } else if (Build.VERSION.SDK_INT >= 15) {
                        if (keyEvent.hasNoModifiers()) {
                            z2 = e(2);
                        } else if (keyEvent.hasModifiers(1)) {
                            z2 = e(1);
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

    public void draw(Canvas canvas) {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f72091a, false, 82650, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f72091a, false, 82650, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.draw(canvas);
        int overScrollMode = ViewCompat.getOverScrollMode(this);
        if (overScrollMode == 0 || (overScrollMode == 1 && this.f72093c != null && this.f72093c.getCount() > 1)) {
            if (!this.Q.isFinished()) {
                int save = canvas.save();
                int height = getHeight();
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.translate((float) getPaddingLeft(), this.f72095e * ((float) height));
                this.Q.setSize(width, height);
                z2 = false | this.Q.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.R.isFinished()) {
                int save2 = canvas.save();
                int height2 = getHeight();
                int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.rotate(180.0f);
                canvas.translate((float) ((-width2) - getPaddingLeft()), (-(this.v + 1.0f)) * ((float) height2));
                this.R.setSize(width2, height2);
                z2 |= this.R.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.Q.finish();
            this.R.finish();
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
        if (PatchProxy.isSupport(new Object[]{canvas2}, this, f72091a, false, 82651, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2}, this, f72091a, false, 82651, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        if (this.r > 0 && this.s != null && this.j.size() > 0 && this.f72093c != null) {
            int scrollY = getScrollY();
            int height = getHeight();
            float f6 = (float) height;
            float f7 = ((float) this.r) / f6;
            a aVar = this.j.get(0);
            float f8 = aVar.f72104e;
            int size = this.j.size();
            int i3 = aVar.f72101b;
            int i4 = this.j.get(size - 1).f72101b;
            while (i3 < i4) {
                while (i3 > aVar.f72101b && i2 < size) {
                    i2++;
                    aVar = this.j.get(i2);
                }
                if (i3 == aVar.f72101b) {
                    f3 = (aVar.f72104e + aVar.f72103d) * f6;
                    f2 = aVar.f72104e + aVar.f72103d + f7;
                } else {
                    float pageWidth = this.f72093c.getPageWidth(i3);
                    f2 = f8 + pageWidth + f7;
                    f3 = (f8 + pageWidth) * f6;
                }
                if (((float) this.r) + f3 > ((float) scrollY)) {
                    f5 = f7;
                    f4 = f6;
                    this.s.setBounds(this.t, (int) f3, this.u, (int) (((float) this.r) + f3 + 0.5f));
                    this.s.draw(canvas2);
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
        if (PatchProxy.isSupport(new Object[]{pagerAdapter}, this, f72091a, false, 82599, new Class[]{PagerAdapter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pagerAdapter}, this, f72091a, false, 82599, new Class[]{PagerAdapter.class}, Void.TYPE);
            return;
        }
        if (this.f72093c != null) {
            this.f72093c.unregisterDataSetObserver(this.q);
            this.f72093c.startUpdate((ViewGroup) this);
            for (int i2 = 0; i2 < this.j.size(); i2++) {
                a aVar = this.j.get(i2);
                this.f72093c.destroyItem((ViewGroup) this, aVar.f72101b, aVar.f72100a);
            }
            this.f72093c.finishUpdate((ViewGroup) this);
            this.j.clear();
            if (PatchProxy.isSupport(new Object[0], this, f72091a, false, 82600, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f72091a, false, 82600, new Class[0], Void.TYPE);
            } else {
                int i3 = 0;
                while (i3 < getChildCount()) {
                    if (!((b) getChildAt(i3).getLayoutParams()).f72105a) {
                        removeViewAt(i3);
                        i3--;
                    }
                    i3++;
                }
            }
            this.f72094d = 0;
            scrollTo(0, 0);
        }
        this.f72093c = pagerAdapter;
        this.g = 0;
        if (this.f72093c != null) {
            if (this.q == null) {
                this.q = new d(this, (byte) 0);
            }
            this.f72093c.registerDataSetObserver(this.q);
            this.A = false;
            boolean z2 = this.S;
            this.S = true;
            this.g = this.f72093c.getCount();
            if (this.m >= 0) {
                this.f72093c.restoreState(this.n, this.o);
                a(this.m, false, true);
                this.m = -1;
                this.n = null;
                this.o = null;
            } else if (!z2) {
                d();
            } else {
                requestLayout();
            }
        }
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{drawable}, this, f72091a, false, 82613, new Class[]{Drawable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable}, this, f72091a, false, 82613, new Class[]{Drawable.class}, Void.TYPE);
            return;
        }
        this.s = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        if (drawable != null) {
            z2 = false;
        }
        setWillNotDraw(z2);
        invalidate();
    }

    private a a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f72091a, false, 82630, new Class[]{View.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{view}, this, f72091a, false, 82630, new Class[]{View.class}, a.class);
        }
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            a aVar = this.j.get(i2);
            if (this.f72093c.isViewFromObject(view, aVar.f72100a)) {
                return aVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ab, code lost:
        if (r8.f72101b == r7.f72094d) goto L_0x00b2;
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
            com.meituan.robust.ChangeQuickRedirect r2 = f72091a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 82623(0x142bf, float:1.1578E-40)
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0040
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f72091a
            r3 = 0
            r4 = 82623(0x142bf, float:1.1578E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0040:
            r0 = 2
            int r1 = r7.f72094d
            if (r1 == r8) goto L_0x0057
            int r0 = r7.f72094d
            if (r0 >= r8) goto L_0x004c
            r0 = 130(0x82, float:1.82E-43)
            goto L_0x004e
        L_0x004c:
            r0 = 33
        L_0x004e:
            int r1 = r7.f72094d
            com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$a r1 = r7.c(r1)
            r7.f72094d = r8
            goto L_0x0058
        L_0x0057:
            r1 = 0
        L_0x0058:
            android.support.v4.view.PagerAdapter r3 = r7.f72093c
            if (r3 != 0) goto L_0x0060
            r17.e()
            return
        L_0x0060:
            boolean r3 = r7.A
            if (r3 == 0) goto L_0x0068
            r17.e()
            return
        L_0x0068:
            android.os.IBinder r3 = r17.getWindowToken()
            if (r3 != 0) goto L_0x006f
            return
        L_0x006f:
            android.support.v4.view.PagerAdapter r3 = r7.f72093c
            r3.startUpdate((android.view.ViewGroup) r7)
            int r3 = r7.B
            int r4 = r7.f72094d
            int r4 = r4 - r3
            int r4 = java.lang.Math.max(r10, r4)
            android.support.v4.view.PagerAdapter r5 = r7.f72093c
            int r5 = r5.getCount()
            int r6 = r5 + -1
            int r8 = r7.f72094d
            int r8 = r8 + r3
            int r3 = java.lang.Math.min(r6, r8)
            int r6 = r7.g
            if (r5 != r6) goto L_0x025f
            r6 = 0
        L_0x0091:
            java.util.ArrayList<com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$a> r8 = r7.j
            int r8 = r8.size()
            if (r6 >= r8) goto L_0x00b1
            java.util.ArrayList<com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$a> r8 = r7.j
            java.lang.Object r8 = r8.get(r6)
            com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$a r8 = (com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager.a) r8
            int r11 = r8.f72101b
            int r12 = r7.f72094d
            if (r11 < r12) goto L_0x00ae
            int r11 = r8.f72101b
            int r12 = r7.f72094d
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
            int r8 = r7.f72094d
            com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$a r8 = r7.a((int) r8, (int) r6)
        L_0x00bc:
            if (r8 == 0) goto L_0x01de
            int r12 = r6 + -1
            if (r12 < 0) goto L_0x00cb
            java.util.ArrayList<com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$a> r13 = r7.j
            java.lang.Object r13 = r13.get(r12)
            com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$a r13 = (com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager.a) r13
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
            float r2 = r8.f72103d
            float r2 = r15 - r2
            int r10 = r17.getPaddingLeft()
            float r10 = (float) r10
            float r11 = (float) r14
            float r10 = r10 / r11
            float r11 = r2 + r10
        L_0x00e3:
            int r2 = r7.f72094d
            int r2 = r2 - r9
            r10 = r6
            r6 = 0
        L_0x00e8:
            if (r2 < 0) goto L_0x0147
            int r16 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r16 < 0) goto L_0x0115
            if (r2 >= r4) goto L_0x0115
            if (r13 == 0) goto L_0x0147
            int r9 = r13.f72101b
            if (r2 != r9) goto L_0x0143
            boolean r9 = r13.f72102c
            if (r9 != 0) goto L_0x0143
            java.util.ArrayList<com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$a> r9 = r7.j
            r9.remove(r12)
            android.support.v4.view.PagerAdapter r9 = r7.f72093c
            java.lang.Object r13 = r13.f72100a
            r9.destroyItem((android.view.ViewGroup) r7, (int) r2, (java.lang.Object) r13)
            int r12 = r12 + -1
            int r10 = r10 + -1
            if (r12 < 0) goto L_0x0141
            java.util.ArrayList<com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$a> r9 = r7.j
            java.lang.Object r9 = r9.get(r12)
            com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$a r9 = (com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager.a) r9
            goto L_0x0142
        L_0x0115:
            if (r13 == 0) goto L_0x012b
            int r9 = r13.f72101b
            if (r2 != r9) goto L_0x012b
            float r9 = r13.f72103d
            float r6 = r6 + r9
            int r12 = r12 + -1
            if (r12 < 0) goto L_0x0141
            java.util.ArrayList<com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$a> r9 = r7.j
            java.lang.Object r9 = r9.get(r12)
            com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$a r9 = (com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager.a) r9
            goto L_0x0142
        L_0x012b:
            int r9 = r12 + 1
            com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$a r9 = r7.a((int) r2, (int) r9)
            float r9 = r9.f72103d
            float r6 = r6 + r9
            int r10 = r10 + 1
            if (r12 < 0) goto L_0x0141
            java.util.ArrayList<com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$a> r9 = r7.j
            java.lang.Object r9 = r9.get(r12)
            com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$a r9 = (com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager.a) r9
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
            float r2 = r8.f72103d
            int r4 = r10 + 1
            int r6 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r6 >= 0) goto L_0x01db
            java.util.ArrayList<com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$a> r6 = r7.j
            int r6 = r6.size()
            if (r4 >= r6) goto L_0x0160
            java.util.ArrayList<com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$a> r6 = r7.j
            java.lang.Object r6 = r6.get(r4)
            com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$a r6 = (com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager.a) r6
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
            int r9 = r7.f72094d
            r12 = 1
            int r9 = r9 + r12
        L_0x0172:
            if (r9 >= r5) goto L_0x01db
            int r12 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r12 < 0) goto L_0x01a3
            if (r9 <= r3) goto L_0x01a3
            if (r6 == 0) goto L_0x01db
            int r12 = r6.f72101b
            if (r9 != r12) goto L_0x01d8
            boolean r12 = r6.f72102c
            if (r12 != 0) goto L_0x01d8
            java.util.ArrayList<com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$a> r12 = r7.j
            r12.remove(r4)
            android.support.v4.view.PagerAdapter r12 = r7.f72093c
            java.lang.Object r6 = r6.f72100a
            r12.destroyItem((android.view.ViewGroup) r7, (int) r9, (java.lang.Object) r6)
            java.util.ArrayList<com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$a> r6 = r7.j
            int r6 = r6.size()
            if (r4 >= r6) goto L_0x01a1
            java.util.ArrayList<com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$a> r6 = r7.j
            java.lang.Object r6 = r6.get(r4)
            com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$a r6 = (com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager.a) r6
            goto L_0x01d8
        L_0x01a1:
            r6 = 0
            goto L_0x01d8
        L_0x01a3:
            if (r6 == 0) goto L_0x01bf
            int r12 = r6.f72101b
            if (r9 != r12) goto L_0x01bf
            float r6 = r6.f72103d
            float r2 = r2 + r6
            int r4 = r4 + 1
            java.util.ArrayList<com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$a> r6 = r7.j
            int r6 = r6.size()
            if (r4 >= r6) goto L_0x01a1
            java.util.ArrayList<com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$a> r6 = r7.j
            java.lang.Object r6 = r6.get(r4)
            com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$a r6 = (com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager.a) r6
            goto L_0x01d8
        L_0x01bf:
            com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$a r6 = r7.a((int) r9, (int) r4)
            int r4 = r4 + 1
            float r6 = r6.f72103d
            float r2 = r2 + r6
            java.util.ArrayList<com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$a> r6 = r7.j
            int r6 = r6.size()
            if (r4 >= r6) goto L_0x01a1
            java.util.ArrayList<com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$a> r6 = r7.j
            java.lang.Object r6 = r6.get(r4)
            com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$a r6 = (com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager.a) r6
        L_0x01d8:
            int r9 = r9 + 1
            goto L_0x0172
        L_0x01db:
            r7.a((com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager.a) r8, (int) r10, (com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager.a) r1)
        L_0x01de:
            android.support.v4.view.PagerAdapter r1 = r7.f72093c
            int r2 = r7.f72094d
            if (r8 == 0) goto L_0x01e7
            java.lang.Object r3 = r8.f72100a
            goto L_0x01e8
        L_0x01e7:
            r3 = 0
        L_0x01e8:
            r1.setPrimaryItem((android.view.ViewGroup) r7, (int) r2, (java.lang.Object) r3)
            android.support.v4.view.PagerAdapter r1 = r7.f72093c
            r1.finishUpdate((android.view.ViewGroup) r7)
            int r1 = r17.getChildCount()
            r2 = 0
        L_0x01f5:
            if (r2 >= r1) goto L_0x0221
            android.view.View r3 = r7.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$b r4 = (com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager.b) r4
            r4.f72110f = r2
            boolean r5 = r4.f72105a
            if (r5 != 0) goto L_0x021d
            float r5 = r4.f72107c
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x021e
            com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$a r3 = r7.a((android.view.View) r3)
            if (r3 == 0) goto L_0x021e
            float r5 = r3.f72103d
            r4.f72107c = r5
            int r3 = r3.f72101b
            r4.f72109e = r3
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
            com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$a r2 = r7.b((android.view.View) r1)
            goto L_0x0236
        L_0x0235:
            r2 = 0
        L_0x0236:
            if (r2 == 0) goto L_0x023e
            int r1 = r2.f72101b
            int r2 = r7.f72094d
            if (r1 == r2) goto L_0x025e
        L_0x023e:
            r1 = 0
        L_0x023f:
            int r2 = r17.getChildCount()
            if (r1 >= r2) goto L_0x025e
            android.view.View r2 = r7.getChildAt(r1)
            com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$a r3 = r7.a((android.view.View) r2)
            if (r3 == 0) goto L_0x025b
            int r3 = r3.f72101b
            int r4 = r7.f72094d
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
            int r3 = r7.g
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
            android.support.v4.view.PagerAdapter r0 = r7.f72093c
            java.lang.Class r0 = r0.getClass()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager.b(int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i2;
        float f2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        float f3;
        int i3;
        MotionEvent motionEvent2 = motionEvent;
        boolean z6 = false;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f72091a, false, 82645, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f72091a, false, 82645, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f72096f) {
            return true;
        } else {
            if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || this.f72093c == null || this.f72093c.getCount() == 0) {
                return false;
            }
            if (this.M == null) {
                this.M = VelocityTracker.obtain();
            }
            this.M.addMovement(motionEvent2);
            switch (motionEvent.getAction()) {
                case 0:
                    this.p.abortAnimation();
                    this.A = false;
                    d();
                    float x2 = motionEvent.getX();
                    this.J = x2;
                    this.H = x2;
                    float y2 = motionEvent.getY();
                    this.K = y2;
                    this.I = y2;
                    this.L = motionEvent2.getPointerId(0);
                    break;
                case 1:
                    if (this.C) {
                        this.M.computeCurrentVelocity(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, (float) this.O);
                        int yVelocity = (int) this.M.getYVelocity(this.L);
                        this.A = true;
                        int clientHeight = getClientHeight();
                        int scrollY = getScrollY();
                        a f4 = f();
                        int i4 = f4.f72101b;
                        float f5 = ((((float) scrollY) / ((float) clientHeight)) - f4.f72104e) / f4.f72103d;
                        int y3 = (int) (motionEvent2.getY(motionEvent2.findPointerIndex(this.L)) - this.K);
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i4), Float.valueOf(f5), Integer.valueOf(yVelocity), Integer.valueOf(y3)}, this, f72091a, false, 82649, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
                            i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i4), Float.valueOf(f5), Integer.valueOf(yVelocity), Integer.valueOf(y3)}, this, f72091a, false, 82649, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
                        } else {
                            if (Math.abs(y3) <= this.P || Math.abs(yVelocity) <= this.N) {
                                if (i4 >= this.f72094d) {
                                    f2 = 0.4f;
                                } else {
                                    f2 = 0.6f;
                                }
                                i4 = (int) (((float) i4) + f5 + f2);
                            } else if (yVelocity <= 0) {
                                i4++;
                            }
                            if (this.j.size() > 0) {
                                i2 = Math.max(this.j.get(0).f72101b, Math.min(i4, this.j.get(this.j.size() - 1).f72101b));
                            } else {
                                i2 = i4;
                            }
                        }
                        a(i2, true, true, yVelocity);
                        this.L = -1;
                        g();
                        z6 = this.Q.onRelease() | this.R.onRelease();
                        break;
                    }
                    break;
                case 2:
                    if (!this.C) {
                        int findPointerIndex = motionEvent2.findPointerIndex(this.L);
                        float y4 = motionEvent2.getY(findPointerIndex);
                        float abs = Math.abs(y4 - this.I);
                        float x3 = motionEvent2.getX(findPointerIndex);
                        float abs2 = Math.abs(x3 - this.H);
                        if (abs > ((float) this.G) && abs > abs2) {
                            this.C = true;
                            if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f72091a, false, 82646, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f72091a, false, 82646, new Class[]{Boolean.TYPE}, Void.TYPE);
                            } else {
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                            if (y4 - this.K > 0.0f) {
                                f3 = this.K + ((float) this.G);
                            } else {
                                f3 = this.K - ((float) this.G);
                            }
                            this.I = f3;
                            this.H = x3;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                    if (this.C) {
                        float y5 = motionEvent2.getY(motionEvent2.findPointerIndex(this.L));
                        if (PatchProxy.isSupport(new Object[]{Float.valueOf(y5)}, this, f72091a, false, 82647, new Class[]{Float.TYPE}, Boolean.TYPE)) {
                            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(y5)}, this, f72091a, false, 82647, new Class[]{Float.TYPE}, Boolean.TYPE)).booleanValue();
                        } else {
                            this.I = y5;
                            float scrollY2 = ((float) getScrollY()) + (this.I - y5);
                            float clientHeight2 = (float) getClientHeight();
                            float f6 = this.f72095e * clientHeight2;
                            float f7 = this.v * clientHeight2;
                            a aVar = this.j.get(0);
                            a aVar2 = this.j.get(this.j.size() - 1);
                            if (aVar.f72101b != 0) {
                                f6 = aVar.f72104e * clientHeight2;
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            if (aVar2.f72101b != this.f72093c.getCount() - 1) {
                                f7 = aVar2.f72104e * clientHeight2;
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (scrollY2 < f6) {
                                if (z3) {
                                    z2 = this.Q.onPull(Math.abs(f6 - scrollY2) / clientHeight2);
                                } else {
                                    z2 = false;
                                }
                                scrollY2 = f6;
                            } else if (scrollY2 > f7) {
                                if (z4) {
                                    z5 = this.R.onPull(Math.abs(scrollY2 - f7) / clientHeight2);
                                } else {
                                    z5 = false;
                                }
                                scrollY2 = f7;
                            } else {
                                z2 = false;
                            }
                            int i5 = (int) scrollY2;
                            this.H += scrollY2 - ((float) i5);
                            scrollTo(getScrollX(), i5);
                            d(i5);
                        }
                        z6 = false | z2;
                        break;
                    }
                    break;
                case 3:
                    if (this.C) {
                        a(this.f72094d, true, 0, false);
                        this.L = -1;
                        g();
                        z6 = this.Q.onRelease() | this.R.onRelease();
                        break;
                    }
                    break;
                case 5:
                    int actionIndex = motionEvent.getActionIndex();
                    this.I = motionEvent2.getY(actionIndex);
                    this.L = motionEvent2.getPointerId(actionIndex);
                    break;
                case 6:
                    if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f72091a, false, 82655, new Class[]{MotionEvent.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f72091a, false, 82655, new Class[]{MotionEvent.class}, Void.TYPE);
                    } else {
                        int actionIndex2 = motionEvent.getActionIndex();
                        if (motionEvent2.getPointerId(actionIndex2) == this.L) {
                            if (actionIndex2 == 0) {
                                i3 = 1;
                            } else {
                                i3 = 0;
                            }
                            this.I = motionEvent2.getY(i3);
                            this.L = motionEvent2.getPointerId(i3);
                            if (this.M != null) {
                                this.M.clear();
                            }
                        }
                    }
                    this.I = motionEvent2.getY(motionEvent2.findPointerIndex(this.L));
                    break;
            }
            if (z6) {
                ViewCompat.postInvalidateOnAnimation(this);
            }
            return true;
        }
    }

    private a a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f72091a, false, 82620, new Class[]{Integer.TYPE, Integer.TYPE}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f72091a, false, 82620, new Class[]{Integer.TYPE, Integer.TYPE}, a.class);
        }
        a aVar = new a();
        aVar.f72101b = i2;
        aVar.f72100a = this.f72093c.instantiateItem((ViewGroup) this, i2);
        aVar.f72103d = this.f72093c.getPageWidth(i2);
        if (i3 < 0 || i3 >= this.j.size()) {
            this.j.add(aVar);
        } else {
            this.j.add(i3, aVar);
        }
        return aVar;
    }

    private Rect a(Rect rect, View view) {
        Rect rect2;
        if (PatchProxy.isSupport(new Object[]{rect, view}, this, f72091a, false, 82662, new Class[]{Rect.class, View.class}, Rect.class)) {
            return (Rect) PatchProxy.accessDispatch(new Object[]{rect, view}, this, f72091a, false, 82662, new Class[]{Rect.class, View.class}, Rect.class);
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
            com.meituan.robust.ChangeQuickRedirect r2 = f72091a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 82634(0x142ca, float:1.15795E-40)
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0053
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f72091a
            r3 = 0
            r4 = 82634(0x142ca, float:1.15795E-40)
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
            int r2 = r7.E
            int r1 = java.lang.Math.min(r1, r2)
            r7.F = r1
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
            com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$b r4 = (com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager.b) r4
            if (r4 == 0) goto L_0x0111
            boolean r8 = r4.f72105a
            if (r8 == 0) goto L_0x0111
            int r8 = r4.f72106b
            r8 = r8 & 7
            int r11 = r4.f72106b
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
            r7.w = r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r5)
            r7.x = r0
            r0 = 1
            r7.y = r0
            r16.d()
            r0 = 0
            r7.y = r0
            int r1 = r16.getChildCount()
        L_0x0130:
            if (r0 >= r1) goto L_0x015a
            android.view.View r2 = r7.getChildAt(r0)
            int r6 = r2.getVisibility()
            if (r6 == r4) goto L_0x0157
            android.view.ViewGroup$LayoutParams r6 = r2.getLayoutParams()
            com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$b r6 = (com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager.b) r6
            if (r6 == 0) goto L_0x0148
            boolean r8 = r6.f72105a
            if (r8 != 0) goto L_0x0157
        L_0x0148:
            float r8 = (float) r3
            float r6 = r6.f72107c
            float r8 = r8 * r6
            int r6 = (int) r8
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r5)
            int r8 = r7.w
            r2.measure(r8, r6)
        L_0x0157:
            int r0 = r0 + 1
            goto L_0x0130
        L_0x015a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager.onMeasure(int, int):void");
    }

    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        ArrayList<View> arrayList2 = arrayList;
        int i4 = i3;
        if (PatchProxy.isSupport(new Object[]{arrayList2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f72091a, false, 82665, new Class[]{ArrayList.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arrayList2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f72091a, false, 82665, new Class[]{ArrayList.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                if (childAt.getVisibility() == 0) {
                    a a2 = a(childAt);
                    if (a2 != null && a2.f72101b == this.f72094d) {
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
            com.meituan.robust.ChangeQuickRedirect r2 = f72091a
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 82640(0x142d0, float:1.15803E-40)
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
            com.meituan.robust.ChangeQuickRedirect r2 = f72091a
            r3 = 0
            r4 = 82640(0x142d0, float:1.15803E-40)
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
            int r0 = r7.V
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
            com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$b r11 = (com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager.b) r11
            boolean r15 = r11.f72105a
            if (r15 == 0) goto L_0x00da
            int r11 = r11.f72106b
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
            java.util.ArrayList<android.support.v4.view.ViewPager$OnPageChangeListener> r0 = r7.W
            if (r0 == 0) goto L_0x00f7
            java.util.ArrayList<android.support.v4.view.ViewPager$OnPageChangeListener> r0 = r7.W
            java.util.Iterator r0 = r0.iterator()
        L_0x00e7:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00f7
            java.lang.Object r1 = r0.next()
            android.support.v4.view.ViewPager$OnPageChangeListener r1 = (android.support.v4.view.ViewPager.OnPageChangeListener) r1
            r1.onPageScrolled(r8, r9, r10)
            goto L_0x00e7
        L_0x00f7:
            android.support.v4.view.ViewPager$OnPageChangeListener r0 = r7.aa
            if (r0 == 0) goto L_0x0100
            android.support.v4.view.ViewPager$OnPageChangeListener r0 = r7.aa
            r0.onPageScrolled(r8, r9, r10)
        L_0x0100:
            android.support.v4.view.ViewPager$PageTransformer r0 = r7.ac
            if (r0 == 0) goto L_0x0130
            int r0 = r17.getScrollY()
            int r1 = r17.getChildCount()
        L_0x010c:
            if (r12 >= r1) goto L_0x0130
            android.view.View r2 = r7.getChildAt(r12)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$b r3 = (com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager.b) r3
            boolean r3 = r3.f72105a
            if (r3 != 0) goto L_0x012d
            int r3 = r2.getTop()
            int r3 = r3 - r0
            float r3 = (float) r3
            int r4 = r17.getClientHeight()
            float r4 = (float) r4
            float r3 = r3 / r4
            android.support.v4.view.ViewPager$PageTransformer r4 = r7.ac
            r4.transformPage(r2, r3)
        L_0x012d:
            int r12 = r12 + 1
            goto L_0x010c
        L_0x0130:
            r7.U = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager.a(int, float, int):void");
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        int i6 = i3;
        int i7 = i5;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f72091a, false, 82635, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f72091a, false, 82635, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onSizeChanged(i2, i3, i4, i5);
        if (i6 != i7) {
            a(i6, i7, this.r, this.r);
        }
    }

    private void a(int i2, int i3, int i4, int i5) {
        float f2;
        int i6 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f72091a, false, 82636, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f72091a, false, 82636, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (i3 <= 0 || this.j.isEmpty()) {
            a c2 = c(this.f72094d);
            if (c2 != null) {
                f2 = Math.min(c2.f72104e, this.v);
            } else {
                f2 = 0.0f;
            }
            int paddingTop = (int) (f2 * ((float) ((i6 - getPaddingTop()) - getPaddingBottom())));
            if (paddingTop != getScrollY()) {
                a(false);
                scrollTo(getScrollX(), paddingTop);
            }
        } else {
            int scrollY = (int) ((((float) getScrollY()) / ((float) (((i3 - getPaddingTop()) - getPaddingBottom()) + i5))) * ((float) (((i6 - getPaddingTop()) - getPaddingBottom()) + i4)));
            scrollTo(getScrollX(), scrollY);
            if (!this.p.isFinished()) {
                int duration = this.p.getDuration() - this.p.timePassed();
                a c3 = c(this.f72094d);
                this.p.startScroll(0, scrollY, 0, (int) (c3.f72104e * ((float) i6)), duration);
            }
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
            com.meituan.robust.ChangeQuickRedirect r2 = f72091a
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
            r4 = 82637(0x142cd, float:1.15799E-40)
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
            com.meituan.robust.ChangeQuickRedirect r2 = f72091a
            r3 = 0
            r4 = 82637(0x142cd, float:1.15799E-40)
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
            com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$b r8 = (com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager.b) r8
            boolean r9 = r8.f72105a
            if (r9 == 0) goto L_0x014d
            int r9 = r8.f72106b
            r9 = r9 & 7
            int r8 = r8.f72106b
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
            com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$b r8 = (com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager.b) r8
            boolean r10 = r8.f72105a
            if (r10 != 0) goto L_0x01a4
            com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager$a r10 = r7.a((android.view.View) r6)
            if (r10 == 0) goto L_0x01a4
            float r11 = (float) r2
            float r10 = r10.f72104e
            float r10 = r10 * r11
            int r10 = (int) r10
            int r10 = r10 + r4
            boolean r12 = r8.f72108d
            if (r12 == 0) goto L_0x0197
            r12 = 0
            r8.f72108d = r12
            int r12 = r1 - r5
            int r12 = r12 - r14
            r13 = 1073741824(0x40000000, float:2.0)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r13)
            float r8 = r8.f72107c
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
            r7.t = r5
            int r1 = r1 - r14
            r7.u = r1
            r7.V = r15
            boolean r0 = r7.S
            if (r0 == 0) goto L_0x01b9
            int r0 = r7.f72094d
            r1 = 0
            r7.a((int) r0, (boolean) r1, (int) r1, (boolean) r1)
            goto L_0x01ba
        L_0x01b9:
            r1 = 0
        L_0x01ba:
            r7.S = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager.onLayout(boolean, int, int, int, int):void");
    }
}
