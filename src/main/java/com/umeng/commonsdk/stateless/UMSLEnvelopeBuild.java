package com.umeng.commonsdk.stateless;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.proguard.s;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.idtracking.e;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.Iterator;
import org.json.JSONObject;

public class UMSLEnvelopeBuild {
    private static String cacheSystemheader;
    private static boolean isEncryptEnabled;
    public static Context mContext;
    public static String module;

    public static void setEncryptEnabled(boolean z) {
        isEncryptEnabled = z;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x0231 */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x021b A[Catch:{ Exception -> 0x0220 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0254 A[SYNTHETIC, Splitter:B:86:0x0254] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized org.json.JSONObject buildSLBaseHeader(android.content.Context r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.lang.String r0 = "walle"
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x02af }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02af }
            java.lang.String r4 = "[stateless] begin build hader, thread is "
            r3.<init>(r4)     // Catch:{ all -> 0x02af }
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x02af }
            r3.append(r4)     // Catch:{ all -> 0x02af }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x02af }
            r4 = 0
            r2[r4] = r3     // Catch:{ all -> 0x02af }
            com.umeng.commonsdk.statistics.common.ULog.i((java.lang.String) r0, (java.lang.Object[]) r2)     // Catch:{ all -> 0x02af }
            r0 = 0
            if (r10 != 0) goto L_0x0023
            monitor-exit(r9)
            return r0
        L_0x0023:
            android.content.Context r10 = r10.getApplicationContext()     // Catch:{ all -> 0x02af }
            java.lang.String r2 = cacheSystemheader     // Catch:{ Throwable -> 0x028e }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Throwable -> 0x028e }
            if (r2 != 0) goto L_0x003b
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0038 }
            java.lang.String r3 = cacheSystemheader     // Catch:{ Exception -> 0x0038 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0038 }
            goto L_0x01db
        L_0x0038:
            r2 = r0
            goto L_0x01db
        L_0x003b:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Throwable -> 0x028e }
            r2.<init>()     // Catch:{ Throwable -> 0x028e }
            java.lang.String r3 = "app_signature"
            java.lang.String r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAppMD5Signature(r10)     // Catch:{ Throwable -> 0x028e }
            r2.put(r3, r5)     // Catch:{ Throwable -> 0x028e }
            java.lang.String r3 = "app_sig_sha1"
            java.lang.String r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAppSHA1Key(r10)     // Catch:{ Throwable -> 0x028e }
            r2.put(r3, r5)     // Catch:{ Throwable -> 0x028e }
            java.lang.String r3 = "app_sig_sha"
            java.lang.String r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAppHashKey(r10)     // Catch:{ Throwable -> 0x028e }
            r2.put(r3, r5)     // Catch:{ Throwable -> 0x028e }
            java.lang.String r3 = "app_version"
            java.lang.String r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAppVersionName(r10)     // Catch:{ Throwable -> 0x028e }
            r2.put(r3, r5)     // Catch:{ Throwable -> 0x028e }
            java.lang.String r3 = "version_code"
            java.lang.String r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAppVersionCode(r10)     // Catch:{ Throwable -> 0x028e }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ Throwable -> 0x028e }
            r2.put(r3, r5)     // Catch:{ Throwable -> 0x028e }
            java.lang.String r3 = "idmd5"
            java.lang.String r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.getDeviceIdUmengMD5(r10)     // Catch:{ Throwable -> 0x028e }
            r2.put(r3, r5)     // Catch:{ Throwable -> 0x028e }
            java.lang.String r3 = "cpu"
            java.lang.String r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.getCPU()     // Catch:{ Throwable -> 0x028e }
            r2.put(r3, r5)     // Catch:{ Throwable -> 0x028e }
            java.lang.String r3 = com.umeng.commonsdk.statistics.common.DeviceConfig.getMCCMNC(r10)     // Catch:{ Throwable -> 0x028e }
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x028e }
            if (r5 != 0) goto L_0x0093
            java.lang.String r5 = "mccmnc"
            r2.put(r5, r3)     // Catch:{ Throwable -> 0x028e }
            goto L_0x009a
        L_0x0093:
            java.lang.String r3 = "mccmnc"
            java.lang.String r5 = ""
            r2.put(r3, r5)     // Catch:{ Throwable -> 0x028e }
        L_0x009a:
            java.lang.String r3 = com.umeng.commonsdk.statistics.common.DeviceConfig.getSubOSName(r10)     // Catch:{ Throwable -> 0x028e }
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x028e }
            if (r5 != 0) goto L_0x00a9
            java.lang.String r5 = "sub_os_name"
            r2.put(r5, r3)     // Catch:{ Throwable -> 0x028e }
        L_0x00a9:
            java.lang.String r3 = com.umeng.commonsdk.statistics.common.DeviceConfig.getSubOSVersion(r10)     // Catch:{ Throwable -> 0x028e }
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x028e }
            if (r5 != 0) goto L_0x00b8
            java.lang.String r5 = "sub_os_version"
            r2.put(r5, r3)     // Catch:{ Throwable -> 0x028e }
        L_0x00b8:
            java.lang.String r3 = com.umeng.commonsdk.statistics.common.DeviceConfig.getDeviceType(r10)     // Catch:{ Throwable -> 0x028e }
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x028e }
            if (r5 != 0) goto L_0x00c7
            java.lang.String r5 = "device_type"
            r2.put(r5, r3)     // Catch:{ Throwable -> 0x028e }
        L_0x00c7:
            java.lang.String r3 = "package_name"
            java.lang.String r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.getPackageName(r10)     // Catch:{ Throwable -> 0x028e }
            r2.put(r3, r5)     // Catch:{ Throwable -> 0x028e }
            java.lang.String r3 = "sdk_type"
            java.lang.String r5 = "Android"
            r2.put(r3, r5)     // Catch:{ Throwable -> 0x028e }
            java.lang.String r3 = "device_id"
            java.lang.String r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.getDeviceId(r10)     // Catch:{ Throwable -> 0x028e }
            r2.put(r3, r5)     // Catch:{ Throwable -> 0x028e }
            java.lang.String r3 = "device_model"
            java.lang.String r5 = android.os.Build.MODEL     // Catch:{ Throwable -> 0x028e }
            r2.put(r3, r5)     // Catch:{ Throwable -> 0x028e }
            java.lang.String r3 = "device_board"
            java.lang.String r5 = android.os.Build.BOARD     // Catch:{ Throwable -> 0x028e }
            r2.put(r3, r5)     // Catch:{ Throwable -> 0x028e }
            java.lang.String r3 = "device_brand"
            java.lang.String r5 = android.os.Build.BRAND     // Catch:{ Throwable -> 0x028e }
            r2.put(r3, r5)     // Catch:{ Throwable -> 0x028e }
            java.lang.String r3 = "device_manutime"
            long r5 = android.os.Build.TIME     // Catch:{ Throwable -> 0x028e }
            r2.put(r3, r5)     // Catch:{ Throwable -> 0x028e }
            java.lang.String r3 = "device_manufacturer"
            java.lang.String r5 = android.os.Build.MANUFACTURER     // Catch:{ Throwable -> 0x028e }
            r2.put(r3, r5)     // Catch:{ Throwable -> 0x028e }
            java.lang.String r3 = "device_manuid"
            java.lang.String r5 = android.os.Build.ID     // Catch:{ Throwable -> 0x028e }
            r2.put(r3, r5)     // Catch:{ Throwable -> 0x028e }
            java.lang.String r3 = "device_name"
            java.lang.String r5 = android.os.Build.DEVICE     // Catch:{ Throwable -> 0x028e }
            r2.put(r3, r5)     // Catch:{ Throwable -> 0x028e }
            java.lang.String r3 = "os"
            java.lang.String r5 = "Android"
            r2.put(r3, r5)     // Catch:{ Throwable -> 0x028e }
            java.lang.String r3 = "os_version"
            java.lang.String r5 = android.os.Build.VERSION.RELEASE     // Catch:{ Throwable -> 0x028e }
            r2.put(r3, r5)     // Catch:{ Throwable -> 0x028e }
            int[] r3 = com.umeng.commonsdk.statistics.common.DeviceConfig.getResolutionArray(r10)     // Catch:{ Throwable -> 0x028e }
            if (r3 == 0) goto L_0x0142
            java.lang.String r5 = "resolution"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x028e }
            r6.<init>()     // Catch:{ Throwable -> 0x028e }
            r7 = r3[r1]     // Catch:{ Throwable -> 0x028e }
            r6.append(r7)     // Catch:{ Throwable -> 0x028e }
            java.lang.String r7 = "*"
            r6.append(r7)     // Catch:{ Throwable -> 0x028e }
            r3 = r3[r4]     // Catch:{ Throwable -> 0x028e }
            r6.append(r3)     // Catch:{ Throwable -> 0x028e }
            java.lang.String r3 = r6.toString()     // Catch:{ Throwable -> 0x028e }
            r2.put(r5, r3)     // Catch:{ Throwable -> 0x028e }
        L_0x0142:
            java.lang.String r3 = "mc"
            java.lang.String r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.getMac(r10)     // Catch:{ Throwable -> 0x028e }
            r2.put(r3, r5)     // Catch:{ Throwable -> 0x028e }
            java.lang.String r3 = "timezone"
            int r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.getTimeZone(r10)     // Catch:{ Throwable -> 0x028e }
            r2.put(r3, r5)     // Catch:{ Throwable -> 0x028e }
            java.lang.String[] r3 = com.umeng.commonsdk.statistics.common.DeviceConfig.getLocaleInfo(r10)     // Catch:{ Throwable -> 0x028e }
            java.lang.String r5 = "country"
            r6 = r3[r4]     // Catch:{ Throwable -> 0x028e }
            r2.put(r5, r6)     // Catch:{ Throwable -> 0x028e }
            java.lang.String r5 = "language"
            r3 = r3[r1]     // Catch:{ Throwable -> 0x028e }
            r2.put(r5, r3)     // Catch:{ Throwable -> 0x028e }
            java.lang.String r3 = "carrier"
            java.lang.String r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.getNetworkOperatorName(r10)     // Catch:{ Throwable -> 0x028e }
            r2.put(r3, r5)     // Catch:{ Throwable -> 0x028e }
            java.lang.String r3 = "display_name"
            java.lang.String r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAppName(r10)     // Catch:{ Throwable -> 0x028e }
            r2.put(r3, r5)     // Catch:{ Throwable -> 0x028e }
            java.lang.String[] r3 = com.umeng.commonsdk.statistics.common.DeviceConfig.getNetworkAccessMode(r10)     // Catch:{ Throwable -> 0x028e }
            java.lang.String r5 = "Wi-Fi"
            r6 = r3[r4]     // Catch:{ Throwable -> 0x028e }
            boolean r5 = r5.equals(r6)     // Catch:{ Throwable -> 0x028e }
            if (r5 == 0) goto L_0x018e
            java.lang.String r5 = "access"
            java.lang.String r6 = "wifi"
            r2.put(r5, r6)     // Catch:{ Throwable -> 0x028e }
            goto L_0x01a7
        L_0x018e:
            java.lang.String r5 = "2G/3G"
            r6 = r3[r4]     // Catch:{ Throwable -> 0x028e }
            boolean r5 = r5.equals(r6)     // Catch:{ Throwable -> 0x028e }
            if (r5 == 0) goto L_0x01a0
            java.lang.String r5 = "access"
            java.lang.String r6 = "2G/3G"
            r2.put(r5, r6)     // Catch:{ Throwable -> 0x028e }
            goto L_0x01a7
        L_0x01a0:
            java.lang.String r5 = "access"
            java.lang.String r6 = "unknow"
            r2.put(r5, r6)     // Catch:{ Throwable -> 0x028e }
        L_0x01a7:
            java.lang.String r5 = ""
            r6 = r3[r1]     // Catch:{ Throwable -> 0x028e }
            boolean r5 = r5.equals(r6)     // Catch:{ Throwable -> 0x028e }
            if (r5 != 0) goto L_0x01b8
            java.lang.String r5 = "access_subtype"
            r3 = r3[r1]     // Catch:{ Throwable -> 0x028e }
            r2.put(r5, r3)     // Catch:{ Throwable -> 0x028e }
        L_0x01b8:
            java.lang.String r3 = "com_ver"
            java.lang.String r5 = "2.0.1"
            r2.put(r3, r5)     // Catch:{ Throwable -> 0x028e }
            java.lang.String r3 = "com_type"
            int r5 = com.umeng.commonsdk.statistics.SdkVersion.SDK_TYPE     // Catch:{ Throwable -> 0x028e }
            r2.put(r3, r5)     // Catch:{ Throwable -> 0x028e }
            java.lang.String r3 = module     // Catch:{ Throwable -> 0x028e }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x028e }
            if (r3 != 0) goto L_0x01d5
            java.lang.String r3 = "module"
            java.lang.String r5 = module     // Catch:{ Throwable -> 0x028e }
            r2.put(r3, r5)     // Catch:{ Throwable -> 0x028e }
        L_0x01d5:
            java.lang.String r3 = r2.toString()     // Catch:{ Throwable -> 0x028e }
            cacheSystemheader = r3     // Catch:{ Throwable -> 0x028e }
        L_0x01db:
            if (r2 != 0) goto L_0x01df
            monitor-exit(r9)
            return r0
        L_0x01df:
            java.lang.String r3 = "channel"
            java.lang.String r5 = com.umeng.commonsdk.utils.UMUtils.getChannel(r10)     // Catch:{ Throwable -> 0x028e }
            r2.put(r3, r5)     // Catch:{ Throwable -> 0x028e }
            java.lang.String r3 = "appkey"
            java.lang.String r5 = com.umeng.commonsdk.utils.UMUtils.getAppkey(r10)     // Catch:{ Throwable -> 0x028e }
            r2.put(r3, r5)     // Catch:{ Throwable -> 0x028e }
            int r3 = com.umeng.commonsdk.statistics.SdkVersion.SDK_TYPE     // Catch:{ Exception -> 0x0220 }
            if (r3 == r1) goto L_0x0220
            java.lang.String r3 = "com.umeng.commonsdk.internal.utils.SDStorageAgent"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException | Throwable -> 0x0214 }
            if (r3 == 0) goto L_0x0214
            java.lang.String r5 = "getUmtt"
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | Throwable -> 0x0214 }
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r4] = r7     // Catch:{ ClassNotFoundException | Throwable -> 0x0214 }
            java.lang.reflect.Method r5 = r3.getMethod(r5, r6)     // Catch:{ ClassNotFoundException | Throwable -> 0x0214 }
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ ClassNotFoundException | Throwable -> 0x0214 }
            r6[r4] = r10     // Catch:{ ClassNotFoundException | Throwable -> 0x0214 }
            java.lang.Object r3 = r5.invoke(r3, r6)     // Catch:{ ClassNotFoundException | Throwable -> 0x0214 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ ClassNotFoundException | Throwable -> 0x0214 }
            goto L_0x0215
        L_0x0214:
            r3 = r0
        L_0x0215:
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0220 }
            if (r5 != 0) goto L_0x0220
            java.lang.String r5 = "umtt"
            r2.put(r5, r3)     // Catch:{ Exception -> 0x0220 }
        L_0x0220:
            java.lang.String r3 = "umid"
            java.lang.String r3 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r10, r3, r0)     // Catch:{ Exception -> 0x0231 }
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0231 }
            if (r5 != 0) goto L_0x0231
            java.lang.String r5 = "umid"
            r2.put(r5, r3)     // Catch:{ Exception -> 0x0231 }
        L_0x0231:
            int r3 = com.umeng.commonsdk.statistics.SdkVersion.SDK_TYPE     // Catch:{ Exception -> 0x0244 }
            if (r3 == r1) goto L_0x0244
            java.lang.String r3 = com.umeng.commonsdk.proguard.a.b(r10)     // Catch:{ Exception -> 0x0244 }
            if (r3 == 0) goto L_0x0244
            java.lang.String r3 = "utoken"
            java.lang.String r5 = com.umeng.commonsdk.proguard.a.b(r10)     // Catch:{ Exception -> 0x0244 }
            r2.put(r3, r5)     // Catch:{ Exception -> 0x0244 }
        L_0x0244:
            java.lang.String r3 = "wrapper_type"
            java.lang.String r5 = com.umeng.commonsdk.stateless.a.f80882a     // Catch:{ Exception -> 0x0252 }
            r2.put(r3, r5)     // Catch:{ Exception -> 0x0252 }
            java.lang.String r3 = "wrapper_version"
            java.lang.String r5 = com.umeng.commonsdk.stateless.a.f80883b     // Catch:{ Exception -> 0x0252 }
            r2.put(r3, r5)     // Catch:{ Exception -> 0x0252 }
        L_0x0252:
            if (r2 == 0) goto L_0x0292
            int r3 = r2.length()     // Catch:{ Throwable -> 0x028e }
            if (r3 <= 0) goto L_0x0292
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Throwable -> 0x028e }
            r3.<init>()     // Catch:{ Throwable -> 0x028e }
            java.lang.String r5 = "walle"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x028e }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x028e }
            java.lang.String r8 = "[stateless] build header end , header is "
            r7.<init>(r8)     // Catch:{ Throwable -> 0x028e }
            java.lang.String r8 = r2.toString()     // Catch:{ Throwable -> 0x028e }
            r7.append(r8)     // Catch:{ Throwable -> 0x028e }
            java.lang.String r8 = ", thread is "
            r7.append(r8)     // Catch:{ Throwable -> 0x028e }
            java.lang.Thread r8 = java.lang.Thread.currentThread()     // Catch:{ Throwable -> 0x028e }
            r7.append(r8)     // Catch:{ Throwable -> 0x028e }
            java.lang.String r7 = r7.toString()     // Catch:{ Throwable -> 0x028e }
            r6[r4] = r7     // Catch:{ Throwable -> 0x028e }
            com.umeng.commonsdk.statistics.common.ULog.i((java.lang.String) r5, (java.lang.Object[]) r6)     // Catch:{ Throwable -> 0x028e }
            java.lang.String r5 = "header"
            org.json.JSONObject r2 = r3.put(r5, r2)     // Catch:{ Throwable -> 0x028e }
            monitor-exit(r9)
            return r2
        L_0x028e:
            r2 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r10, r2)     // Catch:{ all -> 0x02af }
        L_0x0292:
            java.lang.String r10 = "walle"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x02af }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x02af }
            java.lang.String r3 = "[stateless] build header end , header is null !!! thread is "
            r2.<init>(r3)     // Catch:{ all -> 0x02af }
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x02af }
            r2.append(r3)     // Catch:{ all -> 0x02af }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x02af }
            r1[r4] = r2     // Catch:{ all -> 0x02af }
            com.umeng.commonsdk.statistics.common.ULog.i((java.lang.String) r10, (java.lang.Object[]) r1)     // Catch:{ all -> 0x02af }
            monitor-exit(r9)
            return r0
        L_0x02af:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.stateless.UMSLEnvelopeBuild.buildSLBaseHeader(android.content.Context):org.json.JSONObject");
    }

    private synchronized JSONObject makeErrorResult(int i, JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject != null) {
            try {
                jSONObject.put("exception", i);
            } catch (Exception unused) {
            }
        } else {
            jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("exception", i);
            } catch (Exception unused2) {
            }
        }
        return jSONObject2;
        return jSONObject;
    }

    private synchronized c constructEnvelope(Context context, byte[] bArr) {
        c cVar;
        int i = -1;
        String imprintProperty = UMEnvelopeBuild.imprintProperty(context, "slcodex", null);
        ULog.i("walle", "[stateless] build envelope, codexStr is " + imprintProperty);
        try {
            if (!TextUtils.isEmpty(imprintProperty)) {
                i = Integer.valueOf(imprintProperty).intValue();
            }
        } catch (NumberFormatException e2) {
            UMCrashManager.reportCrash(context, e2);
        }
        if (i == 0) {
            ULog.i("walle", "[stateless] build envelope, codexValue is 0");
            cVar = c.a(context, UMUtils.getAppkey(context), bArr);
        } else if (i == 1) {
            ULog.i("walle", "[stateless] build envelope, codexValue is 1");
            cVar = c.b(context, UMUtils.getAppkey(context), bArr);
        } else if (isEncryptEnabled) {
            ULog.i("walle", "[stateless] build envelope, isEncryptEnabled is true");
            cVar = c.b(context, UMUtils.getAppkey(context), bArr);
        } else {
            ULog.i("walle", "[stateless] build envelope, isEncryptEnabled is false");
            cVar = c.a(context, UMUtils.getAppkey(context), bArr);
        }
        return cVar;
    }

    public synchronized JSONObject buildSLEnvelope(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        Throwable th;
        Context context2;
        c cVar;
        ULog.i("walle", "[stateless] build envelope, heade is " + jSONObject.toString());
        ULog.i("walle", "[stateless] build envelope, body is " + jSONObject2.toString());
        ULog.i("walle", "[stateless] build envelope, thread is " + Thread.currentThread());
        if (context == null || jSONObject == null || jSONObject2 == null || str == null) {
            ULog.i("walle", "[stateless] build envelope, context is null or header is null or body is null");
            return makeErrorResult(110, null);
        }
        try {
            context2 = context.getApplicationContext();
            if (!(jSONObject == null || jSONObject2 == null)) {
                try {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (next != null && (next instanceof String)) {
                            String str2 = next;
                            if (!(str2 == null || jSONObject2.opt(str2) == null)) {
                                try {
                                    jSONObject.put(str2, jSONObject2.opt(str2));
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    UMCrashManager.reportCrash(context2, th);
                    ULog.i("walle", "build envelope end, thread is " + Thread.currentThread());
                    return makeErrorResult(110, null);
                }
            }
            if (jSONObject != null) {
                try {
                    e a2 = e.a(context2);
                    if (a2 != null) {
                        a2.a();
                        String encodeToString = Base64.encodeToString(new s().a(a2.b()), 0);
                        if (!TextUtils.isEmpty(encodeToString)) {
                            JSONObject jSONObject3 = jSONObject.getJSONObject("header");
                            jSONObject3.put("id_tracking", encodeToString);
                            jSONObject.put("header", jSONObject3);
                        }
                    }
                } catch (Exception unused2) {
                }
            }
            if (jSONObject != null) {
                if (f.a((long) jSONObject.toString().getBytes().length, a.f80884c)) {
                    ULog.i("walle", "[stateless] build envelope, json overstep!!!! size is " + jSONObject.toString().getBytes().length);
                    return makeErrorResult(113, jSONObject);
                }
            }
            ULog.i("walle", "[stateless] build envelope, json size is " + jSONObject.toString().getBytes().length);
            if (jSONObject != null) {
                cVar = constructEnvelope(context2, jSONObject.toString().getBytes());
                if (cVar == null) {
                    ULog.i("walle", "[stateless] build envelope, envelope is null !!!!");
                    return makeErrorResult(111, jSONObject);
                }
            } else {
                cVar = null;
            }
            if (cVar != null) {
                if (f.a((long) cVar.b().length, a.f80885d)) {
                    ULog.i("walle", "[stateless] build envelope, envelope overstep!!!! size is " + cVar.b().length);
                    return makeErrorResult(114, jSONObject);
                }
            }
            if (!f.a(context2, Base64.encodeToString(str.getBytes(), 0), Base64.encodeToString((str + "_" + System.currentTimeMillis()).getBytes(), 0), cVar.b())) {
                ULog.i("walle", "[stateless] build envelope, save fail ----->>>>>");
                return makeErrorResult(BaseLoginOrRegisterActivity.o, jSONObject);
            }
            ULog.i("walle", "[stateless] build envelope, save ok ----->>>>>");
            ULog.i("walle", "[stateless] envelope file size is " + jSONObject.toString().getBytes().length);
            new d(context2);
            d.b(273);
            ULog.i("walle", "[stateless] build envelope end, thread is " + Thread.currentThread());
            return jSONObject;
        } catch (Throwable th3) {
            context2 = context;
            th = th3;
            UMCrashManager.reportCrash(context2, th);
            ULog.i("walle", "build envelope end, thread is " + Thread.currentThread());
            return makeErrorResult(110, null);
        }
    }
}
