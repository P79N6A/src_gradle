package com.ss.avframework.livestreamv2.interact.audio;

public interface AudioClient {
    int getBitWidth();

    int getChannelCount();

    int getSampleRate();

    void prepare(AudioCallback audioCallback);

    void release();

    void start();

    void stop();
}
