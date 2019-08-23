package android.arch.paging;

import android.arch.paging.PositionalDataSource;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.annotation.WorkerThread;
import java.util.Collections;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@Deprecated
public abstract class TiledDataSource<T> extends PositionalDataSource<T> {
    @WorkerThread
    public abstract int countItems();

    /* access modifiers changed from: package-private */
    public boolean isContiguous() {
        return false;
    }

    @WorkerThread
    public abstract List<T> loadRange(int i, int i2);

    public void loadRange(@NonNull PositionalDataSource.LoadRangeParams loadRangeParams, @NonNull PositionalDataSource.LoadRangeCallback<T> loadRangeCallback) {
        List loadRange = loadRange(loadRangeParams.startPosition, loadRangeParams.loadSize);
        if (loadRange != null) {
            loadRangeCallback.onResult(loadRange);
        } else {
            invalidate();
        }
    }

    public void loadInitial(@NonNull PositionalDataSource.LoadInitialParams loadInitialParams, @NonNull PositionalDataSource.LoadInitialCallback<T> loadInitialCallback) {
        int countItems = countItems();
        if (countItems == 0) {
            loadInitialCallback.onResult(Collections.emptyList(), 0, 0);
            return;
        }
        int computeInitialLoadPosition = computeInitialLoadPosition(loadInitialParams, countItems);
        int computeInitialLoadSize = computeInitialLoadSize(loadInitialParams, computeInitialLoadPosition, countItems);
        List loadRange = loadRange(computeInitialLoadPosition, computeInitialLoadSize);
        if (loadRange == null || loadRange.size() != computeInitialLoadSize) {
            invalidate();
        } else {
            loadInitialCallback.onResult(loadRange, computeInitialLoadPosition, countItems);
        }
    }
}
