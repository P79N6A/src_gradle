package com.ss.ttm.utils;

import android.os.Build;

public final class Util {
    public static final String BARND = Build.BRAND;
    public static final String DEVICE = Build.DEVICE;
    public static final String DEVICE_DEBUG_INFO = (DEVICE + ", " + MODEL + ", " + MANUFACTURER + ", " + SDK_INT);
    public static final String HARDWARE = Build.HARDWARE;
    public static final String MANUFACTURER = Build.MANUFACTURER;
    public static final String MODEL = Build.MODEL;
    public static final int SDK_INT = Build.VERSION.SDK_INT;
}
