package com.ss.android.ugc.aweme.notification.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.api.RecommendApi;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/api/RecommendApi;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
final class FansRecommendModel$mRecommendApi$2 extends Lambda implements Function0<RecommendApi> {
    public static final FansRecommendModel$mRecommendApi$2 INSTANCE = new FansRecommendModel$mRecommendApi$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    FansRecommendModel$mRecommendApi$2() {
        super(0);
    }

    public final RecommendApi invoke() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63122, new Class[0], RecommendApi.class)) {
            return (RecommendApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(RecommendApi.class);
        }
        return (RecommendApi) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63122, new Class[0], RecommendApi.class);
    }
}
