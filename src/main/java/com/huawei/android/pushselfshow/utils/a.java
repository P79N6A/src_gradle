package com.huawei.android.pushselfshow.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.huawei.android.pushagent.utils.a.a.g;
import com.huawei.android.pushagent.utils.a.b;
import com.huawei.android.pushagent.utils.a.e;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f25363a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b  reason: collision with root package name */
    private static Typeface f25364b;

    public static int a(int i, int i2) {
        String str;
        StringBuilder sb;
        e.a("PushSelfShowLog", "enter ctrlSockets(cmd:" + i + " param:" + i2 + ")");
        try {
            return ((Integer) Class.forName("dalvik.system.Zygote").getMethod("ctrlSockets", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(null, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)})).intValue();
        } catch (NoSuchMethodException e2) {
            e = e2;
            str = "PushSelfShowLog";
            sb = new StringBuilder("NoSuchMethodException:");
            sb.append(e);
            e.d(str, sb.toString());
            return -2;
        } catch (ClassNotFoundException e3) {
            e = e3;
            str = "PushSelfShowLog";
            sb = new StringBuilder("ClassNotFoundException:");
            sb.append(e);
            e.d(str, sb.toString());
            return -2;
        } catch (IllegalAccessException e4) {
            e = e4;
            str = "PushSelfShowLog";
            sb = new StringBuilder("IllegalAccessException:");
            sb.append(e);
            e.d(str, sb.toString());
            return -2;
        } catch (InvocationTargetException e5) {
            e = e5;
            str = "PushSelfShowLog";
            sb = new StringBuilder("InvocationTargetException:");
            sb.append(e);
            e.d(str, sb.toString());
            return -2;
        } catch (RuntimeException e6) {
            e = e6;
            str = "PushSelfShowLog";
            sb = new StringBuilder("RuntimeException:");
            sb.append(e);
            e.d(str, sb.toString());
            return -2;
        } catch (Exception e7) {
            e = e7;
            str = "PushSelfShowLog";
            sb = new StringBuilder("Exception:");
            sb.append(e);
            e.d(str, sb.toString());
            return -2;
        }
    }

    public static int a(Context context, float f2) {
        return (int) ((f2 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static long a() {
        return System.currentTimeMillis();
    }

    public static long a(Context context) {
        e.a("PushSelfShowLog", "enter getVersion()");
        long j = -1000;
        try {
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(new Intent("com.huawei.android.push.intent.REGISTER").setPackage(context.getPackageName()), 640);
            if (queryBroadcastReceivers != null) {
                if (queryBroadcastReceivers.size() != 0) {
                    j = a(queryBroadcastReceivers.get(0), "CS_cloud_version");
                    e.a("PushSelfShowLog", "get the version is :" + j);
                    return j;
                }
            }
            return -1000;
        } catch (Exception e2) {
            e.c("PushSelfShowLog", e2.toString(), e2);
        }
    }

    public static long a(ResolveInfo resolveInfo, String str) {
        long j = -1;
        if (resolveInfo == null) {
            return -1;
        }
        try {
            j = Long.parseLong(b(resolveInfo, str));
        } catch (NumberFormatException unused) {
            e.b("PushSelfShowLog", str + " is not set in " + a(resolveInfo));
        }
        return j;
    }

    public static Intent a(Context context, String str) {
        try {
            return context.getPackageManager().getLaunchIntentForPackage(str);
        } catch (Exception e2) {
            e.b("PushSelfShowLog", e2.toString(), (Throwable) e2);
            return null;
        }
    }

    public static Boolean a(Context context, String str, Intent intent) {
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            if (queryIntentActivities != null && queryIntentActivities.size() > 0) {
                int size = queryIntentActivities.size();
                for (int i = 0; i < size; i++) {
                    if (queryIntentActivities.get(i).activityInfo != null && str.equals(queryIntentActivities.get(i).activityInfo.applicationInfo.packageName)) {
                        return Boolean.TRUE;
                    }
                }
            }
        } catch (Exception e2) {
            e.c("PushSelfShowLog", e2.toString(), e2);
        }
        return Boolean.FALSE;
    }

    public static String a(Context context, String str, String str2) {
        try {
            return context.getResources().getConfiguration().locale.getLanguage().endsWith("zh") ? str : str2;
        } catch (Exception e2) {
            e.c("PushSelfShowLog", "getStringByLanguage failed ", e2);
        }
    }

    public static String a(ResolveInfo resolveInfo) {
        return resolveInfo.serviceInfo != null ? resolveInfo.serviceInfo.packageName : resolveInfo.activityInfo.packageName;
    }

    public static String a(String str) {
        try {
            return a(g.a(str.getBytes("UTF-8"), "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDf5raDExuuXbsVNCWl48yuB89W\rfNOuuhPuS2Mptii/0UorpzypBkNTTGt11E7aorCc1lFwlB+4KDMIpFyQsdChSk+A\rt9UfhFKa95uiDpMe5rMfU+DAhoXGER6WQ2qGtrHmBWVv33i3lc76u9IgEfYuLwC6\r1mhQDHzAKPiViY6oeQIDAQAB\r"));
        } catch (Exception e2) {
            e.d("PushSelfShowLog", "encrypter error ", e2);
            return "";
        }
    }

    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(f25363a[(bArr[i] >>> 4) & 15]);
            sb.append(f25363a[bArr[i] & 15]);
        }
        return sb.toString();
    }

    public static void a(Context context, Intent intent, long j) {
        try {
            e.a("PushSelfShowLog", "enter setAPDelayAlarm(intent:" + intent.toURI() + " interval:" + j + "ms, context:" + context);
            ((AlarmManager) context.getSystemService("alarm")).set(0, System.currentTimeMillis() + j, PendingIntent.getBroadcast(context, new SecureRandom().nextInt(), intent, 0));
        } catch (Exception e2) {
            e.a("PushSelfShowLog", "set DelayAlarm error", (Throwable) e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0049, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(android.content.Context r3, android.widget.TextView r4) {
        /*
            java.lang.Class<com.huawei.android.pushselfshow.utils.a> r0 = com.huawei.android.pushselfshow.utils.a.class
            monitor-enter(r0)
            if (r3 == 0) goto L_0x004a
            if (r4 != 0) goto L_0x0008
            goto L_0x004a
        L_0x0008:
            int r3 = com.huawei.android.pushagent.utils.a.b.a()     // Catch:{ all -> 0x0053 }
            r1 = 10
            if (r3 < r1) goto L_0x0048
            boolean r3 = e()     // Catch:{ all -> 0x0053 }
            if (r3 == 0) goto L_0x0048
            java.lang.String r3 = "chnfzxh"
            int r1 = com.huawei.android.pushagent.utils.a.b.a()     // Catch:{ all -> 0x0053 }
            r2 = 11
            if (r1 < r2) goto L_0x0022
            java.lang.String r3 = "HwChinese-medium"
        L_0x0022:
            android.graphics.Typeface r1 = f25364b     // Catch:{ all -> 0x0053 }
            if (r1 != 0) goto L_0x0038
            r1 = 0
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r3, r1)     // Catch:{ Exception -> 0x002e }
            f25364b = r3     // Catch:{ Exception -> 0x002e }
            goto L_0x0038
        L_0x002e:
            r3 = move-exception
            java.lang.String r1 = "PushSelfShowLog"
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0053 }
            com.huawei.android.pushagent.utils.a.e.d(r1, r3)     // Catch:{ all -> 0x0053 }
        L_0x0038:
            android.graphics.Typeface r3 = f25364b     // Catch:{ all -> 0x0053 }
            if (r3 == 0) goto L_0x0048
            java.lang.String r3 = "PushSelfShowLog"
            java.lang.String r1 = "setTypeFaceEx success"
            com.huawei.android.pushagent.utils.a.e.a(r3, r1)     // Catch:{ all -> 0x0053 }
            android.graphics.Typeface r3 = f25364b     // Catch:{ all -> 0x0053 }
            r4.setTypeface(r3)     // Catch:{ all -> 0x0053 }
        L_0x0048:
            monitor-exit(r0)
            return
        L_0x004a:
            java.lang.String r3 = "PushSelfShowLog"
            java.lang.String r4 = "context is null or textView is null"
            com.huawei.android.pushagent.utils.a.e.b(r3, r4)     // Catch:{ all -> 0x0053 }
            monitor-exit(r0)
            return
        L_0x0053:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushselfshow.utils.a.a(android.content.Context, android.widget.TextView):void");
    }

    public static void a(Context context, String str, com.huawei.android.pushselfshow.b.a aVar) {
        if (aVar != null) {
            a(context, str, aVar.m, aVar.p);
        }
    }

    public static void a(Context context, String str, String str2, String str3) {
        new Thread(new b(context, str2, str, str3)).start();
    }

    public static void a(File file) {
        if (file != null) {
            e.a("PushSelfShowLog", "delete file " + file.getAbsolutePath());
            File file2 = new File(file.getAbsolutePath() + System.currentTimeMillis());
            if (file.renameTo(file2)) {
                if ((!file2.isFile() || !file2.delete()) && file2.isDirectory()) {
                    File[] listFiles = file2.listFiles();
                    if (listFiles != null && listFiles.length != 0) {
                        for (File a2 : listFiles) {
                            a(a2);
                        }
                        if (!file2.delete()) {
                            e.a("PushSelfShowLog", "delete file unsuccess");
                        }
                    } else if (!file2.delete()) {
                        e.a("PushSelfShowLog", "delete file failed");
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0120 A[SYNTHETIC, Splitter:B:104:0x0120] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00a5 A[SYNTHETIC, Splitter:B:61:0x00a5] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00b3 A[SYNTHETIC, Splitter:B:66:0x00b3] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d1 A[SYNTHETIC, Splitter:B:75:0x00d1] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00df A[SYNTHETIC, Splitter:B:80:0x00df] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00e6 A[SYNTHETIC, Splitter:B:85:0x00e6] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00f4 A[SYNTHETIC, Splitter:B:90:0x00f4] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0112 A[SYNTHETIC, Splitter:B:99:0x0112] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.io.File r6, java.io.File r7) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0098, all -> 0x0093 }
            r1.<init>(r6)     // Catch:{ IOException -> 0x0098, all -> 0x0093 }
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x008f, all -> 0x008b }
            r6.<init>(r1)     // Catch:{ IOException -> 0x008f, all -> 0x008b }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0085, all -> 0x007e }
            r2.<init>(r7)     // Catch:{ IOException -> 0x0085, all -> 0x007e }
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0078, all -> 0x0071 }
            r7.<init>(r2)     // Catch:{ IOException -> 0x0078, all -> 0x0071 }
            r0 = 5120(0x1400, float:7.175E-42)
            byte[] r0 = new byte[r0]     // Catch:{ IOException -> 0x006c, all -> 0x0066 }
        L_0x0019:
            int r3 = r6.read(r0)     // Catch:{ IOException -> 0x006c, all -> 0x0066 }
            r4 = -1
            if (r3 == r4) goto L_0x0025
            r4 = 0
            r7.write(r0, r4, r3)     // Catch:{ IOException -> 0x006c, all -> 0x0066 }
            goto L_0x0019
        L_0x0025:
            r6.close()     // Catch:{ Exception -> 0x0029 }
            goto L_0x0031
        L_0x0029:
            r6 = move-exception
            java.lang.String r0 = "PushSelfShowLog"
            java.lang.String r3 = "inBuff.close() "
            com.huawei.android.pushagent.utils.a.e.d(r0, r3, r6)
        L_0x0031:
            r7.flush()     // Catch:{ Exception -> 0x0035 }
            goto L_0x003f
        L_0x0035:
            r6 = move-exception
            java.lang.String r0 = "PushSelfShowLog"
            java.lang.String r3 = r6.toString()
            com.huawei.android.pushagent.utils.a.e.c(r0, r3, r6)
        L_0x003f:
            r7.close()     // Catch:{ Exception -> 0x0043 }
            goto L_0x004d
        L_0x0043:
            r6 = move-exception
            java.lang.String r7 = "PushSelfShowLog"
            java.lang.String r0 = r6.toString()
            com.huawei.android.pushagent.utils.a.e.c(r7, r0, r6)
        L_0x004d:
            r2.close()     // Catch:{ Exception -> 0x0051 }
            goto L_0x0059
        L_0x0051:
            r6 = move-exception
            java.lang.String r7 = "PushSelfShowLog"
            java.lang.String r0 = "output.close() "
            com.huawei.android.pushagent.utils.a.e.d(r7, r0, r6)
        L_0x0059:
            r1.close()     // Catch:{ Exception -> 0x005d }
            return
        L_0x005d:
            r6 = move-exception
            java.lang.String r7 = "PushSelfShowLog"
            java.lang.String r0 = "input.close() "
            com.huawei.android.pushagent.utils.a.e.d(r7, r0, r6)
            return
        L_0x0066:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r5
            goto L_0x00e4
        L_0x006c:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r5
            goto L_0x009c
        L_0x0071:
            r7 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
            goto L_0x00e4
        L_0x0078:
            r7 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
            goto L_0x009c
        L_0x007e:
            r7 = move-exception
            r2 = r0
            r0 = r6
            r6 = r7
            r7 = r2
            goto L_0x00e4
        L_0x0085:
            r7 = move-exception
            r2 = r0
            r0 = r6
            r6 = r7
            r7 = r2
            goto L_0x009c
        L_0x008b:
            r6 = move-exception
            r7 = r0
            r2 = r7
            goto L_0x00e4
        L_0x008f:
            r6 = move-exception
            r7 = r0
            r2 = r7
            goto L_0x009c
        L_0x0093:
            r6 = move-exception
            r7 = r0
            r1 = r7
            r2 = r1
            goto L_0x00e4
        L_0x0098:
            r6 = move-exception
            r7 = r0
            r1 = r7
            r2 = r1
        L_0x009c:
            java.lang.String r3 = "PushSelfShowLog"
            java.lang.String r4 = "copyFile "
            com.huawei.android.pushagent.utils.a.e.d(r3, r4, r6)     // Catch:{ all -> 0x00e3 }
            if (r0 == 0) goto L_0x00b1
            r0.close()     // Catch:{ Exception -> 0x00a9 }
            goto L_0x00b1
        L_0x00a9:
            r6 = move-exception
            java.lang.String r0 = "PushSelfShowLog"
            java.lang.String r3 = "inBuff.close() "
            com.huawei.android.pushagent.utils.a.e.d(r0, r3, r6)
        L_0x00b1:
            if (r7 == 0) goto L_0x00cf
            r7.flush()     // Catch:{ Exception -> 0x00b7 }
            goto L_0x00c1
        L_0x00b7:
            r6 = move-exception
            java.lang.String r0 = "PushSelfShowLog"
            java.lang.String r3 = r6.toString()
            com.huawei.android.pushagent.utils.a.e.c(r0, r3, r6)
        L_0x00c1:
            r7.close()     // Catch:{ Exception -> 0x00c5 }
            goto L_0x00cf
        L_0x00c5:
            r6 = move-exception
            java.lang.String r7 = "PushSelfShowLog"
            java.lang.String r0 = r6.toString()
            com.huawei.android.pushagent.utils.a.e.c(r7, r0, r6)
        L_0x00cf:
            if (r2 == 0) goto L_0x00dd
            r2.close()     // Catch:{ Exception -> 0x00d5 }
            goto L_0x00dd
        L_0x00d5:
            r6 = move-exception
            java.lang.String r7 = "PushSelfShowLog"
            java.lang.String r0 = "output.close() "
            com.huawei.android.pushagent.utils.a.e.d(r7, r0, r6)
        L_0x00dd:
            if (r1 == 0) goto L_0x00e2
            r1.close()     // Catch:{ Exception -> 0x005d }
        L_0x00e2:
            return
        L_0x00e3:
            r6 = move-exception
        L_0x00e4:
            if (r0 == 0) goto L_0x00f2
            r0.close()     // Catch:{ Exception -> 0x00ea }
            goto L_0x00f2
        L_0x00ea:
            r0 = move-exception
            java.lang.String r3 = "PushSelfShowLog"
            java.lang.String r4 = "inBuff.close() "
            com.huawei.android.pushagent.utils.a.e.d(r3, r4, r0)
        L_0x00f2:
            if (r7 == 0) goto L_0x0110
            r7.flush()     // Catch:{ Exception -> 0x00f8 }
            goto L_0x0102
        L_0x00f8:
            r0 = move-exception
            java.lang.String r3 = "PushSelfShowLog"
            java.lang.String r4 = r0.toString()
            com.huawei.android.pushagent.utils.a.e.c(r3, r4, r0)
        L_0x0102:
            r7.close()     // Catch:{ Exception -> 0x0106 }
            goto L_0x0110
        L_0x0106:
            r7 = move-exception
            java.lang.String r0 = "PushSelfShowLog"
            java.lang.String r3 = r7.toString()
            com.huawei.android.pushagent.utils.a.e.c(r0, r3, r7)
        L_0x0110:
            if (r2 == 0) goto L_0x011e
            r2.close()     // Catch:{ Exception -> 0x0116 }
            goto L_0x011e
        L_0x0116:
            r7 = move-exception
            java.lang.String r0 = "PushSelfShowLog"
            java.lang.String r2 = "output.close() "
            com.huawei.android.pushagent.utils.a.e.d(r0, r2, r7)
        L_0x011e:
            if (r1 == 0) goto L_0x012c
            r1.close()     // Catch:{ Exception -> 0x0124 }
            goto L_0x012c
        L_0x0124:
            r7 = move-exception
            java.lang.String r0 = "PushSelfShowLog"
            java.lang.String r1 = "input.close() "
            com.huawei.android.pushagent.utils.a.e.d(r0, r1, r7)
        L_0x012c:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushselfshow.utils.a.a(java.io.File, java.io.File):void");
    }

    public static boolean a(Context context, Intent intent) {
        if (context == null) {
            e.b("PushSelfShowLog", "context is null");
            return false;
        } else if (intent == null) {
            e.b("PushSelfShowLog", "intent is null");
            return false;
        } else {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 640);
            if (queryIntentActivities == null || queryIntentActivities.size() == 0) {
                e.d("PushSelfShowLog", "no activity exist, may be system Err!! pkgName:");
                return false;
            }
            boolean z = queryIntentActivities.get(0).activityInfo.exported;
            e.b("PushSelfShowLog", "exportedFlag:" + z);
            String str = queryIntentActivities.get(0).activityInfo.permission;
            e.b("PushSelfShowLog", "need permission:" + str);
            if (!z) {
                return false;
            }
            return TextUtils.isEmpty(str) || "com.huawei.pushagent.permission.LAUNCH_ACTIVITY".equals(str);
        }
    }

    public static boolean a(String str, String str2) {
        try {
            e.a("PushSelfShowLog", "urlSrc is %s ,urlDest is %s,urlDest is already exist?%s ", str, str2, Boolean.valueOf(new File(str2).mkdirs()));
            File[] listFiles = new File(str).listFiles();
            if (listFiles != null) {
                for (int i = 0; i < listFiles.length; i++) {
                    if (listFiles[i].isFile()) {
                        a(listFiles[i], new File(str2 + File.separator + listFiles[i].getName()));
                    }
                    if (listFiles[i].isDirectory()) {
                        b(str + File.separator + listFiles[i].getName(), str2 + File.separator + listFiles[i].getName());
                    }
                }
            }
            return true;
        } catch (Exception e2) {
            e.d("PushSelfShowLog", "fileCopy error ", e2);
            return false;
        }
    }

    public static long b(String str) {
        if (str == null) {
            str = "";
        }
        try {
            Date date = new Date();
            int hours = (date.getHours() * 2) + (date.getMinutes() / 30);
            String concat = str.concat(str);
            e.a("PushSelfShowLog", "startIndex is %s ,and ap is %s ,length is %s", Integer.valueOf(hours), concat, Integer.valueOf(concat.length()));
            for (int i = hours; i < concat.length(); i++) {
                if (concat.charAt(i) != '0') {
                    long minutes = ((long) (((i - hours) * 30) - (date.getMinutes() % 30))) * 60000;
                    e.a("PushSelfShowLog", "startIndex is %s i is %s delay %s", Integer.valueOf(hours), Integer.valueOf(i), Long.valueOf(minutes));
                    if (minutes >= 0) {
                        return minutes;
                    }
                    return 0;
                }
            }
        } catch (Exception e2) {
            e.c("PushSelfShowLog", "error ", e2);
        }
        return 0;
    }

    public static String b(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getDeviceId() : "";
    }

    private static String b(ResolveInfo resolveInfo, String str) {
        Bundle bundle = resolveInfo.serviceInfo != null ? resolveInfo.serviceInfo.metaData : resolveInfo.activityInfo.metaData;
        if (bundle == null) {
            return null;
        }
        return bundle.getString(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x005d A[SYNTHETIC, Splitter:B:38:0x005d] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x006b A[SYNTHETIC, Splitter:B:43:0x006b] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0072 A[SYNTHETIC, Splitter:B:48:0x0072] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0080 A[SYNTHETIC, Splitter:B:53:0x0080] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            r1.<init>(r4)     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            boolean r1 = r1.exists()     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            if (r1 != 0) goto L_0x0030
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            java.io.InputStream r2 = r2.open(r3)     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x002e }
            r3.<init>(r4)     // Catch:{ IOException -> 0x002e }
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch:{ IOException -> 0x002b, all -> 0x0028 }
        L_0x001d:
            int r0 = r2.read(r4)     // Catch:{ IOException -> 0x002b, all -> 0x0028 }
            if (r0 <= 0) goto L_0x0032
            r1 = 0
            r3.write(r4, r1, r0)     // Catch:{ IOException -> 0x002b, all -> 0x0028 }
            goto L_0x001d
        L_0x0028:
            r4 = move-exception
            r0 = r3
            goto L_0x0070
        L_0x002b:
            r4 = move-exception
            r0 = r3
            goto L_0x0054
        L_0x002e:
            r4 = move-exception
            goto L_0x0054
        L_0x0030:
            r2 = r0
            r3 = r2
        L_0x0032:
            if (r3 == 0) goto L_0x0040
            r3.close()     // Catch:{ Exception -> 0x0038 }
            goto L_0x0040
        L_0x0038:
            r3 = move-exception
            java.lang.String r4 = "PushSelfShowLog"
            java.lang.String r0 = "fos.close() "
            com.huawei.android.pushagent.utils.a.e.d(r4, r0, r3)
        L_0x0040:
            if (r2 == 0) goto L_0x004e
            r2.close()     // Catch:{ Exception -> 0x0046 }
            goto L_0x004e
        L_0x0046:
            r2 = move-exception
            java.lang.String r3 = "PushSelfShowLog"
            java.lang.String r4 = "is.close() "
            com.huawei.android.pushagent.utils.a.e.d(r3, r4, r2)
        L_0x004e:
            return
        L_0x004f:
            r4 = move-exception
            r2 = r0
            goto L_0x0070
        L_0x0052:
            r4 = move-exception
            r2 = r0
        L_0x0054:
            java.lang.String r3 = "PushSelfShowLog"
            java.lang.String r1 = "copyAsset "
            com.huawei.android.pushagent.utils.a.e.d(r3, r1, r4)     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x0069
            r0.close()     // Catch:{ Exception -> 0x0061 }
            goto L_0x0069
        L_0x0061:
            r3 = move-exception
            java.lang.String r4 = "PushSelfShowLog"
            java.lang.String r0 = "fos.close() "
            com.huawei.android.pushagent.utils.a.e.d(r4, r0, r3)
        L_0x0069:
            if (r2 == 0) goto L_0x006e
            r2.close()     // Catch:{ Exception -> 0x0046 }
        L_0x006e:
            return
        L_0x006f:
            r4 = move-exception
        L_0x0070:
            if (r0 == 0) goto L_0x007e
            r0.close()     // Catch:{ Exception -> 0x0076 }
            goto L_0x007e
        L_0x0076:
            r3 = move-exception
            java.lang.String r0 = "PushSelfShowLog"
            java.lang.String r1 = "fos.close() "
            com.huawei.android.pushagent.utils.a.e.d(r0, r1, r3)
        L_0x007e:
            if (r2 == 0) goto L_0x008c
            r2.close()     // Catch:{ Exception -> 0x0084 }
            goto L_0x008c
        L_0x0084:
            r2 = move-exception
            java.lang.String r3 = "PushSelfShowLog"
            java.lang.String r0 = "is.close() "
            com.huawei.android.pushagent.utils.a.e.d(r3, r0, r2)
        L_0x008c:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushselfshow.utils.a.b(android.content.Context, java.lang.String, java.lang.String):void");
    }

    public static void b(File file) {
        e.a("PushSelfShowLog", "delete file before ");
        if (file != null && file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length != 0) {
                long currentTimeMillis = System.currentTimeMillis();
                for (int i = 0; i < listFiles.length; i++) {
                    try {
                        File file2 = listFiles[i];
                        if (currentTimeMillis - file2.lastModified() > 86400000) {
                            e.e("PushSelfShowLog", "delete file before " + file2.getAbsolutePath());
                            a(file2);
                        }
                    } catch (Exception e2) {
                        e.e("PushSelfShowLog", e2.toString());
                    }
                }
            }
        }
    }

    private static void b(String str, String str2) throws IOException {
        if (new File(str2).mkdirs()) {
            e.e("PushSelfShowLog", "mkdir");
        }
        File[] listFiles = new File(str).listFiles();
        if (listFiles != null) {
            for (int i = 0; i < listFiles.length; i++) {
                if (listFiles[i].isFile()) {
                    a(listFiles[i], new File(new File(str2).getAbsolutePath() + File.separator + listFiles[i].getName()));
                }
                if (listFiles[i].isDirectory()) {
                    b(str + "/" + listFiles[i].getName(), str2 + "/" + listFiles[i].getName());
                }
            }
        }
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 11;
    }

    public static boolean b(Context context, String str) {
        if (!(context == null || str == null || "".equals(str))) {
            try {
                if (context.getPackageManager().getApplicationInfo(str, 8192) == null) {
                    return false;
                }
                e.a("PushSelfShowLog", str + " is installed");
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static String c(Context context, String str) {
        String str2 = "";
        try {
            String path = (!Environment.getExternalStorageState().equals("mounted") ? context.getFilesDir() : Environment.getExternalStorageDirectory()).getPath();
            String str3 = path + File.separator + "PushService";
            String str4 = str3 + File.separator + str;
            try {
                e.a("PushSelfShowLog", "dbPath is " + str4);
                return str4;
            } catch (Exception e2) {
                str2 = str4;
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            e.d("PushSelfShowLog", "getDbPath error", e);
            return str2;
        }
    }

    public static ArrayList c(Context context) {
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details?id="));
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (!(queryIntentActivities == null || queryIntentActivities.size() == 0)) {
            int size = queryIntentActivities.size();
            for (int i = 0; i < size; i++) {
                if (queryIntentActivities.get(i).activityInfo != null) {
                    arrayList.add(queryIntentActivities.get(i).activityInfo.applicationInfo.packageName);
                }
            }
        }
        return arrayList;
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 16;
    }

    public static boolean d() {
        return b.a() >= 9;
    }

    public static boolean d(Context context) {
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setPackage("com.android.email");
        intent.setData(Uri.fromParts("mailto", "xxxx@xxxx.com", null));
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        return (queryIntentActivities == null || queryIntentActivities.size() == 0) ? false : true;
    }

    private static boolean e() {
        return "zh".equals(Locale.getDefault().getLanguage());
    }

    public static boolean e(Context context) {
        return "com.huawei.android.pushagent".equals(context.getPackageName());
    }

    public static boolean f(Context context) {
        try {
            if (context.getPackageManager().getApplicationInfo("com.huawei.android.pushagent", SearchJediMixFeedAdapter.f42517f) != null) {
                return true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean g(android.content.Context r7) {
        /*
            android.content.ContentResolver r0 = r7.getContentResolver()
            r7 = 0
            r6 = 0
            android.net.Uri r1 = com.huawei.android.pushselfshow.richpush.provider.RichMediaProvider.a.f25350a     // Catch:{ Exception -> 0x004d }
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x004d }
            if (r0 == 0) goto L_0x0044
            boolean r1 = r0.moveToFirst()     // Catch:{ Exception -> 0x0041, all -> 0x003f }
            if (r1 == 0) goto L_0x0044
            java.lang.String r1 = "isSupport"
            int r1 = r0.getColumnIndex(r1)     // Catch:{ Exception -> 0x0041, all -> 0x003f }
            int r1 = r0.getInt(r1)     // Catch:{ Exception -> 0x0041, all -> 0x003f }
            java.lang.String r2 = "PushSelfShowLog"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0041, all -> 0x003f }
            java.lang.String r4 = "isExistProvider:"
            r3.<init>(r4)     // Catch:{ Exception -> 0x0041, all -> 0x003f }
            r3.append(r1)     // Catch:{ Exception -> 0x0041, all -> 0x003f }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0041, all -> 0x003f }
            com.huawei.android.pushagent.utils.a.e.a(r2, r3)     // Catch:{ Exception -> 0x0041, all -> 0x003f }
            r2 = 1
            if (r2 != r1) goto L_0x0039
            r7 = 1
        L_0x0039:
            if (r0 == 0) goto L_0x003e
            r0.close()
        L_0x003e:
            return r7
        L_0x003f:
            r7 = move-exception
            goto L_0x005d
        L_0x0041:
            r1 = move-exception
            r6 = r0
            goto L_0x004e
        L_0x0044:
            if (r0 == 0) goto L_0x005c
            r0.close()
            goto L_0x005c
        L_0x004a:
            r7 = move-exception
            r0 = r6
            goto L_0x005d
        L_0x004d:
            r1 = move-exception
        L_0x004e:
            java.lang.String r0 = "PushSelfShowLog"
            java.lang.String r2 = r1.toString()     // Catch:{ all -> 0x004a }
            com.huawei.android.pushagent.utils.a.e.a((java.lang.String) r0, (java.lang.String) r2, (java.lang.Throwable) r1)     // Catch:{ all -> 0x004a }
            if (r6 == 0) goto L_0x005c
            r6.close()
        L_0x005c:
            return r7
        L_0x005d:
            if (r0 == 0) goto L_0x0062
            r0.close()
        L_0x0062:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushselfshow.utils.a.g(android.content.Context):boolean");
    }

    public static int h(Context context) {
        if (context == null) {
            return 3;
        }
        return (Build.VERSION.SDK_INT < 16 || context.getResources().getIdentifier("androidhwext:style/Theme.Emui", null, null) == 0) ? 3 : 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.SecurityException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.NoSuchMethodException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.IllegalArgumentException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.IllegalAccessException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.reflect.InvocationTargetException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.lang.SecurityException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.lang.SecurityException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: java.lang.SecurityException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: java.lang.SecurityException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: java.lang.SecurityException} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int i(android.content.Context r6) {
        /*
            r0 = 0
            java.lang.String r1 = "com.huawei.android.immersion.ImmersionStyle"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0061, SecurityException -> 0x0056, NoSuchMethodException -> 0x004e, IllegalArgumentException -> 0x0046, IllegalAccessException -> 0x003e, InvocationTargetException -> 0x0036 }
            java.lang.String r2 = "getPrimaryColor"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x0061, SecurityException -> 0x0056, NoSuchMethodException -> 0x004e, IllegalArgumentException -> 0x0046, IllegalAccessException -> 0x003e, InvocationTargetException -> 0x0036 }
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r4[r0] = r5     // Catch:{ ClassNotFoundException -> 0x0061, SecurityException -> 0x0056, NoSuchMethodException -> 0x004e, IllegalArgumentException -> 0x0046, IllegalAccessException -> 0x003e, InvocationTargetException -> 0x0036 }
            java.lang.reflect.Method r2 = r1.getDeclaredMethod(r2, r4)     // Catch:{ ClassNotFoundException -> 0x0061, SecurityException -> 0x0056, NoSuchMethodException -> 0x004e, IllegalArgumentException -> 0x0046, IllegalAccessException -> 0x003e, InvocationTargetException -> 0x0036 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x0061, SecurityException -> 0x0056, NoSuchMethodException -> 0x004e, IllegalArgumentException -> 0x0046, IllegalAccessException -> 0x003e, InvocationTargetException -> 0x0036 }
            r3[r0] = r6     // Catch:{ ClassNotFoundException -> 0x0061, SecurityException -> 0x0056, NoSuchMethodException -> 0x004e, IllegalArgumentException -> 0x0046, IllegalAccessException -> 0x003e, InvocationTargetException -> 0x0036 }
            java.lang.Object r6 = r2.invoke(r1, r3)     // Catch:{ ClassNotFoundException -> 0x0061, SecurityException -> 0x0056, NoSuchMethodException -> 0x004e, IllegalArgumentException -> 0x0046, IllegalAccessException -> 0x003e, InvocationTargetException -> 0x0036 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ ClassNotFoundException -> 0x0061, SecurityException -> 0x0056, NoSuchMethodException -> 0x004e, IllegalArgumentException -> 0x0046, IllegalAccessException -> 0x003e, InvocationTargetException -> 0x0036 }
            int r6 = r6.intValue()     // Catch:{ ClassNotFoundException -> 0x0061, SecurityException -> 0x0056, NoSuchMethodException -> 0x004e, IllegalArgumentException -> 0x0046, IllegalAccessException -> 0x003e, InvocationTargetException -> 0x0036 }
            java.lang.String r1 = "PushSelfShowLog"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0061, SecurityException -> 0x0056, NoSuchMethodException -> 0x004e, IllegalArgumentException -> 0x0046, IllegalAccessException -> 0x003e, InvocationTargetException -> 0x0036 }
            java.lang.String r3 = "colorPrimary:"
            r2.<init>(r3)     // Catch:{ ClassNotFoundException -> 0x0061, SecurityException -> 0x0056, NoSuchMethodException -> 0x004e, IllegalArgumentException -> 0x0046, IllegalAccessException -> 0x003e, InvocationTargetException -> 0x0036 }
            r2.append(r6)     // Catch:{ ClassNotFoundException -> 0x0061, SecurityException -> 0x0056, NoSuchMethodException -> 0x004e, IllegalArgumentException -> 0x0046, IllegalAccessException -> 0x003e, InvocationTargetException -> 0x0036 }
            java.lang.String r2 = r2.toString()     // Catch:{ ClassNotFoundException -> 0x0061, SecurityException -> 0x0056, NoSuchMethodException -> 0x004e, IllegalArgumentException -> 0x0046, IllegalAccessException -> 0x003e, InvocationTargetException -> 0x0036 }
            com.huawei.android.pushagent.utils.a.e.b(r1, r2)     // Catch:{ ClassNotFoundException -> 0x0061, SecurityException -> 0x0056, NoSuchMethodException -> 0x004e, IllegalArgumentException -> 0x0046, IllegalAccessException -> 0x003e, InvocationTargetException -> 0x0036 }
            return r6
        L_0x0036:
            r6 = move-exception
            java.lang.String r1 = "PushSelfShowLog"
            java.lang.String r2 = r6.toString()
            goto L_0x005d
        L_0x003e:
            r6 = move-exception
            java.lang.String r1 = "PushSelfShowLog"
            java.lang.String r2 = r6.toString()
            goto L_0x005d
        L_0x0046:
            r6 = move-exception
            java.lang.String r1 = "PushSelfShowLog"
            java.lang.String r2 = r6.toString()
            goto L_0x005d
        L_0x004e:
            r6 = move-exception
            java.lang.String r1 = "PushSelfShowLog"
            java.lang.String r2 = r6.toString()
            goto L_0x005d
        L_0x0056:
            r6 = move-exception
            java.lang.String r1 = "PushSelfShowLog"
            java.lang.String r2 = r6.toString()
        L_0x005d:
            com.huawei.android.pushagent.utils.a.e.c(r1, r2, r6)
            goto L_0x0068
        L_0x0061:
            java.lang.String r6 = "PushSelfShowLog"
            java.lang.String r1 = "ImmersionStyle ClassNotFoundException"
            com.huawei.android.pushagent.utils.a.e.d(r6, r1)
        L_0x0068:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushselfshow.utils.a.i(android.content.Context):int");
    }

    public static int j(Context context) {
        int i;
        InvocationTargetException invocationTargetException;
        String str;
        String str2;
        SecurityException securityException;
        NoSuchMethodException noSuchMethodException;
        IllegalArgumentException illegalArgumentException;
        IllegalAccessException illegalAccessException;
        InvocationTargetException invocationTargetException2;
        int i2 = -1;
        try {
            Class<?> cls = Class.forName("com.huawei.android.immersion.ImmersionStyle");
            int intValue = ((Integer) cls.getDeclaredMethod("getPrimaryColor", new Class[]{Context.class}).invoke(cls, new Object[]{context})).intValue();
            i = ((Integer) cls.getDeclaredMethod("getSuggestionForgroundColorStyle", new Class[]{Integer.TYPE}).invoke(cls, new Object[]{Integer.valueOf(intValue)})).intValue();
            try {
                e.b("PushSelfShowLog", "getSuggestionForgroundColorStyle:" + i);
            } catch (ClassNotFoundException unused) {
            } catch (SecurityException e2) {
                SecurityException securityException2 = e2;
                i2 = i;
                securityException = securityException2;
                str2 = "PushSelfShowLog";
                str = securityException.toString();
                invocationTargetException = securityException;
                e.c(str2, str, invocationTargetException);
                return i2;
            } catch (NoSuchMethodException e3) {
                NoSuchMethodException noSuchMethodException2 = e3;
                i2 = i;
                noSuchMethodException = noSuchMethodException2;
                str2 = "PushSelfShowLog";
                str = noSuchMethodException.toString();
                invocationTargetException = noSuchMethodException;
                e.c(str2, str, invocationTargetException);
                return i2;
            } catch (IllegalArgumentException e4) {
                IllegalArgumentException illegalArgumentException2 = e4;
                i2 = i;
                illegalArgumentException = illegalArgumentException2;
                str2 = "PushSelfShowLog";
                str = illegalArgumentException.toString();
                invocationTargetException = illegalArgumentException;
                e.c(str2, str, invocationTargetException);
                return i2;
            } catch (IllegalAccessException e5) {
                IllegalAccessException illegalAccessException2 = e5;
                i2 = i;
                illegalAccessException = illegalAccessException2;
                str2 = "PushSelfShowLog";
                str = illegalAccessException.toString();
                invocationTargetException = illegalAccessException;
                e.c(str2, str, invocationTargetException);
                return i2;
            } catch (InvocationTargetException e6) {
                InvocationTargetException invocationTargetException3 = e6;
                i2 = i;
                invocationTargetException2 = invocationTargetException3;
                str2 = "PushSelfShowLog";
                str = invocationTargetException2.toString();
                invocationTargetException = invocationTargetException2;
                e.c(str2, str, invocationTargetException);
                return i2;
            }
        } catch (ClassNotFoundException unused2) {
            i = -1;
            e.d("PushSelfShowLog", "ImmersionStyle ClassNotFoundException");
            return i;
        } catch (SecurityException e7) {
            securityException = e7;
            str2 = "PushSelfShowLog";
            str = securityException.toString();
            invocationTargetException = securityException;
            e.c(str2, str, invocationTargetException);
            return i2;
        } catch (NoSuchMethodException e8) {
            noSuchMethodException = e8;
            str2 = "PushSelfShowLog";
            str = noSuchMethodException.toString();
            invocationTargetException = noSuchMethodException;
            e.c(str2, str, invocationTargetException);
            return i2;
        } catch (IllegalArgumentException e9) {
            illegalArgumentException = e9;
            str2 = "PushSelfShowLog";
            str = illegalArgumentException.toString();
            invocationTargetException = illegalArgumentException;
            e.c(str2, str, invocationTargetException);
            return i2;
        } catch (IllegalAccessException e10) {
            illegalAccessException = e10;
            str2 = "PushSelfShowLog";
            str = illegalAccessException.toString();
            invocationTargetException = illegalAccessException;
            e.c(str2, str, invocationTargetException);
            return i2;
        } catch (InvocationTargetException e11) {
            invocationTargetException2 = e11;
            str2 = "PushSelfShowLog";
            str = invocationTargetException2.toString();
            invocationTargetException = invocationTargetException2;
            e.c(str2, str, invocationTargetException);
            return i2;
        }
        return i;
    }

    public static String k(Context context) {
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir != null) {
            return externalCacheDir.getPath();
        }
        String str = "/Android/data/" + context.getPackageName() + "/cache";
        return Environment.getExternalStorageDirectory().getPath() + str;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m(android.content.Context r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = -1
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ Exception -> 0x0025 }
            java.lang.String r2 = "user_experience_involved"
            int r4 = android.provider.Settings.Secure.getInt(r4, r2, r1)     // Catch:{ Exception -> 0x0025 }
            java.lang.String r1 = "PushSelfShowLog"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0023 }
            java.lang.String r3 = "settingMainSwitch:"
            r2.<init>(r3)     // Catch:{ Exception -> 0x0023 }
            r2.append(r4)     // Catch:{ Exception -> 0x0023 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0023 }
            com.huawei.android.pushagent.utils.a.e.a(r1, r2)     // Catch:{ Exception -> 0x0023 }
            goto L_0x0031
        L_0x0023:
            r1 = move-exception
            goto L_0x0028
        L_0x0025:
            r4 = move-exception
            r1 = r4
            r4 = -1
        L_0x0028:
            java.lang.String r2 = "PushSelfShowLog"
            java.lang.String r3 = r1.toString()
            com.huawei.android.pushagent.utils.a.e.c(r2, r3, r1)
        L_0x0031:
            r1 = 1
            if (r4 != r1) goto L_0x0035
            return r1
        L_0x0035:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushselfshow.utils.a.m(android.content.Context):boolean");
    }
}
