package com.google.android.gms.internal;

import android.support.annotation.NonNull;
import android.support.v4.util.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.zza;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.Map;

public final class zzbbq implements OnCompleteListener<Void> {
    private /* synthetic */ zzbbo zzaCP;

    private zzbbq(zzbbo zzbbo) {
        this.zzaCP = zzbbo;
    }

    public final void onComplete(@NonNull Task<Void> task) {
        zzbbo zzbbo;
        ConnectionResult connectionResult;
        Map zzd;
        this.zzaCP.zzaCv.lock();
        try {
            if (this.zzaCP.zzaCK) {
                if (task.isSuccessful()) {
                    Map unused = this.zzaCP.zzaCL = new ArrayMap(this.zzaCP.zzaCB.size());
                    for (zzbbn zzph : this.zzaCP.zzaCB.values()) {
                        this.zzaCP.zzaCL.put(zzph.zzph(), ConnectionResult.zzazX);
                    }
                } else {
                    if (task.getException() instanceof zza) {
                        zza zza = (zza) task.getException();
                        if (this.zzaCP.zzaCI) {
                            Map unused2 = this.zzaCP.zzaCL = new ArrayMap(this.zzaCP.zzaCB.size());
                            for (zzbbn zzbbn : this.zzaCP.zzaCB.values()) {
                                zzbas zzph2 = zzbbn.zzph();
                                ConnectionResult zza2 = zza.zza(zzbbn);
                                if (this.zzaCP.zza(zzbbn, zza2)) {
                                    zzd = this.zzaCP.zzaCL;
                                    zza2 = new ConnectionResult(16);
                                } else {
                                    zzd = this.zzaCP.zzaCL;
                                }
                                zzd.put(zzph2, zza2);
                            }
                        } else {
                            Map unused3 = this.zzaCP.zzaCL = zza.zzpf();
                        }
                        zzbbo = this.zzaCP;
                        connectionResult = this.zzaCP.zzpN();
                    } else {
                        Map unused4 = this.zzaCP.zzaCL = Collections.emptyMap();
                        zzbbo = this.zzaCP;
                        connectionResult = new ConnectionResult(8);
                    }
                    ConnectionResult unused5 = zzbbo.zzaCO = connectionResult;
                }
                if (this.zzaCP.zzaCM != null) {
                    this.zzaCP.zzaCL.putAll(this.zzaCP.zzaCM);
                    ConnectionResult unused6 = this.zzaCP.zzaCO = this.zzaCP.zzpN();
                }
                if (this.zzaCP.zzaCO == null) {
                    this.zzaCP.zzpL();
                    this.zzaCP.zzpM();
                } else {
                    boolean unused7 = this.zzaCP.zzaCK = false;
                    this.zzaCP.zzaCE.zzc(this.zzaCP.zzaCO);
                }
                this.zzaCP.zzaCG.signalAll();
            }
        } finally {
            this.zzaCP.zzaCv.unlock();
        }
    }
}
