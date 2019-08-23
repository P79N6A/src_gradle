package com.huawei.android.pushagent.a.b;

import com.huawei.android.pushagent.a.b.a.b;
import java.io.IOException;
import java.io.InputStream;

public class d extends b {

    /* renamed from: b  reason: collision with root package name */
    private byte f24961b = 1;

    public d() {
        super(c());
    }

    public static byte c() {
        return -45;
    }

    public b a(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[1];
        a(inputStream, bArr);
        this.f24961b = bArr[0];
        return this;
    }

    public byte[] b() {
        return new byte[]{a(), this.f24961b};
    }

    public byte d() {
        return this.f24961b;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(getClass().getSimpleName());
        stringBuffer.append(" cmdId:");
        stringBuffer.append(j());
        stringBuffer.append(" result:");
        stringBuffer.append(this.f24961b);
        return stringBuffer.toString();
    }
}
