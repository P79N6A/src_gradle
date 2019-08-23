package com.ss.sys.a.b;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final class a implements HostnameVerifier {
    a() {
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        return true;
    }
}
