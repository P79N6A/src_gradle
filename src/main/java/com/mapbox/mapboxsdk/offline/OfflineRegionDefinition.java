package com.mapbox.mapboxsdk.offline;

import android.support.annotation.Keep;
import com.mapbox.mapboxsdk.geometry.LatLngBounds;

@Keep
public interface OfflineRegionDefinition {
    LatLngBounds getBounds();
}
