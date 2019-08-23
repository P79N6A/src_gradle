package com.mapbox.api.matching.v5.models;

import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.mapbox.api.matching.v5.models.a;
import com.mapbox.api.matching.v5.models.e;
import java.io.Serializable;

@AutoValue
public abstract class i implements Serializable {

    @AutoValue.Builder
    public static abstract class a {
    }

    @Nullable
    public abstract String code();

    @Nullable
    public abstract String message();

    public static a builder() {
        return new a.C0300a();
    }

    public static TypeAdapter<i> typeAdapter(Gson gson) {
        return new e.a(gson);
    }
}
