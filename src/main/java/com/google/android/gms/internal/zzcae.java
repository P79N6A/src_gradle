package com.google.android.gms.internal;

public final class zzcae {
    private static zzcae zzaXH;
    private final zzbzz zzaXI = new zzbzz();
    private final zzcaa zzaXJ = new zzcaa();

    static {
        zzcae zzcae = new zzcae();
        synchronized (zzcae.class) {
            zzaXH = zzcae;
        }
    }

    private zzcae() {
    }

    private static zzcae zzua() {
        zzcae zzcae;
        synchronized (zzcae.class) {
            zzcae = zzaXH;
        }
        return zzcae;
    }

    public static zzbzz zzub() {
        return zzua().zzaXI;
    }

    public static zzcaa zzuc() {
        return zzua().zzaXJ;
    }
}
