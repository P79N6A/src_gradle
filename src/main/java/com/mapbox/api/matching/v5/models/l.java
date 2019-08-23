package com.mapbox.api.matching.v5.models;

import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.matching.v5.models.d;
import com.mapbox.api.matching.v5.models.h;
import com.mapbox.geojson.Point;
import java.io.Serializable;

@AutoValue
public abstract class l implements Serializable {

    @AutoValue.Builder
    public static abstract class a {
    }

    /* access modifiers changed from: package-private */
    @Nullable
    @SerializedName("location")
    public abstract double[] a();

    @Nullable
    @SerializedName("alternatives_count")
    public abstract Integer alternativesCount();

    @Nullable
    @SerializedName("matchings_index")
    public abstract Integer matchingsIndex();

    @Nullable
    public abstract String name();

    public abstract a toBuilder();

    @Nullable
    @SerializedName("waypoint_index")
    public abstract Integer waypointIndex();

    public static a builder() {
        return new d.a();
    }

    @Nullable
    public Point location() {
        return Point.fromLngLat(a()[0], a()[1]);
    }

    public static TypeAdapter<l> typeAdapter(Gson gson) {
        return new h.a(gson);
    }
}
