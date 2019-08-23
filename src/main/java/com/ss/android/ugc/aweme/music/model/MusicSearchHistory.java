package com.ss.android.ugc.aweme.music.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class MusicSearchHistory {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("keyword")
    public String keyword;
    @SerializedName("int")
    public int type;

    public MusicSearchHistory() {
    }

    public int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 60013, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 60013, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.keyword != null) {
            i = this.keyword.hashCode();
        }
        return i;
    }

    public MusicSearchHistory(String str) {
        this.keyword = str;
        this.type = 1;
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 60012, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 60012, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MusicSearchHistory musicSearchHistory = (MusicSearchHistory) obj;
            if (this.keyword != null) {
                return this.keyword.equals(musicSearchHistory.keyword);
            }
            if (musicSearchHistory.keyword == null) {
                return true;
            }
            return false;
        }
    }

    public MusicSearchHistory(String str, int i) {
        this.keyword = str;
        this.type = i;
    }
}
