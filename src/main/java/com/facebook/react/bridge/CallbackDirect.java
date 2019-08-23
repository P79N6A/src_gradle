package com.facebook.react.bridge;

import com.lynx.base.CalledByNative;
import com.lynx.base.JNINamespace;

@JNINamespace("CallbackDirect")
public class CallbackDirect implements Callback {
    private final long mCallbackPoint;
    private boolean mHasCalled;
    private final JSInstance mJSInstance;

    public void invoke(Object... objArr) {
        synchronized (this) {
            if (!this.mHasCalled) {
                this.mJSInstance.invokeCallbackDirect(this.mCallbackPoint, Arguments.fromJavaArgs(objArr));
                this.mHasCalled = true;
            }
        }
    }

    public CallbackDirect(JSInstance jSInstance, long j) {
        this.mJSInstance = jSInstance;
        this.mCallbackPoint = j;
    }

    @CalledByNative
    public static CallbackDirect createCallbackDirect(JSInstance jSInstance, long j) {
        return new CallbackDirect(jSInstance, j);
    }
}
