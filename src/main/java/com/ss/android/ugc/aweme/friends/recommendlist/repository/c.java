package com.ss.android.ugc.aweme.friends.recommendlist.repository;

import com.bytedance.jedi.model.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.repository.l;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0001B\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0014J \u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0005H\u0014J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\u0006\u0010\n\u001a\u00020\u0002H\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/repository/RecommendListFetcher;", "Lcom/bytedance/jedi/model/fetcher/AbstractFetcher;", "Lcom/ss/android/ugc/aweme/friends/recommendlist/repository/RecommendListRequestParams;", "", "Lcom/ss/android/ugc/aweme/user/repository/UserWrapper;", "Lcom/ss/android/ugc/aweme/friends/model/RecommendList;", "()V", "service", "Lcom/ss/android/ugc/aweme/friends/recommendlist/repository/RecommendApi;", "convertKeyActual", "req", "convertValActual", "resp", "requestActual", "Lio/reactivex/Observable;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c extends a<e, List<? extends l>, e, RecommendList> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48991a;

    /* renamed from: b  reason: collision with root package name */
    private final RecommendApi f48992b = RecommendApi.f48981a.a();

    public final /* synthetic */ Observable b(Object obj) {
        e eVar = (e) obj;
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f48991a, false, 46750, new Class[]{e.class}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{eVar}, this, f48991a, false, 46750, new Class[]{e.class}, Observable.class);
        }
        Intrinsics.checkParameterIsNotNull(eVar, "req");
        Observable subscribeOn = this.f48992b.recommendList(eVar.f48999b, eVar.f49000c, eVar.f49001d, eVar.f49002e, eVar.f49003f, eVar.g, eVar.h, eVar.i, eVar.j).subscribeOn(Schedulers.io());
        Intrinsics.checkExpressionValueIsNotNull(subscribeOn, "service.recommendList(re…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final /* synthetic */ Object c(Object obj) {
        e eVar = (e) obj;
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f48991a, false, 46751, new Class[]{e.class}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{eVar}, this, f48991a, false, 46751, new Class[]{e.class}, e.class);
        }
        Intrinsics.checkParameterIsNotNull(eVar, "req");
        return eVar;
    }

    public final /* synthetic */ Object a(Object obj, Object obj2) {
        e eVar = (e) obj;
        RecommendList recommendList = (RecommendList) obj2;
        if (PatchProxy.isSupport(new Object[]{eVar, recommendList}, this, f48991a, false, 46752, new Class[]{e.class, RecommendList.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{eVar, recommendList}, this, f48991a, false, 46752, new Class[]{e.class, RecommendList.class}, List.class);
        }
        Intrinsics.checkParameterIsNotNull(eVar, "req");
        Intrinsics.checkParameterIsNotNull(recommendList, "resp");
        List list = null;
        if (recommendList.status_code == 0) {
            List<User> userList = recommendList.getUserList();
            if (userList == null) {
                return null;
            }
            list = new ArrayList();
            for (User user : userList) {
                Intrinsics.checkExpressionValueIsNotNull(user, AdvanceSetting.NETWORK_TYPE);
                user.setRequestId(recommendList.rid);
                String str = recommendList.rid;
                Intrinsics.checkExpressionValueIsNotNull(str, "resp.rid");
                list.add(new l(user, str, 0, 4));
            }
        }
        return list;
    }
}
