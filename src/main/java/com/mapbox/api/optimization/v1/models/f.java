package com.mapbox.api.optimization.v1.models;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.optimization.v1.models.b;
import com.mapbox.api.optimization.v1.models.d;
import com.mapbox.geojson.Point;
import java.io.Serializable;

@AutoValue
public abstract class f implements Serializable {

    @AutoValue.Builder
    public static abstract class a {
    }

    /* access modifiers changed from: package-private */
    @Nullable
    @SerializedName("location")
    public abstract double[] a();

    @Nullable
    public abstract String name();

    public abstract a toBuilder();

    @SerializedName("trips_index")
    public abstract int tripsIndex();

    @SerializedName("waypoint_index")
    public abstract int waypointIndex();

    @NonNull
    public static a builder() {
        return new b.a();
    }

    @Nullable
    public Point location() {
        return Point.fromLngLat(a()[0], a()[1]);
    }

    public static TypeAdapter<f> typeAdapter(Gson gson) {
        return new d.a(gson);
    }
}
