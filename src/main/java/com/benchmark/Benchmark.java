package com.benchmark;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;

@Keep
public class Benchmark implements Parcelable {
    public static final Parcelable.Creator<Benchmark> CREATOR = new Parcelable.Creator<Benchmark>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new Benchmark[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new Benchmark(parcel);
        }
    };
    public long[] consumedTime;
    public String failedReason;
    @SerializedName("h264_video_url")
    public String h264VideoUrl;
    @SerializedName("h265_video_url")
    public String h265VideoUrl;
    @SerializedName("id")
    public int id;
    @SerializedName("image_url")
    public String imageUrl;
    @SerializedName("inner_times")
    public int innerTimes;
    @SerializedName("name")
    public String name;
    @SerializedName("times")
    public int times;
    @SerializedName("when")
    public int when;

    public int describeContents() {
        return 0;
    }

    public Benchmark() {
    }

    public void reset() {
        this.consumedTime = null;
        this.failedReason = null;
    }

    protected Benchmark(Parcel parcel) {
        this.id = parcel.readInt();
        this.name = parcel.readString();
        this.when = parcel.readInt();
        this.times = parcel.readInt();
        this.innerTimes = parcel.readInt();
        this.imageUrl = parcel.readString();
        this.h264VideoUrl = parcel.readString();
        this.h265VideoUrl = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeInt(this.when);
        parcel.writeInt(this.times);
        parcel.writeInt(this.innerTimes);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.h264VideoUrl);
        parcel.writeString(this.h265VideoUrl);
    }
}
