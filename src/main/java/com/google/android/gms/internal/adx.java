package com.google.android.gms.internal;

import java.io.IOException;

public final class adx extends ada<adx> implements Cloneable {
    private String[] zzctr = adj.EMPTY_STRING_ARRAY;
    private String[] zzcts = adj.EMPTY_STRING_ARRAY;
    private int[] zzctt = adj.zzcsn;
    private long[] zzctu = adj.zzcso;
    private long[] zzctv = adj.zzcso;

    public adx() {
        this.zzcrZ = null;
        this.zzcsi = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: zzLY */
    public adx clone() {
        try {
            adx adx = (adx) super.clone();
            if (this.zzctr != null && this.zzctr.length > 0) {
                adx.zzctr = (String[]) this.zzctr.clone();
            }
            if (this.zzcts != null && this.zzcts.length > 0) {
                adx.zzcts = (String[]) this.zzcts.clone();
            }
            if (this.zzctt != null && this.zzctt.length > 0) {
                adx.zzctt = (int[]) this.zzctt.clone();
            }
            if (this.zzctu != null && this.zzctu.length > 0) {
                adx.zzctu = (long[]) this.zzctu.clone();
            }
            if (this.zzctv != null && this.zzctv.length > 0) {
                adx.zzctv = (long[]) this.zzctv.clone();
            }
            return adx;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof adx)) {
            return false;
        }
        adx adx = (adx) obj;
        if (ade.equals((Object[]) this.zzctr, (Object[]) adx.zzctr) && ade.equals((Object[]) this.zzcts, (Object[]) adx.zzcts) && ade.equals(this.zzctt, adx.zzctt) && ade.equals(this.zzctu, adx.zzctu) && ade.equals(this.zzctv, adx.zzctv)) {
            return (this.zzcrZ == null || this.zzcrZ.isEmpty()) ? adx.zzcrZ == null || adx.zzcrZ.isEmpty() : this.zzcrZ.equals(adx.zzcrZ);
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((getClass().getName().hashCode() + 527) * 31) + ade.hashCode((Object[]) this.zzctr)) * 31) + ade.hashCode((Object[]) this.zzcts)) * 31) + ade.hashCode(this.zzctt)) * 31) + ade.hashCode(this.zzctu)) * 31) + ade.hashCode(this.zzctv)) * 31) + ((this.zzcrZ == null || this.zzcrZ.isEmpty()) ? 0 : this.zzcrZ.hashCode());
    }

    public final /* synthetic */ ada zzLL() throws CloneNotSupportedException {
        return (adx) clone();
    }

    public final /* synthetic */ adg zzLM() throws CloneNotSupportedException {
        return (adx) clone();
    }

    public final /* synthetic */ adg zza(acx acx) throws IOException {
        int i;
        while (true) {
            int zzLy = acx.zzLy();
            if (zzLy == 0) {
                return this;
            }
            if (zzLy == 10) {
                int zzb = adj.zzb(acx, 10);
                int length = this.zzctr == null ? 0 : this.zzctr.length;
                String[] strArr = new String[(zzb + length)];
                if (length != 0) {
                    System.arraycopy(this.zzctr, 0, strArr, 0, length);
                }
                while (length < strArr.length - 1) {
                    strArr[length] = acx.readString();
                    acx.zzLy();
                    length++;
                }
                strArr[length] = acx.readString();
                this.zzctr = strArr;
            } else if (zzLy == 18) {
                int zzb2 = adj.zzb(acx, 18);
                int length2 = this.zzcts == null ? 0 : this.zzcts.length;
                String[] strArr2 = new String[(zzb2 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.zzcts, 0, strArr2, 0, length2);
                }
                while (length2 < strArr2.length - 1) {
                    strArr2[length2] = acx.readString();
                    acx.zzLy();
                    length2++;
                }
                strArr2[length2] = acx.readString();
                this.zzcts = strArr2;
            } else if (zzLy != 24) {
                if (zzLy == 26) {
                    i = acx.zzcn(acx.zzLD());
                    int position = acx.getPosition();
                    int i2 = 0;
                    while (acx.zzLI() > 0) {
                        acx.zzLA();
                        i2++;
                    }
                    acx.zzcp(position);
                    int length3 = this.zzctt == null ? 0 : this.zzctt.length;
                    int[] iArr = new int[(i2 + length3)];
                    if (length3 != 0) {
                        System.arraycopy(this.zzctt, 0, iArr, 0, length3);
                    }
                    while (length3 < iArr.length) {
                        iArr[length3] = acx.zzLA();
                        length3++;
                    }
                    this.zzctt = iArr;
                } else if (zzLy == 32) {
                    int zzb3 = adj.zzb(acx, 32);
                    int length4 = this.zzctu == null ? 0 : this.zzctu.length;
                    long[] jArr = new long[(zzb3 + length4)];
                    if (length4 != 0) {
                        System.arraycopy(this.zzctu, 0, jArr, 0, length4);
                    }
                    while (length4 < jArr.length - 1) {
                        jArr[length4] = acx.zzLz();
                        acx.zzLy();
                        length4++;
                    }
                    jArr[length4] = acx.zzLz();
                    this.zzctu = jArr;
                } else if (zzLy == 34) {
                    i = acx.zzcn(acx.zzLD());
                    int position2 = acx.getPosition();
                    int i3 = 0;
                    while (acx.zzLI() > 0) {
                        acx.zzLz();
                        i3++;
                    }
                    acx.zzcp(position2);
                    int length5 = this.zzctu == null ? 0 : this.zzctu.length;
                    long[] jArr2 = new long[(i3 + length5)];
                    if (length5 != 0) {
                        System.arraycopy(this.zzctu, 0, jArr2, 0, length5);
                    }
                    while (length5 < jArr2.length) {
                        jArr2[length5] = acx.zzLz();
                        length5++;
                    }
                    this.zzctu = jArr2;
                } else if (zzLy == 40) {
                    int zzb4 = adj.zzb(acx, 40);
                    int length6 = this.zzctv == null ? 0 : this.zzctv.length;
                    long[] jArr3 = new long[(zzb4 + length6)];
                    if (length6 != 0) {
                        System.arraycopy(this.zzctv, 0, jArr3, 0, length6);
                    }
                    while (length6 < jArr3.length - 1) {
                        jArr3[length6] = acx.zzLz();
                        acx.zzLy();
                        length6++;
                    }
                    jArr3[length6] = acx.zzLz();
                    this.zzctv = jArr3;
                } else if (zzLy == 42) {
                    i = acx.zzcn(acx.zzLD());
                    int position3 = acx.getPosition();
                    int i4 = 0;
                    while (acx.zzLI() > 0) {
                        acx.zzLz();
                        i4++;
                    }
                    acx.zzcp(position3);
                    int length7 = this.zzctv == null ? 0 : this.zzctv.length;
                    long[] jArr4 = new long[(i4 + length7)];
                    if (length7 != 0) {
                        System.arraycopy(this.zzctv, 0, jArr4, 0, length7);
                    }
                    while (length7 < jArr4.length) {
                        jArr4[length7] = acx.zzLz();
                        length7++;
                    }
                    this.zzctv = jArr4;
                } else if (!super.zza(acx, zzLy)) {
                    return this;
                }
                acx.zzco(i);
            } else {
                int zzb5 = adj.zzb(acx, 24);
                int length8 = this.zzctt == null ? 0 : this.zzctt.length;
                int[] iArr2 = new int[(zzb5 + length8)];
                if (length8 != 0) {
                    System.arraycopy(this.zzctt, 0, iArr2, 0, length8);
                }
                while (length8 < iArr2.length - 1) {
                    iArr2[length8] = acx.zzLA();
                    acx.zzLy();
                    length8++;
                }
                iArr2[length8] = acx.zzLA();
                this.zzctt = iArr2;
            }
        }
    }

    public final void zza(acy acy) throws IOException {
        if (this.zzctr != null && this.zzctr.length > 0) {
            for (String str : this.zzctr) {
                if (str != null) {
                    acy.zzl(1, str);
                }
            }
        }
        if (this.zzcts != null && this.zzcts.length > 0) {
            for (String str2 : this.zzcts) {
                if (str2 != null) {
                    acy.zzl(2, str2);
                }
            }
        }
        if (this.zzctt != null && this.zzctt.length > 0) {
            for (int zzr : this.zzctt) {
                acy.zzr(3, zzr);
            }
        }
        if (this.zzctu != null && this.zzctu.length > 0) {
            for (long zzb : this.zzctu) {
                acy.zzb(4, zzb);
            }
        }
        if (this.zzctv != null && this.zzctv.length > 0) {
            for (long zzb2 : this.zzctv) {
                acy.zzb(5, zzb2);
            }
        }
        super.zza(acy);
    }

    /* access modifiers changed from: protected */
    public final int zzn() {
        int zzn = super.zzn();
        if (this.zzctr != null && this.zzctr.length > 0) {
            int i = 0;
            int i2 = 0;
            for (String str : this.zzctr) {
                if (str != null) {
                    i2++;
                    i += acy.zzhQ(str);
                }
            }
            zzn = zzn + i + (i2 * 1);
        }
        if (this.zzcts != null && this.zzcts.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (String str2 : this.zzcts) {
                if (str2 != null) {
                    i4++;
                    i3 += acy.zzhQ(str2);
                }
            }
            zzn = zzn + i3 + (i4 * 1);
        }
        if (this.zzctt != null && this.zzctt.length > 0) {
            int i5 = 0;
            for (int zzcr : this.zzctt) {
                i5 += acy.zzcr(zzcr);
            }
            zzn = zzn + i5 + (this.zzctt.length * 1);
        }
        if (this.zzctu != null && this.zzctu.length > 0) {
            int i6 = 0;
            for (long zzaP : this.zzctu) {
                i6 += acy.zzaP(zzaP);
            }
            zzn = zzn + i6 + (this.zzctu.length * 1);
        }
        if (this.zzctv == null || this.zzctv.length <= 0) {
            return zzn;
        }
        int i7 = 0;
        for (long zzaP2 : this.zzctv) {
            i7 += acy.zzaP(zzaP2);
        }
        return zzn + i7 + (this.zzctv.length * 1);
    }
}
