package com.facebook.b;

import com.facebook.b.c;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.h;
import javax.annotation.Nullable;

public final class a implements c.a {

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f23282b;

    /* renamed from: c  reason: collision with root package name */
    private static final int f23283c;

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f23284d;

    /* renamed from: e  reason: collision with root package name */
    private static final int f23285e;

    /* renamed from: f  reason: collision with root package name */
    private static final byte[] f23286f = e.a("GIF87a");
    private static final byte[] g = e.a("GIF89a");
    private static final byte[] h;
    private static final int i;
    private static final byte[] j;
    private static final int k;
    private static final String[] l = {"heic", "heix", "hevc", "hevx", "mif1", "msf1"};
    private static final int m = e.a("ftyp" + l[0]).length;

    /* renamed from: a  reason: collision with root package name */
    final int f23287a = h.a(21, 20, f23283c, f23285e, 6, i, k, m);

    public final int a() {
        return this.f23287a;
    }

    static {
        byte[] bArr = {-1, -40, -1};
        f23282b = bArr;
        f23283c = bArr.length;
        byte[] bArr2 = {-119, 80, 78, 71, 13, 10, 26, 10};
        f23284d = bArr2;
        f23285e = bArr2.length;
        byte[] a2 = e.a("BM");
        h = a2;
        i = a2.length;
        byte[] bArr3 = {0, 0, 1, 0};
        j = bArr3;
        k = bArr3.length;
    }

    @Nullable
    public final c a(byte[] bArr, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        Preconditions.checkNotNull(bArr);
        boolean z10 = false;
        if (com.facebook.common.g.c.a(bArr, 0, i2)) {
            Preconditions.checkArgument(com.facebook.common.g.c.a(bArr, 0, i2));
            if (com.facebook.common.g.c.a(bArr, 12, com.facebook.common.g.c.f2349e)) {
                return b.f23293f;
            }
            if (com.facebook.common.g.c.a(bArr, 12, com.facebook.common.g.c.f2350f)) {
                return b.g;
            }
            if (i2 < 21 || !com.facebook.common.g.c.a(bArr, 12, com.facebook.common.g.c.g)) {
                z6 = false;
            } else {
                z6 = true;
            }
            if (!z6) {
                return c.f23294a;
            }
            boolean a2 = com.facebook.common.g.c.a(bArr, 12, com.facebook.common.g.c.g);
            if ((bArr[20] & 2) == 2) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (!a2 || !z7) {
                z8 = false;
            } else {
                z8 = true;
            }
            if (z8) {
                return b.j;
            }
            boolean a3 = com.facebook.common.g.c.a(bArr, 12, com.facebook.common.g.c.g);
            if ((bArr[20] & 16) == 16) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (a3 && z9) {
                z10 = true;
            }
            if (z10) {
                return b.i;
            }
            return b.h;
        }
        if (i2 < f23282b.length || !e.a(bArr, f23282b)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return b.f23288a;
        }
        if (i2 < f23284d.length || !e.a(bArr, f23284d)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            return b.f23289b;
        }
        if (i2 < 6 || (!e.a(bArr, f23286f) && !e.a(bArr, g))) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            return b.f23290c;
        }
        if (i2 < h.length) {
            z4 = false;
        } else {
            z4 = e.a(bArr, h);
        }
        if (z4) {
            return b.f23291d;
        }
        if (i2 < j.length) {
            z5 = false;
        } else {
            z5 = e.a(bArr, j);
        }
        if (z5) {
            return b.f23292e;
        }
        if (i2 >= m && bArr[3] >= 8) {
            String[] strArr = l;
            int length = strArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                String str = strArr[i3];
                int length2 = bArr.length;
                if (e.a(bArr, length2, e.a("ftyp" + str), m) >= 0) {
                    z10 = true;
                    break;
                }
                i3++;
            }
        }
        if (z10) {
            return b.k;
        }
        return c.f23294a;
    }
}
