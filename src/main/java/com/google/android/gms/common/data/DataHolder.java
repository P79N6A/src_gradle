package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.zzd;
import com.google.android.gms.common.internal.zzbo;
import com.google.android.gms.common.internal.zzc;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@KeepName
public final class DataHolder extends com.google.android.gms.common.internal.safeparcel.zza implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new zzf();
    private static final zza zzaFI = new zze(new String[0], null);
    private boolean mClosed;
    private final String[] zzaFB;
    private Bundle zzaFC;
    private final CursorWindow[] zzaFD;
    private final Bundle zzaFE;
    private int[] zzaFF;
    int zzaFG;
    private boolean zzaFH;
    private int zzaku;
    private final int zzaxu;

    public static class zza {
        /* access modifiers changed from: private */
        public final String[] zzaFB;
        /* access modifiers changed from: private */
        public final ArrayList<HashMap<String, Object>> zzaFJ;
        private final String zzaFK;
        private final HashMap<Object, Integer> zzaFL;
        private boolean zzaFM;
        private String zzaFN;

        private zza(String[] strArr, String str) {
            this.zzaFB = (String[]) zzbo.zzu(strArr);
            this.zzaFJ = new ArrayList<>();
            this.zzaFK = str;
            this.zzaFL = new HashMap<>();
            this.zzaFM = false;
            this.zzaFN = null;
        }

        /* synthetic */ zza(String[] strArr, String str, zze zze) {
            this(strArr, null);
        }

        public zza zza(ContentValues contentValues) {
            zzc.zzr(contentValues);
            HashMap hashMap = new HashMap(contentValues.size());
            for (Map.Entry next : contentValues.valueSet()) {
                hashMap.put((String) next.getKey(), next.getValue());
            }
            return zza(hashMap);
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.google.android.gms.common.data.DataHolder.zza zza(java.util.HashMap<java.lang.String, java.lang.Object> r5) {
            /*
                r4 = this;
                com.google.android.gms.common.internal.zzc.zzr(r5)
                java.lang.String r0 = r4.zzaFK
                r1 = -1
                if (r0 != 0) goto L_0x000a
            L_0x0008:
                r0 = -1
                goto L_0x0031
            L_0x000a:
                java.lang.String r0 = r4.zzaFK
                java.lang.Object r0 = r5.get(r0)
                if (r0 != 0) goto L_0x0013
                goto L_0x0008
            L_0x0013:
                java.util.HashMap<java.lang.Object, java.lang.Integer> r2 = r4.zzaFL
                java.lang.Object r2 = r2.get(r0)
                java.lang.Integer r2 = (java.lang.Integer) r2
                if (r2 != 0) goto L_0x002d
                java.util.HashMap<java.lang.Object, java.lang.Integer> r2 = r4.zzaFL
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r3 = r4.zzaFJ
                int r3 = r3.size()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2.put(r0, r3)
                goto L_0x0008
            L_0x002d:
                int r0 = r2.intValue()
            L_0x0031:
                if (r0 != r1) goto L_0x0039
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r0 = r4.zzaFJ
                r0.add(r5)
                goto L_0x0043
            L_0x0039:
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r4.zzaFJ
                r1.remove(r0)
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r4.zzaFJ
                r1.add(r0, r5)
            L_0x0043:
                r5 = 0
                r4.zzaFM = r5
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.DataHolder.zza.zza(java.util.HashMap):com.google.android.gms.common.data.DataHolder$zza");
        }

        public final DataHolder zzav(int i) {
            return new DataHolder(this, 0, (Bundle) null, (zze) null);
        }
    }

    public static class zzb extends RuntimeException {
        public zzb(String str) {
            super(str);
        }
    }

    DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.zzaFH = true;
        this.zzaku = i;
        this.zzaFB = strArr;
        this.zzaFD = cursorWindowArr;
        this.zzaxu = i2;
        this.zzaFE = bundle;
    }

    private DataHolder(zza zza2, int i, Bundle bundle) {
        this(zza2.zzaFB, zza(zza2, -1), i, (Bundle) null);
    }

    /* synthetic */ DataHolder(zza zza2, int i, Bundle bundle, zze zze) {
        this(zza2, 0, null);
    }

    private DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i, Bundle bundle) {
        this.zzaFH = true;
        this.zzaku = 1;
        this.zzaFB = (String[]) zzbo.zzu(strArr);
        this.zzaFD = (CursorWindow[]) zzbo.zzu(cursorWindowArr);
        this.zzaxu = i;
        this.zzaFE = bundle;
        zzqR();
    }

    public static zza zza(String[] strArr) {
        return new zza(strArr, null, null);
    }

    private static CursorWindow[] zza(zza zza2, int i) {
        long j;
        if (zza2.zzaFB.length == 0) {
            return new CursorWindow[0];
        }
        ArrayList zzb2 = zza2.zzaFJ;
        int size = zzb2.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cursorWindow);
        cursorWindow.setNumColumns(zza2.zzaFB.length);
        CursorWindow cursorWindow2 = cursorWindow;
        int i2 = 0;
        boolean z = false;
        while (i2 < size) {
            try {
                if (!cursorWindow2.allocRow()) {
                    cursorWindow2 = new CursorWindow(false);
                    cursorWindow2.setStartPosition(i2);
                    cursorWindow2.setNumColumns(zza2.zzaFB.length);
                    arrayList.add(cursorWindow2);
                    if (!cursorWindow2.allocRow()) {
                        arrayList.remove(cursorWindow2);
                        return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
                    }
                }
                Map map = (Map) zzb2.get(i2);
                boolean z2 = true;
                for (int i3 = 0; i3 < zza2.zzaFB.length && z2; i3++) {
                    String str = zza2.zzaFB[i3];
                    Object obj = map.get(str);
                    if (obj == null) {
                        z2 = cursorWindow2.putNull(i2, i3);
                    } else if (obj instanceof String) {
                        z2 = cursorWindow2.putString((String) obj, i2, i3);
                    } else {
                        if (obj instanceof Long) {
                            j = ((Long) obj).longValue();
                        } else if (obj instanceof Integer) {
                            z2 = cursorWindow2.putLong((long) ((Integer) obj).intValue(), i2, i3);
                        } else if (obj instanceof Boolean) {
                            j = ((Boolean) obj).booleanValue() ? 1 : 0;
                        } else if (obj instanceof byte[]) {
                            z2 = cursorWindow2.putBlob((byte[]) obj, i2, i3);
                        } else if (obj instanceof Double) {
                            z2 = cursorWindow2.putDouble(((Double) obj).doubleValue(), i2, i3);
                        } else if (obj instanceof Float) {
                            z2 = cursorWindow2.putDouble((double) ((Float) obj).floatValue(), i2, i3);
                        } else {
                            String valueOf = String.valueOf(obj);
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(valueOf).length());
                            sb.append("Unsupported object for column ");
                            sb.append(str);
                            sb.append(": ");
                            sb.append(valueOf);
                            throw new IllegalArgumentException(sb.toString());
                        }
                        z2 = cursorWindow2.putLong(j, i2, i3);
                    }
                }
                if (z2) {
                    z = false;
                } else if (!z) {
                    cursorWindow2.freeLastRow();
                    cursorWindow2 = new CursorWindow(false);
                    cursorWindow2.setStartPosition(i2);
                    cursorWindow2.setNumColumns(zza2.zzaFB.length);
                    arrayList.add(cursorWindow2);
                    i2--;
                    z = true;
                } else {
                    throw new zzb("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                }
                i2++;
            } catch (RuntimeException e2) {
                int size2 = arrayList.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ((CursorWindow) arrayList.get(i4)).close();
                }
                throw e2;
            }
        }
        return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
    }

    public static DataHolder zzau(int i) {
        return new DataHolder(zzaFI, i, null);
    }

    private final void zzh(String str, int i) {
        if (this.zzaFC == null || !this.zzaFC.containsKey(str)) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "No such column: ".concat(valueOf) : new String("No such column: "));
        } else if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        } else if (i < 0 || i >= this.zzaFG) {
            throw new CursorIndexOutOfBoundsException(i, this.zzaFG);
        }
    }

    public final void close() {
        synchronized (this) {
            if (!this.mClosed) {
                this.mClosed = true;
                for (CursorWindow close : this.zzaFD) {
                    close.close();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            if (this.zzaFH && this.zzaFD.length > 0 && !isClosed()) {
                close();
            }
        } finally {
            super.finalize();
        }
    }

    public final int getCount() {
        return this.zzaFG;
    }

    public final int getStatusCode() {
        return this.zzaxu;
    }

    public final boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.mClosed;
        }
        return z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzd.zze(parcel);
        zzd.zza(parcel, 1, this.zzaFB, false);
        zzd.zza(parcel, 2, (T[]) this.zzaFD, i, false);
        zzd.zzc(parcel, 3, this.zzaxu);
        zzd.zza(parcel, 4, this.zzaFE, false);
        zzd.zzc(parcel, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, this.zzaku);
        zzd.zzI(parcel, zze);
    }

    public final void zza(String str, int i, int i2, CharArrayBuffer charArrayBuffer) {
        zzh(str, i);
        this.zzaFD[i2].copyStringToBuffer(i, this.zzaFC.getInt(str), charArrayBuffer);
    }

    public final int zzat(int i) {
        int i2 = 0;
        zzbo.zzae(i >= 0 && i < this.zzaFG);
        while (true) {
            if (i2 >= this.zzaFF.length) {
                break;
            } else if (i < this.zzaFF[i2]) {
                i2--;
                break;
            } else {
                i2++;
            }
        }
        return i2 == this.zzaFF.length ? i2 - 1 : i2;
    }

    public final long zzb(String str, int i, int i2) {
        zzh(str, i);
        return this.zzaFD[i2].getLong(i, this.zzaFC.getInt(str));
    }

    public final int zzc(String str, int i, int i2) {
        zzh(str, i);
        return this.zzaFD[i2].getInt(i, this.zzaFC.getInt(str));
    }

    public final boolean zzcv(String str) {
        return this.zzaFC.containsKey(str);
    }

    public final String zzd(String str, int i, int i2) {
        zzh(str, i);
        return this.zzaFD[i2].getString(i, this.zzaFC.getInt(str));
    }

    public final boolean zze(String str, int i, int i2) {
        zzh(str, i);
        return this.zzaFD[i2].getLong(i, this.zzaFC.getInt(str)) == 1;
    }

    public final float zzf(String str, int i, int i2) {
        zzh(str, i);
        return this.zzaFD[i2].getFloat(i, this.zzaFC.getInt(str));
    }

    public final byte[] zzg(String str, int i, int i2) {
        zzh(str, i);
        return this.zzaFD[i2].getBlob(i, this.zzaFC.getInt(str));
    }

    public final boolean zzh(String str, int i, int i2) {
        zzh(str, i);
        return this.zzaFD[i2].isNull(i, this.zzaFC.getInt(str));
    }

    public final Bundle zzqN() {
        return this.zzaFE;
    }

    public final void zzqR() {
        this.zzaFC = new Bundle();
        for (int i = 0; i < this.zzaFB.length; i++) {
            this.zzaFC.putInt(this.zzaFB[i], i);
        }
        this.zzaFF = new int[this.zzaFD.length];
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzaFD.length; i3++) {
            this.zzaFF[i3] = i2;
            i2 += this.zzaFD[i3].getNumRows() - (i2 - this.zzaFD[i3].getStartPosition());
        }
        this.zzaFG = i2;
    }
}
