package com.bytedance.android.livesdk.chatroom.model;

import android.support.annotation.Keep;
import com.bytedance.android.livesdkapi.h.e;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class ShareReportResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("delta_intimacy")
    private long deltaIntimacy;
    @SerializedName("display_text")
    private e displayText;

    public long getDeltaIntimacy() {
        return this.deltaIntimacy;
    }

    public e getDisplayText() {
        return this.displayText;
    }

    @SerializedName("delta_intimacy")
    public void setDeltaIntimacy(long j) {
        this.deltaIntimacy = j;
    }

    @SerializedName("display_text")
    public void setDisplayText(e eVar) {
        this.displayText = eVar;
    }
}
