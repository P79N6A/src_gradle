package com.google.android.gms.internal;

import java.util.Arrays;

public final class adi {
    final int tag;
    final byte[] zzbws;

    adi(int i, byte[] bArr) {
        this.tag = i;
        this.zzbws = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof adi)) {
            return false;
        }
        adi adi = (adi) obj;
        return this.tag == adi.tag && Arrays.equals(this.zzbws, adi.zzbws);
    }

    public final int hashCode() {
        return ((this.tag + 527) * 31) + Arrays.hashCode(this.zzbws);
    }
}
