package com.bytedance.bdlocation.utils;

import android.os.Build;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.client.BDPoint;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import java.lang.reflect.Type;

public class BDLocationDeserializer implements JsonDeserializer<BDLocation> {
    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        BDLocation bDLocation = new BDLocation(asJsonObject.getAsJsonPrimitive("mProvider").getAsString(), asJsonObject.getAsJsonPrimitive("mLocationSDKName").getAsString());
        bDLocation.setAccuracy(asJsonObject.getAsJsonPrimitive("mAccuracy").getAsFloat());
        bDLocation.setAltitude((double) asJsonObject.getAsJsonPrimitive("mAltitude").getAsFloat());
        bDLocation.setBearing(asJsonObject.getAsJsonPrimitive("mBearing").getAsFloat());
        if (Build.VERSION.SDK_INT >= 26) {
            bDLocation.setBearingAccuracyDegrees(asJsonObject.getAsJsonPrimitive("mBearingAccuracyDegrees").getAsFloat());
        }
        if (Build.VERSION.SDK_INT >= 17) {
            bDLocation.setElapsedRealtimeNanos(asJsonObject.getAsJsonPrimitive("mElapsedRealtimeNanos").getAsLong());
        }
        bDLocation.setLatitude(asJsonObject.getAsJsonPrimitive("mLatitude").getAsDouble());
        bDLocation.setLongitude(asJsonObject.getAsJsonPrimitive("mLongitude").getAsDouble());
        bDLocation.setSpeed(asJsonObject.getAsJsonPrimitive("mSpeed").getAsFloat());
        if (Build.VERSION.SDK_INT >= 26) {
            bDLocation.setSpeedAccuracyMetersPerSecond(asJsonObject.getAsJsonPrimitive("mSpeedAccuracyMetersPerSecond").getAsFloat());
        }
        bDLocation.setTime(asJsonObject.getAsJsonPrimitive("mTime").getAsLong());
        if (Build.VERSION.SDK_INT >= 26) {
            bDLocation.setVerticalAccuracyMeters(asJsonObject.getAsJsonPrimitive("mVerticalAccuracyMeters").getAsFloat());
        }
        JsonPrimitive asJsonPrimitive = asJsonObject.getAsJsonPrimitive("mAddress");
        if (asJsonPrimitive != null) {
            bDLocation.setAddress(asJsonPrimitive.getAsString());
        }
        JsonPrimitive asJsonPrimitive2 = asJsonObject.getAsJsonPrimitive("mAdministrativeArea");
        if (asJsonPrimitive2 != null) {
            bDLocation.setAdministrativeArea(asJsonPrimitive2.getAsString());
        }
        JsonPrimitive asJsonPrimitive3 = asJsonObject.getAsJsonPrimitive("mSubAdministrativeArea");
        if (asJsonPrimitive3 != null) {
            bDLocation.setSubAdministrativeArea(asJsonPrimitive3.getAsString());
        }
        JsonPrimitive asJsonPrimitive4 = asJsonObject.getAsJsonPrimitive("mCity");
        if (asJsonPrimitive4 != null) {
            bDLocation.setCity(asJsonPrimitive4.getAsString());
        }
        JsonPrimitive asJsonPrimitive5 = asJsonObject.getAsJsonPrimitive("mDistrict");
        if (asJsonPrimitive5 != null) {
            bDLocation.setDistrict(asJsonPrimitive5.getAsString());
        }
        JsonPrimitive asJsonPrimitive6 = asJsonObject.getAsJsonPrimitive("mCityCode");
        if (asJsonPrimitive6 != null) {
            bDLocation.setCityCode(asJsonPrimitive6.getAsString());
        }
        JsonPrimitive asJsonPrimitive7 = asJsonObject.getAsJsonPrimitive("mStreet");
        if (asJsonPrimitive7 != null) {
            bDLocation.setStreet(asJsonPrimitive7.getAsString());
        }
        JsonPrimitive asJsonPrimitive8 = asJsonObject.getAsJsonPrimitive("mStreetNum");
        if (asJsonPrimitive8 != null) {
            bDLocation.setStreetNum(asJsonPrimitive8.getAsString());
        }
        JsonPrimitive asJsonPrimitive9 = asJsonObject.getAsJsonPrimitive("mFloor");
        if (asJsonPrimitive9 != null) {
            bDLocation.setFloor(asJsonPrimitive9.getAsString());
        }
        bDLocation.setLocationMs(asJsonObject.getAsJsonPrimitive("mLocationMs").getAsLong());
        JsonPrimitive asJsonPrimitive10 = asJsonObject.getAsJsonPrimitive("mLocationSDKName");
        if (asJsonPrimitive10 != null) {
            bDLocation.setLocationSDKName(asJsonPrimitive10.getAsString());
        }
        JsonPrimitive asJsonPrimitive11 = asJsonObject.getAsJsonPrimitive("mPoi");
        if (asJsonPrimitive11 != null) {
            bDLocation.setPoi(asJsonPrimitive11.getAsString());
        }
        BDPoint bDPoint = new BDPoint();
        JsonObject asJsonObject2 = asJsonObject.getAsJsonObject("mGCJ02");
        if (asJsonObject2 != null) {
            JsonPrimitive asJsonPrimitive12 = asJsonObject2.getAsJsonPrimitive("provider");
            if (asJsonPrimitive12 != null) {
                bDPoint.setProvider(asJsonPrimitive12.getAsString());
            }
            bDPoint.setLongitude(asJsonObject2.getAsJsonPrimitive("longitude").getAsDouble());
            bDPoint.setLatitude(asJsonObject2.getAsJsonPrimitive("latitude").getAsDouble());
            bDLocation.setGCJ02(bDPoint);
        }
        bDLocation.setLocationType(asJsonObject.getAsJsonPrimitive("mLocationType").getAsInt());
        return bDLocation;
    }
}
