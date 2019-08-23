package com.ss.android.ugc.aweme.account.login.c;

import android.text.TextUtils;
import com.bytedance.sdk.account.api.c.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.account.a.a.b;
import com.ss.android.ugc.aweme.account.i.a;
import com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean;
import com.ss.android.ugc.aweme.account.terminal.a;
import com.ss.android.ugc.aweme.account.terminal.d;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.w;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0007H\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0016H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/account/login/onelogin/CommonOneLoginListener;", "Lcom/ss/android/ugc/aweme/account/login/onelogin/SimpleOneLoginAdapter;", "context", "Landroid/content/Context;", "phoneBean", "Lcom/ss/android/ugc/aweme/account/login/bean/OneLoginPhoneBean;", "enterMethod", "", "(Landroid/content/Context;Lcom/ss/android/ugc/aweme/account/login/bean/OneLoginPhoneBean;Ljava/lang/String;)V", "startLoginTime", "", "getStartLoginTime", "()J", "setStartLoginTime", "(J)V", "getMonitorCarrierType", "onGetTokenError", "", "response", "Lcom/bytedance/sdk/account/platform/base/AuthorizeErrorResponse;", "onLoginByTokenError", "onLoginSuccess", "Lcom/bytedance/sdk/account/api/response/LoginByTicketResponse;", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public class a extends c {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f32182e;

    /* renamed from: f  reason: collision with root package name */
    public long f32183f;
    private final OneLoginPhoneBean h;
    private final String i;

    private final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f32182e, false, 20307, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f32182e, false, 20307, new Class[0], String.class);
        } else if (TextUtils.isEmpty(this.h.getFrom())) {
            return "";
        } else {
            String from = this.h.getFrom();
            if (from != null) {
                int hashCode = from.hashCode();
                if (hashCode != -1429363305) {
                    if (hashCode != -1068855134) {
                        if (hashCode == -840542575 && from.equals("unicom")) {
                            return "ChinaUnicom";
                        }
                    } else if (from.equals("mobile")) {
                        return "ChinaMobile";
                    }
                } else if (from.equals("telecom")) {
                    return "ChinaTelecom";
                }
            }
            return "";
        }
    }

    public void a(@NotNull e eVar) {
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, f32182e, false, 20304, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2}, this, f32182e, false, 20304, new Class[]{e.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(eVar2, "response");
        com.ss.android.ugc.aweme.account.terminal.a.f32778d.a("success");
        if (eVar2.f22248c != null) {
            com.ss.android.ugc.aweme.account.login.loginlog.a.a().a("", "", true, "login", "", "mobile login success");
            r.a("login_success", (Map) new b().a("enter_method", this.i).a("platform", "one_click").a("status", 1).a("carrier", this.h.getFromMobLabel()).a("_perf_monitor", 1).f31599b);
            w.a(eVar2.f22248c);
            w.a(4, 1, (Object) this.h.getFrom());
            n.a("aweme_phone_login_rate", 1, com.ss.android.ugc.aweme.account.a.a.a.a().b());
            a.b bVar = a.b.ONE_LOGIN_BY_TOKEN;
            a.C0406a aVar = a.C0406a.ONE_LOGIN;
            com.ss.android.ugc.aweme.account.i.a.a(bVar, aVar, this.h.getFrom() + this.h.getMobile());
        }
    }

    public void c(@NotNull com.bytedance.sdk.account.i.b.b bVar) {
        int i2;
        com.bytedance.sdk.account.i.b.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f32182e, false, 20305, new Class[]{com.bytedance.sdk.account.i.b.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f32182e, false, 20305, new Class[]{com.bytedance.sdk.account.i.b.b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bVar2, "response");
        try {
            String str = bVar2.f22434a;
            if (str == null) {
                str = PushConstants.PUSH_TYPE_NOTIFY;
            }
            Integer valueOf = Integer.valueOf(str);
            Intrinsics.checkExpressionValueIsNotNull(valueOf, "Integer.valueOf(response.platformErrorCode ?: \"0\")");
            i2 = valueOf.intValue();
        } catch (Exception unused) {
            i2 = 0;
        }
        a.C0415a aVar = com.ss.android.ugc.aweme.account.terminal.a.f32778d;
        aVar.a(bVar2.f22435b + "|" + a());
        com.ss.android.ugc.aweme.account.i.a.b(bVar2.f22434a, bVar2.f22435b, null, a.C0406a.ONE_LOGIN, this.h.getFrom());
        d.f32793c.a(1, i2, bVar2.f22435b, a(), "type_login_by_token");
        n.a("aweme_phone_login_rate", 0, com.ss.android.ugc.aweme.account.a.a.a.a().a("errorCode", bVar2.f22434a).a("errorDesc", bVar2.f22435b).b());
    }

    public void d(@NotNull com.bytedance.sdk.account.i.b.b bVar) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f32182e, false, 20306, new Class[]{com.bytedance.sdk.account.i.b.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f32182e, false, 20306, new Class[]{com.bytedance.sdk.account.i.b.b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bVar, "response");
        try {
            String str = bVar.f22434a;
            if (str == null) {
                Intrinsics.throwNpe();
            }
            Integer valueOf = Integer.valueOf(str);
            Intrinsics.checkExpressionValueIsNotNull(valueOf, "Integer.valueOf(response.platformErrorCode!!)");
            i2 = valueOf.intValue();
        } catch (Exception unused) {
            i2 = 0;
        }
        a.C0415a aVar = com.ss.android.ugc.aweme.account.terminal.a.f32778d;
        aVar.a("token == null|" + a());
        d.f32793c.a(1, i2, bVar.f22435b, a(), "type_get_token");
        com.ss.android.ugc.aweme.account.i.a.b(bVar.f22434a, bVar.f22435b, a.b.ONE_LOGIN_GET_TOKEN, a.C0406a.ONE_LOGIN, this.h.getFrom());
        String str2 = "";
        if (!TextUtils.isEmpty(this.h.getFrom())) {
            String from = this.h.getFrom();
            if (from != null) {
                int hashCode = from.hashCode();
                if (hashCode != -1429363305) {
                    if (hashCode != -1068855134) {
                        if (hashCode == -840542575 && from.equals("unicom")) {
                            str2 = "china_unicom";
                        }
                    } else if (from.equals("mobile")) {
                        str2 = "china_mobile";
                    }
                } else if (from.equals("telecom")) {
                    str2 = "china_telecom";
                }
            }
            str2 = "";
        }
        r.a("one_click_login_token_response", (Map) new b().a("enter_method", this.i).a("carrier", str2).a("is_success", PushConstants.PUSH_TYPE_NOTIFY).a("error_code", bVar.f22434a).a("duration", String.valueOf(System.currentTimeMillis() - this.f32183f)).f31599b);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(@org.jetbrains.annotations.Nullable android.content.Context r2, @org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean r3, @org.jetbrains.annotations.Nullable java.lang.String r4) {
        /*
            r1 = this;
            java.lang.String r0 = "phoneBean"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
            android.content.Context r2 = com.ss.android.ugc.aweme.account.util.e.a(r2)
            java.lang.String r0 = "ContextUtils.getContext(context)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r0)
            r1.<init>(r2)
            r1.h = r3
            r1.i = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.c.a.<init>(android.content.Context, com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean, java.lang.String):void");
    }
}
