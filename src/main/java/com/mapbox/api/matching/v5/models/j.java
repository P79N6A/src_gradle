package com.mapbox.api.matching.v5.models;

import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.a.am;
import com.mapbox.api.directions.v5.a.as;
import com.mapbox.api.directions.v5.a.at;
import com.mapbox.api.matching.v5.models.b;
import com.mapbox.api.matching.v5.models.f;
import java.io.Serializable;
import java.util.List;

@AutoValue
public abstract class j implements Serializable {

    @AutoValue.Builder
    public static abstract class a {
    }

    public abstract double confidence();

    public abstract double distance();

    public abstract double duration();

    @Nullable
    public abstract String geometry();

    public abstract List<as> legs();

    @Nullable
    public abstract at routeOptions();

    public abstract a toBuilder();

    @Nullable
    @SerializedName("voiceLocale")
    public abstract String voiceLanguage();

    public abstract double weight();

    @SerializedName("weight_name")
    public abstract String weightName();

    public static a builder() {
        return new b.a();
    }

    public am toDirectionRoute() {
        return am.builder().a(legs()).a(geometry()).b(weightName()).c(Double.valueOf(weight())).b(Double.valueOf(duration())).a(Double.valueOf(distance())).a(routeOptions()).c(voiceLanguage()).a();
    }

    public static TypeAdapter<j> typeAdapter(Gson gson) {
        return new f.a(gson);
    }
}
