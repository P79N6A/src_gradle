package android.arch.paging;

import android.arch.paging.PagedList;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class SnapshotPagedList<T> extends PagedList<T> {
    private final boolean mContiguous;
    private final DataSource<?, T> mDataSource;
    private final Object mLastKey;

    /* access modifiers changed from: package-private */
    public void dispatchUpdatesSinceSnapshot(@NonNull PagedList<T> pagedList, @NonNull PagedList.Callback callback) {
    }

    public boolean isDetached() {
        return true;
    }

    public boolean isImmutable() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public void loadAroundInternal(int i) {
    }

    @NonNull
    public DataSource<?, T> getDataSource() {
        return this.mDataSource;
    }

    @Nullable
    public Object getLastKey() {
        return this.mLastKey;
    }

    /* access modifiers changed from: package-private */
    public boolean isContiguous() {
        return this.mContiguous;
    }

    SnapshotPagedList(@NonNull PagedList<T> pagedList) {
        super(pagedList.mStorage.snapshot(), pagedList.mMainThreadExecutor, pagedList.mBackgroundThreadExecutor, null, pagedList.mConfig);
        this.mDataSource = pagedList.getDataSource();
        this.mContiguous = pagedList.isContiguous();
        this.mLastKey = pagedList.getLastKey();
    }
}
