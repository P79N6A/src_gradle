package com.mapbox.api.geocoding.v5.models;

import com.google.gson.TypeAdapterFactory;

public abstract class GeocodingAdapterFactory implements TypeAdapterFactory {
    public static TypeAdapterFactory a() {
        return new AutoValueGson_GeocodingAdapterFactory();
    }
}
