package com.huawei.android.pushagent.a.b;

import com.huawei.android.pushagent.a.b.a.b;
import java.io.IOException;
import java.io.InputStream;

public class i extends b {

    /* renamed from: b  reason: collision with root package name */
    private byte f24970b = 1;

    public i() {
        super(c());
    }

    public static byte c() {
        return -33;
    }

    public b a(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[1];
        a(inputStream, bArr);
        this.f24970b = bArr[0];
        return this;
    }

    public byte[] b() {
        return new byte[]{a(), this.f24970b};
    }

    public byte d() {
        return this.f24970b;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(getClass().getSimpleName());
        stringBuffer.append(" cmdId:");
        stringBuffer.append(j());
        stringBuffer.append(" result:");
        stringBuffer.append(this.f24970b);
        return stringBuffer.toString();
    }
}
