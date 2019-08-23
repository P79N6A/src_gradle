package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;

public class Path implements Parcelable {
    public static final Parcelable.Creator<Path> CREATOR = new Parcelable.Creator<Path>() {
        /* renamed from: a */
        public final Path[] newArray(int i) {
            return null;
        }

        /* renamed from: a */
        public final Path createFromParcel(Parcel parcel) {
            return new Path(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private float f7177a;

    /* renamed from: b  reason: collision with root package name */
    private long f7178b;

    public int describeContents() {
        return 0;
    }

    public Path() {
    }

    public float getDistance() {
        return this.f7177a;
    }

    public long getDuration() {
        return this.f7178b;
    }

    public void setDistance(float f2) {
        this.f7177a = f2;
    }

    public void setDuration(long j) {
        this.f7178b = j;
    }

    public Path(Parcel parcel) {
        this.f7177a = parcel.readFloat();
        this.f7178b = parcel.readLong();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f7177a);
        parcel.writeLong(this.f7178b);
    }
}
