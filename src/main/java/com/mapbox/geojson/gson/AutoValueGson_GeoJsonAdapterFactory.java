package com.mapbox.geojson.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.mapbox.geojson.BoundingBox;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.GeometryCollection;
import com.mapbox.geojson.LineString;
import com.mapbox.geojson.MultiLineString;
import com.mapbox.geojson.MultiPoint;
import com.mapbox.geojson.MultiPolygon;
import com.mapbox.geojson.Point;
import com.mapbox.geojson.Polygon;

public final class AutoValueGson_GeoJsonAdapterFactory extends GeoJsonAdapterFactory {
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (BoundingBox.class.isAssignableFrom(rawType)) {
            return BoundingBox.typeAdapter(gson);
        }
        if (Feature.class.isAssignableFrom(rawType)) {
            return Feature.typeAdapter(gson);
        }
        if (FeatureCollection.class.isAssignableFrom(rawType)) {
            return FeatureCollection.typeAdapter(gson);
        }
        if (GeometryCollection.class.isAssignableFrom(rawType)) {
            return GeometryCollection.typeAdapter(gson);
        }
        if (LineString.class.isAssignableFrom(rawType)) {
            return LineString.typeAdapter(gson);
        }
        if (MultiLineString.class.isAssignableFrom(rawType)) {
            return MultiLineString.typeAdapter(gson);
        }
        if (MultiPoint.class.isAssignableFrom(rawType)) {
            return MultiPoint.typeAdapter(gson);
        }
        if (MultiPolygon.class.isAssignableFrom(rawType)) {
            return MultiPolygon.typeAdapter(gson);
        }
        if (Point.class.isAssignableFrom(rawType)) {
            return Point.typeAdapter(gson);
        }
        if (Polygon.class.isAssignableFrom(rawType)) {
            return Polygon.typeAdapter(gson);
        }
        return null;
    }
}
