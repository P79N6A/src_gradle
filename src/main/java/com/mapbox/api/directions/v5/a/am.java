package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.DirectionsAdapterFactory;
import com.mapbox.api.directions.v5.a.f;
import com.mapbox.api.directions.v5.a.v;
import com.mapbox.geojson.Point;
import com.mapbox.geojson.gson.PointDeserializer;
import java.util.List;

@AutoValue
public abstract class am extends ak {

    @AutoValue.Builder
    public static abstract class a {
        public abstract a a(@Nullable at atVar);

        public abstract a a(@Nullable Double d2);

        public abstract a a(@Nullable String str);

        public abstract a a(@Nullable List<as> list);

        public abstract am a();

        public abstract a b(@Nullable Double d2);

        public abstract a b(@Nullable String str);

        public abstract a c(@Nullable Double d2);

        public abstract a c(@Nullable String str);
    }

    @Nullable
    public abstract Double distance();

    @Nullable
    public abstract Double duration();

    @Nullable
    public abstract String geometry();

    @Nullable
    public abstract List<as> legs();

    @Nullable
    public abstract at routeOptions();

    public abstract a toBuilder();

    @Nullable
    @SerializedName("voiceLocale")
    public abstract String voiceLanguage();

    @Nullable
    public abstract Double weight();

    @Nullable
    @SerializedName("weight_name")
    public abstract String weightName();

    public static a builder() {
        return new f.a();
    }

    public static TypeAdapter<am> typeAdapter(Gson gson) {
        return new v.a(gson);
    }

    public static am fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(DirectionsAdapterFactory.a());
        gsonBuilder.registerTypeAdapter(Point.class, new PointDeserializer());
        return (am) gsonBuilder.create().fromJson(str, am.class);
    }
}
