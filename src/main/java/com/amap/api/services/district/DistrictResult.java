package com.amap.api.services.district;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.AMapException;
import java.util.ArrayList;

public final class DistrictResult implements Parcelable {
    public Parcelable.Creator<DistrictResult> CREATOR = new Parcelable.Creator<DistrictResult>() {
        /* renamed from: a */
        public DistrictResult[] newArray(int i) {
            return new DistrictResult[i];
        }

        /* renamed from: a */
        public DistrictResult createFromParcel(Parcel parcel) {
            return new DistrictResult(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private DistrictSearchQuery f7005a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<DistrictItem> f7006b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private int f7007c;

    /* renamed from: d  reason: collision with root package name */
    private AMapException f7008d;

    public final int describeContents() {
        return 0;
    }

    public final AMapException getAMapException() {
        return this.f7008d;
    }

    public final ArrayList<DistrictItem> getDistrict() {
        return this.f7006b;
    }

    public final int getPageCount() {
        return this.f7007c;
    }

    public final DistrictSearchQuery getQuery() {
        return this.f7005a;
    }

    public DistrictResult() {
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (this.f7005a == null) {
            i = 0;
        } else {
            i = this.f7005a.hashCode();
        }
        int i3 = (i + 31) * 31;
        if (this.f7006b != null) {
            i2 = this.f7006b.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return "DistrictResult [mDisQuery=" + this.f7005a + ", mDistricts=" + this.f7006b + "]";
    }

    public final void setAMapException(AMapException aMapException) {
        this.f7008d = aMapException;
    }

    public final void setDistrict(ArrayList<DistrictItem> arrayList) {
        this.f7006b = arrayList;
    }

    public final void setPageCount(int i) {
        this.f7007c = i;
    }

    public final void setQuery(DistrictSearchQuery districtSearchQuery) {
        this.f7005a = districtSearchQuery;
    }

    protected DistrictResult(Parcel parcel) {
        this.f7005a = (DistrictSearchQuery) parcel.readParcelable(DistrictSearchQuery.class.getClassLoader());
        this.f7006b = parcel.createTypedArrayList(DistrictItem.CREATOR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DistrictResult districtResult = (DistrictResult) obj;
        if (this.f7005a == null) {
            if (districtResult.f7005a != null) {
                return false;
            }
        } else if (!this.f7005a.equals(districtResult.f7005a)) {
            return false;
        }
        if (this.f7006b == null) {
            if (districtResult.f7006b != null) {
                return false;
            }
        } else if (!this.f7006b.equals(districtResult.f7006b)) {
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f7005a, i);
        parcel.writeTypedList(this.f7006b);
    }

    public DistrictResult(DistrictSearchQuery districtSearchQuery, ArrayList<DistrictItem> arrayList) {
        this.f7005a = districtSearchQuery;
        this.f7006b = arrayList;
    }
}
