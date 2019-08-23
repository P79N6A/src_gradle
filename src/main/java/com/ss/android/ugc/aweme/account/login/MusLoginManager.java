package com.ss.android.ugc.aweme.account.login;

import a.i;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.login.bean.CaptchaResult;
import com.ss.android.ugc.aweme.account.login.bean.ChangePasswordBean;
import com.ss.android.ugc.aweme.account.login.bean.EmailExistBean;
import com.ss.android.ugc.aweme.account.login.bean.EmailRegisterResult;
import com.ss.android.ugc.aweme.account.login.bean.SendCodeResult;
import com.ss.android.ugc.aweme.account.login.bean.SetPasswordResult;
import com.ss.android.ugc.aweme.account.login.bean.UserSettingBean;
import com.ss.android.ugc.aweme.account.login.bean.a;
import com.ss.android.ugc.aweme.account.net.ResetPwsResult;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.w;
import java.util.HashMap;
import java.util.Map;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public final class MusLoginManager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32033a;

    /* renamed from: b  reason: collision with root package name */
    private MusLoginApi f32034b = ((MusLoginApi) ((IRetrofitService) w.a(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(MusLoginApi.class));

    public interface MusLoginApi {
        @FormUrlEncoded
        @POST(a = "/passport/mobile/bind/v1/")
        q<String> bindMobile(@Field(a = "mobile") String str, @Field(a = "code") String str2, @Field(a = "mix_mode") String str3, @Field(a = "type") String str4);

        @FormUrlEncoded
        @POST(a = "/passport/password/update/")
        q<ChangePasswordBean> changePassword(@Field(a = "mix_mode") String str, @Field(a = "current_password") String str2, @Field(a = "password") String str3, @Field(a = "token") String str4);

        @FormUrlEncoded
        @POST(a = "/passport/user/check_email_registered")
        q<EmailRegisterResult> checkRegisteredEmail(@Field(a = "mix_mode") String str, @Field(a = "email") String str2);

        @GET(a = "/aweme/v1/passport/email-registered/")
        q<EmailExistBean> emailExist(@Query(a = "mix_mode") String str, @Query(a = "email") String str2);

        @GET(a = "/aweme/v1/user/settings/")
        q<UserSettingBean> getSettings();

        @FormUrlEncoded
        @POST(a = "/passport/user/login/")
        q<String> login(@Field(a = "mix_mode") String str, @Field(a = "username") String str2, @Field(a = "email") String str3, @Field(a = "mobile") String str4, @Field(a = "account") String str5, @Field(a = "password") String str6, @Field(a = "multi_login") String str7, @Field(a = "captcha") String str8);

        @FormUrlEncoded
        @POST(a = "/passport/user/login/")
        q<String> loginWithToken(@Field(a = "mix_mode") String str, @Field(a = "username") String str2, @Field(a = "email") String str3, @Field(a = "mobile") String str4, @Field(a = "account") String str5, @Field(a = "password") String str6, @Field(a = "multi_login") String str7, @Field(a = "captcha") String str8, @Field(a = "token") String str9);

        @GET(a = "/passport/mobile/refresh_captcha/")
        q<CaptchaResult> refreshCaptcha();

        @FormUrlEncoded
        @POST(a = "/aweme/v1/passport/reset-password-via-phone/")
        q<ResetPwsResult> resetPassword(@Field(a = "bind_token") String str, @Field(a = "uid") String str2, @Field(a = "new_pwd") String str3);

        @GET(a = "/passport/mobile/send_code/v1/")
        q<SendCodeResult> sendCode(@Query(a = "mix_mode") String str, @Query(a = "mobile") String str2, @Query(a = "captcha") String str3, @Query(a = "type") String str4, @Query(a = "unbind_exist") String str5, @Query(a = "oldmobile") String str6, @Query(a = "ticket") String str7, @Query(a = "auto_read") String str8);

        @GET(a = "/passport/mobile/send_code/v1/")
        q<SendCodeResult> sendCodeShark(@Query(a = "mix_mode") String str, @Query(a = "type") String str2, @Query(a = "shark_ticket") String str3, @Query(a = "auto_read") String str4);

        @FormUrlEncoded
        @POST(a = "/passport/account/set/")
        q<SetPasswordResult> setPassword(@Field(a = "mix_mode") String str, @Field(a = "password") String str2);

        @FormUrlEncoded
        @POST(a = "/aweme/v1/user/info/sync/")
        i<a> syncUserInfo(@FieldMap Map<String, String> map);

        @FormUrlEncoded
        @POST(a = "/passport/auth/authorize/")
        i<Object<Object>> thirdVerifySecurity(@Field(a = "access_token") String str, @Field(a = "access_token_secret") String str2, @Field(a = "code") String str3, @Field(a = "expire_in") String str4, @Field(a = "platform") String str5, @Field(a = "platform_app_id") String str6, @Field(a = "uid") String str7);

        @GET(a = "/aweme/v1/ftc/user/mode/")
        i<a> uploadUserMode(@Query(a = "user_mode") int i);

        @GET(a = "/aweme/v1/register/check/login/name/")
        q<String> usernameVerify(@Query(a = "login_name") String str);
    }

    public final i<a> a(HashMap<String, String> hashMap) {
        HashMap<String, String> hashMap2 = hashMap;
        if (!PatchProxy.isSupport(new Object[]{hashMap2}, this, f32033a, false, 20103, new Class[]{HashMap.class}, i.class)) {
            return this.f32034b.syncUserInfo(hashMap2);
        }
        return (i) PatchProxy.accessDispatch(new Object[]{hashMap2}, this, f32033a, false, 20103, new Class[]{HashMap.class}, i.class);
    }

    public final i<a> a(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f32033a, false, 20102, new Class[]{Integer.TYPE}, i.class)) {
            return this.f32034b.uploadUserMode(i);
        }
        return (i) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f32033a, false, 20102, new Class[]{Integer.TYPE}, i.class);
    }
}
