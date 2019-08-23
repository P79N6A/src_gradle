package com.ss.android.ugc.aweme.commercialize.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.log.aa;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class n implements aa.a, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("ad_id")
    public long adId = -1;
    @SerializedName("advanced_infos")
    public List<a> advancedInfoList;
    @SerializedName("advertiser_info")
    public User advertisementInfo;
    @SerializedName("click_track_url_list")
    public UrlModel clickTrackUrlList;
    @SerializedName("count_down_ts")
    public long countDownTimeStamp;
    @SerializedName("guide_text")
    public String guideText = "";
    @SerializedName("icon_list")
    public List<UrlModel> iconList = new ArrayList();
    @SerializedName("creative_id")
    public long id = -1;
    @SerializedName("image_list")
    public List<UrlModel> imageList;
    @SerializedName("is_preview")
    public boolean isPreview;
    @SerializedName("label")
    public String label;
    @SerializedName("log_extra")
    public String logExtra;
    @SerializedName("native_type")
    public int nativeType;
    @SerializedName("open_url")
    public String openUrl;
    @SerializedName("source")
    public String source;
    @SerializedName("sub_text")
    public String subText = "";
    @SerializedName("title")
    public String title;
    @SerializedName("track_url_list")
    public UrlModel trackUrlList;
    @SerializedName("type")
    public String type;
    @SerializedName("web_title")
    public String webTitle;
    @SerializedName("web_url")
    public String webUrl;

    public static class a {
        @SerializedName("title")

        /* renamed from: a  reason: collision with root package name */
        public String f39397a;
        @SerializedName("web_title")

        /* renamed from: b  reason: collision with root package name */
        public String f39398b;
        @SerializedName("web_url")

        /* renamed from: c  reason: collision with root package name */
        public String f39399c;
        @SerializedName("open_url")

        /* renamed from: d  reason: collision with root package name */
        public String f39400d;
        @SerializedName("image_info")

        /* renamed from: e  reason: collision with root package name */
        public UrlModel f39401e;
    }

    public long getCreativeId() {
        return this.id;
    }

    public String getLogExtra() {
        return this.logExtra;
    }
}
