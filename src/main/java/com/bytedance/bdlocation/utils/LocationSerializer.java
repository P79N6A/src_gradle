package com.bytedance.bdlocation.utils;

import android.location.Location;
import android.os.Build;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class LocationSerializer implements JsonSerializer<Location> {
    public /* synthetic */ JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonSerializationContext) {
        Location location = (Location) obj;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("mProvider", location.getProvider());
        jsonObject.addProperty("mAccuracy", (Number) Float.valueOf(location.getAccuracy()));
        jsonObject.addProperty("mAltitude", (Number) Double.valueOf(location.getAltitude()));
        jsonObject.addProperty("mBearing", (Number) Float.valueOf(location.getBearing()));
        if (Build.VERSION.SDK_INT >= 26) {
            jsonObject.addProperty("mBearingAccuracyDegrees", (Number) Float.valueOf(location.getBearingAccuracyDegrees()));
        }
        if (Build.VERSION.SDK_INT >= 17) {
            jsonObject.addProperty("mElapsedRealtimeNanos", (Number) Long.valueOf(location.getElapsedRealtimeNanos()));
        }
        jsonObject.addProperty("mLatitude", (Number) Double.valueOf(location.getLatitude()));
        jsonObject.addProperty("mLongitude", (Number) Double.valueOf(location.getLongitude()));
        jsonObject.addProperty("mProvider", location.getProvider());
        jsonObject.addProperty("mSpeed", (Number) Float.valueOf(location.getSpeed()));
        if (Build.VERSION.SDK_INT >= 26) {
            jsonObject.addProperty("mSpeedAccuracyMetersPerSecond", (Number) Float.valueOf(location.getSpeedAccuracyMetersPerSecond()));
        }
        jsonObject.addProperty("mTime", (Number) Long.valueOf(location.getTime()));
        if (Build.VERSION.SDK_INT >= 26) {
            jsonObject.addProperty("mVerticalAccuracyMeters", (Number) Float.valueOf(location.getVerticalAccuracyMeters()));
        }
        return jsonObject;
    }
}
