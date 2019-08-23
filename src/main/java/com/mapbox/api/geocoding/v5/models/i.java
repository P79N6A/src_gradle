package com.mapbox.api.geocoding.v5.models;

import android.support.annotation.NonNull;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.mapbox.api.geocoding.v5.models.c;
import com.mapbox.api.geocoding.v5.models.f;
import com.mapbox.geojson.BoundingBox;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.Point;
import com.mapbox.geojson.gson.BoundingBoxDeserializer;
import com.mapbox.geojson.gson.BoundingBoxSerializer;
import com.mapbox.geojson.gson.GeometryDeserializer;
import com.mapbox.geojson.gson.GeometryTypeAdapter;
import com.mapbox.geojson.gson.PointDeserializer;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.List;

@AutoValue
public abstract class i implements Serializable {

    @AutoValue.Builder
    public static abstract class a {
    }

    @NonNull
    public abstract String attribution();

    @NonNull
    public abstract List<h> features();

    @NonNull
    public abstract List<String> query();

    @NonNull
    public abstract a toBuilder();

    @NonNull
    public abstract String type();

    @NonNull
    public static a builder() {
        c.a aVar = new c.a();
        aVar.f26310a = "FeatureCollection";
        return aVar;
    }

    @NonNull
    public String toJson() {
        return new GsonBuilder().registerTypeAdapter(Geometry.class, new GeometryTypeAdapter()).registerTypeAdapter(BoundingBox.class, new BoundingBoxSerializer()).registerTypeAdapterFactory(GeocodingAdapterFactory.a()).create().toJson((Object) this, (Type) i.class);
    }

    public static TypeAdapter<i> typeAdapter(Gson gson) {
        return new f.a(gson);
    }

    @NonNull
    public static i fromJson(@NonNull String str) {
        return (i) new GsonBuilder().registerTypeAdapter(Point.class, new PointDeserializer()).registerTypeAdapter(Geometry.class, new GeometryDeserializer()).registerTypeAdapter(BoundingBox.class, new BoundingBoxDeserializer()).registerTypeAdapterFactory(GeocodingAdapterFactory.a()).create().fromJson(str, i.class);
    }
}
