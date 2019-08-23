package com.ss.android.ugc.aweme.discover.d;

import com.bytedance.jedi.model.b.a;
import com.bytedance.jedi.model.b.c;
import com.bytedance.jedi.model.c.f;
import com.bytedance.jedi.model.e.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.discover.model.DiscoverListData;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/repo/DiscoverRepository;", "Lcom/bytedance/jedi/model/repository/Repository;", "()V", "discoverFetcher", "Lcom/ss/android/ugc/aweme/discover/repo/fetcher/DiscoverFetcher;", "requestDiscoverList", "Lio/reactivex/Observable;", "Lcom/ss/android/ugc/aweme/discover/model/DiscoverListData;", "param", "Lcom/ss/android/ugc/aweme/discover/repo/fetcher/DiscoverRequestParam;", "cacheThenFetch", "", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a extends com.bytedance.jedi.model.f.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42184a;

    /* renamed from: b  reason: collision with root package name */
    public static final C0536a f42185b = new C0536a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private static final com.ss.android.ugc.aweme.discover.d.a.a f42186d = new com.ss.android.ugc.aweme.discover.d.a.a();

    /* renamed from: c  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.discover.d.b.a f42187c = new com.ss.android.ugc.aweme.discover.d.b.a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/repo/DiscoverRepository$Companion;", "", "()V", "discoverMemoryCache", "Lcom/ss/android/ugc/aweme/discover/repo/cache/DiscoverMemoryCache;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.discover.d.a$a  reason: collision with other inner class name */
    public static final class C0536a {
        private C0536a() {
        }

        public /* synthetic */ C0536a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/discover/model/DiscoverListData;", "it", "Lcom/bytedance/jedi/model/datasource/Optional;", "apply"}, k = 3, mv = {1, 1, 15})
    static final class b<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42188a;

        /* renamed from: b  reason: collision with root package name */
        public static final b f42189b = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Object obj2;
            f fVar = (f) obj;
            if (PatchProxy.isSupport(new Object[]{fVar}, this, f42188a, false, 37335, new Class[]{f.class}, DiscoverListData.class)) {
                obj2 = PatchProxy.accessDispatch(new Object[]{fVar}, this, f42188a, false, 37335, new Class[]{f.class}, DiscoverListData.class);
            } else {
                Intrinsics.checkParameterIsNotNull(fVar, AdvanceSetting.NETWORK_TYPE);
                obj2 = fVar.a();
                if (obj2 == null) {
                    Intrinsics.throwNpe();
                }
            }
            return (DiscoverListData) obj2;
        }
    }

    public a() {
        a(this.f42187c.a(), f42186d.a(), a.b.a(a.b.C0214a.INSTANCE, AnonymousClass1.INSTANCE));
    }

    @NotNull
    public final Observable<DiscoverListData> a(@NotNull com.ss.android.ugc.aweme.discover.d.b.b bVar, boolean z) {
        Observable<DiscoverListData> observable;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{bVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, f42184a, false, 37333, new Class[]{com.ss.android.ugc.aweme.discover.d.b.b.class, Boolean.TYPE}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{bVar, Byte.valueOf(z)}, this, f42184a, false, 37333, new Class[]{com.ss.android.ugc.aweme.discover.d.b.b.class, Boolean.TYPE}, Observable.class);
        }
        Intrinsics.checkParameterIsNotNull(bVar, "param");
        if (bVar.getCursor() == -1) {
            z2 = true;
        }
        if (!z2 || !z) {
            observable = this.f42187c.a(bVar).subscribeOn(Schedulers.io());
        } else {
            com.bytedance.jedi.model.b.a bVar2 = new com.bytedance.jedi.model.b.b(this.f42187c.a(), f42186d.a());
            Function2<? super Observable<f<V2>>, ? super Observable<f<V2>>, ? extends Observable<f<V2>>> function2 = c.a.INSTANCE;
            Intrinsics.checkParameterIsNotNull(bVar2, "$this$applyStrategy");
            Intrinsics.checkParameterIsNotNull(function2, "strategy");
            Intrinsics.checkParameterIsNotNull(function2, "<set-?>");
            bVar2.f21525a = function2;
            com.bytedance.jedi.model.b.b bVar3 = (com.bytedance.jedi.model.b.b) bVar2;
            Function2<? super Observable<f<V2>>, ? super Observable<f<V2>>, ? extends Observable<f<V2>>> function22 = bVar3.f21525a;
            Observable filter = Observable.just(Unit.INSTANCE).filter(new a.c(bVar3)).flatMap(new a.e(bVar3, bVar)).map(new a.f(bVar3)).filter(a.g.f21538a);
            Intrinsics.checkExpressionValueIsNotNull(filter, "Observable.just(Unit)\n  …r { it != Optional.None }");
            Observable filter2 = Observable.just(Unit.INSTANCE).filter(new a.h(bVar3)).flatMap(new a.i(bVar3, bVar)).map(new a.j(bVar3)).filter(a.k.f21543a);
            Intrinsics.checkExpressionValueIsNotNull(filter2, "Observable.just(Unit)\n  …r { it != Optional.None }");
            Observable switchIfEmpty = ((Observable) function22.invoke(filter, filter2)).doOnNext(new a.l(bVar3, bVar)).switchIfEmpty(a.d.f21534a);
            Intrinsics.checkExpressionValueIsNotNull(switchIfEmpty, "_combineStrategy(\n      …ble.just(Optional.None) }");
            observable = switchIfEmpty.map(b.f42189b).subscribeOn(Schedulers.io());
        }
        Intrinsics.checkExpressionValueIsNotNull(observable, "request");
        return observable;
    }
}
