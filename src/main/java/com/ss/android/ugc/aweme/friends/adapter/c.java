package com.ss.android.ugc.aweme.friends.adapter;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

public class c extends com.ss.android.ugc.aweme.base.api.c implements Serializable, Comparable<c> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String finalName;
    private String finalNamePinyin;
    @SerializedName("user_info")
    User mUser;
    private String sortLetters;

    public c() {
    }

    public String getFinalName() {
        return this.finalName;
    }

    public String getFinalNamePinyin() {
        return this.finalNamePinyin;
    }

    public String getSortLetters() {
        return this.sortLetters;
    }

    public User getUser() {
        return this.mUser;
    }

    public void setFinalName(String str) {
        this.finalName = str;
    }

    public void setFinalNamePinyin(String str) {
        this.finalNamePinyin = str;
    }

    public void setSortLetters(String str) {
        this.sortLetters = str;
    }

    public void setUser(User user) {
        this.mUser = user;
    }

    public c(User user) {
        this.mUser = user;
    }

    public int compareTo(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, changeQuickRedirect, false, 46274, new Class[]{c.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{cVar}, this, changeQuickRedirect, false, 46274, new Class[]{c.class}, Integer.TYPE)).intValue();
        } else if (this.finalName != null && cVar.finalName != null) {
            return getSortLetters().compareTo(cVar.getSortLetters());
        } else {
            if (this.finalName == null) {
                return 1;
            }
            return -1;
        }
    }
}
