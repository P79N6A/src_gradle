package com.tencent.wxop.stat.a;

public final class m extends k {
    static final /* synthetic */ boolean j = (!j.class.desiredAssertionStatus());
    private static final byte[] k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] l = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* renamed from: c  reason: collision with root package name */
    final byte[] f79814c;

    /* renamed from: d  reason: collision with root package name */
    int f79815d;

    /* renamed from: e  reason: collision with root package name */
    int f79816e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f79817f;
    public final boolean g;
    public final boolean h;
    final byte[] i;

    public m(int i2, byte[] bArr) {
        this.f79808a = null;
        boolean z = true;
        this.f79817f = (i2 & 1) == 0;
        this.g = (i2 & 2) == 0;
        this.h = (i2 & 4) == 0 ? false : z;
        this.i = (i2 & 8) == 0 ? k : l;
        this.f79814c = new byte[2];
        this.f79815d = 0;
        this.f79816e = this.g ? 19 : -1;
    }
}
