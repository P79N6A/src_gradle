package com.google.android.gms.tasks;

public final class zzb implements Runnable {
    private /* synthetic */ Task zzbLR;
    private /* synthetic */ zza zzbLS;

    zzb(zza zza, Task task) {
        this.zzbLS = zza;
        this.zzbLR = task;
    }

    public final void run() {
        try {
            this.zzbLS.zzbLQ.setResult(this.zzbLS.zzbLP.then(this.zzbLR));
        } catch (RuntimeExecutionException e2) {
            if (e2.getCause() instanceof Exception) {
                this.zzbLS.zzbLQ.setException((Exception) e2.getCause());
            } else {
                this.zzbLS.zzbLQ.setException(e2);
            }
        } catch (Exception e3) {
            this.zzbLS.zzbLQ.setException(e3);
        }
    }
}
