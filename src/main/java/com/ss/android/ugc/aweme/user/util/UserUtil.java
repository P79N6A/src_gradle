package com.ss.android.ugc.aweme.user.util;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Url;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.BindModel;

public final class UserUtil {

    /* renamed from: a  reason: collision with root package name */
    public static final UserApi f75401a = ((UserApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(UserApi.class));

    public interface UserApi {
        @GET
        Call<BindModel> doGet(@Url String str);
    }
}
