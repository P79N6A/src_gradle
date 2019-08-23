package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzbo;
import com.google.android.gms.common.internal.zzbx;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public final class zzbdc<O extends Api.ApiOptions> implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, zzbbi {
    private final zzbas<O> zzaAK;
    private final Api.zze zzaCy;
    private boolean zzaDA;
    private /* synthetic */ zzbda zzaEm;
    private final Queue<zzbal> zzaEn = new LinkedList();
    private final Api.zzb zzaEo;
    private final zzbbs zzaEp;
    private final Set<zzbau> zzaEq = new HashSet();
    private final Map<zzbdx<?>, zzbee> zzaEr = new HashMap();
    private final int zzaEs;
    private final zzbei zzaEt;
    private ConnectionResult zzaEu = null;

    @WorkerThread
    public zzbdc(zzbda zzbda, GoogleApi<O> googleApi) {
        this.zzaEm = zzbda;
        this.zzaCy = googleApi.zza(zzbda.mHandler.getLooper(), this);
        if (this.zzaCy instanceof zzbx) {
            this.zzaEo = null;
        } else {
            this.zzaEo = this.zzaCy;
        }
        this.zzaAK = googleApi.zzph();
        this.zzaEp = new zzbbs();
        this.zzaEs = googleApi.getInstanceId();
        if (this.zzaCy.zzmv()) {
            this.zzaEt = googleApi.zza(zzbda.mContext, zzbda.mHandler);
        } else {
            this.zzaEt = null;
        }
    }

    @WorkerThread
    private final void zzb(zzbal zzbal) {
        zzbal.zza(this.zzaEp, zzmv());
        try {
            zzbal.zza(this);
        } catch (DeadObjectException unused) {
            onConnectionSuspended(1);
            this.zzaCy.disconnect();
        }
    }

    @WorkerThread
    private final void zzi(ConnectionResult connectionResult) {
        for (zzbau zza : this.zzaEq) {
            zza.zza(this.zzaAK, connectionResult);
        }
        this.zzaEq.clear();
    }

    /* access modifiers changed from: private */
    @WorkerThread
    public final void zzqq() {
        zzqt();
        zzi(ConnectionResult.zzazX);
        zzqv();
        for (zzbee zzbee : this.zzaEr.values()) {
            try {
                zzbee.zzaBu.zzb(this.zzaEo, new TaskCompletionSource());
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                this.zzaCy.disconnect();
            } catch (RemoteException unused2) {
            }
        }
        while (this.zzaCy.isConnected() && !this.zzaEn.isEmpty()) {
            zzb(this.zzaEn.remove());
        }
        zzqw();
    }

    /* access modifiers changed from: private */
    @WorkerThread
    public final void zzqr() {
        zzqt();
        this.zzaDA = true;
        this.zzaEp.zzpQ();
        this.zzaEm.mHandler.sendMessageDelayed(Message.obtain(this.zzaEm.mHandler, 9, this.zzaAK), this.zzaEm.zzaDC);
        this.zzaEm.mHandler.sendMessageDelayed(Message.obtain(this.zzaEm.mHandler, 11, this.zzaAK), this.zzaEm.zzaDB);
        int unused = this.zzaEm.zzaEg = -1;
    }

    @WorkerThread
    private final void zzqv() {
        if (this.zzaDA) {
            this.zzaEm.mHandler.removeMessages(11, this.zzaAK);
            this.zzaEm.mHandler.removeMessages(9, this.zzaAK);
            this.zzaDA = false;
        }
    }

    private final void zzqw() {
        this.zzaEm.mHandler.removeMessages(12, this.zzaAK);
        this.zzaEm.mHandler.sendMessageDelayed(this.zzaEm.mHandler.obtainMessage(12, this.zzaAK), this.zzaEm.zzaEe);
    }

    @WorkerThread
    public final void connect() {
        zzbo.zza(this.zzaEm.mHandler);
        if (!this.zzaCy.isConnected() && !this.zzaCy.isConnecting()) {
            if (this.zzaCy.zzpe() && this.zzaEm.zzaEg != 0) {
                int unused = this.zzaEm.zzaEg = this.zzaEm.zzaBd.isGooglePlayServicesAvailable(this.zzaEm.mContext);
                if (this.zzaEm.zzaEg != 0) {
                    onConnectionFailed(new ConnectionResult(this.zzaEm.zzaEg, null));
                    return;
                }
            }
            zzbdg zzbdg = new zzbdg(this.zzaEm, this.zzaCy, this.zzaAK);
            if (this.zzaCy.zzmv()) {
                this.zzaEt.zza(zzbdg);
            }
            this.zzaCy.zza(zzbdg);
        }
    }

    public final int getInstanceId() {
        return this.zzaEs;
    }

    /* access modifiers changed from: package-private */
    public final boolean isConnected() {
        return this.zzaCy.isConnected();
    }

    public final void onConnected(@Nullable Bundle bundle) {
        if (Looper.myLooper() == this.zzaEm.mHandler.getLooper()) {
            zzqq();
        } else {
            this.zzaEm.mHandler.post(new zzbdd(this));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0069, code lost:
        if (r4.zzaEm.zzc(r5, r4.zzaEs) != false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0071, code lost:
        if (r5.getErrorCode() != 18) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0073, code lost:
        r4.zzaDA = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        if (r4.zzaDA == false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007a, code lost:
        r4.zzaEm.mHandler.sendMessageDelayed(android.os.Message.obtain(r4.zzaEm.mHandler, 9, r4.zzaAK), r4.zzaEm.zzaDC);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0097, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0098, code lost:
        r1 = java.lang.String.valueOf(r4.zzaAK.zzpr());
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r1).length() + 38);
        r3.append("API: ");
        r3.append(r1);
        r3.append(" is not available on this device.");
        zzt(new com.google.android.gms.common.api.Status(17, r3.toString()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00cc, code lost:
        return;
     */
    @android.support.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onConnectionFailed(@android.support.annotation.NonNull com.google.android.gms.common.ConnectionResult r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.zzbda r0 = r4.zzaEm
            android.os.Handler r0 = r0.mHandler
            com.google.android.gms.common.internal.zzbo.zza(r0)
            com.google.android.gms.internal.zzbei r0 = r4.zzaEt
            if (r0 == 0) goto L_0x0012
            com.google.android.gms.internal.zzbei r0 = r4.zzaEt
            r0.zzqI()
        L_0x0012:
            r4.zzqt()
            com.google.android.gms.internal.zzbda r0 = r4.zzaEm
            r1 = -1
            int unused = r0.zzaEg = r1
            r4.zzi(r5)
            int r0 = r5.getErrorCode()
            r1 = 4
            if (r0 != r1) goto L_0x002d
            com.google.android.gms.common.api.Status r5 = com.google.android.gms.internal.zzbda.zzaEd
            r4.zzt(r5)
            return
        L_0x002d:
            java.util.Queue<com.google.android.gms.internal.zzbal> r0 = r4.zzaEn
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0038
            r4.zzaEu = r5
            return
        L_0x0038:
            java.lang.Object r0 = com.google.android.gms.internal.zzbda.zzuH
            monitor-enter(r0)
            com.google.android.gms.internal.zzbda r1 = r4.zzaEm     // Catch:{ all -> 0x00cd }
            com.google.android.gms.internal.zzbbv r1 = r1.zzaEj     // Catch:{ all -> 0x00cd }
            if (r1 == 0) goto L_0x0060
            com.google.android.gms.internal.zzbda r1 = r4.zzaEm     // Catch:{ all -> 0x00cd }
            java.util.Set r1 = r1.zzaEk     // Catch:{ all -> 0x00cd }
            com.google.android.gms.internal.zzbas<O> r2 = r4.zzaAK     // Catch:{ all -> 0x00cd }
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x00cd }
            if (r1 == 0) goto L_0x0060
            com.google.android.gms.internal.zzbda r1 = r4.zzaEm     // Catch:{ all -> 0x00cd }
            com.google.android.gms.internal.zzbbv r1 = r1.zzaEj     // Catch:{ all -> 0x00cd }
            int r2 = r4.zzaEs     // Catch:{ all -> 0x00cd }
            r1.zzb(r5, r2)     // Catch:{ all -> 0x00cd }
            monitor-exit(r0)     // Catch:{ all -> 0x00cd }
            return
        L_0x0060:
            monitor-exit(r0)     // Catch:{ all -> 0x00cd }
            com.google.android.gms.internal.zzbda r0 = r4.zzaEm
            int r1 = r4.zzaEs
            boolean r0 = r0.zzc(r5, r1)
            if (r0 != 0) goto L_0x00cc
            int r5 = r5.getErrorCode()
            r0 = 18
            if (r5 != r0) goto L_0x0076
            r5 = 1
            r4.zzaDA = r5
        L_0x0076:
            boolean r5 = r4.zzaDA
            if (r5 == 0) goto L_0x0098
            com.google.android.gms.internal.zzbda r5 = r4.zzaEm
            android.os.Handler r5 = r5.mHandler
            com.google.android.gms.internal.zzbda r0 = r4.zzaEm
            android.os.Handler r0 = r0.mHandler
            r1 = 9
            com.google.android.gms.internal.zzbas<O> r2 = r4.zzaAK
            android.os.Message r0 = android.os.Message.obtain(r0, r1, r2)
            com.google.android.gms.internal.zzbda r1 = r4.zzaEm
            long r1 = r1.zzaDC
            r5.sendMessageDelayed(r0, r1)
            return
        L_0x0098:
            com.google.android.gms.common.api.Status r5 = new com.google.android.gms.common.api.Status
            r0 = 17
            com.google.android.gms.internal.zzbas<O> r1 = r4.zzaAK
            java.lang.String r1 = r1.zzpr()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            int r2 = r2 + 38
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "API: "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = " is not available on this device."
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r5.<init>(r0, r1)
            r4.zzt(r5)
        L_0x00cc:
            return
        L_0x00cd:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00cd }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzbdc.onConnectionFailed(com.google.android.gms.common.ConnectionResult):void");
    }

    public final void onConnectionSuspended(int i) {
        if (Looper.myLooper() == this.zzaEm.mHandler.getLooper()) {
            zzqr();
        } else {
            this.zzaEm.mHandler.post(new zzbde(this));
        }
    }

    @WorkerThread
    public final void resume() {
        zzbo.zza(this.zzaEm.mHandler);
        if (this.zzaDA) {
            connect();
        }
    }

    @WorkerThread
    public final void signOut() {
        zzbo.zza(this.zzaEm.mHandler);
        zzt(zzbda.zzaEc);
        this.zzaEp.zzpP();
        for (zzbdx<?> zzbaq : this.zzaEr.keySet()) {
            zza((zzbal) new zzbaq(zzbaq, new TaskCompletionSource()));
        }
        zzi(new ConnectionResult(4));
        this.zzaCy.disconnect();
    }

    public final void zza(ConnectionResult connectionResult, Api<?> api, boolean z) {
        if (Looper.myLooper() == this.zzaEm.mHandler.getLooper()) {
            onConnectionFailed(connectionResult);
        } else {
            this.zzaEm.mHandler.post(new zzbdf(this, connectionResult));
        }
    }

    @WorkerThread
    public final void zza(zzbal zzbal) {
        zzbo.zza(this.zzaEm.mHandler);
        if (this.zzaCy.isConnected()) {
            zzb(zzbal);
            zzqw();
            return;
        }
        this.zzaEn.add(zzbal);
        if (this.zzaEu == null || !this.zzaEu.hasResolution()) {
            connect();
        } else {
            onConnectionFailed(this.zzaEu);
        }
    }

    @WorkerThread
    public final void zza(zzbau zzbau) {
        zzbo.zza(this.zzaEm.mHandler);
        this.zzaEq.add(zzbau);
    }

    @WorkerThread
    public final void zzh(@NonNull ConnectionResult connectionResult) {
        zzbo.zza(this.zzaEm.mHandler);
        this.zzaCy.disconnect();
        onConnectionFailed(connectionResult);
    }

    public final boolean zzmv() {
        return this.zzaCy.zzmv();
    }

    public final Api.zze zzpJ() {
        return this.zzaCy;
    }

    @WorkerThread
    public final void zzqd() {
        zzbo.zza(this.zzaEm.mHandler);
        if (this.zzaDA) {
            zzqv();
            zzt(this.zzaEm.zzaBd.isGooglePlayServicesAvailable(this.zzaEm.mContext) == 18 ? new Status(8, "Connection timed out while waiting for Google Play services update to complete.") : new Status(8, "API failed to connect while resuming due to an unknown error."));
            this.zzaCy.disconnect();
        }
    }

    public final Map<zzbdx<?>, zzbee> zzqs() {
        return this.zzaEr;
    }

    @WorkerThread
    public final void zzqt() {
        zzbo.zza(this.zzaEm.mHandler);
        this.zzaEu = null;
    }

    @WorkerThread
    public final ConnectionResult zzqu() {
        zzbo.zza(this.zzaEm.mHandler);
        return this.zzaEu;
    }

    @WorkerThread
    public final void zzqx() {
        zzbo.zza(this.zzaEm.mHandler);
        if (this.zzaCy.isConnected() && this.zzaEr.size() == 0) {
            if (this.zzaEp.zzpO()) {
                zzqw();
                return;
            }
            this.zzaCy.disconnect();
        }
    }

    /* access modifiers changed from: package-private */
    public final zzctj zzqy() {
        if (this.zzaEt == null) {
            return null;
        }
        return this.zzaEt.zzqy();
    }

    @WorkerThread
    public final void zzt(Status status) {
        zzbo.zza(this.zzaEm.mHandler);
        for (zzbal zzp : this.zzaEn) {
            zzp.zzp(status);
        }
        this.zzaEn.clear();
    }
}
