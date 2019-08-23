package com.google.android.gms.internal;

import android.support.annotation.NonNull;
import android.support.v4.util.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.zza;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.Map;

public final class zzbbr implements OnCompleteListener<Void> {
    private /* synthetic */ zzbbo zzaCP;
    private zzbeh zzaCQ;

    zzbbr(zzbbo zzbbo, zzbeh zzbeh) {
        this.zzaCP = zzbbo;
        this.zzaCQ = zzbeh;
    }

    /* access modifiers changed from: package-private */
    public final void cancel() {
        this.zzaCQ.zzmF();
    }

    public final void onComplete(@NonNull Task<Void> task) {
        zzbeh zzbeh;
        Map zzg;
        this.zzaCP.zzaCv.lock();
        try {
            if (!this.zzaCP.zzaCK) {
                zzbeh = this.zzaCQ;
            } else {
                if (task.isSuccessful()) {
                    Map unused = this.zzaCP.zzaCM = new ArrayMap(this.zzaCP.zzaCC.size());
                    for (zzbbn zzph : this.zzaCP.zzaCC.values()) {
                        this.zzaCP.zzaCM.put(zzph.zzph(), ConnectionResult.zzazX);
                    }
                } else if (task.getException() instanceof zza) {
                    zza zza = (zza) task.getException();
                    if (this.zzaCP.zzaCI) {
                        Map unused2 = this.zzaCP.zzaCM = new ArrayMap(this.zzaCP.zzaCC.size());
                        for (zzbbn zzbbn : this.zzaCP.zzaCC.values()) {
                            zzbas zzph2 = zzbbn.zzph();
                            ConnectionResult zza2 = zza.zza(zzbbn);
                            if (this.zzaCP.zza(zzbbn, zza2)) {
                                zzg = this.zzaCP.zzaCM;
                                zza2 = new ConnectionResult(16);
                            } else {
                                zzg = this.zzaCP.zzaCM;
                            }
                            zzg.put(zzph2, zza2);
                        }
                    } else {
                        Map unused3 = this.zzaCP.zzaCM = zza.zzpf();
                    }
                } else {
                    Map unused4 = this.zzaCP.zzaCM = Collections.emptyMap();
                }
                if (this.zzaCP.isConnected()) {
                    this.zzaCP.zzaCL.putAll(this.zzaCP.zzaCM);
                    if (this.zzaCP.zzpN() == null) {
                        this.zzaCP.zzpL();
                        this.zzaCP.zzpM();
                        this.zzaCP.zzaCG.signalAll();
                    }
                }
                zzbeh = this.zzaCQ;
            }
            zzbeh.zzmF();
        } finally {
            this.zzaCP.zzaCv.unlock();
        }
    }
}
