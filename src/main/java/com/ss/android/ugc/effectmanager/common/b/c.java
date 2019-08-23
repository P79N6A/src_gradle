package com.ss.android.ugc.effectmanager.common.b;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public final class c implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final Charset f77302a;

    /* renamed from: b  reason: collision with root package name */
    private final InputStream f77303b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f77304c;

    /* renamed from: d  reason: collision with root package name */
    private int f77305d;

    /* renamed from: e  reason: collision with root package name */
    private int f77306e;

    public final boolean b() {
        if (this.f77306e == -1) {
            return true;
        }
        return false;
    }

    private void c() throws IOException {
        int read = this.f77303b.read(this.f77304c, 0, this.f77304c.length);
        if (read != -1) {
            this.f77305d = 0;
            this.f77306e = read;
            return;
        }
        throw new EOFException();
    }

    public final void close() throws IOException {
        synchronized (this.f77303b) {
            if (this.f77304c != null) {
                this.f77304c = null;
                this.f77303b.close();
            }
        }
    }

    public final String a() throws IOException {
        int i;
        int i2;
        synchronized (this.f77303b) {
            if (this.f77304c != null) {
                if (this.f77305d >= this.f77306e) {
                    c();
                }
                for (int i3 = this.f77305d; i3 != this.f77306e; i3++) {
                    if (this.f77304c[i3] == 10) {
                        if (i3 != this.f77305d) {
                            i2 = i3 - 1;
                            if (this.f77304c[i2] == 13) {
                                String str = new String(this.f77304c, this.f77305d, i2 - this.f77305d, this.f77302a.name());
                                this.f77305d = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(this.f77304c, this.f77305d, i2 - this.f77305d, this.f77302a.name());
                        this.f77305d = i3 + 1;
                        return str2;
                    }
                }
                AnonymousClass1 r1 = new ByteArrayOutputStream((this.f77306e - this.f77305d) + 80) {
                    public final String toString() {
                        int i;
                        if (this.count <= 0 || this.buf[this.count - 1] != 13) {
                            i = this.count;
                        } else {
                            i = this.count - 1;
                        }
                        try {
                            return new String(this.buf, 0, i, c.this.f77302a.name());
                        } catch (UnsupportedEncodingException e2) {
                            throw new AssertionError(e2);
                        }
                    }
                };
                loop1:
                while (true) {
                    r1.write(this.f77304c, this.f77305d, this.f77306e - this.f77305d);
                    this.f77306e = -1;
                    c();
                    i = this.f77305d;
                    while (true) {
                        if (i != this.f77306e) {
                            if (this.f77304c[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                if (i != this.f77305d) {
                    r1.write(this.f77304c, this.f77305d, i - this.f77305d);
                }
                this.f77305d = i + 1;
                String byteArrayOutputStream = r1.toString();
                return byteArrayOutputStream;
            }
            throw new IOException("LineReader is closed");
        }
    }

    public c(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private c(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw new NullPointerException();
        } else if (charset.equals(d.f77308a)) {
            this.f77303b = inputStream;
            this.f77302a = charset;
            this.f77304c = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }
}
