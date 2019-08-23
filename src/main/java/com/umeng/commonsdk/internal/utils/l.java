package com.umeng.commonsdk.internal.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.q.c;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.ULog;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONObject;

public class l {

    /* renamed from: e  reason: collision with root package name */
    private static Object f80792e = new Object();

    public static String a() {
        int i;
        try {
            i = a("ls /sys/class/thermal", "thermal_zone");
        } catch (Throwable unused) {
            i = -1;
        }
        if (i > 0) {
            return "thermal_zone";
        }
        if (i < 0) {
            return "noper";
        }
        return "unknown";
    }

    public static String b() {
        int i;
        try {
            i = a("ls /", "goldfish");
        } catch (Throwable unused) {
            i = -1;
        }
        if (i > 0) {
            return "goldfish";
        }
        if (i < 0) {
            return "noper";
        }
        return "unknown";
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003b A[SYNTHETIC, Splitter:B:21:0x003b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String c() {
        /*
            java.lang.String r0 = "unknown"
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0035 }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ Throwable -> 0x0035 }
            java.lang.String r3 = "/proc/diskstats"
            r2.<init>(r3)     // Catch:{ Throwable -> 0x0035 }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x0035 }
            java.lang.String r2 = "mmcblk"
            java.lang.String r3 = "sda"
            java.lang.String r4 = "mtd"
        L_0x0014:
            java.lang.String r5 = r1.readLine()     // Catch:{ Throwable -> 0x0037 }
            if (r5 == 0) goto L_0x0039
            boolean r6 = r5.contains(r2)     // Catch:{ Throwable -> 0x0037 }
            if (r6 == 0) goto L_0x0023
            java.lang.String r0 = "mmcblk"
            goto L_0x0039
        L_0x0023:
            boolean r6 = r5.contains(r3)     // Catch:{ Throwable -> 0x0037 }
            if (r6 == 0) goto L_0x002c
            java.lang.String r0 = "sda"
            goto L_0x0039
        L_0x002c:
            boolean r5 = r5.contains(r4)     // Catch:{ Throwable -> 0x0037 }
            if (r5 == 0) goto L_0x0014
            java.lang.String r0 = "mtd"
            goto L_0x0039
        L_0x0035:
            r0 = 0
            r1 = r0
        L_0x0037:
            java.lang.String r0 = "noper"
        L_0x0039:
            if (r1 == 0) goto L_0x003e
            r1.close()     // Catch:{ Throwable -> 0x003e }
        L_0x003e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.utils.l.c():java.lang.String");
    }

    public static boolean c(Context context) {
        if (context == null) {
            return false;
        }
        SharedPreferences a2 = c.a(context.getApplicationContext(), "UM_PROBE_DATA", 0);
        if (a2 == null || TextUtils.isEmpty(a2.getString("_dsk_s", ""))) {
            return false;
        }
        return true;
    }

    public static void b(final Context context) {
        if (!c(context)) {
            final String[] strArr = {"unknown", "unknown", "unknown"};
            new Thread() {
                public final void run() {
                    super.run();
                    try {
                        strArr[0] = l.c();
                        strArr[1] = l.a();
                        strArr[2] = l.b();
                        ULog.i("diskType = " + strArr[0] + "; ThremalZone = " + strArr[1] + "; GoldFishRc = " + strArr[2]);
                        l.b(context, strArr);
                    } catch (Throwable th) {
                        UMCrashManager.reportCrash(context, th);
                    }
                }
            }.start();
        }
    }

    public static String a(Context context) {
        try {
            SharedPreferences a2 = c.a(context.getApplicationContext(), "UM_PROBE_DATA", 0);
            if (a2 == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            synchronized (f80792e) {
                jSONObject.put("_dsk_s", a2.getString("_dsk_s", ""));
                jSONObject.put("_thm_z", a2.getString("_thm_z", ""));
                jSONObject.put("_gdf_r", a2.getString("_gdf_r", ""));
            }
            return jSONObject.toString();
        } catch (Exception e2) {
            UMCrashManager.reportCrash(context, e2);
            return null;
        }
    }

    public static int a(String str, String str2) throws IOException {
        int i;
        Process exec = Runtime.getRuntime().exec(str);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                if (readLine.contains(str2)) {
                    i = 1;
                    break;
                }
            } else {
                i = -1;
                break;
            }
        }
        try {
            if (exec.waitFor() != 0) {
                return -1;
            }
            return i;
        } catch (InterruptedException unused) {
            return -1;
        }
    }

    /* access modifiers changed from: private */
    public static void b(Context context, String[] strArr) {
        if (context != null) {
            SharedPreferences a2 = c.a(context.getApplicationContext(), "UM_PROBE_DATA", 0);
            if (a2 != null) {
                synchronized (f80792e) {
                    a2.edit().putString("_dsk_s", strArr[0]).putString("_thm_z", strArr[1]).putString("_gdf_r", strArr[2]).commit();
                }
            }
        }
    }
}
