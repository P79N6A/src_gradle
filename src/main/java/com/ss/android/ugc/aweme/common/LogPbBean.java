package com.ss.android.ugc.aweme.common;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/common/LogPbBean;", "Ljava/io/Serializable;", "()V", "imprId", "", "getImprId", "()Ljava/lang/String;", "setImprId", "(Ljava/lang/String;)V", "tools.service_release"}, k = 1, mv = {1, 1, 15})
public final class LogPbBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("impr_id")
    @Nullable
    private String imprId;

    @Nullable
    public final String getImprId() {
        return this.imprId;
    }

    public final void setImprId(@Nullable String str) {
        this.imprId = str;
    }
}