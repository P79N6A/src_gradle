package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzd;
import com.google.android.gms.common.internal.zzbr;

public final class zzctw extends zza {
    public static final Parcelable.Creator<zzctw> CREATOR = new zzctx();
    private final ConnectionResult zzaBQ;
    private int zzaku;
    private final zzbr zzbCV;

    public zzctw(int i) {
        this(new ConnectionResult(8, null), null);
    }

    zzctw(int i, ConnectionResult connectionResult, zzbr zzbr) {
        this.zzaku = i;
        this.zzaBQ = connectionResult;
        this.zzbCV = zzbr;
    }

    private zzctw(ConnectionResult connectionResult, zzbr zzbr) {
        this(1, connectionResult, null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzd.zze(parcel);
        zzd.zzc(parcel, 1, this.zzaku);
        zzd.zza(parcel, 2, (Parcelable) this.zzaBQ, i, false);
        zzd.zza(parcel, 3, (Parcelable) this.zzbCV, i, false);
        zzd.zzI(parcel, zze);
    }

    public final zzbr zzAx() {
        return this.zzbCV;
    }

    public final ConnectionResult zzpz() {
        return this.zzaBQ;
    }
}
