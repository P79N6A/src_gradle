package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

public class RouteBusWalkItem extends WalkPath implements Parcelable {
    public static final Parcelable.Creator<RouteBusWalkItem> CREATOR = new Parcelable.Creator<RouteBusWalkItem>() {
        /* renamed from: a */
        public final RouteBusWalkItem[] newArray(int i) {
            return null;
        }

        /* renamed from: a */
        public final RouteBusWalkItem createFromParcel(Parcel parcel) {
            return new RouteBusWalkItem(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private LatLonPoint f7204a;

    /* renamed from: b  reason: collision with root package name */
    private LatLonPoint f7205b;

    public int describeContents() {
        return 0;
    }

    public RouteBusWalkItem() {
    }

    public LatLonPoint getDestination() {
        return this.f7205b;
    }

    public LatLonPoint getOrigin() {
        return this.f7204a;
    }

    public void setDestination(LatLonPoint latLonPoint) {
        this.f7205b = latLonPoint;
    }

    public void setOrigin(LatLonPoint latLonPoint) {
        this.f7204a = latLonPoint;
    }

    public RouteBusWalkItem(Parcel parcel) {
        super(parcel);
        this.f7204a = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.f7205b = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f7204a, i);
        parcel.writeParcelable(this.f7205b, i);
    }
}
