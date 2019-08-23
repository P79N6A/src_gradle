package com.ss.android.ugc.aweme.discover.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.music.model.Music;

@Keep
public class HotSearchMusicItem extends BaseHotSearchItem {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("is_new")
    public boolean isNew;
    public String mEditionUid;
    @SerializedName("hot_value")
    public String mHotValue;
    @SerializedName("label")
    public int mLabel;
    @SerializedName("music_info")
    public Music mMusic;
    public boolean playing;
    @SerializedName("rank_diff")
    public int rankDiff;

    public boolean isPlaceholder() {
        if (this.mMusic == null) {
            return true;
        }
        return false;
    }

    public static HotSearchMusicItem createPlaceHolder() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 37059, new Class[0], HotSearchMusicItem.class)) {
            return (HotSearchMusicItem) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 37059, new Class[0], HotSearchMusicItem.class);
        }
        return new HotSearchMusicItem();
    }

    public boolean isPastRanking() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37061, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37061, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!TextUtils.isEmpty(this.mEditionUid)) {
            z = true;
        }
        return z;
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37060, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37060, new Class[0], String.class);
        }
        return "HotSearchMusicItem{mMusic=" + this.mMusic + ", mLabel=" + this.mLabel + ", mHotValue=" + this.mHotValue + '}';
    }
}
