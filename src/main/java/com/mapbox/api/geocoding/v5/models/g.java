package com.mapbox.api.geocoding.v5.models;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.geocoding.v5.models.a;
import com.mapbox.api.geocoding.v5.models.d;
import java.io.Serializable;

@AutoValue
public abstract class g implements Serializable {

    @AutoValue.Builder
    public static abstract class a {
    }

    @Nullable
    public abstract String category();

    @Nullable
    public abstract String id();

    @Nullable
    public abstract String maki();

    @Nullable
    @SerializedName("short_code")
    public abstract String shortCode();

    @Nullable
    public abstract String text();

    public abstract a toBuilder();

    @Nullable
    public abstract String wikidata();

    public static a builder() {
        return new a.C0299a();
    }

    public String toJson() {
        return new GsonBuilder().registerTypeAdapterFactory(GeocodingAdapterFactory.a()).create().toJson((Object) this);
    }

    public static TypeAdapter<g> typeAdapter(Gson gson) {
        return new d.a(gson);
    }

    public static g fromJson(@NonNull String str) {
        return (g) new GsonBuilder().registerTypeAdapterFactory(GeocodingAdapterFactory.a()).create().fromJson(str, g.class);
    }
}
