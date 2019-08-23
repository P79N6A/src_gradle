package com.mapbox.android.telemetry;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Map;

public class ArriveEventSerializer implements JsonSerializer<an> {
    ArriveEventSerializer() {
    }

    public /* synthetic */ JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonSerializationContext) {
        an anVar = (an) obj;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("event", anVar.f26008a);
        for (Map.Entry next : jsonSerializationContext.serialize(anVar.f26009e).getAsJsonObject().entrySet()) {
            jsonObject.add((String) next.getKey(), (JsonElement) next.getValue());
        }
        return jsonObject;
    }
}
