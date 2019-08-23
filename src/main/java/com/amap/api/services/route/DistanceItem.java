package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;

public class DistanceItem implements Parcelable {
    public static final Parcelable.Creator<DistanceItem> CREATOR = new Parcelable.Creator<DistanceItem>() {
        /* renamed from: a */
        public final DistanceItem[] newArray(int i) {
            return new DistanceItem[i];
        }

        /* renamed from: a */
        public final DistanceItem createFromParcel(Parcel parcel) {
            return new DistanceItem(parcel);
        }
    };
    public final int ERROR_CODE_NOT_IN_CHINA = 3;
    public final int ERROR_CODE_NO_DRIVE = 1;
    public final int ERROR_CODE_TOO_FAR = 2;

    /* renamed from: a  reason: collision with root package name */
    private int f7146a = 1;

    /* renamed from: b  reason: collision with root package name */
    private int f7147b = 1;

    /* renamed from: c  reason: collision with root package name */
    private float f7148c;

    /* renamed from: d  reason: collision with root package name */
    private float f7149d;

    /* renamed from: e  reason: collision with root package name */
    private String f7150e;

    /* renamed from: f  reason: collision with root package name */
    private int f7151f;

    public int describeContents() {
        return 0;
    }

    public int getDestId() {
        return this.f7147b;
    }

    public float getDistance() {
        return this.f7148c;
    }

    public float getDuration() {
        return this.f7149d;
    }

    public int getErrorCode() {
        return this.f7151f;
    }

    public String getErrorInfo() {
        return this.f7150e;
    }

    public int getOriginId() {
        return this.f7146a;
    }

    public DistanceItem() {
    }

    public void setDestId(int i) {
        this.f7147b = i;
    }

    public void setDistance(float f2) {
        this.f7148c = f2;
    }

    public void setDuration(float f2) {
        this.f7149d = f2;
    }

    public void setErrorCode(int i) {
        this.f7151f = i;
    }

    public void setErrorInfo(String str) {
        this.f7150e = str;
    }

    public void setOriginId(int i) {
        this.f7146a = i;
    }

    protected DistanceItem(Parcel parcel) {
        this.f7146a = parcel.readInt();
        this.f7147b = parcel.readInt();
        this.f7148c = parcel.readFloat();
        this.f7149d = parcel.readFloat();
        this.f7150e = parcel.readString();
        this.f7151f = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7146a);
        parcel.writeInt(this.f7147b);
        parcel.writeFloat(this.f7148c);
        parcel.writeFloat(this.f7149d);
        parcel.writeString(this.f7150e);
        parcel.writeInt(this.f7151f);
    }
}
