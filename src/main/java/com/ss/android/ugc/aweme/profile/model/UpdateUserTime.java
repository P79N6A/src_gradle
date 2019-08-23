package com.ss.android.ugc.aweme.profile.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

@Keep
public class UpdateUserTime implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int count;
    private long currentTime;

    public int getCount() {
        return this.count;
    }

    public long getCurrentTime() {
        return this.currentTime;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setCurrentTime(long j) {
        this.currentTime = j;
    }
}
