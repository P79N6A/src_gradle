package com.amap.api.services.a;

import android.content.Context;
import java.io.File;
import java.lang.reflect.Constructor;

public class cm {
    private static boolean a(cn cnVar) {
        if (cnVar == null || !cnVar.a() || !cnVar.f6733d) {
            return false;
        }
        return true;
    }

    private static cn b(Context context, bn bnVar) {
        try {
            if (a(context, bnVar)) {
                return co.a().a(context, bnVar);
            }
            return null;
        } catch (Throwable th) {
            cv.a(th, "IFactory", "gIns1");
            return null;
        }
    }

    public static void a(final Context context, final String str) {
        try {
            ca.c().submit(new Runnable() {
                public final void run() {
                    try {
                        cq.a(new ce(context, ct.c()), context, str);
                    } catch (Throwable th) {
                        cv.a(th, "InstanceFactory", "rollBack");
                    }
                }
            });
        } catch (Throwable th) {
            cv.a(th, "InstanceFactory", "rollBack");
        }
    }

    public static boolean a(Context context, bn bnVar) {
        try {
            File file = new File(cq.b(context, bnVar.a(), bnVar.b()));
            if (file.exists()) {
                return true;
            }
            cq.a(context, file, bnVar);
            return false;
        } catch (Throwable th) {
            cv.a(th, "IFactory", "isdowned");
            return false;
        }
    }

    public static Class a(Context context, bn bnVar, String str) {
        cn b2 = b(context, bnVar);
        try {
            if (a(b2)) {
                return b2.loadClass(str);
            }
            return null;
        } catch (Throwable th) {
            cv.a(th, "InstanceFactory", "loadpn");
            return null;
        }
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
            cv.a(th, "IFactory", "gIns2()");
            return null;
        }
    }

    private static <T> T a(cn cnVar, String str, Class[] clsArr, Object[] objArr) {
        try {
            if (a(cnVar)) {
                Class loadClass = cnVar.loadClass(str);
                if (loadClass != null) {
                    Constructor declaredConstructor = loadClass.getDeclaredConstructor(clsArr);
                    declaredConstructor.setAccessible(true);
                    return declaredConstructor.newInstance(objArr);
                }
            }
        } catch (Throwable th) {
            cv.a(th, "IFactory", "getWrap");
        }
        return null;
    }

    public static <T> T a(Context context, bn bnVar, String str, Class cls, Class[] clsArr, Object[] objArr) throws be {
        T a2 = a(b(context, bnVar), str, clsArr, objArr);
        if (a2 != null) {
            return a2;
        }
        T a3 = a(cls, clsArr, objArr);
        if (a3 != null) {
            return a3;
        }
        throw new be("获取对象错误");
    }
}
