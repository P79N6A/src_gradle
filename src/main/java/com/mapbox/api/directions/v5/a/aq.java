package com.mapbox.api.directions.v5.a;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.DirectionsAdapterFactory;
import com.mapbox.api.directions.v5.a.j;
import com.mapbox.api.directions.v5.a.z;
import java.util.List;

@AutoValue
public abstract class aq extends ak {

    @AutoValue.Builder
    public static abstract class a {
    }

    @Nullable
    public abstract List<ah> bannerInstructions();

    @Nullable
    public abstract String destinations();

    public abstract double distance();

    @Nullable
    @SerializedName("driving_side")
    public abstract String drivingSide();

    public abstract double duration();

    @Nullable
    public abstract String exits();

    @Nullable
    public abstract String geometry();

    @Nullable
    public abstract List<au> intersections();

    @NonNull
    public abstract av maneuver();

    @NonNull
    public abstract String mode();

    @Nullable
    public abstract String name();

    @Nullable
    public abstract String pronunciation();

    @Nullable
    public abstract String ref();

    @Nullable
    @SerializedName("rotary_name")
    public abstract String rotaryName();

    @Nullable
    @SerializedName("rotary_pronunciation")
    public abstract String rotaryPronunciation();

    public abstract a toBuilder();

    @Nullable
    public abstract List<aw> voiceInstructions();

    public abstract double weight();

    public static a builder() {
        return new j.a();
    }

    public static TypeAdapter<aq> typeAdapter(Gson gson) {
        return new z.a(gson);
    }

    public static aq fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(DirectionsAdapterFactory.a());
        return (aq) gsonBuilder.create().fromJson(str, aq.class);
    }
}
