package com.ss.android.ugc.aweme.policy.notice.api;

import a.i;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/policy/notice/api/PolicyNoticeApi;", "", "()V", "API", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PolicyNoticeApi {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final API f61081a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f61082b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'J>\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\bH'¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/policy/notice/api/PolicyNoticeApi$API;", "", "getPolicyNotice", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/policy/notice/api/PolicyNoticeResponse;", "policyNoticeApprove", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "business", "", "policyVersion", "style", "extra", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface API {
        @NotNull
        @GET("/aweme/v1/policy/notice/")
        i<Object> getPolicyNotice();

        @NotNull
        @POST("/aweme/v1/policy/notice/approve/")
        i<BaseResponse> policyNoticeApprove(@Nullable @Query(a = "business") String str, @Nullable @Query(a = "policy_version") String str2, @Nullable @Query(a = "style") String str3, @Nullable @Query(a = "extra") String str4);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/policy/notice/api/PolicyNoticeApi$Companion;", "", "()V", "sApi", "Lcom/ss/android/ugc/aweme/policy/notice/api/PolicyNoticeApi$API;", "getSApi", "()Lcom/ss/android/ugc/aweme/policy/notice/api/PolicyNoticeApi$API;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(API.class);
        Intrinsics.checkExpressionValueIsNotNull(create, "ServiceManager.get().get…ate<API>(API::class.java)");
        f61081a = (API) create;
    }
}
