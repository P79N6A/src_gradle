package com.mapbox.geojson;

import android.support.annotation.FloatRange;
import android.support.annotation.NonNull;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.mapbox.geojson.AutoValue_BoundingBox;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import java.io.Serializable;
import java.lang.reflect.Type;

@AutoValue
public abstract class BoundingBox implements Serializable {
    @NonNull
    public abstract Point northeast();

    @NonNull
    public abstract Point southwest();

    public final double east() {
        return northeast().longitude();
    }

    public final double north() {
        return northeast().latitude();
    }

    public final double south() {
        return southwest().latitude();
    }

    public final double west() {
        return southwest().longitude();
    }

    public final String toJson() {
        return new GsonBuilder().setPrettyPrinting().registerTypeAdapterFactory(GeoJsonAdapterFactory.create()).create().toJson((Object) this, (Type) BoundingBox.class);
    }

    public static TypeAdapter<BoundingBox> typeAdapter(Gson gson) {
        return new AutoValue_BoundingBox.GsonTypeAdapter(gson);
    }

    public static BoundingBox fromJson(String str) {
        return (BoundingBox) new GsonBuilder().registerTypeAdapterFactory(GeoJsonAdapterFactory.create()).create().fromJson(str, BoundingBox.class);
    }

    public static BoundingBox fromPoints(@NonNull Point point, @NonNull Point point2) {
        return new AutoValue_BoundingBox(point, point2);
    }

    @Deprecated
    public static BoundingBox fromCoordinates(@FloatRange(from = -180.0d, to = 180.0d) double d2, @FloatRange(from = -90.0d, to = 90.0d) double d3, @FloatRange(from = -180.0d, to = 180.0d) double d4, @FloatRange(from = -90.0d, to = 90.0d) double d5) {
        return fromLngLats(d2, d3, d4, d5);
    }

    public static BoundingBox fromLngLats(@FloatRange(from = -180.0d, to = 180.0d) double d2, @FloatRange(from = -90.0d, to = 90.0d) double d3, @FloatRange(from = -180.0d, to = 180.0d) double d4, @FloatRange(from = -90.0d, to = 90.0d) double d5) {
        return new AutoValue_BoundingBox(Point.fromLngLat(d2, d3), Point.fromLngLat(d4, d5));
    }

    @Deprecated
    public static BoundingBox fromCoordinates(@FloatRange(from = -180.0d, to = 180.0d) double d2, @FloatRange(from = -90.0d, to = 90.0d) double d3, double d4, @FloatRange(from = -180.0d, to = 180.0d) double d5, @FloatRange(from = -90.0d, to = 90.0d) double d6, double d7) {
        return fromLngLats(d2, d3, d4, d5, d6, d7);
    }

    public static BoundingBox fromLngLats(@FloatRange(from = -180.0d, to = 180.0d) double d2, @FloatRange(from = -90.0d, to = 90.0d) double d3, double d4, @FloatRange(from = -180.0d, to = 180.0d) double d5, @FloatRange(from = -90.0d, to = 90.0d) double d6, double d7) {
        return new AutoValue_BoundingBox(Point.fromLngLat(d2, d3, d4), Point.fromLngLat(d5, d6, d7));
    }
}
