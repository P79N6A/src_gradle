package com.tencent.open.d;

import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.q.c;
import com.tencent.open.a.f;
import java.lang.ref.WeakReference;
import java.net.URL;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static e f79743a;

    /* renamed from: b  reason: collision with root package name */
    private volatile WeakReference<SharedPreferences> f79744b;

    public static synchronized e a() {
        e eVar;
        synchronized (e.class) {
            if (f79743a == null) {
                f79743a = new e();
            }
            eVar = f79743a;
        }
        return eVar;
    }

    public final String a(Context context, String str) {
        if (this.f79744b == null || this.f79744b.get() == null) {
            this.f79744b = new WeakReference<>(c.a(context, "ServerPrefs", 0));
        }
        try {
            String host = new URL(str).getHost();
            if (host == null) {
                f.e("openSDK_LOG.ServerSetting", "Get host error. url=" + str);
                return str;
            }
            String string = ((SharedPreferences) this.f79744b.get()).getString(host, null);
            if (string != null) {
                if (!host.equals(string)) {
                    String replace = str.replace(host, string);
                    try {
                        f.a("openSDK_LOG.ServerSetting", "return environment url : " + replace);
                        return replace;
                    } catch (Exception e2) {
                        Exception exc = e2;
                        str = replace;
                        e = exc;
                        f.e("openSDK_LOG.ServerSetting", "getEnvUrl url=" + str + "error.: " + e.getMessage());
                        return str;
                    }
                }
            }
            f.a("openSDK_LOG.ServerSetting", "host=" + host + ", envHost=" + string);
            return str;
        } catch (Exception e3) {
            e = e3;
            f.e("openSDK_LOG.ServerSetting", "getEnvUrl url=" + str + "error.: " + e.getMessage());
            return str;
        }
    }
}
