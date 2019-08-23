package com.ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/SimpleDetailPromotion;", "Lcom/ss/android/ugc/aweme/commerce/service/models/BaseDetailPromotion;", "()V", "lastAwemeId", "", "getLastAwemeId", "()Ljava/lang/String;", "setLastAwemeId", "(Ljava/lang/String;)V", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class w extends c {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("last_aweme_id")
    @Nullable
    private String lastAwemeId = "";

    @Nullable
    public final String getLastAwemeId() {
        return this.lastAwemeId;
    }

    public final void setLastAwemeId(@Nullable String str) {
        this.lastAwemeId = str;
    }
}
