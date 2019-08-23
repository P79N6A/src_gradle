package io.reactivex.parallel;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.LongConsumer;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.parallel.ParallelCollect;
import io.reactivex.internal.operators.parallel.ParallelConcatMap;
import io.reactivex.internal.operators.parallel.ParallelDoOnNextTry;
import io.reactivex.internal.operators.parallel.ParallelFilter;
import io.reactivex.internal.operators.parallel.ParallelFilterTry;
import io.reactivex.internal.operators.parallel.ParallelFlatMap;
import io.reactivex.internal.operators.parallel.ParallelFromArray;
import io.reactivex.internal.operators.parallel.ParallelFromPublisher;
import io.reactivex.internal.operators.parallel.ParallelJoin;
import io.reactivex.internal.operators.parallel.ParallelMap;
import io.reactivex.internal.operators.parallel.ParallelMapTry;
import io.reactivex.internal.operators.parallel.ParallelPeek;
import io.reactivex.internal.operators.parallel.ParallelReduce;
import io.reactivex.internal.operators.parallel.ParallelReduceFull;
import io.reactivex.internal.operators.parallel.ParallelRunOn;
import io.reactivex.internal.operators.parallel.ParallelSortedJoin;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.ListAddBiConsumer;
import io.reactivex.internal.util.MergerBiFunction;
import io.reactivex.internal.util.SorterFunction;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import org.a.b;
import org.a.c;
import org.a.d;

public abstract class ParallelFlowable<T> {
    public abstract int parallelism();

    public abstract void subscribe(@NonNull c<? super T>[] cVarArr);

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> sequential() {
        return sequential(Flowable.bufferSize());
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @NonNull
    @SchedulerSupport("none")
    public final Flowable<T> sequentialDelayError() {
        return sequentialDelayError(Flowable.bufferSize());
    }

    @CheckReturnValue
    @NonNull
    public final <R> ParallelFlowable<R> concatMap(@NonNull Function<? super T, ? extends b<? extends R>> function) {
        return concatMap(function, 2);
    }

    @CheckReturnValue
    @NonNull
    public final Flowable<T> sorted(@NonNull Comparator<? super T> comparator) {
        return sorted(comparator, 16);
    }

    @CheckReturnValue
    @NonNull
    public final Flowable<List<T>> toSortedList(@NonNull Comparator<? super T> comparator) {
        return toSortedList(comparator, 16);
    }

    @CheckReturnValue
    @NonNull
    public final <R> R as(@NonNull ParallelFlowableConverter<T, R> parallelFlowableConverter) {
        return ((ParallelFlowableConverter) ObjectHelper.requireNonNull(parallelFlowableConverter, "converter is null")).apply(this);
    }

    @CheckReturnValue
    public final ParallelFlowable<T> filter(@NonNull Predicate<? super T> predicate) {
        ObjectHelper.requireNonNull(predicate, "predicate");
        return RxJavaPlugins.onAssembly((ParallelFlowable<T>) new ParallelFilter<T>(this, predicate));
    }

    @CheckReturnValue
    @NonNull
    public final <R> ParallelFlowable<R> flatMap(@NonNull Function<? super T, ? extends b<? extends R>> function) {
        return flatMap(function, false, Integer.MAX_VALUE, Flowable.bufferSize());
    }

    @CheckReturnValue
    @NonNull
    public final <R> ParallelFlowable<R> map(@NonNull Function<? super T, ? extends R> function) {
        ObjectHelper.requireNonNull(function, "mapper");
        return RxJavaPlugins.onAssembly((ParallelFlowable<T>) new ParallelMap<T>(this, function));
    }

    @CheckReturnValue
    @NonNull
    public final Flowable<T> reduce(@NonNull BiFunction<T, T, T> biFunction) {
        ObjectHelper.requireNonNull(biFunction, "reducer");
        return RxJavaPlugins.onAssembly((Flowable<T>) new ParallelReduceFull<T>(this, biFunction));
    }

    @CheckReturnValue
    @NonNull
    public final ParallelFlowable<T> runOn(@NonNull Scheduler scheduler) {
        return runOn(scheduler, Flowable.bufferSize());
    }

    @CheckReturnValue
    public static <T> ParallelFlowable<T> from(@NonNull b<? extends T> bVar) {
        return from(bVar, Runtime.getRuntime().availableProcessors(), Flowable.bufferSize());
    }

    @CheckReturnValue
    @NonNull
    public static <T> ParallelFlowable<T> fromArray(@NonNull b<T>... bVarArr) {
        if (bVarArr.length != 0) {
            return RxJavaPlugins.onAssembly((ParallelFlowable<T>) new ParallelFromArray<T>(bVarArr));
        }
        throw new IllegalArgumentException("Zero publishers not supported");
    }

    @CheckReturnValue
    @NonNull
    public final <U> ParallelFlowable<U> compose(@NonNull ParallelTransformer<T, U> parallelTransformer) {
        return RxJavaPlugins.onAssembly(((ParallelTransformer) ObjectHelper.requireNonNull(parallelTransformer, "composer is null")).apply(this));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @NonNull
    @SchedulerSupport("none")
    public final Flowable<T> sequential(int i) {
        ObjectHelper.verifyPositive(i, "prefetch");
        return RxJavaPlugins.onAssembly((Flowable<T>) new ParallelJoin<T>(this, i, false));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @NonNull
    @SchedulerSupport("none")
    public final Flowable<T> sequentialDelayError(int i) {
        ObjectHelper.verifyPositive(i, "prefetch");
        return RxJavaPlugins.onAssembly((Flowable<T>) new ParallelJoin<T>(this, i, true));
    }

    @CheckReturnValue
    @NonNull
    public final <U> U to(@NonNull Function<? super ParallelFlowable<T>, U> function) {
        try {
            return ((Function) ObjectHelper.requireNonNull(function, "converter is null")).apply(this);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            throw ExceptionHelper.wrapOrThrow(th);
        }
    }

    @CheckReturnValue
    @NonNull
    public final ParallelFlowable<T> doAfterNext(@NonNull Consumer<? super T> consumer) {
        ObjectHelper.requireNonNull(consumer, "onAfterNext is null");
        Consumer emptyConsumer = Functions.emptyConsumer();
        Consumer emptyConsumer2 = Functions.emptyConsumer();
        Action action = Functions.EMPTY_ACTION;
        ParallelPeek parallelPeek = new ParallelPeek(this, emptyConsumer, consumer, emptyConsumer2, action, action, Functions.emptyConsumer(), Functions.EMPTY_LONG_CONSUMER, Functions.EMPTY_ACTION);
        return RxJavaPlugins.onAssembly((ParallelFlowable<T>) parallelPeek);
    }

    @CheckReturnValue
    @NonNull
    public final ParallelFlowable<T> doAfterTerminated(@NonNull Action action) {
        ObjectHelper.requireNonNull(action, "onAfterTerminate is null");
        ParallelPeek parallelPeek = new ParallelPeek(this, Functions.emptyConsumer(), Functions.emptyConsumer(), Functions.emptyConsumer(), Functions.EMPTY_ACTION, action, Functions.emptyConsumer(), Functions.EMPTY_LONG_CONSUMER, Functions.EMPTY_ACTION);
        return RxJavaPlugins.onAssembly((ParallelFlowable<T>) parallelPeek);
    }

    @CheckReturnValue
    @NonNull
    public final ParallelFlowable<T> doOnCancel(@NonNull Action action) {
        ObjectHelper.requireNonNull(action, "onCancel is null");
        Consumer emptyConsumer = Functions.emptyConsumer();
        Consumer emptyConsumer2 = Functions.emptyConsumer();
        Consumer emptyConsumer3 = Functions.emptyConsumer();
        Action action2 = Functions.EMPTY_ACTION;
        ParallelPeek parallelPeek = new ParallelPeek(this, emptyConsumer, emptyConsumer2, emptyConsumer3, action2, action2, Functions.emptyConsumer(), Functions.EMPTY_LONG_CONSUMER, action);
        return RxJavaPlugins.onAssembly((ParallelFlowable<T>) parallelPeek);
    }

    @CheckReturnValue
    @NonNull
    public final ParallelFlowable<T> doOnComplete(@NonNull Action action) {
        ObjectHelper.requireNonNull(action, "onComplete is null");
        ParallelPeek parallelPeek = new ParallelPeek(this, Functions.emptyConsumer(), Functions.emptyConsumer(), Functions.emptyConsumer(), action, Functions.EMPTY_ACTION, Functions.emptyConsumer(), Functions.EMPTY_LONG_CONSUMER, Functions.EMPTY_ACTION);
        return RxJavaPlugins.onAssembly((ParallelFlowable<T>) parallelPeek);
    }

    @CheckReturnValue
    @NonNull
    public final ParallelFlowable<T> doOnError(@NonNull Consumer<Throwable> consumer) {
        ObjectHelper.requireNonNull(consumer, "onError is null");
        Consumer emptyConsumer = Functions.emptyConsumer();
        Consumer emptyConsumer2 = Functions.emptyConsumer();
        Action action = Functions.EMPTY_ACTION;
        ParallelPeek parallelPeek = new ParallelPeek(this, emptyConsumer, emptyConsumer2, consumer, action, action, Functions.emptyConsumer(), Functions.EMPTY_LONG_CONSUMER, Functions.EMPTY_ACTION);
        return RxJavaPlugins.onAssembly((ParallelFlowable<T>) parallelPeek);
    }

    @CheckReturnValue
    @NonNull
    public final ParallelFlowable<T> doOnNext(@NonNull Consumer<? super T> consumer) {
        ObjectHelper.requireNonNull(consumer, "onNext is null");
        Consumer emptyConsumer = Functions.emptyConsumer();
        Consumer emptyConsumer2 = Functions.emptyConsumer();
        Action action = Functions.EMPTY_ACTION;
        ParallelPeek parallelPeek = new ParallelPeek(this, consumer, emptyConsumer, emptyConsumer2, action, action, Functions.emptyConsumer(), Functions.EMPTY_LONG_CONSUMER, Functions.EMPTY_ACTION);
        return RxJavaPlugins.onAssembly((ParallelFlowable<T>) parallelPeek);
    }

    @CheckReturnValue
    @NonNull
    public final ParallelFlowable<T> doOnRequest(@NonNull LongConsumer longConsumer) {
        ObjectHelper.requireNonNull(longConsumer, "onRequest is null");
        Consumer emptyConsumer = Functions.emptyConsumer();
        Consumer emptyConsumer2 = Functions.emptyConsumer();
        Consumer emptyConsumer3 = Functions.emptyConsumer();
        Action action = Functions.EMPTY_ACTION;
        ParallelPeek parallelPeek = new ParallelPeek(this, emptyConsumer, emptyConsumer2, emptyConsumer3, action, action, Functions.emptyConsumer(), longConsumer, Functions.EMPTY_ACTION);
        return RxJavaPlugins.onAssembly((ParallelFlowable<T>) parallelPeek);
    }

    @CheckReturnValue
    @NonNull
    public final ParallelFlowable<T> doOnSubscribe(@NonNull Consumer<? super d> consumer) {
        ObjectHelper.requireNonNull(consumer, "onSubscribe is null");
        Consumer emptyConsumer = Functions.emptyConsumer();
        Consumer emptyConsumer2 = Functions.emptyConsumer();
        Consumer emptyConsumer3 = Functions.emptyConsumer();
        Action action = Functions.EMPTY_ACTION;
        ParallelPeek parallelPeek = new ParallelPeek(this, emptyConsumer, emptyConsumer2, emptyConsumer3, action, action, consumer, Functions.EMPTY_LONG_CONSUMER, Functions.EMPTY_ACTION);
        return RxJavaPlugins.onAssembly((ParallelFlowable<T>) parallelPeek);
    }

    /* access modifiers changed from: protected */
    public final boolean validate(@NonNull c<?>[] cVarArr) {
        if (cVarArr.length == parallelism()) {
            return true;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("parallelism = " + r0 + ", subscribers = " + cVarArr.length);
        for (c<?> error : cVarArr) {
            EmptySubscription.error(illegalArgumentException, error);
        }
        return false;
    }

    @CheckReturnValue
    @NonNull
    public final <R> ParallelFlowable<R> concatMapDelayError(@NonNull Function<? super T, ? extends b<? extends R>> function, boolean z) {
        return concatMapDelayError(function, 2, z);
    }

    @CheckReturnValue
    public static <T> ParallelFlowable<T> from(@NonNull b<? extends T> bVar, int i) {
        return from(bVar, i, Flowable.bufferSize());
    }

    @CheckReturnValue
    @NonNull
    public final <C> ParallelFlowable<C> collect(@NonNull Callable<? extends C> callable, @NonNull BiConsumer<? super C, ? super T> biConsumer) {
        ObjectHelper.requireNonNull(callable, "collectionSupplier is null");
        ObjectHelper.requireNonNull(biConsumer, "collector is null");
        return RxJavaPlugins.onAssembly((ParallelFlowable<T>) new ParallelCollect<T>(this, callable, biConsumer));
    }

    @CheckReturnValue
    @NonNull
    public final <R> ParallelFlowable<R> concatMap(@NonNull Function<? super T, ? extends b<? extends R>> function, int i) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i, "prefetch");
        return RxJavaPlugins.onAssembly((ParallelFlowable<T>) new ParallelConcatMap<T>(this, function, i, ErrorMode.IMMEDIATE));
    }

    @CheckReturnValue
    @NonNull
    public final ParallelFlowable<T> doOnNext(@NonNull Consumer<? super T> consumer, @NonNull BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
        ObjectHelper.requireNonNull(consumer, "onNext is null");
        ObjectHelper.requireNonNull(biFunction, "errorHandler is null");
        return RxJavaPlugins.onAssembly((ParallelFlowable<T>) new ParallelDoOnNextTry<T>(this, consumer, biFunction));
    }

    @CheckReturnValue
    public final ParallelFlowable<T> filter(@NonNull Predicate<? super T> predicate, @NonNull BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
        ObjectHelper.requireNonNull(predicate, "predicate");
        ObjectHelper.requireNonNull(biFunction, "errorHandler is null");
        return RxJavaPlugins.onAssembly((ParallelFlowable<T>) new ParallelFilterTry<T>(this, predicate, biFunction));
    }

    @CheckReturnValue
    @NonNull
    public final <R> ParallelFlowable<R> flatMap(@NonNull Function<? super T, ? extends b<? extends R>> function, boolean z) {
        return flatMap(function, z, Integer.MAX_VALUE, Flowable.bufferSize());
    }

    @CheckReturnValue
    @NonNull
    public final <R> ParallelFlowable<R> map(@NonNull Function<? super T, ? extends R> function, @NonNull BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
        ObjectHelper.requireNonNull(function, "mapper");
        ObjectHelper.requireNonNull(biFunction, "errorHandler is null");
        return RxJavaPlugins.onAssembly((ParallelFlowable<T>) new ParallelMapTry<T>(this, function, biFunction));
    }

    @CheckReturnValue
    @NonNull
    public final <R> ParallelFlowable<R> reduce(@NonNull Callable<R> callable, @NonNull BiFunction<R, ? super T, R> biFunction) {
        ObjectHelper.requireNonNull(callable, "initialSupplier");
        ObjectHelper.requireNonNull(biFunction, "reducer");
        return RxJavaPlugins.onAssembly((ParallelFlowable<T>) new ParallelReduce<T>(this, callable, biFunction));
    }

    @CheckReturnValue
    @NonNull
    public final ParallelFlowable<T> runOn(@NonNull Scheduler scheduler, int i) {
        ObjectHelper.requireNonNull(scheduler, "scheduler");
        ObjectHelper.verifyPositive(i, "prefetch");
        return RxJavaPlugins.onAssembly((ParallelFlowable<T>) new ParallelRunOn<T>(this, scheduler, i));
    }

    @CheckReturnValue
    public final ParallelFlowable<T> filter(@NonNull Predicate<? super T> predicate, @NonNull ParallelFailureHandling parallelFailureHandling) {
        ObjectHelper.requireNonNull(predicate, "predicate");
        ObjectHelper.requireNonNull(parallelFailureHandling, "errorHandler is null");
        return RxJavaPlugins.onAssembly((ParallelFlowable<T>) new ParallelFilterTry<T>(this, predicate, parallelFailureHandling));
    }

    @CheckReturnValue
    @NonNull
    public final <R> ParallelFlowable<R> map(@NonNull Function<? super T, ? extends R> function, @NonNull ParallelFailureHandling parallelFailureHandling) {
        ObjectHelper.requireNonNull(function, "mapper");
        ObjectHelper.requireNonNull(parallelFailureHandling, "errorHandler is null");
        return RxJavaPlugins.onAssembly((ParallelFlowable<T>) new ParallelMapTry<T>(this, function, parallelFailureHandling));
    }

    @CheckReturnValue
    @NonNull
    public final Flowable<T> sorted(@NonNull Comparator<? super T> comparator, int i) {
        ObjectHelper.requireNonNull(comparator, "comparator is null");
        ObjectHelper.verifyPositive(i, "capacityHint");
        return RxJavaPlugins.onAssembly((Flowable<T>) new ParallelSortedJoin<T>(reduce(Functions.createArrayList((i / parallelism()) + 1), ListAddBiConsumer.instance()).map(new SorterFunction(comparator)), comparator));
    }

    @CheckReturnValue
    @NonNull
    public final Flowable<List<T>> toSortedList(@NonNull Comparator<? super T> comparator, int i) {
        ObjectHelper.requireNonNull(comparator, "comparator is null");
        ObjectHelper.verifyPositive(i, "capacityHint");
        return RxJavaPlugins.onAssembly(reduce(Functions.createArrayList((i / parallelism()) + 1), ListAddBiConsumer.instance()).map(new SorterFunction(comparator)).reduce(new MergerBiFunction(comparator)));
    }

    @CheckReturnValue
    @NonNull
    public final ParallelFlowable<T> doOnNext(@NonNull Consumer<? super T> consumer, @NonNull ParallelFailureHandling parallelFailureHandling) {
        ObjectHelper.requireNonNull(consumer, "onNext is null");
        ObjectHelper.requireNonNull(parallelFailureHandling, "errorHandler is null");
        return RxJavaPlugins.onAssembly((ParallelFlowable<T>) new ParallelDoOnNextTry<T>(this, consumer, parallelFailureHandling));
    }

    @CheckReturnValue
    @NonNull
    public final <R> ParallelFlowable<R> concatMapDelayError(@NonNull Function<? super T, ? extends b<? extends R>> function, int i, boolean z) {
        ErrorMode errorMode;
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i, "prefetch");
        if (z) {
            errorMode = ErrorMode.END;
        } else {
            errorMode = ErrorMode.BOUNDARY;
        }
        return RxJavaPlugins.onAssembly((ParallelFlowable<T>) new ParallelConcatMap<T>(this, function, i, errorMode));
    }

    @CheckReturnValue
    @NonNull
    public static <T> ParallelFlowable<T> from(@NonNull b<? extends T> bVar, int i, int i2) {
        ObjectHelper.requireNonNull(bVar, "source");
        ObjectHelper.verifyPositive(i, "parallelism");
        ObjectHelper.verifyPositive(i2, "prefetch");
        return RxJavaPlugins.onAssembly((ParallelFlowable<T>) new ParallelFromPublisher<T>(bVar, i, i2));
    }

    @CheckReturnValue
    @NonNull
    public final <R> ParallelFlowable<R> flatMap(@NonNull Function<? super T, ? extends b<? extends R>> function, boolean z, int i) {
        return flatMap(function, z, i, Flowable.bufferSize());
    }

    @CheckReturnValue
    @NonNull
    public final <R> ParallelFlowable<R> flatMap(@NonNull Function<? super T, ? extends b<? extends R>> function, boolean z, int i, int i2) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i, "maxConcurrency");
        ObjectHelper.verifyPositive(i2, "prefetch");
        ParallelFlatMap parallelFlatMap = new ParallelFlatMap(this, function, z, i, i2);
        return RxJavaPlugins.onAssembly((ParallelFlowable<T>) parallelFlatMap);
    }
}
