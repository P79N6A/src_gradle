package cn.com.chinatelecom.account.api.c;

import android.content.Context;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.util.UUID;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1792a = d.class.getCanonicalName();

    /* renamed from: b  reason: collision with root package name */
    private static String f1793b = "";

    /* renamed from: c  reason: collision with root package name */
    private static int f1794c = 0;

    /* renamed from: d  reason: collision with root package name */
    private static int f1795d = 5;

    /* renamed from: e  reason: collision with root package name */
    private static String f1796e = "";

    public static String a() {
        String uuid = UUID.randomUUID().toString();
        try {
            uuid = UUID.nameUUIDFromBytes((uuid + System.currentTimeMillis() + Math.random()).getBytes("utf8")).toString();
        } catch (Throwable unused) {
        }
        return !TextUtils.isEmpty(uuid) ? uuid.replace("-", "") : uuid;
    }

    public static String a(Context context) {
        try {
            if (!j.a(context)) {
                return "";
            }
            String subscriberId = ((TelephonyManager) context.getSystemService("phone")).getSubscriberId();
            if (subscriberId == null) {
                subscriberId = "";
            }
            return subscriberId;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String a(String str) {
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

    private static void a(Context context, String str) {
        if (!TextUtils.isEmpty(str) && context != null) {
            c.a(context, "key_d_i_u", str);
        }
    }

    public static String b(Context context) {
        try {
            if (!j.a(context)) {
                return "";
            }
            String deviceId = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
            if (deviceId == null) {
                deviceId = "";
            }
            return deviceId;
        } catch (Exception unused) {
            return "";
        }
    }

    private static String b(String str) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            byte[] bytes = str.getBytes();
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bytes);
            char[] cArr2 = new char[(r1 * 2)];
            int i = 0;
            for (byte b2 : instance.digest()) {
                int i2 = i + 1;
                cArr2[i] = cArr[(b2 >>> 4) & 15];
                i = i2 + 1;
                cArr2[i2] = cArr[b2 & 15];
            }
            return new String(cArr2);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:33|32|43|44|(0)|47|(0)|50|(0)|53|(0)|56|59) */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b5, code lost:
        f1794c++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c0, code lost:
        f1795d = 10;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00b1 */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b5 A[Catch:{ Error | Exception -> 0x00fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c0 A[Catch:{ Error | Exception -> 0x00fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ca A[Catch:{ Error | Exception -> 0x00fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d4 A[Catch:{ Error | Exception -> 0x00fd }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String c(android.content.Context r13) {
        /*
            java.lang.String r0 = ""
            boolean r1 = cn.com.chinatelecom.account.api.c.j.a(r13)     // Catch:{ Error | Exception -> 0x00fd }
            if (r1 != 0) goto L_0x0009
            return r0
        L_0x0009:
            java.lang.String r1 = ""
            java.lang.String r2 = ""
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            r5 = 1
            int r6 = f1795d     // Catch:{ Exception -> 0x00b1 }
            if (r6 == 0) goto L_0x001d
            int r6 = f1794c     // Catch:{ Exception -> 0x00b1 }
            int r7 = f1795d     // Catch:{ Exception -> 0x00b1 }
            int r6 = r6 % r7
            if (r6 == 0) goto L_0x0021
        L_0x001d:
            int r6 = f1794c     // Catch:{ Exception -> 0x00b1 }
            if (r6 != 0) goto L_0x00c4
        L_0x0021:
            java.lang.String r6 = "phone"
            java.lang.Object r6 = r13.getSystemService(r6)     // Catch:{ Exception -> 0x00b1 }
            android.telephony.TelephonyManager r6 = (android.telephony.TelephonyManager) r6     // Catch:{ Exception -> 0x00b1 }
            java.lang.Class r7 = r6.getClass()     // Catch:{ Exception -> 0x00b1 }
            java.lang.String r8 = "getImei"
            java.lang.Class[] r9 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x00b1 }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x00b1 }
            r11 = 0
            r9[r11] = r10     // Catch:{ Exception -> 0x00b1 }
            java.lang.reflect.Method r8 = r7.getDeclaredMethod(r8, r9)     // Catch:{ Exception -> 0x00b1 }
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x00b1 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x00b1 }
            r9[r11] = r10     // Catch:{ Exception -> 0x00b1 }
            java.lang.Object r9 = r8.invoke(r6, r9)     // Catch:{ Exception -> 0x00b1 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x00b1 }
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x00b0 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x00b0 }
            r1[r11] = r10     // Catch:{ Exception -> 0x00b0 }
            java.lang.Object r1 = r8.invoke(r6, r1)     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r2 = "getSubscriberId"
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x00af }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x00af }
            r8[r11] = r10     // Catch:{ Exception -> 0x00af }
            java.lang.reflect.Method r2 = r7.getDeclaredMethod(r2, r8)     // Catch:{ Exception -> 0x00af }
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x00af }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x00af }
            r7[r11] = r8     // Catch:{ Exception -> 0x00af }
            java.lang.Object r7 = r2.invoke(r6, r7)     // Catch:{ Exception -> 0x00af }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x00af }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x00ac }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x00ac }
            r3[r11] = r8     // Catch:{ Exception -> 0x00ac }
            java.lang.Object r2 = r2.invoke(r6, r3)     // Catch:{ Exception -> 0x00ac }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00ac }
            if (r9 != 0) goto L_0x0086
            java.lang.String r3 = ""
            goto L_0x0087
        L_0x0083:
            r4 = r2
            r3 = r7
            goto L_0x00af
        L_0x0086:
            r3 = r9
        L_0x0087:
            if (r1 != 0) goto L_0x0092
            java.lang.String r4 = ""
            r1 = r4
            goto L_0x0092
        L_0x008d:
            r4 = r2
            r2 = r1
            r1 = r3
            r3 = r7
            goto L_0x00b1
        L_0x0092:
            if (r7 != 0) goto L_0x0097
            java.lang.String r4 = ""
            goto L_0x0098
        L_0x0097:
            r4 = r7
        L_0x0098:
            if (r2 != 0) goto L_0x00a4
            java.lang.String r6 = ""
            r2 = r6
            goto L_0x00a4
        L_0x009e:
            r12 = r2
            r2 = r1
            r1 = r3
            r3 = r4
            r4 = r12
            goto L_0x00b1
        L_0x00a4:
            f1794c = r11     // Catch:{ Exception -> 0x009e }
            r12 = r2
            r2 = r1
            r1 = r3
            r3 = r4
            r4 = r12
            goto L_0x00c4
        L_0x00ac:
            r2 = r1
            r3 = r7
            goto L_0x00b0
        L_0x00af:
            r2 = r1
        L_0x00b0:
            r1 = r9
        L_0x00b1:
            int r6 = f1794c     // Catch:{ Error | Exception -> 0x00fd }
            if (r6 < 0) goto L_0x00ba
            int r6 = f1794c     // Catch:{ Error | Exception -> 0x00fd }
            int r6 = r6 + r5
            f1794c = r6     // Catch:{ Error | Exception -> 0x00fd }
        L_0x00ba:
            int r5 = f1794c     // Catch:{ Error | Exception -> 0x00fd }
            r6 = 50
            if (r5 <= r6) goto L_0x00c4
            r5 = 10
            f1795d = r5     // Catch:{ Error | Exception -> 0x00fd }
        L_0x00c4:
            boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Error | Exception -> 0x00fd }
            if (r5 == 0) goto L_0x00ce
            java.lang.String r1 = b((android.content.Context) r13)     // Catch:{ Error | Exception -> 0x00fd }
        L_0x00ce:
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Error | Exception -> 0x00fd }
            if (r5 == 0) goto L_0x00d8
            java.lang.String r3 = a((android.content.Context) r13)     // Catch:{ Error | Exception -> 0x00fd }
        L_0x00d8:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Error | Exception -> 0x00fd }
            r13.<init>()     // Catch:{ Error | Exception -> 0x00fd }
            r13.append(r1)     // Catch:{ Error | Exception -> 0x00fd }
            java.lang.String r1 = "-"
            r13.append(r1)     // Catch:{ Error | Exception -> 0x00fd }
            r13.append(r2)     // Catch:{ Error | Exception -> 0x00fd }
            java.lang.String r1 = "-"
            r13.append(r1)     // Catch:{ Error | Exception -> 0x00fd }
            r13.append(r3)     // Catch:{ Error | Exception -> 0x00fd }
            java.lang.String r1 = "-"
            r13.append(r1)     // Catch:{ Error | Exception -> 0x00fd }
            r13.append(r4)     // Catch:{ Error | Exception -> 0x00fd }
            java.lang.String r13 = r13.toString()     // Catch:{ Error | Exception -> 0x00fd }
            goto L_0x00fe
        L_0x00fd:
            r13 = r0
        L_0x00fe:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.account.api.c.d.c(android.content.Context):java.lang.String");
    }

    public static String d(Context context) {
        if (context == null) {
            return "";
        }
        String str = "";
        String str2 = "";
        try {
            String[] split = c(context).split("-", 4);
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
            str = a(context);
        }
        String a2 = a(str);
        String a3 = a(str2);
        return a2 + "," + a3;
    }

    public static String e(Context context) {
        if (TextUtils.isEmpty(f1796e)) {
            String f2 = f(context);
            f1796e = f2;
            if (TextUtils.isEmpty(f2)) {
                f1796e = g(context);
                a(context, f1796e);
            }
        }
        return f1796e;
    }

    private static String f(Context context) {
        return c.b(context, "key_d_i_u", "");
    }

    private static String g(Context context) {
        String str;
        try {
            str = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable unused) {
            str = "";
        }
        try {
            String lowerCase = !TextUtils.isEmpty(str) ? str.toLowerCase() : UUID.randomUUID().toString();
            return TextUtils.isEmpty(lowerCase) ? "default" : b(lowerCase + "default");
        } catch (Throwable unused2) {
            return "default";
        }
    }
}
