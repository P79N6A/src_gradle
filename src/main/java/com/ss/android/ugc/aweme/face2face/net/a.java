package com.ss.android.ugc.aweme.face2face.net;

import com.google.common.a.j;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public class a implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("avatar_medium")
    public UrlModel avatarMedium;
    @SerializedName("follow_status")
    public int followStatus;
    @SerializedName("sec_uid")
    public String mSecUid;
    @SerializedName("nickname")
    public String nickName;
    @SerializedName("remark_name")
    public String remarkName;
    @SerializedName("uid")
    public String uId;

    public int hashCode() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 39136, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 39136, new Class[0], Integer.TYPE)).intValue();
        }
        return j.a(this.uId);
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 39135, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 39135, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return j.a(this.uId, ((a) obj).uId);
        }
    }
}
