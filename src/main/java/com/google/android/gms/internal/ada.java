package com.google.android.gms.internal;

import com.google.android.gms.internal.ada;
import java.io.IOException;

public abstract class ada<M extends ada<M>> extends adg {
    protected adc zzcrZ;

    /* renamed from: zzLL */
    public M clone() throws CloneNotSupportedException {
        M m = (ada) super.clone();
        ade.zza(this, (ada) m);
        return m;
    }

    public /* synthetic */ adg zzLM() throws CloneNotSupportedException {
        return (ada) clone();
    }

    public final <T> T zza(adb<M, T> adb) {
        if (this.zzcrZ == null) {
            return null;
        }
        add zzcx = this.zzcrZ.zzcx(adb.tag >>> 3);
        if (zzcx == null) {
            return null;
        }
        return zzcx.zzb(adb);
    }

    public void zza(acy acy) throws IOException {
        if (this.zzcrZ != null) {
            for (int i = 0; i < this.zzcrZ.size(); i++) {
                this.zzcrZ.zzcy(i).zza(acy);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zza(acx acx, int i) throws IOException {
        int position = acx.getPosition();
        if (!acx.zzcm(i)) {
            return false;
        }
        int i2 = i >>> 3;
        adi adi = new adi(i, acx.zzp(position, acx.getPosition() - position));
        add add = null;
        if (this.zzcrZ == null) {
            this.zzcrZ = new adc();
        } else {
            add = this.zzcrZ.zzcx(i2);
        }
        if (add == null) {
            add = new add();
            this.zzcrZ.zza(i2, add);
        }
        add.zza(adi);
        return true;
    }

    /* access modifiers changed from: protected */
    public int zzn() {
        if (this.zzcrZ == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.zzcrZ.size(); i2++) {
            i += this.zzcrZ.zzcy(i2).zzn();
        }
        return i;
    }
}
