package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

public final class zzbet extends Handler {
    private /* synthetic */ zzber zzaFi;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbet(zzber zzber, Looper looper) {
        super(looper);
        this.zzaFi = zzber;
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 0:
                PendingResult pendingResult = (PendingResult) message.obj;
                synchronized (this.zzaFi.zzaBW) {
                    if (pendingResult == null) {
                        try {
                            this.zzaFi.zzaFb.zzv(new Status(13, "Transform returned null"));
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else if (pendingResult instanceof zzbeg) {
                        this.zzaFi.zzaFb.zzv(((zzbeg) pendingResult).getStatus());
                    } else {
                        this.zzaFi.zzaFb.zza(pendingResult);
                    }
                }
                return;
            case 1:
                RuntimeException runtimeException = (RuntimeException) message.obj;
                String valueOf = String.valueOf(runtimeException.getMessage());
                if (valueOf.length() != 0) {
                    "Runtime exception on the transformation worker thread: ".concat(valueOf);
                } else {
                    new String("Runtime exception on the transformation worker thread: ");
                }
                throw runtimeException;
            default:
                return;
        }
    }
}
