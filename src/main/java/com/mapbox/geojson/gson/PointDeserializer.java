package com.mapbox.geojson.gson;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.mapbox.geojson.Point;
import java.lang.reflect.Type;

public class PointDeserializer implements JsonDeserializer<Point> {
    public Point deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonArray jsonArray;
        if (jsonElement.isJsonObject()) {
            jsonArray = jsonElement.getAsJsonObject().getAsJsonArray("coordinates");
        } else {
            jsonArray = jsonElement.getAsJsonArray();
        }
        double asDouble = jsonArray.get(0).getAsDouble();
        double asDouble2 = jsonArray.get(1).getAsDouble();
        if (jsonArray.size() > 2) {
            return Point.fromLngLat(asDouble, asDouble2, jsonArray.get(2).getAsDouble());
        }
        return Point.fromLngLat(asDouble, asDouble2);
    }
}
