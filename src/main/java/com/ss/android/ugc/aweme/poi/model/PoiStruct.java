package com.ss.android.ugc.aweme.poi.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
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
    public b address;
    @SerializedName("collect_stat")
    public int collectStatus;
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
    public long expandType;
    @SerializedName("icon_on_entry")
    public UrlModel iconOnEntry;
    @SerializedName("icon_on_info")
    public UrlModel iconOnInfo;
    @SerializedName("icon_on_map")
    public UrlModel iconOnMap;
    @SerializedName("icon_type")
    public int iconType;
    @SerializedName("is_admin_area")
    public boolean isAdminArea;
    @SerializedName("is_candidate")
    public boolean isCandidate;
    @SerializedName("is_top_recommend")
    public boolean isTopRecommend;
    @SerializedName("item_count")
    public int itemCount;
    public transient LinkedHashMap<String, Object> mArgs = new LinkedHashMap<>();
    @SerializedName("poi_backend_type")
    public k poiBackendType;
    @SerializedName("business_area_name")
    public String poiBusinessAreaName;
    @SerializedName("poi_card")
    public m poiCard;
    @SerializedName("cost")
    public double poiCost;
    @SerializedName("poi_id")
    public String poiId;
    @SerializedName("is_local_city")
    public boolean poiIsLocalCity;
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
    public double poiRating;
    @SerializedName("poi_subtitle")
    public String poiSubTitle;
    @SerializedName("poi_subtitle_type")
    public int poiSubTitleType;
    @SerializedName("poi_type")
    public long poiType;
    @SerializedName("poi_voucher")
    public String poiVoucher;
    @SerializedName("share_info")
    public ShareInfo shareInfo;
    @SerializedName("is_show_halfcard")
    public int showHalfCard;
    @SerializedName("type_code")
    public String typeCode;
    @SerializedName("user_count")
    public int userCount;
    @SerializedName("voucher_release_areas")
    public List<String> voucherReleaseAreas;

    public b getAddress() {
        return this.address;
    }

    public int getCollectStatus() {
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

    public int getIconType() {
        return this.iconType;
    }

    public boolean getIsTopRecommend() {
        return this.isTopRecommend;
    }

    public int getItemCount() {
        return this.itemCount;
    }

    public String getPoiBusinessAreaName() {
        return this.poiBusinessAreaName;
    }

    public m getPoiCard() {
        return this.poiCard;
    }

    public double getPoiCost() {
        return this.poiCost;
    }

    public String getPoiId() {
        return this.poiId;
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

    public double getPoiRating() {
        return this.poiRating;
    }

    public String getPoiSubTitle() {
        return this.poiSubTitle;
    }

    public int getPoiSubTitleType() {
        return this.poiSubTitleType;
    }

    public String getPoiVoucher() {
        return this.poiVoucher;
    }

    public ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public int getShowHalfCard() {
        return this.showHalfCard;
    }

    public String getTypeCode() {
        return this.typeCode;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public List<String> getVoucherReleaseAreas() {
        return this.voucherReleaseAreas;
    }

    public boolean isPoiIsLocalCity() {
        return this.poiIsLocalCity;
    }

    public String isCandidate() {
        if (this.isCandidate) {
            return PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        }
        return PushConstants.PUSH_TYPE_NOTIFY;
    }

    public boolean isExpandable() {
        if (this.expandType == 1) {
            return true;
        }
        return false;
    }

    public String getBackendTypeCode() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65156, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65156, new Class[0], String.class);
        } else if (this.poiBackendType != null) {
            return this.poiBackendType.getCode();
        } else {
            return "";
        }
    }

    public String getAddressStr() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65150, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65150, new Class[0], String.class);
        } else if (this.address == null) {
            return this.poiName;
        } else {
            if (TextUtils.isEmpty(this.address.simpleAddr)) {
                return this.poiName;
            }
            return this.address.simpleAddr;
        }
    }

    public String getCity() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65151, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65151, new Class[0], String.class);
        } else if (this.address != null && !TextUtils.isEmpty(this.address.getCity())) {
            return this.address.getCity();
        } else {
            return null;
        }
    }

    public String getCityCode() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65152, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65152, new Class[0], String.class);
        } else if (this.address != null && !TextUtils.isEmpty(this.address.getCityCode())) {
            return this.address.getCityCode();
        } else {
            return null;
        }
    }

    public String getCountry() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65155, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65155, new Class[0], String.class);
        } else if (this.address == null) {
            return "";
        } else {
            if (TextUtils.isEmpty(this.address.country)) {
                return "";
            }
            return this.address.country;
        }
    }

    public String getCountryCode() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65154, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65154, new Class[0], String.class);
        } else if (this.address == null) {
            return "";
        } else {
            if (TextUtils.isEmpty(this.address.countryCode)) {
                return "";
            }
            return this.address.countryCode;
        }
    }

    public String getProvince() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65153, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65153, new Class[0], String.class);
        } else if (this.address != null && !TextUtils.isEmpty(this.address.getProvince())) {
            return this.address.getProvince();
        } else {
            return null;
        }
    }

    public com.ss.android.ugc.aweme.sticker.data.PoiStruct toStickerPoiStruct() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65160, new Class[0], com.ss.android.ugc.aweme.sticker.data.PoiStruct.class)) {
            return (com.ss.android.ugc.aweme.sticker.data.PoiStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65160, new Class[0], com.ss.android.ugc.aweme.sticker.data.PoiStruct.class);
        }
        com.ss.android.ugc.aweme.sticker.data.PoiStruct poiStruct = new com.ss.android.ugc.aweme.sticker.data.PoiStruct();
        poiStruct.setPoiId(this.poiId);
        poiStruct.setPoiName(this.poiName);
        poiStruct.setTypeCode(this.typeCode);
        poiStruct.setUserCount(Integer.valueOf(this.userCount));
        poiStruct.setItemCount(Integer.valueOf(this.itemCount));
        poiStruct.setShareInfo(this.shareInfo);
        poiStruct.setCoverHd(this.coverHd);
        poiStruct.setCoverLarge(this.coverLarge);
        poiStruct.setCoverMedium(this.coverMedium);
        poiStruct.setCoverThumb(this.coverThumb);
        poiStruct.setCoverItem(this.coverItem);
        if (this.address != null) {
            poiStruct.setAddress(this.address.toStickerPoiCard());
        }
        poiStruct.setDistance(this.distance);
        poiStruct.setIconType(Integer.valueOf(this.iconType));
        poiStruct.setPoiLongitude(this.poiLongitude);
        poiStruct.setPoiLatitude(this.poiLatitude);
        poiStruct.setCollectStatus(Integer.valueOf(this.collectStatus));
        poiStruct.setExpandType(Long.valueOf(this.expandType));
        poiStruct.setIconOnMap(this.iconOnMap);
        poiStruct.setIconOnEntry(this.iconOnEntry);
        poiStruct.setIconOnInfo(this.iconOnInfo);
        poiStruct.setPoiType(Long.valueOf(this.poiType));
        poiStruct.setPoiVoucher(this.poiVoucher);
        poiStruct.setPoiSubTitle(this.poiSubTitle);
        poiStruct.setPoiSubTitleType(Integer.valueOf(this.poiSubTitleType));
        if (this.poiCard != null) {
            poiStruct.setPoiCard(this.poiCard.toStickerPoiCard());
        }
        poiStruct.setPoiRating(Double.valueOf(this.poiRating));
        poiStruct.setPoiCost(Double.valueOf(this.poiCost));
        poiStruct.setPoiRankDesc(this.poiRankDesc);
        poiStruct.setPoiBusinessAreaName(this.poiBusinessAreaName);
        poiStruct.setPoiIsLocalCity(Boolean.valueOf(this.poiIsLocalCity));
        poiStruct.setPoiOptionName(this.poiOptionName);
        return poiStruct;
    }

    public void setCollectStatus(int i) {
        this.collectStatus = i;
    }

    public void setPoiId(String str) {
        this.poiId = str;
    }

    public boolean contains(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 65159, new Class[]{String.class}, Boolean.TYPE)) {
            return this.mArgs.containsKey(str2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 65159, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    public Object get(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 65158, new Class[]{String.class}, Object.class)) {
            return this.mArgs.get(str2);
        }
        return PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 65158, new Class[]{String.class}, Object.class);
    }

    public void fromStickerPoiStruct(com.ss.android.ugc.aweme.sticker.data.PoiStruct poiStruct) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        int i5;
        double d2;
        boolean z;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{poiStruct}, this, changeQuickRedirect, false, 65161, new Class[]{com.ss.android.ugc.aweme.sticker.data.PoiStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiStruct}, this, changeQuickRedirect, false, 65161, new Class[]{com.ss.android.ugc.aweme.sticker.data.PoiStruct.class}, Void.TYPE);
        } else if (poiStruct != null) {
            this.poiId = poiStruct.getPoiId();
            this.poiName = poiStruct.getPoiName();
            this.typeCode = poiStruct.getTypeCode();
            if (poiStruct.getUserCount() != null) {
                i = poiStruct.getUserCount().intValue();
            } else {
                i = 0;
            }
            this.userCount = i;
            if (poiStruct.getItemCount() != null) {
                i2 = poiStruct.getItemCount().intValue();
            } else {
                i2 = 0;
            }
            this.itemCount = i2;
            this.shareInfo = poiStruct.getShareInfo();
            this.coverHd = poiStruct.getCoverHd();
            this.coverLarge = poiStruct.getCoverLarge();
            this.coverMedium = poiStruct.getCoverMedium();
            this.coverThumb = poiStruct.getCoverThumb();
            this.coverItem = poiStruct.getCoverItem();
            if (poiStruct.getAddress() != null) {
                b bVar = new b();
                bVar.fromStickerPoiStruct(poiStruct.getAddress());
                this.address = bVar;
            }
            this.distance = poiStruct.getDistance();
            if (poiStruct.getIconType() != null) {
                i3 = poiStruct.getIconType().intValue();
            } else {
                i3 = 0;
            }
            this.iconType = i3;
            this.poiLongitude = poiStruct.getPoiLongitude();
            this.poiLatitude = poiStruct.getPoiLatitude();
            if (poiStruct.getCollectStatus() != null) {
                i4 = poiStruct.getCollectStatus().intValue();
            } else {
                i4 = 0;
            }
            this.collectStatus = i4;
            long j2 = 0;
            if (poiStruct.getExpandType() != null) {
                j = poiStruct.getExpandType().longValue();
            } else {
                j = 0;
            }
            this.expandType = j;
            this.iconOnMap = poiStruct.getIconOnMap();
            this.iconOnEntry = poiStruct.getIconOnEntry();
            this.iconOnInfo = poiStruct.getIconOnInfo();
            if (poiStruct.getPoiType() != null) {
                j2 = poiStruct.getPoiType().longValue();
            }
            this.poiType = j2;
            this.poiVoucher = poiStruct.getPoiVoucher();
            this.poiSubTitle = poiStruct.getPoiSubTitle();
            if (poiStruct.getPoiSubTitleType() != null) {
                i5 = poiStruct.getPoiSubTitleType().intValue();
            } else {
                i5 = 0;
            }
            this.poiSubTitleType = i5;
            if (poiStruct.getPoiCard() != null) {
                m mVar = new m();
                mVar.fromStickerPoiStruct(poiStruct.getPoiCard());
                this.poiCard = mVar;
            }
            double d3 = 0.0d;
            if (poiStruct.getPoiRating() != null) {
                d2 = poiStruct.getPoiRating().doubleValue();
            } else {
                d2 = 0.0d;
            }
            this.poiRating = d2;
            if (poiStruct.getPoiCost() != null) {
                d3 = poiStruct.getPoiCost().doubleValue();
            }
            this.poiCost = d3;
            this.poiRankDesc = poiStruct.getPoiRankDesc();
            this.poiBusinessAreaName = poiStruct.getPoiBusinessAreaName();
            if (poiStruct.isPoiIsLocalCity() != null) {
                z = poiStruct.isPoiIsLocalCity().booleanValue();
            } else {
                z = false;
            }
            this.poiIsLocalCity = z;
            this.poiOptionName = poiStruct.getPoiOptionName();
            if (poiStruct.getCandidate() != null) {
                z2 = poiStruct.getCandidate().booleanValue();
            }
            this.isCandidate = z2;
        }
    }

    public void put(String str, Object obj) {
        String str2 = str;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{str2, obj2}, this, changeQuickRedirect, false, 65157, new Class[]{String.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, obj2}, this, changeQuickRedirect, false, 65157, new Class[]{String.class, Object.class}, Void.TYPE);
            return;
        }
        this.mArgs.put(str2, obj2);
    }
}
