package com.ss.android.ugc.aweme.follow.api;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.newfollow.util.k;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/follow/api/FollowFeedListV2Api;", "", "()V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static IRetrofitService f47746a;

    /* renamed from: b  reason: collision with root package name */
    public static FollowFeedApiV2 f47747b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f47748c = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jª\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/follow/api/FollowFeedListV2Api$Companion;", "", "()V", "api", "Lcom/ss/android/ugc/aweme/follow/api/FollowFeedApiV2;", "retrofitService", "Lcom/ss/android/ugc/aweme/framework/services/IRetrofitService;", "getFollowFeedList", "Lcom/ss/android/ugc/aweme/follow/presenter/FollowFeedList;", "refreshCount", "", "cursor", "", "level", "count", "pullType", "feedStyle", "enterTime", "fetchRecommend", "impressionIds", "", "lastFeedIds", "awemeId", "aids", "pushParams", "isSyncContacts", "isRecommend", "addressBookAccess", "gpsAccess", "filterStrategy", "liveTagShowType", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47749a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @NotNull
        @SuppressLint({"TooManyMethodParam"})
        public final FollowFeedList a(int i, long j, int i2, int i3, int i4, int i5, long j2, int i6, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i7, int i8, int i9, int i10, int i11, int i12) {
            Long l;
            Long l2;
            Integer num;
            Integer num2;
            Integer num3;
            String str6;
            Long l3;
            long j3 = j;
            long j4 = j2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j3), Integer.valueOf(i2), 20, Integer.valueOf(i4), Integer.valueOf(i5), new Long(j4), Integer.valueOf(i6), str, str2, str3, str4, str5, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)}, this, f47749a, false, 44623, new Class[]{Integer.TYPE, Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Long.TYPE, Integer.TYPE, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, FollowFeedList.class)) {
                return (FollowFeedList) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j3), Integer.valueOf(i2), 20, Integer.valueOf(i4), Integer.valueOf(i5), new Long(j4), Integer.valueOf(i6), str, str2, str3, str4, str5, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)}, this, f47749a, false, 44623, new Class[]{Integer.TYPE, Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Long.TYPE, Integer.TYPE, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, FollowFeedList.class);
            }
            try {
                Long l4 = null;
                if (com.ss.android.g.a.a() || TextUtils.isEmpty(com.ss.android.ugc.aweme.follow.c.a.b())) {
                    str6 = null;
                    num3 = null;
                    num2 = null;
                    num = null;
                    l2 = null;
                    l = null;
                } else {
                    String b2 = com.ss.android.ugc.aweme.follow.c.a.b();
                    Integer valueOf = Integer.valueOf(com.ss.android.ugc.aweme.follow.c.a.a());
                    Integer valueOf2 = Integer.valueOf(com.ss.android.ugc.aweme.follow.c.a.i.b(2));
                    Integer valueOf3 = Integer.valueOf(com.ss.android.ugc.aweme.follow.c.a.i.b(1));
                    if (com.ss.android.ugc.aweme.follow.c.a.d() > 0) {
                        l3 = Long.valueOf(com.ss.android.ugc.aweme.follow.c.a.d());
                    } else {
                        l3 = null;
                    }
                    if (com.ss.android.ugc.aweme.follow.c.a.c() > 0) {
                        l4 = Long.valueOf(com.ss.android.ugc.aweme.follow.c.a.c());
                    }
                    str6 = b2;
                    l = l4;
                    num = valueOf;
                    num3 = valueOf2;
                    num2 = valueOf3;
                    l2 = l3;
                }
                FollowFeedApiV2 followFeedApiV2 = b.f47747b;
                k a2 = k.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "RecUserImpressionReporter.getInstance()");
                Object obj = followFeedApiV2.getFollowFeedList(i, j, i2, 20, i4, i5, j2, a2.b(), str3, str4, str5, str, str2, i10, com.ss.android.ugc.aweme.main.guide.b.f54809f.a().a(), i9, i11, str6, num3, num2, num, l2, l, Integer.valueOf(i12)).get();
                Intrinsics.checkExpressionValueIsNotNull(obj, "api.getFollowFeedList(re…d, liveTagShowType).get()");
                return (FollowFeedList) obj;
            } catch (ExecutionException e2) {
                RuntimeException propagateCompatibleException = b.f47746a.propagateCompatibleException(e2);
                Intrinsics.checkExpressionValueIsNotNull(propagateCompatibleException, "retrofitService.propagateCompatibleException(e)");
                throw propagateCompatibleException;
            }
        }
    }

    static {
        Object service = ServiceManager.get().getService(IRetrofitService.class);
        Intrinsics.checkExpressionValueIsNotNull(service, "ServiceManager.get().get…rofitService::class.java)");
        IRetrofitService iRetrofitService = (IRetrofitService) service;
        f47746a = iRetrofitService;
        Object create = iRetrofitService.createNewRetrofit("https://aweme.snssdk.com").create(FollowFeedApiV2.class);
        Intrinsics.checkExpressionValueIsNotNull(create, "retrofitService.createNe…lowFeedApiV2::class.java)");
        f47747b = (FollowFeedApiV2) create;
    }
}
