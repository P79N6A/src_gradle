package com.ss.android.ugc.aweme.sticker.model;

import com.google.common.a.j;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import java.io.Serializable;
import java.util.List;

public class d implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("avatar_thumb")
    public UrlModel avatarThumb;
    @SerializedName("children")
    public List<String> children;
    @SerializedName("commerce_sticker")
    public a commerceSticker;
    @SerializedName("desc")
    public String desc;
    @SerializedName("extra")
    public String extra;
    @SerializedName("icon_url")
    public UrlModel iconUrl;
    @SerializedName("id")
    public String id;
    @SerializedName("is_favorite")
    public boolean isFavorite;
    public boolean mIsSelect;
    @SerializedName("tags")
    public List<String> mTags;
    @SerializedName("name")
    public String name;
    @SerializedName("owner_id")
    public String ownerId;
    @SerializedName("owner_nickname")
    public String ownerName;
    @SerializedName("share_info")
    public ShareInfo shareInfo = new ShareInfo();
    @SerializedName("user_count")
    public long userCount;
    @SerializedName("vv_count")
    public long viewCount;

    public int hashCode() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 81984, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 81984, new Class[0], Integer.TYPE)).intValue();
        }
        return j.a(this.id);
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 81983, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 81983, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return j.a(this.id, ((d) obj).id);
        }
    }
}
