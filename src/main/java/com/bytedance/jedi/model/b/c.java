package com.bytedance.jedi.model.b;

import com.bytedance.jedi.model.c.f;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JL\u0010\u0003\u001aB\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00060\u0005\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00060\u0005\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00060\u00050\u0004j\b\u0012\u0004\u0012\u0002H\u0007`\b\"\u0004\b\u0000\u0010\u0007JL\u0010\t\u001aB\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00060\u0005\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00060\u0005\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00060\u00050\u0004j\b\u0012\u0004\u0012\u0002H\u0007`\b\"\u0004\b\u0000\u0010\u0007JL\u0010\n\u001aB\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00060\u0005\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00060\u0005\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00060\u00050\u0004j\b\u0012\u0004\u0012\u0002H\u0007`\b\"\u0004\b\u0000\u0010\u0007JL\u0010\u000b\u001aB\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00060\u0005\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00060\u0005\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00060\u00050\u0004j\b\u0012\u0004\u0012\u0002H\u0007`\b\"\u0004\b\u0000\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/bytedance/jedi/model/combine/Strategies;", "", "()V", "cacheFirst", "Lkotlin/Function2;", "Lio/reactivex/Observable;", "Lcom/bytedance/jedi/model/datasource/Optional;", "V", "Lcom/bytedance/jedi/model/combine/CombineStrategy;", "cacheFirstThenFetcher", "cacheOnly", "fetcherOnly", "model_release"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f21546a = new c();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u0002H\u0003 \u0004*\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u0002H\u0003 \u0004*\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lcom/bytedance/jedi/model/datasource/Optional;", "V", "kotlin.jvm.PlatformType", "fetcher", "cache", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function2<Observable<f<? extends V>>, Observable<f<? extends V>>, Observable<f<? extends V>>> {
        public static final a INSTANCE = new a();

        a() {
            super(2);
        }

        public final Observable<f<V>> invoke(@NotNull Observable<f<V>> observable, @NotNull Observable<f<V>> observable2) {
            Intrinsics.checkParameterIsNotNull(observable, "fetcher");
            Intrinsics.checkParameterIsNotNull(observable2, "cache");
            Observable<f<V>> concatWith = observable2.onExceptionResumeNext(Observable.empty()).concatWith((ObservableSource<? extends T>) observable);
            Intrinsics.checkExpressionValueIsNotNull(concatWith, "cache.onExceptionResumeN…     .concatWith(fetcher)");
            return concatWith;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lcom/bytedance/jedi/model/datasource/Optional;", "V", "fetcher", "<anonymous parameter 1>", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function2<Observable<f<? extends V>>, Observable<f<? extends V>>, Observable<f<? extends V>>> {
        public static final b INSTANCE = new b();

        b() {
            super(2);
        }

        @NotNull
        public final Observable<f<V>> invoke(@NotNull Observable<f<V>> observable, @NotNull Observable<f<V>> observable2) {
            Intrinsics.checkParameterIsNotNull(observable, "fetcher");
            Intrinsics.checkParameterIsNotNull(observable2, "<anonymous parameter 1>");
            return observable;
        }
    }

    private c() {
    }
}
