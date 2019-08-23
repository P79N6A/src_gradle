package com.feiliao.oauth.sdk.flipchat.open.api;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J'\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0002\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0002\u0010\fJ\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\u000e"}, d2 = {"Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatAuthCallback;", "T", "", "onAuthError", "", "errorCode", "", "errorMsg", "", "response", "(ILjava/lang/String;Ljava/lang/Object;)V", "onAuthResponse", "(Ljava/lang/Object;)V", "onFlipChatAuthorizeError", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
public interface c<T> {
    void a(int i, @Nullable String str);

    void a(int i, @Nullable String str, T t);

    void a(T t);
}
