package com.amap.api.mapcore2d;

import android.content.Context;
import java.io.File;
import java.lang.reflect.Constructor;

public class eb {
    private static boolean a(ec ecVar) {
        if (ecVar == null || !ecVar.a() || !ecVar.f6010d) {
            return false;
        }
        return true;
    }

    private static ec b(Context context, cy cyVar) {
        ec ecVar = null;
        if (context == null) {
            return null;
        }
        try {
            if (a(context, cyVar)) {
                ecVar = ej.a().a(context, cyVar);
            }
        } catch (Throwable th) {
            ek.a(th, "IFactory", "gIns1");
        }
        return ecVar;
    }

    public static boolean a(Context context, cy cyVar) {
        try {
            File file = new File(ee.b(context, cyVar.a(), cyVar.b()));
            if (file.exists()) {
                return true;
            }
            ee.a(context, file, cyVar);
            return false;
        } catch (Throwable th) {
            ek.a(th, "IFactory", "isdowned");
            return false;
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
            ek.a(th, "IFactory", "gIns2()");
            return null;
        }
    }

    private static <T> T a(ec ecVar, String str, Class[] clsArr, Object[] objArr) {
        try {
            if (a(ecVar)) {
                Class loadClass = ecVar.loadClass(str);
                if (loadClass != null) {
                    Constructor declaredConstructor = loadClass.getDeclaredConstructor(clsArr);
                    declaredConstructor.setAccessible(true);
                    return declaredConstructor.newInstance(objArr);
                }
            }
        } catch (Throwable th) {
            ek.a(th, "IFactory", "getWrap");
        }
        return null;
    }

    public static <T> T a(Context context, cy cyVar, String str, Class cls, Class[] clsArr, Object[] objArr) throws co {
        T a2 = a(b(context, cyVar), str, clsArr, objArr);
        if (a2 != null) {
            return a2;
        }
        T a3 = a(cls, clsArr, objArr);
        if (a3 != null) {
            return a3;
        }
        throw new co("获取对象错误");
    }
}
