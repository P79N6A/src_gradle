package com.ss.avframework.capture.video;

import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.engine.VideoSource;

public abstract class VideoCapturer extends VideoSource {

    public interface VideoCapturerObserver {
        void onVideoCapturerError(int i, Exception exc);

        void onVideoCapturerStarted();

        void onVideoCapturerStoped();
    }

    public boolean isScreenCast() {
        return false;
    }

    public abstract void start(int i, int i2, int i3);

    public abstract void stop();

    /* access modifiers changed from: protected */
    public int onFrame(VideoFrame.Buffer buffer, int i, int i2, int i3, long j) {
        return nativeOnFrame(buffer, i, i2, i3, j);
    }
}
