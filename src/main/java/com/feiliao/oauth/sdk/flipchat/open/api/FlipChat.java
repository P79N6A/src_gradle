package com.feiliao.oauth.sdk.flipchat.open.api;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.CheckResult;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.api.call.d;
import com.bytedance.sdk.account.b.c.c;
import com.feiliao.oauth.sdk.a.a.b;
import com.feiliao.oauth.sdk.a.b.a;
import com.feiliao.oauth.sdk.flipchat.open.a.g;
import com.feiliao.oauth.sdk.flipchat.open.b.j;
import com.feiliao.oauth.sdk.flipchat.open.impl.a;
import com.feiliao.oauth.sdk.flipchat.open.impl.c;
import com.feiliao.oauth.sdk.flipchat.open.impl.e;
import com.feiliao.oauth.sdk.flipchat.open.impl.h;
import com.feiliao.oauth.sdk.flipchat.open.impl.i;
import com.feiliao.oauth.sdk.flipchat.open.impl.k;
import com.feiliao.oauth.sdk.flipchat.open.impl.m;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0001J\u0017\u0010\u0011\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fH\u0001J\u0011\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0001J\u0011\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019H\u0001J\t\u0010\u001a\u001a\u00020\u0014H\u0001J\u0011\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0001J\u0011\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0001J\u001f\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020!0 H\u0001J)\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020!0 2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0001J\u001f\u0010$\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020!0 H\u0001J)\u0010$\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020!0 2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0001J\u001f\u0010%\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020&0\u000fH\u0001J\u0019\u0010'\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010(\u001a\u00020)H\u0001J\u001f\u0010*\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020+0 H\u0001J)\u0010*\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020+0 2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0001J\u0017\u0010,\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020-0\u000fH\u0001J\u0019\u0010.\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\nH\u0001R\u0018\u0010\u0003\u001a\u00020\u0004X\u000f¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b¨\u00060"}, d2 = {"Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChat;", "Lcom/feiliao/oauth/sdk/flipchat/open/api/IFlipChat;", "()V", "depend", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatOpenDepend;", "getDepend", "()Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatOpenDepend;", "setDepend", "(Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatOpenDepend;)V", "isInit", "", "()Z", "canSilentBindPhone", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatRequestController;", "callback", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatApiCallback;", "Lcom/feiliao/oauth/sdk/flipchat/open/model/CanSilentBindPhoneResponse;", "canSilentRegister", "Lcom/feiliao/oauth/sdk/flipchat/open/model/CanSilentRegisterResponse;", "initConfig", "", "flipChatConfig", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatConfig;", "isAppInstall", "context", "Landroid/content/Context;", "notifyAccountInfoRefresh", "notifyLoginSuccess", "onGetAuthorizeCode", "resp", "Lcom/bytedance/sdk/account/common/model/SendAuth$Response;", "requestAuthBind", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatAuthCallback;", "Lcom/bytedance/sdk/account/api/call/UserApiResponse;", "ext", "Landroid/os/Bundle;", "requestAuthLogin", "requestAuthUnBind", "Lcom/bytedance/sdk/account/api/call/BaseApiResponse;", "requestSilentRegister", "call", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatSilentRegisterCallback;", "requestUpdateToken", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatUpdateResponse;", "silentBindMobile", "Lcom/feiliao/oauth/sdk/flipchat/open/model/SilentBindMobileResponse;", "tryPreloadH5AuthorizePage", "force", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
public final class FlipChat {
    public static final FlipChat INSTANCE = new FlipChat();
    private final /* synthetic */ h $$delegate_0 = h.f24350e;

    @NotNull
    public final FlipChatOpenDepend getDepend() {
        return h.b();
    }

    public final void setDepend(@NotNull FlipChatOpenDepend flipChatOpenDepend) {
        Intrinsics.checkParameterIsNotNull(flipChatOpenDepend, "<set-?>");
        h.a(flipChatOpenDepend);
    }

    public final boolean isInit() {
        return h.f24349d;
    }

    private FlipChat() {
    }

    public final void notifyAccountInfoRefresh() {
        try {
            FlipChatOpenDepend b2 = h.b();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("_param_api", "notifyAccountInfoRefresh");
            b2.appLog("_flipchat_open_", jSONObject);
        } catch (Exception unused) {
        }
    }

    public final void initConfig(@NotNull e eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "flipChatConfig");
        h hVar = this.$$delegate_0;
        Intrinsics.checkParameterIsNotNull(eVar, "flipChatConfig");
        h.a(eVar.f24291e);
        h.f24346a = eVar;
        h.f24349d = true;
    }

    public final boolean isAppInstall(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(context, "context");
        b a2 = a.a(context);
        Intrinsics.checkExpressionValueIsNotNull(a2, "api");
        return a2.a();
    }

    @NotNull
    public final FlipChatRequestController canSilentRegister(@NotNull FlipChatApiCallback<com.feiliao.oauth.sdk.flipchat.open.a.b> flipChatApiCallback) {
        Intrinsics.checkParameterIsNotNull(flipChatApiCallback, "callback");
        Intrinsics.checkParameterIsNotNull(flipChatApiCallback, "callback");
        FlipChatApiCallback cVar = new c(m.canSilentRegister, flipChatApiCallback);
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        return new k.a("canSilentRegister", i.f24352b.d().a(new k.g(cVar), new k.h(cVar)));
    }

    public final void notifyLoginSuccess(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(context, "context");
        try {
            FlipChatOpenDepend b2 = h.b();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("_param_api", "notifyLoginSuccess");
            b2.appLog("_flipchat_open_", jSONObject);
        } catch (Exception unused) {
        }
    }

    @NotNull
    public final FlipChatRequestController canSilentBindPhone(@NotNull FlipChatApiCallback<com.feiliao.oauth.sdk.flipchat.open.a.a> flipChatApiCallback) {
        Intrinsics.checkParameterIsNotNull(flipChatApiCallback, "callback");
        Intrinsics.checkParameterIsNotNull(flipChatApiCallback, "callback");
        FlipChatApiCallback cVar = new c(m.canSilentBindPhone, flipChatApiCallback);
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        return new k.a("canSilentBind", com.feiliao.oauth.sdk.flipchat.open.b.c.a(i.f24352b.a().canSilentBind("1394")).a(new k.e(cVar), new k.f(cVar)));
    }

    public final void onGetAuthorizeCode(@NotNull c.b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "resp");
        Intrinsics.checkParameterIsNotNull(bVar, "resp");
        for (g gVar : h.f24348c) {
            if (!bVar.isSuccess()) {
                gVar.a(bVar.errorCode, bVar.errorMsg);
            } else {
                String str = bVar.f22265a;
                Intrinsics.checkExpressionValueIsNotNull(str, "resp.authCode");
                gVar.a(str);
            }
        }
        try {
            FlipChatOpenDepend b2 = h.b();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("_param_api", "onGetAuthorizeCode");
            jSONObject.put("status", bVar.isSuccess());
            jSONObject.put("error_code", bVar.errorCode);
            b2.appLog("_flipchat_open_", jSONObject);
        } catch (Exception unused) {
        }
        h.f24348c.clear();
    }

    @NotNull
    public final FlipChatRequestController silentBindMobile(@NotNull FlipChatApiCallback<g> flipChatApiCallback) {
        Intrinsics.checkParameterIsNotNull(flipChatApiCallback, "callback");
        Intrinsics.checkParameterIsNotNull(flipChatApiCallback, "callback");
        FlipChatApiCallback cVar = new com.feiliao.oauth.sdk.flipchat.open.impl.c(m.silentBindMobile, flipChatApiCallback);
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        return new k.a("silentBindMobile", com.feiliao.oauth.sdk.flipchat.open.b.c.a(i.f24352b.a().silentBindMobile("1394")).a(new k.m(cVar), new k.n(cVar)));
    }

    @NotNull
    @Deprecated(message = "使用带扩展参数的版本")
    public final FlipChatRequestController requestUpdateToken(@NotNull Context context, @NotNull c<i> cVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        h hVar = this.$$delegate_0;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        return h.a(context, 3, cVar, null);
    }

    @NotNull
    @Deprecated(message = "使用带扩展参数的版本")
    public final FlipChatRequestController requestAuthBind(@NotNull Context context, @NotNull c<d> cVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        h hVar = this.$$delegate_0;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        return h.a(context, 2, new com.feiliao.oauth.sdk.flipchat.open.impl.d(m.requestAuthBind, cVar), null);
    }

    @NotNull
    @Deprecated(message = "使用带扩展参数的版本")
    public final FlipChatRequestController requestAuthLogin(@NotNull Context context, @NotNull c<d> cVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        h hVar = this.$$delegate_0;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        return h.a(context, 1, new com.feiliao.oauth.sdk.flipchat.open.impl.d(m.requestAuthLogin, cVar), null);
    }

    @NotNull
    public final FlipChatRequestController requestAuthUnBind(@NotNull Context context, @NotNull FlipChatApiCallback<BaseApiResponse> flipChatApiCallback) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(flipChatApiCallback, "callback");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(flipChatApiCallback, "callback");
        FlipChatApiCallback eVar = new e(m.requestAuthUnBind, flipChatApiCallback);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(eVar, "callback");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(context, "context");
        return new k.a("requestAuthUnBind", j.f24312a.a((Function1<? super com.feiliao.oauth.sdk.flipchat.open.b.g<R>, Unit>) new k.d<Object,Unit>(com.bytedance.sdk.account.d.d.b(context))).a(new k.i(eVar), new k.j(eVar)));
    }

    @NotNull
    public final FlipChatRequestController requestSilentRegister(@NotNull Context context, @NotNull h hVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(hVar, "call");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(hVar, "call");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(hVar, "call");
        Intrinsics.checkParameterIsNotNull(context, "context");
        return new k.a("requestSilentRegister", i.f24352b.c().a((Function1<? super T, ? extends j<R>>) k.o.INSTANCE).a((Function1<? super T, ? extends j<R>>) k.p.INSTANCE).a((Function1<? super T, ? extends j<R>>) new k.q<Object,Object>(context)).a(new k.C0276k(hVar), new k.l(hVar)));
    }

    @NotNull
    @CheckResult
    public final FlipChatRequestController tryPreloadH5AuthorizePage(@NotNull Context context, boolean z) {
        Long l;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (z) {
            return com.feiliao.oauth.sdk.flipchat.open.impl.a.l.a(context);
        }
        a.c cVar = com.feiliao.oauth.sdk.flipchat.open.impl.a.l;
        Intrinsics.checkParameterIsNotNull(context, "context");
        SharedPreferences a2 = com.ss.android.ugc.aweme.q.c.a(context, "flipchat_open_config", 0);
        if (a2 != null) {
            l = Long.valueOf(a2.getLong("finish_h5_auth", -1));
        } else {
            l = null;
        }
        if (l == null || l.longValue() <= 0) {
            return cVar.a(context);
        }
        return new j();
    }

    @NotNull
    public final FlipChatRequestController requestUpdateToken(@NotNull Context context, @NotNull c<i> cVar, @Nullable Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        h hVar = this.$$delegate_0;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        return h.a(context, 3, cVar, bundle);
    }

    @NotNull
    public final FlipChatRequestController requestAuthBind(@NotNull Context context, @NotNull c<d> cVar, @Nullable Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        h hVar = this.$$delegate_0;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        return h.a(context, 2, new com.feiliao.oauth.sdk.flipchat.open.impl.d(m.requestAuthBind, cVar), bundle);
    }

    @NotNull
    public final FlipChatRequestController requestAuthLogin(@NotNull Context context, @NotNull c<d> cVar, @Nullable Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        h hVar = this.$$delegate_0;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        return h.a(context, 1, new com.feiliao.oauth.sdk.flipchat.open.impl.d(m.requestAuthLogin, cVar), bundle);
    }
}
