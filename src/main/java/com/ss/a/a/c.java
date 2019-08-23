package com.ss.a.a;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final class c implements HostnameVerifier {
    c() {
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        return true;
    }
}
