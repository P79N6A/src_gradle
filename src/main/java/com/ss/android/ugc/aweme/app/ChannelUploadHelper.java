package com.ss.android.ugc.aweme.app;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.aj.b;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.common.r;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;

public class ChannelUploadHelper {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static String mChannel;

    public static String getChannel() {
        return mChannel;
    }

    public static void parseFile() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 22348, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 22348, new Class[0], Void.TYPE);
            return;
        }
        String miuiChannelPath = getMiuiChannelPath("com.ss.android.ugc.aweme");
        String channelPath = getChannelPath("ro.com.ss.android.ugc.aweme");
        ArrayList arrayList = new ArrayList();
        arrayList.add("/data/etc/appchannel" + File.separator + "oppo_aweme_156_pre_install.config");
        arrayList.add("/system/etc/appchannel" + File.separator + "oppo_aweme_156_pre_install.config");
        arrayList.add(channelPath);
        arrayList.add("/system/etc" + File.separator + "oneplus_aweme_156_pre_install.config");
        arrayList.add("/system/etc" + File.separator + "meizu_aweme_156_pre_install.config");
        arrayList.add(getChannelPath("ro.preinstall.path") + File.separator + "vivo_aweme_183_pre_install.config");
        arrayList.add("/system/etc" + File.separator + "vivo_aweme_183_pre_install.config");
        arrayList.add("/system/etc" + File.separator + "lenovo_aweme_183_pre_install.config");
        arrayList.add("/system/etc" + File.separator + "chuizi_aweme_400_pre_install.config");
        arrayList.add("/system/etc" + File.separator + "aweme_400_pre_install.config");
        if (!TextUtils.isEmpty(miuiChannelPath)) {
            arrayList.add(miuiChannelPath);
        }
        String readTextFile = readTextFile(arrayList);
        if (!TextUtils.isEmpty(readTextFile)) {
            try {
                JSONObject jSONObject = new JSONObject(readTextFile);
                String optString = jSONObject.optString("channel");
                jSONObject.optString("version");
                jSONObject.optInt("update_version_code");
                jSONObject.optString("product_name");
                mChannel = optString;
                r.a((Context) k.a(), "pre_install_check", "app_start", PushConstants.PUSH_TYPE_NOTIFY, 0, c.a().a("package", k.a().getPackageName()).a("app_id", i.a().getAid()).a("app_name", i.a().getAppName()).a("device_id", AppLog.getServerDeviceId()).a("system_record_channel", optString).a("channel", i.a().getChannel()).b());
                b.b().a((Context) k.a(), "pre_install_channel", optString);
            } catch (Exception unused) {
            }
        }
    }

    private static String getChannelPath(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, changeQuickRedirect, true, 22350, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, null, changeQuickRedirect, true, 22350, new Class[]{String.class}, String.class);
        }
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Exception unused) {
            return null;
        }
    }

    private static String getMiuiChannelPath(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, changeQuickRedirect, true, 22351, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, null, changeQuickRedirect, true, 22351, new Class[]{String.class}, String.class);
        }
        try {
            return (String) Class.forName("miui.os.MiuiInit").getMethod("getMiuiChannelPath", new Class[]{String.class}).invoke(null, new Object[]{str});
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: java.io.InputStreamReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: java.io.InputStreamReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: java.io.InputStreamReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: java.io.InputStreamReader} */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.io.InputStreamReader] */
    /* JADX WARNING: type inference failed for: r4v6, types: [java.io.InputStreamReader] */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00bf A[SYNTHETIC, Splitter:B:51:0x00bf] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c4 A[Catch:{ IOException -> 0x00cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c9 A[Catch:{ IOException -> 0x00cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d2 A[SYNTHETIC, Splitter:B:64:0x00d2] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d7 A[Catch:{ IOException -> 0x00a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00dc A[Catch:{ IOException -> 0x00a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00e2 A[Catch:{ IOException -> 0x00a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e7 A[Catch:{ IOException -> 0x00a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0047 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0047 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String readTextFile(java.util.List<java.lang.String> r17) {
        /*
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r17
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.util.List> r3 = java.util.List.class
            r7[r9] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = 0
            r5 = 1
            r6 = 22349(0x574d, float:3.1318E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0033
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r17
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = changeQuickRedirect
            r13 = 1
            r14 = 22349(0x574d, float:3.1318E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.util.List> r0 = java.util.List.class
            r15[r9] = r0
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0033:
            r1 = 0
            if (r17 == 0) goto L_0x00f2
            boolean r2 = r17.isEmpty()
            if (r2 == 0) goto L_0x003e
            goto L_0x00f2
        L_0x003e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.util.Iterator r0 = r17.iterator()
        L_0x0047:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00ed
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0047
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.io.File r4 = new java.io.File
            r4.<init>(r3)
            boolean r3 = r4.isFile()
            if (r3 == 0) goto L_0x0047
            boolean r3 = r4.isFile()
            if (r3 == 0) goto L_0x0047
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00dd, IOException -> 0x00cd, all -> 0x00ba }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x00dd, IOException -> 0x00cd, all -> 0x00ba }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ FileNotFoundException -> 0x00b8, IOException -> 0x00b6, all -> 0x00b3 }
            r4.<init>(r3)     // Catch:{ FileNotFoundException -> 0x00b8, IOException -> 0x00b6, all -> 0x00b3 }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af, all -> 0x00ad }
            r5.<init>(r4)     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af, all -> 0x00ad }
        L_0x007e:
            java.lang.String r6 = r5.readLine()     // Catch:{ FileNotFoundException -> 0x00e0, IOException -> 0x00d0, all -> 0x00aa }
            if (r6 == 0) goto L_0x008d
            r2.append(r6)     // Catch:{ FileNotFoundException -> 0x00e0, IOException -> 0x00d0, all -> 0x00aa }
            java.lang.String r6 = "\n"
            r2.append(r6)     // Catch:{ FileNotFoundException -> 0x00e0, IOException -> 0x00d0, all -> 0x00aa }
            goto L_0x007e
        L_0x008d:
            boolean r6 = android.text.TextUtils.isEmpty(r2)     // Catch:{ FileNotFoundException -> 0x00e0, IOException -> 0x00d0, all -> 0x00aa }
            if (r6 != 0) goto L_0x009e
            r3.close()     // Catch:{ IOException -> 0x00ed }
            r4.close()     // Catch:{ IOException -> 0x00ed }
            r5.close()     // Catch:{ IOException -> 0x00ed }
            goto L_0x00ed
        L_0x009e:
            r3.close()     // Catch:{ IOException -> 0x00a8 }
            r4.close()     // Catch:{ IOException -> 0x00a8 }
        L_0x00a4:
            r5.close()     // Catch:{ IOException -> 0x00a8 }
            goto L_0x0047
        L_0x00a8:
            goto L_0x0047
        L_0x00aa:
            r0 = move-exception
            r1 = r5
            goto L_0x00bd
        L_0x00ad:
            r0 = move-exception
            goto L_0x00bd
        L_0x00af:
            r5 = r1
            goto L_0x00d0
        L_0x00b1:
            r5 = r1
            goto L_0x00e0
        L_0x00b3:
            r0 = move-exception
            r4 = r1
            goto L_0x00bd
        L_0x00b6:
            r4 = r1
            goto L_0x00cf
        L_0x00b8:
            r4 = r1
            goto L_0x00df
        L_0x00ba:
            r0 = move-exception
            r3 = r1
            r4 = r3
        L_0x00bd:
            if (r3 == 0) goto L_0x00c2
            r3.close()     // Catch:{ IOException -> 0x00cc }
        L_0x00c2:
            if (r4 == 0) goto L_0x00c7
            r4.close()     // Catch:{ IOException -> 0x00cc }
        L_0x00c7:
            if (r1 == 0) goto L_0x00cc
            r1.close()     // Catch:{ IOException -> 0x00cc }
        L_0x00cc:
            throw r0
        L_0x00cd:
            r3 = r1
            r4 = r3
        L_0x00cf:
            r5 = r4
        L_0x00d0:
            if (r3 == 0) goto L_0x00d5
            r3.close()     // Catch:{ IOException -> 0x00a8 }
        L_0x00d5:
            if (r4 == 0) goto L_0x00da
            r4.close()     // Catch:{ IOException -> 0x00a8 }
        L_0x00da:
            if (r5 == 0) goto L_0x0047
            goto L_0x00a4
        L_0x00dd:
            r3 = r1
            r4 = r3
        L_0x00df:
            r5 = r4
        L_0x00e0:
            if (r3 == 0) goto L_0x00e5
            r3.close()     // Catch:{ IOException -> 0x00a8 }
        L_0x00e5:
            if (r4 == 0) goto L_0x00ea
            r4.close()     // Catch:{ IOException -> 0x00a8 }
        L_0x00ea:
            if (r5 == 0) goto L_0x0047
            goto L_0x00a4
        L_0x00ed:
            java.lang.String r0 = r2.toString()
            return r0
        L_0x00f2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.ChannelUploadHelper.readTextFile(java.util.List):java.lang.String");
    }
}
