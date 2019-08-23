package com.umeng.analytics.pro;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class dr extends dt {

    /* renamed from: a  reason: collision with root package name */
    protected InputStream f80630a;

    /* renamed from: b  reason: collision with root package name */
    protected OutputStream f80631b;

    public boolean a() {
        return true;
    }

    public void b() throws du {
    }

    protected dr() {
    }

    public void c() {
        if (this.f80630a != null) {
            try {
                this.f80630a.close();
            } catch (IOException unused) {
            }
            this.f80630a = null;
        }
        if (this.f80631b != null) {
            try {
                this.f80631b.close();
            } catch (IOException unused2) {
            }
            this.f80631b = null;
        }
    }

    public void d() throws du {
        if (this.f80631b != null) {
            try {
                this.f80631b.flush();
            } catch (IOException e2) {
                throw new du(0, (Throwable) e2);
            }
        } else {
            throw new du(1, "Cannot flush null outputStream");
        }
    }

    public dr(InputStream inputStream) {
        this.f80630a = inputStream;
    }

    public dr(OutputStream outputStream) {
        this.f80631b = outputStream;
    }

    public dr(InputStream inputStream, OutputStream outputStream) {
        this.f80630a = inputStream;
        this.f80631b = outputStream;
    }

    public void b(byte[] bArr, int i, int i2) throws du {
        if (this.f80631b != null) {
            try {
                this.f80631b.write(bArr, i, i2);
            } catch (IOException e2) {
                throw new du(0, (Throwable) e2);
            }
        } else {
            throw new du(1, "Cannot write to null outputStream");
        }
    }

    public int a(byte[] bArr, int i, int i2) throws du {
        if (this.f80630a != null) {
            try {
                int read = this.f80630a.read(bArr, i, i2);
                if (read >= 0) {
                    return read;
                }
                throw new du(4);
            } catch (IOException e2) {
                throw new du(0, (Throwable) e2);
            }
        } else {
            throw new du(1, "Cannot read from null inputStream");
        }
    }
}
