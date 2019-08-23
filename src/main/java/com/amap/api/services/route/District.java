package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;

public class District implements Parcelable {
    public static final Parcelable.Creator<District> CREATOR = new Parcelable.Creator<District>() {
        /* renamed from: a */
        public final District[] newArray(int i) {
            return null;
        }

        /* renamed from: a */
        public final District createFromParcel(Parcel parcel) {
            return new District(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f7158a;

    /* renamed from: b  reason: collision with root package name */
    private String f7159b;

    public int describeContents() {
        return 0;
    }

    public District() {
    }

    public String getDistrictAdcode() {
        return this.f7159b;
    }

    public String getDistrictName() {
        return this.f7158a;
    }

    public void setDistrictAdcode(String str) {
        this.f7159b = str;
    }

    public void setDistrictName(String str) {
        this.f7158a = str;
    }

    public District(Parcel parcel) {
        this.f7158a = parcel.readString();
        this.f7159b = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7158a);
        parcel.writeString(this.f7159b);
    }
}
