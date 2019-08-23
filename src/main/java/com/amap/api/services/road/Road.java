package com.amap.api.services.road;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

public class Road implements Parcelable {
    public static final Parcelable.Creator<Road> CREATOR = new Parcelable.Creator<Road>() {
        /* renamed from: a */
        public final Road[] newArray(int i) {
            return null;
        }

        /* renamed from: a */
        public final Road createFromParcel(Parcel parcel) {
            return new Road(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f7126a;

    /* renamed from: b  reason: collision with root package name */
    private String f7127b;

    /* renamed from: c  reason: collision with root package name */
    private String f7128c;

    /* renamed from: d  reason: collision with root package name */
    private float f7129d;

    /* renamed from: e  reason: collision with root package name */
    private String f7130e;

    /* renamed from: f  reason: collision with root package name */
    private LatLonPoint f7131f;

    public int describeContents() {
        return 0;
    }

    public Road() {
    }

    public LatLonPoint getCenterPoint() {
        return this.f7131f;
    }

    public String getCityCode() {
        return this.f7128c;
    }

    public String getId() {
        return this.f7126a;
    }

    public String getName() {
        return this.f7127b;
    }

    public float getRoadWidth() {
        return this.f7129d;
    }

    public String getType() {
        return this.f7130e;
    }

    public void setCenterPoint(LatLonPoint latLonPoint) {
        this.f7131f = latLonPoint;
    }

    public void setCityCode(String str) {
        this.f7128c = str;
    }

    public void setId(String str) {
        this.f7126a = str;
    }

    public void setName(String str) {
        this.f7127b = str;
    }

    public void setRoadWidth(float f2) {
        this.f7129d = f2;
    }

    public void setType(String str) {
        this.f7130e = str;
    }

    protected Road(Parcel parcel) {
        this.f7126a = parcel.readString();
        this.f7127b = parcel.readString();
        this.f7128c = parcel.readString();
        this.f7129d = parcel.readFloat();
        this.f7130e = parcel.readString();
        this.f7131f = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
    }

    public Road(String str, String str2) {
        this.f7126a = str;
        this.f7127b = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7126a);
        parcel.writeString(this.f7127b);
        parcel.writeString(this.f7128c);
        parcel.writeFloat(this.f7129d);
        parcel.writeString(this.f7130e);
        parcel.writeValue(this.f7131f);
    }
}
