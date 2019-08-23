package com.mapbox.android.telemetry;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class FeedbackDataSerializer implements JsonSerializer<v> {
    FeedbackDataSerializer() {
    }

    public /* synthetic */ JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonSerializationContext) {
        v vVar = (v) obj;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("feedbackId", vVar.f26133a);
        jsonObject.addProperty("screenshot", vVar.f26134b);
        return jsonObject;
    }
}
