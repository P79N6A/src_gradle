package com.ss.avframework.engine;

import com.ss.avframework.statics.StaticsReport;
import com.ss.avframework.utils.CalledByNative;
import com.ss.avframework.utils.JNINamespace;
import com.ss.avframework.utils.TEBundle;
import java.nio.Buffer;
import java.nio.ByteBuffer;

@JNINamespace("jni")
public abstract class Transport extends NativeObject implements StaticsReport.StaticReportInterface {
    private EventObserver mObserver;

    public interface EventObserver {
        void onTransportEvent(int i, int i2, long j, String str);
    }

    public abstract class FeedbackObserver {
        /* access modifiers changed from: protected */
        public abstract void onFeedback(String str);

        public FeedbackObserver() {
        }
    }

    public static class MediaPacket {
        public ByteBuffer buffer;
        public int flags;
        public boolean isVideo;
        public int offset;
        public long presentationTimeUs;
        public int size;

        @CalledByNative("MediaPacket")
        public void set(ByteBuffer byteBuffer, boolean z, int i, int i2, long j, int i3) {
            this.buffer = byteBuffer;
            this.offset = i;
            this.size = i2;
            this.presentationTimeUs = j;
            this.flags = i3;
            this.isVideo = z;
        }
    }

    private native TEBundle nativeGetParameter();

    private native void nativeSetParameter(TEBundle tEBundle);

    public long getInt64Value(int i) {
        return 0;
    }

    public String getLocalIP() {
        return null;
    }

    public String getRemoteIP() {
        return null;
    }

    public boolean getStaticsReport(StaticsReport staticsReport) {
        return false;
    }

    @CalledByNative
    public abstract void registerFeedbackObserber(FeedbackObserver feedbackObserver);

    @CalledByNative
    public void sendPacket(MediaPacket mediaPacket) {
    }

    public void sendPacket(Buffer buffer, int i) {
    }

    public void sendSeiMsg(String str) {
    }

    public boolean setupUrl(String str) {
        return false;
    }

    @CalledByNative
    public abstract void unRegisterFeedbackObserber(FeedbackObserver feedbackObserver);

    public TEBundle getParameter() {
        return nativeGetParameter();
    }

    public void setEventObserver(EventObserver eventObserver) {
        this.mObserver = eventObserver;
    }

    public void setParameter(TEBundle tEBundle) {
        nativeSetParameter(tEBundle);
    }

    @CalledByNative
    private void onEvent(int i, int i2, long j, String str) {
        if (this.mObserver != null) {
            this.mObserver.onTransportEvent(i, i2, j, str);
        }
    }
}
