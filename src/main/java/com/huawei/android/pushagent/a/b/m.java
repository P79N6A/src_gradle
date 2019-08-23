package com.huawei.android.pushagent.a.b;

import com.huawei.android.pushagent.a.b.a.b;
import com.huawei.android.pushagent.utils.a;
import com.huawei.android.pushagent.utils.a.e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class m extends b {

    /* renamed from: b  reason: collision with root package name */
    private byte[] f24977b;

    /* renamed from: c  reason: collision with root package name */
    private byte f24978c;

    public m() {
        super(c());
    }

    public m(byte[] bArr, byte b2) {
        this();
        this.f24977b = new byte[bArr.length];
        System.arraycopy(bArr, 0, this.f24977b, 0, bArr.length);
        this.f24978c = b2;
    }

    public static byte c() {
        return -95;
    }

    public b a(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[8];
        a(inputStream, bArr);
        this.f24977b = bArr;
        byte[] bArr2 = new byte[1];
        a(inputStream, bArr2);
        this.f24978c = bArr2[0];
        return this;
    }

    public byte[] b() {
        byte[] bArr = new byte[0];
        if (this.f24977b == null) {
            e.d("PushLogAC2815", "encode error, mMsgId is null ");
            return bArr;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(a());
            byteArrayOutputStream.write(this.f24977b);
            byteArrayOutputStream.write(this.f24978c);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            e.d("PushLogAC2815", "encode error " + e2.toString());
            return bArr;
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(getClass().getSimpleName());
        stringBuffer.append(",cmdId:");
        stringBuffer.append(j());
        stringBuffer.append(",msgId:");
        stringBuffer.append(a.a(this.f24977b));
        stringBuffer.append(",flag:");
        stringBuffer.append(this.f24978c);
        return stringBuffer.toString();
    }
}
