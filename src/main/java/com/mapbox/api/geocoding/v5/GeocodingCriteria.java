package com.mapbox.api.geocoding.v5;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class GeocodingCriteria {

    @Retention(RetentionPolicy.SOURCE)
    public @interface GeocodingModeCriteria {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface GeocodingReverseModeCriteria {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface GeocodingTypeCriteria {
    }
}
