package com.mapbox.geojson;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.mapbox.geojson.AutoValue_MultiLineString;
import com.mapbox.geojson.gson.BoundingBoxSerializer;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import com.mapbox.geojson.gson.PointDeserializer;
import com.mapbox.geojson.gson.PointSerializer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@AutoValue
public abstract class MultiLineString implements CoordinateContainer<List<List<Point>>>, Serializable {
    @Nullable
    public abstract BoundingBox bbox();

    @NonNull
    public abstract List<List<Point>> coordinates();

    @NonNull
    public abstract String type();

    public List<LineString> lineStrings() {
        List<List> coordinates = coordinates();
        ArrayList arrayList = new ArrayList(coordinates.size());
        for (List fromLngLats : coordinates) {
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

    public static TypeAdapter<MultiLineString> typeAdapter(Gson gson) {
        return new AutoValue_MultiLineString.GsonTypeAdapter(gson);
    }

    public static MultiLineString fromLngLats(@NonNull List<List<Point>> list) {
        return new AutoValue_MultiLineString("MultiLineString", null, list);
    }

    public static MultiLineString fromLineString(@NonNull LineString lineString) {
        return new AutoValue_MultiLineString("MultiLineString", null, Arrays.asList(new List[]{lineString.coordinates()}));
    }

    public static MultiLineString fromJson(@NonNull String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        gsonBuilder.registerTypeAdapter(Point.class, new PointDeserializer());
        return (MultiLineString) gsonBuilder.create().fromJson(str, MultiLineString.class);
    }

    public static MultiLineString fromLineStrings(@NonNull List<LineString> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (LineString coordinates : list) {
            arrayList.add(coordinates.coordinates());
        }
        return new AutoValue_MultiLineString("MultiLineString", null, arrayList);
    }

    static MultiLineString fromLngLats(double[][][] dArr) {
        ArrayList arrayList = new ArrayList(dArr.length);
        for (int i = 0; i < dArr.length; i++) {
            ArrayList arrayList2 = new ArrayList(dArr[i].length);
            for (double[] fromLngLat : dArr[i]) {
                arrayList2.add(Point.fromLngLat(fromLngLat));
            }
            arrayList.add(arrayList2);
        }
        return new AutoValue_MultiLineString("MultiLineString", null, arrayList);
    }

    public static MultiLineString fromLngLats(@NonNull List<List<Point>> list, @Nullable BoundingBox boundingBox) {
        return new AutoValue_MultiLineString("MultiLineString", boundingBox, list);
    }

    public static MultiLineString fromLineString(@NonNull LineString lineString, @Nullable BoundingBox boundingBox) {
        return new AutoValue_MultiLineString("MultiLineString", boundingBox, Arrays.asList(new List[]{lineString.coordinates()}));
    }

    public static MultiLineString fromLineStrings(@NonNull List<LineString> list, @Nullable BoundingBox boundingBox) {
        ArrayList arrayList = new ArrayList(list.size());
        for (LineString coordinates : list) {
            arrayList.add(coordinates.coordinates());
        }
        return new AutoValue_MultiLineString("MultiLineString", boundingBox, arrayList);
    }
}