package com.ss.avframework.livestreamv2;

import com.ss.avframework.mixer.VideoMixer;
import java.nio.ByteBuffer;

public interface IInputVideoStream {
    int fps();

    int getHeight();

    VideoMixer.VideoMixerDescription getMixerDescription();

    int getWidth();

    String name();

    int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j);

    int pushVideoFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j);

    void release();

    void setMixerDescription(VideoMixer.VideoMixerDescription videoMixerDescription);

    int start();

    int stop();
}
