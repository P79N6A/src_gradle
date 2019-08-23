package org.json.a;

public final class a extends Exception {
    private Throwable cause;

    public a(String str) {
        super(str);
    }

    public a(Throwable th) {
        super(th.getMessage());
        this.cause = th;
    }

    public final Throwable getCause() {
        return this.cause;
    }
}
