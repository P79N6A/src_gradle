package cn.com.chinatelecom.a.a.e;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import cn.com.chinatelecom.a.a.c.i;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Enumeration;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1707a = d.class.getCanonicalName();

    /* renamed from: b  reason: collision with root package name */
    private static String f1708b = "";

    public static String c() {
        try {
            return i.a(MessageDigest.getInstance("MD5").digest(i.a("Dev8k03JiceI1OQPLiNfoi2kenm281x2qw")));
        } catch (NoSuchAlgorithmException unused) {
            return "";
        } catch (Exception unused2) {
            return "";
        }
    }

    public static String a() {
        try {
            return "android" + Build.VERSION.RELEASE;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String b() {
        String str = "";
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress()) {
                        str = nextElement.getHostAddress();
                    }
                }
            }
        } catch (SocketException unused) {
        }
        return str;
    }

    public static String e(Context context) {
        return b(context, "android_id");
    }

    public static String b(Context context) {
        try {
            if (!h.a(context)) {
                return "";
            }
            return ((TelephonyManager) context.getSystemService("phone")).getSubscriberId();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String c(Context context) {
        String str;
        try {
            str = e.a(context);
        } catch (Exception unused) {
            str = "";
        }
        if (str == null) {
            return "";
        }
        return str.replace("-", "");
    }

    public static String d(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            String obj = packageManager.getPackageInfo(context.getPackageName(), 0).applicationInfo.loadIcon(packageManager).toString();
            if (!TextUtils.isEmpty(obj)) {
                return obj;
            }
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
        return "";
    }

    public static String a(Context context) {
        try {
            if (!h.a(context)) {
                return "";
            }
            return ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String f(Context context) {
        if (context == null) {
            return "";
        }
        String str = "";
        String str2 = "";
        try {
            String[] split = g(context).split("-", 4);
            if (split.length == 4) {
                String str3 = split[2];
                try {
                    str2 = split[3];
                } catch (Exception unused) {
                }
                str = str3;
            }
        } catch (Exception unused2) {
        }
        if (TextUtils.isEmpty(str)) {
            str = b(context);
        }
        String a2 = a(str);
        String a3 = a(str2);
        return a2 + "," + a3;
    }

    private static String a(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str.startsWith("46000") || str.startsWith("46002") || str.startsWith("46004") || str.startsWith("46007")) {
                return "cm";
            }
            if (str.startsWith("46003") || str.startsWith("46005") || str.startsWith("46011")) {
                return "ct";
            }
            if (str.startsWith("46001") || str.startsWith("46006") || str.startsWith("46009")) {
                return "cu";
            }
        }
        return "";
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x009c A[Catch:{ Error | Exception -> 0x00cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a6 A[Catch:{ Error | Exception -> 0x00cf }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String g(android.content.Context r13) {
        /*
            java.lang.String r0 = ""
            boolean r1 = cn.com.chinatelecom.a.a.e.h.a(r13)     // Catch:{ Error | Exception -> 0x00cf }
            if (r1 != 0) goto L_0x0009
            return r0
        L_0x0009:
            java.lang.String r1 = ""
            java.lang.String r2 = ""
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            java.lang.String r5 = "phone"
            java.lang.Object r5 = r13.getSystemService(r5)     // Catch:{ Exception -> 0x0091 }
            android.telephony.TelephonyManager r5 = (android.telephony.TelephonyManager) r5     // Catch:{ Exception -> 0x0091 }
            java.lang.Class r6 = r5.getClass()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r7 = "getImei"
            r8 = 1
            java.lang.Class[] r9 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x0091 }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0091 }
            r11 = 0
            r9[r11] = r10     // Catch:{ Exception -> 0x0091 }
            java.lang.reflect.Method r7 = r6.getDeclaredMethod(r7, r9)     // Catch:{ Exception -> 0x0091 }
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0091 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0091 }
            r9[r11] = r10     // Catch:{ Exception -> 0x0091 }
            java.lang.Object r9 = r7.invoke(r5, r9)     // Catch:{ Exception -> 0x0091 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0091 }
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x008c }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x008c }
            r1[r11] = r10     // Catch:{ Exception -> 0x008c }
            java.lang.Object r1 = r7.invoke(r5, r1)     // Catch:{ Exception -> 0x008c }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x008c }
            java.lang.String r2 = "getSubscriberId"
            java.lang.Class[] r7 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x008d }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x008d }
            r7[r11] = r10     // Catch:{ Exception -> 0x008d }
            java.lang.reflect.Method r2 = r6.getDeclaredMethod(r2, r7)     // Catch:{ Exception -> 0x008d }
            java.lang.Object[] r6 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x008d }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x008d }
            r6[r11] = r7     // Catch:{ Exception -> 0x008d }
            java.lang.Object r6 = r2.invoke(r5, r6)     // Catch:{ Exception -> 0x008d }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x008d }
            java.lang.Object[] r3 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0089 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0089 }
            r3[r11] = r7     // Catch:{ Exception -> 0x0089 }
            java.lang.Object r2 = r2.invoke(r5, r3)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0089 }
            if (r9 != 0) goto L_0x0074
            java.lang.String r3 = ""
            goto L_0x0075
        L_0x0074:
            r3 = r9
        L_0x0075:
            if (r1 != 0) goto L_0x007d
            java.lang.String r4 = ""
            r1 = r4
            goto L_0x007d
        L_0x007b:
            r4 = r6
            goto L_0x0096
        L_0x007d:
            if (r6 != 0) goto L_0x0082
            java.lang.String r4 = ""
            goto L_0x0083
        L_0x0082:
            r4 = r6
        L_0x0083:
            if (r2 != 0) goto L_0x0096
            java.lang.String r5 = ""
            r2 = r5
            goto L_0x0096
        L_0x0089:
            r2 = r4
        L_0x008a:
            r4 = r6
            goto L_0x008f
        L_0x008c:
            r1 = r2
        L_0x008d:
            r2 = r4
            r4 = r3
        L_0x008f:
            r3 = r9
            goto L_0x0096
        L_0x0091:
            r12 = r3
            r3 = r1
            r1 = r2
            r2 = r4
            r4 = r12
        L_0x0096:
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Error | Exception -> 0x00cf }
            if (r5 == 0) goto L_0x00a0
            java.lang.String r3 = a((android.content.Context) r13)     // Catch:{ Error | Exception -> 0x00cf }
        L_0x00a0:
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Error | Exception -> 0x00cf }
            if (r5 == 0) goto L_0x00aa
            java.lang.String r4 = b(r13)     // Catch:{ Error | Exception -> 0x00cf }
        L_0x00aa:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Error | Exception -> 0x00cf }
            r13.<init>()     // Catch:{ Error | Exception -> 0x00cf }
            r13.append(r3)     // Catch:{ Error | Exception -> 0x00cf }
            java.lang.String r3 = "-"
            r13.append(r3)     // Catch:{ Error | Exception -> 0x00cf }
            r13.append(r1)     // Catch:{ Error | Exception -> 0x00cf }
            java.lang.String r1 = "-"
            r13.append(r1)     // Catch:{ Error | Exception -> 0x00cf }
            r13.append(r4)     // Catch:{ Error | Exception -> 0x00cf }
            java.lang.String r1 = "-"
            r13.append(r1)     // Catch:{ Error | Exception -> 0x00cf }
            r13.append(r2)     // Catch:{ Error | Exception -> 0x00cf }
            java.lang.String r13 = r13.toString()     // Catch:{ Error | Exception -> 0x00cf }
            goto L_0x00d0
        L_0x00cf:
            r13 = r0
        L_0x00d0:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.a.a.e.d.g(android.content.Context):java.lang.String");
    }

    public static PackageInfo a(Context context, String str) {
        if (!TextUtils.isEmpty(str) || context != null) {
            try {
                return context.getPackageManager().getPackageInfo(str, 64);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return null;
    }

    private static String b(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                return Settings.System.getString(context.getContentResolver(), str);
            } catch (Exception unused) {
            }
        }
        return "";
    }
}
