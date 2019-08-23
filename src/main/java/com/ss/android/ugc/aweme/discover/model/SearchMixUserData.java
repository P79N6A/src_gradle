package com.ss.android.ugc.aweme.discover.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.commercialize.model.n;
import java.util.List;

public class SearchMixUserData {
    public static ChangeQuickRedirect changeQuickRedirect;
    public n ad;
    public boolean hasTopUser;
    public List<SearchUser> users;

    public SearchMixUserData setAd(n nVar) {
        this.ad = nVar;
        return this;
    }

    public SearchMixUserData setHasTopUser(boolean z) {
        this.hasTopUser = z;
        return this;
    }

    public SearchMixUserData setUsers(List<SearchUser> list) {
        this.users = list;
        return this;
    }
}
