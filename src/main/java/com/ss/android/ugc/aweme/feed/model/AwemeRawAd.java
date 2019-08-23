package com.ss.android.ugc.aweme.feed.model;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.constants.Constants;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.model.OmVast;
import com.ss.android.ugc.aweme.commercialize.model.a;
import com.ss.android.ugc.aweme.commercialize.model.c;
import com.ss.android.ugc.aweme.commercialize.model.h;
import com.ss.android.ugc.aweme.commercialize.model.k;
import com.ss.android.ugc.aweme.commercialize.model.m;
import com.ss.android.ugc.aweme.music.model.Music;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AwemeRawAd implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("ad_id")
    Long adId;
    @SerializedName("ad_more_textual")
    private String adMoreTextual;
    @SerializedName("play_node_track_url")
    List<a> adNodeTrackUrlList;
    @SerializedName("ad_poi_control")
    boolean adPoiControl;
    @SerializedName("ad_tag_position")
    private int adTagPosition;
    @SerializedName("top_icon_list")
    UrlModel adTopIcon;
    @SerializedName("aggregation_sdk")
    AggregationSdk aggregationSdk;
    @SerializedName("allow_dsp_autojump")
    private boolean allowDspAutoJump;
    @SerializedName("animation_type")
    private int animationType;
    @SerializedName("app_category")
    String appCategory;
    @SerializedName("app_install")
    String appInstall = "";
    @SerializedName("app_like")
    String appLike;
    @SerializedName("app_name")
    String appName = "";
    @SerializedName("avatar_icon")
    UrlModel avatarIcon;
    @SerializedName("button_style")
    int buttonStyle;
    @SerializedName("button_text")
    String buttonText;
    @SerializedName("card_infos")
    Map<String, CardStruct> cardInfos;
    @SerializedName("card_interaction_seconds")
    private int cardInteractionSeconds;
    @Expose(deserialize = false, serialize = false)
    boolean cardOnceClick;
    @SerializedName("click_track_url_list")
    UrlModel clickTrackUrlList;
    @SerializedName("comment_area")
    private c commentArea;
    @SerializedName("comment_area_switch")
    private boolean commentAreaSwitch;
    @SerializedName("consult_url")
    String consultUrl;
    @SerializedName("context_track_url_list")
    private UrlModel contextTrack;
    private transient boolean contextTrackSent;
    @SerializedName("creative_id")
    Long creativeId;
    @SerializedName("description")
    String description;
    @SerializedName("disable_show_ad_link")
    boolean disableAdLink;
    @SerializedName("disable_ad_show_filter")
    boolean disableAdShowFilter;
    @SerializedName("disable_auto_track_click")
    boolean disableAutoTrackClick;
    @SerializedName("disable_download_dialog")
    int disableDownloadDialog = 1;
    @SerializedName("disable_authorpage_button")
    private boolean disableUserprofileAdLabel;
    @SerializedName("display_type")
    Long displayType;
    @SerializedName("link_data")
    private h douPlusLinkData;
    @SerializedName("download_url")
    String downloadUrl;
    @SerializedName("effective_play_time")
    Float effectivePlayTime;
    @SerializedName("effective_play_track_url_list")
    UrlModel effectivePlayTrackUrlList;
    @SerializedName("enable_filter_same_video")
    private boolean enableFilterSameVideo = true;
    @SerializedName("expire_seconds")
    Long expireSeconds;
    @SerializedName("extra_effective_play_action")
    private int extraEffectivePlayAction;
    @SerializedName("feature_label")
    String featureLabel;
    @SerializedName("form_height")
    private int formHeight;
    @SerializedName("form_url")
    private String formUrl;
    @SerializedName("form_width")
    private int formWidth;
    @SerializedName("group_id")
    Long groupId;
    @SerializedName("hide_if_exists")
    int hideIfExists;
    @SerializedName("homepage_bottom_textual")
    private String homepageBottomTextual;
    @SerializedName("icon_image_list")
    private List<UrlModel> iconImageList;
    @SerializedName("image_list")
    List<UrlModel> imageList;
    @SerializedName("instance_phone_id")
    private long instancePhoneId;
    @SerializedName("interaction_seconds")
    int interactionSeconds;
    @SerializedName("is_dsp")
    private boolean isDsp;
    @SerializedName("is_preview")
    boolean isPreview;
    @SerializedName("js_actlog_url")
    private String jsActLogUrl;
    @SerializedName("label")
    private AwemeTextLabelModel label;
    @SerializedName("learn_more_bg_color")
    private String learnMoreBgColor;
    @SerializedName("log_extra")
    String logExtra;
    @SerializedName("download_mode")
    int mDownloadMode;
    @SerializedName("auto_open")
    int mLinkMode;
    @SerializedName("support_multiple")
    int mSupportMultiple;
    @SerializedName("mask_form_style")
    int maskFormStyle;
    @SerializedName("mp_url")
    private String microAppUrl;
    @SerializedName("music")
    private Music music;
    @SerializedName("native_card_info")
    private k nativeCardInfo;
    @SerializedName("native_card_type")
    int nativeCardType;
    @SerializedName("vast")
    OmVast omVast;
    @SerializedName("open_url")
    String openUrl;
    @SerializedName("origin_price")
    String originPrice;
    @SerializedName("package")
    String packageName;
    private String pageFrom = "";
    @SerializedName("phone_key")
    private String phoneKey;
    @SerializedName("phone_number")
    private String phoneNumber;
    @SerializedName("playover_track_url_list")
    UrlModel playOverTrackUrlList;
    @SerializedName("play_track_url_list")
    UrlModel playTrackUrlList;
    @SerializedName("playback_seconds_track_url")
    private List<m> playbackSecondsTrackList = new ArrayList();
    @SerializedName("pop_ups")
    private boolean popUps;
    @SerializedName("preload_data")
    private com.ss.android.ugc.aweme.commercialize.feed.b.c preloadData;
    @SerializedName("preload_web")
    private int preloadWeb;
    @SerializedName("price")
    String price;
    @SerializedName("promotion_label")
    String promotionLabel;
    @SerializedName("quick_app_url")
    String quickAppUrl;
    @SerializedName("red_open_url")
    private String redOpenUrl;
    @SerializedName("red_url")
    private String redUrl;
    @SerializedName("report_enable")
    boolean reportEnable;
    @SerializedName("schema_name")
    String schemaName;
    @SerializedName("show_ad_after_interaction")
    boolean showAdAfterInteraction;
    @SerializedName("show_avatar_link_icon")
    boolean showAvatarLink;
    @SerializedName("show_button_color_seconds")
    int showButtonColorSeconds;
    @SerializedName("show_button_seconds")
    private int showButtonSeconds;
    @SerializedName("show_mask_times")
    private int showMaskTimes;
    @SerializedName("show_poi_deil_seconds")
    int showPoiDeilSeconds;
    @SerializedName("show_type")
    int showType;
    @SerializedName("slide_action")
    private int slideAction;
    @SerializedName("source")
    String source;
    @SerializedName("splash_info")
    private AwemeSplashInfo splashInfo;
    @SerializedName("system_origin")
    int systemOrigin;
    @SerializedName("tips_type")
    int tipsType;
    @SerializedName("title")
    String title;
    @SerializedName("track_url_list")
    UrlModel trackUrlList;
    @SerializedName("type")
    String type;
    @SerializedName("use_default_color")
    boolean useDefaultColor;
    @SerializedName("use_ordinary_web")
    boolean useOrdinaryWeb = com.ss.android.g.a.a();
    @SerializedName("video_transpose")
    Long videoTranspose;
    @SerializedName("web_title")
    String webTitle;
    @SerializedName("web_type")
    int webType;
    @SerializedName("web_url")
    String webUrl;

    private void vastFromXml() {
    }

    public Long getAdId() {
        return this.adId;
    }

    public String getAdMoreTextual() {
        return this.adMoreTextual;
    }

    public List<a> getAdNodeTrackUrlList() {
        return this.adNodeTrackUrlList;
    }

    public int getAdTagPosition() {
        return this.adTagPosition;
    }

    public UrlModel getAdTopIcon() {
        return this.adTopIcon;
    }

    public AggregationSdk getAggregationSdk() {
        return this.aggregationSdk;
    }

    public int getAnimationType() {
        return this.animationType;
    }

    public String getAppInstall() {
        return this.appInstall;
    }

    public String getAppName() {
        return this.appName;
    }

    public UrlModel getAvatarIcon() {
        return this.avatarIcon;
    }

    public int getButtonStyle() {
        return this.buttonStyle;
    }

    public String getButtonText() {
        return this.buttonText;
    }

    public Map<String, CardStruct> getCardInfos() {
        return this.cardInfos;
    }

    public int getCardInteractionSeconds() {
        return this.cardInteractionSeconds;
    }

    public UrlModel getClickTrackUrlList() {
        return this.clickTrackUrlList;
    }

    public c getCommentArea() {
        return this.commentArea;
    }

    public String getConsultUrl() {
        return this.consultUrl;
    }

    public UrlModel getContextTrack() {
        return this.contextTrack;
    }

    public Long getCreativeId() {
        return this.creativeId;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean getDisableAutoTrackClick() {
        return this.disableAutoTrackClick;
    }

    public Long getDisplayType() {
        return this.displayType;
    }

    public h getDouPlusLinkData() {
        return this.douPlusLinkData;
    }

    public int getDownloadMode() {
        return this.mDownloadMode;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public UrlModel getEffectivePlayTrackUrlList() {
        return this.effectivePlayTrackUrlList;
    }

    public Long getExpireSeconds() {
        return this.expireSeconds;
    }

    public String getFeatureLabel() {
        return this.featureLabel;
    }

    public int getFormHeight() {
        return this.formHeight;
    }

    public String getFormUrl() {
        return this.formUrl;
    }

    public int getFormWidth() {
        return this.formWidth;
    }

    public Long getGroupId() {
        return this.groupId;
    }

    public List<UrlModel> getIconImageList() {
        return this.iconImageList;
    }

    public List<UrlModel> getImageList() {
        return this.imageList;
    }

    public long getInstancePhoneId() {
        return this.instancePhoneId;
    }

    public int getInteractionSeconds() {
        return this.interactionSeconds;
    }

    public String getJsActLogUrl() {
        return this.jsActLogUrl;
    }

    public AwemeTextLabelModel getLabel() {
        return this.label;
    }

    public String getLearnMoreBgColor() {
        return this.learnMoreBgColor;
    }

    public int getLinkMode() {
        return this.mLinkMode;
    }

    public String getLogExtra() {
        return this.logExtra;
    }

    public int getMaskFormStyle() {
        return this.maskFormStyle;
    }

    public String getMicroAppUrl() {
        return this.microAppUrl;
    }

    public Music getMusic() {
        return this.music;
    }

    public k getNativeCardInfo() {
        return this.nativeCardInfo;
    }

    @Constants.AdMaskType
    public int getNativeCardType() {
        return this.nativeCardType;
    }

    public OmVast getOmVast() {
        return this.omVast;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getOriginPrice() {
        return this.originPrice;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getPageFrom() {
        return this.pageFrom;
    }

    public String getPhoneKey() {
        return this.phoneKey;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public UrlModel getPlayOverTrackUrlList() {
        return this.playOverTrackUrlList;
    }

    public UrlModel getPlayTrackUrlList() {
        return this.playTrackUrlList;
    }

    public List<m> getPlaybackSecondsTrackList() {
        return this.playbackSecondsTrackList;
    }

    public com.ss.android.ugc.aweme.commercialize.feed.b.c getPreloadData() {
        return this.preloadData;
    }

    public int getPreloadWeb() {
        return this.preloadWeb;
    }

    public String getPrice() {
        return this.price;
    }

    public String getPromotionLabel() {
        return this.promotionLabel;
    }

    public String getQuickAppUrl() {
        return this.quickAppUrl;
    }

    public String getRedOpenUrl() {
        return this.redOpenUrl;
    }

    public String getRedUrl() {
        return this.redUrl;
    }

    public String getSchemaName() {
        return this.schemaName;
    }

    public boolean getShowAvatarLink() {
        return this.showAvatarLink;
    }

    public int getShowButtonColorSeconds() {
        return this.showButtonColorSeconds;
    }

    public int getShowButtonSeconds() {
        return this.showButtonSeconds;
    }

    public int getShowMaskTimes() {
        return this.showMaskTimes;
    }

    public int getSlideAction() {
        return this.slideAction;
    }

    public String getSource() {
        return this.source;
    }

    public AwemeSplashInfo getSplashInfo() {
        return this.splashInfo;
    }

    public int getSystemOrigin() {
        return this.systemOrigin;
    }

    public int getTipsType() {
        return this.tipsType;
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

    public Long getVideoTranspose() {
        return this.videoTranspose;
    }

    public String getWebTitle() {
        return this.webTitle;
    }

    public int getWebType() {
        return this.webType;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public boolean isAdPoiControl() {
        return this.adPoiControl;
    }

    public boolean isAllowDspAutoJump() {
        return this.allowDspAutoJump;
    }

    public boolean isCardOnceClick() {
        return this.cardOnceClick;
    }

    public boolean isCommentAreaSwitch() {
        return this.commentAreaSwitch;
    }

    public boolean isContextTrackSent() {
        return this.contextTrackSent;
    }

    public boolean isDiableAdShowFilter() {
        return this.disableAdShowFilter;
    }

    public boolean isDisableAdLink() {
        return this.disableAdLink;
    }

    public boolean isDisableUserprofileAdLabel() {
        return this.disableUserprofileAdLabel;
    }

    public boolean isDsp() {
        return this.isDsp;
    }

    public boolean isEnableFilterSameVideo() {
        return this.enableFilterSameVideo;
    }

    public boolean isPopUps() {
        return this.popUps;
    }

    public boolean isPreview() {
        return this.isPreview;
    }

    public boolean isReportEnable() {
        return this.reportEnable;
    }

    public boolean isShowAdAfterInteraction() {
        return this.showAdAfterInteraction;
    }

    public boolean isUseDefaultColor() {
        return this.useDefaultColor;
    }

    public boolean isUseOrdinaryWeb() {
        return this.useOrdinaryWeb;
    }

    public boolean allowJumpToPlayStore() {
        if (this.slideAction == 1) {
            return true;
        }
        return false;
    }

    public int getShowPoiMillisecond() {
        return this.showPoiDeilSeconds * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
    }

    public boolean isDisableDownloadDialog() {
        if (this.disableDownloadDialog == 1) {
            return true;
        }
        return false;
    }

    public boolean isHideIfExists() {
        if (this.hideIfExists == 1) {
            return true;
        }
        return false;
    }

    public boolean isNewStyleAd() {
        if (this.showType == 1) {
            return true;
        }
        return false;
    }

    public boolean isSupportMultiple() {
        if (this.mSupportMultiple > 0) {
            return true;
        }
        return false;
    }

    public boolean useEffectivePlayAction() {
        if (this.extraEffectivePlayAction == 1) {
            return true;
        }
        return false;
    }

    public String[] getAppCategory() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41429, new Class[0], String[].class)) {
            return (String[]) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41429, new Class[0], String[].class);
        } else if (TextUtils.isEmpty(this.appCategory)) {
            return new String[0];
        } else {
            return this.appCategory.split(" ");
        }
    }

    public float getAppLike() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41440, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41440, new Class[0], Float.TYPE)).floatValue();
        } else if (TextUtils.isEmpty(this.appLike)) {
            return 0.0f;
        } else {
            return Float.parseFloat(this.appLike);
        }
    }

    public String getCreativeIdStr() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41432, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41432, new Class[0], String.class);
        } else if (this.creativeId == null) {
            return null;
        } else {
            return this.creativeId.toString();
        }
    }

    public String getHomepageBottomTextual() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41435, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41435, new Class[0], String.class);
        } else if (TextUtils.isEmpty(this.homepageBottomTextual)) {
            return com.ss.android.ugc.aweme.app.k.a().getString(C0906R.string.bz);
        } else {
            return this.homepageBottomTextual;
        }
    }

    public UrlModel getRedImageUrl() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41431, new Class[0], UrlModel.class)) {
            return (UrlModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41431, new Class[0], UrlModel.class);
        } else if (CollectionUtils.isEmpty(this.iconImageList)) {
            return null;
        } else {
            return this.iconImageList.get(0);
        }
    }

    public boolean isAppAd() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41437, new Class[0], Boolean.TYPE)) {
            return isTypeOf(PushConstants.EXTRA_APPLICATION_PENDING_INTENT);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41437, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean isImageValid() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41438, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41438, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.imageList != null && !this.imageList.isEmpty()) {
            z = true;
        }
        return z;
    }

    public CardStruct getDefaultCardInfo() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41430, new Class[0], CardStruct.class)) {
            return (CardStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41430, new Class[0], CardStruct.class);
        } else if (this.cardInfos == null || !this.cardInfos.containsKey("3")) {
            return null;
        } else {
            return this.cardInfos.get("3");
        }
    }

    public Float getEffectivePlayTime() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41434, new Class[0], Float.class)) {
            return (Float) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41434, new Class[0], Float.class);
        } else if (this.effectivePlayTime == null || this.effectivePlayTime.floatValue() <= 0.001f) {
            return Float.valueOf(3.0f);
        } else {
            return this.effectivePlayTime;
        }
    }

    public boolean isClickTrackUrlListValid() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41439, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41439, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!(this.clickTrackUrlList == null || this.clickTrackUrlList.getUrlList() == null || this.clickTrackUrlList.getUrlList().isEmpty())) {
            z = true;
        }
        return z;
    }

    public boolean isRightStyle() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41441, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41441, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (getAdTagPosition() == 2 && this.label != null && !TextUtils.isEmpty(this.label.getLabelName())) {
            z = true;
        }
        return z;
    }

    public void setAdId(Long l) {
        this.adId = l;
    }

    public void setAdMoreTextual(String str) {
        this.adMoreTextual = str;
    }

    public void setAdTagPosition(int i) {
        this.adTagPosition = i;
    }

    public void setAdTopIcon(UrlModel urlModel) {
        this.adTopIcon = urlModel;
    }

    public void setAllowDspAutoJump(boolean z) {
        this.allowDspAutoJump = z;
    }

    public void setAnimationType(int i) {
        this.animationType = i;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setAvatarIcon(UrlModel urlModel) {
        this.avatarIcon = urlModel;
    }

    public void setButtonStyle(int i) {
        this.buttonStyle = i;
    }

    public void setButtonText(String str) {
        this.buttonText = str;
    }

    public void setCardOnceClick(boolean z) {
        this.cardOnceClick = z;
    }

    public void setClickTrackUrlList(UrlModel urlModel) {
        this.clickTrackUrlList = urlModel;
    }

    public void setCommentArea(c cVar) {
        this.commentArea = cVar;
    }

    public void setCommentAreaSwitch(boolean z) {
        this.commentAreaSwitch = z;
    }

    public void setContextTrack(UrlModel urlModel) {
        this.contextTrack = urlModel;
    }

    public void setContextTrackSent(boolean z) {
        this.contextTrackSent = z;
    }

    public void setCreativeId(Long l) {
        this.creativeId = l;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDiableAdShowFilter(boolean z) {
        this.disableAdShowFilter = z;
    }

    public void setDisableAdLink(boolean z) {
        this.disableAdLink = z;
    }

    public void setDisableDownloadDialog(int i) {
        this.disableDownloadDialog = i;
    }

    public void setDisableUserprofileAdLabel(boolean z) {
        this.disableUserprofileAdLabel = z;
    }

    public void setDisplayType(Long l) {
        this.displayType = l;
    }

    public void setDownloadMode(int i) {
        this.mDownloadMode = i;
    }

    public void setDownloadUrl(String str) {
        this.downloadUrl = str;
    }

    public void setDsp(boolean z) {
        this.isDsp = z;
    }

    public void setEffectivePlayTrackUrlList(UrlModel urlModel) {
        this.effectivePlayTrackUrlList = urlModel;
    }

    public void setEnableFilterSameVideo(boolean z) {
        this.enableFilterSameVideo = z;
    }

    public void setExpireSeconds(Long l) {
        this.expireSeconds = l;
    }

    public void setFeatureLabel(String str) {
        this.featureLabel = str;
    }

    public void setFormHeight(int i) {
        this.formHeight = i;
    }

    public void setFormUrl(String str) {
        this.formUrl = str;
    }

    public void setFormWidth(int i) {
        this.formWidth = i;
    }

    public void setGroupId(Long l) {
        this.groupId = l;
    }

    public void setHideIfExists(boolean z) {
        this.hideIfExists = z ? 1 : 0;
    }

    public void setHomepageBottomTextual(String str) {
        this.homepageBottomTextual = str;
    }

    public void setIconImageList(List<UrlModel> list) {
        this.iconImageList = list;
    }

    public void setImageList(List<UrlModel> list) {
        this.imageList = list;
    }

    public void setJsActLogUrl(String str) {
        this.jsActLogUrl = str;
    }

    public void setLabel(AwemeTextLabelModel awemeTextLabelModel) {
        this.label = awemeTextLabelModel;
    }

    public void setLearnMoreBgColor(String str) {
        this.learnMoreBgColor = str;
    }

    public void setLinkMode(int i) {
        this.mLinkMode = i;
    }

    public void setLogExtra(String str) {
        this.logExtra = str;
    }

    public void setMaskFormStyle(int i) {
        this.maskFormStyle = i;
    }

    public void setMicroAppUrl(String str) {
        this.microAppUrl = str;
    }

    public void setMusic(Music music2) {
        this.music = music2;
    }

    public void setOmVast(OmVast omVast2) {
        this.omVast = omVast2;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setOriginPrice(String str) {
        this.originPrice = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setPageFrom(String str) {
        this.pageFrom = str;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public void setPlayOverTrackUrlList(UrlModel urlModel) {
        this.playOverTrackUrlList = urlModel;
    }

    public void setPlayTrackUrlList(UrlModel urlModel) {
        this.playTrackUrlList = urlModel;
    }

    public void setPopUps(boolean z) {
        this.popUps = z;
    }

    public void setPreloadData(com.ss.android.ugc.aweme.commercialize.feed.b.c cVar) {
        this.preloadData = cVar;
    }

    public void setPreloadWeb(int i) {
        this.preloadWeb = i;
    }

    public void setPreview(boolean z) {
        this.isPreview = z;
    }

    public void setPrice(String str) {
        this.price = str;
    }

    public void setRedUrl(String str) {
        this.redUrl = str;
    }

    public void setShowAdAfterInteraction(boolean z) {
        this.showAdAfterInteraction = z;
    }

    public void setShowAvatarLink(boolean z) {
        this.showAvatarLink = z;
    }

    public void setShowButtonSeconds(int i) {
        this.showButtonSeconds = i;
    }

    public void setShowMaskTimes(int i) {
        this.showMaskTimes = i;
    }

    public void setSlideAction(int i) {
        this.slideAction = i;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setSplashInfo(AwemeSplashInfo awemeSplashInfo) {
        this.splashInfo = awemeSplashInfo;
    }

    public void setSupportMultiple(int i) {
        this.mSupportMultiple = i;
    }

    public void setSystemOrigin(int i) {
        this.systemOrigin = i;
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

    public void setVideoTranspose(Long l) {
        this.videoTranspose = l;
    }

    public void setWebTitle(String str) {
        this.webTitle = str;
    }

    public void setWebType(int i) {
        this.webType = i;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }

    public boolean isTypeOf(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 41436, new Class[]{String.class}, Boolean.TYPE)) {
            return TextUtils.equals(this.type, str2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 41436, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    public boolean checkHide(String str) {
        String str2 = str;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 41433, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 41433, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        if (!isHideIfExists() || !isAppAd() || !ToolUtils.isInstalledApp((Context) com.ss.android.ugc.aweme.app.k.a(), this.packageName)) {
            z = false;
        } else {
            com.ss.android.ugc.aweme.app.k a2 = com.ss.android.ugc.aweme.app.k.a();
            if (PatchProxy.isSupport(new Object[]{a2, this, str2}, null, g.f39316a, true, 31708, new Class[]{Context.class, AwemeRawAd.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{a2, this, str2}, null, g.f39316a, true, 31708, new Class[]{Context.class, AwemeRawAd.class, String.class}, Void.TYPE);
            } else if (g.e((Context) a2, this) && !TextUtils.isEmpty(str)) {
                g.a((Context) a2, str2, "hide_app", g.e((Context) a2, this, "ad hide app event"), this);
            }
        }
        return z;
    }
}
