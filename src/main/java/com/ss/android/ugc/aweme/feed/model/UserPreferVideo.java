package com.ss.android.ugc.aweme.feed.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;

@Keep
public class UserPreferVideo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("cover")
    public UrlModel cover;
    @SerializedName("dynamic_cover")
    public UrlModel dynamicCover;
    @SerializedName("gid")
    public String gid;
    @SerializedName("play_addr")
    public UrlModel video;

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41476, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41476, new Class[0], String.class);
        }
        return "UserPreferVideo{gid='" + this.gid + '\'' + ", video=" + this.video + ", cover=" + this.cover + ", dynamicCover=" + this.dynamicCover + '}';
    }
}
