package com.loc;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.lang.reflect.Constructor;

public final class t {
    public static Class a(Context context, dh dhVar, String str) {
        u c2 = c(context, dhVar);
        try {
            if (a(c2)) {
                return c2.loadClass(str);
            }
            return null;
        } catch (Throwable th) {
            f.a(th, "InstanceFactory", "loadpn");
            return null;
        }
    }

    public static <T> T a(Context context, dh dhVar, String str, Class cls, Class[] clsArr, Object[] objArr) throws cx {
        T a2 = a(c(context, dhVar), str, clsArr, objArr);
        if (a2 != null) {
            return a2;
        }
        T a3 = a(cls, clsArr, objArr);
        if (a3 != null) {
            return a3;
        }
        throw new cx("获取对象错误");
    }

    private static <T> T a(u uVar, String str, Class[] clsArr, Object[] objArr) {
        try {
            if (a(uVar)) {
                Class loadClass = uVar.loadClass(str);
                if (loadClass != null) {
                    Constructor declaredConstructor = loadClass.getDeclaredConstructor(clsArr);
                    declaredConstructor.setAccessible(true);
                    return declaredConstructor.newInstance(objArr);
                }
            }
        } catch (Throwable th) {
            f.a(th, "IFactory", "getWrap");
        }
        return null;
    }

    private static <T> T a(Class cls, Class[] clsArr, Object[] objArr) {
        if (cls == null) {
            return null;
        }
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(clsArr);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(objArr);
        } catch (Throwable th) {
            f.a(th, "IFactory", "gIns2()");
            return null;
        }
    }

    public static String a(Context context, dh dhVar) {
        try {
            if (!new File(w.a(context)).exists()) {
                return null;
            }
            File file = new File(w.b(context, dhVar.a(), dhVar.f25797a));
            if (file.exists()) {
                return file.getAbsolutePath();
            }
            w.a(context, file, dhVar);
            return null;
        } catch (Throwable th) {
            f.a(th, "IFactory", "isdowned");
            return null;
        }
    }

    public static void a(final Context context, final String str) {
        try {
            ab.b().a().submit(new Runnable() {
                public final void run() {
                    try {
                        w.a(new n(context, y.b()), context, str);
                    } catch (Throwable th) {
                        f.a(th, "InstanceFactory", "rollBack");
                    }
                }
            });
        } catch (Throwable th) {
            f.a(th, "InstanceFactory", "rollBack");
        }
    }

    public static boolean a(Context context, s sVar, dh dhVar) {
        boolean z = sVar.i;
        try {
            if (!ac.a(dhVar, sVar) || !ac.a(sVar) || !ac.a(context, z) || ac.a(context, sVar, dhVar)) {
                return false;
            }
            w.b(context, dhVar.a());
            return true;
        } catch (Throwable th) {
            f.a(th, "dDownLoad", "isNeedDownload()");
            return false;
        }
    }

    private static boolean a(u uVar) {
        return uVar != null && uVar.a() && uVar.f25891d;
    }

    public static void b(Context context, s sVar, dh dhVar) {
        if (sVar != null) {
            try {
                if (!TextUtils.isEmpty(sVar.f25880a) && !TextUtils.isEmpty(sVar.f25881b)) {
                    if (!TextUtils.isEmpty(sVar.f25884e)) {
                        new r(context, sVar, dhVar).a();
                    }
                }
            } catch (Throwable th) {
                f.a(th, "IFactory", "dDownload()");
            }
        }
    }

    public static boolean b(Context context, dh dhVar) {
        try {
            if (!new File(w.a(context)).exists()) {
                return false;
            }
            File file = new File(w.b(context, dhVar.a(), dhVar.f25797a));
            if (file.exists()) {
                return true;
            }
            w.a(context, file, dhVar);
            return false;
        } catch (Throwable th) {
            f.a(th, "IFactory", "isdowned");
            return false;
        }
    }

    private static u c(Context context, dh dhVar) {
        u uVar = null;
        if (context == null) {
            return null;
        }
        try {
            if (b(context, dhVar)) {
                uVar = ab.b().a(context, dhVar);
            }
        } catch (Throwable th) {
            f.a(th, "IFactory", "gIns1");
        }
        return uVar;
    }
}
