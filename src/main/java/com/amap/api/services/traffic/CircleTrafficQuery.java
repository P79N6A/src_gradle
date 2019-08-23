package com.amap.api.services.traffic;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.a.j;
import com.amap.api.services.core.LatLonPoint;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public class CircleTrafficQuery extends a implements Parcelable, Cloneable {
    public static final Parcelable.Creator<CircleTrafficQuery> CREATOR = new Parcelable.Creator<CircleTrafficQuery>() {
        /* renamed from: a */
        public final CircleTrafficQuery[] newArray(int i) {
            return new CircleTrafficQuery[i];
        }

        /* renamed from: a */
        public final CircleTrafficQuery createFromParcel(Parcel parcel) {
            return new CircleTrafficQuery(parcel);
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private LatLonPoint f7307b;

    /* renamed from: c  reason: collision with root package name */
    private int f7308c = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;

    public int describeContents() {
        return 0;
    }

    public LatLonPoint getCenterPoint() {
        return this.f7307b;
    }

    public int getRadius() {
        return this.f7308c;
    }

    public /* bridge */ /* synthetic */ int getLevel() {
        return super.getLevel();
    }

    public CircleTrafficQuery clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e2) {
            j.a(e2, "CircleTrafficQuery", "CircleTrafficQueryClone");
        }
        return new CircleTrafficQuery(this.f7307b, this.f7308c, this.f7327a);
    }

    public void setCenterPoint(LatLonPoint latLonPoint) {
        this.f7307b = latLonPoint;
    }

    public /* bridge */ /* synthetic */ void setLevel(int i) {
        super.setLevel(i);
    }

    public void setRadius(int i) {
        this.f7308c = i;
    }

    protected CircleTrafficQuery(Parcel parcel) {
        this.f7307b = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.f7308c = parcel.readInt();
        this.f7327a = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f7307b, i);
        parcel.writeInt(this.f7308c);
        parcel.writeInt(this.f7327a);
    }

    public CircleTrafficQuery(LatLonPoint latLonPoint, int i, int i2) {
        this.f7307b = latLonPoint;
        this.f7308c = i;
        this.f7327a = i2;
    }
}
