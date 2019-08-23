package org.chromium;

import com.ttnet.org.chromium.base.Reflect;
import java.util.Collections;
import java.util.Map;

public class c {

    /* renamed from: b  reason: collision with root package name */
    private static c f84072b;

    /* renamed from: a  reason: collision with root package name */
    public Object f84073a;

    private c() {
    }

    public static c a() {
        if (f84072b == null) {
            synchronized (c.class) {
                if (f84072b == null) {
                    f84072b = new c();
                }
            }
        }
        return f84072b;
    }

    public final String c() {
        try {
            if (this.f84073a == null) {
                return null;
            }
            return (String) Reflect.on(this.f84073a).call("getGetDomainDefaultJSON").get();
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Map<String, String> b() {
        try {
            if (this.f84073a == null) {
                return Collections.emptyMap();
            }
            return (Map) Reflect.on(this.f84073a).call("getGetDomainDependHostMap").get();
        } catch (Throwable unused) {
            return Collections.emptyMap();
        }
    }

    /* access modifiers changed from: package-private */
    public String a(String str) {
        try {
            if (this.f84073a == null) {
                return "";
            }
            return (String) Reflect.on(this.f84073a).call(str).get();
        } catch (Throwable unused) {
            return "";
        }
    }

    public final Map<String, String> a(String str, Map<String, String> map) {
        if (d.a().loggerDebug()) {
            d a2 = d.a();
            a2.loggerD("CronetAppProviderManager", "onCallToAddSecurityFactor info url = " + str);
        }
        try {
            if (this.f84073a == null) {
                return null;
            }
            return (Map) Reflect.on(this.f84073a).call("onCallToAddSecurityFactor", new Class[]{String.class, Map.class}, str, map).get();
        } catch (Throwable unused) {
            return null;
        }
    }
}
