package com.ss.android.ugc.aweme.account.api;

import a.i;
import android.support.annotation.Nullable;
import com.google.common.util.concurrent.k;
import com.google.common.util.concurrent.l;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.account.model.c;
import com.ss.android.ugc.aweme.account.model.d;
import com.ss.android.ugc.aweme.account.util.g;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.g.a;
import com.ss.android.ugc.aweme.w;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public final class AccountApiInModule {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31674a;

    /* renamed from: b  reason: collision with root package name */
    public static Api f31675b = ((Api) ((IRetrofitService) w.a(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(Api.class));

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f31676c = a.a();

    public interface Api {
        @GET(a = "/passport/mobile/can_check_unusable/")
        q<c> canCheckPhoneNumberUnusable(@Query(a = "mix_mode") String str, @Query(a = "mobile") String str2);

        @FormUrlEncoded
        @POST(a = "/passport/mobile/change/v1/")
        q<String> changeMobile(@Field(a = "mix_mode") String str, @Field(a = "mobile") String str2, @Field(a = "code") String str3, @Field(a = "captcha") String str4, @Field(a = "ticket") String str5, @Field(a = "unusable_mobile_ticket") String str6);

        @GET(a = "/passport/mobile/check_unusable/")
        q<d> checkPhoneNumberUnusable(@Query(a = "mix_mode") String str, @Query(a = "mobile") String str2);

        @GET(a = "/passport/mobile/can_send_voice_code/")
        i<Object> checkVoiceCodeAvailability(@Query(a = "mobile") String str, @Query(a = "mix_mode") String str2);

        @GET(a = "https://rc.snssdk.com/verify/get_info")
        q<com.ss.android.ugc.aweme.account.api.a.a> getVerifyInfo(@Query(a = "uid") String str, @Query(a = "verify_type") String str2, @Query(a = "shark_ticket") String str3);

        @FormUrlEncoded
        @POST(a = "/passport/cancel/login/")
        i<String> loginDuringAccountRemoval(@Field(a = "token") String str);

        @FormUrlEncoded
        @POST(a = "/passport/mobile/send_code/v1/")
        q<String> sendCode(@Field(a = "mix_mode") String str, @Field(a = "type") String str2, @Field(a = "mobile") String str3, @Field(a = "auto_read") String str4, @Field(a = "ticket") String str5, @Field(a = "shark_ticket") String str6, @Field(a = "unusable_mobile_ticket") String str7);

        @FormUrlEncoded
        @POST(a = "/aweme/v1/user/proaccount/setting/")
        q<BaseResponse> switchProAccount(@Field(a = "action_type") int i, @Field(a = "category_name") String str);

        @FormUrlEncoded
        @POST(a = "https://rc.snssdk.com/verify/verify_info")
        q<String> verifyVerifyInfo(@Field(a = "uid") String str, @Field(a = "verify_type") String str2, @Field(a = "verify_data") String str3, @Field(a = "shark_ticket") String str4);
    }

    @Nullable
    public static i<String> a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f31674a, true, 19602, new Class[]{String.class}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{str2}, null, f31674a, true, 19602, new Class[]{String.class}, i.class);
        }
        try {
            return f31675b.loginDuringAccountRemoval(str2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(String str, String str2, k<com.ss.android.ugc.aweme.account.api.a.a> kVar) {
        String str3 = str;
        String str4 = str2;
        k<com.ss.android.ugc.aweme.account.api.a.a> kVar2 = kVar;
        if (PatchProxy.isSupport(new Object[]{str3, str4, kVar2}, null, f31674a, true, 19598, new Class[]{String.class, String.class, k.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, kVar2}, null, f31674a, true, 19598, new Class[]{String.class, String.class, k.class}, Void.TYPE);
            return;
        }
        l.a(f31675b.getVerifyInfo(str3, "id_number", str4), kVar2, com.ss.android.ugc.aweme.account.base.a.f31688b);
    }

    public static void a(String str, String str2, String str3, String str4, String str5, com.ss.android.ugc.aweme.account.api.b.a aVar) {
        com.ss.android.ugc.aweme.account.api.b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str, str2, str3, str4, str5, aVar2}, null, f31674a, true, 19596, new Class[]{String.class, String.class, String.class, String.class, String.class, com.ss.android.ugc.aweme.account.api.b.a.class}, Void.TYPE)) {
            Object[] objArr = {str, str2, str3, str4, str5, aVar2};
            PatchProxy.accessDispatch(objArr, null, f31674a, true, 19596, new Class[]{String.class, String.class, String.class, String.class, String.class, com.ss.android.ugc.aweme.account.api.b.a.class}, Void.TYPE);
            return;
        }
        l.a(f31675b.changeMobile(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, g.a(str2), g.a(str), str3, str4, str5), aVar2, com.ss.android.ugc.aweme.account.base.a.f31688b);
    }
}
