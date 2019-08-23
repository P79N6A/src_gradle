package com.bytedance.bdlocation;

import android.location.Location;
import android.os.Build;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bytedance.bdlocation.client.BDPoint;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class BDLocation extends Location {
    private String mAddress;
    private String mAdministrativeArea;
    private String mCity;
    @Deprecated
    private String mCityCode;
    private String mCountry;
    private String mDistrict;
    private String mFloor;
    private BDPoint mGCJ02;
    private double mLatitude;
    private long mLocationMs;
    private String mLocationSDKName;
    private int mLocationType;
    private double mLongitude;
    private String mPoi;
    private String mStreet;
    private String mStreetNum;
    private String mSubAdministrativeArea;
    private transient Location mThirdPartLocation;

    @Retention(RetentionPolicy.SOURCE)
    public @interface LocationType {
    }

    public String getAddress() {
        return this.mAddress;
    }

    public String getAdministrativeArea() {
        return this.mAdministrativeArea;
    }

    public String getCity() {
        return this.mCity;
    }

    @Deprecated
    public String getCityCode() {
        return this.mCityCode;
    }

    public String getCountry() {
        return this.mCountry;
    }

    public String getDistrict() {
        return this.mDistrict;
    }

    public String getFloor() {
        return this.mFloor;
    }

    public BDPoint getGCJ02() {
        return this.mGCJ02;
    }

    public double getLatitude() {
        return this.mLatitude;
    }

    public long getLocationMs() {
        return this.mLocationMs;
    }

    public String getLocationSDKName() {
        return this.mLocationSDKName;
    }

    public int getLocationType() {
        return this.mLocationType;
    }

    public double getLongitude() {
        return this.mLongitude;
    }

    public String getPoi() {
        return this.mPoi;
    }

    public String getStreet() {
        return this.mStreet;
    }

    public String getStreetNum() {
        return this.mStreetNum;
    }

    public String getSubAdministrativeArea() {
        return this.mSubAdministrativeArea;
    }

    public Location getThirdPartLocation() {
        return this.mThirdPartLocation;
    }

    public boolean hasAddress() {
        if (!TextUtils.isEmpty(this.mAddress) || !TextUtils.isEmpty(this.mCountry) || !TextUtils.isEmpty(this.mAdministrativeArea) || !TextUtils.isEmpty(this.mSubAdministrativeArea) || !TextUtils.isEmpty(this.mCity) || !TextUtils.isEmpty(this.mDistrict)) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (Double.compare(this.mLatitude, 0.0d) != 0 || Double.compare(this.mLongitude, 0.0d) != 0 || !TextUtils.isEmpty(this.mAddress) || !TextUtils.isEmpty(this.mCountry) || !TextUtils.isEmpty(this.mAdministrativeArea) || !TextUtils.isEmpty(this.mSubAdministrativeArea) || !TextUtils.isEmpty(this.mCity) || !TextUtils.isEmpty(this.mDistrict)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "BDLocation{mAddress='" + this.mAddress + '\'' + ", mCountry='" + this.mCountry + '\'' + ", mAdministrativeArea='" + this.mAdministrativeArea + '\'' + ", mSubAdministrativeArea='" + this.mSubAdministrativeArea + '\'' + ", mCity='" + this.mCity + '\'' + ", mDistrict='" + this.mDistrict + '\'' + ", mCityCode='" + this.mCityCode + '\'' + ", mLatitude=" + this.mLatitude + ", mLongitude=" + this.mLongitude + ", mStreet='" + this.mStreet + '\'' + ", mStreetNum='" + this.mStreetNum + '\'' + ", mFloor='" + this.mFloor + '\'' + ", mLocationMs=" + this.mLocationMs + ", mThirdPartLocation=" + this.mThirdPartLocation + ", mLocationSDKName='" + this.mLocationSDKName + '\'' + ", mPoi='" + this.mPoi + '\'' + ", mGCJ02=" + this.mGCJ02 + ", mLocationType=" + this.mLocationType + '}';
    }

    public void setAddress(String str) {
        this.mAddress = str;
    }

    public void setAdministrativeArea(String str) {
        this.mAdministrativeArea = str;
    }

    public void setCity(String str) {
        this.mCity = str;
    }

    public void setCityCode(String str) {
        this.mCityCode = str;
    }

    public void setCountry(String str) {
        this.mCountry = str;
    }

    public void setDistrict(String str) {
        this.mDistrict = str;
    }

    public void setFloor(String str) {
        this.mFloor = str;
    }

    public void setGCJ02(BDPoint bDPoint) {
        this.mGCJ02 = bDPoint;
    }

    public void setLocationMs(long j) {
        this.mLocationMs = j;
    }

    public void setLocationSDKName(String str) {
        this.mLocationSDKName = str;
    }

    public void setLocationType(int i) {
        this.mLocationType = i;
    }

    public void setPoi(String str) {
        this.mPoi = str;
    }

    public void setStreet(String str) {
        this.mStreet = str;
    }

    public void setStreetNum(String str) {
        this.mStreetNum = str;
    }

    public void setSubAdministrativeArea(String str) {
        this.mSubAdministrativeArea = str;
    }

    public void setThirdPartLocation(Location location) {
        this.mThirdPartLocation = location;
    }

    public void setLatitude(double d2) {
        super.setLatitude(d2);
        this.mLatitude = d2;
    }

    public void setLongitude(double d2) {
        super.setLongitude(d2);
        this.mLongitude = d2;
    }

    private int transProvider(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if ("gps".equalsIgnoreCase(str)) {
            return 1;
        }
        if (!"network".equalsIgnoreCase(str) && !"bd_lbs".equalsIgnoreCase(str) && !"lbs".equalsIgnoreCase(str)) {
            return 0;
        }
        return 4;
    }

    public BDLocation(@NonNull BDLocation bDLocation) {
        super(bDLocation.getProvider());
        superLocation(bDLocation);
        this.mLocationMs = bDLocation.getTime();
        this.mThirdPartLocation = bDLocation.mThirdPartLocation;
        this.mAddress = bDLocation.mAddress;
        this.mCountry = bDLocation.mCountry;
        this.mAdministrativeArea = bDLocation.mAdministrativeArea;
        this.mSubAdministrativeArea = bDLocation.mSubAdministrativeArea;
        this.mCity = bDLocation.mCity;
        this.mDistrict = bDLocation.mDistrict;
        this.mCityCode = bDLocation.mCityCode;
        setLatitude(bDLocation.getLatitude());
        setLongitude(bDLocation.getLongitude());
        this.mLocationMs = bDLocation.getTime();
        this.mStreet = bDLocation.mStreet;
        this.mStreetNum = bDLocation.mStreetNum;
        this.mFloor = bDLocation.mFloor;
        this.mLocationSDKName = bDLocation.mLocationSDKName;
        this.mGCJ02 = bDLocation.mGCJ02;
        this.mPoi = bDLocation.mPoi;
        this.mLocationType = bDLocation.mLocationType;
    }

    private void superLocation(Location location) {
        setProvider(location.getProvider());
        setTime(location.getTime());
        if (Build.VERSION.SDK_INT >= 17) {
            setElapsedRealtimeNanos(location.getElapsedRealtimeNanos());
        }
        setLatitude(location.getLatitude());
        setLongitude(location.getLongitude());
        setAltitude(location.getAltitude());
        setSpeed(location.getSpeed());
        setBearing(location.getBearing());
        setAccuracy(location.getAccuracy());
        if (Build.VERSION.SDK_INT >= 26) {
            setVerticalAccuracyMeters(location.getVerticalAccuracyMeters());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            setSpeedAccuracyMetersPerSecond(location.getSpeedAccuracyMetersPerSecond());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            setBearingAccuracyDegrees(location.getBearingAccuracyDegrees());
        }
    }

    public BDLocation(@NonNull String str, @NonNull String str2) {
        super(str);
        this.mLocationSDKName = str2;
        this.mLocationType = transProvider(str);
    }

    public BDLocation(@NonNull Location location, @NonNull String str) {
        super(location.getProvider());
        superLocation(location);
        this.mLatitude = location.getLatitude();
        this.mLongitude = location.getLongitude();
        this.mLocationMs = location.getTime();
        this.mThirdPartLocation = location;
        this.mLocationSDKName = str;
        this.mLocationType = transProvider(location.getProvider());
    }
}
