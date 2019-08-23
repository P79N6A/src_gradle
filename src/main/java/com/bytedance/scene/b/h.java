package com.bytedance.scene.b;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.v4.util.SimpleArrayMap;
import com.bytedance.scene.e;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final SimpleArrayMap<String, Class<?>> f22085a = new SimpleArrayMap<>();

    public static class a extends RuntimeException {
        a(String str, Exception exc) {
            super(str, exc);
        }
    }

    public static boolean a(e eVar) {
        for (Constructor parameterTypes : eVar.getClass().getConstructors()) {
            if (parameterTypes.getParameterTypes().length > 0) {
                return false;
            }
        }
        return true;
    }

    @NonNull
    public static e a(@NonNull Class<?> cls, @Nullable Bundle bundle) {
        try {
            e eVar = (e) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(eVar.getClass().getClassLoader());
                eVar.g = bundle;
            }
            return eVar;
        } catch (InstantiationException e2) {
            throw new a("Unable to instantiate scene " + cls + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (IllegalAccessException e3) {
            throw new a("Unable to instantiate scene " + cls + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new a("Unable to instantiate scene " + cls + ": could not find Scene constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new a("Unable to instantiate scene " + cls + ": calling Scene constructor caused an exception", e5);
        }
    }

    @NonNull
    public static e a(Context context, String str, Bundle bundle) {
        Class<?> cls = (Class) f22085a.get(str);
        if (cls == null) {
            try {
                cls = context.getClassLoader().loadClass(str);
                f22085a.put(str, cls);
            } catch (ClassNotFoundException e2) {
                throw new a("Unable to instantiate scene " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
            }
        }
        return a(cls, bundle);
    }
}
