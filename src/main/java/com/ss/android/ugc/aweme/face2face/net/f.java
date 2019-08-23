package com.ss.android.ugc.aweme.face2face.net;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

public class f implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("f2f_invite_status")
    public int face2FaceInviteStatus;
    @SerializedName("user_info")
    public User user;

    public f clone() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 39154, new Class[0], f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 39154, new Class[0], f.class);
        }
        f fVar = new f();
        fVar.user = this.user;
        fVar.face2FaceInviteStatus = this.face2FaceInviteStatus;
        return fVar;
    }

    public User getUser() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 39151, new Class[0], User.class)) {
            return (User) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 39151, new Class[0], User.class);
        } else if (this.user == null) {
            return new User();
        } else {
            return this.user;
        }
    }

    public int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 39153, new Class[0], Integer.TYPE)) {
            return this.user.hashCode() + this.face2FaceInviteStatus;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 39153, new Class[0], Integer.TYPE)).intValue();
    }

    public void setUser(User user2) {
        this.user = user2;
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 39152, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 39152, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            f fVar = (f) obj;
            if (this.face2FaceInviteStatus == fVar.face2FaceInviteStatus && this.user != null) {
                return this.user.equals(fVar.user);
            }
            if (fVar.user == null) {
                return true;
            }
            return false;
        }
    }
}
