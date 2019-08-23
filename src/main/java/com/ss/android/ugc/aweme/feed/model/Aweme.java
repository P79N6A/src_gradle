package com.ss.android.ugc.aweme.feed.model;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.api.h;
import com.ss.android.ugc.aweme.app.constants.Constants;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.commerce.service.models.e;
import com.ss.android.ugc.aweme.commerce.service.models.q;
import com.ss.android.ugc.aweme.commerce.service.models.x;
import com.ss.android.ugc.aweme.commercialize.model.c;
import com.ss.android.ugc.aweme.commercialize.model.g;
import com.ss.android.ugc.aweme.commercialize.model.j;
import com.ss.android.ugc.aweme.commercialize.utils.am;
import com.ss.android.ugc.aweme.commercialize.utils.s;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.feed.model.xigua.XiGuaTaskStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.miniapp_api.model.f;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.opensdk.a.a;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.IShortVideoConfig;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.model.d;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import com.ss.android.ugc.aweme.utils.cb;
import com.ss.android.ugc.aweme.utils.u;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@Keep
public class Aweme implements h, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_pendant")
    public e activityPendant;
    @SerializedName("ad_aweme_source")
    @Constants.AdAwemeSource
    public int adAwemeSource;
    @SerializedName("ad_link_type")
    public int adLinkType;
    @SerializedName("ad_order_id")
    public String adOrderId;
    @SerializedName("ad_schedule")
    public String adSchedule;
    @SerializedName("aweme_id")
    public String aid;
    @SerializedName("author")
    public User author;
    @SerializedName("aweme_control")
    public AwemeControl awemeControl = new AwemeControl();
    public int awemePosition = -1;
    @SerializedName("raw_ad_data")
    public AwemeRawAd awemeRawAd;
    @SerializedName("risk_infos")
    public AwemeRiskModel awemeRiskModel;
    @SerializedName("aweme_type")
    public int awemeType;
    @SerializedName("can_play")
    public boolean canPlay = true;
    @SerializedName("cha_list")
    public List<Challenge> challengeList;
    @SerializedName("cmt_swt")
    public boolean cmtSwt;
    @SerializedName("collect_stat")
    public int collectStatus;
    @SerializedName("item_comment_settings")
    public int commentSetting;
    @SerializedName("commerce_config_data")
    public List<CommerceConfigData> commerceConfigDataList;
    @SerializedName("commerce_sticker_info")
    public g commerceStickerInfo;
    @SerializedName("create_time")
    public long createTime;
    public long date;
    @SerializedName("desc")
    public String desc;
    @SerializedName("desc_language")
    public String descLanguage;
    @SerializedName("descendants")
    public DescendantsModel descendantsModel;
    @SerializedName("distance")
    public String distance;
    @SerializedName("distribute_type")
    public int distributeType;
    @SerializedName("without_watermark")
    public boolean downloadWithoutWatermark;
    @SerializedName("item_duet")
    public int duetSetting;
    public CharSequence ellipsizeDesc;
    @SerializedName("enable_top_view")
    public boolean enableTopView = true;
    @SerializedName("extra")
    public String extra;
    public long feedCount;
    @SerializedName("floating_card_content")
    public FloatingCardInfo floatingCardInfo;
    @SerializedName("forward_comment_id")
    public String forwardCommentId;
    @SerializedName("forward_item")
    public Aweme forwardItem;
    @SerializedName("forward_item_id")
    public String forwardItemId;
    @SerializedName("game_info")
    public GameInfo gameInfo;
    @SerializedName("hot_info")
    public HotSearchInfo hotSearchInfo;
    @SerializedName("image_infos")
    public List<ImageInfo> imageInfos;
    @SerializedName("interaction_stickers")
    public List<InteractStickerStruct> interactStickerStructs;
    @SerializedName("is_ads")
    public boolean isAd;
    public boolean isCanCache = true;
    @SerializedName("is_effect_designer")
    public boolean isEffectDesigner;
    public boolean isFakeResponse;
    @SerializedName("is_hash_tag")
    public int isHashTag;
    @SerializedName("is_pgcshow")
    public boolean isPgcShow;
    public boolean isPreloadScroll;
    @SerializedName("is_prohibited")
    public boolean isProhibited;
    @SerializedName("is_relieve")
    public boolean isRelieve;
    @SerializedName("is_top")
    @Deprecated
    public int isTop;
    @SerializedName("is_vr")
    public boolean isVr;
    @SerializedName("label_large")
    public UrlModel labelLarge;
    @SerializedName("label_private")
    public UrlModel labelPrivate;
    @SerializedName("label_thumb")
    public UrlModel labelThumb;
    @SerializedName("label_top")
    public UrlModel labelTop;
    @SerializedName("landing_page")
    public String landingPage;
    @SerializedName("law_critical_country")
    public boolean lawCriticalCountry;
    @SerializedName("link_ad_data")
    @JsonAdapter(StringJsonAdapterFactory.class)
    public j linkAdData;
    @SerializedName("long_video")
    public List<LongVideo> longVideos;
    public int mConcatAndUploadState;
    @SerializedName("label_music_starter_text")
    public String mLabelMusicStarterText;
    @SerializedName("label_origin_author_text")
    public String mLabelOriginAuthorText;
    @SerializedName("micro_app_info")
    public f microAppInfo;
    @SerializedName("music")
    public Music music;
    @SerializedName("label_music_starter")
    public UrlModel musicStarter;
    @SerializedName("nickname_position")
    public List<Position> nicknamePosition;
    @SerializedName("open_platform_name")
    public String openPlatformName;
    @SerializedName("open_platform_info")
    public a openPlatformStruct;
    @SerializedName("label_origin_author")
    public UrlModel originAuthor;
    @SerializedName("origin_comment_ids")
    public List<String> originCommentIds;
    public int originalPos;
    @SerializedName("poi_info")
    public PoiStruct poiStruct;
    @SerializedName("position")
    public List<Position> position;
    @SerializedName("pre_forward_id")
    public String preForwardId;
    @SerializedName("preload")
    public Preload preload;
    @SerializedName("prevent_download")
    public boolean preventDownload;
    @SerializedName("promotion_other_info")
    public q promotionOtherInfo;
    @SerializedName("rate")
    public int rate = -1;
    @SerializedName("react_from")
    public String reactFrom;
    @SerializedName("react_origin")
    public String reactOrigin;
    @SerializedName("item_react")
    public int reactSetting;
    @SerializedName("react_view")
    public String reactView;
    @SerializedName("region")
    public String region;
    @SerializedName("relation_label")
    public RelationDynamicLabel relationLabel;
    public String repostFromGroupId;
    public String repostFromUserId;
    public String requestId;
    @SerializedName("room")
    public RoomStruct room;
    @SerializedName("scenario")
    public int scenario;
    @SerializedName("share_info")
    public ShareInfo shareInfo;
    @SerializedName("share_url")
    public String shareUrl;
    public List<x> simplePromotions;
    @SerializedName("simple_promotions")
    public String simplePromotionsString = "";
    @SerializedName("sp_sticker")
    public SpecialSticker specialSticker;
    @SerializedName("star_atlas_info")
    public AwemeStarAtlas starAtlasInfo;
    @SerializedName("star_atlas_order_id")
    public long starAtlasOrderId;
    @SerializedName("star_recommend_tag")
    public String starRecommendTag;
    @SerializedName("statistics")
    public AwemeStatistics statistics;
    @SerializedName("status")
    public AwemeStatus status;
    @SerializedName("sticker_detail")
    public d stickerEntranceInfo;
    @SerializedName("stickers")
    public String stickerIDs;
    @SerializedName("stream_url")
    public StreamUrlModel streamUrlModel;
    @SerializedName("take_down_desc")
    public String takeDownDesc;
    @SerializedName("take_down_reason")
    public int takeDownReason;
    @SerializedName("text_extra")
    public List<TextExtraStruct> textExtra;
    @SerializedName("label_top_text")
    public List<AwemeTextLabelModel> textTopLabels;
    @SerializedName("video_text")
    public List<AwemeTextLabelModel> textVideoLabels;
    @SerializedName("title")
    public String title;
    @SerializedName("uniqid_position")
    public List<Position> uniqidPosition;
    @SerializedName("misc_info")
    public String uploadMiscInfoStructStr;
    @SerializedName("user_digged")
    public int userDigg;
    @SerializedName("video")
    public Video video;
    @SerializedName("video_control")
    public VideoControl videoControl;
    @SerializedName("video_labels")
    public List<AwemeLabelModel> videoLabels;
    @SerializedName("with_promotional_music")
    public boolean withPromotionalMusic;
    @SerializedName("xigua_task")
    public XiGuaTaskStruct xiGuaTask;

    public interface ConcatAndUploadState {
    }

    public e getActivityPendant() {
        return this.activityPendant;
    }

    @Constants.AdAwemeSource
    public int getAdAwemeSource() {
        return this.adAwemeSource;
    }

    public String getAdOrderId() {
        return this.adOrderId;
    }

    public String getAdSchedule() {
        return this.adSchedule;
    }

    public String getAid() {
        return this.aid;
    }

    public User getAuthor() {
        return this.author;
    }

    public int getAwemePosition() {
        return this.awemePosition;
    }

    @Nullable
    public AwemeRawAd getAwemeRawAd() {
        return this.awemeRawAd;
    }

    public AwemeRiskModel getAwemeRiskModel() {
        return this.awemeRiskModel;
    }

    public int getAwemeType() {
        return this.awemeType;
    }

    public boolean getCanCache() {
        return this.isCanCache;
    }

    public List<Challenge> getChallengeList() {
        return this.challengeList;
    }

    public int getCollectStatus() {
        return this.collectStatus;
    }

    public int getCommentSetting() {
        return this.commentSetting;
    }

    public List<CommerceConfigData> getCommerceConfigDataList() {
        return this.commerceConfigDataList;
    }

    public g getCommerceStickerInfo() {
        return this.commerceStickerInfo;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public long getDate() {
        return this.date;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getDescLanguage() {
        return this.descLanguage;
    }

    public DescendantsModel getDescendantsModel() {
        return this.descendantsModel;
    }

    public String getDistance() {
        return this.distance;
    }

    public int getDistributeType() {
        return this.distributeType;
    }

    public int getDuetSetting() {
        return this.duetSetting;
    }

    public String getExtra() {
        return this.extra;
    }

    public long getFeedCount() {
        return this.feedCount;
    }

    public FloatingCardInfo getFloatingCardInfo() {
        return this.floatingCardInfo;
    }

    public String getForwardCommentId() {
        return this.forwardCommentId;
    }

    public Aweme getForwardItem() {
        return this.forwardItem;
    }

    public String getForwardItemId() {
        return this.forwardItemId;
    }

    public GameInfo getGameInfo() {
        return this.gameInfo;
    }

    public HotSearchInfo getHotSearchInfo() {
        return this.hotSearchInfo;
    }

    public List<ImageInfo> getImageInfos() {
        return this.imageInfos;
    }

    public List<InteractStickerStruct> getInteractStickerStructs() {
        return this.interactStickerStructs;
    }

    public boolean getIsPreloadScroll() {
        return this.isPreloadScroll;
    }

    @Deprecated
    public int getIsTop() {
        return this.isTop;
    }

    public UrlModel getLabelLarge() {
        return this.labelLarge;
    }

    public String getLabelMusicStarterText() {
        return this.mLabelMusicStarterText;
    }

    public String getLabelOriginAuthorText() {
        return this.mLabelOriginAuthorText;
    }

    public UrlModel getLabelPrivate() {
        return this.labelPrivate;
    }

    public UrlModel getLabelThumb() {
        return this.labelThumb;
    }

    public UrlModel getLabelTop() {
        return this.labelTop;
    }

    public String getLandingPage() {
        return this.landingPage;
    }

    public j getLinkAdData() {
        return this.linkAdData;
    }

    public List<LongVideo> getLongVideos() {
        return this.longVideos;
    }

    public f getMicroAppInfo() {
        return this.microAppInfo;
    }

    public Music getMusic() {
        return this.music;
    }

    public UrlModel getMusicStarter() {
        return this.musicStarter;
    }

    public List<Position> getNicknamePosition() {
        return this.nicknamePosition;
    }

    public String getOpenPlatformName() {
        return this.openPlatformName;
    }

    public a getOpenPlatformStruct() {
        return this.openPlatformStruct;
    }

    public UrlModel getOriginAuthor() {
        return this.originAuthor;
    }

    public List<String> getOriginCommentIds() {
        return this.originCommentIds;
    }

    public int getOriginalPos() {
        return this.originalPos;
    }

    public PoiStruct getPoiStruct() {
        return this.poiStruct;
    }

    public List<Position> getPosition() {
        return this.position;
    }

    public Preload getPreload() {
        return this.preload;
    }

    public q getPromotionOtherInfo() {
        return this.promotionOtherInfo;
    }

    public int getRate() {
        return this.rate;
    }

    public String getRawPromotion() {
        return this.simplePromotionsString;
    }

    public String getReactFrom() {
        return this.reactFrom;
    }

    public String getReactOrigin() {
        return this.reactOrigin;
    }

    public int getReactSetting() {
        return this.reactSetting;
    }

    public String getReactView() {
        return this.reactView;
    }

    public String getRegion() {
        return this.region;
    }

    public RelationDynamicLabel getRelationLabel() {
        return this.relationLabel;
    }

    public String getRepostFromGroupId() {
        return this.repostFromGroupId;
    }

    public String getRepostFromUserId() {
        return this.repostFromUserId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public RoomStruct getRoom() {
        return this.room;
    }

    public int getScenario() {
        return this.scenario;
    }

    public ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public SpecialSticker getSpecialSticker() {
        return this.specialSticker;
    }

    public AwemeStarAtlas getStarAtlasInfo() {
        return this.starAtlasInfo;
    }

    public long getStarAtlasOrderId() {
        return this.starAtlasOrderId;
    }

    public String getStarRecommendTag() {
        return this.starRecommendTag;
    }

    public AwemeStatistics getStatistics() {
        return this.statistics;
    }

    public AwemeStatus getStatus() {
        return this.status;
    }

    public d getStickerEntranceInfo() {
        return this.stickerEntranceInfo;
    }

    public String getStickerIDs() {
        return this.stickerIDs;
    }

    public StreamUrlModel getStreamUrlModel() {
        return this.streamUrlModel;
    }

    public String getTakeDownDesc() {
        return this.takeDownDesc;
    }

    public int getTakeDownReason() {
        return this.takeDownReason;
    }

    public List<TextExtraStruct> getTextExtra() {
        return this.textExtra;
    }

    public List<AwemeTextLabelModel> getTextTopLabels() {
        return this.textTopLabels;
    }

    public List<AwemeTextLabelModel> getTextVideoLabels() {
        return this.textVideoLabels;
    }

    public String getTitle() {
        return this.title;
    }

    public List<Position> getUniqidPosition() {
        return this.uniqidPosition;
    }

    public int getUserDigg() {
        return this.userDigg;
    }

    public Video getVideo() {
        return this.video;
    }

    public VideoControl getVideoControl() {
        return this.videoControl;
    }

    public List<AwemeLabelModel> getVideoLabels() {
        return this.videoLabels;
    }

    public XiGuaTaskStruct getXiGuaTask() {
        return this.xiGuaTask;
    }

    public boolean isCanPlay() {
        return this.canPlay;
    }

    public boolean isCmtSwt() {
        return this.cmtSwt;
    }

    public boolean isEffectDesigner() {
        return this.isEffectDesigner;
    }

    public boolean isEnableTopView() {
        return this.enableTopView;
    }

    public boolean isFakeResponse() {
        return this.isFakeResponse;
    }

    public boolean isLawCriticalCountry() {
        return this.lawCriticalCountry;
    }

    public boolean isPgcShow() {
        return this.isPgcShow;
    }

    public boolean isPreventDownload() {
        return this.preventDownload;
    }

    public boolean isRelieve() {
        return this.isRelieve;
    }

    public boolean isVr() {
        return this.isVr;
    }

    public boolean isWithPromotionalMusic() {
        return this.withPromotionalMusic;
    }

    public boolean hasStickerID() {
        if (this.stickerIDs != null) {
            return true;
        }
        return false;
    }

    public boolean isCollected() {
        if (this.collectStatus == 1) {
            return true;
        }
        return false;
    }

    public boolean isConcating() {
        if (this.mConcatAndUploadState == 1) {
            return true;
        }
        return false;
    }

    public boolean isHashTag() {
        if (this.isHashTag == 1) {
            return true;
        }
        return false;
    }

    public boolean isLike() {
        if (this.userDigg == 1) {
            return true;
        }
        return false;
    }

    public boolean isSupportGameChallenge() {
        if (this.gameInfo != null) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean isTop() {
        if (this.isTop == 1) {
            return true;
        }
        return false;
    }

    public boolean needPreloadAdLink() {
        if (this.adLinkType == 1) {
            return true;
        }
        return false;
    }

    public boolean isAd() {
        if (!this.isAd || this.awemeRawAd == null) {
            return false;
        }
        return true;
    }

    public boolean isForwardAweme() {
        if (this.awemeType == 13) {
            return true;
        }
        return false;
    }

    public boolean isImage() {
        if (this.awemeType == 2) {
            return true;
        }
        return false;
    }

    public boolean isLive() {
        if (this.awemeType == 101) {
            return true;
        }
        return false;
    }

    public boolean isUploadFailure() {
        if (this.mConcatAndUploadState == 3) {
            return true;
        }
        return false;
    }

    public boolean isUploading() {
        if (this.mConcatAndUploadState == 2) {
            return true;
        }
        return false;
    }

    public boolean isUserPost() {
        if (this.awemeType == 33 || this.adAwemeSource == 1) {
            return true;
        }
        return false;
    }

    private boolean commerceVideoTypeAllowDuetReact() {
        if (this.awemeType == 1 || this.awemeType == 29 || this.awemeType == 30 || this.awemeType == 32 || this.awemeType == 33 || this.awemeType == 201) {
            return true;
        }
        return false;
    }

    private boolean isDouyinGovMediaVip() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41411, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41411, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!com.ss.android.g.a.a() && this.author != null && this.author.isGovMediaVip()) {
            z = true;
        }
        return z;
    }

    @Nullable
    public c getAdCommentStruct() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41404, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41404, new Class[0], c.class);
        } else if (getAwemeRawAd() != null) {
            return getAwemeRawAd().getCommentArea();
        } else {
            return null;
        }
    }

    public String getAuthorUid() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41405, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41405, new Class[0], String.class);
        } else if (this.author != null) {
            return this.author.getUid();
        } else {
            return "";
        }
    }

    public AwemeControl getAwemeControl() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41420, new Class[0], AwemeControl.class)) {
            return (AwemeControl) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41420, new Class[0], AwemeControl.class);
        }
        if (this.awemeControl == null) {
            this.awemeControl = new AwemeControl();
        }
        return this.awemeControl;
    }

    public String getAwemeRawAdIdStr() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41393, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41393, new Class[0], String.class);
        } else if (this.awemeRawAd != null) {
            return this.awemeRawAd.getCreativeIdStr();
        } else {
            return "";
        }
    }

    public int getDownloadStatus() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41428, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41428, new Class[0], Integer.TYPE)).intValue();
        } else if (this.status == null) {
            return 0;
        } else {
            return this.status.getDownloadStatus();
        }
    }

    public CharSequence getEllipsizeDesc() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41373, new Class[0], CharSequence.class)) {
            return (CharSequence) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41373, new Class[0], CharSequence.class);
        } else if (TextUtils.isEmpty(this.ellipsizeDesc)) {
            return getDesc();
        } else {
            return this.ellipsizeDesc;
        }
    }

    public int getEnterpriseType() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41403, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41403, new Class[0], Integer.TYPE)).intValue();
        } else if (this.author == null) {
            return 0;
        } else {
            return this.author.getCommerceUserLevel();
        }
    }

    public String getForwardGroupId() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41419, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41419, new Class[0], String.class);
        } else if (isMultiForwardAweme()) {
            return this.preForwardId;
        } else {
            return "";
        }
    }

    @Nullable
    public x getPromotion() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41382, new Class[0], x.class)) {
            return (x) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41382, new Class[0], x.class);
        } else if (getPromotions().isEmpty()) {
            return null;
        } else {
            return getPromotions().get(0);
        }
    }

    @Nullable
    public List<String> getRawAdClickTrackUrlList() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41397, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41397, new Class[0], List.class);
        } else if (getAwemeRawAd() == null) {
            return null;
        } else {
            UrlModel clickTrackUrlList = getAwemeRawAd().getClickTrackUrlList();
            if (clickTrackUrlList == null) {
                return null;
            }
            return clickTrackUrlList.getUrlList();
        }
    }

    @Nullable
    public List<String> getRawAdEffectivePlayTrackUrlList() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41400, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41400, new Class[0], List.class);
        } else if (getAwemeRawAd() == null) {
            return null;
        } else {
            UrlModel effectivePlayTrackUrlList = getAwemeRawAd().getEffectivePlayTrackUrlList();
            if (effectivePlayTrackUrlList == null) {
                return null;
            }
            return effectivePlayTrackUrlList.getUrlList();
        }
    }

    @Nullable
    public List<String> getRawAdPlayOverTrackUrlList() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41401, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41401, new Class[0], List.class);
        } else if (getAwemeRawAd() == null) {
            return null;
        } else {
            UrlModel playOverTrackUrlList = getAwemeRawAd().getPlayOverTrackUrlList();
            if (playOverTrackUrlList == null) {
                return null;
            }
            return playOverTrackUrlList.getUrlList();
        }
    }

    @Nullable
    public List<String> getRawAdPlayTrackUrlList() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41398, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41398, new Class[0], List.class);
        } else if (getAwemeRawAd() == null) {
            return null;
        } else {
            UrlModel playTrackUrlList = getAwemeRawAd().getPlayTrackUrlList();
            if (playTrackUrlList == null) {
                return null;
            }
            return playTrackUrlList.getUrlList();
        }
    }

    @Nullable
    public List<String> getRawAdShowTrackUrlList() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41396, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41396, new Class[0], List.class);
        } else if (getAwemeRawAd() == null) {
            return null;
        } else {
            UrlModel trackUrlList = getAwemeRawAd().getTrackUrlList();
            if (trackUrlList == null) {
                return null;
            }
            return trackUrlList.getUrlList();
        }
    }

    public String getRecallType() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41379, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41379, new Class[0], String.class);
        } else if (this.promotionOtherInfo == null) {
            return "";
        } else {
            return this.promotionOtherInfo.getRecallReason();
        }
    }

    public com.ss.android.ugc.aweme.shortvideo.j getUploadMiscInfoStruct() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41422, new Class[0], com.ss.android.ugc.aweme.shortvideo.j.class)) {
            return com.ss.android.ugc.aweme.shortvideo.j.createStruct(this.uploadMiscInfoStructStr);
        }
        return (com.ss.android.ugc.aweme.shortvideo.j) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41422, new Class[0], com.ss.android.ugc.aweme.shortvideo.j.class);
    }

    public boolean hasPromotion() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41383, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41383, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (getPromotion() != null) {
            z = true;
        }
        return z;
    }

    public boolean hasValidPoi() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41372, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41372, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.poiStruct != null && !TextUtils.isEmpty(this.poiStruct.poiId)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41394, new Class[0], Integer.TYPE)) {
            return this.aid.hashCode();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41394, new Class[0], Integer.TYPE)).intValue();
    }

    public boolean isAppAd() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41390, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41390, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (isAd() && this.awemeRawAd.isAppAd()) {
            z = true;
        }
        return z;
    }

    public boolean isCanForceDownloadWithoutWatermark() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41426, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41426, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.downloadWithoutWatermark && u.f75965b.b(this)) {
            z = true;
        }
        return z;
    }

    public boolean isDelete() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41377, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41377, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.status != null && this.status.isDelete()) {
            z = true;
        }
        return z;
    }

    public boolean isHotSearchAweme() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41368, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41368, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.hotSearchInfo != null && !TextUtils.isEmpty(this.hotSearchInfo.getSentence())) {
            z = true;
        }
        return z;
    }

    public boolean isInReviewing() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41376, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41376, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.status != null && this.status.isInReviewing()) {
            z = true;
        }
        return z;
    }

    public boolean isOrderShareRecommend() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41380, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41380, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.promotionOtherInfo == null) {
            return false;
        } else {
            return this.promotionOtherInfo.isOrderShareRecommend();
        }
    }

    public boolean isPrivate() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41413, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41413, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.status == null || this.status.getPrivateStatus() != 1) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isProhibited() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41370, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41370, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.status != null && this.status.isProhibited()) {
            z = true;
        }
        return z;
    }

    public boolean isPublic() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41414, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41414, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.status != null && this.status.getPrivateStatus() == 0) {
            z = true;
        }
        return z;
    }

    public boolean isReviewed() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41375, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41375, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.status != null && this.status.isReviewed()) {
            z = true;
        }
        return z;
    }

    public boolean isSelfSee() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41371, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41371, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.status != null && this.status.isSelfSee()) {
            z = true;
        }
        return z;
    }

    public boolean withFakeUser() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41378, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41378, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.author == null || this.author.isAdFake()) {
            return true;
        } else {
            return false;
        }
    }

    private boolean canDuetVideoType() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41409, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41409, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.awemeType == 0 || this.awemeType == 51 || this.awemeType == 52 || this.awemeType == 54 || this.awemeType == 53 || commerceVideoTypeAllowDuetReact()) {
            return true;
        } else {
            return false;
        }
    }

    private boolean canReactVideoType() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41410, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41410, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.awemeType == 52 || this.awemeType == 0 || this.awemeType == 51 || this.awemeType == 54 || this.awemeType == 53 || commerceVideoTypeAllowDuetReact()) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isMultiForwardAweme() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41421, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41421, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (CollectionUtils.isEmpty(this.textExtra)) {
            return false;
        } else {
            for (TextExtraStruct type : this.textExtra) {
                if (type.getType() == 2) {
                    return true;
                }
            }
            return false;
        }
    }

    @Nullable
    public String getCommerceAdLikeDigg() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41374, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41374, new Class[0], String.class);
        }
        if (this.commerceConfigDataList != null && !this.commerceConfigDataList.isEmpty()) {
            for (CommerceConfigData next : this.commerceConfigDataList) {
                if (next.type == 1 && next.itemLikeEggData != null) {
                    return next.itemLikeEggData.materialUrl;
                }
            }
        }
        return null;
    }

    @Nullable
    public UrlModel getDynamicPreferredCover() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41425, new Class[0], UrlModel.class)) {
            return (UrlModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41425, new Class[0], UrlModel.class);
        } else if (this.video == null) {
            if (this.imageInfos == null || this.imageInfos.isEmpty()) {
                return null;
            }
            return this.imageInfos.get(0).labelThumb;
        } else if (this.video.dynamicCover != null) {
            return this.video.dynamicCover;
        } else {
            if (this.video.cover != null) {
                return this.video.cover;
            }
            return null;
        }
    }

    public String getFirstPlayAddr() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41389, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41389, new Class[0], String.class);
        }
        if (this.video != null) {
            VideoUrlModel properPlayAddr = this.video.getProperPlayAddr();
            if (properPlayAddr != null && !CollectionUtils.isEmpty(properPlayAddr.getUrlList())) {
                return properPlayAddr.getUrlList().get(0);
            }
        }
        return null;
    }

    public String getForwardUserId() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41418, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41418, new Class[0], String.class);
        }
        String str = "";
        if (!CollectionUtils.isEmpty(this.textExtra)) {
            Iterator<TextExtraStruct> it2 = this.textExtra.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                TextExtraStruct next = it2.next();
                if (next.getType() == 2) {
                    str = next.getUserId();
                    break;
                }
            }
        } else {
            str = "";
        }
        return str;
    }

    public String getFromGroupId() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41417, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41417, new Class[0], String.class);
        } else if (getAwemeType() != 13) {
            return getAid();
        } else {
            if (getForwardItem() != null) {
                return getForwardItem().getAid();
            }
            return getForwardItemId();
        }
    }

    public String getFromRequestId() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41416, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41416, new Class[0], String.class);
        } else if (getAwemeType() != 13) {
            return getRequestId();
        } else {
            if (getForwardItem() != null) {
                return getForwardItem().getRequestId();
            }
            return "";
        }
    }

    public String getFromUserId() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41415, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41415, new Class[0], String.class);
        } else if (getAwemeType() != 13) {
            return getAuthorUid();
        } else {
            if (getForwardItem() != null) {
                return getForwardItem().getAuthorUid();
            }
            return "";
        }
    }

    @NonNull
    public List<x> getPromotions() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41381, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41381, new Class[0], List.class);
        } else if (TextUtils.isEmpty(this.simplePromotionsString)) {
            if (this.simplePromotions == null) {
                this.simplePromotions = new ArrayList();
            }
            return this.simplePromotions;
        } else {
            if (this.simplePromotions == null) {
                try {
                    this.simplePromotions = cb.b(this.simplePromotionsString, x[].class);
                } catch (Exception unused) {
                    this.simplePromotions = new ArrayList();
                }
            }
            return this.simplePromotions;
        }
    }

    public boolean isBan() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41412, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41412, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (getMusic() != null && getMusic().getMusicStatus() == 0 && !am.e(this)) {
            z = true;
        }
        return z;
    }

    public boolean isHotVideoAweme() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41369, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41369, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.hotSearchInfo != null && this.hotSearchInfo.getVideoRank() > 0 && this.hotSearchInfo.getVideoRankVV() > 0) {
            z = true;
        }
        return z;
    }

    public boolean isShowCommerceCard() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41388, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41388, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!((Boolean) com.ss.android.ugc.aweme.app.x.a().N().c()).booleanValue() || getStatus() == null || !getStatus().isWithGoods() || getPromotions().size() <= 0 || !s.b() || !com.ss.android.ugc.aweme.commercialize.link.f.a("shopping_cart", this)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean canDuet() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41406, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41406, new Class[0], Boolean.TYPE)).booleanValue();
        }
        IShortVideoConfig shortVideoConfig = ((IAVService) ServiceManager.get().getService(IAVService.class)).shortVideoConfig();
        if (getVideo() == null || getVideo().getVideoLength() <= 0 || ((((long) getVideo().getVideoLength()) > shortVideoConfig.maxDuetVideoTime() && !isSupportGameChallenge()) || !canDuetVideoType() || this.isVr || this.duetSetting == 2 || isBan() || this.music == null || this.music.getPlayUrl() == null || this.music.getPlayUrl().getUrlList() == null || this.music.getPlayUrl().getUrlList().isEmpty() || ((com.ss.android.g.a.a() && this.withPromotionalMusic) || isDouyinGovMediaVip()))) {
            return false;
        }
        return true;
    }

    public boolean canReact() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41407, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41407, new Class[0], Boolean.TYPE)).booleanValue();
        }
        IShortVideoConfig shortVideoConfig = ((IAVService) ServiceManager.get().getService(IAVService.class)).shortVideoConfig();
        if (!((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().enableReact() || getVideo() == null || getVideo().getVideoLength() <= 0 || ((long) getVideo().getVideoLength()) > shortVideoConfig.maxDuetVideoTime() || !canReactVideoType() || this.isVr || this.reactSetting == 2 || isBan() || this.music == null || this.music.getPlayUrl() == null || this.music.getPlayUrl().getUrlList() == null || this.music.getPlayUrl().getUrlList().isEmpty() || ((com.ss.android.g.a.a() && this.withPromotionalMusic) || isDouyinGovMediaVip())) {
            return false;
        }
        return true;
    }

    public void convertChallengeToHashTag() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41424, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41424, new Class[0], Void.TYPE);
            return;
        }
        List<Challenge> challengeList2 = getChallengeList();
        if (challengeList2 != null && !challengeList2.isEmpty()) {
            Challenge challenge = challengeList2.get(0);
            if (challenge != null && !TextUtils.isEmpty(challenge.getChallengeName())) {
                StringBuilder sb = new StringBuilder("#");
                sb.append(challenge.getChallengeName());
                sb.append(" ");
                TextExtraStruct textExtraStruct = new TextExtraStruct();
                textExtraStruct.setType(1);
                textExtraStruct.setHashTagName(challenge.getChallengeName());
                textExtraStruct.setStart(0);
                textExtraStruct.setCid(challenge.getCid());
                textExtraStruct.setEnd(sb.length());
                if (getDesc() == null) {
                    str = "";
                } else {
                    str = getDesc();
                }
                if (!str.contains("#" + challenge.getChallengeName())) {
                    sb.append(getDesc());
                    setDesc(sb.toString());
                    int end = textExtraStruct.getEnd() - textExtraStruct.getStart();
                    for (TextExtraStruct next : getTextExtra()) {
                        next.setStart(next.getStart() + end);
                        next.setEnd(next.getEnd() + end);
                    }
                    getTextExtra().add(textExtraStruct);
                    setTextExtra(getTextExtra());
                }
            }
        }
    }

    public boolean isShowForwardEntrance() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41408, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41408, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.g.a.b() || !SharePrefCache.inst().isOpenForward() || getStatus() == null || getStatus().isDelete() || !getStatus().isAllowComment() || !getStatus().isAllowShare() || getStatus().getPrivateStatus() == 1 || getStatus().getPrivateStatus() == 2 || getAuthor() == null || getAuthor().isSecret() || isAd()) {
            return false;
        } else {
            return true;
        }
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41386, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41386, new Class[0], String.class);
        }
        return "Aweme{aid='" + this.aid + '\'' + ", desc='" + this.desc + '\'' + ", createTime=" + this.createTime + ", author=" + this.author + ", music=" + this.music + ", challengeList=" + this.challengeList + ", video=" + this.video + ", shareUrl='" + this.shareUrl + '\'' + ", userDigg=" + this.userDigg + ", statistics=" + this.statistics + ", status=" + this.status + ", extra='" + this.extra + '\'' + ", rate=" + this.rate + ", shareInfo=" + this.shareInfo + ", labelLarge=" + this.labelLarge + ", labelThumb=" + this.labelThumb + ", textExtra=" + this.textExtra + ", isTop=" + this.isTop + ", labelTop=" + this.labelTop + ", originalPos=" + this.originalPos + ", isAd=" + this.isAd + ", awemeType=" + this.awemeType + ", awemeRawAd=" + this.awemeRawAd + ", specialSticker=" + this.specialSticker + ", videoLabels=" + this.videoLabels + ", cmtSwt=" + this.cmtSwt + ", adSchedule=" + this.adSchedule + ", simplePromotions=" + this.simplePromotions + ", region=" + this.region + '}';
    }

    public void setAd(boolean z) {
        this.isAd = z;
    }

    public void setAdAwemeSource(@Constants.AdAwemeSource int i) {
        this.adAwemeSource = i;
    }

    public void setAdOrderId(String str) {
        this.adOrderId = str;
    }

    public void setAdSchedule(String str) {
        this.adSchedule = str;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setAuthor(User user) {
        this.author = user;
    }

    public void setAwemeControl(AwemeControl awemeControl2) {
        this.awemeControl = awemeControl2;
    }

    public void setAwemePosition(int i) {
        this.awemePosition = i;
    }

    public void setAwemeRawAd(AwemeRawAd awemeRawAd2) {
        this.awemeRawAd = awemeRawAd2;
    }

    public void setAwemeRiskModel(AwemeRiskModel awemeRiskModel2) {
        this.awemeRiskModel = awemeRiskModel2;
    }

    public void setAwemeType(int i) {
        this.awemeType = i;
    }

    public void setCanCache(boolean z) {
        this.isCanCache = z;
    }

    public void setCanPlay(boolean z) {
        this.canPlay = z;
    }

    public void setChallengeList(List<Challenge> list) {
        this.challengeList = list;
    }

    public void setCmtSwt(boolean z) {
        this.cmtSwt = z;
    }

    public void setCollectStatus(int i) {
        this.collectStatus = i;
    }

    public void setCommentSetting(int i) {
        this.commentSetting = i;
    }

    public void setCommerceConfigDataList(List<CommerceConfigData> list) {
        this.commerceConfigDataList = list;
    }

    public void setCommerceStickerInfo(g gVar) {
        this.commerceStickerInfo = gVar;
    }

    public void setConcatAndUploadState(int i) {
        this.mConcatAndUploadState = i;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setDate(long j) {
        this.date = j;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setDescLanguage(String str) {
        this.descLanguage = str;
    }

    public void setDescendantsModel(DescendantsModel descendantsModel2) {
        this.descendantsModel = descendantsModel2;
    }

    public void setDistance(String str) {
        this.distance = str;
    }

    public void setDistributeType(int i) {
        this.distributeType = i;
    }

    public void setDuetSetting(int i) {
        this.duetSetting = i;
    }

    public void setEffectDesigner(boolean z) {
        this.isEffectDesigner = z;
    }

    public void setEllipsizeDesc(CharSequence charSequence) {
        this.ellipsizeDesc = charSequence;
    }

    public void setEnableTopView(boolean z) {
        this.enableTopView = z;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFakeResponse(boolean z) {
        this.isFakeResponse = z;
    }

    public void setFeedCount(long j) {
        this.feedCount = j;
    }

    public void setFloatingCardInfo(FloatingCardInfo floatingCardInfo2) {
        this.floatingCardInfo = floatingCardInfo2;
    }

    public void setForwardCommentId(String str) {
        this.forwardCommentId = str;
    }

    public void setForwardItem(Aweme aweme) {
        this.forwardItem = aweme;
    }

    public void setForwardItemId(String str) {
        this.forwardItemId = str;
    }

    public void setGameInfo(GameInfo gameInfo2) {
        this.gameInfo = gameInfo2;
    }

    public void setHashTag(int i) {
        this.isHashTag = i;
    }

    public void setHotSearchInfo(HotSearchInfo hotSearchInfo2) {
        this.hotSearchInfo = hotSearchInfo2;
    }

    public void setImageInfos(List<ImageInfo> list) {
        this.imageInfos = list;
    }

    public void setInteractStickerStructs(List<InteractStickerStruct> list) {
        this.interactStickerStructs = list;
    }

    public void setIsPreloadScroll(boolean z) {
        this.isPreloadScroll = z;
    }

    @Deprecated
    public void setIsTop(int i) {
        this.isTop = i;
    }

    public void setLabelLarge(UrlModel urlModel) {
        this.labelLarge = urlModel;
    }

    public void setLabelMusicStarterText(String str) {
        this.mLabelMusicStarterText = str;
    }

    public void setLabelOriginAuthorText(String str) {
        this.mLabelOriginAuthorText = str;
    }

    public void setLabelPrivate(UrlModel urlModel) {
        this.labelPrivate = urlModel;
    }

    public void setLabelThumb(UrlModel urlModel) {
        this.labelThumb = urlModel;
    }

    public void setLabelTop(UrlModel urlModel) {
        this.labelTop = urlModel;
    }

    public void setLandingPage(String str) {
        this.landingPage = str;
    }

    public void setLawCriticalCountry(boolean z) {
        this.lawCriticalCountry = z;
    }

    public void setLike(boolean z) {
        this.userDigg = z ? 1 : 0;
    }

    public void setLinkAdData(j jVar) {
        this.linkAdData = jVar;
    }

    public void setLongVideos(List<LongVideo> list) {
        this.longVideos = list;
    }

    public void setMicroAppInfo(f fVar) {
        this.microAppInfo = fVar;
    }

    public void setMusic(Music music2) {
        this.music = music2;
    }

    public void setMusicStarter(UrlModel urlModel) {
        this.musicStarter = urlModel;
    }

    public void setNicknamePosition(List<Position> list) {
        this.nicknamePosition = list;
    }

    public void setOpenPlatformName(String str) {
        this.openPlatformName = str;
    }

    public void setOpenPlatformStruct(a aVar) {
        this.openPlatformStruct = aVar;
    }

    public void setOriginAuthor(UrlModel urlModel) {
        this.originAuthor = urlModel;
    }

    public void setOriginCommentIds(List<String> list) {
        this.originCommentIds = list;
    }

    public void setOriginalPos(int i) {
        this.originalPos = i;
    }

    public void setPgcShow(boolean z) {
        this.isPgcShow = z;
    }

    public void setPoiStruct(PoiStruct poiStruct2) {
        this.poiStruct = poiStruct2;
    }

    public void setPosition(List<Position> list) {
        this.position = list;
    }

    public void setPreload(Preload preload2) {
        this.preload = preload2;
    }

    public void setPreventDownload(boolean z) {
        this.preventDownload = z;
    }

    public void setPromotionOtherInfo(q qVar) {
        this.promotionOtherInfo = qVar;
    }

    public void setRate(int i) {
        this.rate = i;
    }

    public void setReactFrom(String str) {
        this.reactFrom = str;
    }

    public void setReactOrigin(String str) {
        this.reactOrigin = str;
    }

    public void setReactSetting(int i) {
        this.reactSetting = i;
    }

    public void setReactView(String str) {
        this.reactView = str;
    }

    public void setRegion(String str) {
        this.region = str;
    }

    public void setRelationLabel(RelationDynamicLabel relationDynamicLabel) {
        this.relationLabel = relationDynamicLabel;
    }

    public void setRelieve(boolean z) {
        this.isRelieve = z;
    }

    public void setRepostFromGroupId(String str) {
        this.repostFromGroupId = str;
    }

    public void setRepostFromUserId(String str) {
        this.repostFromUserId = str;
    }

    public void setRoom(RoomStruct roomStruct) {
        this.room = roomStruct;
    }

    public void setScenario(int i) {
        this.scenario = i;
    }

    public void setShareInfo(ShareInfo shareInfo2) {
        this.shareInfo = shareInfo2;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public void setSpecialSticker(SpecialSticker specialSticker2) {
        this.specialSticker = specialSticker2;
    }

    public void setStarAtlasInfo(AwemeStarAtlas awemeStarAtlas) {
        this.starAtlasInfo = awemeStarAtlas;
    }

    public void setStarAtlasOrderId(long j) {
        this.starAtlasOrderId = j;
    }

    public void setStarRecommendTag(String str) {
        this.starRecommendTag = str;
    }

    public void setStatistics(AwemeStatistics awemeStatistics) {
        this.statistics = awemeStatistics;
    }

    public void setStatus(AwemeStatus awemeStatus) {
        this.status = awemeStatus;
    }

    public void setStickerEntranceInfo(d dVar) {
        this.stickerEntranceInfo = dVar;
    }

    public void setStickerIDs(String str) {
        this.stickerIDs = str;
    }

    public void setStreamUrlModel(StreamUrlModel streamUrlModel2) {
        this.streamUrlModel = streamUrlModel2;
    }

    public void setTakeDownDesc(String str) {
        this.takeDownDesc = str;
    }

    public void setTakeDownReason(int i) {
        this.takeDownReason = i;
    }

    public void setTextExtra(List<TextExtraStruct> list) {
        this.textExtra = list;
    }

    public void setTextTopLabels(List<AwemeTextLabelModel> list) {
        this.textTopLabels = list;
    }

    public void setTextVideoLabels(List<AwemeTextLabelModel> list) {
        this.textVideoLabels = list;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUniqidPosition(List<Position> list) {
        this.uniqidPosition = list;
    }

    public void setUserDigg(int i) {
        this.userDigg = i;
    }

    public void setVideo(Video video2) {
        this.video = video2;
    }

    public void setVideoControl(VideoControl videoControl2) {
        this.videoControl = videoControl2;
    }

    public void setVideoLabels(List<AwemeLabelModel> list) {
        this.videoLabels = list;
    }

    public void setXiGuaTask(XiGuaTaskStruct xiGuaTaskStruct) {
        this.xiGuaTask = xiGuaTaskStruct;
    }

    public void setRawPromotion(String str) {
        this.simplePromotionsString = str;
        this.simplePromotions = null;
    }

    public static boolean hasLink(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, changeQuickRedirect, true, 41423, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, changeQuickRedirect, true, 41423, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getLinkAdData() == null) {
            return false;
        } else {
            return true;
        }
    }

    public static Aweme newDateSection(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, changeQuickRedirect, true, 41387, new Class[]{Long.TYPE}, Aweme.class)) {
            return (Aweme) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, changeQuickRedirect, true, 41387, new Class[]{Long.TYPE}, Aweme.class);
        }
        Aweme aweme = new Aweme();
        aweme.setAid("");
        aweme.setDate(j2);
        return aweme;
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 41395, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 41395, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj instanceof Aweme) {
                return this.aid.equals(((Aweme) obj).aid);
            }
            return false;
        }
    }

    public String getOrder(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 41427, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 41427, new Class[]{Integer.TYPE}, String.class);
        }
        JSONObject b2 = com.ss.android.ugc.aweme.feed.a.a().b(this, i);
        if (b2 != null) {
            return b2.optString("order");
        }
        return "";
    }

    @Nullable
    public List<String> getRawAdPlayNodeTrackUrlList(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 41399, new Class[]{Integer.TYPE}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 41399, new Class[]{Integer.TYPE}, List.class);
        } else if (getAwemeRawAd() == null) {
            return null;
        } else {
            List<com.ss.android.ugc.aweme.commercialize.model.a> adNodeTrackUrlList = getAwemeRawAd().getAdNodeTrackUrlList();
            if (CollectionUtils.isEmpty(adNodeTrackUrlList)) {
                return null;
            }
            for (com.ss.android.ugc.aweme.commercialize.model.a aVar : adNodeTrackUrlList) {
                if (aVar.percent == i) {
                    return aVar.urlList;
                }
            }
            return null;
        }
    }

    public void setRequestId(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 41402, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 41402, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.requestId = str;
        if (isForwardAweme() && this.forwardItem != null) {
            this.forwardItem.setRequestId(str);
        }
        if (this.author != null) {
            this.author.setRequestId(str);
        }
    }

    public void updateSameAweme(Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, this, changeQuickRedirect, false, 41385, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2}, this, changeQuickRedirect, false, 41385, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        if (aweme2 != null) {
            if (StringUtils.equal(aweme2.aid, this.aid)) {
                update(aweme);
            }
        }
    }

    public void setVr(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 41391, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 41391, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.isVr = z;
        if (this.video != null) {
            setVr(this.video.getPlayAddrH264(), z);
            setVr(this.video.getPlayAddrH265(), z);
        }
    }

    public void update(Aweme aweme) {
        String str;
        String str2;
        long j;
        Boolean bool;
        User user;
        String str3;
        AwemeStatus awemeStatus;
        List<Challenge> list;
        Music music2;
        Video video2;
        String str4;
        List<TextExtraStruct> list2;
        f fVar;
        d dVar;
        String str5;
        List<LongVideo> list3;
        VideoControl videoControl2;
        if (PatchProxy.isSupport(new Object[]{aweme}, this, changeQuickRedirect, false, 41384, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, changeQuickRedirect, false, 41384, new Class[]{Aweme.class}, Void.TYPE);
        } else if (aweme != null) {
            if (TextUtils.isEmpty(aweme.aid)) {
                str = this.aid;
            } else {
                str = aweme.aid;
            }
            this.aid = str;
            if (aweme.desc == null) {
                str2 = this.desc;
            } else {
                str2 = aweme.desc;
            }
            this.desc = str2;
            if (aweme.createTime == 0) {
                j = this.createTime;
            } else {
                j = aweme.createTime;
            }
            this.createTime = j;
            if (this.author == null) {
                bool = null;
            } else {
                bool = this.author.isHasUnreadStory();
            }
            if (aweme.author == null) {
                user = this.author;
            } else {
                user = aweme.author;
            }
            this.author = user;
            if (!(bool == null || this.author == null || this.author.isHasUnreadStory() != null)) {
                this.author.setHasUnreadStory(bool.booleanValue());
            }
            if (aweme.commerceConfigDataList != null && !aweme.commerceConfigDataList.isEmpty()) {
                this.commerceConfigDataList = aweme.commerceConfigDataList;
            }
            if (TextUtils.isEmpty(aweme.shareUrl)) {
                str3 = this.shareUrl;
            } else {
                str3 = aweme.shareUrl;
            }
            this.shareUrl = str3;
            this.userDigg = aweme.userDigg;
            this.statistics = aweme.statistics;
            if (aweme.status == null) {
                awemeStatus = this.status;
            } else {
                awemeStatus = aweme.status;
            }
            this.status = awemeStatus;
            if (aweme.challengeList == null) {
                list = this.challengeList;
            } else {
                list = aweme.challengeList;
            }
            this.challengeList = list;
            if (aweme.music == null) {
                music2 = this.music;
            } else {
                music2 = aweme.music;
            }
            this.music = music2;
            if (aweme.video == null) {
                video2 = this.video;
            } else {
                video2 = aweme.video;
            }
            this.video = video2;
            if (TextUtils.isEmpty(aweme.extra)) {
                str4 = this.extra;
            } else {
                str4 = aweme.extra;
            }
            this.extra = str4;
            if (aweme.textExtra == null) {
                list2 = this.textExtra;
            } else {
                list2 = aweme.textExtra;
            }
            this.textExtra = list2;
            this.rate = aweme.rate;
            this.starAtlasOrderId = aweme.starAtlasOrderId;
            this.labelTop = aweme.labelTop;
            this.labelLarge = aweme.labelLarge;
            this.labelThumb = aweme.labelThumb;
            this.shareInfo = aweme.shareInfo;
            this.originAuthor = aweme.originAuthor;
            this.musicStarter = aweme.musicStarter;
            this.mLabelMusicStarterText = aweme.mLabelMusicStarterText;
            this.mLabelOriginAuthorText = aweme.mLabelOriginAuthorText;
            this.isHashTag = aweme.isHashTag;
            this.videoLabels = aweme.videoLabels;
            this.poiStruct = aweme.poiStruct;
            this.isAd = aweme.isAd;
            this.awemeType = aweme.awemeType;
            this.awemeRawAd = aweme.awemeRawAd;
            this.specialSticker = aweme.specialSticker;
            this.videoLabels = aweme.videoLabels;
            this.textVideoLabels = aweme.textVideoLabels;
            this.textTopLabels = aweme.textTopLabels;
            this.imageInfos = aweme.imageInfos;
            this.awemeRiskModel = aweme.awemeRiskModel;
            this.cmtSwt = aweme.cmtSwt;
            this.canPlay = aweme.canPlay;
            this.scenario = aweme.scenario;
            this.position = aweme.position;
            this.lawCriticalCountry = aweme.lawCriticalCountry;
            this.room = aweme.room;
            this.adSchedule = aweme.adSchedule;
            this.simplePromotionsString = aweme.simplePromotionsString;
            this.feedCount = aweme.feedCount;
            this.preventDownload = aweme.preventDownload;
            this.forwardItem = aweme.forwardItem;
            this.forwardItemId = aweme.forwardItemId;
            this.forwardCommentId = aweme.forwardCommentId;
            this.preForwardId = aweme.preForwardId;
            this.withPromotionalMusic = aweme.withPromotionalMusic;
            this.linkAdData = aweme.linkAdData;
            this.activityPendant = aweme.activityPendant;
            this.xiGuaTask = aweme.xiGuaTask;
            if (aweme.microAppInfo == null) {
                fVar = this.microAppInfo;
            } else {
                fVar = aweme.microAppInfo;
            }
            this.microAppInfo = fVar;
            if (aweme.stickerEntranceInfo == null) {
                dVar = this.stickerEntranceInfo;
            } else {
                dVar = aweme.stickerEntranceInfo;
            }
            this.stickerEntranceInfo = dVar;
            if (TextUtils.isEmpty(aweme.stickerIDs)) {
                str5 = this.stickerIDs;
            } else {
                str5 = aweme.stickerIDs;
            }
            this.stickerIDs = str5;
            if (aweme.longVideos == null) {
                list3 = this.longVideos;
            } else {
                list3 = aweme.longVideos;
            }
            this.longVideos = list3;
            this.takeDownReason = aweme.takeDownReason;
            this.takeDownDesc = aweme.takeDownDesc;
            this.starRecommendTag = aweme.starRecommendTag;
            this.adOrderId = aweme.adOrderId;
            this.downloadWithoutWatermark = aweme.downloadWithoutWatermark;
            this.openPlatformName = aweme.openPlatformName;
            if (!CollectionUtils.isEmpty(aweme.interactStickerStructs)) {
                this.interactStickerStructs = aweme.interactStickerStructs;
            }
            this.originCommentIds = aweme.originCommentIds;
            this.duetSetting = aweme.duetSetting;
            this.reactSetting = aweme.reactSetting;
            this.isEffectDesigner = aweme.isEffectDesigner;
            this.enableTopView = aweme.enableTopView;
            this.commentSetting = aweme.commentSetting;
            if (aweme.videoControl == null) {
                videoControl2 = this.videoControl;
            } else {
                videoControl2 = aweme.videoControl;
            }
            this.videoControl = videoControl2;
            this.distributeType = aweme.distributeType;
        }
    }

    private void setVr(VideoUrlModel videoUrlModel, boolean z) {
        if (PatchProxy.isSupport(new Object[]{videoUrlModel, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 41392, new Class[]{VideoUrlModel.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{videoUrlModel, Byte.valueOf(z)}, this, changeQuickRedirect, false, 41392, new Class[]{VideoUrlModel.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (videoUrlModel != null) {
            videoUrlModel.setVr(z);
        }
    }
}
