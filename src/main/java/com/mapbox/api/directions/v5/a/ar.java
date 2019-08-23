package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.mapbox.api.directions.v5.DirectionsAdapterFactory;
import com.mapbox.api.directions.v5.a.aa;
import com.mapbox.api.directions.v5.a.k;

@AutoValue
public abstract class ar extends ak {

    @AutoValue.Builder
    public static abstract class a {
    }

    @Nullable
    public abstract Boolean none();

    @Nullable
    public abstract Integer speed();

    public abstract a toBuilder();

    @Nullable
    public abstract String unit();

    @Nullable
    public abstract Boolean unknown();

    public static a builder() {
        return new k.a();
    }

    public static TypeAdapter<ar> typeAdapter(Gson gson) {
        return new aa.a(gson);
    }

    public static ar fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(DirectionsAdapterFactory.a());
        return (ar) gsonBuilder.create().fromJson(str, ar.class);
    }
}
