package com.ss.android.ugc.aweme.feed.model.poi;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

public class PoiClassRankBannerStruct implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("banner_url")
    UrlModel bannerUrl;
    @SerializedName("bid")
    String bid;
    @SerializedName("business_area_option")
    PoiOptionStruct businessAreaOption;
    @SerializedName("class_option")
    PoiOptionStruct classOption;
    @SerializedName("description")
    String description;
    @SerializedName("district_code")
    String districtCode;
    @SerializedName("height")
    int height;
    @SerializedName("notch_banner_url")
    UrlModel notchBannerUrl;
    @SerializedName("schema")
    String schema;
    @SerializedName("tag_list")
    List<PoiBannerTagStruct> tags;
    @SerializedName("title")
    String title;
    @SerializedName("width")
    int width;

    public UrlModel getBannerUrl() {
        return this.bannerUrl;
    }

    public String getBid() {
        return this.bid;
    }

    public PoiOptionStruct getBusinessAreaOption() {
        return this.businessAreaOption;
    }

    public PoiOptionStruct getClassOption() {
        return this.classOption;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDistrictCode() {
        return this.districtCode;
    }

    public int getHeight() {
        return this.height;
    }

    public UrlModel getNotchBannerUrl() {
        return this.notchBannerUrl;
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

    public String getTag() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41501, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41501, new Class[0], String.class);
        } else if (CollectionUtils.isEmpty(this.tags)) {
            return "";
        } else {
            return this.tags.get(0).tagName;
        }
    }

    public void updateSchema(String str) {
        this.schema = str;
    }
}
