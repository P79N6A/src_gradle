package com.mapbox.api.directions.v5.a;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.DirectionsAdapterFactory;
import com.mapbox.api.directions.v5.a.ad;
import com.mapbox.api.directions.v5.a.n;
import com.mapbox.geojson.Point;
import java.util.List;

@AutoValue
public abstract class au extends ak {

    @AutoValue.Builder
    public static abstract class a {
    }

    /* access modifiers changed from: protected */
    @SerializedName("location")
    @NonNull
    public abstract double[] a();

    @Nullable
    public abstract List<Integer> bearings();

    @Nullable
    public abstract List<String> classes();

    @Nullable
    public abstract List<Boolean> entry();

    @Nullable
    public abstract Integer in();

    @Nullable
    public abstract List<ao> lanes();

    @Nullable
    public abstract Integer out();

    public abstract a toBuilder();

    public static a builder() {
        return new n.a();
    }

    @NonNull
    public Point location() {
        return Point.fromLngLat(a()[0], a()[1]);
    }

    public static TypeAdapter<au> typeAdapter(Gson gson) {
        return new ad.a(gson);
    }

    public static au fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(DirectionsAdapterFactory.a());
        return (au) gsonBuilder.create().fromJson(str, au.class);
    }
}
