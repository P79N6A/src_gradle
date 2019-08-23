package com.bytedance.frameworks.baselib.network.http.a;

import java.io.IOException;

public final class e extends IOException {
    private static final long serialVersionUID = -210264743726619965L;

    public e() {
    }

    public e(String str) {
        super(str);
    }

    public e(Throwable th) {
        initCause(th);
    }

    public e(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
