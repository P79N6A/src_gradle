package com.ss.android.ugc.aweme.setting.model;

import android.support.annotation.Keep;
import com.aweme.storage.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.account.model.f;
import com.ss.android.ugc.aweme.player.ab.PlayerTypeAbConfig;
import com.ss.android.ugc.aweme.setting.annotation.AbBooleanField;
import com.ss.android.ugc.aweme.setting.annotation.AbExtraField;
import com.ss.android.ugc.aweme.setting.annotation.AbIntField;
import com.ss.android.ugc.aweme.setting.x;
import com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;
import com.ss.android.ugc.traffic.b;
import java.util.List;

@Keep
public class AbTestModel implements f {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("america_record_optim_new")
    @AbIntField(a = "美国拍摄器优化", b = {0, 1, 2, 3}, c = {"不使用美国拍摄器", "使用美国拍摄器", "美拍上传引导方案A", "美拍上传引导方案B"})
    public int americaRecordOptim;
    @SerializedName("unlogin_anti_addicted_continuous_use_time")
    @AbExtraField(a = "登录和账户")
    @AbIntField(a = "防沉迷强制登录单次连续使用时长", b = {10, 30})
    public int antiAddictedContinuousUseTime;
    @SerializedName("unlogin_anti_addicted_enable_login_guide")
    @AbExtraField(a = "登录和账户")
    @AbBooleanField(a = "启动强制登录策略", b = "关闭强制登录策略")
    public boolean antiAddictedLoginGuideEnable;
    @SerializedName("unlogin_anti_addicted_enable_skip_login_guide")
    @AbExtraField(a = "登录和账户")
    @AbBooleanField(a = "允许跳过强制登录", b = "不允许跳过")
    private boolean antiAddictedSkipLoginEnable;
    @SerializedName("unlogin_anti_addicted_total_use_time")
    @AbExtraField(a = "登录和账户")
    @AbIntField(a = "防沉迷强制登录每日连续使用时长", b = {45, 60})
    private int antiAddictedTotalUseTime;
    @SerializedName("enable_apk_share")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "开启 APK 分享", b = "关闭 APK 分享")
    public boolean apkShareIconStyle;
    @SerializedName("enable_autoplay")
    @AbExtraField(a = "Feed")
    @AbIntField(a = "蒙层自动播放功能入口", b = {0, 1}, c = {"不显示自动播放icon", "显示自动播放icon"})
    public int autoPlayIconEnable;
    @SerializedName("poi_nearby_live_stream")
    @AbExtraField(a = "POI")
    @AbIntField(a = "POI同城直播自动播放", b = {0, 1}, c = {"对照组-关闭", "实验组-开启"})
    public int autoPlayLive;
    @SerializedName("aweme_setting_asyn")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "Setting异步优化", b = {0, 1}, c = {"关闭", "开启"})
    public int awemeSettingAsyn = 1;
    @SerializedName("aweme_splash_first_launch_enabled")
    @AbExtraField(a = "商业化")
    @AbBooleanField(a = "开启原生开屏首刷", b = "关闭原生开屏首刷")
    public boolean awemeSplashFirstLaunchEnabled = true;
    @SerializedName("awesome_splash_init_profile_delay_disable")
    @AbExtraField(a = "商业化")
    @AbBooleanField(a = "原生开屏不delay个人页的初始化", b = "原生开屏保留原有逻辑，依然delay个人页的初始化")
    public boolean awesomeSplashInitProfileDelayDisable;
    @SerializedName("ban_recommend_slide_story_carema")
    @AbExtraField(a = "关注Tab")
    @AbIntField(a = "实验：禁掉推荐页左滑进入随拍相机", b = {0, 1}, c = {"线上", "禁掉推荐页左滑进入随拍相机"})
    public int banRecommendSlideStoryCarema;
    @SerializedName("bind_fg_guide_text_index")
    @AbExtraField(a = "登录和账户")
    @AbIntField(a = "绑定 fg notice 文案", b = {-1, 0, 1}, c = {"不显示", "显示第一条文案", "显示第二条文案"})
    public int bindFGGuideTextIndex = -1;
    @SerializedName("bind_phone_for_post_im")
    @AbExtraField(a = "IM")
    @AbIntField(a = "私信绑定", b = {10, 20, 21, 30, 40}, c = {"无限制", "每次", "一次", "自见", "强绑"})
    public int bindPhoneForIm = 10;
    @SerializedName("bind_phone_for_post_aweme")
    @AbExtraField(a = "价值观")
    @AbIntField(a = "发布视频绑定", b = {10, 20, 21, 30, 40}, c = {"无限制", "可以发送(每次都出)", "可以发送(一次)", "只能自见", "无法发送"})
    public int bindPhoneForPostAweme = 10;
    @SerializedName("bind_phone_for_post_comment")
    @AbExtraField(a = "价值观")
    @AbIntField(a = "评论绑定", b = {10, 20, 21, 30, 40}, c = {"无限制", "可以发送(每次都出)", "可以发送(一次)", "只能自见", "无法发送"})
    public int bindPhoneForPostComment = 21;
    @SerializedName("video_auto_model_threshold")
    public double bitrateModelThreshold = -1.0d;
    @SerializedName("bitrate_switch_threshold")
    public double bitrateSwitchThreshold = 0.75d;
    @SerializedName("block_v1")
    @AbExtraField(a = "埋点")
    @AbBooleanField(a = "不上报1.0的点", b = "上报1.0的点")
    public boolean blockV1;
    @SerializedName("block_v3_double_send")
    @AbExtraField(a = "埋点")
    @AbBooleanField(a = "不上报staging_flag", b = "上报staging_flag")
    public boolean blockV3DoubleSend;
    @SerializedName("is_break_resume_check_enabled")
    public boolean breakResumeCheckEnabled = true;
    @SerializedName("storage_clean")
    public a cacheStrategy;
    @SerializedName("show_scroll_to_feed_follow_guide")
    @AbExtraField(a = "Feed")
    @AbIntField(a = "是否展示推荐右滑至关注的引导", b = {0, 1}, c = {"不展示", "展示"})
    public int canShowScrollToFeedFollowGuide;
    @SerializedName("enable_whatsapp_quick_share")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "WhatsApp quick share enabled", b = "WhatsApp quick share disabled")
    public boolean canUseWhatsAppQuickShare;
    @SerializedName("categorylist_use_v2")
    @AbExtraField(a = "发现")
    @AbIntField(a = "I18n使用", b = {0, 1}, c = {"V1接口", "V2接口"})
    public int categoryListUseV2;
    @SerializedName("check_video_cache_request_header")
    public boolean checkVideoCacheRequestHeader = true;
    @SerializedName("click_sky_enter_live_feed")
    @AbExtraField(a = "live")
    @AbIntField(a = "实验组：天窗按钮样式以及打开或者进入直播广场", b = {1, 0}, c = {"进入直播广场", "打开天窗"})
    public int clickSkyEnterLiveFeed;
    @SerializedName("close_client_watermark")
    public int closeClientWatermark;
    @SerializedName("weibo_entry_close")
    @AbIntField(a = "关闭微博入口", b = {0, 1})
    public int closeWeiboEntry;
    @SerializedName("cold_start_preload_first_video")
    public boolean coldStartPreloadFirstVideo = true;
    @SerializedName("cold_start_preload_first_video_new")
    public boolean coldStartPreloadFirstVideoNew;
    @SerializedName("new_combo_send_gift")
    @AbIntField(a = "礼物面板送礼样式", b = {0, 1}, c = {"老版本送礼", "新礼物连送"})
    public int comboGiftSendStyle;
    @AbExtraField(a = "评论")
    @SerializedName("comment_bgcolor_type")
    @AbIntField(a = "评论背景颜色", b = {1, 0}, c = {"白", "黑"})
    @Deprecated
    public int commentBG = 1;
    @SerializedName("switch_order_iron_man")
    @AbExtraField(a = "商业化")
    @AbIntField(a = "提单是否打开小程序", b = {0, 1}, c = {"对照组（h5）", "实验组（小程序）"})
    public int commerceOrderOpenType;
    @SerializedName("commerce_goods_path_id")
    @AbExtraField(a = "商业化")
    public String commercePathId = PushConstants.PUSH_TYPE_NOTIFY;
    @SerializedName("enable_good_search")
    @AbExtraField(a = "搜索")
    @AbIntField(a = "商品搜索", b = {0, 1}, c = {"关闭商品搜索", "开启商品搜索"})
    public int commoditySearchState;
    @SerializedName("correlated_videos_search")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "蒙层支持搜索相似视频", b = "蒙层不支持搜索相似视频")
    public boolean correlatedVideosSearch;
    @SerializedName("d_bind_phone_after_third_party_login")
    @AbExtraField(a = "登录和账户")
    @AbBooleanField(a = "启动第三方登陆后绑定手机", b = "关闭第三方登陆后绑定手机")
    private boolean dBindPhoneAfterThirdPartyLogin;
    @SerializedName("use_new_login_style")
    @AbExtraField(a = "登录和账户")
    @AbIntField(a = "抖音登陆界面", b = {0, 1}, c = {"抖音紫色登陆界面", "抖音白色登陆界面"})
    private int dUseNewLoginStyle;
    @SerializedName("decoder_type")
    @AbExtraField(a = "个人页")
    @AbIntField(a = "265解码器类型", b = {0, 1}, c = {"金山265解码器", "极限265解码器"})
    public int decoderType;
    @SerializedName("play_tab_switch")
    public int defaultRecordTab = 1;
    @SerializedName("detail_animation_time")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "视频播放页打开和关闭的时间动画", b = {0, 1, 2}, c = {"正常", "动画变慢200ms", "动画变慢400ms"})
    public int detailEnterAnimationTime;
    @SerializedName("direct_shoot")
    public int direct_shoot;
    @SerializedName("discover_mvp")
    @AbExtraField(a = "发现")
    @AbIntField(a = "发现激进演化", b = {0, 1}, c = {"关闭", "开启"})
    private int discoverMvpMode;
    @SerializedName("enabled_new_discovery_page")
    @AbExtraField(a = "发现")
    @AbIntField(a = "新版发现页", b = {0, 1}, c = {"关闭", "开启"})
    public int discoverRedesignV2;
    @SerializedName("dislike_with_reason")
    @AbExtraField(a = "Feed")
    @AbIntField(a = "dislike视频选择理由", b = {0, 1, 2}, c = {"老样式(线上)", "新样式(无dislike选项)", "新样式(有dislike选项)"})
    public int dislikeReasonsStyle;
    @SerializedName("dongtai_strategy")
    public int dongtaiStrategy;
    @SerializedName("douplus_bring_to_front")
    @AbExtraField(a = "Dou+")
    @AbIntField(a = "DOU+入口强化方案", b = {0, 1})
    public int douPlusBringToFront = 1;
    @SerializedName("douplus_entry_style")
    @AbExtraField(a = "Dou+")
    @AbIntField(a = "dou+入口增强", b = {1, 2})
    public int douPlusEntryStyle = 1;
    @SerializedName("double_tap_to_like_style")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "双击点赞引导样式", b = {0, 1, 2}, c = {"默认", "去除引导弹窗", "新弹窗样式"})
    public int doubleTapToLikeStyle;
    @SerializedName("download_strategy")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "下载器策略", b = {0, 1, 2}, c = {"线上逻辑", "新下载器，单线程", "新下载器，线程策略"})
    public int downloadStrategy;
    @SerializedName("enable_ab_test_sdk")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "打开ABsdk测试", b = "关闭ABsdk测试")
    public boolean enableAbTestSdk = true;
    @SerializedName("enable_bodydance")
    @AbBooleanField(a = "打开尬舞", b = "关闭尬舞")
    public boolean enableBodydance;
    @SerializedName("enable_caption_watermark")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "打开Caption水印下载", b = "关闭Caption水印下载")
    public boolean enableCaptionWatermark;
    @SerializedName("enable_like_by_author")
    @AbExtraField(a = "评论")
    @AbBooleanField(a = "评论区显示作者点赞标签", b = "评论区不显示作者点赞标签")
    public boolean enableCommentLikedByCreator;
    @SerializedName("enable_company_profile_page_optimize")
    @AbExtraField(a = "个人页")
    @AbBooleanField(a = "商家转换组件优化关", b = "商家转换组件优化开")
    public boolean enableCompanyProfilePageOptimize;
    @SerializedName("enable_concern_live_slide")
    @AbExtraField(a = "live")
    @AbBooleanField(a = "关注天窗直播支持上下滑", b = "关注天窗直播不支持上下滑")
    public boolean enableConcernLiveSlide;
    @SerializedName("country_roaming_enable")
    @AbExtraField
    @AbIntField(a = "数据漫游", b = {0, 1}, c = {"关闭", "开启"})
    private int enableContentRoaming;
    @SerializedName("enable_dynamic_rate")
    @AbExtraField(a = "基础业务")
    @AbIntField(a = "动态帧率", b = {0, 1}, c = {"关闭", "开启"})
    public int enableDynamicRate;
    @SerializedName("enable_editor_screen_adaptation")
    @AbBooleanField(a = "生产端适配全面屏", b = "生产端不适配全面屏")
    public boolean enableEditorScreenAdaptation;
    @SerializedName("use_effect_lru_cache")
    @AbExtraField(a = "基础业务")
    @AbBooleanField(a = "使用DiskLRUCache", b = "不使用DiskLRUCache")
    public boolean enableEffectDiskCache;
    @SerializedName("enable_end_watermark_MT")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "MT有客户端结尾水印", b = "MT无客户端结尾水印")
    public boolean enableEndWaterMarkMT;
    @SerializedName("enable_reuse_unreached_data_for_feed_refresh")
    @AbExtraField(a = "Feed")
    @AbBooleanField(a = "feed刷新使用存量视频 已开启", b = "feed刷新使用存量视频 已关闭")
    public boolean enableFeedRefreshFromCache;
    @SerializedName("enable_follow_hint_guid")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "新用户体验优化3.0", b = {0, 1}, c = {"禁掉ollow引导", "打开ollow引导"})
    public int enableFollowHintGuid = 1;
    @SerializedName("enbale_follow_tab_auto_refresh_without_time_limit")
    @AbExtraField(a = "关注Tab")
    @AbBooleanField(a = "自动刷新-去掉时间限制", b = "自动刷新-线上逻辑")
    public boolean enableFollowTabAutoRefreshWithoutTimeLimit;
    @SerializedName("followtab_user_recommend")
    @AbExtraField(a = "Feed")
    @AbBooleanField(a = "打开推荐页好友推荐", b = "关闭推荐页好友推荐")
    public boolean enableFollowTabRecommendUser;
    @SerializedName("enable_follow_tab_unread_alert_inside")
    @AbExtraField(a = "关注Tab")
    @AbBooleanField(a = "关注tab单列内更新提醒", b = "关注tab单列内更新不提醒")
    public boolean enableFollowTabUnreadAlertInside;
    @SerializedName("friends_enhance_followback")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "打开好友推荐回关与负反馈", b = "关闭好友推荐回关与负反馈")
    public boolean enableFriendsEnhanceFollowBack;
    @SerializedName("enable_full_feed_follow_show_live")
    @AbExtraField(a = "关注Tab")
    @AbBooleanField(a = "全屏关注流支持直播-首页", b = "全屏关注流不支持直播-首页")
    public boolean enableFullFeedFollowShowLive;
    @SerializedName("enable_full_screen_aweme_title_expand")
    @AbExtraField(a = "Feed")
    @AbBooleanField(a = "支持显示完整视频描述", b = "不支持显示完整视频描述")
    public boolean enableFullScreenAwemeTitleExpand;
    @SerializedName("enable_global_translation")
    @AbExtraField(a = "Feed")
    @AbBooleanField(a = "打开mt翻译功能", b = "关闭mt翻译功能")
    public boolean enableGlobalTranslation;
    @SerializedName("enable_guide_search")
    @AbExtraField(a = "发现")
    @AbIntField(a = "Guide Search", b = {0, 1}, c = {"关闭", "开启"})
    private int enableGuideSearch;
    @SerializedName("enable_h265")
    @AbBooleanField(a = "允许播放265", b = "不允许播放265")
    public boolean enableH265 = true;
    @SerializedName("enable_h265_black_list")
    @AbBooleanField(a = "打开播放265黑名单", b = "关闭放265黑名单")
    public boolean enableH265BlackList;
    @SerializedName("enable_hbinfo_preload")
    @AbBooleanField(a = "启用新的hbinfo 预加载方案", b = "使用旧的预加载方案，只在消耗一个广告之后预加载")
    public boolean enableHbinfoPreload;
    @SerializedName("enable_hourly_list")
    @AbIntField(a = "小时榜功能开启", b = {0, 1}, c = {"关闭", "开启"})
    public int enableHourRank;
    @SerializedName("enable_jssdk_check")
    @AbExtraField(a = "小程序")
    @AbBooleanField(a = "打开jssdk检查", b = "关闭jssdk检查")
    public boolean enableJssdkCheck = true;
    @SerializedName("share_after_download")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "打开下载完成后引导分享", b = "关闭下载完成后引导分享")
    public boolean enableLeadShareAfterDownload;
    @SerializedName("enable_live_cover_image")
    public int enableLiveCoverImage;
    @SerializedName("enable_live_in_follow_feed_full_screen")
    @AbExtraField(a = "关注Tab")
    @AbBooleanField(a = "全屏流支持直播-关注单列", b = "全屏流不支持直播-关注单列")
    public boolean enableLiveInFollowFeedFullScreen;
    @SerializedName("enable_long_press_guid")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "新用户体验优化3.0", b = {0, 1}, c = {"禁掉长按引导", "打开长按引导"})
    public int enableLongPressGuid = 1;
    @SerializedName("enable_mt_video_search")
    @AbExtraField(a = "发现")
    @AbBooleanField(a = "mt上线视频搜索tab", b = "mt无视频搜索")
    public boolean enableMTVideoSearch;
    @SerializedName("enable_mock_ui_watermark")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "打开类UI水印下载", b = "关闭类UI水印下载")
    public boolean enableMockUIWatermark;
    @SerializedName("enable_multi_account_login")
    @AbExtraField(a = "登录和账户")
    @AbBooleanField(a = "启用多账号登录", b = "关闭多账号登录")
    private boolean enableMultiAccountLogin;
    @SerializedName("enable_multi_player")
    public boolean enableMultiPlayer;
    @SerializedName("enable_music_detail_guid")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "新用户体验优化3.0", b = {0, 1}, c = {"禁掉音乐cover引导", "打开音乐cover引导"})
    public int enableMusicDetailGuid = 1;
    @SerializedName("enable_new_user_detail_share_icon")
    @AbIntField(a = "强化非视频的分享按键", b = {0, 1}, c = {"三个点", "分享图标"})
    public int enableNewUserDetailShareIcon;
    @SerializedName("enable_new_user_guide")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "新版新用户引导", b = "旧版用户引导")
    public boolean enableNewUserGuide;
    @SerializedName("enable_notification_prefetch_video")
    @AbIntField(a = "是否对push过来的Video进行预加载", b = {0, 1}, c = {"不需要预加载", "需要预加载"})
    public int enableNotificationPrefetchVideo;
    @SerializedName("one_click_login_switch")
    @AbExtraField(a = "登录和账户")
    @AbBooleanField(a = "启用一键登陆", b = "关闭一键登录")
    private boolean enableOneClickLogin;
    @SerializedName("one_click_token_preloaded")
    @AbExtraField(a = "登录和账户")
    @AbBooleanField(a = "启动一键登录预加载", b = "关闭一键登录预加载")
    private boolean enableOneClickLoginPreGet;
    @SerializedName("enable_player_alog")
    public int enablePlayerAlog;
    @SerializedName("enable_player_log")
    public int enablePlayerLog = 1;
    @SerializedName("enable_preload_background")
    private int enablePreloadBackground = 1;
    @SerializedName("enable_screenshot_share")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "支持截屏弹出分享弹窗", b = "不支持截屏弹出分享弹窗，同线上逻辑")
    public boolean enableScreenshotShare;
    @SerializedName("enable_share_special_qr_code")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "二维码分享样式", b = {0, 1}, c = {"普通二维码分享", "异形二维码分享"})
    public int enableShareSpecialQRCode;
    @SerializedName("send_gift_shortcut_enable")
    @AbExtraField(a = "live")
    @AbBooleanField(a = "启用直播间快捷礼物", b = "关闭直播间快捷礼物")
    public boolean enableShortcutGift;
    @SerializedName("enable_slide_in_follow_feed_detail")
    @AbExtraField(a = "Feed")
    @AbBooleanField(a = "关注单列进详情页允许滑动", b = "关注单列进详情页禁止滑动")
    public boolean enableSlideInFollowFeedDetail = true;
    @SerializedName("enable_speed_monitor")
    private int enableSpeedMonitor;
    @SerializedName("enable_swipe_up_guid_style3")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "新用户体验优化3.0", b = {0, 1}, c = {"禁掉新版上下滑引导", "打开新版上下滑引导"})
    public int enableSwipeUpGuidStyle3;
    @SerializedName("enable_symphony_sdk_musically_debug")
    @AbExtraField(a = "商业化")
    @AbBooleanField(a = "启用musically symphony sdk debug模式", b = "关闭musically symphony sdk debug模式")
    public boolean enableSymphonySdkMusicallyDebug;
    @SerializedName("enable_sync_to_helo_entry")
    @AbExtraField
    @AbBooleanField(a = "开启 Helo 分享入口", b = "关闭 Helo 分享入口")
    public boolean enableSyncToHeloEntry;
    @SerializedName("enable_sync_toutiao")
    public boolean enableSyncToutiao;
    @SerializedName("enable_teenager_mode_new")
    @AbExtraField(a = "价值观")
    @AbIntField(a = "280青少年模式新版", b = {0, 1}, c = {"关闭", "开启"})
    public int enableTeenagerModeNew = 1;
    @SerializedName("enable_transition_to_profile_guid")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "新用户体验优化3.0", b = {0, 1}, c = {"禁掉滑动进入profile引导", "打开滑动进入profile引导"})
    public int enableTransitionToProfileGuid = 1;
    @SerializedName("enable_user_page_action")
    @AbExtraField(a = "Feed")
    @AbBooleanField(a = "打开用户页面切换收集预测", b = "关闭用户页面切换收集预测")
    public boolean enableUserPageAction;
    @SerializedName("enable_verified_profile_relation")
    @AbExtraField(a = "个人页")
    @AbBooleanField(a = "开启认证用户开启关系解释", b = "关闭认证用户关系解释")
    public boolean enableVerifyUserRecommendReason;
    @SerializedName("is_wifi_toast")
    @AbExtraField
    @AbIntField(a = "wifi是否弹窗", b = {0, 1}, c = {"wifi下不弹窗", "wifi下弹窗"})
    public int enableWifiToast;
    @SerializedName("enable_cold_start_land_follow")
    @AbExtraField(a = "关注Tab")
    @AbBooleanField(a = "冷启进关注TAB的记忆功能-开启", b = "冷启进关注TAB的记忆功能-关闭")
    public boolean enable_remember_cold_start_follow;
    @SerializedName("engine_preloader_concurrent_num")
    public int enginePreloaderConcurrentNum = 1;
    @SerializedName("engine_preloader_open_timeout")
    public int enginePreloaderOpenTimeOut = 10;
    @SerializedName("engine_preloader_preload_strategy")
    public int enginePreloaderPreloadStrategy = 1;
    @SerializedName("engine_preloader_rw_timeout")
    public int enginePreloaderRWTimeOut = 10;
    @SerializedName("engine_preloader_queue_or_stack")
    public int enginePreloaderStackOrQueue;
    @SerializedName("fan_following_list_recommend")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "粉丝接入推荐", b = {0, 1}, c = {"不接入", "接入推荐"})
    private int fanFollowingListRecommend;
    @SerializedName("feed_avatar_style")
    @AbExtraField(a = "Feed")
    @AbIntField(a = "视频Feed头像动态+直播AB测试", b = {0, 1}, c = {"线上样式", "动态+直播"})
    public int feedAvatarStyle;
    @SerializedName("is_feed_load_cache_v3")
    public int feedCacheEnabled;
    @SerializedName("is_feed_load_cache_v3_time")
    public int feedCacheTimeout;
    @SerializedName("play_twice_share_show_friends")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "分享引导出应用内分享icon", b = "分享引导不出应用内分享icon")
    public boolean feedDisplayInnerMsgPlatform;
    @SerializedName("feed_follow_button_strategy")
    @AbExtraField(a = "Feed")
    @AbIntField(a = "推荐feed头像关注按钮", b = {0, 1, 2}, c = {"默认", "加号按钮不去掉", "加号去掉"})
    public int feedFollowButton;
    @SerializedName("feed_goods_slide_card_style_v2")
    @AbExtraField(a = "商业化")
    @AbIntField(a = "电商卡片", b = {0, 1}, c = {"对照组", "实验组"})
    public int feedGoodsCardStyle;
    @SerializedName("feed_overtime_hours")
    @AbExtraField(a = "网络库/加载")
    public int feedOvertimeHours = 48;
    @SerializedName("animation_duration_when_refresh_by_reusing_unreached_data")
    public double feedRefreshAnimDuration = 0.4d;
    @AbExtraField(a = "Feed")
    @SerializedName("feed_style")
    @AbIntField(a = "feed_style", b = {0, 1, 2}, c = {"大屏", "双列，露出头像、昵称、赞、标签、和文字内容", "双列，露出赞、评论、标签和文字内容"})
    @Deprecated
    public int feedStyle;
    @SerializedName("feed_swipe_left")
    @AbExtraField(a = "关注Tab")
    @AbIntField(a = "首页调整-推荐页左滑进个人页", b = {0, 1}, c = {"允许左滑（线上）", "不允许左滑"})
    public int feedSwipeLeft;
    @SerializedName("feed_tab_name_version")
    @AbExtraField(a = "Feed")
    @AbIntField(a = "首页tab改名实验", b = {0, 1, 2}, c = {"首页+推荐", "发现+推荐", "首页+发现"})
    public int feedTabNameVersion;
    @SerializedName("touch_area_strategy")
    @AbExtraField(a = "Feed")
    @AbIntField(a = "feed页滑动角度", b = {0, 1}, c = {"默认角度", "扩大角度"})
    public int feedTouchAreaStrategy;
    @SerializedName("feedback_host")
    public String feedbackHost;
    @SerializedName("find_fascinating_mode")
    @AbExtraField(a = "发现")
    @AbIntField(a = "发现下部分改版", b = {0, 1, 2}, c = {"不出现发现精彩", "底部发现精彩用新样式", "底部发现精彩用新样式+顶部热搜词区域改版"})
    public int findFascinatingMode;
    @SerializedName("fixed_flash_screen_loop")
    @AbExtraField(a = "Feed")
    @AbBooleanField(a = "Feed屏幕适配无限闪屏修复后", b = "Feed屏幕适配无限闪屏修复前")
    public boolean fixedFlashScreenLoop;
    @SerializedName("fixed_share_icon_order")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "MT/分享渠道顺序固定", b = "MT/分享渠道顺序动态变化")
    public boolean fixedShareIconOrder;
    @SerializedName("flexible_update_strategy")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "灵活更新弹窗策略", b = {0, 1, 2}, c = {"线上逻辑", "每隔1天，总共1次", "每隔2天，总共2次"})
    public int flexibleUpdateStrategy;
    @SerializedName("remove_friend_tab")
    @AbExtraField(a = "关注Tab")
    @AbIntField(a = "关注tab展示样式", b = {0, 1, 2}, c = {"线上样式(对照组)", "展示关注和好友TAB(实验组)", "展示关注TAB(实验组)"})
    public int followFeedDisplayStyle;
    @SerializedName("second_tab_display_type")
    @AbExtraField(a = "Feed")
    @AbIntField(a = "关注单列样式AB", b = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, c = {"线上逻辑", "实验组A，尺寸修改，自动播放", "实验组B，不自动播放", "Ins样式", "Ins样式A", "Ins样式B", "Ins样式C", "Ins样式D", "Ins样式E", "Ins样式F"})
    public int followFeedDisplayType;
    @SerializedName("follow_detail_full_screen")
    @AbExtraField(a = "Feed")
    @AbBooleanField(a = "关注单列进详情页全屏", b = "关注单列进详情页不进全屏")
    public boolean followFeedEnterFullScreenDetail;
    @SerializedName("follow_feed_filter_strategy")
    @AbExtraField(a = "关注Tab")
    @AbIntField(a = "首页调整-关注feed过滤策略", b = {0, 1, 2}, c = {"不过滤（线上）", "过滤直播、转发", "过滤直播、转发、推人"})
    public int followFeedFilterStrategy;
    @SerializedName("follow_feed_first_item_auto_play")
    @AbExtraField(a = "Feed")
    @AbIntField(a = "关注单列自动播放实验", b = {0, 1}, c = {"不自动", "自动"})
    public int followFeedFirstItemAutoPlay;
    @SerializedName("follow_feed_layout_strategy")
    @AbExtraField(a = "关注Tab")
    @AbIntField(a = "首页结构调整", b = {0, 1, 2, 3}, c = {"单列（线上）", "关注移动到首页，同城移到第二个tab", "2tab关注全屏", "2tab关注全屏，同城在推荐左边"})
    public int followFeedLayoutStrategy;
    @SerializedName("live_follow_feed_style")
    @AbExtraField(a = "Feed")
    @AbIntField(a = "关注单列直播样式", b = {1, 2, 3, 4, 5}, c = {"DEFAULT", "A", "B", "C", "D"})
    public int followFeedLiveType;
    @SerializedName("follow_feed_sky_live_strategy")
    @AbExtraField(a = "关注Tab")
    @AbIntField(a = "首页结构调整-关注页直播入口实验", b = {0, 1, 2, 3}, c = {"线上样式", "样式一", "样式二", "样式三"})
    public int followFeedSkyLiveStrategy;
    @SerializedName("follow_feed_type")
    public int followFeedStyle;
    @SerializedName("follow_feed_video_cut_type")
    @AbIntField(a = "关注页视频裁减方案", b = {1, 2, 3, 4}, c = {"老关注裁剪逻辑", "视频比例4:3 大画幅", "视频比例4:3 小画幅", "视频比例5:4"})
    public int followFeedVideoCutType = 1;
    @SerializedName("follow_live_skylight_auto_show_strategy")
    @AbExtraField(a = "关注Tab")
    @AbIntField(a = "关注直播天窗自动展开策略", b = {0, 1, 2}, c = {"默认", "冷启动自动展示", "有直播时自动展开"})
    public int followLiveSkylightAutoShowStrategy;
    @SerializedName("follow_tab_auto_refresh_on_top")
    @AbExtraField(a = "Feed")
    @AbBooleanField(a = "关注置顶自动刷新", b = "关注置顶不自动刷新")
    public boolean followTabAutoRefreshOnTop;
    @AbExtraField(a = "Feed")
    @SerializedName("follow_tab_style")
    @AbIntField(a = "follow_tab_style", b = {0, 1}, c = {"单列大屏", "双列"})
    @Deprecated
    public int followTabStyle;
    @SerializedName("follow_toast_type")
    @AbExtraField
    @AbIntField(a = "关注页面弹窗策略", b = {0, 1}, c = {"策略不变", "在原有策略上判断是否在关注页面点击过暂停，点击过则不自动播放"})
    public int followToastType;
    @SerializedName("follow_top_live_breath")
    @AbExtraField(a = "关注Tab")
    @AbIntField(a = "关注tab顶部天窗“呼吸”实验3.0", b = {0, 1}, c = {"线上样式", "关注tab直播呼吸动效"})
    public int followTopLiveBreath;
    @SerializedName("follow_unread_style")
    @AbExtraField(a = "关注Tab")
    @AbIntField(a = "首页调整-首页关注的未读提醒样式", b = {0, 1, 2}, c = {"不提醒（线上）", "小药丸", "小黄点"})
    public int followUnreadStyle;
    @SerializedName("new_third_party_user_forbid_skipping_bind_phone")
    @AbExtraField(a = "登录和账户")
    @AbBooleanField(a = "第三方注册不允许跳过绑定手机号", b = "第三方注册允许跳过绑定手机号")
    private boolean forbidSkipBindPhone;
    @SerializedName("force_backup_oldweb")
    @AbBooleanField(a = "backup老webview", b = "新web")
    public boolean forceBackOldWeb;
    @SerializedName("is_force_request_validation")
    public boolean forceRequestValidation;
    @SerializedName("should_force_to_keep_surface_below_kitkat")
    public boolean forceToKeepSurfaceBelowKITKAT;
    @SerializedName("force_video_url_use_https")
    public boolean forceVideoUrlUseHttps;
    @SerializedName("ftc_bind_enable")
    @AbExtraField(a = "登录和账户")
    @AbBooleanField(a = "ftc绑定", b = "关闭ftc绑定")
    private boolean ftcBindEnable;
    @SerializedName("enable_full_screen_read_adaption")
    @AbExtraField(a = "Feed")
    @AbBooleanField(a = "全面屏适配2.0版浏览端-生效", b = "全面屏适配2.0版浏览端-不生效")
    public boolean fullScreenAdaptationType;
    @SerializedName("full_screen_live_display_type")
    @AbExtraField(a = "Feed")
    @AbIntField(a = "全屏直播样式，0是实时流，1是静态封面", b = {0, 1, 2}, c = {"线上样式", "实时流", "静态封面"})
    public int fullScreenFeedLiveDisplayType;
    @SerializedName("full_screen_unfollow")
    @AbExtraField(a = "关注Tab")
    @AbIntField(a = "首页调整-全屏样式下，已关注时展示对勾", b = {0, 1}, c = {"不展示（线上）", "展示对勾"})
    public int fullScreenUnfollow;
    @SerializedName("gather_mode")
    @AbIntField(a = "gather_mode", b = {0, 1, 2}, c = {"正常模式", "采集模式", "采集模式同时随机预加载"})
    public int gatherMode;
    @SerializedName("gather_mode_video_level")
    public String gatherModeVideoLevel;
    @SerializedName("im_group_chat_switch")
    @AbExtraField(a = "IM")
    @AbIntField(a = "打开创建聊天入口", b = {0, 1}, c = {"关闭创建聊天入口", "打开创建聊天入口"})
    public int groupChatSwitch;
    @SerializedName("h265_play_addr_policy_unify")
    @AbExtraField(a = "视频")
    @AbBooleanField(a = "预加载对h265地址进行二次验证", b = "预加载不对h265地址进行二次验证")
    public boolean h265PlayAddrPolicyUnify = true;
    @SerializedName("home_shot_icon")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "首页拍摄入口样式", b = {0, 1, 2, 3}, c = {"线上+图标", "实验组1图标", "实验组2图标", "实验组3图标"})
    public int homeShotIcon;
    @SerializedName("hot_live_enter_new_style")
    @AbExtraField(a = "live")
    @AbIntField(a = "热门直播新样式", b = {0, 1})
    public int hotLiveEnterNewStyle;
    @SerializedName("hot_search_icon_type")
    @AbExtraField(a = "Feed")
    @AbIntField(a = "feed页热搜icon样式", b = {0, 1}, c = {"旧:放大镜", "新:放大镜+地球"})
    public int hotSearchIconType;
    @SerializedName("hot_search_ranking_item_style")
    @AbExtraField(a = "发现")
    @AbIntField(a = "热搜榜Item样式", b = {0, 1}, c = {"没有图片", "有图片"})
    public int hotSearchRankingItemStyle;
    @SerializedName("new_hot_search_section")
    @AbExtraField(a = "发现")
    @AbIntField(a = "热搜栏", b = {0, 1}, c = {"旧版", "新版"})
    public int hotSearchType;
    @SerializedName("i18n_new_follow_feed_style")
    @AbExtraField(a = "Feed")
    @AbIntField(a = "MT单列关注", b = {0, 1}, c = {"不启用", "启用"})
    public int i18nNewFollowFeedStyle;
    @SerializedName("login_platforms_from_server")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "是否从服务端获取登录方式", b = {0, 1}, c = {"不", "获取"})
    private int i18nNewLoginPlatformStrategy;
    @SerializedName("mt_comment_api_v2")
    @AbExtraField(a = "评论")
    @AbBooleanField(a = "开启盖楼模式", b = "关闭盖楼模式")
    public boolean i18nReplyBuildingStyle;
    @SerializedName("i18n_share_button_style")
    public int i18nShareButtonStyle;
    @SerializedName("im_fans_vc_style")
    @AbExtraField(a = "IM")
    @AbIntField(a = "IM粉丝页展示模式", b = {0, 1}, c = {"普通粉丝列表", "折叠粉丝 + 推荐列表"})
    public int imFansVsStyle;
    @SerializedName("im_fragment_style")
    @AbExtraField(a = "IM")
    @AbIntField(a = "联系人列表改版", b = {0, 1}, c = {"关闭新版联系人列表", "打开新版联系人列表"})
    private int imNewRelationFragmentStyle;
    @SerializedName("im_home_style")
    @AbExtraField(a = "IM")
    @AbIntField(a = "消息页改版", b = {0, 1}, c = {"关闭消息页联系人tab", "打开消息页联系人tab"})
    private int imNotificationTabStyle;
    @SerializedName("im_qrcode_share_direct")
    @AbExtraField(a = "IM")
    @AbIntField(a = "二维码转发回流", b = {0, 1}, c = {"默认值，跳转到视频详情", "跳转到私信"})
    public int imQrcodeShareDirect;
    @SerializedName("im_share_show_user_icon_plan")
    @AbExtraField(a = "IM")
    @AbIntField(a = "展示分享头像", b = {0, 1, 2, 3, 4}, c = {"不展示", "关注>=5展示", "关注>=10展示", "关注>=15展示", "关注>=20展示"})
    public int imShareShowUserIconPlan;
    @SerializedName("im_share_style")
    @AbExtraField(a = "IM")
    @AbIntField(a = "im 分享样式", b = {1, 2, 3, 4})
    public int imShareStyle = 2;
    @SerializedName("ins_share_type")
    public int insShareType;
    @SerializedName("remind_user_tiktok_hashtag")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "ins分享粘贴文案引导样式", b = {0, 1, 2}, c = {"无", "dialog", "toast"})
    private int instgramShareHashTag;
    @SerializedName("invisible_watermark")
    public boolean invisibleWatermark = true;
    @SerializedName("story_share_type")
    @AbExtraField(a = "好友")
    @AbIntField(a = "站外邀请好友使用图片还是文字口令实验", b = {0, 1}, c = {"图片", "文字"})
    public int inviteWithTextOrPic;
    @SerializedName("profile_intro_new_style")
    @AbExtraField(a = "个人页")
    @AbBooleanField(a = "个人签名大字白色字", b = "个人签名小字灰色字")
    public boolean isBigselfIntroduce;
    @SerializedName("search_carousel")
    @AbExtraField(a = "发现")
    @AbIntField(a = "轮播热搜词", b = {0, 1}, c = {"不轮播", "轮播"})
    public int isCarouselHotSearchWords;
    @SerializedName("is_clear_fresco_memory_cache")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "是否清空Fresco静态图片内存缓存", b = "对照组")
    public boolean isClearFrescoMemoryCache = true;
    @SerializedName("is_copy_link_QR_code_in_first_row")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "D/复制链接二维码在分享第一行", b = "D/复制链接二维码在分享第二行")
    public boolean isCopyLinkQRCodeInFirstRow;
    @SerializedName("description_auto_translate")
    @AbExtraField(a = "Feed")
    @AbBooleanField(a = "feed自动翻译", b = "feed 取消自动翻译")
    public boolean isDescriptionAutoTranslate;
    @SerializedName("disable_empty_profile_auto_show_likes")
    @AbBooleanField(a = "关闭自动跳转到喜欢tab", b = "打开自动跳转到喜欢tab")
    public boolean isDisableAautoShowLikes;
    @SerializedName("enable_alog")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "开启ALog", b = "关闭ALog")
    public boolean isEnableALog = true;
    @SerializedName("enable_alog_upload")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "开启ALog主动上传", b = "关闭ALog主动上传")
    public boolean isEnableALogUpload;
    @SerializedName("enable_block_detect")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "开启卡顿监控", b = "关闭卡顿监控")
    public boolean isEnableBlockDetect = true;
    @SerializedName("enable_bugly")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "MT开启Bugly", b = "MT关闭Bugly")
    public boolean isEnableBugly;
    @SerializedName("enable_check_beta_version")
    public boolean isEnableCheckBetaVersion;
    @SerializedName("enable_fabric")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "开启Fabric", b = "关闭Fabric")
    public boolean isEnableFabric = true;
    @SerializedName("facebook_lite_share")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "facebook lite 链接分享开", b = "facebook lite 链接分享关")
    public boolean isFacebookLiteShareEnable;
    @SerializedName("facebook_url_share")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "facebook 链接分享开", b = "facebook 链接分享关")
    public boolean isFacebookShareLinkEnable;
    @SerializedName("facebook_story")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = " facebook story分享开", b = " facebook story分享关")
    public boolean isFacebookStoryEnable;
    @SerializedName("is_feed_load_cache")
    @AbExtraField(a = "网络库/加载")
    @AbBooleanField(a = "feed冷启动走缓存", b = "feed冷启动不走缓存")
    public boolean isFeedLoadCache = true;
    @SerializedName("is_feed_load_cache_v2")
    @AbExtraField(a = "网络库/加载")
    @AbBooleanField(a = "feed冷启动走缓存V2", b = "feed冷启动不走缓存V2")
    public boolean isFeedLoadCacheV2;
    @SerializedName("is_feed_load_cache_v2_count")
    @AbExtraField(a = "网络库/加载")
    @AbBooleanField(a = "feed冷启动走缓存V2缓存个数", b = "feed冷启动不走缓存V2缓存个数")
    public int isFeedLoadCacheV2Count;
    @SerializedName("is_feed_load_cache_v2_time")
    @AbExtraField(a = "网络库/加载")
    @AbBooleanField(a = "feed冷启动走缓存V2过期小时数", b = "feed冷启动不走缓存V2过期小时数")
    public int isFeedLoadCacheV2Time;
    @SerializedName("is_feed_show_guide")
    private boolean isFeedShowGuide;
    @SerializedName("is_feed_use_ttnet")
    @AbExtraField(a = "Feed")
    @AbBooleanField(a = "使用ttnet", b = "使用okhttp")
    public boolean isFeedUseTTNet;
    @SerializedName("is_feedback_foreground")
    @AbExtraField(a = "价值观")
    @AbBooleanField(a = "反馈入口前置", b = "反馈入口后置")
    public boolean isFeedbackForeground;
    @SerializedName("enable_guess_u_search")
    @AbExtraField(a = "发现")
    @AbBooleanField(a = "搜索中间页使用猜你想搜", b = "搜索中间页使用抖音热点")
    public boolean isGuessUSearchEnabled;
    @SerializedName("is_hash_tag")
    public int isHashTag;
    @SerializedName("is_hook_sp_clear")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "是不是清除SP等待队列", b = "对照组")
    public boolean isHookSPClear = true;
    @SerializedName("enable_hotsearch_aweme_billboard")
    @AbExtraField(a = "搜索")
    @AbBooleanField(a = "展示视频榜", b = "隐藏视频榜")
    public boolean isHotAwemeBillboardEnable;
    @SerializedName("enable_ins_story_share")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "ins story分享开", b = "ins story分享关")
    public boolean isInsStoryEnable;
    @SerializedName("is_local_video_play_enable")
    public boolean isLocalVideoPlayEnable = true;
    @SerializedName("is_low_push_when_active")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "降低优先级，不显示弹窗", b = "显示弹窗")
    public boolean isLowPushWhenActive;
    @SerializedName("messenger_lite_share")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = " messenger lite 链接分享开", b = " messenger lite 链接分享开关")
    public boolean isMessengerLiteEnable;
    @SerializedName("is_monitor_fresco_image_loading")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "是否监控Fresco的未压缩大图片", b = "对照组")
    public boolean isMonitorFrescoImageLoading = true;
    @SerializedName("enable_music_instant_search")
    @AbExtraField(a = "Music")
    @AbBooleanField(a = "打开音乐即搜即得", b = "关闭音乐即搜即得")
    public boolean isMusicInstantSearchEnabled;
    @SerializedName("new_music_detail")
    @AbExtraField(a = "Music")
    @AbIntField(a = "音乐详情页类型", b = {0, 1}, c = {"旧版音乐详情页", "新版音乐详情页"})
    public int isNewMusicDetail;
    @SerializedName("is_open_flow_window")
    public int isOpenFlowWindow = 1;
    @SerializedName("is_preload_local_cache_path_video_play_enable")
    @AbExtraField(a = "视频")
    @AbBooleanField(a = "使用预加载的有效的本地路径播放视频", b = "不使用预加载的本地路径播放视频")
    public boolean isPreloadLocalCachePathVideoPlayEnable;
    @SerializedName("present_duet_chain")
    @AbExtraField(a = "Feed")
    @AbBooleanField(a = "在全屏视频播放器中展示duet视频序列", b = "不在全屏视频播放器中展示duet视频序列")
    public boolean isPresentDuetChain;
    @SerializedName("share_user_style")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "个人主页分享", b = {0, 1, 2}, c = {"原来的样式", "新样式且分享链接", "新样式且分享图片"})
    public int isProfilePageShareStyle;
    @SerializedName("profile_pure_background_style")
    @AbExtraField(a = "个人页")
    @AbBooleanField(a = "纯色背景", b = "高斯背景")
    public boolean isProfilePureBackgroundStyle;
    @SerializedName("recommend_item_show_more_info")
    @AbExtraField(a = "IM")
    @AbBooleanField(a = "启用推人卡片新样式", b = "关闭推人卡片新样式")
    public boolean isRecommendItemShowMoreInfo;
    @SerializedName("is_record_last_network_speed_enabled")
    @AbExtraField(a = "视频")
    public boolean isRecordLastNetworkSpeedEnabled;
    @SerializedName("is_replace_aweme_manager_with_lrucache")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "是否替换AwemeManager的缓存机制", b = "对照组")
    public boolean isReplaceAwemeManagerWithLRUCache = true;
    @SerializedName("is_replace_sp_impl")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "是否替换SharedPreference实现类", b = "对照组")
    private boolean isReplaceSPImpl = true;
    @SerializedName("search_empty_optimize")
    @AbExtraField(a = "发现")
    @AbBooleanField(a = "搜索空结果优化打开", b = "搜索空结果优化关闭")
    public boolean isSearchEmptyOptimizeEnabled;
    @SerializedName("general_search_feed_style")
    @AbExtraField(a = "发现")
    @AbBooleanField(a = "综搜使用Feed全屏播放样式", b = "综搜不使用Feed全屏播放样式")
    public boolean isSearchMixFeedStyle;
    @SerializedName("aweme_share_show_forward")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "分享展示转发", b = {0, 1}, c = {"不启用", "启用"})
    private int isShareDialogShowForward;
    @SerializedName("is_share_link_only")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "分享时不带文案", b = "分享时带文案")
    public boolean isShareLinkOnly;
    @SerializedName("enable_tiktok_discovery_v3_page")
    @AbExtraField(a = "发现")
    @AbBooleanField(a = "Musically发现页3.0 开启", b = "Musically发现页3.0 关闭")
    public boolean isShowDiscoveryV3Page;
    @SerializedName("category_show_branch_billboard_entrance")
    @AbExtraField(a = "发现")
    @AbIntField(a = "单独的榜单入口", b = {0, 1}, c = {"不展示", "展示"})
    public int isShowIndependenceRankingListEntrance;
    @SerializedName("jump_effect_after_follow")
    @AbExtraField(a = "Feed")
    @AbIntField(a = "关注头像动效开关", b = {0, 1, 2, 10}, c = {"对照组：上线方案", "实验A：出现一次", "实验B：关注20以内出现", "必出"})
    public int isShowJumpEffectAfterFollow;
    @SerializedName("local_song_switch")
    @AbExtraField(a = "Music")
    @AbBooleanField(a = "local song展现：on", b = "local song展现：off")
    public boolean isShowLocalSong;
    @SerializedName("is_show_long_video_operation")
    @AbExtraField(a = "视频")
    @AbIntField(a = "长视频播放器固定显示互动入口", b = {0, 1}, c = {"不显示", "显示"})
    public int isShowLongVideoOperation;
    @SerializedName("im_share_dialog_style")
    @AbExtraField(a = "IM")
    @AbBooleanField(a = "显示多选dialog", b = "不显示多选dialog")
    public boolean isShowMultiShareDialog = true;
    @SerializedName("im_mutual_follow_hello_sticker")
    @AbExtraField(a = "IM")
    @AbBooleanField(a = "显示破冰消息", b = "不显示破冰消息")
    public boolean isShowSayHelloMsg = true;
    @SerializedName("show_toutiao_homepage")
    @AbBooleanField(a = "显示头条主页", b = "不显示头条主页")
    public boolean isShowToutiaoProfile;
    @SerializedName("is_smart_feed")
    @AbExtraField(a = "Feed")
    @AbIntField(a = "关注单列SmartFeed", b = {0, 1}, c = {"线上的", "聪明的"})
    public int isSmartFeed;
    @SerializedName("enable_snapchat_share_2")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "snapchat 链接分享开", b = "snapchat 链接分享关")
    public boolean isSnapchatShareEnable;
    @SerializedName("start_replace_resources_get_drawable")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "是否启动替换系统drawable的方法", b = "对照组")
    public boolean isStartReplaceResourcesGetDrawable = true;
    @SerializedName("is_ttnet_intercept_all")
    @AbExtraField(a = "网络库/加载")
    @AbBooleanField(a = "use", b = "no")
    public boolean isTTNetInterceptAll;
    @SerializedName("is_ttnet_intercept_webview")
    @AbExtraField(a = "网络库/加载")
    @AbBooleanField(a = "use", b = "no")
    public boolean isTTNetInterceptWebview;
    @SerializedName("is_ttplayer_async_init")
    @AbExtraField(a = "视频")
    @AbBooleanField(a = "打开ttplayer异步硬解", b = "关闭ttplayer异步硬解")
    public boolean isTTPlayerAsyncInit = true;
    @SerializedName("is_ttplayer_plugin_enabled")
    @AbExtraField(a = "视频")
    @AbBooleanField(a = "开启ttplayer插件加载", b = "关闭ttplayer插件加载")
    public boolean isTTPlayerPluginEnabled = true;
    @SerializedName("is_upload_oom_hprof_file")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "是否上传OOM Hprof文件", b = "对照组")
    public boolean isUploadOOMHprofFile = true;
    @SerializedName("is_use_cookie_sync")
    @AbExtraField(a = "网络库/加载")
    @AbBooleanField(a = "use", b = "no")
    public boolean isUseCookieSync = true;
    @SerializedName("is_feed_immediate")
    @AbExtraField(a = "网络库/加载")
    @AbBooleanField(a = "use", b = "no")
    public boolean isUseFeedImmediate;
    @SerializedName("is_use_fresco_fast_image")
    @AbExtraField(a = "网络库/加载")
    @AbBooleanField(a = "use", b = "no")
    public boolean isUseFrescoFastImage;
    @SerializedName("is_use_net_cache")
    @AbExtraField(a = "网络库/加载")
    @AbBooleanField(a = "ttnet", b = "NetExecutor")
    public boolean isUseNetCache = true;
    @SerializedName("combine_settings_req")
    @AbExtraField(a = "基础业务")
    @AbBooleanField(a = "使用Settings合并Api", b = "不使用Settings合并Api")
    public boolean isUseSettingCombineApi;
    @SerializedName("is_use_ttnet_v2")
    @AbExtraField(a = "网络库/加载")
    @AbBooleanField(a = "ttnet", b = "okhttp")
    public boolean isUseTTNet = true;
    @SerializedName("is_use_ttnet_executor")
    @AbExtraField(a = "网络库/加载")
    @AbBooleanField(a = "ttnet", b = "NetExecutor")
    public boolean isUseTTNetExecutor;
    @SerializedName("user_single_general")
    @AbExtraField(a = "搜索")
    @AbIntField(a = "综搜单双列", b = {0, 1}, c = {"非单列", "单列"})
    private int isUserSingleGeneral;
    @SerializedName("is_video_cache_auto_adust_preload_max")
    public boolean isVideoCacheAutoAdustPreloadMax = true;
    @SerializedName("aweme_follow_show_forward")
    @AbExtraField(a = "Feed")
    @AbBooleanField(a = "展示关注转发Button", b = "不展示关注转发Butotn")
    public boolean isfollowFeedShowForward;
    @SerializedName("jump_to_follow_tab")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "跳转到FollowingTab", b = {0, 1}, c = {"弹登录框", "不弹登录框"})
    public int jumpToFollowTab;
    @SerializedName("musically_digg_detail_list")
    @AbExtraField(a = "IM")
    @AbBooleanField(a = "M通知页-开启点赞列表", b = "M通知页-不开启点赞列表")
    public boolean likeListDetail;
    @SerializedName("line_share_with_link")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "line分享有link", b = "line分享无link")
    public boolean lineShareWithLink;
    @SerializedName("link_selector_type")
    @AbIntField(a = "调度收敛实验", b = {0, 1}, c = {"使用老的网络调度", "打开网络调度收敛"})
    public int linkSelectorType;
    @SerializedName("live_auto_open_window")
    public int liveAutoOpenWindow;
    @SerializedName("show_live_mark_in_detail")
    @AbExtraField(a = "live")
    @AbIntField(a = "直播首页feed", b = {0, 1}, c = {"进入个人详情页", "点击头像进入直播间 "})
    public int liveEntry;
    @SerializedName("live_follow_guide")
    @AbExtraField(a = "live")
    @AbIntField(a = "直播间引导关注", b = {0, 1, 2, 3}, c = {"对照组", "实验组1：观看1min", "实验组2：观看3min", "实验组3：观看5min"})
    public int liveFollowGuide;
    @SerializedName("livelist_refresh_available")
    @AbExtraField(a = "live")
    @AbBooleanField(a = "冷热启动展开story天窗", b = "冷热启动不展开story天窗")
    public boolean livelistRefreshAvailable;
    @SerializedName("load_new_ffmpeg")
    @AbExtraField(a = "视频")
    @AbBooleanField(a = "加载新的ffmpeg", b = "不加载新的ffmpeg")
    public boolean loadNewFFmpeg;
    @SerializedName("login_device_manager_url")
    public String loginDeviceManagerUrl;
    @SerializedName("show_global_multi_func")
    @AbExtraField(a = "Feed")
    @AbIntField(a = "MT详情页是否可以长按进入蒙层", b = {0, 1}, c = {"不可进入", "可以进入"})
    public int longPressInDetailPage;
    @SerializedName("low_frequency_locating_logic")
    @AbExtraField(a = "POI")
    @AbIntField(a = "定位频率优化", b = {0, 1}, c = {"对照组-关闭", "实验组-开启"})
    public int lowFrequencyLocatingLogic;
    @SerializedName("im_associative_emoticon_ab")
    @AbExtraField(a = "IM")
    @AbIntField(a = "联想表情", b = {0, 1}, c = {"关闭", "开启"})
    public int mAssociativeEmoji;
    @SerializedName("m_bind_phone_after_third_party_login")
    @AbExtraField(a = "登录和账户")
    @AbBooleanField(a = "启动第三方登陆后绑定手机", b = "关闭第三方登陆后绑定手机")
    private boolean mBindPhoneAfterThirdPartyLogin;
    @SerializedName("use_new_edit")
    @AbBooleanField(a = "使用新版编辑页面", b = "不使用新版编辑页面")
    private boolean mIsUseNewEdit;
    @SerializedName("music_tt_download")
    @AbExtraField(a = "Music")
    @AbBooleanField(a = "音乐下载使用TTDownload", b = "音乐下载不使用TTDownload")
    public boolean mMusicTTDownload;
    @SerializedName("send_gift_shortcut_guide")
    @AbExtraField(a = "live")
    @AbIntField(a = "送礼引导时间", b = {0, 1, 2, 3}, c = {"无送礼引导", "1min出现引导", "3min出现引导", "5min出现引导"})
    public int mSendGiftShortcutGuide;
    @SerializedName("unlogin_digg_limit")
    @AbExtraField(a = "Feed")
    @AbIntField(a = "MT未登录用户点赞", b = {0, 5, 10, -1}, c = {"线上逻辑", "点赞超过5个视频后，弹登录", "点赞超过10个视频后，弹登录", "点赞永远不弹登录"})
    public int mUnloginDiggLimit;
    @SerializedName("data_usage_config")
    public b mUsageConfig;
    @SerializedName("whatsapp_share_strategy")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "whatsapp分享策略", b = {0, 1, 2, 3}, c = {"纯视频", "视频加文案", "链接卡片", "视频加文字加承载页链接"})
    public int mWhatsappShareType;
    @SerializedName("im_x_display_style")
    @AbExtraField(a = "IM")
    @AbIntField(a = "X-导流策略", b = {0, 1, 1001}, c = {"关导流", "B策略", "A策略"})
    public int mXPlanStyle;
    @SerializedName("main_tab_style")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "Musically Tabbar样式", b = {0, 1}, c = {"图标", "图标+文字"})
    public int mainTabStyle = 1;
    @SerializedName("micro_app_item_type")
    @AbExtraField(a = "小程序")
    @AbIntField(a = "小程序固定入口", b = {0, 1}, c = {"最近使用", "使用最多"})
    public int microAppItemType = 1;
    @SerializedName("mini_emoji_panel_enabled")
    @AbExtraField(a = "评论")
    @AbBooleanField(a = "启用快捷表情面板", b = "不启用快捷表情面板")
    public boolean miniEmojiPanelEnabled;
    @SerializedName("mscene")
    public List<MLModel> modelList;
    @SerializedName("motion_max_minute")
    public int motionMaxMinute = 10;
    @SerializedName("copywriting_in_save_or_download")
    @AbExtraField(a = "Feed")
    @AbIntField(a = "收藏和下载的文案AB测试", b = {0, 1, 2}, c = {"对照组", "实验组1", "实验组2"})
    public int mtCopywritingSaveOrDownload;
    @SerializedName("location_sdk_setting")
    @AbExtraField(a = "Feed")
    @AbIntField(a = "请求地理位置权限弹窗", b = {0, 1, 2, 3, 4}, c = {"对照组", "有弹窗，N=3,上报地理位置", "有弹窗，N=6，上报地理位置", "有弹窗，N=3，不上报地理位置", "没弹窗，上报地理位置信息，6.0以下手机有效"})
    public int mtLocationPopupType;
    @SerializedName("enable_new_style_dislike")
    @AbExtraField(a = "Feed")
    @AbIntField(a = "mt长按蒙层样式", b = {0, 1}, c = {"老样式(线上,同抖音)", "新样式"})
    public int mtMaskLayerStyle;
    @SerializedName("music_list_style")
    @AbExtraField(a = "Music")
    @AbIntField(a = "音乐选择页", b = {0, 1, 2}, c = {"旧版本", "新版本、无详情按钮", "新版本、有详情按钮"})
    public int musicListType = 1;
    @SerializedName("enable_add_sound_new_style")
    @AbExtraField(a = "Music")
    @AbIntField(a = "音乐选择页2", b = {0, 1}, c = {"线上样式", "新样式"})
    public int musicListType2;
    @SerializedName("musically_new_notification_style")
    @AbExtraField(a = "IM")
    @AbBooleanField(a = "M通知页-改版新样式", b = "M通知页-默认样式")
    public boolean musicallyNewNotificationStyle = true;
    @AbExtraField(a = "Feed")
    @SerializedName("nearby_style")
    @AbIntField(a = "nearby_style", b = {1, 2})
    @Deprecated
    public int nearbyStyle;
    @SerializedName("need_upload_gesture_data")
    @AbBooleanField(a = "上报用户手势数据", b = "不上报手势数据")
    public boolean needUploadGestureData;
    @SerializedName("need_recode")
    @AbBooleanField(a = "不省略二次编码", b = "符合条件省略二次编码")
    public boolean need_recode = true;
    @SerializedName("neiguang_enabled")
    @AbIntField(a = "neiguang", b = {0, 1})
    public int neiguangEnabled;
    @SerializedName("use_new_flow_strategy")
    @AbExtraField
    @AbIntField(a = "是否使用新弹窗策略", b = {0, 1}, c = {"不使用", "使用"})
    public int newFlowStrategy;
    @SerializedName("new_follow_feed_comment")
    @AbExtraField(a = "评论")
    @AbIntField(a = "单列feed发布评论入口", b = {0, 1}, c = {"不启用", "启用"})
    public int newFollowFeedComment;
    @SerializedName("new_follow_feed_style")
    @AbExtraField(a = "Feed")
    @AbIntField(a = "抖音单列关注", b = {0, 1}, c = {"不启用", "启用"})
    public int newFollowFeedStyle = 1;
    @SerializedName("enable_history_sug_new_style")
    @AbExtraField(a = "发现")
    @AbIntField(a = "新版搜索历史和Sug", b = {0, 1, 2}, c = {"关闭", "中间页分TAB展示热门推荐", "中间页分TAB不展示热门推荐"})
    public int newHistorySug;
    @SerializedName("new_profile_live_avatar_animation")
    @AbExtraField(a = "个人页")
    @AbIntField(a = "露出直播小窗", b = {0, 1, 2}, c = {"线上状态", "头像出直播中下方有直播流", "头像出红圈，下方有直播流"})
    public int newProfileLiveAvatarAnimation;
    @SerializedName("enable_style4_follow_double_click")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "新用户引导全去掉实验", b = {0, 1}, c = {"线上", "去掉上下滑外其他,增加新的follow，双击"})
    public int newUserGuide4style;
    @SerializedName("new_user_tab_change_switch")
    public int newUserTabChangeSwitch = -1;
    @SerializedName("non_standard_ad_publish_toast_style")
    @AbIntField(a = "非标广告位-发布视频", b = {0, 1, 2}, c = {"关闭", "仅展示", "启用"})
    public int nonStdAdPost;
    @SerializedName("non_standard_ad_hot_search_style")
    @AbIntField(a = "非标广告位-热搜榜", b = {0, 1, 2}, c = {"关闭", "仅展示", "启用"})
    public int nonStdHotSearch;
    @SerializedName("non_standard_ad_music_list_style")
    @AbIntField(a = "非标广告位-热歌榜", b = {0, 1, 2}, c = {"关闭", "仅展示", "启用"})
    public int nonStdMusicList;
    @SerializedName("not_show_notification_tips")
    @AbExtraField(a = "Feed")
    @AbBooleanField(a = "不展示消息提醒", b = "展示消息提醒")
    public boolean notShowNotification;
    @SerializedName("one_bind_type")
    @AbExtraField(a = "登录和账户")
    @AbIntField(a = "一键绑定类型", b = {0, 1, 2}, c = {"不实用一键绑定", "一键绑定不设置密码", "一键绑定设置密码"})
    private int oneBindType;
    @SerializedName("one_login_v2_type")
    @AbExtraField(a = "登录和账户")
    @AbIntField(a = "一键登录流程优化", b = {0, 1, 2}, c = {"原有一键登录", "一键登录优化 + 原文案【手机验证码或密码登录】", "一键登录优化 + 新文案【其他手机号码登录】"})
    private int oneLoginV2Type;
    @SerializedName("comment_filter_switch")
    @AbExtraField(a = "评论")
    @AbBooleanField(a = "开启评论过滤", b = "关闭评论过滤")
    public boolean openCommentFilter;
    @SerializedName("share_openExperienceKit")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "开启厂商合作优化", b = "关闭厂商合作优化")
    public boolean openExperienceKit = true;
    @SerializedName("out_app_share_direct")
    @AbExtraField(a = "IM")
    @AbIntField(a = "im消息回流", b = {0, 1}, c = {"默认值，跳转到视频详情", "跳转到私信"})
    public int outAppShareDirect;
    @SerializedName("dmt_pause_video_when_commenting")
    @AbExtraField(a = "Feed")
    @AbBooleanField(a = "查看评论时视频暂停-暂停", b = "查看评论时视频暂停-不暂停(线上)")
    public boolean pauseVideoWhenCommenting;
    @SerializedName("pb_to_json_method")
    @AbExtraField(a = "网络库/加载")
    @AbIntField(a = "pb转Json方案", b = {0, 1}, c = {"BeanCopy", "Gson"})
    public int pbToJsonMethod;
    @SerializedName("phone_auto_filled")
    @AbExtraField(a = "登录和账户")
    @AbBooleanField(a = "启用手机号自动填充", b = "关闭手机号自动填充")
    private boolean phoneAutoFilled;
    @SerializedName("get_cross_user_access")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "换机ab开关", b = {0, 1})
    private int phoneChangeEnable;
    @SerializedName("pic_qrcode_icon_switch")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "pic_qrcode_icon_switch", b = {0, 1})
    public int picQrCodeIconSwitch;
    @SerializedName("platform_share_notify_ahead")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "分享提醒前置", b = {0, 1})
    public int platformShareNotifyAhead;
    @SerializedName("is_play_link_select_enabled")
    public boolean playLinkSelectEnabled;
    @SerializedName("player_codec_sync_mode")
    public int playerCodecSyncMode;
    @SerializedName("player_event_log_open")
    @AbExtraField(a = "视频")
    @AbBooleanField(a = "打开播放器event日志进applog", b = "关闭播放器event日志进applog")
    public boolean playerEventLogOpen;
    @SerializedName("player_force_no_ijk")
    @AbExtraField(a = "播放器")
    public boolean playerForceNoIJK;
    @SerializedName("player_framews_wait")
    @AbExtraField(a = "播放器")
    @AbIntField(a = "报金山解码器设置是否lowlatency输出", b = {1, 2, 3})
    public int playerFramesWait = 1;
    @SerializedName("player_max_buffer_time")
    public int playerMaxBufferTimeMS = 5000;
    @SerializedName("player_refactor")
    @AbExtraField(a = "视频")
    @AbBooleanField(a = "打开播放器重构", b = "关闭播放器重构")
    public boolean playerRefactor;
    @SerializedName("player_release_on_shoot")
    @AbExtraField(a = "播放器")
    public boolean playerReleaseOnShoot;
    @SerializedName("player_request_timeout")
    public int playerRequestTimeout = 120;
    @SerializedName("player_type")
    @AbExtraField(a = "Feed")
    @AbIntField(a = "播放器类型", b = {0, 1, 3, 4, 6, 5}, c = {"踢踢普雷尔", "爱姐科普雷尔", "意艾克斯噢普雷尔", "爱姐科硬姐", "TT硬解", "踢踢爱姐科引擎"})
    public int playerType;
    @SerializedName("player_type_v2")
    public PlayerTypeAbConfig playerTypeV2;
    @SerializedName("player_use_video_texture_renderer")
    public boolean playerUseVideoTextureRenderer;
    @SerializedName("poi_enable_feed_to_fullscreen")
    @AbExtraField(a = "POI")
    @AbIntField(a = "详情页视频全屏模式", b = {0, 1}, c = {"对照组-关闭", "实验组-开启"})
    public int poiEnableFeedToFullScreen;
    @SerializedName("poi_nearby_accelarated")
    @AbExtraField(a = "POI")
    @AbIntField(a = "同城加载优化", b = {0, 1}, c = {"对照组-关闭", "实验组-开启"})
    public int poiNearbyAccelerated;
    @SerializedName("poi_nearby_fullscreen_showlive")
    @AbExtraField(a = "POI")
    @AbIntField(a = "同城支持直播上下滑动", b = {0, 1}, c = {"对照组：不支持", "实验组：支持"})
    public int poiNearbyFullscreenShowLive;
    @SerializedName("poi_nearby_show_distance")
    @AbExtraField(a = "POI")
    @AbIntField(a = "同城视频详情页展示距离", b = {1, 0}, c = {"对照组-展示", "实验组-不展示"})
    public int poiNearbyShowDistance = 1;
    @SerializedName("poi_nearby_show_poilabel")
    @AbExtraField(a = "POI")
    @AbIntField(a = "同城显示POI Label", b = {0, 1}, c = {"对照组-不显示", "实验组-显示"})
    public int poiNearbyShowPoilabel;
    @SerializedName("poi_open_reserve")
    @AbExtraField(a = "POI")
    @AbIntField(a = "poi详情页预定实验", b = {0, 1}, c = {"对照组-无预定", "实验组-有预定"})
    public int poiOpenReserve = 1;
    @SerializedName("poi_tt_enable")
    @AbExtraField(a = "POI")
    @AbIntField(a = "tt日本poi开关", b = {0, 1}, c = {"对照组", "实验组"})
    public int poiTTEnable;
    @SerializedName("poi_use_mapbox")
    @AbExtraField(a = "POI")
    @AbIntField(a = "POI mapbox", b = {0, 1})
    public int poiUseMapBox;
    @SerializedName("preload_gather_expire")
    public int preloadGatherExpire = 60;
    @SerializedName("preload_gather_mode")
    @AbIntField(a = "preload_gather_mode", b = {0, 1}, c = {"关闭资源采集模式", "预加载资源采集模式"})
    public int preloadGatherMode;
    @SerializedName("feed_preload_idx")
    @AbExtraField(a = "网络库/加载")
    @AbIntField(a = "feed预加载阈值", b = {3, 4, 5, 6, 7})
    public int preloadIndex;
    @SerializedName("preload_strategy")
    private PreloadStrategyConfig preloadStrategyConfig;
    @SerializedName("preloader_type")
    public int preloaderType;
    @SerializedName("enable_privacy_reminder")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "启用隐私说明提示", b = "不启用隐私说明提示")
    public boolean privacyReminder;
    @SerializedName("private_prompt")
    @AbIntField(a = "私聊弹窗", b = {0, 1})
    private int privatePrompt;
    @SerializedName("profile_follow_relation_style")
    @AbExtraField(a = "个人页")
    @AbIntField(a = "个人页改版(三期)", b = {0, 1}, c = {"线上样式", "展示共同关系和关注-粉丝页面"})
    public int profileFollowRelationStyle;
    @SerializedName("enable_profile_navbar_share")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "Action Sheet/分享弹窗AB设置", b = {0, 1}, c = {"线上样式Action Sheet", "分享弹窗"})
    public int profileNavbarShareStyle;
    @SerializedName("profile_recommend_user_strategy")
    @AbExtraField(a = "个人页")
    @AbIntField(a = "发现好友页推荐策略", b = {0, 1}, c = {"老策略", "新策略"})
    public int profileRecommendUserStrategy;
    @SerializedName("profile_recommend_user_unread_strategy")
    @AbExtraField(a = "个人页")
    @AbIntField(a = "个人主页推荐用户未读数", b = {0, 1}, c = {"黄点", "数字"})
    public int profileRecommendUserUnreadStrategy;
    @SerializedName("profile_topic_style")
    @AbExtraField(a = "个人页")
    @AbIntField(a = "个人话题样式", b = {0, 1}, c = {"线上样式", "新样式"})
    public int profileTopicStyle;
    @SerializedName("push_when_screen_on")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "亮屏推送", b = {0, 1, 2, 3, 4, 5, 6})
    public int pushWhenScreenOn;
    @SerializedName("pushdelay_duration")
    @AbExtraField(a = "埋点")
    public int pushdelayDuration;
    @SerializedName("rec_num")
    @AbIntField(a = "关注tab出黄点数字", b = {0, 1})
    public int recNum;
    @SerializedName("music_ailab")
    public int recommentMusicByAI;
    @SerializedName("red_packet_activity_r_action")
    @AbExtraField(a = "商业化")
    @AbIntField(a = "红包导量banner是否跳中间页", b = {0, 1}, c = {"直接下载", "跳中间页"})
    public int redPacketActivityRAction;
    @AbExtraField(a = "Feed")
    @SerializedName("refresh_style")
    @AbIntField(a = "refresh_style", b = {0, 1})
    @Deprecated
    public int refreshStyle;
    @SerializedName("remind_system_push")
    @AbExtraField(a = "IM")
    @AbBooleanField(a = "开启推送开关提醒", b = "关闭推送开关提醒")
    public boolean remindSystemPush;
    @SerializedName("remove_story_strategy")
    @AbExtraField(a = "Feed")
    @AbIntField(a = "随拍下线方案", b = {0, 1, 2}, c = {"线上:左随拍，右直播+搜索 ", "实验组1:左搜索icon，右直播icon", "实验组2:左搜索icon+文字，右直播icon+文字"})
    public int removeStoryStrategy;
    @SerializedName("use_new_comment_style")
    @AbExtraField(a = "评论")
    @AbIntField(a = "评论框如何发起回复", b = {0, 1}, c = {"点击评论后弹窗选择回复", "点击评论直接回复"})
    public int replyStrategy;
    @SerializedName("reveal_video_download")
    @AbExtraField(a = "Feed")
    @AbBooleanField(a = "外露下载按钮", b = "不外露下载按钮")
    public boolean revealVideoDownload;
    @SerializedName("rp_throw_try_catch")
    @AbExtraField(a = "红包")
    @AbBooleanField(a = "主会场异常抛出", b = "主会场异常不抛出")
    public boolean rpThrowTryCatch;
    @SerializedName("screen_adapting")
    @AbBooleanField(a = "使用自研人脸识别", b = "使用商汤")
    private boolean screenAdapting;
    @SerializedName("screen_on_push_max_size")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "亮屏推送max_size", b = {0, 1, 3, 5})
    public int screen_on_push_max_size;
    @SerializedName("item_search_style")
    @AbExtraField(a = "搜索")
    @AbIntField(a = "视频搜索样式", b = {0, 1}, c = {"双列样式", "瀑布流样式"})
    public int searchAwemeStaggered;
    @SerializedName("search_egg_disable_prefetch")
    @AbExtraField(a = "商业化")
    @AbBooleanField(a = "禁止有彩蛋加载时视频预加载", b = "有彩蛋时允许视频预加载")
    public boolean searchEggDisablePrefetch;
    @SerializedName("search_egg_max_wait_to_show_time")
    @AbExtraField(a = "商业化")
    @AbIntField(a = "搜索彩蛋最长等待加载时间", b = {3, 4, 5}, c = {"默认时长", "增加时长"})
    public int searchEggMaxWaitToShowTime = 4;
    @SerializedName("search_in_detail_mode")
    @AbExtraField(a = "发现")
    @AbIntField(a = "视频详情页展示搜索按钮", b = {0, 1, 2}, c = {"feed入口进发现，无新增入口", "feed入口进中间页，无新增入口", "feed入口进中间页，有新增入口，新增入口进中间页"})
    public int searchInDetailMode;
    @SerializedName("search_user_style")
    @AbExtraField(a = "发现")
    @AbIntField(a = "mt搜索用户样式", b = {0, 1, 2, 3}, c = {"线上老样式", "去掉关注按钮，Nickname和username位置不互换", "去掉关注按钮，Nickname和username位置互换", "保留关注按钮，Nickname和username位置互换"})
    public int searchUserStyle;
    @SerializedName("second_tab_follow_feed_sky_live_strategy")
    @AbExtraField(a = "关注Tab")
    @AbIntField(a = "2tab关注全屏直播入口", b = {0, 1}, c = {"不展示", "展示"})
    public int secondTabFollowFeedSkyLiveStrategy;
    @SerializedName("second_tab_last_status")
    @AbExtraField(a = "关注Tab")
    @AbIntField(a = "关注子tab 名称与init定位", b = {0, 1, 2, 3}, c = {"关注 + 关注", "好友 + 好友", "好友 + last", "关注 + last"})
    public int secondTabLastStatus;
    @SerializedName("settings_frequency")
    @AbExtraField(a = "埋点")
    public int settingsFrequency;
    @SerializedName("settings_request_interval")
    private int settingsRequestInterval;
    @SerializedName("settings_version")
    public String settingsVersion;
    @SerializedName("settings_loop")
    @AbExtraField(a = "埋点")
    public int settings_loop;
    @SerializedName("share_button_style")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "分享按钮样式", b = {1, 2, 3})
    public int shareButtonStyle;
    @SerializedName("share_button_style_unite")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "分享按键样式调整", b = {0, 1}, c = {"原样", "实验组"})
    public int shareButtonStyleUnite;
    @SerializedName("share_download_modify_md5")
    @AbIntField(a = "下载视频后处理放折叠", b = {0, 1}, c = {"下载后不处理", "下载后插入UUID"})
    public int shareDownloadModifyMd5;
    @SerializedName("share_guide")
    @AbIntField(a = "分享引导", b = {0, 1, 2}, c = {"不出引导", "播放2次出引导", "播放3次出引导"})
    public int shareGuide;
    @SerializedName("share_guide_daily_limit")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "点赞引导每日分享出现次数", b = {0, -1, -2, 3}, c = {"对照组，线上Loop两次翻转策略", "实验组一，当天扇形翻转出现次数无限制", "实验组二，扇形翻转和线上Loop翻转都不出现", "实验组三，标记扇形翻转实际出现的次数"})
    public int shareGuideDailyLimit;
    @SerializedName("share_guide_threshold")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "分享引导次数", b = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10})
    public int shareGuideThreshold = -1;
    @SerializedName("share_icon_variant")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "分享Icon样式", b = {0, 1, 2, 3, 4, 5, 6, 7}, c = {"非日本地区线上", "线上1.0版本", "loop两次可下载翻转", "播放10s可下载翻转", "播放5s可下载翻转", "下载按钮", "下载按钮，不能下载显示分享按钮", "下载按钮，不能下载显示新版分享按钮"})
    public int shareIconVariant;
    @SerializedName("share_kakaotalk_with_url")
    public int shareKakaoTalkWithUrl;
    @SerializedName("show_duoshan_share")
    @AbExtraField(a = "Feed")
    @AbIntField(a = "分享对话框受限样式", b = {0, 1}, c = {"不带多闪导流", "带多闪导流"})
    public int shareLimitDialogStyle;
    @SerializedName("share_mini_program")
    @AbBooleanField(a = "share_mini_program", b = "share_mini_program")
    @Deprecated
    public boolean shareMiniProgram;
    @SerializedName("show_ads")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "push通知不显示广告", b = {0, 1}, c = {"push通知不显示广告", "push通知显示广告，线上逻辑"})
    public int showAds = 1;
    @SerializedName("bodydance_alert")
    @AbBooleanField(a = "使用尬舞dialog", b = "不使用尬舞dialog")
    public boolean showBodyDanceDialog;
    @SerializedName("guide_word_display")
    @AbExtraField(a = "发现")
    @AbIntField(a = "普通词引导", b = {0, 1, 3}, c = {"不展示", "在第一个视频展示", "在第三个视频展示"})
    public int showDiscoveryGuideType;
    @SerializedName("op_guide_word_display")
    @AbExtraField(a = "发现")
    @AbIntField(a = "运营词引导", b = {0, 1}, c = {"不展示", "在第一个视频"})
    public int showDiscoveryOperationGuideType;
    @SerializedName("show_feed_tag_guide_arrow")
    @AbExtraField(a = "Feed")
    @AbBooleanField(a = "所有业务锚点变成新样式，文案后面统一增加“>”", b = "所有业务锚点保持线上样式")
    public boolean showFeedTagGuideArrow;
    @SerializedName("is_show_feed_back")
    @AbExtraField
    @AbIntField(a = "登录注册反馈按钮", b = {0, 1})
    public int showFeedback;
    @SerializedName("show_follow_tab_avatar_pop")
    @AbExtraField(a = "Feed")
    @AbIntField(a = "关注tab头像弹出", b = {5, 2, 0, -1}, c = {"大于5展示", "大于2展示", "大于0展示", "隐藏tab头像"})
    public int showFollowTabAvatarLimit = -1;
    @SerializedName("show_gdpr_dialog")
    @AbExtraField(a = "价值观")
    @AbBooleanField(a = "显示GDPR弹窗", b = "不显示GDPR弹窗")
    public boolean showGDPRDialog;
    @SerializedName("comment_show_keyboard_strategy")
    @AbExtraField(a = "评论")
    @AbIntField(a = "评论调起键盘阈值", b = {0, 1, 2, 3}, c = {"默认不弹起", "评论数小于0弹起", "评论数小于3弹起", "评论数小于5弹起"})
    public int showKeyboardStrategy;
    @SerializedName("show_live_button_while_not_login")
    @AbExtraField(a = "live")
    @AbBooleanField(a = "未登录用户 展示直播入口", b = "未登录用户 不展示直播入口")
    public boolean showLiveNotLogin;
    @SerializedName("un_logined_click_ask_login")
    public int showLoginDialogWhenClickPublishTab;
    @SerializedName("show_music_detail_new_record_button_style")
    @AbExtraField(a = "Feed")
    @AbBooleanField(a = "打开音乐详情录制按钮新样式", b = "关闭音乐详情录制按钮新样式")
    public boolean showMusicDetailNewRecordButtonStyle;
    @SerializedName("music_show_like_num")
    @AbExtraField(a = "发现")
    @AbIntField(a = "音乐详情页展示点赞数", b = {0, 1}, c = {"不展示", "展示"})
    private int showMusicLike;
    @SerializedName("show_music_detail_new_guide")
    @AbExtraField(a = "Feed")
    @AbBooleanField(a = "新版音乐引导文案", b = "旧版音乐引导文案")
    public boolean showNewMusicGuideText;
    @SerializedName("show_play_count")
    @AbExtraField(a = "Feed")
    @AbIntField(a = "视频和他人页封面展示播放数", b = {0, 1, 2}, c = {"线上样式", "他人主页展示vv，详情页不展示", "他人主页展示vv，详情页也展示vv"})
    public int showPlayCountType;
    @SerializedName("prop_show_like_num")
    @AbExtraField(a = "发现")
    @AbIntField(a = "道具详情页展示点赞数", b = {0, 1}, c = {"不展示", "展示"})
    private int showPropLike;
    @SerializedName("show_push_pre_permission_view_interval")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "通知权限弹出间隔时间", b = {1, 2, 2880}, c = {"1分钟", "2分钟", "2天"})
    public int showPushPrePermissionViewInterval;
    @SerializedName("show_push_pre_permission_view_max_times")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "通知权限弹出最大弹出次数", b = {1, 2, 3, 4, 5}, c = {"1", "2", "3", "4", "5"})
    public int showPushPrePermissionViewMaxTimes;
    @SerializedName("feeds_show_red_dot_type")
    public int showRedDotType;
    @SerializedName("show_remark_icon_style")
    @AbExtraField(a = "个人页")
    @AbIntField(a = "引导填写备注名", b = {0, 1, 2, 3}, c = {"默认", "关注页及他人主页", "粉丝页，发现好友", "both"})
    public int showRemarkIconStyle;
    @SerializedName("feedback_report_ui_display")
    @AbExtraField(a = "价值观")
    @AbIntField(a = "印尼举报按钮", b = {0, 1}, c = {"关闭举报按钮", "开启举报按钮"})
    private int showReportButton;
    @SerializedName("show_spot")
    @AbExtraField(a = "发现")
    @AbBooleanField(a = "热点", b = "热搜")
    public boolean showSpot;
    @SerializedName("hd_transfer_switch")
    @AbIntField(a = "抖火互通", b = {0, 1})
    private int showSyncHotsoon;
    @SerializedName("tag_show_like_num")
    @AbExtraField(a = "发现")
    @AbIntField(a = "挑战详情页展示点赞数", b = {0, 1}, c = {"不展示", "展示"})
    private int showTagLike;
    @SerializedName("count_to_show_teen_mode_guide_alert")
    public int showTeenModeGuideCount;
    @SerializedName("show_uninstall_sheet")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "卸载问卷", b = {0, 1})
    public boolean showUninstallSheet;
    @SerializedName("simplify_poi_entry")
    @AbExtraField(a = "POI")
    @AbIntField(a = "POI入口简化实验", b = {1, 3, 5, 2, 4, 0}, c = {"对照组-入口有展开动画(POI名称后无城市无距离)", "实验组1-入口有展开动画(同城POI名称后有城市无距离)", "实验组2-入口有展开动画(同城POI名称后有距离无城市)", "实验组3-入口无展开动画(同城POI名称后有城市无距离)", "实验组4-入口无展开动画(同城POI名称后有距离无城市)", "实验组5-入口无展开动画(同城POI名称后无城市无距离)"})
    public int simplifyPoiEntry = 1;
    @SerializedName("skylight_new_style")
    @AbExtraField(a = "live")
    @AbBooleanField(a = "打开天窗直播新样式", b = "关闭天窗直播新样式")
    public boolean skyLightNewStyle;
    @SerializedName("skylight_recommend_live")
    @AbExtraField(a = "live")
    @AbBooleanField(a = "引入推荐", b = "不引入推荐")
    public boolean skyLightRecommendLive;
    @SerializedName("slow_start_strategy")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "慢启动实验", b = {0, 1, 2, 3, 4}, c = {"不延迟启动", "延迟500ms", "延迟1s", "延迟2s", "延迟3s"})
    public int slowStartStrategy;
    @SerializedName("smart_preload")
    public x smartPreload;
    @SerializedName("smart_preload_strategy")
    public List<PreloadStrategyConfig> smartPreloadStrategyList;
    @SerializedName("sms_auto_filled")
    @AbExtraField(a = "登录和账户")
    @AbBooleanField(a = "启用短信自动填充", b = "关闭短信自动填充")
    private boolean smsAutoFilled;
    @SerializedName("share_speedRecycler")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "开启个人页RecyclerView优化", b = "关闭个人页RecyclerView优化")
    public boolean speedRecycler;
    @SerializedName("splash_video_transit")
    @AbExtraField(a = "商业化")
    @AbBooleanField(a = "开屏视频广告添加过渡", b = "开屏视频广告不添加过渡")
    public boolean splashVideoTransit = true;
    @SerializedName("spot_list_style")
    @AbExtraField(a = "发现")
    @AbIntField(a = "", b = {0, 1, 2}, c = {"热搜", "纵向", "横向"})
    public int spotListStyle;
    @SerializedName("star_atlas_cooperation_entry_open")
    @AbExtraField(a = "商业化")
    @AbBooleanField(a = "显示个人主页星图链接", b = "关闭个人主页星图链接")
    public boolean starAtlasCooperationEntryOpen;
    @SerializedName("stop_main_anim_when_invisible")
    @AbBooleanField(a = "在控件不可见时停止动画", b = "在控件不可见时不停止动画")
    public boolean stopMainAnimWhenInvisible;
    @SerializedName("stop_previous_video_anima")
    @AbExtraField(a = "Feed")
    @AbBooleanField(a = "Feed停止上一个视频的动画", b = "Feed不停止上一个视频的动画")
    public boolean stopPreviousVideoAnima;
    @SerializedName("story_entrance")
    @AbBooleanField(a = "story已打开", b = "story已关闭")
    public boolean storyEntrance;
    @SerializedName("awesome_splash_show_live_window")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "原生开屏直播天窗逻辑", b = {1, 0}, c = {"结束后展", "下个视频展示"})
    public int storyPanelAwesomeSplashStrategy;
    @SerializedName("suggestion_friends_entrance_type")
    @AbExtraField(a = "Feed")
    @AbIntField(a = "mt好友推荐入口", b = {0, 1, 2, 3}, c = {"无关注页无发现页", "有发现页无关注页", "无发现页有关注页", "有发现页有关注页"})
    public int suggestionFriendsEntranceType;
    @SerializedName("super_res_265")
    public int superRes265;
    @SerializedName("super_res_bitrate")
    public int superResBitrate;
    @SerializedName("super_res_cpu_frequency")
    public int superResCpuFrequency;
    @SerializedName("super_res_cpu_nums")
    public int superResCpuNums;
    @SerializedName("super_res_ratio_level")
    public int superResRatioLevel;
    @SerializedName("support_swipe_back")
    @AbExtraField(a = "基础业务")
    @AbBooleanField(a = "允许右滑返回", b = "不允许右滑返回")
    public boolean supportSwipeBack;
    @SerializedName("swipe_guide_style")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "新上滑引导样式", b = "旧上滑引导")
    public boolean swipeGuideStyle;
    @SerializedName("tabbar_contain_text")
    public int tabbarContainText;
    @SerializedName("teens_mode_days_alert_count")
    @AbExtraField(a = "价值观")
    @AbIntField(a = "弹窗重复间隔天数", b = {0, 1, 2, 3}, c = {"0天", "1天", "2天", "3天"})
    public int teensModeDaysAlertCount;
    @AbExtraField(a = "价值观")
    @AbBooleanField(a = "防沉迷测试开启", b = "防沉迷测试关闭")
    public boolean testAntiAddiction;
    @SerializedName("show_twice_play_favorite_guide")
    @AbExtraField(a = "Feed")
    @AbBooleanField(a = "打开分享icon转收藏引导", b = "关闭分享icon转收藏引导")
    public boolean toUpdateShareIconToFavorite;
    @SerializedName("topview_feed_gap_optimize_enabled")
    @AbExtraField(a = "商业化")
    @AbBooleanField(a = "开启原生开屏热启动后续优化，会抛弃后面的feed内容", b = "保持原样，只做原来的插入逻辑")
    public boolean topviewFeedGapOptimizeEnabled;
    @SerializedName("ttnet_cookie_enable")
    @AbIntField(a = "cookie管理下沉ttnet", b = {0, 1}, c = {"使用ttnet cookie管理", "使用iesnetwork cookie管理"})
    public int ttnetCookieEnable;
    @SerializedName("ttnet_thread_priority")
    public int ttnetThreadPriority = 10;
    @SerializedName("ttplayer_hardware_media_render_type")
    @AbExtraField(a = "视频")
    public int ttplayerHardwareMediaRenderType = 1;
    @SerializedName("ttplayer_is_ipc")
    @AbExtraField(a = "视频")
    @AbIntField(a = "ttplayer_is_ipc", b = {0, 1}, c = {"default", "ipc"})
    public int ttplayerIsIPC;
    @SerializedName("ttplayer_render_type")
    @AbExtraField(a = "视频")
    @AbIntField(a = "ttplayer_render_type", b = {0, 1}, c = {"plane", "default"})
    public int ttplayerRenderType;
    @SerializedName("ttplayer_use_sys_audio_codec")
    @AbExtraField(a = "视频")
    public int ttplayerUseSysAudioCodec;
    @SerializedName("enable_youth_control_plus")
    @AbExtraField(a = "价值观")
    @AbIntField(a = "青少年模式 plus", b = {0, 1})
    public int underageProtect;
    @SerializedName("unify_nickname")
    @AbIntField(a = "黑T用户名展示向白T对齐", b = {0, 1, 2, 3, 4, 5}, c = {"关", "视频详情页", "评论", "通知页面", "视频详情页的声音，mention，mention搜索", "全部修改"})
    public int unifyNickname;
    @SerializedName("use_feedback_bubble")
    @AbExtraField(a = "基础业务")
    @AbBooleanField(a = "反馈弹窗使用bubble", b = "反馈弹窗使用dialog")
    public boolean useFeedbackBubble;
    @SerializedName("use_injection_jsb")
    @AbExtraField(a = "POI")
    @AbIntField(a = "使用注入式jsb", b = {0, 1}, c = {"对照组-关闭", "实验组-开启"})
    public int useInjectionJsb;
    @SerializedName("use_live_wallpaper")
    public int useLiveWallpaper;
    @SerializedName("use_location_sdk")
    @AbExtraField(a = "POI")
    @AbIntField(a = "开启Locaation SDK", b = {0, 1}, c = {"对照组-关闭", "实验组-开启"})
    public int useLocationSDK;
    @SerializedName("use_pb_for_recommend_feed")
    @AbExtraField(a = "网络库/加载")
    @AbBooleanField(a = "推荐feed接口使用pb", b = "推荐feed接口使用Json")
    public boolean usePbForRecommendFeed;
    @SerializedName("use_profile_collection_tab")
    @AbExtraField(a = "个人页")
    @AbIntField(a = "profile是否展现收藏tab", b = {0, 1}, c = {"不展示", "展示"})
    public int useProfileCollectionTab;
    @SerializedName("push_feed_slide")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "push_feed_slide", b = {0, 1})
    public int usePushStyle;
    @SerializedName("share_useNotifySingle")
    @AbExtraField(a = "UG和分享")
    @AbBooleanField(a = "RecyclerView局部刷新", b = "RecyclerView全部刷新")
    public boolean useRecyclerPartialUpdate = true;
    @SerializedName("use_relieve_aweme")
    @AbExtraField(a = "价值观")
    @AbIntField(a = "舒缓视频开关", b = {0, 1})
    public int useRelieveAweme;
    @SerializedName("use_relieve_toast")
    @AbExtraField(a = "价值观")
    @AbIntField(a = "时长提示气泡开关", b = {0, 1})
    public int useRelieveToast;
    @SerializedName("use_short_share")
    @AbIntField(a = "分享短链", b = {0, 1})
    public int useShortShare;
    @SerializedName("use_surface_view")
    @AbExtraField(a = "Feed")
    @AbBooleanField(a = "Feed使用SurfaceView", b = "Feed使用TextureView")
    public boolean useSurfaceView;
    @SerializedName("use_ttnet")
    @AbExtraField(a = "网络库/加载")
    @AbIntField(a = "videocache是否使用ttnet", b = {0, 1}, c = {"对照组", "实验组：使用ttnet"})
    public int useTTNet;
    @SerializedName("use_video_cache_http_dns")
    public boolean useVideoCacheHttpDns;
    @SerializedName("user_following_list_sort_type")
    @AbExtraField
    @AbIntField(a = "用户关注列表排序方式", b = {1, 2})
    public int userFollowingListSortType = 1;
    @SerializedName("homepage_recommend_user")
    @AbExtraField(a = "个人页")
    @AbIntField(a = "抖音他人页用户推荐", b = {0, 1}, c = {"关", "开"})
    public int userRecommend;
    @SerializedName("user_recommend_card_button_style")
    @AbExtraField(a = "个人页")
    @AbIntField(a = "关注tab找人入口强化", b = {0, 1, 2}, c = {"关", "实验组1：回关实验", "实验组2：互相关注实验"})
    public int userRecommendCardButtonStyle;
    @SerializedName("user_recommend_card_enhance")
    @AbExtraField(a = "个人页")
    @AbIntField(a = "全场景推人卡片x号强化", b = {0, 1}, c = {"关", "开"})
    public int userRecommendCardEnhance;
    @SerializedName("user_recommend_strategy")
    @AbExtraField(a = "Feed")
    @AbIntField(a = "他人页用户推荐", b = {0, 1}, c = {"关", "开"})
    public int userRecommendStrategy;
    @SerializedName("user_activate")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "用户挽留弹窗是否显示", b = {0, 1}, c = {"线上样式", "显示用户挽留弹窗"})
    public int userRetainActive;
    @SerializedName("use_mix_record_button")
    @AbBooleanField(a = "使用单击和长按融合拍摄模式", b = "不使用单击和长按拍融合模式")
    public boolean usingMixRecordButton;
    @SerializedName("video_buffering_threshold")
    @AbExtraField(a = "视频")
    @AbIntField(a = "报block并显示loading动画的时间阈值ms", b = {0, 40}, c = {"不设置超时时间", "40毫秒"})
    public int videoBufferringThreshold;
    @SerializedName("cdn_url_timeout_time")
    public long videoCDNUrlTimeoutTime = 2400000;
    @SerializedName("video_cache_read_buffersize")
    public int videoCacheReadBufferSize = 8192;
    @SerializedName("video_cache_write_asynchronous")
    @AbExtraField(a = "视频")
    @AbBooleanField(a = "video_cache_write_asynchronous开", b = "video_cache_write_asynchronous关")
    public boolean videoCacheWriteAsynchronous;
    @SerializedName("video_cover_style")
    @AbExtraField(a = "发现")
    @AbIntField(a = "Cover样式", b = {0, 1}, c = {"静态", "动态"})
    public int videoCoverType;
    @SerializedName("video_download_speed_cost_time")
    @AbExtraField(a = "视频")
    public int videoDownloadSpeedCostTime;
    @SerializedName("video_network_speed_algorithm")
    @AbExtraField(a = "视频")
    @AbIntField(a = "视频测速算法", b = {0, 1, 2}, c = {"默认", "平均值", "细化采样"})
    public int videoNetworkSpeedAlgorithm;
    @SerializedName("video_preload_number")
    private int videoPreloadNumber = 1;
    @SerializedName("video_preload_size")
    private int videoPreloadSize = 10240;
    @SerializedName("video_search_show_style")
    @AbExtraField(a = "发现")
    @AbIntField(a = "视频垂搜展示样式", b = {0, 1, 2, 3}, c = {"对照组", "方案一", "方案二", "方案三"})
    public int videoShowType;
    @SerializedName("video_sound_guide_new_user")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "Video mute strategy", b = {0, 1, 2, 3}, c = {"0 - Play sound normally", "1 - Mute, show button, tap to unmute", "2 - Mute, then gradually increase volume", "3 - Not Mute, only show tips"})
    public int videoSoundGuideMode;
    @SerializedName("video_sound_guide_old_user")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "Video mute strategy", b = {0, 1, 2, 3}, c = {"0 - Play sound normally", "1 - Mute, show button, tap to unmute", "2 - Mute, then gradually increase volume", "3 - Not Mute, only show tips"})
    public int videoSoundGuideModeOldUser;
    @SerializedName("video_speed_queue_size")
    @AbExtraField(a = "视频")
    public int videoSpeedQueueSize = 10;
    @SerializedName("video_stop_record")
    public boolean videoStopRecord;
    @SerializedName("video_switch_https_threshold")
    public int videoSwitchHttpsThreshold;
    @SerializedName("videocache_ttnet_preload_timeout")
    public int videocacheTtnetPreloadTimeout = 30000;
    @SerializedName("videocache_ttnet_proxy_timeout")
    public int videocacheTtnetProxyTimeout = 10000;
    @SerializedName("visible_goods")
    @AbExtraField(a = "商业化")
    @AbIntField(a = "商品入口", b = {0, 1, 2}, c = {"全部不可见", "只在达人的个人页面和用户关注的tab页面可见", "全部入口可见"})
    public int visibleGoods;
    @SerializedName("wait_time")
    @AbExtraField(a = "UG和分享")
    @AbIntField(a = "亮屏推送wait_time", b = {5, 10})
    public int wait_time;
    @SerializedName("webview_radius_solution")
    @AbExtraField(a = "商业化")
    @AbIntField(a = "WebView圆角方案", b = {0, 1, 2}, c = {"对照组：RoundedXXXLayout方案", "实验组1：PorterDuff方案", "实验组2：不展示圆角"})
    public int webViewRadiusSolution;
    @SerializedName("xigua_task_switch_type")
    @AbIntField(a = "西瓜头号任务展示位置", b = {1, 2, 3}, c = {"POI位置", "红包位置", "晚会位置"})
    public int xiGuaTaskPosition;

    @Keep
    public interface CommentBackgroundType {
    }

    @Keep
    public interface CommentStyle {
    }

    public interface IAutoPlay {
    }

    public interface ISmartFeed {
    }

    public int getFindFascinatingMode() {
        return 1;
    }

    public boolean rememberLatestLoginMethod() {
        return false;
    }

    public long getSettingsRequestInterval() {
        return (long) this.settingsRequestInterval;
    }

    public int getAntiAddictedTotalUseTime() {
        return this.antiAddictedTotalUseTime;
    }

    public int getOneBindType() {
        return this.oneBindType;
    }

    public int getOneLoginV2Type() {
        return this.oneLoginV2Type;
    }

    public int getShowFeedback() {
        return this.showFeedback;
    }

    public int getShowSyncHotsoon() {
        return this.showSyncHotsoon;
    }

    public int getdUseNewLoginStyle() {
        return this.dUseNewLoginStyle;
    }

    public boolean isAntiAddictedSkipLoginEnable() {
        return this.antiAddictedSkipLoginEnable;
    }

    public boolean isBindPhoneAfterThirdPartyLogin() {
        return this.mBindPhoneAfterThirdPartyLogin;
    }

    public boolean isEnableMultiAccountLogin() {
        return this.enableMultiAccountLogin;
    }

    public boolean isEnableOneClickLogin() {
        return this.enableOneClickLogin;
    }

    public boolean isEnableOneClickLoginPreGet() {
        return this.enableOneClickLoginPreGet;
    }

    public boolean isForbidSkipBindPhone() {
        return this.forbidSkipBindPhone;
    }

    public boolean isFtcBindEnable() {
        return this.ftcBindEnable;
    }

    public boolean isPhoneAutoFilled() {
        return this.phoneAutoFilled;
    }

    public boolean isSmsAutoFilled() {
        return this.smsAutoFilled;
    }

    public boolean isdBindPhoneAfterThirdPartyLogin() {
        return this.dBindPhoneAfterThirdPartyLogin;
    }

    public boolean enableContentRoaming() {
        if (this.enableContentRoaming == 1) {
            return true;
        }
        return false;
    }

    public boolean enablePreloadBackground() {
        if (this.enablePreloadBackground == 1) {
            return true;
        }
        return false;
    }

    public boolean enableSpeedMonitor() {
        if (this.enableSpeedMonitor == 1) {
            return true;
        }
        return false;
    }

    public boolean getPhoneChangeEnable() {
        if (this.phoneChangeEnable > 0) {
            return true;
        }
        return false;
    }

    public boolean getUsePushStyle() {
        if (this.usePushStyle == 1) {
            return true;
        }
        return false;
    }

    public boolean isChallengeLikeShow() {
        if (this.showTagLike == 1) {
            return true;
        }
        return false;
    }

    public boolean isDiscoverMvpEnabled() {
        if (this.discoverMvpMode != 0) {
            return true;
        }
        return false;
    }

    public boolean isEffectLikeShow() {
        if (this.showPropLike == 1) {
            return true;
        }
        return false;
    }

    public boolean isFollowListRecommand() {
        if (this.fanFollowingListRecommend > 0) {
            return true;
        }
        return false;
    }

    public boolean isGuideSearchEnabled() {
        if (this.enableGuideSearch == 1) {
            return true;
        }
        return false;
    }

    public boolean isI18nNewLoginPlatformStrategy() {
        if (this.i18nNewLoginPlatformStrategy == 1) {
            return true;
        }
        return false;
    }

    public boolean isInstagramShareShowDialogTip() {
        if (this.instgramShareHashTag == 1) {
            return true;
        }
        return false;
    }

    public boolean isMusicLikeShow() {
        if (this.showMusicLike == 1) {
            return true;
        }
        return false;
    }

    public boolean isNotificationTabNewStyle() {
        if (this.imNotificationTabStyle == 1) {
            return true;
        }
        return false;
    }

    public boolean isRecommentMusicByAI() {
        if (this.recommentMusicByAI == 1) {
            return true;
        }
        return false;
    }

    public boolean isShareDialogShowForward() {
        if (this.isShareDialogShowForward == 1) {
            return true;
        }
        return false;
    }

    public boolean isUserSingleGeneral() {
        if (this.isUserSingleGeneral == 1) {
            return true;
        }
        return false;
    }

    public boolean showNewRelationFragment() {
        if (this.imNewRelationFragmentStyle == 1) {
            return true;
        }
        return false;
    }

    public boolean showReportButton() {
        if (this.showReportButton == 1) {
            return true;
        }
        return false;
    }

    public int getI18nShareButtonStyle() {
        if (this.i18nShareButtonStyle == 0) {
            return 1;
        }
        return this.i18nShareButtonStyle;
    }

    public boolean isInstagramShareShowToastTip() {
        if (this.instgramShareHashTag == 2) {
            return true;
        }
        return false;
    }

    public PreloadStrategyConfig getPreloadStrategyConfig() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 72226, new Class[0], PreloadStrategyConfig.class)) {
            return (PreloadStrategyConfig) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 72226, new Class[0], PreloadStrategyConfig.class);
        }
        if (this.preloadStrategyConfig == null) {
            this.preloadStrategyConfig = PreloadStrategyConfig.convertOldConfig(this.videoPreloadNumber, this.videoPreloadSize);
        }
        return this.preloadStrategyConfig;
    }

    public AbTestModel setDisableAautoShowLikes(boolean z) {
        this.isDisableAautoShowLikes = z;
        return this;
    }

    public AbTestModel setFeedFollowButton(int i) {
        this.feedFollowButton = i;
        return this;
    }

    public AbTestModel setFeedbackForeground(boolean z) {
        this.isFeedbackForeground = z;
        return this;
    }

    public void setForbidSkipBindPhone(boolean z) {
        this.forbidSkipBindPhone = z;
    }

    public AbTestModel setShowToutiaoProfile(boolean z) {
        this.isShowToutiaoProfile = z;
        return this;
    }

    public void setPreloaderType(Integer num) {
        if (PatchProxy.isSupport(new Object[]{num}, this, changeQuickRedirect, false, 72225, new Class[]{Integer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{num}, this, changeQuickRedirect, false, 72225, new Class[]{Integer.class}, Void.TYPE);
            return;
        }
        this.preloaderType = num.intValue();
    }
}
