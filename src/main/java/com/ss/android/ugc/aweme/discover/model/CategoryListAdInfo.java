package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import java.io.Serializable;
import java.util.List;

public class CategoryListAdInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("ad_id")
    Long adId;
    @SerializedName("ad_position")
    private int adPosition = -1;
    @SerializedName("click_track_url_list")
    UrlModel clickTrackUrlList;
    @SerializedName("creative_id")
    Long creativeId;
    @SerializedName("description")
    String description;
    @SerializedName("image_list")
    List<UrlModel> imageList;
    @SerializedName("is_preview")
    boolean isPreview;
    @SerializedName("label")
    private AwemeTextLabelModel label;
    @SerializedName("log_extra")
    String logExtra;
    @SerializedName("open_url")
    String openUrl;
    @SerializedName("source")
    String source;
    @SerializedName("title")
    String title;
    @SerializedName("track_url_list")
    UrlModel trackUrlList;
    @SerializedName("type")
    String type;
    @SerializedName("web_title")
    String webTitle;
    @SerializedName("web_url")
    String webUrl;

    public Long getAdId() {
        return this.adId;
    }

    public int getAdPosition() {
        return this.adPosition;
    }

    public UrlModel getClickTrackUrlList() {
        return this.clickTrackUrlList;
    }

    public Long getCreativeId() {
        return this.creativeId;
    }

    public String getDescription() {
        return this.description;
    }

    public List<UrlModel> getImageList() {
        return this.imageList;
    }

    public AwemeTextLabelModel getLabel() {
        return this.label;
    }

    public String getLogExtra() {
        return this.logExtra;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getSource() {
        return this.source;
    }

    public String getTitle() {
        return this.title;
    }

    public UrlModel getTrackUrlList() {
        return this.trackUrlList;
    }

    public String getType() {
        return this.type;
    }

    public String getWebTitle() {
        return this.webTitle;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public boolean isPreview() {
        return this.isPreview;
    }

    public void setAdId(Long l) {
        this.adId = l;
    }

    public void setAdPosition(int i) {
        this.adPosition = i;
    }

    public void setClickTrackUrlList(UrlModel urlModel) {
        this.clickTrackUrlList = urlModel;
    }

    public void setCreativeId(Long l) {
        this.creativeId = l;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setImageList(List<UrlModel> list) {
        this.imageList = list;
    }

    public void setLabel(AwemeTextLabelModel awemeTextLabelModel) {
        this.label = awemeTextLabelModel;
    }

    public void setLogExtra(String str) {
        this.logExtra = str;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setPreview(boolean z) {
        this.isPreview = z;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTrackUrlList(UrlModel urlModel) {
        this.trackUrlList = urlModel;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setWebTitle(String str) {
        this.webTitle = str;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }
}
