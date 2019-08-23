package com.ss.android.ugc.aweme.follow.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/follow/api/FollowFeedApiV1;", "", "()V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47741a;

    /* renamed from: b  reason: collision with root package name */
    public static IFollowFeedApiV1 f47742b;

    /* renamed from: c  reason: collision with root package name */
    public static final C0571a f47743c = new C0571a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private static IRetrofitService f47744d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J¢\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\rH\u0007Jt\u0010\u001e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\rH\u0007J<\u0010\u001f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/ugc/aweme/follow/api/FollowFeedApiV1$Companion;", "", "()V", "api", "Lcom/ss/android/ugc/aweme/follow/api/IFollowFeedApiV1;", "retrofitService", "Lcom/ss/android/ugc/aweme/framework/services/IRetrofitService;", "getFollowFeedList", "Lcom/ss/android/ugc/aweme/follow/presenter/FollowFeedList;", "maxCursor", "", "minCursor", "count", "", "pullType", "feedStyle", "enterTime", "fetchRecommend", "impressionIds", "", "lastFeedIds", "awemeId", "aids", "pushParams", "isSyncContacts", "isRecommend", "addressBookAccess", "gpsAccess", "filterStrategy", "liveTagShowType", "getFriendFeedList", "getRecommendCategoryList", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.follow.api.a$a  reason: collision with other inner class name */
    public static final class C0571a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47745a;

        private C0571a() {
        }

        public /* synthetic */ C0571a(byte b2) {
            this();
        }
    }

    static {
        Object service = ServiceManager.get().getService(IRetrofitService.class);
        Intrinsics.checkExpressionValueIsNotNull(service, "ServiceManager.get().get…rofitService::class.java)");
        IRetrofitService iRetrofitService = (IRetrofitService) service;
        f47744d = iRetrofitService;
        Object create = iRetrofitService.createNewRetrofit("https://aweme.snssdk.com").create(IFollowFeedApiV1.class);
        Intrinsics.checkExpressionValueIsNotNull(create, "retrofitService.createNe…lowFeedApiV1::class.java)");
        f47742b = (IFollowFeedApiV1) create;
    }
}
