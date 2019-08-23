package com.bumptech.glide.util;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.SystemClock;

public final class LogTime {
    private static final double MILLIS_MULTIPLIER;

    private LogTime() {
    }

    @TargetApi(17)
    public static long getLogTime() {
        if (Build.VERSION.SDK_INT >= 17) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return SystemClock.uptimeMillis();
    }

    static {
        double d2 = 1.0d;
        if (Build.VERSION.SDK_INT >= 17) {
            d2 = 1.0d / Math.pow(10.0d, 6.0d);
        }
        MILLIS_MULTIPLIER = d2;
    }

    public static double getElapsedMillis(long j) {
        double logTime = (double) (getLogTime() - j);
        double d2 = MILLIS_MULTIPLIER;
        Double.isNaN(logTime);
        return logTime * d2;
    }
}
