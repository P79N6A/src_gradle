package com.amap.api.services.a;

import android.content.Context;
import android.os.Looper;
import com.taobao.android.dexposed.ClassUtils;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

public class by {

    /* renamed from: a  reason: collision with root package name */
    public static final String f6668a = "/a/";

    /* renamed from: b  reason: collision with root package name */
    static final String f6669b = "b";

    /* renamed from: c  reason: collision with root package name */
    static final String f6670c = "c";

    /* renamed from: d  reason: collision with root package name */
    static final String f6671d = "d";

    /* renamed from: e  reason: collision with root package name */
    static final String f6672e = "i";

    /* renamed from: f  reason: collision with root package name */
    public static final String f6673f = "g";
    public static final String g = "h";
    public static final String h = "e";
    public static final String i = "f";
    public static final String j = "j";

    public static String a(Context context) {
        return a(context, f6672e);
    }

    public static void b(final Context context) {
        try {
            ExecutorService c2 = ca.c();
            if (c2 != null) {
                if (!c2.isShutdown()) {
                    c2.submit(new Runnable() {
                        public final void run() {
                            try {
                                dm.a(context);
                                cb.b(context);
                                cb.d(context);
                                cb.c(context);
                                dp.a(context);
                                dn.a(context);
                            } catch (RejectedExecutionException unused) {
                            } catch (Throwable th) {
                                ca.c(th, "Lg", "proL");
                            }
                        }
                    });
                }
            }
        } catch (Throwable th) {
            ca.c(th, "Lg", "proL");
        }
    }

    static List<bn> c(Context context) {
        List<bn> list = null;
        try {
            synchronized (Looper.getMainLooper()) {
                try {
                    List<bn> a2 = new cj(context, false).a();
                    try {
                        return a2;
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        list = a2;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
        } catch (Throwable unused) {
            return list;
        }
    }

    public static String a(Context context, String str) {
        return context.getFilesDir().getAbsolutePath() + f6668a + str;
    }

    static boolean a(String[] strArr, String str) {
        if (strArr == null || str == null) {
            return false;
        }
        try {
            for (String trim : str.split("\n")) {
                if (b(strArr, trim.trim())) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    static boolean b(String[] strArr, String str) {
        if (strArr == null || str == null) {
            return false;
        }
        try {
            String str2 = str;
            for (String str3 : strArr) {
                str2 = str2.trim();
                if (str2.startsWith("at ")) {
                    if (str2.contains(str3 + ClassUtils.PACKAGE_SEPARATOR) && str2.endsWith(")") && !str2.contains("uncaughtException")) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
