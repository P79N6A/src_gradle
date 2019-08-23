package com.ss.android.ugc.aweme.share.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f64708a;

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new a[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f64708a, false, 73475, new Class[]{Parcel.class}, a.class)) {
                return new a(parcel2);
            }
            return (a) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f64708a, false, 73475, new Class[]{Parcel.class}, a.class);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64702a;

    /* renamed from: b  reason: collision with root package name */
    public String f64703b;

    /* renamed from: c  reason: collision with root package name */
    public String f64704c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f64705d;

    /* renamed from: e  reason: collision with root package name */
    public int f64706e;

    /* renamed from: f  reason: collision with root package name */
    public String f64707f;
    public String g;
    public int h;
    public int i;
    public int j;
    public int k;
    public float l;
    public float m;
    public long n;
    public long o;
    public int p;
    public String q;
    public String r;
    public String s;

    public int describeContents() {
        return 0;
    }

    public a() {
    }

    public a(Parcel parcel) {
        boolean z;
        this.f64703b = parcel.readString();
        this.f64704c = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f64705d = z;
        this.f64707f = parcel.readString();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.k = parcel.readInt();
        this.l = parcel.readFloat();
        this.m = parcel.readFloat();
        this.q = parcel.readString();
        this.r = parcel.readString();
        this.s = parcel.readString();
        this.n = parcel.readLong();
        this.o = parcel.readLong();
        this.p = parcel.readInt();
        this.f64706e = parcel.readInt();
        this.g = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i2)}, this, f64702a, false, 73474, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i2)}, this, f64702a, false, 73474, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel.writeString(this.f64703b);
        parcel.writeString(this.f64704c);
        parcel.writeByte(this.f64705d ? (byte) 1 : 0);
        parcel.writeString(this.f64707f);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        parcel.writeFloat(this.l);
        parcel.writeFloat(this.m);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeLong(this.n);
        parcel.writeLong(this.o);
        parcel.writeInt(this.p);
        parcel.writeInt(this.f64706e);
        parcel.writeString(this.g);
    }
}
