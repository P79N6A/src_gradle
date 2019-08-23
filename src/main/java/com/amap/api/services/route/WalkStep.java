package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.List;

public class WalkStep implements Parcelable {
    public static final Parcelable.Creator<WalkStep> CREATOR = new Parcelable.Creator<WalkStep>() {
        /* renamed from: a */
        public final WalkStep[] newArray(int i) {
            return null;
        }

        /* renamed from: a */
        public final WalkStep createFromParcel(Parcel parcel) {
            return new WalkStep(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f7273a;

    /* renamed from: b  reason: collision with root package name */
    private String f7274b;

    /* renamed from: c  reason: collision with root package name */
    private String f7275c;

    /* renamed from: d  reason: collision with root package name */
    private float f7276d;

    /* renamed from: e  reason: collision with root package name */
    private float f7277e;

    /* renamed from: f  reason: collision with root package name */
    private List<LatLonPoint> f7278f = new ArrayList();
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
        return this.f7276d;
    }

    public float getDuration() {
        return this.f7277e;
    }

    public String getInstruction() {
        return this.f7273a;
    }

    public String getOrientation() {
        return this.f7274b;
    }

    public List<LatLonPoint> getPolyline() {
        return this.f7278f;
    }

    public String getRoad() {
        return this.f7275c;
    }

    public WalkStep() {
    }

    public void setAction(String str) {
        this.g = str;
    }

    public void setAssistantAction(String str) {
        this.h = str;
    }

    public void setDistance(float f2) {
        this.f7276d = f2;
    }

    public void setDuration(float f2) {
        this.f7277e = f2;
    }

    public void setInstruction(String str) {
        this.f7273a = str;
    }

    public void setOrientation(String str) {
        this.f7274b = str;
    }

    public void setPolyline(List<LatLonPoint> list) {
        this.f7278f = list;
    }

    public void setRoad(String str) {
        this.f7275c = str;
    }

    public WalkStep(Parcel parcel) {
        this.f7273a = parcel.readString();
        this.f7274b = parcel.readString();
        this.f7275c = parcel.readString();
        this.f7276d = parcel.readFloat();
        this.f7277e = parcel.readFloat();
        this.f7278f = parcel.createTypedArrayList(LatLonPoint.CREATOR);
        this.g = parcel.readString();
        this.h = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7273a);
        parcel.writeString(this.f7274b);
        parcel.writeString(this.f7275c);
        parcel.writeFloat(this.f7276d);
        parcel.writeFloat(this.f7277e);
        parcel.writeTypedList(this.f7278f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
    }
}
