package com.huawei.android.pushagent.a.b;

import com.huawei.android.pushagent.a.b.a.b;
import com.huawei.android.pushagent.utils.a;
import com.huawei.android.pushagent.utils.a.e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class o extends b {

    /* renamed from: b  reason: collision with root package name */
    private byte f24981b = 1;

    /* renamed from: c  reason: collision with root package name */
    private String f24982c = null;

    /* renamed from: d  reason: collision with root package name */
    private String f24983d = null;

    public o() {
        super(c());
    }

    public static byte c() {
        return -35;
    }

    public b a(InputStream inputStream) throws Exception {
        byte[] bArr = new byte[1];
        a(inputStream, bArr);
        this.f24981b = bArr[0];
        if (bArr[0] != 0) {
            this.f24983d = null;
            this.f24982c = null;
        }
        byte[] bArr2 = new byte[32];
        a(inputStream, bArr2);
        this.f24982c = new String(bArr2, "UTF-8");
        byte[] bArr3 = new byte[2];
        a(inputStream, bArr3);
        byte[] bArr4 = new byte[a.c(bArr3)];
        a(inputStream, bArr4);
        this.f24983d = new String(bArr4, "UTF-8");
        return this;
    }

    public byte[] b() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(a());
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(this.f24982c.getBytes("UTF-8"));
            byteArrayOutputStream.write(a.b(this.f24983d.length()));
            byteArrayOutputStream.write(this.f24983d.getBytes("UTF-8"));
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            e.d("PushLogAC2815", "encode error,e " + e2.toString());
            return new byte[0];
        }
    }

    public String d() {
        return this.f24982c;
    }

    public String e() {
        return this.f24983d;
    }

    public byte f() {
        return this.f24981b;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("RegisterTokenRspMessage[");
        stringBuffer.append("result:");
        stringBuffer.append(a.a(this.f24981b));
        stringBuffer.append(",token:");
        stringBuffer.append(this.f24982c);
        stringBuffer.append(",packageName:");
        stringBuffer.append(this.f24983d);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
