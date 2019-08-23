package com.mapbox.mapboxsdk.b;

public final class c extends RuntimeException {
    public c() {
        super("Adding an invalid Marker to a Map. Missing the required position field. Provide a non null LatLng as position to the Marker.");
    }
}
