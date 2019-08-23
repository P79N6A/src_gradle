package com.mapbox.android.telemetry;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

public class au implements Parcelable {
    public static final Parcelable.Creator<au> CREATOR = new Parcelable.Creator<au>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new au[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new au(parcel, (byte) 0);
        }
    };
    private static final String S = ("Android - " + Build.VERSION.RELEASE);
    public String A;
    int B;
    public Integer C;
    public String D;
    public String E;
    int F;
    int G;
    public String H;
    public Boolean I;
    int J;
    public String K;
    public String L;
    int M;
    int N;
    int O;
    public Integer P;
    public Integer Q;
    int R;

    /* renamed from: a  reason: collision with root package name */
    public int f26026a;

    /* renamed from: b  reason: collision with root package name */
    public Integer f26027b;

    /* renamed from: c  reason: collision with root package name */
    public Integer f26028c;

    /* renamed from: d  reason: collision with root package name */
    public String f26029d;

    /* renamed from: e  reason: collision with root package name */
    int f26030e;

    /* renamed from: f  reason: collision with root package name */
    int f26031f;
    int g;
    public String h;
    public int i;
    public String j;
    public String k;
    public String l;
    public double m;
    public double n;
    public String o;
    public String p;
    public String q;
    public Integer r;
    public Integer s;
    public Integer t;
    public boolean u;
    public String v;
    public String w;
    public String x;
    public Integer y;
    public Integer z;

    public int describeContents() {
        return 0;
    }

    private au(Parcel parcel) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        boolean z2;
        Integer num6;
        Integer num7;
        Integer num8;
        Integer num9;
        this.f26026a = parcel.readInt();
        Integer num10 = null;
        if (parcel.readByte() == 0) {
            num = null;
        } else {
            num = Integer.valueOf(parcel.readInt());
        }
        this.f26027b = num;
        if (parcel.readByte() == 0) {
            num2 = null;
        } else {
            num2 = Integer.valueOf(parcel.readInt());
        }
        this.f26028c = num2;
        this.f26029d = parcel.readString();
        this.f26030e = parcel.readInt();
        this.f26031f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readString();
        this.i = parcel.readInt();
        this.j = parcel.readString();
        this.k = parcel.readString();
        this.l = parcel.readString();
        this.m = parcel.readDouble();
        this.n = parcel.readDouble();
        this.o = parcel.readString();
        this.p = parcel.readString();
        this.q = parcel.readString();
        if (parcel.readByte() == 0) {
            num3 = null;
        } else {
            num3 = Integer.valueOf(parcel.readInt());
        }
        this.r = num3;
        if (parcel.readByte() == 0) {
            num4 = null;
        } else {
            num4 = Integer.valueOf(parcel.readInt());
        }
        this.s = num4;
        if (parcel.readByte() == 0) {
            num5 = null;
        } else {
            num5 = Integer.valueOf(parcel.readInt());
        }
        this.t = num5;
        boolean z3 = false;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.u = z2;
        this.v = parcel.readString();
        this.w = parcel.readString();
        this.x = parcel.readString();
        if (parcel.readByte() == 0) {
            num6 = null;
        } else {
            num6 = Integer.valueOf(parcel.readInt());
        }
        this.y = num6;
        if (parcel.readByte() == 0) {
            num7 = null;
        } else {
            num7 = Integer.valueOf(parcel.readInt());
        }
        this.z = num7;
        this.A = parcel.readString();
        if (parcel.readByte() == 0) {
            num8 = null;
        } else {
            num8 = Integer.valueOf(parcel.readInt());
        }
        this.C = num8;
        this.D = parcel.readString();
        this.E = parcel.readString();
        this.F = parcel.readInt();
        this.G = parcel.readInt();
        this.H = parcel.readString();
        this.I = Boolean.valueOf(parcel.readByte() != 0 ? true : z3);
        this.J = parcel.readInt();
        this.K = parcel.readString();
        this.L = parcel.readString();
        this.M = parcel.readInt();
        this.N = parcel.readInt();
        this.O = parcel.readInt();
        this.B = parcel.readInt();
        if (parcel.readByte() == 0) {
            num9 = null;
        } else {
            num9 = Integer.valueOf(parcel.readInt());
        }
        this.P = num9;
        this.Q = parcel.readByte() != 0 ? Integer.valueOf(parcel.readInt()) : num10;
        this.R = parcel.readInt();
    }

    /* synthetic */ au(Parcel parcel, byte b2) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f26026a);
        if (this.f26027b == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.f26027b.intValue());
        }
        if (this.f26028c == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.f26028c.intValue());
        }
        parcel.writeString(this.f26029d);
        parcel.writeInt(this.f26030e);
        parcel.writeInt(this.f26031f);
        parcel.writeInt(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        parcel.writeDouble(this.m);
        parcel.writeDouble(this.n);
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        if (this.r == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.r.intValue());
        }
        if (this.s == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.s.intValue());
        }
        if (this.t == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.t.intValue());
        }
        parcel.writeByte(this.u ? (byte) 1 : 0);
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeString(this.x);
        if (this.y == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.y.intValue());
        }
        if (this.z == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.z.intValue());
        }
        parcel.writeString(this.A);
        if (this.C == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.C.intValue());
        }
        parcel.writeString(this.D);
        parcel.writeString(this.E);
        parcel.writeInt(this.F);
        parcel.writeInt(this.G);
        parcel.writeString(this.H);
        parcel.writeByte(this.I.booleanValue() ? (byte) 1 : 0);
        parcel.writeInt(this.J);
        parcel.writeString(this.K);
        parcel.writeString(this.L);
        parcel.writeInt(this.M);
        parcel.writeInt(this.N);
        parcel.writeInt(this.O);
        parcel.writeInt(this.B);
        if (this.P == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.P.intValue());
        }
        if (this.Q == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.Q.intValue());
        }
        parcel.writeInt(this.R);
    }
}
