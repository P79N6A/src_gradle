package com.google.android.gms.tasks;

import android.support.annotation.NonNull;
import java.util.concurrent.Executor;

public final class zze<TResult> implements zzk<TResult> {
    /* access modifiers changed from: private */
    public final Object mLock = new Object();
    private final Executor zzbEo;
    /* access modifiers changed from: private */
    public OnCompleteListener<TResult> zzbLU;

    public zze(@NonNull Executor executor, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        this.zzbEo = executor;
        this.zzbLU = onCompleteListener;
    }

    public final void cancel() {
        synchronized (this.mLock) {
            this.zzbLU = null;
        }
    }

    public final void onComplete(@NonNull Task<TResult> task) {
        synchronized (this.mLock) {
            if (this.zzbLU != null) {
                this.zzbEo.execute(new zzf(this, task));
            }
        }
    }
}
