package com.bytedance.jedi.model.b;

import android.support.annotation.RestrictTo;
import com.bytedance.jedi.model.b.c;
import com.bytedance.jedi.model.c.f;
import com.bytedance.jedi.model.h.e;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0004\b\u0003\u0010\u0004*\u0004\b\u0004\u0010\u0005*\u0004\b\u0005\u0010\u00062\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u0002H\u0005\u0012\u0006\u0012\u0004\u0018\u0001H\u00060\b0\u00072\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\tB-\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000b¢\u0006\u0002\u0010\rJ\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u000bJ@\u0010,\u001a&\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00002\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00020\u000fH\u0016J@\u0010.\u001a&\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00002\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00050\u000fH\u0016J\u0014\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u000bH\u0002J@\u00100\u001a&\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00002\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J@\u00101\u001a&\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00002\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00050\u000fH\u0016J\u001f\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\u001a0\u00192\u0006\u00103\u001a\u00028\u0004¢\u0006\u0002\u00104R(\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R(\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0005\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013RZ\u0010\u0017\u001aB\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\u001a0\u0019\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\u001a0\u0019\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\u001a0\u00190\u0018j\b\u0012\u0004\u0012\u00028\u0005`\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010 \u001a\u0010\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R(\u0010#\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0005\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010\u0013R\u001a\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050'X\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)¨\u00065"}, d2 = {"Lcom/bytedance/jedi/model/combine/GenericCombine;", "K", "V", "K1", "V1", "K2", "V2", "Lcom/bytedance/jedi/model/traceable/ITracePoint;", "Lkotlin/Pair;", "Lcom/bytedance/jedi/model/datasource/IDataSourceMapper;", "fetcher", "Lcom/bytedance/jedi/model/datasource/IDataSource;", "cache", "(Lcom/bytedance/jedi/model/datasource/IDataSource;Lcom/bytedance/jedi/model/datasource/IDataSource;)V", "_cacheKey", "Lkotlin/Function1;", "get_cacheKey", "()Lkotlin/jvm/functions/Function1;", "set_cacheKey", "(Lkotlin/jvm/functions/Function1;)V", "_cacheVal", "get_cacheVal", "set_cacheVal", "_combineStrategy", "Lkotlin/Function2;", "Lio/reactivex/Observable;", "Lcom/bytedance/jedi/model/datasource/Optional;", "Lcom/bytedance/jedi/model/combine/CombineStrategy;", "get_combineStrategy$model_release", "()Lkotlin/jvm/functions/Function2;", "set_combineStrategy$model_release", "(Lkotlin/jvm/functions/Function2;)V", "_fetcherKey", "get_fetcherKey", "set_fetcherKey", "_fetcherVal", "get_fetcherVal", "set_fetcherVal", "_mapper", "Lcom/bytedance/jedi/model/datasource/DataSourceMapperImpl;", "getCache", "()Lcom/bytedance/jedi/model/datasource/IDataSource;", "getFetcher", "asDataSource", "cacheKey", "convert", "cacheVal", "createDataSource", "fetcherKey", "fetcherVal", "request", "k", "(Ljava/lang/Object;)Lio/reactivex/Observable;", "model_release"}, k = 1, mv = {1, 1, 15})
public class a<K, V, K1, V1, K2, V2> implements com.bytedance.jedi.model.c.e<K2, V2>, com.bytedance.jedi.model.h.a<Pair<? extends K2, ? extends V2>> {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public Function2<? super Observable<com.bytedance.jedi.model.c.f<V2>>, ? super Observable<com.bytedance.jedi.model.c.f<V2>>, ? extends Observable<com.bytedance.jedi.model.c.f<V2>>> f21525a = c.b.INSTANCE;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public Function1<? super K2, ? extends K1> f21526b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public Function1<? super V1, ? extends V2> f21527c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public Function1<? super K2, ? extends K> f21528d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public Function1<? super V, ? extends V2> f21529e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final com.bytedance.jedi.model.c.d<K, V> f21530f;
    @NotNull
    public final com.bytedance.jedi.model.c.d<K1, V1> g;
    private final com.bytedance.jedi.model.c.b<K2, V2> h = new com.bytedance.jedi.model.c.b<>(new C0208a(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0005\"\u0004\b\u0002\u0010\u0006\"\u0004\b\u0003\u0010\u0007\"\u0004\b\u0004\u0010\u0002\"\u0004\b\u0005\u0010\u0003¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/bytedance/jedi/model/datasource/IDataSource;", "K2", "V2", "K", "V", "K1", "V1", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.jedi.model.b.a$a  reason: collision with other inner class name */
    static final /* synthetic */ class C0208a extends FunctionReference implements Function0<com.bytedance.jedi.model.c.d<K2, V2>> {
        C0208a(a aVar) {
            super(0, aVar);
        }

        public final String getName() {
            return "createDataSource";
        }

        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(a.class);
        }

        public final String getSignature() {
            return "createDataSource()Lcom/bytedance/jedi/model/datasource/IDataSource;";
        }

        @NotNull
        public final com.bytedance.jedi.model.c.d<K2, V2> invoke() {
            a aVar = (a) this.receiver;
            return new b<>(aVar, aVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00030\u0002J%\u0010\u0004\u001a\u00020\u00052\u001a\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00030\u0007H\u0001J!\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n0\t2\u0006\u0010\u000b\u001a\u00028\u0000H\u0017¢\u0006\u0002\u0010\fJE\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n0\t2\u0006\u0010\u000b\u001a\u00028\u00002\"\u0010\r\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000f0\u000e\"\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000fH\u0017¢\u0006\u0002\u0010\u0010J*\u0010\u0011\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00030\u00120\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0017JS\u0010\u0011\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00030\u00120\t2\u0006\u0010\u0013\u001a\u00020\u00142\"\u0010\r\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000f0\u000e\"\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000fH\u0017¢\u0006\u0002\u0010\u0015J#\u0010\u0016\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00030\u00070\tH\u0001J!\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n0\t2\u0006\u0010\u000b\u001a\u00028\u0000H\u0017¢\u0006\u0002\u0010\fJ\"\u0010\u0018\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00030\u00120\tH\u0017¨\u0006\u0019"}, d2 = {"com/bytedance/jedi/model/combine/GenericCombine$createDataSource$1", "Lcom/bytedance/jedi/model/datasource/AbstractDataSource;", "Lcom/bytedance/jedi/model/traceable/ITraceableObserved;", "Lkotlin/Pair;", "fireTraceable", "", "traceable", "Lcom/bytedance/jedi/model/traceable/ITraceable;", "observe", "Lio/reactivex/Observable;", "Lcom/bytedance/jedi/model/datasource/Optional;", "k", "(Ljava/lang/Object;)Lio/reactivex/Observable;", "exclude", "", "Lcom/bytedance/jedi/model/datasource/IDataSource;", "(Ljava/lang/Object;[Lcom/bytedance/jedi/model/datasource/IDataSource;)Lio/reactivex/Observable;", "observeAll", "", "debounce", "", "(Z[Lcom/bytedance/jedi/model/datasource/IDataSource;)Lio/reactivex/Observable;", "observeTraceable", "request", "requestAll", "model_release"}, k = 1, mv = {1, 1, 15})
    public static final class b extends com.bytedance.jedi.model.c.a<K2, V2> implements com.bytedance.jedi.model.h.c<Pair<? extends K2, ? extends V2>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f21531a;

        /* renamed from: b  reason: collision with root package name */
        private final /* synthetic */ com.bytedance.jedi.model.h.f f21532b;

        @NotNull
        public final Observable<com.bytedance.jedi.model.h.b<Pair<K2, V2>>> b() {
            return this.f21532b.b();
        }

        public final void b(@NotNull com.bytedance.jedi.model.h.b<Pair<K2, V2>> bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "traceable");
            this.f21532b.b(bVar);
        }

        @NotNull
        @RestrictTo({RestrictTo.Scope.SUBCLASSES})
        public final Observable<List<Pair<K2, V2>>> a() {
            Observable<List<Pair<K2, V2>>> empty = Observable.empty();
            Intrinsics.checkExpressionValueIsNotNull(empty, "Observable.empty()");
            return empty;
        }

        @NotNull
        @RestrictTo({RestrictTo.Scope.SUBCLASSES})
        public final Observable<com.bytedance.jedi.model.c.f<V2>> b(K2 k2) {
            Observable<com.bytedance.jedi.model.c.f<V2>> empty = Observable.empty();
            Intrinsics.checkExpressionValueIsNotNull(empty, "Observable.empty()");
            return empty;
        }

        @NotNull
        @RestrictTo({RestrictTo.Scope.SUBCLASSES})
        public final Observable<com.bytedance.jedi.model.c.f<V2>> a(K2 k2) {
            Observable<com.bytedance.jedi.model.c.f<V2>> empty = Observable.empty();
            Intrinsics.checkExpressionValueIsNotNull(empty, "Observable.empty()");
            return empty;
        }

        @NotNull
        @RestrictTo({RestrictTo.Scope.SUBCLASSES})
        public final Observable<List<Pair<K2, V2>>> a(boolean z) {
            Observable<List<Pair<K2, V2>>> empty = Observable.empty();
            Intrinsics.checkExpressionValueIsNotNull(empty, "Observable.empty()");
            return empty;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, com.bytedance.jedi.model.h.a aVar2) {
            super(aVar2);
            this.f21531a = aVar;
            this.f21532b = new com.bytedance.jedi.model.h.f(aVar);
        }

        @NotNull
        @RestrictTo({RestrictTo.Scope.SUBCLASSES})
        public final Observable<com.bytedance.jedi.model.c.f<V2>> a(K2 k2, @NotNull com.bytedance.jedi.model.c.d<?, ?>... dVarArr) {
            Intrinsics.checkParameterIsNotNull(dVarArr, "exclude");
            Observable<com.bytedance.jedi.model.c.f<V2>> empty = Observable.empty();
            Intrinsics.checkExpressionValueIsNotNull(empty, "Observable.empty()");
            return empty;
        }

        @NotNull
        @RestrictTo({RestrictTo.Scope.SUBCLASSES})
        public final Observable<List<Pair<K2, V2>>> a(boolean z, @NotNull com.bytedance.jedi.model.c.d<?, ?>... dVarArr) {
            Intrinsics.checkParameterIsNotNull(dVarArr, "exclude");
            Observable<List<Pair<K2, V2>>> empty = Observable.empty();
            Intrinsics.checkExpressionValueIsNotNull(empty, "Observable.empty()");
            return empty;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005\"\u0004\b\u0004\u0010\u0006\"\u0004\b\u0005\u0010\u00072\u0006\u0010\b\u001a\u00020\tH\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"<anonymous>", "", "K", "V", "K1", "V1", "K2", "V2", "it", "", "test", "(Lkotlin/Unit;)Z"}, k = 3, mv = {1, 1, 15})
    public static final class c<T> implements Predicate<Unit> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f21533a;

        public c(a aVar) {
            this.f21533a = aVar;
        }

        public final /* synthetic */ boolean test(Object obj) {
            Intrinsics.checkParameterIsNotNull((Unit) obj, AdvanceSetting.NETWORK_TYPE);
            if (this.f21533a.f21528d == null || this.f21533a.f21529e == null) {
                return false;
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005\"\u0004\b\u0004\u0010\u0006\"\u0004\b\u0005\u0010\u00072\"\u0010\b\u001a\u001e\u0012\u001a\b\u0000\u0012\u0016\u0012\u0004\u0012\u0002H\u0007 \u000b*\n\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\n0\n0\tH\n¢\u0006\u0002\b\f"}, d2 = {"<anonymous>", "", "K", "V", "K1", "V1", "K2", "V2", "it", "Lio/reactivex/Observer;", "Lcom/bytedance/jedi/model/datasource/Optional;", "kotlin.jvm.PlatformType", "subscribe"}, k = 3, mv = {1, 1, 15})
    public static final class d<T> implements ObservableSource<com.bytedance.jedi.model.c.f<? extends V2>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f21534a = new d();

        d() {
        }

        public final void subscribe(@NotNull Observer<? super com.bytedance.jedi.model.c.f<? extends V2>> observer) {
            Intrinsics.checkParameterIsNotNull(observer, AdvanceSetting.NETWORK_TYPE);
            Observable.just(f.a.a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0005\"\u0004\b\u0003\u0010\u0006\"\u0004\b\u0004\u0010\u0007\"\u0004\b\u0005\u0010\b2\u0006\u0010\t\u001a\u00020\nH\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lcom/bytedance/jedi/model/datasource/Optional;", "V", "K", "K1", "V1", "K2", "V2", "it", "", "apply", "(Lkotlin/Unit;)Lio/reactivex/Observable;"}, k = 3, mv = {1, 1, 15})
    public static final class e<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f21535a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f21536b;

        public e(a aVar, Object obj) {
            this.f21535a = aVar;
            this.f21536b = obj;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Intrinsics.checkParameterIsNotNull((Unit) obj, AdvanceSetting.NETWORK_TYPE);
            com.bytedance.jedi.model.c.d<K, V> dVar = this.f21535a.f21530f;
            Function1<? super K2, ? extends K> function1 = this.f21535a.f21528d;
            if (function1 == null) {
                Intrinsics.throwNpe();
            }
            return dVar.b(function1.invoke(this.f21536b));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u0005\"\u0004\b\u0003\u0010\u0006\"\u0004\b\u0004\u0010\u0007\"\u0004\b\u0005\u0010\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0001H\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lcom/bytedance/jedi/model/datasource/Optional;", "V2", "K", "V", "K1", "V1", "K2", "it", "apply"}, k = 3, mv = {1, 1, 15})
    public static final class f<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f21537a;

        public f(a aVar) {
            this.f21537a = aVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Object obj2;
            com.bytedance.jedi.model.c.f fVar = (com.bytedance.jedi.model.c.f) obj;
            Intrinsics.checkParameterIsNotNull(fVar, AdvanceSetting.NETWORK_TYPE);
            Object a2 = fVar.a();
            if (a2 != null) {
                Function1<? super V, ? extends V2> function1 = this.f21537a.f21529e;
                if (function1 == null) {
                    Intrinsics.throwNpe();
                }
                obj2 = function1.invoke(a2);
            } else {
                obj2 = null;
            }
            return com.bytedance.jedi.model.c.g.a(obj2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005\"\u0004\b\u0004\u0010\u0006\"\u0004\b\u0005\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\tH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "K", "V", "K1", "V1", "K2", "V2", "it", "Lcom/bytedance/jedi/model/datasource/Optional;", "test"}, k = 3, mv = {1, 1, 15})
    public static final class g<T> implements Predicate<com.bytedance.jedi.model.c.f<? extends V2>> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f21538a = new g();

        g() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            com.bytedance.jedi.model.c.f fVar = (com.bytedance.jedi.model.c.f) obj;
            Intrinsics.checkParameterIsNotNull(fVar, AdvanceSetting.NETWORK_TYPE);
            return !Intrinsics.areEqual((Object) fVar, (Object) f.a.a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005\"\u0004\b\u0004\u0010\u0006\"\u0004\b\u0005\u0010\u00072\u0006\u0010\b\u001a\u00020\tH\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"<anonymous>", "", "K", "V", "K1", "V1", "K2", "V2", "it", "", "test", "(Lkotlin/Unit;)Z"}, k = 3, mv = {1, 1, 15})
    public static final class h<T> implements Predicate<Unit> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f21539a;

        public h(a aVar) {
            this.f21539a = aVar;
        }

        public final /* synthetic */ boolean test(Object obj) {
            Intrinsics.checkParameterIsNotNull((Unit) obj, AdvanceSetting.NETWORK_TYPE);
            if (this.f21539a.f21526b == null || this.f21539a.f21527c == null) {
                return false;
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0005\"\u0004\b\u0002\u0010\u0006\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u0007\"\u0004\b\u0005\u0010\b2\u0006\u0010\t\u001a\u00020\nH\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lcom/bytedance/jedi/model/datasource/Optional;", "V1", "K", "V", "K1", "K2", "V2", "it", "", "apply", "(Lkotlin/Unit;)Lio/reactivex/Observable;"}, k = 3, mv = {1, 1, 15})
    public static final class i<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f21540a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f21541b;

        public i(a aVar, Object obj) {
            this.f21540a = aVar;
            this.f21541b = obj;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Intrinsics.checkParameterIsNotNull((Unit) obj, AdvanceSetting.NETWORK_TYPE);
            com.bytedance.jedi.model.c.d<K1, V1> dVar = this.f21540a.g;
            Function1<? super K2, ? extends K1> function1 = this.f21540a.f21526b;
            if (function1 == null) {
                Intrinsics.throwNpe();
            }
            return dVar.b(function1.invoke(this.f21541b));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u0005\"\u0004\b\u0003\u0010\u0006\"\u0004\b\u0004\u0010\u0007\"\u0004\b\u0005\u0010\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0001H\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lcom/bytedance/jedi/model/datasource/Optional;", "V2", "K", "V", "K1", "V1", "K2", "it", "apply"}, k = 3, mv = {1, 1, 15})
    public static final class j<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f21542a;

        public j(a aVar) {
            this.f21542a = aVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Object obj2;
            com.bytedance.jedi.model.c.f fVar = (com.bytedance.jedi.model.c.f) obj;
            Intrinsics.checkParameterIsNotNull(fVar, AdvanceSetting.NETWORK_TYPE);
            Object a2 = fVar.a();
            if (a2 != null) {
                Function1<? super V1, ? extends V2> function1 = this.f21542a.f21527c;
                if (function1 == null) {
                    Intrinsics.throwNpe();
                }
                obj2 = function1.invoke(a2);
            } else {
                obj2 = null;
            }
            return com.bytedance.jedi.model.c.g.a(obj2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005\"\u0004\b\u0004\u0010\u0006\"\u0004\b\u0005\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\tH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "K", "V", "K1", "V1", "K2", "V2", "it", "Lcom/bytedance/jedi/model/datasource/Optional;", "test"}, k = 3, mv = {1, 1, 15})
    public static final class k<T> implements Predicate<com.bytedance.jedi.model.c.f<? extends V2>> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f21543a = new k();

        k() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            com.bytedance.jedi.model.c.f fVar = (com.bytedance.jedi.model.c.f) obj;
            Intrinsics.checkParameterIsNotNull(fVar, AdvanceSetting.NETWORK_TYPE);
            return !Intrinsics.areEqual((Object) fVar, (Object) f.a.a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005\"\u0004\b\u0004\u0010\u0006\"\u0004\b\u0005\u0010\u00072\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u0002H\u0007 \n*\n\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\t0\tH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "", "K", "V", "K1", "V1", "K2", "V2", "it", "Lcom/bytedance/jedi/model/datasource/Optional;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 15})
    public static final class l<T> implements Consumer<com.bytedance.jedi.model.c.f<? extends V2>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f21544a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f21545b;

        public l(a aVar, Object obj) {
            this.f21544a = aVar;
            this.f21545b = obj;
        }

        public final /* synthetic */ void accept(Object obj) {
            Object a2 = ((com.bytedance.jedi.model.c.f) obj).a();
            if (a2 != null) {
                com.bytedance.jedi.model.c.d a3 = this.f21544a.a();
                if (!(a3 instanceof com.bytedance.jedi.model.h.c)) {
                    a3 = null;
                }
                com.bytedance.jedi.model.h.c cVar = (com.bytedance.jedi.model.h.c) a3;
                if (cVar != null) {
                    cVar.b(e.a.a(TuplesKt.to(this.f21545b, a2), new com.bytedance.jedi.model.h.e(TuplesKt.to(this.f21545b, a2), new LinkedHashSet(), (byte) 0)));
                }
            }
        }
    }

    @NotNull
    public final com.bytedance.jedi.model.c.d<K2, V2> a() {
        return this.h.a();
    }

    public a(@NotNull com.bytedance.jedi.model.c.d<K, V> dVar, @NotNull com.bytedance.jedi.model.c.d<K1, V1> dVar2) {
        Intrinsics.checkParameterIsNotNull(dVar, "fetcher");
        Intrinsics.checkParameterIsNotNull(dVar2, "cache");
        this.f21530f = dVar;
        this.g = dVar2;
    }
}
