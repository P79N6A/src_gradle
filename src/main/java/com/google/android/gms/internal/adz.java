package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

public final class adz extends ada<adz> implements Cloneable {
    private boolean zzctA = false;
    private byte[] zzctx = adj.zzcst;
    private String zzcty = "";
    private byte[][] zzctz = adj.zzcss;

    public adz() {
        this.zzcrZ = null;
        this.zzcsi = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: zzMa */
    public adz clone() {
        try {
            adz adz = (adz) super.clone();
            if (this.zzctz != null && this.zzctz.length > 0) {
                adz.zzctz = (byte[][]) this.zzctz.clone();
            }
            return adz;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof adz)) {
            return false;
        }
        adz adz = (adz) obj;
        if (!Arrays.equals(this.zzctx, adz.zzctx)) {
            return false;
        }
        if (this.zzcty == null) {
            if (adz.zzcty != null) {
                return false;
            }
        } else if (!this.zzcty.equals(adz.zzcty)) {
            return false;
        }
        if (ade.zza(this.zzctz, adz.zzctz) && this.zzctA == adz.zzctA) {
            return (this.zzcrZ == null || this.zzcrZ.isEmpty()) ? adz.zzcrZ == null || adz.zzcrZ.isEmpty() : this.zzcrZ.equals(adz.zzcrZ);
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((getClass().getName().hashCode() + 527) * 31) + Arrays.hashCode(this.zzctx)) * 31) + (this.zzcty == null ? 0 : this.zzcty.hashCode())) * 31) + ade.zzc(this.zzctz)) * 31) + (this.zzctA ? 1231 : 1237)) * 31;
        if (this.zzcrZ != null && !this.zzcrZ.isEmpty()) {
            i = this.zzcrZ.hashCode();
        }
        return hashCode + i;
    }

    public final /* synthetic */ ada zzLL() throws CloneNotSupportedException {
        return (adz) clone();
    }

    public final /* synthetic */ adg zzLM() throws CloneNotSupportedException {
        return (adz) clone();
    }

    public final /* synthetic */ adg zza(acx acx) throws IOException {
        while (true) {
            int zzLy = acx.zzLy();
            if (zzLy == 0) {
                return this;
            }
            if (zzLy == 10) {
                this.zzctx = acx.readBytes();
            } else if (zzLy == 18) {
                int zzb = adj.zzb(acx, 18);
                int length = this.zzctz == null ? 0 : this.zzctz.length;
                byte[][] bArr = new byte[(zzb + length)][];
                if (length != 0) {
                    System.arraycopy(this.zzctz, 0, bArr, 0, length);
                }
                while (length < bArr.length - 1) {
                    bArr[length] = acx.readBytes();
                    acx.zzLy();
                    length++;
                }
                bArr[length] = acx.readBytes();
                this.zzctz = bArr;
            } else if (zzLy == 24) {
                this.zzctA = acx.zzLB();
            } else if (zzLy == 34) {
                this.zzcty = acx.readString();
            } else if (!super.zza(acx, zzLy)) {
                return this;
            }
        }
    }

    public final void zza(acy acy) throws IOException {
        if (!Arrays.equals(this.zzctx, adj.zzcst)) {
            acy.zzb(1, this.zzctx);
        }
        if (this.zzctz != null && this.zzctz.length > 0) {
            for (byte[] bArr : this.zzctz) {
                if (bArr != null) {
                    acy.zzb(2, bArr);
                }
            }
        }
        if (this.zzctA) {
            acy.zzk(3, this.zzctA);
        }
        if (this.zzcty != null && !this.zzcty.equals("")) {
            acy.zzl(4, this.zzcty);
        }
        super.zza(acy);
    }

    /* access modifiers changed from: protected */
    public final int zzn() {
        int zzn = super.zzn();
        if (!Arrays.equals(this.zzctx, adj.zzcst)) {
            zzn += acy.zzc(1, this.zzctx);
        }
        if (this.zzctz != null && this.zzctz.length > 0) {
            int i = 0;
            int i2 = 0;
            for (byte[] bArr : this.zzctz) {
                if (bArr != null) {
                    i2++;
                    i += acy.zzJ(bArr);
                }
            }
            zzn = zzn + i + (i2 * 1);
        }
        if (this.zzctA) {
            zzn += acy.zzct(3) + 1;
        }
        return (this.zzcty == null || this.zzcty.equals("")) ? zzn : zzn + acy.zzm(4, this.zzcty);
    }
}
