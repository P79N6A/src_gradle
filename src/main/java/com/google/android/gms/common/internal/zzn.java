package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.support.annotation.BinderThread;
import com.google.android.gms.common.ConnectionResult;

public final class zzn extends zze {
    private /* synthetic */ zzd zzaHe;
    private IBinder zzaHi;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @BinderThread
    public zzn(zzd zzd, int i, IBinder iBinder, Bundle bundle) {
        super(zzd, i, bundle);
        this.zzaHe = zzd;
        this.zzaHi = iBinder;
    }

    /* access modifiers changed from: protected */
    public final void zzj(ConnectionResult connectionResult) {
        if (this.zzaHe.zzaGW != null) {
            this.zzaHe.zzaGW.onConnectionFailed(connectionResult);
        }
        this.zzaHe.onConnectionFailed(connectionResult);
    }

    /* access modifiers changed from: protected */
    public final boolean zzrj() {
        boolean z = false;
        try {
            if (!this.zzaHe.zzdc().equals(this.zzaHi.getInterfaceDescriptor())) {
                return false;
            }
            IInterface zzd = this.zzaHe.zzd(this.zzaHi);
            if (zzd != null && (this.zzaHe.zza(2, 4, zzd) || this.zzaHe.zza(3, 4, zzd))) {
                ConnectionResult unused = this.zzaHe.zzaGZ = null;
                Bundle zzoC = this.zzaHe.zzoC();
                if (this.zzaHe.zzaGV != null) {
                    this.zzaHe.zzaGV.onConnected(zzoC);
                }
                z = true;
            }
            return z;
        } catch (RemoteException unused2) {
        }
    }
}
