package com.mapbox.android.telemetry;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class DepartEventSerializer implements JsonSerializer<aq> {
    DepartEventSerializer() {
    }

    public /* synthetic */ JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonSerializationContext) {
        aq aqVar = (aq) obj;
        JsonObject asJsonObject = jsonSerializationContext.serialize(aqVar.f26017e).getAsJsonObject();
        asJsonObject.addProperty("event", aqVar.f26016a);
        return asJsonObject;
    }
}
