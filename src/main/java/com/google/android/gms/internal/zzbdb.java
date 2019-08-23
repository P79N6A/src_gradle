package com.google.android.gms.internal;

public final class zzbdb implements zzbaw {
    private /* synthetic */ zzbda zzaEm;

    zzbdb(zzbda zzbda) {
        this.zzaEm = zzbda;
    }

    public final void zzac(boolean z) {
        this.zzaEm.mHandler.sendMessage(this.zzaEm.mHandler.obtainMessage(1, Boolean.valueOf(z)));
    }
}
