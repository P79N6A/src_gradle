package com.google.android.gms.common.data;

import java.util.NoSuchElementException;

public final class zzh<T> extends zzb<T> {
    private T zzaFQ;

    public zzh(DataBuffer<T> dataBuffer) {
        super(dataBuffer);
    }

    public final T next() {
        if (hasNext()) {
            this.zzaFv++;
            if (this.zzaFv == 0) {
                this.zzaFQ = this.zzaFu.get(0);
                if (!(this.zzaFQ instanceof zzc)) {
                    String valueOf = String.valueOf(this.zzaFQ.getClass());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
                    sb.append("DataBuffer reference of type ");
                    sb.append(valueOf);
                    sb.append(" is not movable");
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                ((zzc) this.zzaFQ).zzar(this.zzaFv);
            }
            return this.zzaFQ;
        }
        int i = this.zzaFv;
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append("Cannot advance the iterator beyond ");
        sb2.append(i);
        throw new NoSuchElementException(sb2.toString());
    }
}
