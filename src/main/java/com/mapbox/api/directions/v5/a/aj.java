package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.mapbox.api.directions.v5.a.d;
import com.mapbox.api.directions.v5.a.t;
import java.io.Serializable;

@AutoValue
public abstract class aj implements Serializable {

    @AutoValue.Builder
    public static abstract class a {
    }

    @Nullable
    public abstract String code();

    @Nullable
    public abstract String message();

    public abstract a toBuilder();

    public static a builder() {
        return new d.a();
    }

    public static TypeAdapter<aj> typeAdapter(Gson gson) {
        return new t.a(gson);
    }
}
