package com.mapbox.mapboxsdk.maps;

import android.support.annotation.Keep;

@Keep
public class Image {
    private final byte[] buffer;
    private final int height;
    private final String name;
    private final float pixelRatio;
    private final boolean sdf;
    private final int width;

    public Image(byte[] bArr, float f2, String str, int i, int i2, boolean z) {
        this.buffer = bArr;
        this.pixelRatio = f2;
        this.name = str;
        this.width = i;
        this.height = i2;
        this.sdf = z;
    }
}
