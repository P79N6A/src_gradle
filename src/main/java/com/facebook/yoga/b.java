package com.facebook.yoga;

public final class b {
    public static long a(int i, int i2) {
        return a((float) i, (float) i2);
    }

    public static long a(float f2, float f3) {
        int floatToRawIntBits = Float.floatToRawIntBits(f2);
        return ((long) Float.floatToRawIntBits(f3)) | (((long) floatToRawIntBits) << 32);
    }
}
