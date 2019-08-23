package com.feiliao.oauth.sdk.flipchat.open.impl;

import com.bytedance.ttnet.utils.RetrofitUtils;
import com.feiliao.oauth.sdk.flipchat.open.a.e;
import com.feiliao.oauth.sdk.flipchat.open.b.c;
import com.feiliao.oauth.sdk.flipchat.open.b.j;
import com.feiliao.oauth.sdk.flipchat.open.debug.FlipChatDebug;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\rJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\rJ\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\rJ\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\rJ\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\rJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0010R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006¨\u0006 "}, d2 = {"Lcom/feiliao/oauth/sdk/flipchat/open/impl/FlipChatModel;", "", "()V", "api", "Lcom/feiliao/oauth/sdk/flipchat/open/impl/FlipChatOpenApi;", "getApi", "()Lcom/feiliao/oauth/sdk/flipchat/open/impl/FlipChatOpenApi;", "api$delegate", "Lkotlin/Lazy;", "rapi", "getRapi", "rapi$delegate", "authCode", "Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteSingle;", "Lcom/feiliao/oauth/sdk/flipchat/open/model/OpenCodeAuthResponse;", "ticket", "", "authInfo", "Lcom/feiliao/oauth/sdk/flipchat/open/model/AuthInfoResponse;", "canSilentBind", "Lcom/feiliao/oauth/sdk/flipchat/open/model/CanSilentBindPhoneResponse;", "canSilentRegister", "Lcom/feiliao/oauth/sdk/flipchat/open/model/CanSilentRegisterResponse;", "getSilentToken", "Lcom/feiliao/oauth/sdk/flipchat/open/model/GetSilentTokenResponse;", "silentBindMobile", "Lcom/feiliao/oauth/sdk/flipchat/open/model/SilentBindMobileResponse;", "silentRegister", "Lcom/feiliao/oauth/sdk/flipchat/open/model/SilentRegisterResponse;", "updateAuthorize", "Lcom/feiliao/oauth/sdk/flipchat/open/model/UpdateAuthorizeResponse;", "code", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
public final class i {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f24351a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(i.class), "api", "getApi()Lcom/feiliao/oauth/sdk/flipchat/open/impl/FlipChatOpenApi;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(i.class), "rapi", "getRapi()Lcom/feiliao/oauth/sdk/flipchat/open/impl/FlipChatOpenApi;"))};

    /* renamed from: b  reason: collision with root package name */
    public static final i f24352b = new i();

    /* renamed from: c  reason: collision with root package name */
    private static final Lazy f24353c = LazyKt.lazy(a.INSTANCE);

    /* renamed from: d  reason: collision with root package name */
    private static final Lazy f24354d = LazyKt.lazy(b.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/feiliao/oauth/sdk/flipchat/open/impl/FlipChatOpenApi;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class a extends Lambda implements Function0<FlipChatOpenApi> {
        public static final a INSTANCE = new a();

        a() {
            super(0);
        }

        public final FlipChatOpenApi invoke() {
            FlipChatDebug.checkNotifyToDo();
            return (FlipChatOpenApi) RetrofitUtils.getSsRetrofit("https://" + h.a().f24290d + "/passport/").create(FlipChatOpenApi.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/feiliao/oauth/sdk/flipchat/open/impl/FlipChatOpenApi;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class b extends Lambda implements Function0<FlipChatOpenApi> {
        public static final b INSTANCE = new b();

        b() {
            super(0);
        }

        public final FlipChatOpenApi invoke() {
            FlipChatDebug.checkNotifyToDo();
            return (FlipChatOpenApi) RetrofitUtils.getSsRetrofit("https://api.feiliao.com/passport/").create(FlipChatOpenApi.class);
        }
    }

    public final FlipChatOpenApi a() {
        return (FlipChatOpenApi) f24353c.getValue();
    }

    /* access modifiers changed from: package-private */
    public final FlipChatOpenApi b() {
        return (FlipChatOpenApi) f24354d.getValue();
    }

    private i() {
    }

    @NotNull
    public final j<e> c() {
        return c.a(a().getSilentToken());
    }

    @NotNull
    public final j<com.feiliao.oauth.sdk.flipchat.open.a.b> d() {
        return c.a(a().canSilentRegister("1394"));
    }
}
