package com.ss.android.ugc.aweme.requestcombine.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/requestcombine/model/BaseCombineMode;", "", "()V", "contentType", "", "getContentType", "()Ljava/lang/String;", "setContentType", "(Ljava/lang/String;)V", "httpCode", "", "getHttpCode", "()I", "setHttpCode", "(I)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class BaseCombineMode {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("content_type")
    @Nullable
    private String contentType;
    @SerializedName("http_code")
    private int httpCode;

    @Nullable
    public final String getContentType() {
        return this.contentType;
    }

    public final int getHttpCode() {
        return this.httpCode;
    }

    public final void setContentType(@Nullable String str) {
        this.contentType = str;
    }

    public final void setHttpCode(int i) {
        this.httpCode = i;
    }
}
