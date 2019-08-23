package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

public class RouteResult implements Parcelable {
    public static final Parcelable.Creator<RouteResult> CREATOR = new Parcelable.Creator<RouteResult>() {
        /* renamed from: a */
        public final RouteResult[] newArray(int i) {
            return new RouteResult[i];
        }

        /* renamed from: a */
        public final RouteResult createFromParcel(Parcel parcel) {
            return new RouteResult(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private LatLonPoint f7212a;

    /* renamed from: b  reason: collision with root package name */
    private LatLonPoint f7213b;

    public int describeContents() {
        return 0;
    }

    public RouteResult() {
    }

    public LatLonPoint getStartPos() {
        return this.f7212a;
    }

    public LatLonPoint getTargetPos() {
        return this.f7213b;
    }

    public void setStartPos(LatLonPoint latLonPoint) {
        this.f7212a = latLonPoint;
    }

    public void setTargetPos(LatLonPoint latLonPoint) {
        this.f7213b = latLonPoint;
    }

    public RouteResult(Parcel parcel) {
        this.f7212a = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.f7213b = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f7212a, i);
        parcel.writeParcelable(this.f7213b, i);
    }
}
