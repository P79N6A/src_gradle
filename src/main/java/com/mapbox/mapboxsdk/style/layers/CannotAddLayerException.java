package com.mapbox.mapboxsdk.style.layers;

import android.support.annotation.Keep;

@Keep
public class CannotAddLayerException extends RuntimeException {
    public CannotAddLayerException(String str) {
        super(str);
    }
}
