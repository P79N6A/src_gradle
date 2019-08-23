package com.bytedance.frameworks.plugin.a;

import android.os.Parcel;
import android.os.Parcelable;

public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new a[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new a(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public String f2145a;

    /* renamed from: b  reason: collision with root package name */
    public int f2146b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2147c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2148d;

    public int describeContents() {
        return 0;
    }

    public a() {
    }

    public int hashCode() {
        int i;
        if (this.f2145a != null) {
            i = this.f2145a.hashCode();
        } else {
            i = 0;
        }
        return (((((i * 31) + this.f2146b) * 31) + (this.f2147c ? 1 : 0)) * 31) + (this.f2148d ? 1 : 0);
    }

    protected a(Parcel parcel) {
        boolean z;
        this.f2145a = parcel.readString();
        this.f2146b = parcel.readInt();
        boolean z2 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f2147c = z;
        this.f2148d = parcel.readByte() != 0 ? true : z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f2146b != aVar.f2146b || this.f2147c != aVar.f2147c || this.f2148d != aVar.f2148d) {
            return false;
        }
        if (this.f2145a != null) {
            return this.f2145a.equals(aVar.f2145a);
        }
        if (aVar.f2145a == null) {
            return true;
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2145a);
        parcel.writeInt(this.f2146b);
        parcel.writeByte(this.f2147c ? (byte) 1 : 0);
        parcel.writeByte(this.f2148d ? (byte) 1 : 0);
    }
}
