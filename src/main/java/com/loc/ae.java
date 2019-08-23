package com.loc;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public final class ae implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    final Charset f25445a;

    /* renamed from: b  reason: collision with root package name */
    private final InputStream f25446b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f25447c;

    /* renamed from: d  reason: collision with root package name */
    private int f25448d;

    /* renamed from: e  reason: collision with root package name */
    private int f25449e;

    public ae(InputStream inputStream, Charset charset) {
        this(inputStream, charset, (byte) 0);
    }

    private ae(InputStream inputStream, Charset charset, byte b2) {
        if (inputStream == null || charset == null) {
            throw new NullPointerException();
        } else if (charset.equals(af.f25451a)) {
            this.f25446b = inputStream;
            this.f25445a = charset;
            this.f25447c = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    private void b() throws IOException {
        int read = this.f25446b.read(this.f25447c, 0, this.f25447c.length);
        if (read != -1) {
            this.f25448d = 0;
            this.f25449e = read;
            return;
        }
        throw new EOFException();
    }

    public final String a() throws IOException {
        int i;
        int i2;
        synchronized (this.f25446b) {
            if (this.f25447c != null) {
                if (this.f25448d >= this.f25449e) {
                    b();
                }
                for (int i3 = this.f25448d; i3 != this.f25449e; i3++) {
                    if (this.f25447c[i3] == 10) {
                        if (i3 != this.f25448d) {
                            i2 = i3 - 1;
                            if (this.f25447c[i2] == 13) {
                                String str = new String(this.f25447c, this.f25448d, i2 - this.f25448d, this.f25445a.name());
                                this.f25448d = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(this.f25447c, this.f25448d, i2 - this.f25448d, this.f25445a.name());
                        this.f25448d = i3 + 1;
                        return str2;
                    }
                }
                AnonymousClass1 r1 = new ByteArrayOutputStream((this.f25449e - this.f25448d) + 80) {
                    public final String toString() {
                        int i;
                        if (this.count <= 0 || this.buf[this.count - 1] != 13) {
                            i = this.count;
                        } else {
                            i = this.count - 1;
                        }
                        try {
                            return new String(this.buf, 0, i, ae.this.f25445a.name());
                        } catch (UnsupportedEncodingException e2) {
                            throw new AssertionError(e2);
                        }
                    }
                };
                loop1:
                while (true) {
                    r1.write(this.f25447c, this.f25448d, this.f25449e - this.f25448d);
                    this.f25449e = -1;
                    b();
                    i = this.f25448d;
                    while (true) {
                        if (i != this.f25449e) {
                            if (this.f25447c[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                if (i != this.f25448d) {
                    r1.write(this.f25447c, this.f25448d, i - this.f25448d);
                }
                this.f25448d = i + 1;
                String byteArrayOutputStream = r1.toString();
                return byteArrayOutputStream;
            }
            throw new IOException("LineReader is closed");
        }
    }

    public final void close() throws IOException {
        synchronized (this.f25446b) {
            if (this.f25447c != null) {
                this.f25447c = null;
                this.f25446b.close();
            }
        }
    }
}
