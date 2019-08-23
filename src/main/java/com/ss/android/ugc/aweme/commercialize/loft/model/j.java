package com.ss.android.ugc.aweme.commercialize.loft.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/loft/model/LoftVideo;", "Ljava/io/Serializable;", "()V", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "getAweme", "()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "setAweme", "(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)V", "more", "Lcom/ss/android/ugc/aweme/commercialize/loft/model/LoftVideoMore;", "getMore", "()Lcom/ss/android/ugc/aweme/commercialize/loft/model/LoftVideoMore;", "setMore", "(Lcom/ss/android/ugc/aweme/commercialize/loft/model/LoftVideoMore;)V", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class j implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("aweme")
    @Nullable
    private Aweme aweme;
    @SerializedName("show_more_button")
    @Nullable
    private k more;
    @SerializedName("title")
    @Nullable
    private String title;

    @Nullable
    public final Aweme getAweme() {
        return this.aweme;
    }

    @Nullable
    public final k getMore() {
        return this.more;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setAweme(@Nullable Aweme aweme2) {
        this.aweme = aweme2;
    }

    public final void setMore(@Nullable k kVar) {
        this.more = kVar;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
