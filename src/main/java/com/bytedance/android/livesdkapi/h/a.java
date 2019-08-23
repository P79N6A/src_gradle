package com.bytedance.android.livesdkapi.h;

import android.os.SystemClock;
import com.bytedance.android.live.base.annotation.IgnoreStyleCheck;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

public class a {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("common")
    public b baseMessage;
    @IgnoreStyleCheck
    public volatile long localTimestamp = SystemClock.elapsedRealtime();
    @IgnoreStyleCheck
    public transient long timestamp;
    @Expose
    public com.bytedance.android.livesdkapi.depend.f.a type = com.bytedance.android.livesdkapi.depend.f.a.DEFAULT;

    public boolean canText() {
        return false;
    }

    public com.bytedance.android.livesdkapi.depend.f.a getMessageType() {
        return this.type;
    }

    public boolean isCurrentRoom(long j) {
        long j2;
        if (this.baseMessage != null) {
            j2 = this.baseMessage.f18776c;
        } else {
            j2 = 0;
        }
        if (j == 0 || j != j2) {
            return false;
        }
        return true;
    }
}
