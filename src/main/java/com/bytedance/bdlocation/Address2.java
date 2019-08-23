package com.bytedance.bdlocation;

import android.location.Address;
import java.util.Locale;

public class Address2 extends Address {
    private float accuracy;
    private double altitude;
    private float horizontalAccuracy;
    private float speed;
    private float verticalAccuracy;

    public float getAccuracy() {
        return this.accuracy;
    }

    public double getAltitude() {
        return this.altitude;
    }

    public float getHorizontalAccuracy() {
        return this.horizontalAccuracy;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getVerticalAccuracy() {
        return this.verticalAccuracy;
    }

    public String toString() {
        return "Address2{speed=" + this.speed + ", accuracy=" + this.accuracy + ", altitude=" + this.altitude + ", verticalAccuracy=" + this.verticalAccuracy + ", horizontalAccuracy=" + this.horizontalAccuracy + ", addr= " + super.toString() + '}';
    }

    public Address2(Locale locale) {
        super(locale);
    }

    public void setAccuracy(float f2) {
        this.accuracy = f2;
    }

    public void setAltitude(double d2) {
        this.altitude = d2;
    }

    public void setHorizontalAccuracy(float f2) {
        this.horizontalAccuracy = f2;
    }

    public void setSpeed(float f2) {
        this.speed = f2;
    }

    public void setVerticalAccuracy(float f2) {
        this.verticalAccuracy = f2;
    }

    Address2(Address address) {
        super(address.getLocale());
        setFeatureName(address.getFeatureName());
        for (int i = 0; i <= address.getMaxAddressLineIndex(); i++) {
            setAddressLine(i, address.getAddressLine(i));
        }
        setAdminArea(address.getAdminArea());
        setSubAdminArea(address.getSubAdminArea());
        setLocality(address.getLocality());
        setSubLocality(address.getSubLocality());
        setThoroughfare(address.getThoroughfare());
        setSubThoroughfare(address.getSubThoroughfare());
        setPremises(address.getPremises());
        setPostalCode(address.getPostalCode());
        setCountryCode(address.getCountryCode());
        setCountryName(address.getCountryName());
        setLatitude(address.getLatitude());
        setLongitude(address.getLongitude());
        setPhone(address.getPhone());
        setUrl(address.getUrl());
        setExtras(address.getExtras());
    }
}
