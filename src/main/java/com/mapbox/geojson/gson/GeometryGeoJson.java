package com.mapbox.geojson.gson;

import android.support.annotation.NonNull;
import com.google.gson.GsonBuilder;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.Point;

public class GeometryGeoJson {
    public static Geometry fromJson(@NonNull String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        gsonBuilder.registerTypeAdapter(Point.class, new PointDeserializer());
        gsonBuilder.registerTypeAdapter(Geometry.class, new GeometryDeserializer());
        return (Geometry) gsonBuilder.create().fromJson(str, Geometry.class);
    }
}
