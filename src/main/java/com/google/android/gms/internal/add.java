package com.google.android.gms.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class add implements Cloneable {
    private Object value;
    private adb<?, ?> zzcsf;
    private List<adi> zzcsg = new ArrayList();

    add() {
    }

    private final byte[] toByteArray() throws IOException {
        byte[] bArr = new byte[zzn()];
        zza(acy.zzI(bArr));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: zzLN */
    public add clone() {
        Object clone;
        add add = new add();
        try {
            add.zzcsf = this.zzcsf;
            if (this.zzcsg == null) {
                add.zzcsg = null;
            } else {
                add.zzcsg.addAll(this.zzcsg);
            }
            if (this.value != null) {
                if (this.value instanceof adg) {
                    clone = (adg) ((adg) this.value).clone();
                } else if (this.value instanceof byte[]) {
                    clone = ((byte[]) this.value).clone();
                } else {
                    int i = 0;
                    if (this.value instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.value;
                        byte[][] bArr2 = new byte[bArr.length][];
                        add.value = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.value instanceof boolean[]) {
                        clone = ((boolean[]) this.value).clone();
                    } else if (this.value instanceof int[]) {
                        clone = ((int[]) this.value).clone();
                    } else if (this.value instanceof long[]) {
                        clone = ((long[]) this.value).clone();
                    } else if (this.value instanceof float[]) {
                        clone = ((float[]) this.value).clone();
                    } else if (this.value instanceof double[]) {
                        clone = ((double[]) this.value).clone();
                    } else if (this.value instanceof adg[]) {
                        adg[] adgArr = (adg[]) this.value;
                        adg[] adgArr2 = new adg[adgArr.length];
                        add.value = adgArr2;
                        while (i < adgArr.length) {
                            adgArr2[i] = (adg) adgArr[i].clone();
                            i++;
                        }
                    }
                }
                add.value = clone;
            }
            return add;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof add)) {
            return false;
        }
        add add = (add) obj;
        if (this.value == null || add.value == null) {
            if (this.zzcsg != null && add.zzcsg != null) {
                return this.zzcsg.equals(add.zzcsg);
            }
            try {
                return Arrays.equals(toByteArray(), add.toByteArray());
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        } else if (this.zzcsf != add.zzcsf) {
            return false;
        } else {
            return !this.zzcsf.zzcjC.isArray() ? this.value.equals(add.value) : this.value instanceof byte[] ? Arrays.equals((byte[]) this.value, (byte[]) add.value) : this.value instanceof int[] ? Arrays.equals((int[]) this.value, (int[]) add.value) : this.value instanceof long[] ? Arrays.equals((long[]) this.value, (long[]) add.value) : this.value instanceof float[] ? Arrays.equals((float[]) this.value, (float[]) add.value) : this.value instanceof double[] ? Arrays.equals((double[]) this.value, (double[]) add.value) : this.value instanceof boolean[] ? Arrays.equals((boolean[]) this.value, (boolean[]) add.value) : Arrays.deepEquals((Object[]) this.value, (Object[]) add.value);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(toByteArray()) + 527;
        } catch (IOException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(acy acy) throws IOException {
        if (this.value != null) {
            this.zzcsf.zza(this.value, acy);
            return;
        }
        for (adi next : this.zzcsg) {
            acy.zzcu(next.tag);
            acy.zzK(next.zzbws);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(adi adi) {
        this.zzcsg.add(adi);
    }

    /* access modifiers changed from: package-private */
    public final <T> T zzb(adb<?, T> adb) {
        if (this.value == null) {
            this.zzcsf = adb;
            this.value = adb.zzX(this.zzcsg);
            this.zzcsg = null;
        } else if (!this.zzcsf.equals(adb)) {
            throw new IllegalStateException("Tried to getExtension with a different Extension.");
        }
        return this.value;
    }

    /* access modifiers changed from: package-private */
    public final int zzn() {
        if (this.value != null) {
            return this.zzcsf.zzav(this.value);
        }
        int i = 0;
        for (adi next : this.zzcsg) {
            i += acy.zzcv(next.tag) + 0 + next.zzbws.length;
        }
        return i;
    }
}
