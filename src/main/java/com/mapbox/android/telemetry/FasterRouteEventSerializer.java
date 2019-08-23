package com.mapbox.android.telemetry;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Map;

public class FasterRouteEventSerializer implements JsonSerializer<ar> {
    FasterRouteEventSerializer() {
    }

    public /* synthetic */ JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonSerializationContext) {
        ar arVar = (ar) obj;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("event", arVar.f26018a);
        for (Map.Entry next : jsonSerializationContext.serialize(arVar.f26019e).getAsJsonObject().entrySet()) {
            jsonObject.add((String) next.getKey(), (JsonElement) next.getValue());
        }
        for (Map.Entry next2 : jsonSerializationContext.serialize(arVar.f26020f).getAsJsonObject().entrySet()) {
            jsonObject.add((String) next2.getKey(), (JsonElement) next2.getValue());
        }
        jsonObject.add("step", jsonSerializationContext.serialize(arVar.g));
        return jsonObject;
    }
}
