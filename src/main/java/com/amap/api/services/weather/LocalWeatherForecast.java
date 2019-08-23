package com.amap.api.services.weather;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public class LocalWeatherForecast implements Parcelable {
    public static final Parcelable.Creator<LocalWeatherForecast> CREATOR = new Parcelable.Creator<LocalWeatherForecast>() {
        /* renamed from: a */
        public final LocalWeatherForecast[] newArray(int i) {
            return null;
        }

        /* renamed from: a */
        public final LocalWeatherForecast createFromParcel(Parcel parcel) {
            return new LocalWeatherForecast(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f7334a;

    /* renamed from: b  reason: collision with root package name */
    private String f7335b;

    /* renamed from: c  reason: collision with root package name */
    private String f7336c;

    /* renamed from: d  reason: collision with root package name */
    private String f7337d;

    /* renamed from: e  reason: collision with root package name */
    private List<LocalDayWeatherForecast> f7338e = new ArrayList();

    public int describeContents() {
        return 0;
    }

    public String getAdCode() {
        return this.f7336c;
    }

    public String getCity() {
        return this.f7335b;
    }

    public String getProvince() {
        return this.f7334a;
    }

    public String getReportTime() {
        return this.f7337d;
    }

    public List<LocalDayWeatherForecast> getWeatherForecast() {
        return this.f7338e;
    }

    public LocalWeatherForecast() {
    }

    public void setAdCode(String str) {
        this.f7336c = str;
    }

    public void setCity(String str) {
        this.f7335b = str;
    }

    public void setProvince(String str) {
        this.f7334a = str;
    }

    public void setReportTime(String str) {
        this.f7337d = str;
    }

    public void setWeatherForecast(List<LocalDayWeatherForecast> list) {
        this.f7338e = list;
    }

    public LocalWeatherForecast(Parcel parcel) {
        this.f7334a = parcel.readString();
        this.f7335b = parcel.readString();
        this.f7336c = parcel.readString();
        this.f7337d = parcel.readString();
        this.f7338e = parcel.readArrayList(LocalWeatherForecast.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7334a);
        parcel.writeString(this.f7335b);
        parcel.writeString(this.f7336c);
        parcel.writeString(this.f7337d);
        parcel.writeList(this.f7338e);
    }
}
