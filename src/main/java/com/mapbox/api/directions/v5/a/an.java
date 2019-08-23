package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.DirectionsAdapterFactory;
import com.mapbox.api.directions.v5.a.g;
import com.mapbox.api.directions.v5.a.w;
import com.mapbox.geojson.Point;

@AutoValue
public abstract class an extends ak {

    @AutoValue.Builder
    public static abstract class a {
    }

    /* access modifiers changed from: package-private */
    @Nullable
    @SerializedName("location")
    public abstract double[] a();

    @Nullable
    public abstract String name();

    public abstract a toBuilder();

    public static a builder() {
        return new g.a();
    }

    @Nullable
    public Point location() {
        return Point.fromLngLat(a()[0], a()[1]);
    }

    public static TypeAdapter<an> typeAdapter(Gson gson) {
        return new w.a(gson);
    }

    public static an fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(DirectionsAdapterFactory.a());
        return (an) gsonBuilder.create().fromJson(str, an.class);
    }
}
