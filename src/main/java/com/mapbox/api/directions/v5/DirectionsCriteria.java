package com.mapbox.api.directions.v5;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class DirectionsCriteria {

    @Retention(RetentionPolicy.SOURCE)
    public @interface AnnotationCriteria {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ApproachesCriteria {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface DestinationCriteria {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ExcludeCriteria {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface GeometriesCriteria {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface OverviewCriteria {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ProfileCriteria {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SourceCriteria {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface VoiceUnitCriteria {
    }
}
