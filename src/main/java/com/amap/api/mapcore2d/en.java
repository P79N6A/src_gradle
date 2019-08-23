package com.amap.api.mapcore2d;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class en implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f6065a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Charset f6066b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f6067c;

    /* renamed from: d  reason: collision with root package name */
    private int f6068d;

    /* renamed from: e  reason: collision with root package name */
    private int f6069e;

    private void b() throws IOException {
        int read = this.f6065a.read(this.f6067c, 0, this.f6067c.length);
        if (read != -1) {
            this.f6068d = 0;
            this.f6069e = read;
            return;
        }
        throw new EOFException();
    }

    public void close() throws IOException {
        synchronized (this.f6065a) {
            if (this.f6067c != null) {
                this.f6067c = null;
                this.f6065a.close();
            }
        }
    }

    public String a() throws IOException {
        int i;
        int i2;
        synchronized (this.f6065a) {
            if (this.f6067c != null) {
                if (this.f6068d >= this.f6069e) {
                    b();
                }
                for (int i3 = this.f6068d; i3 != this.f6069e; i3++) {
                    if (this.f6067c[i3] == 10) {
                        if (i3 != this.f6068d) {
                            i2 = i3 - 1;
                            if (this.f6067c[i2] == 13) {
                                String str = new String(this.f6067c, this.f6068d, i2 - this.f6068d, this.f6066b.name());
                                this.f6068d = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(this.f6067c, this.f6068d, i2 - this.f6068d, this.f6066b.name());
                        this.f6068d = i3 + 1;
                        return str2;
                    }
                }
                AnonymousClass1 r1 = new ByteArrayOutputStream((this.f6069e - this.f6068d) + 80) {
                    public String toString() {
                        int i;
                        if (this.count <= 0 || this.buf[this.count - 1] != 13) {
                            i = this.count;
                        } else {
                            i = this.count - 1;
                        }
                        try {
                            return new String(this.buf, 0, i, en.this.f6066b.name());
                        } catch (UnsupportedEncodingException e2) {
                            throw new AssertionError(e2);
                        }
                    }
                };
                loop1:
                while (true) {
                    r1.write(this.f6067c, this.f6068d, this.f6069e - this.f6068d);
                    this.f6069e = -1;
                    b();
                    i = this.f6068d;
                    while (true) {
                        if (i != this.f6069e) {
                            if (this.f6067c[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                if (i != this.f6068d) {
                    r1.write(this.f6067c, this.f6068d, i - this.f6068d);
                }
                this.f6068d = i + 1;
                String byteArrayOutputStream = r1.toString();
                return byteArrayOutputStream;
            }
            throw new IOException("LineReader is closed");
        }
    }

    public en(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    public en(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw new NullPointerException();
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(eo.f6071a)) {
            this.f6065a = inputStream;
            this.f6066b = charset;
            this.f6067c = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }
}
