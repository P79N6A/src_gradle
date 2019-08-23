package com.amap.api.services.geocoder;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.road.Crossroad;
import com.amap.api.services.road.Road;
import java.util.ArrayList;
import java.util.List;

public final class RegeocodeAddress implements Parcelable {
    public static final Parcelable.Creator<RegeocodeAddress> CREATOR = new Parcelable.Creator<RegeocodeAddress>() {
        /* renamed from: a */
        public final RegeocodeAddress[] newArray(int i) {
            return null;
        }

        /* renamed from: a */
        public final RegeocodeAddress createFromParcel(Parcel parcel) {
            return new RegeocodeAddress(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f7035a;

    /* renamed from: b  reason: collision with root package name */
    private String f7036b;

    /* renamed from: c  reason: collision with root package name */
    private String f7037c;

    /* renamed from: d  reason: collision with root package name */
    private String f7038d;

    /* renamed from: e  reason: collision with root package name */
    private String f7039e;

    /* renamed from: f  reason: collision with root package name */
    private String f7040f;
    private String g;
    private StreetNumber h;
    private String i;
    private String j;
    private String k;
    private List<RegeocodeRoad> l;
    private List<Crossroad> m;
    private List<PoiItem> n;
    private List<BusinessArea> o;
    private List<AoiItem> p;
    private String q;

    public final int describeContents() {
        return 0;
    }

    public final String getAdCode() {
        return this.j;
    }

    public final List<AoiItem> getAois() {
        return this.p;
    }

    public final String getBuilding() {
        return this.g;
    }

    public final List<BusinessArea> getBusinessAreas() {
        return this.o;
    }

    public final String getCity() {
        return this.f7037c;
    }

    public final String getCityCode() {
        return this.i;
    }

    public final String getCountry() {
        return this.q;
    }

    public final List<Crossroad> getCrossroads() {
        return this.m;
    }

    public final String getDistrict() {
        return this.f7038d;
    }

    public final String getFormatAddress() {
        return this.f7035a;
    }

    public final String getNeighborhood() {
        return this.f7040f;
    }

    public final List<PoiItem> getPois() {
        return this.n;
    }

    public final String getProvince() {
        return this.f7036b;
    }

    public final List<RegeocodeRoad> getRoads() {
        return this.l;
    }

    public final StreetNumber getStreetNumber() {
        return this.h;
    }

    public final String getTowncode() {
        return this.k;
    }

    public final String getTownship() {
        return this.f7039e;
    }

    public RegeocodeAddress() {
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayList();
    }

    public final void setAdCode(String str) {
        this.j = str;
    }

    public final void setAois(List<AoiItem> list) {
        this.p = list;
    }

    public final void setBuilding(String str) {
        this.g = str;
    }

    public final void setBusinessAreas(List<BusinessArea> list) {
        this.o = list;
    }

    public final void setCity(String str) {
        this.f7037c = str;
    }

    public final void setCityCode(String str) {
        this.i = str;
    }

    public final void setCountry(String str) {
        this.q = str;
    }

    public final void setCrossroads(List<Crossroad> list) {
        this.m = list;
    }

    public final void setDistrict(String str) {
        this.f7038d = str;
    }

    public final void setFormatAddress(String str) {
        this.f7035a = str;
    }

    public final void setNeighborhood(String str) {
        this.f7040f = str;
    }

    public final void setPois(List<PoiItem> list) {
        this.n = list;
    }

    public final void setProvince(String str) {
        this.f7036b = str;
    }

    public final void setRoads(List<RegeocodeRoad> list) {
        this.l = list;
    }

    public final void setStreetNumber(StreetNumber streetNumber) {
        this.h = streetNumber;
    }

    public final void setTowncode(String str) {
        this.k = str;
    }

    public final void setTownship(String str) {
        this.f7039e = str;
    }

    private RegeocodeAddress(Parcel parcel) {
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.f7035a = parcel.readString();
        this.f7036b = parcel.readString();
        this.f7037c = parcel.readString();
        this.f7038d = parcel.readString();
        this.f7039e = parcel.readString();
        this.f7040f = parcel.readString();
        this.g = parcel.readString();
        this.h = (StreetNumber) parcel.readValue(StreetNumber.class.getClassLoader());
        this.l = parcel.readArrayList(Road.class.getClassLoader());
        this.m = parcel.readArrayList(Crossroad.class.getClassLoader());
        this.n = parcel.readArrayList(PoiItem.class.getClassLoader());
        this.i = parcel.readString();
        this.j = parcel.readString();
        this.o = parcel.readArrayList(BusinessArea.class.getClassLoader());
        this.p = parcel.readArrayList(AoiItem.class.getClassLoader());
        this.k = parcel.readString();
        this.q = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f7035a);
        parcel.writeString(this.f7036b);
        parcel.writeString(this.f7037c);
        parcel.writeString(this.f7038d);
        parcel.writeString(this.f7039e);
        parcel.writeString(this.f7040f);
        parcel.writeString(this.g);
        parcel.writeValue(this.h);
        parcel.writeList(this.l);
        parcel.writeList(this.m);
        parcel.writeList(this.n);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeList(this.o);
        parcel.writeList(this.p);
        parcel.writeString(this.k);
        parcel.writeString(this.q);
    }
}