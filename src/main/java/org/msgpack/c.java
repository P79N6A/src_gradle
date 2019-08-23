package org.msgpack;

public final class c extends RuntimeException {
    public c() {
    }

    public c(String str) {
        super(str);
    }

    public c(Throwable th) {
        super(th);
    }

    public c(String str, Throwable th) {
        super(str, th);
    }
}
