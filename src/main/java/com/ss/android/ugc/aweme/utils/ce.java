package com.ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.google.gson.JsonSyntaxException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.a.a.c;
import org.json.JSONException;
import org.json.JSONObject;

public final class ce {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75677a;

    private static void a(String str, String str2, JSONObject jSONObject) {
        JSONObject jSONObject2;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, jSONObject}, null, f75677a, true, 88364, new Class[]{String.class, String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, jSONObject}, null, f75677a, true, 88364, new Class[]{String.class, String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        if (jSONObject == null) {
            jSONObject2 = new JSONObject();
        } else {
            jSONObject2 = jSONObject;
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject2.put("service", str4);
            }
        } catch (JSONException unused) {
        }
        MonitorUtils.monitorCommonLog(str3, jSONObject2);
    }

    public static void a(Throwable th, String str, String str2) {
        Throwable th2 = th;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{th2, str3, str4}, null, f75677a, true, 88363, new Class[]{Throwable.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2, str3, str4}, null, f75677a, true, 88363, new Class[]{Throwable.class, String.class, String.class}, Void.TYPE);
        } else if (th2 != null && !TextUtils.isEmpty(str)) {
            if ((th2 instanceof c) || (th2 instanceof JsonSyntaxException)) {
                a("aweme_parse_error_log", "", bh.a().a("errorUrl", str3).a("errorDesc", Log.getStackTraceString(th)).a("errorResponse", str4).b());
            }
        }
    }
}
