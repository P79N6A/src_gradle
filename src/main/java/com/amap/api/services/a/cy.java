package com.amap.api.services.a;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class cy implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f6788a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Charset f6789b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f6790c;

    /* renamed from: d  reason: collision with root package name */
    private int f6791d;

    /* renamed from: e  reason: collision with root package name */
    private int f6792e;

    private void b() throws IOException {
        int read = this.f6788a.read(this.f6790c, 0, this.f6790c.length);
        if (read != -1) {
            this.f6791d = 0;
            this.f6792e = read;
            return;
        }
        throw new EOFException();
    }

    public void close() throws IOException {
        synchronized (this.f6788a) {
            if (this.f6790c != null) {
                this.f6790c = null;
                this.f6788a.close();
            }
        }
    }

    public String a() throws IOException {
        int i;
        int i2;
        synchronized (this.f6788a) {
            if (this.f6790c != null) {
                if (this.f6791d >= this.f6792e) {
                    b();
                }
                for (int i3 = this.f6791d; i3 != this.f6792e; i3++) {
                    if (this.f6790c[i3] == 10) {
                        if (i3 != this.f6791d) {
                            i2 = i3 - 1;
                            if (this.f6790c[i2] == 13) {
                                String str = new String(this.f6790c, this.f6791d, i2 - this.f6791d, this.f6789b.name());
                                this.f6791d = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(this.f6790c, this.f6791d, i2 - this.f6791d, this.f6789b.name());
                        this.f6791d = i3 + 1;
                        return str2;
                    }
                }
                AnonymousClass1 r1 = new ByteArrayOutputStream((this.f6792e - this.f6791d) + 80) {
                    public String toString() {
                        int i;
                        if (this.count <= 0 || this.buf[this.count - 1] != 13) {
                            i = this.count;
                        } else {
                            i = this.count - 1;
                        }
                        try {
                            return new String(this.buf, 0, i, cy.this.f6789b.name());
                        } catch (UnsupportedEncodingException e2) {
                            throw new AssertionError(e2);
                        }
                    }
                };
                loop1:
                while (true) {
                    r1.write(this.f6790c, this.f6791d, this.f6792e - this.f6791d);
                    this.f6792e = -1;
                    b();
                    i = this.f6791d;
                    while (true) {
                        if (i != this.f6792e) {
                            if (this.f6790c[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                if (i != this.f6791d) {
                    r1.write(this.f6790c, this.f6791d, i - this.f6791d);
                }
                this.f6791d = i + 1;
                String byteArrayOutputStream = r1.toString();
                return byteArrayOutputStream;
            }
            throw new IOException("LineReader is closed");
        }
    }

    public cy(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    public cy(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw new NullPointerException();
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(cz.f6794a)) {
            this.f6788a = inputStream;
            this.f6789b = charset;
            this.f6790c = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }
}
