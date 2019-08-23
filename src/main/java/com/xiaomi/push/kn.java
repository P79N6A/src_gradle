package com.xiaomi.push;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class kn extends kq {

    /* renamed from: a  reason: collision with root package name */
    protected InputStream f82436a;

    /* renamed from: a  reason: collision with other field name */
    protected OutputStream f875a;

    protected kn() {
    }

    public kn(OutputStream outputStream) {
        this.f875a = outputStream;
    }

    public int a(byte[] bArr, int i, int i2) {
        if (this.f82436a != null) {
            try {
                int read = this.f82436a.read(bArr, i, i2);
                if (read >= 0) {
                    return read;
                }
                throw new kr(4);
            } catch (IOException e2) {
                throw new kr(0, (Throwable) e2);
            }
        } else {
            throw new kr(1, "Cannot read from null inputStream");
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m560a(byte[] bArr, int i, int i2) {
        if (this.f875a != null) {
            try {
                this.f875a.write(bArr, i, i2);
            } catch (IOException e2) {
                throw new kr(0, (Throwable) e2);
            }
        } else {
            throw new kr(1, "Cannot write to null outputStream");
        }
    }
}
