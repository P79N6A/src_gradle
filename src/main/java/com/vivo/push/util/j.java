package com.vivo.push.util;

import android.os.Build;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f81668a = y.b("ro.vivo.product.overseas", "no").equals("yes");

    /* renamed from: b  reason: collision with root package name */
    public static final String f81669b;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f81670c = "RU".equals(f81669b);

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f81671d = "IN".equals(f81669b);

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f81672e = b("rom_1.0");

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f81673f = b("rom_2.0");
    public static final boolean g = b("rom_2.5");
    public static final boolean h = b("rom_3.0");
    private static Method i;
    private static String j = null;
    private static String k = null;
    private static String l = "";
    private static String m = "";

    public static boolean c() {
        if (TextUtils.isEmpty(Build.MANUFACTURER)) {
            o.d("Device", "Build.MANUFACTURER is null");
            return false;
        }
        o.d("Device", "Build.MANUFACTURER is " + Build.MANUFACTURER);
        return Build.MANUFACTURER.toLowerCase().contains("oppo");
    }

    static {
        String str;
        if (Build.VERSION.SDK_INT >= 26) {
            str = y.b("ro.product.country.region", "N");
        } else {
            str = y.b("ro.product.customize.bbk", "N");
        }
        f81669b = str;
    }

    public static boolean b() {
        if (TextUtils.isEmpty(Build.MANUFACTURER)) {
            o.d("Device", "Build.MANUFACTURER is null");
            return false;
        }
        o.d("Device", "Build.MANUFACTURER is " + Build.MANUFACTURER);
        if (Build.MANUFACTURER.toLowerCase().contains("bbk") || Build.MANUFACTURER.toLowerCase().startsWith("vivo")) {
            return true;
        }
        return false;
    }

    public static synchronized String a() {
        synchronized (j.class) {
            if (j == null && k == null) {
                try {
                    Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[]{String.class, String.class});
                    i = declaredMethod;
                    declaredMethod.setAccessible(true);
                    j = (String) i.invoke(null, new Object[]{"ro.vivo.rom", "@><@"});
                    k = (String) i.invoke(null, new Object[]{"ro.vivo.rom.version", "@><@"});
                } catch (Exception unused) {
                    o.b("Device", "getRomCode error");
                }
            }
            o.d("Device", "sRomProperty1 : " + j + " ; sRomProperty2 : " + k);
            String a2 = a(j);
            if (!TextUtils.isEmpty(a2)) {
                return a2;
            }
            String a3 = a(k);
            if (!TextUtils.isEmpty(a3)) {
                return a3;
            }
            return null;
        }
    }

    private static boolean b(String str) {
        String b2 = y.b("ro.vivo.rom", "");
        String b3 = y.b("ro.vivo.rom.version", "");
        o.d("Device", "ro.vivo.rom = " + b2 + " ; ro.vivo.rom.version = " + b3);
        if ((b2 == null || !b2.contains(str)) && (b3 == null || !b3.contains(str))) {
            return false;
        }
        return true;
    }

    private static String a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("rom_([\\d]*).?([\\d]*)", 2).matcher(str);
        if (!matcher.find()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(matcher.group(1));
        if (TextUtils.isEmpty(matcher.group(2))) {
            str2 = PushConstants.PUSH_TYPE_NOTIFY;
        } else {
            str2 = matcher.group(2).substring(0, 1);
        }
        sb.append(str2);
        return sb.toString();
    }
}
