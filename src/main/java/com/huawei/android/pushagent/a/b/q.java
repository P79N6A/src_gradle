package com.huawei.android.pushagent.a.b;

import android.text.TextUtils;
import com.huawei.android.pushagent.a.b.a.b;
import com.huawei.android.pushagent.utils.a.e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class q extends b {

    /* renamed from: b  reason: collision with root package name */
    private String f24985b = null;

    /* renamed from: c  reason: collision with root package name */
    private byte f24986c = 1;

    public q() {
        super(c());
    }

    public static byte c() {
        return -41;
    }

    public b a(InputStream inputStream) throws Exception {
        byte[] bArr = new byte[32];
        a(inputStream, bArr);
        this.f24985b = new String(bArr, "UTF-8");
        byte[] bArr2 = new byte[1];
        a(inputStream, bArr2);
        this.f24986c = bArr2[0];
        return this;
    }

    public byte[] b() {
        byte[] bArr = new byte[0];
        try {
            if (TextUtils.isEmpty(this.f24985b)) {
                e.d("PushLogAC2815", "encode error, mToken = " + this.f24985b);
                return bArr;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(a());
            byteArrayOutputStream.write(this.f24985b.getBytes("UTF-8"));
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            e.d("PushLogAC2815", "encode error " + e2.toString());
            return bArr;
        }
    }

    public String d() {
        return this.f24985b;
    }

    public String toString() {
        return "UnRegisterRspMessage[token:" + this.f24985b + " result:" + this.f24986c + "]";
    }
}
