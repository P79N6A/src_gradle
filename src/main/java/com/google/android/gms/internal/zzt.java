package com.google.android.gms.internal;

public final class zzt<T> {
    public final T result;
    public final zzc zzae;
    public final zzaa zzaf;
    public boolean zzag;

    private zzt(zzaa zzaa) {
        this.zzaf = zzaa;
    }

    private zzt(T t, zzc zzc) {
        this.result = t;
        this.zzae = zzc;
    }

    public static <T> zzt<T> zza(T t, zzc zzc) {
        return new zzt<>(t, zzc);
    }

    public static <T> zzt<T> zzc(zzaa zzaa) {
        return new zzt<>(zzaa);
    }
}
