package com.ss.android.ugc.aweme.sticker.data;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;

@Keep
public class PoiStruct implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("address_info")
    public Address address;
    @SerializedName("collect_stat")
    public Integer collectStatus;
    @SerializedName("cover_hd")
    public UrlModel coverHd;
    @SerializedName("cover_item")
    public UrlModel coverItem;
    @SerializedName("cover_large")
    public UrlModel coverLarge;
    @SerializedName("cover_medium")
    public UrlModel coverMedium;
    @SerializedName("cover_thumb")
    public UrlModel coverThumb;
    @SerializedName("distance")
    public String distance;
    @SerializedName("expand_type")
    public Long expandType;
    @SerializedName("icon_on_entry")
    public UrlModel iconOnEntry;
    @SerializedName("icon_on_info")
    public UrlModel iconOnInfo;
    @SerializedName("icon_on_map")
    public UrlModel iconOnMap;
    @SerializedName("icon_type")
    public Integer iconType;
    @SerializedName("is_candidate")
    public Boolean isCandidate;
    @SerializedName("item_count")
    public Integer itemCount;
    public transient LinkedHashMap<String, Object> mArgs = new LinkedHashMap<>();
    @SerializedName("business_area_name")
    public String poiBusinessAreaName;
    @SerializedName("poi_card")
    public PoiCardStruct poiCard;
    @SerializedName("cost")
    public Double poiCost;
    @SerializedName("poi_id")
    public String poiId;
    @SerializedName("is_local_city")
    public Boolean poiIsLocalCity;
    @SerializedName("poi_latitude")
    public String poiLatitude;
    @SerializedName("poi_longitude")
    public String poiLongitude;
    @SerializedName("poi_name")
    public String poiName;
    @SerializedName("option_name")
    public String poiOptionName;
    @SerializedName("poi_rank_desc")
    public String poiRankDesc;
    @SerializedName("rating")
    public Double poiRating;
    @SerializedName("poi_subtitle")
    public String poiSubTitle;
    @SerializedName("poi_subtitle_type")
    public Integer poiSubTitleType;
    @SerializedName("poi_type")
    public Long poiType;
    @SerializedName("poi_voucher")
    public String poiVoucher;
    @SerializedName("share_info")
    public ShareInfo shareInfo;
    @SerializedName("type_code")
    public String typeCode;
    @SerializedName("user_count")
    public Integer userCount;
    @SerializedName("voucher_release_areas")
    public List<String> voucherReleaseAreas;

    public Address getAddress() {
        return this.address;
    }

    public Boolean getCandidate() {
        return this.isCandidate;
    }

    public Integer getCollectStatus() {
        return this.collectStatus;
    }

    public UrlModel getCoverHd() {
        return this.coverHd;
    }

    public UrlModel getCoverItem() {
        return this.coverItem;
    }

    public UrlModel getCoverLarge() {
        return this.coverLarge;
    }

    public UrlModel getCoverMedium() {
        return this.coverMedium;
    }

    public UrlModel getCoverThumb() {
        return this.coverThumb;
    }

    public String getDistance() {
        return this.distance;
    }

    public Long getExpandType() {
        return this.expandType;
    }

    public UrlModel getIconOnEntry() {
        return this.iconOnEntry;
    }

    public UrlModel getIconOnInfo() {
        return this.iconOnInfo;
    }

    public UrlModel getIconOnMap() {
        return this.iconOnMap;
    }

    public Integer getIconType() {
        return this.iconType;
    }

    public Integer getItemCount() {
        return this.itemCount;
    }

    public String getPoiBusinessAreaName() {
        return this.poiBusinessAreaName;
    }

    public PoiCardStruct getPoiCard() {
        return this.poiCard;
    }

    public Double getPoiCost() {
        return this.poiCost;
    }

    public String getPoiId() {
        return this.poiId;
    }

    public Boolean getPoiIsLocalCity() {
        return this.poiIsLocalCity;
    }

    public String getPoiLatitude() {
        return this.poiLatitude;
    }

    public String getPoiLongitude() {
        return this.poiLongitude;
    }

    public String getPoiName() {
        return this.poiName;
    }

    public String getPoiOptionName() {
        return this.poiOptionName;
    }

    public String getPoiRankDesc() {
        return this.poiRankDesc;
    }

    public Double getPoiRating() {
        return this.poiRating;
    }

    public String getPoiSubTitle() {
        return this.poiSubTitle;
    }

    public Integer getPoiSubTitleType() {
        return this.poiSubTitleType;
    }

    public Long getPoiType() {
        return this.poiType;
    }

    public String getPoiVoucher() {
        return this.poiVoucher;
    }

    public ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public String getTypeCode() {
        return this.typeCode;
    }

    public Integer getUserCount() {
        return this.userCount;
    }

    public List<String> getVoucherReleaseAreas() {
        return this.voucherReleaseAreas;
    }

    public Boolean isPoiIsLocalCity() {
        return this.poiIsLocalCity;
    }

    public String isCandidate() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 81967, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 81967, new Class[0], String.class);
        } else if (this.isCandidate.booleanValue()) {
            return PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            return PushConstants.PUSH_TYPE_NOTIFY;
        }
    }

    public Boolean isExpandable() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 81966, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 81966, new Class[0], Boolean.class);
        }
        if (this.expandType.longValue() == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public void setAddress(Address address2) {
        this.address = address2;
    }

    public void setCandidate(Boolean bool) {
        this.isCandidate = bool;
    }

    public void setCollectStatus(Integer num) {
        this.collectStatus = num;
    }

    public void setCoverHd(UrlModel urlModel) {
        this.coverHd = urlModel;
    }

    public void setCoverItem(UrlModel urlModel) {
        this.coverItem = urlModel;
    }

    public void setCoverLarge(UrlModel urlModel) {
        this.coverLarge = urlModel;
    }

    public void setCoverMedium(UrlModel urlModel) {
        this.coverMedium = urlModel;
    }

    public void setCoverThumb(UrlModel urlModel) {
        this.coverThumb = urlModel;
    }

    public void setDistance(String str) {
        this.distance = str;
    }

    public void setExpandType(Long l) {
        this.expandType = l;
    }

    public void setIconOnEntry(UrlModel urlModel) {
        this.iconOnEntry = urlModel;
    }

    public void setIconOnInfo(UrlModel urlModel) {
        this.iconOnInfo = urlModel;
    }

    public void setIconOnMap(UrlModel urlModel) {
        this.iconOnMap = urlModel;
    }

    public void setIconType(Integer num) {
        this.iconType = num;
    }

    public void setItemCount(Integer num) {
        this.itemCount = num;
    }

    public void setPoiBusinessAreaName(String str) {
        this.poiBusinessAreaName = str;
    }

    public void setPoiCard(PoiCardStruct poiCardStruct) {
        this.poiCard = poiCardStruct;
    }

    public void setPoiCost(Double d2) {
        this.poiCost = d2;
    }

    public void setPoiId(String str) {
        this.poiId = str;
    }

    public void setPoiIsLocalCity(Boolean bool) {
        this.poiIsLocalCity = bool;
    }

    public void setPoiLatitude(String str) {
        this.poiLatitude = str;
    }

    public void setPoiLongitude(String str) {
        this.poiLongitude = str;
    }

    public void setPoiName(String str) {
        this.poiName = str;
    }

    public void setPoiOptionName(String str) {
        this.poiOptionName = str;
    }

    public void setPoiRankDesc(String str) {
        this.poiRankDesc = str;
    }

    public void setPoiRating(Double d2) {
        this.poiRating = d2;
    }

    public void setPoiSubTitle(String str) {
        this.poiSubTitle = str;
    }

    public void setPoiSubTitleType(Integer num) {
        this.poiSubTitleType = num;
    }

    public void setPoiType(Long l) {
        this.poiType = l;
    }

    public void setPoiVoucher(String str) {
        this.poiVoucher = str;
    }

    public void setShareInfo(ShareInfo shareInfo2) {
        this.shareInfo = shareInfo2;
    }

    public void setTypeCode(String str) {
        this.typeCode = str;
    }

    public void setUserCount(Integer num) {
        this.userCount = num;
    }

    public void setVoucherReleaseAreas(List<String> list) {
        this.voucherReleaseAreas = list;
    }

    public Boolean contains(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 81970, new Class[]{String.class}, Boolean.class)) {
            return Boolean.valueOf(this.mArgs.containsKey(str2));
        }
        return (Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 81970, new Class[]{String.class}, Boolean.class);
    }

    public Object get(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 81969, new Class[]{String.class}, Object.class)) {
            return this.mArgs.get(str2);
        }
        return PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 81969, new Class[]{String.class}, Object.class);
    }

    public void put(String str, Object obj) {
        String str2 = str;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{str2, obj2}, this, changeQuickRedirect, false, 81968, new Class[]{String.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, obj2}, this, changeQuickRedirect, false, 81968, new Class[]{String.class, Object.class}, Void.TYPE);
            return;
        }
        this.mArgs.put(str2, obj2);
    }
}
