package com.ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.Required;
import java.io.Serializable;

public class c implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("cha_name")
    public String challengeName;
    @SerializedName("cid")
    @Required
    public String cid;
    @SerializedName("sticker_id")
    public String stickerId;
    @SerializedName("type")
    public int type;
    @SerializedName("user_count")
    public int userCount;
    @SerializedName("view_count")
    public long viewCount = -1;

    public String getChallengeName() {
        return this.challengeName;
    }

    public String getCid() {
        return this.cid;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public long getViewCount() {
        return this.viewCount;
    }

    public long getDisplayCount() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 73894, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 73894, new Class[0], Long.TYPE)).longValue();
        }
        long viewCount2 = getViewCount();
        if (viewCount2 >= 0) {
            return viewCount2;
        }
        return (long) getUserCount();
    }

    public int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 73896, new Class[0], Integer.TYPE)) {
            return this.cid.hashCode();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 73896, new Class[0], Integer.TYPE)).intValue();
    }

    public boolean equals(Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2}, this, changeQuickRedirect, false, 73895, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj2}, this, changeQuickRedirect, false, 73895, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (obj2 instanceof c) {
            if (TextUtils.equals(((c) obj2).cid, this.cid)) {
                return true;
            }
        }
        return false;
    }
}
