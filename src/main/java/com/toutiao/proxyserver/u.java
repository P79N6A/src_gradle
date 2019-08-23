package com.toutiao.proxyserver;

import java.io.IOException;

public final class u extends IOException {
    public int errorCode;

    public u(String str) {
        super(str);
        this.errorCode = 1;
    }

    public u(String str, int i) {
        super(str);
        this.errorCode = i;
    }
}
