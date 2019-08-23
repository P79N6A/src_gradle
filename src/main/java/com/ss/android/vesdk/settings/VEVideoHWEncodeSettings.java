package com.ss.android.vesdk.settings;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

@Keep
public class VEVideoHWEncodeSettings implements Parcelable {
    public static final Parcelable.Creator<VEVideoHWEncodeSettings> CREATOR = new Parcelable.Creator<VEVideoHWEncodeSettings>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VEVideoHWEncodeSettings[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VEVideoHWEncodeSettings(parcel);
        }
    };
    public long mBitrate = 6000000;
    public int mGop = 35;
    public int mProfile = b.ENCODE_PROFILE_UNKNOWN.ordinal();

    public int describeContents() {
        return 0;
    }

    public VEVideoHWEncodeSettings() {
    }

    public String toString() {
        return "VEVideoHWEncodeSettings{mBitrate=" + this.mBitrate + ", mProfile=" + this.mProfile + ", mGop=" + this.mGop + '}';
    }

    protected VEVideoHWEncodeSettings(Parcel parcel) {
        this.mBitrate = parcel.readLong();
        this.mProfile = parcel.readInt();
        this.mGop = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mBitrate);
        parcel.writeInt(this.mProfile);
        parcel.writeInt(this.mGop);
    }
}
