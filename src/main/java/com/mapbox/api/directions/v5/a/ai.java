package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.DirectionsAdapterFactory;
import com.mapbox.api.directions.v5.a.c;
import com.mapbox.api.directions.v5.a.s;
import java.util.List;

@AutoValue
public abstract class ai extends ak {

    @AutoValue.Builder
    public static abstract class a {
    }

    @Nullable
    public abstract List<ag> components();

    @Nullable
    public abstract Double degrees();

    @Nullable
    @SerializedName("driving_side")
    public abstract String drivingSide();

    @Nullable
    public abstract String modifier();

    @Nullable
    public abstract String text();

    public abstract a toBuilder();

    @Nullable
    public abstract String type();

    public static a builder() {
        return new c.a();
    }

    public static TypeAdapter<ai> typeAdapter(Gson gson) {
        return new s.a(gson);
    }

    public static ai fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(DirectionsAdapterFactory.a());
        return (ai) gsonBuilder.create().fromJson(str, ai.class);
    }
}
