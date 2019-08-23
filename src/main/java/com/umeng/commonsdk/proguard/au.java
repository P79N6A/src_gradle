package com.umeng.commonsdk.proguard;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class au extends aw {

    /* renamed from: a  reason: collision with root package name */
    protected InputStream f80827a;

    /* renamed from: b  reason: collision with root package name */
    protected OutputStream f80828b;

    public boolean a() {
        return true;
    }

    public void b() throws ax {
    }

    protected au() {
    }

    public void c() {
        if (this.f80827a != null) {
            try {
                this.f80827a.close();
            } catch (IOException unused) {
            }
            this.f80827a = null;
        }
        if (this.f80828b != null) {
            try {
                this.f80828b.close();
            } catch (IOException unused2) {
            }
            this.f80828b = null;
        }
    }

    public void d() throws ax {
        if (this.f80828b != null) {
            try {
                this.f80828b.flush();
            } catch (IOException e2) {
                throw new ax(0, (Throwable) e2);
            }
        } else {
            throw new ax(1, "Cannot flush null outputStream");
        }
    }

    public au(InputStream inputStream) {
        this.f80827a = inputStream;
    }

    public au(OutputStream outputStream) {
        this.f80828b = outputStream;
    }

    public au(InputStream inputStream, OutputStream outputStream) {
        this.f80827a = inputStream;
        this.f80828b = outputStream;
    }

    public void b(byte[] bArr, int i, int i2) throws ax {
        if (this.f80828b != null) {
            try {
                this.f80828b.write(bArr, i, i2);
            } catch (IOException e2) {
                throw new ax(0, (Throwable) e2);
            }
        } else {
            throw new ax(1, "Cannot write to null outputStream");
        }
    }

    public int a(byte[] bArr, int i, int i2) throws ax {
        if (this.f80827a != null) {
            try {
                int read = this.f80827a.read(bArr, i, i2);
                if (read >= 0) {
                    return read;
                }
                throw new ax(4);
            } catch (IOException e2) {
                throw new ax(0, (Throwable) e2);
            }
        } else {
            throw new ax(1, "Cannot read from null inputStream");
        }
    }
}
