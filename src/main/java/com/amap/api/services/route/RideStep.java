package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.List;

public class RideStep implements Parcelable {
    public static final Parcelable.Creator<RideStep> CREATOR = new Parcelable.Creator<RideStep>() {
        /* renamed from: a */
        public final RideStep[] newArray(int i) {
            return new RideStep[i];
        }

        /* renamed from: a */
        public final RideStep createFromParcel(Parcel parcel) {
            return new RideStep(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f7192a;

    /* renamed from: b  reason: collision with root package name */
    private String f7193b;

    /* renamed from: c  reason: collision with root package name */
    private String f7194c;

    /* renamed from: d  reason: collision with root package name */
    private float f7195d;

    /* renamed from: e  reason: collision with root package name */
    private float f7196e;

    /* renamed from: f  reason: collision with root package name */
    private List<LatLonPoint> f7197f = new ArrayList();
    private String g;
    private String h;

    public int describeContents() {
        return 0;
    }

    public String getAction() {
        return this.g;
    }

    public String getAssistantAction() {
        return this.h;
    }

    public float getDistance() {
        return this.f7195d;
    }

    public float getDuration() {
        return this.f7196e;
    }

    public String getInstruction() {
        return this.f7192a;
    }

    public String getOrientation() {
        return this.f7193b;
    }

    public List<LatLonPoint> getPolyline() {
        return this.f7197f;
    }

    public String getRoad() {
        return this.f7194c;
    }

    public RideStep() {
    }

    public void setAction(String str) {
        this.g = str;
    }

    public void setAssistantAction(String str) {
        this.h = str;
    }

    public void setDistance(float f2) {
        this.f7195d = f2;
    }

    public void setDuration(float f2) {
        this.f7196e = f2;
    }

    public void setInstruction(String str) {
        this.f7192a = str;
    }

    public void setOrientation(String str) {
        this.f7193b = str;
    }

    public void setPolyline(List<LatLonPoint> list) {
        this.f7197f = list;
    }

    public void setRoad(String str) {
        this.f7194c = str;
    }

    protected RideStep(Parcel parcel) {
        this.f7192a = parcel.readString();
        this.f7193b = parcel.readString();
        this.f7194c = parcel.readString();
        this.f7195d = parcel.readFloat();
        this.f7196e = parcel.readFloat();
        this.f7197f = parcel.createTypedArrayList(LatLonPoint.CREATOR);
        this.g = parcel.readString();
        this.h = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7192a);
        parcel.writeString(this.f7193b);
        parcel.writeString(this.f7194c);
        parcel.writeFloat(this.f7195d);
        parcel.writeFloat(this.f7196e);
        parcel.writeTypedList(this.f7197f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
    }
}
