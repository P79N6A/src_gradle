package com.mapbox.api.directions.v5;

import com.google.gson.TypeAdapterFactory;

public abstract class DirectionsAdapterFactory implements TypeAdapterFactory {
    public static TypeAdapterFactory a() {
        return new AutoValueGson_DirectionsAdapterFactory();
    }
}
