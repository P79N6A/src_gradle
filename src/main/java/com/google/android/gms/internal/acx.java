package com.google.android.gms.internal;

import java.io.IOException;

public final class acx {
    private final byte[] buffer;
    private int zzcrP;
    private int zzcrQ;
    private int zzcrR;
    private int zzcrS;
    private int zzcrT;
    private int zzcrU = Integer.MAX_VALUE;
    private int zzcrV;
    private int zzcrW = 64;
    private int zzcrX = 67108864;

    private acx(byte[] bArr, int i, int i2) {
        this.buffer = bArr;
        this.zzcrP = i;
        this.zzcrQ = i2 + i;
        this.zzcrS = i;
    }

    public static acx zzH(byte[] bArr) {
        return zzb(bArr, 0, bArr.length);
    }

    private final void zzLH() {
        this.zzcrQ += this.zzcrR;
        int i = this.zzcrQ;
        if (i > this.zzcrU) {
            this.zzcrR = i - this.zzcrU;
            this.zzcrQ -= this.zzcrR;
            return;
        }
        this.zzcrR = 0;
    }

    private final byte zzLJ() throws IOException {
        if (this.zzcrS != this.zzcrQ) {
            byte[] bArr = this.buffer;
            int i = this.zzcrS;
            this.zzcrS = i + 1;
            return bArr[i];
        }
        throw adf.zzLO();
    }

    public static acx zzb(byte[] bArr, int i, int i2) {
        return new acx(bArr, 0, i2);
    }

    private final void zzcq(int i) throws IOException {
        if (i < 0) {
            throw adf.zzLP();
        } else if (this.zzcrS + i > this.zzcrU) {
            zzcq(this.zzcrU - this.zzcrS);
            throw adf.zzLO();
        } else if (i <= this.zzcrQ - this.zzcrS) {
            this.zzcrS += i;
        } else {
            throw adf.zzLO();
        }
    }

    public final int getPosition() {
        return this.zzcrS - this.zzcrP;
    }

    public final byte[] readBytes() throws IOException {
        int zzLD = zzLD();
        if (zzLD < 0) {
            throw adf.zzLP();
        } else if (zzLD == 0) {
            return adj.zzcst;
        } else {
            if (zzLD <= this.zzcrQ - this.zzcrS) {
                byte[] bArr = new byte[zzLD];
                System.arraycopy(this.buffer, this.zzcrS, bArr, 0, zzLD);
                this.zzcrS += zzLD;
                return bArr;
            }
            throw adf.zzLO();
        }
    }

    public final String readString() throws IOException {
        int zzLD = zzLD();
        if (zzLD < 0) {
            throw adf.zzLP();
        } else if (zzLD <= this.zzcrQ - this.zzcrS) {
            String str = new String(this.buffer, this.zzcrS, zzLD, ade.UTF_8);
            this.zzcrS += zzLD;
            return str;
        } else {
            throw adf.zzLO();
        }
    }

    public final int zzLA() throws IOException {
        return zzLD();
    }

    public final boolean zzLB() throws IOException {
        return zzLD() != 0;
    }

    public final long zzLC() throws IOException {
        long zzLE = zzLE();
        return (-(zzLE & 1)) ^ (zzLE >>> 1);
    }

    public final int zzLD() throws IOException {
        byte b2;
        int i;
        byte zzLJ = zzLJ();
        if (zzLJ >= 0) {
            return zzLJ;
        }
        byte b3 = zzLJ & Byte.MAX_VALUE;
        byte zzLJ2 = zzLJ();
        if (zzLJ2 >= 0) {
            i = zzLJ2 << 7;
        } else {
            b3 |= (zzLJ2 & Byte.MAX_VALUE) << 7;
            byte zzLJ3 = zzLJ();
            if (zzLJ3 >= 0) {
                i = zzLJ3 << 14;
            } else {
                b3 |= (zzLJ3 & Byte.MAX_VALUE) << 14;
                byte zzLJ4 = zzLJ();
                if (zzLJ4 >= 0) {
                    i = zzLJ4 << 21;
                } else {
                    byte b4 = b3 | ((zzLJ4 & Byte.MAX_VALUE) << 21);
                    byte zzLJ5 = zzLJ();
                    b2 = b4 | (zzLJ5 << 28);
                    if (zzLJ5 < 0) {
                        for (int i2 = 0; i2 < 5; i2++) {
                            if (zzLJ() >= 0) {
                                return b2;
                            }
                        }
                        throw adf.zzLQ();
                    }
                    return b2;
                }
            }
        }
        b2 = b3 | i;
        return b2;
    }

    public final long zzLE() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte zzLJ = zzLJ();
            j |= ((long) (zzLJ & Byte.MAX_VALUE)) << i;
            if ((zzLJ & 128) == 0) {
                return j;
            }
        }
        throw adf.zzLQ();
    }

    public final int zzLF() throws IOException {
        return (zzLJ() & 255) | ((zzLJ() & 255) << 8) | ((zzLJ() & 255) << 16) | ((zzLJ() & 255) << 24);
    }

    public final long zzLG() throws IOException {
        byte zzLJ = zzLJ();
        byte zzLJ2 = zzLJ();
        return ((((long) zzLJ2) & 255) << 8) | (((long) zzLJ) & 255) | ((((long) zzLJ()) & 255) << 16) | ((((long) zzLJ()) & 255) << 24) | ((((long) zzLJ()) & 255) << 32) | ((((long) zzLJ()) & 255) << 40) | ((((long) zzLJ()) & 255) << 48) | ((((long) zzLJ()) & 255) << 56);
    }

    public final int zzLI() {
        if (this.zzcrU == Integer.MAX_VALUE) {
            return -1;
        }
        return this.zzcrU - this.zzcrS;
    }

    public final int zzLy() throws IOException {
        if (this.zzcrS == this.zzcrQ) {
            this.zzcrT = 0;
            return 0;
        }
        this.zzcrT = zzLD();
        if (this.zzcrT != 0) {
            return this.zzcrT;
        }
        throw new adf("Protocol message contained an invalid tag (zero).");
    }

    public final long zzLz() throws IOException {
        return zzLE();
    }

    public final void zza(adg adg) throws IOException {
        int zzLD = zzLD();
        if (this.zzcrV < this.zzcrW) {
            int zzcn = zzcn(zzLD);
            this.zzcrV++;
            adg.zza(this);
            zzcl(0);
            this.zzcrV--;
            zzco(zzcn);
            return;
        }
        throw adf.zzLR();
    }

    public final void zza(adg adg, int i) throws IOException {
        if (this.zzcrV < this.zzcrW) {
            this.zzcrV++;
            adg.zza(this);
            zzcl((i << 3) | 4);
            this.zzcrV--;
            return;
        }
        throw adf.zzLR();
    }

    public final void zzcl(int i) throws adf {
        if (this.zzcrT != i) {
            throw new adf("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final boolean zzcm(int i) throws IOException {
        int zzLy;
        switch (i & 7) {
            case 0:
                zzLD();
                return true;
            case 1:
                zzLG();
                return true;
            case 2:
                zzcq(zzLD());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                zzLF();
                return true;
            default:
                throw new adf("Protocol message tag had invalid wire type.");
        }
        do {
            zzLy = zzLy();
            if (zzLy != 0) {
            }
            zzcl(((i >>> 3) << 3) | 4);
            return true;
        } while (zzcm(zzLy));
        zzcl(((i >>> 3) << 3) | 4);
        return true;
    }

    public final int zzcn(int i) throws adf {
        if (i >= 0) {
            int i2 = i + this.zzcrS;
            int i3 = this.zzcrU;
            if (i2 <= i3) {
                this.zzcrU = i2;
                zzLH();
                return i3;
            }
            throw adf.zzLO();
        }
        throw adf.zzLP();
    }

    public final void zzco(int i) {
        this.zzcrU = i;
        zzLH();
    }

    public final void zzcp(int i) {
        zzq(i, this.zzcrT);
    }

    public final byte[] zzp(int i, int i2) {
        if (i2 == 0) {
            return adj.zzcst;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.buffer, this.zzcrP + i, bArr, 0, i2);
        return bArr;
    }

    /* access modifiers changed from: package-private */
    public final void zzq(int i, int i2) {
        if (i > this.zzcrS - this.zzcrP) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Position ");
            sb.append(i);
            sb.append(" is beyond current ");
            sb.append(this.zzcrS - this.zzcrP);
            throw new IllegalArgumentException(sb.toString());
        } else if (i >= 0) {
            this.zzcrS = this.zzcrP + i;
            this.zzcrT = i2;
        } else {
            StringBuilder sb2 = new StringBuilder(24);
            sb2.append("Bad position ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
