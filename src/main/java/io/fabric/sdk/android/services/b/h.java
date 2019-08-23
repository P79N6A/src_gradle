package io.fabric.sdk.android.services.b;

import android.os.Process;

public abstract class h implements Runnable {
    /* access modifiers changed from: protected */
    public abstract void onRun();

    public final void run() {
        Process.setThreadPriority(10);
        onRun();
    }
}
