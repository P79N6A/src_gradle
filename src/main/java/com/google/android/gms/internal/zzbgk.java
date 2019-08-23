package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public abstract class zzbgk extends zzbgh implements SafeParcelable {
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        zzbgh zzbgh = (zzbgh) obj;
        for (zzbgi next : zzrL().values()) {
            if (zza(next)) {
                if (!zzbgh.zza(next) || !zzb(next).equals(zzbgh.zzb(next))) {
                    return false;
                }
            } else if (zzbgh.zza(next)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        for (zzbgi next : zzrL().values()) {
            if (zza(next)) {
                i = (i * 31) + zzb(next).hashCode();
            }
        }
        return i;
    }

    public Object zzcH(String str) {
        return null;
    }

    public boolean zzcI(String str) {
        return false;
    }
}
