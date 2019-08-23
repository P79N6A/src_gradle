package com.ss.android.ugc.aweme.video.preload.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class PreloadTask {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean alreadyPreload;
    @SerializedName("count")
    public int count = 1;
    @SerializedName("offset")
    public int offset;
    @SerializedName("download_progress")
    public int progress = 100;
    @SerializedName("size")
    private int size;

    public PreloadTask() {
    }

    public int getVideoPreloadSize() {
        if (this.size <= 0) {
            return 10485759;
        }
        return this.size * 1024;
    }

    public PreloadTask(int i, int i2) {
        this.count = i;
        this.size = i2;
    }
}
