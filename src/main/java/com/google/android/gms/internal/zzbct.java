package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public final class zzbct extends Handler {
    private /* synthetic */ zzbco zzaDN;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzbct(zzbco zzbco, Looper looper) {
        super(looper);
        this.zzaDN = zzbco;
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                this.zzaDN.zzqd();
                return;
            case 2:
                this.zzaDN.resume();
                return;
            default:
                return;
        }
    }
}
