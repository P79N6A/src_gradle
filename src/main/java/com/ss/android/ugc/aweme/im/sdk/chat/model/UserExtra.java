package com.ss.android.ugc.aweme.im.sdk.chat.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.h.c.b;

@Keep
public class UserExtra {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("is_disable_show_follow_bar")
    private boolean isDisableShowFollowBar;
    private boolean isSayHelloLogger;
    @SerializedName("uid")
    String uid;

    public UserExtra() {
    }

    public boolean getIsDisableShowFollowBar() {
        return this.isDisableShowFollowBar;
    }

    public boolean getIsSayHelloLogger() {
        return this.isSayHelloLogger;
    }

    public String getUid() {
        return this.uid;
    }

    public void setIsDisableShowFollowBar(boolean z) {
        this.isDisableShowFollowBar = z;
    }

    public void setIsSayHelloLogger(boolean z) {
        this.isSayHelloLogger = z;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public static boolean isDisableShowFollowBar(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 51211, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 51211, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        UserExtra a2 = b.a().a(str2);
        if (a2 == null || !a2.isDisableShowFollowBar) {
            return false;
        }
        return true;
    }

    public UserExtra(String str, boolean z, boolean z2) {
        this.uid = str;
        this.isDisableShowFollowBar = z;
        this.isSayHelloLogger = z2;
    }
}
