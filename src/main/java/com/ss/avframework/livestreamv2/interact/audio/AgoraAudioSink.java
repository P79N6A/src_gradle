package com.ss.avframework.livestreamv2.interact.audio;

import android.util.AndroidRuntimeException;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.avframework.livestreamv2.interact.callback.EngineCallback;
import com.ss.avframework.livestreamv2.interact.model.Config;
import io.agora.rtc.IAudioFrameObserver;
import io.agora.rtc.RtcEngine;
import java.nio.ByteBuffer;

public class AgoraAudioSink implements IAudioFrameObserver {
    private boolean bPlay;
    private EngineCallback mConsumer;
    private long mCurrentTimestampMs;
    private RtcEngine mRtcEngine;
    private boolean started;

    public boolean onRecordFrame(byte[] bArr, int i, int i2, int i3, int i4) {
        return true;
    }

    public void start() {
        this.started = true;
    }

    public void release() {
        this.mRtcEngine.registerAudioFrameObserver(null);
    }

    public void stop() {
        this.started = false;
        this.mCurrentTimestampMs = 0;
    }

    public AgoraAudioSink(RtcEngine rtcEngine, boolean z, EngineCallback engineCallback) {
        this.mRtcEngine = rtcEngine;
        this.mConsumer = engineCallback;
        this.bPlay = z;
        rtcEngine.registerAudioFrameObserver(this);
    }

    public AgoraAudioSink(RtcEngine rtcEngine, boolean z, EngineCallback engineCallback, Config config) {
        this.mRtcEngine = rtcEngine;
        this.mConsumer = engineCallback;
        this.bPlay = z;
        rtcEngine.registerAudioFrameObserver(this);
        rtcEngine.setPlaybackAudioFrameParameters(config.getOutPlayerAudioSampleHz(), config.getOutPlayerAudioChannel(), 0, (config.getOutPlayerAudioChannel() * config.getOutPlayerAudioSampleHz()) / 100);
    }

    public boolean onPlaybackFrame(byte[] bArr, int i, int i2, int i3, int i4) {
        if (this.started && this.mConsumer != null) {
            int i5 = i * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
            if (i5 % i4 == 0) {
                long currentTimeMillis = System.currentTimeMillis();
                if (this.mCurrentTimestampMs == 0) {
                    this.mCurrentTimestampMs = currentTimeMillis;
                }
                this.mCurrentTimestampMs += (long) (i5 / i4);
                if (Math.abs(this.mCurrentTimestampMs - currentTimeMillis) > 1000) {
                    this.mCurrentTimestampMs = currentTimeMillis;
                }
                this.mConsumer.onPlaybackAudioFrame(ByteBuffer.wrap(bArr), i, i4, i3, this.mCurrentTimestampMs);
            } else {
                throw new AndroidRuntimeException("The num of samples can't be divided in microseconds.");
            }
        }
        return true;
    }
}
