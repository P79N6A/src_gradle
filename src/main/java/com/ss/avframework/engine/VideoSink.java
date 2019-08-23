package com.ss.avframework.engine;

import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.utils.CalledByNative;

public abstract class VideoSink extends NativeObject {
    /* access modifiers changed from: protected */
    @CalledByNative
    public abstract void OnDiscardedFrame();

    /* access modifiers changed from: protected */
    @CalledByNative
    public abstract void onFrame(VideoFrame videoFrame);
}
