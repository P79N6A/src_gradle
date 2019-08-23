package com.ss.avframework.livestreamv2;

import com.ss.avframework.engine.AudioSink;
import com.ss.avframework.livestreamv2.ILiveStream;
import java.nio.Buffer;

public class AudioFrameAvailableSink extends AudioSink {
    private ILiveStream.IAudioFrameAvailableListener mListener;

    public void onNoData() {
    }

    /* access modifiers changed from: package-private */
    public void setListener(ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener) {
        this.mListener = iAudioFrameAvailableListener;
    }

    public void onData(Buffer buffer, int i, int i2, int i3, long j) {
        if (this.mListener != null) {
            this.mListener.onAudioFrameAvailable(buffer, i, i2, i3, j);
        }
    }
}
