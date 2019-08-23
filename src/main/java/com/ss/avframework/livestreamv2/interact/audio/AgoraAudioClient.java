package com.ss.avframework.livestreamv2.interact.audio;

import com.ss.avframework.livestreamv2.interact.LogUtil;
import io.agora.rtc.RtcEngine;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public class AgoraAudioClient {
    public boolean inited;
    public byte[] mByteArray;
    private AudioClientFactory mFactory;
    public AudioClient mParent = this.mFactory.create();
    public boolean started;

    public void start() {
        if (this.inited && !this.started && this.mParent != null) {
            this.mParent.start();
            this.started = true;
        }
    }

    public void stop() {
        if (this.inited && this.started && this.mParent != null) {
            this.mParent.stop();
            this.started = false;
        }
    }

    public void release() {
        if (this.inited && this.mParent != null) {
            if (this.started) {
                this.mParent.stop();
            }
            this.mFactory.destroy(this.mParent);
            this.mParent = null;
        }
        this.inited = false;
        this.started = false;
    }

    public AgoraAudioClient(AudioClientFactory audioClientFactory, final RtcEngine rtcEngine) {
        this.mFactory = audioClientFactory;
        if (this.mParent.getSampleRate() <= 0 || this.mParent.getChannelCount() <= 0 || this.mParent.getBitWidth() != 16) {
            this.mFactory.destroy(this.mParent);
            this.mParent = null;
            return;
        }
        rtcEngine.setExternalAudioSource(true, this.mParent.getSampleRate(), this.mParent.getChannelCount());
        this.mParent.prepare(new AudioCallback() {
            public boolean updateAudioFrame(Buffer buffer, int i, long j) {
                if (!AgoraAudioClient.this.inited || !AgoraAudioClient.this.started || !(buffer instanceof ByteBuffer)) {
                    return false;
                }
                ByteBuffer byteBuffer = (ByteBuffer) buffer;
                int channelCount = i * AgoraAudioClient.this.mParent.getChannelCount() * 2;
                try {
                    if (AgoraAudioClient.this.mByteArray == null || AgoraAudioClient.this.mByteArray.length != channelCount) {
                        AgoraAudioClient.this.mByteArray = new byte[channelCount];
                    }
                    byteBuffer.get(AgoraAudioClient.this.mByteArray, 0, channelCount);
                    if (rtcEngine.pushExternalAudioFrame(AgoraAudioClient.this.mByteArray, j) != 0) {
                        LogUtil.e("push external audio frame failed");
                        return false;
                    }
                } catch (Exception unused) {
                }
                return true;
            }
        });
        this.inited = true;
    }
}
