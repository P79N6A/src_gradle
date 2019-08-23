package com.ss.avframework.engine;

import com.ss.avframework.buffer.WrapperNativeAudioBuffer;
import com.ss.avframework.statics.StaticsReport;
import com.ss.avframework.utils.CalledByNative;
import com.ss.avframework.utils.JNINamespace;
import java.nio.Buffer;

@JNINamespace("jni")
public abstract class AudioSource extends MediaSource {
    protected AudioDeviceModule mADM;
    private PowerObserver mObserver;

    public interface PowerObserver {
        void onCalculatePcmPowerEvent(int i);
    }

    public boolean getStaticsReport(StaticsReport staticsReport) {
        return false;
    }

    /* access modifiers changed from: protected */
    public native void nativeAdaptedOutputFormat(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    public native void nativeOnData(WrapperNativeAudioBuffer wrapperNativeAudioBuffer, int i, int i2, int i3, long j);

    public native void nativeOnData(Buffer buffer, int i, int i2, int i3, long j);

    /* access modifiers changed from: protected */
    public native void nativeSetAudioQuantizeGapPeriod(long j);

    /* access modifiers changed from: protected */
    public native void nativeSetVolume(double d2);

    @CalledByNative
    public AudioDeviceModule getAudioDeviceModule() {
        return this.mADM;
    }

    public synchronized void release() {
        this.mADM = null;
        super.release();
    }

    public void setAudioDeviceModule(AudioDeviceModule audioDeviceModule) {
        this.mADM = audioDeviceModule;
    }

    public void setCalculatePcmPowerEventObserver(PowerObserver powerObserver) {
        this.mObserver = powerObserver;
    }

    @CalledByNative
    private void onEvent(int i) {
        if (this.mObserver != null) {
            this.mObserver.onCalculatePcmPowerEvent(i);
        }
    }
}
