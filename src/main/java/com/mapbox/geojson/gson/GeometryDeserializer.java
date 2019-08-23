package com.mapbox.geojson.gson;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mapbox.geojson.Geometry;
import java.lang.reflect.Type;

public class GeometryDeserializer implements JsonDeserializer<Geometry> {
    public Geometry deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        String str;
        if (jsonElement.isJsonObject()) {
            str = jsonElement.getAsJsonObject().get("type").getAsString();
        } else {
            str = jsonElement.getAsJsonArray().get(0).getAsJsonObject().get("type").getAsString();
        }
        try {
            return (Geometry) jsonDeserializationContext.deserialize(jsonElement, Class.forName("com.mapbox.geojson." + str));
        } catch (ClassNotFoundException e2) {
            throw new JsonParseException((Throwable) e2);
        }
    }
}
