package com.feiliao.oauth.sdk.flipchat.open.impl;

import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.feiliao.oauth.sdk.flipchat.open.api.FlipChatApiCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0002\u0010\u0007J\u0015\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/feiliao/oauth/sdk/flipchat/open/impl/EventFlipChatPassportCallback;", "T", "Lcom/bytedance/sdk/account/api/call/BaseApiResponse;", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatApiCallback;", "type", "Lcom/feiliao/oauth/sdk/flipchat/open/impl/MonitorEvent;", "origin", "(Lcom/feiliao/oauth/sdk/flipchat/open/impl/MonitorEvent;Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatApiCallback;)V", "getOrigin", "()Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatApiCallback;", "getType", "()Lcom/feiliao/oauth/sdk/flipchat/open/impl/MonitorEvent;", "onError", "", "response", "(Lcom/bytedance/sdk/account/api/call/BaseApiResponse;)V", "onSuccess", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
public final class e<T extends BaseApiResponse> implements FlipChatApiCallback<T> {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final m f24339a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final FlipChatApiCallback<T> f24340b;

    public final /* synthetic */ void onError(Object obj) {
        BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
        Intrinsics.checkParameterIsNotNull(baseApiResponse, "response");
        this.f24340b.onError(baseApiResponse);
        j.a(baseApiResponse, this.f24339a);
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
        Intrinsics.checkParameterIsNotNull(baseApiResponse, "response");
        this.f24340b.onSuccess(baseApiResponse);
        j.a(baseApiResponse, this.f24339a);
    }

    public e(@NotNull m mVar, @NotNull FlipChatApiCallback<T> flipChatApiCallback) {
        Intrinsics.checkParameterIsNotNull(mVar, "type");
        Intrinsics.checkParameterIsNotNull(flipChatApiCallback, "origin");
        this.f24339a = mVar;
        this.f24340b = flipChatApiCallback;
    }
}