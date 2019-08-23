package com.ss.android.common.applog;

import android.util.Pair;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.AppContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class NetUtil {
    private static volatile String APP_LOG_ENCRYPT_COUNT = "app_log_encrypt_switch_count";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static Object mLock = new Object();
    private static m sAliYunHandler;
    private static AppContext sAppContext;
    public static a sAppParam;
    private static final ConcurrentHashMap<String, String> sCustomParam = new ConcurrentHashMap<>();
    private static volatile int sEncryptFaildCount;
    private static volatile b sExtraparams;
    private static volatile boolean sIsReadConfigFromSP;
    private static volatile boolean sIsWriteConfigSP;

    public interface a {
    }

    public interface b {
        HashMap<String, String> a();
    }

    @Deprecated
    public static int checkHttpRequestException(Throwable th, String[] strArr) {
        return 1;
    }

    public static String getAliyunUuid() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 15593, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 15593, new Class[0], String.class);
        }
        if (sAliYunHandler != null) {
            return sAliYunHandler.b();
        }
        return null;
    }

    public static void setAliYunHanlder(m mVar) {
        sAliYunHandler = mVar;
    }

    public static void setAppContext(AppContext appContext) {
        sAppContext = appContext;
    }

    public static void setAppParam(a aVar) {
        sAppParam = aVar;
    }

    public static void setExtraparams(b bVar) {
        if (sExtraparams == null && bVar != null) {
            sExtraparams = bVar;
        }
    }

    public static void setEncryptSPName(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, changeQuickRedirect, true, 15597, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, null, changeQuickRedirect, true, 15597, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!StringUtils.isEmpty(str)) {
            APP_LOG_ENCRYPT_COUNT = str;
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x005c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void addFailedCount(android.content.Context r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = 0
            r5 = 1
            r6 = 15595(0x3ceb, float:2.1853E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0032
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = changeQuickRedirect
            r13 = 1
            r14 = 15595(0x3ceb, float:2.1853E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0032:
            boolean r2 = sIsReadConfigFromSP
            if (r2 == 0) goto L_0x0037
            return
        L_0x0037:
            java.lang.Object r2 = mLock
            monitor-enter(r2)
            java.lang.String r3 = APP_LOG_ENCRYPT_COUNT     // Catch:{ Throwable -> 0x005c }
            android.content.SharedPreferences r0 = com.ss.android.ugc.aweme.q.c.a(r0, r3, r9)     // Catch:{ Throwable -> 0x005c }
            java.lang.String r3 = "app_log_encrypt_faild_count"
            int r3 = r0.getInt(r3, r9)     // Catch:{ Throwable -> 0x005c }
            sEncryptFaildCount = r3     // Catch:{ Throwable -> 0x005c }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ Throwable -> 0x005c }
            java.lang.String r3 = "app_log_encrypt_faild_count"
            int r4 = sEncryptFaildCount     // Catch:{ Throwable -> 0x005c }
            int r4 = r4 + r1
            r0.putInt(r3, r4)     // Catch:{ Throwable -> 0x005c }
            r0.apply()     // Catch:{ Throwable -> 0x005c }
            sIsReadConfigFromSP = r1     // Catch:{ Throwable -> 0x005c }
            goto L_0x005c
        L_0x005a:
            r0 = move-exception
            goto L_0x005e
        L_0x005c:
            monitor-exit(r2)     // Catch:{ all -> 0x005a }
            return
        L_0x005e:
            monitor-exit(r2)     // Catch:{ all -> 0x005a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.NetUtil.addFailedCount(android.content.Context):void");
    }

    public static boolean isBadId(String str) {
        String str2 = str;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 15592, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 15592, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (StringUtils.isEmpty(str) || str2.equalsIgnoreCase("unknown") || str2.equalsIgnoreCase("None")) {
            return true;
        } else {
            int i = 0;
            while (true) {
                if (i >= str.length()) {
                    break;
                } else if (str2.charAt(i) != '0') {
                    z = false;
                    break;
                } else {
                    i++;
                }
            }
            return z;
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0060 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void minusFailedCount(android.content.Context r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = 0
            r5 = 1
            r6 = 15596(0x3cec, float:2.1855E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0032
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = changeQuickRedirect
            r13 = 1
            r14 = 15596(0x3cec, float:2.1855E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0032:
            boolean r2 = sIsWriteConfigSP
            if (r2 == 0) goto L_0x0037
            return
        L_0x0037:
            java.lang.Object r2 = mLock
            monitor-enter(r2)
            java.lang.String r3 = APP_LOG_ENCRYPT_COUNT     // Catch:{ Throwable -> 0x0060 }
            android.content.SharedPreferences r0 = com.ss.android.ugc.aweme.q.c.a(r0, r3, r9)     // Catch:{ Throwable -> 0x0060 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ Throwable -> 0x0060 }
            int r3 = sEncryptFaildCount     // Catch:{ Throwable -> 0x0060 }
            r4 = 2
            if (r3 <= r4) goto L_0x004f
            int r3 = sEncryptFaildCount     // Catch:{ Throwable -> 0x0060 }
            int r3 = r3 - r4
            sEncryptFaildCount = r3     // Catch:{ Throwable -> 0x0060 }
            goto L_0x0051
        L_0x004f:
            sEncryptFaildCount = r9     // Catch:{ Throwable -> 0x0060 }
        L_0x0051:
            java.lang.String r3 = "app_log_encrypt_faild_count"
            int r4 = sEncryptFaildCount     // Catch:{ Throwable -> 0x0060 }
            r0.putInt(r3, r4)     // Catch:{ Throwable -> 0x0060 }
            r0.apply()     // Catch:{ Throwable -> 0x0060 }
            sIsWriteConfigSP = r1     // Catch:{ Throwable -> 0x0060 }
            goto L_0x0060
        L_0x005e:
            r0 = move-exception
            goto L_0x0062
        L_0x0060:
            monitor-exit(r2)     // Catch:{ all -> 0x005e }
            return
        L_0x0062:
            monitor-exit(r2)     // Catch:{ all -> 0x005e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.NetUtil.minusFailedCount(android.content.Context):void");
    }

    public static String addCommonParams(String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 15589, new Class[]{String.class, Boolean.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, null, changeQuickRedirect, true, 15589, new Class[]{String.class, Boolean.TYPE}, String.class);
        }
        AppContext appContext = sAppContext;
        if (StringUtils.isEmpty(str) || appContext == null) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(str2);
        appendCommonParams(sb, z);
        return sb.toString();
    }

    public static void addCustomParams(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, changeQuickRedirect, true, 15591, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, null, changeQuickRedirect, true, 15591, new Class[]{String.class, String.class}, Void.TYPE);
        } else if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
            sCustomParam.put(str3, str4);
        }
    }

    public static void appendCommonParams(StringBuilder sb, boolean z) {
        StringBuilder sb2 = sb;
        if (PatchProxy.isSupport(new Object[]{sb2, Byte.valueOf(z ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 15588, new Class[]{StringBuilder.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sb2, Byte.valueOf(z)}, null, changeQuickRedirect, true, 15588, new Class[]{StringBuilder.class, Boolean.TYPE}, Void.TYPE);
        } else if (sAppContext != null && sb2 != null) {
            if (sb.toString().indexOf(63) < 0) {
                sb2.append("?");
            } else {
                sb2.append("&");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            putCommonParams(linkedHashMap, z);
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                arrayList.add(new Pair(entry.getKey(), entry.getValue()));
            }
            sb2.append(NetworkUtils.format(arrayList, "UTF-8"));
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:92:0x0241 */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0245 A[Catch:{ Throwable -> 0x028c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void putCommonParams(java.util.Map<java.lang.String, java.lang.String> r18, boolean r19) {
        /*
            r0 = r18
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            java.lang.Byte r3 = java.lang.Byte.valueOf(r19)
            r10 = 1
            r2[r10] = r3
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            r7[r9] = r3
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r7[r10] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = 0
            r5 = 1
            r6 = 15590(0x3ce6, float:2.1846E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0049
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r9] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r19)
            r11[r10] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = changeQuickRedirect
            r14 = 1
            r15 = 15590(0x3ce6, float:2.1846E-41)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            r0[r9] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r10] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x0049:
            com.ss.android.common.AppContext r1 = sAppContext
            if (r0 == 0) goto L_0x028d
            if (r1 != 0) goto L_0x0051
            goto L_0x028d
        L_0x0051:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            android.content.Context r3 = r1.getContext()     // Catch:{ Exception -> 0x0070 }
            boolean r3 = com.ss.android.common.util.ToolUtils.isMessageProcess(r3)     // Catch:{ Exception -> 0x0070 }
            if (r3 == 0) goto L_0x006c
            com.ss.android.common.applog.NetUtil$a r3 = sAppParam     // Catch:{ Exception -> 0x0070 }
            if (r3 == 0) goto L_0x0067
            r1.getContext()     // Catch:{ Exception -> 0x0070 }
        L_0x0067:
            boolean r3 = com.bytedance.common.utility.Logger.debug()     // Catch:{ Exception -> 0x0070 }
            goto L_0x0073
        L_0x006c:
            com.ss.android.d.d.a((java.util.Map) r2)     // Catch:{ Exception -> 0x0070 }
            goto L_0x0073
        L_0x0070:
            com.ss.android.d.d.a((java.util.Map) r2)
        L_0x0073:
            java.lang.String r3 = "install_id"
            java.lang.Object r3 = r2.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0086
            java.lang.String r4 = "iid"
            r0.put(r4, r3)
        L_0x0086:
            java.lang.String r3 = "device_id"
            java.lang.Object r3 = r2.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0099
            java.lang.String r4 = "device_id"
            r0.put(r4, r3)
        L_0x0099:
            android.content.Context r3 = r1.getContext()
            if (r3 == 0) goto L_0x00ae
            java.lang.String r3 = com.bytedance.common.utility.NetworkUtils.getNetworkAccessType((android.content.Context) r3)
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x00ae
            java.lang.String r4 = "ac"
            r0.put(r4, r3)
        L_0x00ae:
            java.lang.String r3 = r1.getTweakedChannel()
            if (r3 == 0) goto L_0x00b9
            java.lang.String r4 = "channel"
            r0.put(r4, r3)
        L_0x00b9:
            java.lang.String r3 = "aid"
            int r4 = r1.getAid()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r0.put(r3, r4)
            java.lang.String r3 = r1.getAppName()
            if (r3 == 0) goto L_0x00d1
            java.lang.String r4 = "app_name"
            r0.put(r4, r3)
        L_0x00d1:
            java.lang.String r3 = "version_code"
            int r4 = r1.getVersionCode()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r0.put(r3, r4)
            java.lang.String r3 = "version_name"
            java.lang.String r4 = r1.getVersion()
            r0.put(r3, r4)
            java.lang.String r3 = "device_platform"
            java.lang.String r4 = "android"
            r0.put(r3, r4)
            java.lang.String r3 = r1.getAbVersion()
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x00fd
            java.lang.String r4 = "ab_version"
            r0.put(r4, r3)
        L_0x00fd:
            java.lang.String r3 = r1.getAbClient()
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x010c
            java.lang.String r4 = "ab_client"
            r0.put(r4, r3)
        L_0x010c:
            java.lang.String r3 = r1.getAbGroup()
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x011b
            java.lang.String r4 = "ab_group"
            r0.put(r4, r3)
        L_0x011b:
            java.lang.String r3 = r1.getAbFeature()
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x012a
            java.lang.String r4 = "ab_feature"
            r0.put(r4, r3)
        L_0x012a:
            long r3 = r1.getAbFlag()
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x013d
            java.lang.String r5 = "abflag"
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.put(r5, r3)
        L_0x013d:
            if (r19 == 0) goto L_0x0146
            java.lang.String r3 = "ssmix"
            java.lang.String r4 = "a"
            r0.put(r3, r4)
        L_0x0146:
            java.lang.String r3 = "device_type"
            java.lang.String r4 = android.os.Build.MODEL
            r0.put(r3, r4)
            java.lang.String r3 = "device_brand"
            java.lang.String r4 = android.os.Build.BRAND
            r0.put(r3, r4)
            java.lang.String r3 = "language"
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r4 = r4.getLanguage()
            r0.put(r3, r4)
            java.lang.String r3 = "os_api"
            int r4 = android.os.Build.VERSION.SDK_INT
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r0.put(r3, r4)
            java.lang.String r3 = android.os.Build.VERSION.RELEASE     // Catch:{ Exception -> 0x0181 }
            if (r3 == 0) goto L_0x017c
            int r4 = r3.length()     // Catch:{ Exception -> 0x0181 }
            r5 = 10
            if (r4 <= r5) goto L_0x017c
            java.lang.String r3 = r3.substring(r9, r5)     // Catch:{ Exception -> 0x0181 }
        L_0x017c:
            java.lang.String r4 = "os_version"
            r0.put(r4, r3)     // Catch:{ Exception -> 0x0181 }
        L_0x0181:
            java.lang.String r3 = r1.getDeviceId()
            boolean r4 = isBadId(r3)
            if (r4 != 0) goto L_0x0190
            java.lang.String r4 = "uuid"
            r0.put(r4, r3)
        L_0x0190:
            java.lang.String r3 = "openudid"
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = com.bytedance.common.utility.StringUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x01a3
            java.lang.String r3 = "openudid"
            r0.put(r3, r2)
        L_0x01a3:
            com.ss.android.common.applog.m r2 = sAliYunHandler
            if (r2 == 0) goto L_0x01b8
            com.ss.android.common.applog.m r2 = sAliYunHandler
            java.lang.String r2 = r2.b()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x01b8
            java.lang.String r3 = "aliyun_uuid"
            r0.put(r3, r2)
        L_0x01b8:
            java.lang.String r2 = "manifest_version_code"
            int r3 = r1.getManifestVersionCode()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.put(r2, r3)
            android.content.Context r2 = r1.getContext()
            java.lang.String r2 = com.bytedance.common.utility.UIUtils.getScreenResolution(r2)
            boolean r3 = com.bytedance.common.utility.StringUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x01d8
            java.lang.String r3 = "resolution"
            r0.put(r3, r2)
        L_0x01d8:
            android.content.Context r2 = r1.getContext()
            int r2 = com.bytedance.common.utility.UIUtils.getDpi(r2)
            if (r2 <= 0) goto L_0x01eb
            java.lang.String r3 = "dpi"
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.put(r3, r2)
        L_0x01eb:
            java.lang.String r2 = "update_version_code"
            int r1 = r1.getUpdateVersionCode()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.put(r2, r1)
            java.lang.String r1 = "_rticket"
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.put(r1, r2)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r1 = sCustomParam     // Catch:{ Exception -> 0x0241 }
            boolean r1 = r1.isEmpty()     // Catch:{ Exception -> 0x0241 }
            if (r1 != 0) goto L_0x0241
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r1 = sCustomParam     // Catch:{ Exception -> 0x0241 }
            java.util.Set r1 = r1.entrySet()     // Catch:{ Exception -> 0x0241 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x0241 }
        L_0x0217:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x0241 }
            if (r2 == 0) goto L_0x0241
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x0241 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ Exception -> 0x0241 }
            if (r2 == 0) goto L_0x0217
            java.lang.Object r3 = r2.getKey()     // Catch:{ Exception -> 0x0241 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0241 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ Exception -> 0x0241 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0241 }
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0241 }
            if (r4 != 0) goto L_0x0217
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0241 }
            if (r4 != 0) goto L_0x0217
            r0.put(r3, r2)     // Catch:{ Exception -> 0x0241 }
            goto L_0x0217
        L_0x0241:
            com.ss.android.common.applog.NetUtil$b r1 = sExtraparams     // Catch:{ Throwable -> 0x028c }
            if (r1 == 0) goto L_0x028b
            com.ss.android.common.applog.NetUtil$b r1 = sExtraparams     // Catch:{ Throwable -> 0x028c }
            java.util.HashMap r1 = r1.a()     // Catch:{ Throwable -> 0x028c }
            if (r1 == 0) goto L_0x028b
            boolean r2 = r1.isEmpty()     // Catch:{ Throwable -> 0x028c }
            if (r2 != 0) goto L_0x028b
            java.util.Set r1 = r1.entrySet()     // Catch:{ Throwable -> 0x028c }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Throwable -> 0x028c }
        L_0x025b:
            boolean r2 = r1.hasNext()     // Catch:{ Throwable -> 0x028c }
            if (r2 == 0) goto L_0x028b
            java.lang.Object r2 = r1.next()     // Catch:{ Throwable -> 0x028c }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ Throwable -> 0x028c }
            if (r2 == 0) goto L_0x025b
            java.lang.Object r3 = r2.getKey()     // Catch:{ Throwable -> 0x028c }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Throwable -> 0x028c }
            java.lang.Object r2 = r2.getValue()     // Catch:{ Throwable -> 0x028c }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Throwable -> 0x028c }
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x028c }
            if (r4 != 0) goto L_0x025b
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r2)     // Catch:{ Throwable -> 0x028c }
            if (r4 != 0) goto L_0x025b
            boolean r4 = r0.containsKey(r3)     // Catch:{ Throwable -> 0x028c }
            if (r4 != 0) goto L_0x025b
            r0.put(r3, r2)     // Catch:{ Throwable -> 0x028c }
            goto L_0x025b
        L_0x028b:
            return
        L_0x028c:
            return
        L_0x028d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.NetUtil.putCommonParams(java.util.Map, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String sendEncryptLog(java.lang.String r22, byte[] r23, android.content.Context r24, boolean r25) throws java.lang.Exception {
        /*
            r0 = r22
            r1 = r23
            r3 = 4
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            r12 = 1
            r4[r12] = r1
            r13 = 2
            r4[r13] = r24
            java.lang.Byte r5 = java.lang.Byte.valueOf(r25)
            r14 = 3
            r4[r14] = r5
            com.meituan.robust.ChangeQuickRedirect r6 = changeQuickRedirect
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r11] = r5
            java.lang.Class<byte[]> r5 = byte[].class
            r9[r12] = r5
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r9[r13] = r5
            java.lang.Class r5 = java.lang.Boolean.TYPE
            r9[r14] = r5
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r5 = 0
            r7 = 1
            r8 = 15594(0x3cea, float:2.1852E-41)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x006a
            java.lang.Object[] r15 = new java.lang.Object[r3]
            r15[r11] = r0
            r15[r12] = r1
            r15[r13] = r24
            java.lang.Byte r0 = java.lang.Byte.valueOf(r25)
            r15[r14] = r0
            r16 = 0
            com.meituan.robust.ChangeQuickRedirect r17 = changeQuickRedirect
            r18 = 1
            r19 = 15594(0x3cea, float:2.1852E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class<byte[]> r1 = byte[].class
            r0[r12] = r1
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r13] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r14] = r1
            java.lang.Class<java.lang.String> r21 = java.lang.String.class
            r20 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x006a:
            boolean r3 = com.bytedance.common.utility.StringUtils.isEmpty(r22)
            r4 = 0
            if (r3 != 0) goto L_0x00ee
            if (r1 == 0) goto L_0x00ee
            int r3 = r1.length
            if (r3 > 0) goto L_0x0078
            goto L_0x00ee
        L_0x0078:
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r5 = 8192(0x2000, float:1.14794E-41)
            r3.<init>(r5)
            java.util.zip.GZIPOutputStream r5 = new java.util.zip.GZIPOutputStream
            r5.<init>(r3)
            r5.write(r1)     // Catch:{ Throwable -> 0x00ea, all -> 0x00e4 }
            r5.close()
            byte[] r1 = r3.toByteArray()
            addFailedCount(r24)
            int r3 = sEncryptFaildCount
            if (r3 >= r14) goto L_0x009e
            int r3 = r1.length
            byte[] r1 = com.bytedance.frameworks.core.encrypt.TTEncryptUtils.a(r1, r3)
            minusFailedCount(r24)
            goto L_0x009f
        L_0x009e:
            r12 = 0
        L_0x009f:
            if (r1 == 0) goto L_0x00dc
            if (r12 == 0) goto L_0x00dc
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "&tt_data=a"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            if (r25 == 0) goto L_0x00c7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "&config_retry=b"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        L_0x00c7:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r3 = "Content-Type"
            java.lang.String r5 = "application/octet-stream;tt-data=a"
            r2.put(r3, r5)
            com.bytedance.common.utility.NetworkClient r3 = com.bytedance.common.utility.NetworkClient.getDefault()
            java.lang.String r0 = r3.post((java.lang.String) r0, (byte[]) r1, (java.util.Map<java.lang.String, java.lang.String>) r2, (com.bytedance.common.utility.NetworkClient.ReqContext) r4)
            return r0
        L_0x00dc:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "encrypt failed"
            r0.<init>(r1)
            throw r0
        L_0x00e4:
            r0 = move-exception
            r1 = r0
            r5.close()
            throw r1
        L_0x00ea:
            r5.close()
            return r4
        L_0x00ee:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.NetUtil.sendEncryptLog(java.lang.String, byte[], android.content.Context, boolean):java.lang.String");
    }
}
