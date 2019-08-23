package com.ss.android.ugc.aweme.setting.api;

import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.model.CommonResponse;
import com.ss.android.ugc.aweme.setting.model.RestrictInfo;
import com.ss.android.ugc.aweme.setting.model.RestrictInfoResponse;
import java.util.concurrent.ExecutionException;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public final class RestrictApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63839a;

    /* renamed from: b  reason: collision with root package name */
    static final IRetrofit f63840b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com");

    /* renamed from: c  reason: collision with root package name */
    private static IRetrofitService f63841c = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class));

    interface RealApi {
        @GET(a = "https://aweme.snssdk.com/aweme/v1/item/restrict/info/")
        q<RestrictInfoResponse> getRestrictInfo(@Query(a = "target_iid") String str);

        @FormUrlEncoded
        @POST(a = "https://aweme.snssdk.com/aweme/v1/item/restrict/")
        q<CommonResponse> restrictAweme(@Field(a = "target_iid") String str);

        @FormUrlEncoded
        @POST(a = "https://aweme.snssdk.com/aweme/v1/user/restrict/")
        q<CommonResponse> restrictUser(@Field(a = "target_uid") String str);
    }

    public static RestrictInfo a(String str) throws Exception {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f63839a, true, 72146, new Class[]{String.class}, RestrictInfo.class)) {
            return (RestrictInfo) PatchProxy.accessDispatch(new Object[]{str2}, null, f63839a, true, 72146, new Class[]{String.class}, RestrictInfo.class);
        }
        try {
            RestrictInfoResponse restrictInfoResponse = (RestrictInfoResponse) ((RealApi) f63840b.create(RealApi.class)).getRestrictInfo(str2).get();
            if (restrictInfoResponse != null) {
                restrictInfoResponse.mRestrictInfo.awemeId = str2;
            }
            if (restrictInfoResponse == null) {
                return null;
            }
            return restrictInfoResponse.mRestrictInfo;
        } catch (ExecutionException e2) {
            throw f63841c.propagateCompatibleException(e2);
        }
    }

    public static CommonResponse b(String str) throws Exception {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f63839a, true, 72147, new Class[]{String.class}, CommonResponse.class)) {
            return (CommonResponse) PatchProxy.accessDispatch(new Object[]{str2}, null, f63839a, true, 72147, new Class[]{String.class}, CommonResponse.class);
        }
        try {
            return (CommonResponse) ((RealApi) f63840b.create(RealApi.class)).restrictAweme(str2).get();
        } catch (ExecutionException e2) {
            throw f63841c.propagateCompatibleException(e2);
        }
    }

    public static CommonResponse c(String str) throws Exception {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f63839a, true, 72148, new Class[]{String.class}, CommonResponse.class)) {
            return (CommonResponse) PatchProxy.accessDispatch(new Object[]{str2}, null, f63839a, true, 72148, new Class[]{String.class}, CommonResponse.class);
        }
        try {
            return (CommonResponse) ((RealApi) f63840b.create(RealApi.class)).restrictUser(str2).get();
        } catch (ExecutionException e2) {
            throw f63841c.propagateCompatibleException(e2);
        }
    }
}
