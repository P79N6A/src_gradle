package com.google.android.gms.common.internal;

import android.util.Log;

public final class zzaj {
    private static int zzaHZ = 15;
    private static final String zzaIa = null;
    private final String zzaIb;
    private final String zzaIc;

    public zzaj(String str) {
        this(str, null);
    }

    private zzaj(String str, String str2) {
        zzbo.zzb(str, (Object) "log tag cannot be null");
        zzbo.zzb(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.zzaIb = str;
        this.zzaIc = null;
    }

    private final boolean zzaB(int i) {
        return Log.isLoggable(this.zzaIb, i);
    }

    private final String zzcE(String str) {
        return this.zzaIc == null ? str : this.zzaIc.concat(str);
    }

    public final void zzb(String str, String str2, Throwable th) {
        zzaB(4);
    }

    public final void zzc(String str, String str2, Throwable th) {
        zzaB(5);
    }

    public final void zzd(String str, String str2, Throwable th) {
        zzaB(6);
    }

    public final void zze(String str, String str2, Throwable th) {
        if (zzaB(7)) {
            Log.wtf(str, zzcE(str2), th);
        }
    }

    public final void zzx(String str, String str2) {
        zzaB(3);
    }

    public final void zzy(String str, String str2) {
        zzaB(5);
    }

    public final void zzz(String str, String str2) {
        zzaB(6);
    }
}
