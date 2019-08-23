package com.feiliao.oauth.sdk.flipchat.open.api;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\b\u001a\u00020\tH&J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u0012\u0010\u0010\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u0012\u0010\u0011\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0005H&J\b\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\u0016H&J\b\u0010\u0018\u001a\u00020\u0016H&J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0005H&J,\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007H&J\b\u0010 \u001a\u00020\u0003H&J\b\u0010!\u001a\u00020\u0003H&¨\u0006\""}, d2 = {"Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatOpenDepend;", "", "alog", "", "tag", "", "json", "Lorg/json/JSONObject;", "appContext", "Landroid/content/Context;", "appLog", "event", "goToAuhBind", "call", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatPageRequestCallback;", "goToAuthLogin", "goToAuthUpdate", "goToLogin", "goToUserProto", "context", "url", "isBindFlipChat", "", "isBindMobile", "isLogin", "mobileNum", "monitorStatusAndDuration", "serviceName", "status", "", "duration", "logExtr", "onSilentRegisterSuccess", "refreshUserInfo", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
public interface FlipChatOpenDepend {
    void alog(@NotNull String str, @Nullable JSONObject jSONObject);

    @NotNull
    Context appContext();

    void appLog(@NotNull String str, @Nullable JSONObject jSONObject);

    void goToAuhBind(@Nullable FlipChatPageRequestCallback flipChatPageRequestCallback);

    void goToAuthLogin(@Nullable FlipChatPageRequestCallback flipChatPageRequestCallback);

    void goToAuthUpdate(@Nullable FlipChatPageRequestCallback flipChatPageRequestCallback);

    void goToLogin(@Nullable FlipChatPageRequestCallback flipChatPageRequestCallback);

    void goToUserProto(@NotNull Context context, @NotNull String str);

    boolean isBindFlipChat();

    boolean isBindMobile();

    boolean isLogin();

    @Nullable
    String mobileNum();

    void monitorStatusAndDuration(@NotNull String str, int i, @Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2);

    void onSilentRegisterSuccess();

    void refreshUserInfo();
}
