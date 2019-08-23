package com.ss.android.ugc.aweme.z;

import android.app.Application;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76943a = null;

    /* renamed from: b  reason: collision with root package name */
    public static Application f76944b = null;

    /* renamed from: c  reason: collision with root package name */
    private static final String f76945c = "a";

    public static Object a(Context context, Class<?> cls) {
        Class<?> cls2;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, cls}, null, f76943a, true, 63343, new Class[]{Context.class, Class.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{context2, cls}, null, f76943a, true, 63343, new Class[]{Context.class, Class.class}, Object.class);
        }
        if (cls == null) {
            try {
                cls2 = Class.forName("android.app.ActivityThread");
            } catch (Throwable unused) {
                return null;
            }
        } else {
            cls2 = cls;
        }
        Method method = cls2.getMethod("currentActivityThread", new Class[0]);
        method.setAccessible(true);
        Object invoke = method.invoke(null, new Object[0]);
        if (invoke == null && context2 != null) {
            Field field = context.getClass().getField("mLoadedApk");
            field.setAccessible(true);
            Object obj = field.get(context2);
            Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
            declaredField.setAccessible(true);
            invoke = declaredField.get(obj);
        }
        return invoke;
    }

    public static void a(Application application, Application application2, String str, Class<?> cls, Object obj) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Class<?> cls2;
        Application application3 = application;
        Application application4 = application2;
        String str2 = str;
        Class<?> cls3 = cls;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{application3, application4, str2, cls3, obj2}, null, f76943a, true, 63342, new Class[]{Application.class, Application.class, String.class, Class.class, Object.class}, Void.TYPE)) {
            Object[] objArr = {application3, application4, str2, cls3, obj2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f76943a, true, 63342, new Class[]{Application.class, Application.class, String.class, Class.class, Object.class}, Void.TYPE);
            return;
        }
        try {
            cls2 = Class.forName("android.app.LoadedApk");
        } catch (ClassNotFoundException unused) {
            cls2 = Class.forName("android.app.ActivityThread$PackageInfo");
        }
        Field declaredField = cls2.getDeclaredField("mApplication");
        declaredField.setAccessible(true);
        Field declaredField2 = cls2.getDeclaredField("mResDir");
        declaredField2.setAccessible(true);
        Field field = null;
        try {
            field = Application.class.getDeclaredField("mLoadedApk");
        } catch (NoSuchFieldException unused2) {
        }
        String[] strArr = {"mPackages", "mResourcePackages"};
        for (int i = 0; i < 2; i++) {
            Field declaredField3 = cls3.getDeclaredField(strArr[i]);
            declaredField3.setAccessible(true);
            for (Map.Entry value : ((Map) declaredField3.get(obj2)).entrySet()) {
                Object obj3 = ((WeakReference) value.getValue()).get();
                if (obj3 != null && declaredField.get(obj3) == application3) {
                    if (application4 != null) {
                        declaredField.set(obj3, application4);
                    }
                    if (str2 != null) {
                        declaredField2.set(obj3, str2);
                    }
                    if (!(application4 == null || field == null)) {
                        field.set(application4, obj3);
                    }
                }
            }
        }
    }
}
