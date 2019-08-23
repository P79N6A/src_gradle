package com.rocket.android.opensdkext;

import android.os.Parcel;
import android.os.Parcelable;

public class VideoPlayUrlInfo implements Parcelable {
    public static final Parcelable.Creator<VideoPlayUrlInfo> CREATOR = new Parcelable.Creator<VideoPlayUrlInfo>() {
        public final VideoPlayUrlInfo[] newArray(int i) {
            return new VideoPlayUrlInfo[i];
        }

        public final VideoPlayUrlInfo createFromParcel(Parcel parcel) {
            return new VideoPlayUrlInfo(parcel);
        }
    };
    public long expireTime;
    public String url;

    public int describeContents() {
        return 0;
    }

    public VideoPlayUrlInfo(String str) {
        this.url = str;
    }

    public VideoPlayUrlInfo(Parcel parcel) {
        this.url = parcel.readString();
        this.expireTime = parcel.readLong();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeLong(this.expireTime);
    }

    public VideoPlayUrlInfo(String str, long j) {
        this.url = str;
        this.expireTime = j;
    }
}
