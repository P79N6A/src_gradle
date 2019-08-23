package com.mapbox.android.telemetry;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Map;

public class CancelEventSerializer implements JsonSerializer<ap> {
    CancelEventSerializer() {
    }

    public /* synthetic */ JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonSerializationContext) {
        ap apVar = (ap) obj;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("event", apVar.f26013a);
        for (Map.Entry next : jsonSerializationContext.serialize(apVar.f26014e).getAsJsonObject().entrySet()) {
            jsonObject.add((String) next.getKey(), (JsonElement) next.getValue());
        }
        for (Map.Entry next2 : jsonSerializationContext.serialize(apVar.f26015f).getAsJsonObject().entrySet()) {
            jsonObject.add((String) next2.getKey(), (JsonElement) next2.getValue());
        }
        return jsonObject;
    }
}
