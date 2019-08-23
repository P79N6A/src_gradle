package com.google.android.gms.common.internal;

import android.os.Looper;

public final class zzc {
    public static void zzae(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void zzcz(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(str);
        }
    }

    public static void zzr(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("null reference");
        }
    }
}
