package com.ss.android.ugc.aweme.follow.presenter;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Keep
public class RoomConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("enable_emoji")
    public int enableEmoji;
    @SerializedName("enable_fans_club")
    public int enableFansClub;
    @SerializedName("enable_hourly_list")
    public int enableHourRank;
    @SerializedName("enable_send_barrage")
    public int enableSendBarrage;
    @SerializedName("enable_send_comment")
    public int enableSendComment;
    @SerializedName("enable_send_gift")
    public int enableSendGift;
    @SerializedName("enable_send_gift_guide")
    public int enableSendGiftGuide;
    @SerializedName("enable_send_shortcut_gift")
    public int enableSendShortcutGift;
    @SerializedName("enable_share")
    public int enableShare;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ORIENTATION {
    }

    private boolean calc(int i, int i2) {
        int i3 = i2 == 0 ? 1 : 2;
        return (i & i3) == i3;
    }

    public boolean enableHourRank(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 44698, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return calc(this.enableHourRank, i);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 44698, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public boolean isEnableEmoji(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 44690, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return calc(this.enableEmoji, i);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 44690, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public boolean isEnableFansClub(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 44695, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return calc(this.enableFansClub, i);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 44695, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public boolean isEnableSendBarrage(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 44694, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return calc(this.enableSendBarrage, i);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 44694, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public boolean isEnableSendComment(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 44692, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return calc(this.enableSendComment, i);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 44692, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public boolean isEnableSendGift(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 44693, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return calc(this.enableSendGift, i);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 44693, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public boolean isEnableSendGiftGuide(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 44697, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return calc(this.enableSendGiftGuide, i);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 44697, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public boolean isEnableShare(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 44691, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return calc(this.enableShare, i);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 44691, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public boolean isEnableShortcutGift(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 44696, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return calc(this.enableSendShortcutGift, i);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 44696, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }
}
