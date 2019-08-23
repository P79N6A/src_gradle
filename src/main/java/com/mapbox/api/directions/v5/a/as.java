package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.mapbox.api.directions.v5.DirectionsAdapterFactory;
import com.mapbox.api.directions.v5.a.ab;
import com.mapbox.api.directions.v5.a.l;
import java.util.List;

@AutoValue
public abstract class as extends ak {

    @AutoValue.Builder
    public static abstract class a {
    }

    @Nullable
    public abstract ap annotation();

    @Nullable
    public abstract Double distance();

    @Nullable
    public abstract Double duration();

    @Nullable
    public abstract List<aq> steps();

    @Nullable
    public abstract String summary();

    public abstract a toBuilder();

    public static a builder() {
        return new l.a();
    }

    public static TypeAdapter<as> typeAdapter(Gson gson) {
        return new ab.a(gson);
    }

    public static as fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(DirectionsAdapterFactory.a());
        return (as) gsonBuilder.create().fromJson(str, as.class);
    }
}
