package com.huawei.android.pushagent.a.b.a;

import com.huawei.android.pushagent.utils.a;
import java.io.IOException;
import java.io.InputStream;

public abstract class b implements com.huawei.android.pushagent.a.b {

    /* renamed from: a  reason: collision with root package name */
    protected byte f24957a = -1;

    public b() {
    }

    public b(byte b2) {
        b(b2);
    }

    public static void a(InputStream inputStream, byte[] bArr) throws IOException {
        int i = 0;
        while (i < bArr.length) {
            int read = inputStream.read(bArr, i, bArr.length - i);
            if (-1 != read) {
                i += read;
            } else {
                throw new IOException("read -1 reached");
            }
        }
    }

    public byte a() {
        return this.f24957a;
    }

    public abstract b a(InputStream inputStream) throws Exception;

    public void b(byte b2) {
        this.f24957a = b2;
    }

    public String j() {
        return a.a(new byte[]{this.f24957a});
    }
}
