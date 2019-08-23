package com.facebook.react.packagerconnection;

import android.os.Looper;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
import javax.annotation.Nullable;

public class SamplingProfilerPackagerMethod extends RequestOnlyHandler {
    private SamplingProfilerJniMethod mJniMethod;

    static final class SamplingProfilerJniMethod {
        @DoNotStrip
        private final HybridData mHybridData;

        @DoNotStrip
        private static native HybridData initHybrid(long j);

        @DoNotStrip
        public final native void poke(Responder responder);

        public SamplingProfilerJniMethod(long j) {
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            this.mHybridData = initHybrid(j);
        }
    }

    static {
        System.loadLibrary("packagerconnectionjnifb");
    }

    public SamplingProfilerPackagerMethod(long j) {
        this.mJniMethod = new SamplingProfilerJniMethod(j);
    }

    public void onRequest(@Nullable Object obj, Responder responder) {
        this.mJniMethod.poke(responder);
    }
}
