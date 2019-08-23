package com.amap.api.services.district;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.a.j;

public class DistrictSearchQuery implements Parcelable, Cloneable {
    public static final Parcelable.Creator<DistrictSearchQuery> CREATOR = new Parcelable.Creator<DistrictSearchQuery>() {
        /* renamed from: a */
        public final DistrictSearchQuery[] newArray(int i) {
            return new DistrictSearchQuery[i];
        }

        /* renamed from: a */
        public final DistrictSearchQuery createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            DistrictSearchQuery districtSearchQuery = new DistrictSearchQuery();
            districtSearchQuery.setKeywords(parcel.readString());
            districtSearchQuery.setKeywordsLevel(parcel.readString());
            districtSearchQuery.setPageNum(parcel.readInt());
            districtSearchQuery.setPageSize(parcel.readInt());
            boolean z3 = false;
            if (parcel.readByte() == 1) {
                z = true;
            } else {
                z = false;
            }
            districtSearchQuery.setShowChild(z);
            if (parcel.readByte() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            districtSearchQuery.setShowBoundary(z2);
            if (parcel.readByte() == 1) {
                z3 = true;
            }
            districtSearchQuery.setShowBusinessArea(z3);
            return districtSearchQuery;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private int f7011a;

    /* renamed from: b  reason: collision with root package name */
    private int f7012b;

    /* renamed from: c  reason: collision with root package name */
    private String f7013c;

    /* renamed from: d  reason: collision with root package name */
    private String f7014d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7015e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7016f;
    private boolean g;

    public int describeContents() {
        return 0;
    }

    public String getKeywords() {
        return this.f7013c;
    }

    public String getKeywordsLevel() {
        return this.f7014d;
    }

    public int getPageSize() {
        return this.f7012b;
    }

    public boolean isShowBoundary() {
        return this.g;
    }

    public boolean isShowBusinessArea() {
        return this.f7016f;
    }

    public boolean isShowChild() {
        return this.f7015e;
    }

    public DistrictSearchQuery() {
        this.f7011a = 1;
        this.f7012b = 20;
        this.f7015e = true;
    }

    public int getPageNum() {
        if (this.f7011a <= 0) {
            return 1;
        }
        return this.f7011a;
    }

    public boolean checkKeyWords() {
        if (this.f7013c != null && !this.f7013c.trim().equalsIgnoreCase("")) {
            return true;
        }
        return false;
    }

    public DistrictSearchQuery clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e2) {
            j.a(e2, "DistrictSearchQuery", "clone");
        }
        DistrictSearchQuery districtSearchQuery = new DistrictSearchQuery();
        districtSearchQuery.setKeywords(this.f7013c);
        districtSearchQuery.setKeywordsLevel(this.f7014d);
        districtSearchQuery.setPageNum(this.f7011a);
        districtSearchQuery.setPageSize(this.f7012b);
        districtSearchQuery.setShowChild(this.f7015e);
        districtSearchQuery.setShowBoundary(this.g);
        districtSearchQuery.setShowBusinessArea(this.f7016f);
        return districtSearchQuery;
    }

    public boolean checkLevels() {
        if (this.f7014d == null) {
            return false;
        }
        if (this.f7014d.trim().equals("country") || this.f7014d.trim().equals("province") || this.f7014d.trim().equals("city") || this.f7014d.trim().equals("district") || this.f7014d.trim().equals("biz_area")) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 1237;
        if (this.g) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i4 = (i + 31) * 31;
        int i5 = 0;
        if (this.f7013c == null) {
            i2 = 0;
        } else {
            i2 = this.f7013c.hashCode();
        }
        int i6 = (i4 + i2) * 31;
        if (this.f7014d != null) {
            i5 = this.f7014d.hashCode();
        }
        int i7 = (((((i6 + i5) * 31) + this.f7011a) * 31) + this.f7012b) * 31;
        if (this.f7015e) {
            i3 = 1231;
        }
        return i7 + i3;
    }

    public void setKeywords(String str) {
        this.f7013c = str;
    }

    public void setKeywordsLevel(String str) {
        this.f7014d = str;
    }

    public void setPageNum(int i) {
        this.f7011a = i;
    }

    public void setPageSize(int i) {
        this.f7012b = i;
    }

    public void setShowBoundary(boolean z) {
        this.g = z;
    }

    public void setShowBusinessArea(boolean z) {
        this.f7016f = z;
    }

    public void setShowChild(boolean z) {
        this.f7015e = z;
    }

    public boolean weakEquals(DistrictSearchQuery districtSearchQuery) {
        if (this == districtSearchQuery) {
            return true;
        }
        if (districtSearchQuery == null) {
            return false;
        }
        if (this.f7013c == null) {
            if (districtSearchQuery.f7013c != null) {
                return false;
            }
        } else if (!this.f7013c.equals(districtSearchQuery.f7013c)) {
            return false;
        }
        if (this.f7012b == districtSearchQuery.f7012b && this.f7015e == districtSearchQuery.f7015e && this.g == districtSearchQuery.g) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DistrictSearchQuery districtSearchQuery = (DistrictSearchQuery) obj;
        if (this.g != districtSearchQuery.g) {
            return false;
        }
        if (this.f7013c == null) {
            if (districtSearchQuery.f7013c != null) {
                return false;
            }
        } else if (!this.f7013c.equals(districtSearchQuery.f7013c)) {
            return false;
        }
        if (this.f7011a == districtSearchQuery.f7011a && this.f7012b == districtSearchQuery.f7012b && this.f7015e == districtSearchQuery.f7015e) {
            return true;
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7013c);
        parcel.writeString(this.f7014d);
        parcel.writeInt(this.f7011a);
        parcel.writeInt(this.f7012b);
        parcel.writeByte(this.f7015e ? (byte) 1 : 0);
        parcel.writeByte(this.g ? (byte) 1 : 0);
        parcel.writeByte(this.f7016f ? (byte) 1 : 0);
    }

    public DistrictSearchQuery(String str, String str2, int i) {
        this.f7011a = 1;
        this.f7012b = 20;
        this.f7015e = true;
        this.f7013c = str;
        this.f7014d = str2;
        this.f7011a = i;
    }

    public DistrictSearchQuery(String str, String str2, int i, boolean z, int i2) {
        this(str, str2, i);
        this.f7015e = z;
        this.f7012b = i2;
    }
}
