package com.bytedance.frameworks.plugin.compat.a;

import android.app.servertransaction.ClientTransaction;
import android.app.servertransaction.LaunchActivityItem;
import android.text.TextUtils;
import com.bytedance.frameworks.plugin.f.g;
import com.bytedance.frameworks.plugin.f.j;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, Field> f2182a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static Map<String, Method> f2183b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private static boolean f2184c = false;

    public static void a() {
        if (!f2184c) {
            b.a();
            a(ClientTransaction.class, "getLifecycleStateRequest", new Class[0]);
            a(ClientTransaction.class, "getCallbacks", new Class[0]);
            a(LaunchActivityItem.class, "mIntent");
            a(LaunchActivityItem.class, "mInfo");
            f2184c = true;
        }
    }

    public static Field a(Class<?> cls, String str) {
        Field field;
        j.a(cls, "The class must not be null !!!");
        j.a(!TextUtils.isEmpty(str), "The field name must not be blank !!!");
        String str2 = cls.getName() + "#" + str;
        synchronized (f2182a) {
            field = f2182a.get(str2);
        }
        if (field != null) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            return field;
        }
        try {
            Field declaredField = cls.getDeclaredField(str);
            if (declaredField != null && !declaredField.isAccessible()) {
                declaredField.setAccessible(true);
            }
            if (declaredField != null) {
                f2182a.put(str2, declaredField);
            }
            return declaredField;
        } catch (Throwable th) {
            g.a(String.format("HackHelper get field %s#%s failed !!!", new Object[]{cls.getName(), str}), th);
            return null;
        }
    }

    public static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        Method method;
        j.a(cls, "The class must not be null !!!");
        j.a(!TextUtils.isEmpty(str), "The method name must not be blank !!!");
        StringBuilder sb = new StringBuilder();
        sb.append(cls.getName());
        sb.append("#");
        sb.append(str);
        if (clsArr == null || clsArr.length <= 0) {
            sb.append(Void.class.getName());
        } else {
            for (Class<?> name : clsArr) {
                sb.append(name.getName());
                sb.append("#");
            }
        }
        String sb2 = sb.toString();
        synchronized (f2183b) {
            method = f2183b.get(sb2);
        }
        if (method != null) {
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            return method;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            if (declaredMethod != null && !declaredMethod.isAccessible()) {
                declaredMethod.setAccessible(true);
            }
            if (declaredMethod != null) {
                f2183b.put(sb2, declaredMethod);
            }
            return declaredMethod;
        } catch (Throwable th) {
            g.a(String.format("HackHelper get method %s#%s failed !!!", new Object[]{cls.getName(), str}), th);
            return null;
        }
    }
}
