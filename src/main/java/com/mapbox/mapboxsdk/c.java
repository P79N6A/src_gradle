package com.mapbox.mapboxsdk;

public final class c extends RuntimeException {
    c(String str) {
        super(String.format("Map detected an error that would fail silently otherwise: %s", new Object[]{str}));
    }
}
