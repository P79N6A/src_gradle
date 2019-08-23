package com.mapbox.mapboxsdk.b;

public final class e extends RuntimeException {
    public e() {
        super("Cannot create an Icon because there are already too many. Try reusing Icon objects whenever possible.");
    }
}
