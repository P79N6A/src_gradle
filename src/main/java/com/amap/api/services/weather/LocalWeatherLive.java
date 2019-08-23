package com.amap.api.services.weather;

import android.os.Parcel;
import android.os.Parcelable;

public class LocalWeatherLive implements Parcelable {
    public static final Parcelable.Creator<LocalWeatherLive> CREATOR = new Parcelable.Creator<LocalWeatherLive>() {
        /* renamed from: a */
        public final LocalWeatherLive[] newArray(int i) {
            return null;
        }

        /* renamed from: a */
        public final LocalWeatherLive createFromParcel(Parcel parcel) {
            return new LocalWeatherLive(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f7341a;

    /* renamed from: b  reason: collision with root package name */
    private String f7342b;

    /* renamed from: c  reason: collision with root package name */
    private String f7343c;

    /* renamed from: d  reason: collision with root package name */
    private String f7344d;

    /* renamed from: e  reason: collision with root package name */
    private String f7345e;

    /* renamed from: f  reason: collision with root package name */
    private String f7346f;
    private String g;
    private String h;
    private String i;

    public int describeContents() {
        return 0;
    }

    public LocalWeatherLive() {
    }

    public String getAdCode() {
        return this.f7343c;
    }

    public String getCity() {
        return this.f7342b;
    }

    public String getHumidity() {
        return this.h;
    }

    public String getProvince() {
        return this.f7341a;
    }

    public String getReportTime() {
        return this.i;
    }

    public String getTemperature() {
        return this.f7345e;
    }

    public String getWeather() {
        return this.f7344d;
    }

    public String getWindDirection() {
        return this.f7346f;
    }

    public String getWindPower() {
        return this.g;
    }

    public void setAdCode(String str) {
        this.f7343c = str;
    }

    public void setCity(String str) {
        this.f7342b = str;
    }

    public void setHumidity(String str) {
        this.h = str;
    }

    public void setProvince(String str) {
        this.f7341a = str;
    }

    public void setReportTime(String str) {
        this.i = str;
    }

    public void setTemperature(String str) {
        this.f7345e = str;
    }

    public void setWeather(String str) {
        this.f7344d = str;
    }

    public void setWindDirection(String str) {
        this.f7346f = str;
    }

    public void setWindPower(String str) {
        this.g = str;
    }

    public LocalWeatherLive(Parcel parcel) {
        this.f7341a = parcel.readString();
        this.f7342b = parcel.readString();
        this.f7343c = parcel.readString();
        this.f7344d = parcel.readString();
        this.f7345e = parcel.readString();
        this.f7346f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f7341a);
        parcel.writeString(this.f7342b);
        parcel.writeString(this.f7343c);
        parcel.writeString(this.f7344d);
        parcel.writeString(this.f7345e);
        parcel.writeString(this.f7346f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
    }
}
