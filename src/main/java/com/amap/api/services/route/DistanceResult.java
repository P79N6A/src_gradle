package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.route.DistanceSearch;
import java.util.List;

public class DistanceResult implements Parcelable {
    public static final Parcelable.Creator<DistanceResult> CREATOR = new Parcelable.Creator<DistanceResult>() {
        /* renamed from: a */
        public final DistanceResult[] newArray(int i) {
            return new DistanceResult[i];
        }

        /* renamed from: a */
        public final DistanceResult createFromParcel(Parcel parcel) {
            return new DistanceResult(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private DistanceSearch.DistanceQuery f7152a;

    /* renamed from: b  reason: collision with root package name */
    private List<DistanceItem> f7153b;

    public int describeContents() {
        return 0;
    }

    public DistanceResult() {
    }

    public DistanceSearch.DistanceQuery getDistanceQuery() {
        return this.f7152a;
    }

    public List<DistanceItem> getDistanceResults() {
        return this.f7153b;
    }

    public void setDistanceQuery(DistanceSearch.DistanceQuery distanceQuery) {
        this.f7152a = distanceQuery;
    }

    public void setDistanceResults(List<DistanceItem> list) {
        this.f7153b = list;
    }

    protected DistanceResult(Parcel parcel) {
        this.f7153b = parcel.createTypedArrayList(DistanceItem.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f7153b);
    }
}
