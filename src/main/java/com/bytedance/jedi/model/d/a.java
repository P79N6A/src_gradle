package com.bytedance.jedi.model.d;

import android.support.annotation.RestrictTo;
import com.bytedance.jedi.model.c.d;
import com.bytedance.jedi.model.h.e;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0004\b\u0003\u0010\u00042\u001a\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0005B\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nJ\u0015\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0002H$¢\u0006\u0002\u0010\rJ\u001f\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u00022\u0006\u0010\u000f\u001a\u00028\u0003H$¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0002J\u0019\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00030\u00132\u0006\u0010\f\u001a\u00028\u0002¢\u0006\u0002\u0010\u0014J\u001b\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00030\u00132\u0006\u0010\f\u001a\u00028\u0002H$¢\u0006\u0002\u0010\u0014R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/bytedance/jedi/model/fetcher/AbstractFetcher;", "K", "V", "REQ", "RESP", "Lcom/bytedance/jedi/model/fetcher/IFetcher;", "()V", "_mapper", "Lcom/bytedance/jedi/model/datasource/DataSourceMapperImpl;", "asDataSource", "Lcom/bytedance/jedi/model/datasource/IDataSource;", "convertKeyActual", "req", "(Ljava/lang/Object;)Ljava/lang/Object;", "convertValActual", "resp", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "createDataSource", "request", "Lio/reactivex/Observable;", "(Ljava/lang/Object;)Lio/reactivex/Observable;", "requestActual", "model_release"}, k = 1, mv = {1, 1, 15})
public abstract class a<K, V, REQ, RESP> implements b<K, V, REQ, RESP> {

    /* renamed from: a  reason: collision with root package name */
    private final com.bytedance.jedi.model.c.b<K, V> f21559a = new com.bytedance.jedi.model.c.b<>(new C0210a(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/bytedance/jedi/model/datasource/IDataSource;", "K", "V", "REQ", "RESP", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.jedi.model.d.a$a  reason: collision with other inner class name */
    static final /* synthetic */ class C0210a extends FunctionReference implements Function0<d<K, V>> {
        C0210a(a aVar) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00030\u0002J%\u0010\u0004\u001a\u00020\u00052\u001a\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00030\u0007H\u0001J!\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n0\t2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\fJE\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n0\t2\u0006\u0010\u000b\u001a\u00028\u00002\"\u0010\r\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000f0\u000e\"\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000fH\u0016¢\u0006\u0002\u0010\u0010J*\u0010\u0011\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00030\u00120\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016JS\u0010\u0011\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00030\u00120\t2\u0006\u0010\u0013\u001a\u00020\u00142\"\u0010\r\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000f0\u000e\"\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000fH\u0016¢\u0006\u0002\u0010\u0015J#\u0010\u0016\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00030\u00070\tH\u0001J!\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n0\t2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\fJ\"\u0010\u0018\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00030\u00120\tH\u0017¨\u0006\u0019"}, d2 = {"com/bytedance/jedi/model/fetcher/AbstractFetcher$createDataSource$1", "Lcom/bytedance/jedi/model/datasource/AbstractDataSource;", "Lcom/bytedance/jedi/model/traceable/ITraceableObserved;", "Lkotlin/Pair;", "fireTraceable", "", "traceable", "Lcom/bytedance/jedi/model/traceable/ITraceable;", "observe", "Lio/reactivex/Observable;", "Lcom/bytedance/jedi/model/datasource/Optional;", "k", "(Ljava/lang/Object;)Lio/reactivex/Observable;", "exclude", "", "Lcom/bytedance/jedi/model/datasource/IDataSource;", "(Ljava/lang/Object;[Lcom/bytedance/jedi/model/datasource/IDataSource;)Lio/reactivex/Observable;", "observeAll", "", "debounce", "", "(Z[Lcom/bytedance/jedi/model/datasource/IDataSource;)Lio/reactivex/Observable;", "observeTraceable", "request", "requestAll", "model_release"}, k = 1, mv = {1, 1, 15})
    public static final class b extends com.bytedance.jedi.model.c.a<K, V> implements com.bytedance.jedi.model.h.c<Pair<? extends K, ? extends V>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f21560a;

        /* renamed from: b  reason: collision with root package name */
        private final /* synthetic */ com.bytedance.jedi.model.h.f f21561b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "K", "V", "REQ", "RESP", "it", "Lkotlin/Pair;", "test"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.jedi.model.d.a$b$a  reason: collision with other inner class name */
        static final class C0211a<T> implements Predicate<Pair<? extends K, ? extends V>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Object f21562a;

            C0211a(Object obj) {
                this.f21562a = obj;
            }

            public final /* synthetic */ boolean test(Object obj) {
                Pair pair = (Pair) obj;
                Intrinsics.checkParameterIsNotNull(pair, AdvanceSetting.NETWORK_TYPE);
                return Intrinsics.areEqual(this.f21562a, pair.getFirst());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/bytedance/jedi/model/datasource/Optional;", "V", "K", "REQ", "RESP", "it", "Lkotlin/Pair;", "apply"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.jedi.model.d.a$b$b  reason: collision with other inner class name */
        static final class C0212b<T, R> implements Function<T, R> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0212b f21563a = new C0212b();

            C0212b() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                Pair pair = (Pair) obj;
                Intrinsics.checkParameterIsNotNull(pair, AdvanceSetting.NETWORK_TYPE);
                return com.bytedance.jedi.model.c.g.a(pair.getSecond());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "K", "V", "REQ", "RESP", "it", "Lkotlin/Pair;", "test"}, k = 3, mv = {1, 1, 15})
        static final class c<T> implements Predicate<Pair<? extends K, ? extends V>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Object f21564a;

            c(Object obj) {
                this.f21564a = obj;
            }

            public final /* synthetic */ boolean test(Object obj) {
                Pair pair = (Pair) obj;
                Intrinsics.checkParameterIsNotNull(pair, AdvanceSetting.NETWORK_TYPE);
                return Intrinsics.areEqual(this.f21564a, pair.getFirst());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/bytedance/jedi/model/datasource/Optional;", "V", "K", "REQ", "RESP", "it", "Lkotlin/Pair;", "apply"}, k = 3, mv = {1, 1, 15})
        static final class d<T, R> implements Function<T, R> {

            /* renamed from: a  reason: collision with root package name */
            public static final d f21565a = new d();

            d() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                Pair pair = (Pair) obj;
                Intrinsics.checkParameterIsNotNull(pair, AdvanceSetting.NETWORK_TYPE);
                return com.bytedance.jedi.model.c.g.a(pair.getSecond());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u00052\u001a\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u00010\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "K", "V", "REQ", "RESP", "it", "Lcom/bytedance/jedi/model/traceable/ITraceable;", "apply"}, k = 3, mv = {1, 1, 15})
        static final class e<T, R> implements Function<T, R> {

            /* renamed from: a  reason: collision with root package name */
            public static final e f21566a = new e();

            e() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                com.bytedance.jedi.model.h.b bVar = (com.bytedance.jedi.model.h.b) obj;
                Intrinsics.checkParameterIsNotNull(bVar, AdvanceSetting.NETWORK_TYPE);
                return (Pair) bVar.a();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u00052\u001a\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\b0\u0007H\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "K", "V", "REQ", "RESP", "traceable", "Lcom/bytedance/jedi/model/traceable/ITraceable;", "Lkotlin/Pair;", "test"}, k = 3, mv = {1, 1, 15})
        static final class f<T> implements Predicate<com.bytedance.jedi.model.h.b<Pair<? extends K, ? extends V>>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.bytedance.jedi.model.c.d[] f21567a;

            f(com.bytedance.jedi.model.c.d[] dVarArr) {
                this.f21567a = dVarArr;
            }

            public final /* synthetic */ boolean test(Object obj) {
                boolean z;
                com.bytedance.jedi.model.h.b bVar = (com.bytedance.jedi.model.h.b) obj;
                Intrinsics.checkParameterIsNotNull(bVar, "traceable");
                com.bytedance.jedi.model.c.d[] dVarArr = this.f21567a;
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

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u00052\u001a\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u00010\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "K", "V", "REQ", "RESP", "it", "Lcom/bytedance/jedi/model/traceable/ITraceable;", "apply"}, k = 3, mv = {1, 1, 15})
        static final class g<T, R> implements Function<T, R> {

            /* renamed from: a  reason: collision with root package name */
            public static final g f21568a = new g();

            g() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                com.bytedance.jedi.model.h.b bVar = (com.bytedance.jedi.model.h.b) obj;
                Intrinsics.checkParameterIsNotNull(bVar, AdvanceSetting.NETWORK_TYPE);
                return (Pair) bVar.a();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u00052\u0006\u0010\u0006\u001a\u0002H\u0005H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "Lcom/bytedance/jedi/model/datasource/Optional;", "V", "K", "REQ", "RESP", "it", "apply", "(Ljava/lang/Object;)Lcom/bytedance/jedi/model/datasource/Optional;"}, k = 3, mv = {1, 1, 15})
        static final class h<T, R> implements Function<T, R> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f21569a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Object f21570b;

            h(b bVar, Object obj) {
                this.f21569a = bVar;
                this.f21570b = obj;
            }

            public final /* synthetic */ Object apply(Object obj) {
                return com.bytedance.jedi.model.c.g.a(this.f21569a.f21560a.a(this.f21570b, obj));
            }
        }

        @NotNull
        public final Observable<com.bytedance.jedi.model.h.b<Pair<K, V>>> b() {
            return this.f21561b.b();
        }

        public final void b(@NotNull com.bytedance.jedi.model.h.b<Pair<K, V>> bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "traceable");
            this.f21561b.b(bVar);
        }

        @NotNull
        @RestrictTo({RestrictTo.Scope.SUBCLASSES})
        public final Observable<List<Pair<K, V>>> a() {
            Observable<List<Pair<K, V>>> empty = Observable.empty();
            Intrinsics.checkExpressionValueIsNotNull(empty, "Observable.empty()");
            return empty;
        }

        @NotNull
        public final Observable<com.bytedance.jedi.model.c.f<V>> b(K k) {
            Observable<com.bytedance.jedi.model.c.f<V>> map = this.f21560a.a(k).map(new h(this, k));
            Intrinsics.checkExpressionValueIsNotNull(map, "this@AbstractFetcher.req…ctual(k, it).optional() }");
            return map;
        }

        @NotNull
        public final Observable<com.bytedance.jedi.model.c.f<V>> a(K k) {
            Observable share = a(false).share();
            Intrinsics.checkExpressionValueIsNotNull(share, "observeAll(false).share()");
            Observable<com.bytedance.jedi.model.c.f<V>> map = ObservableKt.flatMapIterable(share).filter(new C0211a(k)).map(C0212b.f21563a);
            Intrinsics.checkExpressionValueIsNotNull(map, "observeAll(false).share(… { it.second.optional() }");
            return map;
        }

        @NotNull
        public final Observable<List<Pair<K, V>>> a(boolean z) {
            Observable map = b().map(e.f21566a);
            Intrinsics.checkExpressionValueIsNotNull(map, "observeTraceable().map { it.payload() }");
            Observable<List<Pair<K, V>>> observeOn = a(map, z).observeOn(AndroidSchedulers.mainThread());
            Intrinsics.checkExpressionValueIsNotNull(observeOn, "observeTraceable().map {…dSchedulers.mainThread())");
            return observeOn;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, com.bytedance.jedi.model.h.a aVar2) {
            super(aVar2);
            this.f21560a = aVar;
            this.f21561b = new com.bytedance.jedi.model.h.f(aVar);
        }

        @NotNull
        public final Observable<com.bytedance.jedi.model.c.f<V>> a(K k, @NotNull com.bytedance.jedi.model.c.d<?, ?>... dVarArr) {
            Intrinsics.checkParameterIsNotNull(dVarArr, "exclude");
            Observable share = a(false, (com.bytedance.jedi.model.c.d<?, ?>[]) (com.bytedance.jedi.model.c.d[]) Arrays.copyOf(dVarArr, 1)).share();
            Intrinsics.checkExpressionValueIsNotNull(share, "observeAll(false, *exclude).share()");
            Observable<com.bytedance.jedi.model.c.f<V>> map = ObservableKt.flatMapIterable(share).filter(new c(k)).map(d.f21565a);
            Intrinsics.checkExpressionValueIsNotNull(map, "observeAll(false, *exclu… { it.second.optional() }");
            return map;
        }

        @NotNull
        public final Observable<List<Pair<K, V>>> a(boolean z, @NotNull com.bytedance.jedi.model.c.d<?, ?>... dVarArr) {
            Intrinsics.checkParameterIsNotNull(dVarArr, "exclude");
            Observable map = b().filter(new f(dVarArr)).map(g.f21568a);
            Intrinsics.checkExpressionValueIsNotNull(map, "observeTraceable()\n     …    .map { it.payload() }");
            Observable<List<Pair<K, V>>> observeOn = a(map, z).observeOn(AndroidSchedulers.mainThread());
            Intrinsics.checkExpressionValueIsNotNull(observeOn, "observeTraceable()\n     …dSchedulers.mainThread())");
            return observeOn;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u00052\u000e\u0010\u0006\u001a\n \u0007*\u0004\u0018\u0001H\u0005H\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "K", "V", "REQ", "RESP", "it", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 1, 15})
    static final class c<T> implements Consumer<RESP> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f21571a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f21572b;

        c(a aVar, Object obj) {
            this.f21571a = aVar;
            this.f21572b = obj;
        }

        public final void accept(RESP resp) {
            Object a2 = this.f21571a.a(this.f21572b, resp);
            if (a2 != null) {
                d a3 = this.f21571a.a();
                if (a3 != null) {
                    ((com.bytedance.jedi.model.h.c) a3).b(e.a.a(TuplesKt.to(this.f21571a.c(this.f21572b), a2), new e(TuplesKt.to(this.f21571a.c(this.f21572b), a2), new LinkedHashSet(), (byte) 0)));
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.jedi.model.traceable.ITraceableObserved<kotlin.Pair<K, V>>");
            }
        }
    }

    /* access modifiers changed from: protected */
    @Nullable
    public abstract V a(REQ req, RESP resp);

    /* access modifiers changed from: protected */
    @NotNull
    public abstract Observable<RESP> b(REQ req);

    /* access modifiers changed from: protected */
    public abstract K c(REQ req);

    @NotNull
    public final d<K, V> a() {
        return this.f21559a.a();
    }

    @NotNull
    public final Observable<RESP> a(REQ req) {
        Observable<RESP> doOnNext = b(req).doOnNext(new c(this, req));
        Intrinsics.checkExpressionValueIsNotNull(doOnNext, "requestActual(req).doOnN…)\n            }\n        }");
        return doOnNext;
    }
}
