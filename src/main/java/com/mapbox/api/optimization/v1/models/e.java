package com.mapbox.api.optimization.v1.models;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.mapbox.api.directions.v5.a.am;
import com.mapbox.api.optimization.v1.models.a;
import com.mapbox.api.optimization.v1.models.c;
import java.io.Serializable;
import java.util.List;

@AutoValue
public abstract class e implements Serializable {

    @AutoValue.Builder
    public static abstract class a {
    }

    @Nullable
    public abstract String code();

    public abstract a toBuilder();

    @Nullable
    public abstract List<am> trips();

    @Nullable
    public abstract List<f> waypoints();

    @NonNull
    public static a builder() {
        return new a.C0302a();
    }

    public static TypeAdapter<e> typeAdapter(Gson gson) {
        return new c.a(gson);
    }
}
