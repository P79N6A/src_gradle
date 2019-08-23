package com.feiliao.oauth.sdk.flipchat.open.impl;

import android.content.Context;
import android.os.Bundle;
import com.feiliao.oauth.sdk.flipchat.open.a.i;
import com.feiliao.oauth.sdk.flipchat.open.api.FlipChatOpenDepend;
import com.feiliao.oauth.sdk.flipchat.open.api.FlipChatRequestController;
import com.feiliao.oauth.sdk.flipchat.open.api.g;
import com.feiliao.oauth.sdk.flipchat.open.b.j;
import com.feiliao.oauth.sdk.flipchat.open.impl.k;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003B/\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0018\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0018\u0010$\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u001a\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010(\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0006\u0010)\u001a\u00020\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006*"}, d2 = {"Lcom/feiliao/oauth/sdk/flipchat/open/impl/FlipChatAuthorizeTask;", "T", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatGetAuthCodeCallback;", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatRequestController;", "context", "Landroid/content/Context;", "type", "", "listener", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatAuthCallback;", "extra", "Landroid/os/Bundle;", "(Landroid/content/Context;ILcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatAuthCallback;Landroid/os/Bundle;)V", "getContext", "()Landroid/content/Context;", "disposeList", "", "Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteDisposable;", "getExtra", "()Landroid/os/Bundle;", "getListener", "()Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatAuthCallback;", "getType", "()I", "completeRequest", "", "doBind", "code", "", "doLogin", "doUpdate", "goToAppAuth", "api", "Lcom/feiliao/oauth/sdk/open/api/RocketOpenApi;", "req", "Lcom/bytedance/sdk/account/common/model/SendAuth$Request;", "goToH5Auth", "onFlipChatGetAuthCodeError", "errorCode", "errorMsg", "onFlipChatGetAuthCodeResult", "startAuthorize", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
public final class f<T> implements FlipChatRequestController, g {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final Context f24341a;

    /* renamed from: b  reason: collision with root package name */
    public final int f24342b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final com.feiliao.oauth.sdk.flipchat.open.api.c<T> f24343c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final Bundle f24344d;

    /* renamed from: e  reason: collision with root package name */
    private final List<com.feiliao.oauth.sdk.flipchat.open.b.f> f24345e = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "it", "Lcom/bytedance/sdk/account/api/call/UserApiResponse;", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class a extends Lambda implements Function1<com.bytedance.sdk.account.api.call.d, Unit> {
        final /* synthetic */ f this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.bytedance.sdk.account.api.call.d) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.sdk.account.api.call.d dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, AdvanceSetting.NETWORK_TYPE);
            if (dVar.success) {
                this.this$0.f24343c.a(dVar);
            } else {
                this.this$0.f24343c.a(dVar.error, dVar.errorMsg, dVar);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "it", "", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class b extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ f this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, AdvanceSetting.NETWORK_TYPE);
            Intrinsics.checkParameterIsNotNull(th, "exception");
            com.bytedance.sdk.account.api.call.d dVar = new com.bytedance.sdk.account.api.call.d(false, 0);
            dVar.error = -18;
            this.this$0.f24343c.a(dVar.error, dVar.errorMsg, dVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "it", "Lcom/bytedance/sdk/account/api/call/UserApiResponse;", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class c extends Lambda implements Function1<com.bytedance.sdk.account.api.call.d, Unit> {
        final /* synthetic */ f this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.bytedance.sdk.account.api.call.d) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.sdk.account.api.call.d dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, AdvanceSetting.NETWORK_TYPE);
            if (dVar.success) {
                this.this$0.f24343c.a(dVar);
            } else {
                this.this$0.f24343c.a(dVar.error, dVar.errorMsg, dVar);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "it", "", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class d extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ f this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, AdvanceSetting.NETWORK_TYPE);
            Intrinsics.checkParameterIsNotNull(th, "exception");
            com.bytedance.sdk.account.api.call.d dVar = new com.bytedance.sdk.account.api.call.d(false, 1);
            dVar.error = -18;
            this.this$0.f24343c.a(dVar.error, dVar.errorMsg, dVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "it", "Lcom/feiliao/oauth/sdk/flipchat/open/model/UpdateAuthorizeResponse;", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class e extends Lambda implements Function1<i, Unit> {
        final /* synthetic */ f this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((i) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull i iVar) {
            int i;
            String str;
            Intrinsics.checkParameterIsNotNull(iVar, AdvanceSetting.NETWORK_TYPE);
            com.feiliao.oauth.sdk.flipchat.open.api.i iVar2 = new com.feiliao.oauth.sdk.flipchat.open.api.i();
            if (iVar.d()) {
                this.this$0.f24343c.a(iVar2);
                return;
            }
            com.feiliao.oauth.sdk.flipchat.open.api.c<T> cVar = this.this$0.f24343c;
            i.a aVar = iVar.f24272a;
            if (aVar != null) {
                i = aVar.f24262b;
            } else {
                i = -1;
            }
            i.a aVar2 = iVar.f24272a;
            if (aVar2 != null) {
                str = aVar2.f24263c;
            } else {
                str = null;
            }
            cVar.a(i, str, iVar2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "it", "", "invoke"}, k = 3, mv = {1, 1, 13})
    /* renamed from: com.feiliao.oauth.sdk.flipchat.open.impl.f$f  reason: collision with other inner class name */
    static final class C0275f extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ f this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0275f(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, AdvanceSetting.NETWORK_TYPE);
            this.this$0.f24343c.a(-1, null, new com.feiliao.oauth.sdk.flipchat.open.api.i());
        }
    }

    public final void completeRequest() {
        g gVar = this;
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        h.f24348c.remove(gVar);
        try {
            FlipChatOpenDepend b2 = h.b();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("service", "removeCallback");
            b2.alog("_flipchat_open_", jSONObject);
        } catch (Exception unused) {
        }
        for (com.feiliao.oauth.sdk.flipchat.open.b.f a2 : this.f24345e) {
            a2.a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0048, code lost:
        if (r2 == null) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r3 = this;
            android.content.Context r0 = r3.f24341a
            com.feiliao.oauth.sdk.a.a.b r0 = com.feiliao.oauth.sdk.a.b.a.a(r0)
            com.bytedance.sdk.account.b.c.c$a r1 = new com.bytedance.sdk.account.b.c.c$a
            r1.<init>()
            java.lang.String r2 = "user_info,friend_relation,message"
            r1.f22263e = r2
            java.lang.String r2 = "xx"
            r1.f22259a = r2
            android.os.Bundle r2 = r3.f24344d
            r1.extras = r2
            java.lang.String r2 = "api"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            boolean r2 = r0.a()
            if (r2 == 0) goto L_0x002e
            r2 = r3
            com.feiliao.oauth.sdk.flipchat.open.api.g r2 = (com.feiliao.oauth.sdk.flipchat.open.api.g) r2
            com.feiliao.oauth.sdk.flipchat.open.impl.h.a((com.feiliao.oauth.sdk.flipchat.open.api.g) r2)
            com.bytedance.sdk.account.b.c.a r1 = (com.bytedance.sdk.account.b.c.a) r1
            r0.a(r1)
            return
        L_0x002e:
            r0 = r3
            com.feiliao.oauth.sdk.flipchat.open.api.g r0 = (com.feiliao.oauth.sdk.flipchat.open.api.g) r0
            com.feiliao.oauth.sdk.flipchat.open.impl.h.a((com.feiliao.oauth.sdk.flipchat.open.api.g) r0)
            android.content.Context r0 = r3.f24341a
            com.feiliao.oauth.sdk.a.a.a r2 = com.feiliao.oauth.sdk.a.b.a.f24256a
            com.bytedance.sdk.account.a.b.c r2 = (com.bytedance.sdk.account.a.b.c) r2
            com.bytedance.sdk.account.a.a.b r0 = com.bytedance.sdk.account.a.b.a.a(r0, r2)
            com.feiliao.oauth.sdk.flipchat.open.api.e r2 = com.feiliao.oauth.sdk.flipchat.open.impl.h.a()
            com.feiliao.oauth.sdk.flipchat.open.api.k r2 = r2.f24292f
            if (r2 == 0) goto L_0x004a
            java.lang.Class<? extends android.app.Activity> r2 = r2.f24299a
            if (r2 != 0) goto L_0x004c
        L_0x004a:
            java.lang.Class<com.feiliao.oauth.sdk.flipchat.open.impl.FlipChatWebAuthorizeActivity> r2 = com.feiliao.oauth.sdk.flipchat.open.impl.FlipChatWebAuthorizeActivity.class
        L_0x004c:
            r0.a((java.lang.Class<T>) r2, (com.bytedance.sdk.account.b.c.c.a) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.feiliao.oauth.sdk.flipchat.open.impl.f.a():void");
    }

    public final void a(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "code");
        switch (this.f24342b) {
            case 1:
                Context context = this.f24341a;
                Intrinsics.checkParameterIsNotNull(context, "context");
                Intrinsics.checkParameterIsNotNull(str, "code");
                Intrinsics.checkParameterIsNotNull(context, "context");
                Intrinsics.checkParameterIsNotNull(str, "code");
                this.f24345e.add(j.f24312a.a((Function1<? super com.feiliao.oauth.sdk.flipchat.open.b.g<R>, Unit>) new k.c<Object,Unit>(com.bytedance.sdk.account.d.d.b(context), str)).a(new c(this), new d(this)));
                return;
            case 2:
                this.f24345e.add(h.a(this.f24341a, str).a(new a(this), new b(this)));
                return;
            case 3:
                this.f24345e.add(com.feiliao.oauth.sdk.flipchat.open.b.c.a(i.f24352b.a().updateAuthorize("flipchat", h.a().f24289c, str)).a(new e(this), new C0275f(this)));
                break;
        }
    }

    public final void a(int i, @Nullable String str) {
        this.f24343c.a(i, str);
    }

    public f(@NotNull Context context, int i, @NotNull com.feiliao.oauth.sdk.flipchat.open.api.c<T> cVar, @Nullable Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        this.f24341a = context;
        this.f24342b = i;
        this.f24343c = cVar;
        this.f24344d = bundle;
    }
}
