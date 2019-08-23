package com.ss.avframework.recorder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.AndroidRuntimeException;
import com.ss.avframework.transport.MP4Transport;
import java.nio.ByteBuffer;

public class NativeMp4Recorder extends MP4Transport implements MediaRecorder {
    public int start() {
        nativeStartRecord();
        return 0;
    }

    public int stop() {
        nativeStopRecord();
        return 0;
    }

    public synchronized void release() {
        super.release();
    }

    public int addTrack(MediaFormat mediaFormat) {
        throw new AndroidRuntimeException("Should not be here.");
    }

    public NativeMp4Recorder(boolean z, boolean z2) {
        super(z, z2);
    }

    public int writeSampleData(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        throw new AndroidRuntimeException("Should not be here.");
    }
}
