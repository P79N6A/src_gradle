package com.ss.avframework.livestreamv2;

import com.ss.avframework.mixer.AudioMixer;
import java.nio.ByteBuffer;

public interface IInputAudioStream {
    int getChannel();

    AudioMixer.AudioMixerDescription getMixerDescription();

    int getSample();

    String name();

    int pushAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j);

    void release();

    void setMixerDescription(AudioMixer.AudioMixerDescription audioMixerDescription);

    int start();

    int stop();
}
