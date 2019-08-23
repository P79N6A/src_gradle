package com.mapbox.api.matrix.v1.a;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.mapbox.api.directions.v5.a.an;
import com.mapbox.api.matrix.v1.a.a;
import com.mapbox.api.matrix.v1.a.b;
import java.io.Serializable;
import java.util.List;

@AutoValue
public abstract class c implements Serializable {

    @AutoValue.Builder
    public static abstract class a {
    }

    @NonNull
    public abstract String code();

    @Nullable
    public abstract List<an> destinations();

    @Nullable
    public abstract List<Double[]> durations();

    @Nullable
    public abstract List<an> sources();

    public abstract a toBuilder();

    public static a builder() {
        return new a.C0301a();
    }

    public static TypeAdapter<c> typeAdapter(Gson gson) {
        return new b.a(gson);
    }
}
