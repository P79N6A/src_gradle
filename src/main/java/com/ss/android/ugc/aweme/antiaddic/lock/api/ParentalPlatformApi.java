package com.ss.android.ugc.aweme.antiaddic.lock.api;

import android.text.TextUtils;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.antiaddic.lock.entity.a;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public final class ParentalPlatformApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33425a;

    /* renamed from: b  reason: collision with root package name */
    public static ParentalApi f33426b = ((ParentalApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(ParentalApi.class));

    public interface ParentalApi {
        @GET(a = " /aweme/v1/guardian/platform/dynamic/password/")
        q<a> getDynamicPassword(@Query(a = "user_id") String str);

        @FormUrlEncoded
        @POST(a = " /aweme/v1/guardian/platform/child/manage/")
        q<BaseResponse> modifyChildSetting(@FieldMap Map<String, String> map);

        @GET(a = "/aweme/v1/guardian/platform/verify/password/")
        q<BaseResponse> verifyPassword(@Query(a = "password") String str);
    }

    public static q<BaseResponse> a(String str, Map<String, String> map) {
        String str2 = str;
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{str2, map2}, null, f33425a, true, 21841, new Class[]{String.class, Map.class}, q.class)) {
            return (q) PatchProxy.accessDispatch(new Object[]{str2, map2}, null, f33425a, true, 21841, new Class[]{String.class, Map.class}, q.class);
        } else if (TextUtils.isEmpty(str) || map.isEmpty()) {
            return null;
        } else {
            map2.put("user_id", str2);
            return f33426b.modifyChildSetting(map2);
        }
    }
}
