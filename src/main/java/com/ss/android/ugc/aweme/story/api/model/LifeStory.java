package com.ss.android.ugc.aweme.story.api.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.ImageInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.story.api.model.a.a;
import com.ss.android.ugc.aweme.story.api.model.a.b;
import java.io.Serializable;
import java.util.List;

@Keep
public class LifeStory implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("author")
    User author;
    @SerializedName("author_user_id")
    long authorUserId;
    @SerializedName("aweme_type")
    int awemeType;
    @SerializedName("cmt_swt")
    boolean cmtSwt;
    @SerializedName("create_time")
    long createTime;
    @SerializedName("duration")
    int duration;
    @SerializedName("group_id")
    String groupId;
    @SerializedName("image_info")
    ImageInfo imageInfo;
    @SerializedName("interaction_stickers")
    List<InteractStickerStruct> interactStickerStructs;
    @SerializedName("label_large")
    UrlModel labelLarge;
    @SerializedName("label_thumb")
    UrlModel labelThumb;
    @SerializedName("life_activity_info")
    a lifeActivityInfo;
    @SerializedName("share_url")
    String shareUrl;
    @SerializedName("stickers")
    String stickers;
    @SerializedName("story_id")
    String storyId;
    @SerializedName("third_platform_info")
    b thirdPlatformInfo;
    @SerializedName("video")
    Video video;

    public User getAuthor() {
        return this.author;
    }

    public long getAuthorUserId() {
        return this.authorUserId;
    }

    public int getAwemeType() {
        return this.awemeType;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public int getDuration() {
        return this.duration;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public ImageInfo getImageInfo() {
        return this.imageInfo;
    }

    public List<InteractStickerStruct> getInteractStickerStructs() {
        return this.interactStickerStructs;
    }

    public UrlModel getLabelLarge() {
        return this.labelLarge;
    }

    public UrlModel getLabelThumb() {
        return this.labelThumb;
    }

    public a getLifeActivityInfo() {
        return this.lifeActivityInfo;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public String getStickers() {
        return this.stickers;
    }

    public String getStoryId() {
        return this.storyId;
    }

    public b getThirdPlatformInfo() {
        return this.thirdPlatformInfo;
    }

    public Video getVideo() {
        return this.video;
    }

    public boolean isCmtSwt() {
        return this.cmtSwt;
    }

    public void setAuthor(User user) {
        this.author = user;
    }

    public void setAuthorUserId(long j) {
        this.authorUserId = j;
    }

    public void setAwemeType(int i) {
        this.awemeType = i;
    }

    public void setCmtSwt(boolean z) {
        this.cmtSwt = z;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setGroupId(String str) {
        this.groupId = str;
    }

    public void setImageInfo(ImageInfo imageInfo2) {
        this.imageInfo = imageInfo2;
    }

    public void setInteractStickerStructs(List<InteractStickerStruct> list) {
        this.interactStickerStructs = list;
    }

    public void setLabelLarge(UrlModel urlModel) {
        this.labelLarge = urlModel;
    }

    public void setLabelThumb(UrlModel urlModel) {
        this.labelThumb = urlModel;
    }

    public void setLifeActivityInfo(a aVar) {
        this.lifeActivityInfo = aVar;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public void setStickers(String str) {
        this.stickers = str;
    }

    public void setStoryId(String str) {
        this.storyId = str;
    }

    public void setThirdPlatformInfo(b bVar) {
        this.thirdPlatformInfo = bVar;
    }

    public void setVideo(Video video2) {
        this.video = video2;
    }
}
