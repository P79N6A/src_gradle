package com.ss.android.ugc.aweme.rocket;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.feiliao.oauth.sdk.flipchat.open.api.FlipChatOpenDepend;
import com.feiliao.oauth.sdk.flipchat.open.api.FlipChatPageRequestCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.sdk.b.b;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.c;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\u001a\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u0013\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u0014\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\bH\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\bH\u0016J,\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\n2\b\u0010!\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\"\u001a\u00020\u0006H\u0016J\b\u0010#\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/ugc/aweme/rocket/FlipChatDependImpl;", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatOpenDepend;", "()V", "AUTH_BIND_CODE", "", "alog", "", "tag", "", "json", "Lorg/json/JSONObject;", "appContext", "Landroid/content/Context;", "appLog", "event", "goToAuhBind", "call", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatPageRequestCallback;", "goToAuthLogin", "goToAuthUpdate", "goToLogin", "goToUserProto", "context", "url", "isBindFlipChat", "", "isBindMobile", "isLogin", "mobileNum", "monitorStatusAndDuration", "serviceName", "status", "duration", "logExtr", "onSilentRegisterSuccess", "refreshUserInfo", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d implements FlipChatOpenDepend {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63650a;

    /* renamed from: b  reason: collision with root package name */
    public static final d f63651b = new d();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/rocket/FlipChatDependImpl$goToLogin$1$1", "Lcom/ss/android/ugc/aweme/base/component/OnActivityResult;", "onResultCancelled", "", "data", "Landroid/os/Bundle;", "onResultOK", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements f {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63652a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f63653b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ FlipChatPageRequestCallback f63654c;

        public final void a(@Nullable Bundle bundle) {
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f63652a, false, 70881, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f63652a, false, 70881, new Class[0], Void.TYPE);
                return;
            }
            FlipChatPageRequestCallback flipChatPageRequestCallback = this.f63654c;
            if (flipChatPageRequestCallback != null) {
                flipChatPageRequestCallback.onPageComplete();
            }
        }

        a(Ref.ObjectRef objectRef, FlipChatPageRequestCallback flipChatPageRequestCallback) {
            this.f63653b = objectRef;
            this.f63654c = flipChatPageRequestCallback;
        }
    }

    public final void alog(@NotNull String str, @Nullable JSONObject jSONObject) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, jSONObject}, this, f63650a, false, 70877, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, jSONObject}, this, f63650a, false, 70877, new Class[]{String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "tag");
    }

    public final void goToUserProto(@NotNull Context context, @NotNull String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, this, f63650a, false, 70880, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2}, this, f63650a, false, 70880, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(str2, PushConstants.WEB_URL);
    }

    @Nullable
    public final String mobileNum() {
        return "";
    }

    public final void monitorStatusAndDuration(@NotNull String str, int i, @Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), jSONObject, jSONObject2}, this, f63650a, false, 70878, new Class[]{String.class, Integer.TYPE, JSONObject.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), jSONObject, jSONObject2}, this, f63650a, false, 70878, new Class[]{String.class, Integer.TYPE, JSONObject.class, JSONObject.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "serviceName");
    }

    public final void onSilentRegisterSuccess() {
    }

    private d() {
    }

    @NotNull
    public final Context appContext() {
        if (PatchProxy.isSupport(new Object[0], this, f63650a, false, 70875, new Class[0], Context.class)) {
            return (Context) PatchProxy.accessDispatch(new Object[0], this, f63650a, false, 70875, new Class[0], Context.class);
        }
        Context context = GlobalContext.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "GlobalContext.getContext()");
        return context;
    }

    public final boolean isBindFlipChat() {
        if (!PatchProxy.isSupport(new Object[0], this, f63650a, false, 70869, new Class[0], Boolean.TYPE)) {
            return b.a().a("flipchat");
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63650a, false, 70869, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean isLogin() {
        if (PatchProxy.isSupport(new Object[0], this, f63650a, false, 70868, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63650a, false, 70868, new Class[0], Boolean.TYPE)).booleanValue();
        }
        IAccountUserService a2 = com.ss.android.ugc.aweme.account.d.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
        return a2.isLogin();
    }

    public final void refreshUserInfo() {
        if (PatchProxy.isSupport(new Object[0], this, f63650a, false, 70879, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63650a, false, 70879, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.account.d.a().queryUser();
    }

    public final boolean isBindMobile() {
        if (PatchProxy.isSupport(new Object[0], this, f63650a, false, 70870, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63650a, false, 70870, new Class[0], Boolean.TYPE)).booleanValue();
        }
        IAccountUserService a2 = com.ss.android.ugc.aweme.account.d.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
        User curUser = a2.getCurUser();
        Intrinsics.checkExpressionValueIsNotNull(curUser, "AccountUserProxyService.get().curUser");
        return curUser.isPhoneBinded();
    }

    public final void goToAuthLogin(@Nullable FlipChatPageRequestCallback flipChatPageRequestCallback) {
        if (PatchProxy.isSupport(new Object[]{flipChatPageRequestCallback}, this, f63650a, false, 70873, new Class[]{FlipChatPageRequestCallback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{flipChatPageRequestCallback}, this, f63650a, false, 70873, new Class[]{FlipChatPageRequestCallback.class}, Void.TYPE);
            return;
        }
        throw new IllegalStateException("暂不支持该平台的授权登录");
    }

    public final void goToAuthUpdate(@Nullable FlipChatPageRequestCallback flipChatPageRequestCallback) {
        if (PatchProxy.isSupport(new Object[]{flipChatPageRequestCallback}, this, f63650a, false, 70874, new Class[]{FlipChatPageRequestCallback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{flipChatPageRequestCallback}, this, f63650a, false, 70874, new Class[]{FlipChatPageRequestCallback.class}, Void.TYPE);
            return;
        }
        throw new IllegalStateException("暂不支持该平台的更新token");
    }

    public final void goToAuhBind(@Nullable FlipChatPageRequestCallback flipChatPageRequestCallback) {
        if (PatchProxy.isSupport(new Object[]{flipChatPageRequestCallback}, this, f63650a, false, 70872, new Class[]{FlipChatPageRequestCallback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{flipChatPageRequestCallback}, this, f63650a, false, 70872, new Class[]{FlipChatPageRequestCallback.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.framework.core.a b2 = com.ss.android.ugc.aweme.framework.core.a.b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "AppTracker.get()");
        Activity a2 = b2.a();
        if (a2 == null) {
            k a3 = k.a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "AwemeApplication.getApplication()");
            a2 = a3.e();
        }
        Context context = a2;
        if (context == null) {
            context = GlobalContext.getContext();
        }
        if (context != null) {
            Intent authorizeActivityStartIntent = c.c().getAuthorizeActivityStartIntent(context);
            authorizeActivityStartIntent.putExtra("platform", "flipchat");
            authorizeActivityStartIntent.putExtra("is_login", false);
            if (!(context instanceof Activity)) {
                authorizeActivityStartIntent.addFlags(268435456);
            }
            context.startActivity(authorizeActivityStartIntent);
        }
    }

    public final void goToLogin(@Nullable FlipChatPageRequestCallback flipChatPageRequestCallback) {
        FlipChatPageRequestCallback flipChatPageRequestCallback2 = flipChatPageRequestCallback;
        if (PatchProxy.isSupport(new Object[]{flipChatPageRequestCallback2}, this, f63650a, false, 70871, new Class[]{FlipChatPageRequestCallback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{flipChatPageRequestCallback2}, this, f63650a, false, 70871, new Class[]{FlipChatPageRequestCallback.class}, Void.TYPE);
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        com.ss.android.ugc.aweme.framework.core.a b2 = com.ss.android.ugc.aweme.framework.core.a.b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "AppTracker.get()");
        T a2 = b2.a();
        if (a2 == null) {
            k a3 = k.a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "AwemeApplication.getApplication()");
            a2 = a3.e();
        }
        objectRef.element = a2;
        if (((Activity) objectRef.element) != null) {
            c.b().showLoginAndRegisterView(new IAccountService.d().a((Activity) objectRef.element).a("flipchat").a((IAccountService.h) new com.ss.android.ugc.aweme.app.accountsdk.k((f) new a(objectRef, flipChatPageRequestCallback2))).a());
        }
    }

    public final void appLog(@NotNull String str, @Nullable JSONObject jSONObject) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, jSONObject}, this, f63650a, false, 70876, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, jSONObject}, this, f63650a, false, 70876, new Class[]{String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "event");
        AppLogNewUtils.onEventV3(str, jSONObject);
    }
}
