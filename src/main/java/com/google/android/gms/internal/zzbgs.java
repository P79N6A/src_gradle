package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzd;
import com.google.android.gms.common.internal.zzbo;
import com.google.android.gms.common.util.zzc;
import com.google.android.gms.common.util.zzo;
import com.google.android.gms.common.util.zzp;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class zzbgs extends zzbgk {
    public static final Parcelable.Creator<zzbgs> CREATOR = new zzbgt();
    private final String mClassName;
    private final zzbgn zzaIP;
    private final Parcel zzaIW;
    private final int zzaIX = 2;
    private int zzaIY;
    private int zzaIZ;
    private final int zzaku;

    zzbgs(int i, Parcel parcel, zzbgn zzbgn) {
        this.zzaku = i;
        this.zzaIW = (Parcel) zzbo.zzu(parcel);
        this.zzaIP = zzbgn;
        this.mClassName = this.zzaIP == null ? null : this.zzaIP.zzrR();
        this.zzaIY = 2;
    }

    private static void zza(StringBuilder sb, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case e.l /*?: ONE_ARG  (7 int)*/:
                sb.append("\"");
                sb.append(zzo.zzcK(obj.toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(zzc.encode((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(zzc.zzg((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                zzp.zza(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unknown type = ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: double[]} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zza(java.lang.StringBuilder r6, com.google.android.gms.internal.zzbgi<?, ?> r7, android.os.Parcel r8, int r9) {
        /*
            r5 = this;
            boolean r0 = r7.zzaIK
            r1 = 0
            if (r0 == 0) goto L_0x00cb
            java.lang.String r0 = "["
            r6.append(r0)
            int r0 = r7.zzaIJ
            r2 = 0
            switch(r0) {
                case 0: goto L_0x00ab;
                case 1: goto L_0x0082;
                case 2: goto L_0x007a;
                case 3: goto L_0x0072;
                case 4: goto L_0x005b;
                case 5: goto L_0x0052;
                case 6: goto L_0x0049;
                case 7: goto L_0x0040;
                case 8: goto L_0x0038;
                case 9: goto L_0x0038;
                case 10: goto L_0x0038;
                case 11: goto L_0x0018;
                default: goto L_0x0010;
            }
        L_0x0010:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Unknown field type out."
            r6.<init>(r7)
            throw r6
        L_0x0018:
            android.os.Parcel[] r8 = com.google.android.gms.common.internal.safeparcel.zzb.zzE(r8, r9)
            int r9 = r8.length
            r0 = 0
        L_0x001e:
            if (r0 >= r9) goto L_0x00c5
            if (r0 <= 0) goto L_0x0027
            java.lang.String r2 = ","
            r6.append(r2)
        L_0x0027:
            r2 = r8[r0]
            r2.setDataPosition(r1)
            java.util.Map r2 = r7.zzrP()
            r3 = r8[r0]
            r5.zza((java.lang.StringBuilder) r6, (java.util.Map<java.lang.String, com.google.android.gms.internal.zzbgi<?, ?>>) r2, (android.os.Parcel) r3)
            int r0 = r0 + 1
            goto L_0x001e
        L_0x0038:
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
            java.lang.String r7 = "List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported"
            r6.<init>(r7)
            throw r6
        L_0x0040:
            java.lang.String[] r7 = com.google.android.gms.common.internal.safeparcel.zzb.zzA(r8, r9)
            com.google.android.gms.common.util.zzb.zza((java.lang.StringBuilder) r6, (java.lang.String[]) r7)
            goto L_0x00c5
        L_0x0049:
            boolean[] r7 = com.google.android.gms.common.internal.safeparcel.zzb.zzv(r8, r9)
            com.google.android.gms.common.util.zzb.zza((java.lang.StringBuilder) r6, (boolean[]) r7)
            goto L_0x00c5
        L_0x0052:
            java.math.BigDecimal[] r7 = com.google.android.gms.common.internal.safeparcel.zzb.zzz(r8, r9)
            com.google.android.gms.common.util.zzb.zza((java.lang.StringBuilder) r6, (T[]) r7)
            goto L_0x00c5
        L_0x005b:
            int r7 = com.google.android.gms.common.internal.safeparcel.zzb.zza(r8, r9)
            int r9 = r8.dataPosition()
            if (r7 != 0) goto L_0x0066
            goto L_0x006e
        L_0x0066:
            double[] r2 = r8.createDoubleArray()
            int r9 = r9 + r7
            r8.setDataPosition(r9)
        L_0x006e:
            com.google.android.gms.common.util.zzb.zza((java.lang.StringBuilder) r6, (double[]) r2)
            goto L_0x00c5
        L_0x0072:
            float[] r7 = com.google.android.gms.common.internal.safeparcel.zzb.zzy(r8, r9)
            com.google.android.gms.common.util.zzb.zza((java.lang.StringBuilder) r6, (float[]) r7)
            goto L_0x00c5
        L_0x007a:
            long[] r7 = com.google.android.gms.common.internal.safeparcel.zzb.zzx(r8, r9)
            com.google.android.gms.common.util.zzb.zza((java.lang.StringBuilder) r6, (long[]) r7)
            goto L_0x00c5
        L_0x0082:
            int r7 = com.google.android.gms.common.internal.safeparcel.zzb.zza(r8, r9)
            int r9 = r8.dataPosition()
            if (r7 != 0) goto L_0x008d
            goto L_0x00a7
        L_0x008d:
            int r0 = r8.readInt()
            java.math.BigInteger[] r2 = new java.math.BigInteger[r0]
        L_0x0093:
            if (r1 >= r0) goto L_0x00a3
            java.math.BigInteger r3 = new java.math.BigInteger
            byte[] r4 = r8.createByteArray()
            r3.<init>(r4)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L_0x0093
        L_0x00a3:
            int r9 = r9 + r7
            r8.setDataPosition(r9)
        L_0x00a7:
            com.google.android.gms.common.util.zzb.zza((java.lang.StringBuilder) r6, (T[]) r2)
            goto L_0x00c5
        L_0x00ab:
            int[] r7 = com.google.android.gms.common.internal.safeparcel.zzb.zzw(r8, r9)
            int r8 = r7.length
        L_0x00b0:
            if (r1 >= r8) goto L_0x00c5
            if (r1 == 0) goto L_0x00b9
            java.lang.String r9 = ","
            r6.append(r9)
        L_0x00b9:
            r9 = r7[r1]
            java.lang.String r9 = java.lang.Integer.toString(r9)
            r6.append(r9)
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00c5:
            java.lang.String r7 = "]"
            r6.append(r7)
            return
        L_0x00cb:
            int r0 = r7.zzaIJ
            switch(r0) {
                case 0: goto L_0x01b0;
                case 1: goto L_0x01a8;
                case 2: goto L_0x01a0;
                case 3: goto L_0x0198;
                case 4: goto L_0x0190;
                case 5: goto L_0x0188;
                case 6: goto L_0x0180;
                case 7: goto L_0x016a;
                case 8: goto L_0x0154;
                case 9: goto L_0x013e;
                case 10: goto L_0x00e7;
                case 11: goto L_0x00d8;
                default: goto L_0x00d0;
            }
        L_0x00d0:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Unknown field type out"
            r6.<init>(r7)
            throw r6
        L_0x00d8:
            android.os.Parcel r8 = com.google.android.gms.common.internal.safeparcel.zzb.zzD(r8, r9)
            r8.setDataPosition(r1)
            java.util.Map r7 = r7.zzrP()
            r5.zza((java.lang.StringBuilder) r6, (java.util.Map<java.lang.String, com.google.android.gms.internal.zzbgi<?, ?>>) r7, (android.os.Parcel) r8)
            return
        L_0x00e7:
            android.os.Bundle r7 = com.google.android.gms.common.internal.safeparcel.zzb.zzs(r8, r9)
            java.util.Set r8 = r7.keySet()
            r8.size()
            java.lang.String r9 = "{"
            r6.append(r9)
            java.util.Iterator r8 = r8.iterator()
            r9 = 1
        L_0x00fc:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0138
            java.lang.Object r0 = r8.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r9 != 0) goto L_0x010f
            java.lang.String r9 = ","
            r6.append(r9)
        L_0x010f:
            java.lang.String r9 = "\""
            r6.append(r9)
            r6.append(r0)
            java.lang.String r9 = "\""
            r6.append(r9)
            java.lang.String r9 = ":"
            r6.append(r9)
            java.lang.String r9 = "\""
            r6.append(r9)
            java.lang.String r9 = r7.getString(r0)
            java.lang.String r9 = com.google.android.gms.common.util.zzo.zzcK(r9)
            r6.append(r9)
            java.lang.String r9 = "\""
            r6.append(r9)
            r9 = 0
            goto L_0x00fc
        L_0x0138:
            java.lang.String r7 = "}"
            r6.append(r7)
            return
        L_0x013e:
            byte[] r7 = com.google.android.gms.common.internal.safeparcel.zzb.zzt(r8, r9)
            java.lang.String r8 = "\""
            r6.append(r8)
            java.lang.String r7 = com.google.android.gms.common.util.zzc.zzg(r7)
            r6.append(r7)
            java.lang.String r7 = "\""
            r6.append(r7)
            return
        L_0x0154:
            byte[] r7 = com.google.android.gms.common.internal.safeparcel.zzb.zzt(r8, r9)
            java.lang.String r8 = "\""
            r6.append(r8)
            java.lang.String r7 = com.google.android.gms.common.util.zzc.encode(r7)
            r6.append(r7)
            java.lang.String r7 = "\""
            r6.append(r7)
            return
        L_0x016a:
            java.lang.String r7 = com.google.android.gms.common.internal.safeparcel.zzb.zzq(r8, r9)
            java.lang.String r8 = "\""
            r6.append(r8)
            java.lang.String r7 = com.google.android.gms.common.util.zzo.zzcK(r7)
            r6.append(r7)
            java.lang.String r7 = "\""
            r6.append(r7)
            return
        L_0x0180:
            boolean r7 = com.google.android.gms.common.internal.safeparcel.zzb.zzc(r8, r9)
            r6.append(r7)
            return
        L_0x0188:
            java.math.BigDecimal r7 = com.google.android.gms.common.internal.safeparcel.zzb.zzp(r8, r9)
            r6.append(r7)
            return
        L_0x0190:
            double r7 = com.google.android.gms.common.internal.safeparcel.zzb.zzn(r8, r9)
            r6.append(r7)
            return
        L_0x0198:
            float r7 = com.google.android.gms.common.internal.safeparcel.zzb.zzl(r8, r9)
            r6.append(r7)
            return
        L_0x01a0:
            long r7 = com.google.android.gms.common.internal.safeparcel.zzb.zzi(r8, r9)
            r6.append(r7)
            return
        L_0x01a8:
            java.math.BigInteger r7 = com.google.android.gms.common.internal.safeparcel.zzb.zzk(r8, r9)
            r6.append(r7)
            return
        L_0x01b0:
            int r7 = com.google.android.gms.common.internal.safeparcel.zzb.zzg(r8, r9)
            r6.append(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzbgs.zza(java.lang.StringBuilder, com.google.android.gms.internal.zzbgi, android.os.Parcel, int):void");
    }

    private final void zza(StringBuilder sb, Map<String, zzbgi<?, ?>> map, Parcel parcel) {
        Object obj;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry next : map.entrySet()) {
            sparseArray.put(((zzbgi) next.getValue()).zzaIM, next);
        }
        sb.append('{');
        int zzd = zzb.zzd(parcel);
        boolean z = false;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            Map.Entry entry = (Map.Entry) sparseArray.get(65535 & readInt);
            if (entry != null) {
                if (z) {
                    sb.append(",");
                }
                zzbgi zzbgi = (zzbgi) entry.getValue();
                sb.append("\"");
                sb.append((String) entry.getKey());
                sb.append("\":");
                if (zzbgi.zzrO()) {
                    switch (zzbgi.zzaIJ) {
                        case 0:
                            obj = Integer.valueOf(zzb.zzg(parcel, readInt));
                            break;
                        case 1:
                            obj = zzb.zzk(parcel, readInt);
                            break;
                        case 2:
                            obj = Long.valueOf(zzb.zzi(parcel, readInt));
                            break;
                        case 3:
                            obj = Float.valueOf(zzb.zzl(parcel, readInt));
                            break;
                        case 4:
                            obj = Double.valueOf(zzb.zzn(parcel, readInt));
                            break;
                        case 5:
                            obj = zzb.zzp(parcel, readInt);
                            break;
                        case 6:
                            obj = Boolean.valueOf(zzb.zzc(parcel, readInt));
                            break;
                        case e.l /*?: ONE_ARG  (7 int)*/:
                            obj = zzb.zzq(parcel, readInt);
                            break;
                        case 8:
                        case 9:
                            obj = zzb.zzt(parcel, readInt);
                            break;
                        case 10:
                            obj = zzo(zzb.zzs(parcel, readInt));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            int i = zzbgi.zzaIJ;
                            StringBuilder sb2 = new StringBuilder(36);
                            sb2.append("Unknown field out type = ");
                            sb2.append(i);
                            throw new IllegalArgumentException(sb2.toString());
                    }
                    zzb(sb, zzbgi, zza(zzbgi, obj));
                } else {
                    zza(sb, zzbgi, parcel, readInt);
                }
                z = true;
            }
        }
        if (parcel.dataPosition() == zzd) {
            sb.append('}');
            return;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Overread allowed size end=");
        sb3.append(zzd);
        throw new com.google.android.gms.common.internal.safeparcel.zzc(sb3.toString(), parcel);
    }

    private final void zzb(StringBuilder sb, zzbgi<?, ?> zzbgi, Object obj) {
        if (zzbgi.zzaII) {
            ArrayList arrayList = (ArrayList) obj;
            sb.append("[");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(",");
                }
                zza(sb, zzbgi.zzaIH, arrayList.get(i));
            }
            sb.append("]");
            return;
        }
        zza(sb, zzbgi.zzaIH, obj);
    }

    private static HashMap<String, String> zzo(Bundle bundle) {
        HashMap<String, String> hashMap = new HashMap<>();
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return hashMap;
    }

    private Parcel zzrT() {
        switch (this.zzaIY) {
            case 0:
                this.zzaIZ = zzd.zze(this.zzaIW);
                break;
            case 1:
                break;
        }
        zzd.zzI(this.zzaIW, this.zzaIZ);
        this.zzaIY = 2;
        return this.zzaIW;
    }

    public String toString() {
        zzbo.zzb(this.zzaIP, (Object) "Cannot convert to JSON on client side.");
        Parcel zzrT = zzrT();
        zzrT.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        zza(sb, this.zzaIP.zzcJ(this.mClassName), zzrT);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzbgn zzbgn;
        int zze = zzd.zze(parcel);
        zzd.zzc(parcel, 1, this.zzaku);
        zzd.zza(parcel, 2, zzrT(), false);
        switch (this.zzaIX) {
            case 0:
                zzbgn = null;
                break;
            case 1:
            case 2:
                zzbgn = this.zzaIP;
                break;
            default:
                int i2 = this.zzaIX;
                StringBuilder sb = new StringBuilder(34);
                sb.append("Invalid creation type: ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
        zzd.zza(parcel, 3, (Parcelable) zzbgn, i, false);
        zzd.zzI(parcel, zze);
    }

    public final Object zzcH(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public final boolean zzcI(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public final Map<String, zzbgi<?, ?>> zzrL() {
        if (this.zzaIP == null) {
            return null;
        }
        return this.zzaIP.zzcJ(this.mClassName);
    }
}
