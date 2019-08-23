package com.amap.api.mapcore2d;

import android.graphics.PointF;

public class bs implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public int f5776a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5777b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5778c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5779d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5780e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f5781f;
    public PointF g;
    public int h = -1;
    public boolean i;
    private String j;

    public String c() {
        return this.j;
    }

    /* renamed from: a */
    public bs clone() {
        return new bs(this);
    }

    public int hashCode() {
        return (this.f5777b * 7) + (this.f5778c * 11) + (this.f5779d * 13) + this.f5780e;
    }

    public void b() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5777b);
        sb.append("-");
        sb.append(this.f5778c);
        sb.append("-");
        sb.append(this.f5779d);
        if (this.f5781f && q.i == 1) {
            sb.append("-1");
        }
        this.j = sb.toString();
    }

    public String toString() {
        return this.f5777b + "-" + this.f5778c + "-" + this.f5779d + "-" + this.f5780e;
    }

    public bs(bs bsVar) {
        this.f5777b = bsVar.f5777b;
        this.f5778c = bsVar.f5778c;
        this.f5779d = bsVar.f5779d;
        this.f5780e = bsVar.f5780e;
        this.g = bsVar.g;
        this.f5776a = bsVar.f5776a;
        this.f5781f = !cl.a(this.f5777b, this.f5778c, this.f5779d);
        b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs)) {
            return false;
        }
        bs bsVar = (bs) obj;
        if (this.f5777b == bsVar.f5777b && this.f5778c == bsVar.f5778c && this.f5779d == bsVar.f5779d && this.f5780e == bsVar.f5780e) {
            return true;
        }
        return false;
    }

    public bs(int i2, int i3, int i4, int i5) {
        this.f5777b = i2;
        this.f5778c = i3;
        this.f5779d = i4;
        this.f5780e = i5;
        this.f5781f = !cl.a(this.f5777b, this.f5778c, this.f5779d);
        b();
    }
}
