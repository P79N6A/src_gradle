package com.ss.android.ugc.aweme.app.services;

import android.content.SharedPreferences;
import android.os.Build;
import com.bytedance.boost_multidex.Result;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.google.a.a.a.a.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2679a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f2680b;

    /* renamed from: c  reason: collision with root package name */
    public static long f2681c;

    /* renamed from: d  reason: collision with root package name */
    public static long f2682d;

    /* renamed from: e  reason: collision with root package name */
    public static Result f2683e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f2684f;
    public static int g;
    public static boolean h;
    public static SharedPreferences i;

    static final /* synthetic */ Object a() throws Exception {
        if (PatchProxy.isSupport(new Object[0], null, f2679a, true, 23597, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f2679a, true, 23597, new Class[0], Void.TYPE);
        } else {
            String uuid = UUID.randomUUID().toString();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("gxl_id", uuid);
                jSONObject.put("gxl_cost", f2681c);
                if (f2682d != 0) {
                    jSONObject.put("gxl_first_install_cost", f2682d);
                }
                jSONObject.put("gxl_install_type", g);
                jSONObject.put("gxl_boost_fail", f2684f);
                jSONObject.put("gxl_sdk_int", Build.VERSION.SDK_INT);
                jSONObject.put("gxl_fingerprint", Build.FINGERPRINT);
            } catch (Throwable th) {
                try {
                    jSONObject.put("gxl_unknow_tr", a(th));
                } catch (JSONException unused) {
                }
            }
            MonitorUtils.monitorCommonLog("bmd_monitor", jSONObject);
            if (f2682d != 0) {
                i.edit().remove("first_cost_time").commit();
            }
        }
        return null;
    }

    public static String a(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, null, f2679a, true, 23598, new Class[]{Throwable.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{th2}, null, f2679a, true, 23598, new Class[]{Throwable.class}, String.class);
        } else if (th2 == null) {
            return "";
        } else {
            StringWriter stringWriter = new StringWriter();
            a.a(th2, new PrintWriter(stringWriter, true));
            return stringWriter.getBuffer().toString();
        }
    }
}
