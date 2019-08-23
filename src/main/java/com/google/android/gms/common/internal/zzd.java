package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.zzc;
import com.google.android.gms.common.zze;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class zzd<T extends IInterface> {
    private static String[] zzaHc = {"service_esmobile", "service_googleme"};
    private final Context mContext;
    final Handler mHandler;
    private final Object mLock;
    private final zze zzaCF;
    private int zzaGH;
    private long zzaGI;
    private long zzaGJ;
    private int zzaGK;
    private long zzaGL;
    private zzak zzaGM;
    private final zzae zzaGN;
    /* access modifiers changed from: private */
    public final Object zzaGO;
    /* access modifiers changed from: private */
    public zzaw zzaGP;
    protected zzj zzaGQ;
    private T zzaGR;
    /* access modifiers changed from: private */
    public final ArrayList<zzi<?>> zzaGS;
    private zzl zzaGT;
    private int zzaGU;
    /* access modifiers changed from: private */
    public final zzf zzaGV;
    /* access modifiers changed from: private */
    public final zzg zzaGW;
    private final int zzaGX;
    private final String zzaGY;
    /* access modifiers changed from: private */
    public ConnectionResult zzaGZ;
    /* access modifiers changed from: private */
    public boolean zzaHa;
    protected AtomicInteger zzaHb;
    private final Looper zzrO;

    protected zzd(Context context, Looper looper, int i, zzf zzf, zzg zzg, String str) {
        this(context, looper, zzae.zzaC(context), zze.zzoW(), i, (zzf) zzbo.zzu(zzf), (zzg) zzbo.zzu(zzg), null);
    }

    protected zzd(Context context, Looper looper, zzae zzae, zze zze, int i, zzf zzf, zzg zzg, String str) {
        this.mLock = new Object();
        this.zzaGO = new Object();
        this.zzaGS = new ArrayList<>();
        this.zzaGU = 1;
        this.zzaGZ = null;
        this.zzaHa = false;
        this.zzaHb = new AtomicInteger(0);
        this.mContext = (Context) zzbo.zzb(context, (Object) "Context must not be null");
        this.zzrO = (Looper) zzbo.zzb(looper, (Object) "Looper must not be null");
        this.zzaGN = (zzae) zzbo.zzb(zzae, (Object) "Supervisor must not be null");
        this.zzaCF = (zze) zzbo.zzb(zze, (Object) "API availability must not be null");
        this.mHandler = new zzh(this, looper);
        this.zzaGX = i;
        this.zzaGV = zzf;
        this.zzaGW = zzg;
        this.zzaGY = str;
    }

    /* access modifiers changed from: private */
    public final void zza(int i, T t) {
        boolean z = true;
        if ((i == 4) != (t != null)) {
            z = false;
        }
        zzbo.zzaf(z);
        synchronized (this.mLock) {
            this.zzaGU = i;
            this.zzaGR = t;
            switch (i) {
                case 1:
                    if (this.zzaGT != null) {
                        this.zzaGN.zza(zzdb(), zzqZ(), this.zzaGT, zzra());
                        this.zzaGT = null;
                        break;
                    }
                    break;
                case 2:
                case 3:
                    if (!(this.zzaGT == null || this.zzaGM == null)) {
                        this.zzaGN.zza(this.zzaGM.zzrE(), this.zzaGM.getPackageName(), this.zzaGT, zzra());
                        this.zzaHb.incrementAndGet();
                    }
                    this.zzaGT = new zzl(this, this.zzaHb.get());
                    this.zzaGM = new zzak(zzqZ(), zzdb(), false);
                    if (!this.zzaGN.zza(new zzaf(this.zzaGM.zzrE(), this.zzaGM.getPackageName()), (ServiceConnection) this.zzaGT, zzra())) {
                        zza(16, (Bundle) null, this.zzaHb.get());
                        break;
                    }
                    break;
                case 4:
                    zza(t);
                    break;
            }
        }
    }

    /* access modifiers changed from: private */
    public final boolean zza(int i, int i2, T t) {
        synchronized (this.mLock) {
            if (this.zzaGU != i) {
                return false;
            }
            zza(i2, t);
            return true;
        }
    }

    /* access modifiers changed from: private */
    public final void zzaz(int i) {
        int i2;
        if (zzrc()) {
            i2 = 5;
            this.zzaHa = true;
        } else {
            i2 = 4;
        }
        this.mHandler.sendMessage(this.mHandler.obtainMessage(i2, this.zzaHb.get(), 16));
    }

    @Nullable
    private final String zzra() {
        return this.zzaGY == null ? this.mContext.getClass().getName() : this.zzaGY;
    }

    private final boolean zzrc() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzaGU == 3;
        }
        return z;
    }

    /* access modifiers changed from: private */
    public final boolean zzri() {
        if (this.zzaHa || TextUtils.isEmpty(zzdc()) || TextUtils.isEmpty(null)) {
            return false;
        }
        try {
            Class.forName(zzdc());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public void disconnect() {
        this.zzaHb.incrementAndGet();
        synchronized (this.zzaGS) {
            int size = this.zzaGS.size();
            for (int i = 0; i < size; i++) {
                this.zzaGS.get(i).removeListener();
            }
            this.zzaGS.clear();
        }
        synchronized (this.zzaGO) {
            this.zzaGP = null;
        }
        zza(1, (T) null);
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        T t;
        zzaw zzaw;
        String str2;
        String str3;
        synchronized (this.mLock) {
            i = this.zzaGU;
            t = this.zzaGR;
        }
        synchronized (this.zzaGO) {
            zzaw = this.zzaGP;
        }
        printWriter.append(str).append("mConnectState=");
        switch (i) {
            case 1:
                str2 = "DISCONNECTED";
                break;
            case 2:
                str2 = "REMOTE_CONNECTING";
                break;
            case 3:
                str2 = "LOCAL_CONNECTING";
                break;
            case 4:
                str2 = "CONNECTED";
                break;
            case 5:
                str2 = "DISCONNECTING";
                break;
            default:
                str2 = "UNKNOWN";
                break;
        }
        printWriter.print(str2);
        printWriter.append(" mService=");
        if (t == null) {
            printWriter.append("null");
        } else {
            printWriter.append(zzdc()).append("@").append(Integer.toHexString(System.identityHashCode(t.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (zzaw == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(zzaw.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzaGJ > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j = this.zzaGJ;
            String valueOf = String.valueOf(simpleDateFormat.format(new Date(this.zzaGJ)));
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb.append(j);
            sb.append(" ");
            sb.append(valueOf);
            append.println(sb.toString());
        }
        if (this.zzaGI > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            switch (this.zzaGH) {
                case 1:
                    str3 = "CAUSE_SERVICE_DISCONNECTED";
                    break;
                case 2:
                    str3 = "CAUSE_NETWORK_LOST";
                    break;
                default:
                    str3 = String.valueOf(this.zzaGH);
                    break;
            }
            printWriter.append(str3);
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.zzaGI;
            String valueOf2 = String.valueOf(simpleDateFormat.format(new Date(this.zzaGI)));
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 21);
            sb2.append(j2);
            sb2.append(" ");
            sb2.append(valueOf2);
            append2.println(sb2.toString());
        }
        if (this.zzaGL > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(CommonStatusCodes.getStatusCodeString(this.zzaGK));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.zzaGL;
            String valueOf3 = String.valueOf(simpleDateFormat.format(new Date(this.zzaGL)));
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 21);
            sb3.append(j3);
            sb3.append(" ");
            sb3.append(valueOf3);
            append3.println(sb3.toString());
        }
    }

    public Account getAccount() {
        return null;
    }

    public final Context getContext() {
        return this.mContext;
    }

    public final Looper getLooper() {
        return this.zzrO;
    }

    public final boolean isConnected() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzaGU == 4;
        }
        return z;
    }

    public final boolean isConnecting() {
        boolean z;
        synchronized (this.mLock) {
            if (this.zzaGU != 2) {
                if (this.zzaGU != 3) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    @CallSuper
    public void onConnectionFailed(ConnectionResult connectionResult) {
        this.zzaGK = connectionResult.getErrorCode();
        this.zzaGL = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    @CallSuper
    public final void onConnectionSuspended(int i) {
        this.zzaGH = i;
        this.zzaGI = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public final void zza(int i, @Nullable Bundle bundle, int i2) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(7, i2, -1, new zzo(this, i, null)));
    }

    /* access modifiers changed from: protected */
    public void zza(int i, IBinder iBinder, Bundle bundle, int i2) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(1, i2, -1, new zzn(this, i, iBinder, bundle)));
    }

    /* access modifiers changed from: protected */
    @CallSuper
    public void zza(@NonNull T t) {
        this.zzaGJ = System.currentTimeMillis();
    }

    @WorkerThread
    public final void zza(zzal zzal, Set<Scope> set) {
        Bundle zzmo = zzmo();
        zzx zzx = new zzx(this.zzaGX);
        zzx.zzaHw = this.mContext.getPackageName();
        zzx.zzaHz = zzmo;
        if (set != null) {
            zzx.zzaHy = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (zzmv()) {
            zzx.zzaHA = getAccount() != null ? getAccount() : new Account("<<default account>>", "com.google");
            if (zzal != null) {
                zzx.zzaHx = zzal.asBinder();
            }
        } else if (zzrg()) {
            zzx.zzaHA = getAccount();
        }
        zzx.zzaHB = zzrd();
        try {
            synchronized (this.zzaGO) {
                if (this.zzaGP != null) {
                    this.zzaGP.zza(new zzk(this, this.zzaHb.get()), zzx);
                }
            }
        } catch (DeadObjectException unused) {
            zzay(1);
        } catch (SecurityException e2) {
            throw e2;
        } catch (RemoteException | RuntimeException unused2) {
            zza(8, (IBinder) null, (Bundle) null, this.zzaHb.get());
        }
    }

    public void zza(@NonNull zzj zzj) {
        this.zzaGQ = (zzj) zzbo.zzb(zzj, (Object) "Connection progress callbacks cannot be null.");
        zza(2, (T) null);
    }

    /* access modifiers changed from: protected */
    public final void zza(@NonNull zzj zzj, int i, @Nullable PendingIntent pendingIntent) {
        this.zzaGQ = (zzj) zzbo.zzb(zzj, (Object) "Connection progress callbacks cannot be null.");
        this.mHandler.sendMessage(this.mHandler.obtainMessage(3, this.zzaHb.get(), i, pendingIntent));
    }

    public final void zzay(int i) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(6, this.zzaHb.get(), i));
    }

    /* access modifiers changed from: protected */
    @Nullable
    public abstract T zzd(IBinder iBinder);

    /* access modifiers changed from: protected */
    @NonNull
    public abstract String zzdb();

    /* access modifiers changed from: protected */
    @NonNull
    public abstract String zzdc();

    public boolean zzmG() {
        return false;
    }

    public Intent zzmH() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    /* access modifiers changed from: protected */
    public Bundle zzmo() {
        return new Bundle();
    }

    public boolean zzmv() {
        return false;
    }

    public Bundle zzoC() {
        return null;
    }

    public boolean zzpe() {
        return true;
    }

    /* access modifiers changed from: protected */
    public String zzqZ() {
        return "com.google.android.gms";
    }

    public final void zzrb() {
        int isGooglePlayServicesAvailable = this.zzaCF.isGooglePlayServicesAvailable(this.mContext);
        if (isGooglePlayServicesAvailable != 0) {
            zza(1, (T) null);
            zza((zzj) new zzm(this), isGooglePlayServicesAvailable, (PendingIntent) null);
            return;
        }
        zza((zzj) new zzm(this));
    }

    public zzc[] zzrd() {
        return new zzc[0];
    }

    /* access modifiers changed from: protected */
    public final void zzre() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public final T zzrf() throws DeadObjectException {
        T t;
        synchronized (this.mLock) {
            if (this.zzaGU != 5) {
                zzre();
                zzbo.zza(this.zzaGR != null, (Object) "Client is connected but service is null");
                t = this.zzaGR;
            } else {
                throw new DeadObjectException();
            }
        }
        return t;
    }

    public boolean zzrg() {
        return false;
    }

    /* access modifiers changed from: protected */
    public Set<Scope> zzrh() {
        return Collections.EMPTY_SET;
    }
}
