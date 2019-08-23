package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;

public class SearchCity implements Parcelable {
    public static final Parcelable.Creator<SearchCity> CREATOR = new Parcelable.Creator<SearchCity>() {
        /* renamed from: a */
        public final SearchCity[] newArray(int i) {
            return null;
        }

        /* renamed from: a */
        public final SearchCity createFromParcel(Parcel parcel) {
            return new SearchCity(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f7242a;

    /* renamed from: b  reason: collision with root package name */
    private String f7243b;

    /* renamed from: c  reason: collision with root package name */
    private String f7244c;

    public int describeContents() {
        return 0;
    }

    public SearchCity() {
    }

    public String getSearchCityAdCode() {
        return this.f7244c;
    }

    public String getSearchCityName() {
        return this.f7242a;
    }

    public String getSearchCitycode() {
        return this.f7243b;
    }

    public void setSearchCityName(String str) {
        this.f7242a = str;
    }

    public void setSearchCitycode(String str) {
        this.f7243b = str;
    }

    public void setSearchCityhAdCode(String str) {
        this.f7244c = str;
    }

    public SearchCity(Parcel parcel) {
        this.f7242a = parcel.readString();
        this.f7243b = parcel.readString();
        this.f7244c = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7242a);
        parcel.writeString(this.f7243b);
        parcel.writeString(this.f7244c);
    }
}
