package com.mapbox.mapboxsdk.plugins.china.shift;

public class ShiftForChina {
    private native String nativeShift(double d2, double d3);

    static {
        System.loadLibrary("shift-for-china");
    }
}
