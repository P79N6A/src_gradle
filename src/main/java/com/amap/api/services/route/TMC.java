package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.List;

public class TMC implements Parcelable {
    public static final Parcelable.Creator<TMC> CREATOR = new Parcelable.Creator<TMC>() {
        /* renamed from: a */
        public final TMC[] newArray(int i) {
            return null;
        }

        /* renamed from: a */
        public final TMC createFromParcel(Parcel parcel) {
            return new TMC(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private int f7245a;

    /* renamed from: b  reason: collision with root package name */
    private String f7246b;

    /* renamed from: c  reason: collision with root package name */
    private List<LatLonPoint> f7247c = new ArrayList();

    public int describeContents() {
        return 0;
    }

    public int getDistance() {
        return this.f7245a;
    }

    public List<LatLonPoint> getPolyline() {
        return this.f7247c;
    }

    public String getStatus() {
        return this.f7246b;
    }

    public TMC() {
    }

    public void setDistance(int i) {
        this.f7245a = i;
    }

    public void setPolyline(List<LatLonPoint> list) {
        this.f7247c = list;
    }

    public void setStatus(String str) {
        this.f7246b = str;
    }

    public TMC(Parcel parcel) {
        this.f7245a = parcel.readInt();
        this.f7246b = parcel.readString();
        this.f7247c = parcel.createTypedArrayList(LatLonPoint.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7245a);
        parcel.writeString(this.f7246b);
        parcel.writeTypedList(this.f7247c);
    }
}
