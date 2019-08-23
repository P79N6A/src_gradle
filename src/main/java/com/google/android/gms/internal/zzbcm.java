package com.google.android.gms.internal;

import android.support.annotation.WorkerThread;

public abstract class zzbcm implements Runnable {
    private /* synthetic */ zzbcc zzaDp;

    private zzbcm(zzbcc zzbcc) {
        this.zzaDp = zzbcc;
    }

    /* synthetic */ zzbcm(zzbcc zzbcc, zzbcd zzbcd) {
        this(zzbcc);
    }

    @WorkerThread
    public void run() {
        this.zzaDp.zzaCv.lock();
        try {
            if (!Thread.interrupted()) {
                zzpV();
            }
        } catch (RuntimeException e2) {
            this.zzaDp.zzaCZ.zza(e2);
        } catch (Throwable th) {
            this.zzaDp.zzaCv.unlock();
            throw th;
        }
        this.zzaDp.zzaCv.unlock();
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    public abstract void zzpV();
}
