package com.huawei.android.pushagent.plugin.c.b;

import com.huawei.android.pushagent.utils.a.e;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final class b implements HostnameVerifier {
    b() {
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        if (str == null || sSLSession == null || !str.equals(sSLSession.getPeerHost())) {
            return false;
        }
        e.b("PushLogSC2815", "verify hostname success");
        return true;
    }
}
