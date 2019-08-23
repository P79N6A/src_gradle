package com.bytedance.android.livesdk.config;

import com.bytedance.android.live.core.setting.l;
import com.bytedance.android.live.utility.b;
import com.bytedance.android.livesdk.commerce.e;
import com.bytedance.android.livesdkapi.host.d;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c;
import java.util.HashSet;
import java.util.Set;

@Deprecated
public interface a {
    public static final l<Boolean> A = new l<>("max_encode_bitrate", Boolean.FALSE);
    public static final l<Integer> B = new l<>("luckymoney_disappear_duration", 5);
    public static final l<Integer> C = new l<>("room_follow_notice_duration", 180);
    public static final l<String> D = new l<>("pay_grade_url", "");
    public static final l<Integer> E = new l<>("doodle_min_count", 10);
    public static final l<Integer> F = new l<>("doodle_max_count", 100);
    public static final l<Integer> G = new l<>("gift_repeat_timeout", 3);
    public static final l<Integer> H = new l<>("special_gift_repeat_timeout", 10);
    public static final l<Integer> I = new l<>("rate_on_withdraw_success", -1);
    public static final l<Integer> J = new l<>("live_mosaic_stay_time", 600);
    public static final l<Integer> K = new l<>("enable_profile_recommend_user", 1);
    public static final l<Boolean> L = new l<>("enable_live_interact", Boolean.TRUE);
    public static final l<Integer> M = new l<>("deco_text_modify_frequency", 1);
    public static final l<Integer> N = new l<>("enable_zhima_verify", 0);
    public static final l<String> O = new l<>("exchange_score_title", ((d) b.a(d.class)).a().getString(C0906R.string.cw7));
    public static final l<String> P = new l<>("exchange_score_subtitle", ((d) b.a(d.class)).a().getString(C0906R.string.dlo));
    public static final l<Boolean> Q = new l<>("block_weibo", Boolean.FALSE);
    public static final l<Boolean> R = new l<>("block_qzone", Boolean.valueOf(com.bytedance.android.live.uikit.a.a.a()));
    public static final l<Boolean> S = new l<>("block_weixin", Boolean.valueOf(com.bytedance.android.live.uikit.a.a.a()));
    public static final l<Boolean> T = new l<>("block_circle", Boolean.valueOf(com.bytedance.android.live.uikit.a.a.a()));
    public static final l<Boolean> U = new l<>("block_qq", Boolean.valueOf(com.bytedance.android.live.uikit.a.a.a()));
    public static final l<Integer> V = new l<>("live_record_min_duration", 3);
    public static final l<Integer> W = new l<>("live_record_max_duration", 60);
    public static final l<Integer> X = new l<>("live_record_enabled", Integer.valueOf(com.bytedance.android.live.uikit.a.a.f() ^ true ? 1 : 0));
    public static final l<String> Y = new l<>("frontier_url", ((d) b.a(d.class)).a().getString(C0906R.string.dlo));
    public static final l<Boolean> Z = new l<>("promotion_card_disabled", Boolean.FALSE);

    /* renamed from: a  reason: collision with root package name */
    public static final l<e> f13642a = new l<>("live_commerce_banner", e.class);
    public static final l<Boolean> aa = new l<>("disable_delay_red_envelope", Boolean.FALSE);
    public static final l<Boolean> ab = new l<>("show_live_in_end_page", Boolean.FALSE);
    public static final l<Boolean> ac = new l<>("disable_live_follow_guide", Boolean.valueOf(com.bytedance.android.live.uikit.a.a.f()));
    public static final l<com.bytedance.android.livesdk.w.a> ad = new l<>("live_dns_info", new com.bytedance.android.livesdk.w.a());
    public static final l<Integer> ae = new l<>("live_room_luckymoney_delay_seconds", Integer.valueOf(c.f69428f));
    public static final l<Integer> af = new l<>("pay_methods_switch", 0);
    public static final l<String> ag = new l<>("pay_methods_disabled_alert", "");
    public static final l<Boolean> ah = new l<>("key_enable_intimacy_push", Boolean.FALSE);
    public static final l<Set<String>> ai = new l<>("gift_urls", new HashSet());
    public static final l<Integer> aj = new l<>("live_camera_type", 1);

    /* renamed from: b  reason: collision with root package name */
    public static final l<Integer> f13643b = new l<>("pay_methods_switch", 0);

    /* renamed from: c  reason: collision with root package name */
    public static final l<String> f13644c = new l<>("pay_methods_disabled_alert", "");

    /* renamed from: d  reason: collision with root package name */
    public static final l<String> f13645d = new l<>("gift_list", "");

    /* renamed from: e  reason: collision with root package name */
    public static final l<Integer> f13646e = new l<>("beauty_level", 3);

    /* renamed from: f  reason: collision with root package name */
    public static final l<Boolean> f13647f = new l<>("has_show_filter_guide.9.0", Boolean.FALSE);
    public static final l<Long> g = new l<>("fast_gift_hide_confirm_gift", 0L);
    public static final l<Long> h = new l<>("room_decoration_anchor_id", 0L);
    public static final l<Integer> i = new l<>("room_decoration_text_pass_level", 31);
    public static final l<String> j = new l<>("room_decoration_customize_text", "");
    public static final l<String> k = new l<>("room_decoration_list", "");
    public static final l<Long> l = new l<>("has_shown_interact_guide", 0L);
    public static final l<Boolean> m = new l<>("send_delay_red_envelope", Boolean.TRUE);
    public static final l<Boolean> n = new l<>("need_fast_gift_hint", Boolean.TRUE);
    public static final l<Boolean> o = new l<>("show_room_decoration_toast", Boolean.TRUE);
    public static final l<Integer> p = new l<>("location_hint_shown_count", 0);
    public static final l<Boolean> q = new l<>("live_interact_red_point", Boolean.TRUE);
    public static final l<Boolean> r = new l<>("live_interact_pk_red_point", Boolean.TRUE);
    public static final l<Boolean> s = new l<>("live_interact_pk_auto_match", Boolean.FALSE);
    public static final l<Boolean> t = new l<>("live_interact_pk_auto_start_match", Boolean.FALSE);
    public static final l<String> u = new l<>("live_interact_pk_theme", "");
    public static final l<Integer> v = new l<>("live_interact_pk_time", 120);
    public static final l<Integer> w = new l<>("live_interact_pk_time_index", 1);
    public static final l<Long> x = new l<>("live_last_show_red_point_time", 0L);
    public static final l<Integer> y = new l<>("live_interact_beauty_level", 2);
    public static final l<Integer> z = new l<>("max_encode_bitrate", 0);
}
