package com.mapbox.geojson.gson;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mapbox.geojson.BoundingBox;
import java.lang.reflect.Type;

public class BoundingBoxSerializer implements JsonSerializer<BoundingBox> {
    public JsonElement serialize(BoundingBox boundingBox, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add((JsonElement) new JsonPrimitive((Number) Double.valueOf(boundingBox.southwest().longitude())));
        jsonArray.add((JsonElement) new JsonPrimitive((Number) Double.valueOf(boundingBox.southwest().latitude())));
        if (boundingBox.southwest().hasAltitude()) {
            jsonArray.add((JsonElement) new JsonPrimitive((Number) Double.valueOf(boundingBox.southwest().altitude())));
        }
        jsonArray.add((JsonElement) new JsonPrimitive((Number) Double.valueOf(boundingBox.northeast().longitude())));
        jsonArray.add((JsonElement) new JsonPrimitive((Number) Double.valueOf(boundingBox.northeast().latitude())));
        if (boundingBox.southwest().hasAltitude()) {
            jsonArray.add((JsonElement) new JsonPrimitive((Number) Double.valueOf(boundingBox.northeast().altitude())));
        }
        return jsonArray;
    }
}
