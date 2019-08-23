package com.mapbox.geojson;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.mapbox.geojson.AutoValue_MultiPoint;
import com.mapbox.geojson.gson.BoundingBoxSerializer;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import com.mapbox.geojson.gson.PointDeserializer;
import com.mapbox.geojson.gson.PointSerializer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@AutoValue
public abstract class MultiPoint implements CoordinateContainer<List<Point>>, Serializable {
    @Nullable
    public abstract BoundingBox bbox();

    @NonNull
    public abstract List<Point> coordinates();

    @NonNull
    public abstract String type();

    public String toJson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Point.class, new PointSerializer());
        gsonBuilder.registerTypeAdapter(BoundingBox.class, new BoundingBoxSerializer());
        return gsonBuilder.create().toJson((Object) this);
    }

    public static TypeAdapter<MultiPoint> typeAdapter(Gson gson) {
        return new AutoValue_MultiPoint.GsonTypeAdapter(gson);
    }

    public static MultiPoint fromLngLats(@NonNull List<Point> list) {
        return new AutoValue_MultiPoint("MultiPoint", null, list);
    }

    static MultiPoint fromLngLats(@NonNull double[][] dArr) {
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double[] fromLngLat : dArr) {
            arrayList.add(Point.fromLngLat(fromLngLat));
        }
        return new AutoValue_MultiPoint("MultiPoint", null, arrayList);
    }

    public static MultiPoint fromJson(@NonNull String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        gsonBuilder.registerTypeAdapter(Point.class, new PointDeserializer());
        return (MultiPoint) gsonBuilder.create().fromJson(str, MultiPoint.class);
    }

    public static MultiPoint fromLngLats(@NonNull List<Point> list, @Nullable BoundingBox boundingBox) {
        return new AutoValue_MultiPoint("MultiPoint", boundingBox, list);
    }
}
