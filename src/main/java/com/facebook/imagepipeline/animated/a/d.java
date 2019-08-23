package com.facebook.imagepipeline.animated.a;

public final class d {
    public boolean mAllowPrefetching = true;
    public boolean mEnableDebugging;
    public boolean mForceKeepAllFramesInMemory;
    public int mMaximumBytes = -1;

    public final c build() {
        return new c(this);
    }

    public final d setAllowPrefetching(boolean z) {
        this.mAllowPrefetching = z;
        return this;
    }

    public final d setForceKeepAllFramesInMemory(boolean z) {
        this.mForceKeepAllFramesInMemory = z;
        return this;
    }

    public final d setMaximumBytes(int i) {
        this.mMaximumBytes = i;
        return this;
    }
}
