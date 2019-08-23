package com.umeng.commonsdk.internal.crash;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.ULog;

public class UMCrashManager {
    public static boolean isReportCrash;
    public static Object mObject = new Object();

    public static void reportCrash(final Context context, final Throwable th) {
        if (!isReportCrash) {
            ULog.i("walle-crash", "report is " + isReportCrash);
            new Thread(new Runnable() {
                /* JADX WARNING: Can't wrap try/catch for region: R(5:3|4|(2:10|(4:12|13|14|(1:16)))|17|18) */
                /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x00a9 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r7 = this;
                        java.lang.Object r0 = com.umeng.commonsdk.internal.crash.UMCrashManager.mObject     // Catch:{ Throwable -> 0x00ae }
                        monitor-enter(r0)     // Catch:{ Throwable -> 0x00ae }
                        android.content.Context r1 = r5     // Catch:{ all -> 0x00ab }
                        if (r1 == 0) goto L_0x00a9
                        java.lang.Throwable r1 = r6     // Catch:{ all -> 0x00ab }
                        if (r1 == 0) goto L_0x00a9
                        boolean r1 = com.umeng.commonsdk.internal.crash.UMCrashManager.isReportCrash     // Catch:{ all -> 0x00ab }
                        if (r1 != 0) goto L_0x00a9
                        r1 = 1
                        com.umeng.commonsdk.internal.crash.UMCrashManager.isReportCrash = r1     // Catch:{ all -> 0x00ab }
                        java.lang.String r2 = "walle-crash"
                        java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00ab }
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
                        java.lang.String r4 = "report thread is "
                        r3.<init>(r4)     // Catch:{ all -> 0x00ab }
                        boolean r4 = com.umeng.commonsdk.internal.crash.UMCrashManager.isReportCrash     // Catch:{ all -> 0x00ab }
                        r3.append(r4)     // Catch:{ all -> 0x00ab }
                        java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00ab }
                        r4 = 0
                        r1[r4] = r3     // Catch:{ all -> 0x00ab }
                        com.umeng.commonsdk.statistics.common.ULog.i((java.lang.String) r2, (java.lang.Object[]) r1)     // Catch:{ all -> 0x00ab }
                        java.lang.Throwable r1 = r6     // Catch:{ all -> 0x00ab }
                        java.lang.String r1 = com.umeng.commonsdk.internal.crash.a.a(r1)     // Catch:{ all -> 0x00ab }
                        boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00ab }
                        if (r2 != 0) goto L_0x00a9
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
                        r2.<init>()     // Catch:{ all -> 0x00ab }
                        android.content.Context r3 = r5     // Catch:{ all -> 0x00ab }
                        java.io.File r3 = r3.getFilesDir()     // Catch:{ all -> 0x00ab }
                        r2.append(r3)     // Catch:{ all -> 0x00ab }
                        java.lang.String r3 = "/stateless"
                        r2.append(r3)     // Catch:{ all -> 0x00ab }
                        java.lang.String r3 = "/"
                        r2.append(r3)     // Catch:{ all -> 0x00ab }
                        java.lang.String r3 = "umpx_internal"
                        byte[] r3 = r3.getBytes()     // Catch:{ all -> 0x00ab }
                        java.lang.String r3 = android.util.Base64.encodeToString(r3, r4)     // Catch:{ all -> 0x00ab }
                        r2.append(r3)     // Catch:{ all -> 0x00ab }
                        java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00ab }
                        android.content.Context r3 = r5     // Catch:{ all -> 0x00ab }
                        r4 = 10
                        com.umeng.commonsdk.stateless.f.a(r3, r2, r4)     // Catch:{ all -> 0x00ab }
                        com.umeng.commonsdk.stateless.UMSLEnvelopeBuild r2 = new com.umeng.commonsdk.stateless.UMSLEnvelopeBuild     // Catch:{ all -> 0x00ab }
                        r2.<init>()     // Catch:{ all -> 0x00ab }
                        android.content.Context r3 = r5     // Catch:{ all -> 0x00ab }
                        org.json.JSONObject r3 = r2.buildSLBaseHeader(r3)     // Catch:{ all -> 0x00ab }
                        org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00a9 }
                        r4.<init>()     // Catch:{ JSONException -> 0x00a9 }
                        java.lang.String r5 = "content"
                        r4.put(r5, r1)     // Catch:{ JSONException -> 0x00a9 }
                        java.lang.String r1 = "ts"
                        long r5 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x00a9 }
                        r4.put(r1, r5)     // Catch:{ JSONException -> 0x00a9 }
                        org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00a9 }
                        r1.<init>()     // Catch:{ JSONException -> 0x00a9 }
                        java.lang.String r5 = "crash"
                        r1.put(r5, r4)     // Catch:{ JSONException -> 0x00a9 }
                        org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00a9 }
                        r4.<init>()     // Catch:{ JSONException -> 0x00a9 }
                        java.lang.String r5 = "tp"
                        r4.put(r5, r1)     // Catch:{ JSONException -> 0x00a9 }
                        android.content.Context r1 = r5     // Catch:{ JSONException -> 0x00a9 }
                        java.lang.String r5 = "umpx_internal"
                        org.json.JSONObject r1 = r2.buildSLEnvelope(r1, r3, r4, r5)     // Catch:{ JSONException -> 0x00a9 }
                        if (r1 == 0) goto L_0x00a9
                        java.lang.String r2 = "exception"
                        r1.has(r2)     // Catch:{ JSONException -> 0x00a9 }
                    L_0x00a9:
                        monitor-exit(r0)     // Catch:{ all -> 0x00ab }
                        goto L_0x00ae
                    L_0x00ab:
                        r1 = move-exception
                        monitor-exit(r0)     // Catch:{ all -> 0x00ab }
                        throw r1     // Catch:{ Throwable -> 0x00ae }
                    L_0x00ae:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.crash.UMCrashManager.AnonymousClass1.run():void");
                }
            }).start();
        }
    }
}
