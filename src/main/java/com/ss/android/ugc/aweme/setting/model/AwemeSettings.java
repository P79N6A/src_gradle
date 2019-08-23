package com.ss.android.ugc.aweme.setting.model;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.util.SparseArray;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.sdk.activity.a.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.d.a.e;
import com.ss.android.ugc.aweme.setting.b.b;
import com.ss.android.ugc.aweme.setting.c;
import com.ss.android.ugc.aweme.story.shootvideo.publish.a.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

@Keep
@Deprecated
public class AwemeSettings {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    @SerializedName("activity")
    public ActivityStruct activityStruct;
    @SerializedName("ad_coupon_config")
    public AdCouponConfig adCouponConfig;
    @SerializedName("ad_display_time")
    public int adDisplayTime;
    @SerializedName("ad_intro_for_adversitser_flag")
    private int adIntroForAdversitser_flag;
    @SerializedName("ad_intro_landingpage_url")
    public String adIntroLandingpageUrl;
    @SerializedName("ad_landing_page_config")
    public a adLandingPageConfig;
    @SerializedName("aweme_ad_link_priority")
    public List<String> adLinkPriority;
    @SerializedName("ad_web_container")
    public int adWebContainer;
    @SerializedName("app_google_play")
    public AppStoreScore appStoreScore;
    @SerializedName("assistant_settings")
    public c assistantSettings;
    @SerializedName("at_friends_show_type")
    public int atFriendsShowType;
    @SerializedName("video_duration_limit_ms")
    public long avVideoDurationLimit = 1000;
    @SerializedName("avatar_decoration_enabled")
    public boolean avatarDecorationEnabled = false;
    @SerializedName("awe_network_x_token_disabled")
    public int aweNetworkXTokenDisabled;
    @SerializedName("aweme_switch_1")
    public int awemeSwitch1On;
    @SerializedName("aweme_switch_2")
    public int awemeSwitch2On;
    @SerializedName("awesome_splash_filter_enable")
    public boolean awesomeSplashFilterEnable = false;
    @SerializedName("beauty_model")
    public int beautyModel;
    @SerializedName("bind_fg_guide_texts")
    public List<String> bindFGGuideTexts;
    @SerializedName("bitrate_of_recode_threshold")
    public int bitrateOfRecodeThreshold = 10000000;
    @SerializedName("can_duet")
    public boolean canDuet;
    @SerializedName("im_switch")
    public int canIm = 1;
    @SerializedName("im_image_switch")
    public int canImSendPic;
    @SerializedName("can_show_insights")
    public boolean canInsights;
    @SerializedName("can_be_live_podcast")
    public boolean canLive;
    @SerializedName("can_react")
    public boolean canReact;
    @SerializedName("orange_cdn_config")
    public com.ss.android.ugc.aweme.af.a.a cdnDomainRefresh;
    @SerializedName("close_vframe_upload")
    public int closeFramesUpload;
    @SerializedName("comment_setting_enable")
    public int commentSettingEnable;
    @SerializedName("commerce_use_zhima")
    public int commerceUserZhima;
    @SerializedName("complete_profile_policy")
    public CompleteProfilePolicy completeProfilePolicy;
    @SerializedName("current_region")
    public String currentRegion;
    @SerializedName("default_avatar_uris")
    public List<String> defaultAvatarUrls;
    @SerializedName("default_cover_urls")
    public List<UrlModel> defaultCoverUrls;
    @SerializedName("react_mic_status")
    public int defaultMicState;
    @SerializedName("default_second_tab")
    public boolean defaultSecondTab;
    @SerializedName("default_shake_free_mode")
    public boolean defaultShakeFreeOn;
    @SerializedName("fp_upload_device_url")
    public String deviceInfoUrl = "";
    @SerializedName("device_monitor")
    public boolean deviceMonitor;
    @SerializedName("disable_age_gate")
    public int disableAgeGate;
    @SerializedName("disable_iid_in_share_url")
    public boolean disableIidInShareUrl;
    @SerializedName("disable_ucode_in_share_url")
    public boolean disableUCodeInShareUrl;
    @SerializedName("dislike_reasons")
    private List<DislikeReason> dislikeReasons;
    @SerializedName("dmt_jsbridge_whitelist")
    public List<String> dmtJsBridgeWhiteList;
    @SerializedName("download_check_status")
    public Integer downloadCheckStatus;
    @SerializedName("download_forbidden_toast")
    public String downloadForbiddenToast;
    @SerializedName("is_download_micro_app")
    public int downloadMicroApp = 1;
    @SerializedName("download_sdk_config")
    public Object downloadSdkConfig;
    @SerializedName("enable_anti_aliasing")
    public boolean enableAntiAliasing;
    @SerializedName("enable_email_login")
    public boolean enableEmailLogin;
    @SerializedName("enable_face_to_face")
    public boolean enableFace2Face;
    @SerializedName("enable_fancy_qrcode")
    public int enableFancyQrcode;
    @SerializedName("enable_force_login")
    public int enableForceLogin = 1;
    @SerializedName("ftc_age_enable")
    public int enableFtcAgeGate;
    @SerializedName("enable_hardware_encode")
    public boolean enableHardwareEncode;
    @SerializedName("enable_home_scan_qrcode")
    public boolean enableHomeScanQrCode;
    @SerializedName("enable_hot_start_gps")
    public boolean enableHotStartGps = false;
    @SerializedName("enable_huawei_super_slow")
    public int enableHuaweiSuperSlowMotion;
    @SerializedName("enable_ijk_player")
    public int enableIJKHardwarePlayer;
    @SerializedName("enable_local_music_entrance")
    public boolean enableLocalMusicEntrance;
    @SerializedName("enable_passport_service")
    public boolean enablePassportService = true;
    @SerializedName("download_setting_enable")
    public int enablePrivacyDownloadSetting;
    @SerializedName("enable_profile_link")
    public boolean enableProfileActivity;
    @SerializedName("enable_read_fancy_qrcode")
    public int enableReadFancyQrcode;
    @SerializedName("enable_synthetic_fps_set")
    public boolean enableSyntheticFpsSet;
    @SerializedName("enable_twitter_new_key_secret")
    public boolean enableTwitterNewKeySecret = false;
    @SerializedName("enable_ultra_resolution")
    public boolean enableUltraResolution;
    @SerializedName("enable_upload_mobile_pcid")
    public boolean enableUploadPC = true;
    @SerializedName("enable_upload_sync_ins")
    public boolean enableUploadSyncIns = true;
    @SerializedName("enable_upload_sync_ins_story")
    public boolean enableUploadSyncInsStory = true;
    @SerializedName("enable_upload_sync_twitter")
    public boolean enableUploadSyncTwitter = true;
    @SerializedName("enable_water_bg_mask")
    public boolean enableWaterBgMask;
    @SerializedName("face_detect_interval")
    public int faceDetectInterval;
    @SerializedName("fe_config_collection")
    public FeConfigCollection feConfigCollection;
    @SerializedName("aweme_fe_conf")
    public AwemeFEConfigs feConfigs;
    @SerializedName("feed_display_inner_msg_platform")
    public int feedDisplayInnerMsgPlatform;
    @SerializedName("feed_tab")
    public int feedTab;
    @SerializedName("follow_feed_as_default")
    public int followFeedAsDefault;
    @SerializedName("show_follow_tab_following_limit")
    public int followPopularThreshold;
    @SerializedName("follow_feed_guide_settings")
    public FollowTabGuideStruct followTabGuideStruct;
    @SerializedName("forbid_download_local")
    public int forbidDownloadLocal;
    @SerializedName("forbid_life_story_local_watermark")
    public boolean forbidLifeStoryLocalWatermark;
    @SerializedName("forbid_local_watermark")
    public boolean forbidLocalWatermark;
    @SerializedName("force_use_textureview")
    public List<DeviceInfo> forceUseTextureviewDevices;
    @SerializedName("free_flow_card")
    public FreeFlowCard freeFlowCard;
    @SerializedName("free_flow_card_url_sticker")
    public String freeFlowCardUrl = "";
    @SerializedName("friend_tab_avatar_duration")
    public int friendTabAvatarDuration;
    @SerializedName("friend_tab_settings")
    public FriendTabStruct friendTabSettings;
    @SerializedName("aweme_gecko_offline_host_prefix")
    public List<String> geckoOfflineHostPrefix;
    @SerializedName("global_tips")
    public GlobalTips globalTips;
    @SerializedName("hashtag_regex")
    public String hashTagRegex;
    @SerializedName("hateful")
    public b hateFulConfig;
    @SerializedName("wvalantine_activity_bg_profile_url")
    public String hitRankActivityProfileBackground;
    @SerializedName("wvalantine_activity_bg_url")
    public String hitRankActivityStarBackgroud;
    @SerializedName("wvalantine_activity_status")
    public int hitRankActivityStatus;
    @SerializedName("guide_word_display_settings")
    public HotSearchDisplay hotSearchDisplay;
    @SerializedName("hotsearch_switchs")
    public HotSearchWitch hotSearchWitch;
    @SerializedName("search_carousel_intervals")
    public int hotSearchWordShowIntervals;
    @SerializedName("hotsoon_download_url")
    public String hotsoonDownloadUrl;
    @SerializedName("http_retry_count")
    public int httpRetryCount;
    @SerializedName("http_retry_interval")
    public long httpRetryInterval;
    @SerializedName("http_timeout")
    public long httpTimeOut;
    @SerializedName("https_list")
    public ArrayList<String> httpsList;
    @SerializedName("user_login_window")
    public ThirdLoginSetting i18nThridLoginSetting;
    @SerializedName("im_comment_forward_enabled")
    public boolean imCommentForwardEnabled;
    @SerializedName("upload_video_size_category")
    public List<String> importVideoSizeCategory;
    @SerializedName("in_camera2_black_list")
    public int inCamera2BlackList;
    @SerializedName("in_evening")
    public int inEvening;
    @SerializedName("in_ultra_resolution_black_list")
    public boolean inUltraResBlackList;
    @SerializedName("info_sticker_max_count")
    public int infoStickerMaxCount;
    @SerializedName("is_eea_region")
    public Boolean isEEARegion;
    @SerializedName("enable_hq_vframe")
    public boolean isEnableHqVFrame;
    @SerializedName("is_europe_country")
    public boolean isEuropeCountry;
    @SerializedName("is_force_https")
    public int isForceHttps = 1;
    @SerializedName("with_commerce_entry")
    public boolean isGoodsWhiteUser;
    @SerializedName("is_npth_enable")
    public boolean isNpthEnable;
    @SerializedName("is_ob")
    public boolean isOb;
    @SerializedName("private_available")
    public boolean isPrivateAvailable;
    @SerializedName("is_show_gif_button")
    public int isShowGifButton;
    @SerializedName("nearby_tab")
    public boolean isShowNearByTab;
    @SerializedName("is_target_binding_user")
    public boolean isTargetBindingUser;
    @SerializedName("refresh_available")
    public boolean isUseBackRefresh;
    @SerializedName("is_use_ttnet")
    public boolean isUseTTnet;
    @SerializedName("is_use_tongdun_sdk")
    public boolean isUseTongdunSdk;
    @SerializedName("js_actlog_url")
    public String jsActLogUrl;
    @SerializedName("lab_title")
    public String labTitle;
    @SerializedName("live_default_bitrate")
    public int liveDefaultBitrate;
    @SerializedName("live_fe_conf")
    public LiveFEConfigs liveFEConfigs;
    @SerializedName("live_label_display_settings")
    private LiveLabelDisplaySettings liveLabelDisplaySettings;
    @SerializedName("live_max_bitrate")
    public int liveMaxBitrate;
    @SerializedName("live_min_bitrate")
    public int liveMinBitrate;
    @SerializedName("live_skylight_show_animation")
    public boolean liveSkylightShowAnimation;
    @SerializedName("live_use_zhima")
    public int liveUserZhima;
    @SerializedName("long_video_permitted")
    public boolean longVideoPermitted;
    @SerializedName("long_video_threshold")
    public long longVideoThreshold;
    @SerializedName("luban_entry_url")
    public String lubanEntryUrl;
    @SerializedName("tt_fusion_fuel_sdk_settings")
    public JSONObject mFusionFuelSdkSettings;
    @SerializedName("gdpr_cookies_url")
    public String mGDPRCookiesUrl;
    @SerializedName("gdpr_privacy_url")
    public String mGDPRPrivacyUrl;
    @SerializedName("aweme_gecko_conf")
    public GeckoConfig mGeckoConfig;
    @SerializedName("invite_friends_strategy")
    public int mInviteFriendsStrategy;
    @SerializedName("live_clarity_adapt_auto")
    public int mLiveClarityAdaptAuto;
    @SerializedName("live_shortcut_gift_id")
    public long mLiveShortcutGiftId;
    @SerializedName("show_invite_friends_entry")
    public boolean mShowInviteFriends;
    @SerializedName("video_upload_normalization_param")
    public int maxFansCount;
    @SerializedName("music_billboard_rule_url")
    public String musicBillboardRuleUrl;
    @SerializedName("music_copyright_granted")
    public boolean musicCopyRight;
    @SerializedName("musician_show_type")
    public int musicianShowType;
    @SerializedName("need_choose_languages")
    public String[] needChooseLanguages;
    @SerializedName("need_pre_load")
    public int needPreLoad = 1;
    @SerializedName("negative_share_entry")
    public String negativeShareEntry;
    @SerializedName("network_lib_type")
    public int netWorkLibType;
    @SerializedName("new_anchor_show_bubble")
    public boolean newAnchorShowBubble;
    @SerializedName("not_support_dou_devices")
    public List<DeviceInfo> notSupportDouDevices;
    @SerializedName("notice_close_time")
    public long noticeCloseTime;
    @SerializedName("notice_count_latency")
    public int noticeCountLatency;
    @SerializedName("old_style_challenge_ids")
    public Set<String> oldStyleChallengeIds;
    @SerializedName("open_forward")
    public int openForward;
    @SerializedName("orange_activity_info_use_api")
    public boolean orangeActivityInfoUseApi = false;
    @SerializedName("orginal_musician_url")
    public String orginalMusicianUrl;
    @SerializedName("original_musician_share_style")
    public boolean originalMusicianShare;
    @SerializedName("other_profile_landing_tabs")
    public List<Integer> otherProfileLandingTabs;
    @SerializedName("pic_qrcode_recognition_switch")
    public int picQrcodeRecognitionSwitch = 1;
    @SerializedName("policy_notice_enable")
    public boolean policyNoticeEnanble;
    @SerializedName("popWindowEveryTime_postaweme")
    public boolean popWindowEveryTimePostAweme;
    @SerializedName("popWindowEveryTime_postcomment")
    public boolean popWindowEveryTimePostComment;
    @SerializedName("privacy_reminder")
    public String privacyReminder = "";
    @SerializedName("private_permission")
    public int privatePermission;
    @SerializedName("profile_completion_threshold")
    public float profileCompletionThreshold;
    @SerializedName("profile_completion")
    public ProfilePerfection profilePerfection;
    @SerializedName("progressbar_threshold")
    public long progressBarThreshold;
    @SerializedName("story_publish_sync_duoshan")
    public d publishSyncDuoshanAllConfig;
    @SerializedName("push_pre_permission_view")
    public PushPrePermissionView pushPrePermissionView;
    @SerializedName("qrcode_domain_whitelist")
    public List<String> qrcodeDomainWhiteList;
    @SerializedName("whatsapp_max_idle_days")
    public int quickShareMaxIdleDays = 30;
    @SerializedName("whatsapp_friend_invite_title")
    public String quickShareTitle;
    @SerializedName("video_bitrate_category")
    public List<Float> recordBitrateCategory;
    @SerializedName("record_bitrate_mode")
    public int recordBitrateMode = 1;
    @SerializedName("record_camera_compat_level")
    public int recordCameraCompatLevel = 1;
    @SerializedName("record_camera_type")
    public int recordCameraType;
    @SerializedName("record_open_high_profile")
    public int recordHardwareProfile = 1;
    @SerializedName("video_quality_category")
    public List<Integer> recordQualityCategory;
    @SerializedName("shoot_tutorial_link")
    public String recordTutorialLink;
    @SerializedName("video_quality")
    public int recordVideoQuality;
    @SerializedName("redpackage_on")
    public boolean redPackageOn = true;
    @SerializedName("referral_program_url")
    public String referralProgramUrl;
    @SerializedName("refresh_zhima")
    public int refreshZhima;
    @SerializedName("region_of_residence")
    public String regionOfResidence;
    @SerializedName("remove_follower_switch")
    public boolean removeFollowerSwitch;
    @SerializedName("request_user_info_for_start")
    public boolean requestUserInfoForStart = false;
    @SerializedName("search_tab")
    public List<String> searchTabIndex;
    @SerializedName("search_trend_banner_url")
    public UrlModel searchTrendBannerUrl;
    @SerializedName("self_profile_landing_tabs")
    public List<Integer> selfProfileLandingTabs;
    @SerializedName("self_see_watermark_switch")
    public boolean selfSeeWaterMarkSwitch = true;
    @SerializedName("settings_change_test")
    public int settingChangeTest;
    @SerializedName("settings_version")
    public String settingVersion;
    @SerializedName("shake_free_white_list")
    public int shakeFreeWhiteList;
    @SerializedName("share_direct_with_pic")
    public boolean sharePictureDirect;
    @SerializedName("share_url_whitelist")
    public WhiteList shareUrlWhiteList;
    @SerializedName("share_h5_url_whitelist")
    public List<String> share_h5_url_whitelist;
    @SerializedName("shield_music_sdk")
    public boolean shieldMusicSDK;
    @SerializedName("shopping")
    public ShoppingConfig shoppingConfig;
    @SerializedName("download_setting_desc_enable")
    public boolean showAllowDownloadTip;
    @SerializedName("show_creator_license_230")
    public ShowCreatorLicense showCreatorLicense;
    @SerializedName("enable_hashtag_profile")
    public int showHashTagBg;
    @SerializedName("show_interaction_stickers")
    public boolean showInteractionStickers;
    @SerializedName("show_large_gif")
    public boolean showLargeGif = false;
    @SerializedName("story_support_animate")
    public boolean showLastStoryFrame;
    @SerializedName("show_live_rewards")
    public int showLiveRewards;
    @SerializedName("original_musician_entry")
    public boolean showOriginalMusicianEntry;
    @SerializedName("show_creator_license_210")
    public int showPromoteLicense;
    @SerializedName("fresh_tab")
    public int showTimeLineTab;
    @SerializedName("shutter_sound_enable")
    public boolean shutterSoundEnable;
    @SerializedName("sort_speed_enable")
    public boolean sortSpeedEnable = false;
    @SerializedName("sp")
    public Sp sp;
    @SerializedName("splash_image_center")
    public boolean splashImageCenter = (!com.ss.android.g.a.a());
    @SerializedName("splash_support_timeout")
    public boolean splashSupportTimeOut = false;
    @SerializedName("splash_video_center")
    public boolean splashVideoCenter = (!com.ss.android.g.a.a());
    @SerializedName("life_effects_cold_req")
    public boolean springEffectCacheController = true;
    @SerializedName("star_atlas_setting")
    private StarAtlasSetting starAtlasSetting;
    @SerializedName("star_billboard_rule_url")
    public String starBillboardRuleUrl;
    @SerializedName("sticker_artist_entry")
    public boolean stickerArtistEntry;
    @SerializedName("sticker_artist_url")
    public String stickerArtistUrl;
    @SerializedName("effect_font_list")
    public List<com.ss.android.ugc.aweme.story.shootvideo.textfont.c> storyFontDataList;
    @SerializedName("story_friend_banner_switch")
    public int storyFriendBannerSwitch;
    @SerializedName("story_friend_banner_url")
    public String storyFriendBannerUrl;
    @SerializedName("story_image_play_time")
    public int storyImagePlayTime;
    @SerializedName("sync_to_toutiao")
    public int syncToTT;
    @SerializedName("sync_to_toutiao_url")
    public String syncToTTUrl;
    @SerializedName("synthetic_video_bitrate")
    public float syntheticVideoBitrate;
    @SerializedName("synthetic_video_gop")
    public int syntheticVideoGop = 35;
    @SerializedName("synthetic_video_maxrate")
    public long syntheticVideoMaxRate = 15000000;
    @SerializedName("synthetic_video_preset")
    public int syntheticVideoPreset;
    @SerializedName("synthetic_video_quality")
    public int syntheticVideoQuality;
    @SerializedName("tencent_sdk_disabled")
    public boolean tencentSdkDisabled;
    @SerializedName("text_sticker_max_count")
    public int textStickerMaxCount;
    @SerializedName("third_login_bind_settings")
    public e thirdPlatformLoginSettings;
    @SerializedName("tt_device_info_collect_controller")
    public TTDeviceInfoCollectController ttDeviceInfoCollectController;
    @SerializedName("ttregion")
    public boolean ttRegion;
    @SerializedName("ttnet_route")
    public boolean ttRoute;
    @SerializedName("ttplayer_buffer_duration_switch")
    public int ttplayerBufferDuration;
    @SerializedName("ultra_resolution_level")
    public int ultraResolutionLevel;
    @SerializedName("wx_toast_config")
    public UpdateUserConfig updateUserConfig;
    @SerializedName("upload_origin_audio_track")
    public boolean uploadOriginAudioTrack;
    @SerializedName("upload_contacts_policy_caption")
    public String upload_contacts_policy_caption;
    @SerializedName("upload_contacts_policy_interval")
    public int upload_contacts_policy_interval;
    @SerializedName("upload_contacts_policy_pic")
    public String upload_contacts_policy_pic;
    @SerializedName("upload_contacts_policy_text")
    public String upload_contacts_policy_text;
    @SerializedName("upload_contacts_policy_times")
    public int upload_contacts_policy_times;
    @SerializedName("use_hardcode")
    public int useHardcode;
    @SerializedName("enable_large_gesture_detect_model")
    public boolean useLargeDetectModel = true;
    @SerializedName("enable_large_matting_detect_model")
    public boolean useLargeMattingModel = false;
    @SerializedName("use_live_wallpaper")
    public int useLiveWallpaper;
    @SerializedName("awe_security_center_v2")
    public int useNewDouyinSaftyCenter;
    @SerializedName("use_new_ffmpeg")
    public boolean useNewFFmpeg;
    @SerializedName("use_synthetic_hardcode")
    public int useSyntheticHardcode;
    @SerializedName("use_watermark_hardcode")
    public boolean useWatermarkHardcode;
    @SerializedName("cache_user_recommend")
    public UserCacheSetting userCacheSetting;
    @SerializedName("user_prefer")
    public UserPreferSettings userPrefer;
    @SerializedName("verify_exceed")
    public int verifyExceed;
    @SerializedName("user_badge_click_settings")
    public VerifyTypeSetting verifyTypeSetting;
    @SerializedName("video_bitrate")
    public float videoBitrate;
    @SerializedName("video_commit")
    public int videoCommit;
    @SerializedName("video_compose")
    public int videoCompose;
    @SerializedName("video_preload_size")
    public int videoPreloadSize = 10240;
    @SerializedName("video_size")
    public String videoSize;
    @SerializedName("video_size_category")
    public List<String> videoSizeCategory;
    @SerializedName("wallet_conf")
    public com.ss.android.ugc.aweme.wallet.b walletConfig;
    @SerializedName("weak_net_pre_load_switch")
    public int weakNetPreLoadSwitch = 1;
    @SerializedName("wide_camera_info")
    public int wideCameraInfo;
    @SerializedName("x2c_switch")
    public int x2cSwitch;

    public static class AdCouponConfig {
        @SerializedName("show")
        public int show;
    }

    @Keep
    public static class AppStoreScore {
        @SerializedName("section")
        public int section;
        @SerializedName("switch")
        public int switcher;
        @SerializedName("threshold")
        public int threshold;
    }

    @Keep
    public static class AwemeFEConfigs {
        @SerializedName("business_ec")
        public BusinessEC businessEC;
        @SerializedName("goods_report")
        public GoodsReport goodsReport;
        @SerializedName("link_plan")
        public LinkPlan linkPlan;
        @SerializedName("live")
        public ShopLiveConfig live;
        @SerializedName("mp_tab")
        public MpTab mpTab;
        @SerializedName("poi_error_report")
        public PoiConfig poiConfig;
        @SerializedName("seeding")
        public Seeding seeding;
        @SerializedName("star_atlas_order")
        public StarAtlasOrder starAtlasOrder;
    }

    @Keep
    public static class BusinessEC {
        @SerializedName("page_eshop_toolbox")
        public String pageEShopToolbox;
        @SerializedName("page_edit")
        public String pageEdit;
        @SerializedName("page_home")
        public String pageHome;
    }

    @Keep
    public static class CompleteProfilePolicy {
        public int interval;
        public int times;
    }

    @Keep
    public static class DeviceInfo {
        @SerializedName("brand")
        public String brand;
        @SerializedName("device")
        public String device;
        @SerializedName("model")
        public String model;
    }

    @Keep
    public static class DislikeReason {
        @SerializedName("id")
        public String id;
        @SerializedName("text")
        public String text;
    }

    @Keep
    public static class FEConfig {
        @SerializedName("fallback_url")
        public String fallbackUrl;
        @SerializedName("schema")
        public String schema;
    }

    @Keep
    public static class FeConfigCollection {
        @SerializedName("billboard_fans")
        public FEConfig billboardFans;
        @SerializedName("billboard_star")
        public FEConfig billboardStar;
        @SerializedName("brand_rank")
        public FEConfig brandRank;
        @SerializedName("douyincard")
        public FEConfig douyincard;
        @SerializedName("guardian_child")
        public FEConfig guardianChild;
        @SerializedName("guardian_parent")
        public FEConfig guardianParent;
        @SerializedName("judgment_clause")
        public FEConfig judgementClause;
        @SerializedName("ringtone")
        public FEConfig ringtone;
        @SerializedName("teen_protection")
        public FEConfig teenageProtection;
    }

    @Keep
    public static class FreeFlowCard {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("toast_url_text")
        public String dialogContent = "";
        @SerializedName("toast_slogan")
        public String dialogSlogan;
        @SerializedName("toast_title")
        public String dialogTitle = "";
        @SerializedName("toast_type")
        public int dialogType;
        @SerializedName("toast_url")
        public String dialogUrl = "";
        @SerializedName("entry_url_text")
        public String settingsTitle = "";
        @SerializedName("entry_url")
        public String settingsUrl = "";

        public String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 72230, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 72230, new Class[0], String.class);
            }
            return "FreeFlowCard{dialogUrl='" + this.dialogUrl + '\'' + ", settingsTitle='" + this.settingsTitle + '\'' + ", settingsUrl='" + this.settingsUrl + '\'' + ", dialogTitle='" + this.dialogTitle + '\'' + ", dialogContent='" + this.dialogContent + '\'' + ", dialogType=" + this.dialogType + '}';
        }
    }

    @Keep
    public static class GeckoConfig {
        @SerializedName("initial_channel")
        public List<String> mInitChannels;
        @SerializedName("rn_context_create_timeout")
        public int rnContextCreateTimeOut;
        @SerializedName("rn_preload_context")
        public boolean rnPreloadContextOn = true;
        @SerializedName("rn_use_snapshot")
        public boolean rnSnapShotOn = true;
        @SerializedName("use_new_package_now")
        public boolean useNewPackageNow;
    }

    @Keep
    public static class GlobalTips {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String at_too_more = "";
        public String draft_publish = "";
        public String net_weak = "";
        public String not_comment = "";
        public String not_has_more = "";
        public String not_share = "";
        public String search_tips = "";
        public String self_see_not_share = "";
        public String share_fail = "";

        public static SparseArray<String> buildGlobalTipsMap(GlobalTips globalTips) {
            GlobalTips globalTips2 = globalTips;
            if (PatchProxy.isSupport(new Object[]{globalTips2}, null, changeQuickRedirect, true, 72231, new Class[]{GlobalTips.class}, SparseArray.class)) {
                return (SparseArray) PatchProxy.accessDispatch(new Object[]{globalTips2}, null, changeQuickRedirect, true, 72231, new Class[]{GlobalTips.class}, SparseArray.class);
            }
            SparseArray<String> sparseArray = new SparseArray<>();
            sparseArray.put(C0906R.string.bar, globalTips2.at_too_more);
            sparseArray.put(C0906R.string.pg, globalTips2.not_comment);
            sparseArray.put(C0906R.string.pj, globalTips2.not_share);
            sparseArray.put(C0906R.string.c15, globalTips2.draft_publish);
            sparseArray.put(C0906R.string.bgg, globalTips2.net_weak);
            sparseArray.put(C0906R.string.c3x, globalTips2.self_see_not_share);
            return sparseArray;
        }
    }

    @Keep
    public static class GoodsReport {
        @SerializedName("publish")
        public String publish;
    }

    @Keep
    public static class HonorLevel {
        @SerializedName("schema")
        public String schema;
    }

    @Keep
    public static class HotSearchDisplay {
        @SerializedName("one_display_intervals")
        public long normalGuideDisplayTimeIntervals;
        @SerializedName("most_display_times")
        public int normalGuideDisplayTimes;
        @SerializedName("op_one_display_intervals")
        public long operationGuideDisplayTimeIntervals;
        @SerializedName("op_most_display_times")
        public int operationGuideDisplayTimes;
    }

    @Keep
    public static class HotSearchWitch {
        @SerializedName("hotsearch_aweme_billboard_switch")
        public boolean isHotSearchAwemeBillboardEnable;
        @SerializedName("hotsearch_billboard_switch")
        public boolean isHotSearchBillboardEnable;
        @SerializedName("hotsearch_music_billboard_switch")
        public boolean isHotSearchMusicBillboardEnable;
        @SerializedName("hotsearch_positive_energy_billboard_switch")
        public boolean isHotSearchPositiveEnergyBillboardEnable;
        @SerializedName("hotsearch_star_billboard_switch")
        public boolean isHotSearchStarBillboardEnable;
    }

    @Keep
    public static class LinkPlan {
        @SerializedName("publish")
        public String publish;
        @SerializedName("settings")
        public String settings;
    }

    @Keep
    public static class LiveFEConfigs {
        @SerializedName("honor_level")
        public HonorLevel honorLevel;
    }

    @Keep
    public static class LiveLabelDisplaySettings {
        @SerializedName("display_duration")
        public long displayDuration;
        @SerializedName("display_intervals")
        public long displayIntervals;
        @SerializedName("most_display_times")
        public int mostDisplayTimes;
    }

    @Keep
    public static class MpTab {
        @SerializedName("publish")
        public String publish;
    }

    @Keep
    public static class PoiConfig {
        @SerializedName("poi_detail")
        public String poiDetail;
    }

    public static class ProfilePerfection {
        public float avatar;
        public float birthday;
        public float gender;
        public float location;
        public float nickname;
        public float school;
        @SerializedName("short_id")
        public float shortId;
        public float signature;
    }

    @Keep
    public static class PushPrePermissionView {
        @SerializedName("toast_text")
        public String toastText;
        @SerializedName("toast_title")
        public String toastTitle;
    }

    @Keep
    public static class Seeding {
        @SerializedName("shop_wish_list_url")
        public String shopWishListUrl;
    }

    @Keep
    public static class ShopLiveConfig {
        @SerializedName("merch_picker_url")
        public String merchPickerUrl;
    }

    @Keep
    public static class ShoppingConfig {
        @SerializedName("disable_want")
        public boolean disableWant = true;
        @SerializedName("enable")
        public boolean enable;
        @SerializedName("enable_float_video")
        public boolean enableFloatVideo = true;
        @SerializedName("enable_user")
        public boolean enableUser;
        @SerializedName("law_window")
        public boolean lawWindow;
        @SerializedName("live")
        public ShoppingLiveConfig liveConfig;
        @SerializedName("newbie_help")
        public ShoppingNewbieHelp newbieHelp;
        @SerializedName("order_share_intro_url")
        public String orderShareIntroUrl;
    }

    @Keep
    public static class ShoppingLiveConfig {
        @SerializedName("compatible_with_old_version")
        public boolean commerceLiveCompatibleOld;
        @SerializedName("disable_taobao")
        public int disableTaobao;
    }

    @Keep
    public static class ShoppingNewbieHelp {
        @SerializedName("shop_url")
        public String shopUrl;
    }

    public static class ShowCreatorLicense {
        @SerializedName("click_type")
        public int clickType;
        @SerializedName("popup_content")
        public String content;
        @SerializedName("popup_interval")
        public int interval;
        @SerializedName("popup_linkText")
        public String linkText;
        @SerializedName("popup_msg")
        public String msg;
        @SerializedName("show")
        public int show;
        @SerializedName("popup_times_limit")
        public int timeLimit;
        @SerializedName("popup_title")
        public String title;
        @SerializedName("popup_url")
        public String url;
    }

    @Keep
    public static class StarAtlasOrder {
        @SerializedName("publish")
        public String publish;
    }

    @Keep
    public static class StarAtlasSetting {
        @SerializedName("star_atlas_enable")
        public boolean starAtlasEnable = true;
        @SerializedName("star_atlas_redirect_url")
        public String starAtlasRedirectUrl;
        @SerializedName("star_atlas_url")
        public String starAtlasUrl;
    }

    @Keep
    public static class UpdateUserConfig {
        @SerializedName("wx_toast_enable")
        public boolean enableUpdateUserDialog;
        @SerializedName("wx_toast_frequence")
        public int updateUserFrequency;
        @SerializedName("wx_toast_content")
        public String updateUserPolicyContent;
        @SerializedName("wx_toast_position")
        public int updateUserPosition = -1;
    }

    @Keep
    public static class UserCacheSetting {
        @SerializedName("enable_ru_insert")
        public int enableCacheUserInsert;
        @SerializedName("enable_ru_cache")
        public int enableUserCache;
        @SerializedName("ru_cache_intervals")
        public long fetchUserCacheIntervals;
    }

    public boolean getAdIntroForAdversitserFlag() {
        if (this.adIntroForAdversitser_flag == 1) {
            return true;
        }
        return false;
    }

    public boolean getNeedPreLoad() {
        if (this.needPreLoad == 1) {
            return true;
        }
        return false;
    }

    public int getSharePictureDirect() {
        if (this.sharePictureDirect) {
            return 1;
        }
        return 0;
    }

    public boolean isChangeFollowTab() {
        if (this.feedTab == 1) {
            return true;
        }
        return false;
    }

    public boolean isShowTimeLineTab() {
        if (this.showTimeLineTab == 1) {
            return true;
        }
        return false;
    }

    public long getDisplayDuration() {
        if (this.liveLabelDisplaySettings == null) {
            return 0;
        }
        return this.liveLabelDisplaySettings.displayDuration;
    }

    public long getDisplayIntervals() {
        if (this.liveLabelDisplaySettings == null) {
            return 0;
        }
        return this.liveLabelDisplaySettings.displayIntervals;
    }

    public int getMostDisplayTimes() {
        if (this.liveLabelDisplaySettings == null) {
            return 0;
        }
        return this.liveLabelDisplaySettings.mostDisplayTimes;
    }

    public String getStarAtlasRedirectUrl() {
        if (this.starAtlasSetting == null) {
            return null;
        }
        return this.starAtlasSetting.starAtlasRedirectUrl;
    }

    public String getStarAtlasUrl() {
        if (this.starAtlasSetting == null) {
            return null;
        }
        return this.starAtlasSetting.starAtlasUrl;
    }

    public boolean isStarAtlasNoticeEnable() {
        if (this.starAtlasSetting == null || this.starAtlasSetting.starAtlasEnable) {
            return true;
        }
        return false;
    }

    public String getDislikeReasons() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 72228, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 72228, new Class[0], String.class);
        } else if (this.dislikeReasons != null) {
            return new Gson().toJson((Object) this.dislikeReasons);
        } else {
            return null;
        }
    }

    public String getSearchTabIndex() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 72229, new Class[0], String.class)) {
            return new Gson().toJson((Object) this.searchTabIndex);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 72229, new Class[0], String.class);
    }

    public AwemeSettings setDefaultSecondTab(boolean z) {
        this.defaultSecondTab = z;
        return this;
    }

    public AwemeSettings setDisableAgeGate(int i) {
        this.disableAgeGate = i;
        return this;
    }

    public AwemeSettings setEnableFtcAgeGate(int i) {
        this.enableFtcAgeGate = i;
        return this;
    }

    public AwemeSettings setFriendTabSettings(FriendTabStruct friendTabStruct) {
        this.friendTabSettings = friendTabStruct;
        return this;
    }

    public AwemeSettings setHttpsList(ArrayList<String> arrayList) {
        this.httpsList = arrayList;
        return this;
    }

    public AwemeSettings setIsForceHttps(int i) {
        this.isForceHttps = i;
        return this;
    }

    public AwemeSettings setUseTTnet(boolean z) {
        this.isUseTTnet = z;
        return this;
    }

    public AwemeSettings setUseTongdunSdk(boolean z) {
        this.isUseTongdunSdk = z;
        return this;
    }
}
