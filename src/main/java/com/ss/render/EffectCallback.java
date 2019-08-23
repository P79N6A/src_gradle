package com.ss.render;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.bef.effectsdk.b;

@Keep
public final class EffectCallback {
    private static final String TAG = "EffectCallback";
    private static b sFinder;

    public static void setResourceFinder(@NonNull b bVar) {
        sFinder = bVar;
    }

    public static long getNativeFinder(long j) {
        if (j == 0 || sFinder == null) {
            return 0;
        }
        return sFinder.createNativeResourceFinder(j);
    }

    public static void releaseNativeFinder(long j) {
        if (j != 0 && sFinder != null) {
            sFinder.release(j);
        }
    }
}
