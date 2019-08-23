package com.google.android.gms.internal;

import com.google.android.gms.internal.ada;
import java.io.IOException;
import java.util.List;

public final class adb<M extends ada<M>, T> {
    public final int tag;
    private int type = 11;
    protected final Class<T> zzcjC;
    protected final boolean zzcsa;

    private adb(int i, Class<T> cls, int i2, boolean z) {
        this.zzcjC = cls;
        this.tag = i2;
    }

    public static <M extends ada<M>, T extends adg> adb<M, T> zza(int i, Class<T> cls, long j) {
        return new adb<>(11, cls, (int) j, false);
    }

    private final Object zzb(acx acx) {
        Class<T> cls = this.zzcjC;
        try {
            switch (this.type) {
                case 10:
                    adg adg = (adg) cls.newInstance();
                    acx.zza(adg, this.tag >>> 3);
                    return adg;
                case 11:
                    adg adg2 = (adg) cls.newInstance();
                    acx.zza(adg2);
                    return adg2;
                default:
                    int i = this.type;
                    StringBuilder sb = new StringBuilder(24);
                    sb.append("Unknown type ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
            }
        } catch (InstantiationException e2) {
            String valueOf = String.valueOf(cls);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb2.append("Error creating instance of class ");
            sb2.append(valueOf);
            throw new IllegalArgumentException(sb2.toString(), e2);
        } catch (IllegalAccessException e3) {
            String valueOf2 = String.valueOf(cls);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
            sb3.append("Error creating instance of class ");
            sb3.append(valueOf2);
            throw new IllegalArgumentException(sb3.toString(), e3);
        } catch (IOException e4) {
            throw new IllegalArgumentException("Error reading extension field", e4);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adb)) {
            return false;
        }
        adb adb = (adb) obj;
        return this.type == adb.type && this.zzcjC == adb.zzcjC && this.tag == adb.tag;
    }

    public final int hashCode() {
        return (((((this.type + 1147) * 31) + this.zzcjC.hashCode()) * 31) + this.tag) * 31;
    }

    /* access modifiers changed from: package-private */
    public final T zzX(List<adi> list) {
        if (list != null && !list.isEmpty()) {
            return this.zzcjC.cast(zzb(acx.zzH(list.get(list.size() - 1).zzbws)));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final void zza(Object obj, acy acy) {
        try {
            acy.zzcu(this.tag);
            switch (this.type) {
                case 10:
                    ((adg) obj).zza(acy);
                    acy.zzt(this.tag >>> 3, 4);
                    return;
                case 11:
                    acy.zzb((adg) obj);
                    return;
                default:
                    int i = this.type;
                    StringBuilder sb = new StringBuilder(24);
                    sb.append("Unknown type ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
            }
        } catch (IOException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* access modifiers changed from: protected */
    public final int zzav(Object obj) {
        int i = this.tag >>> 3;
        switch (this.type) {
            case 10:
                return (acy.zzct(i) << 1) + ((adg) obj).zzLT();
            case 11:
                return acy.zzb(i, (adg) obj);
            default:
                int i2 = this.type;
                StringBuilder sb = new StringBuilder(24);
                sb.append("Unknown type ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
        }
    }
}
