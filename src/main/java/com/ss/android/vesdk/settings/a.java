package com.ss.android.vesdk.settings;

import android.os.Parcel;
import android.os.Parcelable;

public enum a implements Parcelable {
    ENCODE_LEVEL_ULTRAFAST,
    ENCODE_LEVEL_SUPERFAST,
    ENCODE_LEVEL_VERYFAST,
    ENCODE_LEVEL_FASTER,
    ENCODE_LEVEL_FAST,
    ENCODE_LEVEL_MEDIUM,
    ENCODE_LEVEL_SLOW,
    ENCODE_LEVEL_SLOWER,
    ENCODE_LEVEL_VERYSLOW,
    ENCODE_LEVEL_PLACEBO;
    
    public static final Parcelable.Creator<a> CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    static {
        CREATOR = new Parcelable.Creator<a>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return a.values()[parcel.readInt()];
            }
        };
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
