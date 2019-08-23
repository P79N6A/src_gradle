package com.ss.android.ugc.aweme.friends.b;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public final class d implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("footer_invite_all")
    private boolean floatInviteAll;
    @SerializedName("limit_invite_all")
    private int mLimitInviteAllCount;
    @SerializedName("show_invite_all")
    private boolean showInviteAll;
    @SerializedName("text")
    private String text;
    @SerializedName("url")
    private String url;

    public final int getLimitInviteAllCount() {
        return this.mLimitInviteAllCount;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean isFloatInviteAll() {
        return this.floatInviteAll;
    }

    public final boolean isShowInviteAll() {
        return this.showInviteAll;
    }

    public final void setFloatInviteAll(boolean z) {
        this.floatInviteAll = z;
    }

    public final void setShowInviteAll(boolean z) {
        this.showInviteAll = z;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }
}
