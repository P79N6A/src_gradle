package android.support.v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;

public abstract class PagerAdapter {
    private final DataSetObservable mObservable = new DataSetObservable();
    public DataSetObserver mViewPagerObserver;

    @Deprecated
    public void finishUpdate(@NonNull View view) {
    }

    public abstract int getCount();

    public int getItemPosition(@NonNull Object obj) {
        return -1;
    }

    @Nullable
    public CharSequence getPageTitle(int i) {
        return null;
    }

    public float getPageWidth(int i) {
        return 1.0f;
    }

    public abstract boolean isViewFromObject(@NonNull View view, @NonNull Object obj);

    public void restoreState(@Nullable Parcelable parcelable, @Nullable ClassLoader classLoader) {
    }

    @Nullable
    public Parcelable saveState() {
        return null;
    }

    @Deprecated
    public void setPrimaryItem(@NonNull View view, int i, @NonNull Object obj) {
    }

    @Deprecated
    public void startUpdate(@NonNull View view) {
    }

    public void notifyDataSetChanged() {
        synchronized (this) {
            if (this.mViewPagerObserver != null) {
                this.mViewPagerObserver.onChanged();
            }
        }
        this.mObservable.notifyChanged();
    }

    public void finishUpdate(@NonNull ViewGroup viewGroup) {
        finishUpdate((View) viewGroup);
    }

    public void registerDataSetObserver(@NonNull DataSetObserver dataSetObserver) {
        this.mObservable.registerObserver(dataSetObserver);
    }

    /* access modifiers changed from: package-private */
    public void setViewPagerObserver(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.mViewPagerObserver = dataSetObserver;
        }
    }

    public void startUpdate(@NonNull ViewGroup viewGroup) {
        startUpdate((View) viewGroup);
    }

    public void unregisterDataSetObserver(@NonNull DataSetObserver dataSetObserver) {
        this.mObservable.unregisterObserver(dataSetObserver);
    }

    @Deprecated
    @NonNull
    public Object instantiateItem(@NonNull View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        return instantiateItem((View) viewGroup, i);
    }

    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        destroyItem((View) viewGroup, i, obj);
    }

    @Deprecated
    public void destroyItem(@NonNull View view, int i, @NonNull Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        setPrimaryItem((View) viewGroup, i, obj);
    }
}
