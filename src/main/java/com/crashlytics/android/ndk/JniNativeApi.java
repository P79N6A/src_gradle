package com.crashlytics.android.ndk;

import android.content.res.AssetManager;

public class JniNativeApi implements NativeApi {
    private native boolean nativeInit(String str, Object obj);

    JniNativeApi() {
    }

    static {
        System.loadLibrary("crashlytics");
    }

    public boolean initialize(String str, AssetManager assetManager) {
        return nativeInit(str, assetManager);
    }
}
