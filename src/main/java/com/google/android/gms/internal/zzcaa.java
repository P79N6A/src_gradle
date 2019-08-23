package com.google.android.gms.internal;

public final class zzcaa {
    private zzcab zzaXG;
    private boolean zzuJ;

    /* JADX WARNING: Can't wrap try/catch for region: R(5:6|7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0027 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void initialize(android.content.Context r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zzuJ     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            return
        L_0x0007:
            com.google.android.gms.dynamite.DynamiteModule$zzd r0 = com.google.android.gms.dynamite.DynamiteModule.zzaSP     // Catch:{ RemoteException | zzc -> 0x0027 }
            java.lang.String r1 = "com.google.android.gms.flags"
            com.google.android.gms.dynamite.DynamiteModule r0 = com.google.android.gms.dynamite.DynamiteModule.zza((android.content.Context) r3, (com.google.android.gms.dynamite.DynamiteModule.zzd) r0, (java.lang.String) r1)     // Catch:{ RemoteException | zzc -> 0x0027 }
            java.lang.String r1 = "com.google.android.gms.flags.impl.FlagProviderImpl"
            android.os.IBinder r0 = r0.zzcV(r1)     // Catch:{ RemoteException | zzc -> 0x0027 }
            com.google.android.gms.internal.zzcab r0 = com.google.android.gms.internal.zzcac.asInterface(r0)     // Catch:{ RemoteException | zzc -> 0x0027 }
            r2.zzaXG = r0     // Catch:{ RemoteException | zzc -> 0x0027 }
            com.google.android.gms.internal.zzcab r0 = r2.zzaXG     // Catch:{ RemoteException | zzc -> 0x0027 }
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.zzn.zzw(r3)     // Catch:{ RemoteException | zzc -> 0x0027 }
            r0.init(r3)     // Catch:{ RemoteException | zzc -> 0x0027 }
            r3 = 1
            r2.zzuJ = r3     // Catch:{ RemoteException | zzc -> 0x0027 }
        L_0x0027:
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            return
        L_0x0029:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzcaa.initialize(android.content.Context):void");
    }

    public final <T> T zzb(zzbzt<T> zzbzt) {
        synchronized (this) {
            if (this.zzuJ) {
                return zzbzt.zza(this.zzaXG);
            }
            T zzdI = zzbzt.zzdI();
            return zzdI;
        }
    }
}
