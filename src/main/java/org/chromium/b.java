package org.chromium;

import com.ttnet.org.chromium.base.Reflect;
import com.ttnet.org.chromium.net.TTMonitorProvider;

public class b extends TTMonitorProvider {

    /* renamed from: a  reason: collision with root package name */
    private static b f84071a;

    private b() {
    }

    public static b a() {
        if (f84071a == null) {
            synchronized (b.class) {
                if (f84071a == null) {
                    f84071a = new b();
                }
            }
        }
        return f84071a;
    }

    public void sendAppMonitorEvent(String str, String str2) {
        c a2 = c.a();
        if (d.a().loggerDebug()) {
            d a3 = d.a();
            a3.loggerD("CronetAppProviderManager", "Send monitor json = " + str + ", log type =" + str2);
        }
        try {
            if (a2.f84073a != null) {
                Reflect.on(a2.f84073a).call("sendAppMonitorEvent", new Class[]{String.class, String.class}, str, str2);
            }
        } catch (Throwable unused) {
        }
    }
}
