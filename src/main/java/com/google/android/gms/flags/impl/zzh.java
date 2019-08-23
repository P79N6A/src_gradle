package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import com.google.android.gms.internal.zzcaf;

public final class zzh extends zza<String> {
    public static String zza(SharedPreferences sharedPreferences, String str, String str2) {
        try {
            return (String) zzcaf.zzb(new zzi(sharedPreferences, str, str2));
        } catch (Exception e2) {
            String valueOf = String.valueOf(e2.getMessage());
            if (valueOf.length() != 0) {
                "Flag value not available, returning default: ".concat(valueOf);
            } else {
                new String("Flag value not available, returning default: ");
            }
            return str2;
        }
    }
}