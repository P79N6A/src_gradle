package com.bytedance.android.live.uikit.rtl;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;

public class RtlViewPager extends ViewPager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8655a;

    /* renamed from: b  reason: collision with root package name */
    private int f8656b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<ViewPager.OnPageChangeListener, ReversingOnPageChangeListener> f8657c = new HashMap<>();

    class ReversingAdapter extends DelegatingPagerAdapter {

        /* renamed from: c  reason: collision with root package name */
        public static ChangeQuickRedirect f8658c;

        public int getItemPosition(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, f8658c, false, 2260, new Class[]{Object.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{obj}, this, f8658c, false, 2260, new Class[]{Object.class}, Integer.TYPE)).intValue();
            }
            int itemPosition = super.getItemPosition(obj);
            if (RtlViewPager.this.a()) {
                if (itemPosition == -1 || itemPosition == -2) {
                    itemPosition = -2;
                } else {
                    itemPosition = (getCount() - itemPosition) - 1;
                }
            }
            return itemPosition;
        }

        public CharSequence getPageTitle(int i) {
            int i2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f8658c, false, 2261, new Class[]{Integer.TYPE}, CharSequence.class)) {
                return (CharSequence) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f8658c, false, 2261, new Class[]{Integer.TYPE}, CharSequence.class);
            }
            if (RtlViewPager.this.a()) {
                i2 = (getCount() - i) - 1;
            } else {
                i2 = i;
            }
            return super.getPageTitle(i2);
        }

        public float getPageWidth(int i) {
            int i2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f8658c, false, 2262, new Class[]{Integer.TYPE}, Float.TYPE)) {
                return ((Float) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f8658c, false, 2262, new Class[]{Integer.TYPE}, Float.TYPE)).floatValue();
            }
            if (RtlViewPager.this.a()) {
                i2 = (getCount() - i) - 1;
            } else {
                i2 = i;
            }
            return super.getPageWidth(i2);
        }

        public ReversingAdapter(PagerAdapter pagerAdapter) {
            super(pagerAdapter);
        }

        public Object instantiateItem(View view, int i) {
            int i2;
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f8658c, false, 2264, new Class[]{View.class, Integer.TYPE}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f8658c, false, 2264, new Class[]{View.class, Integer.TYPE}, Object.class);
            }
            if (RtlViewPager.this.a()) {
                i2 = (getCount() - i) - 1;
            } else {
                i2 = i;
            }
            return super.instantiateItem(view, i2);
        }

        public Object instantiateItem(ViewGroup viewGroup, int i) {
            int i2;
            if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f8658c, false, 2263, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f8658c, false, 2263, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class);
            }
            if (RtlViewPager.this.a()) {
                i2 = (getCount() - i) - 1;
            } else {
                i2 = i;
            }
            return super.instantiateItem(viewGroup, i2);
        }

        public void destroyItem(View view, int i, Object obj) {
            int i2;
            View view2 = view;
            Object obj2 = obj;
            if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), obj2}, this, f8658c, false, 2259, new Class[]{View.class, Integer.TYPE, Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), obj2}, this, f8658c, false, 2259, new Class[]{View.class, Integer.TYPE, Object.class}, Void.TYPE);
                return;
            }
            if (RtlViewPager.this.a()) {
                i2 = (getCount() - i) - 1;
            } else {
                i2 = i;
            }
            super.destroyItem(view, i2, obj2);
        }

        public void setPrimaryItem(View view, int i, Object obj) {
            int i2;
            View view2 = view;
            Object obj2 = obj;
            if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), obj2}, this, f8658c, false, 2265, new Class[]{View.class, Integer.TYPE, Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), obj2}, this, f8658c, false, 2265, new Class[]{View.class, Integer.TYPE, Object.class}, Void.TYPE);
                return;
            }
            if (RtlViewPager.this.a()) {
                i2 = (getCount() - i) - 1;
            } else {
                i2 = i;
            }
            super.setPrimaryItem(view, i2, obj2);
        }

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            int i2;
            ViewGroup viewGroup2 = viewGroup;
            Object obj2 = obj;
            if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i), obj2}, this, f8658c, false, 2258, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i), obj2}, this, f8658c, false, 2258, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
                return;
            }
            if (RtlViewPager.this.a()) {
                i2 = (getCount() - i) - 1;
            } else {
                i2 = i;
            }
            super.destroyItem(viewGroup, i2, obj2);
        }

        public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            int i2;
            ViewGroup viewGroup2 = viewGroup;
            Object obj2 = obj;
            if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i), obj2}, this, f8658c, false, 2266, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i), obj2}, this, f8658c, false, 2266, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
                return;
            }
            if (RtlViewPager.this.a()) {
                i2 = (getCount() - i) - 1;
            } else {
                i2 = i;
            }
            super.setPrimaryItem(viewGroup, i2, obj2);
        }
    }

    class ReversingOnPageChangeListener implements ViewPager.OnPageChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8660a;

        /* renamed from: c  reason: collision with root package name */
        private final ViewPager.OnPageChangeListener f8662c;

        public void onPageScrollStateChanged(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f8660a, false, 2269, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f8660a, false, 2269, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f8662c.onPageScrollStateChanged(i);
        }

        public void onPageSelected(int i) {
            int i2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f8660a, false, 2268, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f8660a, false, 2268, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            PagerAdapter b2 = RtlViewPager.super.getAdapter();
            if (!RtlViewPager.this.a() || b2 == null) {
                i2 = i;
            } else {
                i2 = (b2.getCount() - i) - 1;
            }
            this.f8662c.onPageSelected(i2);
        }

        public ReversingOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
            this.f8662c = onPageChangeListener;
        }

        public void onPageScrolled(int i, float f2, int i2) {
            int i3;
            int i4;
            float f3;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f8660a, false, 2267, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f8660a, false, 2267, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            int width = RtlViewPager.this.getWidth();
            PagerAdapter a2 = RtlViewPager.super.getAdapter();
            if (!RtlViewPager.this.a() || a2 == null) {
                i4 = i;
                f3 = f2;
                i3 = i2;
            } else {
                int count = a2.getCount();
                float f4 = (float) width;
                int pageWidth = ((int) ((1.0f - a2.getPageWidth(i)) * f4)) + i2;
                int i5 = i;
                while (i5 < count && pageWidth > 0) {
                    i5++;
                    pageWidth -= (int) (a2.getPageWidth(i5) * f4);
                }
                i4 = (count - i5) - 1;
                i3 = -pageWidth;
                f3 = ((float) i3) / (f4 * a2.getPageWidth(i4));
            }
            this.f8662c.onPageScrolled(i4, f3, i3);
        }
    }

    public static class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = ParcelableCompat.newCreator(new RtlViewPager$SavedState$1());

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8664a;

        /* renamed from: b  reason: collision with root package name */
        public final Parcelable f8665b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8666c;

        public int describeContents() {
            return 0;
        }

        private a(Parcelable parcelable, int i) {
            this.f8665b = parcelable;
            this.f8666c = i;
        }

        private a(Parcel parcel, ClassLoader classLoader) {
            this.f8665b = parcel.readParcelable(classLoader == null ? getClass().getClassLoader() : classLoader);
            this.f8666c = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, f8664a, false, 2270, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, f8664a, false, 2270, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            parcel.writeParcelable(this.f8665b, i);
            parcel.writeInt(this.f8666c);
        }

        /* synthetic */ a(Parcel parcel, ClassLoader classLoader, byte b2) {
            this(parcel, classLoader);
        }

        /* synthetic */ a(Parcelable parcelable, int i, byte b2) {
            this(parcelable, i);
        }
    }

    public final boolean a() {
        if (this.f8656b == 1) {
            return true;
        }
        return false;
    }

    public void clearOnPageChangeListeners() {
        if (PatchProxy.isSupport(new Object[0], this, f8655a, false, 2256, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8655a, false, 2256, new Class[0], Void.TYPE);
            return;
        }
        super.clearOnPageChangeListeners();
        this.f8657c.clear();
    }

    public PagerAdapter getAdapter() {
        if (PatchProxy.isSupport(new Object[0], this, f8655a, false, 2247, new Class[0], PagerAdapter.class)) {
            return (PagerAdapter) PatchProxy.accessDispatch(new Object[0], this, f8655a, false, 2247, new Class[0], PagerAdapter.class);
        }
        ReversingAdapter reversingAdapter = (ReversingAdapter) super.getAdapter();
        if (reversingAdapter == null) {
            return null;
        }
        return reversingAdapter.f8652b;
    }

    public Parcelable onSaveInstanceState() {
        if (!PatchProxy.isSupport(new Object[0], this, f8655a, false, 2251, new Class[0], Parcelable.class)) {
            return new a(super.onSaveInstanceState(), this.f8656b, (byte) 0);
        }
        return (Parcelable) PatchProxy.accessDispatch(new Object[0], this, f8655a, false, 2251, new Class[0], Parcelable.class);
    }

    public int getCurrentItem() {
        if (PatchProxy.isSupport(new Object[0], this, f8655a, false, 2248, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f8655a, false, 2248, new Class[0], Integer.TYPE)).intValue();
        }
        int currentItem = super.getCurrentItem();
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && a()) {
            currentItem = (adapter.getCount() - currentItem) - 1;
        }
        return currentItem;
    }

    public RtlViewPager(Context context) {
        super(context);
    }

    public void addOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        if (PatchProxy.isSupport(new Object[]{onPageChangeListener}, this, f8655a, false, 2254, new Class[]{ViewPager.OnPageChangeListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onPageChangeListener}, this, f8655a, false, 2254, new Class[]{ViewPager.OnPageChangeListener.class}, Void.TYPE);
            return;
        }
        ReversingOnPageChangeListener reversingOnPageChangeListener = new ReversingOnPageChangeListener(onPageChangeListener);
        this.f8657c.put(onPageChangeListener, reversingOnPageChangeListener);
        super.addOnPageChangeListener(reversingOnPageChangeListener);
    }

    public void removeOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        if (PatchProxy.isSupport(new Object[]{onPageChangeListener}, this, f8655a, false, 2255, new Class[]{ViewPager.OnPageChangeListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onPageChangeListener}, this, f8655a, false, 2255, new Class[]{ViewPager.OnPageChangeListener.class}, Void.TYPE);
            return;
        }
        ReversingOnPageChangeListener remove = this.f8657c.remove(onPageChangeListener);
        if (remove != null) {
            super.removeOnPageChangeListener(remove);
        }
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2;
        if (PatchProxy.isSupport(new Object[]{pagerAdapter}, this, f8655a, false, 2246, new Class[]{PagerAdapter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pagerAdapter}, this, f8655a, false, 2246, new Class[]{PagerAdapter.class}, Void.TYPE);
            return;
        }
        if (pagerAdapter != null) {
            pagerAdapter2 = new ReversingAdapter(pagerAdapter);
        } else {
            pagerAdapter2 = pagerAdapter;
        }
        super.setAdapter(pagerAdapter2);
        setCurrentItem(0);
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        if (PatchProxy.isSupport(new Object[]{onPageChangeListener}, this, f8655a, false, 2253, new Class[]{ViewPager.OnPageChangeListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onPageChangeListener}, this, f8655a, false, 2253, new Class[]{ViewPager.OnPageChangeListener.class}, Void.TYPE);
            return;
        }
        super.setOnPageChangeListener(new ReversingOnPageChangeListener(onPageChangeListener));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (PatchProxy.isSupport(new Object[]{parcelable}, this, f8655a, false, 2252, new Class[]{Parcelable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcelable}, this, f8655a, false, 2252, new Class[]{Parcelable.class}, Void.TYPE);
        } else if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
        } else {
            a aVar = (a) parcelable;
            this.f8656b = aVar.f8666c;
            super.onRestoreInstanceState(aVar.f8665b);
        }
    }

    public void onRtlPropertiesChanged(int i) {
        int i2 = 1;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f8655a, false, 2245, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f8655a, false, 2245, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onRtlPropertiesChanged(i);
        if (i != 1) {
            i2 = 0;
        }
        if (i2 != this.f8656b) {
            PagerAdapter adapter = super.getAdapter();
            if (adapter != null) {
                i3 = getCurrentItem();
            }
            this.f8656b = i2;
            if (adapter != null) {
                adapter.notifyDataSetChanged();
                setCurrentItem(i3);
            }
        }
    }

    public void setCurrentItem(int i) {
        int i2;
        RtlViewPager rtlViewPager;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f8655a, false, 2250, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f8655a, false, 2250, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        PagerAdapter adapter = super.getAdapter();
        if (adapter == null || !a()) {
            rtlViewPager = this;
            i2 = i;
        } else {
            i2 = (adapter.getCount() - i) - 1;
            rtlViewPager = this;
        }
        super.setCurrentItem(i2);
    }

    public RtlViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f8655a, false, 2257, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f8655a, false, 2257, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            int i4 = 0;
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                childAt.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i4) {
                    i4 = measuredHeight;
                }
            }
            i3 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        } else {
            i3 = i2;
        }
        super.onMeasure(i, i3);
    }

    public void setCurrentItem(int i, boolean z) {
        int i2;
        boolean z2;
        RtlViewPager rtlViewPager;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f8655a, false, 2249, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z)}, this, f8655a, false, 2249, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        PagerAdapter adapter = super.getAdapter();
        if (adapter == null || !a()) {
            rtlViewPager = this;
            i2 = i;
            z2 = z;
        } else {
            z2 = z;
            i2 = (adapter.getCount() - i) - 1;
            rtlViewPager = this;
        }
        super.setCurrentItem(i2, z2);
    }
}
