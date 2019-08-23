package com.feiliao.oauth.sdk.flipchat.open.impl;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.POST;
import com.feiliao.oauth.sdk.flipchat.open.a.a;
import com.feiliao.oauth.sdk.flipchat.open.a.b;
import com.feiliao.oauth.sdk.flipchat.open.a.e;
import com.feiliao.oauth.sdk.flipchat.open.a.f;
import com.feiliao.oauth.sdk.flipchat.open.a.g;
import com.feiliao.oauth.sdk.flipchat.open.a.h;
import com.feiliao.oauth.sdk.flipchat.open.a.i;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001JV\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0006H'J&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H'J\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u0006H'J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u0006H'J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003H'J\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u0006H'J&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0006H'J2\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00032\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0006H'¨\u0006\u001f"}, d2 = {"Lcom/feiliao/oauth/sdk/flipchat/open/impl/FlipChatOpenApi;", "", "authCode", "Lcom/bytedance/retrofit2/Call;", "Lcom/feiliao/oauth/sdk/flipchat/open/model/OpenCodeAuthResponse;", "client_key", "", "scope", "state", "response_type", "ticket", "redirect_uri", "authInfo", "Lcom/feiliao/oauth/sdk/flipchat/open/model/AuthInfoResponse;", "canSilentBind", "Lcom/feiliao/oauth/sdk/flipchat/open/model/CanSilentBindPhoneResponse;", "aid", "canSilentRegister", "Lcom/feiliao/oauth/sdk/flipchat/open/model/CanSilentRegisterResponse;", "getSilentToken", "Lcom/feiliao/oauth/sdk/flipchat/open/model/GetSilentTokenResponse;", "silentBindMobile", "Lcom/feiliao/oauth/sdk/flipchat/open/model/SilentBindMobileResponse;", "silentRegister", "Lcom/feiliao/oauth/sdk/flipchat/open/model/SilentRegisterResponse;", "tagAid", "updateAuthorize", "Lcom/feiliao/oauth/sdk/flipchat/open/model/UpdateAuthorizeResponse;", "platform", "platform_app_id", "code", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
public interface FlipChatOpenApi {
    @FormUrlEncoded
    @POST("/oauth/authorize/")
    @NotNull
    Call<f> authCode(@Field(a = "client_key") @Nullable String str, @Field(a = "scope") @Nullable String str2, @Field(a = "state") @Nullable String str3, @Field(a = "response_type") @Nullable String str4, @Field(a = "ticket") @Nullable String str5, @Field(a = "redirect_uri") @Nullable String str6);

    @FormUrlEncoded
    @POST("/oauth/auth_info/")
    @NotNull
    Call<Object> authInfo(@Field(a = "client_key") @Nullable String str, @Field(a = "scope") @Nullable String str2);

    @FormUrlEncoded
    @POST("/passport/user/can_silent_bind/")
    @NotNull
    Call<a> canSilentBind(@Field(a = "open_aid") @NotNull String str);

    @FormUrlEncoded
    @POST("/passport/user/can_silent_register/")
    @NotNull
    Call<b> canSilentRegister(@Field(a = "open_aid") @NotNull String str);

    @NotNull
    @POST("/passport/user/get_silent_token/")
    Call<e> getSilentToken();

    @FormUrlEncoded
    @POST("/passport/user/silent_bind_mobile/")
    @NotNull
    Call<g> silentBindMobile(@Field(a = "open_aid") @NotNull String str);

    @FormUrlEncoded
    @POST("/passport/user/silent_register/")
    @NotNull
    Call<h> silentRegister(@Field(a = "ticket") @Nullable String str, @Field(a = "tag_aid") @Nullable String str2);

    @FormUrlEncoded
    @POST("/passport/auth/update_authorize_info/")
    @NotNull
    Call<i> updateAuthorize(@Field(a = "platform") @Nullable String str, @Field(a = "platform_app_id") @Nullable String str2, @Field(a = "code") @Nullable String str3);
}
