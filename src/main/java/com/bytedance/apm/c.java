package com.bytedance.apm;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.apm.core.a;
import com.bytedance.apm.core.b;
import com.bytedance.apm.net.DefaultHttpServiceImpl;
import com.bytedance.services.apm.api.IHttpService;
import com.ss.android.common.util.ToolUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static Context f1921a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f1922b;

    /* renamed from: c  reason: collision with root package name */
    public static IHttpService f1923c = new DefaultHttpServiceImpl();

    /* renamed from: d  reason: collision with root package name */
    public static int f1924d = -1;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f1925e;

    /* renamed from: f  reason: collision with root package name */
    public static long f1926f;
    public static long g;
    private static JSONObject h = new JSONObject();
    private static b i = new a();
    private static Map<String, String> j = Collections.emptyMap();
    private static long k = -1;
    private static boolean l = false;

    public static Context a() {
        return f1921a;
    }

    public static boolean b() {
        return l;
    }

    public static boolean d() {
        return f1922b;
    }

    public static JSONObject f() {
        return h;
    }

    public static b g() {
        return i;
    }

    public static long h() {
        return g;
    }

    public static synchronized Map<String, String> e() {
        Map<String, String> map;
        synchronized (c.class) {
            map = j;
        }
        return map;
    }

    public static long c() {
        if (k == -1) {
            k = System.currentTimeMillis();
        }
        return k;
    }

    public static void a(int i2) {
        f1924d = i2;
    }

    public static synchronized void a(b bVar) {
        synchronized (c.class) {
            i = bVar;
            Map<String, String> a2 = bVar.a();
            j = a2;
            if (a2 == null) {
                j = new HashMap();
            }
            if (!j.containsKey("aid")) {
                j.put("aid", h.optString("aid"));
            }
            if (!j.containsKey("device_id")) {
                j.put("device_id", h.optString("device_id"));
            }
            if (!j.containsKey("device_platform")) {
                j.put("device_platform", "android");
            }
            if (!j.containsKey("update_version_code")) {
                j.put("update_version_code", h.optString("update_version_code"));
            }
            if (!j.containsKey("version_code")) {
                j.put("version_code", h.optString("version_code"));
            }
            if (!j.containsKey("channel")) {
                j.put("channel", h.optString("channel"));
            }
        }
    }

    public static synchronized void a(JSONObject jSONObject) {
        synchronized (c.class) {
            try {
                jSONObject.put("os", "Android");
                jSONObject.put("device_platform", "android");
                jSONObject.put("os_version", Build.VERSION.RELEASE);
                jSONObject.put("os_api", Build.VERSION.SDK_INT);
                jSONObject.put("device_model", Build.MODEL);
                jSONObject.put("device_brand", Build.BRAND);
                jSONObject.put("device_manufacturer", Build.MANUFACTURER);
                jSONObject.put("process_name", ToolUtils.getCurProcessName(a()));
                jSONObject.put("sid", c());
                PackageInfo packageInfo = null;
                if (TextUtils.isEmpty(jSONObject.optString("version_name"))) {
                    packageInfo = a().getPackageManager().getPackageInfo(a().getPackageName(), 0);
                    jSONObject.put("version_name", packageInfo.versionName);
                }
                if (TextUtils.isEmpty(jSONObject.optString("app_version"))) {
                    jSONObject.put("app_version", jSONObject.optString("version_name"));
                }
                if (TextUtils.isEmpty(jSONObject.optString("version_code"))) {
                    if (packageInfo == null) {
                        packageInfo = a().getPackageManager().getPackageInfo(a().getPackageName(), 0);
                    }
                    jSONObject.put("version_code", packageInfo.versionCode);
                }
                if (TextUtils.isEmpty(jSONObject.optString("package"))) {
                    jSONObject.put("package", a().getPackageName());
                }
                if (jSONObject.isNull("region")) {
                    jSONObject.put("region", Locale.getDefault().getCountry());
                }
                jSONObject.put("monitor_version", "5.0.3.5-rc.2");
            } catch (Exception e2) {
                d.a().a(e2, "ApmGlobal: setHeaderInfo");
            }
            h = jSONObject;
        }
    }

    public static com.bytedance.services.apm.api.b a(String str, Map<String, String> map) throws Exception {
        return f1923c.doGet(str, map);
    }

    public static boolean a(String str, String str2) {
        if (h == null) {
            return false;
        }
        try {
            h.put(str, str2);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }
}
