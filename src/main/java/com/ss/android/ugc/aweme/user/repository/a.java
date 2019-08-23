package com.ss.android.ugc.aweme.user.repository;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.user.repository.FollowApi;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001B\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0004H\u0014J\u001f\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0005H\u0014¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\u0006\u0010\f\u001a\u00020\u0004H\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/user/repository/FollowFetcher;", "Lcom/bytedance/jedi/model/fetcher/AbstractFetcher;", "", "", "Lcom/ss/android/ugc/aweme/user/repository/FollowRequestParam;", "Lcom/ss/android/ugc/aweme/profile/model/FollowStatus;", "()V", "service", "Lcom/ss/android/ugc/aweme/user/repository/FollowApi;", "getService", "()Lcom/ss/android/ugc/aweme/user/repository/FollowApi;", "convertKeyActual", "req", "convertValActual", "resp", "(Lcom/ss/android/ugc/aweme/user/repository/FollowRequestParam;Lcom/ss/android/ugc/aweme/profile/model/FollowStatus;)Ljava/lang/Integer;", "requestActual", "Lio/reactivex/Observable;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a extends com.bytedance.jedi.model.d.a<String, Integer, b, FollowStatus> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75362a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final FollowApi f75363b;

    public a() {
        FollowApi followApi;
        FollowApi.a aVar = FollowApi.f75353a;
        if (PatchProxy.isSupport(new Object[0], aVar, FollowApi.a.f75354a, false, 87653, new Class[0], FollowApi.class)) {
            followApi = (FollowApi) PatchProxy.accessDispatch(new Object[0], aVar, FollowApi.a.f75354a, false, 87653, new Class[0], FollowApi.class);
        } else {
            Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(FollowApi.class);
            Intrinsics.checkExpressionValueIsNotNull(create, "ServiceManager.get().get…te(FollowApi::class.java)");
            followApi = (FollowApi) create;
        }
        this.f75363b = followApi;
    }

    public final /* synthetic */ Object c(Object obj) {
        b bVar = (b) obj;
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f75362a, false, 87655, new Class[]{b.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{bVar}, this, f75362a, false, 87655, new Class[]{b.class}, String.class);
        }
        Intrinsics.checkParameterIsNotNull(bVar, "req");
        return bVar.f75365b;
    }

    public final /* synthetic */ Observable b(Object obj) {
        b bVar = (b) obj;
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f75362a, false, 87654, new Class[]{b.class}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{bVar}, this, f75362a, false, 87654, new Class[]{b.class}, Observable.class);
        }
        Intrinsics.checkParameterIsNotNull(bVar, "req");
        if (bVar.f75369f == -1) {
            Observable subscribeOn = this.f75363b.follow(bVar.f75365b, bVar.f75366c, bVar.f75367d, bVar.f75368e, null, bVar.g, null).subscribeOn(Schedulers.io());
            Intrinsics.checkExpressionValueIsNotNull(subscribeOn, "service.follow(req.userI…scribeOn(Schedulers.io())");
            return subscribeOn;
        }
        Observable subscribeOn2 = this.f75363b.follow(bVar.f75365b, bVar.f75366c, bVar.f75367d, bVar.f75368e, Integer.valueOf(bVar.f75369f), bVar.g, Integer.valueOf(bVar.h)).subscribeOn(Schedulers.io());
        Intrinsics.checkExpressionValueIsNotNull(subscribeOn2, "service.follow(req.userI…scribeOn(Schedulers.io())");
        return subscribeOn2;
    }

    public final /* synthetic */ Object a(Object obj, Object obj2) {
        b bVar = (b) obj;
        FollowStatus followStatus = (FollowStatus) obj2;
        if (PatchProxy.isSupport(new Object[]{bVar, followStatus}, this, f75362a, false, 87656, new Class[]{b.class, FollowStatus.class}, Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[]{bVar, followStatus}, this, f75362a, false, 87656, new Class[]{b.class, FollowStatus.class}, Integer.class);
        }
        Intrinsics.checkParameterIsNotNull(bVar, "req");
        Intrinsics.checkParameterIsNotNull(followStatus, "resp");
        if (followStatus.status_code == 0) {
            return Integer.valueOf(followStatus.followStatus);
        }
        return null;
    }
}
