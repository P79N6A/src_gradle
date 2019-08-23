package com.bytedance.android.livesdk.chatroom.viewmodule.toolbar;

import android.support.annotation.DrawableRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.StringRes;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public enum f {
    INTERACTION(2130841528, 2130841528),
    RED_ENVELOPE(2130841535, 2130841535),
    PROMOTION_CARD(2130841532, 2130841532),
    MORE(C0906R.layout.ao8),
    SHARE(2130841540, 2130841539, C0906R.string.djs),
    BROADCAST_SHARE(2130841521, 2130841539, C0906R.string.djs),
    MANAGE(2130841519, 2130841518, C0906R.string.d9s),
    SWITCH_SCREEN_ORIENTATION(2130841543, 2130841542, C0906R.string.ddd),
    GIFT_ANIMATION(2130841527, 2130841527),
    RECORD(2130841534, 2130841534),
    DECORATION(2130841523, 2130841523, C0906R.string.d19),
    REVERSE_CAMERA(0, 2130841536, C0906R.string.diz),
    STICKER(0, 2130841541, C0906R.string.dd_),
    BEAUTY(0, 2130841544, C0906R.string.dcv),
    FILTER(0, 2130841545, C0906R.string.cx8),
    REVERSE_MIRROR(0, 2130841538, C0906R.string.dj0),
    SWITCH_VIDEO_QUALITY(C0906R.layout.aoa),
    PUSH_URL(0, 2130841533, C0906R.string.dhw),
    FAST_GIFT(C0906R.layout.ao7),
    GIFT(2130841525, 2130841525, C0906R.string.czv),
    BROADCAST_BARRAGE(2130841165, 2130841165),
    BARRAGE(2130841221, 2130841221),
    TURNTABLE(C0906R.layout.ao_),
    AUDIO_TOGGLE(2130841220, 2130841220, C0906R.string.dh7),
    RADIO_COVER(2130841248, 2130841248),
    MESSAGE_PUSH(2130841268, 2130841268, C0906R.string.dfh),
    GAME_QUIZ(2130841547, 0),
    AUTO_REPLY(2130841520, 2130841520, C0906R.string.cpa),
    PK(C0906R.layout.ao9),
    GESTURE_MAGIC(0, 2130841546, C0906R.string.d3a),
    GOODS(2130841432, 2130841450, C0906R.string.dcb),
    RECHARGE_GUIDE(2130841413, 0),
    CLOSE_ROOM(2130841411, 0),
    PACKAGE_PURCHASE(C0906R.layout.anh),
    COMMERCE(C0906R.layout.ao4),
    XG_GOODS(C0906R.layout.aob),
    LOTTERY(2130841412, 0),
    EMOTION(2130841581, 0),
    DIVIDER(C0906R.layout.alp),
    CHAT(2130841522, 0),
    XT_LANDSCAPE_SHARE(2130841591, 2130841539, C0906R.string.djs),
    SIGNAL(2130841467, 0),
    PROMOTION_VIDEO(2130841148, 2130841148, C0906R.string.d45),
    HOUR_RANK(2130841198, 0),
    DUTY_GIFT(C0906R.layout.ao6),
    DOU_PLUS_PROMOTE(2130841026, 2130841026, C0906R.string.cvk);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    @DrawableRes
    private int drawableFolded;
    @DrawableRes
    private int drawableUnfolded;
    @LayoutRes
    private int layoutId;
    @StringRes
    private int titleId;

    public final int getDrawableFolded() {
        return this.drawableFolded;
    }

    public final int getDrawableUnfolded() {
        return this.drawableUnfolded;
    }

    public final int getLayoutId() {
        return this.layoutId;
    }

    public final int getTitleId() {
        return this.titleId;
    }

    public final String getTag() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 7711, new Class[0], String.class)) {
            return getClass().getName();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 7711, new Class[0], String.class);
    }

    private f(int i) {
        this.layoutId = C0906R.layout.ao5;
        this.layoutId = i;
    }

    private f(int i, int i2) {
        this(r7, r8, i, i2, 0);
    }

    private f(int i, int i2, @DrawableRes int i3) {
        this.layoutId = C0906R.layout.ao5;
        this.drawableUnfolded = i;
        this.drawableFolded = i2;
        this.titleId = i3;
    }
}
