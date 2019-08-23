package com.ss.android.vesdk.settings;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import com.ss.android.vesdk.VEVideoEncodeSettings;

@Keep
public class VEVideoSWEncodeSettings implements Parcelable {
    public static final Parcelable.Creator<VEVideoSWEncodeSettings> CREATOR = new Parcelable.Creator<VEVideoSWEncodeSettings>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VEVideoSWEncodeSettings[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VEVideoSWEncodeSettings(parcel);
        }
    };
    public int mBitrateMode = VEVideoEncodeSettings.c.ENCODE_BITRATE_CRF.ordinal();
    public int mBps = 4000000;
    public int mCrf = 15;
    public int mGop = 35;
    public long mMaxRate = 15000000;
    public int mPreset = a.ENCODE_LEVEL_ULTRAFAST.ordinal();
    public int mProfile = b.ENCODE_PROFILE_UNKNOWN.ordinal();

    public int describeContents() {
        return 0;
    }

    public VEVideoSWEncodeSettings() {
    }

    public String toString() {
        return "VEVideoSWEncodeSettings{mCrf=" + this.mCrf + ", mBps=" + this.mBps + ", mBitrateMode=" + this.mBitrateMode + ", mPreset=" + this.mPreset + ", mProfile=" + this.mProfile + ", mMaxRate=" + this.mMaxRate + ", mGop=" + this.mGop + '}';
    }

    protected VEVideoSWEncodeSettings(Parcel parcel) {
        this.mCrf = parcel.readInt();
        this.mPreset = parcel.readInt();
        this.mProfile = parcel.readInt();
        this.mMaxRate = parcel.readLong();
        this.mBps = parcel.readInt();
        this.mBitrateMode = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mCrf);
        parcel.writeInt(this.mPreset);
        parcel.writeInt(this.mProfile);
        parcel.writeLong(this.mMaxRate);
        parcel.writeInt(this.mBps);
        parcel.writeInt(this.mBitrateMode);
    }
}
