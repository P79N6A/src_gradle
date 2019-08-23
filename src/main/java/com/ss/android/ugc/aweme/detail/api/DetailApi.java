package com.ss.android.ugc.aweme.detail.api;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.a;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.React;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import org.json.JSONObject;

public final class DetailApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41156a;

    /* renamed from: b  reason: collision with root package name */
    public static final IDetailApi f41157b = ((IDetailApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(IDetailApi.class));

    public interface IDetailApi {
        @GET("/aweme/v1/aweme/react/info/")
        Call<React> fetchReactApi(@Query(a = "aweme_id") String str);

        @GET("/aweme/v1/aweme/detail/")
        Call<String> queryAweme(@Query(a = "aweme_id") String str, @Query(a = "origin_type") String str2);

        @FormUrlEncoded
        @POST("/aweme/v1/multi/aweme/detail/")
        Call<BatchDetailList> queryBatchAweme(@Field(a = "aweme_ids") String str, @Field(a = "origin_type") String str2, @Field(a = "push_params") String str3);
    }

    public static Aweme a(String str, String str2) throws Exception {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f41156a, true, 34725, new Class[]{String.class, String.class}, Aweme.class)) {
            return (Aweme) PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f41156a, true, 34725, new Class[]{String.class, String.class}, Aweme.class);
        }
        String str5 = (String) f41157b.queryAweme(str3, str4).execute().body();
        JSONObject jSONObject = new JSONObject(str5);
        a.a(jSONObject, str5, "https://aweme.snssdk.com/aweme/v1/aweme/detail/");
        return (Aweme) m.d().fromJson(jSONObject.optString("aweme_detail"), Aweme.class);
    }
}
