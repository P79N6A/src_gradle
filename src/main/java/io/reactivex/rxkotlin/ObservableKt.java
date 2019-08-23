package io.reactivex.rxkotlin;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.Function;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000±\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0018\n\u0002\u0010\u0005\n\u0002\u0010\u0012\n\u0002\u0010\f\n\u0002\u0010\u0019\n\u0002\u0010\u0006\n\u0002\u0010\u0013\n\u0002\u0010\u0007\n\u0002\u0010\u0014\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\u0010\t\n\u0002\u0010\u0016\n\u0002\u0010\n\n\u0002\u0010\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u001c\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0001H\b\u001a^\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003\"\b\b\u0001\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00010\u00062)\b\u0004\u0010\u0007\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u00050\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00020\bH\b\u001aF\u0010\r\u001a&\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\u0005H\u0005 \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\u0005H\u0005\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00010\u0001H\u0007\u001aF\u0010\r\u001a&\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\u0005H\u0005 \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\u0005H\u0005\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u000f0\u0006H\u0007\u001a*\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00060\u0001H\u0007\u001a*\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00060\u0001H\u0007\u001aI\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003\"\b\b\u0001\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00050\u00012\u001a\b\u0004\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u0002H\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00140\bH\b\u001a*\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00050\u00010\u0006H\u0007\u001aF\u0010\u0016\u001a&\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\u0005H\u0005 \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\u0005H\u0005\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00010\u0001H\u0007\u001a*\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00050\u00010\u0006H\u0007\u001a#\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0001H\b\u001aF\u0010\u0019\u001a&\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\u0005H\u0005 \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\u0005H\u0005\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00010\u0001H\u0007\u001a(\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00010\u0001H\u0007\u001a'\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u001c\"\b\b\u0000\u0010\u0005*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00050\u001dH\u0002¢\u0006\u0002\u0010\u001e\u001aÇ\u0001\u0010\u001f\u001a\u0001\u0012D\u0012B\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\"H\"\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H#H# \u000e* \u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\"H\"\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H#H#\u0018\u00010$0! \u000e*J\u0012D\u0012B\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\"H\"\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H#H# \u000e* \u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\"H\"\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H#H#\u0018\u00010$0!\u0018\u00010 0 \"\b\b\u0000\u0010\"*\u00020\u0003\"\b\b\u0001\u0010#*\u00020\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\"\u0012\u0004\u0012\u0002H#0%0\u0001H\u0007\u001a¸\u0002\u0010&\u001a\u0002\u0012|\u0012z\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\"H\"\u0012(\u0012&\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H#H# \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H#H#\u0018\u00010(0' \u000e*<\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\"H\"\u0012(\u0012&\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H#H# \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H#H#\u0018\u00010(0'\u0018\u00010$0! \u000e*\u0001\u0012|\u0012z\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\"H\"\u0012(\u0012&\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H#H# \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H#H#\u0018\u00010(0' \u000e*<\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\"H\"\u0012(\u0012&\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H#H# \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H#H#\u0018\u00010(0'\u0018\u00010$0!\u0018\u00010 0 \"\b\b\u0000\u0010\"*\u00020\u0003\"\b\b\u0001\u0010#*\u00020\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\"\u0012\u0004\u0012\u0002H#0%0\u0001H\u0007\u001a'\u0010)\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00050*H\u0007¢\u0006\u0002\u0010+\u001a\u0012\u0010)\u001a\b\u0012\u0004\u0012\u00020,0\u0001*\u00020-H\u0007\u001a\u0012\u0010)\u001a\b\u0012\u0004\u0012\u00020.0\u0001*\u00020/H\u0007\u001a\u0012\u0010)\u001a\b\u0012\u0004\u0012\u0002000\u0001*\u000201H\u0007\u001a\u0012\u0010)\u001a\b\u0012\u0004\u0012\u0002020\u0001*\u000203H\u0007\u001a\u0012\u0010)\u001a\b\u0012\u0004\u0012\u0002040\u0001*\u000205H\u0007\u001a\u0012\u0010)\u001a\b\u0012\u0004\u0012\u0002060\u0001*\u000207H\u0007\u001a\u0012\u0010)\u001a\b\u0012\u0004\u0012\u0002080\u0001*\u000209H\u0007\u001a\u0012\u0010)\u001a\b\u0012\u0004\u0012\u00020:0\u0001*\u00020;H\u0007\u001a\"\u0010)\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00050\u0006H\u0007\u001a\"\u0010)\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00050\u001dH\u0007\u001a\u0012\u0010)\u001a\b\u0012\u0004\u0012\u0002060\u0001*\u00020<H\u0007\u001a\"\u0010)\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00050\u0014H\u0007\u001a^\u0010=\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003\"\b\b\u0001\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00010\u00062)\b\u0004\u0010>\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u00050\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00020\bH\b¨\u0006?"}, d2 = {"cast", "Lio/reactivex/Observable;", "R", "", "combineLatest", "T", "", "combineFunction", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "args", "concatAll", "kotlin.jvm.PlatformType", "Lio/reactivex/ObservableSource;", "concatMapIterable", "flatMapIterable", "flatMapSequence", "body", "Lkotlin/sequences/Sequence;", "merge", "mergeAll", "mergeDelayError", "ofType", "switchLatest", "switchOnNext", "toIterable", "io/reactivex/rxkotlin/ObservableKt$toIterable$1", "", "(Ljava/util/Iterator;)Lio/reactivex/rxkotlin/ObservableKt$toIterable$1;", "toMap", "Lio/reactivex/Single;", "", "A", "B", "", "Lkotlin/Pair;", "toMultimap", "", "", "toObservable", "", "([Ljava/lang/Object;)Lio/reactivex/Observable;", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "Lkotlin/ranges/IntProgression;", "zip", "zipFunction", "rxkotlin"}, k = 2, mv = {1, 1, 11})
public final class ObservableKt {
    @CheckReturnValue
    @NotNull
    @SchedulerSupport("none")
    public static final Observable<Boolean> toObservable(@NotNull boolean[] zArr) {
        Intrinsics.checkParameterIsNotNull(zArr, "$receiver");
        return toObservable(ArraysKt.asIterable(zArr));
    }

    @CheckReturnValue
    @NotNull
    @SchedulerSupport("none")
    public static final Observable<Short> toObservable(@NotNull short[] sArr) {
        Intrinsics.checkParameterIsNotNull(sArr, "$receiver");
        return toObservable(ArraysKt.asIterable(sArr));
    }

    @CheckReturnValue
    @NotNull
    @SchedulerSupport("none")
    public static final Observable<Long> toObservable(@NotNull long[] jArr) {
        Intrinsics.checkParameterIsNotNull(jArr, "$receiver");
        return toObservable(ArraysKt.asIterable(jArr));
    }

    @CheckReturnValue
    @NotNull
    @SchedulerSupport("none")
    public static final <T> Observable<T> toObservable(@NotNull T[] tArr) {
        Intrinsics.checkParameterIsNotNull(tArr, "$receiver");
        Observable<T> fromArray = Observable.fromArray(Arrays.copyOf(tArr, tArr.length));
        Intrinsics.checkExpressionValueIsNotNull(fromArray, "Observable.fromArray(*this)");
        return fromArray;
    }

    private static final <T> ObservableKt$toIterable$1 toIterable(@NotNull Iterator<? extends T> it2) {
        return new ObservableKt$toIterable$1(it2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static final <T> Observable<T> concatAll(@NotNull Observable<Observable<T>> observable) {
        Intrinsics.checkParameterIsNotNull(observable, "$receiver");
        return observable.concatMap(ObservableKt$concatAll$1.INSTANCE);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static final <T> Observable<T> mergeAll(@NotNull Observable<Observable<T>> observable) {
        Intrinsics.checkParameterIsNotNull(observable, "$receiver");
        return observable.flatMap(ObservableKt$mergeAll$1.INSTANCE);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static final <T> Observable<T> switchLatest(@NotNull Observable<Observable<T>> observable) {
        Intrinsics.checkParameterIsNotNull(observable, "$receiver");
        return observable.switchMap(ObservableKt$switchLatest$1.INSTANCE);
    }

    @CheckReturnValue
    @NotNull
    @SchedulerSupport("none")
    public static final <T> Observable<T> toObservable(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkParameterIsNotNull(iterable, "$receiver");
        Observable<T> fromIterable = Observable.fromIterable(iterable);
        Intrinsics.checkExpressionValueIsNotNull(fromIterable, "Observable.fromIterable(this)");
        return fromIterable;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    private static final <R> Observable<R> cast(@NotNull Observable<?> observable) {
        Intrinsics.reifiedOperationMarker(4, "R");
        Observable<R> cast = observable.cast(Object.class);
        Intrinsics.checkExpressionValueIsNotNull(cast, "cast(R::class.java)");
        return cast;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static final <T> Observable<T> concatAll(@NotNull Iterable<? extends ObservableSource<T>> iterable) {
        Intrinsics.checkParameterIsNotNull(iterable, "$receiver");
        return Observable.concat(iterable);
    }

    @CheckReturnValue
    @NotNull
    @SchedulerSupport("none")
    public static final <T> Observable<T> concatMapIterable(@NotNull Observable<? extends Iterable<? extends T>> observable) {
        Intrinsics.checkParameterIsNotNull(observable, "$receiver");
        Observable<T> concatMapIterable = observable.concatMapIterable(ObservableKt$concatMapIterable$1.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(concatMapIterable, "concatMapIterable { it }");
        return concatMapIterable;
    }

    @CheckReturnValue
    @NotNull
    @SchedulerSupport("none")
    public static final <T> Observable<T> flatMapIterable(@NotNull Observable<? extends Iterable<? extends T>> observable) {
        Intrinsics.checkParameterIsNotNull(observable, "$receiver");
        Observable<T> flatMapIterable = observable.flatMapIterable(ObservableKt$flatMapIterable$1.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(flatMapIterable, "flatMapIterable { it }");
        return flatMapIterable;
    }

    @CheckReturnValue
    @NotNull
    @SchedulerSupport("none")
    public static final <T> Observable<T> merge(@NotNull Iterable<? extends Observable<? extends T>> iterable) {
        Intrinsics.checkParameterIsNotNull(iterable, "$receiver");
        Observable<T> merge = Observable.merge((ObservableSource<? extends ObservableSource<? extends T>>) toObservable(iterable));
        Intrinsics.checkExpressionValueIsNotNull(merge, "Observable.merge(this.toObservable())");
        return merge;
    }

    @CheckReturnValue
    @NotNull
    @SchedulerSupport("none")
    public static final <T> Observable<T> mergeDelayError(@NotNull Iterable<? extends Observable<? extends T>> iterable) {
        Intrinsics.checkParameterIsNotNull(iterable, "$receiver");
        Observable<T> mergeDelayError = Observable.mergeDelayError((ObservableSource<? extends ObservableSource<? extends T>>) toObservable(iterable));
        Intrinsics.checkExpressionValueIsNotNull(mergeDelayError, "Observable.mergeDelayError(this.toObservable())");
        return mergeDelayError;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    private static final <R> Observable<R> ofType(@NotNull Observable<?> observable) {
        Intrinsics.reifiedOperationMarker(4, "R");
        Observable<R> ofType = observable.ofType(Object.class);
        Intrinsics.checkExpressionValueIsNotNull(ofType, "ofType(R::class.java)");
        return ofType;
    }

    @CheckReturnValue
    @NotNull
    @SchedulerSupport("none")
    public static final <T> Observable<T> switchOnNext(@NotNull Observable<Observable<T>> observable) {
        Intrinsics.checkParameterIsNotNull(observable, "$receiver");
        Observable<T> switchOnNext = Observable.switchOnNext(observable);
        Intrinsics.checkExpressionValueIsNotNull(switchOnNext, "Observable.switchOnNext(this)");
        return switchOnNext;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static final <A, B> Single<Map<A, B>> toMap(@NotNull Observable<Pair<A, B>> observable) {
        Intrinsics.checkParameterIsNotNull(observable, "$receiver");
        return observable.toMap(ObservableKt$toMap$1.INSTANCE, ObservableKt$toMap$2.INSTANCE);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static final <A, B> Single<Map<A, Collection<B>>> toMultimap(@NotNull Observable<Pair<A, B>> observable) {
        Intrinsics.checkParameterIsNotNull(observable, "$receiver");
        return observable.toMultimap(ObservableKt$toMultimap$1.INSTANCE, ObservableKt$toMultimap$2.INSTANCE);
    }

    @CheckReturnValue
    @NotNull
    @SchedulerSupport("none")
    public static final <T> Observable<T> toObservable(@NotNull Iterator<? extends T> it2) {
        Intrinsics.checkParameterIsNotNull(it2, "$receiver");
        return toObservable((Iterable<? extends T>) toIterable(it2));
    }

    @CheckReturnValue
    @NotNull
    @SchedulerSupport("none")
    public static final <T> Observable<T> toObservable(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkParameterIsNotNull(sequence, "$receiver");
        return toObservable(SequencesKt.asIterable(sequence));
    }

    @CheckReturnValue
    @NotNull
    @SchedulerSupport("none")
    public static final Observable<Integer> toObservable(@NotNull IntProgression intProgression) {
        Intrinsics.checkParameterIsNotNull(intProgression, "$receiver");
        if (intProgression.getStep() != 1 || ((long) intProgression.getLast()) - ((long) intProgression.getFirst()) >= 2147483647L) {
            Observable<Integer> fromIterable = Observable.fromIterable(intProgression);
            Intrinsics.checkExpressionValueIsNotNull(fromIterable, "Observable.fromIterable(this)");
            return fromIterable;
        }
        Observable<Integer> range = Observable.range(intProgression.getFirst(), Math.max(0, (intProgression.getLast() - intProgression.getFirst()) + 1));
        Intrinsics.checkExpressionValueIsNotNull(range, "Observable.range(first, …max(0, last - first + 1))");
        return range;
    }

    @CheckReturnValue
    @NotNull
    @SchedulerSupport("none")
    public static final Observable<Byte> toObservable(@NotNull byte[] bArr) {
        Intrinsics.checkParameterIsNotNull(bArr, "$receiver");
        return toObservable(ArraysKt.asIterable(bArr));
    }

    @CheckReturnValue
    @NotNull
    @SchedulerSupport("none")
    public static final Observable<Character> toObservable(@NotNull char[] cArr) {
        Intrinsics.checkParameterIsNotNull(cArr, "$receiver");
        return toObservable(ArraysKt.asIterable(cArr));
    }

    @CheckReturnValue
    @NotNull
    @SchedulerSupport("none")
    public static final Observable<Double> toObservable(@NotNull double[] dArr) {
        Intrinsics.checkParameterIsNotNull(dArr, "$receiver");
        return toObservable(ArraysKt.asIterable(dArr));
    }

    @CheckReturnValue
    @NotNull
    @SchedulerSupport("none")
    public static final Observable<Float> toObservable(@NotNull float[] fArr) {
        Intrinsics.checkParameterIsNotNull(fArr, "$receiver");
        return toObservable(ArraysKt.asIterable(fArr));
    }

    @CheckReturnValue
    @NotNull
    @SchedulerSupport("none")
    public static final Observable<Integer> toObservable(@NotNull int[] iArr) {
        Intrinsics.checkParameterIsNotNull(iArr, "$receiver");
        return toObservable(ArraysKt.asIterable(iArr));
    }

    @CheckReturnValue
    @NotNull
    @SchedulerSupport("none")
    public static final <T, R> Observable<R> combineLatest(@NotNull Iterable<? extends Observable<T>> iterable, @NotNull Function1<? super List<? extends T>, ? extends R> function1) {
        Intrinsics.checkParameterIsNotNull(iterable, "$receiver");
        Intrinsics.checkParameterIsNotNull(function1, "combineFunction");
        Observable<R> combineLatest = Observable.combineLatest(iterable, (Function<? super Object[], ? extends R>) new ObservableKt$combineLatest$1<Object,Object>(function1));
        Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Observable.combineLatest…List().map { it as T }) }");
        return combineLatest;
    }

    @CheckReturnValue
    @NotNull
    @SchedulerSupport("none")
    public static final <T, R> Observable<R> flatMapSequence(@NotNull Observable<T> observable, @NotNull Function1<? super T, ? extends Sequence<? extends R>> function1) {
        Intrinsics.checkParameterIsNotNull(observable, "$receiver");
        Intrinsics.checkParameterIsNotNull(function1, "body");
        Observable<R> flatMap = observable.flatMap(new ObservableKt$flatMapSequence$1(function1));
        Intrinsics.checkExpressionValueIsNotNull(flatMap, "flatMap { body(it).toObservable() }");
        return flatMap;
    }

    @CheckReturnValue
    @NotNull
    @SchedulerSupport("none")
    public static final <T, R> Observable<R> zip(@NotNull Iterable<? extends Observable<T>> iterable, @NotNull Function1<? super List<? extends T>, ? extends R> function1) {
        Intrinsics.checkParameterIsNotNull(iterable, "$receiver");
        Intrinsics.checkParameterIsNotNull(function1, "zipFunction");
        Observable<R> zip = Observable.zip(iterable, (Function<? super Object[], ? extends R>) new ObservableKt$zip$1<Object,Object>(function1));
        Intrinsics.checkExpressionValueIsNotNull(zip, "Observable.zip(this) { z…List().map { it as T }) }");
        return zip;
    }
}
