package com.bytedance.frameworks.baselib.network.http.a;

import java.io.IOException;

public class a extends IOException {
    private static final long serialVersionUID = -5596590843227115865L;

    public a() {
    }

    public a(String str) {
        super(str);
    }

    public a(Throwable th) {
        initCause(th);
    }

    public a(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
