package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.aw;

public class au {

    /* renamed from: a  reason: collision with root package name */
    private static int f82524a = 8;

    /* renamed from: a  reason: collision with other field name */
    private byte[] f951a = new byte[256];

    /* renamed from: b  reason: collision with root package name */
    private int f82525b;

    /* renamed from: c  reason: collision with root package name */
    private int f82526c;

    /* renamed from: d  reason: collision with root package name */
    private int f82527d = -666;

    public static int a(byte b2) {
        return b2 >= 0 ? b2 : b2 + 256;
    }

    private void a() {
        this.f82526c = 0;
        this.f82525b = 0;
    }

    private void a(int i, byte[] bArr, boolean z) {
        int length = bArr.length;
        for (int i2 = 0; i2 < 256; i2++) {
            this.f951a[i2] = (byte) i2;
        }
        this.f82526c = 0;
        this.f82525b = 0;
        while (this.f82525b < i) {
            this.f82526c = ((this.f82526c + a(this.f951a[this.f82525b])) + a(bArr[this.f82525b % length])) % 256;
            a(this.f951a, this.f82525b, this.f82526c);
            this.f82525b++;
        }
        if (i != 256) {
            this.f82527d = ((this.f82526c + a(this.f951a[i])) + a(bArr[i % length])) % 256;
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("S_");
            int i3 = i - 1;
            sb.append(i3);
            sb.append(":");
            for (int i4 = 0; i4 <= i; i4++) {
                sb.append(" ");
                sb.append(a(this.f951a[i4]));
            }
            sb.append("   j_");
            sb.append(i3);
            sb.append("=");
            sb.append(this.f82526c);
            sb.append("   j_");
            sb.append(i);
            sb.append("=");
            sb.append(this.f82527d);
            sb.append("   S_");
            sb.append(i3);
            sb.append("[j_");
            sb.append(i3);
            sb.append("]=");
            sb.append(a(this.f951a[this.f82526c]));
            sb.append("   S_");
            sb.append(i3);
            sb.append("[j_");
            sb.append(i);
            sb.append("]=");
            sb.append(a(this.f951a[this.f82527d]));
            if (this.f951a[1] != 0) {
                sb.append("   S[1]!=0");
            }
            b.a(sb.toString());
        }
    }

    private void a(byte[] bArr) {
        a(256, bArr, false);
    }

    private static void a(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i];
        bArr[i] = bArr[i2];
        bArr[i2] = b2;
    }

    public static byte[] a(String str, String str2) {
        byte[] a2 = aw.a(str);
        byte[] bytes = str2.getBytes();
        byte[] bArr = new byte[(a2.length + 1 + bytes.length)];
        for (int i = 0; i < a2.length; i++) {
            bArr[i] = a2[i];
        }
        bArr[a2.length] = 95;
        for (int i2 = 0; i2 < bytes.length; i2++) {
            bArr[a2.length + 1 + i2] = bytes[i2];
        }
        return bArr;
    }

    public static byte[] a(byte[] bArr, String str) {
        return a(bArr, aw.a(str));
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr2.length];
        au auVar = new au();
        auVar.a(bArr);
        auVar.a();
        for (int i = 0; i < bArr2.length; i++) {
            bArr3[i] = (byte) (bArr2[i] ^ auVar.a());
        }
        return bArr3;
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, boolean z, int i, int i2) {
        byte[] bArr3;
        int i3;
        if (i < 0 || i > bArr2.length || i + i2 > bArr2.length) {
            throw new IllegalArgumentException("start = " + i + " len = " + i2);
        }
        if (!z) {
            bArr3 = new byte[i2];
            i3 = 0;
        } else {
            bArr3 = bArr2;
            i3 = i;
        }
        au auVar = new au();
        auVar.a(bArr);
        auVar.a();
        for (int i4 = 0; i4 < i2; i4++) {
            bArr3[i3 + i4] = (byte) (bArr2[i + i4] ^ auVar.a());
        }
        return bArr3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: collision with other method in class */
    public byte m614a() {
        this.f82525b = (this.f82525b + 1) % 256;
        this.f82526c = (this.f82526c + a(this.f951a[this.f82525b])) % 256;
        a(this.f951a, this.f82525b, this.f82526c);
        return this.f951a[(a(this.f951a[this.f82525b]) + a(this.f951a[this.f82526c])) % 256];
    }
}
