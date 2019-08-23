package com.ss.android.vesdk.runtime;

import android.content.Context;
import android.os.Build;
import com.ss.android.vesdk.s;
import com.ss.android.vesdk.w;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static List<String> f78134a = new ArrayList();

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c1, code lost:
        return true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007a A[Catch:{ UnsatisfiedLinkError -> 0x001b, Throwable -> 0x0019, Throwable -> 0x00c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0083 A[SYNTHETIC, Splitter:B:30:0x0083] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean a(java.lang.String r10, android.content.Context r11) {
        /*
            java.lang.Class<com.ss.android.vesdk.runtime.f> r0 = com.ss.android.vesdk.runtime.f.class
            monitor-enter(r0)
            java.util.List<java.lang.String> r1 = f78134a     // Catch:{ all -> 0x00c4 }
            boolean r1 = r1.contains(r10)     // Catch:{ all -> 0x00c4 }
            r2 = 1
            if (r1 == 0) goto L_0x000e
            monitor-exit(r0)
            return r2
        L_0x000e:
            r1 = 0
            java.lang.System.loadLibrary(r10)     // Catch:{ UnsatisfiedLinkError -> 0x001b, Throwable -> 0x0019 }
            java.util.List<java.lang.String> r3 = f78134a     // Catch:{ UnsatisfiedLinkError -> 0x001b, Throwable -> 0x0019 }
            r3.add(r10)     // Catch:{ UnsatisfiedLinkError -> 0x001b, Throwable -> 0x0019 }
            goto L_0x00c0
        L_0x0019:
            monitor-exit(r0)
            return r1
        L_0x001b:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c4 }
            java.lang.String r5 = "loadLibrary "
            r4.<init>(r5)     // Catch:{ all -> 0x00c4 }
            r4.append(r10)     // Catch:{ all -> 0x00c4 }
            java.lang.String r5 = " error."
            r4.append(r5)     // Catch:{ all -> 0x00c4 }
            java.io.StringWriter r5 = new java.io.StringWriter     // Catch:{ all -> 0x00c4 }
            r5.<init>()     // Catch:{ all -> 0x00c4 }
            java.io.PrintWriter r6 = new java.io.PrintWriter     // Catch:{ all -> 0x00c4 }
            r6.<init>(r5, r2)     // Catch:{ all -> 0x00c4 }
            com.google.a.a.a.a.a.a.a((java.lang.Throwable) r3, (java.io.PrintWriter) r6)     // Catch:{ all -> 0x00c4 }
            java.lang.StringBuffer r5 = r5.getBuffer()     // Catch:{ all -> 0x00c4 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00c4 }
            r4.append(r5)     // Catch:{ all -> 0x00c4 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00c4 }
            r5 = 4
            com.ss.android.ttve.log.a.a(r5, r4)     // Catch:{ all -> 0x00c4 }
            java.lang.String r4 = java.lang.System.mapLibraryName(r10)     // Catch:{ all -> 0x00c4 }
            r6 = 0
            if (r11 == 0) goto L_0x0077
            java.io.File r7 = r11.getFilesDir()     // Catch:{ all -> 0x00c4 }
            if (r7 != 0) goto L_0x0059
            goto L_0x0077
        L_0x0059:
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x00c4 }
            java.io.File r8 = r11.getFilesDir()     // Catch:{ all -> 0x00c4 }
            java.lang.String r9 = "libso"
            r7.<init>(r8, r9)     // Catch:{ all -> 0x00c4 }
            boolean r8 = r7.exists()     // Catch:{ all -> 0x00c4 }
            if (r8 != 0) goto L_0x0078
            java.lang.String r8 = r7.getAbsolutePath()     // Catch:{ all -> 0x00c4 }
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x00c4 }
            r9.<init>(r8)     // Catch:{ all -> 0x00c4 }
            r9.mkdirs()     // Catch:{ all -> 0x00c4 }
            goto L_0x0078
        L_0x0077:
            r7 = r6
        L_0x0078:
            if (r7 == 0) goto L_0x007f
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x00c4 }
            r6.<init>(r7, r4)     // Catch:{ all -> 0x00c4 }
        L_0x007f:
            if (r6 != 0) goto L_0x0083
            monitor-exit(r0)
            return r1
        L_0x0083:
            boolean r4 = r6.exists()     // Catch:{ all -> 0x00c4 }
            if (r4 == 0) goto L_0x008c
            r6.delete()     // Catch:{ all -> 0x00c4 }
        L_0x008c:
            java.lang.String r11 = a(r11, r10, r6)     // Catch:{ all -> 0x00c4 }
            if (r11 == 0) goto L_0x00b4
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c4 }
            r10.<init>()     // Catch:{ all -> 0x00c4 }
            java.lang.String r2 = r3.getMessage()     // Catch:{ all -> 0x00c4 }
            r10.append(r2)     // Catch:{ all -> 0x00c4 }
            java.lang.String r2 = "["
            r10.append(r2)     // Catch:{ all -> 0x00c4 }
            r10.append(r11)     // Catch:{ all -> 0x00c4 }
            java.lang.String r11 = "]"
            r10.append(r11)     // Catch:{ all -> 0x00c4 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00c4 }
            com.ss.android.ttve.log.a.a(r5, r10)     // Catch:{ all -> 0x00c4 }
            monitor-exit(r0)
            return r1
        L_0x00b4:
            java.lang.String r11 = r6.getAbsolutePath()     // Catch:{ Throwable -> 0x00c2 }
            java.lang.System.load(r11)     // Catch:{ Throwable -> 0x00c2 }
            java.util.List<java.lang.String> r11 = f78134a     // Catch:{ Throwable -> 0x00c2 }
            r11.add(r10)     // Catch:{ Throwable -> 0x00c2 }
        L_0x00c0:
            monitor-exit(r0)
            return r2
        L_0x00c2:
            monitor-exit(r0)
            return r1
        L_0x00c4:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.runtime.f.a(java.lang.String, android.content.Context):boolean");
    }

    private static String a(Context context, String str, File file) {
        InputStream inputStream;
        ZipFile zipFile;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            zipFile = new ZipFile(new File(context.getApplicationInfo().sourceDir), 1);
            try {
                ZipEntry entry = zipFile.getEntry("lib/" + Build.CPU_ABI + "/" + System.mapLibraryName(str));
                if (entry == null) {
                    int indexOf = Build.CPU_ABI.indexOf(45);
                    StringBuilder sb = new StringBuilder("lib/");
                    String str2 = Build.CPU_ABI;
                    if (indexOf <= 0) {
                        indexOf = Build.CPU_ABI.length();
                    }
                    sb.append(str2.substring(0, indexOf));
                    sb.append("/");
                    sb.append(System.mapLibraryName(str));
                    entry = zipFile.getEntry(sb.toString());
                    if (entry == null) {
                        String str3 = "Library entry not found:" + r8;
                        s.a((Closeable) null);
                        s.a((Closeable) null);
                        s.a(zipFile);
                        return str3;
                    }
                }
                file.createNewFile();
                inputStream = zipFile.getInputStream(entry);
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (Throwable th) {
                    th = th;
                    try {
                        String message = th.getMessage();
                        s.a((Closeable) fileOutputStream2);
                        s.a((Closeable) inputStream);
                        s.a(zipFile);
                        return message;
                    } catch (Throwable th2) {
                        th = th2;
                        s.a((Closeable) fileOutputStream2);
                        s.a((Closeable) inputStream);
                        s.a(zipFile);
                        throw th;
                    }
                }
                try {
                    byte[] bArr = new byte[16384];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read > 0) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            w.a("android.os.FileUtils", "setPermissions", file.getAbsolutePath(), 493, -1, -1);
                            s.a((Closeable) fileOutputStream);
                            s.a((Closeable) inputStream);
                            s.a(zipFile);
                            return null;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream2 = fileOutputStream;
                    s.a((Closeable) fileOutputStream2);
                    s.a((Closeable) inputStream);
                    s.a(zipFile);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
                s.a((Closeable) fileOutputStream2);
                s.a((Closeable) inputStream);
                s.a(zipFile);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
            zipFile = null;
            s.a((Closeable) fileOutputStream2);
            s.a((Closeable) inputStream);
            s.a(zipFile);
            throw th;
        }
    }
}
