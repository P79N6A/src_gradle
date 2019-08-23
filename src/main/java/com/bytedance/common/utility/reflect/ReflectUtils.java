package com.bytedance.common.utility.reflect;

import com.bytedance.common.utility.StringUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectUtils {
    public static Object getFiledValue(Object obj, Class<?> cls) {
        if (obj == null || cls == null) {
            return null;
        }
        try {
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            for (int i = 0; i < declaredFields.length; i++) {
                declaredFields[i].setAccessible(true);
                if (declaredFields[i].getType().getName().equals(cls.getName())) {
                    return declaredFields[i].get(obj);
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static Object invokeMethod(Class<?> cls, String str, Object... objArr) {
        return invokeMethod(cls, str, null, null, objArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r2 = r2.getDeclaredMethod(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        r2 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0010 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Method getMethod(java.lang.Class<?> r2, java.lang.String r3, java.lang.Class<?>[] r4) {
        /*
            r0 = 0
            if (r2 == 0) goto L_0x0017
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r3)
            if (r1 == 0) goto L_0x000a
            goto L_0x0017
        L_0x000a:
            java.lang.reflect.Method r1 = r2.getMethod(r3, r4)     // Catch:{ Throwable -> 0x0010 }
            r2 = r1
            goto L_0x0016
        L_0x0010:
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch:{ Throwable -> 0x0015 }
            goto L_0x0016
        L_0x0015:
            r2 = r0
        L_0x0016:
            return r2
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.reflect.ReflectUtils.getMethod(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    public static Object invokeMethod(Class<?> cls, String str, Class<?>[] clsArr, Object[] objArr, Object... objArr2) {
        if (cls == null || StringUtils.isEmpty(str)) {
            return null;
        }
        if (clsArr == null) {
            clsArr = new Class[0];
        }
        if (objArr == null) {
            objArr = new Object[0];
        }
        try {
            Method method = getMethod(cls, str, clsArr);
            if (method == null) {
                return null;
            }
            method.setAccessible(true);
            if (objArr2 == null || objArr2.length <= 0) {
                return method.invoke(null, objArr);
            }
            return method.invoke(objArr2[0], objArr);
        } catch (Throwable unused) {
            return null;
        }
    }
}
