package com.meizu.cloud.pushsdk.b.g;

import java.io.IOException;

public final class g implements b {

    /* renamed from: a  reason: collision with root package name */
    public final a f27011a;

    /* renamed from: b  reason: collision with root package name */
    public final k f27012b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f27013c;

    public g(k kVar) {
        this(kVar, new a());
    }

    public g(k kVar, a aVar) {
        if (kVar != null) {
            this.f27011a = aVar;
            this.f27012b = kVar;
            return;
        }
        throw new IllegalArgumentException("sink == null");
    }

    public final long a(l lVar) throws IOException {
        if (lVar != null) {
            long j = 0;
            while (true) {
                long b2 = lVar.b(this.f27011a, 2048);
                if (b2 == -1) {
                    return j;
                }
                j += b2;
                a();
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    public final b a() throws IOException {
        if (!this.f27013c) {
            long e2 = this.f27011a.e();
            if (e2 > 0) {
                this.f27012b.a(this.f27011a, e2);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final void a(a aVar, long j) throws IOException {
        if (!this.f27013c) {
            this.f27011a.a(aVar, j);
            a();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final a b() {
        return this.f27011a;
    }

    public final b b(d dVar) throws IOException {
        if (!this.f27013c) {
            this.f27011a.b(dVar);
            return a();
        }
        throw new IllegalStateException("closed");
    }

    public final b b(String str) throws IOException {
        if (!this.f27013c) {
            this.f27011a.b(str);
            return a();
        }
        throw new IllegalStateException("closed");
    }

    public final b c(byte[] bArr) throws IOException {
        if (!this.f27013c) {
            this.f27011a.c(bArr);
            return a();
        }
        throw new IllegalStateException("closed");
    }

    public final b c(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f27013c) {
            this.f27011a.c(bArr, i, i2);
            return a();
        }
        throw new IllegalStateException("closed");
    }

    public final void close() throws IOException {
        if (!this.f27013c) {
            Throwable th = null;
            try {
                if (this.f27011a.f26998b > 0) {
                    this.f27012b.a(this.f27011a, this.f27011a.f26998b);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f27012b.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f27013c = true;
            if (th != null) {
                n.a(th);
            }
        }
    }

    public final b e(long j) throws IOException {
        if (!this.f27013c) {
            this.f27011a.e(j);
            return a();
        }
        throw new IllegalStateException("closed");
    }

    public final void flush() throws IOException {
        if (!this.f27013c) {
            if (this.f27011a.f26998b > 0) {
                this.f27012b.a(this.f27011a, this.f27011a.f26998b);
            }
            this.f27012b.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final String toString() {
        return "buffer(" + this.f27012b + ")";
    }
}
