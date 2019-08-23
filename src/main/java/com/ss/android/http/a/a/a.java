package com.ss.android.http.a.a;

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
