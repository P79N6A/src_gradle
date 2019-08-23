package com.ss.android.ugc.aweme.im.sdk.chat.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001e\u0010\u0018\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/model/StoryContent;", "Ljava/io/Serializable;", "()V", "storyCover", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "getStoryCover", "()Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "setStoryCover", "(Lcom/ss/android/ugc/aweme/base/model/UrlModel;)V", "storyId", "", "getStoryId", "()Ljava/lang/String;", "setStoryId", "(Ljava/lang/String;)V", "syncAweme", "", "getSyncAweme", "()I", "setSyncAweme", "(I)V", "videoHeight", "getVideoHeight", "setVideoHeight", "videoWidth", "getVideoWidth", "setVideoWidth", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StoryContent implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("cover")
    @Nullable
    private UrlModel storyCover;
    @SerializedName("item_id")
    @Nullable
    private String storyId;
    @SerializedName("sync_aweme")
    private int syncAweme;
    @SerializedName("video_height")
    private int videoHeight;
    @SerializedName("video_width")
    private int videoWidth;

    @Nullable
    public final UrlModel getStoryCover() {
        return this.storyCover;
    }

    @Nullable
    public final String getStoryId() {
        return this.storyId;
    }

    public final int getSyncAweme() {
        return this.syncAweme;
    }

    public final int getVideoHeight() {
        return this.videoHeight;
    }

    public final int getVideoWidth() {
        return this.videoWidth;
    }

    public final void setStoryCover(@Nullable UrlModel urlModel) {
        this.storyCover = urlModel;
    }

    public final void setStoryId(@Nullable String str) {
        this.storyId = str;
    }

    public final void setSyncAweme(int i) {
        this.syncAweme = i;
    }

    public final void setVideoHeight(int i) {
        this.videoHeight = i;
    }

    public final void setVideoWidth(int i) {
        this.videoWidth = i;
    }
}
