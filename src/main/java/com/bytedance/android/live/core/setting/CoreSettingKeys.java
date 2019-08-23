package com.bytedance.android.live.core.setting;

import android.support.annotation.Keep;
import com.bytedance.android.live.base.model.LoginGuideConfig;
import com.bytedance.android.live.base.model.a.a;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;

@Keep
public interface CoreSettingKeys {
    public static final l<Boolean> APPLOG_CORE_V3_ONLY = new l<>("applog_core_v3_only", Boolean.FALSE, "推荐用核心埋点只发V3", "false:双发", "true:只发V3");
    public static final l<a[]> COUNTRY_CODE_LIST = new l<>("country_code_maps", a[].class, "国家码下发");
    public static final l<Integer> ENABLE_ALOG = new l<>("enable_alog", 0, "是否开启ALOG回捞", "0:不开启", "1:开启");
    public static final l<Integer> ENABLE_CUSTOM_TTPLAYER = new l<>("enable_custom_ttplayer", 1, "选择礼物播放器的实现方式", "0:使用TTVideoEngine", "1:使用自定义的TTMediaPlayer");
    public static final l<Boolean> ENABLE_IMAGE_DEFAULT_565 = new l<>("enable_image_default_565", Boolean.TRUE, "是否默认开启565");
    public static final l<Integer> ENABLE_MONITOR_TO_ALOG = new l<>("enable_monitor_to_alog", 0, "是否开启monitor日志输出到ALog", "0:默认开启", "1:不开启");
    public static final l<Integer> ENABLE_NEW_CHAT_NAME = new l<>("enable_im_new_name", 0, "私信改名为聊天", "0:私信", "1:聊天");
    public static final l<Integer> IMAGE_DOWNLOAD_THREAD_SIZE = new l<>("image_download_thread_size", 8);
    public static final l<Boolean> LIFT_CHAT_RESTRICTION = new l<>("ichat_restrict_range", Boolean.FALSE, "是否放开私信开关", "true:表示放开限制，关注就能发私信", "false:表示互关才能发私信");
    public static final l<com.bytedance.android.live.base.model.feed.a> LIVE_FEED_PRELOAD = new l<>("live_feed_preload", "feed load more配置", new com.bytedance.android.live.base.model.feed.a(), new com.bytedance.android.live.base.model.feed.a());
    public static final l<LoginGuideConfig> LOGIN_GUIDE = new l<>("login_guide_config", LoginGuideConfig.class);
    public static final l<Integer> MAX_CACHE_ASHM_ENTRIES = new l<>("MAX_CACHE_ASHM_ENTRIES", Integer.valueOf(SearchJediMixFeedAdapter.f42517f));
    public static final l<Integer> MAX_CACHE_ENTRIES = new l<>("MAX_CACHE_ENTRIES", 2000);
    public static final l<Integer> MAX_CACHE_EVICTION_ENTRIES = new l<>("fresco_mem", 100);
    public static final l<Integer> PROFILE_DOWNLOAD_STYLE = new l<>("profile_download_style", 0, "我的 tab 是否显示下载任务", "0: 不显示", "1: 显示");
    public static final l<String> REGION = new l<>("region", "");
    public static final l<String> SHARE_DESC_SUFFIX = new l<>("share_desc_suffix", "");
    public static final l<String> SHARE_DESC_SUFFIX_URL = new l<>("share_desc_suffix_url", "");
    public static final l<Integer> TEST_FAKE_REGION = new l<>("fake_regions", 0, "local_test fake国家", "0:中国", "1:摩洛哥", "2:沙特阿拉伯", "3:法国", "4:阿联酋");
    public static final l<String> TRACKING_CUSTOM_UA = new l<>("tracking_custom_ua_format", "", "自定义 UA");
}
