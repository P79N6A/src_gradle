package com.ss.android.vesdk.runtime;

import android.content.res.AssetManager;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bef.effectsdk.b;
import com.ss.android.vesdk.r;
import com.ss.android.vesdk.y;

@Keep
public class VEEffectConfig {
    private static final String TAG = VEEffectConfig.class.getSimpleName();
    private static AssetManager sEffectAssetManager = null;
    private static b sFinder = null;

    private static native void nativeConfigEffect(boolean z, AssetManager assetManager, String str, String str2);

    private static native void nativeSetEffectForceDetectFace(boolean z);

    private static native void nativeSetEffectLogLevel(int i);

    private static native void nativeSetShareDir(String str);

    static {
        com.ss.android.ttve.nativePort.b.a();
    }

    public static boolean enableAssetManager(@NonNull AssetManager assetManager) {
        sEffectAssetManager = assetManager;
        return true;
    }

    public static void setEffectForceDetectFace(boolean z) {
        nativeSetEffectForceDetectFace(z);
    }

    public static void setResourceFinder(b bVar) {
        sFinder = bVar;
    }

    public static boolean setEffectLogLevel(int i) {
        nativeSetEffectLogLevel(i);
        return true;
    }

    public static boolean setShareDir(@NonNull String str) {
        nativeSetShareDir(str);
        return true;
    }

    public static long getNativeFinder(long j) {
        if (j == 0) {
            y.d(TAG, "getNativeFinder effectHandler is null");
            return 0;
        } else if (sFinder != null) {
            return sFinder.createNativeResourceFinder(j);
        } else {
            throw new r(-1, "错误调用finder相关接口");
        }
    }

    public static void releaseNativeFinder(long j) {
        if (j == 0) {
            y.d(TAG, "getNativeFinder effectHandler is null");
        } else if (sFinder != null) {
            sFinder.release(j);
        } else {
            throw new r(-1, "错误调用finder相关接口");
        }
    }

    public static void configEffect(@Nullable String str, @NonNull String str2) {
        boolean z;
        if (sFinder != null) {
            z = true;
        } else {
            z = false;
        }
        nativeConfigEffect(z, sEffectAssetManager, str, str2);
    }
}
