package com.crashlytics.android.ndk;

import android.content.res.AssetManager;

public interface NativeApi {
    boolean initialize(String str, AssetManager assetManager);
}
