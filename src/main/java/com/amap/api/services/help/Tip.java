package com.amap.api.services.help;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

public class Tip implements Parcelable {
    public static final Parcelable.Creator<Tip> CREATOR = new Parcelable.Creator<Tip>() {
        /* renamed from: a */
        public final Tip[] newArray(int i) {
            return null;
        }

        /* renamed from: a */
        public final Tip createFromParcel(Parcel parcel) {
            return new Tip(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f7063a;

    /* renamed from: b  reason: collision with root package name */
    private LatLonPoint f7064b;

    /* renamed from: c  reason: collision with root package name */
    private String f7065c;

    /* renamed from: d  reason: collision with root package name */
    private String f7066d;

    /* renamed from: e  reason: collision with root package name */
    private String f7067e;

    /* renamed from: f  reason: collision with root package name */
    private String f7068f;
    private String g;

    public int describeContents() {
        return 0;
    }

    public Tip() {
    }

    public String getAdcode() {
        return this.f7067e;
    }

    public String getAddress() {
        return this.f7068f;
    }

    public String getDistrict() {
        return this.f7066d;
    }

    public String getName() {
        return this.f7065c;
    }

    public String getPoiID() {
        return this.f7063a;
    }

    public LatLonPoint getPoint() {
        return this.f7064b;
    }

    public String getTypeCode() {
        return this.g;
    }

    public String toString() {
        return "name:" + this.f7065c + " district:" + this.f7066d + " adcode:" + this.f7067e;
    }

    public void setAdcode(String str) {
        this.f7067e = str;
    }

    public void setAddress(String str) {
        this.f7068f = str;
    }

    public void setDistrict(String str) {
        this.f7066d = str;
    }

    public void setID(String str) {
        this.f7063a = str;
    }

    public void setName(String str) {
        this.f7065c = str;
    }

    public void setPostion(LatLonPoint latLonPoint) {
        this.f7064b = latLonPoint;
    }

    public void setTypeCode(String str) {
        this.g = str;
    }

    private Tip(Parcel parcel) {
        this.f7065c = parcel.readString();
        this.f7067e = parcel.readString();
        this.f7066d = parcel.readString();
        this.f7063a = parcel.readString();
        this.f7064b = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.f7068f = parcel.readString();
        this.g = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7065c);
        parcel.writeString(this.f7067e);
        parcel.writeString(this.f7066d);
        parcel.writeString(this.f7063a);
        parcel.writeValue(this.f7064b);
        parcel.writeString(this.f7068f);
        parcel.writeString(this.g);
    }
}
