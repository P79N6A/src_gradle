package com.ss.avframework.utils;

import com.ss.avframework.engine.MediaEngineFactory;

@JNINamespace("jni")
public class Monitor {
    protected static native double nativeGetAppPrecentageOnCPU();

    protected static native long nativeGetAppRSSKB();

    protected static native long nativeGetAppVSSKB();

    protected static native double nativeGetCPUPrecentage();

    protected static native double nativeGetSystemPrecentageOnCPU();

    protected static native double nativeGetUserPrecentageOnCPU();

    public Monitor() {
        MediaEngineFactory.getVersion();
    }

    public long getAppRSSKB() {
        return nativeGetAppRSSKB();
    }

    public long getAppVSSKB() {
        return nativeGetAppVSSKB();
    }

    public double getAppPrecentageOnCPU() {
        return nativeGetAppPrecentageOnCPU() * 100.0d;
    }

    public double getCPUPrecentage() {
        return nativeGetCPUPrecentage() * 100.0d;
    }

    public double getSystemPrecentageOnCPU() {
        return nativeGetSystemPrecentageOnCPU() * 100.0d;
    }

    public double getUserPrecentageOnCPU() {
        return nativeGetUserPrecentageOnCPU() * 100.0d;
    }
}
