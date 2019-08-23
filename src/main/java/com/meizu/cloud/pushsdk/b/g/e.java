package com.meizu.cloud.pushsdk.b.g;

import java.io.IOException;

public abstract class e implements k {

    /* renamed from: a  reason: collision with root package name */
    private final k f27005a;

    public e(k kVar) {
        if (kVar != null) {
            this.f27005a = kVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public void a(a aVar, long j) throws IOException {
        this.f27005a.a(aVar, j);
    }

    public void close() throws IOException {
        this.f27005a.close();
    }

    public void flush() throws IOException {
        this.f27005a.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f27005a.toString() + ")";
    }
}
