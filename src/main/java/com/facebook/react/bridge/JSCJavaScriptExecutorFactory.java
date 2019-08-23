package com.facebook.react.bridge;

import com.facebook.react.bridge.RNJavaScriptRuntime;

public class JSCJavaScriptExecutorFactory implements JavaScriptExecutorFactory {
    private final String mAppName;
    private final String mDeviceName;
    private final RNJavaScriptRuntime.SplitCommonType mSplitCommon;

    public JavaScriptExecutor create() throws Exception {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("OwnerIdentity", "ReactNative");
        writableNativeMap.putString("AppIdentity", this.mAppName);
        writableNativeMap.putString("DeviceIdentity", this.mDeviceName);
        return new JSCJavaScriptExecutor(writableNativeMap, this.mSplitCommon);
    }

    public JavaScriptExecutor create(RNJavaScriptRuntime.SplitCommonType splitCommonType) throws Exception {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("OwnerIdentity", "ReactNative");
        writableNativeMap.putString("AppIdentity", this.mAppName);
        writableNativeMap.putString("DeviceIdentity", this.mDeviceName);
        return new JSCJavaScriptExecutor(writableNativeMap, splitCommonType);
    }

    public JSCJavaScriptExecutorFactory(String str, String str2, RNJavaScriptRuntime.SplitCommonType splitCommonType) {
        this.mAppName = str;
        this.mDeviceName = str2;
        this.mSplitCommon = splitCommonType;
    }
}
