package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public class DrivePath extends Path implements Parcelable {
    public static final Parcelable.Creator<DrivePath> CREATOR = new Parcelable.Creator<DrivePath>() {
        /* renamed from: a */
        public final DrivePath[] newArray(int i) {
            return null;
        }

        /* renamed from: a */
        public final DrivePath createFromParcel(Parcel parcel) {
            return new DrivePath(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f7162a;

    /* renamed from: b  reason: collision with root package name */
    private float f7163b;

    /* renamed from: c  reason: collision with root package name */
    private float f7164c;

    /* renamed from: d  reason: collision with root package name */
    private int f7165d;

    /* renamed from: e  reason: collision with root package name */
    private List<DriveStep> f7166e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private int f7167f;

    public int describeContents() {
        return 0;
    }

    public int getRestriction() {
        return this.f7167f;
    }

    public List<DriveStep> getSteps() {
        return this.f7166e;
    }

    public String getStrategy() {
        return this.f7162a;
    }

    public float getTollDistance() {
        return this.f7164c;
    }

    public float getTolls() {
        return this.f7163b;
    }

    public int getTotalTrafficlights() {
        return this.f7165d;
    }

    public DrivePath() {
    }

    public void setRestriction(int i) {
        this.f7167f = i;
    }

    public void setSteps(List<DriveStep> list) {
        this.f7166e = list;
    }

    public void setStrategy(String str) {
        this.f7162a = str;
    }

    public void setTollDistance(float f2) {
        this.f7164c = f2;
    }

    public void setTolls(float f2) {
        this.f7163b = f2;
    }

    public void setTotalTrafficlights(int i) {
        this.f7165d = i;
    }

    public DrivePath(Parcel parcel) {
        super(parcel);
        this.f7162a = parcel.readString();
        this.f7163b = parcel.readFloat();
        this.f7164c = parcel.readFloat();
        this.f7166e = parcel.createTypedArrayList(DriveStep.CREATOR);
        this.f7165d = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f7162a);
        parcel.writeFloat(this.f7163b);
        parcel.writeFloat(this.f7164c);
        parcel.writeTypedList(this.f7166e);
        parcel.writeInt(this.f7165d);
    }
}
