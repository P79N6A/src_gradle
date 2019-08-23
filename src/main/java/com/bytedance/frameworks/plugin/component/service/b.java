package com.bytedance.frameworks.plugin.component.service;

import android.content.pm.ComponentInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import com.bytedance.frameworks.plugin.am.d;
import com.bytedance.frameworks.plugin.e.a;
import com.bytedance.frameworks.plugin.f.g;
import com.bytedance.frameworks.plugin.pm.c;
import java.util.HashMap;
import java.util.Map;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static b f20017a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, ServiceInfo> f20018b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private Map<String, ServiceInfo> f20019c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private Map<IBinder, String> f20020d = new HashMap();

    private b() {
    }

    public static b a() {
        if (f20017a == null) {
            synchronized (b.class) {
                if (f20017a == null) {
                    f20017a = new b();
                }
            }
        }
        return f20017a;
    }

    private static boolean a(String str) {
        try {
            if (Class.forName(str) != null) {
                return true;
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }

    public final boolean a(Object obj) {
        if (obj != null) {
            try {
                ServiceInfo serviceInfo = (ServiceInfo) a.a(obj, "info");
                IBinder iBinder = (IBinder) a.a(obj, "token");
                if (serviceInfo != null && d.b(serviceInfo)) {
                    ServiceInfo c2 = d.c(serviceInfo);
                    if (c2 != null) {
                        String str = serviceInfo.name;
                        if (!this.f20018b.containsKey(str)) {
                            this.f20018b.put(str, c2);
                        }
                        if (!this.f20019c.containsKey(str)) {
                            this.f20019c.put(str, new ServiceInfo(serviceInfo));
                        }
                        if (c.i(c2.packageName)) {
                            serviceInfo.applicationInfo = c2.applicationInfo;
                            com.bytedance.frameworks.plugin.b.a.a(c2.applicationInfo, (ComponentInfo) c2);
                        } else if (!a(c2.name)) {
                            com.bytedance.frameworks.plugin.b.a.a(c2.applicationInfo, (ComponentInfo) c2);
                        }
                        if (g.a()) {
                            g.b(String.format("onCreateService:%s  <->  %s", new Object[]{c2.name, serviceInfo.name}));
                        }
                        this.f20020d.put(iBinder, serviceInfo.name);
                        serviceInfo.name = c2.name;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final boolean b(Object obj) {
        boolean z;
        if (obj != null && (obj instanceof IBinder)) {
            IBinder iBinder = (IBinder) obj;
            if (this.f20020d.containsKey(iBinder)) {
                String str = this.f20020d.get(iBinder);
                ServiceInfo serviceInfo = this.f20018b.get(str);
                ServiceInfo serviceInfo2 = this.f20019c.get(str);
                boolean z2 = true;
                if (serviceInfo2 == null || serviceInfo == null) {
                    StringBuilder sb = new StringBuilder("ServiceManager#onStopService targetService -> ");
                    if (serviceInfo == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sb.append(z);
                    sb.append("  stubService -> ");
                    if (serviceInfo2 != null) {
                        z2 = false;
                    }
                    sb.append(z2);
                    g.c(sb.toString());
                } else {
                    if (g.a()) {
                        g.b(String.format("onStopService:%s  <->  %s", new Object[]{serviceInfo.name, serviceInfo2.name}));
                    }
                    try {
                        d.a().b(serviceInfo2, serviceInfo);
                    } catch (Exception e2) {
                        g.a("PluginActivityManager serviceDestory fail.", (Throwable) e2);
                    }
                }
                this.f20018b.remove(str);
                this.f20019c.remove(str);
            }
        }
        return false;
    }
}
