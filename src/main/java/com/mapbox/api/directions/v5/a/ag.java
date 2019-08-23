package com.mapbox.api.directions.v5.a;

import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.DirectionsAdapterFactory;
import com.mapbox.api.directions.v5.a.a;
import com.mapbox.api.directions.v5.a.q;
import java.util.List;

@AutoValue
public abstract class ag extends ak implements Comparable<ag> {

    @AutoValue.Builder
    public static abstract class a {
    }

    @Nullable
    @SerializedName("abbr")
    public abstract String abbreviation();

    @Nullable
    @SerializedName("abbr_priority")
    public abstract Integer abbreviationPriority();

    @Nullable
    public abstract Boolean active();

    @Nullable
    public abstract List<String> directions();

    @Nullable
    @SerializedName("imageBaseURL")
    public abstract String imageBaseUrl();

    public abstract String text();

    public abstract a toBuilder();

    public abstract String type();

    public static a builder() {
        return new a.C0298a();
    }

    public static TypeAdapter<ag> typeAdapter(Gson gson) {
        return new q.a(gson);
    }

    public static ag fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(DirectionsAdapterFactory.a());
        return (ag) gsonBuilder.create().fromJson(str, ag.class);
    }

    public int compareTo(ag agVar) {
        Integer abbreviationPriority = abbreviationPriority();
        Integer abbreviationPriority2 = agVar.abbreviationPriority();
        if (abbreviationPriority == null && abbreviationPriority2 == null) {
            return 0;
        }
        if (abbreviationPriority == null) {
            return 1;
        }
        if (abbreviationPriority2 == null) {
            return -1;
        }
        return abbreviationPriority.compareTo(abbreviationPriority2);
    }
}
