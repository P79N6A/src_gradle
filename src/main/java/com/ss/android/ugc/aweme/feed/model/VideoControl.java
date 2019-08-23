package com.ss.android.ugc.aweme.feed.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class VideoControl implements Serializable {
    @SerializedName("draft_progress_bar")
    public int draftProgressBar;
    @SerializedName("allow_duet")
    public boolean isAllowDuet;
    @SerializedName("allow_dynamic_wallpaper")
    public boolean isAllowDynamicWallpaper;
    @SerializedName("allow_react")
    public boolean isAllowReact;
    @SerializedName("prevent_download_type")
    public int preventDownloadType;
    @SerializedName("share_type")
    public int shareType;
    @SerializedName("show_progress_bar")
    public int showProgressBar;
    @SerializedName("timer_status")
    public int timerStatus = 1;
}
