package com.mapbox.mapboxsdk.b;

public final class b extends RuntimeException {
    public b(int i) {
        super("Cannot create a LatLngBounds from " + i + " items");
    }
}
