package com.google.android.gms.internal;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzbo;
import com.google.android.gms.common.util.zza;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzbda implements Handler.Callback {
    public static final Status zzaEc = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */
    public static final Status zzaEd = new Status(4, "The user must be signed in to make this API call.");
    private static zzbda zzaEf;
    /* access modifiers changed from: private */
    public static final Object zzuH = new Object();
    /* access modifiers changed from: private */
    public final Context mContext;
    /* access modifiers changed from: private */
    public final Handler mHandler;
    /* access modifiers changed from: private */
    public final GoogleApiAvailability zzaBd;
    /* access modifiers changed from: private */
    public final Map<zzbas<?>, zzbdc<?>> zzaCB = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */
    public long zzaDB = 120000;
    /* access modifiers changed from: private */
    public long zzaDC = 5000;
    /* access modifiers changed from: private */
    public long zzaEe = 10000;
    /* access modifiers changed from: private */
    public int zzaEg = -1;
    private final AtomicInteger zzaEh = new AtomicInteger(1);
    private final AtomicInteger zzaEi = new AtomicInteger(0);
    /* access modifiers changed from: private */
    public zzbbv zzaEj = null;
    /* access modifiers changed from: private */
    public final Set<zzbas<?>> zzaEk = new zza();
    private final Set<zzbas<?>> zzaEl = new zza();

    private zzbda(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.mContext = context;
        this.mHandler = new Handler(looper, this);
        this.zzaBd = googleApiAvailability;
        this.mHandler.sendMessage(this.mHandler.obtainMessage(6));
    }

    public static zzbda zzay(Context context) {
        zzbda zzbda;
        synchronized (zzuH) {
            if (zzaEf == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                zzaEf = new zzbda(context.getApplicationContext(), handlerThread.getLooper(), GoogleApiAvailability.getInstance());
            }
            zzbda = zzaEf;
        }
        return zzbda;
    }

    @WorkerThread
    private final void zzc(GoogleApi<?> googleApi) {
        zzbas zzph = googleApi.zzph();
        zzbdc zzbdc = this.zzaCB.get(zzph);
        if (zzbdc == null) {
            zzbdc = new zzbdc(this, googleApi);
            this.zzaCB.put(zzph, zzbdc);
        }
        if (zzbdc.zzmv()) {
            this.zzaEl.add(zzph);
        }
        zzbdc.connect();
    }

    public static zzbda zzqk() {
        zzbda zzbda;
        synchronized (zzuH) {
            zzbo.zzb(zzaEf, (Object) "Must guarantee manager is non-null before using getInstance");
            zzbda = zzaEf;
        }
        return zzbda;
    }

    public static void zzql() {
        synchronized (zzuH) {
            if (zzaEf != null) {
                zzbda zzbda = zzaEf;
                zzbda.zzaEi.incrementAndGet();
                zzbda.mHandler.sendMessageAtFrontOfQueue(zzbda.mHandler.obtainMessage(10));
            }
        }
    }

    @WorkerThread
    private final void zzqn() {
        for (zzbas<?> remove : this.zzaEl) {
            this.zzaCB.remove(remove).signOut();
        }
        this.zzaEl.clear();
    }

    @WorkerThread
    public final boolean handleMessage(Message message) {
        ConnectionResult zzqu;
        long j = 300000;
        switch (message.what) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.zzaEe = j;
                this.mHandler.removeMessages(12);
                for (zzbas<?> obtainMessage : this.zzaCB.keySet()) {
                    this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(12, obtainMessage), this.zzaEe);
                }
                break;
            case 2:
                zzbau zzbau = (zzbau) message.obj;
                Iterator it2 = zzbau.zzpt().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else {
                        zzbas zzbas = (zzbas) it2.next();
                        zzbdc zzbdc = this.zzaCB.get(zzbas);
                        if (zzbdc == null) {
                            zzbau.zza(zzbas, new ConnectionResult(13));
                            break;
                        } else {
                            if (zzbdc.isConnected()) {
                                zzqu = ConnectionResult.zzazX;
                            } else if (zzbdc.zzqu() != null) {
                                zzqu = zzbdc.zzqu();
                            } else {
                                zzbdc.zza(zzbau);
                            }
                            zzbau.zza(zzbas, zzqu);
                        }
                    }
                }
            case 3:
                for (zzbdc next : this.zzaCB.values()) {
                    next.zzqt();
                    next.connect();
                }
                break;
            case 4:
            case 8:
            case 13:
                zzbec zzbec = (zzbec) message.obj;
                zzbdc zzbdc2 = this.zzaCB.get(zzbec.zzaET.zzph());
                if (zzbdc2 == null) {
                    zzc(zzbec.zzaET);
                    zzbdc2 = this.zzaCB.get(zzbec.zzaET.zzph());
                }
                if (zzbdc2.zzmv() && this.zzaEi.get() != zzbec.zzaES) {
                    zzbec.zzaER.zzp(zzaEc);
                    zzbdc2.signOut();
                    break;
                } else {
                    zzbdc2.zza(zzbec.zzaER);
                    break;
                }
                break;
            case 5:
                int i = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                zzbdc zzbdc3 = null;
                Iterator<zzbdc<?>> it3 = this.zzaCB.values().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        zzbdc next2 = it3.next();
                        if (next2.getInstanceId() == i) {
                            zzbdc3 = next2;
                        }
                    }
                }
                if (zzbdc3 == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                    break;
                } else {
                    String valueOf = String.valueOf(this.zzaBd.getErrorString(connectionResult.getErrorCode()));
                    String valueOf2 = String.valueOf(connectionResult.getErrorMessage());
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 69 + String.valueOf(valueOf2).length());
                    sb2.append("Error resolution was canceled by the user, original error message: ");
                    sb2.append(valueOf);
                    sb2.append(": ");
                    sb2.append(valueOf2);
                    zzbdc3.zzt(new Status(17, sb2.toString()));
                    break;
                }
            case 6:
                if (this.mContext.getApplicationContext() instanceof Application) {
                    zzbav.zza((Application) this.mContext.getApplicationContext());
                    zzbav.zzpv().zza((zzbaw) new zzbdb(this));
                    if (!zzbav.zzpv().zzab(true)) {
                        this.zzaEe = 300000;
                        break;
                    }
                }
                break;
            case e.l /*?: ONE_ARG  (7 int)*/:
                zzc((GoogleApi) message.obj);
                break;
            case 9:
                if (this.zzaCB.containsKey(message.obj)) {
                    this.zzaCB.get(message.obj).resume();
                    break;
                }
                break;
            case 10:
                zzqn();
                break;
            case 11:
                if (this.zzaCB.containsKey(message.obj)) {
                    this.zzaCB.get(message.obj).zzqd();
                    break;
                }
                break;
            case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                if (this.zzaCB.containsKey(message.obj)) {
                    this.zzaCB.get(message.obj).zzqx();
                    break;
                }
                break;
            default:
                return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final PendingIntent zza(zzbas<?> zzbas, int i) {
        zzbdc zzbdc = this.zzaCB.get(zzbas);
        if (zzbdc == null) {
            return null;
        }
        zzctj zzqy = zzbdc.zzqy();
        if (zzqy == null) {
            return null;
        }
        return PendingIntent.getActivity(this.mContext, i, zzqy.zzmH(), 134217728);
    }

    public final <O extends Api.ApiOptions> Task<Void> zza(@NonNull GoogleApi<O> googleApi, @NonNull zzbdx<?> zzbdx) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.mHandler.sendMessage(this.mHandler.obtainMessage(13, new zzbec(new zzbaq(zzbdx, taskCompletionSource), this.zzaEi.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    public final <O extends Api.ApiOptions> Task<Void> zza(@NonNull GoogleApi<O> googleApi, @NonNull zzbed<Api.zzb, ?> zzbed, @NonNull zzbex<Api.zzb, ?> zzbex) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.mHandler.sendMessage(this.mHandler.obtainMessage(8, new zzbec(new zzbao(new zzbee(zzbed, zzbex), taskCompletionSource), this.zzaEi.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        r3.mHandler.sendMessage(r3.mHandler.obtainMessage(2, r0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.tasks.Task<java.lang.Void> zza(java.lang.Iterable<? extends com.google.android.gms.common.api.GoogleApi<?>> r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.zzbau r0 = new com.google.android.gms.internal.zzbau
            r0.<init>(r4)
            java.util.Iterator r4 = r4.iterator()
        L_0x0009:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x003a
            java.lang.Object r1 = r4.next()
            com.google.android.gms.common.api.GoogleApi r1 = (com.google.android.gms.common.api.GoogleApi) r1
            java.util.Map<com.google.android.gms.internal.zzbas<?>, com.google.android.gms.internal.zzbdc<?>> r2 = r3.zzaCB
            com.google.android.gms.internal.zzbas r1 = r1.zzph()
            java.lang.Object r1 = r2.get(r1)
            com.google.android.gms.internal.zzbdc r1 = (com.google.android.gms.internal.zzbdc) r1
            if (r1 == 0) goto L_0x0029
            boolean r1 = r1.isConnected()
            if (r1 != 0) goto L_0x0009
        L_0x0029:
            android.os.Handler r4 = r3.mHandler
            android.os.Handler r1 = r3.mHandler
            r2 = 2
            android.os.Message r1 = r1.obtainMessage(r2, r0)
            r4.sendMessage(r1)
        L_0x0035:
            com.google.android.gms.tasks.Task r4 = r0.getTask()
            return r4
        L_0x003a:
            r0.zzpu()
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzbda.zza(java.lang.Iterable):com.google.android.gms.tasks.Task");
    }

    public final void zza(ConnectionResult connectionResult, int i) {
        if (!zzc(connectionResult, i)) {
            this.mHandler.sendMessage(this.mHandler.obtainMessage(5, i, 0, connectionResult));
        }
    }

    public final <O extends Api.ApiOptions> void zza(GoogleApi<O> googleApi, int i, zzbax<? extends Result, Api.zzb> zzbax) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(4, new zzbec(new zzban(i, zzbax), this.zzaEi.get(), googleApi)));
    }

    public final <O extends Api.ApiOptions, TResult> void zza(GoogleApi<O> googleApi, int i, zzbep<Api.zzb, TResult> zzbep, TaskCompletionSource<TResult> taskCompletionSource, zzbel zzbel) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(4, new zzbec(new zzbap(i, zzbep, taskCompletionSource, zzbel), this.zzaEi.get(), googleApi)));
    }

    public final void zza(@NonNull zzbbv zzbbv) {
        synchronized (zzuH) {
            if (this.zzaEj != zzbbv) {
                this.zzaEj = zzbbv;
                this.zzaEk.clear();
                this.zzaEk.addAll(zzbbv.zzpR());
            }
        }
    }

    public final void zzb(GoogleApi<?> googleApi) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(7, googleApi));
    }

    /* access modifiers changed from: package-private */
    public final void zzb(@NonNull zzbbv zzbbv) {
        synchronized (zzuH) {
            if (this.zzaEj == zzbbv) {
                this.zzaEj = null;
                this.zzaEk.clear();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zzc(ConnectionResult connectionResult, int i) {
        return this.zzaBd.zza(this.mContext, connectionResult, i);
    }

    /* access modifiers changed from: package-private */
    public final void zzpl() {
        this.zzaEi.incrementAndGet();
        this.mHandler.sendMessage(this.mHandler.obtainMessage(10));
    }

    public final void zzps() {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(3));
    }

    public final int zzqm() {
        return this.zzaEh.getAndIncrement();
    }
}
