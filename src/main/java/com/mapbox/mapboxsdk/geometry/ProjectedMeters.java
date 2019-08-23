package com.mapbox.mapboxsdk.geometry;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

public class ProjectedMeters implements Parcelable {
    public static final Parcelable.Creator<ProjectedMeters> CREATOR = new Parcelable.Creator<ProjectedMeters>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ProjectedMeters[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ProjectedMeters(parcel, (byte) 0);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private double f26489a;

    /* renamed from: b  reason: collision with root package name */
    private double f26490b;

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f26490b);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f26489a);
        return (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    public String toString() {
        return "ProjectedMeters [northing=" + this.f26489a + ", easting=" + this.f26490b + "]";
    }

    private ProjectedMeters(Parcel parcel) {
        this.f26489a = parcel.readDouble();
        this.f26490b = parcel.readDouble();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProjectedMeters projectedMeters = (ProjectedMeters) obj;
        if (Double.compare(projectedMeters.f26490b, this.f26490b) == 0 && Double.compare(projectedMeters.f26489a, this.f26489a) == 0) {
            return true;
        }
        return false;
    }

    /* synthetic */ ProjectedMeters(Parcel parcel, byte b2) {
        this(parcel);
    }

    @Keep
    public ProjectedMeters(double d2, double d3) {
        this.f26489a = d2;
        this.f26490b = d3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f26489a);
        parcel.writeDouble(this.f26490b);
    }
}
