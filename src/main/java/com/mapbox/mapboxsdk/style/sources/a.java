package com.mapbox.mapboxsdk.style.sources;

import java.util.HashMap;

public final class a extends HashMap<String, Object> {
    public final a withBuffer(int i) {
        put("buffer", Integer.valueOf(i));
        return this;
    }

    public final a withCluster(boolean z) {
        put("cluster", Boolean.valueOf(z));
        return this;
    }

    public final a withClusterMaxZoom(int i) {
        put("clusterMaxZoom", Integer.valueOf(i));
        return this;
    }

    public final a withClusterRadius(int i) {
        put("clusterRadius", Integer.valueOf(i));
        return this;
    }

    public final a withLineMetrics(boolean z) {
        put("lineMetrics", Boolean.valueOf(z));
        return this;
    }

    public final a withMaxZoom(int i) {
        put("maxzoom", Integer.valueOf(i));
        return this;
    }

    public final a withMinZoom(int i) {
        put("minzoom", Integer.valueOf(i));
        return this;
    }

    public final a withTolerance(float f2) {
        put("tolerance", Float.valueOf(f2));
        return this;
    }
}
