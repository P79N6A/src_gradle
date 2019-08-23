package com.mapbox.api.directions.v5.a;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.mapbox.api.directions.v5.DirectionsAdapterFactory;
import com.mapbox.api.directions.v5.a.e;
import com.mapbox.api.directions.v5.a.u;
import com.mapbox.geojson.Point;
import com.mapbox.geojson.gson.PointDeserializer;
import java.util.List;

@AutoValue
public abstract class al extends ak {

    @AutoValue.Builder
    public static abstract class a {
        public abstract a a(@NonNull List<am> list);

        public abstract al a();
    }

    @NonNull
    public abstract String code();

    @Nullable
    public abstract String message();

    @NonNull
    public abstract List<am> routes();

    public abstract a toBuilder();

    @Nullable
    public abstract String uuid();

    @Nullable
    public abstract List<an> waypoints();

    @NonNull
    public static a builder() {
        return new e.a();
    }

    public static TypeAdapter<al> typeAdapter(Gson gson) {
        return new u.a(gson);
    }

    public static al fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(DirectionsAdapterFactory.a());
        gsonBuilder.registerTypeAdapter(Point.class, new PointDeserializer());
        return (al) gsonBuilder.create().fromJson(str, al.class);
    }
}
