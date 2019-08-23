package com.mapbox.android.telemetry;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Map;

public class RerouteEventSerializer implements JsonSerializer<ax> {
    RerouteEventSerializer() {
    }

    public /* synthetic */ JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonSerializationContext) {
        ax axVar = (ax) obj;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("event", axVar.f26037a);
        for (Map.Entry next : jsonSerializationContext.serialize(axVar.f26038e).getAsJsonObject().entrySet()) {
            jsonObject.add((String) next.getKey(), (JsonElement) next.getValue());
        }
        for (Map.Entry next2 : jsonSerializationContext.serialize(axVar.f26039f).getAsJsonObject().entrySet()) {
            jsonObject.add((String) next2.getKey(), (JsonElement) next2.getValue());
        }
        for (Map.Entry next3 : jsonSerializationContext.serialize(axVar.g).getAsJsonObject().entrySet()) {
            jsonObject.add((String) next3.getKey(), (JsonElement) next3.getValue());
        }
        for (Map.Entry next4 : jsonSerializationContext.serialize(axVar.h).getAsJsonObject().entrySet()) {
            jsonObject.add((String) next4.getKey(), (JsonElement) next4.getValue());
        }
        jsonObject.add("step", jsonSerializationContext.serialize(axVar.i));
        return jsonObject;
    }
}
