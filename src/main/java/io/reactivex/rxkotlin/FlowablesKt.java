package io.reactivex.rxkotlin;

import io.reactivex.Flowable;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.BiFunction;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.n;
import kotlin.jvm.internal.Intrinsics;
import org.a.b;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aX\u0010\u0000\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0007H\u0007\u001ao\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\t0\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u0005\"\u0004\b\u0003\u0010\t*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00072 \b\u0004\u0010\n\u001a\u001a\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\t0\u000bH\b\u001a\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\t0\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u0005\"\u0004\b\u0003\u0010\f\"\u0004\b\u0004\u0010\t*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u00072&\b\u0004\u0010\n\u001a \u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\t0\u000eH\b\u001a£\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\t0\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u0005\"\u0004\b\u0003\u0010\f\"\u0004\b\u0004\u0010\u000f\"\u0004\b\u0005\u0010\t*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00072,\b\u0004\u0010\n\u001a&\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\t0\u0011H\b\u001a>\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00130\u00120\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0007H\u0007\u001aU\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\t0\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0013\"\u0004\b\u0002\u0010\t*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\u00072\u001a\b\u0004\u0010\n\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\t0\u0015H\b\u001a>\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00130\u00120\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0007H\u0007\u001aU\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\t0\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0013\"\u0004\b\u0002\u0010\t*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\u00072\u001a\b\u0004\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\t0\u0015H\b¨\u0006\u0018"}, d2 = {"withLatestFrom", "Lio/reactivex/Flowable;", "Lkotlin/Triple;", "T", "T1", "T2", "o1", "Lorg/reactivestreams/Publisher;", "o2", "R", "combiner", "Lkotlin/Function3;", "T3", "o3", "Lkotlin/Function4;", "T4", "o4", "Lkotlin/Function5;", "Lkotlin/Pair;", "U", "other", "Lkotlin/Function2;", "zipWith", "zipper", "rxkotlin"}, k = 2, mv = {1, 1, 11})
public final class FlowablesKt {
    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @NotNull
    @SchedulerSupport("none")
    public static final <T, U> Flowable<Pair<T, U>> withLatestFrom(@NotNull Flowable<T> flowable, @NotNull b<U> bVar) {
        Intrinsics.checkParameterIsNotNull(flowable, "$receiver");
        Intrinsics.checkParameterIsNotNull(bVar, "other");
        Flowable<Pair<T, U>> withLatestFrom = flowable.withLatestFrom(bVar, (BiFunction<? super T, ? super U, ? extends R>) FlowablesKt$withLatestFrom$2.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(other, Bi…on{ t, u -> Pair(t,u)  })");
        return withLatestFrom;
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @NotNull
    @SchedulerSupport("none")
    public static final <T, U> Flowable<Pair<T, U>> zipWith(@NotNull Flowable<T> flowable, @NotNull b<U> bVar) {
        Intrinsics.checkParameterIsNotNull(flowable, "$receiver");
        Intrinsics.checkParameterIsNotNull(bVar, "other");
        Flowable<Pair<T, U>> zipWith = flowable.zipWith(bVar, (BiFunction<? super T, ? super U, ? extends R>) FlowablesKt$zipWith$2.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(zipWith, "zipWith(other, BiFunction { t, u -> Pair(t,u) })");
        return zipWith;
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @NotNull
    @SchedulerSupport("none")
    public static final <T, U, R> Flowable<R> withLatestFrom(@NotNull Flowable<T> flowable, @NotNull b<U> bVar, @NotNull Function2<? super T, ? super U, ? extends R> function2) {
        Intrinsics.checkParameterIsNotNull(flowable, "$receiver");
        Intrinsics.checkParameterIsNotNull(bVar, "other");
        Intrinsics.checkParameterIsNotNull(function2, "combiner");
        Flowable<R> withLatestFrom = flowable.withLatestFrom(bVar, (BiFunction<? super T, ? super U, ? extends R>) new FlowablesKt$withLatestFrom$1<Object,Object,Object>(function2));
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(other, Bi…combiner.invoke(t, u)  })");
        return withLatestFrom;
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @NotNull
    @SchedulerSupport("none")
    public static final <T, U, R> Flowable<R> zipWith(@NotNull Flowable<T> flowable, @NotNull b<U> bVar, @NotNull Function2<? super T, ? super U, ? extends R> function2) {
        Intrinsics.checkParameterIsNotNull(flowable, "$receiver");
        Intrinsics.checkParameterIsNotNull(bVar, "other");
        Intrinsics.checkParameterIsNotNull(function2, "zipper");
        Flowable<R> zipWith = flowable.zipWith(bVar, (BiFunction<? super T, ? super U, ? extends R>) new FlowablesKt$zipWith$1<Object,Object,Object>(function2));
        Intrinsics.checkExpressionValueIsNotNull(zipWith, "zipWith(other, BiFunctio…-> zipper.invoke(t, u) })");
        return zipWith;
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @NotNull
    @SchedulerSupport("none")
    public static final <T, T1, T2> Flowable<Triple<T, T1, T2>> withLatestFrom(@NotNull Flowable<T> flowable, @NotNull b<T1> bVar, @NotNull b<T2> bVar2) {
        Intrinsics.checkParameterIsNotNull(flowable, "$receiver");
        Intrinsics.checkParameterIsNotNull(bVar, "o1");
        Intrinsics.checkParameterIsNotNull(bVar2, "o2");
        Flowable<Triple<T, T1, T2>> withLatestFrom = flowable.withLatestFrom(bVar, bVar2, FlowablesKt$withLatestFrom$4.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(o1, o2, F…2 -> Triple(t, t1, t2) })");
        return withLatestFrom;
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @NotNull
    @SchedulerSupport("none")
    public static final <T, T1, T2, R> Flowable<R> withLatestFrom(@NotNull Flowable<T> flowable, @NotNull b<T1> bVar, @NotNull b<T2> bVar2, @NotNull Function3<? super T, ? super T1, ? super T2, ? extends R> function3) {
        Intrinsics.checkParameterIsNotNull(flowable, "$receiver");
        Intrinsics.checkParameterIsNotNull(bVar, "o1");
        Intrinsics.checkParameterIsNotNull(bVar2, "o2");
        Intrinsics.checkParameterIsNotNull(function3, "combiner");
        Flowable<R> withLatestFrom = flowable.withLatestFrom(bVar, bVar2, new FlowablesKt$withLatestFrom$3(function3));
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(o1, o2, F…iner.invoke(t, t1, t2) })");
        return withLatestFrom;
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @NotNull
    @SchedulerSupport("none")
    public static final <T, T1, T2, T3, R> Flowable<R> withLatestFrom(@NotNull Flowable<T> flowable, @NotNull b<T1> bVar, @NotNull b<T2> bVar2, @NotNull b<T3> bVar3, @NotNull Function4<? super T, ? super T1, ? super T2, ? super T3, ? extends R> function4) {
        Intrinsics.checkParameterIsNotNull(flowable, "$receiver");
        Intrinsics.checkParameterIsNotNull(bVar, "o1");
        Intrinsics.checkParameterIsNotNull(bVar2, "o2");
        Intrinsics.checkParameterIsNotNull(bVar3, "o3");
        Intrinsics.checkParameterIsNotNull(function4, "combiner");
        Flowable<R> withLatestFrom = flowable.withLatestFrom(bVar, bVar2, bVar3, new FlowablesKt$withLatestFrom$5(function4));
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(o1, o2, o….invoke(t, t1, t2, t3) })");
        return withLatestFrom;
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @NotNull
    @SchedulerSupport("none")
    public static final <T, T1, T2, T3, T4, R> Flowable<R> withLatestFrom(@NotNull Flowable<T> flowable, @NotNull b<T1> bVar, @NotNull b<T2> bVar2, @NotNull b<T3> bVar3, @NotNull b<T4> bVar4, @NotNull n<? super T, ? super T1, ? super T2, ? super T3, ? super T4, ? extends R> nVar) {
        Intrinsics.checkParameterIsNotNull(flowable, "$receiver");
        Intrinsics.checkParameterIsNotNull(bVar, "o1");
        Intrinsics.checkParameterIsNotNull(bVar2, "o2");
        Intrinsics.checkParameterIsNotNull(bVar3, "o3");
        Intrinsics.checkParameterIsNotNull(bVar4, "o4");
        Intrinsics.checkParameterIsNotNull(nVar, "combiner");
        Flowable<R> withLatestFrom = flowable.withLatestFrom(bVar, bVar2, bVar3, bVar4, new FlowablesKt$withLatestFrom$6(nVar));
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(o1, o2, o…oke(t, t1, t2, t3, t4) })");
        return withLatestFrom;
    }
}
