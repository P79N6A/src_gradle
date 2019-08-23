package com.ss.android.ugc.aweme.commercialize.feed.b;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/feed/preload/PreloadData;", "Ljava/io/Serializable;", "()V", "siteId", "", "getSiteId", "()Ljava/lang/String;", "setSiteId", "(Ljava/lang/String;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("site_id")
    @Nullable
    private String siteId = "";

    @Nullable
    public final String getSiteId() {
        return this.siteId;
    }

    public final void setSiteId(@Nullable String str) {
        this.siteId = str;
    }
}
