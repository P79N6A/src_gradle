package com.alipay.c.h;

import android.os.Process;

public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f5353a;

    c(b bVar) {
        this.f5353a = bVar;
    }

    public final void run() {
        try {
            Process.setThreadPriority(0);
            while (!this.f5353a.f5352c.isEmpty()) {
                Runnable runnable = (Runnable) this.f5353a.f5352c.pollFirst();
                if (runnable != null) {
                    runnable.run();
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            Thread unused2 = this.f5353a.f5351b = null;
            throw th;
        }
        Thread unused3 = this.f5353a.f5351b = null;
    }
}
