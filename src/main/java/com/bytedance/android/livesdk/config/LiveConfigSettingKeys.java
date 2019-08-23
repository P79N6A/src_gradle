package com.bytedance.android.livesdk.config;

import android.support.annotation.Keep;
import com.bytedance.android.live.core.setting.l;
import com.bytedance.android.live.uikit.a.a;
import com.bytedance.android.livesdk.chatroom.model.n;
import com.bytedance.android.livesdk.common.f;
import com.bytedance.android.livesdk.live.model.Camera2AB;
import com.bytedance.android.livesdk.live.model.FeedDraw;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c;

@Keep
public interface LiveConfigSettingKeys {
    public static final l<Integer> AUDIENCE_PING_INTERVAL;
    public static final l<Camera2AB> CAMERA_AB_SETTING_KEY = new l<>("camera_type_setting", new Camera2AB(1, 0), "camera类型和硬件级别");
    public static final l<Integer> DUTY_GIFT_REQUEST_STOP = new l<>("live_disable_effect_game_fetch_stats", 0, "是否关闭游戏礼物的请求, 0: 不关闭, 1:关闭");
    public static final l<Boolean> ENABLE_ROCKET_ANIMATION_NOTIFICATION = new l<>("enable_rocket_animation_notification", Boolean.FALSE, "抖音不显示广播");
    public static final l<String> IN_ROOM_PRELOAD_WEB_VIEW_URL = new l<>("in_room_preload_web_view_url", "直播间内预加载 WebView 信息的 URL", "", "");
    public static final l<String> LIVE_BLOCKED_DETAIL_URL;
    public static final l<n> LIVE_CUSTOM_FONT_CONFIG;
    public static final l<Integer> LIVE_DOUBLE_STEAM_INNER_STYLE = new l<>("live_feed_inner_style", 0, "直播Feed内外双流, 0: 关闭内流, 1: 内流回插; 2: 内流不回插");
    public static final l<Boolean> LIVE_ENABLE_BACKGROUND_STOP_MIC = new l<>("live_enable_background_stop_mic", Boolean.FALSE, "直播切后台是否停止麦克风", "false:不停止", "true:停止");
    public static final l<Boolean> LIVE_ENABLE_SMALL_ITEM_BEAUTY = new l<>("live_enable_small_item_beauty", Boolean.FALSE, "直播美颜小项");
    public static final l<FeedDraw> LIVE_FEED_DRAW = new l<>("feed_draw", FeedDraw.defaultInstance(), "内流参数");
    public static final l<Boolean> LIVE_FEED_DRAW_ENABLE = new l<>("live_enable_draw", Boolean.FALSE, "其他内流开关");
    public static final l<FeedDraw> LIVE_FOLLOW_DRAW_URL = new l<>("follow_tab_feed_draw", FeedDraw.defaultInstance(), "关注流地址");
    public static final l<String> LIVE_FULL_SCREEN_RECHARGE_URL = new l<>("live_full_screen_recharge_url", "", "火山全屏充值地址");
    public static final l<Boolean> LIVE_GAME_STREAM_PROPORTION_ADAPT = new l<>("live_game_stream_proportion_adapt", Boolean.FALSE, "游戏直播推流码率根据屏幕尺寸调整", "false:不自动调整", "true:自动调整");
    public static final l<String> LIVE_GOLDEN_BEAN_TASK_SCHEMA = new l<>("live_golden_bean_task_schema", "", "金豆任务的scheme");
    public static final l<String> LIVE_NOTICE_URL = new l<>("live_notice_url", "", "开播页弹窗url");
    public static final l<String> LIVE_NTP_SERVER_URL = new l<>("live_ntp_server_url", "", "对时使用的 NTP 服务器地址");
    public static final l<String> LIVE_OBS_HELPER_URL = new l<>("live_obs_helper_url", "https://webcast.amemv.com/falcon/webcast_douyin/page/obs_intro/index.html", "火山obs直播帮助页");
    public static final l<Integer> LIVE_PK_DURATION = new l<>("live_pk_default_duration", Integer.valueOf(c.f69428f), "默认pk时间");
    public static final l<Boolean> LIVE_PK_SEI_UPDATE = new l<>("live_pk_sei_update", Boolean.FALSE, "默认是否使用SEI更新PK状态");
    public static final l<String> LIVE_RECHARGE_URL = new l<>("live_recharge_url", "https://webcast.amemv.com/falcon/webcast_douyin/page/recharge_v1/index.html", "火山充值半屏地址");
    public static final l<Integer[]> LIVE_STREAM_BITRATE = new l<>("live_stream_bitrate", new Integer[0], "直播间码率设置[默认,最低,最高] 默认走服务端配置");
    public static final l<Integer> LIVE_STREAM_BITRATE_ADAPT;
    public static final l<Boolean> LIVE_STREAM_ENABLE_SDK_PARAMS = new l<>("live_stream_enable_sdk_params", Boolean.FALSE, "是否开启推流SDK Params");
    public static final l<Boolean> LIVE_STREAM_ENABLE_URL_LIST = new l<>("live_stream_enable_url_list", Boolean.FALSE, "是否启用推流URL list接口");
    public static final l<Integer> LIVE_STREAM_PROFILE = new l<>("live_stream_profile", -1, "直播推流编码算法", "-1:走服务端配置", "0:Baseline", "1:Main", "2:High");
    public static final l<Boolean> LIVE_STREAM_ROI = new l<>("live_stream_roi", Boolean.FALSE, "是否开启推流ROI");
    public static final l<Integer[]> LIVE_STREAM_SIZE = new l<>("live_stream_size", new Integer[0], "直播间分辨率设置[width,height] 默认走服务端设置");
    public static final l<String> LIVE_TURNTABLE_BUBBLE_CONTENT = new l<>("live_turntable_tip_content", "", "礼物转盘TIP气泡 为空则不展示");
    public static final l<String> LIVE_TURNTABLE_URL = new l<>("live_turntable_url", "", "礼物转盘URL 为空则不展示入口");
    public static final l<Integer> LIVE_USER_NEW_COMPOSER_MODEL = new l<>("live_use_new_composer_model", 0, "使用composer新模式，贴纸滤镜互斥", "0:不使用新模式", "1:使用新模式");
    public static final l<Integer> LIVE_USE_COMOPSER_FOR_BEAUTY = new l<>("live_use_composer_for_beauty", 1, "美颜使用composer", "0:不使用composer", "1:使用composer");
    public static final l<Integer> LIVE_USE_LIVE_CORE = new l<>("live_use_live_core_sdk", 0, "直播使用live-core", "0:不使用live-core", "1:使用live-core");
    public static final l<Integer[]> LIVE_VIDEO_PUSH_BITRATE_LEVEL = new l<>("live_video_push_bitrate_level", new Integer[]{720, 600, Integer.valueOf(c.f69428f), 1, 0}, "视频码率信号展示区间");
    public static final l<Integer> PK_AUTO_MATCH_TIME = new l<>("live_pk_auto_match_time", 60, "直播PK随机匹配单次时长");
    public static final l<Integer[]> PK_PANEL_STICKER = new l<>("live_pk_punish_sticker", new Integer[0], "惩罚特效ID配置");
    public static final l<Integer> PK_PANEL_STICKER_DURATION = new l<>("live_pk_punish_sticker_duration", 40000, "惩罚特效时长配置");
    public static final l<Integer> PK_PENALTY_TIME = new l<>("pk_penalty_time", 180, "PK惩罚时间");
    public static final l<Boolean> PK_TEST_TIME = new l<>("pk_test_time", Boolean.FALSE, "开启 10s PK时间");
    public static final l<Integer> SHOW_RECHARGE_REWARD_FRAGMENT_IN_GIFT_DIALOG = new l<>("show_recharge_reward_in_gift_dialog", 0, "是否在礼物面板上方展示首充奖励 (vigo)");
    public static final l<Integer> SHOW_RECHARGE_REWARD_POPUP_IN_GIFT_DIALOG = new l<>("show_recharge_reward_in_gift_dialog_v2", 1, "vigo首充引导类型");
    public static final l<Boolean> START_LIVE_MODE_UNLOCK = new l<>("start_live_mode_unclock", "解锁全开播模式，本地测试用", Boolean.FALSE, Boolean.TRUE);
    public static final l<String> TASK_GIFT_DESC_URL = new l<>("task_gift_desc_url", "", "人气礼物介绍链接");
    public static final l<Boolean> WEB_OFFLINE_ENABLED = new l<>("web_offline_enabled", Boolean.TRUE, "web 离线化开关", "false:不开启", "true:开启");
    public static final l<Boolean> WEB_VIEW_PRELOAD_ENABLED = new l<>("web_view_preload_enabled", Boolean.TRUE, "直播间内 WebView 1 像素优化开关", "false:不开启", "true:开启");

    static {
        n nVar;
        String str;
        l lVar = new l("live_stream_bitrate_adapt", "直播推流码率自适应", -1, 2, "-1:服务端下发值", "0:BITRATE_ADAPT_STRATEGY_NORMAL", "1:BITRATE_ADAPT_STRATEGY_SENSITIVE", "2:BITRATE_ADAPT_STRATEGY_MORE_SENSITIVE");
        LIVE_STREAM_BITRATE_ADAPT = lVar;
        int i = 60;
        if (PatchProxy.isSupport(new Object[0], null, n.f11141a, true, 5115, new Class[0], n.class)) {
            nVar = (n) PatchProxy.accessDispatch(new Object[0], null, n.f11141a, true, 5115, new Class[0], n.class);
        } else {
            nVar = new n();
            nVar.f11142b = "";
            nVar.f11143c = null;
        }
        LIVE_CUSTOM_FONT_CONFIG = new l<>("live_custom_font_config", nVar, "字体下载信息");
        if (a.a()) {
            i = 120;
        } else if (a.d()) {
            i = 600;
        }
        AUDIENCE_PING_INTERVAL = new l<>("audience_ping_interval", Integer.valueOf(i), "观众ping间隔");
        if (PatchProxy.isSupport(new Object[0], null, f.f13641a, true, 8079, new Class[0], String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[0], null, f.f13641a, true, 8079, new Class[0], String.class);
        } else if (a.f()) {
            str = "https://webcast.ixigua.com/falcon/webcast_xigua/page/ban/index.html";
        } else if (a.h()) {
            str = "https://webcast.musical.ly/falcon/webcast_mt/page/ban/index.html?showHeader=1";
        } else if (a.i()) {
            str = "https://webcast.tiktokv.com/falcon/webcast_mt/page/ban/index.html?showHeader=1";
        } else {
            str = "https://hotsoon.snssdk.com/falcon/live_inroom/page/closure_live/index.html?path=live_take_banpopup";
        }
        LIVE_BLOCKED_DETAIL_URL = new l<>("live_forbbiden_detail_page", str, "封禁使用的 URL, 区分国内和 Vigo");
    }
}
