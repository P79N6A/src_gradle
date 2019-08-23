package com.bytedance.wttsharesdk.entity;

import android.os.Parcel;
import android.os.Parcelable;

public final class e extends a {
    public static final Parcelable.Creator<e> CREATOR = new Parcelable.Creator<e>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new e[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new e(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public String f22938a;

    public final int describeContents() {
        return 0;
    }

    public e() {
    }

    public e(Parcel parcel) {
        super(parcel);
        this.f22938a = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f22938a);
    }
}
