package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;

public class RtlViewPager extends ViewPager {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f76402c;

    /* renamed from: a  reason: collision with root package name */
    private int f76403a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap<ViewPager.OnPageChangeListener, ReversingOnPageChangeListener> f76404b = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public boolean f76405d;

    class ReversingAdapter extends DelegatingFragmentPagerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76406a;

        public Fragment getItem(int i) {
            int i2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f76406a, false, 89630, new Class[]{Integer.TYPE}, Fragment.class)) {
                return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f76406a, false, 89630, new Class[]{Integer.TYPE}, Fragment.class);
            }
            if (RtlViewPager.this.a()) {
                i2 = (getCount() - i) - 1;
            } else {
                i2 = i;
            }
            return super.getItem(i2);
        }

        public long getItemId(int i) {
            int i2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f76406a, false, 89631, new Class[]{Integer.TYPE}, Long.TYPE)) {
                return ((Long) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f76406a, false, 89631, new Class[]{Integer.TYPE}, Long.TYPE)).longValue();
            }
            if (RtlViewPager.this.a()) {
                i2 = (getCount() - i) - 1;
            } else {
                i2 = i;
            }
            return super.getItemId(i2);
        }

        public int getItemPosition(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, f76406a, false, 89634, new Class[]{Object.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{obj}, this, f76406a, false, 89634, new Class[]{Object.class}, Integer.TYPE)).intValue();
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
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f76406a, false, 89635, new Class[]{Integer.TYPE}, CharSequence.class)) {
                return (CharSequence) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f76406a, false, 89635, new Class[]{Integer.TYPE}, CharSequence.class);
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
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f76406a, false, 89636, new Class[]{Integer.TYPE}, Float.TYPE)) {
                return ((Float) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f76406a, false, 89636, new Class[]{Integer.TYPE}, Float.TYPE)).floatValue();
            }
            if (RtlViewPager.this.a()) {
                i2 = (getCount() - i) - 1;
            } else {
                i2 = i;
            }
            return super.getPageWidth(i2);
        }

        ReversingAdapter(PagerAdapter pagerAdapter) {
            super(pagerAdapter);
        }

        public Object instantiateItem(View view, int i) {
            int i2;
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f76406a, false, 89638, new Class[]{View.class, Integer.TYPE}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f76406a, false, 89638, new Class[]{View.class, Integer.TYPE}, Object.class);
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
            if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f76406a, false, 89637, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f76406a, false, 89637, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class);
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
            if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), obj2}, this, f76406a, false, 89633, new Class[]{View.class, Integer.TYPE, Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), obj2}, this, f76406a, false, 89633, new Class[]{View.class, Integer.TYPE, Object.class}, Void.TYPE);
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
            if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), obj2}, this, f76406a, false, 89639, new Class[]{View.class, Integer.TYPE, Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), obj2}, this, f76406a, false, 89639, new Class[]{View.class, Integer.TYPE, Object.class}, Void.TYPE);
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
            if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i), obj2}, this, f76406a, false, 89632, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i), obj2}, this, f76406a, false, 89632, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
                return;
            }
            if (RtlViewPager.this.a()) {
                i2 = (getCount() - i) - 1;
            } else {
                i2 = i;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            super.destroyItem(viewGroup, i2, obj2);
        }

        public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            int i2;
            ViewGroup viewGroup2 = viewGroup;
            Object obj2 = obj;
            if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i), obj2}, this, f76406a, false, 89640, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i), obj2}, this, f76406a, false, 89640, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
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
        public static ChangeQuickRedirect f76408a;

        /* renamed from: c  reason: collision with root package name */
        private final ViewPager.OnPageChangeListener f76410c;

        public void onPageSelected(int i) {
            int i2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f76408a, false, 89642, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f76408a, false, 89642, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            PagerAdapter b2 = RtlViewPager.super.getAdapter();
            if (!RtlViewPager.this.a() || b2 == null) {
                i2 = i;
            } else {
                i2 = (b2.getCount() - i) - 1;
            }
            this.f76410c.onPageSelected(i2);
        }

        public void onPageScrollStateChanged(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f76408a, false, 89643, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f76408a, false, 89643, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f76410c.onPageScrollStateChanged(i);
            if (RtlViewPager.this.f76405d) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f76408a, false, 89644, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f76408a, false, 89644, new Class[]{Integer.TYPE}, Void.TYPE);
                } else if (i == 0 && !RtlViewPager.this.a() && RtlViewPager.this.getCurrentItem() == 0 && RtlViewPager.this.getScrollX() > 0) {
                    RtlViewPager.this.setScrollX(0);
                }
            }
        }

        ReversingOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
            this.f76410c = onPageChangeListener;
        }

        public void onPageScrolled(int i, float f2, int i2) {
            int count;
            int i3;
            int i4;
            int i5 = i;
            float f3 = f2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f76408a, false, 89641, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f76408a, false, 89641, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            PagerAdapter a2 = RtlViewPager.super.getAdapter();
            if (!RtlViewPager.this.a() || a2 == null) {
                this.f76410c.onPageScrolled(i, f3, i2);
                return;
            }
            if (i5 == a2.getCount() - 1 && f3 == 0.0f) {
                i4 = i5 - 1;
                i3 = RtlViewPager.this.getWidth();
                f3 = 1.0f;
            } else {
                i3 = i2;
                i4 = i5;
            }
            this.f76410c.onPageScrolled((count - (i4 + 1)) - 1, 1.0f - f3, RtlViewPager.this.getWidth() - i3);
        }
    }

    public static class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = ParcelableCompat.newCreator(new RtlViewPager$SavedState$1());

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76412a;

        /* renamed from: b  reason: collision with root package name */
        public final Parcelable f76413b;

        /* renamed from: c  reason: collision with root package name */
        public final int f76414c;

        public int describeContents() {
            return 0;
        }

        private a(Parcelable parcelable, int i) {
            this.f76413b = parcelable;
            this.f76414c = i;
        }

        private a(Parcel parcel, ClassLoader classLoader) {
            this.f76413b = parcel.readParcelable(classLoader == null ? getClass().getClassLoader() : classLoader);
            this.f76414c = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, f76412a, false, 89645, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, f76412a, false, 89645, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            parcel.writeParcelable(this.f76413b, i);
            parcel.writeInt(this.f76414c);
        }

        /* synthetic */ a(Parcel parcel, ClassLoader classLoader, byte b2) {
            this(parcel, classLoader);
        }

        /* synthetic */ a(Parcelable parcelable, int i, byte b2) {
            this(parcelable, i);
        }
    }

    public final boolean a() {
        if (this.f76403a == 1) {
            return true;
        }
        return false;
    }

    public PagerAdapter getAdapter() {
        if (PatchProxy.isSupport(new Object[0], this, f76402c, false, 89618, new Class[0], PagerAdapter.class)) {
            return (PagerAdapter) PatchProxy.accessDispatch(new Object[0], this, f76402c, false, 89618, new Class[0], PagerAdapter.class);
        }
        ReversingAdapter reversingAdapter = (ReversingAdapter) super.getAdapter();
        if (reversingAdapter == null) {
            return null;
        }
        return reversingAdapter.mDelegate;
    }

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f76402c, false, 89629, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f76402c, false, 89629, new Class[0], Integer.TYPE)).intValue();
        } else if (getAdapter() == null) {
            return 0;
        } else {
            return getAdapter().getCount();
        }
    }

    public Parcelable onSaveInstanceState() {
        if (!PatchProxy.isSupport(new Object[0], this, f76402c, false, 89622, new Class[0], Parcelable.class)) {
            return new a(super.onSaveInstanceState(), this.f76403a, (byte) 0);
        }
        return (Parcelable) PatchProxy.accessDispatch(new Object[0], this, f76402c, false, 89622, new Class[0], Parcelable.class);
    }

    public int getCurrentItem() {
        if (PatchProxy.isSupport(new Object[0], this, f76402c, false, 89619, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f76402c, false, 89619, new Class[0], Integer.TYPE)).intValue();
        }
        int currentItem = super.getCurrentItem();
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && a()) {
            currentItem = (adapter.getCount() - currentItem) - 1;
        }
        return currentItem;
    }

    public void setCheckScrollXWhenIdle(boolean z) {
        this.f76405d = z;
    }

    public RtlViewPager(Context context) {
        super(context);
    }

    public void addOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        if (PatchProxy.isSupport(new Object[]{onPageChangeListener}, this, f76402c, false, 89625, new Class[]{ViewPager.OnPageChangeListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onPageChangeListener}, this, f76402c, false, 89625, new Class[]{ViewPager.OnPageChangeListener.class}, Void.TYPE);
            return;
        }
        ReversingOnPageChangeListener reversingOnPageChangeListener = new ReversingOnPageChangeListener(onPageChangeListener);
        this.f76404b.put(onPageChangeListener, reversingOnPageChangeListener);
        super.addOnPageChangeListener(reversingOnPageChangeListener);
    }

    public void removeOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        if (PatchProxy.isSupport(new Object[]{onPageChangeListener}, this, f76402c, false, 89626, new Class[]{ViewPager.OnPageChangeListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onPageChangeListener}, this, f76402c, false, 89626, new Class[]{ViewPager.OnPageChangeListener.class}, Void.TYPE);
            return;
        }
        super.removeOnPageChangeListener(this.f76404b.get(onPageChangeListener));
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        if (PatchProxy.isSupport(new Object[]{onPageChangeListener}, this, f76402c, false, 89624, new Class[]{ViewPager.OnPageChangeListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onPageChangeListener}, this, f76402c, false, 89624, new Class[]{ViewPager.OnPageChangeListener.class}, Void.TYPE);
            return;
        }
        super.setOnPageChangeListener(new ReversingOnPageChangeListener(onPageChangeListener));
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f76402c, false, 89615, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f76402c, false, 89615, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (PatchProxy.isSupport(new Object[]{parcelable}, this, f76402c, false, 89623, new Class[]{Parcelable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcelable}, this, f76402c, false, 89623, new Class[]{Parcelable.class}, Void.TYPE);
        } else if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
        } else {
            a aVar = (a) parcelable;
            this.f76403a = aVar.f76414c;
            super.onRestoreInstanceState(aVar.f76413b);
        }
    }

    public void onRtlPropertiesChanged(int i) {
        int i2 = 1;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f76402c, false, 89616, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f76402c, false, 89616, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onRtlPropertiesChanged(i);
        if (i != 1) {
            i2 = 0;
        }
        if (i2 != this.f76403a) {
            PagerAdapter adapter = super.getAdapter();
            if (adapter != null) {
                i3 = getCurrentItem();
            }
            this.f76403a = i2;
            if (adapter != null) {
                adapter.notifyDataSetChanged();
                setCurrentItem(i3);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f76402c, false, 89614, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f76402c, false, 89614, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception unused) {
            if (motionEvent.getAction() != 1) {
                return false;
            }
            motionEvent2.setAction(3);
            return super.onTouchEvent(motionEvent);
        }
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2;
        if (PatchProxy.isSupport(new Object[]{pagerAdapter}, this, f76402c, false, 89617, new Class[]{PagerAdapter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pagerAdapter}, this, f76402c, false, 89617, new Class[]{PagerAdapter.class}, Void.TYPE);
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

    public void setCurrentItem(int i) {
        int i2;
        RtlViewPager rtlViewPager;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f76402c, false, 89621, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f76402c, false, 89621, new Class[]{Integer.TYPE}, Void.TYPE);
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

    public int getChildDrawingOrder(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f76402c, false, 89628, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f76402c, false, 89628, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        try {
            return super.getChildDrawingOrder(i, i2);
        } catch (IndexOutOfBoundsException unused) {
            return 0;
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f76402c, false, 89627, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f76402c, false, 89627, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
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
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f76402c, false, 89620, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z)}, this, f76402c, false, 89620, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
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
