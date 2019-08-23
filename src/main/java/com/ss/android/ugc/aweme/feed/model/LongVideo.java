package com.ss.android.ugc.aweme.feed.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public class LongVideo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("long_video_type")
    public int longVideoType;
    @SerializedName("trailer_start_time")
    public int trailerStartTime;
    @SerializedName("video")
    public Video video;
    @SerializedName("video_control")
    public VideoControl videoControl;

    public int getLongVideoType() {
        return this.longVideoType;
    }

    public int getTrailerStartTime() {
        return this.trailerStartTime;
    }

    public Video getVideo() {
        return this.video;
    }

    public VideoControl getVideoControl() {
        return this.videoControl;
    }

    public void setLongVideoType(int i) {
        this.longVideoType = i;
    }

    public void setTrailerStartTime(int i) {
        this.trailerStartTime = i;
    }

    public void setVideo(Video video2) {
        this.video = video2;
    }

    public void setVideoControl(VideoControl videoControl2) {
        this.videoControl = videoControl2;
    }
}
