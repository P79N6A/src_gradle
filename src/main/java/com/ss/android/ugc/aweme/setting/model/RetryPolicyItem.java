package com.ss.android.ugc.aweme.setting.model;

import com.ss.android.ugc.aweme.setting.r;

public class RetryPolicyItem {
    public boolean isLoadSuccess;
    public long lastResponseTime;
    public int retryCount;
    public r.a retryListener;

    public RetryPolicyItem(boolean z, long j, r.a aVar) {
        this.isLoadSuccess = z;
        this.lastResponseTime = j;
        this.retryListener = aVar;
    }
}
