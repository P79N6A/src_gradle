package com.amap.api.mapcore2d;

import android.content.Context;
import android.os.Looper;

public class dh extends dk {

    /* renamed from: b  reason: collision with root package name */
    private static boolean f5955b = true;

    /* renamed from: c  reason: collision with root package name */
    private String[] f5956c = new String[10];

    /* renamed from: d  reason: collision with root package name */
    private int f5957d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5958e;

    /* renamed from: f  reason: collision with root package name */
    private int f5959f;

    private String e() {
        StringBuilder sb = new StringBuilder();
        try {
            int i = this.f5957d;
            while (i < 10 && i <= 9) {
                sb.append(this.f5956c[i]);
                i++;
            }
            for (int i2 = 0; i2 < this.f5957d; i2++) {
                sb.append(this.f5956c[i2]);
            }
        } catch (Throwable th) {
            dd.a(th, "ANRWriter", "getLogInfo");
        }
        return sb.toString();
    }

    protected dh(int i) {
        super(i);
    }

    private void c(String str) {
        try {
            if (this.f5957d > 9) {
                this.f5957d = 0;
            }
            this.f5956c[this.f5957d] = str;
            this.f5957d++;
        } catch (Throwable th) {
            dd.a(th, "ANRWriter", "addData");
        }
    }

    /* access modifiers changed from: protected */
    public boolean a(Context context) {
        if (ct.m(context) != 1 || !f5955b) {
            return false;
        }
        f5955b = false;
        synchronized (Looper.getMainLooper()) {
            dx dxVar = new dx(context);
            dy a2 = dxVar.a();
            if (a2 == null) {
                return true;
            }
            if (!a2.c()) {
                return false;
            }
            a2.c(false);
            dxVar.a(a2);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0090 */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0152 A[SYNTHETIC, Splitter:B:110:0x0152] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0169 A[SYNTHETIC, Splitter:B:117:0x0169] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0175 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00db A[SYNTHETIC, Splitter:B:66:0x00db] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00f2 A[SYNTHETIC, Splitter:B:73:0x00f2] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0103 A[SYNTHETIC, Splitter:B:81:0x0103] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x011a A[SYNTHETIC, Splitter:B:88:0x011a] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0121 A[SYNTHETIC, Splitter:B:92:0x0121] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0138 A[SYNTHETIC, Splitter:B:99:0x0138] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a(java.util.List<com.amap.api.mapcore2d.cy> r9) {
        /*
            r8 = this;
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ FileNotFoundException -> 0x014e, IOException -> 0x00f7, Throwable -> 0x00cf, all -> 0x00cb }
            java.lang.String r2 = "/data/anr/traces.txt"
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x014e, IOException -> 0x00f7, Throwable -> 0x00cf, all -> 0x00cb }
            boolean r2 = r1.exists()     // Catch:{ FileNotFoundException -> 0x014e, IOException -> 0x00f7, Throwable -> 0x00cf, all -> 0x00cb }
            if (r2 != 0) goto L_0x000f
            return r0
        L_0x000f:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x014e, IOException -> 0x00f7, Throwable -> 0x00cf, all -> 0x00cb }
            r2.<init>(r1)     // Catch:{ FileNotFoundException -> 0x014e, IOException -> 0x00f7, Throwable -> 0x00cf, all -> 0x00cb }
            int r1 = r2.available()     // Catch:{ FileNotFoundException -> 0x00c8, IOException -> 0x00c5, Throwable -> 0x00c2, all -> 0x00be }
            r3 = 1024000(0xfa000, float:1.43493E-39)
            if (r1 <= r3) goto L_0x0022
            int r1 = r1 - r3
            long r3 = (long) r1     // Catch:{ FileNotFoundException -> 0x00c8, IOException -> 0x00c5, Throwable -> 0x00c2, all -> 0x00be }
            r2.skip(r3)     // Catch:{ FileNotFoundException -> 0x00c8, IOException -> 0x00c5, Throwable -> 0x00c2, all -> 0x00be }
        L_0x0022:
            com.amap.api.mapcore2d.en r1 = new com.amap.api.mapcore2d.en     // Catch:{ FileNotFoundException -> 0x00c8, IOException -> 0x00c5, Throwable -> 0x00c2, all -> 0x00be }
            java.nio.charset.Charset r3 = com.amap.api.mapcore2d.eo.f6071a     // Catch:{ FileNotFoundException -> 0x00c8, IOException -> 0x00c5, Throwable -> 0x00c2, all -> 0x00be }
            r1.<init>(r2, r3)     // Catch:{ FileNotFoundException -> 0x00c8, IOException -> 0x00c5, Throwable -> 0x00c2, all -> 0x00be }
            r3 = 0
        L_0x002a:
            java.lang.String r4 = r1.a()     // Catch:{ EOFException -> 0x0090, FileNotFoundException -> 0x0150, IOException -> 0x008d, Throwable -> 0x008b }
            java.lang.String r4 = r4.trim()     // Catch:{ EOFException -> 0x0090, FileNotFoundException -> 0x0150, IOException -> 0x008d, Throwable -> 0x008b }
            java.lang.String r5 = "pid"
            boolean r5 = r4.contains(r5)     // Catch:{ EOFException -> 0x0090, FileNotFoundException -> 0x0150, IOException -> 0x008d, Throwable -> 0x008b }
            r6 = 1
            if (r5 == 0) goto L_0x0049
        L_0x003b:
            java.lang.String r3 = "\"main\""
            boolean r3 = r4.startsWith(r3)     // Catch:{ EOFException -> 0x0090, FileNotFoundException -> 0x0150, IOException -> 0x008d, Throwable -> 0x008b }
            if (r3 != 0) goto L_0x0048
            java.lang.String r4 = r1.a()     // Catch:{ EOFException -> 0x0090, FileNotFoundException -> 0x0150, IOException -> 0x008d, Throwable -> 0x008b }
            goto L_0x003b
        L_0x0048:
            r3 = 1
        L_0x0049:
            java.lang.String r5 = ""
            boolean r5 = r4.equals(r5)     // Catch:{ EOFException -> 0x0090, FileNotFoundException -> 0x0150, IOException -> 0x008d, Throwable -> 0x008b }
            if (r5 == 0) goto L_0x0054
            if (r3 == 0) goto L_0x0054
            goto L_0x0090
        L_0x0054:
            if (r3 == 0) goto L_0x002a
            r8.c(r4)     // Catch:{ EOFException -> 0x0090, FileNotFoundException -> 0x0150, IOException -> 0x008d, Throwable -> 0x008b }
            int r5 = r8.f5959f     // Catch:{ EOFException -> 0x0090, FileNotFoundException -> 0x0150, IOException -> 0x008d, Throwable -> 0x008b }
            r7 = 5
            if (r5 != r7) goto L_0x005f
            goto L_0x0090
        L_0x005f:
            boolean r5 = r8.f5958e     // Catch:{ EOFException -> 0x0090, FileNotFoundException -> 0x0150, IOException -> 0x008d, Throwable -> 0x008b }
            if (r5 != 0) goto L_0x0085
            java.util.Iterator r5 = r9.iterator()     // Catch:{ EOFException -> 0x0090, FileNotFoundException -> 0x0150, IOException -> 0x008d, Throwable -> 0x008b }
        L_0x0067:
            boolean r6 = r5.hasNext()     // Catch:{ EOFException -> 0x0090, FileNotFoundException -> 0x0150, IOException -> 0x008d, Throwable -> 0x008b }
            if (r6 == 0) goto L_0x002a
            java.lang.Object r6 = r5.next()     // Catch:{ EOFException -> 0x0090, FileNotFoundException -> 0x0150, IOException -> 0x008d, Throwable -> 0x008b }
            com.amap.api.mapcore2d.cy r6 = (com.amap.api.mapcore2d.cy) r6     // Catch:{ EOFException -> 0x0090, FileNotFoundException -> 0x0150, IOException -> 0x008d, Throwable -> 0x008b }
            java.lang.String[] r7 = r6.g()     // Catch:{ EOFException -> 0x0090, FileNotFoundException -> 0x0150, IOException -> 0x008d, Throwable -> 0x008b }
            boolean r7 = b((java.lang.String[]) r7, (java.lang.String) r4)     // Catch:{ EOFException -> 0x0090, FileNotFoundException -> 0x0150, IOException -> 0x008d, Throwable -> 0x008b }
            r8.f5958e = r7     // Catch:{ EOFException -> 0x0090, FileNotFoundException -> 0x0150, IOException -> 0x008d, Throwable -> 0x008b }
            boolean r7 = r8.f5958e     // Catch:{ EOFException -> 0x0090, FileNotFoundException -> 0x0150, IOException -> 0x008d, Throwable -> 0x008b }
            if (r7 == 0) goto L_0x0067
            r8.a((com.amap.api.mapcore2d.cy) r6)     // Catch:{ EOFException -> 0x0090, FileNotFoundException -> 0x0150, IOException -> 0x008d, Throwable -> 0x008b }
            goto L_0x002a
        L_0x0085:
            int r4 = r8.f5959f     // Catch:{ EOFException -> 0x0090, FileNotFoundException -> 0x0150, IOException -> 0x008d, Throwable -> 0x008b }
            int r4 = r4 + r6
            r8.f5959f = r4     // Catch:{ EOFException -> 0x0090, FileNotFoundException -> 0x0150, IOException -> 0x008d, Throwable -> 0x008b }
            goto L_0x002a
        L_0x008b:
            r9 = move-exception
            goto L_0x00d2
        L_0x008d:
            r9 = move-exception
            goto L_0x00fa
        L_0x0090:
            r1.close()     // Catch:{ IOException -> 0x009d, Throwable -> 0x0094 }
            goto L_0x00a5
        L_0x0094:
            r9 = move-exception
            java.lang.String r1 = "ANRWriter"
            java.lang.String r3 = "initLog2"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r9, (java.lang.String) r1, (java.lang.String) r3)
            goto L_0x00a5
        L_0x009d:
            r9 = move-exception
            java.lang.String r1 = "ANRWriter"
            java.lang.String r3 = "initLog1"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r9, (java.lang.String) r1, (java.lang.String) r3)
        L_0x00a5:
            r2.close()     // Catch:{ IOException -> 0x00b4, Throwable -> 0x00aa }
            goto L_0x016c
        L_0x00aa:
            r9 = move-exception
            java.lang.String r1 = "ANRWriter"
            java.lang.String r2 = "initLog4"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r9, (java.lang.String) r1, (java.lang.String) r2)
            goto L_0x016c
        L_0x00b4:
            r9 = move-exception
            java.lang.String r1 = "ANRWriter"
            java.lang.String r2 = "initLog3"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r9, (java.lang.String) r1, (java.lang.String) r2)
            goto L_0x016c
        L_0x00be:
            r9 = move-exception
            r1 = r0
            goto L_0x011f
        L_0x00c2:
            r9 = move-exception
            r1 = r0
            goto L_0x00d2
        L_0x00c5:
            r9 = move-exception
            r1 = r0
            goto L_0x00fa
        L_0x00c8:
            r1 = r0
            goto L_0x0150
        L_0x00cb:
            r9 = move-exception
            r1 = r0
            r2 = r1
            goto L_0x011f
        L_0x00cf:
            r9 = move-exception
            r1 = r0
            r2 = r1
        L_0x00d2:
            java.lang.String r3 = "ANRWriter"
            java.lang.String r4 = "initLog"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r9, (java.lang.String) r3, (java.lang.String) r4)     // Catch:{ all -> 0x011e }
            if (r1 == 0) goto L_0x00f0
            r1.close()     // Catch:{ IOException -> 0x00e8, Throwable -> 0x00df }
            goto L_0x00f0
        L_0x00df:
            r9 = move-exception
            java.lang.String r1 = "ANRWriter"
            java.lang.String r3 = "initLog2"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r9, (java.lang.String) r1, (java.lang.String) r3)
            goto L_0x00f0
        L_0x00e8:
            r9 = move-exception
            java.lang.String r1 = "ANRWriter"
            java.lang.String r3 = "initLog1"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r9, (java.lang.String) r1, (java.lang.String) r3)
        L_0x00f0:
            if (r2 == 0) goto L_0x016c
            r2.close()     // Catch:{ IOException -> 0x00b4, Throwable -> 0x00aa }
            goto L_0x016c
        L_0x00f7:
            r9 = move-exception
            r1 = r0
            r2 = r1
        L_0x00fa:
            java.lang.String r3 = "ANRWriter"
            java.lang.String r4 = "initLog"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r9, (java.lang.String) r3, (java.lang.String) r4)     // Catch:{ all -> 0x011e }
            if (r1 == 0) goto L_0x0118
            r1.close()     // Catch:{ IOException -> 0x0110, Throwable -> 0x0107 }
            goto L_0x0118
        L_0x0107:
            r9 = move-exception
            java.lang.String r1 = "ANRWriter"
            java.lang.String r3 = "initLog2"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r9, (java.lang.String) r1, (java.lang.String) r3)
            goto L_0x0118
        L_0x0110:
            r9 = move-exception
            java.lang.String r1 = "ANRWriter"
            java.lang.String r3 = "initLog1"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r9, (java.lang.String) r1, (java.lang.String) r3)
        L_0x0118:
            if (r2 == 0) goto L_0x016c
            r2.close()     // Catch:{ IOException -> 0x00b4, Throwable -> 0x00aa }
            goto L_0x016c
        L_0x011e:
            r9 = move-exception
        L_0x011f:
            if (r1 == 0) goto L_0x0136
            r1.close()     // Catch:{ IOException -> 0x012e, Throwable -> 0x0125 }
            goto L_0x0136
        L_0x0125:
            r0 = move-exception
            java.lang.String r1 = "ANRWriter"
            java.lang.String r3 = "initLog2"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r0, (java.lang.String) r1, (java.lang.String) r3)
            goto L_0x0136
        L_0x012e:
            r0 = move-exception
            java.lang.String r1 = "ANRWriter"
            java.lang.String r3 = "initLog1"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r0, (java.lang.String) r1, (java.lang.String) r3)
        L_0x0136:
            if (r2 == 0) goto L_0x014d
            r2.close()     // Catch:{ IOException -> 0x0145, Throwable -> 0x013c }
            goto L_0x014d
        L_0x013c:
            r0 = move-exception
            java.lang.String r1 = "ANRWriter"
            java.lang.String r2 = "initLog4"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r0, (java.lang.String) r1, (java.lang.String) r2)
            goto L_0x014d
        L_0x0145:
            r0 = move-exception
            java.lang.String r1 = "ANRWriter"
            java.lang.String r2 = "initLog3"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r0, (java.lang.String) r1, (java.lang.String) r2)
        L_0x014d:
            throw r9
        L_0x014e:
            r1 = r0
            r2 = r1
        L_0x0150:
            if (r1 == 0) goto L_0x0167
            r1.close()     // Catch:{ IOException -> 0x015f, Throwable -> 0x0156 }
            goto L_0x0167
        L_0x0156:
            r9 = move-exception
            java.lang.String r1 = "ANRWriter"
            java.lang.String r3 = "initLog2"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r9, (java.lang.String) r1, (java.lang.String) r3)
            goto L_0x0167
        L_0x015f:
            r9 = move-exception
            java.lang.String r1 = "ANRWriter"
            java.lang.String r3 = "initLog1"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r9, (java.lang.String) r1, (java.lang.String) r3)
        L_0x0167:
            if (r2 == 0) goto L_0x016c
            r2.close()     // Catch:{ IOException -> 0x00b4, Throwable -> 0x00aa }
        L_0x016c:
            boolean r9 = r8.f5958e
            if (r9 == 0) goto L_0x0175
            java.lang.String r9 = r8.e()
            return r9
        L_0x0175:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.dh.a(java.util.List):java.lang.String");
    }
}
