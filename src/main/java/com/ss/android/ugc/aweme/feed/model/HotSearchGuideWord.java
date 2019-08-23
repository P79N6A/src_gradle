package com.ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class HotSearchGuideWord {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("word")
    public String displayWord;
    @SerializedName("search_word")
    public String searchWord;
    @SerializedName("type")
    public int type;

    public boolean isNormalWord() {
        if (this.type == 0) {
            return true;
        }
        return false;
    }

    public String getSearchWord() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41461, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41461, new Class[0], String.class);
        } else if (TextUtils.isEmpty(this.searchWord)) {
            return this.displayWord;
        } else {
            return this.searchWord;
        }
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41462, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41462, new Class[0], String.class);
        }
        return "displayWord: " + this.displayWord + ", searchWord: " + this.searchWord + ", type: " + this.type;
    }
}
