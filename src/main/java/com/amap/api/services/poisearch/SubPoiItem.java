package com.amap.api.services.poisearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

public class SubPoiItem implements Parcelable {
    public static final Parcelable.Creator<SubPoiItem> CREATOR = new Parcelable.Creator<SubPoiItem>() {
        /* renamed from: a */
        public final SubPoiItem[] newArray(int i) {
            return null;
        }

        /* renamed from: a */
        public final SubPoiItem createFromParcel(Parcel parcel) {
            return new SubPoiItem(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f7114a;

    /* renamed from: b  reason: collision with root package name */
    private String f7115b;

    /* renamed from: c  reason: collision with root package name */
    private String f7116c;

    /* renamed from: d  reason: collision with root package name */
    private int f7117d;

    /* renamed from: e  reason: collision with root package name */
    private LatLonPoint f7118e;

    /* renamed from: f  reason: collision with root package name */
    private String f7119f;
    private String g;

    public int describeContents() {
        return 0;
    }

    public int getDistance() {
        return this.f7117d;
    }

    public LatLonPoint getLatLonPoint() {
        return this.f7118e;
    }

    public String getPoiId() {
        return this.f7114a;
    }

    public String getSnippet() {
        return this.f7119f;
    }

    public String getSubName() {
        return this.f7116c;
    }

    public String getSubTypeDes() {
        return this.g;
    }

    public String getTitle() {
        return this.f7115b;
    }

    public void setDistance(int i) {
        this.f7117d = i;
    }

    public void setLatLonPoint(LatLonPoint latLonPoint) {
        this.f7118e = latLonPoint;
    }

    public void setPoiId(String str) {
        this.f7114a = str;
    }

    public void setSnippet(String str) {
        this.f7119f = str;
    }

    public void setSubName(String str) {
        this.f7116c = str;
    }

    public void setSubTypeDes(String str) {
        this.g = str;
    }

    public void setTitle(String str) {
        this.f7115b = str;
    }

    public SubPoiItem(Parcel parcel) {
        this.f7114a = parcel.readString();
        this.f7115b = parcel.readString();
        this.f7116c = parcel.readString();
        this.f7117d = parcel.readInt();
        this.f7118e = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.f7119f = parcel.readString();
        this.g = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7114a);
        parcel.writeString(this.f7115b);
        parcel.writeString(this.f7116c);
        parcel.writeInt(this.f7117d);
        parcel.writeValue(this.f7118e);
        parcel.writeString(this.f7119f);
        parcel.writeString(this.g);
    }

    public SubPoiItem(String str, LatLonPoint latLonPoint, String str2, String str3) {
        this.f7114a = str;
        this.f7118e = latLonPoint;
        this.f7115b = str2;
        this.f7119f = str3;
    }
}
