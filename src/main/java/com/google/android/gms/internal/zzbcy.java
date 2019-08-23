package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public final class zzbcy extends Handler {
    private /* synthetic */ zzbcw zzaEa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzbcy(zzbcw zzbcw, Looper looper) {
        super(looper);
        this.zzaEa = zzbcw;
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                ((zzbcx) message.obj).zzc(this.zzaEa);
                return;
            case 2:
                throw ((RuntimeException) message.obj);
            default:
                return;
        }
    }
}
