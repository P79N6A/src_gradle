package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.zzq;

public final class zzbfo extends Api.zza<zzbfv, Api.ApiOptions.NoOptions> {
    zzbfo() {
    }

    public final /* synthetic */ Api.zze zza(Context context, Looper looper, zzq zzq, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        zzbfv zzbfv = new zzbfv(context, looper, zzq, connectionCallbacks, onConnectionFailedListener);
        return zzbfv;
    }
}
