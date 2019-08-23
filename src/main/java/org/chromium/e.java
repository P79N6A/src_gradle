package org.chromium;

import com.ttnet.org.chromium.base.Reflect;
import com.ttnet.org.chromium.net.TTEventListener;
import java.util.Map;

public class e extends TTEventListener {

    /* renamed from: b  reason: collision with root package name */
    private static e f84076b;

    /* renamed from: a  reason: collision with root package name */
    public boolean f84077a;

    private e() {
    }

    public static e a() {
        if (f84076b == null) {
            synchronized (e.class) {
                if (f84076b == null) {
                    f84076b = new e();
                }
            }
        }
        return f84076b;
    }

    public void onColdStartFinish() {
        if (this.f84077a) {
            c a2 = c.a();
            if (d.a().loggerDebug()) {
                d.a().loggerD("CronetAppProviderManager", "onColdStartFinish ");
            }
            try {
                if (a2.f84073a != null) {
                    Reflect.on(a2.f84073a).call("onColdStartFinish");
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void onServerConfigUpdated(String str) {
        if (this.f84077a) {
            c a2 = c.a();
            if (d.a().loggerDebug()) {
                d a3 = d.a();
                a3.loggerD("CronetAppProviderManager", "onServerConfigUpdated json = " + str);
            }
            try {
                if (a2.f84073a != null) {
                    Reflect.on(a2.f84073a).call("onServerConfigUpdated", new Class[]{String.class}, str);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void onTTNetDetectInfoChanged(String str) {
        if (this.f84077a) {
            c a2 = c.a();
            if (d.a().loggerDebug()) {
                d a3 = d.a();
                a3.loggerD("CronetAppProviderManager", "onTTNetDetectInfoChanged info str = " + str);
            }
            try {
                if (a2.f84073a != null) {
                    Reflect.on(a2.f84073a).call("onTTNetDetectInfoChanged", new Class[]{String.class}, str);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void onTTNetStateChanged(int i) {
        if (this.f84077a) {
            c a2 = c.a();
            if (d.a().loggerDebug()) {
                d a3 = d.a();
                a3.loggerD("CronetAppProviderManager", "onTTNetStateChanged info int = " + i);
            }
            try {
                if (a2.f84073a != null) {
                    Reflect.on(a2.f84073a).call("onTTNetStateChanged", new Class[]{Integer.TYPE}, Integer.valueOf(i));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public Map<String, String> onCallToAddSecurityFactor(String str, Map<String, String> map) {
        return c.a().a(str, map);
    }
}
