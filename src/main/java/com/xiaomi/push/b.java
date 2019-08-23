package com.xiaomi.push;

import java.io.InputStream;
import java.util.Vector;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private int f81848a;

    /* renamed from: a  reason: collision with other field name */
    private final InputStream f167a;

    /* renamed from: a  reason: collision with other field name */
    private final byte[] f168a;

    /* renamed from: b  reason: collision with root package name */
    private int f81849b;

    /* renamed from: c  reason: collision with root package name */
    private int f81850c;

    /* renamed from: d  reason: collision with root package name */
    private int f81851d;

    /* renamed from: e  reason: collision with root package name */
    private int f81852e;

    /* renamed from: f  reason: collision with root package name */
    private int f81853f;
    private int g;
    private int h;
    private int i;

    private b(InputStream inputStream) {
        this.f81853f = Integer.MAX_VALUE;
        this.h = 64;
        this.i = 67108864;
        this.f168a = new byte[4096];
        this.f167a = inputStream;
    }

    private b(byte[] bArr, int i2, int i3) {
        this.f81853f = Integer.MAX_VALUE;
        this.h = 64;
        this.i = 67108864;
        this.f168a = bArr;
        this.f81848a = i3 + i2;
        this.f81850c = i2;
    }

    public static b a(InputStream inputStream) {
        return new b(inputStream);
    }

    public static b a(byte[] bArr, int i2, int i3) {
        return new b(bArr, i2, i3);
    }

    private boolean a(boolean z) {
        if (this.f81850c < this.f81848a) {
            throw new IllegalStateException("refillBuffer() called when buffer wasn't empty.");
        } else if (this.f81852e + this.f81848a != this.f81853f) {
            this.f81852e += this.f81848a;
            this.f81850c = 0;
            this.f81848a = this.f167a == null ? -1 : this.f167a.read(this.f168a);
            if (this.f81848a == 0 || this.f81848a < -1) {
                throw new IllegalStateException("InputStream#read(byte[]) returned invalid result: " + this.f81848a + "\nThe InputStream implementation is buggy.");
            } else if (this.f81848a == -1) {
                this.f81848a = 0;
                if (!z) {
                    return false;
                }
                throw d.a();
            } else {
                b();
                int i2 = this.f81852e + this.f81848a + this.f81849b;
                if (i2 <= this.i && i2 >= 0) {
                    return true;
                }
                throw d.h();
            }
        } else if (!z) {
            return false;
        } else {
            throw d.a();
        }
    }

    private void b() {
        this.f81848a += this.f81849b;
        int i2 = this.f81852e + this.f81848a;
        if (i2 > this.f81853f) {
            this.f81849b = i2 - this.f81853f;
            this.f81848a -= this.f81849b;
            return;
        }
        this.f81849b = 0;
    }

    public final byte a() {
        if (this.f81850c == this.f81848a) {
            a(true);
        }
        byte[] bArr = this.f168a;
        int i2 = this.f81850c;
        this.f81850c = i2 + 1;
        return bArr[i2];
    }

    /* renamed from: a  reason: collision with other method in class */
    public final int m97a() {
        if (b()) {
            this.f81851d = 0;
            return 0;
        }
        this.f81851d = d();
        if (this.f81851d != 0) {
            return this.f81851d;
        }
        throw d.d();
    }

    public final int a(int i2) {
        if (i2 >= 0) {
            int i3 = this.f81852e + this.f81850c + i2;
            int i4 = this.f81853f;
            if (i3 <= i4) {
                this.f81853f = i3;
                b();
                return i4;
            }
            throw d.a();
        }
        throw d.b();
    }

    /* renamed from: a  reason: collision with other method in class */
    public final long m98a() {
        return c();
    }

    /* renamed from: a  reason: collision with other method in class */
    public final a m99a() {
        int d2 = d();
        if (d2 > this.f81848a - this.f81850c || d2 <= 0) {
            return a.a(a(d2));
        }
        a a2 = a.a(this.f168a, this.f81850c, d2);
        this.f81850c = d2 + this.f81850c;
        return a2;
    }

    /* renamed from: a  reason: collision with other method in class */
    public final String m100a() {
        int d2 = d();
        if (d2 > this.f81848a - this.f81850c || d2 <= 0) {
            return new String(a(d2), "UTF-8");
        }
        String str = new String(this.f168a, this.f81850c, d2, "UTF-8");
        this.f81850c = d2 + this.f81850c;
        return str;
    }

    /* renamed from: a  reason: collision with other method in class */
    public final void m101a() {
        int a2;
        do {
            a2 = a();
            if (a2 == 0) {
                return;
            }
        } while (a(a2));
    }

    /* renamed from: a  reason: collision with other method in class */
    public final void m102a(int i2) {
        if (this.f81851d != i2) {
            throw d.e();
        }
    }

    public final void a(e eVar) {
        int d2 = d();
        if (this.g < this.h) {
            int a2 = a(d2);
            this.g++;
            eVar.a(this);
            a(0);
            this.g--;
            b(a2);
            return;
        }
        throw d.g();
    }

    /* renamed from: a  reason: collision with other method in class */
    public final boolean m103a() {
        return d() != 0;
    }

    /* renamed from: a  reason: collision with other method in class */
    public final boolean m104a(int i2) {
        switch (f.a(i2)) {
            case 0:
                b();
                break;
            case 1:
                d();
                break;
            case 2:
                c(d());
                break;
            case 3:
                a();
                a(f.a(f.b(i2), 4));
                break;
            case 4:
                return false;
            case 5:
                e();
                break;
            default:
                throw d.f();
        }
        return true;
    }

    /* renamed from: a  reason: collision with other method in class */
    public final byte[] m105a(int i2) {
        if (i2 < 0) {
            throw d.b();
        } else if (this.f81852e + this.f81850c + i2 > this.f81853f) {
            c((this.f81853f - this.f81852e) - this.f81850c);
            throw d.a();
        } else if (i2 <= this.f81848a - this.f81850c) {
            byte[] bArr = new byte[i2];
            System.arraycopy(this.f168a, this.f81850c, bArr, 0, i2);
            this.f81850c += i2;
            return bArr;
        } else if (i2 < 4096) {
            byte[] bArr2 = new byte[i2];
            int i3 = this.f81848a - this.f81850c;
            System.arraycopy(this.f168a, this.f81850c, bArr2, 0, i3);
            this.f81850c = this.f81848a;
            while (true) {
                a(true);
                int i4 = i2 - i3;
                if (i4 > this.f81848a) {
                    System.arraycopy(this.f168a, 0, bArr2, i3, this.f81848a);
                    i3 += this.f81848a;
                    this.f81850c = this.f81848a;
                } else {
                    System.arraycopy(this.f168a, 0, bArr2, i3, i4);
                    this.f81850c = i4;
                    return bArr2;
                }
            }
        } else {
            int i5 = this.f81850c;
            int i6 = this.f81848a;
            this.f81852e += this.f81848a;
            this.f81850c = 0;
            this.f81848a = 0;
            Vector vector = new Vector();
            int i7 = i6 - i5;
            int i8 = i2 - i7;
            while (i8 > 0) {
                byte[] bArr3 = new byte[Math.min(i8, 4096)];
                int i9 = 0;
                while (i9 < bArr3.length) {
                    int read = this.f167a == null ? -1 : this.f167a.read(bArr3, i9, bArr3.length - i9);
                    if (read != -1) {
                        this.f81852e += read;
                        i9 += read;
                    } else {
                        throw d.a();
                    }
                }
                int length = bArr3.length;
                vector.addElement(bArr3);
                i8 -= length;
            }
            byte[] bArr4 = new byte[i2];
            System.arraycopy(this.f168a, i5, bArr4, 0, i7);
            for (int i10 = 0; i10 < vector.size(); i10++) {
                byte[] bArr5 = (byte[]) vector.elementAt(i10);
                System.arraycopy(bArr5, 0, bArr4, i7, bArr5.length);
                i7 += bArr5.length;
            }
            return bArr4;
        }
    }

    /* renamed from: b  reason: collision with other method in class */
    public final int m106b() {
        return d();
    }

    /* renamed from: b  reason: collision with other method in class */
    public final long m107b() {
        return c();
    }

    public final void b(int i2) {
        this.f81853f = i2;
        b();
    }

    /* renamed from: b  reason: collision with other method in class */
    public final boolean m108b() {
        return this.f81850c == this.f81848a && !a(false);
    }

    public final int c() {
        return d();
    }

    /* renamed from: c  reason: collision with other method in class */
    public final long m109c() {
        long j = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte a2 = a();
            j |= ((long) (a2 & Byte.MAX_VALUE)) << i2;
            if ((a2 & 128) == 0) {
                return j;
            }
        }
        throw d.c();
    }

    public final void c(int i2) {
        if (i2 < 0) {
            throw d.b();
        } else if (this.f81852e + this.f81850c + i2 > this.f81853f) {
            c((this.f81853f - this.f81852e) - this.f81850c);
            throw d.a();
        } else if (i2 <= this.f81848a - this.f81850c) {
            this.f81850c += i2;
        } else {
            int i3 = this.f81848a;
            int i4 = this.f81850c;
            this.f81852e += this.f81848a;
            this.f81850c = 0;
            this.f81848a = 0;
            int i5 = i3 - i4;
            while (i5 < i2) {
                int skip = this.f167a == null ? -1 : (int) this.f167a.skip((long) (i2 - i5));
                if (skip > 0) {
                    i5 += skip;
                    this.f81852e = skip + this.f81852e;
                } else {
                    throw d.a();
                }
            }
        }
    }

    public final int d() {
        int i2;
        byte a2 = a();
        if (a2 >= 0) {
            return a2;
        }
        byte b2 = a2 & Byte.MAX_VALUE;
        byte a3 = a();
        if (a3 >= 0) {
            i2 = a3 << 7;
        } else {
            b2 |= (a3 & Byte.MAX_VALUE) << 7;
            byte a4 = a();
            if (a4 >= 0) {
                i2 = a4 << 14;
            } else {
                b2 |= (a4 & Byte.MAX_VALUE) << 14;
                byte a5 = a();
                if (a5 >= 0) {
                    i2 = a5 << 21;
                } else {
                    byte a6 = a();
                    byte b3 = b2 | ((a5 & Byte.MAX_VALUE) << 21) | (a6 << 28);
                    if (a6 >= 0) {
                        return b3;
                    }
                    for (int i3 = 0; i3 < 5; i3++) {
                        if (a() >= 0) {
                            return b3;
                        }
                    }
                    throw d.c();
                }
            }
        }
        return b2 | i2;
    }

    /* renamed from: d  reason: collision with other method in class */
    public final long m110d() {
        byte a2 = a();
        return ((((long) a()) & 255) << 8) | (((long) a2) & 255) | ((((long) a()) & 255) << 16) | ((((long) a()) & 255) << 24) | ((((long) a()) & 255) << 32) | ((((long) a()) & 255) << 40) | ((((long) a()) & 255) << 48) | ((((long) a()) & 255) << 56);
    }

    public final int e() {
        return (a() & 255) | ((a() & 255) << 8) | ((a() & 255) << 16) | ((a() & 255) << 24);
    }
}
