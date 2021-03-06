package com.google.android.gms.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzbo;

public final class zzbba {
    private final int zzaBP;
    private final ConnectionResult zzaBQ;

    zzbba(ConnectionResult connectionResult, int i) {
        zzbo.zzu(connectionResult);
        this.zzaBQ = connectionResult;
        this.zzaBP = i;
    }

    /* access modifiers changed from: package-private */
    public final int zzpy() {
        return this.zzaBP;
    }

    /* access modifiers changed from: package-private */
    public final ConnectionResult zzpz() {
        return this.zzaBQ;
    }
}
