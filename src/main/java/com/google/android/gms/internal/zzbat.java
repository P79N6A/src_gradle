package com.google.android.gms.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.zzbo;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class zzbat extends zzbaz {
    private final SparseArray<zza> zzaBB = new SparseArray<>();

    class zza implements GoogleApiClient.OnConnectionFailedListener {
        public final int zzaBC;
        public final GoogleApiClient zzaBD;
        public final GoogleApiClient.OnConnectionFailedListener zzaBE;

        public zza(int i, GoogleApiClient googleApiClient, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            this.zzaBC = i;
            this.zzaBD = googleApiClient;
            this.zzaBE = onConnectionFailedListener;
            googleApiClient.registerConnectionFailedListener(this);
        }

        public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
            zzbat.this.zzb(connectionResult, this.zzaBC);
        }
    }

    private zzbat(zzbds zzbds) {
        super(zzbds);
        this.zzaEG.zza("AutoManageHelper", (zzbdr) this);
    }

    public static zzbat zza(zzbdq zzbdq) {
        zzbds zzb = zzb(zzbdq);
        zzbat zzbat = (zzbat) zzb.zza("AutoManageHelper", zzbat.class);
        return zzbat != null ? zzbat : new zzbat(zzb);
    }

    @Nullable
    private final zza zzam(int i) {
        if (this.zzaBB.size() <= i) {
            return null;
        }
        return this.zzaBB.get(this.zzaBB.keyAt(i));
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.zzaBB.size(); i++) {
            zza zzam = zzam(i);
            if (zzam != null) {
                printWriter.append(str).append("GoogleApiClient #").print(zzam.zzaBC);
                printWriter.println(":");
                zzam.zzaBD.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        if (this.zzaBN.get() == null) {
            for (int i = 0; i < this.zzaBB.size(); i++) {
                zza zzam = zzam(i);
                if (zzam != null) {
                    zzam.zzaBD.connect();
                }
            }
        }
    }

    public final void onStop() {
        super.onStop();
        for (int i = 0; i < this.zzaBB.size(); i++) {
            zza zzam = zzam(i);
            if (zzam != null) {
                zzam.zzaBD.disconnect();
            }
        }
    }

    public final void zza(int i, GoogleApiClient googleApiClient, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        zzbo.zzb(googleApiClient, (Object) "GoogleApiClient instance cannot be null");
        boolean z = this.zzaBB.indexOfKey(i) < 0;
        StringBuilder sb = new StringBuilder(54);
        sb.append("Already managing a GoogleApiClient with id ");
        sb.append(i);
        zzbo.zza(z, (Object) sb.toString());
        zzbba zzbba = (zzbba) this.zzaBN.get();
        this.zzaBB.put(i, new zza(i, googleApiClient, onConnectionFailedListener));
        if (this.mStarted && zzbba == null) {
            googleApiClient.connect();
        }
    }

    /* access modifiers changed from: protected */
    public final void zza(ConnectionResult connectionResult, int i) {
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        zza zza2 = this.zzaBB.get(i);
        if (zza2 != null) {
            zzal(i);
            GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = zza2.zzaBE;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.onConnectionFailed(connectionResult);
            }
        }
    }

    public final void zzal(int i) {
        zza zza2 = this.zzaBB.get(i);
        this.zzaBB.remove(i);
        if (zza2 != null) {
            zza2.zzaBD.unregisterConnectionFailedListener(zza2);
            zza2.zzaBD.disconnect();
        }
    }

    /* access modifiers changed from: protected */
    public final void zzps() {
        for (int i = 0; i < this.zzaBB.size(); i++) {
            zza zzam = zzam(i);
            if (zzam != null) {
                zzam.zzaBD.connect();
            }
        }
    }
}
