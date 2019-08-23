package com.ss.avframework.livestreamv2.interact.audio;

import java.nio.Buffer;

public interface AudioCallback {
    boolean updateAudioFrame(Buffer buffer, int i, long j);
}
