package anet.channel.util;

import java.io.IOException;
import java.io.InputStream;

public class a extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private InputStream f1433a;

    /* renamed from: b  reason: collision with root package name */
    private long f1434b;

    public long a() {
        return this.f1434b;
    }

    public int read() throws IOException {
        this.f1434b++;
        return this.f1433a.read();
    }

    public a(InputStream inputStream) {
        if (inputStream != null) {
            this.f1433a = inputStream;
            return;
        }
        throw new NullPointerException("input stream cannot be null");
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.f1433a.read(bArr, i, i2);
        if (read != -1) {
            this.f1434b += (long) read;
        }
        return read;
    }
}
