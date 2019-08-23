package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.BinderThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zzy;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzbo;
import com.google.android.gms.common.internal.zzbr;
import com.google.android.gms.common.internal.zzq;
import java.util.HashSet;
import java.util.Set;

public final class zzbei extends zzcto implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    private static Api.zza<? extends zzctj, zzctk> zzaEV = zzctf.zzajS;
    private final Context mContext;
    private final Handler mHandler;
    private final Api.zza<? extends zzctj, zzctk> zzaAx;
    private zzq zzaCA;
    private zzctj zzaDh;
    private final boolean zzaEW;
    private zzbek zzaEX;
    private Set<Scope> zzame;

    @WorkerThread
    public zzbei(Context context, Handler handler) {
        this.mContext = context;
        this.mHandler = handler;
        this.zzaAx = zzaEV;
        this.zzaEW = true;
    }

    @WorkerThread
    public zzbei(Context context, Handler handler, @NonNull zzq zzq, Api.zza<? extends zzctj, zzctk> zza) {
        this.mContext = context;
        this.mHandler = handler;
        this.zzaCA = (zzq) zzbo.zzb(zzq, (Object) "ClientSettings must not be null");
        this.zzame = zzq.zzrn();
        this.zzaAx = zza;
        this.zzaEW = false;
    }

    /* access modifiers changed from: private */
    @WorkerThread
    public final void zzc(zzctw zzctw) {
        ConnectionResult zzpz = zzctw.zzpz();
        if (zzpz.isSuccess()) {
            zzbr zzAx = zzctw.zzAx();
            zzpz = zzAx.zzpz();
            if (!zzpz.isSuccess()) {
                String valueOf = String.valueOf(zzpz);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
            } else {
                this.zzaEX.zzb(zzAx.zzrH(), this.zzame);
                this.zzaDh.disconnect();
            }
        }
        this.zzaEX.zzh(zzpz);
        this.zzaDh.disconnect();
    }

    @WorkerThread
    public final void onConnected(@Nullable Bundle bundle) {
        this.zzaDh.zza(this);
    }

    @WorkerThread
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.zzaEX.zzh(connectionResult);
    }

    @WorkerThread
    public final void onConnectionSuspended(int i) {
        this.zzaDh.disconnect();
    }

    @WorkerThread
    public final void zza(zzbek zzbek) {
        if (this.zzaDh != null) {
            this.zzaDh.disconnect();
        }
        if (this.zzaEW) {
            GoogleSignInOptions zzmO = zzy.zzaj(this.mContext).zzmO();
            this.zzame = zzmO == null ? new HashSet() : new HashSet(zzmO.zzmA());
            zzq zzq = new zzq(null, this.zzame, null, 0, null, null, null, zzctk.zzbCM);
            this.zzaCA = zzq;
        }
        this.zzaCA.zzc(Integer.valueOf(System.identityHashCode(this)));
        this.zzaDh = (zzctj) this.zzaAx.zza(this.mContext, this.mHandler.getLooper(), this.zzaCA, this.zzaCA.zzrt(), this, this);
        this.zzaEX = zzbek;
        this.zzaDh.connect();
    }

    @BinderThread
    public final void zzb(zzctw zzctw) {
        this.mHandler.post(new zzbej(this, zzctw));
    }

    public final void zzqI() {
        if (this.zzaDh != null) {
            this.zzaDh.disconnect();
        }
    }

    public final zzctj zzqy() {
        return this.zzaDh;
    }
}
