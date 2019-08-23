package com.mapbox.android.telemetry;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class FeedbackEventDataSerializer implements JsonSerializer<w> {
    FeedbackEventDataSerializer() {
    }

    public /* synthetic */ JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonSerializationContext) {
        w wVar = (w) obj;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("feedbackType", wVar.f26136b);
        jsonObject.addProperty("description", wVar.f26138d);
        jsonObject.addProperty("source", wVar.f26137c);
        jsonObject.addProperty("userId", wVar.f26135a);
        return jsonObject;
    }
}
