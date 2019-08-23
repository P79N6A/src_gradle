package com.mapbox.mapboxsdk.storage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class Resource {

    @Retention(RetentionPolicy.SOURCE)
    public @interface Kind {
    }
}
