package org.chromium;

import com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend;

public class d implements ICronetDepend {

    /* renamed from: a  reason: collision with root package name */
    private static d f84074a;

    /* renamed from: b  reason: collision with root package name */
    private ICronetDepend f84075b;

    private d() {
    }

    public String getSsCookieKey() {
        if (this.f84075b != null) {
            return this.f84075b.getSsCookieKey();
        }
        return "X-SS-Cookie";
    }

    public boolean loggerDebug() {
        if (this.f84075b != null) {
            return this.f84075b.loggerDebug();
        }
        return false;
    }

    public static d a() {
        if (f84074a == null) {
            synchronized (d.class) {
                if (f84074a == null) {
                    f84074a = new d();
                }
            }
        }
        return f84074a;
    }

    public void setAdapter(ICronetDepend iCronetDepend) {
        this.f84075b = iCronetDepend;
    }

    public void loggerD(String str, String str2) {
        if (this.f84075b != null) {
            this.f84075b.loggerD(str, str2);
        }
    }
}
