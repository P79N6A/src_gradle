package com.google.android.gms.common;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzay;
import com.google.android.gms.common.internal.zzaz;
import com.google.android.gms.common.internal.zzbo;
import com.google.android.gms.dynamic.zzn;
import com.google.android.gms.dynamite.DynamiteModule;

public final class zzf {
    private static zzay zzaAd;
    private static final Object zzaAe = new Object();
    private static Context zzaAf;

    static boolean zza(String str, zzg zzg) {
        return zza(str, zzg, false);
    }

    private static boolean zza(String str, zzg zzg, boolean z) {
        if (!zzoX()) {
            return false;
        }
        zzbo.zzu(zzaAf);
        try {
            return zzaAd.zza(new zzm(str, zzg, z), zzn.zzw(zzaAf.getPackageManager()));
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void zzav(android.content.Context r2) {
        /*
            java.lang.Class<com.google.android.gms.common.zzf> r0 = com.google.android.gms.common.zzf.class
            monitor-enter(r0)
            android.content.Context r1 = zzaAf     // Catch:{ all -> 0x0013 }
            if (r1 != 0) goto L_0x0011
            if (r2 == 0) goto L_0x0011
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0013 }
            zzaAf = r2     // Catch:{ all -> 0x0013 }
            monitor-exit(r0)
            return
        L_0x0011:
            monitor-exit(r0)
            return
        L_0x0013:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.zzf.zzav(android.content.Context):void");
    }

    static boolean zzb(String str, zzg zzg) {
        return zza(str, zzg, true);
    }

    private static boolean zzoX() {
        if (zzaAd != null) {
            return true;
        }
        zzbo.zzu(zzaAf);
        synchronized (zzaAe) {
            if (zzaAd == null) {
                try {
                    zzaAd = zzaz.zzJ(DynamiteModule.zza(zzaAf, DynamiteModule.zzaSP, "com.google.android.gms.googlecertificates").zzcV("com.google.android.gms.common.GoogleCertificatesImpl"));
                } catch (DynamiteModule.zzc unused) {
                    return false;
                }
            }
        }
        return true;
    }
}
