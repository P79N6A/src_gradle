package com.bytedance.bdlocation.utils;

import android.location.Location;
import android.os.Build;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class LocationDeserializer implements JsonDeserializer<Location> {
    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        Location location = new Location(asJsonObject.getAsJsonPrimitive("mProvider").getAsString());
        location.setAccuracy(asJsonObject.getAsJsonPrimitive("mAccuracy").getAsFloat());
        location.setAltitude((double) asJsonObject.getAsJsonPrimitive("mAltitude").getAsFloat());
        location.setBearing(asJsonObject.getAsJsonPrimitive("mBearing").getAsFloat());
        if (Build.VERSION.SDK_INT >= 26) {
            location.setBearingAccuracyDegrees(asJsonObject.getAsJsonPrimitive("mBearingAccuracyDegrees").getAsFloat());
        }
        if (Build.VERSION.SDK_INT >= 17) {
            location.setElapsedRealtimeNanos(asJsonObject.getAsJsonPrimitive("mElapsedRealtimeNanos").getAsLong());
        }
        location.setLatitude(asJsonObject.getAsJsonPrimitive("mLatitude").getAsDouble());
        location.setLongitude(asJsonObject.getAsJsonPrimitive("mLongitude").getAsDouble());
        location.setProvider(asJsonObject.getAsJsonPrimitive("mProvider").getAsString());
        location.setSpeed(asJsonObject.getAsJsonPrimitive("mSpeed").getAsFloat());
        if (Build.VERSION.SDK_INT >= 26) {
            location.setSpeedAccuracyMetersPerSecond(asJsonObject.getAsJsonPrimitive("mSpeedAccuracyMetersPerSecond").getAsFloat());
        }
        location.setTime(asJsonObject.getAsJsonPrimitive("mTime").getAsLong());
        if (Build.VERSION.SDK_INT >= 26) {
            location.setVerticalAccuracyMeters(asJsonObject.getAsJsonPrimitive("mVerticalAccuracyMeters").getAsFloat());
        }
        return location;
    }
}
