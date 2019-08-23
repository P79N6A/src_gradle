package com.google.android.gms.common.util;

import android.content.Context;
import android.os.DropBoxManager;
import com.google.android.gms.common.internal.zzbo;

public final class zzg {
    private static final String[] zzaJD = {"android.", "com.android.", "dalvik.", "java.", "javax."};
    private static DropBoxManager zzaJE;
    private static boolean zzaJF;
    private static int zzaJG = -1;
    private static int zzaJH;

    public static boolean zza(Context context, Throwable th) {
        return zza(context, th, 0);
    }

    private static boolean zza(Context context, Throwable th, int i) {
        try {
            zzbo.zzu(context);
            zzbo.zzu(th);
        } catch (Exception unused) {
        }
        return false;
    }
}
