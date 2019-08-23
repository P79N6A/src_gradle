package com.google.android.gms.dynamic;

import android.os.Bundle;
import java.util.Iterator;

public final class zzb implements zzo<T> {
    private /* synthetic */ zza zzaSv;

    zzb(zza zza) {
        this.zzaSv = zza;
    }

    public final void zza(T t) {
        LifecycleDelegate unused = this.zzaSv.zzaSr = t;
        Iterator it2 = this.zzaSv.zzaSt.iterator();
        while (it2.hasNext()) {
            ((zzi) it2.next()).zzb(this.zzaSv.zzaSr);
        }
        this.zzaSv.zzaSt.clear();
        Bundle unused2 = this.zzaSv.zzaSs = null;
    }
}
