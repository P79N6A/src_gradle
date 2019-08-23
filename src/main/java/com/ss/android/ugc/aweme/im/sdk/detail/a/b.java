package com.ss.android.ugc.aweme.im.sdk.detail.a;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/detail/model/GroupPasswordDetail;", "Ljava/io/Serializable;", "()V", "description", "", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "shareChannel", "", "getShareChannel", "()I", "setShareChannel", "(I)V", "token", "getToken", "setToken", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("description")
    @Nullable
    private String description;
    @SerializedName("share_channel")
    private int shareChannel;
    @SerializedName("token")
    @Nullable
    private String token;

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    public final int getShareChannel() {
        return this.shareChannel;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    public final void setDescription(@Nullable String str) {
        this.description = str;
    }

    public final void setShareChannel(int i) {
        this.shareChannel = i;
    }

    public final void setToken(@Nullable String str) {
        this.token = str;
    }
}
