package com.ss.android.ttve.monitor;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.vesdk.keyvaluepair.a;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f31245a = true;

    /* renamed from: b  reason: collision with root package name */
    public static Thread f31246b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile boolean f31247c;

    /* renamed from: d  reason: collision with root package name */
    public static final Object f31248d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static boolean f31249e = false;

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000b */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x000b A[LOOP:0: B:6:0x000b->B:18:0x000b, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a() {
        /*
            boolean r0 = f31249e
            if (r0 == 0) goto L_0x001d
            boolean r0 = f31247c
            if (r0 != 0) goto L_0x001d
            java.lang.Object r0 = f31248d
            monitor-enter(r0)
        L_0x000b:
            boolean r1 = f31247c     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0018
            java.lang.System.currentTimeMillis()     // Catch:{ InterruptedException -> 0x000b }
            java.lang.Object r1 = f31248d     // Catch:{ InterruptedException -> 0x000b }
            r1.wait()     // Catch:{ InterruptedException -> 0x000b }
            goto L_0x000b
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return
        L_0x001a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r1
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.monitor.d.a():void");
    }

    static String a(String str) {
        if (!f31245a) {
            return null;
        }
        a();
        return c.a(str);
    }

    public static void a(String str, String str2) {
        if (f31245a) {
            a();
            c.a(str, str2);
        }
    }

    public static void a(String str, int i, a aVar) {
        JSONObject jSONObject;
        if (f31245a) {
            a();
            if (aVar == null) {
                jSONObject = null;
            } else {
                jSONObject = aVar.a();
            }
            c.a(str, i, jSONObject);
        }
    }

    public static void a(String str, int i, JSONObject jSONObject) {
        if (f31245a && jSONObject != null) {
            a();
            if (TextUtils.isEmpty(a("device_id"))) {
                a("device_id", "Unknown");
            }
            if (TextUtils.isEmpty(a("user_id"))) {
                a("user_id", "Unknown");
            }
            if (TextUtils.isEmpty(a("app_version"))) {
                a("app_version", "Unknown");
            }
            try {
                for (Map.Entry next : a.a().entrySet()) {
                    String str2 = (String) next.getValue();
                    if (!a.f31238a.contains(next.getKey())) {
                        jSONObject.put("te_device_info_" + ((String) next.getKey()), str2);
                    } else if (!TextUtils.isEmpty(str2)) {
                        try {
                            float parseFloat = Float.parseFloat(str2);
                            jSONObject.put("te_device_info_" + ((String) next.getKey()), (double) parseFloat);
                        } catch (Exception unused) {
                        }
                    }
                }
            } catch (JSONException unused2) {
            }
            c.a(str, i, jSONObject);
        }
    }

    static JSONObject a(@NonNull Context context, @NonNull String str, @NonNull String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_id", str);
            try {
                jSONObject.put("app_version", context.getPackageManager().getPackageInfo(context.getPackageName(), SearchJediMixFeedAdapter.f42517f).versionName);
            } catch (PackageManager.NameNotFoundException unused) {
                jSONObject.put("app_version", "vesdk:4.9.0.55");
            }
            jSONObject.put("ve_version", "4.9.0.55");
            jSONObject.put("effect_version", "4.9.0_rel_8_douyin_201908051433_ab2890f94");
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("channel", "release");
            jSONObject.put("package_name", context.getPackageName());
            jSONObject.put("user_id", str2);
            jSONObject.put("version_code", str3);
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }
}
