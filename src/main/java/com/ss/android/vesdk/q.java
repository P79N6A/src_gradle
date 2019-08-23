package com.ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.ColorInt;
import com.ss.android.vesdk.p;

public final class q implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new Parcelable.Creator<q>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new q[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new q(parcel);
        }
    };
    public float A;
    public boolean B;
    public p.h C;
    public p.j D;

    /* renamed from: a  reason: collision with root package name */
    public String f78073a;

    /* renamed from: b  reason: collision with root package name */
    public int f78074b;

    /* renamed from: c  reason: collision with root package name */
    public int f78075c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f78076d;

    /* renamed from: e  reason: collision with root package name */
    public p.i f78077e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f78078f;
    public int g;
    public int h;
    public int i;
    public String j;
    public int k;
    public int l;
    public String[] m;
    public String[] n;
    public String[] o;
    @ColorInt
    public int p;
    @ColorInt
    public int q;
    public String r;
    public String s;
    public double t;
    public double u;
    public double v;
    public double w;
    public String x;
    public String y;
    public float z;

    public final int describeContents() {
        return 0;
    }

    public q() {
    }

    protected q(Parcel parcel) {
        boolean z2;
        boolean z3;
        this.f78073a = parcel.readString();
        this.f78074b = parcel.readInt();
        this.f78075c = parcel.readInt();
        boolean z4 = false;
        if (parcel.readInt() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f78076d = z2;
        this.f78077e = p.i.values()[parcel.readInt()];
        if (parcel.readInt() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f78078f = z3;
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = parcel.readString();
        this.k = parcel.readInt();
        this.l = parcel.readInt();
        int readInt = parcel.readInt();
        if (readInt != -1) {
            this.m = new String[readInt];
            parcel.readStringArray(this.m);
        } else {
            this.m = null;
        }
        int readInt2 = parcel.readInt();
        if (readInt2 != -1) {
            this.n = new String[readInt2];
            parcel.readStringArray(this.n);
        } else {
            this.n = null;
        }
        int readInt3 = parcel.readInt();
        if (readInt3 != -1) {
            this.o = new String[readInt3];
            parcel.readStringArray(this.o);
        } else {
            this.o = null;
        }
        this.p = parcel.readInt();
        this.r = parcel.readString();
        this.s = parcel.readString();
        this.t = parcel.readDouble();
        this.u = parcel.readDouble();
        this.v = parcel.readDouble();
        this.w = parcel.readDouble();
        this.x = parcel.readString();
        this.y = parcel.readString();
        this.z = parcel.readFloat();
        this.A = parcel.readFloat();
        this.B = parcel.readInt() == 1 ? true : z4;
        this.C = p.h.values()[parcel.readInt()];
        this.D = p.j.values()[parcel.readInt()];
        this.q = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f78073a);
        parcel.writeInt(this.f78074b);
        parcel.writeInt(this.f78075c);
        parcel.writeInt(this.f78076d ? 1 : 0);
        parcel.writeInt(this.f78077e.ordinal());
        parcel.writeInt(this.f78078f ? 1 : 0);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeString(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        if (this.m != null) {
            parcel.writeInt(this.m.length);
            parcel.writeStringArray(this.m);
        } else {
            parcel.writeInt(-1);
        }
        if (this.n != null) {
            parcel.writeInt(this.n.length);
            parcel.writeStringArray(this.n);
        } else {
            parcel.writeInt(-1);
        }
        if (this.o != null) {
            parcel.writeInt(this.o.length);
            parcel.writeStringArray(this.o);
        } else {
            parcel.writeInt(-1);
        }
        parcel.writeInt(this.p);
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeDouble(this.t);
        parcel.writeDouble(this.u);
        parcel.writeDouble(this.v);
        parcel.writeDouble(this.w);
        parcel.writeString(this.x);
        parcel.writeString(this.y);
        parcel.writeFloat(this.z);
        parcel.writeFloat(this.A);
        parcel.writeInt(this.B ? 1 : 0);
        parcel.writeInt(this.C.ordinal());
        parcel.writeInt(this.D.ordinal());
        parcel.writeInt(this.q);
    }
}
