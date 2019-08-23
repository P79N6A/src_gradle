package com.mapbox.android.telemetry;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Map;

public class RerouteDataSerializer implements JsonSerializer<aw> {
    RerouteDataSerializer() {
    }

    public /* synthetic */ JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonSerializationContext) {
        aw awVar = (aw) obj;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("secondsSinceLastReroute", (Number) Integer.valueOf(awVar.f26036b));
        for (Map.Entry next : jsonSerializationContext.serialize(awVar.f26035a).getAsJsonObject().entrySet()) {
            jsonObject.add((String) next.getKey(), (JsonElement) next.getValue());
        }
        return jsonObject;
    }
}
