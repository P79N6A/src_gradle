package com.ss.android.ugc.aweme.commercialize.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

public class j implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    @SerializedName("avatar_icon")
    public UrlModel avatarIcon;
    @Nullable
    @SerializedName("click_track_url_list")
    public UrlModel clickTrackUrlList;
    @Nullable
    @SerializedName("comment_area")
    public a commentArea;
    @SerializedName("creative_id")
    @NonNull
    public String creativeId;
    @Nullable
    @SerializedName("feed_show_type")
    public int feedShowType;
    @SerializedName("image_list")
    List<UrlModel> imageList;
    @Nullable
    @SerializedName("is_preview")
    public boolean isPreview;
    @Nullable
    @SerializedName("label")
    public String label;
    @SerializedName("link_type")
    public int linkType;
    @Nullable
    @SerializedName("log_extra")
    public String logExtra;
    @Nullable
    @SerializedName("open_url")
    public String openUrl;
    @Nullable
    @SerializedName("package")
    public String packageName;
    @Nullable
    @SerializedName("show_close_tips")
    public boolean showCloseTips;
    @SerializedName("show_type")
    public int showType;
    @Nullable
    @SerializedName("title")
    public String title;
    @Nullable
    @SerializedName("track_url_list")
    public UrlModel trackUrlList;
    @SerializedName("type")
    @NonNull
    public String type;
    @Nullable
    @SerializedName("web_title")
    public String webTitle;
    @Nullable
    @SerializedName("web_url")
    public String webUrl;

    public static class a implements Serializable {
        @Nullable
        @SerializedName("avatar_icon")
        public UrlModel avatarIcon;
        @Nullable
        @SerializedName("feature_label")
        public String featureLabel;
        @Nullable
        @SerializedName("title")
        public String title;
    }

    public UrlModel getClickTrackUrlList() {
        return this.clickTrackUrlList;
    }

    public List<UrlModel> getImageList() {
        return this.imageList;
    }

    public int getLinkType() {
        return this.linkType;
    }

    public UrlModel getTrackUrlList() {
        return this.trackUrlList;
    }

    public boolean showOnFeed() {
        if (this.showType == 0 || this.showType == 1) {
            return true;
        }
        return false;
    }

    @Nullable
    public UrlModel getCommentAvatarIcon() {
        if (this.commentArea == null || this.commentArea.avatarIcon == null) {
            return this.avatarIcon;
        }
        return this.commentArea.avatarIcon;
    }

    public boolean showOnComment() {
        if ((this.showType != 0 && this.showType != 2) || this.commentArea == null || this.commentArea.title == null || this.commentArea.featureLabel == null) {
            return false;
        }
        return true;
    }

    public void setClickTrackUrlList(UrlModel urlModel) {
        this.clickTrackUrlList = urlModel;
    }

    public void setLinkType(int i) {
        this.linkType = i;
    }

    public void setTrackUrlList(UrlModel urlModel) {
        this.trackUrlList = urlModel;
    }
}
