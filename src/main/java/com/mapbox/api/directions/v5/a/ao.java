package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.mapbox.api.directions.v5.DirectionsAdapterFactory;
import com.mapbox.api.directions.v5.a.h;
import com.mapbox.api.directions.v5.a.x;
import java.util.List;

@AutoValue
public abstract class ao extends ak {

    @AutoValue.Builder
    public static abstract class a {
    }

    @Nullable
    public abstract List<String> indications();

    public abstract a toBuilder();

    @Nullable
    public abstract Boolean valid();

    public static a builder() {
        return new h.a();
    }

    public static TypeAdapter<ao> typeAdapter(Gson gson) {
        return new x.a(gson);
    }

    public static ao fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(DirectionsAdapterFactory.a());
        return (ao) gsonBuilder.create().fromJson(str, ao.class);
    }
}
