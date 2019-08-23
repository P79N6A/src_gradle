package com.ss.android.ugc.aweme.poi.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.poi.PoiClassRankBannerStruct;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.newfollow.e.b;
import com.ss.android.ugc.aweme.profile.model.User;
import com.taobao.android.dexposed.ClassUtils;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@Keep
public class PoiDetail extends b implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("aweme_list")
    public List<Aweme> awemeList;
    @SerializedName("aweme_type")
    int awemeType;
    @SerializedName("coupon_share_setting")
    public y couponShareSetting;
    long duration;
    private boolean enableLoadMore = true;
    private int feedType;
    @SerializedName("is_local")
    public boolean isLocal;
    @SerializedName("is_school")
    int isSchool;
    @SerializedName("is_show_campus_rank")
    int isShowCampusRank;
    @SerializedName("notice_banner_list")
    public List<PoiClassRankBannerStruct> noticeBannerList;
    private an poiActivityResponse;
    private com.ss.android.ugc.aweme.poi.a.b poiActs;
    @SerializedName("commodity")
    public r poiCommodity;
    @SerializedName("poi_ext")
    public z poiExtension;
    @SerializedName("poi_owner")
    public ak poiOwner;
    @SerializedName("poi_info")
    public PoiStruct poiStruct;
    @SerializedName("product_info")
    public am productInfo;
    @SerializedName("discover_poi")
    public ar recommendPoiExplore;
    @SerializedName("food_poi")
    public ar recommendPoiFood;
    @SerializedName("hotel_poi")
    public ar recommendPoiHotel;
    @SerializedName("nearby_poi")
    public ar recommendPoiNearby;
    @SerializedName("tour_poi")
    public ar recommendPoiScene;
    @SerializedName("poi_list")
    public List<PoiStruct> recommendedPoiList;
    @SerializedName("show_detail_type")
    public int showDetailType = 1;
    @SerializedName("user_list")
    public List<User> userList;

    public boolean isDestination() {
        return false;
    }

    public int getAwemeType() {
        return this.awemeType;
    }

    public long getDuration() {
        return this.duration;
    }

    public int getFeedType() {
        return this.feedType;
    }

    public int getIsSchool() {
        return this.isSchool;
    }

    public int getIsShowCampusRank() {
        return this.isShowCampusRank;
    }

    public an getPoiActivityResponse() {
        return this.poiActivityResponse;
    }

    public PoiStruct getPoiStruct() {
        return this.poiStruct;
    }

    public List<User> getUserList() {
        return this.userList;
    }

    public boolean isLoadMoreEnable() {
        return this.enableLoadMore;
    }

    public boolean isLocal() {
        return this.isLocal;
    }

    public String getEnterpriseLogo() {
        return this.poiOwner.avatar;
    }

    public List<o> get3rdCommentList() {
        if (this.poiExtension != null) {
            return this.poiExtension.commentList;
        }
        return null;
    }

    public String getBookUrl() {
        if (this.poiCommodity != null) {
            return this.poiCommodity.book_url;
        }
        return "";
    }

    public String getDesc() {
        if (this.poiExtension != null) {
            return this.poiExtension.descTitle;
        }
        return "";
    }

    public String getEnterpriseClaimUrl() {
        if (this.poiOwner == null) {
            return "";
        }
        return this.poiOwner.claimUrl;
    }

    public String getEnterpriseId() {
        if (this.poiOwner != null) {
            return this.poiOwner.id;
        }
        return null;
    }

    public String getEnterpriseSignature() {
        if (this.poiOwner != null) {
            return this.poiOwner.signature;
        }
        return null;
    }

    public String getEnterpriseTitle() {
        if (this.poiOwner != null) {
            return this.poiOwner.name;
        }
        return null;
    }

    public String getEnterpriseVerifyReason() {
        if (this.poiOwner != null) {
            return this.poiOwner.enterpriseVerifyReason;
        }
        return null;
    }

    public String getFeedbackUrl() {
        if (this.poiExtension != null) {
            return this.poiExtension.feedbackUrl;
        }
        return "";
    }

    public String getI18nPrice() {
        if (this.poiExtension != null) {
            return this.poiExtension.i18nCost;
        }
        return "";
    }

    public aj getOrderInfo() {
        if (this.poiExtension != null) {
            return this.poiExtension.orderInfo;
        }
        return null;
    }

    public String getPhone() {
        if (this.poiExtension == null) {
            return null;
        }
        return this.poiExtension.telephone;
    }

    public d getPoiActivityInfo() {
        if (this.poiExtension != null) {
            return this.poiExtension.poiActivityInfo;
        }
        return null;
    }

    public n getPoiRankBundle() {
        if (this.poiExtension != null) {
            return this.poiExtension.poiClassRank;
        }
        return null;
    }

    public int getPoiType() {
        if (this.poiStruct == null) {
            return 1;
        }
        return this.poiStruct.iconType;
    }

    public String getQueueUrl() {
        if (this.poiCommodity != null) {
            return this.poiCommodity.queue_url;
        }
        return "";
    }

    public List<al> getRecommendPhoto() {
        if (this.poiExtension == null) {
            return null;
        }
        return this.poiExtension.recommendItems;
    }

    public String getRecommendTitle() {
        if (this.poiExtension != null) {
            return this.poiExtension.recommendTitle;
        }
        return "";
    }

    public String getSubType() {
        if (this.poiExtension == null) {
            return "";
        }
        return this.poiExtension.subType;
    }

    public String getTypeCode() {
        if (this.poiStruct == null) {
            return "";
        }
        return this.poiStruct.typeCode;
    }

    public boolean isPoiValid() {
        if (this.poiExtension == null) {
            return true;
        }
        return this.poiExtension.valid;
    }

    public boolean isUseNewDetailStyle() {
        if (this.poiExtension != null) {
            return this.poiExtension.hasDetailInfo;
        }
        return false;
    }

    public String getAddress() {
        if (this.poiStruct == null || this.poiStruct.address == null) {
            return null;
        }
        return this.poiStruct.address.simpleAddr;
    }

    public String getCityCode() {
        if (this.poiStruct == null || this.poiStruct.address == null) {
            return null;
        }
        return this.poiStruct.address.cityCode;
    }

    public List<al> getPoiTopPhoto() {
        if (this.poiExtension == null || this.poiExtension.photos == null) {
            return null;
        }
        return this.poiExtension.photos;
    }

    public List<PoiClassRankBannerStruct> getActs() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65054, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65054, new Class[0], List.class);
        } else if (this.poiActs == null) {
            return null;
        } else {
            return this.poiActs.getBanners();
        }
    }

    public List<AwemeRawAd> getAwemeRawAds() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65093, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65093, new Class[0], List.class);
        } else if (this.poiExtension == null || this.poiExtension.poiActivityInfo == null) {
            return null;
        } else {
            return this.poiExtension.poiActivityInfo.getAwemeRawAds();
        }
    }

    public String getBackendType() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65066, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65066, new Class[0], String.class);
        } else if (this.poiStruct == null) {
            return null;
        } else {
            return this.poiStruct.getBackendTypeCode();
        }
    }

    public UrlModel getCover() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65060, new Class[0], UrlModel.class)) {
            return (UrlModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65060, new Class[0], UrlModel.class);
        } else if (this.poiStruct != null) {
            return this.poiStruct.getCoverMedium();
        } else {
            return null;
        }
    }

    public String getEnterpriseDesc() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65076, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65076, new Class[0], String.class);
        } else if (!TextUtils.isEmpty(this.poiOwner.enterpriseVerifyReason)) {
            return this.poiOwner.enterpriseVerifyReason;
        } else {
            return this.poiOwner.signature;
        }
    }

    public User getEnterpriseModel() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65078, new Class[0], User.class)) {
            return (User) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65078, new Class[0], User.class);
        }
        User user = new User();
        user.setUid(this.poiOwner.id);
        user.setCommerceUserLevel(1);
        return user;
    }

    public UrlModel getEnterpriseThumb() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65075, new Class[0], UrlModel.class)) {
            return (UrlModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65075, new Class[0], UrlModel.class);
        }
        UrlModel urlModel = new UrlModel();
        urlModel.setUri(this.poiOwner.avatar);
        return urlModel;
    }

    public String getLat() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65063, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65063, new Class[0], String.class);
        } else if (this.poiStruct != null) {
            return this.poiStruct.getPoiLatitude();
        } else {
            return "";
        }
    }

    public String getLng() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65064, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65064, new Class[0], String.class);
        } else if (this.poiStruct != null) {
            return this.poiStruct.getPoiLongitude();
        } else {
            return "";
        }
    }

    public PoiClassRankBannerStruct getMerchantAct() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65097, new Class[0], PoiClassRankBannerStruct.class)) {
            return (PoiClassRankBannerStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65097, new Class[0], PoiClassRankBannerStruct.class);
        } else if (hasMerchantActs()) {
            return this.noticeBannerList.get(0);
        } else {
            return null;
        }
    }

    public String getMerchantActId() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65096, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65096, new Class[0], String.class);
        } else if (hasMerchantActs()) {
            return this.noticeBannerList.get(0).getBid();
        } else {
            return "";
        }
    }

    public String getMerchantActTitle() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65095, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65095, new Class[0], String.class);
        } else if (hasMerchantActs()) {
            return this.noticeBannerList.get(0).getTitle();
        } else {
            return "";
        }
    }

    public String[] getPoiCategory() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65084, new Class[0], String[].class)) {
            return (String[]) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65084, new Class[0], String[].class);
        } else if (this.poiExtension != null) {
            return this.poiExtension.getPoiCategory();
        } else {
            return null;
        }
    }

    public List<c> getPoiClassInfoStructList() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65086, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65086, new Class[0], List.class);
        } else if (this.poiExtension != null) {
            return this.poiExtension.getPoiClassInfoStructList();
        } else {
            return null;
        }
    }

    public String getPoiId() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65065, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65065, new Class[0], String.class);
        } else if (this.poiStruct == null) {
            return "";
        } else {
            return this.poiStruct.getPoiId();
        }
    }

    public String getPoiRank() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65088, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65088, new Class[0], String.class);
        } else if (this.poiExtension != null) {
            return this.poiExtension.getRankDesc();
        } else {
            return null;
        }
    }

    public long getPoiRankClassCode() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65089, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65089, new Class[0], Long.TYPE)).longValue();
        } else if (this.poiExtension != null) {
            return this.poiExtension.getRankClassCode();
        } else {
            return -1;
        }
    }

    public String getPoiTypeStr() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65067, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65067, new Class[0], String.class);
        } else if (this.poiStruct == null) {
            return "";
        } else {
            return this.poiStruct.iconType;
        }
    }

    public String getTitle() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65061, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65061, new Class[0], String.class);
        } else if (this.poiStruct != null) {
            return this.poiStruct.getPoiName();
        } else {
            return "";
        }
    }

    public int getVisitors() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65081, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65081, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.poiStruct != null) {
            i = this.poiStruct.getItemCount();
        }
        return i;
    }

    public boolean hasMerchantActs() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65094, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65094, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!CollectionUtils.isEmpty(this.noticeBannerList)) {
            z = true;
        }
        return z;
    }

    public boolean hasRecomemndExplorePoi() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65056, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65056, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.recommendPoiExplore != null && this.recommendPoiExplore.isValid()) {
            z = true;
        }
        return z;
    }

    public boolean hasRecomemndFoodPoi() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65059, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65059, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.recommendPoiFood != null && this.recommendPoiFood.isValid()) {
            z = true;
        }
        return z;
    }

    public boolean hasRecomemndHotelPoi() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65057, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65057, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.recommendPoiHotel != null && this.recommendPoiHotel.isValid()) {
            z = true;
        }
        return z;
    }

    public boolean hasRecomemndNearbyPoi() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65055, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65055, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.recommendPoiNearby != null && this.recommendPoiNearby.isValid()) {
            z = true;
        }
        return z;
    }

    public boolean hasRecomemndScenePoi() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65058, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65058, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.recommendPoiScene != null && this.recommendPoiScene.isValid()) {
            z = true;
        }
        return z;
    }

    public boolean isCertificated() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65083, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65083, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.poiOwner != null && !TextUtils.isEmpty(this.poiOwner.id)) {
            z = true;
        }
        return z;
    }

    public boolean isCollected() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65072, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65072, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.poiStruct == null || this.poiStruct.getCollectStatus() != 1) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isEnterprise() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65074, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65074, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.poiOwner != null && !StringUtils.isEmpty(this.poiOwner.id)) {
            z = true;
        }
        return z;
    }

    public void parseAdRawData() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65091, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65091, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.poiExtension == null || this.poiExtension.poiActivityInfo == null)) {
            this.poiExtension.poiActivityInfo.parseRawData();
        }
    }

    public void validatePoiClassInfoStructList() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65085, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65085, new Class[0], Void.TYPE);
            return;
        }
        if (this.poiExtension != null) {
            this.poiExtension.validatePoiClassInfoStructList();
        }
    }

    public long getDefaultPoiClassCode() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65090, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65090, new Class[0], Long.TYPE)).longValue();
        }
        List<c> poiClassInfoStructList = getPoiClassInfoStructList();
        if (!CollectionUtils.isEmpty(poiClassInfoStructList)) {
            return poiClassInfoStructList.get(0).code;
        }
        return -1;
    }

    public String getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65070, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65070, new Class[0], String.class);
        } else if (this.poiStruct == null) {
            return "";
        } else {
            return this.poiStruct.getItemCount();
        }
    }

    public String[] getLabels() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65079, new Class[0], String[].class)) {
            return (String[]) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65079, new Class[0], String[].class);
        } else if (this.poiExtension == null || StringUtils.isEmpty(this.poiExtension.tags)) {
            return null;
        } else {
            try {
                return this.poiExtension.tags.split(",");
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public double[] getLatLng() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65062, new Class[0], double[].class)) {
            return (double[]) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65062, new Class[0], double[].class);
        } else if (this.poiStruct == null) {
            return null;
        } else {
            try {
                return new double[]{Double.parseDouble(this.poiStruct.getPoiLatitude()), Double.parseDouble(this.poiStruct.getPoiLongitude())};
            } catch (Exception e2) {
                a.a(e2);
                return null;
            }
        }
    }

    public String getPrice() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65080, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65080, new Class[0], String.class);
        }
        if (this.poiExtension != null) {
            str = this.poiExtension.cost;
        } else {
            str = "";
        }
        if (!StringUtils.isEmpty(str) && str.indexOf(ClassUtils.PACKAGE_SEPARATOR) > 0) {
            str = str.substring(0, str.indexOf(ClassUtils.PACKAGE_SEPARATOR));
        }
        try {
            if (Integer.parseInt(str) == 0) {
                return null;
            }
        } catch (Exception unused) {
        }
        return str;
    }

    public float getRating() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65082, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65082, new Class[0], Float.TYPE)).floatValue();
        }
        try {
            if (this.poiExtension != null) {
                if (!StringUtils.isEmpty(this.poiExtension.rating)) {
                    return Float.parseFloat(this.poiExtension.rating);
                }
            }
            return -1.0f;
        } catch (Exception unused) {
            return -1.0f;
        }
    }

    public List<String> getRecommendFood() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65068, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65068, new Class[0], List.class);
        } else if (this.poiExtension == null || StringUtils.isEmpty(this.poiExtension.specialities)) {
            return null;
        } else {
            try {
                return Arrays.asList(this.poiExtension.specialities.split(","));
            } catch (Exception e2) {
                a.a(e2);
                return null;
            }
        }
    }

    public boolean hasValidProduct() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65098, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65098, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.productInfo == null || !this.productInfo.isValidStyle() || CollectionUtils.isEmpty(this.productInfo.products)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isPoiOwnerValid() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65073, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65073, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.poiOwner != null && (!StringUtils.isEmpty(this.poiOwner.claimUrl) || !StringUtils.isEmpty(this.poiOwner.id))) {
            z = true;
        }
        return z;
    }

    public void setActs(com.ss.android.ugc.aweme.poi.a.b bVar) {
        this.poiActs = bVar;
    }

    public void setAwemeType(int i) {
        this.awemeType = i;
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public void setEnableLoadMore(boolean z) {
        this.enableLoadMore = z;
    }

    public void setFeedType(int i) {
        this.feedType = i;
    }

    public void setIsSchool(int i) {
        this.isSchool = i;
    }

    public void setIsShowCampusRank(int i) {
        this.isShowCampusRank = i;
    }

    public void setPoiActivityResponse(an anVar) {
        this.poiActivityResponse = anVar;
    }

    public void setPoiStruct(PoiStruct poiStruct2) {
        this.poiStruct = poiStruct2;
    }

    public void setUserList(List<User> list) {
        this.userList = list;
    }

    public c getPoiClassInfoStruct(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 65087, new Class[]{Integer.TYPE}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 65087, new Class[]{Integer.TYPE}, c.class);
        } else if (this.poiExtension != null) {
            return this.poiExtension.getPoiClassInfoStruct(i);
        } else {
            return null;
        }
    }

    public PoiStruct getRecommendPoi(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 65071, new Class[]{Integer.TYPE}, PoiStruct.class)) {
            return (PoiStruct) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 65071, new Class[]{Integer.TYPE}, PoiStruct.class);
        } else if (this.recommendedPoiList == null || i < 0 || i >= this.recommendedPoiList.size()) {
            return null;
        } else {
            return this.recommendedPoiList.get(i);
        }
    }

    public void setAwemeRawAds(List<AwemeRawAd> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 65092, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 65092, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (!(this.poiExtension == null || this.poiExtension.poiActivityInfo == null)) {
            this.poiExtension.poiActivityInfo.setAwemeRawAds(list);
        }
    }

    public List<String> getRecommendFood(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 65069, new Class[]{Integer.TYPE}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 65069, new Class[]{Integer.TYPE}, List.class);
        } else if (this.poiExtension == null || StringUtils.isEmpty(this.poiExtension.specialities)) {
            return null;
        } else {
            try {
                String[] split = this.poiExtension.specialities.split(",");
                return Arrays.asList(split).subList(0, Math.min(i, split.length));
            } catch (Exception e2) {
                a.a(e2);
                return null;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getEnterpriseBusinessTime(java.lang.String[] r20, java.lang.String r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = changeQuickRedirect
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r6 = 0
            r7 = 65077(0xfe35, float:9.1192E-41)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x004a
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = changeQuickRedirect
            r15 = 0
            r16 = 65077(0xfe35, float:9.1192E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            r13 = r19
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x004a:
            r2 = r19
            com.ss.android.ugc.aweme.poi.model.ak r3 = r2.poiOwner
            java.lang.String r0 = r3.appendBusinessTime(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.model.PoiDetail.getEnterpriseBusinessTime(java.lang.String[], java.lang.String):java.lang.String");
    }
}
