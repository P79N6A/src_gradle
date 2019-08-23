package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.zzbo;
import com.google.android.gms.internal.zzbgz;

public class zzp {
    private static zzp zzaAu;
    private final Context mContext;

    private zzp(Context context) {
        this.mContext = context.getApplicationContext();
    }

    static zzg zza(PackageInfo packageInfo, zzg... zzgArr) {
        if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
            return null;
        }
        zzh zzh = new zzh(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < zzgArr.length; i++) {
            if (zzgArr[i].equals(zzh)) {
                return zzgArr[i];
            }
        }
        return null;
    }

    private static boolean zza(PackageInfo packageInfo, boolean z) {
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (zza(packageInfo, z ? zzj.zzaAk : new zzg[]{zzj.zzaAk[0]}) != null) {
                return true;
            }
        }
        return false;
    }

    public static zzp zzax(Context context) {
        zzbo.zzu(context);
        synchronized (zzp.class) {
            if (zzaAu == null) {
                zzf.zzav(context);
                zzaAu = new zzp(context);
            }
        }
        return zzaAu;
    }

    private static boolean zzb(PackageInfo packageInfo, boolean z) {
        if (packageInfo.signatures.length != 1) {
            return false;
        }
        zzh zzh = new zzh(packageInfo.signatures[0].toByteArray());
        String str = packageInfo.packageName;
        return z ? zzf.zzb(str, zzh) : zzf.zza(str, zzh);
    }

    private final boolean zzct(String str) {
        try {
            PackageInfo packageInfo = zzbgz.zzaP(this.mContext).getPackageInfo(str, 64);
            if (packageInfo == null) {
                return false;
            }
            if (zzo.zzaw(this.mContext)) {
                return zzb(packageInfo, true);
            }
            boolean zzb = zzb(packageInfo, false);
            if (!zzb) {
                zzb(packageInfo, true);
            }
            return zzb;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Deprecated
    public final boolean zza(PackageManager packageManager, int i) {
        String[] packagesForUid = zzbgz.zzaP(this.mContext).getPackagesForUid(i);
        if (!(packagesForUid == null || packagesForUid.length == 0)) {
            for (String zzct : packagesForUid) {
                if (zzct(zzct)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Deprecated
    public final boolean zza(PackageManager packageManager, PackageInfo packageInfo) {
        if (packageInfo != null) {
            if (zza(packageInfo, false)) {
                return true;
            }
            return zza(packageInfo, true) && zzo.zzaw(this.mContext);
        }
    }
}
