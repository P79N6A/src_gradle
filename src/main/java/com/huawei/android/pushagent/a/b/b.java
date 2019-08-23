package com.huawei.android.pushagent.a.b;

import com.huawei.android.pushagent.utils.a;
import com.huawei.android.pushagent.utils.a.e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONObject;

public class b extends com.huawei.android.pushagent.a.b.a.b {

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f24958b = new JSONObject();

    public b() {
    }

    public b(byte b2) {
        super(b2);
    }

    public com.huawei.android.pushagent.a.b.a.b a(InputStream inputStream) throws Exception {
        byte[] bArr = new byte[2];
        a(inputStream, bArr);
        int c2 = a.c(bArr);
        e.a("PushLogAC2815", "push message len=" + c2);
        byte[] bArr2 = new byte[c2];
        a(inputStream, bArr2);
        String str = new String(bArr2, "UTF-8");
        e.a("PushLogAC2815", "push message data :" + str);
        this.f24958b = new JSONObject(str);
        return this;
    }

    public byte[] b() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(a());
            if (this.f24958b.length() == 0) {
                byteArrayOutputStream.write(a.b(0));
            } else {
                byte[] bytes = this.f24958b.toString().getBytes("UTF-8");
                byteArrayOutputStream.write(a.b(bytes.length));
                byteArrayOutputStream.write(bytes);
                e.a("PushLogAC2815", " begin to send:" + this.f24958b);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            e.a("PushLogAC2815", "encode error," + e2.toString());
            return new byte[0];
        }
    }

    public JSONObject c() {
        return this.f24958b;
    }

    public String toString() {
        return this.f24958b.toString();
    }
}
