package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.common.api.Api;

public final class zzctk implements Api.ApiOptions.Optional {
    public static final zzctk zzbCM;
    private final boolean zzalh;
    private final String zzali;
    private final boolean zzama;
    private final String zzamb;
    private final boolean zzbCN;
    private final boolean zzbCO;
    private final Long zzbCP;
    private final Long zzbCQ;

    static {
        new zzctl();
        zzctk zzctk = new zzctk(false, false, null, false, null, false, null, null);
        zzbCM = zzctk;
    }

    private zzctk(boolean z, boolean z2, String str, boolean z3, String str2, boolean z4, Long l, Long l2) {
    }

    public final String getServerClientId() {
        return this.zzali;
    }

    public final boolean isIdTokenRequested() {
        return this.zzalh;
    }

    public final boolean zzAr() {
        return this.zzbCN;
    }

    public final boolean zzAs() {
        return this.zzama;
    }

    @Nullable
    public final String zzAt() {
        return this.zzamb;
    }

    public final boolean zzAu() {
        return this.zzbCO;
    }

    @Nullable
    public final Long zzAv() {
        return this.zzbCP;
    }

    @Nullable
    public final Long zzAw() {
        return this.zzbCQ;
    }
}
