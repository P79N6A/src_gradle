package com.mapbox.api.matching.v5.models;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.mapbox.api.directions.v5.DirectionsAdapterFactory;
import com.mapbox.api.matching.v5.models.c;
import com.mapbox.api.matching.v5.models.g;
import java.io.Serializable;
import java.util.List;

@AutoValue
public abstract class k implements Serializable {

    @AutoValue.Builder
    public static abstract class a {
    }

    @NonNull
    public abstract String code();

    @Nullable
    public abstract List<j> matchings();

    @Nullable
    public abstract String message();

    public abstract a toBuilder();

    @Nullable
    public abstract List<l> tracepoints();

    public static a builder() {
        return new c.a();
    }

    public static TypeAdapter<k> typeAdapter(Gson gson) {
        return new g.a(gson);
    }

    public static k fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(new AutoValueGson_MapMatchingAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(DirectionsAdapterFactory.a());
        return (k) gsonBuilder.create().fromJson(str, k.class);
    }
}
