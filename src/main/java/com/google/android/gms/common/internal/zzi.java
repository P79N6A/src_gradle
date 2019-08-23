package com.google.android.gms.common.internal;

public abstract class zzi<TListener> {
    private TListener mListener;
    private /* synthetic */ zzd zzaHe;
    private boolean zzaHf;

    public zzi(zzd zzd, TListener tlistener) {
        this.zzaHe = zzd;
        this.mListener = tlistener;
    }

    public final void removeListener() {
        synchronized (this) {
            this.mListener = null;
        }
    }

    public final void unregister() {
        removeListener();
        synchronized (this.zzaHe.zzaGS) {
            this.zzaHe.zzaGS.remove(this);
        }
    }

    public final void zzrk() {
        TListener tlistener;
        synchronized (this) {
            tlistener = this.mListener;
        }
        if (tlistener != null) {
            try {
                zzs(tlistener);
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
        synchronized (this) {
            this.zzaHf = true;
        }
        unregister();
    }

    /* access modifiers changed from: protected */
    public abstract void zzs(TListener tlistener);
}
