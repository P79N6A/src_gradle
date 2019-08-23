package com.ss.android.ugc.aweme.discover.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;

@Keep
public class WideSearch extends BaseHotSearchItem {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("challenge")
    public Challenge challenge;
    @SerializedName("music")
    public Music music;
    public int type;
    @SerializedName("user")
    public User user;

    public interface WideSearchType {
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37133, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37133, new Class[0], String.class);
        }
        return "WideSearch{user=" + this.user + ", challenge=" + this.challenge + ", music=" + this.music + ", type=" + this.type + '}';
    }
}
