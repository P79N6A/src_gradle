package com.ss.android.ugc.aweme.face2face.net;

import com.google.common.a.j;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.api.model.a.a.a;
import java.io.Serializable;

public class b implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("ad")
    public a adStruct;
    @SerializedName("card_type")
    public int cardType;
    @SerializedName("from_user_info")
    public a fromInviteUser;
    @SerializedName("id")
    public String id;
    @SerializedName("sub_type")
    public int subType;

    public a getAdStruct() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 39138, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 39138, new Class[0], a.class);
        } else if (this.adStruct == null) {
            return new a();
        } else {
            return this.adStruct;
        }
    }

    public a getFroInviteUser() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 39137, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 39137, new Class[0], a.class);
        } else if (this.fromInviteUser == null) {
            return new a();
        } else {
            return this.fromInviteUser;
        }
    }

    public int hashCode() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 39140, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 39140, new Class[0], Integer.TYPE)).intValue();
        }
        return j.a(Integer.valueOf(this.subType), this.fromInviteUser);
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 39139, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 39139, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.subType != bVar.subType || !j.a(this.fromInviteUser, bVar.fromInviteUser)) {
                return false;
            }
            return true;
        }
    }
}
