package com.ss.avframework.recorder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

public interface MediaRecorder {
    int addTrack(MediaFormat mediaFormat);

    void release();

    int start();

    int stop();

    int writeSampleData(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);
}
