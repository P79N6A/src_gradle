package android.support.v4.view;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.views.DelegatingFragmentPagerAdapter;
import java.util.HashMap;

public class DmtRtlViewPager extends DmtViewPager {
    private int mLayoutDirection;
    private HashMap<ViewPager.OnPageChangeListener, ReversingOnPageChangeListener> mPageChangeListeners = new HashMap<>();

    class ReversingAdapter extends DelegatingFragmentPagerAdapter {
        public Fragment getItem(int i) {
            if (DmtRtlViewPager.this.isRtl()) {
                i = (getCount() - i) - 1;
            }
            return super.getItem(i);
        }

        public long getItemId(int i) {
            if (DmtRtlViewPager.this.isRtl()) {
                i = (getCount() - i) - 1;
            }
            return super.getItemId(i);
        }

        public int getItemPosition(Object obj) {
            int itemPosition = super.getItemPosition(obj);
            if (!DmtRtlViewPager.this.isRtl()) {
                return itemPosition;
            }
            if (itemPosition == -1 || itemPosition == -2) {
                return -2;
            }
            return (getCount() - itemPosition) - 1;
        }

        public CharSequence getPageTitle(int i) {
            if (DmtRtlViewPager.this.isRtl()) {
                i = (getCount() - i) - 1;
            }
            return super.getPageTitle(i);
        }

        public float getPageWidth(int i) {
            if (DmtRtlViewPager.this.isRtl()) {
                i = (getCount() - i) - 1;
            }
            return super.getPageWidth(i);
        }

        ReversingAdapter(PagerAdapter pagerAdapter) {
            super(pagerAdapter);
        }

        public Object instantiateItem(View view, int i) {
            if (DmtRtlViewPager.this.isRtl()) {
                i = (getCount() - i) - 1;
            }
            return super.instantiateItem(view, i);
        }

        public Object instantiateItem(ViewGroup viewGroup, int i) {
            if (DmtRtlViewPager.this.isRtl()) {
                i = (getCount() - i) - 1;
            }
            return super.instantiateItem(viewGroup, i);
        }

        public void destroyItem(View view, int i, Object obj) {
            if (DmtRtlViewPager.this.isRtl()) {
                i = (getCount() - i) - 1;
            }
            super.destroyItem(view, i, obj);
        }

        public void setPrimaryItem(View view, int i, Object obj) {
            if (DmtRtlViewPager.this.isRtl()) {
                i = (getCount() - i) - 1;
            }
            super.setPrimaryItem(view, i, obj);
        }

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            if (DmtRtlViewPager.this.isRtl()) {
                i = (getCount() - i) - 1;
            }
            if (i < 0) {
                i = 0;
            }
            super.destroyItem(viewGroup, i, obj);
        }

        public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            if (DmtRtlViewPager.this.isRtl()) {
                i = (getCount() - i) - 1;
            }
            super.setPrimaryItem(viewGroup, i, obj);
        }
    }

    class ReversingOnPageChangeListener implements ViewPager.OnPageChangeListener {
        private final ViewPager.OnPageChangeListener mListener;

        public void onPageScrollStateChanged(int i) {
            this.mListener.onPageScrollStateChanged(i);
        }

        public void onPageSelected(int i) {
            PagerAdapter access$601 = DmtRtlViewPager.super.getAdapter();
            if (DmtRtlViewPager.this.isRtl() && access$601 != null) {
                i = (access$601.getCount() - i) - 1;
            }
            this.mListener.onPageSelected(i);
        }

        ReversingOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
            this.mListener = onPageChangeListener;
        }

        public void onPageScrolled(int i, float f2, int i2) {
            PagerAdapter access$401 = DmtRtlViewPager.super.getAdapter();
            if (!DmtRtlViewPager.this.isRtl() || access$401 == null) {
                this.mListener.onPageScrolled(i, f2, i2);
                return;
            }
            int count = access$401.getCount();
            if (i == count - 1 && f2 == 0.0f) {
                i--;
                i2 = DmtRtlViewPager.this.getWidth();
                f2 = 1.0f;
            }
            this.mListener.onPageScrolled((count - (i + 1)) - 1, 1.0f - f2, DmtRtlViewPager.this.getWidth() - i2);
        }
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks<SavedState>() {
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        });
        public final int mLayoutDirection;
        public final Parcelable mViewPagerSavedState;

        public int describeContents() {
            return 0;
        }

        private SavedState(Parcelable parcelable, int i) {
            this.mViewPagerSavedState = parcelable;
            this.mLayoutDirection = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.mViewPagerSavedState, i);
            parcel.writeInt(this.mLayoutDirection);
        }

        private SavedState(Parcel parcel, ClassLoader classLoader) {
            this.mViewPagerSavedState = parcel.readParcelable(classLoader == null ? getClass().getClassLoader() : classLoader);
            this.mLayoutDirection = parcel.readInt();
        }
    }

    public boolean isRtl() {
        if (this.mLayoutDirection == 1) {
            return true;
        }
        return false;
    }

    public PagerAdapter getAdapter() {
        ReversingAdapter reversingAdapter = (ReversingAdapter) super.getAdapter();
        if (reversingAdapter == null) {
            return null;
        }
        return reversingAdapter.mDelegate;
    }

    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.mLayoutDirection);
    }

    public int getCurrentItem() {
        int currentItem = super.getCurrentItem();
        PagerAdapter adapter = super.getAdapter();
        if (adapter == null || !isRtl()) {
            return currentItem;
        }
        return (adapter.getCount() - currentItem) - 1;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public DmtRtlViewPager(Context context) {
        super(context);
    }

    public void addOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        ReversingOnPageChangeListener reversingOnPageChangeListener = new ReversingOnPageChangeListener(onPageChangeListener);
        this.mPageChangeListeners.put(onPageChangeListener, reversingOnPageChangeListener);
        super.addOnPageChangeListener(reversingOnPageChangeListener);
    }

    public void removeOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        super.removeOnPageChangeListener(this.mPageChangeListeners.get(onPageChangeListener));
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        if (pagerAdapter != null) {
            pagerAdapter = new ReversingAdapter(pagerAdapter);
        }
        super.setAdapter(pagerAdapter);
        setCurrentItem(0);
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        super.setOnPageChangeListener(new ReversingOnPageChangeListener(onPageChangeListener));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mLayoutDirection = savedState.mLayoutDirection;
        super.onRestoreInstanceState(savedState.mViewPagerSavedState);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception unused) {
            if (motionEvent.getAction() != 1) {
                return false;
            }
            motionEvent.setAction(3);
            return super.onTouchEvent(motionEvent);
        }
    }

    public void setCurrentItem(int i) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && isRtl()) {
            i = (adapter.getCount() - i) - 1;
        }
        super.setCurrentItem(i);
    }

    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        int i2 = 0;
        int i3 = 1;
        if (i != 1) {
            i3 = 0;
        }
        if (i3 != this.mLayoutDirection) {
            PagerAdapter adapter = super.getAdapter();
            if (adapter != null) {
                i2 = getCurrentItem();
            }
            this.mLayoutDirection = i3;
            if (adapter != null) {
                adapter.notifyDataSetChanged();
                setCurrentItem(i2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        try {
            return super.getChildDrawingOrder(i, i2);
        } catch (IndexOutOfBoundsException unused) {
            return 0;
        }
    }

    public DmtRtlViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i2) == 0) {
            int i3 = 0;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                childAt.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i3) {
                    i3 = measuredHeight;
                }
            }
            i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void setCurrentItem(int i, boolean z) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && isRtl()) {
            i = (adapter.getCount() - i) - 1;
        }
        super.setCurrentItem(i, z);
    }
}
