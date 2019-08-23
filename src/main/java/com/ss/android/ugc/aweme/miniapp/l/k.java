package com.ss.android.ugc.aweme.miniapp.l;

import a.i;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.frameworks.plugin.pm.c;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.f;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.miniapp.api.MicroAppApi;
import com.ss.android.ugc.aweme.miniapp.l.d;
import com.ss.android.ugc.aweme.miniapp.q;
import com.ss.android.ugc.aweme.miniapp.views.MainProcessProxyActivity;
import com.ss.android.ugc.aweme.miniapp_api.model.BDPLog;
import com.ss.android.ugc.aweme.miniapp_api.model.a;
import com.ss.android.ugc.aweme.miniapp_api.model.b;
import com.tt.miniapphost.AppbrandHostConstants;
import com.tt.miniapphost.MiniappOpenTool;
import com.tt.miniapphost.entity.DisableStateEntity;
import com.tt.miniapphost.entity.PreLoadAppEntity;
import com.tt.miniapphost.host.HostDependManager;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55844a = null;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f55845b = true;

    /* renamed from: c  reason: collision with root package name */
    private static String f55846c = "";

    public static boolean a(Context context, String str, b bVar) {
        String str2;
        Gson gson;
        Context context2 = context;
        String str3 = str;
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{context2, str3, bVar2}, null, f55844a, true, 59561, new Class[]{Context.class, String.class, b.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str3, bVar2}, null, f55844a, true, 59561, new Class[]{Context.class, String.class, b.class}, Boolean.TYPE)).booleanValue();
        }
        String str4 = bVar2.f56016b;
        String str5 = bVar2.f56017c;
        String str6 = bVar2.f56015a;
        String str7 = bVar2.f56020f;
        if (a(str, bVar)) {
            str3 = str3 + "&from=" + bVar2.f56019e;
        }
        if (!TextUtils.isEmpty(str5)) {
            str3 = str3 + "&scene=" + str5;
        }
        String str8 = null;
        try {
            BDPLog bDPLog = new BDPLog(str4, str6, str7);
            if (PatchProxy.isSupport(new Object[]{bDPLog}, null, a.f55815a, true, 59524, new Class[]{Object.class}, String.class)) {
                str2 = (String) PatchProxy.accessDispatch(new Object[]{bDPLog}, null, a.f55815a, true, 59524, new Class[]{Object.class}, String.class);
            } else {
                if (PatchProxy.isSupport(new Object[0], null, a.f55815a, true, 59523, new Class[0], Gson.class)) {
                    gson = (Gson) PatchProxy.accessDispatch(new Object[0], null, a.f55815a, true, 59523, new Class[0], Gson.class);
                } else {
                    if (a.f55816b == null) {
                        a.f55816b = new Gson();
                    }
                    gson = a.f55816b;
                }
                str2 = gson.toJson((Object) bDPLog);
            }
            str8 = URLEncoder.encode(str2, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
        }
        if (!TextUtils.isEmpty(str8)) {
            str3 = str3 + "&bdp_log=" + str8;
        }
        boolean a2 = a(context2, str3);
        IAccountUserService userService = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).userService();
        if (userService != null && !userService.isLogin()) {
            a(str3, str4, "mp_login_show");
            Intent intent = new Intent(context2, MainProcessProxyActivity.class);
            intent.putExtra("enter_from", str4);
            intent.putExtra("micro_app_schema", str3);
            intent.putExtra("proxy_type", 0);
            context2.startActivity(intent);
        } else if (a2) {
            b(context2, str3);
        }
        return a2;
    }

    private static boolean a(String str, b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{str, bVar2}, null, f55844a, true, 59562, new Class[]{String.class, b.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, bVar2}, null, f55844a, true, 59562, new Class[]{String.class, b.class}, Boolean.TYPE)).booleanValue();
        }
        a b2 = b(str, bVar);
        JSONObject jSONObject = new JSONObject();
        if (b2 == null) {
            return false;
        }
        try {
            jSONObject.put("log_extra", b2.f56008e);
            jSONObject.put("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        } catch (JSONException e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Exception) e2);
        }
        if (TextUtils.equals(bVar2.f56019e, f.f34168b)) {
            r.onEvent(MobClick.obtain().setEventName("embeded_ad").setValue(b2.f56005b).setJsonObject(jSONObject).setLabelName("open_url_microapp"));
        } else {
            r.onEvent(MobClick.obtain().setEventName("embeded_ad").setValue(b2.f56005b).setJsonObject(jSONObject).setLabelName("micro_app_app"));
        }
        return true;
    }

    public static boolean a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f55844a, true, 59567, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, null, f55844a, true, 59567, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (!g(str)) {
            return false;
        } else {
            String host = Uri.parse(str).getHost();
            return TextUtils.equals(host, "microapp") || TextUtils.equals(host, "microgame");
        }
    }

    public static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f55844a, true, 59558, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f55844a, true, 59558, new Class[0], Void.TYPE);
        } else {
            c.e("com.ss.android.ugc.aweme.miniappplugin");
        }
    }

    static final /* synthetic */ Object f(String str) throws Exception {
        try {
            if (MicroAppApi.a(str).f56034a) {
                q.a().i.d();
            }
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        return null;
    }

    public static void e(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f55844a, true, 59577, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f55844a, true, 59577, new Class[]{String.class}, Void.TYPE);
            return;
        }
        h(str);
        i.a((Callable<TResult>) new n<TResult>(str2));
    }

    public static String a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f55844a, true, 59579, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2}, null, f55844a, true, 59579, new Class[]{Context.class}, String.class);
        } else if (!com.ss.android.ugc.aweme.plugin.g.b.a("com.ss.android.ugc.aweme.miniappplugin")) {
            return "";
        } else {
            if (!TextUtils.isEmpty(f55846c)) {
                return f55846c;
            }
            try {
                if (AppbrandHostConstants.getBundleManager().getBaseBundleManager() != null) {
                    f55846c = AppbrandHostConstants.getBundleManager().getBaseBundleManager().getSdkCurrentVersionStr(context2);
                }
            } catch (Exception unused) {
            }
            if (!f55846c.equals("0.0.0.-1")) {
                return f55846c;
            }
            f55846c = "";
            return "";
        }
    }

    public static String c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f55844a, true, 59569, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, null, f55844a, true, 59569, new Class[]{String.class}, String.class);
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            return Uri.parse(str).getQueryParameter("app_id");
        }
    }

    public static boolean d(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f55844a, true, 59570, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, null, f55844a, true, 59570, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (!g(str)) {
            return false;
        } else {
            return TextUtils.equals(Uri.parse(str).getHost(), "microapp");
        }
    }

    private static boolean g(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f55844a, true, 59571, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, null, f55844a, true, 59571, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (str == null || str.length() == 0) {
            return false;
        } else {
            return true;
        }
    }

    private static void h(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f55844a, true, 59578, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, null, f55844a, true, 59578, new Class[]{String.class}, Void.TYPE);
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            sb.append("className = ");
            sb.append(className);
            sb.append(", methodName = ");
            sb.append(methodName);
        }
        if (TextUtils.isEmpty(c(str))) {
            com.ss.android.ugc.aweme.framework.a.a.a(3, "MICRO_APP_ID", sb.toString());
        }
    }

    public static boolean b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f55844a, true, 59568, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, null, f55844a, true, 59568, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (!g(str)) {
            return false;
        } else {
            return TextUtils.equals(Uri.parse(str).getHost(), "microgame");
        }
    }

    public static void b(Context context, String str) {
        final Context context2 = context;
        final String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, f55844a, true, 59566, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2}, null, f55844a, true, 59566, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        if (!com.ss.android.g.a.a()) {
            d.a().a(context2, "start_mini_app", true, new d.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f55848a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f55848a, false, 59585, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f55848a, false, 59585, new Class[0], Void.TYPE);
                        return;
                    }
                    MiniappOpenTool.openAppbrand(context2, str2);
                }
            });
        }
    }

    private static a b(String str, b bVar) {
        a aVar;
        String str2 = str;
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{str2, bVar2}, null, f55844a, true, 59563, new Class[]{String.class, b.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{str2, bVar2}, null, f55844a, true, 59563, new Class[]{String.class, b.class}, a.class);
        }
        try {
            str2 = URLDecoder.decode(str2, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
        }
        String queryParameter = Uri.parse(str2).getQueryParameter("ad_params");
        a aVar2 = null;
        if (TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(queryParameter);
            String optString = jSONObject.optString("web_url");
            String optString2 = jSONObject.optString("web_title");
            String optString3 = jSONObject.optString("cid");
            String optString4 = jSONObject.optString("log_extra");
            String str3 = bVar2.f56019e;
            a.C0644a aVar3 = new a.C0644a();
            aVar3.f56011c = optString3;
            aVar3.f56010b = optString;
            aVar3.f56013e = str3;
            aVar3.f56014f = optString4;
            aVar3.f56012d = optString2;
            if (PatchProxy.isSupport(new Object[0], aVar3, a.C0644a.f56009a, false, 59634, new Class[0], a.class)) {
                aVar = (a) PatchProxy.accessDispatch(new Object[0], aVar3, a.C0644a.f56009a, false, 59634, new Class[0], a.class);
            } else {
                aVar = new a();
                aVar.f56005b = aVar3.f56011c;
                aVar.f56007d = aVar3.f56013e;
                aVar.f56004a = aVar3.f56010b;
                aVar.f56006c = aVar3.f56012d;
                aVar.f56008e = aVar3.f56014f;
            }
            aVar2 = aVar;
        } catch (JSONException unused2) {
        }
        return aVar2;
    }

    public static void a(String str, int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, null, f55844a, true, 59559, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, null, f55844a, true, 59559, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
        } else if (q.a().n.a() && !TextUtils.isEmpty(str) && com.ss.android.ugc.aweme.plugin.g.b.a("com.ss.android.ugc.aweme.miniappplugin")) {
            PreLoadAppEntity preLoadAppEntity = new PreLoadAppEntity();
            preLoadAppEntity.setAppid(str2);
            preLoadAppEntity.setApptype(i);
            ArrayList arrayList = new ArrayList();
            arrayList.add(preLoadAppEntity);
            MiniappOpenTool.preloadMiniApp(arrayList, Collections.emptyList());
        }
    }

    public static boolean a(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, f55844a, true, 59565, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str2}, null, f55844a, true, 59565, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (Build.VERSION.SDK_INT < 21 || !a(str)) {
            return false;
        } else {
            DisableStateEntity checkMiniAppDisableState = AppbrandHostConstants.getBundleManager().checkMiniAppDisableState(context2, 0);
            if (checkMiniAppDisableState == null) {
                return true;
            }
            if (context2 == null || TextUtils.isEmpty(str) || !HostDependManager.getInst().handleAppbrandDisablePage(context2, str2)) {
                HostDependManager.getInst().jumpToWebView(context2, checkMiniAppDisableState.getHintUrl(), "", true);
            }
            return false;
        }
    }

    public static String a(String str, String str2, boolean z) {
        String str3;
        String str4;
        String str5 = str;
        String str6 = str2;
        if (PatchProxy.isSupport(new Object[]{str5, str6, Byte.valueOf(z ? (byte) 1 : 0)}, null, f55844a, true, 59575, new Class[]{String.class, String.class, Boolean.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str5, str6, Byte.valueOf(z)}, null, f55844a, true, 59575, new Class[]{String.class, String.class, Boolean.TYPE}, String.class);
        } else if (TextUtils.isEmpty(str2)) {
            return null;
        } else {
            if (z) {
                str3 = "snssdk1128://microgame?";
            } else {
                str3 = "snssdk1128://microapp?";
            }
            com.ss.android.common.util.i iVar = new com.ss.android.common.util.i();
            iVar.f28338c = str3 + "app_id=" + str6;
            if (z) {
                str4 = "query";
            } else {
                str4 = "start_page";
            }
            iVar.a(str4, str5);
            return iVar.a();
        }
    }

    public static void a(String str, String str2, String str3) {
        String str4;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str, str5, str6}, null, f55844a, true, 59564, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str5, str6}, null, f55844a, true, 59564, new Class[]{String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("mp_id", c(str));
        if (d(str)) {
            str4 = "micro_app";
        } else {
            str4 = "micro_game";
        }
        r.a(str6, (Map) a2.a("_param_for_special", str4).a("enter_from", str5).f34114b);
    }
}
