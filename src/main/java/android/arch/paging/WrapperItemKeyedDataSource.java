package android.arch.paging;

import android.arch.core.util.Function;
import android.arch.paging.DataSource;
import android.arch.paging.ItemKeyedDataSource;
import android.support.annotation.NonNull;
import java.util.IdentityHashMap;
import java.util.List;

public class WrapperItemKeyedDataSource<K, A, B> extends ItemKeyedDataSource<K, B> {
    private final IdentityHashMap<B, K> mKeyMap = new IdentityHashMap<>();
    private final Function<List<A>, List<B>> mListFunction;
    private final ItemKeyedDataSource<K, A> mSource;

    public void invalidate() {
        this.mSource.invalidate();
    }

    public boolean isInvalid() {
        return this.mSource.isInvalid();
    }

    public void addInvalidatedCallback(@NonNull DataSource.InvalidatedCallback invalidatedCallback) {
        this.mSource.addInvalidatedCallback(invalidatedCallback);
    }

    public void removeInvalidatedCallback(@NonNull DataSource.InvalidatedCallback invalidatedCallback) {
        this.mSource.removeInvalidatedCallback(invalidatedCallback);
    }

    @NonNull
    public K getKey(@NonNull B b2) {
        K k;
        synchronized (this.mKeyMap) {
            k = this.mKeyMap.get(b2);
        }
        return k;
    }

    public List<B> convertWithStashedKeys(List<A> list) {
        List<B> convert = convert(this.mListFunction, list);
        synchronized (this.mKeyMap) {
            for (int i = 0; i < convert.size(); i++) {
                this.mKeyMap.put(convert.get(i), this.mSource.getKey(list.get(i)));
            }
        }
        return convert;
    }

    WrapperItemKeyedDataSource(ItemKeyedDataSource<K, A> itemKeyedDataSource, Function<List<A>, List<B>> function) {
        this.mSource = itemKeyedDataSource;
        this.mListFunction = function;
    }

    public void loadAfter(@NonNull ItemKeyedDataSource.LoadParams<K> loadParams, @NonNull final ItemKeyedDataSource.LoadCallback<B> loadCallback) {
        this.mSource.loadAfter(loadParams, new ItemKeyedDataSource.LoadCallback<A>() {
            public void onResult(@NonNull List<A> list) {
                loadCallback.onResult(WrapperItemKeyedDataSource.this.convertWithStashedKeys(list));
            }
        });
    }

    public void loadBefore(@NonNull ItemKeyedDataSource.LoadParams<K> loadParams, @NonNull final ItemKeyedDataSource.LoadCallback<B> loadCallback) {
        this.mSource.loadBefore(loadParams, new ItemKeyedDataSource.LoadCallback<A>() {
            public void onResult(@NonNull List<A> list) {
                loadCallback.onResult(WrapperItemKeyedDataSource.this.convertWithStashedKeys(list));
            }
        });
    }

    public void loadInitial(@NonNull ItemKeyedDataSource.LoadInitialParams<K> loadInitialParams, @NonNull final ItemKeyedDataSource.LoadInitialCallback<B> loadInitialCallback) {
        this.mSource.loadInitial(loadInitialParams, new ItemKeyedDataSource.LoadInitialCallback<A>() {
            public void onResult(@NonNull List<A> list) {
                loadInitialCallback.onResult(WrapperItemKeyedDataSource.this.convertWithStashedKeys(list));
            }

            public void onResult(@NonNull List<A> list, int i, int i2) {
                loadInitialCallback.onResult(WrapperItemKeyedDataSource.this.convertWithStashedKeys(list), i, i2);
            }
        });
    }
}
