package android.support.v7.recyclerview.extensions;

import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.v7.util.DiffUtil;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class AsyncDifferConfig<T> {
    @NonNull
    private final Executor mBackgroundThreadExecutor;
    @NonNull
    private final DiffUtil.ItemCallback<T> mDiffCallback;
    @NonNull
    private final Executor mMainThreadExecutor;

    public static final class Builder<T> {
        private static Executor sDiffExecutor = null;
        private static final Object sExecutorLock = new Object();
        private Executor mBackgroundThreadExecutor;
        private final DiffUtil.ItemCallback<T> mDiffCallback;
        private Executor mMainThreadExecutor;

        public class _lancet {
            private _lancet() {
            }

            @TargetClass
            @Proxy
            static ExecutorService com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newFixedThreadPool(int i) {
                return h.a(m.a(p.FIXED).a(i).a());
            }
        }

        @NonNull
        public final AsyncDifferConfig<T> build() {
            if (this.mBackgroundThreadExecutor == null) {
                synchronized (sExecutorLock) {
                    if (sDiffExecutor == null) {
                        sDiffExecutor = _lancet.com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newFixedThreadPool(2);
                    }
                }
                this.mBackgroundThreadExecutor = sDiffExecutor;
            }
            return new AsyncDifferConfig<>(this.mMainThreadExecutor, this.mBackgroundThreadExecutor, this.mDiffCallback);
        }

        @NonNull
        public final Builder<T> setBackgroundThreadExecutor(Executor executor) {
            this.mBackgroundThreadExecutor = executor;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NonNull
        public final Builder<T> setMainThreadExecutor(Executor executor) {
            this.mMainThreadExecutor = executor;
            return this;
        }

        public Builder(@NonNull DiffUtil.ItemCallback<T> itemCallback) {
            this.mDiffCallback = itemCallback;
        }
    }

    @NonNull
    public final Executor getBackgroundThreadExecutor() {
        return this.mBackgroundThreadExecutor;
    }

    @NonNull
    public final DiffUtil.ItemCallback<T> getDiffCallback() {
        return this.mDiffCallback;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NonNull
    public final Executor getMainThreadExecutor() {
        return this.mMainThreadExecutor;
    }

    AsyncDifferConfig(@NonNull Executor executor, @NonNull Executor executor2, @NonNull DiffUtil.ItemCallback<T> itemCallback) {
        this.mMainThreadExecutor = executor;
        this.mBackgroundThreadExecutor = executor2;
        this.mDiffCallback = itemCallback;
    }
}
