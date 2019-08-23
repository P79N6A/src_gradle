package com.umeng.commonsdk.proguard;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.commonsdk.statistics.common.ULog;
import org.json.JSONArray;
import org.json.JSONException;

public class c {
    /* access modifiers changed from: private */
    public static boolean g = true;

    public static void a(final Context context) {
        ULog.i("UMSysLocationCache", "begin location");
        if (context != null) {
            try {
                new Thread(new Runnable() {
                    /* JADX WARNING: Can't wrap try/catch for region: R(3:17|18|19) */
                    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
                        com.umeng.commonsdk.proguard.c.a(false);
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004f, code lost:
                        return;
                     */
                    /* JADX WARNING: Failed to process nested try/catch */
                    /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
                    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004c */
                    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:23:0x0000, LOOP_START, SYNTHETIC, Splitter:B:0:0x0000] */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void run() {
                        /*
                            r6 = this;
                        L_0x0000:
                            boolean r0 = com.umeng.commonsdk.proguard.c.g     // Catch:{ Throwable -> 0x0051 }
                            if (r0 == 0) goto L_0x0050
                            r0 = 0
                            android.content.Context r1 = r4     // Catch:{ Throwable -> 0x004c }
                            org.json.JSONArray r1 = com.umeng.commonsdk.proguard.c.b(r1)     // Catch:{ Throwable -> 0x004c }
                            if (r1 == 0) goto L_0x001b
                            int r1 = r1.length()     // Catch:{ Throwable -> 0x004c }
                            r2 = 200(0xc8, float:2.8E-43)
                            if (r1 < r2) goto L_0x001b
                            boolean unused = com.umeng.commonsdk.proguard.c.g = r0     // Catch:{ Throwable -> 0x004c }
                            return
                        L_0x001b:
                            java.lang.String r1 = "UMSysLocationCache"
                            r2 = 1
                            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Throwable -> 0x0051 }
                            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0051 }
                            java.lang.String r4 = "location status is ok, time is "
                            r3.<init>(r4)     // Catch:{ Throwable -> 0x0051 }
                            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0051 }
                            r3.append(r4)     // Catch:{ Throwable -> 0x0051 }
                            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x0051 }
                            r2[r0] = r3     // Catch:{ Throwable -> 0x0051 }
                            com.umeng.commonsdk.statistics.common.ULog.i((java.lang.String) r1, (java.lang.Object[]) r2)     // Catch:{ Throwable -> 0x0051 }
                            com.umeng.commonsdk.proguard.b r0 = new com.umeng.commonsdk.proguard.b     // Catch:{ Throwable -> 0x0051 }
                            android.content.Context r1 = r4     // Catch:{ Throwable -> 0x0051 }
                            r0.<init>(r1)     // Catch:{ Throwable -> 0x0051 }
                            com.umeng.commonsdk.proguard.c$1$1 r1 = new com.umeng.commonsdk.proguard.c$1$1     // Catch:{ Throwable -> 0x0051 }
                            r1.<init>(r0)     // Catch:{ Throwable -> 0x0051 }
                            r0.a(r1)     // Catch:{ Throwable -> 0x0051 }
                            r0 = 30000(0x7530, double:1.4822E-319)
                            java.lang.Thread.sleep(r0)     // Catch:{ Exception -> 0x0000 }
                            goto L_0x0000
                        L_0x004c:
                            boolean unused = com.umeng.commonsdk.proguard.c.g = r0     // Catch:{ Throwable -> 0x0051 }
                            return
                        L_0x0050:
                            return
                        L_0x0051:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.proguard.c.AnonymousClass1.run():void");
                    }
                }).start();
            } catch (Exception unused) {
            }
        }
    }

    public static void c(Context context) {
        try {
            SharedPreferences a2 = com.ss.android.ugc.aweme.q.c.a(context, "umeng_common_location", 0);
            if (a2 != null) {
                SharedPreferences.Editor edit = a2.edit();
                edit.putString("location_json_array", "");
                edit.commit();
                ULog.i("UMSysLocationCache", "delete is ok~~");
            }
        } catch (Throwable unused) {
        }
    }

    public static JSONArray b(Context context) {
        SharedPreferences a2 = com.ss.android.ugc.aweme.q.c.a(context, "umeng_common_location", 0);
        JSONArray jSONArray = null;
        if (a2 == null) {
            return null;
        }
        try {
            String string = a2.getString("location_json_array", "");
            if (!TextUtils.isEmpty(string)) {
                jSONArray = new JSONArray(string);
            }
        } catch (JSONException e2) {
            ULog.i("UMSysLocationCache", "e is " + e2);
        } catch (Throwable th) {
            ULog.i("UMSysLocationCache", "e is " + th);
        }
        if (jSONArray != null) {
            ULog.i("UMSysLocationCache", "get json str is " + jSONArray.toString());
        }
        return jSONArray;
    }
}
