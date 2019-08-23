package com.umeng.commonsdk.proguard;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.statistics.common.ULog;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static Object f80795a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static String f80796b;

    public static String b(Context context) {
        String str;
        synchronized (f80795a) {
            str = f80796b;
        }
        return str;
    }

    public static void a(Context context) {
        try {
            Class[] clsArr = {Context.class};
            try {
                Class<?> cls = Class.forName("com.wireless.security.securityenv.sdk.SecurityEnvSDK");
                if (cls != null) {
                    Constructor<?> constructor = cls.getConstructor(clsArr);
                    if (constructor != null) {
                        Object newInstance = constructor.newInstance(new Object[]{context});
                        if (newInstance != null) {
                            Method declaredMethod = cls.getDeclaredMethod("initSync", new Class[0]);
                            if (declaredMethod != null) {
                                declaredMethod.setAccessible(true);
                                declaredMethod.invoke(newInstance, new Object[0]);
                            }
                            Method declaredMethod2 = cls.getDeclaredMethod("getToken", new Class[0]);
                            if (declaredMethod2 != null) {
                                declaredMethod2.setAccessible(true);
                                String str = (String) declaredMethod2.invoke(newInstance, new Object[0]);
                                if (!TextUtils.isEmpty(str)) {
                                    synchronized (f80795a) {
                                        f80796b = str;
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Exception e2) {
            ULog.e("internal", "e is " + e2);
        }
    }
}
