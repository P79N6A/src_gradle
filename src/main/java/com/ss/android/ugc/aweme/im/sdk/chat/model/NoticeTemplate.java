package com.ss.android.ugc.aweme.im.sdk.chat.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/model/NoticeTemplate;", "Ljava/io/Serializable;", "()V", "language", "", "getLanguage", "()Ljava/lang/String;", "setLanguage", "(Ljava/lang/String;)V", "text", "getText", "setText", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class NoticeTemplate implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("lang")
    @Nullable
    private String language;
    @SerializedName("text")
    @Nullable
    private String text;

    @Nullable
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public final void setLanguage(@Nullable String str) {
        this.language = str;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }
}
