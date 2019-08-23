package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzal;
import com.google.android.gms.common.internal.zzbr;
import com.google.android.gms.common.internal.zzq;
import com.google.android.gms.common.internal.zzr;
import com.google.android.gms.common.zze;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

public final class zzbcc implements zzbcv {
    /* access modifiers changed from: private */
    public final Context mContext;
    private final Api.zza<? extends zzctj, zzctk> zzaBe;
    private final zzq zzaCA;
    private final Map<Api<?>, Boolean> zzaCD;
    /* access modifiers changed from: private */
    public final zze zzaCF;
    private ConnectionResult zzaCO;
    /* access modifiers changed from: private */
    public final zzbcw zzaCZ;
    /* access modifiers changed from: private */
    public final Lock zzaCv;
    private int zzaDc;
    private int zzaDd;
    private int zzaDe;
    private final Bundle zzaDf = new Bundle();
    private final Set<Api.zzc> zzaDg = new HashSet();
    /* access modifiers changed from: private */
    public zzctj zzaDh;
    private boolean zzaDi;
    /* access modifiers changed from: private */
    public boolean zzaDj;
    private boolean zzaDk;
    /* access modifiers changed from: private */
    public zzal zzaDl;
    private boolean zzaDm;
    private boolean zzaDn;
    private ArrayList<Future<?>> zzaDo = new ArrayList<>();

    public zzbcc(zzbcw zzbcw, zzq zzq, Map<Api<?>, Boolean> map, zze zze, Api.zza<? extends zzctj, zzctk> zza, Lock lock, Context context) {
        this.zzaCZ = zzbcw;
        this.zzaCA = zzq;
        this.zzaCD = map;
        this.zzaCF = zze;
        this.zzaBe = zza;
        this.zzaCv = lock;
        this.mContext = context;
    }

    /* access modifiers changed from: private */
    public final void zza(zzctw zzctw) {
        if (zzan(0)) {
            ConnectionResult zzpz = zzctw.zzpz();
            if (zzpz.isSuccess()) {
                zzbr zzAx = zzctw.zzAx();
                ConnectionResult zzpz2 = zzAx.zzpz();
                if (!zzpz2.isSuccess()) {
                    String valueOf = String.valueOf(zzpz2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                    sb.append("Sign-in succeeded with resolve account failure: ");
                    sb.append(valueOf);
                    Log.wtf("GoogleApiClientConnecting", sb.toString(), new Exception());
                    zze(zzpz2);
                    return;
                }
                this.zzaDk = true;
                this.zzaDl = zzAx.zzrH();
                this.zzaDm = zzAx.zzrI();
                this.zzaDn = zzAx.zzrJ();
                zzpX();
            } else if (zzd(zzpz)) {
                zzpZ();
                zzpX();
            } else {
                zze(zzpz);
            }
        }
    }

    private final void zzad(boolean z) {
        if (this.zzaDh != null) {
            if (this.zzaDh.isConnected() && z) {
                this.zzaDh.zzAq();
            }
            this.zzaDh.disconnect();
            this.zzaDl = null;
        }
    }

    /* access modifiers changed from: private */
    public final boolean zzan(int i) {
        if (this.zzaDd == i) {
            return true;
        }
        String valueOf = String.valueOf(zzao(this.zzaDd));
        String valueOf2 = String.valueOf(zzao(i));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 70 + String.valueOf(valueOf2).length());
        sb.append("GoogleApiClient connecting is in step ");
        sb.append(valueOf);
        sb.append(" but received callback for step ");
        sb.append(valueOf2);
        Log.wtf("GoogleApiClientConnecting", sb.toString(), new Exception());
        zze(new ConnectionResult(8, null));
        return false;
    }

    private static String zzao(int i) {
        switch (i) {
            case 0:
                return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            case 1:
                return "STEP_GETTING_REMOTE_SERVICE";
            default:
                return "UNKNOWN";
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if ((r5.hasResolution() || r4.zzaCF.zzak(r5.getErrorCode()) != null) != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzb(com.google.android.gms.common.ConnectionResult r5, com.google.android.gms.common.api.Api<?> r6, boolean r7) {
        /*
            r4 = this;
            com.google.android.gms.common.api.Api$zzd r0 = r6.zzpb()
            int r0 = r0.getPriority()
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L_0x0024
            boolean r7 = r5.hasResolution()
            if (r7 == 0) goto L_0x0014
        L_0x0012:
            r7 = 1
            goto L_0x0022
        L_0x0014:
            com.google.android.gms.common.zze r7 = r4.zzaCF
            int r3 = r5.getErrorCode()
            android.content.Intent r7 = r7.zzak(r3)
            if (r7 == 0) goto L_0x0021
            goto L_0x0012
        L_0x0021:
            r7 = 0
        L_0x0022:
            if (r7 == 0) goto L_0x002d
        L_0x0024:
            com.google.android.gms.common.ConnectionResult r7 = r4.zzaCO
            if (r7 == 0) goto L_0x002c
            int r7 = r4.zzaDc
            if (r0 >= r7) goto L_0x002d
        L_0x002c:
            r1 = 1
        L_0x002d:
            if (r1 == 0) goto L_0x0033
            r4.zzaCO = r5
            r4.zzaDc = r0
        L_0x0033:
            com.google.android.gms.internal.zzbcw r7 = r4.zzaCZ
            java.util.Map<com.google.android.gms.common.api.Api$zzc<?>, com.google.android.gms.common.ConnectionResult> r7 = r7.zzaDU
            com.google.android.gms.common.api.Api$zzc r6 = r6.zzpd()
            r7.put(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzbcc.zzb(com.google.android.gms.common.ConnectionResult, com.google.android.gms.common.api.Api, boolean):void");
    }

    /* access modifiers changed from: private */
    public final boolean zzd(ConnectionResult connectionResult) {
        return this.zzaDi && !connectionResult.hasResolution();
    }

    /* access modifiers changed from: private */
    public final void zze(ConnectionResult connectionResult) {
        zzqa();
        zzad(!connectionResult.hasResolution());
        this.zzaCZ.zzg(connectionResult);
        this.zzaCZ.zzaDY.zzc(connectionResult);
    }

    /* access modifiers changed from: private */
    public final boolean zzpW() {
        ConnectionResult connectionResult;
        this.zzaDe--;
        if (this.zzaDe > 0) {
            return false;
        }
        if (this.zzaDe < 0) {
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            connectionResult = new ConnectionResult(8, null);
        } else if (this.zzaCO == null) {
            return true;
        } else {
            this.zzaCZ.zzaDX = this.zzaDc;
            connectionResult = this.zzaCO;
        }
        zze(connectionResult);
        return false;
    }

    /* access modifiers changed from: private */
    public final void zzpX() {
        if (this.zzaDe == 0) {
            if (!this.zzaDj || this.zzaDk) {
                ArrayList arrayList = new ArrayList();
                this.zzaDd = 1;
                this.zzaDe = this.zzaCZ.zzaDF.size();
                for (Api.zzc next : this.zzaCZ.zzaDF.keySet()) {
                    if (!this.zzaCZ.zzaDU.containsKey(next)) {
                        arrayList.add(this.zzaCZ.zzaDF.get(next));
                    } else if (zzpW()) {
                        zzpY();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.zzaDo.add(zzbcz.zzqj().submit(new zzbci(this, arrayList)));
                }
            }
        }
    }

    private final void zzpY() {
        this.zzaCZ.zzqi();
        zzbcz.zzqj().execute(new zzbcd(this));
        if (this.zzaDh != null) {
            if (this.zzaDm) {
                this.zzaDh.zza(this.zzaDl, this.zzaDn);
            }
            zzad(false);
        }
        for (Api.zzc<?> zzc : this.zzaCZ.zzaDU.keySet()) {
            this.zzaCZ.zzaDF.get(zzc).disconnect();
        }
        this.zzaCZ.zzaDY.zzm(this.zzaDf.isEmpty() ? null : this.zzaDf);
    }

    /* access modifiers changed from: private */
    public final void zzpZ() {
        this.zzaDj = false;
        this.zzaCZ.zzaCl.zzaDG = Collections.emptySet();
        for (Api.zzc next : this.zzaDg) {
            if (!this.zzaCZ.zzaDU.containsKey(next)) {
                this.zzaCZ.zzaDU.put(next, new ConnectionResult(17, null));
            }
        }
    }

    private final void zzqa() {
        ArrayList arrayList = this.zzaDo;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Future) obj).cancel(true);
        }
        this.zzaDo.clear();
    }

    /* access modifiers changed from: private */
    public final Set<Scope> zzqb() {
        if (this.zzaCA == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(this.zzaCA.zzrn());
        Map<Api<?>, zzr> zzrp = this.zzaCA.zzrp();
        for (Api next : zzrp.keySet()) {
            if (!this.zzaCZ.zzaDU.containsKey(next.zzpd())) {
                hashSet.addAll(zzrp.get(next).zzame);
            }
        }
        return hashSet;
    }

    public final void begin() {
        this.zzaCZ.zzaDU.clear();
        this.zzaDj = false;
        this.zzaCO = null;
        this.zzaDd = 0;
        this.zzaDi = true;
        this.zzaDk = false;
        this.zzaDm = false;
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (Api next : this.zzaCD.keySet()) {
            Api.zze zze = this.zzaCZ.zzaDF.get(next.zzpd());
            z |= next.zzpb().getPriority() == 1;
            boolean booleanValue = this.zzaCD.get(next).booleanValue();
            if (zze.zzmv()) {
                this.zzaDj = true;
                if (booleanValue) {
                    this.zzaDg.add(next.zzpd());
                } else {
                    this.zzaDi = false;
                }
            }
            hashMap.put(zze, new zzbce(this, next, booleanValue));
        }
        if (z) {
            this.zzaDj = false;
        }
        if (this.zzaDj) {
            this.zzaCA.zzc(Integer.valueOf(System.identityHashCode(this.zzaCZ.zzaCl)));
            zzbcl zzbcl = new zzbcl(this, null);
            this.zzaDh = (zzctj) this.zzaBe.zza(this.mContext, this.zzaCZ.zzaCl.getLooper(), this.zzaCA, this.zzaCA.zzrt(), zzbcl, zzbcl);
        }
        this.zzaDe = this.zzaCZ.zzaDF.size();
        this.zzaDo.add(zzbcz.zzqj().submit(new zzbcf(this, hashMap)));
    }

    public final void connect() {
    }

    public final boolean disconnect() {
        zzqa();
        zzad(true);
        this.zzaCZ.zzg(null);
        return true;
    }

    public final void onConnected(Bundle bundle) {
        if (zzan(1)) {
            if (bundle != null) {
                this.zzaDf.putAll(bundle);
            }
            if (zzpW()) {
                zzpY();
            }
        }
    }

    public final void onConnectionSuspended(int i) {
        zze(new ConnectionResult(8, null));
    }

    public final void zza(ConnectionResult connectionResult, Api<?> api, boolean z) {
        if (zzan(1)) {
            zzb(connectionResult, api, z);
            if (zzpW()) {
                zzpY();
            }
        }
    }

    public final <A extends Api.zzb, R extends Result, T extends zzbax<R, A>> T zzd(T t) {
        this.zzaCZ.zzaCl.zzaCJ.add(t);
        return t;
    }

    public final <A extends Api.zzb, T extends zzbax<? extends Result, A>> T zze(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
