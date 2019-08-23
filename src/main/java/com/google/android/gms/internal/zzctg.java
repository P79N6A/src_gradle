package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.zzq;

public final class zzctg extends Api.zza<zzctt, zzctk> {
    zzctg() {
    }

    public final /* synthetic */ Api.zze zza(Context context, Looper looper, zzq zzq, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        zzctk zzctk = (zzctk) obj;
        if (zzctk == null) {
            zzctk = zzctk.zzbCM;
        }
        zzctt zzctt = new zzctt(context, looper, true, zzq, zzctk, connectionCallbacks, onConnectionFailedListener);
        return zzctt;
    }
}
