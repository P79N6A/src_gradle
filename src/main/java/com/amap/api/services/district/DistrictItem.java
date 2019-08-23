package com.amap.api.services.district;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class DistrictItem implements Parcelable {
    public static final Parcelable.Creator<DistrictItem> CREATOR = new Parcelable.Creator<DistrictItem>() {
        /* renamed from: a */
        public final DistrictItem[] newArray(int i) {
            return new DistrictItem[i];
        }

        /* renamed from: a */
        public final DistrictItem createFromParcel(Parcel parcel) {
            return new DistrictItem(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f6999a;

    /* renamed from: b  reason: collision with root package name */
    private String f7000b;

    /* renamed from: c  reason: collision with root package name */
    private String f7001c;

    /* renamed from: d  reason: collision with root package name */
    private LatLonPoint f7002d;

    /* renamed from: e  reason: collision with root package name */
    private String f7003e;

    /* renamed from: f  reason: collision with root package name */
    private List<DistrictItem> f7004f = new ArrayList();
    private String[] g = new String[0];

    public final int describeContents() {
        return 0;
    }

    public final String[] districtBoundary() {
        return this.g;
    }

    public final String getAdcode() {
        return this.f7000b;
    }

    public final LatLonPoint getCenter() {
        return this.f7002d;
    }

    public final String getCitycode() {
        return this.f6999a;
    }

    public final String getLevel() {
        return this.f7003e;
    }

    public final String getName() {
        return this.f7001c;
    }

    public final List<DistrictItem> getSubDistrict() {
        return this.f7004f;
    }

    public DistrictItem() {
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        if (this.f7000b == null) {
            i = 0;
        } else {
            i = this.f7000b.hashCode();
        }
        int i7 = (i + 31) * 31;
        if (this.f7002d == null) {
            i2 = 0;
        } else {
            i2 = this.f7002d.hashCode();
        }
        int i8 = (i7 + i2) * 31;
        if (this.f6999a == null) {
            i3 = 0;
        } else {
            i3 = this.f6999a.hashCode();
        }
        int hashCode = (((i8 + i3) * 31) + Arrays.hashCode(this.g)) * 31;
        if (this.f7004f == null) {
            i4 = 0;
        } else {
            i4 = this.f7004f.hashCode();
        }
        int i9 = (hashCode + i4) * 31;
        if (this.f7003e == null) {
            i5 = 0;
        } else {
            i5 = this.f7003e.hashCode();
        }
        int i10 = (i9 + i5) * 31;
        if (this.f7001c != null) {
            i6 = this.f7001c.hashCode();
        }
        return i10 + i6;
    }

    public final String toString() {
        return "DistrictItem [mCitycode=" + this.f6999a + ", mAdcode=" + this.f7000b + ", mName=" + this.f7001c + ", mCenter=" + this.f7002d + ", mLevel=" + this.f7003e + ", mDistricts=" + this.f7004f + "]";
    }

    public final void setAdcode(String str) {
        this.f7000b = str;
    }

    public final void setCenter(LatLonPoint latLonPoint) {
        this.f7002d = latLonPoint;
    }

    public final void setCitycode(String str) {
        this.f6999a = str;
    }

    public final void setDistrictBoundary(String[] strArr) {
        this.g = strArr;
    }

    public final void setLevel(String str) {
        this.f7003e = str;
    }

    public final void setName(String str) {
        this.f7001c = str;
    }

    public final void setSubDistrict(ArrayList<DistrictItem> arrayList) {
        this.f7004f = arrayList;
    }

    public DistrictItem(Parcel parcel) {
        this.f6999a = parcel.readString();
        this.f7000b = parcel.readString();
        this.f7001c = parcel.readString();
        this.f7002d = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.f7003e = parcel.readString();
        this.f7004f = parcel.createTypedArrayList(CREATOR);
        this.g = new String[parcel.readInt()];
        parcel.readStringArray(this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DistrictItem districtItem = (DistrictItem) obj;
        if (this.f7000b == null) {
            if (districtItem.f7000b != null) {
                return false;
            }
        } else if (!this.f7000b.equals(districtItem.f7000b)) {
            return false;
        }
        if (this.f7002d == null) {
            if (districtItem.f7002d != null) {
                return false;
            }
        } else if (!this.f7002d.equals(districtItem.f7002d)) {
            return false;
        }
        if (this.f6999a == null) {
            if (districtItem.f6999a != null) {
                return false;
            }
        } else if (!this.f6999a.equals(districtItem.f6999a)) {
            return false;
        }
        if (!Arrays.equals(this.g, districtItem.g)) {
            return false;
        }
        if (this.f7004f == null) {
            if (districtItem.f7004f != null) {
                return false;
            }
        } else if (!this.f7004f.equals(districtItem.f7004f)) {
            return false;
        }
        if (this.f7003e == null) {
            if (districtItem.f7003e != null) {
                return false;
            }
        } else if (!this.f7003e.equals(districtItem.f7003e)) {
            return false;
        }
        if (this.f7001c == null) {
            if (districtItem.f7001c != null) {
                return false;
            }
        } else if (!this.f7001c.equals(districtItem.f7001c)) {
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6999a);
        parcel.writeString(this.f7000b);
        parcel.writeString(this.f7001c);
        parcel.writeParcelable(this.f7002d, i);
        parcel.writeString(this.f7003e);
        parcel.writeTypedList(this.f7004f);
        parcel.writeInt(this.g.length);
        parcel.writeStringArray(this.g);
    }

    public DistrictItem(String str, String str2, String str3, LatLonPoint latLonPoint, String str4) {
        this.f7001c = str;
        this.f6999a = str2;
        this.f7000b = str3;
        this.f7002d = latLonPoint;
        this.f7003e = str4;
    }
}
