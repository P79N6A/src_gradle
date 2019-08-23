package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.RNJavaScriptRuntime;

@DoNotStrip
public abstract class JavaScriptExecutor {
    private RNJavaScriptRuntime.SplitCommonType mCommmonSplit = RNJavaScriptRuntime.SplitCommonType.NONE;
    private final HybridData mHybridData;

    public RNJavaScriptRuntime.SplitCommonType getCommonSplit() {
        return this.mCommmonSplit;
    }

    public void close() {
        this.mHybridData.resetNative();
    }

    protected JavaScriptExecutor(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    protected JavaScriptExecutor(HybridData hybridData, RNJavaScriptRuntime.SplitCommonType splitCommonType) {
        this.mHybridData = hybridData;
        this.mCommmonSplit = splitCommonType;
    }
}
