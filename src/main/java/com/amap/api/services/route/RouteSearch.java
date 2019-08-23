package com.amap.api.services.route;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.a.az;
import com.amap.api.services.a.be;
import com.amap.api.services.a.cm;
import com.amap.api.services.a.i;
import com.amap.api.services.a.j;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.interfaces.IRouteSearch;
import java.util.ArrayList;
import java.util.List;

public class RouteSearch {

    /* renamed from: a  reason: collision with root package name */
    private IRouteSearch f7214a;

    public static class BusRouteQuery implements Parcelable, Cloneable {
        public static final Parcelable.Creator<BusRouteQuery> CREATOR = new Parcelable.Creator<BusRouteQuery>() {
            /* renamed from: a */
            public final BusRouteQuery[] newArray(int i) {
                return new BusRouteQuery[i];
            }

            /* renamed from: a */
            public final BusRouteQuery createFromParcel(Parcel parcel) {
                return new BusRouteQuery(parcel);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        private FromAndTo f7215a;

        /* renamed from: b  reason: collision with root package name */
        private int f7216b;

        /* renamed from: c  reason: collision with root package name */
        private String f7217c;

        /* renamed from: d  reason: collision with root package name */
        private String f7218d;

        /* renamed from: e  reason: collision with root package name */
        private int f7219e;

        public int describeContents() {
            return 0;
        }

        public BusRouteQuery() {
        }

        public String getCity() {
            return this.f7217c;
        }

        public String getCityd() {
            return this.f7218d;
        }

        public FromAndTo getFromAndTo() {
            return this.f7215a;
        }

        public int getMode() {
            return this.f7216b;
        }

        public int getNightFlag() {
            return this.f7219e;
        }

        public BusRouteQuery clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e2) {
                j.a(e2, "RouteSearch", "BusRouteQueryclone");
            }
            BusRouteQuery busRouteQuery = new BusRouteQuery(this.f7215a, this.f7216b, this.f7217c, this.f7219e);
            busRouteQuery.setCityd(this.f7218d);
            return busRouteQuery;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            if (this.f7217c == null) {
                i = 0;
            } else {
                i = this.f7217c.hashCode();
            }
            int i4 = (i + 31) * 31;
            if (this.f7215a == null) {
                i2 = 0;
            } else {
                i2 = this.f7215a.hashCode();
            }
            int i5 = (((((i4 + i2) * 31) + this.f7216b) * 31) + this.f7219e) * 31;
            if (this.f7218d != null) {
                i3 = this.f7218d.hashCode();
            }
            return i5 + i3;
        }

        public void setCityd(String str) {
            this.f7218d = str;
        }

        public BusRouteQuery(Parcel parcel) {
            this.f7215a = (FromAndTo) parcel.readParcelable(FromAndTo.class.getClassLoader());
            this.f7216b = parcel.readInt();
            this.f7217c = parcel.readString();
            this.f7219e = parcel.readInt();
            this.f7218d = parcel.readString();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            BusRouteQuery busRouteQuery = (BusRouteQuery) obj;
            if (this.f7217c == null) {
                if (busRouteQuery.f7217c != null) {
                    return false;
                }
            } else if (!this.f7217c.equals(busRouteQuery.f7217c)) {
                return false;
            }
            if (this.f7218d == null) {
                if (busRouteQuery.f7218d != null) {
                    return false;
                }
            } else if (!this.f7218d.equals(busRouteQuery.f7218d)) {
                return false;
            }
            if (this.f7215a == null) {
                if (busRouteQuery.f7215a != null) {
                    return false;
                }
            } else if (!this.f7215a.equals(busRouteQuery.f7215a)) {
                return false;
            }
            if (this.f7216b == busRouteQuery.f7216b && this.f7219e == busRouteQuery.f7219e) {
                return true;
            }
            return false;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f7215a, i);
            parcel.writeInt(this.f7216b);
            parcel.writeString(this.f7217c);
            parcel.writeInt(this.f7219e);
            parcel.writeString(this.f7218d);
        }

        public BusRouteQuery(FromAndTo fromAndTo, int i, String str, int i2) {
            this.f7215a = fromAndTo;
            this.f7216b = i;
            this.f7217c = str;
            this.f7219e = i2;
        }
    }

    public static class DriveRouteQuery implements Parcelable, Cloneable {
        public static final Parcelable.Creator<DriveRouteQuery> CREATOR = new Parcelable.Creator<DriveRouteQuery>() {
            /* renamed from: a */
            public final DriveRouteQuery[] newArray(int i) {
                return new DriveRouteQuery[i];
            }

            /* renamed from: a */
            public final DriveRouteQuery createFromParcel(Parcel parcel) {
                return new DriveRouteQuery(parcel);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        private FromAndTo f7220a;

        /* renamed from: b  reason: collision with root package name */
        private int f7221b;

        /* renamed from: c  reason: collision with root package name */
        private List<LatLonPoint> f7222c;

        /* renamed from: d  reason: collision with root package name */
        private List<List<LatLonPoint>> f7223d;

        /* renamed from: e  reason: collision with root package name */
        private String f7224e;

        public int describeContents() {
            return 0;
        }

        public DriveRouteQuery() {
        }

        public String getAvoidRoad() {
            return this.f7224e;
        }

        public List<List<LatLonPoint>> getAvoidpolygons() {
            return this.f7223d;
        }

        public FromAndTo getFromAndTo() {
            return this.f7220a;
        }

        public int getMode() {
            return this.f7221b;
        }

        public List<LatLonPoint> getPassedByPoints() {
            return this.f7222c;
        }

        public boolean hasAvoidRoad() {
            if (j.a(getAvoidRoad())) {
                return false;
            }
            return true;
        }

        public boolean hasAvoidpolygons() {
            if (j.a(getAvoidpolygonsStr())) {
                return false;
            }
            return true;
        }

        public boolean hasPassPoint() {
            if (j.a(getPassedPointStr())) {
                return false;
            }
            return true;
        }

        public DriveRouteQuery clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e2) {
                j.a(e2, "RouteSearch", "DriveRouteQueryclone");
            }
            DriveRouteQuery driveRouteQuery = new DriveRouteQuery(this.f7220a, this.f7221b, this.f7222c, this.f7223d, this.f7224e);
            return driveRouteQuery;
        }

        public String getAvoidpolygonsStr() {
            StringBuffer stringBuffer = new StringBuffer();
            if (this.f7223d == null || this.f7223d.size() == 0) {
                return null;
            }
            for (int i = 0; i < this.f7223d.size(); i++) {
                List list = this.f7223d.get(i);
                for (int i2 = 0; i2 < list.size(); i2++) {
                    LatLonPoint latLonPoint = (LatLonPoint) list.get(i2);
                    stringBuffer.append(latLonPoint.getLongitude());
                    stringBuffer.append(",");
                    stringBuffer.append(latLonPoint.getLatitude());
                    if (i2 < list.size() - 1) {
                        stringBuffer.append(";");
                    }
                }
                if (i < this.f7223d.size() - 1) {
                    stringBuffer.append("|");
                }
            }
            return stringBuffer.toString();
        }

        public String getPassedPointStr() {
            StringBuffer stringBuffer = new StringBuffer();
            if (this.f7222c == null || this.f7222c.size() == 0) {
                return null;
            }
            for (int i = 0; i < this.f7222c.size(); i++) {
                LatLonPoint latLonPoint = this.f7222c.get(i);
                stringBuffer.append(latLonPoint.getLongitude());
                stringBuffer.append(",");
                stringBuffer.append(latLonPoint.getLatitude());
                if (i < this.f7222c.size() - 1) {
                    stringBuffer.append(";");
                }
            }
            return stringBuffer.toString();
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (this.f7224e == null) {
                i = 0;
            } else {
                i = this.f7224e.hashCode();
            }
            int i5 = (i + 31) * 31;
            if (this.f7223d == null) {
                i2 = 0;
            } else {
                i2 = this.f7223d.hashCode();
            }
            int i6 = (i5 + i2) * 31;
            if (this.f7220a == null) {
                i3 = 0;
            } else {
                i3 = this.f7220a.hashCode();
            }
            int i7 = (((i6 + i3) * 31) + this.f7221b) * 31;
            if (this.f7222c != null) {
                i4 = this.f7222c.hashCode();
            }
            return i7 + i4;
        }

        public DriveRouteQuery(Parcel parcel) {
            this.f7220a = (FromAndTo) parcel.readParcelable(FromAndTo.class.getClassLoader());
            this.f7221b = parcel.readInt();
            this.f7222c = parcel.createTypedArrayList(LatLonPoint.CREATOR);
            int readInt = parcel.readInt();
            if (readInt == 0) {
                this.f7223d = null;
            } else {
                this.f7223d = new ArrayList();
            }
            for (int i = 0; i < readInt; i++) {
                this.f7223d.add(parcel.createTypedArrayList(LatLonPoint.CREATOR));
            }
            this.f7224e = parcel.readString();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            DriveRouteQuery driveRouteQuery = (DriveRouteQuery) obj;
            if (this.f7224e == null) {
                if (driveRouteQuery.f7224e != null) {
                    return false;
                }
            } else if (!this.f7224e.equals(driveRouteQuery.f7224e)) {
                return false;
            }
            if (this.f7223d == null) {
                if (driveRouteQuery.f7223d != null) {
                    return false;
                }
            } else if (!this.f7223d.equals(driveRouteQuery.f7223d)) {
                return false;
            }
            if (this.f7220a == null) {
                if (driveRouteQuery.f7220a != null) {
                    return false;
                }
            } else if (!this.f7220a.equals(driveRouteQuery.f7220a)) {
                return false;
            }
            if (this.f7221b != driveRouteQuery.f7221b) {
                return false;
            }
            if (this.f7222c == null) {
                if (driveRouteQuery.f7222c != null) {
                    return false;
                }
            } else if (!this.f7222c.equals(driveRouteQuery.f7222c)) {
                return false;
            }
            return true;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f7220a, i);
            parcel.writeInt(this.f7221b);
            parcel.writeTypedList(this.f7222c);
            if (this.f7223d == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(this.f7223d.size());
                for (List<LatLonPoint> writeTypedList : this.f7223d) {
                    parcel.writeTypedList(writeTypedList);
                }
            }
            parcel.writeString(this.f7224e);
        }

        public DriveRouteQuery(FromAndTo fromAndTo, int i, List<LatLonPoint> list, List<List<LatLonPoint>> list2, String str) {
            this.f7220a = fromAndTo;
            this.f7221b = i;
            this.f7222c = list;
            this.f7223d = list2;
            this.f7224e = str;
        }
    }

    public static class FromAndTo implements Parcelable, Cloneable {
        public static final Parcelable.Creator<FromAndTo> CREATOR = new Parcelable.Creator<FromAndTo>() {
            /* renamed from: a */
            public final FromAndTo[] newArray(int i) {
                return new FromAndTo[i];
            }

            /* renamed from: a */
            public final FromAndTo createFromParcel(Parcel parcel) {
                return new FromAndTo(parcel);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        private LatLonPoint f7225a;

        /* renamed from: b  reason: collision with root package name */
        private LatLonPoint f7226b;

        /* renamed from: c  reason: collision with root package name */
        private String f7227c;

        /* renamed from: d  reason: collision with root package name */
        private String f7228d;

        /* renamed from: e  reason: collision with root package name */
        private String f7229e;

        /* renamed from: f  reason: collision with root package name */
        private String f7230f;
        private String g;
        private String h;

        public int describeContents() {
            return 0;
        }

        public FromAndTo() {
        }

        public String getDestinationPoiID() {
            return this.f7228d;
        }

        public String getDestinationType() {
            return this.f7230f;
        }

        public LatLonPoint getFrom() {
            return this.f7225a;
        }

        public String getOriginType() {
            return this.f7229e;
        }

        public String getPlateNumber() {
            return this.h;
        }

        public String getPlateProvince() {
            return this.g;
        }

        public String getStartPoiID() {
            return this.f7227c;
        }

        public LatLonPoint getTo() {
            return this.f7226b;
        }

        public FromAndTo clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e2) {
                j.a(e2, "RouteSearch", "FromAndToclone");
            }
            FromAndTo fromAndTo = new FromAndTo(this.f7225a, this.f7226b);
            fromAndTo.setStartPoiID(this.f7227c);
            fromAndTo.setDestinationPoiID(this.f7228d);
            fromAndTo.setOriginType(this.f7229e);
            fromAndTo.setDestinationType(this.f7230f);
            return fromAndTo;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (this.f7228d == null) {
                i = 0;
            } else {
                i = this.f7228d.hashCode();
            }
            int i7 = (i + 31) * 31;
            if (this.f7225a == null) {
                i2 = 0;
            } else {
                i2 = this.f7225a.hashCode();
            }
            int i8 = (i7 + i2) * 31;
            if (this.f7227c == null) {
                i3 = 0;
            } else {
                i3 = this.f7227c.hashCode();
            }
            int i9 = (i8 + i3) * 31;
            if (this.f7226b == null) {
                i4 = 0;
            } else {
                i4 = this.f7226b.hashCode();
            }
            int i10 = (i9 + i4) * 31;
            if (this.f7229e == null) {
                i5 = 0;
            } else {
                i5 = this.f7229e.hashCode();
            }
            int i11 = (i10 + i5) * 31;
            if (this.f7230f != null) {
                i6 = this.f7230f.hashCode();
            }
            return i11 + i6;
        }

        public void setDestinationPoiID(String str) {
            this.f7228d = str;
        }

        public void setDestinationType(String str) {
            this.f7230f = str;
        }

        public void setOriginType(String str) {
            this.f7229e = str;
        }

        public void setPlateNumber(String str) {
            this.h = str;
        }

        public void setPlateProvince(String str) {
            this.g = str;
        }

        public void setStartPoiID(String str) {
            this.f7227c = str;
        }

        public FromAndTo(Parcel parcel) {
            this.f7225a = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
            this.f7226b = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
            this.f7227c = parcel.readString();
            this.f7228d = parcel.readString();
            this.f7229e = parcel.readString();
            this.f7230f = parcel.readString();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            FromAndTo fromAndTo = (FromAndTo) obj;
            if (this.f7228d == null) {
                if (fromAndTo.f7228d != null) {
                    return false;
                }
            } else if (!this.f7228d.equals(fromAndTo.f7228d)) {
                return false;
            }
            if (this.f7225a == null) {
                if (fromAndTo.f7225a != null) {
                    return false;
                }
            } else if (!this.f7225a.equals(fromAndTo.f7225a)) {
                return false;
            }
            if (this.f7227c == null) {
                if (fromAndTo.f7227c != null) {
                    return false;
                }
            } else if (!this.f7227c.equals(fromAndTo.f7227c)) {
                return false;
            }
            if (this.f7226b == null) {
                if (fromAndTo.f7226b != null) {
                    return false;
                }
            } else if (!this.f7226b.equals(fromAndTo.f7226b)) {
                return false;
            }
            if (this.f7229e == null) {
                if (fromAndTo.f7229e != null) {
                    return false;
                }
            } else if (!this.f7229e.equals(fromAndTo.f7229e)) {
                return false;
            }
            if (this.f7230f == null) {
                if (fromAndTo.f7230f != null) {
                    return false;
                }
            } else if (!this.f7230f.equals(fromAndTo.f7230f)) {
                return false;
            }
            return true;
        }

        public FromAndTo(LatLonPoint latLonPoint, LatLonPoint latLonPoint2) {
            this.f7225a = latLonPoint;
            this.f7226b = latLonPoint2;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f7225a, i);
            parcel.writeParcelable(this.f7226b, i);
            parcel.writeString(this.f7227c);
            parcel.writeString(this.f7228d);
            parcel.writeString(this.f7229e);
            parcel.writeString(this.f7230f);
        }
    }

    public interface OnRouteSearchListener {
        void onBusRouteSearched(BusRouteResult busRouteResult, int i);

        void onDriveRouteSearched(DriveRouteResult driveRouteResult, int i);

        void onRideRouteSearched(RideRouteResult rideRouteResult, int i);

        void onWalkRouteSearched(WalkRouteResult walkRouteResult, int i);
    }

    public interface OnTruckRouteSearchListener {
        void onTruckRouteSearched(TruckRouteRestult truckRouteRestult, int i);
    }

    public static class RideRouteQuery implements Parcelable, Cloneable {
        public static final Parcelable.Creator<RideRouteQuery> CREATOR = new Parcelable.Creator<RideRouteQuery>() {
            /* renamed from: a */
            public final RideRouteQuery[] newArray(int i) {
                return new RideRouteQuery[i];
            }

            /* renamed from: a */
            public final RideRouteQuery createFromParcel(Parcel parcel) {
                return new RideRouteQuery(parcel);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        private FromAndTo f7231a;

        /* renamed from: b  reason: collision with root package name */
        private int f7232b;

        public int describeContents() {
            return 0;
        }

        public RideRouteQuery() {
        }

        public FromAndTo getFromAndTo() {
            return this.f7231a;
        }

        public int getMode() {
            return this.f7232b;
        }

        public RideRouteQuery clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e2) {
                j.a(e2, "RouteSearch", "RideRouteQueryclone");
            }
            return new RideRouteQuery(this.f7231a);
        }

        public int hashCode() {
            int i;
            if (this.f7231a == null) {
                i = 0;
            } else {
                i = this.f7231a.hashCode();
            }
            return ((i + 31) * 31) + this.f7232b;
        }

        public RideRouteQuery(FromAndTo fromAndTo) {
            this.f7231a = fromAndTo;
        }

        public RideRouteQuery(Parcel parcel) {
            this.f7231a = (FromAndTo) parcel.readParcelable(FromAndTo.class.getClassLoader());
            this.f7232b = parcel.readInt();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            WalkRouteQuery walkRouteQuery = (WalkRouteQuery) obj;
            if (this.f7231a == null) {
                if (walkRouteQuery.f7239a != null) {
                    return false;
                }
            } else if (!this.f7231a.equals(walkRouteQuery.f7239a)) {
                return false;
            }
            if (this.f7232b != walkRouteQuery.f7240b) {
                return false;
            }
            return true;
        }

        public RideRouteQuery(FromAndTo fromAndTo, int i) {
            this.f7231a = fromAndTo;
            this.f7232b = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f7231a, i);
            parcel.writeInt(this.f7232b);
        }
    }

    public static class TruckRouteQuery implements Parcelable, Cloneable {
        public static final Parcelable.Creator<TruckRouteQuery> CREATOR = new Parcelable.Creator<TruckRouteQuery>() {
            /* renamed from: a */
            public final TruckRouteQuery[] newArray(int i) {
                return new TruckRouteQuery[i];
            }

            /* renamed from: a */
            public final TruckRouteQuery createFromParcel(Parcel parcel) {
                return new TruckRouteQuery(parcel);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        private FromAndTo f7233a;

        /* renamed from: b  reason: collision with root package name */
        private int f7234b = 2;

        /* renamed from: c  reason: collision with root package name */
        private int f7235c;

        /* renamed from: d  reason: collision with root package name */
        private List<LatLonPoint> f7236d;

        /* renamed from: e  reason: collision with root package name */
        private float f7237e;

        /* renamed from: f  reason: collision with root package name */
        private float f7238f;
        private float g;
        private float h;
        private float i;

        public int describeContents() {
            return 0;
        }

        public FromAndTo getFromAndTo() {
            return this.f7233a;
        }

        public int getMode() {
            return this.f7235c;
        }

        public float getTruckAxis() {
            return this.i;
        }

        public float getTruckHeight() {
            return this.f7237e;
        }

        public float getTruckLoad() {
            return this.g;
        }

        public int getTruckSize() {
            return this.f7234b;
        }

        public float getTruckWeight() {
            return this.h;
        }

        public float getTruckWidth() {
            return this.f7238f;
        }

        public boolean hasPassPoint() {
            if (j.a(getPassedPointStr())) {
                return false;
            }
            return true;
        }

        public TruckRouteQuery clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e2) {
                j.a(e2, "RouteSearch", "TruckRouteQueryclone");
            }
            return new TruckRouteQuery(this.f7233a, this.f7235c, this.f7236d, this.f7234b);
        }

        public String getPassedPointStr() {
            StringBuffer stringBuffer = new StringBuffer();
            if (this.f7236d == null || this.f7236d.size() == 0) {
                return null;
            }
            for (int i2 = 0; i2 < this.f7236d.size(); i2++) {
                LatLonPoint latLonPoint = this.f7236d.get(i2);
                stringBuffer.append(latLonPoint.getLongitude());
                stringBuffer.append(",");
                stringBuffer.append(latLonPoint.getLatitude());
                if (i2 < this.f7236d.size() - 1) {
                    stringBuffer.append(";");
                }
            }
            return stringBuffer.toString();
        }

        public void setMode(int i2) {
            this.f7235c = i2;
        }

        public void setTruckAxis(float f2) {
            this.i = f2;
        }

        public void setTruckHeight(float f2) {
            this.f7237e = f2;
        }

        public void setTruckLoad(float f2) {
            this.g = f2;
        }

        public void setTruckSize(int i2) {
            this.f7234b = i2;
        }

        public void setTruckWeight(float f2) {
            this.h = f2;
        }

        public void setTruckWidth(float f2) {
            this.f7238f = f2;
        }

        protected TruckRouteQuery(Parcel parcel) {
            this.f7233a = (FromAndTo) parcel.readParcelable(FromAndTo.class.getClassLoader());
            this.f7234b = parcel.readInt();
            this.f7235c = parcel.readInt();
            this.f7236d = parcel.createTypedArrayList(LatLonPoint.CREATOR);
            this.f7237e = parcel.readFloat();
            this.f7238f = parcel.readFloat();
            this.g = parcel.readFloat();
            this.h = parcel.readFloat();
            this.i = parcel.readFloat();
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f7233a, i2);
            parcel.writeInt(this.f7234b);
            parcel.writeInt(this.f7235c);
            parcel.writeTypedList(this.f7236d);
            parcel.writeFloat(this.f7237e);
            parcel.writeFloat(this.f7238f);
            parcel.writeFloat(this.g);
            parcel.writeFloat(this.h);
            parcel.writeFloat(this.i);
        }

        public TruckRouteQuery(FromAndTo fromAndTo, int i2, List<LatLonPoint> list, int i3) {
            this.f7233a = fromAndTo;
            this.f7235c = i2;
            this.f7236d = list;
            this.f7234b = i3;
        }
    }

    public static class WalkRouteQuery implements Parcelable, Cloneable {
        public static final Parcelable.Creator<WalkRouteQuery> CREATOR = new Parcelable.Creator<WalkRouteQuery>() {
            /* renamed from: a */
            public final WalkRouteQuery[] newArray(int i) {
                return new WalkRouteQuery[i];
            }

            /* renamed from: a */
            public final WalkRouteQuery createFromParcel(Parcel parcel) {
                return new WalkRouteQuery(parcel);
            }
        };
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public FromAndTo f7239a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f7240b;

        public int describeContents() {
            return 0;
        }

        public WalkRouteQuery() {
        }

        public FromAndTo getFromAndTo() {
            return this.f7239a;
        }

        public int getMode() {
            return this.f7240b;
        }

        public WalkRouteQuery clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e2) {
                j.a(e2, "RouteSearch", "WalkRouteQueryclone");
            }
            return new WalkRouteQuery(this.f7239a);
        }

        public int hashCode() {
            int i;
            if (this.f7239a == null) {
                i = 0;
            } else {
                i = this.f7239a.hashCode();
            }
            return ((i + 31) * 31) + this.f7240b;
        }

        public WalkRouteQuery(FromAndTo fromAndTo) {
            this.f7239a = fromAndTo;
        }

        public WalkRouteQuery(Parcel parcel) {
            this.f7239a = (FromAndTo) parcel.readParcelable(FromAndTo.class.getClassLoader());
            this.f7240b = parcel.readInt();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            WalkRouteQuery walkRouteQuery = (WalkRouteQuery) obj;
            if (this.f7239a == null) {
                if (walkRouteQuery.f7239a != null) {
                    return false;
                }
            } else if (!this.f7239a.equals(walkRouteQuery.f7239a)) {
                return false;
            }
            if (this.f7240b != walkRouteQuery.f7240b) {
                return false;
            }
            return true;
        }

        public WalkRouteQuery(FromAndTo fromAndTo, int i) {
            this.f7239a = fromAndTo;
            this.f7240b = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f7239a, i);
            parcel.writeInt(this.f7240b);
        }
    }

    public BusRouteResult calculateBusRoute(BusRouteQuery busRouteQuery) throws AMapException {
        if (this.f7214a != null) {
            return this.f7214a.calculateBusRoute(busRouteQuery);
        }
        return null;
    }

    public void calculateBusRouteAsyn(BusRouteQuery busRouteQuery) {
        if (this.f7214a != null) {
            this.f7214a.calculateBusRouteAsyn(busRouteQuery);
        }
    }

    public DriveRouteResult calculateDriveRoute(DriveRouteQuery driveRouteQuery) throws AMapException {
        if (this.f7214a != null) {
            return this.f7214a.calculateDriveRoute(driveRouteQuery);
        }
        return null;
    }

    public void calculateDriveRouteAsyn(DriveRouteQuery driveRouteQuery) {
        if (this.f7214a != null) {
            this.f7214a.calculateDriveRouteAsyn(driveRouteQuery);
        }
    }

    public RideRouteResult calculateRideRoute(RideRouteQuery rideRouteQuery) throws AMapException {
        if (this.f7214a != null) {
            return this.f7214a.calculateRideRoute(rideRouteQuery);
        }
        return null;
    }

    public void calculateRideRouteAsyn(RideRouteQuery rideRouteQuery) {
        if (this.f7214a != null) {
            this.f7214a.calculateRideRouteAsyn(rideRouteQuery);
        }
    }

    public TruckRouteRestult calculateTruckRoute(TruckRouteQuery truckRouteQuery) throws AMapException {
        if (this.f7214a != null) {
            return this.f7214a.calculateTruckRoute(truckRouteQuery);
        }
        return null;
    }

    public void calculateTruckRouteAsyn(TruckRouteQuery truckRouteQuery) {
        if (this.f7214a != null) {
            this.f7214a.calculateTruckRouteAsyn(truckRouteQuery);
        }
    }

    public WalkRouteResult calculateWalkRoute(WalkRouteQuery walkRouteQuery) throws AMapException {
        if (this.f7214a != null) {
            return this.f7214a.calculateWalkRoute(walkRouteQuery);
        }
        return null;
    }

    public void calculateWalkRouteAsyn(WalkRouteQuery walkRouteQuery) {
        if (this.f7214a != null) {
            this.f7214a.calculateWalkRouteAsyn(walkRouteQuery);
        }
    }

    public void setOnTruckRouteSearchListener(OnTruckRouteSearchListener onTruckRouteSearchListener) {
        if (this.f7214a != null) {
            this.f7214a.setOnTruckRouteSearchListener(onTruckRouteSearchListener);
        }
    }

    public void setRouteSearchListener(OnRouteSearchListener onRouteSearchListener) {
        if (this.f7214a != null) {
            this.f7214a.setRouteSearchListener(onRouteSearchListener);
        }
    }

    public RouteSearch(Context context) {
        try {
            Context context2 = context;
            this.f7214a = (IRouteSearch) cm.a(context2, i.a(true), "com.amap.api.services.dynamic.RouteSearchWrapper", az.class, new Class[]{Context.class}, new Object[]{context});
        } catch (be unused) {
        }
        if (this.f7214a == null) {
            try {
                this.f7214a = new az(context);
            } catch (Exception unused2) {
            }
        }
    }
}
