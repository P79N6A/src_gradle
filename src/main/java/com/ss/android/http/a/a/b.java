package com.ss.android.http.a.a;

public final class b extends a {
    private static final long serialVersionUID = -7186627969477257933L;
    private final int statusCode;

    public final int getStatusCode() {
        return this.statusCode;
    }

    public b(int i, String str) {
        super(str);
        this.statusCode = i;
    }
}
