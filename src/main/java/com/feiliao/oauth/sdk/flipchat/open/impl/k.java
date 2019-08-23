package com.feiliao.oauth.sdk.flipchat.open.impl;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.feiliao.oauth.sdk.flipchat.open.a.e;
import com.feiliao.oauth.sdk.flipchat.open.a.f;
import com.feiliao.oauth.sdk.flipchat.open.a.h;
import com.feiliao.oauth.sdk.flipchat.open.api.FlipChatApiCallback;
import com.feiliao.oauth.sdk.flipchat.open.api.FlipChatOpenDepend;
import com.feiliao.oauth.sdk.flipchat.open.api.FlipChatRequestController;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001#B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0007J\u0016\u0010\u0012\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010H\u0007J\u001e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0010H\u0007J0\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J\u0018\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\u0016\u0010\u001e\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0010H\u0007J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¨\u0006$"}, d2 = {"Lcom/feiliao/oauth/sdk/flipchat/open/impl/FlipChatPresenter;", "", "()V", "authBind", "Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteSingle;", "Lcom/bytedance/sdk/account/api/call/UserApiResponse;", "context", "Landroid/content/Context;", "code", "", "authLogin", "authUnbind", "Lcom/bytedance/sdk/account/api/call/BaseApiResponse;", "canSilentBind", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatRequestController;", "callback", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatApiCallback;", "Lcom/feiliao/oauth/sdk/flipchat/open/model/CanSilentBindPhoneResponse;", "canSilentRegister", "Lcom/feiliao/oauth/sdk/flipchat/open/model/CanSilentRegisterResponse;", "requestAuthUnBind", "requestAuthorizeX", "type", "", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatAuthCallback;", "extra", "Landroid/os/Bundle;", "requestSilentRegister", "call", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatSilentRegisterCallback;", "silentBindMobile", "Lcom/feiliao/oauth/sdk/flipchat/open/model/SilentBindMobileResponse;", "silentRegister", "updateAuthorize", "Lcom/feiliao/oauth/sdk/flipchat/open/model/UpdateAuthorizeResponse;", "DisposeFlipChatRequestController", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f24355a = new k();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/feiliao/oauth/sdk/flipchat/open/impl/FlipChatPresenter$DisposeFlipChatRequestController;", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatRequestController;", "type", "", "dispose", "Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteDisposable;", "(Ljava/lang/String;Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteDisposable;)V", "getDispose", "()Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteDisposable;", "getType", "()Ljava/lang/String;", "completeRequest", "", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
    public static final class a implements FlipChatRequestController {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        public final String f24356a;
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public final com.feiliao.oauth.sdk.flipchat.open.b.f f24357b;

        public final void completeRequest() {
            this.f24357b.a();
            try {
                FlipChatOpenDepend b2 = h.b();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("_param_api", "completeRequest");
                jSONObject.put("type", this.f24356a);
                b2.appLog("_flipchat_open_", jSONObject);
            } catch (Exception unused) {
            }
        }

        public a(@NotNull String str, @NotNull com.feiliao.oauth.sdk.flipchat.open.b.f fVar) {
            Intrinsics.checkParameterIsNotNull(str, "type");
            Intrinsics.checkParameterIsNotNull(fVar, "dispose");
            this.f24356a = str;
            this.f24357b = fVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "emitter", "Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteEmitter;", "Lcom/bytedance/sdk/account/api/call/UserApiResponse;", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class b extends Lambda implements Function1<com.feiliao.oauth.sdk.flipchat.open.b.g<com.bytedance.sdk.account.api.call.d>, Unit> {
        final /* synthetic */ com.bytedance.sdk.account.api.f $api;
        final /* synthetic */ String $code;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(com.bytedance.sdk.account.api.f fVar, String str) {
            super(1);
            this.$api = fVar;
            this.$code = str;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.feiliao.oauth.sdk.flipchat.open.b.g) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull final com.feiliao.oauth.sdk.flipchat.open.b.g<com.bytedance.sdk.account.api.call.d> gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "emitter");
            this.$api.a(h.a().f24289c, "flipchat", this.$code, 0, (Map) null, (com.ss.android.account.d) new com.ss.android.account.d() {
                public final void a(@NotNull com.bytedance.sdk.account.api.call.d dVar) {
                    Intrinsics.checkParameterIsNotNull(dVar, "response");
                    gVar.a(dVar);
                }

                public final void b(@NotNull com.bytedance.sdk.account.api.call.d dVar) {
                    Intrinsics.checkParameterIsNotNull(dVar, "response");
                    gVar.a(dVar);
                }

                public final void a(@NotNull com.bytedance.sdk.account.api.call.d dVar, @Nullable String str, @Nullable String str2, @Nullable String str3) {
                    Intrinsics.checkParameterIsNotNull(dVar, "response");
                    gVar.a(dVar);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "emitter", "Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteEmitter;", "Lcom/bytedance/sdk/account/api/call/UserApiResponse;", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class c extends Lambda implements Function1<com.feiliao.oauth.sdk.flipchat.open.b.g<com.bytedance.sdk.account.api.call.d>, Unit> {
        final /* synthetic */ com.bytedance.sdk.account.api.f $api;
        final /* synthetic */ String $code;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(com.bytedance.sdk.account.api.f fVar, String str) {
            super(1);
            this.$api = fVar;
            this.$code = str;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.feiliao.oauth.sdk.flipchat.open.b.g) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull final com.feiliao.oauth.sdk.flipchat.open.b.g<com.bytedance.sdk.account.api.call.d> gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "emitter");
            this.$api.a(h.a().f24289c, "flipchat", this.$code, 0, (Map) null, (com.bytedance.sdk.account.api.call.a<com.bytedance.sdk.account.api.call.d>) new com.bytedance.sdk.account.api.call.a<com.bytedance.sdk.account.api.call.d>() {
                public final /* synthetic */ void a(BaseApiResponse baseApiResponse) {
                    com.bytedance.sdk.account.api.call.d dVar = (com.bytedance.sdk.account.api.call.d) baseApiResponse;
                    Intrinsics.checkParameterIsNotNull(dVar, "response");
                    gVar.a(dVar);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "emitter", "Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteEmitter;", "Lcom/bytedance/sdk/account/api/call/BaseApiResponse;", "invoke"}, k = 3, mv = {1, 1, 13})
    public static final class d extends Lambda implements Function1<com.feiliao.oauth.sdk.flipchat.open.b.g<BaseApiResponse>, Unit> {
        final /* synthetic */ com.bytedance.sdk.account.api.f $api;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(com.bytedance.sdk.account.api.f fVar) {
            super(1);
            this.$api = fVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.feiliao.oauth.sdk.flipchat.open.b.g) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull final com.feiliao.oauth.sdk.flipchat.open.b.g<BaseApiResponse> gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "emitter");
            this.$api.a("flipchat", (com.bytedance.sdk.account.api.call.a<BaseApiResponse>) new com.bytedance.sdk.account.api.call.a<BaseApiResponse>() {
                public final void a(@NotNull BaseApiResponse baseApiResponse) {
                    Intrinsics.checkParameterIsNotNull(baseApiResponse, "response");
                    gVar.a(baseApiResponse);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/feiliao/oauth/sdk/flipchat/open/model/CanSilentBindPhoneResponse;", "invoke"}, k = 3, mv = {1, 1, 13})
    public static final class e extends Lambda implements Function1<com.feiliao.oauth.sdk.flipchat.open.a.a, Unit> {
        final /* synthetic */ FlipChatApiCallback $callback;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(FlipChatApiCallback flipChatApiCallback) {
            super(1);
            this.$callback = flipChatApiCallback;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.feiliao.oauth.sdk.flipchat.open.a.a) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.feiliao.oauth.sdk.flipchat.open.a.a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, AdvanceSetting.NETWORK_TYPE);
            if (aVar.d()) {
                this.$callback.onSuccess(aVar);
            } else {
                this.$callback.onError(aVar);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 13})
    public static final class f extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ FlipChatApiCallback $callback;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(FlipChatApiCallback flipChatApiCallback) {
            super(1);
            this.$callback = flipChatApiCallback;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, AdvanceSetting.NETWORK_TYPE);
            FlipChatApiCallback flipChatApiCallback = this.$callback;
            Intrinsics.checkParameterIsNotNull(th, "exception");
            com.feiliao.oauth.sdk.flipchat.open.a.a b2 = com.feiliao.oauth.sdk.flipchat.open.a.a.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "CanSilentBindPhoneResponse.createError()");
            flipChatApiCallback.onError(b2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/feiliao/oauth/sdk/flipchat/open/model/CanSilentRegisterResponse;", "invoke"}, k = 3, mv = {1, 1, 13})
    public static final class g extends Lambda implements Function1<com.feiliao.oauth.sdk.flipchat.open.a.b, Unit> {
        final /* synthetic */ FlipChatApiCallback $callback;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(FlipChatApiCallback flipChatApiCallback) {
            super(1);
            this.$callback = flipChatApiCallback;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.feiliao.oauth.sdk.flipchat.open.a.b) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.feiliao.oauth.sdk.flipchat.open.a.b bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, AdvanceSetting.NETWORK_TYPE);
            if (bVar.d()) {
                this.$callback.onSuccess(bVar);
            } else {
                this.$callback.onError(bVar);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 13})
    public static final class h extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ FlipChatApiCallback $callback;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(FlipChatApiCallback flipChatApiCallback) {
            super(1);
            this.$callback = flipChatApiCallback;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, AdvanceSetting.NETWORK_TYPE);
            FlipChatApiCallback flipChatApiCallback = this.$callback;
            Intrinsics.checkParameterIsNotNull(th, "exception");
            com.feiliao.oauth.sdk.flipchat.open.a.b c2 = com.feiliao.oauth.sdk.flipchat.open.a.b.c();
            Intrinsics.checkExpressionValueIsNotNull(c2, "CanSilentRegisterResponse.createError()");
            flipChatApiCallback.onError(c2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/sdk/account/api/call/BaseApiResponse;", "invoke"}, k = 3, mv = {1, 1, 13})
    public static final class i extends Lambda implements Function1<BaseApiResponse, Unit> {
        final /* synthetic */ FlipChatApiCallback $callback;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(FlipChatApiCallback flipChatApiCallback) {
            super(1);
            this.$callback = flipChatApiCallback;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BaseApiResponse) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull BaseApiResponse baseApiResponse) {
            Intrinsics.checkParameterIsNotNull(baseApiResponse, AdvanceSetting.NETWORK_TYPE);
            if (baseApiResponse.success) {
                this.$callback.onSuccess(baseApiResponse);
            } else {
                this.$callback.onError(baseApiResponse);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 13})
    public static final class j extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ FlipChatApiCallback $callback;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(FlipChatApiCallback flipChatApiCallback) {
            super(1);
            this.$callback = flipChatApiCallback;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, AdvanceSetting.NETWORK_TYPE);
            FlipChatApiCallback flipChatApiCallback = this.$callback;
            Intrinsics.checkParameterIsNotNull(th, "exception");
            com.bytedance.sdk.account.api.call.d dVar = new com.bytedance.sdk.account.api.call.d(false, 2);
            dVar.error = -18;
            flipChatApiCallback.onError(dVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/sdk/account/api/call/UserApiResponse;", "invoke"}, k = 3, mv = {1, 1, 13})
    /* renamed from: com.feiliao.oauth.sdk.flipchat.open.impl.k$k  reason: collision with other inner class name */
    public static final class C0276k extends Lambda implements Function1<com.bytedance.sdk.account.api.call.d, Unit> {
        final /* synthetic */ com.feiliao.oauth.sdk.flipchat.open.api.h $call;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0276k(com.feiliao.oauth.sdk.flipchat.open.api.h hVar) {
            super(1);
            this.$call = hVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.bytedance.sdk.account.api.call.d) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.sdk.account.api.call.d dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, AdvanceSetting.NETWORK_TYPE);
            if (dVar.success) {
                h.b().onSilentRegisterSuccess();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 13})
    public static final class l extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ com.feiliao.oauth.sdk.flipchat.open.api.h $call;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(com.feiliao.oauth.sdk.flipchat.open.api.h hVar) {
            super(1);
            this.$call = hVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, AdvanceSetting.NETWORK_TYPE);
            if (th instanceof com.feiliao.oauth.sdk.flipchat.open.api.f) {
                com.feiliao.oauth.sdk.flipchat.open.api.f fVar = (com.feiliao.oauth.sdk.flipchat.open.api.f) th;
                fVar.getErrorCode();
                fVar.getErrorMsg();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/feiliao/oauth/sdk/flipchat/open/model/SilentBindMobileResponse;", "invoke"}, k = 3, mv = {1, 1, 13})
    public static final class m extends Lambda implements Function1<com.feiliao.oauth.sdk.flipchat.open.a.g, Unit> {
        final /* synthetic */ FlipChatApiCallback $callback;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(FlipChatApiCallback flipChatApiCallback) {
            super(1);
            this.$callback = flipChatApiCallback;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.feiliao.oauth.sdk.flipchat.open.a.g) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.feiliao.oauth.sdk.flipchat.open.a.g gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, AdvanceSetting.NETWORK_TYPE);
            if (gVar.d()) {
                this.$callback.onSuccess(gVar);
            } else {
                this.$callback.onError(gVar);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 13})
    public static final class n extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ FlipChatApiCallback $callback;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(FlipChatApiCallback flipChatApiCallback) {
            super(1);
            this.$callback = flipChatApiCallback;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, AdvanceSetting.NETWORK_TYPE);
            FlipChatApiCallback flipChatApiCallback = this.$callback;
            Intrinsics.checkParameterIsNotNull(th, "exception");
            com.feiliao.oauth.sdk.flipchat.open.a.g b2 = com.feiliao.oauth.sdk.flipchat.open.a.g.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "SilentBindMobileResponse.createError()");
            flipChatApiCallback.onError(b2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteSingle;", "Lcom/feiliao/oauth/sdk/flipchat/open/model/SilentRegisterResponse;", "it", "Lcom/feiliao/oauth/sdk/flipchat/open/model/GetSilentTokenResponse;", "invoke"}, k = 3, mv = {1, 1, 13})
    public static final class o extends Lambda implements Function1<com.feiliao.oauth.sdk.flipchat.open.a.e, com.feiliao.oauth.sdk.flipchat.open.b.j<com.feiliao.oauth.sdk.flipchat.open.a.h>> {
        public static final o INSTANCE = new o();

        o() {
            super(1);
        }

        @NotNull
        public final com.feiliao.oauth.sdk.flipchat.open.b.j<com.feiliao.oauth.sdk.flipchat.open.a.h> invoke(@NotNull com.feiliao.oauth.sdk.flipchat.open.a.e eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, AdvanceSetting.NETWORK_TYPE);
            if (eVar.d()) {
                i iVar = i.f24352b;
                e.a aVar = eVar.f24265a;
                Intrinsics.checkExpressionValueIsNotNull(aVar, "it.data");
                return com.feiliao.oauth.sdk.flipchat.open.b.c.a(iVar.b().silentRegister(aVar.f24266a, "1394"));
            }
            throw g.a(eVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteSingle;", "Lcom/feiliao/oauth/sdk/flipchat/open/model/OpenCodeAuthResponse;", "it", "Lcom/feiliao/oauth/sdk/flipchat/open/model/SilentRegisterResponse;", "invoke"}, k = 3, mv = {1, 1, 13})
    public static final class p extends Lambda implements Function1<com.feiliao.oauth.sdk.flipchat.open.a.h, com.feiliao.oauth.sdk.flipchat.open.b.j<com.feiliao.oauth.sdk.flipchat.open.a.f>> {
        public static final p INSTANCE = new p();

        p() {
            super(1);
        }

        @NotNull
        public final com.feiliao.oauth.sdk.flipchat.open.b.j<com.feiliao.oauth.sdk.flipchat.open.a.f> invoke(@NotNull com.feiliao.oauth.sdk.flipchat.open.a.h hVar) {
            Intrinsics.checkParameterIsNotNull(hVar, AdvanceSetting.NETWORK_TYPE);
            if (hVar.d()) {
                i iVar = i.f24352b;
                h.a aVar = hVar.f24270a;
                Intrinsics.checkExpressionValueIsNotNull(aVar, "it.data");
                return com.feiliao.oauth.sdk.flipchat.open.b.c.a(iVar.b().authCode(h.a().f24288b, "user_info,friend_relation,message", "xx", "code", aVar.f24271a, null));
            }
            throw g.a(hVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteSingle;", "Lcom/bytedance/sdk/account/api/call/UserApiResponse;", "it", "Lcom/feiliao/oauth/sdk/flipchat/open/model/OpenCodeAuthResponse;", "invoke"}, k = 3, mv = {1, 1, 13})
    public static final class q extends Lambda implements Function1<com.feiliao.oauth.sdk.flipchat.open.a.f, com.feiliao.oauth.sdk.flipchat.open.b.j<com.bytedance.sdk.account.api.call.d>> {
        final /* synthetic */ Context $context;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public q(Context context) {
            super(1);
            this.$context = context;
        }

        @NotNull
        public final com.feiliao.oauth.sdk.flipchat.open.b.j<com.bytedance.sdk.account.api.call.d> invoke(@NotNull com.feiliao.oauth.sdk.flipchat.open.a.f fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, AdvanceSetting.NETWORK_TYPE);
            if (fVar.d()) {
                Context context = this.$context;
                f.a aVar = fVar.f24267a;
                Intrinsics.checkExpressionValueIsNotNull(aVar, "it.data");
                String str = aVar.f24268a;
                Intrinsics.checkExpressionValueIsNotNull(str, "it.data.code");
                return h.a(context, str);
            }
            throw g.a(fVar);
        }
    }

    private k() {
    }

    @JvmStatic
    @NotNull
    public static final com.feiliao.oauth.sdk.flipchat.open.b.j<com.bytedance.sdk.account.api.call.d> a(@NotNull Context context, @NotNull String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "code");
        return com.feiliao.oauth.sdk.flipchat.open.b.j.f24312a.a((Function1<? super com.feiliao.oauth.sdk.flipchat.open.b.g<R>, Unit>) new b<Object,Unit>(com.bytedance.sdk.account.d.d.b(context), str));
    }

    @JvmStatic
    @NotNull
    public static final FlipChatRequestController a(@NotNull Context context, int i2, @NotNull com.feiliao.oauth.sdk.flipchat.open.api.c<Object> cVar, @Nullable Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        f fVar = new f(context, i2, cVar, bundle);
        fVar.a();
        return fVar;
    }
}
