package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.mapbox.api.directions.v5.DirectionsAdapterFactory;
import com.mapbox.api.directions.v5.a.af;
import com.mapbox.api.directions.v5.a.p;

@AutoValue
public abstract class aw extends ak {

    @AutoValue.Builder
    public static abstract class a {
    }

    @Nullable
    public abstract String announcement();

    @Nullable
    public abstract Double distanceAlongGeometry();

    @Nullable
    public abstract String ssmlAnnouncement();

    public abstract a toBuilder();

    public static a builder() {
        return new p.a();
    }

    public static TypeAdapter<aw> typeAdapter(Gson gson) {
        return new af.a(gson);
    }

    public static aw fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(DirectionsAdapterFactory.a());
        return (aw) gsonBuilder.create().fromJson(str, aw.class);
    }
}
