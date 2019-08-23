package com.mapbox.android.telemetry;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class LocationDataSerializer implements JsonSerializer<at> {
    LocationDataSerializer() {
    }

    public /* synthetic */ JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonSerializationContext) {
        at atVar = (at) obj;
        JsonObject jsonObject = new JsonObject();
        JsonArray asJsonArray = jsonSerializationContext.serialize(atVar.f26024a).getAsJsonArray();
        JsonArray asJsonArray2 = jsonSerializationContext.serialize(atVar.f26025b).getAsJsonArray();
        jsonObject.add("locationsBefore", asJsonArray);
        jsonObject.add("locationsAfter", asJsonArray2);
        return jsonObject;
    }
}
