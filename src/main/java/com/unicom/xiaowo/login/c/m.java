package com.unicom.xiaowo.login.c;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final class m implements HostnameVerifier {
    m() {
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        return "opencloud.wostore.cn".equals(str);
    }
}
