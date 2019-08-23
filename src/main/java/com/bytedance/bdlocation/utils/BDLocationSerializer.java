package com.bytedance.bdlocation.utils;

import android.os.Build;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.Util;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class BDLocationSerializer implements JsonSerializer<BDLocation> {
    public /* synthetic */ JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonSerializationContext) {
        BDLocation bDLocation = (BDLocation) obj;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("mProvider", bDLocation.getProvider());
        jsonObject.addProperty("mAccuracy", (Number) Float.valueOf(bDLocation.getAccuracy()));
        jsonObject.addProperty("mAltitude", (Number) Double.valueOf(bDLocation.getAltitude()));
        jsonObject.addProperty("mBearing", (Number) Float.valueOf(bDLocation.getBearing()));
        if (Build.VERSION.SDK_INT >= 26) {
            jsonObject.addProperty("mBearingAccuracyDegrees", (Number) Float.valueOf(bDLocation.getBearingAccuracyDegrees()));
        }
        if (Build.VERSION.SDK_INT >= 17) {
            jsonObject.addProperty("mElapsedRealtimeNanos", (Number) Long.valueOf(bDLocation.getElapsedRealtimeNanos()));
        }
        jsonObject.addProperty("mLatitude", (Number) Double.valueOf(bDLocation.getLatitude()));
        jsonObject.addProperty("mLongitude", (Number) Double.valueOf(bDLocation.getLongitude()));
        jsonObject.addProperty("mProvider", bDLocation.getProvider());
        jsonObject.addProperty("mSpeed", (Number) Float.valueOf(bDLocation.getSpeed()));
        if (Build.VERSION.SDK_INT >= 26) {
            jsonObject.addProperty("mSpeedAccuracyMetersPerSecond", (Number) Float.valueOf(bDLocation.getSpeedAccuracyMetersPerSecond()));
        }
        jsonObject.addProperty("mTime", (Number) Long.valueOf(bDLocation.getTime()));
        if (Build.VERSION.SDK_INT >= 26) {
            jsonObject.addProperty("mVerticalAccuracyMeters", (Number) Float.valueOf(bDLocation.getVerticalAccuracyMeters()));
        }
        jsonObject.addProperty("mAddress", bDLocation.getAddress());
        jsonObject.addProperty("mCountry", bDLocation.getCountry());
        jsonObject.addProperty("mAdministrativeArea", bDLocation.getAdministrativeArea());
        jsonObject.addProperty("mSubAdministrativeArea", bDLocation.getSubAdministrativeArea());
        jsonObject.addProperty("mCity", bDLocation.getCity());
        jsonObject.addProperty("mDistrict", bDLocation.getDistrict());
        jsonObject.addProperty("mCityCode", bDLocation.getCityCode());
        jsonObject.addProperty("mStreet", bDLocation.getStreet());
        jsonObject.addProperty("mStreetNum", bDLocation.getStreetNum());
        jsonObject.addProperty("mFloor", bDLocation.getFloor());
        jsonObject.addProperty("mLocationMs", (Number) Long.valueOf(bDLocation.getLocationMs()));
        jsonObject.addProperty("mLocationSDKName", bDLocation.getLocationSDKName());
        jsonObject.addProperty("mPoi", bDLocation.getPoi());
        jsonObject.addProperty("mLocationType", (Number) Integer.valueOf(bDLocation.getLocationType()));
        jsonObject.add("mGCJ02", Util.sGson.toJsonTree(bDLocation.getGCJ02()));
        return jsonObject;
    }
}
