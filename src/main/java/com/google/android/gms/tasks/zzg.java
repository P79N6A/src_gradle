package com.google.android.gms.tasks;

import android.support.annotation.NonNull;
import java.util.concurrent.Executor;

public final class zzg<TResult> implements zzk<TResult> {
    /* access modifiers changed from: private */
    public final Object mLock = new Object();
    private final Executor zzbEo;
    /* access modifiers changed from: private */
    public OnFailureListener zzbLW;

    public zzg(@NonNull Executor executor, @NonNull OnFailureListener onFailureListener) {
        this.zzbEo = executor;
        this.zzbLW = onFailureListener;
    }

    public final void cancel() {
        synchronized (this.mLock) {
            this.zzbLW = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r2.zzbEo.execute(new com.google.android.gms.tasks.zzh(r2, r3));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onComplete(@android.support.annotation.NonNull com.google.android.gms.tasks.Task<TResult> r3) {
        /*
            r2 = this;
            boolean r0 = r3.isSuccessful()
            if (r0 != 0) goto L_0x001e
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            com.google.android.gms.tasks.OnFailureListener r1 = r2.zzbLW     // Catch:{ all -> 0x001b }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            java.util.concurrent.Executor r0 = r2.zzbEo
            com.google.android.gms.tasks.zzh r1 = new com.google.android.gms.tasks.zzh
            r1.<init>(r2, r3)
            r0.execute(r1)
            goto L_0x001e
        L_0x001b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r3
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tasks.zzg.onComplete(com.google.android.gms.tasks.Task):void");
    }
}
