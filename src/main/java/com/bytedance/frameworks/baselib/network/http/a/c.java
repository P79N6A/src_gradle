package com.bytedance.frameworks.baselib.network.http.a;

import java.io.IOException;

public final class c extends IOException {
    private static final long serialVersionUID = -7281385706782665299L;

    public c() {
    }

    public c(String str) {
        super(str);
    }

    public c(Throwable th) {
        initCause(th);
    }

    public c(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
