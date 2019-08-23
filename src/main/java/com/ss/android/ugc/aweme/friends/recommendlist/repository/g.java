package com.ss.android.ugc.aweme.friends.recommendlist.repository;

import com.bytedance.jedi.model.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.discover.model.SearchUserList;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.recommendlist.repository.SearchUserApi;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001B\u0005¢\u0006\u0002\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0002\u0010\fJ \u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0006H\u0014J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u000b\u001a\u00020\u0005H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/repository/SearchUserFetcher;", "Lcom/bytedance/jedi/model/fetcher/AbstractFetcher;", "", "", "Lcom/ss/android/ugc/aweme/discover/model/SearchUser;", "Lcom/ss/android/ugc/aweme/friends/recommendlist/repository/SearchUserRequestParam;", "Lcom/ss/android/ugc/aweme/discover/model/SearchUserList;", "()V", "service", "Lcom/ss/android/ugc/aweme/friends/recommendlist/repository/SearchUserApi;", "convertKeyActual", "req", "(Lcom/ss/android/ugc/aweme/friends/recommendlist/repository/SearchUserRequestParam;)Ljava/lang/Long;", "convertValActual", "resp", "requestActual", "Lio/reactivex/Observable;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class g extends a<Long, List<? extends SearchUser>, i, SearchUserList> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49004a;

    /* renamed from: b  reason: collision with root package name */
    private final SearchUserApi f49005b;

    public g() {
        SearchUserApi searchUserApi;
        SearchUserApi.a aVar = SearchUserApi.f48984a;
        if (PatchProxy.isSupport(new Object[0], aVar, SearchUserApi.a.f48985a, false, 46776, new Class[0], SearchUserApi.class)) {
            searchUserApi = (SearchUserApi) PatchProxy.accessDispatch(new Object[0], aVar, SearchUserApi.a.f48985a, false, 46776, new Class[0], SearchUserApi.class);
        } else {
            Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(SearchUserApi.class);
            Intrinsics.checkExpressionValueIsNotNull(create, "ServiceManager.get().get…earchUserApi::class.java)");
            searchUserApi = (SearchUserApi) create;
        }
        this.f49005b = searchUserApi;
    }

    public final /* synthetic */ Observable b(Object obj) {
        i iVar = (i) obj;
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f49004a, false, 46777, new Class[]{i.class}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{iVar}, this, f49004a, false, 46777, new Class[]{i.class}, Observable.class);
        }
        Intrinsics.checkParameterIsNotNull(iVar, "req");
        Observable subscribeOn = this.f49005b.searchUserList(iVar.f49011b, iVar.f49012c, iVar.f49013d, iVar.f49014e, iVar.f49015f, iVar.g, iVar.h).subscribeOn(Schedulers.io());
        Intrinsics.checkExpressionValueIsNotNull(subscribeOn, "service.searchUserList(r…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final /* synthetic */ Object c(Object obj) {
        i iVar = (i) obj;
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f49004a, false, 46778, new Class[]{i.class}, Long.class)) {
            return (Long) PatchProxy.accessDispatch(new Object[]{iVar}, this, f49004a, false, 46778, new Class[]{i.class}, Long.class);
        }
        Intrinsics.checkParameterIsNotNull(iVar, "req");
        return Long.valueOf(iVar.f49011b);
    }

    public final /* synthetic */ Object a(Object obj, Object obj2) {
        i iVar = (i) obj;
        SearchUserList searchUserList = (SearchUserList) obj2;
        if (PatchProxy.isSupport(new Object[]{iVar, searchUserList}, this, f49004a, false, 46779, new Class[]{i.class, SearchUserList.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{iVar, searchUserList}, this, f49004a, false, 46779, new Class[]{i.class, SearchUserList.class}, List.class);
        }
        Intrinsics.checkParameterIsNotNull(iVar, "req");
        Intrinsics.checkParameterIsNotNull(searchUserList, "resp");
        if (searchUserList.status_code == 0) {
            return searchUserList.userList;
        }
        return null;
    }
}
