package com.xiaomi.push;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;

public class fa extends ex {
    public fa(Context context, int i) {
        super(context, i);
    }

    private double a(double d2) {
        int i = 1;
        while (true) {
            double d3 = (double) i;
            if (d3 >= d2) {
                return d3;
            }
            i <<= 1;
        }
    }

    private long a(File file) {
        StatFs statFs = new StatFs(file.getPath());
        return ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount());
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065 A[SYNTHETIC, Splitter:B:24:0x0065] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006d A[SYNTHETIC, Splitter:B:31:0x006d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String b() {
        /*
            r6 = this;
            java.lang.String r0 = "0"
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "/proc/meminfo"
            r1.<init>(r2)
            boolean r1 = r1.exists()
            if (r1 == 0) goto L_0x0070
            r1 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ Exception -> 0x0069, all -> 0x0062 }
            java.lang.String r3 = "/proc/meminfo"
            r2.<init>(r3)     // Catch:{ Exception -> 0x0069, all -> 0x0062 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0069, all -> 0x0062 }
            r4 = 8192(0x2000, float:1.14794E-41)
            r3.<init>(r2, r4)     // Catch:{ Exception -> 0x0069, all -> 0x0062 }
            java.lang.String r1 = r3.readLine()     // Catch:{ Exception -> 0x0060, all -> 0x005d }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0060, all -> 0x005d }
            if (r2 != 0) goto L_0x0059
            java.lang.String r2 = "\\s+"
            java.lang.String[] r1 = r1.split(r2)     // Catch:{ Exception -> 0x0060, all -> 0x005d }
            if (r1 == 0) goto L_0x0059
            int r2 = r1.length     // Catch:{ Exception -> 0x0060, all -> 0x005d }
            r4 = 2
            if (r2 < r4) goto L_0x0059
            r0 = 1
            r0 = r1[r0]     // Catch:{ Exception -> 0x0060, all -> 0x005d }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ Exception -> 0x0060, all -> 0x005d }
            double r0 = r0.doubleValue()     // Catch:{ Exception -> 0x0060, all -> 0x005d }
            r4 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r0 = r0 / r4
            double r0 = r0 / r4
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x004d
            double r0 = java.lang.Math.ceil(r0)     // Catch:{ Exception -> 0x0060, all -> 0x005d }
        L_0x004d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0060, all -> 0x005d }
            r2.<init>()     // Catch:{ Exception -> 0x0060, all -> 0x005d }
            r2.append(r0)     // Catch:{ Exception -> 0x0060, all -> 0x005d }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0060, all -> 0x005d }
        L_0x0059:
            r3.close()     // Catch:{ IOException -> 0x0070 }
            goto L_0x0070
        L_0x005d:
            r0 = move-exception
            r1 = r3
            goto L_0x0063
        L_0x0060:
            r1 = r3
            goto L_0x0069
        L_0x0062:
            r0 = move-exception
        L_0x0063:
            if (r1 == 0) goto L_0x0068
            r1.close()     // Catch:{ IOException -> 0x0068 }
        L_0x0068:
            throw r0
        L_0x0069:
            java.lang.String r0 = "0"
            if (r1 == 0) goto L_0x0070
            r1.close()     // Catch:{ IOException -> 0x0070 }
        L_0x0070:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "GB"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.fa.b():java.lang.String");
    }

    private String c() {
        double a2 = (double) a(Environment.getDataDirectory());
        Double.isNaN(a2);
        double a3 = a(((a2 / 1024.0d) / 1024.0d) / 1024.0d);
        return a3 + "GB";
    }

    public int a() {
        return 23;
    }

    /* renamed from: a  reason: collision with other method in class */
    public im m219a() {
        return im.Storage;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m220a() {
        return "ram:" + b() + ",rom:" + c();
    }
}
