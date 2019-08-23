package android.arch.paging;

import android.support.annotation.AnyThread;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.WorkerThread;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class PagedList<T> extends AbstractList<T> {
    @NonNull
    final Executor mBackgroundThreadExecutor;
    @Nullable
    final BoundaryCallback<T> mBoundaryCallback;
    public boolean mBoundaryCallbackBeginDeferred;
    public boolean mBoundaryCallbackEndDeferred;
    private final ArrayList<WeakReference<Callback>> mCallbacks = new ArrayList<>();
    @NonNull
    final Config mConfig;
    private final AtomicBoolean mDetached = new AtomicBoolean(false);
    private int mHighestIndexAccessed = Integer.MIN_VALUE;
    T mLastItem;
    int mLastLoad;
    private int mLowestIndexAccessed = Integer.MAX_VALUE;
    @NonNull
    final Executor mMainThreadExecutor;
    @NonNull
    final PagedStorage<T> mStorage;

    @MainThread
    public static abstract class BoundaryCallback<T> {
        public void onItemAtEndLoaded(@NonNull T t) {
        }

        public void onItemAtFrontLoaded(@NonNull T t) {
        }

        public void onZeroItemsLoaded() {
        }
    }

    public static final class Builder<Key, Value> {
        private BoundaryCallback mBoundaryCallback;
        private final Config mConfig;
        private final DataSource<Key, Value> mDataSource;
        private Executor mFetchExecutor;
        private Key mInitialKey;
        private Executor mNotifyExecutor;

        @WorkerThread
        @NonNull
        public final PagedList<Value> build() {
            if (this.mNotifyExecutor == null) {
                throw new IllegalArgumentException("MainThreadExecutor required");
            } else if (this.mFetchExecutor != null) {
                return PagedList.create(this.mDataSource, this.mNotifyExecutor, this.mFetchExecutor, this.mBoundaryCallback, this.mConfig, this.mInitialKey);
            } else {
                throw new IllegalArgumentException("BackgroundThreadExecutor required");
            }
        }

        @NonNull
        public final Builder<Key, Value> setBoundaryCallback(@Nullable BoundaryCallback boundaryCallback) {
            this.mBoundaryCallback = boundaryCallback;
            return this;
        }

        @NonNull
        public final Builder<Key, Value> setFetchExecutor(@NonNull Executor executor) {
            this.mFetchExecutor = executor;
            return this;
        }

        @NonNull
        public final Builder<Key, Value> setInitialKey(@Nullable Key key) {
            this.mInitialKey = key;
            return this;
        }

        @NonNull
        public final Builder<Key, Value> setNotifyExecutor(@NonNull Executor executor) {
            this.mNotifyExecutor = executor;
            return this;
        }

        public Builder(@NonNull DataSource<Key, Value> dataSource, int i) {
            this(dataSource, new Config.Builder().setPageSize(i).build());
        }

        public Builder(@NonNull DataSource<Key, Value> dataSource, @NonNull Config config) {
            if (dataSource == null) {
                throw new IllegalArgumentException("DataSource may not be null");
            } else if (config != null) {
                this.mDataSource = dataSource;
                this.mConfig = config;
            } else {
                throw new IllegalArgumentException("Config may not be null");
            }
        }
    }

    public static abstract class Callback {
        public abstract void onChanged(int i, int i2);

        public abstract void onInserted(int i, int i2);

        public abstract void onRemoved(int i, int i2);
    }

    public static class Config {
        public final boolean enablePlaceholders;
        public final int initialLoadSizeHint;
        public final int pageSize;
        public final int prefetchDistance;

        public static final class Builder {
            private boolean mEnablePlaceholders = true;
            private int mInitialLoadSizeHint = -1;
            private int mPageSize = -1;
            private int mPrefetchDistance = -1;

            public final Config build() {
                if (this.mPageSize > 0) {
                    if (this.mPrefetchDistance < 0) {
                        this.mPrefetchDistance = this.mPageSize;
                    }
                    if (this.mInitialLoadSizeHint < 0) {
                        this.mInitialLoadSizeHint = this.mPageSize * 3;
                    }
                    if (this.mEnablePlaceholders || this.mPrefetchDistance != 0) {
                        Config config = new Config(this.mPageSize, this.mPrefetchDistance, this.mEnablePlaceholders, this.mInitialLoadSizeHint);
                        return config;
                    }
                    throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in the PagedList, so either placeholders must be enabled, or prefetch distance must be > 0.");
                }
                throw new IllegalArgumentException("Page size must be a positive number");
            }

            public final Builder setEnablePlaceholders(boolean z) {
                this.mEnablePlaceholders = z;
                return this;
            }

            public final Builder setInitialLoadSizeHint(int i) {
                this.mInitialLoadSizeHint = i;
                return this;
            }

            public final Builder setPageSize(int i) {
                this.mPageSize = i;
                return this;
            }

            public final Builder setPrefetchDistance(int i) {
                this.mPrefetchDistance = i;
                return this;
            }
        }

        private Config(int i, int i2, boolean z, int i3) {
            this.pageSize = i;
            this.prefetchDistance = i2;
            this.enablePlaceholders = z;
            this.initialLoadSizeHint = i3;
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void dispatchUpdatesSinceSnapshot(@NonNull PagedList<T> pagedList, @NonNull Callback callback);

    @NonNull
    public abstract DataSource<?, T> getDataSource();

    @Nullable
    public abstract Object getLastKey();

    /* access modifiers changed from: package-private */
    public abstract boolean isContiguous();

    /* access modifiers changed from: package-private */
    public abstract void loadAroundInternal(int i);

    @NonNull
    public Config getConfig() {
        return this.mConfig;
    }

    public void detach() {
        this.mDetached.set(true);
    }

    public int getPositionOffset() {
        return this.mStorage.getPositionOffset();
    }

    public boolean isDetached() {
        return this.mDetached.get();
    }

    public boolean isImmutable() {
        return isDetached();
    }

    public int size() {
        return this.mStorage.size();
    }

    @NonNull
    public List<T> snapshot() {
        if (isImmutable()) {
            return this;
        }
        return new SnapshotPagedList(this);
    }

    @Nullable
    public T get(int i) {
        T t = this.mStorage.get(i);
        if (t != null) {
            this.mLastItem = t;
        }
        return t;
    }

    /* access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void offsetBoundaryAccessIndices(int i) {
        this.mLowestIndexAccessed += i;
        this.mHighestIndexAccessed += i;
    }

    public void loadAround(int i) {
        this.mLastLoad = getPositionOffset() + i;
        loadAroundInternal(i);
        this.mLowestIndexAccessed = Math.min(this.mLowestIndexAccessed, i);
        this.mHighestIndexAccessed = Math.max(this.mHighestIndexAccessed, i);
        tryDispatchBoundaryCallbacks(true);
    }

    public void removeWeakCallback(@NonNull Callback callback) {
        for (int size = this.mCallbacks.size() - 1; size >= 0; size--) {
            Callback callback2 = (Callback) this.mCallbacks.get(size).get();
            if (callback2 == null || callback2 == callback) {
                this.mCallbacks.remove(size);
            }
        }
    }

    public void tryDispatchBoundaryCallbacks(boolean z) {
        final boolean z2;
        final boolean z3 = true;
        if (!this.mBoundaryCallbackBeginDeferred || this.mLowestIndexAccessed > this.mConfig.prefetchDistance) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!this.mBoundaryCallbackEndDeferred || this.mHighestIndexAccessed < (size() - 1) - this.mConfig.prefetchDistance) {
            z3 = false;
        }
        if (z2 || z3) {
            if (z2) {
                this.mBoundaryCallbackBeginDeferred = false;
            }
            if (z3) {
                this.mBoundaryCallbackEndDeferred = false;
            }
            if (z) {
                this.mMainThreadExecutor.execute(new Runnable() {
                    public void run() {
                        PagedList.this.dispatchBoundaryCallbacks(z2, z3);
                    }
                });
            } else {
                dispatchBoundaryCallbacks(z2, z3);
            }
        }
    }

    public void dispatchBoundaryCallbacks(boolean z, boolean z2) {
        if (z) {
            this.mBoundaryCallback.onItemAtFrontLoaded(this.mStorage.getFirstLoadedItem());
        }
        if (z2) {
            this.mBoundaryCallback.onItemAtEndLoaded(this.mStorage.getLastLoadedItem());
        }
    }

    /* access modifiers changed from: package-private */
    public void notifyChanged(int i, int i2) {
        if (i2 != 0) {
            for (int size = this.mCallbacks.size() - 1; size >= 0; size--) {
                Callback callback = (Callback) this.mCallbacks.get(size).get();
                if (callback != null) {
                    callback.onChanged(i, i2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void notifyInserted(int i, int i2) {
        if (i2 != 0) {
            for (int size = this.mCallbacks.size() - 1; size >= 0; size--) {
                Callback callback = (Callback) this.mCallbacks.get(size).get();
                if (callback != null) {
                    callback.onInserted(i, i2);
                }
            }
        }
    }

    public void addWeakCallback(@Nullable List<T> list, @NonNull Callback callback) {
        if (!(list == null || list == this)) {
            if (!list.isEmpty()) {
                dispatchUpdatesSinceSnapshot((PagedList) list, callback);
            } else if (!this.mStorage.isEmpty()) {
                callback.onInserted(0, this.mStorage.size());
            }
        }
        for (int size = this.mCallbacks.size() - 1; size >= 0; size--) {
            if (((Callback) this.mCallbacks.get(size).get()) == null) {
                this.mCallbacks.remove(size);
            }
        }
        this.mCallbacks.add(new WeakReference(callback));
    }

    /* access modifiers changed from: package-private */
    @AnyThread
    public void deferBoundaryCallbacks(final boolean z, final boolean z2, final boolean z3) {
        if (this.mBoundaryCallback != null) {
            if (this.mLowestIndexAccessed == Integer.MAX_VALUE) {
                this.mLowestIndexAccessed = this.mStorage.size();
            }
            if (this.mHighestIndexAccessed == Integer.MIN_VALUE) {
                this.mHighestIndexAccessed = 0;
            }
            if (z || z2 || z3) {
                this.mMainThreadExecutor.execute(new Runnable() {
                    public void run() {
                        if (z) {
                            PagedList.this.mBoundaryCallback.onZeroItemsLoaded();
                        }
                        if (z2) {
                            PagedList.this.mBoundaryCallbackBeginDeferred = true;
                        }
                        if (z3) {
                            PagedList.this.mBoundaryCallbackEndDeferred = true;
                        }
                        PagedList.this.tryDispatchBoundaryCallbacks(false);
                    }
                });
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't defer BoundaryCallback, no instance");
    }

    PagedList(@NonNull PagedStorage<T> pagedStorage, @NonNull Executor executor, @NonNull Executor executor2, @Nullable BoundaryCallback<T> boundaryCallback, @NonNull Config config) {
        this.mStorage = pagedStorage;
        this.mMainThreadExecutor = executor;
        this.mBackgroundThreadExecutor = executor2;
        this.mBoundaryCallback = boundaryCallback;
        this.mConfig = config;
    }

    @NonNull
    public static <K, T> PagedList<T> create(@NonNull DataSource<K, T> dataSource, @NonNull Executor executor, @NonNull Executor executor2, @Nullable BoundaryCallback<T> boundaryCallback, @NonNull Config config, @Nullable K k) {
        int i;
        int i2;
        if (dataSource.isContiguous() || !config.enablePlaceholders) {
            if (!dataSource.isContiguous()) {
                dataSource = ((PositionalDataSource) dataSource).wrapAsContiguousWithoutPlaceholders();
                if (k != null) {
                    i = ((Integer) k).intValue();
                    ContiguousPagedList contiguousPagedList = new ContiguousPagedList((ContiguousDataSource) dataSource, executor, executor2, boundaryCallback, config, k, i);
                    return contiguousPagedList;
                }
            }
            i = -1;
            ContiguousPagedList contiguousPagedList2 = new ContiguousPagedList((ContiguousDataSource) dataSource, executor, executor2, boundaryCallback, config, k, i);
            return contiguousPagedList2;
        }
        PositionalDataSource positionalDataSource = (PositionalDataSource) dataSource;
        if (k != null) {
            i2 = ((Integer) k).intValue();
        } else {
            i2 = 0;
        }
        TiledPagedList tiledPagedList = new TiledPagedList(positionalDataSource, executor, executor2, boundaryCallback, config, i2);
        return tiledPagedList;
    }
}
