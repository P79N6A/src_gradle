package com.facebook.react.common;

import com.facebook.infer.annotation.a;
import javax.annotation.Nullable;

public class SingleThreadAsserter {
    @Nullable
    private Thread mThread;

    public void assertNow() {
        boolean z;
        Thread currentThread = Thread.currentThread();
        if (this.mThread == null) {
            this.mThread = currentThread;
        }
        if (this.mThread == currentThread) {
            z = true;
        } else {
            z = false;
        }
        a.a(z);
    }
}
