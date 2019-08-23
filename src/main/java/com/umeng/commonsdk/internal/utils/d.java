package com.umeng.commonsdk.internal.utils;

import java.io.InputStream;

public class d {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f80771a;

        /* renamed from: b  reason: collision with root package name */
        public String f80772b;

        /* renamed from: c  reason: collision with root package name */
        public int f80773c;

        /* renamed from: d  reason: collision with root package name */
        public String f80774d;

        /* renamed from: e  reason: collision with root package name */
        public String f80775e;

        /* renamed from: f  reason: collision with root package name */
        public String f80776f;
        public String g;
        public String h;
        public String i;
        public String j;
        public String k;
        public String l;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0024 A[SYNTHETIC, Splitter:B:15:0x0024] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002a A[SYNTHETIC, Splitter:B:21:0x002a] */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String d() {
        /*
            java.lang.String r0 = ""
            r1 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ Exception -> 0x0028, all -> 0x0021 }
            java.lang.String r3 = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq"
            r2.<init>(r3)     // Catch:{ Exception -> 0x0028, all -> 0x0021 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0028, all -> 0x0021 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0028, all -> 0x0021 }
            java.lang.String r1 = r3.readLine()     // Catch:{ Exception -> 0x001f, all -> 0x001c }
            java.lang.String r1 = r1.trim()     // Catch:{ Exception -> 0x001f, all -> 0x001c }
            r3.close()     // Catch:{ Throwable -> 0x001a }
        L_0x001a:
            r0 = r1
            goto L_0x002d
        L_0x001c:
            r0 = move-exception
            r1 = r3
            goto L_0x0022
        L_0x001f:
            r1 = r3
            goto L_0x0028
        L_0x0021:
            r0 = move-exception
        L_0x0022:
            if (r1 == 0) goto L_0x0027
            r1.close()     // Catch:{ Throwable -> 0x0027 }
        L_0x0027:
            throw r0
        L_0x0028:
            if (r1 == 0) goto L_0x002d
            r1.close()     // Catch:{ Throwable -> 0x002d }
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.utils.d.d():java.lang.String");
    }

    public static String b() {
        String str = "";
        try {
            InputStream inputStream = new ProcessBuilder(new String[]{"/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"}).start().getInputStream();
            while (inputStream.read(new byte[24]) != -1) {
                str = str + new String(r2);
            }
            inputStream.close();
        } catch (Exception unused) {
        }
        return str.trim();
    }

    public static String c() {
        String str = "";
        try {
            InputStream inputStream = new ProcessBuilder(new String[]{"/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq"}).start().getInputStream();
            while (inputStream.read(new byte[24]) != -1) {
                str = str + new String(r2);
            }
            inputStream.close();
        } catch (Exception unused) {
        }
        return str.trim();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|(4:13|(14:15|(1:20)|(1:26)|(1:32)|(1:38)|(1:44)|(1:50)|(1:56)|(1:62)|(1:68)|(1:74)|(1:80)|(2:86|127)|87)|11|10)|88|89|90|91|124|126) */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0123, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0124, code lost:
        r3 = null;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0134, code lost:
        r8 = 0;
        r2 = null;
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0117, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0119, code lost:
        r0 = r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:90:0x0111 */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0123 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0002] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0129 A[SYNTHETIC, Splitter:B:107:0x0129] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0130 A[SYNTHETIC, Splitter:B:111:0x0130] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0139 A[SYNTHETIC, Splitter:B:118:0x0139] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0140 A[SYNTHETIC, Splitter:B:122:0x0140] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0117 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:7:0x0013] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.umeng.commonsdk.internal.utils.d.a a() {
        /*
            r0 = 0
            r1 = 0
            com.umeng.commonsdk.internal.utils.d$a r2 = new com.umeng.commonsdk.internal.utils.d$a     // Catch:{ Exception -> 0x0134, all -> 0x0123 }
            r2.<init>()     // Catch:{ Exception -> 0x0134, all -> 0x0123 }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ Exception -> 0x0120, all -> 0x0123 }
            java.lang.String r4 = "/proc/cpuinfo"
            r3.<init>(r4)     // Catch:{ Exception -> 0x0120, all -> 0x0123 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            r4.<init>(r3)     // Catch:{ Exception -> 0x011e, all -> 0x011b }
            java.lang.String r0 = r4.readLine()     // Catch:{ Exception -> 0x0119, all -> 0x0117 }
            r5 = 1
            r6 = 0
            r7 = 1
            r8 = 0
        L_0x001b:
            boolean r9 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            if (r9 != 0) goto L_0x010e
            int r6 = r6 + r5
            r9 = 30
            if (r6 >= r9) goto L_0x010e
            java.lang.String r9 = ":\\s+"
            r10 = 2
            java.lang.String[] r0 = r0.split(r9, r10)     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            if (r7 == 0) goto L_0x0039
            if (r0 == 0) goto L_0x0039
            int r9 = r0.length     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            if (r9 <= r5) goto L_0x0039
            r7 = r0[r5]     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            r2.f80771a = r7     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            r7 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x004a
            int r9 = r0.length     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            if (r9 <= r5) goto L_0x004a
            r9 = r0[r1]     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            java.lang.String r10 = "processor"
            boolean r9 = r9.contains(r10)     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            if (r9 == 0) goto L_0x004a
            int r8 = r8 + 1
        L_0x004a:
            if (r0 == 0) goto L_0x005d
            int r9 = r0.length     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            if (r9 <= r5) goto L_0x005d
            r9 = r0[r1]     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            java.lang.String r10 = "Features"
            boolean r9 = r9.contains(r10)     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            if (r9 == 0) goto L_0x005d
            r9 = r0[r5]     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            r2.f80774d = r9     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
        L_0x005d:
            if (r0 == 0) goto L_0x0070
            int r9 = r0.length     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            if (r9 <= r5) goto L_0x0070
            r9 = r0[r1]     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            java.lang.String r10 = "implementer"
            boolean r9 = r9.contains(r10)     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            if (r9 == 0) goto L_0x0070
            r9 = r0[r5]     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            r2.f80775e = r9     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
        L_0x0070:
            if (r0 == 0) goto L_0x0083
            int r9 = r0.length     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            if (r9 <= r5) goto L_0x0083
            r9 = r0[r1]     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            java.lang.String r10 = "architecture"
            boolean r9 = r9.contains(r10)     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            if (r9 == 0) goto L_0x0083
            r9 = r0[r5]     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            r2.f80776f = r9     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
        L_0x0083:
            if (r0 == 0) goto L_0x0096
            int r9 = r0.length     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            if (r9 <= r5) goto L_0x0096
            r9 = r0[r1]     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            java.lang.String r10 = "variant"
            boolean r9 = r9.contains(r10)     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            if (r9 == 0) goto L_0x0096
            r9 = r0[r5]     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            r2.g = r9     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
        L_0x0096:
            if (r0 == 0) goto L_0x00a9
            int r9 = r0.length     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            if (r9 <= r5) goto L_0x00a9
            r9 = r0[r1]     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            java.lang.String r10 = "part"
            boolean r9 = r9.contains(r10)     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            if (r9 == 0) goto L_0x00a9
            r9 = r0[r5]     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            r2.h = r9     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
        L_0x00a9:
            if (r0 == 0) goto L_0x00bc
            int r9 = r0.length     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            if (r9 <= r5) goto L_0x00bc
            r9 = r0[r1]     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            java.lang.String r10 = "revision"
            boolean r9 = r9.contains(r10)     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            if (r9 == 0) goto L_0x00bc
            r9 = r0[r5]     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            r2.i = r9     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
        L_0x00bc:
            if (r0 == 0) goto L_0x00cf
            int r9 = r0.length     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            if (r9 <= r5) goto L_0x00cf
            r9 = r0[r1]     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            java.lang.String r10 = "Hardware"
            boolean r9 = r9.contains(r10)     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            if (r9 == 0) goto L_0x00cf
            r9 = r0[r5]     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            r2.j = r9     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
        L_0x00cf:
            if (r0 == 0) goto L_0x00e2
            int r9 = r0.length     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            if (r9 <= r5) goto L_0x00e2
            r9 = r0[r1]     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            java.lang.String r10 = "Revision"
            boolean r9 = r9.contains(r10)     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            if (r9 == 0) goto L_0x00e2
            r9 = r0[r5]     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            r2.k = r9     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
        L_0x00e2:
            if (r0 == 0) goto L_0x00f5
            int r9 = r0.length     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            if (r9 <= r5) goto L_0x00f5
            r9 = r0[r1]     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            java.lang.String r10 = "Serial"
            boolean r9 = r9.contains(r10)     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            if (r9 == 0) goto L_0x00f5
            r9 = r0[r5]     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            r2.l = r9     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
        L_0x00f5:
            if (r0 == 0) goto L_0x0108
            int r9 = r0.length     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            if (r9 <= r5) goto L_0x0108
            r9 = r0[r1]     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            java.lang.String r10 = "implementer"
            boolean r9 = r9.contains(r10)     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            if (r9 == 0) goto L_0x0108
            r0 = r0[r5]     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            r2.f80775e = r0     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
        L_0x0108:
            java.lang.String r0 = r4.readLine()     // Catch:{ Exception -> 0x0115, all -> 0x0117 }
            goto L_0x001b
        L_0x010e:
            r3.close()     // Catch:{ IOException -> 0x0111 }
        L_0x0111:
            r4.close()     // Catch:{ IOException -> 0x0143 }
            goto L_0x0143
        L_0x0115:
            r0 = r4
            goto L_0x0137
        L_0x0117:
            r0 = move-exception
            goto L_0x0127
        L_0x0119:
            r0 = r4
            goto L_0x011e
        L_0x011b:
            r1 = move-exception
            r4 = r0
            goto L_0x0126
        L_0x011e:
            r8 = 0
            goto L_0x0137
        L_0x0120:
            r8 = 0
            r3 = r0
            goto L_0x0137
        L_0x0123:
            r1 = move-exception
            r3 = r0
            r4 = r3
        L_0x0126:
            r0 = r1
        L_0x0127:
            if (r3 == 0) goto L_0x012e
            r3.close()     // Catch:{ IOException -> 0x012d }
            goto L_0x012e
        L_0x012d:
        L_0x012e:
            if (r4 == 0) goto L_0x0133
            r4.close()     // Catch:{ IOException -> 0x0133 }
        L_0x0133:
            throw r0
        L_0x0134:
            r8 = 0
            r2 = r0
            r3 = r2
        L_0x0137:
            if (r3 == 0) goto L_0x013e
            r3.close()     // Catch:{ IOException -> 0x013d }
            goto L_0x013e
        L_0x013d:
        L_0x013e:
            if (r0 == 0) goto L_0x0143
            r0.close()     // Catch:{ IOException -> 0x0143 }
        L_0x0143:
            r2.f80773c = r8
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.utils.d.a():com.umeng.commonsdk.internal.utils.d$a");
    }
}
