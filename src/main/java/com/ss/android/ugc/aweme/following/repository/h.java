package com.ss.android.ugc.aweme.following.repository;

import com.bytedance.jedi.model.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.following.a.e;
import com.ss.android.ugc.aweme.profile.model.User;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0001B\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0014J \u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0005H\u0014J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\u0006\u0010\n\u001a\u00020\u0002H\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/following/repository/QueryFollowingListFetcher;", "Lcom/bytedance/jedi/model/fetcher/AbstractFetcher;", "Lcom/ss/android/ugc/aweme/following/repository/FollowRelationQueryParam;", "", "Lcom/ss/android/ugc/aweme/profile/model/User;", "Lcom/ss/android/ugc/aweme/following/model/FollowingItemList;", "()V", "service", "Lcom/ss/android/ugc/aweme/following/repository/FollowRelationApi;", "convertKeyActual", "req", "convertValActual", "resp", "requestActual", "Lio/reactivex/Observable;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class h extends a<c, List<? extends User>, c, e> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47942a;

    /* renamed from: b  reason: collision with root package name */
    private final FollowRelationApi f47943b = FollowRelationApi.f47913a.a();

    public final /* synthetic */ Observable b(Object obj) {
        c cVar = (c) obj;
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f47942a, false, 44835, new Class[]{c.class}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{cVar}, this, f47942a, false, 44835, new Class[]{c.class}, Observable.class);
        }
        Intrinsics.checkParameterIsNotNull(cVar, "req");
        Observable subscribeOn = this.f47943b.queryFollowingList(cVar.f47925b, cVar.f47926c, cVar.f47927d, cVar.f47928e, cVar.f47929f, cVar.g, cVar.h).subscribeOn(Schedulers.io());
        Intrinsics.checkExpressionValueIsNotNull(subscribeOn, "service.queryFollowingLi…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final /* synthetic */ Object c(Object obj) {
        c cVar = (c) obj;
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f47942a, false, 44836, new Class[]{c.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{cVar}, this, f47942a, false, 44836, new Class[]{c.class}, c.class);
        }
        Intrinsics.checkParameterIsNotNull(cVar, "req");
        return cVar;
    }

    public final /* synthetic */ Object a(Object obj, Object obj2) {
        c cVar = (c) obj;
        e eVar = (e) obj2;
        if (PatchProxy.isSupport(new Object[]{cVar, eVar}, this, f47942a, false, 44837, new Class[]{c.class, e.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{cVar, eVar}, this, f47942a, false, 44837, new Class[]{c.class, e.class}, List.class);
        }
        Intrinsics.checkParameterIsNotNull(cVar, "req");
        Intrinsics.checkParameterIsNotNull(eVar, "resp");
        return eVar.f47895a;
    }
}
