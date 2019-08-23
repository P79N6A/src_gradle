package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.RNJavaScriptRuntime;

@DoNotStrip
public class JSCJavaScriptExecutor extends JavaScriptExecutor {
    private static native HybridData initHybrid(ReadableNativeMap readableNativeMap);

    JSCJavaScriptExecutor(ReadableNativeMap readableNativeMap) {
        super(initHybrid(readableNativeMap));
    }

    JSCJavaScriptExecutor(ReadableNativeMap readableNativeMap, RNJavaScriptRuntime.SplitCommonType splitCommonType) {
        super(initHybrid(readableNativeMap), splitCommonType);
    }
}
