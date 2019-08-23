package com.ss.android.ugc.aweme.player.sdk.c;

import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.regex.Pattern;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59191a = null;

    /* renamed from: b  reason: collision with root package name */
    private static int f59192b = -1;

    /* renamed from: c  reason: collision with root package name */
    private static int f59193c = -1;

    /* renamed from: d  reason: collision with root package name */
    private static final FileFilter f59194d = new FileFilter() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f59196a;

        public final boolean accept(File file) {
            if (PatchProxy.isSupport(new Object[]{file}, this, f59196a, false, 64496, new Class[]{File.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{file}, this, f59196a, false, 64496, new Class[]{File.class}, Boolean.TYPE)).booleanValue();
            }
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (!Character.isDigit(name.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    };

    /* renamed from: e  reason: collision with root package name */
    private static final Pattern f59195e = Pattern.compile("^0-([\\d]+)$");

    public static int a() {
        int i;
        if (PatchProxy.isSupport(new Object[0], null, f59191a, true, 64486, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f59191a, true, 64486, new Class[0], Integer.TYPE)).intValue();
        }
        if (Build.VERSION.SDK_INT <= 10) {
            return 1;
        }
        if (f59192b > 0) {
            return f59192b;
        }
        int i2 = -1;
        try {
            int a2 = a("/sys/devices/system/cpu/possible");
            if (a2 == -1) {
                a2 = a("/sys/devices/system/cpu/present");
            }
            if (a2 == -1) {
                if (PatchProxy.isSupport(new Object[0], null, f59191a, true, 64489, new Class[0], Integer.TYPE)) {
                    i = ((Integer) PatchProxy.accessDispatch(new Object[0], null, f59191a, true, 64489, new Class[0], Integer.TYPE)).intValue();
                } else {
                    i = new File("/sys/devices/system/cpu/").listFiles(f59194d).length;
                }
                i2 = i;
            } else {
                i2 = a2;
            }
        } catch (NullPointerException | SecurityException unused) {
        }
        f59192b = i2;
        return i2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x008c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b() {
        /*
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f59191a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Integer.TYPE
            r2 = 0
            r4 = 1
            r5 = 64493(0xfbed, float:9.0374E-41)
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002c
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = f59191a
            r5 = 1
            r6 = 64493(0xfbed, float:9.0374E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Integer.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x002c:
            int r1 = f59193c
            if (r1 <= 0) goto L_0x0033
            int r0 = f59193c
            return r0
        L_0x0033:
            r1 = -1
            r2 = 0
            r3 = -1
        L_0x0036:
            int r4 = a()     // Catch:{ IOException -> 0x00b9 }
            if (r2 >= r4) goto L_0x0098
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00b9 }
            java.lang.String r5 = "/sys/devices/system/cpu/cpu"
            r4.<init>(r5)     // Catch:{ IOException -> 0x00b9 }
            r4.append(r2)     // Catch:{ IOException -> 0x00b9 }
            java.lang.String r5 = "/cpufreq/cpuinfo_max_freq"
            r4.append(r5)     // Catch:{ IOException -> 0x00b9 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x00b9 }
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x00b9 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x00b9 }
            boolean r4 = r5.exists()     // Catch:{ IOException -> 0x00b9 }
            if (r4 == 0) goto L_0x0095
            r4 = 128(0x80, float:1.794E-43)
            byte[] r6 = new byte[r4]     // Catch:{ IOException -> 0x00b9 }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00b9 }
            r7.<init>(r5)     // Catch:{ IOException -> 0x00b9 }
            r7.read(r6)     // Catch:{ NumberFormatException -> 0x008c, all -> 0x0090 }
            r5 = 0
        L_0x0067:
            byte r8 = r6[r5]     // Catch:{ NumberFormatException -> 0x008c, all -> 0x0090 }
            boolean r8 = java.lang.Character.isDigit(r8)     // Catch:{ NumberFormatException -> 0x008c, all -> 0x0090 }
            if (r8 == 0) goto L_0x0074
            if (r5 >= r4) goto L_0x0074
            int r5 = r5 + 1
            goto L_0x0067
        L_0x0074:
            java.lang.String r4 = new java.lang.String     // Catch:{ NumberFormatException -> 0x008c, all -> 0x0090 }
            r4.<init>(r6, r0, r5)     // Catch:{ NumberFormatException -> 0x008c, all -> 0x0090 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x008c, all -> 0x0090 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x008c, all -> 0x0090 }
            int r5 = r4.intValue()     // Catch:{ NumberFormatException -> 0x008c, all -> 0x0090 }
            if (r5 <= r3) goto L_0x008c
            int r4 = r4.intValue()     // Catch:{ NumberFormatException -> 0x008c, all -> 0x0090 }
            r3 = r4
        L_0x008c:
            r7.close()     // Catch:{ IOException -> 0x00b9 }
            goto L_0x0095
        L_0x0090:
            r0 = move-exception
            r7.close()     // Catch:{ IOException -> 0x00b9 }
            throw r0     // Catch:{ IOException -> 0x00b9 }
        L_0x0095:
            int r2 = r2 + 1
            goto L_0x0036
        L_0x0098:
            if (r3 != r1) goto L_0x00b7
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00b9 }
            java.lang.String r2 = "/proc/cpuinfo"
            r0.<init>(r2)     // Catch:{ IOException -> 0x00b9 }
            java.lang.String r2 = "cpu MHz"
            int r2 = a(r2, r0)     // Catch:{ all -> 0x00b2 }
            int r2 = r2 * 1000
            if (r2 <= r3) goto L_0x00ac
            goto L_0x00ad
        L_0x00ac:
            r2 = r3
        L_0x00ad:
            r0.close()     // Catch:{ IOException -> 0x00b9 }
            r1 = r2
            goto L_0x00ba
        L_0x00b2:
            r2 = move-exception
            r0.close()     // Catch:{ IOException -> 0x00b9 }
            throw r2     // Catch:{ IOException -> 0x00b9 }
        L_0x00b7:
            r1 = r3
            goto L_0x00ba
        L_0x00b9:
        L_0x00ba:
            if (r1 <= 0) goto L_0x00be
            int r1 = r1 * 1000
        L_0x00be:
            f59193c = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.player.sdk.c.a.b():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ae A[SYNTHETIC, Splitter:B:27:0x00ae] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b4 A[SYNTHETIC, Splitter:B:33:0x00b4] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(java.lang.String r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f59191a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Integer.TYPE
            r3 = 0
            r5 = 1
            r6 = 64487(0xfbe7, float:9.0366E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003b
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f59191a
            r13 = 1
            r14 = 64487(0xfbe7, float:9.0366E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Integer.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x003b:
            r2 = 0
            r3 = -1
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00b2, all -> 0x00aa }
            r4.<init>(r0)     // Catch:{ IOException -> 0x00b2, all -> 0x00aa }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            java.lang.String r0 = r0.readLine()     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            r10[r9] = r0     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f59191a     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            r13 = 1
            r14 = 64488(0xfbe8, float:9.0367E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r15[r9] = r2     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            java.lang.Class r16 = java.lang.Integer.TYPE     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            if (r2 == 0) goto L_0x0088
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            r10[r9] = r0     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f59191a     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            r13 = 1
            r14 = 64488(0xfbe8, float:9.0367E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            java.lang.Class r16 = java.lang.Integer.TYPE     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            int r0 = r0.intValue()     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            r3 = r0
            goto L_0x00a2
        L_0x0088:
            if (r0 == 0) goto L_0x00a2
            java.lang.String r2 = "0-[\\d]+$"
            boolean r2 = r0.matches(r2)     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            if (r2 != 0) goto L_0x0093
            goto L_0x00a2
        L_0x0093:
            r2 = 2
            java.lang.String r0 = r0.substring(r2)     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            int r0 = r0.intValue()     // Catch:{ IOException -> 0x00a8, all -> 0x00a6 }
            int r3 = r0 + 1
        L_0x00a2:
            r4.close()     // Catch:{ IOException -> 0x00a5 }
        L_0x00a5:
            return r3
        L_0x00a6:
            r0 = move-exception
            goto L_0x00ac
        L_0x00a8:
            r2 = r4
            goto L_0x00b2
        L_0x00aa:
            r0 = move-exception
            r4 = r2
        L_0x00ac:
            if (r4 == 0) goto L_0x00b1
            r4.close()     // Catch:{ IOException -> 0x00b1 }
        L_0x00b1:
            throw r0
        L_0x00b2:
            if (r2 == 0) goto L_0x00b7
            r2.close()     // Catch:{ IOException -> 0x00b7 }
        L_0x00b7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.player.sdk.c.a.a(java.lang.String):int");
    }

    private static int a(String str, FileInputStream fileInputStream) {
        String str2 = str;
        FileInputStream fileInputStream2 = fileInputStream;
        if (PatchProxy.isSupport(new Object[]{str2, fileInputStream2}, null, f59191a, true, 64494, new Class[]{String.class, FileInputStream.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2, fileInputStream2}, null, f59191a, true, 64494, new Class[]{String.class, FileInputStream.class}, Integer.TYPE)).intValue();
        }
        byte[] bArr = new byte[1024];
        try {
            int read = fileInputStream2.read(bArr);
            int i = 0;
            while (i < read) {
                if (bArr[i] == 10 || i == 0) {
                    if (bArr[i] == 10) {
                        i++;
                    }
                    int i2 = i;
                    while (i2 < read) {
                        int i3 = i2 - i;
                        if (bArr[i2] != str2.charAt(i3)) {
                            continue;
                            break;
                        } else if (i3 == str.length() - 1) {
                            if (PatchProxy.isSupport(new Object[]{bArr, Integer.valueOf(i2)}, null, f59191a, true, 64495, new Class[]{byte[].class, Integer.TYPE}, Integer.TYPE)) {
                                return ((Integer) PatchProxy.accessDispatch(new Object[]{bArr, Integer.valueOf(i2)}, null, f59191a, true, 64495, new Class[]{byte[].class, Integer.TYPE}, Integer.TYPE)).intValue();
                            }
                            while (i2 < 1024 && bArr[i2] != 10) {
                                if (Character.isDigit(bArr[i2])) {
                                    int i4 = i2 + 1;
                                    while (i4 < 1024 && Character.isDigit(bArr[i4])) {
                                        i4++;
                                    }
                                    return Integer.parseInt(new String(bArr, 0, i2, i4 - i2));
                                }
                                i2++;
                            }
                            return -1;
                        } else {
                            i2++;
                        }
                    }
                    continue;
                }
                i++;
            }
        } catch (IOException | NumberFormatException unused) {
        }
        return -1;
    }
}
