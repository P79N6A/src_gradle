package com.google.android.gms.internal;

import android.os.Looper;
import android.support.annotation.NonNull;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.zzao;
import com.google.android.gms.common.internal.zzbo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public abstract class zzbbd<R extends Result> extends PendingResult<R> {
    static final ThreadLocal<Boolean> zzaBV = new zzbbe();
    private Status mStatus;
    private boolean zzJ;
    private final Object zzaBW;
    private zzbbf<R> zzaBX;
    private WeakReference<GoogleApiClient> zzaBY;
    private final ArrayList<PendingResult.zza> zzaBZ;
    /* access modifiers changed from: private */
    public R zzaBj;
    private ResultCallback<? super R> zzaCa;
    private final AtomicReference<zzbew> zzaCb;
    private zzbbg zzaCc;
    private volatile boolean zzaCd;
    private boolean zzaCe;
    private zzao zzaCf;
    private volatile zzber<R> zzaCg;
    private boolean zzaCh;
    private final CountDownLatch zztL;

    @Deprecated
    zzbbd() {
        this.zzaBW = new Object();
        this.zztL = new CountDownLatch(1);
        this.zzaBZ = new ArrayList<>();
        this.zzaCb = new AtomicReference<>();
        this.zzaCh = false;
        this.zzaBX = new zzbbf<>(Looper.getMainLooper());
        this.zzaBY = new WeakReference<>(null);
    }

    @Deprecated
    protected zzbbd(Looper looper) {
        this.zzaBW = new Object();
        this.zztL = new CountDownLatch(1);
        this.zzaBZ = new ArrayList<>();
        this.zzaCb = new AtomicReference<>();
        this.zzaCh = false;
        this.zzaBX = new zzbbf<>(looper);
        this.zzaBY = new WeakReference<>(null);
    }

    protected zzbbd(GoogleApiClient googleApiClient) {
        this.zzaBW = new Object();
        this.zztL = new CountDownLatch(1);
        this.zzaBZ = new ArrayList<>();
        this.zzaCb = new AtomicReference<>();
        this.zzaCh = false;
        this.zzaBX = new zzbbf<>(googleApiClient != null ? googleApiClient.getLooper() : Looper.getMainLooper());
        this.zzaBY = new WeakReference<>(googleApiClient);
    }

    private final R get() {
        R r;
        synchronized (this.zzaBW) {
            zzbo.zza(!this.zzaCd, (Object) "Result has already been consumed.");
            zzbo.zza(isReady(), (Object) "Result is not ready.");
            r = this.zzaBj;
            this.zzaBj = null;
            this.zzaCa = null;
            this.zzaCd = true;
        }
        zzbew andSet = this.zzaCb.getAndSet(null);
        if (andSet != null) {
            andSet.zzc(this);
        }
        return r;
    }

    private final void zzb(R r) {
        this.zzaBj = r;
        this.zzaCf = null;
        this.zztL.countDown();
        this.mStatus = this.zzaBj.getStatus();
        if (this.zzJ) {
            this.zzaCa = null;
        } else if (this.zzaCa != null) {
            this.zzaBX.removeMessages(2);
            this.zzaBX.zza(this.zzaCa, get());
        } else if (this.zzaBj instanceof Releasable) {
            this.zzaCc = new zzbbg(this, null);
        }
        ArrayList arrayList = this.zzaBZ;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((PendingResult.zza) obj).zzo(this.mStatus);
        }
        this.zzaBZ.clear();
    }

    public static void zzc(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (RuntimeException unused) {
            }
        }
    }

    public final R await() {
        boolean z = false;
        zzbo.zza(Looper.myLooper() != Looper.getMainLooper(), (Object) "await must not be called on the UI thread");
        zzbo.zza(!this.zzaCd, (Object) "Result has already been consumed");
        if (this.zzaCg == null) {
            z = true;
        }
        zzbo.zza(z, (Object) "Cannot await if then() has been called.");
        try {
            this.zztL.await();
        } catch (InterruptedException unused) {
            zzs(Status.zzaBn);
        }
        zzbo.zza(isReady(), (Object) "Result is not ready.");
        return get();
    }

    public final R await(long j, TimeUnit timeUnit) {
        boolean z = false;
        zzbo.zza(j <= 0 || Looper.myLooper() != Looper.getMainLooper(), (Object) "await must not be called on the UI thread when time is greater than zero.");
        zzbo.zza(!this.zzaCd, (Object) "Result has already been consumed.");
        if (this.zzaCg == null) {
            z = true;
        }
        zzbo.zza(z, (Object) "Cannot await if then() has been called.");
        try {
            if (!this.zztL.await(j, timeUnit)) {
                zzs(Status.zzaBp);
            }
        } catch (InterruptedException unused) {
            zzs(Status.zzaBn);
        }
        zzbo.zza(isReady(), (Object) "Result is not ready.");
        return get();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|(2:10|11)|12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0015 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void cancel() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.zzaBW
            monitor-enter(r0)
            boolean r1 = r2.zzJ     // Catch:{ all -> 0x002a }
            if (r1 != 0) goto L_0x0028
            boolean r1 = r2.zzaCd     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x000c
            goto L_0x0028
        L_0x000c:
            com.google.android.gms.common.internal.zzao r1 = r2.zzaCf     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0015
            com.google.android.gms.common.internal.zzao r1 = r2.zzaCf     // Catch:{ RemoteException -> 0x0015 }
            r1.cancel()     // Catch:{ RemoteException -> 0x0015 }
        L_0x0015:
            R r1 = r2.zzaBj     // Catch:{ all -> 0x002a }
            zzc(r1)     // Catch:{ all -> 0x002a }
            r1 = 1
            r2.zzJ = r1     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.zzaBq     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.Result r1 = r2.zzb((com.google.android.gms.common.api.Status) r1)     // Catch:{ all -> 0x002a }
            r2.zzb((R) r1)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzbbd.cancel():void");
    }

    public boolean isCanceled() {
        boolean z;
        synchronized (this.zzaBW) {
            z = this.zzJ;
        }
        return z;
    }

    public final boolean isReady() {
        return this.zztL.getCount() == 0;
    }

    public final void setResult(R r) {
        synchronized (this.zzaBW) {
            if (this.zzaCe || this.zzJ) {
                zzc(r);
                return;
            }
            isReady();
            zzbo.zza(!isReady(), (Object) "Results have already been set");
            zzbo.zza(!this.zzaCd, (Object) "Result has already been consumed");
            zzb(r);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setResultCallback(com.google.android.gms.common.api.ResultCallback<? super R> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.zzaBW
            monitor-enter(r0)
            if (r5 != 0) goto L_0x000c
            r5 = 0
            r4.zzaCa = r5     // Catch:{ all -> 0x000a }
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x000a:
            r5 = move-exception
            goto L_0x003c
        L_0x000c:
            boolean r1 = r4.zzaCd     // Catch:{ all -> 0x000a }
            r2 = 1
            r1 = r1 ^ r2
            java.lang.String r3 = "Result has already been consumed."
            com.google.android.gms.common.internal.zzbo.zza((boolean) r1, (java.lang.Object) r3)     // Catch:{ all -> 0x000a }
            com.google.android.gms.internal.zzber<R> r1 = r4.zzaCg     // Catch:{ all -> 0x000a }
            if (r1 != 0) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            com.google.android.gms.common.internal.zzbo.zza((boolean) r2, (java.lang.Object) r1)     // Catch:{ all -> 0x000a }
            boolean r1 = r4.isCanceled()     // Catch:{ all -> 0x000a }
            if (r1 == 0) goto L_0x0028
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x0028:
            boolean r1 = r4.isReady()     // Catch:{ all -> 0x000a }
            if (r1 == 0) goto L_0x0038
            com.google.android.gms.internal.zzbbf<R> r1 = r4.zzaBX     // Catch:{ all -> 0x000a }
            com.google.android.gms.common.api.Result r2 = r4.get()     // Catch:{ all -> 0x000a }
            r1.zza(r5, r2)     // Catch:{ all -> 0x000a }
            goto L_0x003a
        L_0x0038:
            r4.zzaCa = r5     // Catch:{ all -> 0x000a }
        L_0x003a:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x003c:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzbbd.setResultCallback(com.google.android.gms.common.api.ResultCallback):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setResultCallback(com.google.android.gms.common.api.ResultCallback<? super R> r5, long r6, java.util.concurrent.TimeUnit r8) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.zzaBW
            monitor-enter(r0)
            if (r5 != 0) goto L_0x000c
            r5 = 0
            r4.zzaCa = r5     // Catch:{ all -> 0x000a }
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x000a:
            r5 = move-exception
            goto L_0x004a
        L_0x000c:
            boolean r1 = r4.zzaCd     // Catch:{ all -> 0x000a }
            r2 = 1
            r1 = r1 ^ r2
            java.lang.String r3 = "Result has already been consumed."
            com.google.android.gms.common.internal.zzbo.zza((boolean) r1, (java.lang.Object) r3)     // Catch:{ all -> 0x000a }
            com.google.android.gms.internal.zzber<R> r1 = r4.zzaCg     // Catch:{ all -> 0x000a }
            if (r1 != 0) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            com.google.android.gms.common.internal.zzbo.zza((boolean) r2, (java.lang.Object) r1)     // Catch:{ all -> 0x000a }
            boolean r1 = r4.isCanceled()     // Catch:{ all -> 0x000a }
            if (r1 == 0) goto L_0x0028
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x0028:
            boolean r1 = r4.isReady()     // Catch:{ all -> 0x000a }
            if (r1 == 0) goto L_0x0038
            com.google.android.gms.internal.zzbbf<R> r6 = r4.zzaBX     // Catch:{ all -> 0x000a }
            com.google.android.gms.common.api.Result r7 = r4.get()     // Catch:{ all -> 0x000a }
            r6.zza(r5, r7)     // Catch:{ all -> 0x000a }
            goto L_0x0048
        L_0x0038:
            r4.zzaCa = r5     // Catch:{ all -> 0x000a }
            com.google.android.gms.internal.zzbbf<R> r5 = r4.zzaBX     // Catch:{ all -> 0x000a }
            long r6 = r8.toMillis(r6)     // Catch:{ all -> 0x000a }
            r8 = 2
            android.os.Message r8 = r5.obtainMessage(r8, r4)     // Catch:{ all -> 0x000a }
            r5.sendMessageDelayed(r8, r6)     // Catch:{ all -> 0x000a }
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x004a:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzbbd.setResultCallback(com.google.android.gms.common.api.ResultCallback, long, java.util.concurrent.TimeUnit):void");
    }

    public <S extends Result> TransformedResult<S> then(ResultTransform<? super R, ? extends S> resultTransform) {
        TransformedResult<S> then;
        zzbo.zza(!this.zzaCd, (Object) "Result has already been consumed.");
        synchronized (this.zzaBW) {
            boolean z = false;
            zzbo.zza(this.zzaCg == null, (Object) "Cannot call then() twice.");
            if (this.zzaCa == null) {
                z = true;
            }
            zzbo.zza(z, (Object) "Cannot call then() if callbacks are set.");
            zzbo.zza(!this.zzJ, (Object) "Cannot call then() if result was canceled.");
            this.zzaCh = true;
            this.zzaCg = new zzber<>(this.zzaBY);
            then = this.zzaCg.then(resultTransform);
            if (isReady()) {
                this.zzaBX.zza(this.zzaCg, get());
            } else {
                this.zzaCa = this.zzaCg;
            }
        }
        return then;
    }

    public final void zza(PendingResult.zza zza) {
        zzbo.zzb(zza != null, (Object) "Callback cannot be null.");
        synchronized (this.zzaBW) {
            if (isReady()) {
                zza.zzo(this.mStatus);
            } else {
                this.zzaBZ.add(zza);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zza(zzao zzao) {
        synchronized (this.zzaBW) {
            this.zzaCf = zzao;
        }
    }

    public final void zza(zzbew zzbew) {
        this.zzaCb.set(zzbew);
    }

    /* access modifiers changed from: protected */
    @NonNull
    public abstract R zzb(Status status);

    public final boolean zzpB() {
        boolean isCanceled;
        synchronized (this.zzaBW) {
            if (((GoogleApiClient) this.zzaBY.get()) == null || !this.zzaCh) {
                cancel();
            }
            isCanceled = isCanceled();
        }
        return isCanceled;
    }

    public final void zzpC() {
        this.zzaCh = this.zzaCh || zzaBV.get().booleanValue();
    }

    public final Integer zzpo() {
        return null;
    }

    public final void zzs(Status status) {
        synchronized (this.zzaBW) {
            if (!isReady()) {
                setResult(zzb(status));
                this.zzaCe = true;
            }
        }
    }
}
