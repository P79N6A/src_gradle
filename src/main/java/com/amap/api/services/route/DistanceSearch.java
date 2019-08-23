package com.amap.api.services.route;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.a.as;
import com.amap.api.services.a.be;
import com.amap.api.services.a.cm;
import com.amap.api.services.a.i;
import com.amap.api.services.a.j;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.interfaces.IDistanceSearch;
import java.util.ArrayList;
import java.util.List;

public class DistanceSearch {

    /* renamed from: a  reason: collision with root package name */
    private IDistanceSearch f7154a;

    public static class DistanceQuery implements Parcelable, Cloneable {
        public static final Parcelable.Creator<DistanceQuery> CREATOR = new Parcelable.Creator<DistanceQuery>() {
            /* renamed from: a */
            public final DistanceQuery[] newArray(int i) {
                return new DistanceQuery[i];
            }

            /* renamed from: a */
            public final DistanceQuery createFromParcel(Parcel parcel) {
                return new DistanceQuery(parcel);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        private int f7155a = 1;

        /* renamed from: b  reason: collision with root package name */
        private List<LatLonPoint> f7156b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private LatLonPoint f7157c;

        public int describeContents() {
            return 0;
        }

        public LatLonPoint getDestination() {
            return this.f7157c;
        }

        public List<LatLonPoint> getOrigins() {
            return this.f7156b;
        }

        public int getType() {
            return this.f7155a;
        }

        public DistanceQuery() {
        }

        public DistanceQuery clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e2) {
                j.a(e2, "DistanceSearch", "DistanceQueryclone");
            }
            DistanceQuery distanceQuery = new DistanceQuery();
            distanceQuery.setType(this.f7155a);
            distanceQuery.setOrigins(this.f7156b);
            distanceQuery.setDestination(this.f7157c);
            return distanceQuery;
        }

        public void setDestination(LatLonPoint latLonPoint) {
            this.f7157c = latLonPoint;
        }

        public void setType(int i) {
            this.f7155a = i;
        }

        public void setOrigins(List<LatLonPoint> list) {
            if (list != null) {
                this.f7156b = list;
            }
        }

        public void addOrigins(LatLonPoint... latLonPointArr) {
            for (LatLonPoint latLonPoint : latLonPointArr) {
                if (latLonPoint != null) {
                    this.f7156b.add(latLonPoint);
                }
            }
        }

        protected DistanceQuery(Parcel parcel) {
            this.f7155a = parcel.readInt();
            this.f7156b = parcel.createTypedArrayList(LatLonPoint.CREATOR);
            this.f7157c = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f7155a);
            parcel.writeTypedList(this.f7156b);
            parcel.writeParcelable(this.f7157c, i);
        }
    }

    public interface OnDistanceSearchListener {
        void onDistanceSearched(DistanceResult distanceResult, int i);
    }

    public DistanceResult calculateRouteDistance(DistanceQuery distanceQuery) throws AMapException {
        if (this.f7154a != null) {
            return this.f7154a.calculateRouteDistance(distanceQuery);
        }
        return null;
    }

    public void calculateRouteDistanceAsyn(DistanceQuery distanceQuery) {
        if (this.f7154a != null) {
            this.f7154a.calculateRouteDistanceAsyn(distanceQuery);
        }
    }

    public void setDistanceSearchListener(OnDistanceSearchListener onDistanceSearchListener) {
        if (this.f7154a != null) {
            this.f7154a.setDistanceSearchListener(onDistanceSearchListener);
        }
    }

    public DistanceSearch(Context context) {
        try {
            Context context2 = context;
            this.f7154a = (IDistanceSearch) cm.a(context2, i.a(true), "com.amap.api.services.dynamic.DistanceSearchWrapper", as.class, new Class[]{Context.class}, new Object[]{context});
        } catch (be unused) {
        }
        if (this.f7154a == null) {
            try {
                this.f7154a = new as(context);
            } catch (Exception unused2) {
            }
        }
    }
}
