package com.ss.avframework.transport;

import com.ss.avframework.engine.Transport;
import com.ss.avframework.utils.JNINamespace;
import java.nio.Buffer;

@JNINamespace("jni")
public class MP4Transport extends NativeTransport {
    private native void nativeCreateNative(boolean z, boolean z2);

    /* access modifiers changed from: protected */
    public native void nativeStartRecord();

    /* access modifiers changed from: protected */
    public native void nativeStopRecord();

    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    public /* bridge */ /* synthetic */ void registerFeedbackObserber(Transport.FeedbackObserver feedbackObserver) {
        super.registerFeedbackObserber(feedbackObserver);
    }

    public /* bridge */ /* synthetic */ void unRegisterFeedbackObserber(Transport.FeedbackObserver feedbackObserver) {
        super.unRegisterFeedbackObserber(feedbackObserver);
    }

    public /* bridge */ /* synthetic */ void sendPacket(Buffer buffer, int i) {
        super.sendPacket(buffer, i);
    }

    public MP4Transport(boolean z, boolean z2) {
        nativeCreateNative(z, z2);
    }
}
