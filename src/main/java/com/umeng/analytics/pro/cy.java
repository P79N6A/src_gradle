package com.umeng.analytics.pro;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

public class cy extends df {
    private static final dk h = new dk();

    /* renamed from: c  reason: collision with root package name */
    protected boolean f80601c;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f80602d;

    /* renamed from: e  reason: collision with root package name */
    protected int f80603e;

    /* renamed from: f  reason: collision with root package name */
    protected boolean f80604f;
    private byte[] i;
    private byte[] j;
    private byte[] k;
    private byte[] l;
    private byte[] m;
    private byte[] n;
    private byte[] o;
    private byte[] p;

    public static class a implements dh {

        /* renamed from: a  reason: collision with root package name */
        protected boolean f80605a;

        /* renamed from: b  reason: collision with root package name */
        protected boolean f80606b;

        /* renamed from: c  reason: collision with root package name */
        protected int f80607c;

        public a() {
            this(false, true);
        }

        public df a(dt dtVar) {
            cy cyVar = new cy(dtVar, this.f80605a, this.f80606b);
            if (this.f80607c != 0) {
                cyVar.c(this.f80607c);
            }
            return cyVar;
        }

        public a(boolean z, boolean z2) {
            this(z, z2, 0);
        }

        public a(boolean z, boolean z2, int i) {
            this.f80606b = true;
            this.f80605a = z;
            this.f80606b = z2;
            this.f80607c = i;
        }
    }

    public void a() {
    }

    public void a(dk dkVar) {
    }

    public void b() {
    }

    public void c() {
    }

    public void e() {
    }

    public void f() {
    }

    public void g() {
    }

    public void i() {
    }

    public void k() {
    }

    public void m() {
    }

    public void o() {
    }

    public void q() {
    }

    public void s() {
    }

    public dk j() {
        return h;
    }

    public void a(boolean z) throws cm {
        a(z ? (byte) 1 : 0);
    }

    public void a(short s) throws cm {
        this.j[0] = (byte) ((s >> 8) & 255);
        this.j[1] = (byte) (s & 255);
        this.g.b(this.j, 0, 2);
    }

    public void a(String str) throws cm {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            a(bytes.length);
            this.g.b(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new cm("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    public void a(ByteBuffer byteBuffer) throws cm {
        int limit = byteBuffer.limit() - byteBuffer.position();
        a(limit);
        this.g.b(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), limit);
    }

    public void d() throws cm {
        a((byte) 0);
    }

    public db p() throws cm {
        return new db(u(), w());
    }

    public dj r() throws cm {
        return new dj(u(), w());
    }

    public boolean t() throws cm {
        if (u() == 1) {
            return true;
        }
        return false;
    }

    public double y() throws cm {
        return Double.longBitsToDouble(x());
    }

    public da l() throws cm {
        short s;
        byte u = u();
        if (u == 0) {
            s = 0;
        } else {
            s = v();
        }
        return new da("", u, s);
    }

    public dc n() throws cm {
        return new dc(u(), u(), w());
    }

    public ByteBuffer A() throws cm {
        int w = w();
        d(w);
        if (this.g.h() >= w) {
            ByteBuffer wrap = ByteBuffer.wrap(this.g.f(), this.g.g(), w);
            this.g.a(w);
            return wrap;
        }
        byte[] bArr = new byte[w];
        this.g.d(bArr, 0, w);
        return ByteBuffer.wrap(bArr);
    }

    public byte u() throws cm {
        if (this.g.h() > 0) {
            byte b2 = this.g.f()[this.g.g()];
            this.g.a(1);
            return b2;
        }
        a(this.m, 0, 1);
        return this.m[0];
    }

    public short v() throws cm {
        byte[] bArr = this.n;
        int i2 = 0;
        if (this.g.h() >= 2) {
            bArr = this.g.f();
            i2 = this.g.g();
            this.g.a(2);
        } else {
            a(this.n, 0, 2);
        }
        return (short) ((bArr[i2 + 1] & 255) | ((bArr[i2] & 255) << 8));
    }

    public String z() throws cm {
        int w = w();
        if (this.g.h() < w) {
            return b(w);
        }
        try {
            String str = new String(this.g.f(), this.g.g(), w, "UTF-8");
            this.g.a(w);
            return str;
        } catch (UnsupportedEncodingException unused) {
            throw new cm("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    public dd h() throws cm {
        int w = w();
        if (w < 0) {
            if ((-65536 & w) == -2147418112) {
                return new dd(z(), (byte) (w & 255), w());
            }
            throw new dg(4, "Bad version in readMessageBegin");
        } else if (!this.f80601c) {
            return new dd(b(w), u(), w());
        } else {
            throw new dg(4, "Missing version in readMessageBegin, old client?");
        }
    }

    public int w() throws cm {
        byte[] bArr = this.o;
        int i2 = 0;
        if (this.g.h() >= 4) {
            bArr = this.g.f();
            i2 = this.g.g();
            this.g.a(4);
        } else {
            a(this.o, 0, 4);
        }
        return (bArr[i2 + 3] & 255) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
    }

    public long x() throws cm {
        byte[] bArr = this.p;
        int i2 = 0;
        if (this.g.h() >= 8) {
            bArr = this.g.f();
            i2 = this.g.g();
            this.g.a(8);
        } else {
            a(this.p, 0, 8);
        }
        return ((long) (bArr[i2 + 7] & 255)) | (((long) (bArr[i2] & 255)) << 56) | (((long) (bArr[i2 + 1] & 255)) << 48) | (((long) (bArr[i2 + 2] & 255)) << 40) | (((long) (bArr[i2 + 3] & 255)) << 32) | (((long) (bArr[i2 + 4] & 255)) << 24) | (((long) (bArr[i2 + 5] & 255)) << 16) | (((long) (bArr[i2 + 6] & 255)) << 8);
    }

    public cy(dt dtVar) {
        this(dtVar, false, true);
    }

    public void a(double d2) throws cm {
        a(Double.doubleToLongBits(d2));
    }

    public void c(int i2) {
        this.f80603e = i2;
        this.f80604f = true;
    }

    public void a(byte b2) throws cm {
        this.i[0] = b2;
        this.g.b(this.i, 0, 1);
    }

    public String b(int i2) throws cm {
        try {
            d(i2);
            byte[] bArr = new byte[i2];
            this.g.d(bArr, 0, i2);
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new cm("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    public void a(int i2) throws cm {
        this.k[0] = (byte) ((i2 >> 24) & 255);
        this.k[1] = (byte) ((i2 >> 16) & 255);
        this.k[2] = (byte) ((i2 >> 8) & 255);
        this.k[3] = (byte) (i2 & 255);
        this.g.b(this.k, 0, 4);
    }

    /* access modifiers changed from: protected */
    public void d(int i2) throws cm {
        if (i2 < 0) {
            throw new dg("Negative length: " + i2);
        } else if (this.f80604f) {
            this.f80603e -= i2;
            if (this.f80603e < 0) {
                throw new dg("Message length exceeded: " + i2);
            }
        }
    }

    public void a(long j2) throws cm {
        this.l[0] = (byte) ((int) ((j2 >> 56) & 255));
        this.l[1] = (byte) ((int) ((j2 >> 48) & 255));
        this.l[2] = (byte) ((int) ((j2 >> 40) & 255));
        this.l[3] = (byte) ((int) ((j2 >> 32) & 255));
        this.l[4] = (byte) ((int) ((j2 >> 24) & 255));
        this.l[5] = (byte) ((int) ((j2 >> 16) & 255));
        this.l[6] = (byte) ((int) ((j2 >> 8) & 255));
        this.l[7] = (byte) ((int) (j2 & 255));
        this.g.b(this.l, 0, 8);
    }

    public void a(da daVar) throws cm {
        a(daVar.f80616b);
        a(daVar.f80617c);
    }

    public void a(db dbVar) throws cm {
        a(dbVar.f80618a);
        a(dbVar.f80619b);
    }

    public void a(dc dcVar) throws cm {
        a(dcVar.f80620a);
        a(dcVar.f80621b);
        a(dcVar.f80622c);
    }

    public void a(dd ddVar) throws cm {
        if (this.f80602d) {
            a((int) -2147418112 | ddVar.f80624b);
            a(ddVar.f80623a);
            a(ddVar.f80625c);
            return;
        }
        a(ddVar.f80623a);
        a(ddVar.f80624b);
        a(ddVar.f80625c);
    }

    public void a(dj djVar) throws cm {
        a(djVar.f80627a);
        a(djVar.f80628b);
    }

    private int a(byte[] bArr, int i2, int i3) throws cm {
        d(i3);
        return this.g.d(bArr, i2, i3);
    }

    public cy(dt dtVar, boolean z, boolean z2) {
        super(dtVar);
        this.f80602d = true;
        this.i = new byte[1];
        this.j = new byte[2];
        this.k = new byte[4];
        this.l = new byte[8];
        this.m = new byte[1];
        this.n = new byte[2];
        this.o = new byte[4];
        this.p = new byte[8];
        this.f80601c = z;
        this.f80602d = z2;
    }
}
