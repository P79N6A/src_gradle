package com.mapbox.api.directions.v5.a;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.mapbox.api.directions.v5.DirectionsAdapterFactory;
import com.mapbox.api.directions.v5.a.ac;
import com.mapbox.api.directions.v5.a.m;
import com.mapbox.geojson.Point;
import com.mapbox.geojson.gson.PointDeserializer;
import java.util.List;

@AutoValue
public abstract class at extends ak {

    @AutoValue.Builder
    public static abstract class a {
        public abstract a a(@Nullable Boolean bool);

        public abstract a a(@NonNull String str);

        public abstract a a(@NonNull List<Point> list);

        public abstract at a();

        public abstract a b(Boolean bool);

        public abstract a b(@NonNull String str);

        public abstract a c(@Nullable Boolean bool);

        public abstract a c(@NonNull String str);

        public abstract a d(@Nullable Boolean bool);

        public abstract a d(String str);

        public abstract a e(Boolean bool);

        public abstract a e(String str);

        public abstract a f(Boolean bool);

        public abstract a f(String str);

        public abstract a g(String str);

        public abstract a h(@Nullable String str);

        public abstract a i(String str);

        @Nullable
        public abstract a j(@NonNull String str);

        public abstract a k(@Nullable String str);

        public abstract a l(@NonNull String str);

        public abstract a m(@NonNull String str);

        @Nullable
        public abstract a n(String str);

        @Nullable
        public abstract a o(@Nullable String str);
    }

    @NonNull
    public abstract String accessToken();

    @Nullable
    public abstract Boolean alternatives();

    @Nullable
    public abstract String annotations();

    @Nullable
    public abstract String approaches();

    @Nullable
    public abstract Boolean bannerInstructions();

    @NonNull
    public abstract String baseUrl();

    @Nullable
    public abstract String bearings();

    @Nullable
    public abstract Boolean continueStraight();

    @NonNull
    public abstract List<Point> coordinates();

    @Nullable
    public abstract String exclude();

    public abstract String geometries();

    @Nullable
    public abstract String language();

    @Nullable
    public abstract String overview();

    @NonNull
    public abstract String profile();

    @Nullable
    public abstract String radiuses();

    @NonNull
    public abstract String requestUuid();

    @Nullable
    public abstract Boolean roundaboutExits();

    @Nullable
    public abstract Boolean steps();

    @NonNull
    public abstract String user();

    @Nullable
    public abstract Boolean voiceInstructions();

    @Nullable
    public abstract String voiceUnits();

    @Nullable
    public abstract String waypointNames();

    public static a builder() {
        return new m.a();
    }

    public static TypeAdapter<at> typeAdapter(Gson gson) {
        return new ac.a(gson);
    }

    public static at fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(DirectionsAdapterFactory.a());
        gsonBuilder.registerTypeAdapter(Point.class, new PointDeserializer());
        return (at) gsonBuilder.create().fromJson(str, at.class);
    }
}
