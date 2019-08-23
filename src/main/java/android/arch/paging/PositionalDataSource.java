package android.arch.paging;

import android.arch.core.util.Function;
import android.arch.paging.DataSource;
import android.arch.paging.PageResult;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

public abstract class PositionalDataSource<T> extends DataSource<Integer, T> {

    static class ContiguousWithoutPlaceholdersWrapper<Value> extends ContiguousDataSource<Integer, Value> {
        @NonNull
        final PositionalDataSource<Value> mSource;

        public void invalidate() {
            this.mSource.invalidate();
        }

        public boolean isInvalid() {
            return this.mSource.isInvalid();
        }

        ContiguousWithoutPlaceholdersWrapper(@NonNull PositionalDataSource<Value> positionalDataSource) {
            this.mSource = positionalDataSource;
        }

        public void addInvalidatedCallback(@NonNull DataSource.InvalidatedCallback invalidatedCallback) {
            this.mSource.addInvalidatedCallback(invalidatedCallback);
        }

        @NonNull
        public <ToValue> DataSource<Integer, ToValue> map(@NonNull Function<Value, ToValue> function) {
            throw new UnsupportedOperationException("Inaccessible inner type doesn't support map op");
        }

        @NonNull
        public <ToValue> DataSource<Integer, ToValue> mapByPage(@NonNull Function<List<Value>, List<ToValue>> function) {
            throw new UnsupportedOperationException("Inaccessible inner type doesn't support map op");
        }

        public void removeInvalidatedCallback(@NonNull DataSource.InvalidatedCallback invalidatedCallback) {
            this.mSource.removeInvalidatedCallback(invalidatedCallback);
        }

        /* access modifiers changed from: package-private */
        public Integer getKey(int i, Value value) {
            return Integer.valueOf(i);
        }

        /* access modifiers changed from: package-private */
        public void dispatchLoadAfter(int i, @NonNull Value value, int i2, @NonNull Executor executor, @NonNull PageResult.Receiver<Value> receiver) {
            this.mSource.dispatchLoadRange(1, i + 1, i2, executor, receiver);
        }

        /* access modifiers changed from: package-private */
        public void dispatchLoadBefore(int i, @NonNull Value value, int i2, @NonNull Executor executor, @NonNull PageResult.Receiver<Value> receiver) {
            int i3 = i - 1;
            if (i3 < 0) {
                this.mSource.dispatchLoadRange(2, i3, 0, executor, receiver);
                return;
            }
            int min = Math.min(i2, i3 + 1);
            this.mSource.dispatchLoadRange(2, (i3 - min) + 1, min, executor, receiver);
        }

        /* access modifiers changed from: package-private */
        public void dispatchLoadInitial(@Nullable Integer num, int i, int i2, boolean z, @NonNull Executor executor, @NonNull PageResult.Receiver<Value> receiver) {
            int i3;
            if (num == null) {
                i3 = 0;
            } else {
                i3 = num.intValue();
            }
            this.mSource.dispatchLoadInitial(false, i3, i, i2, executor, receiver);
        }
    }

    public static abstract class LoadInitialCallback<T> {
        public abstract void onResult(@NonNull List<T> list, int i);

        public abstract void onResult(@NonNull List<T> list, int i, int i2);
    }

    static class LoadInitialCallbackImpl<T> extends LoadInitialCallback<T> {
        final DataSource.LoadCallbackHelper<T> mCallbackHelper;
        private final boolean mCountingEnabled;
        private final int mPageSize;

        public void onResult(@NonNull List<T> list, int i) {
            if (this.mCallbackHelper.dispatchInvalidResultIfInvalid()) {
                return;
            }
            if (i < 0) {
                throw new IllegalArgumentException("Position must be non-negative");
            } else if (list.isEmpty() && i != 0) {
                throw new IllegalArgumentException("Initial result cannot be empty if items are present in data set.");
            } else if (!this.mCountingEnabled) {
                this.mCallbackHelper.dispatchResultToReceiver(new PageResult(list, i));
            } else {
                throw new IllegalStateException("Placeholders requested, but totalCount not provided. Please call the three-parameter onResult method, or disable placeholders in the PagedList.Config");
            }
        }

        public void onResult(@NonNull List<T> list, int i, int i2) {
            if (!this.mCallbackHelper.dispatchInvalidResultIfInvalid()) {
                DataSource.LoadCallbackHelper.validateInitialLoadParams(list, i, i2);
                if (list.size() + i != i2 && list.size() % this.mPageSize != 0) {
                    throw new IllegalArgumentException("PositionalDataSource requires initial load size to be a multiple of page size to support internal tiling. loadSize " + list.size() + ", position " + i + ", totalCount " + i2 + ", pageSize " + this.mPageSize);
                } else if (this.mCountingEnabled) {
                    this.mCallbackHelper.dispatchResultToReceiver(new PageResult(list, i, (i2 - i) - list.size(), 0));
                } else {
                    this.mCallbackHelper.dispatchResultToReceiver(new PageResult(list, i));
                }
            }
        }

        LoadInitialCallbackImpl(@NonNull PositionalDataSource positionalDataSource, boolean z, int i, PageResult.Receiver<T> receiver) {
            this.mCallbackHelper = new DataSource.LoadCallbackHelper<>(positionalDataSource, 0, null, receiver);
            this.mCountingEnabled = z;
            this.mPageSize = i;
            if (this.mPageSize <= 0) {
                throw new IllegalArgumentException("Page size must be non-negative");
            }
        }
    }

    public static class LoadInitialParams {
        public final int pageSize;
        public final boolean placeholdersEnabled;
        public final int requestedLoadSize;
        public final int requestedStartPosition;

        public LoadInitialParams(int i, int i2, int i3, boolean z) {
            this.requestedStartPosition = i;
            this.requestedLoadSize = i2;
            this.pageSize = i3;
            this.placeholdersEnabled = z;
        }
    }

    public static abstract class LoadRangeCallback<T> {
        public abstract void onResult(@NonNull List<T> list);
    }

    static class LoadRangeCallbackImpl<T> extends LoadRangeCallback<T> {
        private DataSource.LoadCallbackHelper<T> mCallbackHelper;
        private final int mPositionOffset;

        public void onResult(@NonNull List<T> list) {
            if (!this.mCallbackHelper.dispatchInvalidResultIfInvalid()) {
                this.mCallbackHelper.dispatchResultToReceiver(new PageResult(list, 0, 0, this.mPositionOffset));
            }
        }

        LoadRangeCallbackImpl(@NonNull PositionalDataSource positionalDataSource, int i, int i2, Executor executor, PageResult.Receiver<T> receiver) {
            this.mCallbackHelper = new DataSource.LoadCallbackHelper<>(positionalDataSource, i, executor, receiver);
            this.mPositionOffset = i2;
        }
    }

    public static class LoadRangeParams {
        public final int loadSize;
        public final int startPosition;

        public LoadRangeParams(int i, int i2) {
            this.startPosition = i;
            this.loadSize = i2;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isContiguous() {
        return false;
    }

    @WorkerThread
    public abstract void loadInitial(@NonNull LoadInitialParams loadInitialParams, @NonNull LoadInitialCallback<T> loadInitialCallback);

    @WorkerThread
    public abstract void loadRange(@NonNull LoadRangeParams loadRangeParams, @NonNull LoadRangeCallback<T> loadRangeCallback);

    /* access modifiers changed from: package-private */
    @NonNull
    public ContiguousDataSource<Integer, T> wrapAsContiguousWithoutPlaceholders() {
        return new ContiguousWithoutPlaceholdersWrapper(this);
    }

    @NonNull
    public final <V> PositionalDataSource<V> map(@NonNull Function<T, V> function) {
        return mapByPage(createListFunction(function));
    }

    @NonNull
    public final <V> PositionalDataSource<V> mapByPage(@NonNull Function<List<T>, List<V>> function) {
        return new WrapperPositionalDataSource(this, function);
    }

    public static int computeInitialLoadPosition(@NonNull LoadInitialParams loadInitialParams, int i) {
        int i2 = loadInitialParams.requestedStartPosition;
        int i3 = loadInitialParams.requestedLoadSize;
        int i4 = loadInitialParams.pageSize;
        return Math.max(0, Math.min(((((i - i3) + i4) - 1) / i4) * i4, Math.round((float) (i2 / i4)) * i4));
    }

    public static int computeInitialLoadSize(@NonNull LoadInitialParams loadInitialParams, int i, int i2) {
        return Math.min(i2 - i, loadInitialParams.requestedLoadSize);
    }

    /* access modifiers changed from: package-private */
    public final void dispatchLoadRange(int i, int i2, int i3, @NonNull Executor executor, @NonNull PageResult.Receiver<T> receiver) {
        LoadRangeCallbackImpl loadRangeCallbackImpl = new LoadRangeCallbackImpl(this, i, i2, executor, receiver);
        if (i3 == 0) {
            loadRangeCallbackImpl.onResult(Collections.emptyList());
        } else {
            loadRange(new LoadRangeParams(i2, i3), loadRangeCallbackImpl);
        }
    }

    /* access modifiers changed from: package-private */
    public final void dispatchLoadInitial(boolean z, int i, int i2, int i3, @NonNull Executor executor, @NonNull PageResult.Receiver<T> receiver) {
        LoadInitialCallbackImpl loadInitialCallbackImpl = new LoadInitialCallbackImpl(this, z, i3, receiver);
        loadInitial(new LoadInitialParams(i, i2, i3, z), loadInitialCallbackImpl);
        loadInitialCallbackImpl.mCallbackHelper.setPostExecutor(executor);
    }
}
