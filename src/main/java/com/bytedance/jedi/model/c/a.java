package com.bytedance.jedi.model.c;

import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.observables.GroupedObservable;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B!\u0012\u001a\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00060\u0005¢\u0006\u0002\u0010\u0007J\u001a\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00060\u0005JB\u0010\t\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00060\u000b0\n*\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00060\n2\u0006\u0010\f\u001a\u00020\rH\u0004R\"\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/bytedance/jedi/model/datasource/AbstractDataSource;", "K", "V", "Lcom/bytedance/jedi/model/datasource/IDataSource;", "point", "Lcom/bytedance/jedi/model/traceable/ITracePoint;", "Lkotlin/Pair;", "(Lcom/bytedance/jedi/model/traceable/ITracePoint;)V", "inheritance", "batchEmit", "Lio/reactivex/Observable;", "", "enable", "", "model_release"}, k = 1, mv = {1, 1, 15})
public abstract class a<K, V> implements d<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final com.bytedance.jedi.model.h.a<Pair<K, V>> f21547a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00022\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u0002H\u0001\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "K", "V", "it", "Lkotlin/Pair;", "apply", "(Lkotlin/Pair;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.jedi.model.c.a$a  reason: collision with other inner class name */
    static final class C0209a<T, R> implements Function<T, K> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0209a f21548a = new C0209a();

        C0209a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Pair pair = (Pair) obj;
            Intrinsics.checkParameterIsNotNull(pair, AdvanceSetting.NETWORK_TYPE);
            return pair.getFirst();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a^\u0012(\u0012&\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u0004 \u0005*\u0012\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u0004\u0018\u00010\u00020\u0002 \u0005*.\u0012(\u0012&\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u0004 \u0005*\u0012\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u00042>\u0010\u0006\u001a:\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0003H\u0003\u0012(\u0012&\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u0004 \u0005*\u0012\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u0004\u0018\u00010\u00020\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "K", "V", "kotlin.jvm.PlatformType", "it", "Lio/reactivex/observables/GroupedObservable;", "apply"}, k = 3, mv = {1, 1, 15})
    static final class b<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f21549a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            GroupedObservable groupedObservable = (GroupedObservable) obj;
            Intrinsics.checkParameterIsNotNull(groupedObservable, AdvanceSetting.NETWORK_TYPE);
            return groupedObservable.throttleLast(100, TimeUnit.MILLISECONDS);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032`\u0010\u0004\u001a\\\u0012(\u0012&\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u0003 \u0007*\u0012\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u0003\u0018\u00010\u00060\u0006 \u0007*,\u0012(\u0012&\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u0003 \u0007*\u0012\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u0003\u0018\u00010\u00060\u00060\b0\u0005H\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "K", "V", "it", "", "Lkotlin/Pair;", "kotlin.jvm.PlatformType", "", "test"}, k = 3, mv = {1, 1, 15})
    static final class c<T> implements Predicate<List<Pair<? extends K, ? extends V>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f21550a = new c();

        c() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            List list = (List) obj;
            Intrinsics.checkParameterIsNotNull(list, AdvanceSetting.NETWORK_TYPE);
            if (list.size() > 0) {
                return true;
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u00040\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u00040\u0002H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lkotlin/Pair;", "K", "V", "it", "apply"}, k = 3, mv = {1, 1, 15})
    static final class d<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f21551a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Pair pair = (Pair) obj;
            Intrinsics.checkParameterIsNotNull(pair, AdvanceSetting.NETWORK_TYPE);
            return CollectionsKt.listOf(pair);
        }
    }

    @NotNull
    public final com.bytedance.jedi.model.h.a<Pair<K, V>> c() {
        return this.f21547a;
    }

    public a(@NotNull com.bytedance.jedi.model.h.a<Pair<K, V>> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "point");
        this.f21547a = aVar;
    }

    @NotNull
    protected static Observable<List<Pair<K, V>>> a(@NotNull Observable<Pair<K, V>> observable, boolean z) {
        Intrinsics.checkParameterIsNotNull(observable, "$this$batchEmit");
        if (z) {
            Subject serialized = PublishSubject.create().toSerialized();
            observable.groupBy(C0209a.f21548a).flatMap(b.f21549a).subscribeWith(serialized);
            Observable<List<Pair<K, V>>> filter = serialized.buffer(100, TimeUnit.MILLISECONDS).filter(c.f21550a);
            Intrinsics.checkExpressionValueIsNotNull(filter, "PublishSubject.create<Pa…S).filter { it.size > 0 }");
            return filter;
        }
        Observable<List<Pair<K, V>>> map = observable.map(d.f21551a);
        Intrinsics.checkExpressionValueIsNotNull(map, "map { listOf(it) }");
        return map;
    }
}
