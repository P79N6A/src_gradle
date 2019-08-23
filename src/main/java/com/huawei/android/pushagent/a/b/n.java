package com.huawei.android.pushagent.a.b;

import android.text.TextUtils;
import com.huawei.android.pushagent.a.b.a.b;
import com.huawei.android.pushagent.utils.a;
import com.huawei.android.pushagent.utils.a.e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class n extends b {

    /* renamed from: b  reason: collision with root package name */
    private String f24979b = null;

    /* renamed from: c  reason: collision with root package name */
    private String f24980c = null;

    public n() {
        super(c());
    }

    public n(String str, String str2) {
        super(c());
        this.f24979b = str;
        this.f24980c = str2;
    }

    public static byte c() {
        return -36;
    }

    public b a(InputStream inputStream) throws Exception {
        byte[] bArr = new byte[16];
        a(inputStream, bArr);
        this.f24979b = new String(bArr, "UTF-8");
        byte[] bArr2 = new byte[2];
        a(inputStream, bArr2);
        byte[] bArr3 = new byte[a.c(bArr2)];
        a(inputStream, bArr3);
        this.f24980c = new String(bArr3, "UTF-8");
        return this;
    }

    public byte[] b() {
        byte[] bArr = new byte[0];
        try {
            if (TextUtils.isEmpty(this.f24979b)) {
                e.d("PushLogAC2815", "encode error mDeviceId = " + this.f24979b);
                return bArr;
            } else if (TextUtils.isEmpty(this.f24980c)) {
                e.d("PushLogAC2815", "encode error mPackageName = " + this.f24980c);
                return bArr;
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byteArrayOutputStream.write(a());
                byteArrayOutputStream.write(this.f24979b.getBytes("UTF-8"));
                byteArrayOutputStream.write(a.b(this.f24980c.length()));
                byteArrayOutputStream.write(this.f24980c.getBytes("UTF-8"));
                return byteArrayOutputStream.toByteArray();
            }
        } catch (IOException e2) {
            e.d("PushLogAC2815", "encode error " + e2.toString());
            return bArr;
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("RegisterTokenReqMessage[");
        stringBuffer.append("deviceId:");
        stringBuffer.append(this.f24979b);
        stringBuffer.append(",packageName:");
        stringBuffer.append(this.f24980c);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
