package com.bytedance.android.livesdk.utils.b;

import com.bytedance.android.livesdkapi.k.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.observable.ObservableDistinct;
import io.reactivex.internal.operators.observable.ObservableInterval;
import io.reactivex.internal.operators.observable.ObservableIntervalRange;
import io.reactivex.internal.operators.observable.ObservableRetryPredicate;
import io.reactivex.internal.operators.observable.ObservableRetryWhen;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class b<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17590a;

    /* renamed from: b  reason: collision with root package name */
    private Observable<T> f17591b;

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public static Observable<Long> a(long j, TimeUnit timeUnit) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), timeUnit}, null, f17590a, true, 13814, new Class[]{Long.TYPE, TimeUnit.class}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{new Long(j2), timeUnit}, null, f17590a, true, 13814, new Class[]{Long.TYPE, TimeUnit.class}, Observable.class);
        }
        return a(j, j, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f17590a, false, 13817, new Class[]{Long.TYPE}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f17590a, false, 13817, new Class[]{Long.TYPE}, Observable.class);
        }
        return a(j2, Functions.alwaysTrue());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> a(Function<Observable<Throwable>, ObservableSource<?>> function) {
        Function<Observable<Throwable>, ObservableSource<?>> function2 = function;
        if (!PatchProxy.isSupport(new Object[]{function2}, this, f17590a, false, 13820, new Class[]{Function.class}, Observable.class)) {
            return RxJavaPlugins.onAssembly((Observable<T>) new ObservableRetryWhen<T>(this.f17591b, function2));
        }
        return (Observable) PatchProxy.accessDispatch(new Object[]{function2}, this, f17590a, false, 13820, new Class[]{Function.class}, Observable.class);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    private <K> Observable<T> a(Function<? super T, K> function, Callable<? extends Collection<? super K>> callable) {
        Function<? super T, K> function2 = function;
        Callable<? extends Collection<? super K>> callable2 = callable;
        if (PatchProxy.isSupport(new Object[]{function2, callable2}, this, f17590a, false, 13823, new Class[]{Function.class, Callable.class}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{function2, callable2}, this, f17590a, false, 13823, new Class[]{Function.class, Callable.class}, Observable.class);
        }
        ObjectHelper.requireNonNull(function2, "keySelector is null");
        ObjectHelper.requireNonNull(callable2, "collectionSupplier is null");
        return RxJavaPlugins.onAssembly((Observable<T>) new ObservableDistinct<T>(this.f17591b, function2, callable2));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> a() {
        if (PatchProxy.isSupport(new Object[0], this, f17590a, false, 13821, new Class[0], Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[0], this, f17590a, false, 13821, new Class[0], Observable.class);
        }
        return (Observable) a.a(a.a("io.reactivex.internal.operators.observable.ObservablePublish", "create", this.f17591b), "refCount", new Object[0]);
    }

    b(Observable<T> observable) {
        this.f17591b = observable;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <K> Observable<T> b(Function<? super T, K> function) {
        Function<? super T, K> function2 = function;
        if (PatchProxy.isSupport(new Object[]{function2}, this, f17590a, false, 13822, new Class[]{Function.class}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{function2}, this, f17590a, false, 13822, new Class[]{Function.class}, Observable.class);
        }
        return a(function2, Functions.createHashSet());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    private Observable<T> a(long j, Predicate<? super Throwable> predicate) {
        long j2 = j;
        Predicate<? super Throwable> predicate2 = predicate;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), predicate2}, this, f17590a, false, 13818, new Class[]{Long.TYPE, Predicate.class}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{new Long(j2), predicate2}, this, f17590a, false, 13818, new Class[]{Long.TYPE, Predicate.class}, Observable.class);
        } else if (j2 >= 0) {
            ObjectHelper.requireNonNull(predicate2, "predicate is null");
            return RxJavaPlugins.onAssembly((Observable<T>) new ObservableRetryPredicate<T>(this.f17591b, j2, predicate2));
        } else {
            throw new IllegalArgumentException("times >= 0 required but it was " + j2);
        }
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public static Observable<Long> a(long j, long j2, TimeUnit timeUnit) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4), timeUnit}, null, f17590a, true, 13812, new Class[]{Long.TYPE, Long.TYPE, TimeUnit.class}, Observable.class)) {
            Object[] objArr = {new Long(j3), new Long(j4), timeUnit};
            return (Observable) PatchProxy.accessDispatch(objArr, null, f17590a, true, 13812, new Class[]{Long.TYPE, Long.TYPE, TimeUnit.class}, Observable.class);
        }
        return a(j, j2, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    private static Observable<Long> a(long j, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        long j3 = j;
        long j4 = j2;
        TimeUnit timeUnit2 = timeUnit;
        Scheduler scheduler2 = scheduler;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4), timeUnit2, scheduler2}, null, f17590a, true, 13813, new Class[]{Long.TYPE, Long.TYPE, TimeUnit.class, Scheduler.class}, Observable.class)) {
            Object[] objArr = {new Long(j3), new Long(j4), timeUnit2, scheduler2};
            return (Observable) PatchProxy.accessDispatch(objArr, null, f17590a, true, 13813, new Class[]{Long.TYPE, Long.TYPE, TimeUnit.class, Scheduler.class}, Observable.class);
        }
        ObjectHelper.requireNonNull(timeUnit2, "unit is null");
        ObjectHelper.requireNonNull(scheduler2, "scheduler is null");
        ObservableInterval observableInterval = new ObservableInterval(Math.max(0, j3), Math.max(0, j4), timeUnit, scheduler);
        return RxJavaPlugins.onAssembly((Observable<T>) observableInterval);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public static Observable<Long> a(long j, long j2, long j3, long j4, TimeUnit timeUnit) {
        if (PatchProxy.isSupport(new Object[]{0L, 10L, 1000L, 1000L, timeUnit}, null, f17590a, true, 13824, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, TimeUnit.class}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{0L, 10L, 1000L, 1000L, timeUnit}, null, f17590a, true, 13824, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, TimeUnit.class}, Observable.class);
        }
        return a(0, 10, 1000, 1000, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    private static Observable<Long> a(long j, long j2, long j3, long j4, TimeUnit timeUnit, Scheduler scheduler) {
        long j5 = j;
        long j6 = j2;
        long j7 = j3;
        long j8 = j4;
        TimeUnit timeUnit2 = timeUnit;
        Scheduler scheduler2 = scheduler;
        if (PatchProxy.isSupport(new Object[]{new Long(j5), new Long(j6), new Long(j7), new Long(j8), timeUnit2, scheduler2}, null, f17590a, true, 13825, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, TimeUnit.class, Scheduler.class}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{new Long(j5), new Long(j6), new Long(j7), new Long(j8), timeUnit2, scheduler2}, null, f17590a, true, 13825, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, TimeUnit.class, Scheduler.class}, Observable.class);
        } else if (j6 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + j6);
        } else if (j6 == 0) {
            return Observable.empty().delay(j7, timeUnit2, scheduler2);
        } else {
            long j9 = (j6 - 1) + j5;
            if (j5 <= 0 || j9 >= 0) {
                ObjectHelper.requireNonNull(timeUnit2, "unit is null");
                ObjectHelper.requireNonNull(scheduler2, "scheduler is null");
                ObservableIntervalRange observableIntervalRange = new ObservableIntervalRange(j, j9, Math.max(0, j7), Math.max(0, j8), timeUnit, scheduler);
                return RxJavaPlugins.onAssembly((Observable<T>) observableIntervalRange);
            }
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
    }
}
