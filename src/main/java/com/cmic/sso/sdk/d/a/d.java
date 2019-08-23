package com.cmic.sso.sdk.d.a;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;

public abstract class d {
    /* access modifiers changed from: protected */
    public abstract int a();

    /* access modifiers changed from: protected */
    public void a(PushbackInputStream pushbackInputStream, OutputStream outputStream) throws IOException {
    }

    /* access modifiers changed from: protected */
    public abstract int b();

    /* access modifiers changed from: protected */
    public void b(PushbackInputStream pushbackInputStream, OutputStream outputStream) throws IOException {
    }

    /* access modifiers changed from: protected */
    public void d(PushbackInputStream pushbackInputStream, OutputStream outputStream) throws IOException {
    }

    public byte[] a(String str) throws IOException {
        byte[] bArr = new byte[str.length()];
        str.getBytes(0, str.length(), bArr, 0);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a((InputStream) byteArrayInputStream, (OutputStream) byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* access modifiers changed from: protected */
    public int c(PushbackInputStream pushbackInputStream, OutputStream outputStream) throws IOException {
        return b();
    }

    public void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream);
        a(pushbackInputStream, outputStream);
        while (true) {
            try {
                int c2 = c(pushbackInputStream, outputStream);
                int i = 0;
                while (a() + i < c2) {
                    a(pushbackInputStream, outputStream, a());
                    i += a();
                }
                if (a() + i == c2) {
                    a(pushbackInputStream, outputStream, a());
                } else {
                    a(pushbackInputStream, outputStream, c2 - i);
                }
                d(pushbackInputStream, outputStream);
            } catch (c unused) {
                b(pushbackInputStream, outputStream);
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(PushbackInputStream pushbackInputStream, OutputStream outputStream, int i) throws IOException {
        throw new c();
    }

    /* access modifiers changed from: protected */
    public int a(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read();
            if (read != -1) {
                bArr[i3 + i] = (byte) read;
                i3++;
            } else if (i3 == 0) {
                return -1;
            } else {
                return i3;
            }
        }
        return i2;
    }
}
