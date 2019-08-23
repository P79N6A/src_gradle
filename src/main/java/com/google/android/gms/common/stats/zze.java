package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.zzk;
import java.util.List;

public final class zze {
    private static zze zzaJA = new zze();
    private static Boolean zzaJB;

    public static void zza(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list) {
        zza(context, str, 8, str2, str3, str4, i2, list, 0);
    }

    public static void zza(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list, long j) {
        int i3 = i;
        List<String> list2 = list;
        if (zzaJB == null) {
            zzaJB = Boolean.FALSE;
        }
        if (zzaJB.booleanValue()) {
            if (TextUtils.isEmpty(str)) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    "missing wakeLock key. ".concat(valueOf);
                } else {
                    new String("missing wakeLock key. ");
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (7 == i3 || 8 == i3 || 10 == i3 || 11 == i3) {
                    if (list2 != null && list.size() == 1 && "com.google.android.gms".equals(list2.get(0))) {
                        list2 = null;
                    }
                    List<String> list3 = list2;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int zzaK = zzk.zzaK(context);
                    String packageName = context.getPackageName();
                    WakeLockEvent wakeLockEvent = r1;
                    WakeLockEvent wakeLockEvent2 = new WakeLockEvent(currentTimeMillis, i, str2, i2, list3, str, elapsedRealtime, zzaK, str3, "com.google.android.gms".equals(packageName) ? null : packageName, zzk.zzaL(context), j, str4);
                    try {
                        context.startService(new Intent().setComponent(zzb.zzaJf).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", wakeLockEvent));
                    } catch (Exception e2) {
                        Log.wtf("WakeLockTracker", e2);
                    }
                }
            }
        }
    }

    public static zze zzrX() {
        return zzaJA;
    }
}
