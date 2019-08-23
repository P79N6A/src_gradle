package com.autonavi.amap.mapcore2d;

import android.location.Location;
import com.amap.api.mapcore2d.gc;
import com.amap.api.mapcore2d.gf;
import org.json.JSONObject;

public class Inner_3dMap_location extends Location {
    private String adCode = "";
    private String address = "";
    private String aoiName = "";
    protected String buildingId = "";
    private String city = "";
    private String cityCode = "";
    private String country = "";
    protected String desc = "";
    private String district = "";
    private int errorCode;
    private String errorInfo = "success";
    protected String floor = "";
    private boolean isOffset = true;
    private double latitude;
    private String locationDetail = "";
    private int locationType;
    private double longitude;
    private String number = "";
    private String poiName = "";
    private String province = "";
    private String road = "";
    private int satellites;
    private int signalIntensity = -1;
    private String street = "";

    public Inner_3dMap_location(Location location) {
        super(location);
        this.latitude = location.getLatitude();
        this.longitude = location.getLongitude();
    }

    public Inner_3dMap_location(String str) {
        super(str);
    }

    public float getAccuracy() {
        return super.getAccuracy();
    }

    public String getAdCode() {
        return this.adCode;
    }

    public String getAddress() {
        return this.address;
    }

    public double getAltitude() {
        return super.getAltitude();
    }

    public String getAoiName() {
        return this.aoiName;
    }

    public float getBearing() {
        return super.getBearing();
    }

    public String getBuildingId() {
        return this.buildingId;
    }

    public String getCity() {
        return this.city;
    }

    public String getCityCode() {
        return this.cityCode;
    }

    public String getCountry() {
        return this.country;
    }

    public String getDistrict() {
        return this.district;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.errorInfo);
        if (this.errorCode != 0) {
            sb.append(" 请到http://lbs.amap.com/api/android-location-sdk/guide/utilities/errorcode/查看错误码说明");
            sb.append(",错误详细信息:" + this.locationDetail);
        }
        this.errorInfo = sb.toString();
        return this.errorInfo;
    }

    public String getFloor() {
        return this.floor;
    }

    public int getGpsAccuracyStatus() {
        return this.signalIntensity;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public String getLocationDetail() {
        return this.locationDetail;
    }

    public int getLocationType() {
        return this.locationType;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public String getPoiName() {
        return this.poiName;
    }

    public String getProvider() {
        return super.getProvider();
    }

    public String getProvince() {
        return this.province;
    }

    public String getRoad() {
        return this.road;
    }

    public int getSatellites() {
        return this.satellites;
    }

    public float getSpeed() {
        return super.getSpeed();
    }

    public String getStreet() {
        return this.street;
    }

    public String getStreetNum() {
        return this.number;
    }

    public boolean isOffset() {
        return this.isOffset;
    }

    public void setAdCode(String str) {
        this.adCode = str;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setAoiName(String str) {
        this.aoiName = str;
    }

    public void setBuildingId(String str) {
        this.buildingId = str;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setCityCode(String str) {
        this.cityCode = str;
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public void setDistrict(String str) {
        this.district = str;
    }

    public void setErrorCode(int i) {
        if (this.errorCode == 0) {
            this.errorInfo = gf.b(i);
            this.errorCode = i;
        }
    }

    public void setErrorInfo(String str) {
        this.errorInfo = str;
    }

    public void setFloor(String str) {
        this.floor = str;
    }

    public void setGpsAccuracyStatus(int i) {
        this.signalIntensity = i;
    }

    public void setLatitude(double d2) {
        this.latitude = d2;
    }

    public void setLocationDetail(String str) {
        this.locationDetail = str;
    }

    public void setLocationType(int i) {
        this.locationType = i;
    }

    public void setLongitude(double d2) {
        this.longitude = d2;
    }

    public void setNumber(String str) {
        this.number = str;
    }

    public void setOffset(boolean z) {
        this.isOffset = z;
    }

    public void setPoiName(String str) {
        this.poiName = str;
    }

    public void setProvince(String str) {
        this.province = str;
    }

    public void setRoad(String str) {
        this.road = str;
    }

    public void setSatellites(int i) {
        this.satellites = i;
    }

    public void setStreet(String str) {
        this.street = str;
    }

    /* access modifiers changed from: protected */
    public JSONObject toJson(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            switch (i) {
                case 1:
                    try {
                        jSONObject.put("altitude", getAltitude());
                        jSONObject.put("speed", (double) getSpeed());
                        jSONObject.put("bearing", (double) getBearing());
                    } catch (Throwable unused) {
                    }
                    jSONObject.put("citycode", this.cityCode);
                    jSONObject.put("desc", this.desc);
                    jSONObject.put("adcode", this.adCode);
                    jSONObject.put("country", this.country);
                    jSONObject.put("province", this.province);
                    jSONObject.put("city", this.city);
                    jSONObject.put("district", this.district);
                    jSONObject.put("road", this.road);
                    jSONObject.put("street", this.street);
                    jSONObject.put("number", this.number);
                    jSONObject.put("poiname", this.poiName);
                    jSONObject.put("errorCode", this.errorCode);
                    jSONObject.put("errorInfo", this.errorInfo);
                    jSONObject.put("locationType", this.locationType);
                    jSONObject.put("locationDetail", this.locationDetail);
                    jSONObject.put("aoiname", this.aoiName);
                    jSONObject.put("address", this.address);
                    jSONObject.put("poiid", this.buildingId);
                    jSONObject.put("floor", this.floor);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    return jSONObject;
            }
            jSONObject.put("time", getTime());
            jSONObject.put("provider", getProvider());
            jSONObject.put("lon", getLongitude());
            jSONObject.put("lat", getLatitude());
            jSONObject.put("accuracy", (double) getAccuracy());
            jSONObject.put("isOffset", this.isOffset);
            return jSONObject;
        } catch (Throwable th) {
            gc.a(th, "AmapLoc", "toStr");
            return null;
        }
    }

    public String toStr() {
        return toStr(1);
    }

    public String toStr(int i) {
        JSONObject jSONObject;
        try {
            jSONObject = toJson(i);
        } catch (Throwable th) {
            gc.a(th, "AMapLocation", "toStr part2");
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            stringBuffer.append("latitude=" + this.latitude + "#");
            stringBuffer.append("longitude=" + this.longitude + "#");
            stringBuffer.append("province=" + this.province + "#");
            stringBuffer.append("city=" + this.city + "#");
            stringBuffer.append("district=" + this.district + "#");
            stringBuffer.append("cityCode=" + this.cityCode + "#");
            stringBuffer.append("adCode=" + this.adCode + "#");
            stringBuffer.append("address=" + this.address + "#");
            stringBuffer.append("country=" + this.country + "#");
            stringBuffer.append("road=" + this.road + "#");
            stringBuffer.append("poiName=" + this.poiName + "#");
            stringBuffer.append("street=" + this.street + "#");
            stringBuffer.append("streetNum=" + this.number + "#");
            stringBuffer.append("aoiName=" + this.aoiName + "#");
            stringBuffer.append("poiid=" + this.buildingId + "#");
            stringBuffer.append("floor=" + this.floor + "#");
            stringBuffer.append("errorCode=" + this.errorCode + "#");
            stringBuffer.append("errorInfo=" + this.errorInfo + "#");
            stringBuffer.append("locationDetail=" + this.locationDetail + "#");
            StringBuilder sb = new StringBuilder("locationType=");
            sb.append(this.locationType);
            stringBuffer.append(sb.toString());
        } catch (Throwable unused) {
        }
        return stringBuffer.toString();
    }
}
