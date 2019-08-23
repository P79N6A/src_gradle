package com.amap.api.a;

import android.graphics.Point;
import com.amap.api.maps2d.model.CameraPosition;
import com.amap.api.maps2d.model.LatLngBounds;

public abstract class m {
    public float amount;
    public LatLngBounds bounds;
    public CameraPosition cameraPosition;
    public Point focus;
    public int height;
    public boolean isChangeFinished;
    public a nowType = a.none;
    public int padding;
    public int width;
    public float xPixel;
    public float yPixel;
    public float zoom;

    public enum a {
        none,
        zoomIn,
        changeCenter,
        changeGeoCenterZoom,
        zoomOut,
        zoomTo,
        zoomBy,
        scrollBy,
        newCameraPosition,
        newLatLngBounds,
        newLatLngBoundsWithSize,
        changeGeoCenterZoomTiltBearing
    }
}
