package android.arch.paging;

import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;

public class PageResult<T> {
    private static final PageResult INVALID_RESULT = new PageResult(Collections.EMPTY_LIST, 0);
    public final int leadingNulls;
    @NonNull
    public final List<T> page;
    public final int positionOffset;
    public final int trailingNulls;

    static abstract class Receiver<T> {
        @MainThread
        public abstract void onPageResult(int i, @NonNull PageResult<T> pageResult);

        Receiver() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @interface ResultType {
    }

    static <T> PageResult<T> getInvalidResult() {
        return INVALID_RESULT;
    }

    public boolean isInvalid() {
        if (this == INVALID_RESULT) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Result " + this.leadingNulls + ", " + this.page + ", " + this.trailingNulls + ", offset " + this.positionOffset;
    }

    PageResult(@NonNull List<T> list, int i) {
        this.page = list;
        this.positionOffset = i;
    }

    PageResult(@NonNull List<T> list, int i, int i2, int i3) {
        this.page = list;
        this.leadingNulls = i;
        this.trailingNulls = i2;
        this.positionOffset = i3;
    }
}
