package com.bef.effectsdk;

import android.content.res.AssetManager;

public final class AssetResourceFinder implements b {

    /* renamed from: a  reason: collision with root package name */
    private final AssetManager f7435a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7436b;

    private static native long nativeCreateAssetResourceFinder(long j, AssetManager assetManager, String str);

    private static native void nativeReleaseAssetResourceFinder(long j);

    public final synchronized long createNativeResourceFinder(long j) {
        return nativeCreateAssetResourceFinder(j, this.f7435a, this.f7436b);
    }

    public final synchronized void release(long j) {
        nativeReleaseAssetResourceFinder(j);
    }

    public AssetResourceFinder(AssetManager assetManager, String str) {
        this.f7435a = assetManager;
        this.f7436b = str;
    }
}
