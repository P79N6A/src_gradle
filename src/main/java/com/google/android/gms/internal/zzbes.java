package com.google.android.gms.internal;

import android.support.annotation.WorkerThread;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;

public final class zzbes implements Runnable {
    private /* synthetic */ Result zzaFh;
    private /* synthetic */ zzber zzaFi;

    zzbes(zzber zzber, Result result) {
        this.zzaFi = zzber;
        this.zzaFh = result;
    }

    @WorkerThread
    public final void run() {
        try {
            zzbbd.zzaBV.set(Boolean.TRUE);
            this.zzaFi.zzaFf.sendMessage(this.zzaFi.zzaFf.obtainMessage(0, this.zzaFi.zzaFa.onSuccess(this.zzaFh)));
            zzbbd.zzaBV.set(Boolean.FALSE);
            zzber.zzc(this.zzaFh);
            GoogleApiClient googleApiClient = (GoogleApiClient) this.zzaFi.zzaBY.get();
            if (googleApiClient != null) {
                googleApiClient.zzb(this.zzaFi);
            }
        } catch (RuntimeException e2) {
            this.zzaFi.zzaFf.sendMessage(this.zzaFi.zzaFf.obtainMessage(1, e2));
            zzbbd.zzaBV.set(Boolean.FALSE);
            zzber.zzc(this.zzaFh);
            GoogleApiClient googleApiClient2 = (GoogleApiClient) this.zzaFi.zzaBY.get();
            if (googleApiClient2 != null) {
                googleApiClient2.zzb(this.zzaFi);
            }
        } catch (Throwable th) {
            zzbbd.zzaBV.set(Boolean.FALSE);
            zzber.zzc(this.zzaFh);
            GoogleApiClient googleApiClient3 = (GoogleApiClient) this.zzaFi.zzaBY.get();
            if (googleApiClient3 != null) {
                googleApiClient3.zzb(this.zzaFi);
            }
            throw th;
        }
    }
}
