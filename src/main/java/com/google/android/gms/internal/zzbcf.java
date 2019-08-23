package com.google.android.gms.internal;

import android.support.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.zzj;
import java.util.Iterator;
import java.util.Map;

public final class zzbcf extends zzbcm {
    final /* synthetic */ zzbcc zzaDp;
    private final Map<Api.zze, zzbce> zzaDr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbcf(zzbcc zzbcc, Map<Api.zze, zzbce> map) {
        super(zzbcc, null);
        this.zzaDp = zzbcc;
        this.zzaDr = map;
    }

    @WorkerThread
    public final void zzpV() {
        boolean z;
        Iterator<Api.zze> it2 = this.zzaDr.keySet().iterator();
        boolean z2 = true;
        int i = 0;
        boolean z3 = false;
        boolean z4 = true;
        while (true) {
            if (!it2.hasNext()) {
                z2 = z3;
                z = false;
                break;
            }
            Api.zze next = it2.next();
            if (!next.zzpe()) {
                z4 = false;
            } else if (!this.zzaDr.get(next).zzaCj) {
                z = true;
                break;
            } else {
                z3 = true;
            }
        }
        if (z2) {
            i = this.zzaDp.zzaCF.isGooglePlayServicesAvailable(this.zzaDp.mContext);
        }
        if (i == 0 || (!z && !z4)) {
            if (this.zzaDp.zzaDj) {
                this.zzaDp.zzaDh.connect();
            }
            for (Api.zze next2 : this.zzaDr.keySet()) {
                zzj zzj = this.zzaDr.get(next2);
                if (!next2.zzpe() || i == 0) {
                    next2.zza(zzj);
                } else {
                    this.zzaDp.zzaCZ.zza((zzbcx) new zzbch(this, this.zzaDp, zzj));
                }
            }
            return;
        }
        this.zzaDp.zzaCZ.zza((zzbcx) new zzbcg(this, this.zzaDp, new ConnectionResult(i, null)));
    }
}
