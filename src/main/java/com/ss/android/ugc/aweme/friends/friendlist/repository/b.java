package com.ss.android.ugc.aweme.friends.friendlist.repository;

import com.bytedance.jedi.model.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.friendlist.repository.QueryFriendListApi;
import com.ss.android.ugc.aweme.profile.model.User;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001B\u0005¢\u0006\u0002\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0002\u0010\fJ \u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0006H\u0014J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u000b\u001a\u00020\u0005H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/friendlist/repository/FriendListFetcher;", "Lcom/bytedance/jedi/model/fetcher/AbstractFetcher;", "", "", "Lcom/ss/android/ugc/aweme/profile/model/User;", "Lcom/ss/android/ugc/aweme/friends/friendlist/repository/FriendListRequestParams;", "Lcom/ss/android/ugc/aweme/story/shootvideo/friends/model/KnowFriendList;", "()V", "service", "Lcom/ss/android/ugc/aweme/friends/friendlist/repository/QueryFriendListApi;", "convertKeyActual", "req", "(Lcom/ss/android/ugc/aweme/friends/friendlist/repository/FriendListRequestParams;)Ljava/lang/Integer;", "convertValActual", "resp", "requestActual", "Lio/reactivex/Observable;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b extends a<Integer, List<? extends User>, d, com.ss.android.ugc.aweme.story.shootvideo.friends.a.a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48942a;

    /* renamed from: b  reason: collision with root package name */
    private final QueryFriendListApi f48943b;

    public b() {
        QueryFriendListApi queryFriendListApi;
        QueryFriendListApi.a aVar = QueryFriendListApi.f48939a;
        if (PatchProxy.isSupport(new Object[0], aVar, QueryFriendListApi.a.f48940a, false, 46562, new Class[0], QueryFriendListApi.class)) {
            queryFriendListApi = (QueryFriendListApi) PatchProxy.accessDispatch(new Object[0], aVar, QueryFriendListApi.a.f48940a, false, 46562, new Class[0], QueryFriendListApi.class);
        } else {
            Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(QueryFriendListApi.class);
            Intrinsics.checkExpressionValueIsNotNull(create, "ServiceManager.get().get…riendListApi::class.java)");
            queryFriendListApi = (QueryFriendListApi) create;
        }
        this.f48943b = queryFriendListApi;
    }

    public final /* synthetic */ Observable b(Object obj) {
        d dVar = (d) obj;
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f48942a, false, 46547, new Class[]{d.class}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{dVar}, this, f48942a, false, 46547, new Class[]{d.class}, Observable.class);
        }
        Intrinsics.checkParameterIsNotNull(dVar, "req");
        Observable subscribeOn = this.f48943b.getFriendList(dVar.f48949b, dVar.f48950c).subscribeOn(Schedulers.io());
        Intrinsics.checkExpressionValueIsNotNull(subscribeOn, "service.getFriendList(re…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final /* synthetic */ Object c(Object obj) {
        d dVar = (d) obj;
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f48942a, false, 46548, new Class[]{d.class}, Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[]{dVar}, this, f48942a, false, 46548, new Class[]{d.class}, Integer.class);
        }
        Intrinsics.checkParameterIsNotNull(dVar, "req");
        return Integer.valueOf(dVar.f48950c);
    }

    public final /* synthetic */ Object a(Object obj, Object obj2) {
        d dVar = (d) obj;
        com.ss.android.ugc.aweme.story.shootvideo.friends.a.a aVar = (com.ss.android.ugc.aweme.story.shootvideo.friends.a.a) obj2;
        if (PatchProxy.isSupport(new Object[]{dVar, aVar}, this, f48942a, false, 46549, new Class[]{d.class, com.ss.android.ugc.aweme.story.shootvideo.friends.a.a.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{dVar, aVar}, this, f48942a, false, 46549, new Class[]{d.class, com.ss.android.ugc.aweme.story.shootvideo.friends.a.a.class}, List.class);
        }
        Intrinsics.checkParameterIsNotNull(dVar, "req");
        Intrinsics.checkParameterIsNotNull(aVar, "resp");
        if (aVar.status_code == 0) {
            return aVar.a();
        }
        return null;
    }
}
