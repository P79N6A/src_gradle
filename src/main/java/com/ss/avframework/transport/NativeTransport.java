package com.ss.avframework.transport;

import android.util.AndroidRuntimeException;
import com.ss.avframework.engine.Transport;
import com.ss.avframework.utils.CalledByNative;
import java.nio.Buffer;

public class NativeTransport extends Transport {
    public synchronized void release() {
        super.release();
    }

    @CalledByNative
    private static boolean isNativeTransportInstence(Object obj) {
        return obj instanceof NativeTransport;
    }

    public void registerFeedbackObserber(Transport.FeedbackObserver feedbackObserver) {
        throw new AndroidRuntimeException("Should not be here");
    }

    public void unRegisterFeedbackObserber(Transport.FeedbackObserver feedbackObserver) {
        throw new AndroidRuntimeException("Should not be here");
    }

    public void sendPacket(Buffer buffer, int i) {
        throw new AndroidRuntimeException("Should not be here");
    }
}
