package com.feiliao.oauth.sdk.flipchat.open.impl;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.sdk.account.api.call.d;
import com.feiliao.oauth.sdk.flipchat.open.api.FlipChatOpenDepend;
import com.feiliao.oauth.sdk.flipchat.open.api.FlipChatRequestController;
import com.feiliao.oauth.sdk.flipchat.open.api.c;
import com.feiliao.oauth.sdk.flipchat.open.api.e;
import com.feiliao.oauth.sdk.flipchat.open.api.g;
import com.feiliao.oauth.sdk.flipchat.open.b.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\tJ\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0004J\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0004J\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u001c2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0016\u0010$\u001a\u00020%2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020'0&H\u0016J\u0016\u0010(\u001a\u00020%2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020)0&H\u0016J\u0010\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u000bH\u0016J\u0010\u0010,\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010-\u001a\u00020\u0019H\u0016J\u0010\u0010.\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fH\u0017J\u0010\u0010/\u001a\u00020\u00192\u0006\u00100\u001a\u000201H\u0016J\u0015\u0010/\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u0004H\u0000¢\u0006\u0002\b2J\u000e\u00103\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\tJ\u001e\u00104\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001d05H\u0016J(\u00104\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001d052\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u001e\u00108\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001d05H\u0016J(\u00108\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001d052\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u001e\u00109\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020#0&H\u0016J0\u0010:\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020<2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020=052\b\u00106\u001a\u0004\u0018\u000107H\u0002J\u0018\u0010>\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010?\u001a\u00020@H\u0016J\u001e\u0010A\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020B05H\u0016J(\u0010A\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020B052\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u0016\u0010C\u001a\u00020%2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020D0&H\u0016J\u0016\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\u0018\u0010F\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010G\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006H"}, d2 = {"Lcom/feiliao/oauth/sdk/flipchat/open/impl/FlipChatImpl;", "Lcom/feiliao/oauth/sdk/flipchat/open/api/IFlipChat;", "()V", "SCOPE", "", "_IsInit", "", "callbackList", "", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatGetAuthCodeCallback;", "config", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatConfig;", "getConfig", "()Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatConfig;", "setConfig", "(Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatConfig;)V", "depend", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatOpenDepend;", "getDepend", "()Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatOpenDepend;", "setDepend", "(Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatOpenDepend;)V", "isInit", "()Z", "addCallback", "", "callback", "authBind", "Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteSingle;", "Lcom/bytedance/sdk/account/api/call/UserApiResponse;", "context", "Landroid/content/Context;", "code", "authLogin", "authUnbind", "Lcom/bytedance/sdk/account/api/call/BaseApiResponse;", "canSilentBindPhone", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatRequestController;", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatApiCallback;", "Lcom/feiliao/oauth/sdk/flipchat/open/model/CanSilentBindPhoneResponse;", "canSilentRegister", "Lcom/feiliao/oauth/sdk/flipchat/open/model/CanSilentRegisterResponse;", "initConfig", "flipChatConfig", "isAppInstall", "notifyAccountInfoRefresh", "notifyLoginSuccess", "onGetAuthorizeCode", "resp", "Lcom/bytedance/sdk/account/common/model/SendAuth$Response;", "onGetAuthorizeCode$flipchat_open_sdk_release", "removeCallback", "requestAuthBind", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatAuthCallback;", "ext", "Landroid/os/Bundle;", "requestAuthLogin", "requestAuthUnBind", "requestAuthorizeX", "type", "", "", "requestSilentRegister", "call", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatSilentRegisterCallback;", "requestUpdateToken", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatUpdateResponse;", "silentBindMobile", "Lcom/feiliao/oauth/sdk/flipchat/open/model/SilentBindMobileResponse;", "silentRegister", "tryPreloadH5AuthorizePage", "force", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
public final class h {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static e f24346a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public static FlipChatOpenDepend f24347b;

    /* renamed from: c  reason: collision with root package name */
    public static final List<g> f24348c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public static volatile boolean f24349d;

    /* renamed from: e  reason: collision with root package name */
    public static final h f24350e = new h();

    private h() {
    }

    @NotNull
    public static e a() {
        e eVar = f24346a;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
        }
        return eVar;
    }

    @NotNull
    public static FlipChatOpenDepend b() {
        FlipChatOpenDepend flipChatOpenDepend = f24347b;
        if (flipChatOpenDepend == null) {
            Intrinsics.throwUninitializedPropertyAccessException("depend");
        }
        return flipChatOpenDepend;
    }

    public static void a(@NotNull FlipChatOpenDepend flipChatOpenDepend) {
        Intrinsics.checkParameterIsNotNull(flipChatOpenDepend, "<set-?>");
        f24347b = flipChatOpenDepend;
    }

    public static void a(@NotNull g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        f24348c.add(gVar);
        try {
            FlipChatOpenDepend b2 = b();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("service", "addCallback");
            b2.alog("_flipchat_open_", jSONObject);
        } catch (Exception unused) {
        }
    }

    @NotNull
    public static j<d> a(@NotNull Context context, @NotNull String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "code");
        return k.a(context, str);
    }

    public static FlipChatRequestController a(Context context, int i, c<Object> cVar, Bundle bundle) {
        return k.a(context, i, cVar, bundle);
    }
}
