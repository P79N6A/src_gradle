package com.ss.android.ugc.aweme.following.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.following.ui.SimpleUserFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

public class b implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isMine;
    private SimpleUserFragment.b pageType;
    private String uid;

    public SimpleUserFragment.b getPageType() {
        return this.pageType;
    }

    public String getUid() {
        return this.uid;
    }

    public boolean isMine() {
        return this.isMine;
    }

    public User getUser() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 44973, new Class[0], User.class)) {
            return com.ss.android.ugc.aweme.user.a.b.f75295a;
        }
        return (User) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 44973, new Class[0], User.class);
    }

    public void setMine(boolean z) {
        this.isMine = z;
    }

    public void setPageType(SimpleUserFragment.b bVar) {
        this.pageType = bVar;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public b(String str, boolean z, SimpleUserFragment.b bVar) {
        this.uid = str;
        this.isMine = z;
        this.pageType = bVar;
    }
}
