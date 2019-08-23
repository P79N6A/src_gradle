package com.google.android.gms.common.data;

import java.util.ArrayList;

public abstract class zzg<T> extends AbstractDataBuffer<T> {
    private boolean zzaFO;
    private ArrayList<Integer> zzaFP;

    protected zzg(DataHolder dataHolder) {
        super(dataHolder);
    }

    private final int zzaw(int i) {
        if (i >= 0 && i < this.zzaFP.size()) {
            return this.zzaFP.get(i).intValue();
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("Position ");
        sb.append(i);
        sb.append(" is out of bounds for this buffer");
        throw new IllegalArgumentException(sb.toString());
    }

    private final void zzqT() {
        synchronized (this) {
            if (!this.zzaFO) {
                int i = this.zzaCX.zzaFG;
                this.zzaFP = new ArrayList<>();
                if (i > 0) {
                    this.zzaFP.add(0);
                    String zzqS = zzqS();
                    String zzd = this.zzaCX.zzd(zzqS, 0, this.zzaCX.zzat(0));
                    int i2 = 1;
                    while (i2 < i) {
                        int zzat = this.zzaCX.zzat(i2);
                        String zzd2 = this.zzaCX.zzd(zzqS, i2, zzat);
                        if (zzd2 != null) {
                            if (!zzd2.equals(zzd)) {
                                this.zzaFP.add(Integer.valueOf(i2));
                                zzd = zzd2;
                            }
                            i2++;
                        } else {
                            StringBuilder sb = new StringBuilder(String.valueOf(zzqS).length() + 78);
                            sb.append("Missing value for markerColumn: ");
                            sb.append(zzqS);
                            sb.append(", at row: ");
                            sb.append(i2);
                            sb.append(", for window: ");
                            sb.append(zzat);
                            throw new NullPointerException(sb.toString());
                        }
                    }
                }
                this.zzaFO = true;
            }
        }
    }

    public final T get(int i) {
        int i2;
        zzqT();
        int zzaw = zzaw(i);
        if (i < 0 || i == this.zzaFP.size()) {
            i2 = 0;
        } else {
            i2 = (i == this.zzaFP.size() - 1 ? this.zzaCX.zzaFG : this.zzaFP.get(i + 1).intValue()) - this.zzaFP.get(i).intValue();
            if (i2 == 1) {
                this.zzaCX.zzat(zzaw(i));
            }
        }
        return zzi(zzaw, i2);
    }

    public int getCount() {
        zzqT();
        return this.zzaFP.size();
    }

    /* access modifiers changed from: protected */
    public abstract T zzi(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract String zzqS();
}
