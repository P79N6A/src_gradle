package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.route.RouteSearch;
import java.util.ArrayList;
import java.util.List;

public class WalkRouteResult extends RouteResult implements Parcelable {
    public static final Parcelable.Creator<WalkRouteResult> CREATOR = new Parcelable.Creator<WalkRouteResult>() {
        /* renamed from: a */
        public final WalkRouteResult[] newArray(int i) {
            return new WalkRouteResult[i];
        }

        /* renamed from: a */
        public final WalkRouteResult createFromParcel(Parcel parcel) {
            return new WalkRouteResult(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private List<WalkPath> f7271a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private RouteSearch.WalkRouteQuery f7272b;

    public int describeContents() {
        return 0;
    }

    public List<WalkPath> getPaths() {
        return this.f7271a;
    }

    public RouteSearch.WalkRouteQuery getWalkQuery() {
        return this.f7272b;
    }

    public WalkRouteResult() {
    }

    public void setPaths(List<WalkPath> list) {
        this.f7271a = list;
    }

    public void setWalkQuery(RouteSearch.WalkRouteQuery walkRouteQuery) {
        this.f7272b = walkRouteQuery;
    }

    public WalkRouteResult(Parcel parcel) {
        super(parcel);
        this.f7271a = parcel.createTypedArrayList(WalkPath.CREATOR);
        this.f7272b = (RouteSearch.WalkRouteQuery) parcel.readParcelable(RouteSearch.WalkRouteQuery.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.f7271a);
        parcel.writeParcelable(this.f7272b, i);
    }
}
