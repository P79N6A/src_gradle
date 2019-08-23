package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.internal.zzad;
import com.google.android.gms.common.internal.zzbo;
import com.google.android.gms.common.internal.zzq;
import com.google.android.gms.common.zze;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;

public final class zzbco extends GoogleApiClient implements zzbdp {
    /* access modifiers changed from: private */
    public final Context mContext;
    private final int zzaBb;
    private final GoogleApiAvailability zzaBd;
    private Api.zza<? extends zzctj, zzctk> zzaBe;
    private boolean zzaBh;
    private zzq zzaCA;
    private Map<Api<?>, Boolean> zzaCD;
    final Queue<zzbax<?, ?>> zzaCJ = new LinkedList();
    private final Lock zzaCv;
    private volatile boolean zzaDA;
    private long zzaDB = 120000;
    private long zzaDC = 5000;
    private final zzbct zzaDD;
    private zzbdj zzaDE;
    final Map<Api.zzc<?>, Api.zze> zzaDF;
    Set<Scope> zzaDG = new HashSet();
    private final zzbdz zzaDH = new zzbdz();
    private final ArrayList<zzbbh> zzaDI;
    private Integer zzaDJ = null;
    Set<zzber> zzaDK = null;
    final zzbeu zzaDL;
    private final zzad zzaDM = new zzbcp(this);
    private final zzac zzaDy;
    private zzbdo zzaDz;
    private final Looper zzrO;

    public zzbco(Context context, Lock lock, Looper looper, zzq zzq, GoogleApiAvailability googleApiAvailability, Api.zza<? extends zzctj, zzctk> zza, Map<Api<?>, Boolean> map, List<GoogleApiClient.ConnectionCallbacks> list, List<GoogleApiClient.OnConnectionFailedListener> list2, Map<Api.zzc<?>, Api.zze> map2, int i, int i2, ArrayList<zzbbh> arrayList, boolean z) {
        this.mContext = context;
        this.zzaCv = lock;
        this.zzaBh = false;
        this.zzaDy = new zzac(looper, this.zzaDM);
        this.zzrO = looper;
        this.zzaDD = new zzbct(this, looper);
        this.zzaBd = googleApiAvailability;
        this.zzaBb = i;
        if (this.zzaBb >= 0) {
            this.zzaDJ = Integer.valueOf(i2);
        }
        this.zzaCD = map;
        this.zzaDF = map2;
        this.zzaDI = arrayList;
        this.zzaDL = new zzbeu(this.zzaDF);
        for (GoogleApiClient.ConnectionCallbacks registerConnectionCallbacks : list) {
            this.zzaDy.registerConnectionCallbacks(registerConnectionCallbacks);
        }
        for (GoogleApiClient.OnConnectionFailedListener registerConnectionFailedListener : list2) {
            this.zzaDy.registerConnectionFailedListener(registerConnectionFailedListener);
        }
        this.zzaCA = zzq;
        this.zzaBe = zza;
    }

    /* access modifiers changed from: private */
    public final void resume() {
        this.zzaCv.lock();
        try {
            if (this.zzaDA) {
                zzqc();
            }
        } finally {
            this.zzaCv.unlock();
        }
    }

    public static int zza(Iterable<Api.zze> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (Api.zze next : iterable) {
            if (next.zzmv()) {
                z2 = true;
            }
            if (next.zzmG()) {
                z3 = true;
            }
        }
        if (z2) {
            return (!z3 || !z) ? 1 : 2;
        }
        return 3;
    }

    /* access modifiers changed from: private */
    public final void zza(GoogleApiClient googleApiClient, zzbem zzbem, boolean z) {
        zzbfn.zzaIy.zzd(googleApiClient).setResultCallback(new zzbcs(this, zzbem, z, googleApiClient));
    }

    private final void zzap(int i) {
        if (this.zzaDJ == null) {
            this.zzaDJ = Integer.valueOf(i);
        } else if (this.zzaDJ.intValue() != i) {
            String valueOf = String.valueOf(zzaq(i));
            String valueOf2 = String.valueOf(zzaq(this.zzaDJ.intValue()));
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(valueOf2).length());
            sb.append("Cannot use sign-in mode: ");
            sb.append(valueOf);
            sb.append(". Mode was already set to ");
            sb.append(valueOf2);
            throw new IllegalStateException(sb.toString());
        }
        if (this.zzaDz == null) {
            boolean z = false;
            boolean z2 = false;
            for (Api.zze next : this.zzaDF.values()) {
                if (next.zzmv()) {
                    z = true;
                }
                if (next.zzmG()) {
                    z2 = true;
                }
            }
            switch (this.zzaDJ.intValue()) {
                case 1:
                    if (!z) {
                        throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                    } else if (z2) {
                        throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
                    }
                    break;
                case 2:
                    if (z) {
                        if (this.zzaBh) {
                            zzbbo zzbbo = new zzbbo(this.mContext, this.zzaCv, this.zzrO, this.zzaBd, this.zzaDF, this.zzaCA, this.zzaCD, this.zzaBe, this.zzaDI, this, true);
                            this.zzaDz = zzbbo;
                            return;
                        }
                        this.zzaDz = zzbbj.zza(this.mContext, this, this.zzaCv, this.zzrO, this.zzaBd, this.zzaDF, this.zzaCA, this.zzaCD, this.zzaBe, this.zzaDI);
                        return;
                    }
                    break;
            }
            if (!this.zzaBh || z2) {
                zzbcw zzbcw = new zzbcw(this.mContext, this, this.zzaCv, this.zzrO, this.zzaBd, this.zzaDF, this.zzaCA, this.zzaCD, this.zzaBe, this.zzaDI, this);
                this.zzaDz = zzbcw;
                return;
            }
            zzbbo zzbbo2 = new zzbbo(this.mContext, this.zzaCv, this.zzrO, this.zzaBd, this.zzaDF, this.zzaCA, this.zzaCD, this.zzaBe, this.zzaDI, this, false);
            this.zzaDz = zzbbo2;
        }
    }

    private static String zzaq(int i) {
        switch (i) {
            case 1:
                return "SIGN_IN_MODE_REQUIRED";
            case 2:
                return "SIGN_IN_MODE_OPTIONAL";
            case 3:
                return "SIGN_IN_MODE_NONE";
            default:
                return "UNKNOWN";
        }
    }

    private final void zzqc() {
        this.zzaDy.zzrA();
        this.zzaDz.connect();
    }

    /* access modifiers changed from: private */
    public final void zzqd() {
        this.zzaCv.lock();
        try {
            if (zzqe()) {
                zzqc();
            }
        } finally {
            this.zzaCv.unlock();
        }
    }

    public final ConnectionResult blockingConnect() {
        boolean z = true;
        zzbo.zza(Looper.myLooper() != Looper.getMainLooper(), (Object) "blockingConnect must not be called on the UI thread");
        this.zzaCv.lock();
        try {
            if (this.zzaBb >= 0) {
                if (this.zzaDJ == null) {
                    z = false;
                }
                zzbo.zza(z, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.zzaDJ == null) {
                this.zzaDJ = Integer.valueOf(zza(this.zzaDF.values(), false));
            } else if (this.zzaDJ.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            zzap(this.zzaDJ.intValue());
            this.zzaDy.zzrA();
            return this.zzaDz.blockingConnect();
        } finally {
            this.zzaCv.unlock();
        }
    }

    public final ConnectionResult blockingConnect(long j, @NonNull TimeUnit timeUnit) {
        zzbo.zza(Looper.myLooper() != Looper.getMainLooper(), (Object) "blockingConnect must not be called on the UI thread");
        zzbo.zzb(timeUnit, (Object) "TimeUnit must not be null");
        this.zzaCv.lock();
        try {
            if (this.zzaDJ == null) {
                this.zzaDJ = Integer.valueOf(zza(this.zzaDF.values(), false));
            } else if (this.zzaDJ.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            zzap(this.zzaDJ.intValue());
            this.zzaDy.zzrA();
            return this.zzaDz.blockingConnect(j, timeUnit);
        } finally {
            this.zzaCv.unlock();
        }
    }

    public final PendingResult<Status> clearDefaultAccountAndReconnect() {
        zzbo.zza(isConnected(), (Object) "GoogleApiClient is not connected yet.");
        zzbo.zza(this.zzaDJ.intValue() != 2, (Object) "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        zzbem zzbem = new zzbem((GoogleApiClient) this);
        if (this.zzaDF.containsKey(zzbfn.zzajR)) {
            zza(this, zzbem, false);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            GoogleApiClient build = new GoogleApiClient.Builder(this.mContext).addApi(zzbfn.API).addConnectionCallbacks(new zzbcq(this, atomicReference, zzbem)).addOnConnectionFailedListener(new zzbcr(this, zzbem)).setHandler(this.zzaDD).build();
            atomicReference.set(build);
            build.connect();
        }
        return zzbem;
    }

    public final void connect() {
        this.zzaCv.lock();
        try {
            boolean z = false;
            if (this.zzaBb >= 0) {
                if (this.zzaDJ != null) {
                    z = true;
                }
                zzbo.zza(z, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.zzaDJ == null) {
                this.zzaDJ = Integer.valueOf(zza(this.zzaDF.values(), false));
            } else if (this.zzaDJ.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            connect(this.zzaDJ.intValue());
        } finally {
            this.zzaCv.unlock();
        }
    }

    public final void connect(int i) {
        this.zzaCv.lock();
        boolean z = true;
        if (!(i == 3 || i == 1 || i == 2)) {
            z = false;
        }
        try {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Illegal sign-in mode: ");
            sb.append(i);
            zzbo.zzb(z, (Object) sb.toString());
            zzap(i);
            zzqc();
        } finally {
            this.zzaCv.unlock();
        }
    }

    public final void disconnect() {
        this.zzaCv.lock();
        try {
            this.zzaDL.release();
            if (this.zzaDz != null) {
                this.zzaDz.disconnect();
            }
            this.zzaDH.release();
            for (zzbax zzbax : this.zzaCJ) {
                zzbax.zza((zzbew) null);
                zzbax.cancel();
            }
            this.zzaCJ.clear();
            if (this.zzaDz != null) {
                zzqe();
                this.zzaDy.zzrz();
            }
        } finally {
            this.zzaCv.unlock();
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.mContext);
        printWriter.append(str).append("mResuming=").print(this.zzaDA);
        printWriter.append(" mWorkQueue.size()=").print(this.zzaCJ.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.zzaDL.zzaFl.size());
        if (this.zzaDz != null) {
            this.zzaDz.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @NonNull
    public final ConnectionResult getConnectionResult(@NonNull Api<?> api) {
        ConnectionResult connectionResult;
        this.zzaCv.lock();
        try {
            if (!isConnected()) {
                if (!this.zzaDA) {
                    throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
                }
            }
            if (this.zzaDF.containsKey(api.zzpd())) {
                ConnectionResult connectionResult2 = this.zzaDz.getConnectionResult(api);
                if (connectionResult2 == null) {
                    if (this.zzaDA) {
                        connectionResult = ConnectionResult.zzazX;
                    } else {
                        Log.wtf("GoogleApiClientImpl", String.valueOf(api.getName()).concat(" requested in getConnectionResult is not connected but is not present in the failed  connections map"), new Exception());
                        connectionResult = new ConnectionResult(8, null);
                    }
                    return connectionResult;
                }
                this.zzaCv.unlock();
                return connectionResult2;
            }
            throw new IllegalArgumentException(String.valueOf(api.getName()).concat(" was never registered with GoogleApiClient"));
        } finally {
            this.zzaCv.unlock();
        }
    }

    public final Context getContext() {
        return this.mContext;
    }

    public final Looper getLooper() {
        return this.zzrO;
    }

    public final boolean hasConnectedApi(@NonNull Api<?> api) {
        if (!isConnected()) {
            return false;
        }
        Api.zze zze = this.zzaDF.get(api.zzpd());
        return zze != null && zze.isConnected();
    }

    public final boolean isConnected() {
        return this.zzaDz != null && this.zzaDz.isConnected();
    }

    public final boolean isConnecting() {
        return this.zzaDz != null && this.zzaDz.isConnecting();
    }

    public final boolean isConnectionCallbacksRegistered(@NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        return this.zzaDy.isConnectionCallbacksRegistered(connectionCallbacks);
    }

    public final boolean isConnectionFailedListenerRegistered(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return this.zzaDy.isConnectionFailedListenerRegistered(onConnectionFailedListener);
    }

    public final void reconnect() {
        disconnect();
        connect();
    }

    public final void registerConnectionCallbacks(@NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.zzaDy.registerConnectionCallbacks(connectionCallbacks);
    }

    public final void registerConnectionFailedListener(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zzaDy.registerConnectionFailedListener(onConnectionFailedListener);
    }

    public final void stopAutoManage(@NonNull FragmentActivity fragmentActivity) {
        zzbdq zzbdq = new zzbdq(fragmentActivity);
        if (this.zzaBb >= 0) {
            zzbat.zza(zzbdq).zzal(this.zzaBb);
            return;
        }
        throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
    }

    public final void unregisterConnectionCallbacks(@NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.zzaDy.unregisterConnectionCallbacks(connectionCallbacks);
    }

    public final void unregisterConnectionFailedListener(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zzaDy.unregisterConnectionFailedListener(onConnectionFailedListener);
    }

    @NonNull
    public final <C extends Api.zze> C zza(@NonNull Api.zzc<C> zzc) {
        C c2 = (Api.zze) this.zzaDF.get(zzc);
        zzbo.zzb(c2, (Object) "Appropriate Api was not requested.");
        return c2;
    }

    public final void zza(zzber zzber) {
        this.zzaCv.lock();
        try {
            if (this.zzaDK == null) {
                this.zzaDK = new HashSet();
            }
            this.zzaDK.add(zzber);
        } finally {
            this.zzaCv.unlock();
        }
    }

    public final boolean zza(@NonNull Api<?> api) {
        return this.zzaDF.containsKey(api.zzpd());
    }

    public final boolean zza(zzbeh zzbeh) {
        return this.zzaDz != null && this.zzaDz.zza(zzbeh);
    }

    public final void zzb(zzber zzber) {
        String str;
        String str2;
        Exception exc;
        this.zzaCv.lock();
        try {
            if (this.zzaDK == null) {
                str = "GoogleApiClientImpl";
                str2 = "Attempted to remove pending transform when no transforms are registered.";
                exc = new Exception();
            } else if (!this.zzaDK.remove(zzber)) {
                str = "GoogleApiClientImpl";
                str2 = "Failed to remove pending transform - this may lead to memory leaks!";
                exc = new Exception();
            } else {
                if (!zzqf()) {
                    this.zzaDz.zzpE();
                }
            }
            Log.wtf(str, str2, exc);
        } finally {
            this.zzaCv.unlock();
        }
    }

    public final void zzc(ConnectionResult connectionResult) {
        if (!zze.zze(this.mContext, connectionResult.getErrorCode())) {
            zzqe();
        }
        if (!this.zzaDA) {
            this.zzaDy.zzk(connectionResult);
            this.zzaDy.zzrz();
        }
    }

    public final <A extends Api.zzb, R extends Result, T extends zzbax<R, A>> T zzd(@NonNull T t) {
        zzbo.zzb(t.zzpd() != null, (Object) "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean containsKey = this.zzaDF.containsKey(t.zzpd());
        String name = t.zzpg() != null ? t.zzpg().getName() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(name);
        sb.append(" required for this call.");
        zzbo.zzb(containsKey, (Object) sb.toString());
        this.zzaCv.lock();
        try {
            if (this.zzaDz == null) {
                this.zzaCJ.add(t);
            } else {
                t = this.zzaDz.zzd(t);
            }
            return t;
        } finally {
            this.zzaCv.unlock();
        }
    }

    public final <A extends Api.zzb, T extends zzbax<? extends Result, A>> T zze(@NonNull T t) {
        zzbo.zzb(t.zzpd() != null, (Object) "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.zzaDF.containsKey(t.zzpd());
        String name = t.zzpg() != null ? t.zzpg().getName() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(name);
        sb.append(" required for this call.");
        zzbo.zzb(containsKey, (Object) sb.toString());
        this.zzaCv.lock();
        try {
            if (this.zzaDz != null) {
                if (this.zzaDA) {
                    this.zzaCJ.add(t);
                    while (!this.zzaCJ.isEmpty()) {
                        zzbax remove = this.zzaCJ.remove();
                        this.zzaDL.zzb(remove);
                        remove.zzr(Status.zzaBo);
                    }
                } else {
                    t = this.zzaDz.zze(t);
                }
                return t;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } finally {
            this.zzaCv.unlock();
        }
    }

    public final void zze(int i, boolean z) {
        if (i == 1 && !z && !this.zzaDA) {
            this.zzaDA = true;
            if (this.zzaDE == null) {
                this.zzaDE = GoogleApiAvailability.zza(this.mContext.getApplicationContext(), (zzbdk) new zzbcu(this));
            }
            this.zzaDD.sendMessageDelayed(this.zzaDD.obtainMessage(1), this.zzaDB);
            this.zzaDD.sendMessageDelayed(this.zzaDD.obtainMessage(2), this.zzaDC);
        }
        this.zzaDL.zzqM();
        this.zzaDy.zzaA(i);
        this.zzaDy.zzrz();
        if (i == 2) {
            zzqc();
        }
    }

    public final void zzm(Bundle bundle) {
        while (!this.zzaCJ.isEmpty()) {
            zze(this.zzaCJ.remove());
        }
        this.zzaDy.zzn(bundle);
    }

    public final <L> zzbdv<L> zzp(@NonNull L l) {
        this.zzaCv.lock();
        try {
            return this.zzaDH.zza(l, this.zzrO, "NO_TYPE");
        } finally {
            this.zzaCv.unlock();
        }
    }

    public final void zzpl() {
        if (this.zzaDz != null) {
            this.zzaDz.zzpl();
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zzqe() {
        if (!this.zzaDA) {
            return false;
        }
        this.zzaDA = false;
        this.zzaDD.removeMessages(2);
        this.zzaDD.removeMessages(1);
        if (this.zzaDE != null) {
            this.zzaDE.unregister();
            this.zzaDE = null;
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final boolean zzqf() {
        this.zzaCv.lock();
        try {
            if (this.zzaDK == null) {
                this.zzaCv.unlock();
                return false;
            }
            boolean z = !this.zzaDK.isEmpty();
            this.zzaCv.unlock();
            return z;
        } catch (Throwable th) {
            this.zzaCv.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final String zzqg() {
        StringWriter stringWriter = new StringWriter();
        dump("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }
}
