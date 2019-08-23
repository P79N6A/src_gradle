package com.ss.android.ugc.aweme.app.application.task;

import android.content.Context;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.account.token.b;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.app.application.a;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.net.ah;
import com.ss.android.ugc.aweme.net.interceptor.TokenSdkCommonParamsInterceptorCronet;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

public class TokenSdkTask implements a, LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public f type() {
        return f.BACKGROUND;
    }

    @MeasureFunction
    public void run() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 23293, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 23293, new Class[0], Void.TYPE);
            return;
        }
        doRealTask();
    }

    private void doRealTask() {
        Boolean bool;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 23295, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 23295, new Class[0], Void.TYPE);
        } else if (ToolUtils.isMainProcess(i.a().getContext())) {
            b bVar = new b();
            bVar.f22681f = 600000;
            bVar.f22680e = true;
            bVar.f22678c = new com.ss.android.account.token.f() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f33963a;

                public final void a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
                    String str2 = str;
                    JSONObject jSONObject3 = jSONObject;
                    if (PatchProxy.isSupport(new Object[]{str2, jSONObject3, null}, this, f33963a, false, 23296, new Class[]{String.class, JSONObject.class, JSONObject.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str2, jSONObject3, null}, this, f33963a, false, 23296, new Class[]{String.class, JSONObject.class, JSONObject.class}, Void.TYPE);
                        return;
                    }
                    n.a(str2, jSONObject3, (JSONObject) null);
                }
            };
            if (!com.ss.android.g.a.a()) {
                bVar.b("amemv.com");
                bVar.b("snssdk.com");
                bVar.b("juliangyinqing.com");
            } else if (com.ss.android.g.a.c()) {
                bVar.a("https://api.tiktokv.com");
                bVar.b("tiktokv.com");
                bVar.b("tiktok.com");
                bVar.b("byteoversea.com");
            } else if (com.ss.android.g.a.b()) {
                bVar.a("https://api2.musical.ly");
                bVar.b("musical.ly");
                bVar.b("tiktokv.com");
                bVar.b("byteoversea.com");
                bVar.b("tiktok.com");
            }
            RetrofitUtils.addInterceptor(new TokenSdkCommonParamsInterceptorCronet("normal"));
            com.ss.android.account.token.a.a(k.a(), bVar);
            ah a2 = ah.a();
            if (PatchProxy.isSupport(new Object[0], a2, ah.f56909a, false, 60824, new Class[0], Boolean.class)) {
                bool = (Boolean) PatchProxy.accessDispatch(new Object[0], a2, ah.f56909a, false, 60824, new Class[0], Boolean.class);
            } else {
                if (a2.f56910b == null) {
                    if (com.ss.android.ugc.aweme.aj.b.b().b(i.a().getContext(), "awe_network_x_token_disabled", 0) == 0) {
                        z = true;
                    }
                    a2.f56910b = Boolean.valueOf(z);
                }
                bool = a2.f56910b;
            }
            com.ss.android.account.token.a.a(bool.booleanValue());
        }
    }

    public void run(@NotNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 23294, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 23294, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.framework.a.a.a("TokenSdkTask");
        doRealTask();
    }
}
