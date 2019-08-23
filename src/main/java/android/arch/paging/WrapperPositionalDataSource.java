package android.arch.paging;

import android.arch.core.util.Function;
import android.arch.paging.DataSource;
import android.arch.paging.PositionalDataSource;
import android.support.annotation.NonNull;
import java.util.List;

public class WrapperPositionalDataSource<A, B> extends PositionalDataSource<B> {
    public final Function<List<A>, List<B>> mListFunction;
    private final PositionalDataSource<A> mSource;

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

    WrapperPositionalDataSource(PositionalDataSource<A> positionalDataSource, Function<List<A>, List<B>> function) {
        this.mSource = positionalDataSource;
        this.mListFunction = function;
    }

    public void loadInitial(@NonNull PositionalDataSource.LoadInitialParams loadInitialParams, @NonNull final PositionalDataSource.LoadInitialCallback<B> loadInitialCallback) {
        this.mSource.loadInitial(loadInitialParams, new PositionalDataSource.LoadInitialCallback<A>() {
            public void onResult(@NonNull List<A> list, int i) {
                loadInitialCallback.onResult(DataSource.convert(WrapperPositionalDataSource.this.mListFunction, list), i);
            }

            public void onResult(@NonNull List<A> list, int i, int i2) {
                loadInitialCallback.onResult(DataSource.convert(WrapperPositionalDataSource.this.mListFunction, list), i, i2);
            }
        });
    }

    public void loadRange(@NonNull PositionalDataSource.LoadRangeParams loadRangeParams, @NonNull final PositionalDataSource.LoadRangeCallback<B> loadRangeCallback) {
        this.mSource.loadRange(loadRangeParams, new PositionalDataSource.LoadRangeCallback<A>() {
            public void onResult(@NonNull List<A> list) {
                loadRangeCallback.onResult(DataSource.convert(WrapperPositionalDataSource.this.mListFunction, list));
            }
        });
    }
}
