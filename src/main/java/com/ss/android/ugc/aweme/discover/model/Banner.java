package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.h;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.util.List;

public class Banner implements h, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1;
    @SerializedName("ad_data")
    @JsonAdapter(StringJsonAdapterFactory.class)
    BannerAdData adData;
    @SerializedName("banner_url")
    UrlModel bannerUrl;
    @SerializedName("bid")
    String bid;
    @SerializedName("height")
    int height;
    private String requestId;
    @SerializedName("schema")
    String schema;
    @SerializedName("title")
    String title;
    @SerializedName("width")
    int width;

    public static class BannerAdData implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("ad_label")
        AdLabel adLabel;
        @SerializedName("click_track_url_list")
        List<String> clickTrackUrlList;
        @SerializedName("creative_id")
        long creativeId;
        @SerializedName("is_ad")
        boolean isAd = true;
        @SerializedName("log_extra")
        String logExtra;
        @SerializedName("package_name")
        String packageName;
        @SerializedName("track_url_list")
        List<String> trackUrlList;
        @SerializedName("type")
        String type;

        public AdLabel getAdLabel() {
            return this.adLabel;
        }
    }

    public BannerAdData getAdData() {
        return this.adData;
    }

    public UrlModel getBannerUrl() {
        return this.bannerUrl;
    }

    public String getBid() {
        return this.bid;
    }

    public int getHeight() {
        return this.height;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getTitle() {
        return this.title;
    }

    public int getWidth() {
        return this.width;
    }

    public List<String> getClickTrackUrlList() {
        if (this.adData == null) {
            return null;
        }
        return this.adData.clickTrackUrlList;
    }

    public long getCreativeId() {
        if (this.adData == null) {
            return 0;
        }
        return this.adData.creativeId;
    }

    public String getLogExtra() {
        if (this.adData == null) {
            return null;
        }
        return this.adData.logExtra;
    }

    public String getPackageName() {
        if (this.adData == null) {
            return null;
        }
        return this.adData.packageName;
    }

    public List<String> getTrackUrlList() {
        if (this.adData == null) {
            return null;
        }
        return this.adData.trackUrlList;
    }

    public String getType() {
        if (this.adData == null) {
            return null;
        }
        return this.adData.type;
    }

    public boolean isAd() {
        if (this.adData == null || !this.adData.isAd) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 36998, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 36998, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.bid != null) {
            i = this.bid.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        if (this.title != null) {
            i2 = this.title.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        if (this.bannerUrl != null) {
            i3 = this.bannerUrl.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (((((i6 + i3) * 31) + this.height) * 31) + this.width) * 31;
        if (this.schema != null) {
            i4 = this.schema.hashCode();
        }
        return i7 + i4;
    }

    public void setBannerUrl(UrlModel urlModel) {
        this.bannerUrl = urlModel;
    }

    public void setBid(String str) {
        this.bid = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 36997, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 36997, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Banner banner = (Banner) obj;
            if (this.height != banner.height || this.width != banner.width) {
                return false;
            }
            if (this.bid == null ? banner.bid != null : !this.bid.equals(banner.bid)) {
                return false;
            }
            if (this.title == null ? banner.title != null : !this.title.equals(banner.title)) {
                return false;
            }
            if (this.bannerUrl == null ? banner.bannerUrl != null : !this.bannerUrl.equals(banner.bannerUrl)) {
                return false;
            }
            if (this.schema != null) {
                return this.schema.equals(banner.schema);
            }
            if (banner.schema == null) {
                return true;
            }
            return false;
        }
    }
}
