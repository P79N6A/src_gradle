package com.google.android.gms.common.api;

import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.zzbo;
import com.google.android.gms.internal.zzbas;
import java.util.ArrayList;

public final class zza extends Exception {
    private final ArrayMap<zzbas<?>, ConnectionResult> zzaAB;

    public zza(ArrayMap<zzbas<?>, ConnectionResult> arrayMap) {
        this.zzaAB = arrayMap;
    }

    public final String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (zzbas zzbas : this.zzaAB.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) this.zzaAB.get(zzbas);
            if (connectionResult.isSuccess()) {
                z = false;
            }
            String valueOf = String.valueOf(zzbas.zzpr());
            String valueOf2 = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(valueOf2).length());
            sb.append(valueOf);
            sb.append(": ");
            sb.append(valueOf2);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }

    public final ConnectionResult zza(GoogleApi<? extends Api.ApiOptions> googleApi) {
        zzbas zzph = googleApi.zzph();
        zzbo.zzb(this.zzaAB.get(zzph) != null, (Object) "The given API was not part of the availability request.");
        return (ConnectionResult) this.zzaAB.get(zzph);
    }

    public final ArrayMap<zzbas<?>, ConnectionResult> zzpf() {
        return this.zzaAB;
    }
}
