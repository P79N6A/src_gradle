package com.ss.avframework.transport;

import com.ss.avframework.engine.Transport;
import com.ss.avframework.statics.StaticsReport;
import com.ss.avframework.utils.JNINamespace;
import java.nio.Buffer;

@JNINamespace("jni")
public class RTMPTransport extends NativeTransport {
    private native void nativeCreateNative(boolean z, boolean z2);

    private native boolean nativeGetStaticsReport(StaticsReport staticsReport);

    private native void nativeReleaseNative();

    private native boolean nativeSetupUrl(String str);

    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    public /* bridge */ /* synthetic */ void registerFeedbackObserber(Transport.FeedbackObserver feedbackObserver) {
        super.registerFeedbackObserber(feedbackObserver);
    }

    public /* bridge */ /* synthetic */ void unRegisterFeedbackObserber(Transport.FeedbackObserver feedbackObserver) {
        super.unRegisterFeedbackObserber(feedbackObserver);
    }

    public boolean getStaticsReport(StaticsReport staticsReport) {
        super.getStaticsReport(staticsReport);
        return nativeGetStaticsReport(staticsReport);
    }

    public boolean setupUrl(String str) {
        if (str != null) {
            return nativeSetupUrl(str);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void sendPacket(Buffer buffer, int i) {
        super.sendPacket(buffer, i);
    }

    public RTMPTransport(boolean z, boolean z2) {
        nativeCreateNative(z, z2);
    }
}
