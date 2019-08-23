package com.huawei.android.pushagent.a.b;

import android.text.TextUtils;
import com.huawei.android.pushagent.a.b.a.b;
import com.huawei.android.pushagent.utils.a;
import com.huawei.android.pushagent.utils.a.e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class h extends b {

    /* renamed from: b  reason: collision with root package name */
    private String f24965b = null;

    /* renamed from: c  reason: collision with root package name */
    private byte f24966c = -1;

    /* renamed from: d  reason: collision with root package name */
    private int f24967d;

    /* renamed from: e  reason: collision with root package name */
    private long f24968e;

    /* renamed from: f  reason: collision with root package name */
    private long f24969f;
    private long g;
    private int h;
    private g[] i;

    public h() {
        super(c());
    }

    public h(String str, byte b2, int i2, long j, long j2, long j3, int i3, g[] gVarArr) {
        super(c());
        this.f24965b = str;
        this.f24966c = b2;
        this.f24967d = i2;
        this.f24968e = j;
        this.f24969f = j2;
        this.g = j3;
        this.h = i3;
        if (gVarArr != null && gVarArr.length > 0) {
            this.i = new g[gVarArr.length];
            System.arraycopy(gVarArr, 0, this.i, 0, gVarArr.length);
        }
    }

    public static byte c() {
        return -34;
    }

    public b a(InputStream inputStream) throws Exception {
        byte[] bArr = new byte[16];
        a(inputStream, bArr);
        this.f24965b = new String(bArr, "UTF-8");
        byte[] bArr2 = new byte[1];
        a(inputStream, bArr2);
        this.f24966c = bArr2[0];
        byte[] bArr3 = new byte[2];
        a(inputStream, bArr3);
        this.f24967d = a.c(bArr3);
        byte[] bArr4 = new byte[8];
        a(inputStream, bArr4);
        this.f24968e = a.d(bArr4);
        byte[] bArr5 = new byte[8];
        a(inputStream, bArr5);
        this.f24969f = a.d(bArr5);
        byte[] bArr6 = new byte[8];
        a(inputStream, bArr6);
        this.g = a.d(bArr6);
        byte[] bArr7 = new byte[1];
        a(inputStream, bArr7);
        this.h = a.c(bArr7);
        int i2 = this.h & 127;
        if (i2 > 0) {
            this.i = new g[i2];
            for (g gVar : this.i) {
                byte[] bArr8 = new byte[8];
                a(inputStream, bArr8);
                gVar.a(a.d(bArr8));
                byte[] bArr9 = new byte[1];
                a(inputStream, bArr9);
                gVar.a(bArr9[0]);
                byte[] bArr10 = new byte[1];
                a(inputStream, bArr10);
                gVar.b(bArr10[0]);
            }
        }
        return this;
    }

    public byte[] b() {
        if (TextUtils.isEmpty(this.f24965b)) {
            e.d("PushLogAC2815", "encode error, reason mDeviceId = " + this.f24965b);
        } else {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byteArrayOutputStream.write(a());
                byteArrayOutputStream.write(this.f24965b.getBytes("UTF-8"));
                byteArrayOutputStream.write(this.f24966c);
                byteArrayOutputStream.write(a.b(this.f24967d));
                byteArrayOutputStream.write(a.a(this.f24968e));
                byteArrayOutputStream.write(a.a(this.f24969f));
                byteArrayOutputStream.write(a.a(this.g));
                byteArrayOutputStream.write((byte) this.h);
                if (this.i != null && this.i.length > 0) {
                    for (g gVar : this.i) {
                        byteArrayOutputStream.write(a.a(gVar.a()));
                        byteArrayOutputStream.write(gVar.b());
                        byteArrayOutputStream.write(gVar.c());
                    }
                }
                return byteArrayOutputStream.toByteArray();
            } catch (IOException e2) {
                e.d("PushLogAC2815", "encode error " + e2.toString());
            }
        }
        return new byte[0];
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(getClass().getSimpleName());
        stringBuffer.append(" cmdId:");
        stringBuffer.append(j());
        stringBuffer.append(" mDeviceId:");
        stringBuffer.append(this.f24965b);
        stringBuffer.append(" mNetworkType:");
        stringBuffer.append(this.f24966c);
        stringBuffer.append(" mAgentVersion:");
        stringBuffer.append(this.f24967d);
        stringBuffer.append(" mLastDisconnectTime:");
        stringBuffer.append(a.a(this.f24968e, "yyyy-MM-dd HH:mm:ss SSS"));
        stringBuffer.append(" mCurrentConnectTime:");
        stringBuffer.append(a.a(this.f24969f, "yyyy-MM-dd HH:mm:ss SSS"));
        stringBuffer.append(" mCurrentTime:");
        stringBuffer.append(a.a(this.g, "yyyy-MM-dd HH:mm:ss SSS"));
        stringBuffer.append(" mNetEventAccount:");
        stringBuffer.append(this.h);
        if (this.i != null && this.i.length > 0) {
            for (g append : this.i) {
                stringBuffer.append(append);
            }
        }
        return stringBuffer.toString();
    }
}
