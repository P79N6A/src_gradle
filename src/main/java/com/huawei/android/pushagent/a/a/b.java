package com.huawei.android.pushagent.a.a;

import com.huawei.android.pushagent.utils.a;
import com.huawei.android.pushagent.utils.a.e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class b extends com.huawei.android.pushagent.a.a.a.b {

    /* renamed from: b  reason: collision with root package name */
    private short f24948b;

    /* renamed from: c  reason: collision with root package name */
    private short f24949c;

    /* renamed from: d  reason: collision with root package name */
    private byte f24950d;

    /* renamed from: e  reason: collision with root package name */
    private byte f24951e;

    /* renamed from: f  reason: collision with root package name */
    private short f24952f;

    public b() {
        super(c());
    }

    public static byte c() {
        return 2;
    }

    public com.huawei.android.pushagent.a.a.a.b a(InputStream inputStream) throws IOException {
        try {
            byte[] bArr = new byte[2];
            a(inputStream, bArr);
            this.f24949c = (short) a.c(bArr);
            byte[] bArr2 = new byte[1];
            a(inputStream, bArr2);
            this.f24950d = bArr2[0];
            byte[] bArr3 = new byte[1];
            a(inputStream, bArr3);
            this.f24951e = bArr3[0];
            byte[] bArr4 = new byte[2];
            a(inputStream, bArr4);
            this.f24952f = (short) a.c(bArr4);
        } catch (Exception e2) {
            e.c("PushLogAC2815", e2.toString(), e2);
        }
        return this;
    }

    public byte[] b() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(a.b((int) this.f24948b));
            byteArrayOutputStream.write(a());
            byteArrayOutputStream.write(a.b((int) this.f24949c));
            byteArrayOutputStream.write(this.f24950d);
            byteArrayOutputStream.write(this.f24951e);
            byteArrayOutputStream.write(a.b((int) this.f24952f));
            e.a("PushLogAC2815", "PollingDataRspMessage encode : baos " + a.a(byteArrayOutputStream.toByteArray()));
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e2) {
            e.c("PushLogAC2815", e2.toString(), e2);
            return new byte[0];
        }
    }

    public byte d() {
        return this.f24950d;
    }

    public boolean e() {
        return this.f24951e == 1;
    }

    public short f() {
        return this.f24952f;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(getClass().getSimpleName());
        stringBuffer.append(",mLength:");
        stringBuffer.append(this.f24948b);
        stringBuffer.append(",cmdId:");
        stringBuffer.append(g());
        stringBuffer.append(",mRequestId:");
        stringBuffer.append(this.f24949c);
        stringBuffer.append(",mMode:");
        stringBuffer.append(this.f24950d);
        stringBuffer.append(",mHasMsg:");
        stringBuffer.append(this.f24951e);
        stringBuffer.append(",mPollingInterval:");
        stringBuffer.append(this.f24952f);
        return stringBuffer.toString();
    }
}
