package com.tencent.bugly.proguard;

public final class aj extends k implements Cloneable {

    /* renamed from: d  reason: collision with root package name */
    private static byte[] f79414d;

    /* renamed from: a  reason: collision with root package name */
    private byte f79415a;

    /* renamed from: b  reason: collision with root package name */
    private String f79416b = "";

    /* renamed from: c  reason: collision with root package name */
    private byte[] f79417c;

    public final void a(StringBuilder sb, int i) {
    }

    public aj() {
    }

    public final void a(j jVar) {
        jVar.a(this.f79415a, 0);
        jVar.a(this.f79416b, 1);
        if (this.f79417c != null) {
            jVar.a(this.f79417c, 2);
        }
    }

    public final void a(i iVar) {
        this.f79415a = iVar.a(this.f79415a, 0, true);
        this.f79416b = iVar.b(1, true);
        if (f79414d == null) {
            byte[] bArr = new byte[1];
            f79414d = bArr;
            bArr[0] = 0;
        }
        this.f79417c = iVar.c(2, false);
    }

    public aj(byte b2, String str, byte[] bArr) {
        this.f79415a = b2;
        this.f79416b = str;
        this.f79417c = bArr;
    }
}
