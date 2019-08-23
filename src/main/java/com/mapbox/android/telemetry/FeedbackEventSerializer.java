package com.mapbox.android.telemetry;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Map;

public class FeedbackEventSerializer implements JsonSerializer<as> {
    FeedbackEventSerializer() {
    }

    public /* synthetic */ JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonSerializationContext) {
        as asVar = (as) obj;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("event", asVar.f26021a);
        for (Map.Entry next : jsonSerializationContext.serialize(asVar.f26022e).getAsJsonObject().entrySet()) {
            jsonObject.add((String) next.getKey(), (JsonElement) next.getValue());
        }
        for (Map.Entry next2 : jsonSerializationContext.serialize(asVar.f26023f).getAsJsonObject().entrySet()) {
            jsonObject.add((String) next2.getKey(), (JsonElement) next2.getValue());
        }
        for (Map.Entry next3 : jsonSerializationContext.serialize(asVar.g).getAsJsonObject().entrySet()) {
            jsonObject.add((String) next3.getKey(), (JsonElement) next3.getValue());
        }
        for (Map.Entry next4 : jsonSerializationContext.serialize(asVar.h).getAsJsonObject().entrySet()) {
            jsonObject.add((String) next4.getKey(), (JsonElement) next4.getValue());
        }
        jsonObject.add("step", jsonSerializationContext.serialize(asVar.i));
        return jsonObject;
    }
}
