package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001e\u0010\u0018\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR \u0010\u001b\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/model/XiGuaVideo;", "Ljava/io/Serializable;", "()V", "cover", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "getCover", "()Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "setCover", "(Lcom/ss/android/ugc/aweme/base/model/UrlModel;)V", "createTime", "", "getCreateTime", "()J", "setCreateTime", "(J)V", "desc", "", "getDesc", "()Ljava/lang/String;", "setDesc", "(Ljava/lang/String;)V", "duration", "getDuration", "setDuration", "playCount", "getPlayCount", "setPlayCount", "videoId", "getVideoId", "setVideoId", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class XiGuaVideo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("cover")
    @Nullable
    private UrlModel cover;
    @SerializedName("create_time")
    private long createTime;
    @SerializedName("desc")
    @Nullable
    private String desc;
    @SerializedName("duration")
    private long duration;
    @SerializedName("play_count")
    private long playCount;
    @SerializedName("group_id")
    @Nullable
    private String videoId;

    @Nullable
    public final UrlModel getCover() {
        return this.cover;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final long getPlayCount() {
        return this.playCount;
    }

    @Nullable
    public final String getVideoId() {
        return this.videoId;
    }

    public final void setCover(@Nullable UrlModel urlModel) {
        this.cover = urlModel;
    }

    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setPlayCount(long j) {
        this.playCount = j;
    }

    public final void setVideoId(@Nullable String str) {
        this.videoId = str;
    }
}
