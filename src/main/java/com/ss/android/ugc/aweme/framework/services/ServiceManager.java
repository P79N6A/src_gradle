package com.ss.android.ugc.aweme.framework.services;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.graph.e;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class ServiceManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    final ConcurrentHashMap<Class<?>, Set<ServiceProvider<?>>> classServiceProviderConcurrentHashMap;

    static final class Holder {
        public static final ServiceManager INSTANCE = new ServiceManager();

        private Holder() {
        }
    }

    public static ServiceManager get() {
        return Holder.INSTANCE;
    }

    private ServiceManager() {
        this.classServiceProviderConcurrentHashMap = new ConcurrentHashMap<>();
    }

    @Deprecated
    public final <T> Set<T> getServices(Class<T> cls) throws IllegalAccessException {
        throw new IllegalAccessException("does not supported");
    }

    public final <T> T getService(Class<T> cls) {
        Class<T> cls2 = cls;
        if (!PatchProxy.isSupport(new Object[]{cls2}, this, changeQuickRedirect, false, 45934, new Class[]{Class.class}, Object.class)) {
            return getService(cls2, false);
        }
        return PatchProxy.accessDispatch(new Object[]{cls2}, this, changeQuickRedirect, false, 45934, new Class[]{Class.class}, Object.class);
    }

    @Deprecated
    public final <T> Binding bind(Class<T> cls, ServiceProvider<T> serviceProvider) {
        return new Binding(this, cls, serviceProvider);
    }

    public final <T> T getService(Class<T> cls, boolean z) {
        if (PatchProxy.isSupport(new Object[]{cls, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 45935, new Class[]{Class.class, Boolean.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{cls, Byte.valueOf(z)}, this, changeQuickRedirect, false, 45935, new Class[]{Class.class, Boolean.TYPE}, Object.class);
        }
        T t = null;
        if (!z) {
            t = e.a(cls);
        }
        if (t != null) {
            return t;
        }
        return getLegacyService(cls, z);
    }

    private <T> T getLegacyService(Class<T> cls, boolean z) {
        Class<T> cls2 = cls;
        if (PatchProxy.isSupport(new Object[]{cls2, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 45936, new Class[]{Class.class, Boolean.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{cls2, Byte.valueOf(z)}, this, changeQuickRedirect, false, 45936, new Class[]{Class.class, Boolean.TYPE}, Object.class);
        }
        Set set = this.classServiceProviderConcurrentHashMap.get(cls2);
        if (set != null && !set.isEmpty() && !z) {
            return ((ServiceProvider) set.toArray()[0]).get();
        }
        Iterator it2 = ConfigLoader.iterator(cls);
        if (it2.hasNext()) {
            return it2.next();
        }
        return null;
    }
}
145579629