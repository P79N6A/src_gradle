package com.xiaomi.push;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

public class kc extends kg {

    /* renamed from: a  reason: collision with root package name */
    private static final kl f82414a = new kl();

    /* renamed from: a  reason: collision with other field name */
    protected int f864a;

    /* renamed from: a  reason: collision with other field name */
    protected boolean f865a;

    /* renamed from: a  reason: collision with other field name */
    private byte[] f866a = new byte[1];

    /* renamed from: b  reason: collision with root package name */
    protected boolean f82415b = true;

    /* renamed from: b  reason: collision with other field name */
    private byte[] f867b = new byte[2];

    /* renamed from: c  reason: collision with root package name */
    protected boolean f82416c;

    /* renamed from: c  reason: collision with other field name */
    private byte[] f868c = new byte[4];

    /* renamed from: d  reason: collision with root package name */
    private byte[] f82417d = new byte[8];

    /* renamed from: e  reason: collision with root package name */
    private byte[] f82418e = new byte[1];

    /* renamed from: f  reason: collision with root package name */
    private byte[] f82419f = new byte[2];
    private byte[] g = new byte[4];
    private byte[] h = new byte[8];

    public static class a implements ki {

        /* renamed from: a  reason: collision with root package name */
        protected int f82420a;

        /* renamed from: a  reason: collision with other field name */
        protected boolean f869a;

        /* renamed from: b  reason: collision with root package name */
        protected boolean f82421b;

        public a() {
            this(false, true);
        }

        public a(boolean z, boolean z2) {
            this(z, z2, 0);
        }

        public a(boolean z, boolean z2, int i) {
            this.f82421b = true;
            this.f869a = z;
            this.f82421b = z2;
            this.f82420a = i;
        }

        public kg a(kq kqVar) {
            kc kcVar = new kc(kqVar, this.f869a, this.f82421b);
            if (this.f82420a != 0) {
                kcVar.b(this.f82420a);
            }
            return kcVar;
        }
    }

    public kc(kq kqVar, boolean z, boolean z2) {
        super(kqVar);
        this.f865a = z;
        this.f82415b = z2;
    }

    private int a(byte[] bArr, int i, int i2) {
        c(i2);
        return this.f82426a.b(bArr, i, i2);
    }

    public byte a() {
        if (this.f82426a.b() > 0) {
            byte b2 = this.f82426a.a()[this.f82426a.a()];
            this.f82426a.a(1);
            return b2;
        }
        a(this.f82418e, 0, 1);
        return this.f82418e[0];
    }

    /* renamed from: a  reason: collision with other method in class */
    public double m529a() {
        return Double.longBitsToDouble(a());
    }

    /* renamed from: a  reason: collision with other method in class */
    public int m530a() {
        byte[] bArr = this.g;
        int i = 0;
        if (this.f82426a.b() >= 4) {
            bArr = this.f82426a.a();
            i = this.f82426a.a();
            this.f82426a.a(4);
        } else {
            a(this.g, 0, 4);
        }
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: a  reason: collision with other method in class */
    public long m531a() {
        byte[] bArr = this.h;
        int i = 0;
        if (this.f82426a.b() >= 8) {
            bArr = this.f82426a.a();
            i = this.f82426a.a();
            this.f82426a.a(8);
        } else {
            a(this.h, 0, 8);
        }
        long j = (long) (bArr[i] & 255);
        long j2 = (long) (bArr[i + 1] & 255);
        long j3 = (long) (bArr[i + 2] & 255);
        long j4 = (long) (bArr[i + 3] & 255);
        long j5 = (long) (bArr[i + 4] & 255);
        long j6 = (long) (bArr[i + 5] & 255);
        long j7 = j2 << 48;
        return ((long) (bArr[i + 7] & 255)) | (((long) (bArr[i + 6] & 255)) << 8) | j7 | (j << 56) | (j3 << 40) | (j4 << 32) | (j5 << 24) | (j6 << 16);
    }

    /* renamed from: a  reason: collision with other method in class */
    public kd m532a() {
        byte a2 = a();
        return new kd("", a2, a2 == 0 ? 0 : a());
    }

    /* renamed from: a  reason: collision with other method in class */
    public ke m533a() {
        return new ke(a(), a());
    }

    /* renamed from: a  reason: collision with other method in class */
    public kf m534a() {
        return new kf(a(), a(), a());
    }

    /* renamed from: a  reason: collision with other method in class */
    public kk m535a() {
        return new kk(a(), a());
    }

    /* renamed from: a  reason: collision with other method in class */
    public kl m536a() {
        return f82414a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m537a() {
        int a2 = a();
        if (this.f82426a.b() < a2) {
            return a(a2);
        }
        try {
            String str = new String(this.f82426a.a(), this.f82426a.a(), a2, "UTF-8");
            this.f82426a.a(a2);
            return str;
        } catch (UnsupportedEncodingException unused) {
            throw new ka("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    public String a(int i) {
        try {
            c(i);
            byte[] bArr = new byte[i];
            this.f82426a.b(bArr, 0, i);
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new ka("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public ByteBuffer m538a() {
        int a2 = a();
        c(a2);
        if (this.f82426a.b() >= a2) {
            ByteBuffer wrap = ByteBuffer.wrap(this.f82426a.a(), this.f82426a.a(), a2);
            this.f82426a.a(a2);
            return wrap;
        }
        byte[] bArr = new byte[a2];
        this.f82426a.b(bArr, 0, a2);
        return ByteBuffer.wrap(bArr);
    }

    /* renamed from: a  reason: collision with other method in class */
    public short m539a() {
        byte[] bArr = this.f82419f;
        int i = 0;
        if (this.f82426a.b() >= 2) {
            bArr = this.f82426a.a();
            i = this.f82426a.a();
            this.f82426a.a(2);
        } else {
            a(this.f82419f, 0, 2);
        }
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m540a() {
    }

    public void a(byte b2) {
        this.f866a[0] = b2;
        this.f82426a.a(this.f866a, 0, 1);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m541a(int i) {
        this.f868c[0] = (byte) ((i >> 24) & 255);
        this.f868c[1] = (byte) ((i >> 16) & 255);
        this.f868c[2] = (byte) ((i >> 8) & 255);
        this.f868c[3] = (byte) (i & 255);
        this.f82426a.a(this.f868c, 0, 4);
    }

    public void a(long j) {
        this.f82417d[0] = (byte) ((int) ((j >> 56) & 255));
        this.f82417d[1] = (byte) ((int) ((j >> 48) & 255));
        this.f82417d[2] = (byte) ((int) ((j >> 40) & 255));
        this.f82417d[3] = (byte) ((int) ((j >> 32) & 255));
        this.f82417d[4] = (byte) ((int) ((j >> 24) & 255));
        this.f82417d[5] = (byte) ((int) ((j >> 16) & 255));
        this.f82417d[6] = (byte) ((int) ((j >> 8) & 255));
        this.f82417d[7] = (byte) ((int) (j & 255));
        this.f82426a.a(this.f82417d, 0, 8);
    }

    public void a(kd kdVar) {
        a(kdVar.f82422a);
        a(kdVar.f871a);
    }

    public void a(ke keVar) {
        a(keVar.f82423a);
        a(keVar.f872a);
    }

    public void a(kf kfVar) {
        a(kfVar.f82424a);
        a(kfVar.f82425b);
        a(kfVar.f873a);
    }

    public void a(kl klVar) {
    }

    public void a(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            a(bytes.length);
            this.f82426a.a(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new ka("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    public void a(ByteBuffer byteBuffer) {
        int limit = (byteBuffer.limit() - byteBuffer.position()) - byteBuffer.arrayOffset();
        a(limit);
        this.f82426a.a(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), limit);
    }

    public void a(short s) {
        this.f867b[0] = (byte) ((s >> 8) & 255);
        this.f867b[1] = (byte) (s & 255);
        this.f82426a.a(this.f867b, 0, 2);
    }

    public void a(boolean z) {
        a(z ? (byte) 1 : 0);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m542a() {
        return a() == 1;
    }

    public void b() {
    }

    public void b(int i) {
        this.f864a = i;
        this.f82416c = true;
    }

    public void c() {
        a((byte) 0);
    }

    /* access modifiers changed from: protected */
    public void c(int i) {
        if (i < 0) {
            throw new ka("Negative length: " + i);
        } else if (this.f82416c) {
            this.f864a -= i;
            if (this.f864a < 0) {
                throw new ka("Message length exceeded: " + i);
            }
        }
    }

    public void d() {
    }

    public void e() {
    }

    public void f() {
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }

    public void j() {
    }
}
