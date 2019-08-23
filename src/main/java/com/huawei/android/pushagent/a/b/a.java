package com.huawei.android.pushagent.a.b;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private String f24953a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f24954b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f24955c;

    public a(String str, byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null) {
            this.f24953a = str;
            this.f24954b = new byte[bArr.length];
            System.arraycopy(bArr, 0, this.f24954b, 0, bArr.length);
            this.f24955c = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, this.f24955c, 0, bArr2.length);
        }
    }

    public String a() {
        return this.f24953a;
    }

    public byte[] b() {
        return this.f24954b;
    }

    public byte[] c() {
        return this.f24955c;
    }
}
