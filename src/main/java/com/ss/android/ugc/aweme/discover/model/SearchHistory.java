package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.ui.aw;

public class SearchHistory {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("keyword")
    public String keyword;
    @SerializedName("int")
    public int type;

    public SearchHistory() {
    }

    public int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37082, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37082, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.keyword != null) {
            i = this.keyword.hashCode();
        }
        return i;
    }

    public SearchHistory(String str) {
        this.keyword = str;
        this.type = 1;
    }

    public static int toHistoryType(int i) {
        if (i == aw.f43136d) {
            return 16;
        }
        if (i == aw.f43138f) {
            return 17;
        }
        if (i == aw.g) {
            return 18;
        }
        if (i == aw.f43135c) {
            return 19;
        }
        if (i == aw.f43134b) {
            return 20;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 37081, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 37081, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SearchHistory searchHistory = (SearchHistory) obj;
            if (this.keyword != null) {
                return this.keyword.equals(searchHistory.keyword);
            }
            if (searchHistory.keyword == null) {
                return true;
            }
            return false;
        }
    }

    public SearchHistory(String str, int i) {
        this.keyword = str;
        this.type = i;
    }
}
