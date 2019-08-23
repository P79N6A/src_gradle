package com.bytedance.usergrowth.data.a.a;

import java.io.IOException;

public final class a extends IOException {
    private static final long serialVersionUID = -7186627969477257933L;
    private final int statusCode;

    public final int getStatusCode() {
        return this.statusCode;
    }

    public a(int i, String str) {
        super(str);
        this.statusCode = i;
    }
}
