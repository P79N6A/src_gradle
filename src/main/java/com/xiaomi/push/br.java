package com.xiaomi.push;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class br {

    /* renamed from: a  reason: collision with root package name */
    private static String f81872a;

    /* renamed from: b  reason: collision with root package name */
    private static String f81873b;

    /* renamed from: c  reason: collision with root package name */
    private static String f81874c;

    public static int a() {
        String a2 = bq.a();
        if (a2 == null) {
            return -1;
        }
        int length = a2.length();
        if (a2.isEmpty() || length <= 1) {
            return -1;
        }
        try {
            return Integer.parseInt(a2.substring(0, 3));
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static String m132a() {
        if (f81872a != null) {
            return f81872a;
        }
        String b2 = b(bq.b());
        if (b2 == null) {
            return b(bp.a("ro.ril.miui.imei", ""));
        }
        f81872a = b2;
        return b2;
    }

    public static String a(String str) {
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

    public static boolean a(int i) {
        return i == 1;
    }

    public static int b() {
        String a2 = bq.a();
        if (a2 == null) {
            return -1;
        }
        int length = a2.length();
        if (a2.isEmpty() || length <= 1) {
            return -1;
        }
        try {
            return Integer.parseInt(a2.substring(3));
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: b  reason: collision with other method in class */
    public static String m133b() {
        if (f81873b != null && !f81873b.isEmpty()) {
            return f81873b;
        }
        String a2 = bp.a("ro.product.model", "");
        f81873b = a2;
        String replaceAll = a2.replaceAll(" ", "");
        f81873b = replaceAll;
        return replaceAll;
    }

    private static String b(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        if (str.startsWith(",") || str.endsWith(",")) {
            str = str.replace(",", "");
        }
        if (str.startsWith(PushConstants.PUSH_TYPE_NOTIFY)) {
            try {
                if (Long.parseLong(str) == 0) {
                    return null;
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return str;
    }

    public static String c() {
        if (f81874c != null && !f81874c.isEmpty()) {
            return f81874c;
        }
        String a2 = bp.a("ro.build.version.incremental", "");
        f81874c = a2;
        return a2;
    }

    public static String d() {
        if (!bn.a()) {
            return bn.a();
        }
        if (!bp.a("ro.product.locale.region", "CN").equals("CN")) {
            return "global";
        }
        if (!bn.b()) {
            if (bn.c()) {
                return "dev";
            }
            if (bn.d()) {
                return "stable";
            }
        }
        return "alpha";
    }

    public static String e() {
        try {
            return bl.a().getPackageManager().getPackageInfo(bl.a().getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String f() {
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }
}
