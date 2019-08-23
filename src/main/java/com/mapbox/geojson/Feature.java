package com.mapbox.geojson;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.mapbox.geojson.AutoValue_Feature;
import com.mapbox.geojson.gson.BoundingBoxDeserializer;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import com.mapbox.geojson.gson.GeometryDeserializer;
import com.mapbox.geojson.gson.PointDeserializer;

@AutoValue
public abstract class Feature implements GeoJson {
    @Nullable
    public abstract BoundingBox bbox();

    @Nullable
    public abstract Geometry geometry();

    @Nullable
    public abstract String id();

    @Nullable
    public abstract JsonObject properties();

    @NonNull
    public abstract String type();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: com.mapbox.geojson.AutoValue_Feature} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.mapbox.geojson.AutoValue_Feature} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toJson() {
        /*
            r8 = this;
            com.google.gson.GsonBuilder r0 = new com.google.gson.GsonBuilder
            r0.<init>()
            java.lang.Class<com.mapbox.geojson.Point> r1 = com.mapbox.geojson.Point.class
            com.mapbox.geojson.gson.PointSerializer r2 = new com.mapbox.geojson.gson.PointSerializer
            r2.<init>()
            r0.registerTypeAdapter(r1, r2)
            java.lang.Class<com.mapbox.geojson.BoundingBox> r1 = com.mapbox.geojson.BoundingBox.class
            com.mapbox.geojson.gson.BoundingBoxSerializer r2 = new com.mapbox.geojson.gson.BoundingBoxSerializer
            r2.<init>()
            r0.registerTypeAdapter(r1, r2)
            com.google.gson.JsonObject r1 = r8.properties()
            int r1 = r1.size()
            if (r1 != 0) goto L_0x0039
            com.mapbox.geojson.AutoValue_Feature r1 = new com.mapbox.geojson.AutoValue_Feature
            java.lang.String r3 = "Feature"
            com.mapbox.geojson.BoundingBox r4 = r8.bbox()
            java.lang.String r5 = r8.id()
            com.mapbox.geojson.Geometry r6 = r8.geometry()
            r7 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x003a
        L_0x0039:
            r1 = r8
        L_0x003a:
            com.google.gson.Gson r0 = r0.create()
            java.lang.String r0 = r0.toJson((java.lang.Object) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.geojson.Feature.toJson():java.lang.String");
    }

    public static TypeAdapter<Feature> typeAdapter(Gson gson) {
        return new AutoValue_Feature.GsonTypeAdapter(gson);
    }

    public Number getNumberProperty(String str) {
        return properties().get(str).getAsNumber();
    }

    public JsonElement getProperty(String str) {
        return properties().get(str);
    }

    public String getStringProperty(String str) {
        return properties().get(str).getAsString();
    }

    public boolean hasProperty(String str) {
        return properties().has(str);
    }

    public JsonElement removeProperty(String str) {
        return properties().remove(str);
    }

    public static Feature fromGeometry(@Nullable Geometry geometry) {
        AutoValue_Feature autoValue_Feature = new AutoValue_Feature("Feature", null, null, geometry, new JsonObject());
        return autoValue_Feature;
    }

    public Boolean getBooleanProperty(String str) {
        return Boolean.valueOf(properties().get(str).getAsBoolean());
    }

    public Character getCharacterProperty(String str) {
        return Character.valueOf(properties().get(str).getAsCharacter());
    }

    public boolean hasNonNullValueForProperty(String str) {
        if (!hasProperty(str) || getProperty(str).isJsonNull()) {
            return false;
        }
        return true;
    }

    public static Feature fromJson(@NonNull String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        gsonBuilder.registerTypeAdapter(Point.class, new PointDeserializer());
        gsonBuilder.registerTypeAdapter(BoundingBox.class, new BoundingBoxDeserializer());
        gsonBuilder.registerTypeAdapter(Geometry.class, new GeometryDeserializer());
        Feature feature = (Feature) gsonBuilder.create().fromJson(str, Feature.class);
        if (feature.properties() != null) {
            return feature;
        }
        AutoValue_Feature autoValue_Feature = new AutoValue_Feature("Feature", feature.bbox(), feature.id(), feature.geometry(), new JsonObject());
        return autoValue_Feature;
    }

    public void addBooleanProperty(String str, Boolean bool) {
        properties().addProperty(str, bool);
    }

    public void addCharacterProperty(String str, Character ch) {
        properties().addProperty(str, ch);
    }

    public void addNumberProperty(String str, Number number) {
        properties().addProperty(str, number);
    }

    public void addProperty(String str, JsonElement jsonElement) {
        properties().add(str, jsonElement);
    }

    public void addStringProperty(String str, String str2) {
        properties().addProperty(str, str2);
    }

    public static Feature fromGeometry(@Nullable Geometry geometry, @Nullable JsonObject jsonObject) {
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        AutoValue_Feature autoValue_Feature = new AutoValue_Feature("Feature", null, null, geometry, jsonObject);
        return autoValue_Feature;
    }

    public static Feature fromGeometry(@Nullable Geometry geometry, @Nullable BoundingBox boundingBox) {
        AutoValue_Feature autoValue_Feature = new AutoValue_Feature("Feature", boundingBox, null, geometry, new JsonObject());
        return autoValue_Feature;
    }

    public static Feature fromGeometry(@Nullable Geometry geometry, @Nullable JsonObject jsonObject, @Nullable BoundingBox boundingBox) {
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        AutoValue_Feature autoValue_Feature = new AutoValue_Feature("Feature", boundingBox, null, geometry, jsonObject);
        return autoValue_Feature;
    }

    public static Feature fromGeometry(@Nullable Geometry geometry, @Nullable JsonObject jsonObject, @Nullable String str) {
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        AutoValue_Feature autoValue_Feature = new AutoValue_Feature("Feature", null, str, geometry, jsonObject);
        return autoValue_Feature;
    }

    public static Feature fromGeometry(@Nullable Geometry geometry, @NonNull JsonObject jsonObject, @Nullable String str, @Nullable BoundingBox boundingBox) {
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        AutoValue_Feature autoValue_Feature = new AutoValue_Feature("Feature", boundingBox, str, geometry, jsonObject);
        return autoValue_Feature;
    }
}
