package com.amap.api.services.poisearch;

import android.os.Parcel;
import android.os.Parcelable;

public class IndoorData implements Parcelable {
    public static final Parcelable.Creator<IndoorData> CREATOR = new Parcelable.Creator<IndoorData>() {
        /* renamed from: a */
        public final IndoorData[] newArray(int i) {
            return new IndoorData[i];
        }

        /* renamed from: a */
        public final IndoorData createFromParcel(Parcel parcel) {
            return new IndoorData(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f7088a;

    /* renamed from: b  reason: collision with root package name */
    private int f7089b;

    /* renamed from: c  reason: collision with root package name */
    private String f7090c;

    public int describeContents() {
        return 0;
    }

    public int getFloor() {
        return this.f7089b;
    }

    public String getFloorName() {
        return this.f7090c;
    }

    public String getPoiId() {
        return this.f7088a;
    }

    public void setFloor(int i) {
        this.f7089b = i;
    }

    public void setFloorName(String str) {
        this.f7090c = str;
    }

    public void setPoiId(String str) {
        this.f7088a = str;
    }

    protected IndoorData(Parcel parcel) {
        this.f7088a = parcel.readString();
        this.f7089b = parcel.readInt();
        this.f7090c = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7088a);
        parcel.writeInt(this.f7089b);
        parcel.writeString(this.f7090c);
    }

    public IndoorData(String str, int i, String str2) {
        this.f7088a = str;
        this.f7089b = i;
        this.f7090c = str2;
    }
}
