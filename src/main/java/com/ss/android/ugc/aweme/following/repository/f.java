package com.ss.android.ugc.aweme.following.repository;

import com.bytedance.jedi.model.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0001B\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0014J \u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0005H\u0014J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\u0006\u0010\n\u001a\u00020\u0002H\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/following/repository/QueryConnectedListFetcher;", "Lcom/bytedance/jedi/model/fetcher/AbstractFetcher;", "Lcom/ss/android/ugc/aweme/following/repository/ConnectedRelationQueryParam;", "", "Lcom/ss/android/ugc/aweme/profile/model/User;", "Lcom/ss/android/ugc/aweme/following/model/ConnectedRelationList;", "()V", "service", "Lcom/ss/android/ugc/aweme/following/repository/FollowRelationApi;", "convertKeyActual", "req", "convertValActual", "resp", "requestActual", "Lio/reactivex/Observable;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f extends a<a, List<? extends User>, a, com.ss.android.ugc.aweme.following.a.a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47938a;

    /* renamed from: b  reason: collision with root package name */
    private final FollowRelationApi f47939b = FollowRelationApi.f47913a.a();

    public final /* synthetic */ Observable b(Object obj) {
        a aVar = (a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f47938a, false, 44829, new Class[]{a.class}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{aVar}, this, f47938a, false, 44829, new Class[]{a.class}, Observable.class);
        }
        Intrinsics.checkParameterIsNotNull(aVar, "req");
        return this.f47939b.queryConnectedList(aVar.f47917b, aVar.f47918c, aVar.f47919d);
    }

    public final /* synthetic */ Object c(Object obj) {
        a aVar = (a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f47938a, false, 44830, new Class[]{a.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{aVar}, this, f47938a, false, 44830, new Class[]{a.class}, a.class);
        }
        Intrinsics.checkParameterIsNotNull(aVar, "req");
        return aVar;
    }

    public final /* synthetic */ Object a(Object obj, Object obj2) {
        a aVar = (a) obj;
        com.ss.android.ugc.aweme.following.a.a aVar2 = (com.ss.android.ugc.aweme.following.a.a) obj2;
        if (PatchProxy.isSupport(new Object[]{aVar, aVar2}, this, f47938a, false, 44831, new Class[]{a.class, com.ss.android.ugc.aweme.following.a.a.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{aVar, aVar2}, this, f47938a, false, 44831, new Class[]{a.class, com.ss.android.ugc.aweme.following.a.a.class}, List.class);
        }
        Intrinsics.checkParameterIsNotNull(aVar, "req");
        Intrinsics.checkParameterIsNotNull(aVar2, "resp");
        if (aVar2.status_code == 0) {
            return aVar2.f47870b;
        }
        return null;
    }
}
