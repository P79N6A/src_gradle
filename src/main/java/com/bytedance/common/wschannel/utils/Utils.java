package com.bytedance.common.wschannel.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.util.Date;

public class Utils {
    private static String sCurProcessName;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c A[SYNTHETIC, Splitter:B:17:0x004c] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053 A[SYNTHETIC, Splitter:B:25:0x0053] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getCurProcessNameFromProc() {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0050, all -> 0x0049 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x0050, all -> 0x0049 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0050, all -> 0x0049 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0050, all -> 0x0049 }
            java.lang.String r5 = "/proc/"
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0050, all -> 0x0049 }
            int r5 = android.os.Process.myPid()     // Catch:{ Throwable -> 0x0050, all -> 0x0049 }
            r4.append(r5)     // Catch:{ Throwable -> 0x0050, all -> 0x0049 }
            java.lang.String r5 = "/cmdline"
            r4.append(r5)     // Catch:{ Throwable -> 0x0050, all -> 0x0049 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0050, all -> 0x0049 }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0050, all -> 0x0049 }
            java.lang.String r4 = "iso-8859-1"
            r2.<init>(r3, r4)     // Catch:{ Throwable -> 0x0050, all -> 0x0049 }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x0050, all -> 0x0049 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0051, all -> 0x0044 }
            r2.<init>()     // Catch:{ Throwable -> 0x0051, all -> 0x0044 }
        L_0x002e:
            int r3 = r1.read()     // Catch:{ Throwable -> 0x0051, all -> 0x0044 }
            if (r3 <= 0) goto L_0x0039
            char r3 = (char) r3     // Catch:{ Throwable -> 0x0051, all -> 0x0044 }
            r2.append(r3)     // Catch:{ Throwable -> 0x0051, all -> 0x0044 }
            goto L_0x002e
        L_0x0039:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x0051, all -> 0x0044 }
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x0051, all -> 0x0044 }
            r1.close()     // Catch:{ Exception -> 0x0043 }
        L_0x0043:
            return r2
        L_0x0044:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L_0x004a
        L_0x0049:
            r1 = move-exception
        L_0x004a:
            if (r0 == 0) goto L_0x004f
            r0.close()     // Catch:{ Exception -> 0x004f }
        L_0x004f:
            throw r1
        L_0x0050:
            r1 = r0
        L_0x0051:
            if (r1 == 0) goto L_0x0056
            r1.close()     // Catch:{ Exception -> 0x0056 }
        L_0x0056:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.utils.Utils.getCurProcessNameFromProc():java.lang.String");
    }

    public static String getTimeFormat(long j) {
        return DateFormat.getDateTimeInstance().format(new Date(j));
    }

    public static boolean isMessageProcess(String str) {
        if (str == null || !str.endsWith(":push")) {
            return false;
        }
        return true;
    }

    public static boolean isMainProcess(Context context) {
        String curProcessName = getCurProcessName(context);
        if ((curProcessName == null || !curProcessName.contains(":")) && curProcessName != null && curProcessName.equals(context.getPackageName())) {
            return true;
        }
        return false;
    }

    public static String byte2HexStr(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                hexString = PushConstants.PUSH_TYPE_NOTIFY + hexString;
            }
            sb.append(hexString);
            sb.append(" ");
        }
        return sb.toString().toUpperCase().trim();
    }

    public static String getCurProcessName(Context context) {
        String str = sCurProcessName;
        if (!StringUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses()) {
                if (next.pid == myPid) {
                    Logger.debug();
                    String str2 = next.processName;
                    sCurProcessName = str2;
                    return str2;
                }
            }
        } catch (Exception unused) {
        }
        String curProcessNameFromProc = getCurProcessNameFromProc();
        sCurProcessName = curProcessNameFromProc;
        return curProcessNameFromProc;
    }

    public static String md5(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                String hexString = Integer.toHexString(b2 & 255);
                if (hexString.length() == 1) {
                    hexString = PushConstants.PUSH_TYPE_NOTIFY + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static boolean isMainProcess(Context context, String str) {
        if ((str == null || !str.contains(":")) && str != null && str.equals(context.getPackageName())) {
            return true;
        }
        return false;
    }
}
