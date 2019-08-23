package android.arch.persistence.room;

import android.arch.core.executor.ArchTaskExecutor;
import android.arch.persistence.room.InvalidationTracker;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class RxRoom {
    public static final Object NOTHING = new Object();
    private static Scheduler sAppToolkitIOScheduler = new Scheduler() {
        public final Scheduler.Worker createWorker() {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            return new Scheduler.Worker() {
                public void dispose() {
                    atomicBoolean.set(true);
                }

                public boolean isDisposed() {
                    return atomicBoolean.get();
                }

                public Disposable schedule(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
                    DisposableRunnable disposableRunnable = new DisposableRunnable(runnable, atomicBoolean);
                    ArchTaskExecutor.getInstance().executeOnDiskIO(runnable);
                    return disposableRunnable;
                }
            };
        }
    };

    static class DisposableRunnable implements Disposable, Runnable {
        private final Runnable mActual;
        private volatile boolean mDisposed;
        private final AtomicBoolean mGlobalDisposed;

        public void dispose() {
            this.mDisposed = true;
        }

        public void run() {
            if (!isDisposed()) {
                this.mActual.run();
            }
        }

        public boolean isDisposed() {
            if (this.mDisposed || this.mGlobalDisposed.get()) {
                return true;
            }
            return false;
        }

        DisposableRunnable(Runnable runnable, AtomicBoolean atomicBoolean) {
            this.mActual = runnable;
            this.mGlobalDisposed = atomicBoolean;
        }
    }

    static class Optional<T> {
        @Nullable
        final T mValue;

        Optional(@Nullable T t) {
            this.mValue = t;
        }
    }

    public static Flowable<Object> createFlowable(final RoomDatabase roomDatabase, final String... strArr) {
        return Flowable.create(new FlowableOnSubscribe<Object>() {
            public final void subscribe(final FlowableEmitter<Object> flowableEmitter) throws Exception {
                final AnonymousClass1 r0 = new InvalidationTracker.Observer(strArr) {
                    public void onInvalidated(@android.support.annotation.NonNull Set<String> set) {
                        if (!flowableEmitter.isCancelled()) {
                            flowableEmitter.onNext(RxRoom.NOTHING);
                        }
                    }
                };
                if (!flowableEmitter.isCancelled()) {
                    roomDatabase.getInvalidationTracker().addObserver(r0);
                    flowableEmitter.setDisposable(Disposables.fromAction(new Action() {
                        public void run() throws Exception {
                            roomDatabase.getInvalidationTracker().removeObserver(r0);
                        }
                    }));
                }
                if (!flowableEmitter.isCancelled()) {
                    flowableEmitter.onNext(RxRoom.NOTHING);
                }
            }
        }, BackpressureStrategy.LATEST);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static <T> Flowable<T> createFlowable(RoomDatabase roomDatabase, String[] strArr, final Callable<T> callable) {
        return createFlowable(roomDatabase, strArr).observeOn(sAppToolkitIOScheduler).map(new Function<Object, Optional<T>>() {
            public final Optional<T> apply(@NonNull Object obj) throws Exception {
                return new Optional<>(callable.call());
            }
        }).filter(new Predicate<Optional<T>>() {
            public final boolean test(@NonNull Optional<T> optional) throws Exception {
                if (optional.mValue != null) {
                    return true;
                }
                return false;
            }
        }).map(new Function<Optional<T>, T>() {
            public final T apply(@NonNull Optional<T> optional) throws Exception {
                return optional.mValue;
            }
        });
    }
}
