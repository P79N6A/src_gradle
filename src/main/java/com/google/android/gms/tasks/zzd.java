package com.google.android.gms.tasks;

public final class zzd implements Runnable {
    private /* synthetic */ Task zzbLR;
    private /* synthetic */ zzc zzbLT;

    zzd(zzc zzc, Task task) {
        this.zzbLT = zzc;
        this.zzbLR = task;
    }

    public final void run() {
        try {
            Task task = (Task) this.zzbLT.zzbLP.then(this.zzbLR);
            if (task == null) {
                this.zzbLT.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            task.addOnSuccessListener(TaskExecutors.zzbMd, (OnSuccessListener<? super TResult>) this.zzbLT);
            task.addOnFailureListener(TaskExecutors.zzbMd, (OnFailureListener) this.zzbLT);
        } catch (RuntimeExecutionException e2) {
            if (e2.getCause() instanceof Exception) {
                this.zzbLT.zzbLQ.setException((Exception) e2.getCause());
            } else {
                this.zzbLT.zzbLQ.setException(e2);
            }
        } catch (Exception e3) {
            this.zzbLT.zzbLQ.setException(e3);
        }
    }
}
