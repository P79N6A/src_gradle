package com.bytedance.android.livesdk.w;

import com.bytedance.android.livesdkapi.d;
import com.meituan.robust.ChangeQuickRedirect;

@Deprecated
public enum e implements d.a {
    GIFT_LIST("gift_list", d.b.String, "", true),
    LAST_SHARE_CHANNEL("last_share_channel", d.b.String, "", true),
    SHOW_LIVE_PORTRAIT_GUIDE("show_live_portrait_guide", d.b.Boolean, Boolean.FALSE, true),
    SHOW_LIVE_LANDSCAPE_GUIDE("show_live_landscape_guide", d.b.Boolean, Boolean.FALSE, true),
    FIRST_ENTER_LIVE_START("first_enter_live_start", d.b.Boolean, Boolean.TRUE, true),
    CLICK_RECORD_BUTTON_IN_END_LIVE("click_record_button_in_end_live", d.b.Boolean, Boolean.FALSE, true),
    HAS_SHOW_FILTER_GUIDE("has_show_filter_guide", d.b.Boolean, Boolean.FALSE, true),
    FAST_GIFT_HIDE_CONFIRM_GIFT("fast_gift_hide_confirm_gift", d.b.Long, 0L, true),
    DECORATION_ANCHOR_ID("room_decoration_anchor_id", d.b.Long, 0L, true),
    DECORATION_TEXT_PASS_LEVEL("room_decoration_text_pass_level", d.b.Integer, 31, true),
    DECORATION_CUSTOMIZE_TEXT("room_decoration_customize_text", d.b.String, "", true),
    DECORATION_LIST("room_decoration_list", d.b.String, "", true),
    SHOW_INTERACT_GUIDE("has_shown_interact_guide", d.b.Long, 0L, true),
    SEND_DELAY_RED_ENVELOPE("send_delay_red_envelope", d.b.Boolean, Boolean.TRUE, true),
    NEED_FAST_GIFT_HINT("need_fast_gift_hint", d.b.Boolean, Boolean.TRUE, true),
    SHOW_ROOM_DECORATION_TOAST("show_room_decoration_toast", d.b.Boolean, Boolean.TRUE, true),
    LOCATION_HINT_SHOWN_COUNT("location_hint_shown_count", d.b.Integer, 0, true),
    LIVE_INTERACT_SETTING_RED_POINT("live_interact_red_point", d.b.Boolean, Boolean.TRUE, true),
    LIVE_INTERACT_PK_SETTING_RED_POINT("live_interact_pk_red_point", d.b.Boolean, Boolean.TRUE, true),
    LIVE_INTERACT_PK_AUTO_MATCH("live_interact_pk_auto_match", d.b.Boolean, Boolean.TRUE, true),
    LIVE_INTERACT_PK_AUTO_START_MATCH("live_interact_pk_auto_start_match", d.b.Boolean, Boolean.FALSE, true),
    LIVE_INTERACT_PK_THEME("live_interact_pk_theme", d.b.String, "", true),
    LIVE_INTERACT_PK_TIME_INDEX("live_interact_pk_time_index", d.b.Integer, 1, true),
    LIVE_QUALITY_ROOM_ID("live_quality_room_id", d.b.Long, 0L, true),
    LIVE_QUALITY("live_quality", d.b.String, "", true),
    LIVE_LAST_SHOW_RED_POINT_TIME("live_last_show_red_point_time", d.b.Long, 0, true),
    LIVE_INTERACT_BEAUTY_LEVEL("live_interact_beauty_level", d.b.Integer, 2, true);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Object defVal;
    private final String key;
    private final boolean supportPersist;
    private final d.b type;

    public final Object defValue() {
        return this.defVal;
    }

    public final String key() {
        return this.key;
    }

    public final boolean supportPersist() {
        return this.supportPersist;
    }

    public final d.b type() {
        return this.type;
    }

    private e(String str, d.b bVar, Object obj, boolean z) {
        this.key = str;
        this.type = bVar;
        this.defVal = obj;
        this.supportPersist = z;
    }
}
