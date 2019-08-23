package com.ss.android.ugc.aweme.music.b.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Locale;

public class a implements Parcelable, Comparable<a> {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f56317a;

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new a[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f56317a, false, 60005, new Class[]{Parcel.class}, a.class)) {
                return new a(parcel2);
            }
            return (a) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f56317a, false, 60005, new Class[]{Parcel.class}, a.class);
        }
    };

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f56313c;

    /* renamed from: d  reason: collision with root package name */
    public long f56314d;

    /* renamed from: e  reason: collision with root package name */
    public String f56315e;

    /* renamed from: f  reason: collision with root package name */
    public long f56316f;
    public int g;
    public long h;
    public long i;
    public String j;
    public String k;
    public int l;
    public int m;
    public double n;
    public double o;

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, f56313c, false, 60001, new Class[0], Integer.TYPE)) {
            return Long.valueOf(this.f56314d).hashCode();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f56313c, false, 60001, new Class[0], Integer.TYPE)).intValue();
    }

    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f56313c, false, 60003, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f56313c, false, 60003, new Class[0], String.class);
        } else if (this.n == 0.0d || this.o == 0.0d) {
            return "";
        } else {
            return String.format(Locale.US, "%.6f", new Object[]{Double.valueOf(this.o)}) + "," + String.format(Locale.US, "%.6f", new Object[]{Double.valueOf(this.n)});
        }
    }

    public a(long j2) {
        this.f56314d = j2;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        a aVar = (a) obj;
        if (this.f56316f > aVar.f56316f) {
            return -1;
        }
        if (this.f56316f < aVar.f56316f) {
            return 1;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a) || obj == null || this.f56314d != ((a) obj).f56314d) {
            return false;
        }
        return true;
    }

    public a(Parcel parcel) {
        this.f56314d = parcel.readLong();
        this.f56315e = parcel.readString();
        this.f56316f = parcel.readLong();
        this.g = parcel.readInt();
        this.h = parcel.readLong();
        this.i = parcel.readLong();
        this.j = parcel.readString();
        this.k = parcel.readString();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
        this.n = parcel.readDouble();
        this.o = parcel.readDouble();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i2)}, this, f56313c, false, 60004, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i2)}, this, f56313c, false, 60004, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel.writeLong(this.f56314d);
        parcel.writeString(this.f56315e);
        parcel.writeLong(this.f56316f);
        parcel.writeInt(this.g);
        parcel.writeLong(this.h);
        parcel.writeLong(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        parcel.writeDouble(this.n);
        parcel.writeDouble(this.o);
    }
}
