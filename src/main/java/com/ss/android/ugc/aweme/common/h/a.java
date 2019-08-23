package com.ss.android.ugc.aweme.common.h;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40220a;

    /* renamed from: b  reason: collision with root package name */
    private static final FileFilter f40221b = new FileFilter() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40222a;

        public final boolean accept(File file) {
            if (PatchProxy.isSupport(new Object[]{file}, this, f40222a, false, 33520, new Class[]{File.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{file}, this, f40222a, false, 33520, new Class[]{File.class}, Boolean.TYPE)).booleanValue();
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

    public static int a() {
        int i;
        if (PatchProxy.isSupport(new Object[0], null, f40220a, true, 33511, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f40220a, true, 33511, new Class[0], Integer.TYPE)).intValue();
        }
        if (Build.VERSION.SDK_INT <= 10) {
            return 1;
        }
        int i2 = -1;
        try {
            int a2 = a("/sys/devices/system/cpu/possible");
            if (a2 == -1) {
                a2 = a("/sys/devices/system/cpu/present");
            }
            if (a2 == -1) {
                if (PatchProxy.isSupport(new Object[0], null, f40220a, true, 33515, new Class[0], Integer.TYPE)) {
                    i = ((Integer) PatchProxy.accessDispatch(new Object[0], null, f40220a, true, 33515, new Class[0], Integer.TYPE)).intValue();
                } else {
                    i = new File("/sys/devices/system/cpu/").listFiles(f40221b).length;
                }
                i2 = i;
            } else {
                i2 = a2;
            }
        } catch (NullPointerException | SecurityException unused) {
        }
        return i2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0085 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b() {
        /*
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f40220a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Integer.TYPE
            r2 = 0
            r4 = 1
            r5 = 33516(0x82ec, float:4.6966E-41)
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002c
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = f40220a
            r5 = 1
            r6 = 33516(0x82ec, float:4.6966E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Integer.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x002c:
            r1 = -1
            r2 = 0
            r3 = -1
        L_0x002f:
            int r4 = a()     // Catch:{ IOException -> 0x00b1 }
            if (r2 >= r4) goto L_0x0091
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00b1 }
            java.lang.String r5 = "/sys/devices/system/cpu/cpu"
            r4.<init>(r5)     // Catch:{ IOException -> 0x00b1 }
            r4.append(r2)     // Catch:{ IOException -> 0x00b1 }
            java.lang.String r5 = "/cpufreq/cpuinfo_max_freq"
            r4.append(r5)     // Catch:{ IOException -> 0x00b1 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x00b1 }
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x00b1 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x00b1 }
            boolean r4 = r5.exists()     // Catch:{ IOException -> 0x00b1 }
            if (r4 == 0) goto L_0x008e
            r4 = 128(0x80, float:1.794E-43)
            byte[] r6 = new byte[r4]     // Catch:{ IOException -> 0x00b1 }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00b1 }
            r7.<init>(r5)     // Catch:{ IOException -> 0x00b1 }
            r7.read(r6)     // Catch:{ NumberFormatException -> 0x0085, all -> 0x0089 }
            r5 = 0
        L_0x0060:
            byte r8 = r6[r5]     // Catch:{ NumberFormatException -> 0x0085, all -> 0x0089 }
            boolean r8 = java.lang.Character.isDigit(r8)     // Catch:{ NumberFormatException -> 0x0085, all -> 0x0089 }
            if (r8 == 0) goto L_0x006d
            if (r5 >= r4) goto L_0x006d
            int r5 = r5 + 1
            goto L_0x0060
        L_0x006d:
            java.lang.String r4 = new java.lang.String     // Catch:{ NumberFormatException -> 0x0085, all -> 0x0089 }
            r4.<init>(r6, r0, r5)     // Catch:{ NumberFormatException -> 0x0085, all -> 0x0089 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x0085, all -> 0x0089 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x0085, all -> 0x0089 }
            int r5 = r4.intValue()     // Catch:{ NumberFormatException -> 0x0085, all -> 0x0089 }
            if (r5 <= r3) goto L_0x0085
            int r4 = r4.intValue()     // Catch:{ NumberFormatException -> 0x0085, all -> 0x0089 }
            r3 = r4
        L_0x0085:
            r7.close()     // Catch:{ IOException -> 0x00b1 }
            goto L_0x008e
        L_0x0089:
            r0 = move-exception
            r7.close()     // Catch:{ IOException -> 0x00b1 }
            throw r0     // Catch:{ IOException -> 0x00b1 }
        L_0x008e:
            int r2 = r2 + 1
            goto L_0x002f
        L_0x0091:
            if (r3 != r1) goto L_0x00b0
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00b1 }
            java.lang.String r2 = "/proc/cpuinfo"
            r0.<init>(r2)     // Catch:{ IOException -> 0x00b1 }
            java.lang.String r2 = "cpu MHz"
            int r2 = a(r2, r0)     // Catch:{ all -> 0x00ab }
            int r2 = r2 * 1000
            if (r2 <= r3) goto L_0x00a5
            goto L_0x00a6
        L_0x00a5:
            r2 = r3
        L_0x00a6:
            r0.close()     // Catch:{ IOException -> 0x00b1 }
            r1 = r2
            goto L_0x00b1
        L_0x00ab:
            r2 = move-exception
            r0.close()     // Catch:{ IOException -> 0x00b1 }
            throw r2     // Catch:{ IOException -> 0x00b1 }
        L_0x00b0:
            r1 = r3
        L_0x00b1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.h.a.b():int");
    }

    private static void a(Closeable closeable) {
        if (PatchProxy.isSupport(new Object[]{closeable}, null, f40220a, true, 33513, new Class[]{Closeable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{closeable}, null, f40220a, true, 33513, new Class[]{Closeable.class}, Void.TYPE);
            return;
        }
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @TargetApi(16)
    public static long a(Context context) {
        FileInputStream fileInputStream;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f40220a, true, 33517, new Class[]{Context.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{context2}, null, f40220a, true, 33517, new Class[]{Context.class}, Long.TYPE)).longValue();
        } else if (Build.VERSION.SDK_INT >= 16) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context2.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem;
        } else {
            long j = -1;
            try {
                fileInputStream = new FileInputStream("/proc/meminfo");
                j = ((long) a("MemTotal", fileInputStream)) * 1024;
                fileInputStream.close();
            } catch (IOException unused) {
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
            return j;
        }
    }

    private static int a(String str) {
        FileInputStream fileInputStream;
        BufferedReader bufferedReader;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f40220a, true, 33512, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, null, f40220a, true, 33512, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        int i = -1;
        BufferedReader bufferedReader2 = null;
        try {
            fileInputStream = new FileInputStream(str2);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            } catch (IOException unused) {
                a((Closeable) fileInputStream);
                a((Closeable) bufferedReader2);
                return -1;
            } catch (Throwable th) {
                th = th;
                bufferedReader = null;
                a((Closeable) fileInputStream);
                a((Closeable) bufferedReader);
                throw th;
            }
            try {
                String readLine = bufferedReader.readLine();
                if (PatchProxy.isSupport(new Object[]{readLine}, null, f40220a, true, 33514, new Class[]{String.class}, Integer.TYPE)) {
                    i = ((Integer) PatchProxy.accessDispatch(new Object[]{readLine}, null, f40220a, true, 33514, new Class[]{String.class}, Integer.TYPE)).intValue();
                } else if (readLine != null) {
                    if (readLine.matches("0-[\\d]+$")) {
                        i = Integer.parseInt(readLine.substring(2)) + 1;
                    }
                }
                a((Closeable) fileInputStream);
                a((Closeable) bufferedReader);
                return i;
            } catch (IOException unused2) {
                bufferedReader2 = bufferedReader;
                a((Closeable) fileInputStream);
                a((Closeable) bufferedReader2);
                return -1;
            } catch (Throwable th2) {
                th = th2;
                a((Closeable) fileInputStream);
                a((Closeable) bufferedReader);
                throw th;
            }
        } catch (IOException unused3) {
            fileInputStream = null;
            a((Closeable) fileInputStream);
            a((Closeable) bufferedReader2);
            return -1;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            bufferedReader = null;
            a((Closeable) fileInputStream);
            a((Closeable) bufferedReader);
            throw th;
        }
    }

    private static int a(String str, FileInputStream fileInputStream) {
        String str2 = str;
        FileInputStream fileInputStream2 = fileInputStream;
        if (PatchProxy.isSupport(new Object[]{str2, fileInputStream2}, null, f40220a, true, 33518, new Class[]{String.class, FileInputStream.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2, fileInputStream2}, null, f40220a, true, 33518, new Class[]{String.class, FileInputStream.class}, Integer.TYPE)).intValue();
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
                            if (PatchProxy.isSupport(new Object[]{bArr, Integer.valueOf(i2)}, null, f40220a, true, 33519, new Class[]{byte[].class, Integer.TYPE}, Integer.TYPE)) {
                                return ((Integer) PatchProxy.accessDispatch(new Object[]{bArr, Integer.valueOf(i2)}, null, f40220a, true, 33519, new Class[]{byte[].class, Integer.TYPE}, Integer.TYPE)).intValue();
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
