package com.mapbox.api.geocoding.v5.models;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.geocoding.v5.models.b;
import com.mapbox.api.geocoding.v5.models.e;
import com.mapbox.geojson.BoundingBox;
import com.mapbox.geojson.GeoJson;
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
public abstract class h implements GeoJson, Serializable {

    @AutoValue.Builder
    public static abstract class a {
        public abstract a a(@Nullable JsonObject jsonObject);

        public abstract h a();
    }

    /* access modifiers changed from: package-private */
    @Nullable
    @SerializedName("center")
    public abstract double[] a();

    @Nullable
    public abstract String address();

    @Nullable
    public abstract BoundingBox bbox();

    @Nullable
    public abstract List<g> context();

    @Nullable
    public abstract Geometry geometry();

    @Nullable
    public abstract String id();

    @Nullable
    public abstract String language();

    @Nullable
    @SerializedName("matching_place_name")
    public abstract String matchingPlaceName();

    @Nullable
    @SerializedName("matching_text")
    public abstract String matchingText();

    @Nullable
    @SerializedName("place_name")
    public abstract String placeName();

    @Nullable
    @SerializedName("place_type")
    public abstract List<String> placeType();

    @Nullable
    public abstract JsonObject properties();

    @Nullable
    public abstract Double relevance();

    @Nullable
    public abstract String text();

    public abstract a toBuilder();

    @SerializedName("type")
    @NonNull
    public abstract String type();

    @NonNull
    public static a builder() {
        b.a aVar = new b.a();
        aVar.f26304a = "Feature";
        return aVar.a(new JsonObject());
    }

    @Nullable
    public Point center() {
        double[] a2 = a();
        if (a2 == null || a2.length != 2) {
            return null;
        }
        return Point.fromLngLat(a2[0], a2[1]);
    }

    public String toJson() {
        h hVar;
        Gson create = new GsonBuilder().registerTypeAdapter(Geometry.class, new GeometryTypeAdapter()).registerTypeAdapter(BoundingBox.class, new BoundingBoxSerializer()).registerTypeAdapterFactory(GeocodingAdapterFactory.a()).create();
        if (properties() == null || properties().size() != 0) {
            hVar = this;
        } else {
            hVar = toBuilder().a(null).a();
        }
        return create.toJson((Object) hVar, (Type) h.class);
    }

    public static TypeAdapter<h> typeAdapter(Gson gson) {
        return new e.a(gson);
    }

    @NonNull
    public static h fromJson(@NonNull String str) {
        h hVar = (h) new GsonBuilder().registerTypeAdapter(Point.class, new PointDeserializer()).registerTypeAdapter(Geometry.class, new GeometryDeserializer()).registerTypeAdapter(BoundingBox.class, new BoundingBoxDeserializer()).registerTypeAdapterFactory(GeocodingAdapterFactory.a()).create().fromJson(str, h.class);
        if (hVar.properties() == null) {
            return hVar.toBuilder().a(new JsonObject()).a();
        }
        return hVar;
    }
}
