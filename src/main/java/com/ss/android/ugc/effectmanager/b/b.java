package com.ss.android.ugc.effectmanager.b;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public final class b implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final Charset f77243a;

    /* renamed from: b  reason: collision with root package name */
    int f77244b;

    /* renamed from: c  reason: collision with root package name */
    private final InputStream f77245c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f77246d;

    /* renamed from: e  reason: collision with root package name */
    private int f77247e;

    private void b() throws IOException {
        int read = this.f77245c.read(this.f77246d, 0, this.f77246d.length);
        if (read != -1) {
            this.f77247e = 0;
            this.f77244b = read;
            return;
        }
        throw new EOFException();
    }

    public final void close() throws IOException {
        synchronized (this.f77245c) {
            if (this.f77246d != null) {
                this.f77246d = null;
                this.f77245c.close();
            }
        }
    }

    public final String a() throws IOException {
        int i;
        int i2;
        synchronized (this.f77245c) {
            if (this.f77246d != null) {
                if (this.f77247e >= this.f77244b) {
                    b();
                }
                for (int i3 = this.f77247e; i3 != this.f77244b; i3++) {
                    if (this.f77246d[i3] == 10) {
                        if (i3 != this.f77247e) {
                            i2 = i3 - 1;
                            if (this.f77246d[i2] == 13) {
                                String str = new String(this.f77246d, this.f77247e, i2 - this.f77247e, this.f77243a.name());
                                this.f77247e = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(this.f77246d, this.f77247e, i2 - this.f77247e, this.f77243a.name());
                        this.f77247e = i3 + 1;
                        return str2;
                    }
                }
                AnonymousClass1 r1 = new ByteArrayOutputStream((this.f77244b - this.f77247e) + 80) {
                    public final String toString() {
                        int i;
                        if (this.count <= 0 || this.buf[this.count - 1] != 13) {
                            i = this.count;
                        } else {
                            i = this.count - 1;
                        }
                        try {
                            return new String(this.buf, 0, i, b.this.f77243a.name());
                        } catch (UnsupportedEncodingException e2) {
                            throw new AssertionError(e2);
                        }
                    }
                };
                loop1:
                while (true) {
                    r1.write(this.f77246d, this.f77247e, this.f77244b - this.f77247e);
                    this.f77244b = -1;
                    b();
                    i = this.f77247e;
                    while (true) {
                        if (i != this.f77244b) {
                            if (this.f77246d[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                if (i != this.f77247e) {
                    r1.write(this.f77246d, this.f77247e, i - this.f77247e);
                }
                this.f77247e = i + 1;
                String byteArrayOutputStream = r1.toString();
                return byteArrayOutputStream;
            }
            throw new IOException("LineReader is closed");
        }
    }

    public b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private b(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw new NullPointerException();
        } else if (charset.equals(c.f77249a)) {
            this.f77245c = inputStream;
            this.f77243a = charset;
            this.f77246d = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }
}
