package com.ss.android.ugc.aweme.commerce.collection;

import com.bytedance.jedi.model.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.collection.CollectionGoodApi;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0001B\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0014J \u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0005H\u0014J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\u0006\u0010\n\u001a\u00020\u0002H\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/collection/QueryCollectionGoodListFetcher;", "Lcom/bytedance/jedi/model/fetcher/AbstractFetcher;", "Lcom/ss/android/ugc/aweme/commerce/collection/CollectionGoodQueryParam;", "", "Lcom/ss/android/ugc/aweme/commerce/collection/CollectionGood;", "Lcom/ss/android/ugc/aweme/commerce/collection/CollectionGoodResponse;", "()V", "service", "Lcom/ss/android/ugc/aweme/commerce/collection/CollectionGoodApi;", "convertKeyActual", "req", "convertValActual", "resp", "requestActual", "Lio/reactivex/Observable;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e extends a<a, List<? extends CollectionGood>, a, c> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36888a;

    /* renamed from: b  reason: collision with root package name */
    private final CollectionGoodApi f36889b;

    public e() {
        CollectionGoodApi collectionGoodApi;
        CollectionGoodApi.a aVar = CollectionGoodApi.f36843a;
        if (PatchProxy.isSupport(new Object[0], aVar, CollectionGoodApi.a.f36844a, false, 28061, new Class[0], CollectionGoodApi.class)) {
            collectionGoodApi = (CollectionGoodApi) PatchProxy.accessDispatch(new Object[0], aVar, CollectionGoodApi.a.f36844a, false, 28061, new Class[0], CollectionGoodApi.class);
        } else {
            Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(CollectionGoodApi.class);
            Intrinsics.checkExpressionValueIsNotNull(create, "ServiceManager.get().get…ctionGoodApi::class.java)");
            collectionGoodApi = (CollectionGoodApi) create;
        }
        this.f36889b = collectionGoodApi;
    }

    public final /* synthetic */ Object c(Object obj) {
        a aVar = (a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f36888a, false, 28151, new Class[]{a.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{aVar}, this, f36888a, false, 28151, new Class[]{a.class}, a.class);
        }
        Intrinsics.checkParameterIsNotNull(aVar, "req");
        return aVar;
    }

    public final /* synthetic */ Observable b(Object obj) {
        a aVar = (a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f36888a, false, 28150, new Class[]{a.class}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{aVar}, this, f36888a, false, 28150, new Class[]{a.class}, Observable.class);
        }
        Intrinsics.checkParameterIsNotNull(aVar, "req");
        Observable subscribeOn = this.f36889b.queryCollectionGoodList(aVar.f36881b, aVar.f36882c).subscribeOn(Schedulers.io());
        Intrinsics.checkExpressionValueIsNotNull(subscribeOn, "service.queryCollectionG…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final /* synthetic */ Object a(Object obj, Object obj2) {
        a aVar = (a) obj;
        c cVar = (c) obj2;
        if (PatchProxy.isSupport(new Object[]{aVar, cVar}, this, f36888a, false, 28152, new Class[]{a.class, c.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{aVar, cVar}, this, f36888a, false, 28152, new Class[]{a.class, c.class}, List.class);
        }
        Intrinsics.checkParameterIsNotNull(aVar, "req");
        Intrinsics.checkParameterIsNotNull(cVar, "resp");
        return cVar.f36886b;
    }
}
