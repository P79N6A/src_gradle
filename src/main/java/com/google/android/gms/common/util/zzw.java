package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.zzp;
import com.google.android.gms.internal.zzbgz;

public final class zzw {
    @TargetApi(19)
    public static boolean zzb(Context context, int i, String str) {
        return zzbgz.zzaP(context).zzf(i, str);
    }

    public static boolean zzf(Context context, int i) {
        if (!zzb(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            return zzp.zzax(context).zza(context.getPackageManager(), context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
