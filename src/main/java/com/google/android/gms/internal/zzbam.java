package com.google.android.gms.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class zzbam extends zzbal {
    protected final TaskCompletionSource<Void> zzalE;

    public zzbam(int i, TaskCompletionSource<Void> taskCompletionSource) {
        super(i);
        this.zzalE = taskCompletionSource;
    }

    public void zza(@NonNull zzbbs zzbbs, boolean z) {
    }

    public final void zza(zzbdc<?> zzbdc) throws DeadObjectException {
        try {
            zzb(zzbdc);
        } catch (DeadObjectException e2) {
            zzp(zzbal.zza((RemoteException) e2));
            throw e2;
        } catch (RemoteException e3) {
            zzp(zzbal.zza(e3));
        }
    }

    /* access modifiers changed from: protected */
    public abstract void zzb(zzbdc<?> zzbdc) throws RemoteException;

    public void zzp(@NonNull Status status) {
        this.zzalE.trySetException(new ApiException(status));
    }
}
