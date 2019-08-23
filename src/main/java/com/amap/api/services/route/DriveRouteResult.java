package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.route.RouteSearch;
import java.util.ArrayList;
import java.util.List;

public class DriveRouteResult extends RouteResult implements Parcelable {
    public static final Parcelable.Creator<DriveRouteResult> CREATOR = new Parcelable.Creator<DriveRouteResult>() {
        /* renamed from: a */
        public final DriveRouteResult[] newArray(int i) {
            return new DriveRouteResult[i];
        }

        /* renamed from: a */
        public final DriveRouteResult createFromParcel(Parcel parcel) {
            return new DriveRouteResult(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private float f7168a;

    /* renamed from: b  reason: collision with root package name */
    private List<DrivePath> f7169b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private RouteSearch.DriveRouteQuery f7170c;

    public int describeContents() {
        return 0;
    }

    public RouteSearch.DriveRouteQuery getDriveQuery() {
        return this.f7170c;
    }

    public List<DrivePath> getPaths() {
        return this.f7169b;
    }

    public float getTaxiCost() {
        return this.f7168a;
    }

    public DriveRouteResult() {
    }

    public void setDriveQuery(RouteSearch.DriveRouteQuery driveRouteQuery) {
        this.f7170c = driveRouteQuery;
    }

    public void setPaths(List<DrivePath> list) {
        this.f7169b = list;
    }

    public void setTaxiCost(float f2) {
        this.f7168a = f2;
    }

    public DriveRouteResult(Parcel parcel) {
        super(parcel);
        this.f7168a = parcel.readFloat();
        this.f7169b = parcel.createTypedArrayList(DrivePath.CREATOR);
        this.f7170c = (RouteSearch.DriveRouteQuery) parcel.readParcelable(RouteSearch.DriveRouteQuery.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.f7168a);
        parcel.writeTypedList(this.f7169b);
        parcel.writeParcelable(this.f7170c, i);
    }
}
