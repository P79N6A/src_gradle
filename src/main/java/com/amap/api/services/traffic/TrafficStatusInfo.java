package com.amap.api.services.traffic;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import java.util.List;

public class TrafficStatusInfo implements Parcelable {
    public static final Parcelable.Creator<TrafficStatusInfo> CREATOR = new Parcelable.Creator<TrafficStatusInfo>() {
        /* renamed from: a */
        public final TrafficStatusInfo[] newArray(int i) {
            return new TrafficStatusInfo[i];
        }

        /* renamed from: a */
        public final TrafficStatusInfo createFromParcel(Parcel parcel) {
            return new TrafficStatusInfo(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f7318a;

    /* renamed from: b  reason: collision with root package name */
    private String f7319b;

    /* renamed from: c  reason: collision with root package name */
    private String f7320c;

    /* renamed from: d  reason: collision with root package name */
    private int f7321d;

    /* renamed from: e  reason: collision with root package name */
    private float f7322e;

    /* renamed from: f  reason: collision with root package name */
    private String f7323f;
    private List<LatLonPoint> g;

    public int describeContents() {
        return 0;
    }

    public TrafficStatusInfo() {
    }

    public int getAngle() {
        return this.f7321d;
    }

    public List<LatLonPoint> getCoordinates() {
        return this.g;
    }

    public String getDirection() {
        return this.f7320c;
    }

    public String getLcodes() {
        return this.f7323f;
    }

    public String getName() {
        return this.f7318a;
    }

    public float getSpeed() {
        return this.f7322e;
    }

    public String getStatus() {
        return this.f7319b;
    }

    public void setAngle(int i) {
        this.f7321d = i;
    }

    public void setCoordinates(List<LatLonPoint> list) {
        this.g = list;
    }

    public void setDirection(String str) {
        this.f7320c = str;
    }

    public void setLcodes(String str) {
        this.f7323f = str;
    }

    public void setName(String str) {
        this.f7318a = str;
    }

    public void setSpeed(float f2) {
        this.f7322e = f2;
    }

    public void setStatus(String str) {
        this.f7319b = str;
    }

    protected TrafficStatusInfo(Parcel parcel) {
        this.f7318a = parcel.readString();
        this.f7319b = parcel.readString();
        this.f7320c = parcel.readString();
        this.f7321d = parcel.readInt();
        this.f7322e = parcel.readFloat();
        this.f7323f = parcel.readString();
        this.g = parcel.readArrayList(TrafficStatusInfo.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7318a);
        parcel.writeString(this.f7319b);
        parcel.writeString(this.f7320c);
        parcel.writeInt(this.f7321d);
        parcel.writeFloat(this.f7322e);
        parcel.writeString(this.f7323f);
        parcel.writeTypedList(this.g);
    }
}
