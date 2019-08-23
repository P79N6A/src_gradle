package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class TruckPath implements Parcelable {
    public static final Parcelable.Creator<TruckPath> CREATOR = new Parcelable.Creator<TruckPath>() {
        /* renamed from: a */
        public final TruckPath[] newArray(int i) {
            return new TruckPath[i];
        }

        /* renamed from: a */
        public final TruckPath createFromParcel(Parcel parcel) {
            return new TruckPath(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private float f7254a;

    /* renamed from: b  reason: collision with root package name */
    private long f7255b;

    /* renamed from: c  reason: collision with root package name */
    private String f7256c;

    /* renamed from: d  reason: collision with root package name */
    private float f7257d;

    /* renamed from: e  reason: collision with root package name */
    private float f7258e;

    /* renamed from: f  reason: collision with root package name */
    private int f7259f;
    private int g;
    private List<TruckStep> h;

    public int describeContents() {
        return 0;
    }

    public TruckPath() {
    }

    public float getDistance() {
        return this.f7254a;
    }

    public long getDuration() {
        return this.f7255b;
    }

    public int getRestriction() {
        return this.g;
    }

    public List<TruckStep> getSteps() {
        return this.h;
    }

    public String getStrategy() {
        return this.f7256c;
    }

    public float getTollDistance() {
        return this.f7258e;
    }

    public float getTolls() {
        return this.f7257d;
    }

    public int getTotalTrafficlights() {
        return this.f7259f;
    }

    public void setDistance(float f2) {
        this.f7254a = f2;
    }

    public void setDuration(long j) {
        this.f7255b = j;
    }

    public void setRestriction(int i) {
        this.g = i;
    }

    public void setSteps(List<TruckStep> list) {
        this.h = list;
    }

    public void setStrategy(String str) {
        this.f7256c = str;
    }

    public void setTollDistance(float f2) {
        this.f7258e = f2;
    }

    public void setTolls(float f2) {
        this.f7257d = f2;
    }

    public void setTotalTrafficlights(int i) {
        this.f7259f = i;
    }

    protected TruckPath(Parcel parcel) {
        this.f7254a = parcel.readFloat();
        this.f7255b = parcel.readLong();
        this.f7256c = parcel.readString();
        this.f7257d = parcel.readFloat();
        this.f7258e = parcel.readFloat();
        this.f7259f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.createTypedArrayList(TruckStep.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f7254a);
        parcel.writeLong(this.f7255b);
        parcel.writeString(this.f7256c);
        parcel.writeFloat(this.f7257d);
        parcel.writeFloat(this.f7258e);
        parcel.writeInt(this.f7259f);
        parcel.writeInt(this.g);
        parcel.writeTypedList(this.h);
    }
}
