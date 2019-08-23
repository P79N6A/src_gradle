package com.meizu.cloud.pushsdk.b.g;

import java.io.IOException;
import java.io.InputStream;

public final class h implements c {

    /* renamed from: a  reason: collision with root package name */
    public final a f27014a;

    /* renamed from: b  reason: collision with root package name */
    public final l f27015b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f27016c;

    public h(l lVar) {
        this(lVar, new a());
    }

    public h(l lVar, a aVar) {
        if (lVar != null) {
            this.f27014a = aVar;
            this.f27015b = lVar;
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final long b(a aVar, long j) throws IOException {
        if (aVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.f27016c) {
            throw new IllegalStateException("closed");
        } else if (this.f27014a.f26998b == 0 && this.f27015b.b(this.f27014a, 2048) == -1) {
            return -1;
        } else {
            return this.f27014a.b(aVar, Math.min(j, this.f27014a.f26998b));
        }
    }

    public final void close() throws IOException {
        if (!this.f27016c) {
            this.f27016c = true;
            this.f27015b.close();
            this.f27014a.j();
        }
    }

    public final InputStream d() {
        return new InputStream() {
            public int available() throws IOException {
                if (!h.this.f27016c) {
                    return (int) Math.min(h.this.f27014a.f26998b, 2147483647L);
                }
                throw new IOException("closed");
            }

            public void close() throws IOException {
                h.this.close();
            }

            public int read() throws IOException {
                if (h.this.f27016c) {
                    throw new IOException("closed");
                } else if (h.this.f27014a.f26998b == 0 && h.this.f27015b.b(h.this.f27014a, 2048) == -1) {
                    return -1;
                } else {
                    return h.this.f27014a.f() & 255;
                }
            }

            public int read(byte[] bArr, int i, int i2) throws IOException {
                if (!h.this.f27016c) {
                    n.a((long) bArr.length, (long) i, (long) i2);
                    if (h.this.f27014a.f26998b == 0 && h.this.f27015b.b(h.this.f27014a, 2048) == -1) {
                        return -1;
                    }
                    return h.this.f27014a.a(bArr, i, i2);
                }
                throw new IOException("closed");
            }

            public String toString() {
                return h.this + ".inputStream()";
            }
        };
    }

    public final String h() throws IOException {
        this.f27014a.a(this.f27015b);
        return this.f27014a.h();
    }

    public final byte[] i() throws IOException {
        this.f27014a.a(this.f27015b);
        return this.f27014a.i();
    }

    public final String toString() {
        return "buffer(" + this.f27015b + ")";
    }
}
