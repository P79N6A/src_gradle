package com.ss.avframework.transport;

import com.ss.avframework.engine.Transport;
import com.ss.avframework.statics.StaticsReport;
import com.ss.avframework.utils.JNINamespace;
import java.nio.Buffer;

@JNINamespace("jni")
public class LibRTMPTransport extends NativeTransport {
    private native void nativeCreateNative(boolean z, boolean z2);

    private native long nativeGetInt64Value(int i);

    private native String nativeGetLocalIP();

    private native String nativeGetRemoteIP();

    private native boolean nativeGetStaticsReport(StaticsReport staticsReport);

    private native void nativeReleaseNative();

    private native void nativeSendSeiMsg(String str);

    private native boolean nativeSetupUrl(String str);

    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    public String getLocalIP() {
        return nativeGetLocalIP();
    }

    public String getRemoteIP() {
        return nativeGetRemoteIP();
    }

    public /* bridge */ /* synthetic */ void registerFeedbackObserber(Transport.FeedbackObserver feedbackObserver) {
        super.registerFeedbackObserber(feedbackObserver);
    }

    public void sendSeiMsg(String str) {
        nativeSendSeiMsg(str);
    }

    public /* bridge */ /* synthetic */ void unRegisterFeedbackObserber(Transport.FeedbackObserver feedbackObserver) {
        super.unRegisterFeedbackObserber(feedbackObserver);
    }

    public long getInt64Value(int i) {
        return nativeGetInt64Value(i);
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

    public LibRTMPTransport(boolean z, boolean z2) {
        nativeCreateNative(z, z2);
    }
}
