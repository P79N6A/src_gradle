package com.bytedance.jedi.model.a;

import android.support.annotation.RestrictTo;
import com.bytedance.jedi.model.c.d;
import com.bytedance.jedi.model.c.f;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.ObservableKt;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlinx.coroutines.af;
import kotlinx.coroutines.au;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\fJ\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u000eH$J\u001a\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\fH\u0002J%\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u00130\u00122\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0002\u0010\u0015J\u001d\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u00028\u0000H$¢\u0006\u0002\u0010\u0017J(\u0010\u0018\u001a\"\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00070\u00190\u00070\u0012H\u0017J \u0010\u001a\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u00190\u0007H$J#\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00028\u00002\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0007¢\u0006\u0002\u0010\u001dJ3\u0010\u001b\u001a\u0004\u0018\u00010\u000e2 \u0010\u001e\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00070\u00190\u001fH\u0000¢\u0006\u0004\b \u0010!J%\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00028\u00002\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0007H$¢\u0006\u0002\u0010\u001dJ(\u0010#\u001a\u00020\u000e\"\u0004\b\u0002\u0010$2\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H$0\n0\tH\u0016R \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/bytedance/jedi/model/cache/AbstractListCache;", "K", "V", "Lcom/bytedance/jedi/model/cache/IListCache;", "()V", "_mapper", "Lcom/bytedance/jedi/model/datasource/DataSourceMapperImpl;", "", "comparator", "Lkotlin/Function1;", "", "asDataSource", "Lcom/bytedance/jedi/model/datasource/IDataSource;", "clear", "", "clearActual", "createDataSource", "get", "Lio/reactivex/Observable;", "Lcom/bytedance/jedi/model/datasource/Optional;", "k", "(Ljava/lang/Object;)Lio/reactivex/Observable;", "getActual", "(Ljava/lang/Object;)Ljava/util/List;", "getAll", "Lkotlin/Pair;", "getAllActual", "put", "v", "(Ljava/lang/Object;Ljava/util/List;)V", "traceable", "Lcom/bytedance/jedi/model/traceable/ITraceable;", "put$model_release", "(Lcom/bytedance/jedi/model/traceable/ITraceable;)Lkotlin/Unit;", "putActual", "sortedWith", "T", "model_release"}, k = 1, mv = {1, 1, 15})
public abstract class b<K, V> implements d<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public Function1<? super V, ? extends Comparable<?>> f21513a;

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.jedi.model.c.b<K, List<V>> f21514b = new com.bytedance.jedi.model.c.b<>(new a(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0004¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/jedi/model/datasource/IDataSource;", "K", "", "V", "invoke"}, k = 3, mv = {1, 1, 15})
    static final /* synthetic */ class a extends FunctionReference implements Function0<d<K, List<? extends V>>> {
        a(b bVar) {
            super(0, bVar);
        }

        public final String getName() {
            return "createDataSource";
        }

        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(b.class);
        }

        public final String getSignature() {
            return "createDataSource()Lcom/bytedance/jedi/model/datasource/IDataSource;";
        }

        @NotNull
        public final d<K, List<V>> invoke() {
            b bVar = (b) this.receiver;
            return new C0206b<>(bVar, bVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000G\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u00012\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00020\u00040\u00032\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00020\u00040\u0005J+\u0010\u0006\u001a\u00020\u00072 \u0010\b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00020\u00040\tH\u0001J'\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\f0\u000b2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000eJK\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\f0\u000b2\u0006\u0010\r\u001a\u00028\u00002\"\u0010\u000f\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00110\u0010\"\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0011H\u0016¢\u0006\u0002\u0010\u0012J0\u0010\u0013\u001a\"\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00020\u00040\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016JY\u0010\u0013\u001a\"\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00020\u00040\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\"\u0010\u000f\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00110\u0010\"\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0011H\u0016¢\u0006\u0002\u0010\u0016J)\u0010\u0017\u001a\"\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00020\u00040\t0\u000bH\u0001J*\u0010\u0018\u001a\u00020\u00072 \u0010\b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00020\u00040\tH\u0016J'\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\f0\u000b2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000eJ(\u0010\u001a\u001a\"\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00020\u00040\u00020\u000bH\u0016¨\u0006\u001b"}, d2 = {"com/bytedance/jedi/model/cache/AbstractListCache$createDataSource$1", "Lcom/bytedance/jedi/model/datasource/AbstractDataSource;", "", "Lcom/bytedance/jedi/model/traceable/ITraceableObserved;", "Lkotlin/Pair;", "Lcom/bytedance/jedi/model/traceable/ITraceableObserver;", "fireTraceable", "", "traceable", "Lcom/bytedance/jedi/model/traceable/ITraceable;", "observe", "Lio/reactivex/Observable;", "Lcom/bytedance/jedi/model/datasource/Optional;", "k", "(Ljava/lang/Object;)Lio/reactivex/Observable;", "exclude", "", "Lcom/bytedance/jedi/model/datasource/IDataSource;", "(Ljava/lang/Object;[Lcom/bytedance/jedi/model/datasource/IDataSource;)Lio/reactivex/Observable;", "observeAll", "debounce", "", "(Z[Lcom/bytedance/jedi/model/datasource/IDataSource;)Lio/reactivex/Observable;", "observeTraceable", "onNext", "request", "requestAll", "model_release"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.jedi.model.a.b$b  reason: collision with other inner class name */
    public static final class C0206b extends com.bytedance.jedi.model.c.a<K, List<? extends V>> implements com.bytedance.jedi.model.h.c<Pair<? extends K, ? extends List<? extends V>>>, com.bytedance.jedi.model.h.d<Pair<? extends K, ? extends List<? extends V>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f21515a;

        /* renamed from: b  reason: collision with root package name */
        private final /* synthetic */ com.bytedance.jedi.model.h.f f21516b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u0002H\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "K", "V", "it", "Lkotlin/Pair;", "", "test"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.jedi.model.a.b$b$a */
        static final class a<T> implements Predicate<Pair<? extends K, ? extends List<? extends V>>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Object f21517a;

            a(Object obj) {
                this.f21517a = obj;
            }

            public final /* synthetic */ boolean test(Object obj) {
                Pair pair = (Pair) obj;
                Intrinsics.checkParameterIsNotNull(pair, AdvanceSetting.NETWORK_TYPE);
                return Intrinsics.areEqual(this.f21517a, pair.getFirst());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00032\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u0002H\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/bytedance/jedi/model/datasource/Optional;", "", "V", "K", "it", "Lkotlin/Pair;", "apply"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.jedi.model.a.b$b$b  reason: collision with other inner class name */
        static final class C0207b<T, R> implements Function<T, R> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0207b f21518a = new C0207b();

            C0207b() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                Pair pair = (Pair) obj;
                Intrinsics.checkParameterIsNotNull(pair, AdvanceSetting.NETWORK_TYPE);
                return com.bytedance.jedi.model.c.g.a(pair.getSecond());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u0002H\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "K", "V", "it", "Lkotlin/Pair;", "", "test"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.jedi.model.a.b$b$c */
        static final class c<T> implements Predicate<Pair<? extends K, ? extends List<? extends V>>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Object f21519a;

            c(Object obj) {
                this.f21519a = obj;
            }

            public final /* synthetic */ boolean test(Object obj) {
                Pair pair = (Pair) obj;
                Intrinsics.checkParameterIsNotNull(pair, AdvanceSetting.NETWORK_TYPE);
                return Intrinsics.areEqual(this.f21519a, pair.getFirst());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00032\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u0002H\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/bytedance/jedi/model/datasource/Optional;", "", "V", "K", "it", "Lkotlin/Pair;", "apply"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.jedi.model.a.b$b$d */
        static final class d<T, R> implements Function<T, R> {

            /* renamed from: a  reason: collision with root package name */
            public static final d f21520a = new d();

            d() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                Pair pair = (Pair) obj;
                Intrinsics.checkParameterIsNotNull(pair, AdvanceSetting.NETWORK_TYPE);
                return com.bytedance.jedi.model.c.g.a(pair.getSecond());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u0002H\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0004\u0018\u00010\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00042 \u0010\u0005\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u0002H\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0004\u0018\u00010\u00030\u00010\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "K", "", "V", "it", "Lcom/bytedance/jedi/model/traceable/ITraceable;", "apply"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.jedi.model.a.b$b$e */
        static final class e<T, R> implements Function<T, R> {

            /* renamed from: a  reason: collision with root package name */
            public static final e f21521a = new e();

            e() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                com.bytedance.jedi.model.h.b bVar = (com.bytedance.jedi.model.h.b) obj;
                Intrinsics.checkParameterIsNotNull(bVar, AdvanceSetting.NETWORK_TYPE);
                return (Pair) bVar.a();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032 \u0010\u0004\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u0002H\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00070\u00060\u0005H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "K", "V", "traceable", "Lcom/bytedance/jedi/model/traceable/ITraceable;", "Lkotlin/Pair;", "", "test"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.jedi.model.a.b$b$f */
        static final class f<T> implements Predicate<com.bytedance.jedi.model.h.b<Pair<? extends K, ? extends List<? extends V>>>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.bytedance.jedi.model.c.d[] f21522a;

            f(com.bytedance.jedi.model.c.d[] dVarArr) {
                this.f21522a = dVarArr;
            }

            public final /* synthetic */ boolean test(Object obj) {
                boolean z;
                com.bytedance.jedi.model.h.b bVar = (com.bytedance.jedi.model.h.b) obj;
                Intrinsics.checkParameterIsNotNull(bVar, "traceable");
                com.bytedance.jedi.model.c.d[] dVarArr = this.f21522a;
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

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u0002H\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0004\u0018\u00010\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00042 \u0010\u0005\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u0002H\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0004\u0018\u00010\u00030\u00010\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "K", "", "V", "it", "Lcom/bytedance/jedi/model/traceable/ITraceable;", "apply"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.jedi.model.a.b$b$g */
        static final class g<T, R> implements Function<T, R> {

            /* renamed from: a  reason: collision with root package name */
            public static final g f21523a = new g();

            g() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                com.bytedance.jedi.model.h.b bVar = (com.bytedance.jedi.model.h.b) obj;
                Intrinsics.checkParameterIsNotNull(bVar, AdvanceSetting.NETWORK_TYPE);
                return (Pair) bVar.a();
            }
        }

        @NotNull
        public final Observable<com.bytedance.jedi.model.h.b<Pair<K, List<V>>>> b() {
            return this.f21516b.b();
        }

        public final void b(@NotNull com.bytedance.jedi.model.h.b<Pair<K, List<V>>> bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "traceable");
            this.f21516b.b(bVar);
        }

        @NotNull
        public final Observable<List<Pair<K, List<V>>>> a() {
            return this.f21515a.b();
        }

        @NotNull
        public final Observable<com.bytedance.jedi.model.c.f<List<V>>> b(K k) {
            return this.f21515a.a(k);
        }

        public final void a(@NotNull com.bytedance.jedi.model.h.b<Pair<K, List<V>>> bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "traceable");
            b bVar2 = this.f21515a;
            Intrinsics.checkParameterIsNotNull(bVar, "traceable");
            Unit unit = (Unit) kotlinx.coroutines.e.a(kotlin.coroutines.f.INSTANCE, new c(bVar2, bVar, null));
        }

        @NotNull
        public final Observable<com.bytedance.jedi.model.c.f<List<V>>> a(K k) {
            Observable share = a(false).share();
            Intrinsics.checkExpressionValueIsNotNull(share, "observeAll(false).share()");
            Observable<com.bytedance.jedi.model.c.f<List<V>>> map = ObservableKt.flatMapIterable(share).filter(new a(k)).map(C0207b.f21518a);
            Intrinsics.checkExpressionValueIsNotNull(map, "observeAll(false).share(… { it.second.optional() }");
            return map;
        }

        @NotNull
        public final Observable<List<Pair<K, List<V>>>> a(boolean z) {
            Observable map = b().map(e.f21521a);
            Intrinsics.checkExpressionValueIsNotNull(map, "observeTraceable().map { it.payload() }");
            Observable<List<Pair<K, List<V>>>> observeOn = a(map, z).observeOn(AndroidSchedulers.mainThread());
            Intrinsics.checkExpressionValueIsNotNull(observeOn, "observeTraceable().map {…dSchedulers.mainThread())");
            return observeOn;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0206b(b bVar, com.bytedance.jedi.model.h.a aVar) {
            super(aVar);
            this.f21515a = bVar;
            this.f21516b = new com.bytedance.jedi.model.h.f(bVar);
        }

        @NotNull
        public final Observable<com.bytedance.jedi.model.c.f<List<V>>> a(K k, @NotNull com.bytedance.jedi.model.c.d<?, ?>... dVarArr) {
            Intrinsics.checkParameterIsNotNull(dVarArr, "exclude");
            Observable share = a(false, (com.bytedance.jedi.model.c.d<?, ?>[]) (com.bytedance.jedi.model.c.d[]) Arrays.copyOf(dVarArr, 1)).share();
            Intrinsics.checkExpressionValueIsNotNull(share, "observeAll(false, *exclude).share()");
            Observable<com.bytedance.jedi.model.c.f<List<V>>> map = ObservableKt.flatMapIterable(share).filter(new c(k)).map(d.f21520a);
            Intrinsics.checkExpressionValueIsNotNull(map, "observeAll(false, *exclu… { it.second.optional() }");
            return map;
        }

        @NotNull
        public final Observable<List<Pair<K, List<V>>>> a(boolean z, @NotNull com.bytedance.jedi.model.c.d<?, ?>... dVarArr) {
            Intrinsics.checkParameterIsNotNull(dVarArr, "exclude");
            Observable map = b().filter(new f(dVarArr)).map(g.f21523a);
            Intrinsics.checkExpressionValueIsNotNull(map, "observeTraceable()\n     …    .map { it.payload() }");
            Observable<List<Pair<K, List<V>>>> observeOn = a(map, z).observeOn(AndroidSchedulers.mainThread());
            Intrinsics.checkExpressionValueIsNotNull(observeOn, "observeTraceable()\n     …dSchedulers.mainThread())");
            return observeOn;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u00020\u0004H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "K", "V", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 15})
    @DebugMetadata(b = "AbstractListCache.kt", c = {30}, d = "invokeSuspend", e = "com.bytedance.jedi.model.cache.AbstractListCache$put$1")
    static final class c extends k implements Function2<af, kotlin.coroutines.c<? super Unit>, Object> {
        final /* synthetic */ com.bytedance.jedi.model.h.b $traceable;
        Object L$0;
        int label;
        private af p$;
        final /* synthetic */ b this$0;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u00020\u0004H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "K", "V", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 15})
        @DebugMetadata(b = "AbstractListCache.kt", c = {}, d = "invokeSuspend", e = "com.bytedance.jedi.model.cache.AbstractListCache$put$1$1")
        /* renamed from: com.bytedance.jedi.model.a.b$c$1  reason: invalid class name */
        static final class AnonymousClass1 extends k implements Function2<af, kotlin.coroutines.c<? super Unit>, Object> {
            int label;
            private af p$;
            final /* synthetic */ c this$0;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 1, 15})
            /* renamed from: com.bytedance.jedi.model.a.b$c$1$a */
            public static final class a<T> implements Comparator<T> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ Function1 f21524a;

                public a(Function1 function1) {
                    this.f21524a = function1;
                }

                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues((Comparable) this.f21524a.invoke(t), (Comparable) this.f21524a.invoke(t2));
                }
            }

            {
                this.this$0 = r1;
            }

            @NotNull
            public final kotlin.coroutines.c<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.c<?> cVar) {
                Intrinsics.checkParameterIsNotNull(cVar, "completion");
                AnonymousClass1 r0 = new AnonymousClass1(this.this$0, cVar);
                r0.p$ = (af) obj;
                return r0;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create(obj, (kotlin.coroutines.c) obj2)).invokeSuspend(Unit.INSTANCE);
            }

            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                List list;
                if (this.label == 0) {
                    List list2 = (List) ((Pair) this.this$0.$traceable.a()).getSecond();
                    Function1<? super V, ? extends Comparable<?>> function1 = this.this$0.this$0.f21513a;
                    if (function1 != null) {
                        if (list2 != null) {
                            list = CollectionsKt.sortedWith(list2, new a(function1));
                        } else {
                            list = null;
                        }
                        if (list != null) {
                            list2 = list;
                        }
                    }
                    this.this$0.this$0.a(((Pair) this.this$0.$traceable.a()).getFirst(), list2);
                    d a2 = this.this$0.this$0.a();
                    if (!(a2 instanceof com.bytedance.jedi.model.h.c)) {
                        a2 = null;
                    }
                    com.bytedance.jedi.model.h.c cVar = (com.bytedance.jedi.model.h.c) a2;
                    if (cVar == null) {
                        return null;
                    }
                    cVar.b(this.this$0.$traceable);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, com.bytedance.jedi.model.h.b bVar2, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.this$0 = bVar;
            this.$traceable = bVar2;
        }

        @NotNull
        public final kotlin.coroutines.c<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.c<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            c cVar2 = new c(this.this$0, this.$traceable, cVar);
            cVar2.p$ = (af) obj;
            return cVar2;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((c) create(obj, (kotlin.coroutines.c) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object a2 = kotlin.coroutines.a.b.a();
            switch (this.label) {
                case 0:
                    this.L$0 = this.p$;
                    this.label = 1;
                    obj = g.a(au.c(), new AnonymousClass1(this, null), this);
                    if (obj == a2) {
                        return a2;
                    }
                    break;
                case 1:
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(K k, @Nullable List<? extends V> list);

    /* access modifiers changed from: protected */
    @Nullable
    public abstract List<V> b(K k);

    /* access modifiers changed from: protected */
    @NotNull
    public abstract List<Pair<K, List<V>>> d();

    /* access modifiers changed from: protected */
    public abstract void e();

    public final void c() {
        e();
    }

    @NotNull
    public final d<K, List<V>> a() {
        return this.f21514b.a();
    }

    @NotNull
    @RestrictTo({RestrictTo.Scope.SUBCLASSES})
    public final Observable<List<Pair<K, List<V>>>> b() {
        Observable<List<Pair<K, List<V>>>> just = Observable.just(d());
        Intrinsics.checkExpressionValueIsNotNull(just, "Observable.just(getAllActual())");
        return just;
    }

    @NotNull
    public final Observable<f<List<V>>> a(K k) {
        Observable<f<List<V>>> just = Observable.just(com.bytedance.jedi.model.c.g.a(b(k)));
        Intrinsics.checkExpressionValueIsNotNull(just, "Observable.just(getActual(k).optional())");
        return just;
    }
}
