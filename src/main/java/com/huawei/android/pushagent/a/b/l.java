package com.huawei.android.pushagent.a.b;

import com.huawei.android.pushagent.a.b.a.b;
import com.huawei.android.pushagent.utils.a;
import com.huawei.android.pushagent.utils.a.e;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class l extends b {

    /* renamed from: b  reason: collision with root package name */
    private byte f24972b = -1;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f24973c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f24974d;

    /* renamed from: e  reason: collision with root package name */
    private int f24975e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f24976f;
    private int g;
    private byte[] h;

    public l() {
        super(c());
    }

    public static final byte c() {
        return -96;
    }

    public b a(InputStream inputStream) throws Exception {
        this.f24973c = new byte[8];
        a(inputStream, this.f24973c);
        this.f24974d = new byte[32];
        a(inputStream, this.f24974d);
        byte[] bArr = new byte[2];
        a(inputStream, bArr);
        int c2 = a.c(bArr);
        e.a("PushLogAC2815", "push message len=" + c2);
        this.f24975e = c2;
        this.f24976f = new byte[c2];
        a(inputStream, this.f24976f);
        byte[] bArr2 = new byte[2];
        try {
            bArr2[0] = (byte) inputStream.read();
            if (bArr2[0] < 0) {
                e.b("PushLogAC2815", "read first Len:" + bArr2[0] + ", not valid len, may be next cmdId in Old PushDataReqMessage");
                this.f24972b = bArr2[0];
                return this;
            }
            bArr2[1] = (byte) inputStream.read();
            int i = bArr2[0] + bArr2[1];
            e.b("PushLogAC2815", "mPackageNameLen=" + i);
            if (i <= 0) {
                e.b("PushLogAC2815", "the package length:" + i + " is Unavailable ");
                return this;
            }
            this.g = i;
            this.h = new byte[i];
            a(inputStream, this.h);
            return this;
        } catch (Exception e2) {
            e.b("PushLogAC2815", "read msg cause:" + e2.toString() + " may be old PushDataReqMessage");
            return this;
        }
    }

    public byte[] b() {
        byte[] bArr = new byte[0];
        try {
            if (this.f24973c == null) {
                e.d("PushLogAC2815", "encode error, mMsgId = null");
                return bArr;
            } else if (this.f24974d == null) {
                e.d("PushLogAC2815", "encode error, reason mToken = null");
                return bArr;
            } else if (this.f24976f == null) {
                e.d("PushLogAC2815", "encode error, reason mMsgData = null");
                return bArr;
            } else if (this.h == null) {
                e.d("PushLogAC2815", "encode error, reason mPackage = null");
                return bArr;
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byteArrayOutputStream.write(a());
                byteArrayOutputStream.write(this.f24973c);
                byteArrayOutputStream.write(this.f24974d);
                byteArrayOutputStream.write(a.b(this.f24976f.length));
                byteArrayOutputStream.write(this.f24976f);
                byte[] bArr2 = new byte[2];
                if (this.g > 127) {
                    bArr2[0] = Byte.MAX_VALUE;
                    bArr2[1] = (byte) (this.g - 127);
                } else {
                    bArr2[0] = 0;
                    bArr2[1] = (byte) this.g;
                }
                byteArrayOutputStream.write(bArr2);
                byteArrayOutputStream.write(this.h);
                return byteArrayOutputStream.toByteArray();
            }
        } catch (Exception e2) {
            e.a("PushLogAC2815", "encode error," + e2.toString());
            return bArr;
        }
    }

    public byte[] d() {
        return this.f24973c;
    }

    public byte[] e() {
        return this.f24974d;
    }

    public byte[] f() {
        return this.f24976f;
    }

    public int g() {
        return this.g;
    }

    public byte[] h() {
        return this.h;
    }

    public byte i() {
        return this.f24972b;
    }

    public String toString() {
        String str = "null";
        if (this.h != null) {
            try {
                str = new String(this.h, "UTF-8");
            } catch (Exception e2) {
                e.a("PushLogAC2815", e2.toString(), (Throwable) e2);
            }
        }
        StringBuffer stringBuffer = new StringBuffer(getClass().getSimpleName());
        stringBuffer.append(" cmdId:");
        stringBuffer.append(j());
        stringBuffer.append(",msgId:");
        stringBuffer.append(a.a(this.f24973c));
        stringBuffer.append(",deviceToken:");
        stringBuffer.append(a.a(this.f24974d));
        stringBuffer.append(",msgData:");
        stringBuffer.append(a.a(this.f24976f));
        stringBuffer.append(", mPackageLen:");
        stringBuffer.append(this.g);
        stringBuffer.append(", pkgName:");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
