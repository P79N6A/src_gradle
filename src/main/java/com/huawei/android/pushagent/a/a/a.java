package com.huawei.android.pushagent.a.a;

import com.huawei.android.pushagent.a.a.a.b;
import com.huawei.android.pushagent.utils.a.e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class a extends b {

    /* renamed from: b  reason: collision with root package name */
    private short f24943b;

    /* renamed from: c  reason: collision with root package name */
    private short f24944c = ((short) (com.huawei.android.pushagent.utils.a.a().hashCode() & 255));

    /* renamed from: d  reason: collision with root package name */
    private int f24945d;

    public a(int i) {
        super(c());
        this.f24945d = i;
        this.f24943b = 7;
    }

    private static byte c() {
        return 1;
    }

    public b a(InputStream inputStream) throws IOException {
        try {
            byte[] bArr = new byte[2];
            a(inputStream, bArr);
            this.f24944c = (short) com.huawei.android.pushagent.utils.a.c(bArr);
            byte[] bArr2 = new byte[4];
            a(inputStream, bArr2);
            this.f24945d = com.huawei.android.pushagent.utils.a.b(bArr2);
        } catch (Exception e2) {
            e.c("PushLogAC2815", e2.toString(), e2);
        }
        return this;
    }

    public byte[] b() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(com.huawei.android.pushagent.utils.a.b((int) this.f24943b));
            byteArrayOutputStream.write(a());
            byteArrayOutputStream.write(com.huawei.android.pushagent.utils.a.b((int) this.f24944c));
            byteArrayOutputStream.write(com.huawei.android.pushagent.utils.a.a(this.f24945d));
            e.a("PushLogAC2815", "PollingDataReqMessage encode : baos " + com.huawei.android.pushagent.utils.a.a(byteArrayOutputStream.toByteArray()));
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e2) {
            e.c("PushLogAC2815", e2.toString(), e2);
            return new byte[0];
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(getClass().getSimpleName());
        stringBuffer.append(" mLength:");
        stringBuffer.append(this.f24943b);
        stringBuffer.append(" cmdId:");
        stringBuffer.append(g());
        stringBuffer.append(" mRequestId:");
        stringBuffer.append(this.f24944c);
        stringBuffer.append(" mPollingId:");
        stringBuffer.append(this.f24945d);
        return stringBuffer.toString();
    }
}
