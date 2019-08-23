package com.ss.android.ugc.aweme.poi.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import java.util.List;

public final class z implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("comment_list")
    public List<o> commentList;
    @SerializedName("comment_url")
    public String commentUrl;
    @SerializedName("cost")
    public String cost;
    @SerializedName("desc_title")
    public String descTitle;
    @SerializedName("feedback_url")
    public String feedbackUrl;
    @SerializedName("has_detail_info")
    public boolean hasDetailInfo;
    @SerializedName("has_upload_image_permission")
    public boolean hasUploadImagePermission;
    @SerializedName("i18n_cost")
    public String i18nCost;
    @SerializedName("introduction")
    public String introduction;
    @SerializedName("open_time")
    public String open_time;
    @SerializedName("order_info")
    public aj orderInfo;
    @SerializedName("photos")
    public List<al> photos;
    @SerializedName("poi_activity_info")
    public d poiActivityInfo;
    @SerializedName("destination_poi_class_list")
    public List<c> poiClassInfoStructList;
    @SerializedName("poi_class_rank")
    public n poiClassRank;
    @SerializedName("rating")
    public String rating;
    @SerializedName("recommend_items")
    public List<al> recommendItems;
    @SerializedName("recommend_title")
    public String recommendTitle;
    @SerializedName("biz_src")
    public int source;
    @SerializedName("specialities")
    public String specialities;
    @SerializedName("sub_type")
    public String subType;
    @SerializedName("tags")
    public String tags;
    @SerializedName("telephone")
    public String telephone;
    @SerializedName("valid")
    public boolean valid;
    @SerializedName("website")
    public String website;

    public final List<c> getPoiClassInfoStructList() {
        return this.poiClassInfoStructList;
    }

    public final long getRankClassCode() {
        if (this.poiClassRank != null) {
            return this.poiClassRank.poiClassCode;
        }
        return -1;
    }

    public final String getRankDesc() {
        if (this.poiClassRank != null) {
            return this.poiClassRank.description;
        }
        return "";
    }

    public final String[] getPoiCategory() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65101, new Class[0], String[].class)) {
            return (String[]) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65101, new Class[0], String[].class);
        } else if (this.poiClassInfoStructList == null || this.poiClassInfoStructList.size() == 0) {
            return null;
        } else {
            String[] strArr = new String[this.poiClassInfoStructList.size()];
            for (c cVar : this.poiClassInfoStructList) {
                strArr[i] = cVar.name;
                i++;
            }
            if (i < 3) {
                return null;
            }
            return strArr;
        }
    }

    public final void validatePoiClassInfoStructList() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65099, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65099, new Class[0], Void.TYPE);
        } else if (this.poiClassInfoStructList != null) {
            for (int size = this.poiClassInfoStructList.size() - 1; size >= 0; size--) {
                if (this.poiClassInfoStructList.get(size).size() < 3) {
                    this.poiClassInfoStructList.remove(size);
                }
            }
        }
    }

    public final c getPoiClassInfoStruct(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 65100, new Class[]{Integer.TYPE}, c.class)) {
            return this.poiClassInfoStructList.get(i);
        }
        return (c) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 65100, new Class[]{Integer.TYPE}, c.class);
    }
}
