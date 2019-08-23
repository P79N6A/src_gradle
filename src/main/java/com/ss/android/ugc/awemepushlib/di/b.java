package com.ss.android.ugc.awemepushlib.di;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.bytedance.ies.uikit.base.AppHooks;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.pushmanager.app.e;
import com.ss.android.pushmanager.d;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.i18n.c;
import com.ss.android.ugc.awemepushlib.interaction.j;
import com.ss.android.ugc.awemepushlib.manager.MessageShowHandler;
import org.json.JSONException;
import org.json.JSONObject;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76982a;

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f76982a, false, 90175, new Class[0], String.class)) {
            return j.a().getSessionKey();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f76982a, false, 90175, new Class[0], String.class);
    }

    public final Pair<String, String> b() {
        if (!PatchProxy.isSupport(new Object[0], this, f76982a, false, 90179, new Class[0], Pair.class)) {
            return new Pair<>("2882303761517509924", "5571750917924");
        }
        return (Pair) PatchProxy.accessDispatch(new Object[0], this, f76982a, false, 90179, new Class[0], Pair.class);
    }

    public final Pair<String, String> c() {
        if (!PatchProxy.isSupport(new Object[0], this, f76982a, false, 90180, new Class[0], Pair.class)) {
            return new Pair<>("110437", "c5c279eeedb44a3dad07655240d72ded");
        }
        return (Pair) PatchProxy.accessDispatch(new Object[0], this, f76982a, false, 90180, new Class[0], Pair.class);
    }

    public final Pair<String, String> d() {
        if (!PatchProxy.isSupport(new Object[0], this, f76982a, false, 90182, new Class[0], Pair.class)) {
            return new Pair<>("Cufg9mt6OIKNDk5DqYVEk7XX", "uJPS25PQ1uMkIe1b6aCVStzm");
        }
        return (Pair) PatchProxy.accessDispatch(new Object[0], this, f76982a, false, 90182, new Class[0], Pair.class);
    }

    public final com.ss.android.push.b<String, String, String> e() {
        if (PatchProxy.isSupport(new Object[0], this, f76982a, false, 90183, new Class[0], com.ss.android.push.b.class)) {
            return (com.ss.android.push.b) PatchProxy.accessDispatch(new Object[0], this, f76982a, false, 90183, new Class[0], com.ss.android.push.b.class);
        }
        final String d2 = e.a().b().d();
        return new com.ss.android.push.b<String, String, String>() {
            public static ChangeQuickRedirect changeQuickRedirect;

            public final String getLeft() {
                return "57bfa27c67e58e7d920028d3";
            }

            public final String getMiddle() {
                return "7dcb6dabbaadc519b588cf7c63727247";
            }

            public final String getRight() {
                return d2;
            }
        };
    }

    public final com.ss.android.message.e f() {
        if (!PatchProxy.isSupport(new Object[0], this, f76982a, false, 90185, new Class[0], com.ss.android.message.e.class)) {
            return com.ss.android.ugc.awemepushlib.b.b.b();
        }
        return (com.ss.android.message.e) PatchProxy.accessDispatch(new Object[0], this, f76982a, false, 90185, new Class[0], com.ss.android.message.e.class);
    }

    public final void a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f76982a, false, 90174, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f76982a, false, 90174, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        try {
            AppHooks.InitHook initHook = AppHooks.getInitHook();
            if (initHook != null) {
                initHook.tryInit(context2);
            }
        } catch (Throwable unused) {
        }
    }

    public final String a(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{context2, str2}, this, f76982a, false, 90176, new Class[]{Context.class, String.class}, String.class)) {
            return j.a().filterUrl(context2, str2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{context2, str2}, this, f76982a, false, 90176, new Class[]{Context.class, String.class}, String.class);
    }

    public final void a(String str, JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{str, jSONObject}, this, f76982a, false, 90187, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, jSONObject}, this, f76982a, false, 90187, new Class[]{String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        AppLogNewUtils.onEventV3(str, jSONObject);
    }

    public final void a(Context context, int i, String str, int i2, String str2) {
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i), str3, Integer.valueOf(i2), str4}, this, f76982a, false, 90186, new Class[]{Context.class, Integer.TYPE, String.class, Integer.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {context2, Integer.valueOf(i), str3, Integer.valueOf(i2), str4};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f76982a, false, 90186, new Class[]{Context.class, Integer.TYPE, String.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        MessageShowHandler.handleMessage(context2, str3, i2, str4);
    }

    public final void a(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        String str4;
        Context context2 = context;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{context2, str5, str6, str7, new Long(j3), new Long(j4), jSONObject}, this, f76982a, false, 90177, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str5, str6, str7, new Long(j3), new Long(j4), jSONObject}, this, f76982a, false, 90177, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE);
            return;
        }
        AppLog.onEvent(context, str, str2, str3, j, j2, jSONObject);
        if (!c.a()) {
            JSONObject b2 = com.ss.android.ugc.awemepushlib.c.c.a().a("count", String.valueOf(j)).b();
            if (PatchProxy.isSupport(new Object[]{"log_red_badge", "show", b2}, null, f76982a, true, 90178, new Class[]{String.class, String.class, JSONObject.class}, Void.TYPE)) {
                Object[] objArr = {"log_red_badge", "show", b2};
                PatchProxy.accessDispatch(objArr, null, f76982a, true, 90178, new Class[]{String.class, String.class, JSONObject.class}, Void.TYPE);
            } else {
                if (b2 == null) {
                    b2 = new JSONObject();
                }
                try {
                    if (!TextUtils.isEmpty("show")) {
                        b2.put("service", "show");
                    }
                } catch (JSONException unused) {
                }
                MonitorUtils.monitorCommonLog("log_red_badge", b2);
            }
            if (TextUtils.equals(str6, "red_badge") && j3 > 0) {
                r.onEvent(MobClick.obtain().setEventName("red_badge").setLabelName("show").setValue(String.valueOf(j)));
                com.ss.android.ugc.aweme.aj.b.b().a(context2, "red_point_count", j3);
            }
        }
        try {
            if (TextUtils.equals(str6, "red_badge")) {
                com.ss.android.ugc.awemepushlib.c.c a2 = com.ss.android.ugc.awemepushlib.c.c.a().a("label", str7).a("category", str5).a("value", Long.valueOf(j)).a("ext_value", Long.valueOf(j2));
                if (jSONObject == null) {
                    str4 = "";
                } else {
                    str4 = jSONObject.toString();
                }
                n.a(str6, a2.a("ext_json", str4).b());
            }
        } catch (Exception unused2) {
        }
        if (TextUtils.equals(str6, "red_badge") && j3 > 0 && c.a()) {
            com.ss.android.ugc.aweme.aj.b.b().a(context2, "red_point_count", j3);
        }
    }
}
