package com.umeng.commonsdk.proguard;

import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

public class ac extends ai {

    /* renamed from: d  reason: collision with root package name */
    private static final an f80805d = new an("");

    /* renamed from: e  reason: collision with root package name */
    private static final ad f80806e = new ad("", (byte) 0, 0);

    /* renamed from: f  reason: collision with root package name */
    private static final byte[] f80807f;

    /* renamed from: a  reason: collision with root package name */
    byte[] f80808a;

    /* renamed from: b  reason: collision with root package name */
    byte[] f80809b;

    /* renamed from: c  reason: collision with root package name */
    byte[] f80810c;
    private h m;
    private short n;
    private ad o;
    private Boolean p;
    private final long q;
    private byte[] r;

    public static class a implements ak {

        /* renamed from: a  reason: collision with root package name */
        private final long f80811a;

        public a() {
            this.f80811a = -1;
        }

        public ai a(aw awVar) {
            return new ac(awVar, this.f80811a);
        }

        public a(int i) {
            this.f80811a = (long) i;
        }
    }

    static class b {
        private b() {
        }
    }

    private int c(int i) {
        return (i >> 31) ^ (i << 1);
    }

    private long c(long j) {
        return (j >> 63) ^ (j << 1);
    }

    private boolean c(byte b2) {
        byte b3 = b2 & 15;
        return b3 == 1 || b3 == 2;
    }

    private long d(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    private int g(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public void a() throws p {
    }

    public void c() throws p {
    }

    public void e() throws p {
    }

    public void f() throws p {
    }

    public void g() throws p {
    }

    public void i() throws p {
    }

    public void m() throws p {
    }

    public void o() throws p {
    }

    public void q() throws p {
    }

    public void s() throws p {
    }

    public void a(ag agVar) throws p {
        b((byte) -126);
        d(((agVar.f80821b << 5) & -32) | 1);
        b(agVar.f80822c);
        a(agVar.f80820a);
    }

    public void a(an anVar) throws p {
        this.m.a(this.n);
        this.n = 0;
    }

    public void a(af afVar) throws p {
        if (afVar.f80819c == 0) {
            d(0);
            return;
        }
        b(afVar.f80819c);
        d((int) e(afVar.f80818b) | (e(afVar.f80817a) << 4));
    }

    public void a(ae aeVar) throws p {
        a(aeVar.f80815a, aeVar.f80816b);
    }

    public void a(am amVar) throws p {
        a(amVar.f80824a, amVar.f80825b);
    }

    public void a(boolean z) throws p {
        byte b2 = 2;
        if (this.o != null) {
            ad adVar = this.o;
            if (z) {
                b2 = 1;
            }
            a(adVar, b2);
            this.o = null;
            return;
        }
        if (z) {
            b2 = 1;
        }
        b(b2);
    }

    public void a(short s) throws p {
        b(c((int) s));
    }

    public void a(String str) throws p {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            a(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new p("UTF-8 not supported!");
        }
    }

    public void a(ByteBuffer byteBuffer) throws p {
        a(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position());
    }

    public void B() {
        this.m.c();
        this.n = 0;
    }

    public an j() throws p {
        this.m.a(this.n);
        this.n = 0;
        return f80805d;
    }

    public void k() throws p {
        this.n = this.m.a();
    }

    public am r() throws p {
        return new am(p());
    }

    public short v() throws p {
        return (short) g(E());
    }

    public int w() throws p {
        return g(E());
    }

    public long x() throws p {
        return d(F());
    }

    public ByteBuffer A() throws p {
        int E = E();
        f(E);
        if (E == 0) {
            return ByteBuffer.wrap(new byte[0]);
        }
        byte[] bArr = new byte[E];
        this.g.d(bArr, 0, E);
        return ByteBuffer.wrap(bArr);
    }

    public void b() throws p {
        this.n = this.m.a();
    }

    public void d() throws p {
        b((byte) 0);
    }

    public af n() throws p {
        byte b2;
        int E = E();
        if (E == 0) {
            b2 = 0;
        } else {
            b2 = u();
        }
        return new af(d((byte) (b2 >> 4)), d((byte) (b2 & 15)), E);
    }

    public ae p() throws p {
        byte u = u();
        int i = (u >> 4) & 15;
        if (i == 15) {
            i = E();
        }
        return new ae(d(u), i);
    }

    public boolean t() throws p {
        if (this.p != null) {
            boolean booleanValue = this.p.booleanValue();
            this.p = null;
            return booleanValue;
        } else if (u() == 1) {
            return true;
        } else {
            return false;
        }
    }

    public double y() throws p {
        byte[] bArr = new byte[8];
        this.g.d(bArr, 0, 8);
        return Double.longBitsToDouble(a(bArr));
    }

    public ad l() throws p {
        short s;
        Boolean bool;
        byte u = u();
        if (u == 0) {
            return f80806e;
        }
        short s2 = (short) ((u & 240) >> 4);
        if (s2 == 0) {
            s = v();
        } else {
            s = (short) (this.n + s2);
        }
        byte b2 = (byte) (u & 15);
        ad adVar = new ad("", d(b2), s);
        if (c(u)) {
            if (b2 == 1) {
                bool = Boolean.TRUE;
            } else {
                bool = Boolean.FALSE;
            }
            this.p = bool;
        }
        this.n = adVar.f80814c;
        return adVar;
    }

    public byte u() throws p {
        if (this.g.h() > 0) {
            byte b2 = this.g.f()[this.g.g()];
            this.g.a(1);
            return b2;
        }
        this.g.d(this.f80810c, 0, 1);
        return this.f80810c[0];
    }

    static {
        byte[] bArr = new byte[16];
        f80807f = bArr;
        bArr[0] = 0;
        f80807f[2] = 1;
        f80807f[3] = 3;
        f80807f[6] = 4;
        f80807f[8] = 5;
        f80807f[10] = 6;
        f80807f[4] = 7;
        f80807f[11] = 8;
        f80807f[15] = 9;
        f80807f[14] = 10;
        f80807f[13] = 11;
        f80807f[12] = 12;
    }

    private int E() throws p {
        int i = 0;
        if (this.g.h() >= 5) {
            byte[] f2 = this.g.f();
            int g = this.g.g();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                byte b2 = f2[g + i];
                i2 |= (b2 & Byte.MAX_VALUE) << i3;
                if ((b2 & 128) == 128) {
                    i3 += 7;
                    i++;
                } else {
                    this.g.a(i + 1);
                    return i2;
                }
            }
        } else {
            int i4 = 0;
            while (true) {
                byte u = u();
                i |= (u & Byte.MAX_VALUE) << i4;
                if ((u & 128) != 128) {
                    return i;
                }
                i4 += 7;
            }
        }
    }

    private long F() throws p {
        int i = 0;
        long j = 0;
        if (this.g.h() < 10) {
            while (true) {
                byte u = u();
                j |= ((long) (u & Byte.MAX_VALUE)) << i;
                if ((u & 128) != 128) {
                    break;
                }
                i += 7;
            }
        } else {
            byte[] f2 = this.g.f();
            int g = this.g.g();
            int i2 = 0;
            while (true) {
                byte b2 = f2[g + i];
                j |= ((long) (b2 & Byte.MAX_VALUE)) << i2;
                if ((b2 & 128) != 128) {
                    break;
                }
                i2 += 7;
                i++;
            }
            this.g.a(i + 1);
        }
        return j;
    }

    public ag h() throws p {
        byte u = u();
        if (u == -126) {
            byte u2 = u();
            byte b2 = (byte) (u2 & 31);
            if (b2 == 1) {
                int E = E();
                return new ag(z(), (byte) ((u2 >> 5) & 3), E);
            }
            throw new aj("Expected version 1 but got " + b2);
        }
        throw new aj("Expected protocol id " + Integer.toHexString(-126) + " but got " + Integer.toHexString(u));
    }

    public String z() throws p {
        int E = E();
        f(E);
        if (E == 0) {
            return "";
        }
        try {
            if (this.g.h() < E) {
                return new String(e(E), "UTF-8");
            }
            String str = new String(this.g.f(), this.g.g(), E, "UTF-8");
            this.g.a(E);
            return str;
        } catch (UnsupportedEncodingException unused) {
            throw new p("UTF-8 not supported!");
        }
    }

    public ac(aw awVar) {
        this(awVar, -1);
    }

    private void d(int i) throws p {
        b((byte) i);
    }

    private byte e(byte b2) {
        return f80807f[b2];
    }

    public void a(byte b2) throws p {
        b(b2);
    }

    private void b(byte b2) throws p {
        this.r[0] = b2;
        this.g.b(this.r);
    }

    private byte[] e(int i) throws p {
        if (i == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i];
        this.g.d(bArr, 0, i);
        return bArr;
    }

    private void b(int i) throws p {
        int i2 = 0;
        while ((i & -128) != 0) {
            this.f80808a[i2] = (byte) ((i & 127) | SearchJediMixFeedAdapter.f42517f);
            i >>>= 7;
            i2++;
        }
        this.f80808a[i2] = (byte) i;
        this.g.b(this.f80808a, 0, i2 + 1);
    }

    private void f(int i) throws aj {
        if (i < 0) {
            throw new aj("Negative length: " + i);
        } else if (this.q != -1 && ((long) i) > this.q) {
            throw new aj("Length exceeded max allowed: " + i);
        }
    }

    private long a(byte[] bArr) {
        return ((((long) bArr[7]) & 255) << 56) | ((((long) bArr[6]) & 255) << 48) | ((((long) bArr[5]) & 255) << 40) | ((((long) bArr[4]) & 255) << 32) | ((((long) bArr[3]) & 255) << 24) | ((((long) bArr[2]) & 255) << 16) | ((((long) bArr[1]) & 255) << 8) | (255 & ((long) bArr[0]));
    }

    private void b(long j) throws p {
        int i = 0;
        while ((-128 & j) != 0) {
            this.f80809b[i] = (byte) ((int) ((127 & j) | 128));
            j >>>= 7;
            i++;
        }
        this.f80809b[i] = (byte) ((int) j);
        this.g.b(this.f80809b, 0, i + 1);
    }

    private byte d(byte b2) throws aj {
        byte b3 = (byte) (b2 & 15);
        switch (b3) {
            case 0:
                return 0;
            case 1:
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 6;
            case 5:
                return 8;
            case 6:
                return 10;
            case e.l:
                return 4;
            case 8:
                return 11;
            case 9:
                return 15;
            case 10:
                return 14;
            case 11:
                return 13;
            case SearchNilInfo.HIT_TYPE_SENSITIVE:
                return 12;
            default:
                throw new aj("don't know what type: " + b3);
        }
    }

    public void a(double d2) throws p {
        byte[] bArr = {0, 0, 0, 0, 0, 0, 0, 0};
        a(Double.doubleToLongBits(d2), bArr, 0);
        this.g.b(bArr);
    }

    public void a(int i) throws p {
        b(c(i));
    }

    public void a(long j) throws p {
        b(c(j));
    }

    public void a(ad adVar) throws p {
        if (adVar.f80813b == 2) {
            this.o = adVar;
        } else {
            a(adVar, (byte) -1);
        }
    }

    /* access modifiers changed from: protected */
    public void a(byte b2, int i) throws p {
        if (i <= 14) {
            d((int) e(b2) | (i << 4));
            return;
        }
        d((int) e(b2) | 240);
        b(i);
    }

    public ac(aw awVar, long j) {
        super(awVar);
        this.m = new h(15);
        this.n = 0;
        this.o = null;
        this.p = null;
        this.f80808a = new byte[5];
        this.f80809b = new byte[10];
        this.r = new byte[1];
        this.f80810c = new byte[1];
        this.q = j;
    }

    private void a(ad adVar, byte b2) throws p {
        if (b2 == -1) {
            b2 = e(adVar.f80813b);
        }
        if (adVar.f80814c <= this.n || adVar.f80814c - this.n > 15) {
            b(b2);
            a(adVar.f80814c);
        } else {
            d((int) b2 | ((adVar.f80814c - this.n) << 4));
        }
        this.n = adVar.f80814c;
    }

    private void a(byte[] bArr, int i, int i2) throws p {
        b(i2);
        this.g.b(bArr, i, i2);
    }

    private void a(long j, byte[] bArr, int i) {
        bArr[i + 0] = (byte) ((int) (j & 255));
        bArr[i + 1] = (byte) ((int) ((j >> 8) & 255));
        bArr[i + 2] = (byte) ((int) ((j >> 16) & 255));
        bArr[i + 3] = (byte) ((int) ((j >> 24) & 255));
        bArr[i + 4] = (byte) ((int) ((j >> 32) & 255));
        bArr[i + 5] = (byte) ((int) ((j >> 40) & 255));
        bArr[i + 6] = (byte) ((int) ((j >> 48) & 255));
        bArr[i + 7] = (byte) ((int) ((j >> 56) & 255));
    }
}
