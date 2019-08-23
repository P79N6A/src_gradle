package com.bytedance.jedi.model.g;

import com.bytedance.jedi.model.e.a;
import com.bytedance.jedi.model.h.e;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.ObservableKt;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000f*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0004\b\u0003\u0010\u00042\u00020\u0005:\u0003\u000e\u000f\u0010BM\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007\u0012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R&\u0010\t\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\nX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bytedance/jedi/model/sync/SynckerImpl;", "K", "V", "K1", "V1", "Lcom/bytedance/jedi/model/sync/ISyncker;", "from", "Lcom/bytedance/jedi/model/datasource/IDataSource;", "to", "strategy", "Lcom/bytedance/jedi/model/merge/MergeStrategy;", "(Lcom/bytedance/jedi/model/datasource/IDataSource;Lcom/bytedance/jedi/model/datasource/IDataSource;Lcom/bytedance/jedi/model/merge/MergeStrategy;)V", "sync", "Lcom/bytedance/jedi/model/sync/ISyncReceipt;", "BatchSyncTransformer", "Companion", "SyncTransformer", "model_release"}, k = 1, mv = {1, 1, 15})
public final class d<K, V, K1, V1> {

    /* renamed from: d  reason: collision with root package name */
    public static final b f21588d = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.bytedance.jedi.model.c.d<K, V> f21589a;

    /* renamed from: b  reason: collision with root package name */
    public final com.bytedance.jedi.model.c.d<K1, V1> f21590b;

    /* renamed from: c  reason: collision with root package name */
    public final com.bytedance.jedi.model.e.a<K, V, K1, V1> f21591c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0004\u0010\u0001*\u0004\b\u0005\u0010\u0002*\u0004\b\u0006\u0010\u00032\u001e\u0012\u0006\u0012\u0004\u0018\u0001H\u0001\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u00050\u0004B7\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00060\u0007\u0012\u001c\u0010\b\u001a\u0018\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00060\t¢\u0006\u0002\u0010\nJ,\u0010\u000b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00060\u00050\f2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00040\u000eH\u0016R$\u0010\b\u001a\u0018\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00060\tX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00060\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/bytedance/jedi/model/sync/SynckerImpl$BatchSyncTransformer;", "V", "K1", "V1", "Lio/reactivex/ObservableTransformer;", "Lkotlin/Pair;", "to", "Lcom/bytedance/jedi/model/datasource/IDataSource;", "mergeStrategy", "Lcom/bytedance/jedi/model/merge/MergeStrategy;", "(Lcom/bytedance/jedi/model/datasource/IDataSource;Lcom/bytedance/jedi/model/merge/MergeStrategy;)V", "apply", "Lio/reactivex/ObservableSource;", "upstream", "Lio/reactivex/Observable;", "model_release"}, k = 1, mv = {1, 1, 15})
    static final class a<V, K1, V1> implements ObservableTransformer<V, Pair<? extends K1, ? extends V1>> {

        /* renamed from: a  reason: collision with root package name */
        public final com.bytedance.jedi.model.c.d<K1, V1> f21592a;

        /* renamed from: b  reason: collision with root package name */
        public final com.bytedance.jedi.model.e.a<?, V, K1, V1> f21593b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u00020\u0001\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0006\"\u0004\b\u0004\u0010\u0005\"\u0004\b\u0005\u0010\u0003\"\u0004\b\u0006\u0010\u00042\u0006\u0010\u0007\u001a\u0002H\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "Lkotlin/Pair;", "K1", "V1", "V", "K", "it", "apply", "(Ljava/lang/Object;)Ljava/util/List;"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.jedi.model.g.d$a$a  reason: collision with other inner class name */
        static final class C0215a<T, R> implements Function<T, Iterable<? extends U>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f21594a;

            C0215a(a aVar) {
                this.f21594a = aVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                return (List) ((a.C0213a) this.f21594a.f21593b).f21574b.invoke(obj);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0010\u0000\u001a^\u0012(\u0012&\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u0004 \u0005*\u0012\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u0004\u0018\u00010\u00020\u0002 \u0005*.\u0012(\u0012&\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u0004 \u0005*\u0012\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0007\"\u0004\b\u0004\u0010\u0006\"\u0004\b\u0005\u0010\u0003\"\u0004\b\u0006\u0010\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0002H\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "K1", "V1", "kotlin.jvm.PlatformType", "V", "K", "<name for destructuring parameter 0>", "apply"}, k = 3, mv = {1, 1, 15})
        static final class b<T, R> implements Function<T, ObservableSource<? extends R>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f21595a;

            b(a aVar) {
                this.f21595a = aVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                Pair pair = (Pair) obj;
                Intrinsics.checkParameterIsNotNull(pair, "<name for destructuring parameter 0>");
                final Object component1 = pair.component1();
                final Object component2 = pair.component2();
                return this.f21595a.f21592a.b(component1).map(new Function<T, R>(this) {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f21596a;

                    {
                        this.f21596a = r1;
                    }

                    public final /* synthetic */ Object apply(Object obj) {
                        com.bytedance.jedi.model.c.f fVar = (com.bytedance.jedi.model.c.f) obj;
                        Intrinsics.checkParameterIsNotNull(fVar, "cur");
                        Object a2 = fVar.a();
                        Object invoke = ((a.C0213a) this.f21596a.f21595a.f21593b).f21575c.invoke(component2, a2);
                        if (!(!Intrinsics.areEqual(invoke, a2))) {
                            invoke = null;
                        }
                        return TuplesKt.to(component1, invoke);
                    }
                }).filter(AnonymousClass2.f21599a);
            }
        }

        @NotNull
        public final ObservableSource<Pair<K1, V1>> apply(@NotNull Observable<V> observable) {
            Intrinsics.checkParameterIsNotNull(observable, "upstream");
            if (this.f21593b instanceof a.C0213a) {
                Observable flatMap = observable.flatMapIterable(new C0215a(this)).flatMap(new b(this));
                Intrinsics.checkExpressionValueIsNotNull(flatMap, "upstream.flatMapIterable…                        }");
                return flatMap;
            }
            throw new RuntimeException();
        }

        public a(@NotNull com.bytedance.jedi.model.c.d<K1, V1> dVar, @NotNull com.bytedance.jedi.model.e.a<?, V, K1, V1> aVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "to");
            Intrinsics.checkParameterIsNotNull(aVar, "mergeStrategy");
            this.f21592a = dVar;
            this.f21593b = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0004\u0010\u00052\b\u0010\u0006\u001a\u0004\u0018\u0001H\u00052\b\u0010\u0007\u001a\u0004\u0018\u0001H\u0005H\u0002¢\u0006\u0002\u0010\bJ>\u0010\t\u001a\u0004\u0018\u0001H\n\"\u0004\b\u0004\u0010\n2\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\n0\u000eH\b¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/bytedance/jedi/model/sync/SynckerImpl$Companion;", "", "()V", "equals", "", "T", "new", "cur", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "notNull", "R", "args", "", "block", "Lkotlin/Function0;", "notNull$model_release", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "model_release"}, k = 1, mv = {1, 1, 15})
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }

        public static <T> boolean a(T t, T t2) {
            if (t != t2) {
                return Intrinsics.areEqual((Object) t, (Object) t2);
            }
            if ((t instanceof Collection) || (t instanceof Map) || (t instanceof Object[])) {
                return false;
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0004\u0010\u0001*\u0004\b\u0005\u0010\u0002*\u0004\b\u0006\u0010\u0003*\u0004\b\u0007\u0010\u00042*\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u0002H\u0001\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0006\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u00040\u00060\u0005B9\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\b\u0012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\n¢\u0006\u0002\u0010\u000bJ8\u0010\f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00070\u00060\r2\u001a\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00050\u00060\u000fH\u0016R&\u0010\t\u001a\u001a\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\nX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bytedance/jedi/model/sync/SynckerImpl$SyncTransformer;", "K", "V", "K1", "V1", "Lio/reactivex/ObservableTransformer;", "Lkotlin/Pair;", "to", "Lcom/bytedance/jedi/model/datasource/IDataSource;", "mergeStrategy", "Lcom/bytedance/jedi/model/merge/MergeStrategy;", "(Lcom/bytedance/jedi/model/datasource/IDataSource;Lcom/bytedance/jedi/model/merge/MergeStrategy;)V", "apply", "Lio/reactivex/ObservableSource;", "upstream", "Lio/reactivex/Observable;", "model_release"}, k = 1, mv = {1, 1, 15})
    static final class c<K, V, K1, V1> implements ObservableTransformer<Pair<? extends K, ? extends V>, Pair<? extends K1, ? extends V1>> {

        /* renamed from: a  reason: collision with root package name */
        public final com.bytedance.jedi.model.c.d<K1, V1> f21600a;

        /* renamed from: b  reason: collision with root package name */
        public final com.bytedance.jedi.model.e.a<K, V, K1, V1> f21601b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0010\u0000\u001a^\u0012(\u0012&\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u0004 \u0005*\u0012\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u0004\u0018\u00010\u00020\u0002 \u0005*.\u0012(\u0012&\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u0004 \u0005*\u0012\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u0003\"\u0004\b\u0003\u0010\u0004\"\u0004\b\u0004\u0010\u0006\"\u0004\b\u0005\u0010\u0007\"\u0004\b\u0006\u0010\u0003\"\u0004\b\u0007\u0010\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u0002H\u0006\u0012\u0006\u0012\u0004\u0018\u0001H\u00070\u0002H\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "K1", "V1", "kotlin.jvm.PlatformType", "K", "V", "<name for destructuring parameter 0>", "apply"}, k = 3, mv = {1, 1, 15})
        static final class a<T, R> implements Function<T, ObservableSource<? extends R>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f21602a;

            a(c cVar) {
                this.f21602a = cVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                Pair pair = (Pair) obj;
                Intrinsics.checkParameterIsNotNull(pair, "<name for destructuring parameter 0>");
                final Object component1 = pair.component1();
                final Object component2 = pair.component2();
                com.bytedance.jedi.model.e.a<K, V, K1, V1> aVar = this.f21602a.f21601b;
                if (aVar instanceof a.c) {
                    return Observable.just(((a.c) this.f21602a.f21601b).f21576b.invoke(component1, component2)).flatMap(new Function<T, ObservableSource<? extends R>>(this) {

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ a f21603a;

                        {
                            this.f21603a = r1;
                        }

                        public final /* synthetic */ Object apply(final Object obj) {
                            return this.f21603a.f21602a.f21600a.b(obj).map(new Function<T, R>() {
                                public final /* synthetic */ Object apply(Object obj) {
                                    com.bytedance.jedi.model.c.f fVar = (com.bytedance.jedi.model.c.f) obj;
                                    Intrinsics.checkParameterIsNotNull(fVar, AdvanceSetting.NETWORK_TYPE);
                                    return TuplesKt.to(obj, fVar.a());
                                }
                            });
                        }
                    }).map(new Function<T, R>(this) {

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ a f21605a;

                        {
                            this.f21605a = r1;
                        }

                        public final /* synthetic */ Object apply(Object obj) {
                            Pair pair = (Pair) obj;
                            Intrinsics.checkParameterIsNotNull(pair, "<name for destructuring parameter 0>");
                            Object component1 = pair.component1();
                            Object component2 = pair.component2();
                            Object invoke = ((a.c) this.f21605a.f21602a.f21601b).f21577c.invoke(component1, component2, component2);
                            if (b.a(invoke, component2)) {
                                invoke = null;
                            }
                            return TuplesKt.to(component1, invoke);
                        }
                    });
                }
                if (aVar instanceof a.d) {
                    return ObservableKt.flatMapIterable(this.f21602a.f21600a.a()).filter(new Predicate<Pair<? extends K1, ? extends V1>>(this) {

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ a f21608a;

                        {
                            this.f21608a = r1;
                        }

                        public final /* synthetic */ boolean test(Object obj) {
                            Boolean bool;
                            Pair pair = (Pair) obj;
                            Intrinsics.checkParameterIsNotNull(pair, "<name for destructuring parameter 0>");
                            Object component2 = pair.component2();
                            if (ArraysKt.filterNotNull(new Object[]{component2, component2}).size() == 2) {
                                Function2<? super V, ? super V1, Boolean> function2 = ((a.d) this.f21608a.f21602a.f21601b).f21578b;
                                Object obj2 = component2;
                                if (obj2 == null) {
                                    Intrinsics.throwNpe();
                                }
                                if (component2 == null) {
                                    Intrinsics.throwNpe();
                                }
                                bool = Boolean.valueOf(((Boolean) function2.invoke(obj2, component2)).booleanValue());
                            } else {
                                bool = null;
                            }
                            if (bool != null) {
                                return bool.booleanValue();
                            }
                            return false;
                        }
                    }).map(new Function<T, R>(this) {

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ a f21610a;

                        {
                            this.f21610a = r1;
                        }

                        public final /* synthetic */ Object apply(Object obj) {
                            Pair pair = (Pair) obj;
                            Intrinsics.checkParameterIsNotNull(pair, "<name for destructuring parameter 0>");
                            Object component1 = pair.component1();
                            Object component2 = pair.component2();
                            Function2<? super V, ? super V1, ? extends V1> function2 = ((a.d) this.f21610a.f21602a.f21601b).f21579c;
                            Object obj2 = component2;
                            if (obj2 == null) {
                                Intrinsics.throwNpe();
                            }
                            if (component2 == null) {
                                Intrinsics.throwNpe();
                            }
                            Object invoke = function2.invoke(obj2, component2);
                            if (b.a(invoke, component2)) {
                                invoke = null;
                            }
                            return TuplesKt.to(component1, invoke);
                        }
                    });
                }
                throw new RuntimeException();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005\"\u0004\b\u0004\u0010\u0002\"\u0004\b\u0005\u0010\u0003\"\u0004\b\u0006\u0010\u0004\"\u0004\b\u0007\u0010\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u0002H\u0004\u0012\u0006\u0012\u0004\u0018\u0001H\u00050\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "K", "V", "K1", "V1", "it", "Lkotlin/Pair;", "test"}, k = 3, mv = {1, 1, 15})
        static final class b<T> implements Predicate<Pair<? extends K1, ? extends V1>> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f21612a = new b();

            b() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                Pair pair = (Pair) obj;
                Intrinsics.checkParameterIsNotNull(pair, AdvanceSetting.NETWORK_TYPE);
                if (pair.getSecond() != null) {
                    return true;
                }
                return false;
            }
        }

        @NotNull
        public final ObservableSource<Pair<K1, V1>> apply(@NotNull Observable<Pair<K, V>> observable) {
            Intrinsics.checkParameterIsNotNull(observable, "upstream");
            Observable filter = observable.flatMap(new a(this)).filter(b.f21612a);
            Intrinsics.checkExpressionValueIsNotNull(filter, "upstream.flatMap { (newK…ter { it.second != null }");
            return filter;
        }

        public c(@NotNull com.bytedance.jedi.model.c.d<K1, V1> dVar, @NotNull com.bytedance.jedi.model.e.a<K, V, K1, V1> aVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "to");
            Intrinsics.checkParameterIsNotNull(aVar, "mergeStrategy");
            this.f21600a = dVar;
            this.f21601b = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u00052\u001a\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\b0\u0007H\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "K", "V", "K1", "V1", "it", "Lcom/bytedance/jedi/model/traceable/ITraceable;", "Lkotlin/Pair;", "test"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.jedi.model.g.d$d  reason: collision with other inner class name */
    public static final class C0216d<T> implements Predicate<com.bytedance.jedi.model.h.b<Pair<? extends K, ? extends V>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f21613a;

        public C0216d(d dVar) {
            this.f21613a = dVar;
        }

        public final /* synthetic */ boolean test(Object obj) {
            com.bytedance.jedi.model.h.b bVar = (com.bytedance.jedi.model.h.b) obj;
            Intrinsics.checkParameterIsNotNull(bVar, AdvanceSetting.NETWORK_TYPE);
            if (!bVar.a(this.f21613a.f21590b.c())) {
                return true;
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0010\u0000\u001av\u00124\u00122\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u0002H\u0004\u0012\u0006\u0012\u0004\u0018\u0001H\u00050\u0003 \u0006*\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u0002H\u0004\u0012\u0006\u0012\u0004\u0018\u0001H\u00050\u0003\u0018\u00010\u00020\u0002 \u0006*:\u00124\u00122\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u0002H\u0004\u0012\u0006\u0012\u0004\u0018\u0001H\u00050\u0003 \u0006*\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u0002H\u0004\u0012\u0006\u0012\u0004\u0018\u0001H\u00050\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\b\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u00052\u001a\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u0002H\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\b0\u00030\u0002H\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lcom/bytedance/jedi/model/traceable/ITraceable;", "Lkotlin/Pair;", "K1", "V1", "kotlin.jvm.PlatformType", "K", "V", "traceable", "apply"}, k = 3, mv = {1, 1, 15})
    public static final class e<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f21614a;

        public e(d dVar) {
            this.f21614a = dVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Observable observable;
            final com.bytedance.jedi.model.h.b bVar = (com.bytedance.jedi.model.h.b) obj;
            Intrinsics.checkParameterIsNotNull(bVar, "traceable");
            if (this.f21614a.f21591c instanceof a.C0213a) {
                observable = Observable.just(bVar.a()).filter(AnonymousClass1.f21615a).map(AnonymousClass2.f21616a).compose(new a(this.f21614a.f21590b, this.f21614a.f21591c));
            } else {
                observable = Observable.just(bVar.a()).compose(new c(this.f21614a.f21590b, this.f21614a.f21591c));
            }
            return observable.map(new Function<T, R>() {
                public final /* synthetic */ Object apply(Object obj) {
                    Pair pair = (Pair) obj;
                    Intrinsics.checkParameterIsNotNull(pair, AdvanceSetting.NETWORK_TYPE);
                    com.bytedance.jedi.model.h.b bVar = bVar;
                    Intrinsics.checkExpressionValueIsNotNull(bVar, "traceable");
                    return e.a.a(pair, bVar);
                }
            }).doOnError(AnonymousClass4.f21618a).onExceptionResumeNext(Observable.empty()).onErrorResumeNext((ObservableSource<? extends T>) Observable.empty());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u000526\u0010\u0006\u001a2\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u0002H\u0004\u0012\u0006\u0012\u0004\u0018\u0001H\u00050\b \t*\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u0002H\u0004\u0012\u0006\u0012\u0004\u0018\u0001H\u00050\b\u0018\u00010\u00070\u0007H\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "K", "V", "K1", "V1", "it", "Lcom/bytedance/jedi/model/traceable/ITraceable;", "Lkotlin/Pair;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 15})
    public static final class f<T> implements Consumer<com.bytedance.jedi.model.h.b<Pair<? extends K1, ? extends V1>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f21619a;

        public f(d dVar) {
            this.f21619a = dVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.jedi.model.h.b bVar = (com.bytedance.jedi.model.h.b) obj;
            com.bytedance.jedi.model.c.d<K1, V1> dVar = this.f21619a.f21590b;
            if (!(dVar instanceof com.bytedance.jedi.model.h.d)) {
                dVar = null;
            }
            com.bytedance.jedi.model.h.d dVar2 = (com.bytedance.jedi.model.h.d) dVar;
            if (dVar2 != null) {
                Intrinsics.checkExpressionValueIsNotNull(bVar, AdvanceSetting.NETWORK_TYPE);
                dVar2.a(bVar);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "K", "V", "K1", "V1", "p1", "", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final /* synthetic */ class g extends FunctionReference implements Function1<Throwable, Unit> {
        public static final g INSTANCE = new g();

        g() {
            super(1);
        }

        public final String getName() {
            return "printStackTrace";
        }

        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(Throwable.class);
        }

        public final String getSignature() {
            return "printStackTrace()V";
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "p1");
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }
    }

    public d(@NotNull com.bytedance.jedi.model.c.d<K, V> dVar, @NotNull com.bytedance.jedi.model.c.d<K1, V1> dVar2, @NotNull com.bytedance.jedi.model.e.a<K, V, K1, V1> aVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "from");
        Intrinsics.checkParameterIsNotNull(dVar2, "to");
        Intrinsics.checkParameterIsNotNull(aVar, "strategy");
        this.f21589a = dVar;
        this.f21590b = dVar2;
        this.f21591c = aVar;
    }
}
