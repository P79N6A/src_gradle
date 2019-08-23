package com.bytedance.jedi.model.a;

import com.bytedance.jedi.model.c.d;
import com.bytedance.jedi.model.c.f;
import com.bytedance.jedi.model.c.g;
import com.bytedance.jedi.model.h.c;
import com.bytedance.jedi.model.h.e;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.ObservableKt;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bJ\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\nH$J\u0014\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0002J\u001f\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f0\u000e2\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0002\u0010\u0011J\u0017\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0010\u001a\u00028\u0000H$¢\u0006\u0002\u0010\u0013J \u0010\u0014\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00160\u00150\u000eJ\u001c\u0010\u0017\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00160\u0015H$J\u001d\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00028\u00002\b\u0010\u0019\u001a\u0004\u0018\u00018\u0001¢\u0006\u0002\u0010\u001aJ)\u0010\u0018\u001a\u00020\n2\u001a\u0010\u001b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00160\u001cH\u0000¢\u0006\u0002\b\u001dJ\u001f\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00028\u00002\b\u0010\u0019\u001a\u0004\u0018\u00018\u0001H$¢\u0006\u0002\u0010\u001aR\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/bytedance/jedi/model/cache/AbstractCache;", "K", "V", "Lcom/bytedance/jedi/model/cache/ICache;", "()V", "_mapper", "Lcom/bytedance/jedi/model/datasource/DataSourceMapperImpl;", "asDataSource", "Lcom/bytedance/jedi/model/datasource/IDataSource;", "clear", "", "clearActual", "createDataSource", "get", "Lio/reactivex/Observable;", "Lcom/bytedance/jedi/model/datasource/Optional;", "k", "(Ljava/lang/Object;)Lio/reactivex/Observable;", "getActual", "(Ljava/lang/Object;)Ljava/lang/Object;", "getAll", "", "Lkotlin/Pair;", "getAllActual", "put", "v", "(Ljava/lang/Object;Ljava/lang/Object;)V", "traceable", "Lcom/bytedance/jedi/model/traceable/ITraceable;", "put$model_release", "putActual", "model_release"}, k = 1, mv = {1, 1, 15})
public abstract class a<K, V> implements c<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final com.bytedance.jedi.model.c.b<K, V> f21503a = new com.bytedance.jedi.model.c.b<>(new C0203a(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/jedi/model/datasource/IDataSource;", "K", "V", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.jedi.model.a.a$a  reason: collision with other inner class name */
    static final /* synthetic */ class C0203a extends FunctionReference implements Function0<d<K, V>> {
        C0203a(a aVar) {
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
        public final d<K, V> invoke() {
            a aVar = (a) this.receiver;
            return new b<>(aVar, aVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000I\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00030\u00022\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00030\u0004J%\u0010\u0005\u001a\u00020\u00062\u001a\u0010\u0007\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00030\bH\u0001J!\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b0\n2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\rJE\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b0\n2\u0006\u0010\f\u001a\u00028\u00002\"\u0010\u000e\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00100\u000f\"\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0010H\u0016¢\u0006\u0002\u0010\u0011J*\u0010\u0012\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00030\u00130\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016JS\u0010\u0012\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00030\u00130\n2\u0006\u0010\u0014\u001a\u00020\u00152\"\u0010\u000e\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00100\u000f\"\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0010H\u0016¢\u0006\u0002\u0010\u0016J#\u0010\u0017\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00030\b0\nH\u0001J$\u0010\u0018\u001a\u00020\u00062\u001a\u0010\u0007\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00030\bH\u0016J!\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b0\n2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\rJ\"\u0010\u001a\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00030\u00130\nH\u0016¨\u0006\u001b"}, d2 = {"com/bytedance/jedi/model/cache/AbstractCache$createDataSource$1", "Lcom/bytedance/jedi/model/datasource/AbstractDataSource;", "Lcom/bytedance/jedi/model/traceable/ITraceableObserved;", "Lkotlin/Pair;", "Lcom/bytedance/jedi/model/traceable/ITraceableObserver;", "fireTraceable", "", "traceable", "Lcom/bytedance/jedi/model/traceable/ITraceable;", "observe", "Lio/reactivex/Observable;", "Lcom/bytedance/jedi/model/datasource/Optional;", "k", "(Ljava/lang/Object;)Lio/reactivex/Observable;", "exclude", "", "Lcom/bytedance/jedi/model/datasource/IDataSource;", "(Ljava/lang/Object;[Lcom/bytedance/jedi/model/datasource/IDataSource;)Lio/reactivex/Observable;", "observeAll", "", "debounce", "", "(Z[Lcom/bytedance/jedi/model/datasource/IDataSource;)Lio/reactivex/Observable;", "observeTraceable", "onNext", "request", "requestAll", "model_release"}, k = 1, mv = {1, 1, 15})
    public static final class b extends com.bytedance.jedi.model.c.a<K, V> implements com.bytedance.jedi.model.h.c<Pair<? extends K, ? extends V>>, com.bytedance.jedi.model.h.d<Pair<? extends K, ? extends V>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f21504a;

        /* renamed from: b  reason: collision with root package name */
        private final /* synthetic */ com.bytedance.jedi.model.h.f f21505b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "K", "V", "it", "Lkotlin/Pair;", "test"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.jedi.model.a.a$b$a  reason: collision with other inner class name */
        static final class C0204a<T> implements Predicate<Pair<? extends K, ? extends V>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Object f21506a;

            C0204a(Object obj) {
                this.f21506a = obj;
            }

            public final /* synthetic */ boolean test(Object obj) {
                Pair pair = (Pair) obj;
                Intrinsics.checkParameterIsNotNull(pair, AdvanceSetting.NETWORK_TYPE);
                return Intrinsics.areEqual(this.f21506a, pair.getFirst());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u00022\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/bytedance/jedi/model/datasource/Optional;", "V", "K", "it", "Lkotlin/Pair;", "apply"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.jedi.model.a.a$b$b  reason: collision with other inner class name */
        static final class C0205b<T, R> implements Function<T, R> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0205b f21507a = new C0205b();

            C0205b() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                Pair pair = (Pair) obj;
                Intrinsics.checkParameterIsNotNull(pair, AdvanceSetting.NETWORK_TYPE);
                return com.bytedance.jedi.model.c.g.a(pair.getSecond());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "K", "V", "it", "Lkotlin/Pair;", "test"}, k = 3, mv = {1, 1, 15})
        static final class c<T> implements Predicate<Pair<? extends K, ? extends V>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Object f21508a;

            c(Object obj) {
                this.f21508a = obj;
            }

            public final /* synthetic */ boolean test(Object obj) {
                Pair pair = (Pair) obj;
                Intrinsics.checkParameterIsNotNull(pair, AdvanceSetting.NETWORK_TYPE);
                return Intrinsics.areEqual(this.f21508a, pair.getFirst());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u00022\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/bytedance/jedi/model/datasource/Optional;", "V", "K", "it", "Lkotlin/Pair;", "apply"}, k = 3, mv = {1, 1, 15})
        static final class d<T, R> implements Function<T, R> {

            /* renamed from: a  reason: collision with root package name */
            public static final d f21509a = new d();

            d() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                Pair pair = (Pair) obj;
                Intrinsics.checkParameterIsNotNull(pair, AdvanceSetting.NETWORK_TYPE);
                return com.bytedance.jedi.model.c.g.a(pair.getSecond());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u001a\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "K", "V", "it", "Lcom/bytedance/jedi/model/traceable/ITraceable;", "apply"}, k = 3, mv = {1, 1, 15})
        static final class e<T, R> implements Function<T, R> {

            /* renamed from: a  reason: collision with root package name */
            public static final e f21510a = new e();

            e() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                com.bytedance.jedi.model.h.b bVar = (com.bytedance.jedi.model.h.b) obj;
                Intrinsics.checkParameterIsNotNull(bVar, AdvanceSetting.NETWORK_TYPE);
                return (Pair) bVar.a();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u001a\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "K", "V", "traceable", "Lcom/bytedance/jedi/model/traceable/ITraceable;", "Lkotlin/Pair;", "test"}, k = 3, mv = {1, 1, 15})
        static final class f<T> implements Predicate<com.bytedance.jedi.model.h.b<Pair<? extends K, ? extends V>>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.bytedance.jedi.model.c.d[] f21511a;

            f(com.bytedance.jedi.model.c.d[] dVarArr) {
                this.f21511a = dVarArr;
            }

            public final /* synthetic */ boolean test(Object obj) {
                boolean z;
                com.bytedance.jedi.model.h.b bVar = (com.bytedance.jedi.model.h.b) obj;
                Intrinsics.checkParameterIsNotNull(bVar, "traceable");
                com.bytedance.jedi.model.c.d[] dVarArr = this.f21511a;
                int length = dVarArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    } else if (bVar.a(dVarArr[i].c())) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
                if (!z) {
                    return true;
                }
                return false;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u001a\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "K", "V", "it", "Lcom/bytedance/jedi/model/traceable/ITraceable;", "apply"}, k = 3, mv = {1, 1, 15})
        static final class g<T, R> implements Function<T, R> {

            /* renamed from: a  reason: collision with root package name */
            public static final g f21512a = new g();

            g() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                com.bytedance.jedi.model.h.b bVar = (com.bytedance.jedi.model.h.b) obj;
                Intrinsics.checkParameterIsNotNull(bVar, AdvanceSetting.NETWORK_TYPE);
                return (Pair) bVar.a();
            }
        }

        @NotNull
        public final Observable<com.bytedance.jedi.model.h.b<Pair<K, V>>> b() {
            return this.f21505b.b();
        }

        public final void b(@NotNull com.bytedance.jedi.model.h.b<Pair<K, V>> bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "traceable");
            this.f21505b.b(bVar);
        }

        @NotNull
        public final Observable<List<Pair<K, V>>> a() {
            return this.f21504a.b();
        }

        public final void a(@NotNull com.bytedance.jedi.model.h.b<Pair<K, V>> bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "traceable");
            this.f21504a.a(bVar);
        }

        @NotNull
        public final Observable<com.bytedance.jedi.model.c.f<V>> b(K k) {
            return this.f21504a.a(k);
        }

        @NotNull
        public final Observable<com.bytedance.jedi.model.c.f<V>> a(K k) {
            Observable share = a(false).share();
            Intrinsics.checkExpressionValueIsNotNull(share, "observeAll(false).share()");
            Observable<com.bytedance.jedi.model.c.f<V>> map = ObservableKt.flatMapIterable(share).filter(new C0204a(k)).map(C0205b.f21507a);
            Intrinsics.checkExpressionValueIsNotNull(map, "observeAll(false).share(… { it.second.optional() }");
            return map;
        }

        @NotNull
        public final Observable<List<Pair<K, V>>> a(boolean z) {
            Observable map = b().map(e.f21510a);
            Intrinsics.checkExpressionValueIsNotNull(map, "observeTraceable().map { it.payload() }");
            Observable<List<Pair<K, V>>> observeOn = a(map, z).observeOn(AndroidSchedulers.mainThread());
            Intrinsics.checkExpressionValueIsNotNull(observeOn, "observeTraceable().map {…dSchedulers.mainThread())");
            return observeOn;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, com.bytedance.jedi.model.h.a aVar2) {
            super(aVar2);
            this.f21504a = aVar;
            this.f21505b = new com.bytedance.jedi.model.h.f(aVar);
        }

        @NotNull
        public final Observable<com.bytedance.jedi.model.c.f<V>> a(K k, @NotNull com.bytedance.jedi.model.c.d<?, ?>... dVarArr) {
            Intrinsics.checkParameterIsNotNull(dVarArr, "exclude");
            Observable share = a(false, (com.bytedance.jedi.model.c.d<?, ?>[]) (com.bytedance.jedi.model.c.d[]) Arrays.copyOf(dVarArr, 1)).share();
            Intrinsics.checkExpressionValueIsNotNull(share, "observeAll(false, *exclude).share()");
            Observable<com.bytedance.jedi.model.c.f<V>> map = ObservableKt.flatMapIterable(share).filter(new c(k)).map(d.f21509a);
            Intrinsics.checkExpressionValueIsNotNull(map, "observeAll(false, *exclu… { it.second.optional() }");
            return map;
        }

        @NotNull
        public final Observable<List<Pair<K, V>>> a(boolean z, @NotNull com.bytedance.jedi.model.c.d<?, ?>... dVarArr) {
            Intrinsics.checkParameterIsNotNull(dVarArr, "exclude");
            Observable map = b().filter(new f(dVarArr)).map(g.f21512a);
            Intrinsics.checkExpressionValueIsNotNull(map, "observeTraceable()\n     …    .map { it.payload() }");
            Observable<List<Pair<K, V>>> observeOn = a(map, z).observeOn(AndroidSchedulers.mainThread());
            Intrinsics.checkExpressionValueIsNotNull(observeOn, "observeTraceable()\n     …dSchedulers.mainThread())");
            return observeOn;
        }
    }

    /* access modifiers changed from: protected */
    @Nullable
    public abstract V b(K k);

    /* access modifiers changed from: protected */
    public abstract void b(K k, @Nullable V v);

    /* access modifiers changed from: protected */
    @NotNull
    public abstract List<Pair<K, V>> c();

    @NotNull
    public final d<K, V> a() {
        return this.f21503a.a();
    }

    @NotNull
    public final Observable<List<Pair<K, V>>> b() {
        Observable<List<Pair<K, V>>> just = Observable.just(c());
        Intrinsics.checkExpressionValueIsNotNull(just, "Observable.just(getAllActual())");
        return just;
    }

    @NotNull
    public final Observable<f<V>> a(K k) {
        Observable<f<V>> just = Observable.just(g.a(b(k)));
        Intrinsics.checkExpressionValueIsNotNull(just, "Observable.just(getActual(k).optional())");
        return just;
    }

    public final void a(@NotNull com.bytedance.jedi.model.h.b<Pair<K, V>> bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "traceable");
        b(((Pair) bVar.a()).getFirst(), ((Pair) bVar.a()).getSecond());
        d a2 = a();
        if (a2 != null) {
            ((c) a2).b(bVar);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.jedi.model.traceable.ITraceableObserved<kotlin.Pair<K, V?>>");
    }

    public final void a(K k, @Nullable V v) {
        b(k, v);
        d a2 = a();
        if (a2 != null) {
            ((c) a2).b(e.a.a(TuplesKt.to(k, v), new e(TuplesKt.to(k, v), new LinkedHashSet(), (byte) 0)));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.jedi.model.traceable.ITraceableObserved<kotlin.Pair<K, V?>>");
    }
}
