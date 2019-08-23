package com.mapbox.android.telemetry;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class CancelDataSerializer implements JsonSerializer<ao> {
    CancelDataSerializer() {
    }

    public /* synthetic */ JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonSerializationContext) {
        ao aoVar = (ao) obj;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("comment", aoVar.f26012c);
        jsonObject.addProperty("rating", (Number) aoVar.f26011b);
        jsonObject.addProperty("arrivalTimestamp", aoVar.f26010a);
        return jsonObject;
    }
}
