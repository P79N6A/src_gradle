package com.tencent.bugly.crashreport.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.bugly.proguard.z;
import java.util.Map;

public class UserInfoBean implements Parcelable {
    public static final Parcelable.Creator<UserInfoBean> CREATOR = new Parcelable.Creator<UserInfoBean>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new UserInfoBean[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new UserInfoBean(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public long f79243a;

    /* renamed from: b  reason: collision with root package name */
    public int f79244b;

    /* renamed from: c  reason: collision with root package name */
    public String f79245c;

    /* renamed from: d  reason: collision with root package name */
    public String f79246d;

    /* renamed from: e  reason: collision with root package name */
    public long f79247e;

    /* renamed from: f  reason: collision with root package name */
    public long f79248f;
    public long g;
    public long h;
    public long i;
    public String j;
    public long k;
    public boolean l;
    public String m = "unknown";
    public String n;
    public int o;
    public int p = -1;
    public int q = -1;
    public Map<String, String> r;
    public Map<String, String> s;

    public int describeContents() {
        return 0;
    }

    public UserInfoBean() {
    }

    public UserInfoBean(Parcel parcel) {
        this.f79244b = parcel.readInt();
        this.f79245c = parcel.readString();
        this.f79246d = parcel.readString();
        this.f79247e = parcel.readLong();
        this.f79248f = parcel.readLong();
        this.g = parcel.readLong();
        this.h = parcel.readLong();
        this.i = parcel.readLong();
        this.j = parcel.readString();
        this.k = parcel.readLong();
        this.l = parcel.readByte() != 1 ? false : true;
        this.m = parcel.readString();
        this.p = parcel.readInt();
        this.q = parcel.readInt();
        this.r = z.b(parcel);
        this.s = z.b(parcel);
        this.n = parcel.readString();
        this.o = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f79244b);
        parcel.writeString(this.f79245c);
        parcel.writeString(this.f79246d);
        parcel.writeLong(this.f79247e);
        parcel.writeLong(this.f79248f);
        parcel.writeLong(this.g);
        parcel.writeLong(this.h);
        parcel.writeLong(this.i);
        parcel.writeString(this.j);
        parcel.writeLong(this.k);
        parcel.writeByte(this.l ? (byte) 1 : 0);
        parcel.writeString(this.m);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
        z.b(parcel, this.r);
        z.b(parcel, this.s);
        parcel.writeString(this.n);
        parcel.writeInt(this.o);
    }
}
