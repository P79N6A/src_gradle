package com.huawei.android.pushagent.a.b;

import com.huawei.android.pushagent.a.b.a.b;
import java.io.IOException;
import java.io.InputStream;

public class j extends b {

    /* renamed from: b  reason: collision with root package name */
    private byte f24971b = 10;

    public j() {
        super(c());
    }

    public static byte c() {
        return -38;
    }

    public b a(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[1];
        a(inputStream, bArr);
        this.f24971b = bArr[0];
        return this;
    }

    public void a(byte b2) {
        this.f24971b = b2;
    }

    public byte[] b() {
        return new byte[]{a(), d()};
    }

    public byte d() {
        return this.f24971b;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(getClass().getSimpleName());
        stringBuffer.append(" cmdId:");
        stringBuffer.append(j());
        stringBuffer.append(" NextHeartBeatToServer:");
        stringBuffer.append(this.f24971b);
        return stringBuffer.toString();
    }
}
