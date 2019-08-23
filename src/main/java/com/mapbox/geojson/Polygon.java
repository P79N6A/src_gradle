package com.mapbox.geojson;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.Size;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.mapbox.geojson.AutoValue_Polygon;
import com.mapbox.geojson.exception.GeoJsonException;
import com.mapbox.geojson.gson.BoundingBoxDeserializer;
import com.mapbox.geojson.gson.BoundingBoxSerializer;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import com.mapbox.geojson.gson.GeometryDeserializer;
import com.mapbox.geojson.gson.PointDeserializer;
import com.mapbox.geojson.gson.PointSerializer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@AutoValue
public abstract class Polygon implements CoordinateContainer<List<List<Point>>>, Serializable {
    @Nullable
    public abstract BoundingBox bbox();

    @NonNull
    public abstract List<List<Point>> coordinates();

    @NonNull
    public abstract String type();

    @Nullable
    public LineString outer() {
        return LineString.fromLngLats((List) coordinates().get(0));
    }

    @Nullable
    public List<LineString> inner() {
        List coordinates = coordinates();
        if (coordinates.size() <= 1) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(coordinates.size() - 1);
        for (List fromLngLats : coordinates.subList(1, coordinates.size())) {
            arrayList.add(LineString.fromLngLats(fromLngLats));
        }
        return arrayList;
    }

    public String toJson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Point.class, new PointSerializer());
        gsonBuilder.registerTypeAdapter(BoundingBox.class, new BoundingBoxSerializer());
        return gsonBuilder.create().toJson((Object) this);
    }

    public static TypeAdapter<Polygon> typeAdapter(Gson gson) {
        return new AutoValue_Polygon.GsonTypeAdapter(gson);
    }

    public static Polygon fromLngLats(@NonNull List<List<Point>> list) {
        return new AutoValue_Polygon("Polygon", null, list);
    }

    public static Polygon fromJson(@NonNull String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        gsonBuilder.registerTypeAdapter(Point.class, new PointDeserializer());
        gsonBuilder.registerTypeAdapter(Geometry.class, new GeometryDeserializer());
        gsonBuilder.registerTypeAdapter(BoundingBox.class, new BoundingBoxDeserializer());
        return (Polygon) gsonBuilder.create().fromJson(str, Polygon.class);
    }

    static Polygon fromLngLats(@NonNull double[][][] dArr) {
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double[][] dArr2 : dArr) {
            ArrayList arrayList2 = new ArrayList(dArr2.length);
            for (double[] fromLngLat : dArr2) {
                arrayList2.add(Point.fromLngLat(fromLngLat));
            }
            arrayList.add(arrayList2);
        }
        return new AutoValue_Polygon("Polygon", null, arrayList);
    }

    private static boolean isLinearRing(LineString lineString) {
        if (lineString.coordinates().size() < 4) {
            throw new GeoJsonException("LinearRings need to be made up of 4 or more coordinates.");
        } else if (((Point) lineString.coordinates().get(0)).equals(lineString.coordinates().get(lineString.coordinates().size() - 1))) {
            return true;
        } else {
            throw new GeoJsonException("LinearRings require first and last coordinate to be identical.");
        }
    }

    public static Polygon fromLngLats(@NonNull List<List<Point>> list, @Nullable BoundingBox boundingBox) {
        return new AutoValue_Polygon("Polygon", boundingBox, list);
    }

    public static Polygon fromOuterInner(@NonNull LineString lineString, @Nullable @Size(min = 1) List<LineString> list) {
        isLinearRing(lineString);
        ArrayList arrayList = new ArrayList();
        arrayList.add(lineString.coordinates());
        if (list == null || list.isEmpty()) {
            return new AutoValue_Polygon("Polygon", null, arrayList);
        }
        for (LineString next : list) {
            isLinearRing(next);
            arrayList.add(next.coordinates());
        }
        return new AutoValue_Polygon("Polygon", null, arrayList);
    }

    public static Polygon fromOuterInner(@NonNull LineString lineString, @Nullable LineString... lineStringArr) {
        isLinearRing(lineString);
        ArrayList arrayList = new ArrayList();
        arrayList.add(lineString.coordinates());
        if (lineStringArr == null) {
            return new AutoValue_Polygon("Polygon", null, arrayList);
        }
        for (LineString lineString2 : lineStringArr) {
            isLinearRing(lineString2);
            arrayList.add(lineString2.coordinates());
        }
        return new AutoValue_Polygon("Polygon", null, arrayList);
    }

    public static Polygon fromOuterInner(@NonNull LineString lineString, @Nullable BoundingBox boundingBox, @Nullable @Size(min = 1) List<LineString> list) {
        isLinearRing(lineString);
        ArrayList arrayList = new ArrayList();
        arrayList.add(lineString.coordinates());
        if (list == null) {
            return new AutoValue_Polygon("Polygon", boundingBox, arrayList);
        }
        for (LineString next : list) {
            isLinearRing(next);
            arrayList.add(next.coordinates());
        }
        return new AutoValue_Polygon("Polygon", boundingBox, arrayList);
    }

    public static Polygon fromOuterInner(@NonNull LineString lineString, @Nullable BoundingBox boundingBox, @Nullable LineString... lineStringArr) {
        isLinearRing(lineString);
        ArrayList arrayList = new ArrayList();
        arrayList.add(lineString.coordinates());
        if (lineStringArr == null) {
            return new AutoValue_Polygon("Polygon", boundingBox, arrayList);
        }
        for (LineString lineString2 : lineStringArr) {
            isLinearRing(lineString2);
            arrayList.add(lineString2.coordinates());
        }
        return new AutoValue_Polygon("Polygon", boundingBox, arrayList);
    }
}
