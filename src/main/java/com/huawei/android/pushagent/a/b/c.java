package com.huawei.android.pushagent.a.b;

import android.text.TextUtils;
import com.huawei.android.pushagent.a.b.a.b;
import com.huawei.android.pushagent.utils.a.e;
import java.io.InputStream;

public class c extends b {

    /* renamed from: b  reason: collision with root package name */
    private String f24959b = null;

    /* renamed from: c  reason: collision with root package name */
    private byte f24960c = -1;

    public c() {
        super(c());
    }

    public static byte c() {
        return -46;
    }

    public b a(InputStream inputStream) throws Exception {
        byte[] bArr = new byte[16];
        a(inputStream, bArr);
        this.f24959b = new String(bArr, "UTF-8");
        byte[] bArr2 = new byte[1];
        a(inputStream, bArr2);
        this.f24960c = bArr2[0];
        return this;
    }

    public byte[] b() {
        byte[] bArr;
        byte[] bArr2 = new byte[0];
        if (TextUtils.isEmpty(this.f24959b)) {
            e.d("PushLogAC2815", "encode error, reason mDeviceId = " + this.f24959b);
            return bArr2;
        }
        try {
            byte[] bytes = this.f24959b.getBytes("UTF-8");
            bArr = new byte[(bytes.length + 1 + 1)];
            try {
                bArr[0] = a();
                System.arraycopy(bytes, 0, bArr, 1, bytes.length);
                bArr[bArr.length - 1] = this.f24960c;
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            bArr = bArr2;
            e.a("PushLogAC2815", e.toString(), (Throwable) e);
            return bArr;
        }
        return bArr;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(getClass().getSimpleName());
        stringBuffer.append(" cmdId:");
        stringBuffer.append(j());
        stringBuffer.append(" mDeviceId:");
        stringBuffer.append(this.f24959b);
        stringBuffer.append(" mNetworkType:");
        stringBuffer.append(this.f24960c);
        return stringBuffer.toString();
    }
}
