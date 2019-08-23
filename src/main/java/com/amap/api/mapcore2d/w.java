package com.amap.api.mapcore2d;

public class w {

    /* renamed from: a  reason: collision with root package name */
    private long f6292a;

    /* renamed from: b  reason: collision with root package name */
    private long f6293b;

    /* renamed from: c  reason: collision with root package name */
    private double f6294c;

    /* renamed from: d  reason: collision with root package name */
    private double f6295d;

    public int a() {
        return (int) this.f6293b;
    }

    public int b() {
        return (int) this.f6292a;
    }

    public long c() {
        return this.f6293b;
    }

    public long d() {
        return this.f6292a;
    }

    public w g() {
        w wVar = new w(this.f6294c, this.f6295d, this.f6292a, this.f6293b);
        return wVar;
    }

    public w() {
        this.f6292a = Long.MIN_VALUE;
        this.f6293b = Long.MIN_VALUE;
        this.f6294c = Double.MIN_VALUE;
        this.f6295d = Double.MIN_VALUE;
        this.f6292a = 0;
        this.f6293b = 0;
    }

    public double e() {
        if (Double.doubleToLongBits(this.f6295d) == Double.doubleToLongBits(Double.MIN_VALUE)) {
            this.f6295d = (r.a(this.f6293b) * 2.003750834E7d) / 180.0d;
        }
        return this.f6295d;
    }

    public int hashCode() {
        int i = ((((int) (this.f6292a ^ (this.f6292a >>> 32))) + 31) * 31) + ((int) (this.f6293b ^ (this.f6293b >>> 32)));
        long doubleToLongBits = Double.doubleToLongBits(this.f6294c);
        int i2 = (i * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        long doubleToLongBits2 = Double.doubleToLongBits(this.f6295d);
        return (i2 * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public double f() {
        if (Double.doubleToLongBits(this.f6294c) == Double.doubleToLongBits(Double.MIN_VALUE)) {
            this.f6294c = ((Math.log(Math.tan(((r.a(this.f6292a) + 90.0d) * 3.141592653589793d) / 360.0d)) / 0.017453292519943295d) * 2.003750834E7d) / 180.0d;
        }
        return this.f6294c;
    }

    public void a(double d2) {
        this.f6295d = d2;
    }

    public void b(double d2) {
        this.f6294c = d2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f6292a == wVar.f6292a && this.f6293b == wVar.f6293b && Double.doubleToLongBits(this.f6294c) == Double.doubleToLongBits(wVar.f6294c) && Double.doubleToLongBits(this.f6295d) == Double.doubleToLongBits(wVar.f6295d)) {
            return true;
        }
        return false;
    }

    public w(int i, int i2) {
        this.f6292a = Long.MIN_VALUE;
        this.f6293b = Long.MIN_VALUE;
        this.f6294c = Double.MIN_VALUE;
        this.f6295d = Double.MIN_VALUE;
        this.f6292a = (long) i;
        this.f6293b = (long) i2;
    }

    w(double d2, double d3, boolean z) {
        this.f6292a = Long.MIN_VALUE;
        this.f6293b = Long.MIN_VALUE;
        this.f6294c = Double.MIN_VALUE;
        this.f6295d = Double.MIN_VALUE;
        if (z) {
            this.f6292a = (long) (d2 * 1000000.0d);
            this.f6293b = (long) (d3 * 1000000.0d);
            return;
        }
        this.f6294c = d2;
        this.f6295d = d3;
    }

    private w(double d2, double d3, long j, long j2) {
        this.f6292a = Long.MIN_VALUE;
        this.f6293b = Long.MIN_VALUE;
        this.f6294c = Double.MIN_VALUE;
        this.f6295d = Double.MIN_VALUE;
        this.f6294c = d2;
        this.f6295d = d3;
        this.f6292a = j;
        this.f6293b = j2;
    }
}
