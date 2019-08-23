package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import com.google.android.gms.internal.zzcaf;

public final class zzb extends zza<Boolean> {
    public static Boolean zza(SharedPreferences sharedPreferences, String str, Boolean bool) {
        try {
            return (Boolean) zzcaf.zzb(new zzc(sharedPreferences, str, bool));
        } catch (Exception e2) {
            String valueOf = String.valueOf(e2.getMessage());
            if (valueOf.length() != 0) {
                "Flag value not available, returning default: ".concat(valueOf);
            } else {
                new String("Flag value not available, returning default: ");
            }
            return bool;
        }
    }
}
