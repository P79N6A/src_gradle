package com.ss.android.ugc.aweme.user.repository;

import com.bytedance.jedi.model.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.CommitRemarkNameResponse;
import com.ss.android.ugc.aweme.user.repository.RemarkApi;
import com.ss.android.ugc.aweme.utils.dr;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0014J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0004H\u0014J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\t\u001a\u00020\u0003H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/user/repository/RemarkFetcher;", "Lcom/bytedance/jedi/model/fetcher/AbstractFetcher;", "", "Lcom/ss/android/ugc/aweme/user/repository/RemarkRequestParam;", "Lcom/ss/android/ugc/aweme/profile/model/CommitRemarkNameResponse;", "()V", "service", "Lcom/ss/android/ugc/aweme/user/repository/RemarkApi;", "convertKeyActual", "req", "convertValActual", "resp", "requestActual", "Lio/reactivex/Observable;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d extends a<String, String, e, CommitRemarkNameResponse> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75386a;

    /* renamed from: b  reason: collision with root package name */
    private final RemarkApi f75387b;

    public d() {
        RemarkApi remarkApi;
        RemarkApi.a aVar = RemarkApi.f75356a;
        if (PatchProxy.isSupport(new Object[0], aVar, RemarkApi.a.f75357a, false, 87668, new Class[0], RemarkApi.class)) {
            remarkApi = (RemarkApi) PatchProxy.accessDispatch(new Object[0], aVar, RemarkApi.a.f75357a, false, 87668, new Class[0], RemarkApi.class);
        } else {
            Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(RemarkApi.class);
            Intrinsics.checkExpressionValueIsNotNull(create, "ServiceManager.get().get…te(RemarkApi::class.java)");
            remarkApi = (RemarkApi) create;
        }
        this.f75387b = remarkApi;
    }

    public final /* synthetic */ Observable b(Object obj) {
        e eVar = (e) obj;
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f75386a, false, 87669, new Class[]{e.class}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{eVar}, this, f75386a, false, 87669, new Class[]{e.class}, Observable.class);
        }
        Intrinsics.checkParameterIsNotNull(eVar, "req");
        RemarkApi remarkApi = this.f75387b;
        String str = eVar.f75390c;
        String str2 = eVar.f75389b;
        String a2 = dr.a().a(eVar.f75389b);
        Intrinsics.checkExpressionValueIsNotNull(a2, "SecUidManager.get().get(req.userId)");
        Observable subscribeOn = remarkApi.commitRemarkName(str, str2, a2).subscribeOn(Schedulers.io());
        Intrinsics.checkExpressionValueIsNotNull(subscribeOn, "service.commitRemarkName…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final /* synthetic */ Object c(Object obj) {
        e eVar = (e) obj;
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f75386a, false, 87670, new Class[]{e.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{eVar}, this, f75386a, false, 87670, new Class[]{e.class}, String.class);
        }
        Intrinsics.checkParameterIsNotNull(eVar, "req");
        return eVar.f75389b;
    }

    public final /* synthetic */ Object a(Object obj, Object obj2) {
        e eVar = (e) obj;
        CommitRemarkNameResponse commitRemarkNameResponse = (CommitRemarkNameResponse) obj2;
        if (PatchProxy.isSupport(new Object[]{eVar, commitRemarkNameResponse}, this, f75386a, false, 87671, new Class[]{e.class, CommitRemarkNameResponse.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{eVar, commitRemarkNameResponse}, this, f75386a, false, 87671, new Class[]{e.class, CommitRemarkNameResponse.class}, String.class);
        }
        Intrinsics.checkParameterIsNotNull(eVar, "req");
        Intrinsics.checkParameterIsNotNull(commitRemarkNameResponse, "resp");
        if (commitRemarkNameResponse.statusCode == 0) {
            return commitRemarkNameResponse.remarkName;
        }
        return null;
    }
}
