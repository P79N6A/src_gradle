package com.ss.android.ugc.aweme.opensdk.a;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public final class a implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("icon")
    public String icon;
    @SerializedName("link")
    public String link;
    @SerializedName("name")
    public String name;

    public final String getIcon() {
        return this.icon;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getName() {
        return this.name;
    }

    public final void setIcon(String str) {
        this.icon = str;
    }

    public final void setLink(String str) {
        this.link = str;
    }

    public final void setName(String str) {
        this.name = str;
    }
}
