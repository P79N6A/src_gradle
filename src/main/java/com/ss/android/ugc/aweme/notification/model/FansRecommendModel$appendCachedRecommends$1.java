package com.ss.android.ugc.aweme.notification.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/model/RecommendList;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 15})
final class FansRecommendModel$appendCachedRecommends$1<V> implements Callable<RecommendList> {
    public static ChangeQuickRedirect changeQuickRedirect;
    final /* synthetic */ FansRecommendModel this$0;

    FansRecommendModel$appendCachedRecommends$1(FansRecommendModel fansRecommendModel) {
        this.this$0 = fansRecommendModel;
    }

    public final RecommendList call() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63121, new Class[0], RecommendList.class)) {
            return (RecommendList) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63121, new Class[0], RecommendList.class);
        }
        try {
            RecommendList recommendList = (RecommendList) this.this$0.mData;
            recommendList.userList = this.this$0.cachedList;
            this.this$0.setCachedList(CollectionsKt.emptyList());
            return recommendList;
        } catch (ExecutionException e2) {
            RuntimeException a2 = m.a(e2);
            Intrinsics.checkExpressionValueIsNotNull(a2, "RetrofitFactory.getCompatibleException(e)");
            throw a2;
        }
    }
}
