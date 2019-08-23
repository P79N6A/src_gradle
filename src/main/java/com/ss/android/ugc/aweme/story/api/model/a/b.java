package com.ss.android.ugc.aweme.story.api.model.a;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public final class b implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("is_from_duo_shan")
    boolean isFromDuoshan;

    public final boolean isFromDuoshan() {
        return this.isFromDuoshan;
    }

    public final void setFromDuoshan(boolean z) {
        this.isFromDuoshan = z;
    }
}
