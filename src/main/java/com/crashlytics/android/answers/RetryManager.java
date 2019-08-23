package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.concurrency.a.e;

public class RetryManager {
    long lastRetry;
    private e retryState;

    public void reset() {
        this.lastRetry = 0;
        e eVar = this.retryState;
        this.retryState = new e(eVar.f83254b, eVar.f83255c);
    }

    public RetryManager(e eVar) {
        if (eVar != null) {
            this.retryState = eVar;
            return;
        }
        throw new NullPointerException("retryState must not be null");
    }

    public boolean canRetry(long j) {
        e eVar = this.retryState;
        if (j - this.lastRetry >= eVar.f83254b.getDelayMillis(eVar.f83253a) * 1000000) {
            return true;
        }
        return false;
    }

    public void recordRetry(long j) {
        this.lastRetry = j;
        e eVar = this.retryState;
        this.retryState = new e(eVar.f83253a + 1, eVar.f83254b, eVar.f83255c);
    }
}
