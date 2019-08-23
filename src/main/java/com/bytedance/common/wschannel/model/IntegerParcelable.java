package com.bytedance.common.wschannel.model;

import android.os.Parcel;
import android.os.Parcelable;

public class IntegerParcelable implements Parcelable {
    public static final Parcelable.Creator<IntegerParcelable> CREATOR = new Parcelable.Creator<IntegerParcelable>() {
        public final IntegerParcelable[] newArray(int i) {
            return new IntegerParcelable[i];
        }

        public final IntegerParcelable createFromParcel(Parcel parcel) {
            return new IntegerParcelable(parcel);
        }
    };
    private final int mData;

    public int describeContents() {
        return 0;
    }

    public int getData() {
        return this.mData;
    }

    public IntegerParcelable(int i) {
        this.mData = i;
    }

    protected IntegerParcelable(Parcel parcel) {
        this.mData = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mData);
    }
}
