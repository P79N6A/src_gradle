package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzd;
import com.google.android.gms.common.zzc;
import com.google.android.gms.common.zze;

public final class zzx extends zza {
    public static final Parcelable.Creator<zzx> CREATOR = new zzy();
    private int version;
    Account zzaHA;
    zzc[] zzaHB;
    private int zzaHu;
    private int zzaHv;
    String zzaHw;
    IBinder zzaHx;
    Scope[] zzaHy;
    Bundle zzaHz;

    public zzx(int i) {
        this.version = 3;
        this.zzaHv = zze.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        this.zzaHu = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.accounts.Account} */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v3, types: [com.google.android.gms.common.internal.zzal] */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzx(int r1, int r2, int r3, java.lang.String r4, android.os.IBinder r5, com.google.android.gms.common.api.Scope[] r6, android.os.Bundle r7, android.accounts.Account r8, com.google.android.gms.common.zzc[] r9) {
        /*
            r0 = this;
            r0.<init>()
            r0.version = r1
            r0.zzaHu = r2
            r0.zzaHv = r3
            java.lang.String r2 = "com.google.android.gms"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0016
            java.lang.String r2 = "com.google.android.gms"
            r0.zzaHw = r2
            goto L_0x0018
        L_0x0016:
            r0.zzaHw = r4
        L_0x0018:
            r2 = 2
            if (r1 >= r2) goto L_0x003a
            r1 = 0
            if (r5 == 0) goto L_0x0037
            if (r5 != 0) goto L_0x0021
            goto L_0x0033
        L_0x0021:
            java.lang.String r1 = "com.google.android.gms.common.internal.IAccountAccessor"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.common.internal.zzal
            if (r2 == 0) goto L_0x002e
            com.google.android.gms.common.internal.zzal r1 = (com.google.android.gms.common.internal.zzal) r1
            goto L_0x0033
        L_0x002e:
            com.google.android.gms.common.internal.zzan r1 = new com.google.android.gms.common.internal.zzan
            r1.<init>(r5)
        L_0x0033:
            android.accounts.Account r1 = com.google.android.gms.common.internal.zza.zza(r1)
        L_0x0037:
            r0.zzaHA = r1
            goto L_0x003e
        L_0x003a:
            r0.zzaHx = r5
            r0.zzaHA = r8
        L_0x003e:
            r0.zzaHy = r6
            r0.zzaHz = r7
            r0.zzaHB = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzx.<init>(int, int, int, java.lang.String, android.os.IBinder, com.google.android.gms.common.api.Scope[], android.os.Bundle, android.accounts.Account, com.google.android.gms.common.zzc[]):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzd.zze(parcel);
        zzd.zzc(parcel, 1, this.version);
        zzd.zzc(parcel, 2, this.zzaHu);
        zzd.zzc(parcel, 3, this.zzaHv);
        zzd.zza(parcel, 4, this.zzaHw, false);
        zzd.zza(parcel, 5, this.zzaHx, false);
        zzd.zza(parcel, 6, (T[]) this.zzaHy, i, false);
        zzd.zza(parcel, 7, this.zzaHz, false);
        zzd.zza(parcel, 8, (Parcelable) this.zzaHA, i, false);
        zzd.zza(parcel, 10, (T[]) this.zzaHB, i, false);
        zzd.zzI(parcel, zze);
    }
}
