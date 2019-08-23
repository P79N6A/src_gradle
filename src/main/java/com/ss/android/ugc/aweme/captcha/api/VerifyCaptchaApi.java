package com.ss.android.ugc.aweme.captcha.api;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.MaxLength;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.a;
import com.ss.android.ugc.aweme.base.api.b;
import com.ss.android.ugc.aweme.services.ApiMonitorService;
import org.json.JSONException;
import org.json.JSONObject;

public final class VerifyCaptchaApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35271a;

    public interface CaptchaApi {
        @FormUrlEncoded
        @POST("/ies/antispam/verification_code/verify_pic_code/")
        Call<String> getResult(@MaxLength int i, @Field(a = "verify_info") String str);
    }

    public interface FetchVerifyPictureApi {
        @GET("/ies/antispam/verification_code/get_pic_code/")
        Call<String> getResult(@MaxLength int i, @Query(a = "refresh") String str);
    }

    public static <T> T a(String str, String str2, Class<T> cls) throws JSONException {
        String str3;
        String str4;
        String str5 = str;
        String str6 = str2;
        Class<T> cls2 = cls;
        if (PatchProxy.isSupport(new Object[]{str5, str6, cls2}, null, f35271a, true, 25713, new Class[]{String.class, String.class, Class.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{str5, str6, cls2}, null, f35271a, true, 25713, new Class[]{String.class, String.class, Class.class}, Object.class);
        }
        JSONObject jSONObject = new JSONObject(str5);
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (a.a(jSONObject)) {
            return b.a(jSONObject2.toString(), cls2);
        }
        ApiMonitorService.Companion.getInstance().apiMonitor(str6, "", str5);
        com.ss.android.ugc.aweme.base.api.a.b.a aVar = new com.ss.android.ugc.aweme.base.api.a.b.a(jSONObject.optInt("status_code"));
        if (jSONObject2 != null) {
            str3 = jSONObject2.optString("message", "");
        } else {
            str3 = "";
        }
        com.ss.android.ugc.aweme.base.api.a.b.a errorMsg = aVar.setErrorMsg(str3).setErrorMsg(jSONObject.optString("status_msg", ""));
        if (jSONObject2 != null) {
            str4 = jSONObject2.optString("prompts", "");
        } else {
            str4 = "";
        }
        throw errorMsg.setPrompt(str4).setUrl(str6);
    }
}
