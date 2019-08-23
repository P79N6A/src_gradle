package com.huawei.android.pushagent.utils.tools;

import com.huawei.android.pushagent.utils.a.e;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final class f implements HostnameVerifier {
    f() {
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        e.a("PushLogAC2815", "hostname=" + str);
        if (str == null || sSLSession == null || !str.equals(sSLSession.getPeerHost())) {
            return false;
        }
        e.b("PushLogAC2815", "verify hostname success");
        return true;
    }
}
