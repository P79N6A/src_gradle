package com.ss.android.ugc.aweme.im.sdk.chat.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/model/EncryptedVideoContent;", "Ljava/io/Serializable;", "()V", "secretKey", "", "getSecretKey", "()Ljava/lang/String;", "setSecretKey", "(Ljava/lang/String;)V", "sourceMD5", "getSourceMD5", "setSourceMD5", "tosKey", "getTosKey", "setTosKey", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class EncryptedVideoContent implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("skey")
    @Nullable
    private String secretKey;
    @SerializedName("md5")
    @Nullable
    private String sourceMD5;
    @SerializedName("tkey")
    @Nullable
    private String tosKey;

    @Nullable
    public final String getSecretKey() {
        return this.secretKey;
    }

    @Nullable
    public final String getSourceMD5() {
        return this.sourceMD5;
    }

    @Nullable
    public final String getTosKey() {
        return this.tosKey;
    }

    public final void setSecretKey(@Nullable String str) {
        this.secretKey = str;
    }

    public final void setSourceMD5(@Nullable String str) {
        this.sourceMD5 = str;
    }

    public final void setTosKey(@Nullable String str) {
        this.tosKey = str;
    }
}
