package com.huawei.android.pushagent.a.b;

import android.text.TextUtils;
import com.huawei.android.pushagent.a.b.a.b;
import com.huawei.android.pushagent.utils.a.e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class p extends b {

    /* renamed from: b  reason: collision with root package name */
    private String f24984b = null;

    public p() {
        super(c());
    }

    public p(String str) {
        super(c());
        a(str);
    }

    public static byte c() {
        return -42;
    }

    public b a(InputStream inputStream) throws Exception {
        byte[] bArr = new byte[32];
        a(inputStream, bArr);
        this.f24984b = new String(bArr, "UTF-8");
        return this;
    }

    public void a(String str) {
        this.f24984b = str;
    }

    public byte[] b() {
        byte[] bArr = new byte[0];
        try {
            if (TextUtils.isEmpty(this.f24984b)) {
                e.d("PushLogAC2815", "encode error reason mToken is empty");
                return bArr;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(a());
            byteArrayOutputStream.write(d().getBytes("UTF-8"));
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            e.d("PushLogAC2815", "encode error " + e2.toString());
            return bArr;
        }
    }

    public String d() {
        return this.f24984b;
    }

    public String toString() {
        return "UnRegisterReqMessage[token:" + this.f24984b + "]";
    }
}
