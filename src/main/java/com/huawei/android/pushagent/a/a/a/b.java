package com.huawei.android.pushagent.a.a.a;

import com.huawei.android.pushagent.utils.a;
import com.huawei.android.pushagent.utils.a.e;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public abstract class b implements com.huawei.android.pushagent.a.b {

    /* renamed from: a  reason: collision with root package name */
    protected byte f24947a = -1;

    public b() {
    }

    public b(byte b2) {
        a(b2);
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

    public static b b(InputStream inputStream) throws Exception {
        byte[] bArr = new byte[2];
        a(inputStream, bArr);
        int c2 = (short) a.c(bArr);
        byte[] bArr2 = new byte[c2];
        a(inputStream, bArr2);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
        byte read = (byte) byteArrayInputStream.read();
        e.a("PushLogAC2815", "cmdId: 0X" + Integer.toHexString(read) + " len:" + c2);
        return a.a(Byte.valueOf(read), byteArrayInputStream);
    }

    public byte a() {
        return this.f24947a;
    }

    public abstract b a(InputStream inputStream) throws IOException;

    public void a(byte b2) {
        this.f24947a = b2;
    }

    public String g() {
        return a.a(new byte[]{this.f24947a});
    }
}
