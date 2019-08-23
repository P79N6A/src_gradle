package com.tencent.bugly.crashreport.common.strategy;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.a.a.a.a.a.a;
import com.tencent.bugly.proguard.z;
import java.util.Map;

public class StrategyBean implements Parcelable {
    public static final Parcelable.Creator<StrategyBean> CREATOR = new Parcelable.Creator<StrategyBean>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new StrategyBean[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new StrategyBean(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public static String f79282a = "http://rqd.uu.qq.com/rqd/sync";

    /* renamed from: b  reason: collision with root package name */
    public static String f79283b = "http://android.bugly.qq.com/rqd/async";

    /* renamed from: c  reason: collision with root package name */
    public static String f79284c = "http://android.bugly.qq.com/rqd/async";

    /* renamed from: d  reason: collision with root package name */
    public static String f79285d;

    /* renamed from: e  reason: collision with root package name */
    public long f79286e;

    /* renamed from: f  reason: collision with root package name */
    public long f79287f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public long p;
    public long q;
    public String r;
    public String s;
    public String t;
    public String u;
    public Map<String, String> v;
    public int w;
    public long x;
    public long y;

    public int describeContents() {
        return 0;
    }

    public StrategyBean() {
        this.f79286e = -1;
        this.f79287f = -1;
        this.g = true;
        this.h = true;
        this.i = true;
        this.j = true;
        this.l = true;
        this.m = true;
        this.n = true;
        this.o = true;
        this.q = 30000;
        this.r = f79283b;
        this.s = f79284c;
        this.t = f79282a;
        this.w = 10;
        this.x = 300000;
        this.y = -1;
        this.f79287f = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append("S(@L@L@)");
        f79285d = sb.toString();
        sb.setLength(0);
        sb.append("*^@K#K@!");
        this.u = sb.toString();
    }

    public StrategyBean(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        this.f79286e = -1;
        this.f79287f = -1;
        this.g = true;
        this.h = true;
        this.i = true;
        this.j = true;
        this.l = true;
        this.m = true;
        this.n = true;
        this.o = true;
        this.q = 30000;
        this.r = f79283b;
        this.s = f79284c;
        this.t = f79282a;
        this.w = 10;
        this.x = 300000;
        this.y = -1;
        try {
            f79285d = "S(@L@L@)";
            this.f79287f = parcel.readLong();
            boolean z9 = false;
            if (parcel.readByte() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.g = z;
            if (parcel.readByte() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.h = z2;
            if (parcel.readByte() == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.i = z3;
            this.r = parcel.readString();
            this.s = parcel.readString();
            this.u = parcel.readString();
            this.v = z.b(parcel);
            if (parcel.readByte() == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.j = z4;
            if (parcel.readByte() == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            this.k = z5;
            if (parcel.readByte() == 1) {
                z6 = true;
            } else {
                z6 = false;
            }
            this.n = z6;
            if (parcel.readByte() == 1) {
                z7 = true;
            } else {
                z7 = false;
            }
            this.o = z7;
            this.q = parcel.readLong();
            if (parcel.readByte() == 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.l = z8;
            this.m = parcel.readByte() == 1 ? true : z9;
            this.p = parcel.readLong();
            this.w = parcel.readInt();
            this.x = parcel.readLong();
            this.y = parcel.readLong();
        } catch (Exception e2) {
            a.b(e2);
        }
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f79287f);
        parcel.writeByte(this.g ? (byte) 1 : 0);
        parcel.writeByte(this.h ? (byte) 1 : 0);
        parcel.writeByte(this.i ? (byte) 1 : 0);
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.u);
        z.b(parcel, this.v);
        parcel.writeByte(this.j ? (byte) 1 : 0);
        parcel.writeByte(this.k ? (byte) 1 : 0);
        parcel.writeByte(this.n ? (byte) 1 : 0);
        parcel.writeByte(this.o ? (byte) 1 : 0);
        parcel.writeLong(this.q);
        parcel.writeByte(this.l ? (byte) 1 : 0);
        parcel.writeByte(this.m ? (byte) 1 : 0);
        parcel.writeLong(this.p);
        parcel.writeInt(this.w);
        parcel.writeLong(this.x);
        parcel.writeLong(this.y);
    }
}
