package com.xiaomi.push;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.channel.commonutils.logger.b;

public class u {

    /* renamed from: a  reason: collision with root package name */
    private static Context f82608a;

    /* renamed from: a  reason: collision with other field name */
    private static String f1022a;

    public static int a() {
        try {
            Class<?> cls = Class.forName("miui.os.Build");
            if (cls.getField("IS_STABLE_VERSION").getBoolean(null)) {
                return 3;
            }
            return cls.getField("IS_DEVELOPMENT_VERSION").getBoolean(null) ? 2 : 1;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static Context m660a() {
        return f82608a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static String m661a() {
        String str;
        synchronized (u.class) {
            try {
                if (f1022a != null) {
                    str = f1022a;
                } else {
                    str = Build.VERSION.INCREMENTAL;
                    if (a() <= 0) {
                        String b2 = b();
                        if (TextUtils.isEmpty(b2)) {
                            b2 = c();
                            if (TextUtils.isEmpty(b2)) {
                                b2 = d();
                                if (TextUtils.isEmpty(b2)) {
                                    str = String.valueOf(t.a("ro.product.brand", "Android") + "_" + str);
                                }
                            }
                        }
                        str = b2;
                    }
                    f1022a = str;
                }
            } catch (Throwable th) {
                Class<u> cls = u.class;
                throw th;
            }
        }
        return str;
    }

    public static String a(Context context) {
        if (m.b()) {
            return "";
        }
        String str = (String) au.a("com.xiaomi.xmsf.helper.MIIDAccountHelper", "getMIID", context);
        return TextUtils.isEmpty(str) ? PushConstants.PUSH_TYPE_NOTIFY : str;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m662a(Context context) {
        f82608a = context.getApplicationContext();
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m663a() {
        return TextUtils.equals((String) au.a("android.os.SystemProperties", "get", "sys.boot_completed"), PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m664a(Context context) {
        try {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                return true;
            }
        } catch (Exception e2) {
            b.a((Throwable) e2);
        }
        return false;
    }

    private static String b() {
        String a2 = t.a("ro.build.version.emui", "");
        f1022a = a2;
        return a2;
    }

    /* renamed from: b  reason: collision with other method in class */
    public static boolean m665b() {
        try {
            return Class.forName("miui.os.Build").getField("IS_GLOBAL_BUILD").getBoolean(Boolean.FALSE);
        } catch (ClassNotFoundException unused) {
            b.d("miui.os.Build ClassNotFound");
            return false;
        } catch (Exception e2) {
            b.a((Throwable) e2);
            return false;
        }
    }

    private static String c() {
        String a2 = t.a("ro.build.version.opporom", "");
        if (!TextUtils.isEmpty(a2) && !a2.startsWith("ColorOS_")) {
            f1022a = "ColorOS_" + a2;
        }
        return f1022a;
    }

    private static String d() {
        String a2 = t.a("ro.vivo.os.version", "");
        if (!TextUtils.isEmpty(a2) && !a2.startsWith("FuntouchOS_")) {
            f1022a = "FuntouchOS_" + a2;
        }
        return f1022a;
    }
}
