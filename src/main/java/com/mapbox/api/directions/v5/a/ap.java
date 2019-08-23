package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.mapbox.api.directions.v5.DirectionsAdapterFactory;
import com.mapbox.api.directions.v5.a.i;
import com.mapbox.api.directions.v5.a.y;
import java.util.List;

@AutoValue
public abstract class ap extends ak {

    @AutoValue.Builder
    public static abstract class a {
    }

    @Nullable
    public abstract List<String> congestion();

    @Nullable
    public abstract List<Double> distance();

    @Nullable
    public abstract List<Double> duration();

    @Nullable
    public abstract List<ar> maxspeed();

    @Nullable
    public abstract List<Double> speed();

    public abstract a toBuilder();

    public static a builder() {
        return new i.a();
    }

    public static TypeAdapter<ap> typeAdapter(Gson gson) {
        return new y.a(gson);
    }

    public static ap fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(DirectionsAdapterFactory.a());
        return (ap) gsonBuilder.create().fromJson(str, ap.class);
    }
}
