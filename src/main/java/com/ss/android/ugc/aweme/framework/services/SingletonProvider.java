package com.ss.android.ugc.aweme.framework.services;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class SingletonProvider<T> implements ServiceProvider<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    volatile T service;
    ServiceProvider<T> serviceProvider;

    public synchronized T get() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 45937, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 45937, new Class[0], Object.class);
        }
        if (this.service == null) {
            this.service = this.serviceProvider.get();
        }
        return this.service;
    }

    SingletonProvider(ServiceProvider serviceProvider2) {
        this.serviceProvider = serviceProvider2;
    }
}
