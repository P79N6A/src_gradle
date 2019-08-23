package android.arch.paging;

import android.arch.paging.DataSource;
import android.support.annotation.RestrictTo;
import android.support.annotation.WorkerThread;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@Deprecated
public abstract class LivePagedListProvider<Key, Value> extends DataSource.Factory<Key, Value> {
    /* access modifiers changed from: protected */
    @WorkerThread
    public abstract DataSource<Key, Value> createDataSource();

    public DataSource<Key, Value> create() {
        return createDataSource();
    }
}
