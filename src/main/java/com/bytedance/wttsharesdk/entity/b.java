package com.bytedance.wttsharesdk.entity;

import android.os.Parcel;
import android.os.Parcelable;

public final class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new b[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new b(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public byte[] f22934a;

    /* renamed from: b  reason: collision with root package name */
    public String f22935b;

    public final int describeContents() {
        return 0;
    }

    public b() {
    }

    public b(Parcel parcel) {
        super(parcel);
        this.f22934a = parcel.createByteArray();
        this.f22935b = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f22934a);
        parcel.writeString(this.f22935b);
    }
}
