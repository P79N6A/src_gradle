package com.bytedance.ttnet.hostmonitor;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;

public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new Parcelable.Creator<e>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new e[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new e(parcel, (byte) 0);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public String f22645a;

    /* renamed from: b  reason: collision with root package name */
    public int f22646b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f22647c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f22648d;

    /* renamed from: e  reason: collision with root package name */
    public a f22649e;

    /* renamed from: f  reason: collision with root package name */
    public a f22650f;

    public final int describeContents() {
        return 0;
    }

    public e() {
    }

    public final String toString() {
        return new Gson().toJson((Object) this);
    }

    public final e a(int i) {
        this.f22646b = i;
        return this;
    }

    public final e b(a aVar) {
        this.f22649e = aVar;
        return this;
    }

    public final e a(a aVar) {
        this.f22650f = aVar;
        return this;
    }

    public final e b(boolean z) {
        this.f22648d = z;
        return this;
    }

    public final e a(String str) {
        this.f22645a = str;
        return this;
    }

    public final e a(boolean z) {
        this.f22647c = z;
        return this;
    }

    private e(Parcel parcel) {
        boolean z;
        this.f22645a = parcel.readString();
        this.f22646b = parcel.readInt();
        boolean z2 = false;
        if (parcel.readInt() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f22647c = z;
        this.f22648d = parcel.readInt() == 1 ? true : z2;
        this.f22650f = a.values()[parcel.readInt()];
        this.f22649e = a.values()[parcel.readInt()];
    }

    /* synthetic */ e(Parcel parcel, byte b2) {
        this(parcel);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f22645a);
        parcel.writeInt(this.f22646b);
        parcel.writeInt(this.f22647c ? 1 : 0);
        parcel.writeInt(this.f22648d ? 1 : 0);
        parcel.writeInt(this.f22650f.ordinal());
        parcel.writeInt(this.f22649e.ordinal());
    }
}
