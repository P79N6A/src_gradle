package com.umeng.commonsdk.statistics;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.proguard.s;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.idtracking.Envelope;
import com.umeng.commonsdk.statistics.idtracking.e;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static String f80920a = null;

    /* renamed from: b  reason: collision with root package name */
    public static String f80921b = "";

    /* renamed from: d  reason: collision with root package name */
    private static String f80922d;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f80923f;

    /* renamed from: e  reason: collision with root package name */
    private int f80924e;

    public static void a(boolean z) {
        f80923f = z;
    }

    public static long a(Context context) {
        long j = DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX - DataHelper.ENVELOPE_EXTRA_LENGTH;
        JSONObject b2 = b(context);
        if (b2 == null || b2.toString() == null || b2.toString().getBytes() == null) {
            return j;
        }
        return j - ((long) b2.toString().getBytes().length);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(25:42|43|44|45|47|48|49|50|(1:52)|56|57|(8:59|60|61|(4:63|66|67|(1:69))|64|66|67|(0))|73|74|75|(1:77)|(3:81|82|(1:86))|87|89|90|91|92|(3:96|97|98)|(2:105|106)|109) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x0272 */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0231 A[Catch:{ Exception -> 0x0237 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static org.json.JSONObject b(android.content.Context r9) {
        /*
            r0 = 0
            android.content.SharedPreferences r1 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r9)     // Catch:{ Throwable -> 0x02a1 }
            java.lang.String r2 = f80922d     // Catch:{ Throwable -> 0x02a1 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Throwable -> 0x02a1 }
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x001b
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0018 }
            java.lang.String r5 = f80922d     // Catch:{ Exception -> 0x0018 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0018 }
            goto L_0x01bd
        L_0x0018:
            r2 = r0
            goto L_0x01bd
        L_0x001b:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Throwable -> 0x02a1 }
            r2.<init>()     // Catch:{ Throwable -> 0x02a1 }
            java.lang.String r5 = "app_signature"
            java.lang.String r6 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAppMD5Signature(r9)     // Catch:{ Throwable -> 0x02a1 }
            r2.put(r5, r6)     // Catch:{ Throwable -> 0x02a1 }
            java.lang.String r5 = "app_sig_sha1"
            java.lang.String r6 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAppSHA1Key(r9)     // Catch:{ Throwable -> 0x02a1 }
            r2.put(r5, r6)     // Catch:{ Throwable -> 0x02a1 }
            java.lang.String r5 = "app_sig_sha"
            java.lang.String r6 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAppHashKey(r9)     // Catch:{ Throwable -> 0x02a1 }
            r2.put(r5, r6)     // Catch:{ Throwable -> 0x02a1 }
            java.lang.String r5 = "app_version"
            java.lang.String r6 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAppVersionName(r9)     // Catch:{ Throwable -> 0x02a1 }
            r2.put(r5, r6)     // Catch:{ Throwable -> 0x02a1 }
            java.lang.String r5 = "version_code"
            java.lang.String r6 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAppVersionCode(r9)     // Catch:{ Throwable -> 0x02a1 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ Throwable -> 0x02a1 }
            r2.put(r5, r6)     // Catch:{ Throwable -> 0x02a1 }
            java.lang.String r5 = "idmd5"
            java.lang.String r6 = com.umeng.commonsdk.statistics.common.DeviceConfig.getDeviceIdUmengMD5(r9)     // Catch:{ Throwable -> 0x02a1 }
            r2.put(r5, r6)     // Catch:{ Throwable -> 0x02a1 }
            java.lang.String r5 = "cpu"
            java.lang.String r6 = com.umeng.commonsdk.statistics.common.DeviceConfig.getCPU()     // Catch:{ Throwable -> 0x02a1 }
            r2.put(r5, r6)     // Catch:{ Throwable -> 0x02a1 }
            java.lang.String r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.getMCCMNC(r9)     // Catch:{ Throwable -> 0x02a1 }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x02a1 }
            if (r6 != 0) goto L_0x0075
            java.lang.String r6 = "mccmnc"
            r2.put(r6, r5)     // Catch:{ Throwable -> 0x02a1 }
            f80921b = r5     // Catch:{ Throwable -> 0x02a1 }
            goto L_0x007c
        L_0x0075:
            java.lang.String r5 = "mccmnc"
            java.lang.String r6 = ""
            r2.put(r5, r6)     // Catch:{ Throwable -> 0x02a1 }
        L_0x007c:
            java.lang.String r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.getSubOSName(r9)     // Catch:{ Throwable -> 0x02a1 }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x02a1 }
            if (r6 != 0) goto L_0x008b
            java.lang.String r6 = "sub_os_name"
            r2.put(r6, r5)     // Catch:{ Throwable -> 0x02a1 }
        L_0x008b:
            java.lang.String r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.getSubOSVersion(r9)     // Catch:{ Throwable -> 0x02a1 }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x02a1 }
            if (r6 != 0) goto L_0x009a
            java.lang.String r6 = "sub_os_version"
            r2.put(r6, r5)     // Catch:{ Throwable -> 0x02a1 }
        L_0x009a:
            java.lang.String r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.getDeviceType(r9)     // Catch:{ Throwable -> 0x02a1 }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x02a1 }
            if (r6 != 0) goto L_0x00a9
            java.lang.String r6 = "device_type"
            r2.put(r6, r5)     // Catch:{ Throwable -> 0x02a1 }
        L_0x00a9:
            java.lang.String r5 = "package_name"
            java.lang.String r6 = com.umeng.commonsdk.statistics.common.DeviceConfig.getPackageName(r9)     // Catch:{ Throwable -> 0x02a1 }
            r2.put(r5, r6)     // Catch:{ Throwable -> 0x02a1 }
            java.lang.String r5 = "sdk_type"
            java.lang.String r6 = "Android"
            r2.put(r5, r6)     // Catch:{ Throwable -> 0x02a1 }
            java.lang.String r5 = "device_id"
            java.lang.String r6 = com.umeng.commonsdk.statistics.common.DeviceConfig.getDeviceId(r9)     // Catch:{ Throwable -> 0x02a1 }
            r2.put(r5, r6)     // Catch:{ Throwable -> 0x02a1 }
            java.lang.String r5 = "device_model"
            java.lang.String r6 = android.os.Build.MODEL     // Catch:{ Throwable -> 0x02a1 }
            r2.put(r5, r6)     // Catch:{ Throwable -> 0x02a1 }
            java.lang.String r5 = "device_board"
            java.lang.String r6 = android.os.Build.BOARD     // Catch:{ Throwable -> 0x02a1 }
            r2.put(r5, r6)     // Catch:{ Throwable -> 0x02a1 }
            java.lang.String r5 = "device_brand"
            java.lang.String r6 = android.os.Build.BRAND     // Catch:{ Throwable -> 0x02a1 }
            r2.put(r5, r6)     // Catch:{ Throwable -> 0x02a1 }
            java.lang.String r5 = "device_manutime"
            long r6 = android.os.Build.TIME     // Catch:{ Throwable -> 0x02a1 }
            r2.put(r5, r6)     // Catch:{ Throwable -> 0x02a1 }
            java.lang.String r5 = "device_manufacturer"
            java.lang.String r6 = android.os.Build.MANUFACTURER     // Catch:{ Throwable -> 0x02a1 }
            r2.put(r5, r6)     // Catch:{ Throwable -> 0x02a1 }
            java.lang.String r5 = "device_manuid"
            java.lang.String r6 = android.os.Build.ID     // Catch:{ Throwable -> 0x02a1 }
            r2.put(r5, r6)     // Catch:{ Throwable -> 0x02a1 }
            java.lang.String r5 = "device_name"
            java.lang.String r6 = android.os.Build.DEVICE     // Catch:{ Throwable -> 0x02a1 }
            r2.put(r5, r6)     // Catch:{ Throwable -> 0x02a1 }
            java.lang.String r5 = "os"
            java.lang.String r6 = "Android"
            r2.put(r5, r6)     // Catch:{ Throwable -> 0x02a1 }
            java.lang.String r5 = "os_version"
            java.lang.String r6 = android.os.Build.VERSION.RELEASE     // Catch:{ Throwable -> 0x02a1 }
            r2.put(r5, r6)     // Catch:{ Throwable -> 0x02a1 }
            int[] r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.getResolutionArray(r9)     // Catch:{ Throwable -> 0x02a1 }
            if (r5 == 0) goto L_0x0124
            java.lang.String r6 = "resolution"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x02a1 }
            r7.<init>()     // Catch:{ Throwable -> 0x02a1 }
            r8 = r5[r3]     // Catch:{ Throwable -> 0x02a1 }
            r7.append(r8)     // Catch:{ Throwable -> 0x02a1 }
            java.lang.String r8 = "*"
            r7.append(r8)     // Catch:{ Throwable -> 0x02a1 }
            r5 = r5[r4]     // Catch:{ Throwable -> 0x02a1 }
            r7.append(r5)     // Catch:{ Throwable -> 0x02a1 }
            java.lang.String r5 = r7.toString()     // Catch:{ Throwable -> 0x02a1 }
            r2.put(r6, r5)     // Catch:{ Throwable -> 0x02a1 }
        L_0x0124:
            java.lang.String r5 = "mc"
            java.lang.String r6 = com.umeng.commonsdk.statistics.common.DeviceConfig.getMac(r9)     // Catch:{ Throwable -> 0x02a1 }
            r2.put(r5, r6)     // Catch:{ Throwable -> 0x02a1 }
            java.lang.String r5 = "timezone"
            int r6 = com.umeng.commonsdk.statistics.common.DeviceConfig.getTimeZone(r9)     // Catch:{ Throwable -> 0x02a1 }
            r2.put(r5, r6)     // Catch:{ Throwable -> 0x02a1 }
            java.lang.String[] r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.getLocaleInfo(r9)     // Catch:{ Throwable -> 0x02a1 }
            java.lang.String r6 = "country"
            r7 = r5[r4]     // Catch:{ Throwable -> 0x02a1 }
            r2.put(r6, r7)     // Catch:{ Throwable -> 0x02a1 }
            java.lang.String r6 = "language"
            r5 = r5[r3]     // Catch:{ Throwable -> 0x02a1 }
            r2.put(r6, r5)     // Catch:{ Throwable -> 0x02a1 }
            java.lang.String r5 = "carrier"
            java.lang.String r6 = com.umeng.commonsdk.statistics.common.DeviceConfig.getNetworkOperatorName(r9)     // Catch:{ Throwable -> 0x02a1 }
            r2.put(r5, r6)     // Catch:{ Throwable -> 0x02a1 }
            java.lang.String r5 = "display_name"
            java.lang.String r6 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAppName(r9)     // Catch:{ Throwable -> 0x02a1 }
            r2.put(r5, r6)     // Catch:{ Throwable -> 0x02a1 }
            java.lang.String[] r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.getNetworkAccessMode(r9)     // Catch:{ Throwable -> 0x02a1 }
            java.lang.String r6 = "Wi-Fi"
            r7 = r5[r4]     // Catch:{ Throwable -> 0x02a1 }
            boolean r6 = r6.equals(r7)     // Catch:{ Throwable -> 0x02a1 }
            if (r6 == 0) goto L_0x0170
            java.lang.String r6 = "access"
            java.lang.String r7 = "wifi"
            r2.put(r6, r7)     // Catch:{ Throwable -> 0x02a1 }
            goto L_0x0189
        L_0x0170:
            java.lang.String r6 = "2G/3G"
            r7 = r5[r4]     // Catch:{ Throwable -> 0x02a1 }
            boolean r6 = r6.equals(r7)     // Catch:{ Throwable -> 0x02a1 }
            if (r6 == 0) goto L_0x0182
            java.lang.String r6 = "access"
            java.lang.String r7 = "2G/3G"
            r2.put(r6, r7)     // Catch:{ Throwable -> 0x02a1 }
            goto L_0x0189
        L_0x0182:
            java.lang.String r6 = "access"
            java.lang.String r7 = "unknow"
            r2.put(r6, r7)     // Catch:{ Throwable -> 0x02a1 }
        L_0x0189:
            java.lang.String r6 = ""
            r7 = r5[r3]     // Catch:{ Throwable -> 0x02a1 }
            boolean r6 = r6.equals(r7)     // Catch:{ Throwable -> 0x02a1 }
            if (r6 != 0) goto L_0x019a
            java.lang.String r6 = "access_subtype"
            r5 = r5[r3]     // Catch:{ Throwable -> 0x02a1 }
            r2.put(r6, r5)     // Catch:{ Throwable -> 0x02a1 }
        L_0x019a:
            java.lang.String r5 = "com_ver"
            java.lang.String r6 = "2.0.1"
            r2.put(r5, r6)     // Catch:{ Throwable -> 0x02a1 }
            java.lang.String r5 = "com_type"
            int r6 = com.umeng.commonsdk.statistics.SdkVersion.SDK_TYPE     // Catch:{ Throwable -> 0x02a1 }
            r2.put(r5, r6)     // Catch:{ Throwable -> 0x02a1 }
            java.lang.String r5 = f80920a     // Catch:{ Throwable -> 0x02a1 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x02a1 }
            if (r5 != 0) goto L_0x01b7
            java.lang.String r5 = "module"
            java.lang.String r6 = f80920a     // Catch:{ Throwable -> 0x02a1 }
            r2.put(r5, r6)     // Catch:{ Throwable -> 0x02a1 }
        L_0x01b7:
            java.lang.String r5 = r2.toString()     // Catch:{ Throwable -> 0x02a1 }
            f80922d = r5     // Catch:{ Throwable -> 0x02a1 }
        L_0x01bd:
            if (r2 != 0) goto L_0x01c0
            return r0
        L_0x01c0:
            java.lang.String r5 = "successful_requests"
            java.lang.String r6 = "successful_request"
            int r6 = r1.getInt(r6, r4)     // Catch:{ Exception -> 0x01e1 }
            r2.put(r5, r6)     // Catch:{ Exception -> 0x01e1 }
            java.lang.String r5 = "failed_requests"
            java.lang.String r6 = "failed_requests"
            int r6 = r1.getInt(r6, r4)     // Catch:{ Exception -> 0x01e1 }
            r2.put(r5, r6)     // Catch:{ Exception -> 0x01e1 }
            java.lang.String r5 = "req_time"
            java.lang.String r6 = "last_request_spent_ms"
            int r1 = r1.getInt(r6, r4)     // Catch:{ Exception -> 0x01e1 }
            r2.put(r5, r1)     // Catch:{ Exception -> 0x01e1 }
        L_0x01e1:
            java.lang.String r1 = "channel"
            java.lang.String r5 = com.umeng.commonsdk.utils.UMUtils.getChannel(r9)     // Catch:{ Throwable -> 0x02a1 }
            r2.put(r1, r5)     // Catch:{ Throwable -> 0x02a1 }
            java.lang.String r1 = "appkey"
            java.lang.String r5 = com.umeng.commonsdk.utils.UMUtils.getAppkey(r9)     // Catch:{ Throwable -> 0x02a1 }
            r2.put(r1, r5)     // Catch:{ Throwable -> 0x02a1 }
            java.lang.String r1 = com.umeng.commonsdk.utils.UMUtils.getDeviceToken(r9)     // Catch:{ Exception -> 0x0203 }
            boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0203 }
            if (r5 != 0) goto L_0x0207
            java.lang.String r5 = "devicetoken"
            r2.put(r5, r1)     // Catch:{ Exception -> 0x0203 }
            goto L_0x0207
        L_0x0203:
            r1 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r9, r1)     // Catch:{ Throwable -> 0x02a1 }
        L_0x0207:
            int r1 = com.umeng.commonsdk.statistics.SdkVersion.SDK_TYPE     // Catch:{ Exception -> 0x0237 }
            if (r1 == r3) goto L_0x023b
            java.lang.String r1 = "com.umeng.commonsdk.internal.utils.SDStorageAgent"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException | Throwable -> 0x022a }
            if (r1 == 0) goto L_0x022a
            java.lang.String r5 = "getUmtt"
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException | Throwable -> 0x022a }
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r4] = r7     // Catch:{ ClassNotFoundException | Throwable -> 0x022a }
            java.lang.reflect.Method r5 = r1.getMethod(r5, r6)     // Catch:{ ClassNotFoundException | Throwable -> 0x022a }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException | Throwable -> 0x022a }
            r6[r4] = r9     // Catch:{ ClassNotFoundException | Throwable -> 0x022a }
            java.lang.Object r1 = r5.invoke(r1, r6)     // Catch:{ ClassNotFoundException | Throwable -> 0x022a }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ ClassNotFoundException | Throwable -> 0x022a }
            goto L_0x022b
        L_0x022a:
            r1 = r0
        L_0x022b:
            boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0237 }
            if (r5 != 0) goto L_0x023b
            java.lang.String r5 = "umtt"
            r2.put(r5, r1)     // Catch:{ Exception -> 0x0237 }
            goto L_0x023b
        L_0x0237:
            r1 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r9, r1)     // Catch:{ Throwable -> 0x02a1 }
        L_0x023b:
            java.lang.String r1 = "umid"
            java.lang.String r1 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r9, r1, r0)     // Catch:{ Exception -> 0x024d }
            boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x024d }
            if (r5 != 0) goto L_0x0251
            java.lang.String r5 = "umid"
            r2.put(r5, r1)     // Catch:{ Exception -> 0x024d }
            goto L_0x0251
        L_0x024d:
            r1 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r9, r1)     // Catch:{ Throwable -> 0x02a1 }
        L_0x0251:
            int r1 = com.umeng.commonsdk.statistics.SdkVersion.SDK_TYPE     // Catch:{ Exception -> 0x0264 }
            if (r1 == r3) goto L_0x0264
            java.lang.String r1 = com.umeng.commonsdk.proguard.a.b(r9)     // Catch:{ Exception -> 0x0264 }
            if (r1 == 0) goto L_0x0264
            java.lang.String r1 = "utoken"
            java.lang.String r3 = com.umeng.commonsdk.proguard.a.b(r9)     // Catch:{ Exception -> 0x0264 }
            r2.put(r1, r3)     // Catch:{ Exception -> 0x0264 }
        L_0x0264:
            java.lang.String r1 = "wrapper_type"
            java.lang.String r3 = com.umeng.commonsdk.statistics.a.f80916a     // Catch:{ Exception -> 0x0272 }
            r2.put(r1, r3)     // Catch:{ Exception -> 0x0272 }
            java.lang.String r1 = "wrapper_version"
            java.lang.String r3 = com.umeng.commonsdk.statistics.a.f80917b     // Catch:{ Exception -> 0x0272 }
            r2.put(r1, r3)     // Catch:{ Exception -> 0x0272 }
        L_0x0272:
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler r1 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.getImprintService(r9)     // Catch:{ Throwable -> 0x02a1 }
            byte[] r1 = r1.a()     // Catch:{ Throwable -> 0x02a1 }
            if (r1 == 0) goto L_0x028d
            int r3 = r1.length     // Catch:{ Throwable -> 0x02a1 }
            if (r3 <= 0) goto L_0x028d
            java.lang.String r3 = "imprint"
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r4)     // Catch:{ JSONException -> 0x0289 }
            r2.put(r3, r1)     // Catch:{ JSONException -> 0x0289 }
            goto L_0x028d
        L_0x0289:
            r1 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r9, r1)     // Catch:{ Throwable -> 0x02a1 }
        L_0x028d:
            if (r2 == 0) goto L_0x02a5
            int r1 = r2.length()     // Catch:{ Throwable -> 0x02a1 }
            if (r1 <= 0) goto L_0x02a5
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Throwable -> 0x02a1 }
            r1.<init>()     // Catch:{ Throwable -> 0x02a1 }
            java.lang.String r3 = "header"
            org.json.JSONObject r1 = r1.put(r3, r2)     // Catch:{ Throwable -> 0x02a1 }
            return r1
        L_0x02a1:
            r1 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r9, r1)
        L_0x02a5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.b.b(android.content.Context):org.json.JSONObject");
    }

    private JSONObject a(int i, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("exception", i);
            } catch (Exception unused) {
            }
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("exception", i);
        } catch (Exception unused2) {
        }
        return jSONObject2;
    }

    private Envelope a(Context context, byte[] bArr) {
        String imprintProperty = UMEnvelopeBuild.imprintProperty(context, "codex", null);
        int i = -1;
        try {
            if (!TextUtils.isEmpty(imprintProperty)) {
                i = Integer.valueOf(imprintProperty).intValue();
            }
        } catch (NumberFormatException e2) {
            UMCrashManager.reportCrash(context, e2);
        }
        if (i != 0) {
            if (i == 1) {
                return Envelope.genEncryptEnvelope(context, UMUtils.getAppkey(context), bArr);
            }
            if (f80923f) {
                return Envelope.genEncryptEnvelope(context, UMUtils.getAppkey(context), bArr);
            }
        }
        return Envelope.genEnvelope(context, UMUtils.getAppkey(context), bArr);
    }

    private JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (!(jSONObject == null || jSONObject2 == null || jSONObject.opt("header") == null || !(jSONObject.opt("header") instanceof JSONObject))) {
            JSONObject jSONObject3 = (JSONObject) jSONObject.opt("header");
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && (next instanceof String)) {
                    String str = next;
                    if (!(str == null || jSONObject2.opt(str) == null)) {
                        try {
                            jSONObject3.put(str, jSONObject2.opt(str));
                            if (str.equals("vertical_type") && (jSONObject2.opt(str) instanceof Integer)) {
                                this.f80924e = ((Integer) jSONObject2.opt(str)).intValue();
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    public JSONObject a(Context context, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        String str;
        Envelope envelope;
        String str2;
        String str3;
        JSONObject jSONObject4 = null;
        if (context == null || jSONObject2 == null) {
            return a(110, (JSONObject) null);
        }
        try {
            JSONObject b2 = b(context);
            if (!(b2 == null || jSONObject == null)) {
                b2 = a(b2, jSONObject);
            }
            if (!(b2 == null || jSONObject2 == null)) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (next != null && (next instanceof String)) {
                        String str4 = next;
                        if (!(str4 == null || jSONObject2.opt(str4) == null)) {
                            try {
                                b2.put(str4, jSONObject2.opt(str4));
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
            if (b2 != null) {
                StringBuilder sb = new StringBuilder();
                if (b2.length() > 0) {
                    if (b2.has("push")) {
                        String optString = b2.optJSONObject("header").optString("p_sdk_v");
                        if (!TextUtils.isEmpty("p") && !TextUtils.isEmpty(optString)) {
                            sb.append("p");
                            sb.append("==");
                            sb.append(optString);
                            sb.append("&=");
                        }
                    }
                    if (b2.has("share")) {
                        String optString2 = b2.optJSONObject("header").optString("s_sdk_v");
                        if (!TextUtils.isEmpty(NotifyType.SOUND) && !TextUtils.isEmpty(optString2)) {
                            sb.append(NotifyType.SOUND);
                            sb.append("==");
                            sb.append(optString2);
                            sb.append("&=");
                        }
                    }
                    if (b2.has("analytics")) {
                        if (b2.has("dplus")) {
                            str3 = "ad";
                        } else {
                            str3 = "a";
                            if (b2.optJSONObject("header").has(TimeDisplaySetting.START_SHOW_TIME)) {
                                str3 = "t";
                            }
                        }
                        String optString3 = b2.optJSONObject("header").optString("sdk_version");
                        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(optString3)) {
                            sb.append(str3);
                            sb.append("==");
                            sb.append(optString3);
                            sb.append("&=");
                        }
                    }
                    if (b2.has("dplus")) {
                        String optString4 = b2.optJSONObject("header").optString("sdk_version");
                        if (b2.has("analytics")) {
                            if (!sb.toString().contains("ad") && !TextUtils.isEmpty("ad") && !TextUtils.isEmpty(optString4)) {
                                sb.append("ad");
                                sb.append("==");
                                sb.append(optString4);
                                sb.append("&=");
                            }
                        } else if (!TextUtils.isEmpty("d") && !TextUtils.isEmpty(optString4)) {
                            sb.append("d");
                            sb.append("==");
                            sb.append(optString4);
                            sb.append("&=");
                        }
                    }
                    if (b2.has("inner")) {
                        String optString5 = b2.optJSONObject("header").optString("i_sdk_v");
                        if (!TextUtils.isEmpty("i") && !TextUtils.isEmpty(optString5)) {
                            sb.append("i");
                            sb.append("==");
                            sb.append(optString5);
                            sb.append("&=");
                        }
                    }
                }
                str = sb.toString();
                if (TextUtils.isEmpty(str)) {
                    return a((int) BaseLoginOrRegisterActivity.o, b2);
                }
                if (str.endsWith("&=")) {
                    str = str.substring(0, str.length() - 2);
                }
            } else {
                str = null;
            }
            if (b2 != null) {
                try {
                    e a2 = e.a(context);
                    if (a2 != null) {
                        a2.a();
                        String encodeToString = Base64.encodeToString(new s().a(a2.b()), 0);
                        if (!TextUtils.isEmpty(encodeToString)) {
                            JSONObject jSONObject5 = b2.getJSONObject("header");
                            jSONObject5.put("id_tracking", encodeToString);
                            b2.put("header", jSONObject5);
                        }
                    }
                } catch (Exception unused2) {
                }
            }
            if (b2 != null) {
                if (DataHelper.largeThanMaxSize((long) b2.toString().getBytes().length, DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX)) {
                    SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().putInt("serial", sharedPreferences.getInt("serial", 1) + 1).commit();
                    }
                    return a(113, b2);
                }
            }
            if (b2 != null) {
                envelope = a(context, b2.toString().getBytes());
                if (envelope == null) {
                    return a(111, b2);
                }
            } else {
                envelope = null;
            }
            if (envelope != null && DataHelper.largeThanMaxSize((long) envelope.toBinary().length, DataHelper.ENVELOPE_LENGTH_MAX)) {
                return a(114, b2);
            }
            if (b2 != null) {
                str2 = b2.optJSONObject("header").optString("app_version");
            } else {
                str2 = null;
            }
            int a3 = a(context, envelope, str, str2);
            if (a3 != 0) {
                return a(a3, b2);
            }
            return b2;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            if (jSONObject != null) {
                try {
                    jSONObject3 = new JSONObject();
                    jSONObject4 = jSONObject3;
                } catch (Exception e2) {
                    e = e2;
                    UMCrashManager.reportCrash(context, e);
                    return a(110, jSONObject4);
                }
                try {
                    jSONObject3.put("header", jSONObject);
                } catch (JSONException unused3) {
                } catch (Exception e3) {
                    e = e3;
                    jSONObject4 = jSONObject3;
                    UMCrashManager.reportCrash(context, e);
                    return a(110, jSONObject4);
                }
            }
            if (jSONObject2 != null) {
                if (jSONObject4 == null) {
                    jSONObject4 = new JSONObject();
                }
                if (jSONObject2 != null) {
                    Iterator<String> keys2 = jSONObject2.keys();
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        if (next2 != null && (next2 instanceof String)) {
                            String str5 = next2;
                            if (!(str5 == null || jSONObject2.opt(str5) == null)) {
                                try {
                                    jSONObject4.put(str5, jSONObject2.opt(str5));
                                } catch (Exception unused4) {
                                }
                            }
                        }
                    }
                }
            }
            return a(110, jSONObject4);
        }
    }

    private int a(Context context, Envelope envelope, String str, String str2) {
        if (context == null || envelope == null || TextUtils.isEmpty(str)) {
            return BaseLoginOrRegisterActivity.o;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = DeviceConfig.getAppVersionName(context);
        }
        return UMFrUtils.saveEnvelopeFile(context, str + "&&" + str2 + "_" + System.currentTimeMillis() + "_envelope.log", envelope.toBinary());
    }
}
