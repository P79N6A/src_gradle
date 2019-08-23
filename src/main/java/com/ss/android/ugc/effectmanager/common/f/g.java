package com.ss.android.ugc.effectmanager.common.f;

public final class g {
    public static long a(String str, long j) {
        long j2 = -1;
        if (str == null || str.isEmpty()) {
            return -1;
        }
        try {
            j2 = Long.valueOf(str).longValue();
        } catch (NumberFormatException unused) {
        }
        return j2;
    }
}
