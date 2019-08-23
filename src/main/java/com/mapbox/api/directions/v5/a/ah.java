package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.mapbox.api.directions.v5.DirectionsAdapterFactory;
import com.mapbox.api.directions.v5.a.b;
import com.mapbox.api.directions.v5.a.r;

@AutoValue
public abstract class ah extends ak {

    @AutoValue.Builder
    public static abstract class a {
    }

    public abstract double distanceAlongGeometry();

    @Nullable
    public abstract ai primary();

    @Nullable
    public abstract ai secondary();

    @Nullable
    public abstract ai sub();

    public abstract a toBuilder();

    public static a builder() {
        return new b.a();
    }

    public static TypeAdapter<ah> typeAdapter(Gson gson) {
        return new r.a(gson);
    }

    public static ah fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(DirectionsAdapterFactory.a());
        return (ah) gsonBuilder.create().fromJson(str, ah.class);
    }
}
