package com.ss.android.vesdk.settings;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public enum b implements Parcelable {
    ENCODE_PROFILE_UNKNOWN,
    ENCODE_PROFILE_BASELINE,
    ENCODE_PROFILE_MAIN,
    ENCODE_PROFILE_HIGH;
    
    public static final Parcelable.Creator<b> CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    static {
        CREATOR = new Parcelable.Creator<b>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new b[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return b.values()[parcel.readInt()];
            }
        };
    }

    public static b valueOfString(String str) {
        b bVar = ENCODE_PROFILE_UNKNOWN;
        if (TextUtils.isEmpty(str)) {
            return bVar;
        }
        if ("baseline".equals(str)) {
            return ENCODE_PROFILE_BASELINE;
        }
        if ("main".equals(str)) {
            return ENCODE_PROFILE_MAIN;
        }
        if ("high".equals(str)) {
            return ENCODE_PROFILE_HIGH;
        }
        return bVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
