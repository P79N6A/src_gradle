package com.amap.api.services.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.poisearch.IndoorData;
import com.amap.api.services.poisearch.Photo;
import com.amap.api.services.poisearch.PoiItemExtension;
import com.amap.api.services.poisearch.SubPoiItem;
import java.util.ArrayList;
import java.util.List;

public class PoiItem implements Parcelable {
    public static final Parcelable.Creator<PoiItem> CREATOR = new Parcelable.Creator<PoiItem>() {
        /* renamed from: a */
        public final PoiItem[] newArray(int i) {
            return new PoiItem[i];
        }

        /* renamed from: a */
        public final PoiItem createFromParcel(Parcel parcel) {
            return new PoiItem(parcel);
        }
    };
    private String A;
    private String B;

    /* renamed from: a  reason: collision with root package name */
    private String f6984a;

    /* renamed from: b  reason: collision with root package name */
    private String f6985b;

    /* renamed from: c  reason: collision with root package name */
    private String f6986c;

    /* renamed from: d  reason: collision with root package name */
    private String f6987d;

    /* renamed from: e  reason: collision with root package name */
    private String f6988e = "";

    /* renamed from: f  reason: collision with root package name */
    private int f6989f = -1;
    private final LatLonPoint g;
    private final String h;
    private final String i;
    private LatLonPoint j;
    private LatLonPoint k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private boolean s;
    private IndoorData t;
    private String u;
    private String v;
    private String w;
    private List<SubPoiItem> x = new ArrayList();
    private List<Photo> y = new ArrayList();
    private PoiItemExtension z;

    public int describeContents() {
        return 0;
    }

    public String getAdCode() {
        return this.f6986c;
    }

    public String getAdName() {
        return this.r;
    }

    public String getBusinessArea() {
        return this.v;
    }

    public String getCityCode() {
        return this.f6987d;
    }

    public String getCityName() {
        return this.q;
    }

    public String getDirection() {
        return this.o;
    }

    public int getDistance() {
        return this.f6989f;
    }

    public String getEmail() {
        return this.n;
    }

    public LatLonPoint getEnter() {
        return this.j;
    }

    public LatLonPoint getExit() {
        return this.k;
    }

    public IndoorData getIndoorData() {
        return this.t;
    }

    public LatLonPoint getLatLonPoint() {
        return this.g;
    }

    public String getParkingType() {
        return this.w;
    }

    public List<Photo> getPhotos() {
        return this.y;
    }

    public PoiItemExtension getPoiExtension() {
        return this.z;
    }

    public String getPoiId() {
        return this.f6984a;
    }

    public String getPostcode() {
        return this.m;
    }

    public String getProvinceCode() {
        return this.u;
    }

    public String getProvinceName() {
        return this.p;
    }

    public String getShopID() {
        return this.B;
    }

    public String getSnippet() {
        return this.i;
    }

    public List<SubPoiItem> getSubPois() {
        return this.x;
    }

    public String getTel() {
        return this.f6985b;
    }

    public String getTitle() {
        return this.h;
    }

    public String getTypeCode() {
        return this.A;
    }

    public String getTypeDes() {
        return this.f6988e;
    }

    public String getWebsite() {
        return this.l;
    }

    public boolean isIndoorMap() {
        return this.s;
    }

    public String toString() {
        return this.h;
    }

    public int hashCode() {
        int i2;
        if (this.f6984a == null) {
            i2 = 0;
        } else {
            i2 = this.f6984a.hashCode();
        }
        return i2 + 31;
    }

    public void setAdCode(String str) {
        this.f6986c = str;
    }

    public void setAdName(String str) {
        this.r = str;
    }

    public void setBusinessArea(String str) {
        this.v = str;
    }

    public void setCityCode(String str) {
        this.f6987d = str;
    }

    public void setCityName(String str) {
        this.q = str;
    }

    public void setDirection(String str) {
        this.o = str;
    }

    public void setDistance(int i2) {
        this.f6989f = i2;
    }

    public void setEmail(String str) {
        this.n = str;
    }

    public void setEnter(LatLonPoint latLonPoint) {
        this.j = latLonPoint;
    }

    public void setExit(LatLonPoint latLonPoint) {
        this.k = latLonPoint;
    }

    public void setIndoorDate(IndoorData indoorData) {
        this.t = indoorData;
    }

    public void setIndoorMap(boolean z2) {
        this.s = z2;
    }

    public void setParkingType(String str) {
        this.w = str;
    }

    public void setPhotos(List<Photo> list) {
        this.y = list;
    }

    public void setPoiExtension(PoiItemExtension poiItemExtension) {
        this.z = poiItemExtension;
    }

    public void setPostcode(String str) {
        this.m = str;
    }

    public void setProvinceCode(String str) {
        this.u = str;
    }

    public void setProvinceName(String str) {
        this.p = str;
    }

    public void setShopID(String str) {
        this.B = str;
    }

    public void setSubPois(List<SubPoiItem> list) {
        this.x = list;
    }

    public void setTel(String str) {
        this.f6985b = str;
    }

    public void setTypeCode(String str) {
        this.A = str;
    }

    public void setTypeDes(String str) {
        this.f6988e = str;
    }

    public void setWebsite(String str) {
        this.l = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoiItem poiItem = (PoiItem) obj;
        if (this.f6984a == null) {
            if (poiItem.f6984a != null) {
                return false;
            }
        } else if (!this.f6984a.equals(poiItem.f6984a)) {
            return false;
        }
        return true;
    }

    protected PoiItem(Parcel parcel) {
        this.f6984a = parcel.readString();
        this.f6986c = parcel.readString();
        this.f6985b = parcel.readString();
        this.f6988e = parcel.readString();
        this.f6989f = parcel.readInt();
        this.g = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.f6987d = parcel.readString();
        this.j = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.k = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.l = parcel.readString();
        this.m = parcel.readString();
        this.n = parcel.readString();
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        this.s = zArr[0];
        this.o = parcel.readString();
        this.p = parcel.readString();
        this.q = parcel.readString();
        this.r = parcel.readString();
        this.u = parcel.readString();
        this.v = parcel.readString();
        this.w = parcel.readString();
        this.x = parcel.readArrayList(SubPoiItem.class.getClassLoader());
        this.t = (IndoorData) parcel.readValue(IndoorData.class.getClassLoader());
        this.y = parcel.createTypedArrayList(Photo.CREATOR);
        this.z = (PoiItemExtension) parcel.readParcelable(PoiItemExtension.class.getClassLoader());
        this.A = parcel.readString();
        this.B = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f6984a);
        parcel.writeString(this.f6986c);
        parcel.writeString(this.f6985b);
        parcel.writeString(this.f6988e);
        parcel.writeInt(this.f6989f);
        parcel.writeValue(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.f6987d);
        parcel.writeValue(this.j);
        parcel.writeValue(this.k);
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeString(this.n);
        parcel.writeBooleanArray(new boolean[]{this.s});
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        parcel.writeString(this.u);
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeList(this.x);
        parcel.writeValue(this.t);
        parcel.writeTypedList(this.y);
        parcel.writeParcelable(this.z, i2);
        parcel.writeString(this.A);
        parcel.writeString(this.B);
    }

    public PoiItem(String str, LatLonPoint latLonPoint, String str2, String str3) {
        this.f6984a = str;
        this.g = latLonPoint;
        this.h = str2;
        this.i = str3;
    }
}
