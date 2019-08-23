package com.mapbox.api.directions.v5.a;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.DirectionsAdapterFactory;
import com.mapbox.api.directions.v5.a.ae;
import com.mapbox.api.directions.v5.a.o;
import com.mapbox.geojson.Point;

@AutoValue
public abstract class av extends ak {

    @AutoValue.Builder
    public static abstract class a {
    }

    /* access modifiers changed from: protected */
    @SerializedName("location")
    @NonNull
    public abstract double[] a();

    @Nullable
    @SerializedName("bearing_after")
    public abstract Double bearingAfter();

    @Nullable
    @SerializedName("bearing_before")
    public abstract Double bearingBefore();

    @Nullable
    public abstract Integer exit();

    @Nullable
    public abstract String instruction();

    @Nullable
    public abstract String modifier();

    public abstract a toBuilder();

    @Nullable
    public abstract String type();

    public static a builder() {
        return new o.a();
    }

    @NonNull
    public Point location() {
        return Point.fromLngLat(a()[0], a()[1]);
    }

    public static TypeAdapter<av> typeAdapter(Gson gson) {
        return new ae.a(gson);
    }

    public static av fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(DirectionsAdapterFactory.a());
        return (av) gsonBuilder.create().fromJson(str, av.class);
    }
}
