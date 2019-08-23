package android.arch.paging;

import android.arch.core.util.Function;
import android.arch.paging.DataSource;
import android.arch.paging.PageResult;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.List;
import java.util.concurrent.Executor;

public abstract class ItemKeyedDataSource<Key, Value> extends ContiguousDataSource<Key, Value> {

    public static abstract class LoadCallback<Value> {
        public abstract void onResult(@NonNull List<Value> list);
    }

    static class LoadCallbackImpl<Value> extends LoadCallback<Value> {
        final DataSource.LoadCallbackHelper<Value> mCallbackHelper;

        public void onResult(@NonNull List<Value> list) {
            if (!this.mCallbackHelper.dispatchInvalidResultIfInvalid()) {
                this.mCallbackHelper.dispatchResultToReceiver(new PageResult(list, 0, 0, 0));
            }
        }

        LoadCallbackImpl(@NonNull ItemKeyedDataSource itemKeyedDataSource, int i, @Nullable Executor executor, @NonNull PageResult.Receiver<Value> receiver) {
            this.mCallbackHelper = new DataSource.LoadCallbackHelper<>(itemKeyedDataSource, i, executor, receiver);
        }
    }

    public static abstract class LoadInitialCallback<Value> extends LoadCallback<Value> {
        public abstract void onResult(@NonNull List<Value> list, int i, int i2);
    }

    static class LoadInitialCallbackImpl<Value> extends LoadInitialCallback<Value> {
        final DataSource.LoadCallbackHelper<Value> mCallbackHelper;
        private final boolean mCountingEnabled;

        public void onResult(@NonNull List<Value> list) {
            if (!this.mCallbackHelper.dispatchInvalidResultIfInvalid()) {
                this.mCallbackHelper.dispatchResultToReceiver(new PageResult(list, 0, 0, 0));
            }
        }

        LoadInitialCallbackImpl(@NonNull ItemKeyedDataSource itemKeyedDataSource, boolean z, @NonNull PageResult.Receiver<Value> receiver) {
            this.mCallbackHelper = new DataSource.LoadCallbackHelper<>(itemKeyedDataSource, 0, null, receiver);
            this.mCountingEnabled = z;
        }

        public void onResult(@NonNull List<Value> list, int i, int i2) {
            if (!this.mCallbackHelper.dispatchInvalidResultIfInvalid()) {
                DataSource.LoadCallbackHelper.validateInitialLoadParams(list, i, i2);
                int size = (i2 - i) - list.size();
                if (this.mCountingEnabled) {
                    this.mCallbackHelper.dispatchResultToReceiver(new PageResult(list, i, size, 0));
                    return;
                }
                this.mCallbackHelper.dispatchResultToReceiver(new PageResult(list, i));
            }
        }
    }

    public static class LoadInitialParams<Key> {
        public final boolean placeholdersEnabled;
        @Nullable
        public final Key requestedInitialKey;
        public final int requestedLoadSize;

        public LoadInitialParams(@Nullable Key key, int i, boolean z) {
            this.requestedInitialKey = key;
            this.requestedLoadSize = i;
            this.placeholdersEnabled = z;
        }
    }

    public static class LoadParams<Key> {
        public final Key key;
        public final int requestedLoadSize;

        public LoadParams(Key key2, int i) {
            this.key = key2;
            this.requestedLoadSize = i;
        }
    }

    @NonNull
    public abstract Key getKey(@NonNull Value value);

    public abstract void loadAfter(@NonNull LoadParams<Key> loadParams, @NonNull LoadCallback<Value> loadCallback);

    public abstract void loadBefore(@NonNull LoadParams<Key> loadParams, @NonNull LoadCallback<Value> loadCallback);

    public abstract void loadInitial(@NonNull LoadInitialParams<Key> loadInitialParams, @NonNull LoadInitialCallback<Value> loadInitialCallback);

    @NonNull
    public final <ToValue> ItemKeyedDataSource<Key, ToValue> map(@NonNull Function<Value, ToValue> function) {
        return mapByPage(createListFunction(function));
    }

    @NonNull
    public final <ToValue> ItemKeyedDataSource<Key, ToValue> mapByPage(@NonNull Function<List<Value>, List<ToValue>> function) {
        return new WrapperItemKeyedDataSource(this, function);
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final Key getKey(int i, Value value) {
        if (value == null) {
            return null;
        }
        return getKey(value);
    }

    /* access modifiers changed from: package-private */
    public final void dispatchLoadAfter(int i, @NonNull Value value, int i2, @NonNull Executor executor, @NonNull PageResult.Receiver<Value> receiver) {
        loadAfter(new LoadParams(getKey(value), i2), new LoadCallbackImpl(this, 1, executor, receiver));
    }

    /* access modifiers changed from: package-private */
    public final void dispatchLoadBefore(int i, @NonNull Value value, int i2, @NonNull Executor executor, @NonNull PageResult.Receiver<Value> receiver) {
        loadBefore(new LoadParams(getKey(value), i2), new LoadCallbackImpl(this, 2, executor, receiver));
    }

    /* access modifiers changed from: package-private */
    public final void dispatchLoadInitial(@Nullable Key key, int i, int i2, boolean z, @NonNull Executor executor, @NonNull PageResult.Receiver<Value> receiver) {
        LoadInitialCallbackImpl loadInitialCallbackImpl = new LoadInitialCallbackImpl(this, z, receiver);
        loadInitial(new LoadInitialParams(key, i, z), loadInitialCallbackImpl);
        loadInitialCallbackImpl.mCallbackHelper.setPostExecutor(executor);
    }
}