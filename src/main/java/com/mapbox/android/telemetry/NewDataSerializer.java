package com.mapbox.android.telemetry;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class NewDataSerializer implements JsonSerializer<av> {
    NewDataSerializer() {
    }

    public /* synthetic */ JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonSerializationContext) {
        av avVar = (av) obj;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("newDistanceRemaining", (Number) avVar.f26032a);
        jsonObject.addProperty("newDurationRemaining", (Number) avVar.f26033b);
        jsonObject.addProperty("newGeometry", avVar.f26034c);
        return jsonObject;
    }
}
