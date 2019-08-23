package com.bytedance.android.livesdk.feed.j;

import com.bytedance.android.live.core.setting.l;
import com.bytedance.android.livesdk.feed.d.e;

public interface b {

    /* renamed from: a  reason: collision with root package name */
    public static final l<Float> f14210a = new l<>("default_duration_show_preview_tip", Float.valueOf(7.0f), "移动网络播流提示间隔时长(单位：天)");

    /* renamed from: b  reason: collision with root package name */
    public static final l<Integer> f14211b = new l<>("feed_live_banner_position", 0, "直播 Feed Banner 的位置", "0:顶部", "1:中间");

    /* renamed from: c  reason: collision with root package name */
    public static final l<Integer> f14212c = new l<>("back_refresh_timeout", 1800000);

    /* renamed from: d  reason: collision with root package name */
    public static final l<Integer> f14213d = new l<>("feed_preload", 4);

    /* renamed from: e  reason: collision with root package name */
    public static final l<Boolean> f14214e = new l<>("live_feed_enable_preview", Boolean.FALSE, "直播是否显示预览小窗,目前只对小图生效", "true:显示", "false:不显示");

    /* renamed from: f  reason: collision with root package name */
    public static final l<Boolean> f14215f = new l<>("i18n_zhibozhong_animation_tag", Boolean.TRUE, "I18N 是否在feed页面显示直播中动画", "true:显示", "false:不显示");
    public static final l<Boolean> g = new l<>("video_preload_after_cover", Boolean.FALSE, "封面显示后再预加载视频");
    public static final l<Integer> h = new l<>("audience_ping_interval", 600, "观众ping间隔");
    public static final l<e> i = new l<>("free_flow", e.class);
    public static final l<Boolean> j = new l<>("refresh_show_sand_box_room", Boolean.FALSE, "下拉刷新展示测试房间");
    public static final l<Integer> k = new l<>("live_squre_sky_window_info", 0, "抖音直播广场天窗关注文案AB");
}
