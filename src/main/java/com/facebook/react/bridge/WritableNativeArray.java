package com.facebook.react.bridge;

import com.facebook.infer.annotation.a;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;

@DoNotStrip
public class WritableNativeArray extends ReadableNativeArray implements WritableArray {
    private static native HybridData initHybrid();

    private native void pushNativeArray(WritableNativeArray writableNativeArray);

    private native void pushNativeMap(WritableNativeMap writableNativeMap);

    public native void pushBoolean(boolean z);

    public native void pushDouble(double d2);

    public native void pushInt(int i);

    public native void pushNull();

    public native void pushString(String str);

    public WritableNativeArray() {
        super(initHybrid());
    }

    public void pushArray(WritableArray writableArray) {
        boolean z;
        if (writableArray == null || (writableArray instanceof WritableNativeArray)) {
            z = true;
        } else {
            z = false;
        }
        a.a(z, "Illegal type provided");
        pushNativeArray((WritableNativeArray) writableArray);
    }

    public void pushMap(WritableMap writableMap) {
        boolean z;
        if (writableMap == null || (writableMap instanceof WritableNativeMap)) {
            z = true;
        } else {
            z = false;
        }
        a.a(z, "Illegal type provided");
        pushNativeMap((WritableNativeMap) writableMap);
    }
}
