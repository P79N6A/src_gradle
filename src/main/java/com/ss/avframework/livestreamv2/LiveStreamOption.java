package com.ss.avframework.livestreamv2;

import com.ss.avframework.utils.TEBundle;

public class LiveStreamOption {
    private TEBundle mOpt;

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        release();
    }

    public TEBundle getOpt() {
        return this.mOpt;
    }

    public synchronized void release() {
        if (this.mOpt != null) {
            this.mOpt.release();
            this.mOpt = null;
        }
    }

    public LiveStreamOption(TEBundle tEBundle) {
        this.mOpt = tEBundle;
    }
}
