package com.ss.android.ugc.aweme.friends.model;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class UnRegisteredUser {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("invite_status")
    public int inviteStatus;
    @SerializedName("mobile_id")
    public String mobileId;
    @SerializedName("remark_name")
    public String remarkName;

    public int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46669, new Class[0], Integer.TYPE)) {
            return super.hashCode();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46669, new Class[0], Integer.TYPE)).intValue();
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 46668, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 46668, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if ((obj instanceof UnRegisteredUser) && TextUtils.equals(this.mobileId, ((UnRegisteredUser) obj).mobileId)) {
                return super.equals(obj);
            }
            return false;
        }
    }
}
