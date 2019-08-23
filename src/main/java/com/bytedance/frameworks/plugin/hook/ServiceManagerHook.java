package com.bytedance.frameworks.plugin.hook;

import com.bytedance.frameworks.plugin.c.j;
import com.bytedance.frameworks.plugin.c.l;
import com.bytedance.frameworks.plugin.e.a;
import com.bytedance.frameworks.plugin.e.b;
import java.lang.reflect.InvocationHandler;
import java.util.Map;

public class ServiceManagerHook extends Hook {
    private j mBinderProxy;
    private String mService;

    public void onHook() {
        try {
            Class<?> cls = Class.forName("android.os.ServiceManager");
            Object a2 = b.a((Class) cls, "getService", this.mService);
            if (a2 != null) {
                Object b2 = a.b(cls, "sCache");
                if (b2 != null && (b2 instanceof Map)) {
                    this.mBinderProxy.b(a2);
                    ((Map) b2).put(this.mService, l.a(a2, (InvocationHandler) this.mBinderProxy));
                }
            }
        } catch (Exception unused) {
        }
    }

    public ServiceManagerHook(String str, j jVar) {
        this.mService = str;
        this.mBinderProxy = jVar;
    }
}
