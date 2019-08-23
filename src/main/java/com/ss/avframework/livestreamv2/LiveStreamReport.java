package com.ss.avframework.livestreamv2;

import com.ss.avframework.statics.StaticsReport;

public class LiveStreamReport extends StaticsReport {
    public double getAudioMixerCostTimePerFrameMs() {
        return getDouble("audio_mixer_cost_time_per_frame_ms");
    }

    public long getTransportAdjustBitrate() {
        return getLong("trans_adjust_bps");
    }

    public double getVideoMixerCostTimePerFrameMs() {
        return getDouble("video_mixer_cost_time_per_frame_ms");
    }

    public void setAudioMixerCostTimePerFrameMs(double d2) {
        setDouble("audio_mixer_cost_time_per_frame_ms", d2);
    }

    public void setTransportAdjustBps(long j) {
        setLong("trans_adjust_bps", j);
    }

    public void setVideoMixerCostTimePerFrameMs(double d2) {
        setDouble("video_mixer_cost_time_per_frame_ms", d2);
    }
}
