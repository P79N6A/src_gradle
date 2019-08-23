package com.ss.android.ugc.aweme.app;

import android.content.SharedPreferences;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.antiaddic.lock.b;
import com.ss.android.ugc.aweme.app.business.I18n;
import com.ss.android.ugc.aweme.language.e;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.aweme.utils.du;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

@Keep
@Deprecated
public class SharePrefCache {
    public static ChangeQuickRedirect changeQuickRedirect;
    private an<String> accessToken;
    private an<Integer> adDisplayTimemit;
    private an<String> adIntroUrl;
    private an<String> adLandingPageConfig;
    private an<Integer> appStoreScoreSection;
    private an<Integer> appStoreScoreSwitch;
    private an<Integer> appStoreScoreThreshold;
    private an<Integer> arStickerFliterTimes;
    private an<Integer> atFriendsShowType;
    private an<Boolean> autoSaveVideo;
    private an<Boolean> autoSendTwitter;
    private an<Integer> beautyModel;
    private an<String> billboardFansScheme;
    private an<String> billboardStarScheme;
    private an<Integer> bodyDanceGuideTimes;
    private an<String> brandScheme;
    private List<an> cacheItems;
    private an<Integer> cameraPosition;
    private an<Boolean> canCreateInsights;
    private an<Integer> canIm;
    private an<Integer> canImSendPic;
    private an<Boolean> canLive;
    private an<Boolean> clickGuideShown;
    private boolean collectAllItems;
    private an<Boolean> commerceLiveCompatibleOld;
    private an<Integer> completeProfilePolicyInterval;
    private an<Integer> completeProfilePolicyTimes;
    private an<Boolean> confirmUploadContacts;
    private an<Long> contactsUploadedLastTime;
    private an<Boolean> debugWebBar;
    private an<Set<String>> defaultAvatarUrl;
    private an<Set<String>> defaultProfileCoverUrl;
    private an<String> deviceInfoUrl;
    private an<Boolean> deviceMonitor;
    private an<String> dialogContent;
    private an<String> dialogSlogan;
    private an<String> dialogTitle;
    private an<Integer> dialogType;
    private an<String> dialogUrl;
    private an<Integer> disableTaobao;
    private an<Boolean> disableWant;
    private an<String> douyinCardScheme;
    private an<String> downloadForbiddenToast;
    private an<Integer> downloadMicroApp;
    private an<String> downloadSdkConfig;
    private an<Boolean> downloadStatusWhenPublish;
    private an<Boolean> enableAntiAliasing;
    private an<Boolean> enableCacheUserInsert;
    private an<Boolean> enableCacheUserList;
    private an<Boolean> enableFace2Face;
    private an<Boolean> enableFloatVideo;
    private an<Boolean> enableLawWindow;
    private an<Boolean> enableMessagePb2Json;
    private an<Boolean> enableProfileActivityLink;
    private an<Boolean> enableShoppingUser;
    private an<Boolean> enableUltraResolution;
    private an<Boolean> enableUploadPC;
    private an<String> estr;
    private an<String> facebookAccessToken;
    private an<Long> festivalShareDonationTime;
    private an<Long> fetchUserCacheIntervals;
    private an<Integer> flashStatus;
    private an<Integer> followFeedAsDefault;
    private an<Boolean> followGuideShown;
    private an<Long> followNoticeCloseTime;
    private an<Integer> followUserThreshold;
    private an<Integer> friendTabAvatarDuation;
    private an<Boolean> geckoLocalTestUseOnline;
    private an<String> googleServerAuthCode;
    private an<String> guardianChild;
    private an<String> guardianParent;
    private an<Integer> hardEncode;
    private an<Boolean> hasAlreadyShowBubble;
    private an<Boolean> hasEnterBindPhone;
    private an<Boolean> hasLongPressDislike;
    private an<Boolean> hasShowFilterGuide;
    private an<Boolean> hasShowRemarkNamePopup;
    private an<String> hitRankActivityProfileBackgroud;
    private an<String> hitRankActivityStarBackground;
    private an<Integer> hitRankActivityStatus;
    private an<Integer> hotSearchWordsShowInterval;
    private an<String> hotsoonDownloadUrl;
    private an<Integer> httpRetryCount;
    private an<Long> httpRetryInterval;
    private an<Long> httpTimeOut;
    private an<Boolean> iesOffline;
    private an<Boolean> imCommentForwardEnabled;
    private an<String> imCurrentLocaleLanguage;
    private an<String> imUrlTemplate;
    private an<Boolean> inUltraResBlackList;
    private an<Long> invitedAllTimeStamp;
    private an<String> invitedContacts;
    private an<Boolean> isAwemePrivate;
    private an<Boolean> isBubbleShown;
    private an<Boolean> isClickMoreRedPoint;
    private an<Boolean> isContactDialogShown;
    private an<Boolean> isContactsUploaded;
    private an<Boolean> isEnableLocalMusicEntrance;
    private an<Boolean> isEnableUpdateUserDialog;
    private an<Boolean> isEuropeCountry;
    private an<Boolean> isFirstFavouriteSuccess;
    private an<Boolean> isFirstLaunch;
    private an<Boolean> isFirstPublishAweme;
    private an<Boolean> isFirstPublishComment;
    private an<Boolean> isFirstPublishSync;
    private an<Boolean> isFirstReportVideo;
    private an<Boolean> isFirstSetPrivate;
    private an<Boolean> isFirstShowFavouriteAnimation;
    private an<Boolean> isFirstShowInsightsAnimation;
    private an<Integer> isForceHttps;
    private an<Boolean> isGrantedLocationPermission;
    private an<Boolean> isHotSearchAwemeBillboardEnable;
    private an<Boolean> isHotSearchBillboardEnable;
    private an<Boolean> isHotSearchMusicalBillboardEnable;
    private an<Boolean> isHotSearchPositiveEnergyBillboardEnable;
    private an<Boolean> isLike2DynamicBubbleHasShowed;
    private an<Integer> isNewInstall;
    private an<Boolean> isNpthEnable;
    private an<Boolean> isOb;
    private an<Boolean> isOldUser;
    private an<Boolean> isPoiBubbleShown;
    private an<Boolean> isPrivateAvailable;
    private an<Boolean> isProfileBubbleShown;
    private an<Boolean> isProfileNavbarBubbleShown;
    private an<Boolean> isPublishSyncToHuoshan;
    private an<Boolean> isPublishSyncToToutiao;
    private an<Integer> isPublishSyncToToutiaoNew;
    private an<Boolean> isShowAllowDownloadTipSetting;
    private an<Boolean> isShowFavouriteIcon;
    private an<Boolean> isShowFavouritePopup;
    private an<Boolean> isShowHotSearchVideoTip;
    private an<Boolean> isShowNearBy;
    private an<Boolean> isShowRankingIndicator;
    private an<Boolean> isShowSyncToToutiaoDialog;
    private an<Boolean> isShowUserFeedBackPoint;
    private an<Boolean> isSyncToHuoshan;
    private an<Boolean> isTargetBindingUser;
    private an<Boolean> isUseBackRefresh;
    private an<Boolean> isUseTTnet;
    private an<Boolean> isUseTongdunSdk;
    private an<Boolean> ischangeFollowTab;
    private an<String> jsActlogUrl;
    private an<String> judgementClauseScheme;
    private an<Long> lastCloseFeedUpdateUserDialog;
    private an<Long> lastCloseUpdateUserDialog;
    private an<Long> lastEnterProfileTime;
    private an<Long> lastFeedCount;
    private an<Long> lastFeedTime;
    private an<Long> lastFetchUserCacheIntervals;
    private an<Long> lastFilterTime;
    private an<Long> lastGetRelieveAwemeTime;
    private an<Long> lastLockedTime;
    private an<Boolean> lastPublishFailed;
    private an<Long> lastShowBindHintTime;
    private an<Long> lastShowProfileBindHintTime;
    private an<Long> lastUnlockTime;
    private an<String> lastUploadPassCode;
    private an<Integer> lastUsableNetworkSpeed;
    private an<Boolean> liveAgreement;
    private an<Boolean> liveAnswer;
    private an<Boolean> liveContactsVerify;
    private an<Integer> liveCoverAuditFailedTimes;
    private an<Integer> liveCoverBubble;
    private an<Integer> liveCoverWarnChangeTimes;
    private an<Integer> liveDefaultBitrate;
    private an<Integer> liveMaxBitrate;
    private an<Integer> liveMinBitrate;
    private an<Boolean> liveSkylightHasShowAnimation;
    private an<Boolean> liveSkylightShowAnimation;
    private an<Boolean> longVideoPermitted;
    private an<Long> longVideoThreshold;
    private an<Set<String>> mGeckoChannels;
    private an<Integer> mRnContextCreateTimeout;
    private an<Boolean> mRnPreloadContextOn;
    private an<Boolean> mRnSnapshotOn;
    private SharedPreferences mSharedPreferences;
    private an<Boolean> mUseNewPackageNow;
    private an<String> merchPickerUrl;
    private an<String> miniAppLabTitle;
    private an<Boolean> mockLiveMoney;
    private an<Boolean> mockLiveResolution;
    private an<Boolean> mockLiveSend;
    private an<String> mpTab;
    private an<Integer> multiSelectLimit;
    private an<String> musicBillboardRuleUrl;
    private an<String> musicRingtoneScheme;
    private an<Integer> musicianShowType;
    private an<String> needChooseLanguages;
    private an<Integer> networkLibType;
    private an<Boolean> newAnchorShowBubble;
    private an<String> newbieHelpShopUrl;
    private an<Long> normalGuideDisplayTimeIntervals;
    private an<Integer> normalGuideDisplayTimes;
    private an<Integer> noticeCountLatency;
    private an<String> openAppBackLogParams;
    private an<Integer> openForward;
    private an<Integer> openImLink;
    private an<Long> operationGuideDisplayTimeIntervals;
    private an<Integer> operationGuideDisplayTimes;
    private an<String> orderShareIntroUrl;
    private an<String> orginalMusicianUrl;
    private an<Boolean> originalMusiciaShareStyle;
    private an<Boolean> originalMusicianEntry;
    private an<Integer> personalizationMode;
    private an<String> poiErrorReport;
    private an<String> poiMerchantUrl;
    private an<String> previewGoodReport;
    private an<Integer> privacyAccountFollowCount;
    private an<Integer> privacyDownloadSetting;
    private an<String> privacyReminderH5Url;
    private an<Float> profileCompletionThreshold;
    private an<Float> profilePerfectionAvatar;
    private an<Float> profilePerfectionBirthday;
    private an<Float> profilePerfectionGender;
    private an<Float> profilePerfectionLocation;
    private an<Float> profilePerfectionNickname;
    private an<Float> profilePerfectionSchool;
    private an<Float> profilePerfectionShortId;
    private an<Float> profilePerfectionSignature;
    private an<Long> progressbarThreshold;
    private an<Integer> promoteDialogPopupClickType;
    private an<String> promoteDialogPopupPopupContent;
    private an<Integer> promoteDialogPopupPopupInterval;
    private an<String> promoteDialogPopupPopupLinkText;
    private an<String> promoteDialogPopupPopupMsg;
    private an<String> promoteDialogPopupPopupTitle;
    private an<String> promoteDialogPopupPopupUrl;
    private an<Integer> promoteDialogPopupTimesLimit;
    private an<Boolean> promoteDialogShouldShow;
    private an<String> reactAddShopUrl;
    private an<String> reactEShopToolboxUrl;
    private an<String> referralEntrance;
    private an<Integer> refreshZhima;
    private an<Boolean> removeFollowerSwitch;
    private an<String> requestNotificationText;
    private an<String> requestNotificationTitle;
    private an<Boolean> rnFallback;
    private an<String> sameCityActiveId;
    private an<Integer> scrollToProfileGuideState;
    private an<String> searchTabIndex;
    private an<String> searchTrendBannerUrl;
    private an<String> shareCookieCacheItem;
    private an<Boolean> shiledMusicSDK;
    private an<String> shopWishListUrl;
    private an<Boolean> shouldShowFavouriteTip;
    private an<Boolean> shouldShowPrivateAccountTipInProfile;
    private an<Boolean> showAdIntroFlag;
    private an<Boolean> showAddBusinessGoodsDot;
    private an<Integer> showBindHintCount;
    private an<Boolean> showCouponItem;
    private an<Integer> showCreatorRewards;
    private an<Boolean> showFansCard;
    private an<Integer> showHashTagBg;
    private an<Boolean> showInteractionStickers;
    private an<Boolean> showInvitedContactsFriends;
    private an<Integer> showJumpEffectAfterFollowCount;
    private an<Integer> showLiveRewards;
    private an<Integer> showLoginDialogState;
    private an<Boolean> showMiniAppFreshGuideBubble;
    private an<Boolean> showMiniAppFreshGuideDialog;
    private an<Boolean> showMiniAppFreshGuideNotify;
    private an<Boolean> showPlayerInfoUI;
    private an<Integer> showProfileBindHintCount;
    private an<Integer> showPromoteLicense;
    private an<Boolean> showTimeLineTab;
    private an<Boolean> showVideoBitrateInfo;
    private an<String> starAtlasOrderWebUrl;
    private an<String> starBillboardRuleUrl;
    private an<Boolean> stickerArtEntry;
    private an<String> stickerArtlistUrl;
    private an<String> storyFontType;
    private an<Integer> storyInfoStickerMaxCount;
    private an<Boolean> storyPublishFriendsDuoshanBanner;
    private an<Boolean> storyPublishSaveLocal;
    private an<Boolean> storyQuickPanelShowInActivity;
    private an<Boolean> storyRecordGuideShow;
    private an<String> storyRegisterPublishSyncHintContent;
    private an<String> storyRegisterPublishSyncHintH5Str;
    private an<String> storyRegisterPublishSyncHintH5Url;
    private an<String> storyRegisterPublishSyncHintTitle;
    private an<Boolean> storySettingDoudouPhoto;
    private an<Boolean> storySettingManualOpenDoudou;
    private an<Integer> storySettingReplyPermission;
    private an<Boolean> storySettingSyncDuoshan;
    private an<Integer> storySettingSyncToast;
    private an<Integer> storySettingViewPermission;
    private an<String> storyShakeLastTime;
    private an<Boolean> storyShakeSurpriseHintShow;
    private an<Long> storyStickerQuickPanelCloseTime;
    private an<Integer> storyTextStickerMaxCount;
    private an<String> storyUnRegisterPublishSyncHintContent;
    private an<String> storyUnRegisterPublishSyncHintH5Str;
    private an<String> storyUnRegisterPublishSyncHintH5Url;
    private an<String> storyUnRegisterPublishSyncHintTitle;
    private an<Integer> swipeDataCount;
    private an<Integer> syncTT;
    private an<Boolean> syncTTFirstPublish;
    private an<String> syncToTTUrl;
    private an<Float> syntheticVideoBitrate;
    private an<Integer> tapDataCount;
    private an<String> teenagerProtectionScheme;
    private an<Long> todayVideoPlayTime;
    private an<Boolean> ttRegion;
    private an<Boolean> ttRoute;
    private an<String> twitterAccessToken;
    private an<String> twitterSecret;
    private an<Integer> ultraResolutionLevel;
    private an<Integer> upGuideNum;
    private an<Integer> updateUserFrequency;
    private an<Integer> updateUserPosition;
    private an<String> updateUserTimeInfo;
    private an<String> updateUserTipContent;
    private an<Long> uploadContactsNoticeLastShowTime;
    private an<Integer> uploadContactsNoticeShowCount;
    private an<String> uploadContactsPolicyCaption;
    private an<Integer> uploadContactsPolicyInterval;
    private an<String> uploadContactsPolicyPic;
    private an<String> uploadContactsPolicyText;
    private an<Integer> uploadContactsPolicyTimes;
    private an<Boolean> useCronet;
    private an<Boolean> useDefaultHost;
    private an<Boolean> useHttps;
    private an<Integer> useLiveWallpaper;
    private an<Integer> useNewDouyinSaftyCenter;
    private an<Boolean> useNewFFmpeg;
    private an<Integer> useSyntheticHardcode;
    private an<String> userAddLanguages;
    private an<String> userCurrentRegion;
    private an<Boolean> userHasPassword;
    private an<String> userResidence;
    private an<Integer> verifyExceed;
    private an<Float> videoBitrate;
    private an<Integer> videoCommit;
    private an<Integer> videoCompose;
    private an<Boolean> videoPreload;
    private an<Integer> weakNetPreLoadSwitch;
    private an<Integer> x2cSwitch;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static SharePrefCache f33671a = new SharePrefCache();
    }

    public static SharePrefCache inst() {
        return a.f33671a;
    }

    public SharedPreferences getSharePref() {
        return this.mSharedPreferences;
    }

    private SharePrefCache() {
        this.cacheItems = Collections.synchronizedList(new ArrayList());
        this.mSharedPreferences = c.a(k.a(), "aweme-app", 0);
    }

    private an<Boolean> getCanLive() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22706, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22706, new Class[0], an.class);
        }
        if (this.canLive == null) {
            this.canLive = new an<>("live_can_live", Boolean.FALSE);
            this.cacheItems.add(this.canLive);
        }
        return this.canLive;
    }

    private an<Boolean> getClickMoreRedPoint() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22690, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22690, new Class[0], an.class);
        }
        if (this.isClickMoreRedPoint == null) {
            this.isClickMoreRedPoint = new an<>("is_click_more_red_point", Boolean.FALSE);
            this.cacheItems.add(this.isClickMoreRedPoint);
        }
        return this.isClickMoreRedPoint;
    }

    private an<Boolean> getFirstPublishAwemeItem() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22719, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22719, new Class[0], an.class);
        }
        if (this.isFirstPublishAweme == null) {
            this.isFirstPublishAweme = new an<>("first_publish_aweme", Boolean.TRUE);
            this.cacheItems.add(this.isFirstPublishAweme);
        }
        return this.isFirstPublishAweme;
    }

    private an<Boolean> getFirstPublishCommentItem() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22721, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22721, new Class[0], an.class);
        }
        if (this.isFirstPublishComment == null) {
            this.isFirstPublishComment = new an<>("first_publish_comment", Boolean.TRUE);
            this.cacheItems.add(this.isFirstPublishComment);
        }
        return this.isFirstPublishComment;
    }

    private an<Boolean> getHasShowFilterGuideItem() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22705, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22705, new Class[0], an.class);
        }
        if (this.hasShowFilterGuide == null) {
            this.hasShowFilterGuide = new an<>("live_show_filter_guide", Boolean.FALSE);
            this.cacheItems.add(this.hasShowFilterGuide);
        }
        return this.hasShowFilterGuide;
    }

    public void clearCache() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22636, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22636, new Class[0], Void.TYPE);
            return;
        }
        collectAllItemsIfNeed();
        for (an b2 : this.cacheItems) {
            b2.b();
        }
    }

    public an<String> getAccessToken() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22638, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22638, new Class[0], an.class);
        }
        if (this.accessToken == null) {
            this.accessToken = new an<>("access_token", "");
            this.cacheItems.add(this.accessToken);
        }
        return this.accessToken;
    }

    public an<String> getAdIntroUrlItem() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22872, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22872, new Class[0], an.class);
        }
        if (this.adIntroUrl == null) {
            this.adIntroUrl = new an<>("ad_intro_url", "");
            this.cacheItems.add(this.adIntroUrl);
        }
        return this.adIntroUrl;
    }

    public an<String> getAdLandingPageConfig() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22751, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22751, new Class[0], an.class);
        }
        if (this.adLandingPageConfig == null) {
            this.adLandingPageConfig = new an<>("ad_landing_page_config", "");
            this.cacheItems.add(this.adLandingPageConfig);
        }
        return this.adLandingPageConfig;
    }

    public an<String> getAppEnterForegroundTime() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22937, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22937, new Class[0], an.class);
        }
        if (this.updateUserTimeInfo == null) {
            this.updateUserTimeInfo = new an<>("update_user_time_info", "");
            this.cacheItems.add(this.updateUserTimeInfo);
        }
        return this.updateUserTimeInfo;
    }

    public int getArStickerFilterGuideTimes() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22752, new Class[0], Integer.TYPE)) {
            return ((Integer) getArStickerFliterTimesItem().c()).intValue();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22752, new Class[0], Integer.TYPE)).intValue();
    }

    public an<Boolean> getAutoSaveVideo() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22696, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22696, new Class[0], an.class);
        }
        if (this.autoSaveVideo == null) {
            this.autoSaveVideo = new an<>("auto_save_video", Boolean.TRUE);
            this.cacheItems.add(this.autoSaveVideo);
        }
        return this.autoSaveVideo;
    }

    @I18n
    public an<Boolean> getAutoSendTwitter() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22695, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22695, new Class[0], an.class);
        }
        if (this.autoSendTwitter == null) {
            this.autoSendTwitter = new an<>("auto_send_twitter", Boolean.FALSE);
            this.cacheItems.add(this.autoSendTwitter);
        }
        return this.autoSendTwitter;
    }

    public int getBeautyModel() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22711, new Class[0], Integer.TYPE)) {
            return ((Integer) getBeautyModelItem().c()).intValue();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22711, new Class[0], Integer.TYPE)).intValue();
    }

    public an<String> getBillboardFansScheme() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22623, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22623, new Class[0], an.class);
        }
        if (this.billboardFansScheme == null) {
            this.billboardFansScheme = new an<>("billboard_fans_scheme", "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fbillboard_fans%3Fhide_nav_bar%3D1&hide_nav_bar=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Dfe_app_rn_patch%26bundle_name%3Dfe_app_rn%26module_name%3Dpage_billboard_fans%26hide_nav_bar%3D1%26bg_theme%3D%2523161823%26loading_bgcolor%3D%2523161823");
            this.cacheItems.add(this.billboardFansScheme);
        }
        return this.billboardFansScheme;
    }

    public an<String> getBillboardStarScheme() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22621, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22621, new Class[0], an.class);
        }
        if (this.billboardStarScheme == null) {
            this.billboardStarScheme = new an<>("billboard_star_scheme", "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fbillboard_star%3Fhide_nav_bar%3D1&hide_nav_bar=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Dfe_app_rn_patch%26bundle_name%3Dfe_app_rn%26module_name%3Dpage_billboard_star%26hide_nav_bar%3D1");
            this.cacheItems.add(this.billboardStarScheme);
        }
        return this.billboardStarScheme;
    }

    public an<String> getBrandScheme() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22622, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22622, new Class[0], an.class);
        }
        if (this.brandScheme == null) {
            this.brandScheme = new an<>("brand_scheme", "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fbrand_rank%3Fhide_nav_bar%3D1&hide_nav_bar=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Furl%3Dhttps%253A%252F%252Faweme.snssdk.com%252Ffalcon%252Frn%252Fbrand_rank%26channel_name%3Dfe_app_rn_patch%26bundle_name%3Dfe_app_rn%26module_name%3Dpage_brand_rank%26hide_nav_bar%3D1");
            this.cacheItems.add(this.brandScheme);
        }
        return this.brandScheme;
    }

    public an<Boolean> getCanCreateInsights() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22626, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22626, new Class[0], an.class);
        }
        if (this.canCreateInsights == null) {
            this.canCreateInsights = new an<>("can_create_insights", Boolean.FALSE);
            this.cacheItems.add(this.canCreateInsights);
        }
        return this.canCreateInsights;
    }

    public an<Boolean> getClickGuideShown() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22655, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22655, new Class[0], an.class);
        }
        if (this.clickGuideShown == null) {
            this.clickGuideShown = new an<>("click_guide_shown", Boolean.FALSE);
            this.cacheItems.add(this.clickGuideShown);
        }
        return this.clickGuideShown;
    }

    public an<Boolean> getCommerceLiveCompatibleOld() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22585, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22585, new Class[0], an.class);
        }
        if (this.commerceLiveCompatibleOld == null) {
            this.commerceLiveCompatibleOld = new an<>("capatible_with_old_version", Boolean.FALSE);
            this.cacheItems.add(this.commerceLiveCompatibleOld);
        }
        return this.commerceLiveCompatibleOld;
    }

    public an<Boolean> getConfirmUploadContacts() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22646, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22646, new Class[0], an.class);
        }
        if (this.confirmUploadContacts == null) {
            this.confirmUploadContacts = new an<>("confirm_upload_contacts", Boolean.FALSE);
            this.cacheItems.add(this.confirmUploadContacts);
        }
        return this.confirmUploadContacts;
    }

    public an<Boolean> getDebugWebBar() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22650, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22650, new Class[0], an.class);
        }
        if (this.debugWebBar == null) {
            this.debugWebBar = new an<>("debug_web_bar", Boolean.TRUE);
            this.cacheItems.add(this.debugWebBar);
        }
        return this.debugWebBar;
    }

    @I18n
    public an<String> getDeviceInfoUrl() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22600, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22600, new Class[0], an.class);
        }
        if (this.deviceInfoUrl == null) {
            this.deviceInfoUrl = new an<>("fp_upload_device_url", "");
            this.cacheItems.add(this.deviceInfoUrl);
        }
        return this.deviceInfoUrl;
    }

    public an<Boolean> getDeviceMonitor() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22665, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22665, new Class[0], an.class);
        }
        if (this.deviceMonitor == null) {
            this.deviceMonitor = new an<>("device_monitor", Boolean.TRUE);
            this.cacheItems.add(this.deviceMonitor);
        }
        return this.deviceMonitor;
    }

    public an<String> getDialogContent() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22867, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22867, new Class[0], an.class);
        }
        if (this.dialogContent == null) {
            this.dialogContent = new an<>("dialog_content", "");
            this.cacheItems.add(this.dialogContent);
        }
        return this.dialogContent;
    }

    public an<String> getDialogSlogan() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22869, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22869, new Class[0], an.class);
        }
        if (this.dialogSlogan == null) {
            this.dialogSlogan = new an<>("dialog_slogan", "");
            this.cacheItems.add(this.dialogSlogan);
        }
        return this.dialogSlogan;
    }

    public an<String> getDialogTitle() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22866, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22866, new Class[0], an.class);
        }
        if (this.dialogTitle == null) {
            this.dialogTitle = new an<>("dialog_title", "");
            this.cacheItems.add(this.dialogTitle);
        }
        return this.dialogTitle;
    }

    public an<String> getDialogUrl() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22865, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22865, new Class[0], an.class);
        }
        if (this.dialogUrl == null) {
            this.dialogUrl = new an<>("dialog_url", "");
            this.cacheItems.add(this.dialogUrl);
        }
        return this.dialogUrl;
    }

    public an<String> getDouyinCardScheme() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22620, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22620, new Class[0], an.class);
        }
        if (this.douyinCardScheme == null) {
            this.douyinCardScheme = new an<>("douyin_card_scheme", "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fdouyin_card%3Fhide_nav_bar%3D1%26media_source%3Ddouyin&hide_nav_bar=1&media_source=douyin&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Dfe_app_rn_patch%26bundle_name%3Dfe_app_rn%26module_name%3Dpage_douyin_card%26hide_nav_bar%3D1%26media_source%3Ddouyin");
            this.cacheItems.add(this.douyinCardScheme);
        }
        return this.douyinCardScheme;
    }

    public an<String> getDownloadForbiddenToast() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22835, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22835, new Class[0], an.class);
        }
        if (this.downloadForbiddenToast == null) {
            this.downloadForbiddenToast = new an<>("download_forbidden_toast", "");
            this.cacheItems.add(this.downloadForbiddenToast);
        }
        return this.downloadForbiddenToast;
    }

    public an<String> getDownloadSdkConfig() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22802, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22802, new Class[0], an.class);
        }
        if (this.downloadSdkConfig == null) {
            this.downloadSdkConfig = new an<>("download_sdk_config", "");
            this.cacheItems.add(this.downloadSdkConfig);
        }
        return this.downloadSdkConfig;
    }

    public an<Boolean> getDownloadStatusWhenPublish() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22944, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22944, new Class[0], an.class);
        }
        if (this.downloadStatusWhenPublish == null) {
            this.downloadStatusWhenPublish = new an<>("download_status_when_publish", Boolean.TRUE);
        }
        return this.downloadStatusWhenPublish;
    }

    public an<Boolean> getEableUltraResolution() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22921, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22921, new Class[0], an.class);
        }
        if (this.enableUltraResolution == null) {
            this.enableUltraResolution = new an<>("enable_ultra_resolution", Boolean.FALSE);
            this.cacheItems.add(this.enableUltraResolution);
        }
        return this.enableUltraResolution;
    }

    public an<Boolean> getEnableAntiAliasing() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22925, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22925, new Class[0], an.class);
        }
        if (this.enableAntiAliasing == null) {
            this.enableAntiAliasing = new an<>("enable_anti_aliasing", Boolean.FALSE);
            this.cacheItems.add(this.enableAntiAliasing);
        }
        return this.enableAntiAliasing;
    }

    public an<Boolean> getEnableFace2Face() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22916, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22916, new Class[0], an.class);
        }
        if (this.enableFace2Face == null) {
            this.enableFace2Face = new an<>("enable_face_to_face", Boolean.TRUE);
            this.cacheItems.add(this.enableFace2Face);
        }
        return this.enableFace2Face;
    }

    public an<Boolean> getEnableFloatVideo() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22796, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22796, new Class[0], an.class);
        }
        if (this.enableFloatVideo == null) {
            this.enableFloatVideo = new an<>("enable_float_video", Boolean.TRUE);
            this.cacheItems.add(this.enableFloatVideo);
        }
        return this.enableFloatVideo;
    }

    public an<Boolean> getEnableProfileActivityLink() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22887, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22887, new Class[0], an.class);
        }
        if (this.enableProfileActivityLink == null) {
            this.enableProfileActivityLink = new an<>("enable_profile_link", Boolean.FALSE);
            this.cacheItems.add(this.enableProfileActivityLink);
        }
        return this.enableProfileActivityLink;
    }

    public an<Boolean> getEnableUploadPC() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22864, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22864, new Class[0], an.class);
        }
        if (this.enableUploadPC == null) {
            this.enableUploadPC = new an<>("enableuploadpc", Boolean.TRUE);
            this.cacheItems.add(this.enableUploadPC);
        }
        return this.enableUploadPC;
    }

    public an<String> getEstr() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22684, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22684, new Class[0], an.class);
        }
        if (this.estr == null) {
            this.estr = new an<>("estr", "a3668f0afac72ca3f6c1697d29e0e1bb1fef4ab0285319b95ac39fa42c38d05f");
            this.cacheItems.add(this.estr);
        }
        return this.estr;
    }

    @I18n
    public an<String> getFacebookAccessToken() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22694, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22694, new Class[0], an.class);
        }
        if (this.facebookAccessToken == null) {
            this.facebookAccessToken = new an<>("facebook_access_token", "");
            this.cacheItems.add(this.facebookAccessToken);
        }
        return this.facebookAccessToken;
    }

    public an<Boolean> getFollowGuideShown() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22654, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22654, new Class[0], an.class);
        }
        if (this.followGuideShown == null) {
            this.followGuideShown = new an<>("follow_guide_shown", Boolean.FALSE);
            this.cacheItems.add(this.followGuideShown);
        }
        return this.followGuideShown;
    }

    public an<Boolean> getGeckoLocalTestUseOnline() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22653, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22653, new Class[0], an.class);
        }
        if (this.geckoLocalTestUseOnline == null) {
            this.geckoLocalTestUseOnline = new an<>("gecko_local_test_use_online", Boolean.FALSE);
            this.cacheItems.add(this.geckoLocalTestUseOnline);
        }
        return this.geckoLocalTestUseOnline;
    }

    @I18n
    public an<String> getGoogleServerAuthCode() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22698, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22698, new Class[0], an.class);
        }
        if (this.googleServerAuthCode == null) {
            this.googleServerAuthCode = new an<>("google_server_auth_code", "");
            this.cacheItems.add(this.googleServerAuthCode);
        }
        return this.googleServerAuthCode;
    }

    public an<Boolean> getHasAlreadyShowBubble() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22780, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22780, new Class[0], an.class);
        }
        if (this.hasAlreadyShowBubble == null) {
            this.hasAlreadyShowBubble = new an<>("has_already_show_bubble", Boolean.FALSE);
            this.cacheItems.add(this.hasAlreadyShowBubble);
        }
        return this.hasAlreadyShowBubble;
    }

    public an<Boolean> getHasEnterBindPhone() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22687, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22687, new Class[0], an.class);
        }
        if (this.hasEnterBindPhone == null) {
            this.hasEnterBindPhone = new an<>("has_enter_bind_phone", Boolean.FALSE);
            this.cacheItems.add(this.hasEnterBindPhone);
        }
        return this.hasEnterBindPhone;
    }

    public an<Boolean> getHasLongPressDislike() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22709, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22709, new Class[0], an.class);
        }
        if (this.hasLongPressDislike == null) {
            this.hasLongPressDislike = new an<>("has_long_pressed_dislike", Boolean.FALSE);
            this.cacheItems.add(this.hasLongPressDislike);
        }
        return this.hasLongPressDislike;
    }

    public an<Boolean> getHasShowRemarkNamePopup() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22844, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22844, new Class[0], an.class);
        }
        if (this.hasShowRemarkNamePopup == null) {
            this.hasShowRemarkNamePopup = new an<>("is_show_remarkname_popup", Boolean.FALSE);
            this.cacheItems.add(this.hasShowRemarkNamePopup);
        }
        return this.hasShowRemarkNamePopup;
    }

    public an<String> getHitRankActivityProfileBackground() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22880, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22880, new Class[0], an.class);
        }
        if (this.hitRankActivityProfileBackgroud == null) {
            this.hitRankActivityProfileBackgroud = new an<>("HIT_RANK_ACTIVITY_PROFILE_BACKGROUND", "");
            this.cacheItems.add(this.hitRankActivityProfileBackgroud);
        }
        return this.hitRankActivityProfileBackgroud;
    }

    public an<String> getHitRankActivityStarBackground() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22879, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22879, new Class[0], an.class);
        }
        if (this.hitRankActivityStarBackground == null) {
            this.hitRankActivityStarBackground = new an<>("hit_rank_activity_star_background", "");
            this.cacheItems.add(this.hitRankActivityStarBackground);
        }
        return this.hitRankActivityStarBackground;
    }

    public an<String> getHotsoonDownloadUrl() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22776, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22776, new Class[0], an.class);
        }
        if (this.hotsoonDownloadUrl == null) {
            this.hotsoonDownloadUrl = new an<>("hotsoon_download_url", "");
            this.cacheItems.add(this.hotsoonDownloadUrl);
        }
        return this.hotsoonDownloadUrl;
    }

    public an<Boolean> getIesOffline() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22652, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22652, new Class[0], an.class);
        }
        if (this.iesOffline == null) {
            this.iesOffline = new an<>("iesoffline", Boolean.TRUE);
            this.cacheItems.add(this.iesOffline);
        }
        return this.iesOffline;
    }

    public boolean getImCommentForwardEnabled() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22819, new Class[0], Boolean.TYPE)) {
            return ((Boolean) getImCommentForwardEnabledItem().c()).booleanValue();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22819, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public String getImUrlTemplate() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22813, new Class[0], String.class)) {
            return (String) getImUrlTemplateItem().c();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22813, new Class[0], String.class);
    }

    public an<String> getImUrlTemplateItem() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22812, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22812, new Class[0], an.class);
        }
        if (this.imUrlTemplate == null) {
            this.imUrlTemplate = new an<>("im_url_template", "");
            this.cacheItems.add(this.imUrlTemplate);
        }
        return this.imUrlTemplate;
    }

    public an<String> getInvitedContacts() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22888, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22888, new Class[0], an.class);
        }
        if (this.invitedContacts == null) {
            this.invitedContacts = new an<>("invite_friends", "");
            this.cacheItems.add(this.invitedContacts);
        }
        return this.invitedContacts;
    }

    public an<Boolean> getIsAwemePrivate() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22703, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22703, new Class[0], an.class);
        }
        if (this.isAwemePrivate == null) {
            this.isAwemePrivate = new an<>("is_aweme_private", Boolean.FALSE);
            this.cacheItems.add(this.isAwemePrivate);
        }
        return this.isAwemePrivate;
    }

    public an<Boolean> getIsBubbleShown() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22685, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22685, new Class[0], an.class);
        }
        if (this.isBubbleShown == null) {
            this.isBubbleShown = new an<>("bubble_shown", Boolean.FALSE);
            this.cacheItems.add(this.isBubbleShown);
        }
        return this.isBubbleShown;
    }

    public an<Boolean> getIsChangeFollowTab() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22677, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22677, new Class[0], an.class);
        }
        if (this.ischangeFollowTab == null) {
            this.ischangeFollowTab = new an<>("is_change_follow_tab", Boolean.FALSE);
            this.cacheItems.add(this.ischangeFollowTab);
        }
        return this.ischangeFollowTab;
    }

    public an<Boolean> getIsContactsUploaded() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22641, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22641, new Class[0], an.class);
        }
        if (this.isContactsUploaded == null) {
            this.isContactsUploaded = new an<>("contacts_uploaded", Boolean.FALSE);
            this.cacheItems.add(this.isContactsUploaded);
        }
        return this.isContactsUploaded;
    }

    public an<Boolean> getIsEnableCacheUserInsert() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22931, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22931, new Class[0], an.class);
        }
        if (this.enableCacheUserInsert == null) {
            this.enableCacheUserInsert = new an<>("enable_cache_user_insert", Boolean.FALSE);
            this.cacheItems.add(this.enableCacheUserInsert);
        }
        return this.enableCacheUserInsert;
    }

    public an<Boolean> getIsEnableCacheUserList() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22930, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22930, new Class[0], an.class);
        }
        if (this.enableCacheUserList == null) {
            this.enableCacheUserList = new an<>("enable_cache_user_list", Boolean.FALSE);
            this.cacheItems.add(this.enableCacheUserList);
        }
        return this.enableCacheUserList;
    }

    public an<Boolean> getIsEnableLocalMusicEntrance() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22863, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22863, new Class[0], an.class);
        }
        if (this.isEnableLocalMusicEntrance == null) {
            this.isEnableLocalMusicEntrance = new an<>("is_enable_local_music_entrance", Boolean.FALSE);
            this.cacheItems.add(this.isEnableLocalMusicEntrance);
        }
        return this.isEnableLocalMusicEntrance;
    }

    public an<Boolean> getIsEnableUpdateUserDialog() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22939, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22939, new Class[0], an.class);
        }
        if (this.isEnableUpdateUserDialog == null) {
            this.isEnableUpdateUserDialog = new an<>("is_enable_update_user", Boolean.FALSE);
            this.cacheItems.add(this.isEnableUpdateUserDialog);
        }
        return this.isEnableUpdateUserDialog;
    }

    public an<Boolean> getIsFirstFavouriteSuccess() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22839, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22839, new Class[0], an.class);
        }
        if (this.isFirstFavouriteSuccess == null) {
            this.isFirstFavouriteSuccess = new an<>("first_favourite_success", Boolean.FALSE);
            this.cacheItems.add(this.isFirstFavouriteSuccess);
        }
        return this.isFirstFavouriteSuccess;
    }

    public an<Boolean> getIsFirstLaunch() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22683, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22683, new Class[0], an.class);
        }
        if (this.isFirstLaunch == null) {
            this.isFirstLaunch = new an<>("is_first_lauch", Boolean.TRUE);
            this.cacheItems.add(this.isFirstLaunch);
        }
        return this.isFirstLaunch;
    }

    public boolean getIsFirstPublishAweme() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22717, new Class[0], Boolean.TYPE)) {
            return ((Boolean) getFirstPublishAwemeItem().c()).booleanValue();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22717, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean getIsFirstPublishComment() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22720, new Class[0], Boolean.TYPE)) {
            return ((Boolean) getFirstPublishCommentItem().c()).booleanValue();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22720, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public an<Boolean> getIsFirstReportVideo() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22764, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22764, new Class[0], an.class);
        }
        if (this.isFirstReportVideo == null) {
            this.isFirstReportVideo = new an<>("is_first_report_video", Boolean.TRUE);
            this.cacheItems.add(this.isFirstReportVideo);
        }
        return this.isFirstReportVideo;
    }

    public an<Boolean> getIsFirstSetPrivate() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22701, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22701, new Class[0], an.class);
        }
        if (this.isFirstSetPrivate == null) {
            this.isFirstSetPrivate = new an<>("first_set_aweme_private", Boolean.TRUE);
            this.cacheItems.add(this.isFirstSetPrivate);
        }
        return this.isFirstSetPrivate;
    }

    public an<Boolean> getIsFirstShowFavouriteAnimation() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22837, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22837, new Class[0], an.class);
        }
        if (this.isFirstShowFavouriteAnimation == null) {
            this.isFirstShowFavouriteAnimation = new an<>("first_show_favourite_animation", Boolean.FALSE);
            this.cacheItems.add(this.isFirstShowFavouriteAnimation);
        }
        return this.isFirstShowFavouriteAnimation;
    }

    public an<Boolean> getIsGrantedLocationPermission() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22686, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22686, new Class[0], an.class);
        }
        if (this.isGrantedLocationPermission == null) {
            this.isGrantedLocationPermission = new an<>("location_granted", Boolean.FALSE);
            this.cacheItems.add(this.isGrantedLocationPermission);
        }
        return this.isGrantedLocationPermission;
    }

    public an<Boolean> getIsHotSearchAwemeBillboardEnable() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22858, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22858, new Class[0], an.class);
        }
        if (this.isHotSearchAwemeBillboardEnable == null) {
            this.isHotSearchAwemeBillboardEnable = new an<>("is_hot_search_aweme_billboard_enable", Boolean.FALSE);
            this.cacheItems.add(this.isHotSearchAwemeBillboardEnable);
        }
        return this.isHotSearchAwemeBillboardEnable;
    }

    public an<Boolean> getIsHotSearchBillboardEnable() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22856, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22856, new Class[0], an.class);
        }
        if (this.isHotSearchBillboardEnable == null) {
            this.isHotSearchBillboardEnable = new an<>("is_hot_search_billboard_enable", Boolean.FALSE);
            this.cacheItems.add(this.isHotSearchBillboardEnable);
        }
        return this.isHotSearchBillboardEnable;
    }

    public an<Boolean> getIsHotSearchMusicalBillboardEnable() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22857, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22857, new Class[0], an.class);
        }
        if (this.isHotSearchMusicalBillboardEnable == null) {
            this.isHotSearchMusicalBillboardEnable = new an<>("is_hot_search_music_billboard_enable", Boolean.FALSE);
            this.cacheItems.add(this.isHotSearchMusicalBillboardEnable);
        }
        return this.isHotSearchMusicalBillboardEnable;
    }

    public an<Boolean> getIsHotSearchPositiveEnergyBillboardEnable() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22859, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22859, new Class[0], an.class);
        }
        if (this.isHotSearchPositiveEnergyBillboardEnable == null) {
            this.isHotSearchPositiveEnergyBillboardEnable = new an<>("is_hot_search_positive_energy_billboard_enable", Boolean.FALSE);
            this.cacheItems.add(this.isHotSearchPositiveEnergyBillboardEnable);
        }
        return this.isHotSearchPositiveEnergyBillboardEnable;
    }

    public an<Boolean> getIsLike2DynamicBubbleHasShowed() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22661, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22661, new Class[0], an.class);
        }
        if (this.isLike2DynamicBubbleHasShowed == null) {
            this.isLike2DynamicBubbleHasShowed = new an<>("profile_like2dynamic_bubble_has_showed", Boolean.FALSE);
            this.cacheItems.add(this.isLike2DynamicBubbleHasShowed);
        }
        return this.isLike2DynamicBubbleHasShowed;
    }

    public an<Boolean> getIsOldUser() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22656, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22656, new Class[0], an.class);
        }
        if (this.isOldUser == null) {
            this.isOldUser = new an<>("old_user", Boolean.FALSE);
            this.cacheItems.add(this.isOldUser);
        }
        return this.isOldUser;
    }

    public an<Boolean> getIsPoiBubbleShown() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22670, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22670, new Class[0], an.class);
        }
        if (this.isPoiBubbleShown == null) {
            this.isPoiBubbleShown = new an<>("poi_bubble_shown", Boolean.TRUE);
            this.cacheItems.add(this.isPoiBubbleShown);
        }
        return this.isPoiBubbleShown;
    }

    public an<Boolean> getIsPrivateAvailable() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22702, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22702, new Class[0], an.class);
        }
        if (this.isPrivateAvailable == null) {
            this.isPrivateAvailable = new an<>("private_aweme_available", Boolean.TRUE);
            this.cacheItems.add(this.isPrivateAvailable);
        }
        return this.isPrivateAvailable;
    }

    public an<Boolean> getIsProfileBubbleShown() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22659, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22659, new Class[0], an.class);
        }
        if (this.isProfileBubbleShown == null) {
            this.isProfileBubbleShown = new an<>("profile_bubble_shown", Boolean.TRUE);
            this.cacheItems.add(this.isProfileBubbleShown);
        }
        return this.isProfileBubbleShown;
    }

    public an<Boolean> getIsProfileNavBarBubbleShown() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22660, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22660, new Class[0], an.class);
        }
        if (this.isProfileNavbarBubbleShown == null) {
            this.isProfileNavbarBubbleShown = new an<>("profile_bubble_navbar_shown", Boolean.FALSE);
            this.cacheItems.add(this.isProfileNavbarBubbleShown);
        }
        return this.isProfileNavbarBubbleShown;
    }

    public an<Boolean> getIsShowAllowDownloadTipSetting() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22862, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22862, new Class[0], an.class);
        }
        if (this.isShowAllowDownloadTipSetting == null) {
            this.isShowAllowDownloadTipSetting = new an<>("isShowAllowDownloadTip", Boolean.FALSE);
            this.cacheItems.add(this.isShowAllowDownloadTipSetting);
        }
        return this.isShowAllowDownloadTipSetting;
    }

    public an<Boolean> getIsShowFavouriteIcon() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22836, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22836, new Class[0], an.class);
        }
        if (this.isShowFavouriteIcon == null) {
            this.isShowFavouriteIcon = new an<>("show_favourite_icon", Boolean.FALSE);
            this.cacheItems.add(this.isShowFavouriteIcon);
        }
        return this.isShowFavouriteIcon;
    }

    public an<Boolean> getIsShowFavouritePopup() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22843, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22843, new Class[0], an.class);
        }
        if (this.isShowFavouritePopup == null) {
            this.isShowFavouritePopup = new an<>("is_show_favourite_popup", Boolean.TRUE);
            this.cacheItems.add(this.isShowFavouritePopup);
        }
        return this.isShowFavouritePopup;
    }

    public an<Boolean> getIsShowHotSearchVideoTip() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22855, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22855, new Class[0], an.class);
        }
        if (this.isShowHotSearchVideoTip == null) {
            this.isShowHotSearchVideoTip = new an<>("is_show_hot_search_video_tip", Boolean.TRUE);
            this.cacheItems.add(this.isShowHotSearchVideoTip);
        }
        return this.isShowHotSearchVideoTip;
    }

    public an<Boolean> getIsShowRankingIndicator() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22860, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22860, new Class[0], an.class);
        }
        if (this.isShowRankingIndicator == null) {
            this.isShowRankingIndicator = new an<>("is_show_ranking_indicator", Boolean.TRUE);
            this.cacheItems.add(this.isShowRankingIndicator);
        }
        return this.isShowRankingIndicator;
    }

    public an<Boolean> getIsShowUserFeedBackPoint() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22928, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22928, new Class[0], an.class);
        }
        if (this.isShowUserFeedBackPoint == null) {
            this.isShowUserFeedBackPoint = new an<>("si_show_user_feed_back_point", Boolean.FALSE);
            this.cacheItems.add(this.isShowUserFeedBackPoint);
        }
        return this.isShowUserFeedBackPoint;
    }

    public an<Boolean> getIsTargetBindingUser() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22873, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22873, new Class[0], an.class);
        }
        if (this.isTargetBindingUser == null) {
            this.isTargetBindingUser = new an<>("is_target_binding_user", Boolean.FALSE);
            this.cacheItems.add(this.isTargetBindingUser);
        }
        return this.isTargetBindingUser;
    }

    public an<Boolean> getIsUseBackRefresh() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22664, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22664, new Class[0], an.class);
        }
        if (this.isUseBackRefresh == null) {
            this.isUseBackRefresh = new an<>("is_use_back_refresh", Boolean.TRUE);
            this.cacheItems.add(this.isUseBackRefresh);
        }
        return this.isUseBackRefresh;
    }

    public an<Boolean> getIsUseTTnet() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22689, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22689, new Class[0], an.class);
        }
        if (this.isUseTTnet == null) {
            this.isUseTTnet = new an<>("is_use_ttnet", Boolean.FALSE);
            this.cacheItems.add(this.isUseTTnet);
        }
        return this.isUseTTnet;
    }

    public an<Boolean> getIsUseTongdunSdk() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22663, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22663, new Class[0], an.class);
        }
        if (this.isUseTongdunSdk == null) {
            this.isUseTongdunSdk = new an<>("is_use_tongdun_sdk", Boolean.TRUE);
            this.cacheItems.add(this.isUseTongdunSdk);
        }
        return this.isUseTongdunSdk;
    }

    public an<String> getJsActlogUrl() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22750, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22750, new Class[0], an.class);
        }
        if (this.jsActlogUrl == null) {
            this.jsActlogUrl = new an<>("js_actlog_url", "");
            this.cacheItems.add(this.jsActlogUrl);
        }
        return this.jsActlogUrl;
    }

    public an<String> getJudgementClauseScheme() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22934, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22934, new Class[0], an.class);
        }
        if (this.judgementClauseScheme == null) {
            this.judgementClauseScheme = new an<>("judgement_clause_scheme", "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fjudgment_clause%2F%3Fhide_nav_bar%3D1&hide_nav_bar=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Dfe_app_rn_patch%26bundle_name%3Dfe_app_rn%26module_name%3Dpage_judgment_clause%26bg_theme%3D%2523161823%26loading_bgcolor%3D%2523161823%26hide_nav_bar%3D1");
            this.cacheItems.add(this.judgementClauseScheme);
        }
        return this.judgementClauseScheme;
    }

    @I18n
    public long getLastInviteAllTimeStamp() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22893, new Class[0], Long.TYPE)) {
            return ((Long) getLastInviteAllTimeStampItem().c()).longValue();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22893, new Class[0], Long.TYPE)).longValue();
    }

    public an<Boolean> getLastPublishFailed() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22658, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22658, new Class[0], an.class);
        }
        if (this.lastPublishFailed == null) {
            this.lastPublishFailed = new an<>("last_publish_failed", Boolean.FALSE);
            this.cacheItems.add(this.lastPublishFailed);
        }
        return this.lastPublishFailed;
    }

    public an<String> getLastUploadPassCode() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22765, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22765, new Class[0], an.class);
        }
        if (this.lastUploadPassCode == null) {
            this.lastUploadPassCode = new an<>("hasuploadpasscode", "");
            this.cacheItems.add(this.lastUploadPassCode);
        }
        return this.lastUploadPassCode;
    }

    public an<Integer> getLastUsableNetworkSpeed() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22744, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22744, new Class[0], an.class);
        }
        if (this.lastUsableNetworkSpeed == null) {
            this.lastUsableNetworkSpeed = new an<>("last_usable_network_speed", -1);
        }
        return this.lastUsableNetworkSpeed;
    }

    public an<Boolean> getLiveSkylightShowAnimation() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22666, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22666, new Class[0], an.class);
        }
        if (this.liveSkylightShowAnimation == null) {
            this.liveSkylightShowAnimation = new an<>("live_skylight_show_animation", Boolean.FALSE);
            this.cacheItems.add(this.liveSkylightShowAnimation);
        }
        return this.liveSkylightShowAnimation;
    }

    public an<Boolean> getLongVideoPermitted() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22729, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22729, new Class[0], an.class);
        }
        if (this.longVideoPermitted == null) {
            this.longVideoPermitted = new an<>("long_video_permitted", Boolean.FALSE);
            this.cacheItems.add(this.longVideoPermitted);
        }
        return this.longVideoPermitted;
    }

    public an<String> getMiniAppLabelTitle() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22633, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22633, new Class[0], an.class);
        }
        if (this.miniAppLabTitle == null) {
            this.miniAppLabTitle = new an<>("lab_title", "");
            this.cacheItems.add(this.miniAppLabTitle);
        }
        return this.miniAppLabTitle;
    }

    public an<String> getMpTab() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22616, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22616, new Class[0], an.class);
        }
        if (this.mpTab == null) {
            this.mpTab = new an<>("mp_tab", "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fmp_tab%3Fhide_nav_bar%3D1%26enter_from%3DrnToWeb");
            this.cacheItems.add(this.mpTab);
        }
        return this.mpTab;
    }

    public int getMultiSelectLimit() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22816, new Class[0], Integer.TYPE)) {
            return ((Integer) getMultiSelectLimitItem().c()).intValue();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22816, new Class[0], Integer.TYPE)).intValue();
    }

    public an<String> getMusicBillboardRuleUrl() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22883, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22883, new Class[0], an.class);
        }
        if (this.musicBillboardRuleUrl == null) {
            this.musicBillboardRuleUrl = new an<>("music_billboard_rule_url", "");
            this.cacheItems.add(this.musicBillboardRuleUrl);
        }
        return this.musicBillboardRuleUrl;
    }

    public an<String> getMusicRingtoneScheme() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22617, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22617, new Class[0], an.class);
        }
        if (this.musicRingtoneScheme == null) {
            this.musicRingtoneScheme = new an<>("music_ringtone_scheme", "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Fringtone%3Fhide_nav_bar%3D1&hide_nav_bar=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Dfe_app_rn_patch%26bundle_name%3Dfe_app_rn%26module_name%3Dpage_ringtone%26bg_theme%3D%2523161823%26hide_nav_bar%3D1");
            this.cacheItems.add(this.musicRingtoneScheme);
        }
        return this.musicRingtoneScheme;
    }

    @I18n
    public an<String> getNeedChooseLanguages() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22895, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22895, new Class[0], an.class);
        }
        if (this.needChooseLanguages == null) {
            this.needChooseLanguages = new an<>("need_choose_languages", "");
            this.cacheItems.add(this.needChooseLanguages);
        }
        return this.needChooseLanguages;
    }

    public int getNetworkLibType() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22714, new Class[0], Integer.TYPE)) {
            return ((Integer) getNetworkLibTypeItem().c()).intValue();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22714, new Class[0], Integer.TYPE)).intValue();
    }

    public an<Boolean> getNewAnchorShowBubble() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22779, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22779, new Class[0], an.class);
        }
        if (this.newAnchorShowBubble == null) {
            this.newAnchorShowBubble = new an<>("new_anchor_show_bubble", Boolean.FALSE);
            this.cacheItems.add(this.newAnchorShowBubble);
        }
        return this.newAnchorShowBubble;
    }

    public an<String> getOpenAppBackLogParams() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22583, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22583, new Class[0], an.class);
        }
        if (this.openAppBackLogParams == null) {
            this.openAppBackLogParams = new an<>("open_app_back_log_params", "");
        }
        return this.openAppBackLogParams;
    }

    public int getOpenImLink() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22799, new Class[0], Integer.TYPE)) {
            return ((Integer) getOpenImLinkItem().c()).intValue();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22799, new Class[0], Integer.TYPE)).intValue();
    }

    public an<String> getOrderShareIntroUrl() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22584, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22584, new Class[0], an.class);
        }
        if (this.orderShareIntroUrl == null) {
            this.orderShareIntroUrl = new an<>("order_share_intro_url", "");
            this.cacheItems.add(this.orderShareIntroUrl);
        }
        return this.orderShareIntroUrl;
    }

    public an<String> getOrginalMusicianUrl() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22746, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22746, new Class[0], an.class);
        }
        if (this.orginalMusicianUrl == null) {
            this.orginalMusicianUrl = new an<>("orginal_musician_url", "");
            this.cacheItems.add(this.orginalMusicianUrl);
        }
        return this.orginalMusicianUrl;
    }

    public an<Boolean> getOriginalMusiciaShareStyle() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22745, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22745, new Class[0], an.class);
        }
        if (this.originalMusiciaShareStyle == null) {
            this.originalMusiciaShareStyle = new an<>("original_musician_share_style", Boolean.FALSE);
            this.cacheItems.add(this.originalMusiciaShareStyle);
        }
        return this.originalMusiciaShareStyle;
    }

    public an<Boolean> getOriginalMusicianEntry() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22739, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22739, new Class[0], an.class);
        }
        if (this.originalMusicianEntry == null) {
            this.originalMusicianEntry = new an<>("original_musician_entry", Boolean.FALSE);
            this.cacheItems.add(this.originalMusicianEntry);
        }
        return this.originalMusicianEntry;
    }

    public an<String> getPoiErrorReport() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22926, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22926, new Class[0], an.class);
        }
        if (this.poiErrorReport == null) {
            this.poiErrorReport = new an<>("poi_error_report", "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fpoi_error_report%2F%3Fhide_nav_bar%3D1%26loading_bgcolor%3D%2523161823&hide_nav_bar=1&loading_bgcolor=%23161823&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Drn_patch%26bundle_name%3Dbusiness%26module_name%3Dpage_error_report%26force_h5%3D0%26bg_theme%3D%2523161823%26hide_nav_bar%3D1%26enter_from%3Dpoi_page");
            this.cacheItems.add(this.poiErrorReport);
        }
        return this.poiErrorReport;
    }

    public an<String> getPreviewGoodReport() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22927, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22927, new Class[0], an.class);
        }
        if (this.previewGoodReport == null) {
            this.previewGoodReport = new an<>("preview_good_report", "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fgoods_report%3Fhide_status_bar%3D0%26hide_nav_bar%3D1%26loading_bgcolor%3D%2523161823&hide_status_bar=0&hide_nav_bar=1&loading_bgcolor=%23161823");
            this.cacheItems.add(this.previewGoodReport);
        }
        return this.previewGoodReport;
    }

    public an<Integer> getPrivacyAccountFollowCount() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22943, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22943, new Class[0], an.class);
        }
        if (this.privacyAccountFollowCount == null) {
            this.privacyAccountFollowCount = new an<>("privacy_account_follow_count", 0);
        }
        return this.privacyAccountFollowCount;
    }

    public an<String> getPrivacyReminderH5Url() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22929, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22929, new Class[0], an.class);
        }
        if (this.privacyReminderH5Url == null) {
            this.privacyReminderH5Url = new an<>("privacy_reminder", "");
            this.cacheItems.add(this.privacyReminderH5Url);
        }
        return this.privacyReminderH5Url;
    }

    public an<String> getPromoteDialogPopupPopupContent() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22851, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22851, new Class[0], an.class);
        }
        if (this.promoteDialogPopupPopupContent == null) {
            this.promoteDialogPopupPopupContent = new an<>("promote_dialog_popup_content", "");
            this.cacheItems.add(this.promoteDialogPopupPopupContent);
        }
        return this.promoteDialogPopupPopupContent;
    }

    public an<String> getPromoteDialogPopupPopupLinkText() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22852, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22852, new Class[0], an.class);
        }
        if (this.promoteDialogPopupPopupLinkText == null) {
            this.promoteDialogPopupPopupLinkText = new an<>("promote_dialog_popup_linkText", "");
            this.cacheItems.add(this.promoteDialogPopupPopupLinkText);
        }
        return this.promoteDialogPopupPopupLinkText;
    }

    public an<String> getPromoteDialogPopupPopupMsg() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22850, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22850, new Class[0], an.class);
        }
        if (this.promoteDialogPopupPopupMsg == null) {
            this.promoteDialogPopupPopupMsg = new an<>("promote_dialog_popup_msg", "");
            this.cacheItems.add(this.promoteDialogPopupPopupMsg);
        }
        return this.promoteDialogPopupPopupMsg;
    }

    public an<String> getPromoteDialogPopupPopupTitle() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22849, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22849, new Class[0], an.class);
        }
        if (this.promoteDialogPopupPopupTitle == null) {
            this.promoteDialogPopupPopupTitle = new an<>("promote_dialog_popup_title", "");
            this.cacheItems.add(this.promoteDialogPopupPopupTitle);
        }
        return this.promoteDialogPopupPopupTitle;
    }

    public an<String> getPromoteDialogPopupPopupUrl() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22853, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22853, new Class[0], an.class);
        }
        if (this.promoteDialogPopupPopupUrl == null) {
            this.promoteDialogPopupPopupUrl = new an<>("promote_dialog_popup_url", "");
            this.cacheItems.add(this.promoteDialogPopupPopupUrl);
        }
        return this.promoteDialogPopupPopupUrl;
    }

    public an<Boolean> getPromoteDialogShouldShow() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22846, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22846, new Class[0], an.class);
        }
        if (this.promoteDialogShouldShow == null) {
            this.promoteDialogShouldShow = new an<>("promote_dialog_show", Boolean.FALSE);
            this.cacheItems.add(this.promoteDialogShouldShow);
        }
        return this.promoteDialogShouldShow;
    }

    public an<String> getReactAddShopUrl() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22797, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22797, new Class[0], an.class);
        }
        if (this.reactAddShopUrl == null) {
            this.reactAddShopUrl = new an<>("react_edit_draft_url", "https://aweme.snssdk.com/falcon/rn/business?hide_status_bar=0&hide_nav_bar=1&status_bar_color=ffffff&status_font_dark=1&loading_bgcolor=ffffff&initPage=home&hide_status_bar=0&hide_nav_bar=1&status_bar_color=ffffff&status_font_dark=1&loading_bgcolor=ffffff&initPage=home");
            this.cacheItems.add(this.reactAddShopUrl);
        }
        return this.reactAddShopUrl;
    }

    public an<String> getReactEShopToolboxUrl() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22798, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22798, new Class[0], an.class);
        }
        if (this.reactEShopToolboxUrl == null) {
            this.reactEShopToolboxUrl = new an<>("react_e_shop_tool_box_url", "https://aweme.snssdk.com/falcon/rn/eshop_toolbox?hide_status_bar=0&hide_nav_bar=1&status_bar_color=ffffff&status_font_dark=1&loading_bgcolor=ffffff&hide_status_bar=0&hide_nav_bar=1&status_bar_color=ffffff");
            this.cacheItems.add(this.reactEShopToolboxUrl);
        }
        return this.reactEShopToolboxUrl;
    }

    @I18n
    public an<String> getReferralEntrance() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22778, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22778, new Class[0], an.class);
        }
        if (this.referralEntrance == null) {
            this.referralEntrance = new an<>("invite_friends", "");
        }
        return this.referralEntrance;
    }

    public an<Boolean> getRemoveFollowerSwitch() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22743, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22743, new Class[0], an.class);
        }
        if (this.removeFollowerSwitch == null) {
            this.removeFollowerSwitch = new an<>("remove_follower_switch", Boolean.FALSE);
        }
        return this.removeFollowerSwitch;
    }

    public an<String> getRequestNotificationText() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22607, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22607, new Class[0], an.class);
        }
        if (this.requestNotificationText == null) {
            this.requestNotificationText = new an<>("request_notification_text", "");
            this.cacheItems.add(this.requestNotificationText);
        }
        return this.requestNotificationText;
    }

    public an<String> getRequestNotificationTitle() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22606, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22606, new Class[0], an.class);
        }
        if (this.requestNotificationTitle == null) {
            this.requestNotificationTitle = new an<>("request_notification_title", "");
            this.cacheItems.add(this.requestNotificationTitle);
        }
        return this.requestNotificationTitle;
    }

    public an<Boolean> getRnFallback() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22649, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22649, new Class[0], an.class);
        }
        if (this.rnFallback == null) {
            this.rnFallback = new an<>("rn_fallback", Boolean.FALSE);
            this.cacheItems.add(this.rnFallback);
        }
        return this.rnFallback;
    }

    public an<Boolean> getRnPreloadContextOn() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22592, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22592, new Class[0], an.class);
        }
        if (this.mRnPreloadContextOn == null) {
            this.mRnPreloadContextOn = new an<>("rn_preload_context_on", Boolean.TRUE);
            this.cacheItems.add(this.mRnPreloadContextOn);
        }
        return this.mRnPreloadContextOn;
    }

    public an<Boolean> getRnSnapshotOn() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22591, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22591, new Class[0], an.class);
        }
        if (this.mRnSnapshotOn == null) {
            this.mRnSnapshotOn = new an<>("rn_snap_shot_on", Boolean.TRUE);
            this.cacheItems.add(this.mRnSnapshotOn);
        }
        return this.mRnSnapshotOn;
    }

    public an<String> getSameCityActiveId() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22593, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22593, new Class[0], an.class);
        }
        if (this.sameCityActiveId == null) {
            this.sameCityActiveId = new an<>("same_city_active_id", "");
            this.cacheItems.add(this.sameCityActiveId);
        }
        return this.sameCityActiveId;
    }

    public an<String> getSearchTabIndex() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22787, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22787, new Class[0], an.class);
        }
        if (this.searchTabIndex == null) {
            this.searchTabIndex = new an<>("search_tab_index", "");
            this.cacheItems.add(this.searchTabIndex);
        }
        return this.searchTabIndex;
    }

    public an<String> getSearchTrendBannerUrl() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22874, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22874, new Class[0], an.class);
        }
        if (this.searchTrendBannerUrl == null) {
            this.searchTrendBannerUrl = new an<>("search_trend_banner_url", "");
            this.cacheItems.add(this.searchTrendBannerUrl);
        }
        return this.searchTrendBannerUrl;
    }

    public an<String> getShareCookieCacheItem() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22629, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22629, new Class[0], an.class);
        }
        if (this.shareCookieCacheItem == null) {
            this.shareCookieCacheItem = new an<>("share_cookie_domain", "");
            this.cacheItems.add(this.shareCookieCacheItem);
        }
        return this.shareCookieCacheItem;
    }

    public an<Boolean> getShiledMusicSDK() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22692, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22692, new Class[0], an.class);
        }
        if (this.shiledMusicSDK == null) {
            this.shiledMusicSDK = new an<>("shield_music_sdk", Boolean.FALSE);
            this.cacheItems.add(this.shiledMusicSDK);
        }
        return this.shiledMusicSDK;
    }

    public an<String> getShopWishListUrl() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22588, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22588, new Class[0], an.class);
        }
        if (this.shopWishListUrl == null) {
            this.shopWishListUrl = new an<>("shop_wish_list_url", "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fshop_wish_list%3Fhide_nav_bar%3D1%26loading_bgcolor%3D%2523FFFFFF%26bg_theme%3D%2523FFFFFF%26disable_pop_gesture%3D1&hide_nav_bar=1&loading_bgcolor=%23FFFFFF&bg_theme=%23FFFFFF&disable_pop_gesture=1");
            this.cacheItems.add(this.shopWishListUrl);
        }
        return this.shopWishListUrl;
    }

    public an<Boolean> getShouldShowFavouriteTip() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22840, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22840, new Class[0], an.class);
        }
        if (this.shouldShowFavouriteTip == null) {
            this.shouldShowFavouriteTip = new an<>("should_show_favourite_tip", Boolean.TRUE);
            this.cacheItems.add(this.shouldShowFavouriteTip);
        }
        return this.shouldShowFavouriteTip;
    }

    public an<Boolean> getShouldShowPrivateAccountTipInProfile() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22881, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22881, new Class[0], an.class);
        }
        if (this.shouldShowPrivateAccountTipInProfile == null) {
            this.shouldShowPrivateAccountTipInProfile = new an<>("show_private_account_tip_in_profile", Boolean.FALSE);
            this.cacheItems.add(this.shouldShowPrivateAccountTipInProfile);
        }
        return this.shouldShowPrivateAccountTipInProfile;
    }

    public an<Boolean> getShowAdIntroItem() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22871, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22871, new Class[0], an.class);
        }
        if (this.showAdIntroFlag == null) {
            this.showAdIntroFlag = new an<>("is_show_ad_intro", Boolean.FALSE);
            this.cacheItems.add(this.showAdIntroFlag);
        }
        return this.showAdIntroFlag;
    }

    public an<Boolean> getShowAddBusinessGoodsDot() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22595, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22595, new Class[0], an.class);
        }
        if (this.showAddBusinessGoodsDot == null) {
            this.showAddBusinessGoodsDot = new an<>("show_add_business_dot", Boolean.TRUE);
            this.cacheItems.add(this.showAddBusinessGoodsDot);
        }
        return this.showAddBusinessGoodsDot;
    }

    public an<Boolean> getShowCouponItem() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22870, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22870, new Class[0], an.class);
        }
        if (this.showCouponItem == null) {
            this.showCouponItem = new an<>("is_show_coupon_item", Boolean.TRUE);
            this.cacheItems.add(this.showCouponItem);
        }
        return this.showCouponItem;
    }

    public an<Boolean> getShowFansCard() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22763, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22763, new Class[0], an.class);
        }
        if (this.showFansCard == null) {
            this.showFansCard = new an<>("show_fans_card", Boolean.TRUE);
            this.cacheItems.add(this.showFansCard);
        }
        return this.showFansCard;
    }

    public an<Boolean> getShowInteractionStickers() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22742, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22742, new Class[0], an.class);
        }
        if (this.showInteractionStickers == null) {
            this.showInteractionStickers = new an<>("show_interaction_stickers", Boolean.FALSE);
        }
        return this.showInteractionStickers;
    }

    public an<Boolean> getShowMiniAppFreshGuideBubble() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22635, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22635, new Class[0], an.class);
        }
        if (this.showMiniAppFreshGuideBubble == null) {
            this.showMiniAppFreshGuideBubble = new an<>("show_mini_app_fresh_guide_bubble", Boolean.FALSE);
            this.cacheItems.add(this.showMiniAppFreshGuideBubble);
        }
        return this.showMiniAppFreshGuideBubble;
    }

    public an<Boolean> getShowMiniAppFreshGuideDialog() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22634, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22634, new Class[0], an.class);
        }
        if (this.showMiniAppFreshGuideDialog == null) {
            this.showMiniAppFreshGuideDialog = new an<>("show_mini_app_fresh_guide_dialog", Boolean.FALSE);
            this.cacheItems.add(this.showMiniAppFreshGuideDialog);
        }
        return this.showMiniAppFreshGuideDialog;
    }

    public an<Boolean> getShowMiniAppFreshGuideNotify() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22632, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22632, new Class[0], an.class);
        }
        if (this.showMiniAppFreshGuideNotify == null) {
            this.showMiniAppFreshGuideNotify = new an<>("show_mini_app_fresh_guide_notify", Boolean.FALSE);
            this.cacheItems.add(this.showMiniAppFreshGuideNotify);
        }
        return this.showMiniAppFreshGuideNotify;
    }

    public an<Boolean> getShowPlayerInfoUI() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22841, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22841, new Class[0], an.class);
        }
        if (this.showPlayerInfoUI == null) {
            this.showPlayerInfoUI = new an<>("show_player_info_ui", Boolean.FALSE);
            this.cacheItems.add(this.showPlayerInfoUI);
        }
        return this.showPlayerInfoUI;
    }

    public an<Boolean> getShowTimeLineTab() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22657, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22657, new Class[0], an.class);
        }
        if (this.showTimeLineTab == null) {
            this.showTimeLineTab = new an<>("show_timeline_tab", Boolean.FALSE);
            this.cacheItems.add(this.showTimeLineTab);
        }
        return this.showTimeLineTab;
    }

    public an<Boolean> getShowVideoBitrateInfo() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22842, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22842, new Class[0], an.class);
        }
        if (this.showVideoBitrateInfo == null) {
            this.showVideoBitrateInfo = new an<>("showVideoBitrateInfo", Boolean.FALSE);
            this.cacheItems.add(this.showVideoBitrateInfo);
        }
        return this.showVideoBitrateInfo;
    }

    public an<String> getStarAtlasOrderWebUrl() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22619, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22619, new Class[0], an.class);
        }
        if (this.starAtlasOrderWebUrl == null) {
            this.starAtlasOrderWebUrl = new an<>("star_atlas_order", "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fstar_atlas_order%3Fhide_nav_bar%3D1%26enter_from%3DrnToWeb&hide_nav_bar=1&enter_from=rnToWeb");
            this.cacheItems.add(this.starAtlasOrderWebUrl);
        }
        return this.starAtlasOrderWebUrl;
    }

    public an<String> getStarBillboardRuleUrl() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22884, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22884, new Class[0], an.class);
        }
        if (this.starBillboardRuleUrl == null) {
            this.starBillboardRuleUrl = new an<>("star_billboard_rule_url", "");
            this.cacheItems.add(this.starBillboardRuleUrl);
        }
        return this.starBillboardRuleUrl;
    }

    public an<Boolean> getStickerArtEntry() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22748, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22748, new Class[0], an.class);
        }
        if (this.stickerArtEntry == null) {
            this.stickerArtEntry = new an<>("sticker_artist_entry", Boolean.FALSE);
            this.cacheItems.add(this.stickerArtEntry);
        }
        return this.stickerArtEntry;
    }

    public an<String> getStickerArtlistUrl() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22747, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22747, new Class[0], an.class);
        }
        if (this.stickerArtlistUrl == null) {
            this.stickerArtlistUrl = new an<>("sticker_artlist_url", "");
            this.cacheItems.add(this.stickerArtlistUrl);
        }
        return this.stickerArtlistUrl;
    }

    public an<String> getStoryFontType() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22919, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22919, new Class[0], an.class);
        }
        if (this.storyFontType == null) {
            this.storyFontType = new an<>("story_font_type", "");
        }
        return this.storyFontType;
    }

    public an<Boolean> getStoryPublishFriendsBanner() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22909, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22909, new Class[0], an.class);
        }
        if (this.storyPublishFriendsDuoshanBanner == null) {
            this.storyPublishFriendsDuoshanBanner = new an<>("story_publish_friend_banner", Boolean.FALSE);
        }
        return this.storyPublishFriendsDuoshanBanner;
    }

    public an<Boolean> getStoryPublishSaveLocal() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22920, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22920, new Class[0], an.class);
        }
        if (this.storyPublishSaveLocal == null) {
            this.storyPublishSaveLocal = new an<>("story_publish_save_local", Boolean.TRUE);
            this.cacheItems.add(this.storyPublishSaveLocal);
        }
        return this.storyPublishSaveLocal;
    }

    public an<Boolean> getStoryQuickPanelShowInActivity() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22900, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22900, new Class[0], an.class);
        }
        if (this.storyQuickPanelShowInActivity == null) {
            this.storyQuickPanelShowInActivity = new an<>("story_festival_sticker_quick_panel_activity_show", Boolean.FALSE);
        }
        return this.storyQuickPanelShowInActivity;
    }

    public an<Boolean> getStoryRecordGuideShow() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22896, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22896, new Class[0], an.class);
        }
        if (this.storyRecordGuideShow == null) {
            this.storyRecordGuideShow = new an<>("story_record_guide_show", Boolean.FALSE);
        }
        return this.storyRecordGuideShow;
    }

    public an<String> getStoryRegisterPublishSyncHintContent() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22902, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22902, new Class[0], an.class);
        }
        if (this.storyRegisterPublishSyncHintContent == null) {
            this.storyRegisterPublishSyncHintContent = new an<>("story_publish_register_sync_hint_content", "");
            this.cacheItems.add(this.storyRegisterPublishSyncHintContent);
        }
        return this.storyRegisterPublishSyncHintContent;
    }

    public an<String> getStoryRegisterPublishSyncHintH5Str() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22903, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22903, new Class[0], an.class);
        }
        if (this.storyRegisterPublishSyncHintH5Str == null) {
            this.storyRegisterPublishSyncHintH5Str = new an<>("story_publish_register_sync_hint_h5", "");
            this.cacheItems.add(this.storyRegisterPublishSyncHintH5Str);
        }
        return this.storyRegisterPublishSyncHintH5Str;
    }

    public an<String> getStoryRegisterPublishSyncHintH5Url() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22904, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22904, new Class[0], an.class);
        }
        if (this.storyRegisterPublishSyncHintH5Url == null) {
            this.storyRegisterPublishSyncHintH5Url = new an<>("story_publish_register_sync_hint_h5_url", "");
            this.cacheItems.add(this.storyRegisterPublishSyncHintH5Url);
        }
        return this.storyRegisterPublishSyncHintH5Url;
    }

    public an<String> getStoryRegisterPublishSyncHintTitle() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22901, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22901, new Class[0], an.class);
        }
        if (this.storyRegisterPublishSyncHintTitle == null) {
            this.storyRegisterPublishSyncHintTitle = new an<>("story_publish_register_sync_hint_title", "");
            this.cacheItems.add(this.storyRegisterPublishSyncHintTitle);
        }
        return this.storyRegisterPublishSyncHintTitle;
    }

    public an<Boolean> getStorySettingDoudouPhoto() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22915, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22915, new Class[0], an.class);
        }
        if (this.storySettingDoudouPhoto == null) {
            this.storySettingDoudouPhoto = new an<>("story_setting_duodou_photo", Boolean.TRUE);
        }
        return this.storySettingDoudouPhoto;
    }

    public an<Boolean> getStorySettingManualOpenDoudou() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22918, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22918, new Class[0], an.class);
        }
        if (this.storySettingManualOpenDoudou == null) {
            this.storySettingManualOpenDoudou = new an<>("story_setting_manual_open_doudou", Boolean.FALSE);
            this.cacheItems.add(this.storySettingManualOpenDoudou);
        }
        return this.storySettingManualOpenDoudou;
    }

    public an<Integer> getStorySettingReplyPermission() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22913, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22913, new Class[0], an.class);
        }
        if (this.storySettingReplyPermission == null) {
            this.storySettingReplyPermission = new an<>("story_setting_reply_permission", 0);
        }
        return this.storySettingReplyPermission;
    }

    public an<Boolean> getStorySettingSyncDuoshan() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22914, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22914, new Class[0], an.class);
        }
        if (this.storySettingSyncDuoshan == null) {
            this.storySettingSyncDuoshan = new an<>("story_setting_sync_duoshan", Boolean.FALSE);
        }
        return this.storySettingSyncDuoshan;
    }

    public an<Integer> getStorySettingViewPermission() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22912, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22912, new Class[0], an.class);
        }
        if (this.storySettingViewPermission == null) {
            this.storySettingViewPermission = new an<>("story_setting_view_permission", 0);
        }
        return this.storySettingViewPermission;
    }

    public an<String> getStoryShakeLastTime() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22898, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22898, new Class[0], an.class);
        }
        if (this.storyShakeLastTime == null) {
            this.storyShakeLastTime = new an<>("story_festival_last_shake_card_time", "");
        }
        return this.storyShakeLastTime;
    }

    public an<Boolean> getStoryShakeSurpriseHintShow() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22897, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22897, new Class[0], an.class);
        }
        if (this.storyShakeSurpriseHintShow == null) {
            this.storyShakeSurpriseHintShow = new an<>("story_shake_video_surprise_hint", Boolean.FALSE);
        }
        return this.storyShakeSurpriseHintShow;
    }

    public an<Long> getStoryStickerQuickPanelCloseTime() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22899, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22899, new Class[0], an.class);
        }
        if (this.storyStickerQuickPanelCloseTime == null) {
            this.storyStickerQuickPanelCloseTime = new an<>("story_festival_sticker_quick_panel_close_time", 0L);
        }
        return this.storyStickerQuickPanelCloseTime;
    }

    public an<String> getStoryUnRegisterPublishSyncHintContent() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22906, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22906, new Class[0], an.class);
        }
        if (this.storyUnRegisterPublishSyncHintContent == null) {
            this.storyUnRegisterPublishSyncHintContent = new an<>("story_publish_unregister_sync_hint_content", "");
            this.cacheItems.add(this.storyUnRegisterPublishSyncHintContent);
        }
        return this.storyUnRegisterPublishSyncHintContent;
    }

    public an<String> getStoryUnRegisterPublishSyncHintH5Str() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22907, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22907, new Class[0], an.class);
        }
        if (this.storyUnRegisterPublishSyncHintH5Str == null) {
            this.storyUnRegisterPublishSyncHintH5Str = new an<>("story_publish_unregister_sync_hint_h5", "");
            this.cacheItems.add(this.storyUnRegisterPublishSyncHintH5Str);
        }
        return this.storyUnRegisterPublishSyncHintH5Str;
    }

    public an<String> getStoryUnRegisterPublishSyncHintH5Url() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22908, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22908, new Class[0], an.class);
        }
        if (this.storyUnRegisterPublishSyncHintH5Url == null) {
            this.storyUnRegisterPublishSyncHintH5Url = new an<>("story_publish_unregister_sync_hint_h5_url", "");
            this.cacheItems.add(this.storyUnRegisterPublishSyncHintH5Url);
        }
        return this.storyUnRegisterPublishSyncHintH5Url;
    }

    public an<String> getStoryUnRegisterPublishSyncHintTitle() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22905, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22905, new Class[0], an.class);
        }
        if (this.storyUnRegisterPublishSyncHintTitle == null) {
            this.storyUnRegisterPublishSyncHintTitle = new an<>("story_publish_unregister_sync_hint_title", "");
            this.cacheItems.add(this.storyUnRegisterPublishSyncHintTitle);
        }
        return this.storyUnRegisterPublishSyncHintTitle;
    }

    public an<Boolean> getSyncTTFirstPublish() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22762, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22762, new Class[0], an.class);
        }
        if (this.syncTTFirstPublish == null) {
            this.syncTTFirstPublish = new an<>("sync_to_toutiao_first_publish", Boolean.TRUE);
            this.cacheItems.add(this.syncTTFirstPublish);
        }
        return this.syncTTFirstPublish;
    }

    public an<String> getSyncToTTUrl() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22760, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22760, new Class[0], an.class);
        }
        if (this.syncToTTUrl == null) {
            this.syncToTTUrl = new an<>("sync_to_toutiao_url", "");
            this.cacheItems.add(this.syncToTTUrl);
        }
        return this.syncToTTUrl;
    }

    public an<Boolean> getTTRegion() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22876, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22876, new Class[0], an.class);
        }
        if (this.ttRegion == null) {
            this.ttRegion = new an<>("ttregion", Boolean.FALSE);
            this.cacheItems.add(this.ttRegion);
        }
        return this.ttRegion;
    }

    public an<Boolean> getTTRoute() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22877, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22877, new Class[0], an.class);
        }
        if (this.ttRoute == null) {
            this.ttRoute = new an<>("ttroute", Boolean.FALSE);
            this.cacheItems.add(this.ttRoute);
        }
        return this.ttRoute;
    }

    public an<String> getTeenagerProtectionScheme() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22618, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22618, new Class[0], an.class);
        }
        if (this.teenagerProtectionScheme == null) {
            this.teenagerProtectionScheme = new an<>("TEENAGER_PROTECTION_SCHEME", " aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fteen_protection_appeal%2F%3Fhide_nav_bar%3D1&hide_nav_bar=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Dfe_app_rn_patch%26bundle_name%3Dfe_app_rn%26module_name%3Dpage_teen_protection_appeal%26bg_theme%3D%2523161823%26loading_bgcolor%3D%2523161823%26hide_nav_bar%3D1");
            this.cacheItems.add(this.teenagerProtectionScheme);
        }
        return this.teenagerProtectionScheme;
    }

    @I18n
    public an<String> getTwitterAccessToken() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22693, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22693, new Class[0], an.class);
        }
        if (this.twitterAccessToken == null) {
            this.twitterAccessToken = new an<>("twitter_access_token", "");
            this.cacheItems.add(this.twitterAccessToken);
        }
        return this.twitterAccessToken;
    }

    @I18n
    public an<String> getTwitterSecret() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22697, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22697, new Class[0], an.class);
        }
        if (this.twitterSecret == null) {
            this.twitterSecret = new an<>("twitter_secret", "");
            this.cacheItems.add(this.twitterSecret);
        }
        return this.twitterSecret;
    }

    public an<String> getUpdateUserTipContent() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22936, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22936, new Class[0], an.class);
        }
        if (this.updateUserTipContent == null) {
            this.updateUserTipContent = new an<>("update_user_tip_content", "");
            this.cacheItems.add(this.updateUserTipContent);
        }
        return this.updateUserTipContent;
    }

    public an<String> getUploadContactsPolicyCaption() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22805, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22805, new Class[0], an.class);
        }
        if (this.uploadContactsPolicyCaption == null) {
            this.uploadContactsPolicyCaption = new an<>("upload_contacts_policy_caption", "");
            this.cacheItems.add(this.uploadContactsPolicyCaption);
        }
        return this.uploadContactsPolicyCaption;
    }

    public an<String> getUploadContactsPolicyPic() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22807, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22807, new Class[0], an.class);
        }
        if (this.uploadContactsPolicyPic == null) {
            this.uploadContactsPolicyPic = new an<>("upload_contacts_policy_pic", "");
            this.cacheItems.add(this.uploadContactsPolicyPic);
        }
        return this.uploadContactsPolicyPic;
    }

    public an<String> getUploadContactsPolicyText() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22806, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22806, new Class[0], an.class);
        }
        if (this.uploadContactsPolicyText == null) {
            this.uploadContactsPolicyText = new an<>("upload_contacts_policy_text", "");
            this.cacheItems.add(this.uploadContactsPolicyText);
        }
        return this.uploadContactsPolicyText;
    }

    public an<Boolean> getUseCronet() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22651, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22651, new Class[0], an.class);
        }
        if (this.useCronet == null) {
            this.useCronet = new an<>("use_cronet", Boolean.TRUE);
            this.cacheItems.add(this.useCronet);
        }
        return this.useCronet;
    }

    public an<Boolean> getUseDefaultHost() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22648, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22648, new Class[0], an.class);
        }
        if (this.useDefaultHost == null) {
            this.useDefaultHost = new an<>("use_default_host", Boolean.FALSE);
            this.cacheItems.add(this.useDefaultHost);
        }
        return this.useDefaultHost;
    }

    public an<Boolean> getUseHttps() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22647, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22647, new Class[0], an.class);
        }
        if (this.useHttps == null) {
            this.useHttps = new an<>("use_https", Boolean.TRUE);
            this.cacheItems.add(this.useHttps);
        }
        return this.useHttps;
    }

    public an<Boolean> getUseNewFFmpeg() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22775, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22775, new Class[0], an.class);
        }
        if (this.useNewFFmpeg == null) {
            this.useNewFFmpeg = new an<>("use_new_ffmpeg", Boolean.FALSE);
            this.cacheItems.add(this.useNewFFmpeg);
        }
        return this.useNewFFmpeg;
    }

    public an<Boolean> getUseNewPackageNow() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22590, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22590, new Class[0], an.class);
        }
        if (this.mUseNewPackageNow == null) {
            this.mUseNewPackageNow = new an<>("use_new_package_now", Boolean.FALSE);
            this.cacheItems.add(this.mUseNewPackageNow);
        }
        return this.mUseNewPackageNow;
    }

    public an<String> getUserAddLanguages() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22610, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22610, new Class[0], an.class);
        }
        if (this.userAddLanguages == null) {
            this.userAddLanguages = new an<>("user_add_languages", "");
            this.cacheItems.add(this.userAddLanguages);
        }
        return this.userAddLanguages;
    }

    public an<String> getUserCurrentRegion() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22609, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22609, new Class[0], an.class);
        }
        if (this.userCurrentRegion == null) {
            this.userCurrentRegion = new an<>("user_current_region", "");
            this.cacheItems.add(this.userCurrentRegion);
        }
        return this.userCurrentRegion;
    }

    public an<Boolean> getUserHasPassword() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22758, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22758, new Class[0], an.class);
        }
        if (this.userHasPassword == null) {
            this.userHasPassword = new an<>("user_has_password", Boolean.FALSE);
            this.cacheItems.add(this.userHasPassword);
        }
        return this.userHasPassword;
    }

    public an<String> getUserResidence() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22608, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22608, new Class[0], an.class);
        }
        if (this.userResidence == null) {
            this.userResidence = new an<>("user_residence", "");
            this.cacheItems.add(this.userResidence);
        }
        return this.userResidence;
    }

    public an<Boolean> getVideoPreload() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22662, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22662, new Class[0], an.class);
        }
        if (this.videoPreload == null) {
            this.videoPreload = new an<>("video_preload", Boolean.TRUE);
            this.cacheItems.add(this.videoPreload);
        }
        return this.videoPreload;
    }

    public an<Boolean> isEnableMessagePb2Json() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22668, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22668, new Class[0], an.class);
        }
        if (this.enableMessagePb2Json == null) {
            this.enableMessagePb2Json = new an<>("live_enanble_message_pb2json", Boolean.FALSE);
            this.cacheItems.add(this.enableMessagePb2Json);
        }
        return this.enableMessagePb2Json;
    }

    public an<Boolean> isFirstPublishSync() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22785, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22785, new Class[0], an.class);
        }
        if (this.isFirstPublishSync == null) {
            this.isFirstPublishSync = new an<>("is_first_publish", Boolean.TRUE);
            this.cacheItems.add(this.isFirstPublishSync);
        }
        return this.isFirstPublishSync;
    }

    public an<Boolean> isInUltraResBlackList() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22922, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22922, new Class[0], an.class);
        }
        if (this.inUltraResBlackList == null) {
            this.inUltraResBlackList = new an<>("in_ultra_resolution_black_list", Boolean.FALSE);
            this.cacheItems.add(this.inUltraResBlackList);
        }
        return this.inUltraResBlackList;
    }

    public an<Boolean> isNpthEnable() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22791, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22791, new Class[0], an.class);
        }
        if (this.isNpthEnable == null) {
            this.isNpthEnable = new an<>("is_npth_enable", Boolean.FALSE);
            this.cacheItems.add(this.isNpthEnable);
        }
        return this.isNpthEnable;
    }

    public an<Boolean> isOb() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22790, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22790, new Class[0], an.class);
        }
        if (this.isOb == null) {
            this.isOb = new an<>("is_ob", Boolean.FALSE);
            this.cacheItems.add(this.isOb);
        }
        return this.isOb;
    }

    public an<Boolean> isPublishSyncToHuoshan() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22782, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22782, new Class[0], an.class);
        }
        if (this.isPublishSyncToHuoshan == null) {
            this.isPublishSyncToHuoshan = new an<>("is_publish_sync_huoshan", Boolean.TRUE);
            this.cacheItems.add(this.isPublishSyncToHuoshan);
        }
        return this.isPublishSyncToHuoshan;
    }

    public an<Boolean> isPublishSyncToToutiao() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22783, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22783, new Class[0], an.class);
        }
        if (this.isPublishSyncToToutiao == null) {
            this.isPublishSyncToToutiao = new an<>("is_publish_sync_toutiao_new", Boolean.TRUE);
            this.cacheItems.add(this.isPublishSyncToToutiao);
        }
        return this.isPublishSyncToToutiao;
    }

    public an<Boolean> isShowInviteContactsFriends() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22891, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22891, new Class[0], an.class);
        }
        if (this.showInvitedContactsFriends == null) {
            this.showInvitedContactsFriends = new an<>("invite_friends_settings", Boolean.FALSE);
            this.cacheItems.add(this.showInvitedContactsFriends);
        }
        return this.showInvitedContactsFriends;
    }

    public an<Boolean> isShowSyncToToutiaoDialog() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22786, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22786, new Class[0], an.class);
        }
        if (this.isShowSyncToToutiaoDialog == null) {
            this.isShowSyncToToutiaoDialog = new an<>("is_show_sync_toutiao_dialog", Boolean.FALSE);
            this.cacheItems.add(this.isShowSyncToToutiaoDialog);
        }
        return this.isShowSyncToToutiaoDialog;
    }

    public an<Boolean> isSyncToHuoshan() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22781, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22781, new Class[0], an.class);
        }
        if (this.isSyncToHuoshan == null) {
            this.isSyncToHuoshan = new an<>("is_sync_to_huoshan", Boolean.FALSE);
            this.cacheItems.add(this.isSyncToHuoshan);
        }
        return this.isSyncToHuoshan;
    }

    public boolean isUseTTnet() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22691, new Class[0], Boolean.TYPE)) {
            return ((Boolean) getIsUseTTnet().c()).booleanValue();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22691, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public an<Boolean> liveAgreement() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22727, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22727, new Class[0], an.class);
        }
        if (this.liveAgreement == null) {
            this.liveAgreement = new an<>("live_agreement", Boolean.FALSE);
            this.cacheItems.add(this.liveAgreement);
        }
        return this.liveAgreement;
    }

    public an<Boolean> liveAnswer() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22728, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22728, new Class[0], an.class);
        }
        if (this.liveAnswer == null) {
            this.liveAnswer = new an<>("live_answer", Boolean.FALSE);
            this.cacheItems.add(this.liveAnswer);
        }
        return this.liveAnswer;
    }

    public an<Boolean> liveContactsVerify() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22726, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22726, new Class[0], an.class);
        }
        if (this.liveContactsVerify == null) {
            this.liveContactsVerify = new an<>("live_contacts_verify", Boolean.FALSE);
            this.cacheItems.add(this.liveContactsVerify);
        }
        return this.liveContactsVerify;
    }

    public an<Boolean> mockLiveMoney() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22724, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22724, new Class[0], an.class);
        }
        if (this.mockLiveMoney == null) {
            this.mockLiveMoney = new an<>("mock_live_money", Boolean.FALSE);
            this.cacheItems.add(this.mockLiveMoney);
        }
        return this.mockLiveMoney;
    }

    public an<Boolean> mockLiveResolution() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22725, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22725, new Class[0], an.class);
        }
        if (this.mockLiveResolution == null) {
            this.mockLiveResolution = new an<>("mock_live_resolution", Boolean.FALSE);
            this.cacheItems.add(this.mockLiveResolution);
        }
        return this.mockLiveResolution;
    }

    public an<Boolean> mockLiveSend() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22723, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22723, new Class[0], an.class);
        }
        if (this.mockLiveSend == null) {
            this.mockLiveSend = new an<>("mock_live_send", Boolean.FALSE);
            this.cacheItems.add(this.mockLiveSend);
        }
        return this.mockLiveSend;
    }

    private void collectAllItemsIfNeed() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22631, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22631, new Class[0], Void.TYPE);
        } else if (!this.collectAllItems) {
            this.collectAllItems = true;
            for (Method method : SharePrefCache.class.getDeclaredMethods()) {
                if (method.getReturnType() == an.class) {
                    try {
                        method.invoke(this, new Object[0]);
                    } catch (IllegalAccessException | InvocationTargetException unused) {
                    }
                }
            }
        }
    }

    private an<Integer> getArStickerFliterTimesItem() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22753, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22753, new Class[0], an.class);
        }
        if (this.arStickerFliterTimes == null) {
            this.arStickerFliterTimes = new an<>("ar_sticker_filter_guide_times", 0);
            this.cacheItems.add(this.arStickerFliterTimes);
        }
        return this.arStickerFliterTimes;
    }

    private an<Integer> getShowCreatorRewards() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22803, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22803, new Class[0], an.class);
        }
        if (this.showCreatorRewards == null) {
            this.showCreatorRewards = new an<>("show_creator_rewards", 0);
            this.cacheItems.add(this.showCreatorRewards);
        }
        return this.showCreatorRewards;
    }

    private an<Integer> getShowLiveRewards() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22804, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22804, new Class[0], an.class);
        }
        if (this.showLiveRewards == null) {
            this.showLiveRewards = new an<>("show_live_rewards", 0);
            this.cacheItems.add(this.showLiveRewards);
        }
        return this.showLiveRewards;
    }

    public an<Integer> getAdDisplayTimemit() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22675, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22675, new Class[0], an.class);
        }
        if (this.adDisplayTimemit == null) {
            this.adDisplayTimemit = new an<>("ad_display_time", 3);
            this.cacheItems.add(this.adDisplayTimemit);
        }
        return this.adDisplayTimemit;
    }

    @I18n
    public an<Integer> getAppStoreScoreSection() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22755, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22755, new Class[0], an.class);
        }
        if (this.appStoreScoreSection == null) {
            this.appStoreScoreSection = new an<>("APP_STORE_SCORE_SECTION", 7);
            this.cacheItems.add(this.appStoreScoreSection);
        }
        return this.appStoreScoreSection;
    }

    @I18n
    public an<Integer> getAppStoreScoreSwitch() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22754, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22754, new Class[0], an.class);
        }
        if (this.appStoreScoreSwitch == null) {
            this.appStoreScoreSwitch = new an<>("APP_STORE_SCORE_SWITCH", 1);
            this.cacheItems.add(this.appStoreScoreSwitch);
        }
        return this.appStoreScoreSwitch;
    }

    @I18n
    public an<Integer> getAppStoreScoreThreshold() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22756, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22756, new Class[0], an.class);
        }
        if (this.appStoreScoreThreshold == null) {
            this.appStoreScoreThreshold = new an<>("APP_STORE_SCORE_THRESHOLD", 3);
            this.cacheItems.add(this.appStoreScoreThreshold);
        }
        return this.appStoreScoreThreshold;
    }

    public an<Integer> getAtFriendsShowType() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22741, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22741, new Class[0], an.class);
        }
        if (this.atFriendsShowType == null) {
            this.atFriendsShowType = new an<>("at_friends_show_type", 0);
            this.cacheItems.add(this.atFriendsShowType);
        }
        return this.atFriendsShowType;
    }

    public an<Integer> getBeautyModelItem() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22712, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22712, new Class[0], an.class);
        }
        if (this.beautyModel == null) {
            this.beautyModel = new an<>("beauty_model", 0);
            this.cacheItems.add(this.beautyModel);
        }
        return this.beautyModel;
    }

    public an<Integer> getBodyDanceGuideTimes() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22738, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22738, new Class[0], an.class);
        }
        if (this.bodyDanceGuideTimes == null) {
            this.bodyDanceGuideTimes = new an<>("body_dance_guide_times", 0);
            this.cacheItems.add(this.bodyDanceGuideTimes);
        }
        return this.bodyDanceGuideTimes;
    }

    public an<Integer> getCameraPosition() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22679, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22679, new Class[0], an.class);
        }
        if (this.cameraPosition == null) {
            this.cameraPosition = new an<>("camera_position", Integer.valueOf(com.ss.android.g.a.b() ^ true ? 1 : 0));
            this.cacheItems.add(this.cameraPosition);
        }
        return this.cameraPosition;
    }

    public an<Integer> getCanIm() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22707, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22707, new Class[0], an.class);
        }
        if (this.canIm == null) {
            this.canIm = new an<>("im_can_im", 1);
            this.cacheItems.add(this.canIm);
        }
        return this.canIm;
    }

    public an<Integer> getCanImSendPic() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22708, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22708, new Class[0], an.class);
        }
        if (this.canImSendPic == null) {
            this.canImSendPic = new an<>("im_can_send_pic", 0);
            this.cacheItems.add(this.canImSendPic);
        }
        return this.canImSendPic;
    }

    public an<Integer> getCompleteProfilePolicyInterval() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22825, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22825, new Class[0], an.class);
        }
        if (this.completeProfilePolicyInterval == null) {
            this.completeProfilePolicyInterval = new an<>("completeprofilepolicy_interval", 0);
            this.cacheItems.add(this.completeProfilePolicyInterval);
        }
        return this.completeProfilePolicyInterval;
    }

    public an<Integer> getCompleteProfilePolicyTimes() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22824, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22824, new Class[0], an.class);
        }
        if (this.completeProfilePolicyTimes == null) {
            this.completeProfilePolicyTimes = new an<>("completeprofilepolicy_times", 0);
            this.cacheItems.add(this.completeProfilePolicyTimes);
        }
        return this.completeProfilePolicyTimes;
    }

    public an<Long> getContactsUploadedLastTime() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22642, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22642, new Class[0], an.class);
        }
        if (this.contactsUploadedLastTime == null) {
            this.contactsUploadedLastTime = new an<>("contacts_uploaded_last_time", 0L);
            this.cacheItems.add(this.contactsUploadedLastTime);
        }
        return this.contactsUploadedLastTime;
    }

    public an<String> getCurrentLocaleLanguage() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22821, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22821, new Class[0], an.class);
        }
        if (this.imCurrentLocaleLanguage == null) {
            this.imCurrentLocaleLanguage = new an<>("im_current_locale", Locale.CHINESE.getLanguage());
            this.cacheItems.add(this.imCurrentLocaleLanguage);
        }
        return this.imCurrentLocaleLanguage;
    }

    public an<Set<String>> getDefaultAvatarUrl() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22823, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22823, new Class[0], an.class);
        }
        if (this.defaultAvatarUrl == null) {
            this.defaultAvatarUrl = new an<>("default_avatarurl", new HashSet());
            this.cacheItems.add(this.defaultAvatarUrl);
        }
        return this.defaultAvatarUrl;
    }

    public an<Integer> getDialogType() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22868, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22868, new Class[0], an.class);
        }
        if (this.dialogType == null) {
            this.dialogType = new an<>("dialog_type", 0);
            this.cacheItems.add(this.dialogType);
        }
        return this.dialogType;
    }

    public an<Integer> getDisableTaobao() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22586, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22586, new Class[0], an.class);
        }
        if (this.disableTaobao == null) {
            this.disableTaobao = new an<>("disable_taobao", 0);
            this.cacheItems.add(this.disableTaobao);
        }
        return this.disableTaobao;
    }

    public synchronized an<Boolean> getDisableWant() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22794, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22794, new Class[0], an.class);
        }
        if (this.disableWant == null) {
            this.disableWant = new an<>("disable_want", Boolean.FALSE);
            this.cacheItems.add(this.disableWant);
        }
        return this.disableWant;
    }

    public an<Integer> getDownloadMicroApp() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22875, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22875, new Class[0], an.class);
        }
        if (this.downloadMicroApp == null) {
            this.downloadMicroApp = new an<>("download_micro_app", 1);
            this.cacheItems.add(this.downloadMicroApp);
        }
        return this.downloadMicroApp;
    }

    public synchronized an<Boolean> getEnableLawWindow() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22793, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22793, new Class[0], an.class);
        }
        if (this.enableLawWindow == null) {
            this.enableLawWindow = new an<>("enable_law_window", Boolean.FALSE);
            this.cacheItems.add(this.enableLawWindow);
        }
        return this.enableLawWindow;
    }

    public synchronized an<Boolean> getEnableShoppingUser() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22792, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22792, new Class[0], an.class);
        }
        if (this.enableShoppingUser == null) {
            this.enableShoppingUser = new an<>("enable_shopping_user", Boolean.FALSE);
            this.cacheItems.add(this.enableShoppingUser);
        }
        return this.enableShoppingUser;
    }

    public an<Long> getFestivalShareDonationTime() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22882, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22882, new Class[0], an.class);
        }
        if (this.festivalShareDonationTime == null) {
            this.festivalShareDonationTime = new an<>("festival_share_donation_time", 0L);
            this.cacheItems.add(this.festivalShareDonationTime);
        }
        return this.festivalShareDonationTime;
    }

    public an<Long> getFetchUserCacheIntervals() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22932, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22932, new Class[0], an.class);
        }
        if (this.fetchUserCacheIntervals == null) {
            this.fetchUserCacheIntervals = new an<>("fetch_user_cache_intervals", 0L);
            this.cacheItems.add(this.fetchUserCacheIntervals);
        }
        return this.fetchUserCacheIntervals;
    }

    public an<Integer> getFlashStatus() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22680, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22680, new Class[0], an.class);
        }
        if (this.flashStatus == null) {
            this.flashStatus = new an<>("flash_status", 0);
            this.cacheItems.add(this.flashStatus);
        }
        return this.flashStatus;
    }

    public an<Integer> getFollowFeedAsDefault() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22601, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22601, new Class[0], an.class);
        }
        if (this.followFeedAsDefault == null) {
            this.followFeedAsDefault = new an<>("follow_feed_as_default", 0);
            this.cacheItems.add(this.followFeedAsDefault);
        }
        return this.followFeedAsDefault;
    }

    public an<Long> getFollowNoticeCloseTime() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22605, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22605, new Class[0], an.class);
        }
        if (this.followNoticeCloseTime == null) {
            this.followNoticeCloseTime = new an<>("follow_notice_close_time", 0L);
            this.cacheItems.add(this.followNoticeCloseTime);
        }
        return this.followNoticeCloseTime;
    }

    @I18n
    public an<Integer> getFollowUserThreshold() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22788, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22788, new Class[0], an.class);
        }
        if (this.followUserThreshold == null) {
            this.followUserThreshold = new an<>("show_follow_tab_following_limit", 1);
            this.cacheItems.add(this.followUserThreshold);
        }
        return this.followUserThreshold;
    }

    public an<Integer> getFriendTabAvatarDuation() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22886, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22886, new Class[0], an.class);
        }
        if (this.friendTabAvatarDuation == null) {
            this.friendTabAvatarDuation = new an<>("friend_tab_avatar_duration", 0);
            this.cacheItems.add(this.friendTabAvatarDuation);
        }
        return this.friendTabAvatarDuation;
    }

    public an<Set<String>> getGeckoChannels() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22615, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22615, new Class[0], an.class);
        }
        if (this.mGeckoChannels == null) {
            this.mGeckoChannels = new an<>("gecko_init_channels", new HashSet());
            this.cacheItems.add(this.mGeckoChannels);
        }
        return this.mGeckoChannels;
    }

    public an<String> getGuardianChildScheme() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22625, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22625, new Class[0], an.class);
        }
        if (this.guardianChild == null) {
            this.guardianChild = new an<>("guardian_child", b.f33436b.d());
            this.cacheItems.add(this.guardianChild);
        }
        return this.guardianChild;
    }

    public an<String> getGuardianParentScheme() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22624, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22624, new Class[0], an.class);
        }
        if (this.guardianParent == null) {
            this.guardianParent = new an<>("guardian_parent", b.f33436b.e());
            this.cacheItems.add(this.guardianParent);
        }
        return this.guardianParent;
    }

    public an<Integer> getHardEncode() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22672, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22672, new Class[0], an.class);
        }
        if (this.hardEncode == null) {
            this.hardEncode = new an<>("hard_encode", 0);
            this.cacheItems.add(this.hardEncode);
        }
        return this.hardEncode;
    }

    public an<Integer> getHitRankActivityStatus() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22878, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22878, new Class[0], an.class);
        }
        if (this.hitRankActivityStatus == null) {
            this.hitRankActivityStatus = new an<>("hit_rank_activity_status", 0);
            this.cacheItems.add(this.hitRankActivityStatus);
        }
        return this.hitRankActivityStatus;
    }

    public an<Integer> getHotSearchWordsShowInterval() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22645, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22645, new Class[0], an.class);
        }
        if (this.hotSearchWordsShowInterval == null) {
            this.hotSearchWordsShowInterval = new an<>("hot_search_words_show_interval", 2);
            this.cacheItems.add(this.hotSearchWordsShowInterval);
        }
        return this.hotSearchWordsShowInterval;
    }

    public an<Integer> getHttpRetryCount() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22678, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22678, new Class[0], an.class);
        }
        if (this.httpRetryCount == null) {
            this.httpRetryCount = new an<>("http_retry_count", 3);
            this.cacheItems.add(this.httpRetryCount);
        }
        return this.httpRetryCount;
    }

    public an<Long> getHttpRetryInterval() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22639, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22639, new Class[0], an.class);
        }
        if (this.httpRetryInterval == null) {
            this.httpRetryInterval = new an<>("http_retry_interval", 500L);
            this.cacheItems.add(this.httpRetryInterval);
        }
        return this.httpRetryInterval;
    }

    public an<Long> getHttpTimeOut() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22640, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22640, new Class[0], an.class);
        }
        if (this.httpTimeOut == null) {
            this.httpTimeOut = new an<>("http_timeout", 5000L);
            this.cacheItems.add(this.httpTimeOut);
        }
        return this.httpTimeOut;
    }

    public an<Boolean> getImCommentForwardEnabledItem() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22818, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22818, new Class[0], an.class);
        }
        if (this.imCommentForwardEnabled == null) {
            this.imCommentForwardEnabled = new an<>("im_comment_forward_enabled", Boolean.valueOf(!com.ss.android.g.a.b()));
            this.cacheItems.add(this.imCommentForwardEnabled);
        }
        return this.imCommentForwardEnabled;
    }

    public an<Boolean> getIsContactDialogShown() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22682, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22682, new Class[0], an.class);
        }
        if (this.isContactDialogShown == null) {
            this.isContactDialogShown = new an<>("contact_dialog_shown", Boolean.valueOf(getSharePref().getBoolean("contact_dialog_shown", false)));
            this.cacheItems.add(this.isContactDialogShown);
        }
        return this.isContactDialogShown;
    }

    public an<Boolean> getIsEuropeCountry() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22704, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22704, new Class[0], an.class);
        }
        if (this.isEuropeCountry == null) {
            if (!TextUtils.isEmpty(e.a())) {
                this.isEuropeCountry = new an<>("is_europe_country", Boolean.valueOf(e.a(e.a())));
            } else if (!TextUtils.isEmpty(e.b())) {
                this.isEuropeCountry = new an<>("is_europe_country", Boolean.valueOf(e.a(e.b())));
            } else {
                this.isEuropeCountry = new an<>("is_europe_country", Boolean.FALSE);
            }
            this.cacheItems.add(this.isEuropeCountry);
        }
        return this.isEuropeCountry;
    }

    public an<Boolean> getIsFirstShowInsightsAnimation() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22838, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22838, new Class[0], an.class);
        }
        if (this.isFirstShowInsightsAnimation == null) {
            this.isFirstShowInsightsAnimation = new an<>("first_show_insights_animation_" + d.a().getCurUserId(), Boolean.FALSE);
            this.cacheItems.add(this.isFirstShowInsightsAnimation);
        }
        return this.isFirstShowInsightsAnimation;
    }

    public an<Integer> getIsForceHttps() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22681, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22681, new Class[0], an.class);
        }
        if (this.isForceHttps == null) {
            this.isForceHttps = new an<>("isforcehttps", 0);
            this.cacheItems.add(this.isForceHttps);
        }
        return this.isForceHttps;
    }

    public an<Integer> getIsNewInstall() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22627, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22627, new Class[0], an.class);
        }
        if (this.isNewInstall == null) {
            this.isNewInstall = new an<>("is_new_install", -1);
            this.cacheItems.add(this.isNewInstall);
        }
        return this.isNewInstall;
    }

    public an<Boolean> getIsShowNearBy() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22676, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22676, new Class[0], an.class);
        }
        if (this.isShowNearBy == null) {
            if (com.ss.android.ugc.aweme.i18n.c.a()) {
                this.isShowNearBy = new an<>("is_show_near_by", Boolean.FALSE);
            } else {
                this.isShowNearBy = new an<>("is_show_near_by", Boolean.TRUE);
            }
            this.cacheItems.add(this.isShowNearBy);
        }
        return this.isShowNearBy;
    }

    public an<Long> getLastCloseFeedUpdateDialogTime() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22942, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22942, new Class[0], an.class);
        }
        if (this.lastCloseFeedUpdateUserDialog == null) {
            this.lastCloseFeedUpdateUserDialog = new an<>("last_close_feed_update_user_dialog", 0L);
            this.cacheItems.add(this.lastCloseFeedUpdateUserDialog);
        }
        return this.lastCloseFeedUpdateUserDialog;
    }

    public an<Long> getLastCloseUpdateDialogTime() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22941, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22941, new Class[0], an.class);
        }
        if (this.lastCloseUpdateUserDialog == null) {
            this.lastCloseUpdateUserDialog = new an<>("last_close_update_user_dialog", 0L);
            this.cacheItems.add(this.lastCloseUpdateUserDialog);
        }
        return this.lastCloseUpdateUserDialog;
    }

    public an<Long> getLastEnterProfileTime() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22938, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22938, new Class[0], an.class);
        }
        if (this.lastEnterProfileTime == null) {
            this.lastEnterProfileTime = new an<>("last_enter_profile_time", 0L);
            this.cacheItems.add(this.lastEnterProfileTime);
        }
        return this.lastEnterProfileTime;
    }

    public an<Long> getLastFeedCount() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22598, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22598, new Class[0], an.class);
        }
        if (this.lastFeedCount == null) {
            this.lastFeedCount = new an<>("last_feed_count", 0L);
            this.cacheItems.add(this.lastFeedCount);
        }
        return this.lastFeedCount;
    }

    public an<Long> getLastFeedTime() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22599, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22599, new Class[0], an.class);
        }
        if (this.lastFeedTime == null) {
            this.lastFeedTime = new an<>("last_feed_time", 0L);
            this.cacheItems.add(this.lastFeedTime);
        }
        return this.lastFeedTime;
    }

    public an<Long> getLastFetchUserCacheIntervals() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22933, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22933, new Class[0], an.class);
        }
        if (this.lastFetchUserCacheIntervals == null) {
            this.lastFetchUserCacheIntervals = new an<>("last_fetch_user_cache_intervals", 0L);
            this.cacheItems.add(this.lastFetchUserCacheIntervals);
        }
        return this.lastFetchUserCacheIntervals;
    }

    public an<Long> getLastFilterTime() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22845, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22845, new Class[0], an.class);
        }
        if (this.lastFilterTime == null) {
            this.lastFilterTime = new an<>("last_filter_time", 0L);
            this.cacheItems.add(this.lastFilterTime);
        }
        return this.lastFilterTime;
    }

    public an<Long> getLastGetRelieveAwemeTime() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22766, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22766, new Class[0], an.class);
        }
        if (this.lastGetRelieveAwemeTime == null) {
            this.lastGetRelieveAwemeTime = new an<>("has_relieve_aweme", 0L);
            this.cacheItems.add(this.lastGetRelieveAwemeTime);
        }
        return this.lastGetRelieveAwemeTime;
    }

    public an<Long> getLastInviteAllTimeStampItem() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22894, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22894, new Class[0], an.class);
        }
        if (this.invitedAllTimeStamp == null) {
            this.invitedAllTimeStamp = new an<>("contact_invite_all_time_stamp", 0L);
            this.cacheItems.add(this.invitedAllTimeStamp);
        }
        return this.invitedAllTimeStamp;
    }

    public an<Long> getLastLockedTime() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22768, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22768, new Class[0], an.class);
        }
        if (this.lastLockedTime == null) {
            this.lastLockedTime = new an<>("last_append_video_time", 0L);
            this.cacheItems.add(this.lastLockedTime);
        }
        return this.lastLockedTime;
    }

    public an<Long> getLastShowBindHintTime() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22770, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22770, new Class[0], an.class);
        }
        if (this.lastShowBindHintTime == null) {
            this.lastShowBindHintTime = new an<>("lastShowBindHintTime", 0L);
            this.cacheItems.add(this.lastShowBindHintTime);
        }
        return this.lastShowBindHintTime;
    }

    public an<Long> getLastShowProfileBindHintTime() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22771, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22771, new Class[0], an.class);
        }
        if (this.lastShowProfileBindHintTime == null) {
            this.lastShowProfileBindHintTime = new an<>("lastShowProfileBindHintTime", 0L);
            this.cacheItems.add(this.lastShowProfileBindHintTime);
        }
        return this.lastShowProfileBindHintTime;
    }

    public an<Long> getLastUnlockTime() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22769, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22769, new Class[0], an.class);
        }
        if (this.lastUnlockTime == null) {
            this.lastUnlockTime = new an<>("last_unlock_time", 0L);
            this.cacheItems.add(this.lastUnlockTime);
        }
        return this.lastUnlockTime;
    }

    public an<Integer> getLiveCoverAuditFailedTimes() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22736, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22736, new Class[0], an.class);
        }
        if (this.liveCoverAuditFailedTimes == null) {
            this.liveCoverAuditFailedTimes = new an<>("live_cover_audit_failed_times", 1);
            this.cacheItems.add(this.liveCoverAuditFailedTimes);
        }
        return this.liveCoverAuditFailedTimes;
    }

    public an<Integer> getLiveCoverBubble() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22735, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22735, new Class[0], an.class);
        }
        if (this.liveCoverBubble == null) {
            this.liveCoverBubble = new an<>("live_cover_bubble", 1);
            this.cacheItems.add(this.liveCoverBubble);
        }
        return this.liveCoverBubble;
    }

    public an<Integer> getLiveCoverWarnChangeTimes() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22737, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22737, new Class[0], an.class);
        }
        if (this.liveCoverWarnChangeTimes == null) {
            this.liveCoverWarnChangeTimes = new an<>("live_cover_warn_change_times", 1);
            this.cacheItems.add(this.liveCoverWarnChangeTimes);
        }
        return this.liveCoverWarnChangeTimes;
    }

    public an<Integer> getLiveDefaultBitrate() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22732, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22732, new Class[0], an.class);
        }
        if (this.liveDefaultBitrate == null) {
            this.liveDefaultBitrate = new an<>("live_default_bitrate", 0);
            this.cacheItems.add(this.liveDefaultBitrate);
        }
        return this.liveDefaultBitrate;
    }

    public an<Integer> getLiveMaxBitrate() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22733, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22733, new Class[0], an.class);
        }
        if (this.liveMaxBitrate == null) {
            this.liveMaxBitrate = new an<>("live_max_bitrate", 0);
            this.cacheItems.add(this.liveMaxBitrate);
        }
        return this.liveMaxBitrate;
    }

    public an<Integer> getLiveMinBitrate() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22734, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22734, new Class[0], an.class);
        }
        if (this.liveMinBitrate == null) {
            this.liveMinBitrate = new an<>("live_min_bitrate", 0);
            this.cacheItems.add(this.liveMinBitrate);
        }
        return this.liveMinBitrate;
    }

    public Boolean getLiveSkylightHasShowAnimation() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22667, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22667, new Class[0], Boolean.class);
        }
        if (this.liveSkylightHasShowAnimation == null) {
            this.liveSkylightHasShowAnimation = new an<>("live_skylight_has_show_animation", Boolean.FALSE);
            this.cacheItems.add(this.liveSkylightHasShowAnimation);
        }
        Boolean bool = (Boolean) this.liveSkylightHasShowAnimation.c();
        if (!bool.booleanValue()) {
            this.liveSkylightHasShowAnimation.a(Boolean.TRUE);
        }
        return bool;
    }

    public an<Long> getLongVideoThreshold() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22730, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22730, new Class[0], an.class);
        }
        if (this.longVideoThreshold == null) {
            this.longVideoThreshold = new an<>("long_video_threshold", 60000L);
            this.cacheItems.add(this.longVideoThreshold);
        }
        return this.longVideoThreshold;
    }

    public an<String> getMerchPickerUrl() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22587, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22587, new Class[0], an.class);
        }
        if (this.merchPickerUrl == null) {
            if (com.ss.android.ugc.aweme.framework.core.a.b().f3306d) {
                str = "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Flive_merch%3Fhide_status_bar%3D1%26hide_nav_bar%3D1%26loading_bgcolor%3DFFFFFF%26bg_theme%3DFFFFFF%26disable_pop_gesture%3D1%26disablePopGesture%3D1%26popup_mode%3D1&hide_status_bar=1&hide_nav_bar=1&loading_bgcolor=FFFFFF&bg_theme=FFFFFF&disable_pop_gesture=1&disablePopGesture=1&popup_mode=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Dies_ecom_rn%26bundle_name%3Dies_ecom_rn%26module_name%3Dpage_live_merch%26hide_status_bar%3D1%26hide_nav_bar%3D1%26loading_bgcolor%3DFFFFFF%26bg_theme%3DFFFFFF%26disable_pop_gesture%3D1%26disablePopGesture%3D1%26popup_mode%3D1";
            } else {
                str = "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Flive_merch%3Fhide_status_bar%3D1%26hide_nav_bar%3D1%26loading_bgcolor%3DFFFFFF%26bg_theme%3DFFFFFF%26disable_pop_gesture%3D1%26disablePopGesture%3D1%26popup_mode%3D1&hide_status_bar=1&hide_nav_bar=1&loading_bgcolor=FFFFFF&bg_theme=FFFFFF&disable_pop_gesture=1&disablePopGesture=1&popup_mode=1";
            }
            this.merchPickerUrl = new an<>("merch_share_url", str);
            this.cacheItems.add(this.merchPickerUrl);
        }
        return this.merchPickerUrl;
    }

    public an<Integer> getMultiSelectLimitItem() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22815, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22815, new Class[0], an.class);
        }
        if (this.multiSelectLimit == null) {
            this.multiSelectLimit = new an<>("multi_select_limit", 10);
            this.cacheItems.add(this.multiSelectLimit);
        }
        return this.multiSelectLimit;
    }

    public an<Integer> getMusicianShowType() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22740, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22740, new Class[0], an.class);
        }
        if (this.musicianShowType == null) {
            this.musicianShowType = new an<>("musician_show_type", 0);
            this.cacheItems.add(this.musicianShowType);
        }
        return this.musicianShowType;
    }

    public an<Integer> getNetworkLibTypeItem() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22715, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22715, new Class[0], an.class);
        }
        if (this.networkLibType == null) {
            this.networkLibType = new an<>("network_lib_type", 1);
            this.cacheItems.add(this.networkLibType);
        }
        return this.networkLibType;
    }

    public synchronized an<String> getNewbieHelpShopUrl() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22795, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22795, new Class[0], an.class);
        }
        if (this.newbieHelpShopUrl == null) {
            this.newbieHelpShopUrl = new an<>("newbie_help_shop_url", "");
            this.cacheItems.add(this.newbieHelpShopUrl);
        }
        return this.newbieHelpShopUrl;
    }

    public an<Long> getNormalGuideDisplayTimeIntervals() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22612, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22612, new Class[0], an.class);
        }
        if (this.normalGuideDisplayTimeIntervals == null) {
            this.normalGuideDisplayTimeIntervals = new an<>("normal_guide_display_time_intervals", 0L);
            this.cacheItems.add(this.normalGuideDisplayTimeIntervals);
        }
        return this.normalGuideDisplayTimeIntervals;
    }

    public an<Integer> getNormalGuideDisplayTimes() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22611, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22611, new Class[0], an.class);
        }
        if (this.normalGuideDisplayTimes == null) {
            this.normalGuideDisplayTimes = new an<>("normal_guide_display_times", 0);
            this.cacheItems.add(this.normalGuideDisplayTimes);
        }
        return this.normalGuideDisplayTimes;
    }

    public an<Integer> getNoticeCountLatency() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22885, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22885, new Class[0], an.class);
        }
        if (this.noticeCountLatency == null) {
            this.noticeCountLatency = new an<>("notice_count_latency", 0);
            this.cacheItems.add(this.noticeCountLatency);
        }
        return this.noticeCountLatency;
    }

    public an<Integer> getOpenForward() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22603, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22603, new Class[0], an.class);
        }
        if (this.openForward == null) {
            this.openForward = new an<>("open_forward", 0);
            this.cacheItems.add(this.openForward);
        }
        return this.openForward;
    }

    public an<Integer> getOpenImLinkItem() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22800, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22800, new Class[0], an.class);
        }
        if (this.openImLink == null) {
            this.openImLink = new an<>("open_im_link", 0);
            this.cacheItems.add(this.openImLink);
        }
        return this.openImLink;
    }

    public an<Long> getOperationGuideDisplayTimeIntervals() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22614, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22614, new Class[0], an.class);
        }
        if (this.operationGuideDisplayTimeIntervals == null) {
            this.operationGuideDisplayTimeIntervals = new an<>("operation_guide_display_time_intervals", 0L);
            this.cacheItems.add(this.operationGuideDisplayTimeIntervals);
        }
        return this.operationGuideDisplayTimeIntervals;
    }

    public an<Integer> getOperationGuideDisplayTimes() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22613, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22613, new Class[0], an.class);
        }
        if (this.operationGuideDisplayTimes == null) {
            this.operationGuideDisplayTimes = new an<>("operation_guide_display_times", 0);
            this.cacheItems.add(this.operationGuideDisplayTimes);
        }
        return this.operationGuideDisplayTimes;
    }

    public an<Integer> getPersonalizationMode() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22597, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22597, new Class[0], an.class);
        }
        if (this.personalizationMode == null) {
            this.personalizationMode = new an<>("personalization_mode", 0);
            this.cacheItems.add(this.personalizationMode);
        }
        return this.personalizationMode;
    }

    public an<Integer> getPrivacyDownloadSetting() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22861, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22861, new Class[0], an.class);
        }
        if (this.privacyDownloadSetting == null) {
            this.privacyDownloadSetting = new an<>("enablePrivacyDownload", 0);
            this.cacheItems.add(this.privacyDownloadSetting);
        }
        return this.privacyDownloadSetting;
    }

    public an<Float> getProfileCompletionThreshold() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22834, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22834, new Class[0], an.class);
        }
        if (this.profileCompletionThreshold == null) {
            this.profileCompletionThreshold = new an<>("profilecompletion_threshold", Float.valueOf(0.0f));
            this.cacheItems.add(this.profileCompletionThreshold);
        }
        return this.profileCompletionThreshold;
    }

    public an<Float> getProfilePerfectionAvatar() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22826, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22826, new Class[0], an.class);
        }
        if (this.profilePerfectionAvatar == null) {
            this.profilePerfectionAvatar = new an<>("profileperfection_avatar", Float.valueOf(0.0f));
            this.cacheItems.add(this.profilePerfectionAvatar);
        }
        return this.profilePerfectionAvatar;
    }

    public an<Float> getProfilePerfectionBirthday() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22830, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22830, new Class[0], an.class);
        }
        if (this.profilePerfectionBirthday == null) {
            this.profilePerfectionBirthday = new an<>("profileperfection_birthday", Float.valueOf(0.0f));
            this.cacheItems.add(this.profilePerfectionBirthday);
        }
        return this.profilePerfectionBirthday;
    }

    public an<Float> getProfilePerfectionGender() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22829, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22829, new Class[0], an.class);
        }
        if (this.profilePerfectionGender == null) {
            this.profilePerfectionGender = new an<>("profileperfection_gender", Float.valueOf(0.0f));
            this.cacheItems.add(this.profilePerfectionGender);
        }
        return this.profilePerfectionGender;
    }

    public an<Float> getProfilePerfectionLocation() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22833, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22833, new Class[0], an.class);
        }
        if (this.profilePerfectionLocation == null) {
            this.profilePerfectionLocation = new an<>("profileperfection_location", Float.valueOf(0.0f));
            this.cacheItems.add(this.profilePerfectionLocation);
        }
        return this.profilePerfectionLocation;
    }

    public an<Float> getProfilePerfectionNickname() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22827, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22827, new Class[0], an.class);
        }
        if (this.profilePerfectionNickname == null) {
            this.profilePerfectionNickname = new an<>("profileperfection_nickname", Float.valueOf(0.0f));
            this.cacheItems.add(this.profilePerfectionNickname);
        }
        return this.profilePerfectionNickname;
    }

    public an<Float> getProfilePerfectionSchool() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22831, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22831, new Class[0], an.class);
        }
        if (this.profilePerfectionSchool == null) {
            this.profilePerfectionSchool = new an<>("profileperfection_school", Float.valueOf(0.0f));
            this.cacheItems.add(this.profilePerfectionSchool);
        }
        return this.profilePerfectionSchool;
    }

    public an<Float> getProfilePerfectionShortId() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22828, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22828, new Class[0], an.class);
        }
        if (this.profilePerfectionShortId == null) {
            this.profilePerfectionShortId = new an<>("profileperfection_shortid", Float.valueOf(0.0f));
            this.cacheItems.add(this.profilePerfectionShortId);
        }
        return this.profilePerfectionShortId;
    }

    public an<Float> getProfilePerfectionSignature() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22832, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22832, new Class[0], an.class);
        }
        if (this.profilePerfectionSignature == null) {
            this.profilePerfectionSignature = new an<>("profileperfection_signature", Float.valueOf(0.0f));
            this.cacheItems.add(this.profilePerfectionSignature);
        }
        return this.profilePerfectionSignature;
    }

    public an<Long> getProgressbarThreshold() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22731, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22731, new Class[0], an.class);
        }
        if (this.progressbarThreshold == null) {
            this.progressbarThreshold = new an<>("progressbar_threshold", 30000L);
            this.cacheItems.add(this.progressbarThreshold);
        }
        return this.progressbarThreshold;
    }

    public an<Integer> getPromoteDialogPopupClickType() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22854, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22854, new Class[0], an.class);
        }
        if (this.promoteDialogPopupClickType == null) {
            this.promoteDialogPopupClickType = new an<>("promote_dialog_popup_click_type", 0);
            this.cacheItems.add(this.promoteDialogPopupClickType);
        }
        return this.promoteDialogPopupClickType;
    }

    public an<Integer> getPromoteDialogPopupPopupInterval() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22848, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22848, new Class[0], an.class);
        }
        if (this.promoteDialogPopupPopupInterval == null) {
            this.promoteDialogPopupPopupInterval = new an<>("promote_dialog_popup_interval", 7);
            this.cacheItems.add(this.promoteDialogPopupPopupInterval);
        }
        return this.promoteDialogPopupPopupInterval;
    }

    public an<Integer> getPromoteDialogPopupTimesLimit() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22847, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22847, new Class[0], an.class);
        }
        if (this.promoteDialogPopupTimesLimit == null) {
            this.promoteDialogPopupTimesLimit = new an<>("promote_dialog_popup_times_limit", 3);
            this.cacheItems.add(this.promoteDialogPopupTimesLimit);
        }
        return this.promoteDialogPopupTimesLimit;
    }

    public an<Integer> getRefreshZhima() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22774, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22774, new Class[0], an.class);
        }
        if (this.refreshZhima == null) {
            this.refreshZhima = new an<>("refresh_zhima", 0);
            this.cacheItems.add(this.refreshZhima);
        }
        return this.refreshZhima;
    }

    public an<Integer> getRnContextCreateTimeout() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22589, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22589, new Class[0], an.class);
        }
        if (this.mRnContextCreateTimeout == null) {
            this.mRnContextCreateTimeout = new an<>("rn_context_create_timeout", Integer.valueOf(PushConstants.WORK_RECEIVER_EVENTCORE_ERROR));
            this.cacheItems.add(this.mRnContextCreateTimeout);
        }
        return this.mRnContextCreateTimeout;
    }

    public an<Integer> getScrollToProfileGuideState() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22671, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22671, new Class[0], an.class);
        }
        if (this.scrollToProfileGuideState == null) {
            this.scrollToProfileGuideState = new an<>("scroll_to_profile_guide_state", 0);
            this.cacheItems.add(this.scrollToProfileGuideState);
        }
        return this.scrollToProfileGuideState;
    }

    public an<Integer> getShowBindHintCount() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22772, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22772, new Class[0], an.class);
        }
        if (this.showBindHintCount == null) {
            this.showBindHintCount = new an<>("showBindHintCount", 0);
            this.cacheItems.add(this.showBindHintCount);
        }
        return this.showBindHintCount;
    }

    public an<Integer> getShowHashTagBg() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22637, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22637, new Class[0], an.class);
        }
        if (this.showHashTagBg == null) {
            this.showHashTagBg = new an<>("enable_hashtag_background", 0);
            this.cacheItems.add(this.showHashTagBg);
        }
        return this.showHashTagBg;
    }

    public an<Integer> getShowJumpEffectAfterFollowCount() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22757, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22757, new Class[0], an.class);
        }
        if (this.showJumpEffectAfterFollowCount == null) {
            this.showJumpEffectAfterFollowCount = new an<>("jump_effect_after_follow", 0);
            this.cacheItems.add(this.showJumpEffectAfterFollowCount);
        }
        return this.showJumpEffectAfterFollowCount;
    }

    @I18n
    public an<Integer> getShowLoginDialogState() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22759, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22759, new Class[0], an.class);
        }
        if (this.showLoginDialogState == null) {
            this.showLoginDialogState = new an<>("shown_login_dialog_state", 2);
            this.cacheItems.add(this.showLoginDialogState);
        }
        return this.showLoginDialogState;
    }

    public an<Integer> getShowProfileBindHintCount() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22773, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22773, new Class[0], an.class);
        }
        if (this.showProfileBindHintCount == null) {
            this.showProfileBindHintCount = new an<>("showProfileBindHintCount", 0);
            this.cacheItems.add(this.showProfileBindHintCount);
        }
        return this.showProfileBindHintCount;
    }

    public an<Integer> getShowPromoteLicense() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22789, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22789, new Class[0], an.class);
        }
        if (this.showPromoteLicense == null) {
            this.showPromoteLicense = new an<>("show_creator_license_210", 0);
            this.cacheItems.add(this.showPromoteLicense);
        }
        return this.showPromoteLicense;
    }

    public an<Integer> getStoryInfoStickerMaxCount() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22910, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22910, new Class[0], an.class);
        }
        if (this.storyInfoStickerMaxCount == null) {
            this.storyInfoStickerMaxCount = new an<>("story_info_sticker_max_count", 30);
            this.cacheItems.add(this.storyInfoStickerMaxCount);
        }
        return this.storyInfoStickerMaxCount;
    }

    public an<Integer> getStorySettingSyncToast() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22917, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22917, new Class[0], an.class);
        }
        if (this.storySettingSyncToast == null) {
            this.storySettingSyncToast = new an<>("story_setting_sync_toast", 0);
            this.cacheItems.add(this.storySettingSyncToast);
        }
        return this.storySettingSyncToast;
    }

    public an<Integer> getStoryTextStickerMaxCount() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22911, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22911, new Class[0], an.class);
        }
        if (this.storyTextStickerMaxCount == null) {
            this.storyTextStickerMaxCount = new an<>("story_text_sticker_max_count", 30);
            this.cacheItems.add(this.storyTextStickerMaxCount);
        }
        return this.storyTextStickerMaxCount;
    }

    public an<Integer> getSwipeDataCount() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22810, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22810, new Class[0], an.class);
        }
        if (this.swipeDataCount == null) {
            this.swipeDataCount = new an<>("swipe_data_count", 0);
            this.cacheItems.add(this.swipeDataCount);
        }
        return this.swipeDataCount;
    }

    public an<Integer> getSyncTT() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22761, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22761, new Class[0], an.class);
        }
        if (this.syncTT == null) {
            this.syncTT = new an<>("sync_to_toutiao", 1);
            this.cacheItems.add(this.syncTT);
        }
        return this.syncTT;
    }

    public an<Float> getSyntheticVideoBitrate() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22700, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22700, new Class[0], an.class);
        }
        if (this.syntheticVideoBitrate == null) {
            this.syntheticVideoBitrate = new an<>("synthetic_video_bitrate", Float.valueOf(1.0f));
            this.cacheItems.add(this.syntheticVideoBitrate);
        }
        return this.syntheticVideoBitrate;
    }

    public an<Integer> getTapDataCount() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22811, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22811, new Class[0], an.class);
        }
        if (this.tapDataCount == null) {
            this.tapDataCount = new an<>("tap_data_count", 0);
            this.cacheItems.add(this.tapDataCount);
        }
        return this.tapDataCount;
    }

    public an<Long> getTodayVideoPlayTime() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22767, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22767, new Class[0], an.class);
        }
        if (this.todayVideoPlayTime == null) {
            this.todayVideoPlayTime = new an<>("today_video_play_time", 0L);
            this.cacheItems.add(this.todayVideoPlayTime);
        }
        return this.todayVideoPlayTime;
    }

    public an<Integer> getUltraResolutionLevel() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22923, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22923, new Class[0], an.class);
        }
        if (this.ultraResolutionLevel == null) {
            this.ultraResolutionLevel = new an<>("ultra_resolution_level", 0);
            this.cacheItems.add(this.ultraResolutionLevel);
        }
        return this.ultraResolutionLevel;
    }

    public an<Integer> getUpGuideNum() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22630, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22630, new Class[0], an.class);
        }
        if (this.upGuideNum == null) {
            this.upGuideNum = new an<>("up_guide_num", -1);
            this.cacheItems.add(this.upGuideNum);
        }
        return this.upGuideNum;
    }

    public an<Integer> getUpdateUserFrequency() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22940, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22940, new Class[0], an.class);
        }
        if (this.updateUserFrequency == null) {
            this.updateUserFrequency = new an<>("update_user_frequency", 0);
            this.cacheItems.add(this.updateUserFrequency);
        }
        return this.updateUserFrequency;
    }

    public an<Integer> getUpdateUserPosition() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22935, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22935, new Class[0], an.class);
        }
        if (this.updateUserPosition == null) {
            this.updateUserPosition = new an<>("update_user_position", -1);
            this.cacheItems.add(this.updateUserPosition);
        }
        return this.updateUserPosition;
    }

    public an<Long> getUploadContactsNoticeLastShowTime() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22643, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22643, new Class[0], an.class);
        }
        if (this.uploadContactsNoticeLastShowTime == null) {
            this.uploadContactsNoticeLastShowTime = new an<>("upload_contacts_notice_last_show_time", 0L);
            this.cacheItems.add(this.uploadContactsNoticeLastShowTime);
        }
        return this.uploadContactsNoticeLastShowTime;
    }

    public an<Integer> getUploadContactsNoticeShowCount() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22644, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22644, new Class[0], an.class);
        }
        if (this.uploadContactsNoticeShowCount == null) {
            this.uploadContactsNoticeShowCount = new an<>("upload_contacts_notice_show_count", 0);
            this.cacheItems.add(this.uploadContactsNoticeShowCount);
        }
        return this.uploadContactsNoticeShowCount;
    }

    public an<Integer> getUploadContactsPolicyInterval() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22809, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22809, new Class[0], an.class);
        }
        if (this.uploadContactsPolicyInterval == null) {
            this.uploadContactsPolicyInterval = new an<>("upload_contacts_policy_interval", 1);
            this.cacheItems.add(this.uploadContactsPolicyInterval);
        }
        return this.uploadContactsPolicyInterval;
    }

    public an<Integer> getUploadContactsPolicyTimes() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22808, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22808, new Class[0], an.class);
        }
        if (this.uploadContactsPolicyTimes == null) {
            this.uploadContactsPolicyTimes = new an<>("upload_contacts_policy_times", 0);
            this.cacheItems.add(this.uploadContactsPolicyTimes);
        }
        return this.uploadContactsPolicyTimes;
    }

    public an<Integer> getUseLiveWallpaper() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22777, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22777, new Class[0], an.class);
        }
        if (this.useLiveWallpaper == null) {
            this.useLiveWallpaper = new an<>("use_live_wallpaper", 0);
            this.cacheItems.add(this.useLiveWallpaper);
        }
        return this.useLiveWallpaper;
    }

    public an<Integer> getUseNewDouyinSaftyCenter() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22749, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22749, new Class[0], an.class);
        }
        if (this.useNewDouyinSaftyCenter == null) {
            this.useNewDouyinSaftyCenter = new an<>("use_new_douyin_safety_center", 0);
            this.cacheItems.add(this.useNewDouyinSaftyCenter);
        }
        return this.useNewDouyinSaftyCenter;
    }

    public an<Integer> getUseSyntheticHardcode() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22699, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22699, new Class[0], an.class);
        }
        if (this.useSyntheticHardcode == null) {
            this.useSyntheticHardcode = new an<>("use_synthetic_hardcode", 0);
            this.cacheItems.add(this.useSyntheticHardcode);
        }
        return this.useSyntheticHardcode;
    }

    public an<Integer> getVerifyExceed() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22722, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22722, new Class[0], an.class);
        }
        if (this.verifyExceed == null) {
            this.verifyExceed = new an<>("verify_exceed", 5);
            this.cacheItems.add(this.verifyExceed);
        }
        return this.verifyExceed;
    }

    public an<Float> getVideoBitrate() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22669, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22669, new Class[0], an.class);
        }
        if (this.videoBitrate == null) {
            this.videoBitrate = new an<>("video_bitrate", Float.valueOf(1.0f));
            this.cacheItems.add(this.videoBitrate);
        }
        return this.videoBitrate;
    }

    public an<Integer> getVideoCommit() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22674, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22674, new Class[0], an.class);
        }
        if (this.videoCommit == null) {
            this.videoCommit = new an<>("video_commit", 30);
            this.cacheItems.add(this.videoCommit);
        }
        return this.videoCommit;
    }

    public an<Integer> getVideoCompose() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22673, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22673, new Class[0], an.class);
        }
        if (this.videoCompose == null) {
            this.videoCompose = new an<>("video_compose", 70);
            this.cacheItems.add(this.videoCompose);
        }
        return this.videoCompose;
    }

    public an<Integer> getWeakNetPreLoadSwitch() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22628, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22628, new Class[0], an.class);
        }
        if (this.weakNetPreLoadSwitch == null) {
            this.weakNetPreLoadSwitch = new an<>("weak_net_pre_load_switch", 1);
            this.cacheItems.add(this.weakNetPreLoadSwitch);
        }
        return this.weakNetPreLoadSwitch;
    }

    public an<Integer> getX2cSwitch() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22924, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22924, new Class[0], an.class);
        }
        if (this.x2cSwitch == null) {
            this.x2cSwitch = new an<>("x2c_switch", 2);
            this.cacheItems.add(this.x2cSwitch);
        }
        return this.x2cSwitch;
    }

    public boolean isFollowFeedAsDefault() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22602, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22602, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (getFollowFeedAsDefault() == null || ((Integer) getFollowFeedAsDefault().c()).intValue() != 1) {
            return false;
        } else {
            return true;
        }
    }

    public an<Integer> isPublishSyncToToutiaoNew() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22784, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22784, new Class[0], an.class);
        }
        if (this.isPublishSyncToToutiaoNew == null) {
            this.isPublishSyncToToutiaoNew = new an<>("is_publish_sync_toutiao_new_new", 0);
            this.cacheItems.add(this.isPublishSyncToToutiaoNew);
        }
        return this.isPublishSyncToToutiaoNew;
    }

    public boolean isOpenForward() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 22604, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 22604, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (PatchProxy.isSupport(new Object[0], null, du.f75777a, true, 88549, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, du.f75777a, true, 88549, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            if (!com.ss.android.g.a.a()) {
                return true;
            }
            if (du.f75778b != null) {
                return du.f75778b.booleanValue();
            }
            if (inst().getOpenForward() != null && ((Integer) inst().getOpenForward().c()).intValue() == 1) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            du.f75778b = valueOf;
            return valueOf.booleanValue();
        }
    }

    public void setCurrentLocaleLanguage(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 22822, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 22822, new Class[]{String.class}, Void.TYPE);
            return;
        }
        getCurrentLocaleLanguage().a(str2);
    }

    public void setImUrlTemplate(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 22814, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 22814, new Class[]{String.class}, Void.TYPE);
            return;
        }
        getImUrlTemplateItem().a(str2);
    }

    public void setInvitedContacts(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 22889, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 22889, new Class[]{String.class}, Void.TYPE);
            return;
        }
        getInvitedContacts().a(str2);
    }

    public void setSameCityActiveId(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 22594, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 22594, new Class[]{String.class}, Void.TYPE);
            return;
        }
        getSameCityActiveId().a(str2);
    }

    @I18n
    public void setShowInvitedContactsFriends(Boolean bool) {
        Boolean bool2 = bool;
        if (PatchProxy.isSupport(new Object[]{bool2}, this, changeQuickRedirect, false, 22890, new Class[]{Boolean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bool2}, this, changeQuickRedirect, false, 22890, new Class[]{Boolean.class}, Void.TYPE);
            return;
        }
        isShowInviteContactsFriends().a(bool2);
    }

    public void setUseTTnet(Boolean bool) {
        Boolean bool2 = bool;
        if (PatchProxy.isSupport(new Object[]{bool2}, this, changeQuickRedirect, false, 22688, new Class[]{Boolean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bool2}, this, changeQuickRedirect, false, 22688, new Class[]{Boolean.class}, Void.TYPE);
            return;
        }
        getIsUseTTnet().a(bool2);
    }

    public void setBeautyModel(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 22710, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 22710, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        getBeautyModelItem().a(Integer.valueOf(i));
    }

    public void setImCommentForwardEnabled(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 22820, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 22820, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        getImCommentForwardEnabledItem().a(Boolean.valueOf(z));
    }

    public void setIsFirstPublishAweme(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 22718, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 22718, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        getFirstPublishAwemeItem().a(Boolean.valueOf(z));
    }

    public void setIsFirstPublishComment(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 22716, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 22716, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        getFirstPublishCommentItem().a(Boolean.valueOf(z));
    }

    @I18n
    public void setLastInviteAllTimeStamp(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 22892, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 22892, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        getLastInviteAllTimeStampItem().a(Long.valueOf(j));
    }

    public void setMultiSelectLimit(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 22817, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 22817, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        getMultiSelectLimitItem().a(Integer.valueOf(i));
    }

    public void setNetworkLibType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 22713, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 22713, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        getNetworkLibTypeItem().a(Integer.valueOf(i));
    }

    public void setOpenImLink(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 22801, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 22801, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        getOpenImLinkItem().a(Integer.valueOf(i));
    }

    public void setShowAddBusinessGoodsDot(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 22596, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 22596, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        getShowAddBusinessGoodsDot().a(Boolean.valueOf(z));
    }
}
