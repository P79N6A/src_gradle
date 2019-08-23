package com.ss.android.ugc.aweme.utils;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.common.utility.io.IOUtils;
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

public class ar {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75527a;
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: e  reason: collision with root package name */
    private static ar f75528e;

    /* renamed from: b  reason: collision with root package name */
    public String f75529b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f75530c = "";

    /* renamed from: d  reason: collision with root package name */
    private Context f75531d;

    /* renamed from: f  reason: collision with root package name */
    private final FileFilter f75532f = as.f75534b;

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f75527a, false, 88121, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75527a, false, 88121, new Class[0], Void.TYPE);
            return;
        }
        try {
            for (String split : ey.b("/proc/cpuinfo")) {
                String[] split2 = split.split(":");
                if (2 == split2.length) {
                    String trim = split2[0].trim();
                    String trim2 = split2[1].trim();
                    if (!TextUtils.equals("hardware", trim)) {
                        if (!TextUtils.equals("vendor_id", trim)) {
                            if (TextUtils.equals("Processor", trim) || TextUtils.equals("model name", trim)) {
                                this.f75529b = trim2;
                            }
                        }
                    }
                    this.f75530c = trim2;
                }
            }
        } catch (Exception unused) {
        }
    }

    @TargetApi(16)
    public final long c() {
        if (PatchProxy.isSupport(new Object[0], this, f75527a, false, 88127, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f75527a, false, 88127, new Class[0], Long.TYPE)).longValue();
        }
        if (this.f75531d != null) {
            try {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) this.f75531d.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getMemoryInfo(memoryInfo);
                return memoryInfo.totalMem;
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0085 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b() {
        /*
            r10 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f75527a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Integer.TYPE
            r4 = 0
            r5 = 88126(0x1583e, float:1.23491E-40)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002c
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f75527a
            r5 = 0
            r6 = 88126(0x1583e, float:1.23491E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Integer.TYPE
            r3 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x002c:
            r1 = -1
            r2 = 0
            r3 = -1
        L_0x002f:
            int r4 = r10.a()     // Catch:{ IOException -> 0x00b7 }
            if (r2 >= r4) goto L_0x0091
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00b7 }
            java.lang.String r5 = "/sys/devices/system/cpu/cpu"
            r4.<init>(r5)     // Catch:{ IOException -> 0x00b7 }
            r4.append(r2)     // Catch:{ IOException -> 0x00b7 }
            java.lang.String r5 = "/cpufreq/cpuinfo_max_freq"
            r4.append(r5)     // Catch:{ IOException -> 0x00b7 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x00b7 }
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x00b7 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x00b7 }
            boolean r4 = r5.exists()     // Catch:{ IOException -> 0x00b7 }
            if (r4 == 0) goto L_0x008e
            r4 = 128(0x80, float:1.794E-43)
            byte[] r6 = new byte[r4]     // Catch:{ IOException -> 0x00b7 }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00b7 }
            r7.<init>(r5)     // Catch:{ IOException -> 0x00b7 }
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
            com.bytedance.common.utility.io.IOUtils.close((java.io.Closeable) r7)     // Catch:{ IOException -> 0x00b7 }
            goto L_0x008e
        L_0x0089:
            r0 = move-exception
            com.bytedance.common.utility.io.IOUtils.close((java.io.Closeable) r7)     // Catch:{ IOException -> 0x00b7 }
            throw r0     // Catch:{ IOException -> 0x00b7 }
        L_0x008e:
            int r2 = r2 + 1
            goto L_0x002f
        L_0x0091:
            if (r3 != r1) goto L_0x00b5
            r0 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x00b0 }
            java.lang.String r4 = "/proc/cpuinfo"
            r2.<init>(r4)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "cpu MHz"
            int r0 = r10.a(r0, r2)     // Catch:{ all -> 0x00ab }
            int r0 = r0 * 1000
            if (r0 <= r3) goto L_0x00a6
            goto L_0x00a7
        L_0x00a6:
            r0 = r3
        L_0x00a7:
            com.bytedance.common.utility.io.IOUtils.close((java.io.Closeable) r2)     // Catch:{ IOException -> 0x00b7 }
            goto L_0x00b8
        L_0x00ab:
            r0 = move-exception
            r9 = r2
            r2 = r0
            r0 = r9
            goto L_0x00b1
        L_0x00b0:
            r2 = move-exception
        L_0x00b1:
            com.bytedance.common.utility.io.IOUtils.close((java.io.Closeable) r0)     // Catch:{ IOException -> 0x00b7 }
            throw r2     // Catch:{ IOException -> 0x00b7 }
        L_0x00b5:
            r0 = r3
            goto L_0x00b8
        L_0x00b7:
            r0 = -1
        L_0x00b8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.ar.b():int");
    }

    public final int a() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f75527a, false, 88122, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f75527a, false, 88122, new Class[0], Integer.TYPE)).intValue();
        } else if (Build.VERSION.SDK_INT <= 10) {
            return 1;
        } else {
            int i2 = -1;
            try {
                int a2 = a("/sys/devices/system/cpu/possible");
                if (a2 == -1) {
                    a2 = a("/sys/devices/system/cpu/present");
                }
                if (a2 == -1) {
                    if (PatchProxy.isSupport(new Object[0], this, f75527a, false, 88125, new Class[0], Integer.TYPE)) {
                        i = ((Integer) PatchProxy.accessDispatch(new Object[0], this, f75527a, false, 88125, new Class[0], Integer.TYPE)).intValue();
                    } else {
                        i = new File("/sys/devices/system/cpu/").listFiles(this.f75532f).length;
                    }
                    i2 = i;
                } else {
                    i2 = a2;
                }
            } catch (NullPointerException | SecurityException unused) {
            }
            return i2;
        }
    }

    private ar(Context context) {
        try {
            this.f75531d = context.getApplicationContext();
            d();
        } catch (Exception unused) {
        }
    }

    public static ar a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f75527a, true, 88120, new Class[]{Context.class}, ar.class)) {
            return (ar) PatchProxy.accessDispatch(new Object[]{context2}, null, f75527a, true, 88120, new Class[]{Context.class}, ar.class);
        }
        if (f75528e == null) {
            synchronized (ar.class) {
                if (f75528e == null) {
                    f75528e = new ar(context2);
                }
            }
        }
        return f75528e;
    }

    private int a(String str) {
        FileInputStream fileInputStream;
        BufferedReader bufferedReader;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f75527a, false, 88123, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, this, f75527a, false, 88123, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        int i = -1;
        BufferedReader bufferedReader2 = null;
        try {
            fileInputStream = new FileInputStream(str2);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                try {
                    String readLine = bufferedReader.readLine();
                    if (PatchProxy.isSupport(new Object[]{readLine}, this, f75527a, false, 88124, new Class[]{String.class}, Integer.TYPE)) {
                        i = ((Integer) PatchProxy.accessDispatch(new Object[]{readLine}, this, f75527a, false, 88124, new Class[]{String.class}, Integer.TYPE)).intValue();
                    } else if (readLine != null && readLine.matches("0-[\\d]+$")) {
                        i = Integer.valueOf(readLine.substring(2)).intValue() + 1;
                    }
                    IOUtils.close((Closeable) bufferedReader);
                    IOUtils.close((Closeable) fileInputStream);
                    return i;
                } catch (IOException unused) {
                    bufferedReader2 = bufferedReader;
                    IOUtils.close((Closeable) bufferedReader2);
                    IOUtils.close((Closeable) fileInputStream);
                    return -1;
                } catch (Throwable th) {
                    th = th;
                    IOUtils.close((Closeable) bufferedReader);
                    IOUtils.close((Closeable) fileInputStream);
                    throw th;
                }
            } catch (IOException unused2) {
                IOUtils.close((Closeable) bufferedReader2);
                IOUtils.close((Closeable) fileInputStream);
                return -1;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
                IOUtils.close((Closeable) bufferedReader);
                IOUtils.close((Closeable) fileInputStream);
                throw th;
            }
        } catch (IOException unused3) {
            fileInputStream = null;
            IOUtils.close((Closeable) bufferedReader2);
            IOUtils.close((Closeable) fileInputStream);
            return -1;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            bufferedReader = null;
            IOUtils.close((Closeable) bufferedReader);
            IOUtils.close((Closeable) fileInputStream);
            throw th;
        }
    }

    private int a(String str, FileInputStream fileInputStream) {
        String str2 = str;
        FileInputStream fileInputStream2 = fileInputStream;
        if (PatchProxy.isSupport(new Object[]{str2, fileInputStream2}, this, f75527a, false, 88128, new Class[]{String.class, FileInputStream.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2, fileInputStream2}, this, f75527a, false, 88128, new Class[]{String.class, FileInputStream.class}, Integer.TYPE)).intValue();
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
                            if (PatchProxy.isSupport(new Object[]{bArr, Integer.valueOf(i2)}, this, f75527a, false, 88129, new Class[]{byte[].class, Integer.TYPE}, Integer.TYPE)) {
                                return ((Integer) PatchProxy.accessDispatch(new Object[]{bArr, Integer.valueOf(i2)}, this, f75527a, false, 88129, new Class[]{byte[].class, Integer.TYPE}, Integer.TYPE)).intValue();
                            }
                            while (i2 < 1024 && bArr[i2] != 10) {
                                if (!Character.isDigit(bArr[i2])) {
                                    i2++;
                                } else {
                                    int i4 = i2 + 1;
                                    while (i4 < 1024 && Character.isDigit(bArr[i4])) {
                                        i4++;
                                    }
                                    return Integer.parseInt(new String(bArr, 0, i2, i4 - i2));
                                }
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
