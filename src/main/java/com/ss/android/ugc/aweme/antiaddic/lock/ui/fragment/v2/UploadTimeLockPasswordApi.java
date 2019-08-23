package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2;

import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public final class UploadTimeLockPasswordApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33600a;

    /* renamed from: b  reason: collision with root package name */
    public static UploadApi f33601b = ((UploadApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(UploadApi.class));

    interface UploadApi {
        @FormUrlEncoded
        @POST(a = "/aweme/v2/user/teenmode/")
        q<BaseResponse> upload(@Field(a = "password") String str, @Field(a = "user_id") String str2);
    }
}
