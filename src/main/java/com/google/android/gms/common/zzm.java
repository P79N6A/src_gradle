package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzd;
import com.google.android.gms.common.internal.zzas;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;

public final class zzm extends zza {
    public static final Parcelable.Creator<zzm> CREATOR = new zzn();
    private final String zzaAl;
    private final zzg zzaAm;
    private final boolean zzaAn;

    zzm(String str, IBinder iBinder, boolean z) {
        this.zzaAl = str;
        this.zzaAm = zzG(iBinder);
        this.zzaAn = z;
    }

    zzm(String str, zzg zzg, boolean z) {
        this.zzaAl = str;
        this.zzaAm = zzg;
        this.zzaAn = z;
    }

    private static zzg zzG(IBinder iBinder) {
        zzh zzh = null;
        if (iBinder == null) {
            return null;
        }
        try {
            IObjectWrapper zzoY = zzas.zzI(iBinder).zzoY();
            byte[] bArr = zzoY == null ? null : (byte[]) zzn.zzE(zzoY);
            if (bArr != null) {
                zzh = new zzh(bArr);
            }
        } catch (RemoteException unused) {
        }
        return zzh;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzd.zze(parcel);
        zzd.zza(parcel, 1, this.zzaAl, false);
        zzd.zza(parcel, 2, this.zzaAm == null ? null : this.zzaAm.asBinder(), false);
        zzd.zza(parcel, 3, this.zzaAn);
        zzd.zzI(parcel, zze);
    }
}
