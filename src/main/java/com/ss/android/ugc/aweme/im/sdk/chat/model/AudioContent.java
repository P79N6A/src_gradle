package com.ss.android.ugc.aweme.im.sdk.chat.model;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;

public class AudioContent extends BaseContent {
    private static String VOICE_HINT = "";
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("duration")
    long duration;
    @SerializedName("md5")
    String md5;
    @SerializedName("resource_url")
    UrlModel url;

    public long getDuration() {
        return this.duration;
    }

    public String getMd5() {
        return this.md5;
    }

    public UrlModel getUrl() {
        return this.url;
    }

    public String getMsgHint() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51097, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51097, new Class[0], String.class);
        }
        super.getMsgHint();
        return VOICE_HINT;
    }

    public void tryInit() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51098, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51098, new Class[0], Void.TYPE);
            return;
        }
        if (TextUtils.isEmpty(VOICE_HINT)) {
            Context context = GlobalContext.getContext();
            if (context != null) {
                VOICE_HINT = context.getString(C0906R.string.axr);
            }
        }
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setUrl(UrlModel urlModel) {
        this.url = urlModel;
    }
}
