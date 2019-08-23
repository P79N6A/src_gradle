package com.ss.android.ugc.aweme.freeflowcard.freeflowmember;

import com.bytedance.common.utility.NetworkUtils;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.base.utils.s;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u000e\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/FreeFlowMemberApi;", "", "()V", "api", "Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/FreeFlowMemberApi$FlowApi;", "checkFlowStatus", "Lcom/google/common/util/concurrent/ListenableFuture;", "Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/FreeFlowResponse;", "mobileCode", "", "openidData", "pip", "getTelecomSign", "Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/TelecomSignResponse;", "content", "FlowApi", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FreeFlowMemberApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48640a;

    /* renamed from: b  reason: collision with root package name */
    static FlowApi f48641b;

    /* renamed from: c  reason: collision with root package name */
    public static final FreeFlowMemberApi f48642c = new FreeFlowMemberApi();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J@\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u0006H'J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\r\u001a\u00020\u0006H'¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/FreeFlowMemberApi$FlowApi;", "", "checkFlowStatus", "Lcom/google/common/util/concurrent/ListenableFuture;", "Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/FreeFlowResponse;", "carrier", "", "access", "mobileCode", "openidData", "pip", "getTelecomSign", "Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/TelecomSignResponse;", "content", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface FlowApi {
        @NotNull
        @GET(a = "/activity/carrier_flow/query_flow/")
        q<FreeFlowResponse> checkFlowStatus(@NotNull @Query(a = "carrier") String str, @NotNull @Query(a = "ac") String str2, @NotNull @Query(a = "user_pseudo_code") String str3, @NotNull @Query(a = "telecom_openid_data") String str4, @NotNull @Query(a = "unicom_pip") String str5);

        @NotNull
        @GET(a = "/activity/carrier_flow/telecom/get_sign/")
        q<TelecomSignResponse> getTelecomSign(@NotNull @Query(a = "content") String str);
    }

    private FreeFlowMemberApi() {
    }

    static {
        Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(FlowApi.class);
        Intrinsics.checkExpressionValueIsNotNull(create, "ServiceManager.get().get…eate(FlowApi::class.java)");
        f48641b = (FlowApi) create;
    }

    @NotNull
    public final q<FreeFlowResponse> a(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, this, f48640a, false, 46096, new Class[]{String.class, String.class, String.class}, q.class)) {
            return (q) PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, this, f48640a, false, 46096, new Class[]{String.class, String.class, String.class}, q.class);
        }
        Intrinsics.checkParameterIsNotNull(str4, "mobileCode");
        Intrinsics.checkParameterIsNotNull(str5, "openidData");
        Intrinsics.checkParameterIsNotNull(str6, "pip");
        String a2 = s.a(GlobalContext.getContext());
        String networkAccessType = NetworkUtils.getNetworkAccessType(GlobalContext.getContext());
        FlowApi flowApi = f48641b;
        Intrinsics.checkExpressionValueIsNotNull(a2, "carrier");
        Intrinsics.checkExpressionValueIsNotNull(networkAccessType, "access");
        return flowApi.checkFlowStatus(a2, networkAccessType, str, str2, str3);
    }
}
