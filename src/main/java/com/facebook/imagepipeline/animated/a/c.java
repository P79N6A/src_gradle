package com.facebook.imagepipeline.animated.a;

import javax.annotation.concurrent.Immutable;

@Immutable
public final class c {
    public static c DEFAULTS = newBuilder().build();
    public final boolean allowPrefetching;
    public final boolean enableDebugging;
    public final boolean forceKeepAllFramesInMemory;
    public final int maximumBytes;

    public static d newBuilder() {
        return new d();
    }

    public c(d dVar) {
        this.forceKeepAllFramesInMemory = dVar.mForceKeepAllFramesInMemory;
        this.allowPrefetching = dVar.mAllowPrefetching;
        this.maximumBytes = dVar.mMaximumBytes;
        this.enableDebugging = dVar.mEnableDebugging;
    }
}
