package com.ttnet.org.chromium.base;

import com.ttnet.org.chromium.base.annotations.SuppressFBWarnings;

public class NonThreadSafe {
    private Long mThreadId;

    public NonThreadSafe() {
        ensureThreadIdAssigned();
    }

    @VisibleForTesting
    @SuppressFBWarnings({"CHROMIUM_SYNCHRONIZED_METHOD"})
    public synchronized void detachFromThread() {
        this.mThreadId = null;
    }

    private void ensureThreadIdAssigned() {
        if (this.mThreadId == null) {
            this.mThreadId = Long.valueOf(Thread.currentThread().getId());
        }
    }

    @SuppressFBWarnings({"CHROMIUM_SYNCHRONIZED_METHOD"})
    public synchronized boolean calledOnValidThread() {
        ensureThreadIdAssigned();
        return this.mThreadId.equals(Long.valueOf(Thread.currentThread().getId()));
    }
}
