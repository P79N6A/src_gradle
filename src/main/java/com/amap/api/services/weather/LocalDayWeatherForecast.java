package com.amap.api.services.weather;

import android.os.Parcel;
import android.os.Parcelable;

public class LocalDayWeatherForecast implements Parcelable {
    public static final Parcelable.Creator<LocalDayWeatherForecast> CREATOR = new Parcelable.Creator<LocalDayWeatherForecast>() {
        /* renamed from: a */
        public final LocalDayWeatherForecast[] newArray(int i) {
            return null;
        }

        /* renamed from: a */
        public final LocalDayWeatherForecast createFromParcel(Parcel parcel) {
            return new LocalDayWeatherForecast(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f7328a;

    /* renamed from: b  reason: collision with root package name */
    private String f7329b;

    /* renamed from: c  reason: collision with root package name */
    private String f7330c;

    /* renamed from: d  reason: collision with root package name */
    private String f7331d;

    /* renamed from: e  reason: collision with root package name */
    private String f7332e;

    /* renamed from: f  reason: collision with root package name */
    private String f7333f;
    private String g;
    private String h;
    private String i;
    private String j;

    public int describeContents() {
        return 0;
    }

    public LocalDayWeatherForecast() {
    }

    public String getDate() {
        return this.f7328a;
    }

    public String getDayTemp() {
        return this.f7332e;
    }

    public String getDayWeather() {
        return this.f7330c;
    }

    public String getDayWindDirection() {
        return this.g;
    }

    public String getDayWindPower() {
        return this.i;
    }

    public String getNightTemp() {
        return this.f7333f;
    }

    public String getNightWeather() {
        return this.f7331d;
    }

    public String getNightWindDirection() {
        return this.h;
    }

    public String getNightWindPower() {
        return this.j;
    }

    public String getWeek() {
        return this.f7329b;
    }

    public void setDate(String str) {
        this.f7328a = str;
    }

    public void setDayTemp(String str) {
        this.f7332e = str;
    }

    public void setDayWeather(String str) {
        this.f7330c = str;
    }

    public void setDayWindDirection(String str) {
        this.g = str;
    }

    public void setDayWindPower(String str) {
        this.i = str;
    }

    public void setNightTemp(String str) {
        this.f7333f = str;
    }

    public void setNightWeather(String str) {
        this.f7331d = str;
    }

    public void setNightWindDirection(String str) {
        this.h = str;
    }

    public void setNightWindPower(String str) {
        this.j = str;
    }

    public void setWeek(String str) {
        this.f7329b = str;
    }

    public LocalDayWeatherForecast(Parcel parcel) {
        this.f7328a = parcel.readString();
        this.f7329b = parcel.readString();
        this.f7330c = parcel.readString();
        this.f7331d = parcel.readString();
        this.f7332e = parcel.readString();
        this.f7333f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f7328a);
        parcel.writeString(this.f7329b);
        parcel.writeString(this.f7330c);
        parcel.writeString(this.f7331d);
        parcel.writeString(this.f7332e);
        parcel.writeString(this.f7333f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
    }
}
