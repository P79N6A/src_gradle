package com.ss.avframework.mixer;

import com.ss.avframework.utils.JNINamespace;
import com.ss.avframework.utils.TEBundle;

@JNINamespace("jni")
public abstract class NativeMixer extends Mixer {
    private native float nativeAvgCostTimePerFrameMs(long j);

    private native boolean nativeGetParameter(TEBundle tEBundle);

    private native boolean nativeSetParameter(TEBundle tEBundle);

    public boolean isNativeMixer() {
        return true;
    }

    public float getAvgCostTimePerFrameMs() {
        return nativeAvgCostTimePerFrameMs(this.mNativeObj);
    }

    public boolean getParameter(TEBundle tEBundle) {
        if (tEBundle != null) {
            return nativeGetParameter(tEBundle);
        }
        return false;
    }

    public boolean setParameter(TEBundle tEBundle) {
        if (tEBundle != null) {
            return nativeSetParameter(tEBundle);
        }
        return false;
    }
}
