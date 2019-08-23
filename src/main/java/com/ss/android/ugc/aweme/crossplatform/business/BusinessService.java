package com.ss.android.ugc.aweme.crossplatform.business;

import android.content.Context;
import android.support.annotation.Keep;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.crossplatform.base.c;
import com.ss.android.ugc.aweme.crossplatform.params.base.a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.HashMap;

public final class BusinessService {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40734a;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final d f40735b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<Class, Business> f40736c = new HashMap<>();

    public static abstract class Business {
        @NonNull
        protected final c g;
        @NonNull
        protected final d h;
        @NonNull
        protected final a i = this.g.getCrossPlatformParams();
        @NonNull
        protected final Context j = this.g.getContext();

        @Keep
        public Business(@NonNull d dVar) {
            this.h = dVar;
            this.g = dVar.f40769b;
        }
    }

    BusinessService(@NonNull d dVar) {
        this.f40735b = dVar;
    }

    @MainThread
    public final <T extends Business> T a(Class<T> cls) {
        T t;
        if (PatchProxy.isSupport(new Object[]{cls}, this, f40734a, false, 34244, new Class[]{Class.class}, Business.class)) {
            return (Business) PatchProxy.accessDispatch(new Object[]{cls}, this, f40734a, false, 34244, new Class[]{Class.class}, Business.class);
        } else if (this.f40736c.containsKey(cls)) {
            return (Business) this.f40736c.get(cls);
        } else {
            if (!Modifier.isAbstract(cls.getModifiers())) {
                try {
                    Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[]{d.class});
                    declaredConstructor.setAccessible(true);
                    t = (Business) declaredConstructor.newInstance(new Object[]{this.f40735b});
                    try {
                        this.f40736c.put(cls, t);
                    } catch (Exception | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                    }
                } catch (Exception | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused2) {
                    t = null;
                }
                if (t == null) {
                    return null;
                }
                return t;
            }
            throw new IllegalStateException("can't use abstract class!" + cls.getSimpleName());
        }
    }
}
