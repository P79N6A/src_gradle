package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;

public class RailwaySpace implements Parcelable {
    public static final Parcelable.Creator<RailwaySpace> CREATOR = new Parcelable.Creator<RailwaySpace>() {
        /* renamed from: a */
        public final RailwaySpace[] newArray(int i) {
            return new RailwaySpace[i];
        }

        /* renamed from: a */
        public final RailwaySpace createFromParcel(Parcel parcel) {
            return new RailwaySpace(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f7181a;

    /* renamed from: b  reason: collision with root package name */
    private float f7182b;

    public int describeContents() {
        return 0;
    }

    public String getCode() {
        return this.f7181a;
    }

    public float getCost() {
        return this.f7182b;
    }

    protected RailwaySpace(Parcel parcel) {
        this.f7181a = parcel.readString();
        this.f7182b = parcel.readFloat();
    }

    public RailwaySpace(String str, float f2) {
        this.f7181a = str;
        this.f7182b = f2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7181a);
        parcel.writeFloat(this.f7182b);
    }
}
