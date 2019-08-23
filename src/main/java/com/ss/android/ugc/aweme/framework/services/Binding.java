package com.ss.android.ugc.aweme.framework.services;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public final class Binding<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    Class<T> klass;
    ServiceManager serviceManager;
    ServiceProvider<T> serviceProvider;

    public final Binding<T> asSingleton() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 45920, new Class[0], Binding.class)) {
            return (Binding) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 45920, new Class[0], Binding.class);
        }
        Set set = this.serviceManager.classServiceProviderConcurrentHashMap.get(this.klass);
        if (!(this.serviceProvider instanceof SingletonProvider)) {
            set.remove(this.serviceProvider);
            this.serviceProvider = new SingletonProvider(this.serviceProvider);
            set.add(this.serviceProvider);
        }
        return this;
    }

    Binding(ServiceManager serviceManager2, Class<T> cls, ServiceProvider<T> serviceProvider2) {
        this.serviceManager = serviceManager2;
        this.klass = cls;
        this.serviceProvider = serviceProvider2;
        Set set = serviceManager2.classServiceProviderConcurrentHashMap.get(cls);
        if (set == null) {
            Set synchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
            synchronizedSet.add(serviceProvider2);
            serviceManager2.classServiceProviderConcurrentHashMap.put(cls, synchronizedSet);
            return;
        }
        set.add(serviceProvider2);
    }
}
