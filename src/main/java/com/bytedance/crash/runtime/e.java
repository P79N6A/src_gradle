package com.bytedance.crash.runtime;

import android.text.TextUtils;
import com.bytedance.crash.i.f;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public final class e {

    static class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        private InputStream f19541a;

        /* renamed from: b  reason: collision with root package name */
        private List<String> f19542b;

        public final void run() {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f19541a));
            int i = 32768;
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else if (!readLine.startsWith("---------")) {
                        i -= readLine.getBytes("UTF-8").length;
                        if (i < 0) {
                            break;
                        }
                        this.f19542b.add(readLine);
                    }
                } catch (IOException unused) {
                    return;
                } finally {
                    f.a((Closeable) bufferedReader);
                }
            }
        }

        a(InputStream inputStream, List<String> list) {
            this.f19541a = inputStream;
            this.f19542b = list;
        }
    }

    static class b extends Thread {

        /* renamed from: a  reason: collision with root package name */
        private Process f19543a;

        /* renamed from: b  reason: collision with root package name */
        private long f19544b = 3000;

        public final void run() {
            try {
                sleep(this.f19544b);
            } catch (InterruptedException unused) {
            }
            if (this.f19543a != null) {
                this.f19543a.destroy();
            }
        }

        public b(Process process, long j) {
            this.f19543a = process;
        }
    }

    public static List<String> a(String str) {
        BufferedReader bufferedReader;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            bufferedReader = new BufferedReader(new FileReader(str));
            while (true) {
                try {
                    if (bufferedReader.readLine() != null) {
                        arrayList.add(r4 + ">;");
                    } else {
                        f.a((Closeable) bufferedReader);
                        return arrayList;
                    }
                } catch (IOException unused) {
                    f.a((Closeable) bufferedReader);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    f.a((Closeable) bufferedReader);
                    throw th;
                }
            }
        } catch (IOException unused2) {
            bufferedReader = null;
            f.a((Closeable) bufferedReader);
            return null;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
            f.a((Closeable) bufferedReader);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.String> a(int r9, int r10) {
        /*
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1 = 4
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.String r3 = "logcat"
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "-t"
            r5 = 1
            r2[r5] = r3
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r3 = 2
            r2[r3] = r9
            r9 = 6
            java.lang.String[] r6 = new java.lang.String[r9]
            java.lang.String r7 = "*:V"
            r6[r4] = r7
            java.lang.String r4 = "*:D"
            r6[r5] = r4
            java.lang.String r4 = "*:I"
            r6[r3] = r4
            java.lang.String r3 = "*:W"
            r4 = 3
            r6[r4] = r3
            java.lang.String r3 = "*:E"
            r6[r1] = r3
            java.lang.String r1 = "*:F"
            r3 = 5
            r6[r3] = r1
            if (r10 < 0) goto L_0x003d
            if (r10 >= r9) goto L_0x003d
            r9 = r6[r10]
            goto L_0x003f
        L_0x003d:
            java.lang.String r9 = "*:V"
        L_0x003f:
            r2[r4] = r9
            r9 = 0
            java.lang.Runtime r10 = java.lang.Runtime.getRuntime()     // Catch:{ Throwable -> 0x008f, all -> 0x0085 }
            java.lang.Process r10 = r10.exec(r2)     // Catch:{ Throwable -> 0x008f, all -> 0x0085 }
            com.bytedance.crash.runtime.e$a r9 = new com.bytedance.crash.runtime.e$a     // Catch:{ Throwable -> 0x0083, all -> 0x0081 }
            java.io.InputStream r1 = r10.getInputStream()     // Catch:{ Throwable -> 0x0083, all -> 0x0081 }
            r9.<init>(r1, r0)     // Catch:{ Throwable -> 0x0083, all -> 0x0081 }
            r9.start()     // Catch:{ Throwable -> 0x0083, all -> 0x0081 }
            com.bytedance.crash.runtime.e$a r9 = new com.bytedance.crash.runtime.e$a     // Catch:{ Throwable -> 0x0083, all -> 0x0081 }
            java.io.InputStream r1 = r10.getErrorStream()     // Catch:{ Throwable -> 0x0083, all -> 0x0081 }
            r9.<init>(r1, r0)     // Catch:{ Throwable -> 0x0083, all -> 0x0081 }
            r9.start()     // Catch:{ Throwable -> 0x0083, all -> 0x0081 }
            com.bytedance.crash.runtime.e$b r9 = new com.bytedance.crash.runtime.e$b     // Catch:{ Throwable -> 0x0083, all -> 0x0081 }
            r1 = 3000(0xbb8, double:1.482E-320)
            r9.<init>(r10, r1)     // Catch:{ Throwable -> 0x0083, all -> 0x0081 }
            r9.start()     // Catch:{ Throwable -> 0x0083, all -> 0x0081 }
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x0083, all -> 0x0081 }
            r3 = 26
            if (r9 < r3) goto L_0x0078
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Throwable -> 0x0083, all -> 0x0081 }
            r10.waitFor(r1, r9)     // Catch:{ Throwable -> 0x0083, all -> 0x0081 }
            goto L_0x007b
        L_0x0078:
            r10.waitFor()     // Catch:{ Throwable -> 0x0083, all -> 0x0081 }
        L_0x007b:
            if (r10 == 0) goto L_0x0094
            r10.destroy()
            goto L_0x0094
        L_0x0081:
            r9 = move-exception
            goto L_0x0089
        L_0x0083:
            r9 = r10
            goto L_0x008f
        L_0x0085:
            r10 = move-exception
            r8 = r10
            r10 = r9
            r9 = r8
        L_0x0089:
            if (r10 == 0) goto L_0x008e
            r10.destroy()
        L_0x008e:
            throw r9
        L_0x008f:
            if (r9 == 0) goto L_0x0094
            r9.destroy()
        L_0x0094:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.runtime.e.a(int, int):java.util.List");
    }
}
