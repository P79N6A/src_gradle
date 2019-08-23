package com.feiliao.oauth.sdk.flipchat.open.impl;

import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.feiliao.oauth.sdk.flipchat.open.api.FlipChatOpenDepend;
import com.feiliao.oauth.sdk.flipchat.open.api.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0002\u0010\u0007J'\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/feiliao/oauth/sdk/flipchat/open/impl/EventFlipChatAuthCallback;", "T", "Lcom/bytedance/sdk/account/api/call/BaseApiResponse;", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatAuthCallback;", "type", "Lcom/feiliao/oauth/sdk/flipchat/open/impl/MonitorEvent;", "origin", "(Lcom/feiliao/oauth/sdk/flipchat/open/impl/MonitorEvent;Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatAuthCallback;)V", "getOrigin", "()Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatAuthCallback;", "getType", "()Lcom/feiliao/oauth/sdk/flipchat/open/impl/MonitorEvent;", "onAuthError", "", "errorCode", "", "errorMsg", "", "response", "(ILjava/lang/String;Lcom/bytedance/sdk/account/api/call/BaseApiResponse;)V", "onAuthResponse", "(Lcom/bytedance/sdk/account/api/call/BaseApiResponse;)V", "onFlipChatAuthorizeError", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
public final class d<T extends BaseApiResponse> implements c<T> {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final m f24337a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final c<T> f24338b;

    public final /* synthetic */ void a(Object obj) {
        BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
        Intrinsics.checkParameterIsNotNull(baseApiResponse, "response");
        this.f24338b.a(baseApiResponse);
        j.a(baseApiResponse, this.f24337a);
    }

    public d(@NotNull m mVar, @NotNull c<T> cVar) {
        Intrinsics.checkParameterIsNotNull(mVar, "type");
        Intrinsics.checkParameterIsNotNull(cVar, "origin");
        this.f24337a = mVar;
        this.f24338b = cVar;
    }

    public final void a(int i, @Nullable String str) {
        this.f24338b.a(i, str);
        String label = this.f24337a.getLabel();
        try {
            FlipChatOpenDepend b2 = h.b();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("_param_api", label);
            jSONObject.put("error_code", i);
            jSONObject.put("error_msg", str);
            b2.appLog("_flipchat_open_", jSONObject);
        } catch (Exception unused) {
        }
    }

    public final /* synthetic */ void a(int i, String str, Object obj) {
        BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
        Intrinsics.checkParameterIsNotNull(baseApiResponse, "response");
        this.f24338b.a(i, str, baseApiResponse);
        j.a(baseApiResponse, this.f24337a);
    }
}
