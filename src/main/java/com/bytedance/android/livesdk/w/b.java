package com.bytedance.android.livesdk.w;

import com.bytedance.android.livesdkapi.depend.model.live.a;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface b {
    public static final c<Long> A = new c<>("live_start_live_anchor", 0L);
    public static final c<String> B = new c<>("live_start_live_mode", a.VIDEO.name());
    public static final c<Map<String, String>> C = new c<>("live_start_live_tag", new HashMap());
    public static final c<Boolean> D = new c<>("live_beauty_feedback_clicked", Boolean.FALSE);
    public static final c<Integer> E = new c<>("live_filter_id", 0);
    public static final c<Float> F = new c<>("whitening_param_v2", Float.valueOf(-1.0f));
    public static final c<Float> G = new c<>("beauty_skin_param_v2", Float.valueOf(-1.0f));
    public static final c<Float> H = new c<>("big_eyes_param", Float.valueOf(-1.0f));
    public static final c<Float> I = new c<>("face_lift_param", Float.valueOf(-1.0f));
    public static final c<Integer> J = new c<>("beauty_level", 3);
    public static final c<Set<Long>> K = new c<>("prop_panel_showed_red_point", new HashSet());
    public static final c<Long> L = new c<>("fast_gift_hide_confirm_gift", 0L);
    public static final c<Float> M = new c<>("barrage_alpha", Float.valueOf(1.0f));
    public static final c<Float> N = new c<>("barrage_size", Float.valueOf(1.0f));
    public static final c<Integer> O = new c<>("barrage_local_type", 2);
    public static final c<Boolean> P = new c<>("barrage_enable", Boolean.TRUE);
    public static final c<Boolean> Q = new c<>("room_auto_gift_thanks", Boolean.FALSE);
    public static final c<Boolean> R = new c<>("game_quiz_anchor_tip_show", Boolean.FALSE);
    public static final c<Long> S = new c<>("live_guide_to_feed_show_time", 0L);
    public static final c<String> T = new c<>("gift_guide_flag", "");
    public static final c<Boolean> U = new c<>("live_game_quit_click", Boolean.FALSE);
    public static final c<Boolean> V = new c<>("live_share_get_diamonds_tip", Boolean.TRUE);
    public static final c<Integer> W = new c<>("live_game_msg_state", 0);
    public static final c<Boolean> X = new c<>("live_game_comment_msg_push", Boolean.TRUE);
    public static final c<Boolean> Y = new c<>("live_game_gift_msg_push", Boolean.TRUE);
    public static final c<Boolean> Z = new c<>("live_anchor_show_fans_club_push", Boolean.FALSE);

    /* renamed from: a  reason: collision with root package name */
    public static final c<Boolean> f17763a = new c<>("jump_to_room_dialog", Boolean.FALSE);
    public static final c<Boolean> aA = new c<>("live_pk_medal_is_in_promotion", Boolean.FALSE);
    public static final c<Long> aB = new c<>("live_pk_medal_promotion_start_time", 0L);
    public static final c<Integer> aC = new c<>("live_interact_pk_duration", Integer.valueOf(c.f69428f));
    public static final c<Integer> aD = new c<>("live_interact_pk_duration_index", 1);
    public static final c<Boolean> aE = new c<>("live_interact_pk_setting_red_point", Boolean.TRUE);
    public static final c<Boolean> aF = new c<>("live_interact_setting_red_point", Boolean.TRUE);
    public static final c<Boolean> aG = new c<>("live_interact_pk_auto_match", Boolean.FALSE);
    public static final c<Boolean> aH = new c<>("live_interact_pk_auto_start_match", Boolean.FALSE);
    public static final c<String> aI = new c<>("live_interact_pk_theme", "");
    public static final c<Boolean> aJ = new c<>("showed_pay_channel_scroll_tip", Boolean.FALSE);
    public static final c<Boolean> aK = new c<>("show_enter_other_live_room_dialog", Boolean.TRUE);
    public static final c<Long> aL = new c<>("mobile_flow_show_time", 0L);
    public static final c<String> aM = new c<>("last_first_charge_bubble_show_time", "");
    public static final c<Integer> aN = new c<>("recharge_dialog_content_height", 0);
    public static final c<String> aO = new c<>("tool_bar_first_charge_shake_times", "");
    public static final c<Long> aP = new c<>("recharge_reward_popup_in_gift_dialog_timestamp", 0L);
    public static final c<String> aQ = new c<>("live_last_turntable_bubble", "");
    public static final c<Double> aR = new c<>("live_last_healthy_score", Double.valueOf(0.0d));
    public static final c<Long> aS = new c<>("live_last_punishment_time", 0L);
    public static final c<Boolean> aT = new c<>("live_first_show_health_score", Boolean.TRUE);
    public static final c<Integer> aU = new c<>("duty_gift_last_rules", 0);
    public static final c<Boolean> aa = new c<>("live_anchor_show_fans_club_auto_light_4_anchor_push", Boolean.FALSE);
    public static final c<Boolean> ab = new c<>("live_anchor_show_fans_club_auto_light_4_audience_push", Boolean.FALSE);
    public static final c<Boolean> ac = new c<>("gesture_magic_guide_flag", Boolean.TRUE);
    public static final c<Boolean> ad = new c<>("gesture_magic_switch", Boolean.FALSE);
    public static final c<Boolean> ae = new c<>("gesture_magic_switch_v2", Boolean.FALSE);
    public static final c<List<String>> af = new c<>("gesture_magic_select_composer_path", new ArrayList());
    public static final c<Map<String, Map<String, Float>>> ag = new c<>("live_composer_save_node_tag_value", new HashMap());
    public static final c<Integer> ah = new c<>("current_sticker_page_position", 0);
    public static final c<Boolean> ai = new c<>("show_backpack_tips", Boolean.TRUE);
    public static final c<Map<Long, String>> aj = new c<>("guard_info_map", new HashMap());
    public static final c<Boolean> ak = new c<>("vigo_show_start_live_flame_tip", Boolean.TRUE);
    public static final c<Integer> al = new c<>("vigo_show_end_live_flame_tip_count", 0);
    public static final c<Boolean> am = new c<>("package_purchase_showed", Boolean.FALSE);
    public static final c<String> an = new c<>("last_pay_channel", "");
    public static final c<Boolean> ao = new c<>("recharge_dialog_balance_change_tip_shown", Boolean.FALSE);
    public static final c<Boolean> ap = new c<>("recharge_dialog_big_deal_hint_shown", Boolean.FALSE);
    public static final c<Boolean> aq = new c<>("live_comment_danmu_state", Boolean.FALSE);
    public static final c<String> ar = new c<>("room_decoration_customize_text", "");
    public static final c<Integer> as = new c<>("room_decoration_text_pass_level", 31);
    public static final c<Long> at = new c<>("room_decoration_anchor_id", 0L);
    public static final c<String> au = new c<>("room_decoration_list", "");
    public static final c<Boolean> av = new c<>("show_room_decoration_toast", Boolean.TRUE);
    public static final c<Integer> aw = new c<>("live_interact_pk_clean_num", 5);
    public static final c<Integer> ax = new c<>("live_steal_tower", 1);
    public static final c<Integer> ay = new c<>("live_interact_pk_refuse_count_per_day", 0);
    public static final c<String> az = new c<>("live_interact_pk_first_refuse_date", "");

    /* renamed from: b  reason: collision with root package name */
    public static final int f17764b;

    /* renamed from: c  reason: collision with root package name */
    public static final c<Set<String>> f17765c = new c<>("gift_urls", new HashSet());

    /* renamed from: d  reason: collision with root package name */
    public static final c<String> f17766d = new c<>("assets_cache_data", "");

    /* renamed from: e  reason: collision with root package name */
    public static final c<Long> f17767e = new c<>("assets_cache_last_check_time", 0L);

    /* renamed from: f  reason: collision with root package name */
    public static final c<Integer> f17768f = new c<>("live_broadcast_room_type", 0);
    public static final c<Integer> g = new c<>("live_camera_type", 1);
    public static final c<String> h = new c<>("live_resource_current_version", "");
    public static final c<Integer> i = new c<>("live_interact_pk_clean_total_count", 5);
    public static final c<Integer> j = new c<>("live_interact_pk_total_num", Integer.valueOf(f17764b));
    public static final c<String> k = new c<>("live_interact_pk_clean_date", "");
    public static final c<Boolean> l = new c<>("live_interact_pk_clean_tip", Boolean.TRUE);
    public static final c<Boolean> m = new c<>("live_interact_pk_steal_tower_tip", Boolean.TRUE);
    public static final c<Integer> n = new c<>("live_interact_pk_tip_show_num", 0);
    public static final c<String> o = new c<>("live_interact_pk_tip_show_date", "");
    public static final c<Long> p = new c<>("live_prop_expire_tip_time", 0L);
    public static final c<Integer> q = new c<>("live_link_mic_stats", 1);
    public static final c<String> r = new c<>("last_share_channel", "");
    public static final c<Boolean> s = new c<>("first_enter_live_start", Boolean.TRUE);
    public static final c<Integer> t = new c<>("location_hint_shown_count", 0);
    public static final c<Long> u = new c<>("current_room_id", 0L);
    public static final c<Long> v = new c<>("current_room_start_time", 0L);
    public static final c<Long> w = new c<>("live_last_active_time", 0L);
    public static final c<Set<Long>> x = new c<>("gift_panel_showed_manual", new HashSet());
    public static final c<Long> y = new c<>("new_gift_notify_has_showed_id", 0L);
    public static final c<Boolean> z = new c<>("gift_animation_enable_landscape", Boolean.TRUE);

    static {
        int i2;
        if (com.bytedance.android.live.uikit.a.a.f()) {
            i2 = 30;
        } else {
            i2 = 5;
        }
        f17764b = i2;
    }
}
