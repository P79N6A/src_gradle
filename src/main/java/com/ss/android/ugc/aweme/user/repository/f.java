package com.ss.android.ugc.aweme.user.repository;

import com.bytedance.jedi.model.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.api.FollowApi;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0014J\u001f\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/user/repository/RemoveFollowerFetcher;", "Lcom/bytedance/jedi/model/fetcher/AbstractFetcher;", "", "", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "()V", "convertKeyActual", "req", "convertValActual", "resp", "(Ljava/lang/String;Lcom/ss/android/ugc/aweme/base/api/BaseResponse;)Ljava/lang/Integer;", "requestActual", "Lio/reactivex/Observable;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f extends a<String, Integer, String, BaseResponse> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75391a;

    public final /* synthetic */ Observable b(Object obj) {
        String str = (String) obj;
        if (PatchProxy.isSupport(new Object[]{str}, this, f75391a, false, 87678, new Class[]{String.class}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{str}, this, f75391a, false, 87678, new Class[]{String.class}, Observable.class);
        }
        Intrinsics.checkParameterIsNotNull(str, "req");
        Observable<BaseResponse> a2 = FollowApi.a(str);
        Intrinsics.checkExpressionValueIsNotNull(a2, "com.ss.android.ugc.aweme…owApi.removeFollower(req)");
        return a2;
    }

    public final /* synthetic */ Object c(Object obj) {
        String str = (String) obj;
        if (PatchProxy.isSupport(new Object[]{str}, this, f75391a, false, 87676, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, this, f75391a, false, 87676, new Class[]{String.class}, String.class);
        }
        Intrinsics.checkParameterIsNotNull(str, "req");
        return str;
    }

    public final /* synthetic */ Object a(Object obj, Object obj2) {
        String str = (String) obj;
        BaseResponse baseResponse = (BaseResponse) obj2;
        if (PatchProxy.isSupport(new Object[]{str, baseResponse}, this, f75391a, false, 87677, new Class[]{String.class, BaseResponse.class}, Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[]{str, baseResponse}, this, f75391a, false, 87677, new Class[]{String.class, BaseResponse.class}, Integer.class);
        }
        Intrinsics.checkParameterIsNotNull(str, "req");
        Intrinsics.checkParameterIsNotNull(baseResponse, "resp");
        return Integer.valueOf(baseResponse.status_code);
    }
}
