package com.ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;

public class aj implements Parcelable {
    public static final Parcelable.Creator<aj> CREATOR = new Parcelable.Creator<aj>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new aj[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new aj(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public int f77890a = 720;

    /* renamed from: b  reason: collision with root package name */
    public int f77891b = 1280;

    public int describeContents() {
        return 0;
    }

    protected aj(Parcel parcel) {
        this.f77890a = parcel.readInt();
        this.f77891b = parcel.readInt();
    }

    public aj(int i, int i2) {
        this.f77890a = i;
        this.f77891b = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f77890a);
        parcel.writeInt(this.f77891b);
    }
}
