package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class zzcqm extends zza {
    public static final Parcelable.Creator<zzcqm> CREATOR = new zzcqs();
    private static byte[][] zzazi = new byte[0][];
    private static zzcqm zzbAc;
    private static final zzcqr zzbAl = new zzcqn();
    private static final zzcqr zzbAm = new zzcqo();
    private static final zzcqr zzbAn = new zzcqp();
    private static final zzcqr zzbAo = new zzcqq();
    private String zzbAd;
    private byte[] zzbAe;
    private byte[][] zzbAf;
    private byte[][] zzbAg;
    private byte[][] zzbAh;
    private byte[][] zzbAi;
    private int[] zzbAj;
    private byte[][] zzbAk;

    /* JADX WARNING: type inference failed for: r0v4, types: [com.google.android.gms.internal.zzcqr, com.google.android.gms.internal.zzcqn] */
    /* JADX WARNING: type inference failed for: r0v5, types: [com.google.android.gms.internal.zzcqr, com.google.android.gms.internal.zzcqo] */
    /* JADX WARNING: type inference failed for: r0v6, types: [com.google.android.gms.internal.zzcqr, com.google.android.gms.internal.zzcqp] */
    /* JADX WARNING: type inference failed for: r0v7, types: [com.google.android.gms.internal.zzcqr, com.google.android.gms.internal.zzcqq] */
    static {
        byte[][] bArr = zzazi;
        byte[][] bArr2 = zzazi;
        zzcqm zzcqm = new zzcqm("", null, bArr, bArr, bArr2, bArr2, null, null);
        zzbAc = zzcqm;
    }

    public zzcqm(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.zzbAd = str;
        this.zzbAe = bArr;
        this.zzbAf = bArr2;
        this.zzbAg = bArr3;
        this.zzbAh = bArr4;
        this.zzbAi = bArr5;
        this.zzbAj = iArr;
        this.zzbAk = bArr6;
    }

    private static void zza(StringBuilder sb, String str, int[] iArr) {
        String str2;
        sb.append(str);
        sb.append("=");
        if (iArr == null) {
            str2 = "null";
        } else {
            sb.append("(");
            int length = iArr.length;
            int i = 0;
            boolean z = true;
            while (i < length) {
                int i2 = iArr[i];
                if (!z) {
                    sb.append(", ");
                }
                sb.append(i2);
                i++;
                z = false;
            }
            str2 = ")";
        }
        sb.append(str2);
    }

    private static void zza(StringBuilder sb, String str, byte[][] bArr) {
        String str2;
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            str2 = "null";
        } else {
            sb.append("(");
            int length = bArr.length;
            int i = 0;
            boolean z = true;
            while (i < length) {
                byte[] bArr2 = bArr[i];
                if (!z) {
                    sb.append(", ");
                }
                sb.append("'");
                sb.append(Base64.encodeToString(bArr2, 3));
                sb.append("'");
                i++;
                z = false;
            }
            str2 = ")";
        }
        sb.append(str2);
    }

    private static List<String> zzb(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte[] encodeToString : bArr) {
            arrayList.add(Base64.encodeToString(encodeToString, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static List<Integer> zzc(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzcqm) {
            zzcqm zzcqm = (zzcqm) obj;
            if (zzcqt.equals(this.zzbAd, zzcqm.zzbAd) && Arrays.equals(this.zzbAe, zzcqm.zzbAe) && zzcqt.equals(zzb(this.zzbAf), zzb(zzcqm.zzbAf)) && zzcqt.equals(zzb(this.zzbAg), zzb(zzcqm.zzbAg)) && zzcqt.equals(zzb(this.zzbAh), zzb(zzcqm.zzbAh)) && zzcqt.equals(zzb(this.zzbAi), zzb(zzcqm.zzbAi)) && zzcqt.equals(zzc(this.zzbAj), zzc(zzcqm.zzbAj)) && zzcqt.equals(zzb(this.zzbAk), zzb(zzcqm.zzbAk))) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        if (this.zzbAd == null) {
            str = "null";
        } else {
            String valueOf = String.valueOf("'");
            String str3 = this.zzbAd;
            String valueOf2 = String.valueOf("'");
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(str3).length() + String.valueOf(valueOf2).length());
            sb2.append(valueOf);
            sb2.append(str3);
            sb2.append(valueOf2);
            str = sb2.toString();
        }
        sb.append(str);
        sb.append(", ");
        byte[] bArr = this.zzbAe;
        sb.append("direct");
        sb.append("=");
        if (bArr == null) {
            str2 = "null";
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            str2 = "'";
        }
        sb.append(str2);
        sb.append(", ");
        zza(sb, "GAIA", this.zzbAf);
        sb.append(", ");
        zza(sb, "PSEUDO", this.zzbAg);
        sb.append(", ");
        zza(sb, "ALWAYS", this.zzbAh);
        sb.append(", ");
        zza(sb, "OTHER", this.zzbAi);
        sb.append(", ");
        zza(sb, "weak", this.zzbAj);
        sb.append(", ");
        zza(sb, "directs", this.zzbAk);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzd.zze(parcel);
        zzd.zza(parcel, 2, this.zzbAd, false);
        zzd.zza(parcel, 3, this.zzbAe, false);
        zzd.zza(parcel, 4, this.zzbAf, false);
        zzd.zza(parcel, 5, this.zzbAg, false);
        zzd.zza(parcel, 6, this.zzbAh, false);
        zzd.zza(parcel, 7, this.zzbAi, false);
        zzd.zza(parcel, 8, this.zzbAj, false);
        zzd.zza(parcel, 9, this.zzbAk, false);
        zzd.zzI(parcel, zze);
    }
}
