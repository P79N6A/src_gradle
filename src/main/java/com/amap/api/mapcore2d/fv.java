package com.amap.api.mapcore2d;

import java.util.Locale;

public final class fv {
    private static fv p;

    /* renamed from: a  reason: collision with root package name */
    public int f6184a;

    /* renamed from: b  reason: collision with root package name */
    public int f6185b;

    /* renamed from: c  reason: collision with root package name */
    public int f6186c;

    /* renamed from: d  reason: collision with root package name */
    public int f6187d;

    /* renamed from: e  reason: collision with root package name */
    public int f6188e;

    /* renamed from: f  reason: collision with root package name */
    public int f6189f;
    public int g;
    public int h;
    public int i;
    public int j = -113;
    public int k;
    public short l;
    public long m;
    public boolean n;
    public boolean o = true;

    public fv(int i2, boolean z) {
        this.k = i2;
        this.n = z;
    }

    public final int a() {
        return this.f6186c;
    }

    public final int b() {
        return this.f6187d;
    }

    public final int c() {
        return this.h;
    }

    public final int d() {
        return this.i;
    }

    public final int e() {
        return this.j;
    }

    public final String toString() {
        Object[] objArr;
        String str;
        Locale locale;
        switch (this.k) {
            case 1:
                locale = Locale.CHINA;
                str = "GSM lac=%d, cid=%d, mnc=%s, valid=%b, sig=%d, age=%d, reg=%b";
                objArr = new Object[]{Integer.valueOf(this.f6186c), Integer.valueOf(this.f6187d), Integer.valueOf(this.f6185b), Boolean.valueOf(this.o), Integer.valueOf(this.j), Short.valueOf(this.l), Boolean.valueOf(this.n)};
                break;
            case 2:
                locale = Locale.CHINA;
                str = "CDMA bid=%d, nid=%d, sid=%d, valid=%b, sig=%d, age=%d, reg=%b";
                objArr = new Object[]{Integer.valueOf(this.i), Integer.valueOf(this.h), Integer.valueOf(this.g), Boolean.valueOf(this.o), Integer.valueOf(this.j), Short.valueOf(this.l), Boolean.valueOf(this.n)};
                break;
            case 3:
                locale = Locale.CHINA;
                str = "LTE lac=%d, cid=%d, mnc=%s, valid=%b, sig=%d, age=%d, reg=%b";
                objArr = new Object[]{Integer.valueOf(this.f6186c), Integer.valueOf(this.f6187d), Integer.valueOf(this.f6185b), Boolean.valueOf(this.o), Integer.valueOf(this.j), Short.valueOf(this.l), Boolean.valueOf(this.n)};
                break;
            case 4:
                locale = Locale.CHINA;
                str = "WCDMA lac=%d, cid=%d, mnc=%s, valid=%b, sig=%d, age=%d, reg=%b";
                objArr = new Object[]{Integer.valueOf(this.f6186c), Integer.valueOf(this.f6187d), Integer.valueOf(this.f6185b), Boolean.valueOf(this.o), Integer.valueOf(this.j), Short.valueOf(this.l), Boolean.valueOf(this.n)};
                break;
            default:
                return "unknown";
        }
        return String.format(locale, str, objArr);
    }
}
