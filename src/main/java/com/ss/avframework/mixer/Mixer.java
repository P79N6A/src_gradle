package com.ss.avframework.mixer;

import com.ss.avframework.engine.NativeObject;
import com.ss.avframework.utils.CalledByNative;
import com.ss.avframework.utils.JNINamespace;
import com.ss.avframework.utils.TEBundle;

@JNINamespace("jni")
public abstract class Mixer extends NativeObject {
    private native boolean nativeEnable();

    private native int nativeGetOriginTrackIndex();

    private native void nativeSetEnable(boolean z);

    private native void nativeSetOriginTrackIndex(int i);

    public abstract boolean getParameter(TEBundle tEBundle);

    @CalledByNative
    public abstract boolean isAudioMixer();

    @CalledByNative
    public boolean isNativeMixer() {
        return false;
    }

    public abstract boolean setParameter(TEBundle tEBundle);

    public boolean enable() {
        return nativeEnable();
    }

    public int getOriginTrackIndex() {
        return nativeGetOriginTrackIndex();
    }

    public void setEnable(boolean z) {
        nativeSetEnable(z);
    }

    public void setOriginTrackIndex(int i) {
        nativeSetOriginTrackIndex(i);
    }
}
