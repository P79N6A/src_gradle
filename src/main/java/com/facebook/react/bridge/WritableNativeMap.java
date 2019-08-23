package com.facebook.react.bridge;

import com.facebook.infer.annotation.a;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;

@DoNotStrip
public class WritableNativeMap extends ReadableNativeMap implements WritableMap {
    private static native HybridData initHybrid();

    private native void mergeNativeMap(ReadableNativeMap readableNativeMap);

    private native void putNativeArray(String str, WritableNativeArray writableNativeArray);

    private native void putNativeMap(String str, WritableNativeMap writableNativeMap);

    public native void putBoolean(String str, boolean z);

    public native void putDouble(String str, double d2);

    public native void putInt(String str, int i);

    public native void putNull(String str);

    public native void putString(String str, String str2);

    public WritableNativeMap() {
        super(initHybrid());
    }

    public void merge(ReadableMap readableMap) {
        a.a(readableMap instanceof ReadableNativeMap, "Illegal type provided");
        mergeNativeMap((ReadableNativeMap) readableMap);
    }

    public void putArray(String str, WritableArray writableArray) {
        boolean z;
        if (writableArray == null || (writableArray instanceof WritableNativeArray)) {
            z = true;
        } else {
            z = false;
        }
        a.a(z, "Illegal type provided");
        putNativeArray(str, (WritableNativeArray) writableArray);
    }

    public void putMap(String str, WritableMap writableMap) {
        boolean z;
        if (writableMap == null || (writableMap instanceof WritableNativeMap)) {
            z = true;
        } else {
            z = false;
        }
        a.a(z, "Illegal type provided");
        putNativeMap(str, (WritableNativeMap) writableMap);
    }
}
