package com.bytedance.ies.geckoclient;

import android.content.Context;
import android.os.Build;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    private static List<String> f20830a = new ArrayList();

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private static void a(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0070, code lost:
        return true;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x001a */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0050 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0052 A[SYNTHETIC, Splitter:B:29:0x0052] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean a(android.content.Context r8, java.lang.String r9) {
        /*
            java.lang.Class<com.bytedance.ies.geckoclient.n> r0 = com.bytedance.ies.geckoclient.n.class
            monitor-enter(r0)
            java.util.List<java.lang.String> r1 = f20830a     // Catch:{ all -> 0x0073 }
            boolean r1 = r1.contains(r9)     // Catch:{ all -> 0x0073 }
            r2 = 1
            if (r1 == 0) goto L_0x000e
            monitor-exit(r0)
            return r2
        L_0x000e:
            r1 = 0
            java.lang.System.loadLibrary(r9)     // Catch:{ UnsatisfiedLinkError -> 0x001a, Throwable -> 0x0018 }
            java.util.List<java.lang.String> r3 = f20830a     // Catch:{ UnsatisfiedLinkError -> 0x001a, Throwable -> 0x0018 }
            r3.add(r9)     // Catch:{ UnsatisfiedLinkError -> 0x001a, Throwable -> 0x0018 }
            goto L_0x006f
        L_0x0018:
            monitor-exit(r0)
            return r1
        L_0x001a:
            java.lang.String r3 = java.lang.System.mapLibraryName(r9)     // Catch:{ all -> 0x0073 }
            r4 = 0
            if (r8 == 0) goto L_0x0046
            java.io.File r5 = r8.getFilesDir()     // Catch:{ all -> 0x0073 }
            if (r5 != 0) goto L_0x0028
            goto L_0x0046
        L_0x0028:
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x0073 }
            java.io.File r6 = r8.getFilesDir()     // Catch:{ all -> 0x0073 }
            java.lang.String r7 = "libso"
            r5.<init>(r6, r7)     // Catch:{ all -> 0x0073 }
            boolean r6 = r5.exists()     // Catch:{ all -> 0x0073 }
            if (r6 != 0) goto L_0x0047
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x0073 }
            java.lang.String r7 = r5.getAbsolutePath()     // Catch:{ all -> 0x0073 }
            r6.<init>(r7)     // Catch:{ all -> 0x0073 }
            r6.mkdirs()     // Catch:{ all -> 0x0073 }
            goto L_0x0047
        L_0x0046:
            r5 = r4
        L_0x0047:
            if (r5 == 0) goto L_0x004e
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0073 }
            r4.<init>(r5, r3)     // Catch:{ all -> 0x0073 }
        L_0x004e:
            if (r4 != 0) goto L_0x0052
            monitor-exit(r0)
            return r1
        L_0x0052:
            boolean r3 = r4.exists()     // Catch:{ all -> 0x0073 }
            if (r3 == 0) goto L_0x005b
            r4.delete()     // Catch:{ all -> 0x0073 }
        L_0x005b:
            java.lang.String r8 = a(r8, r9, r4)     // Catch:{ all -> 0x0073 }
            if (r8 == 0) goto L_0x0063
            monitor-exit(r0)
            return r1
        L_0x0063:
            java.lang.String r8 = r4.getAbsolutePath()     // Catch:{ Throwable -> 0x0071 }
            java.lang.System.load(r8)     // Catch:{ Throwable -> 0x0071 }
            java.util.List<java.lang.String> r8 = f20830a     // Catch:{ Throwable -> 0x0071 }
            r8.add(r9)     // Catch:{ Throwable -> 0x0071 }
        L_0x006f:
            monitor-exit(r0)
            return r2
        L_0x0071:
            monitor-exit(r0)
            return r1
        L_0x0073:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.geckoclient.n.a(android.content.Context, java.lang.String):boolean");
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
                        a((Closeable) null);
                        a((Closeable) null);
                        a(zipFile);
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
                        a((Closeable) fileOutputStream2);
                        a((Closeable) inputStream);
                        a(zipFile);
                        return message;
                    } catch (Throwable th2) {
                        th = th2;
                        a((Closeable) fileOutputStream2);
                        a((Closeable) inputStream);
                        a(zipFile);
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
                            k.a("android.os.FileUtils", file.getAbsolutePath(), 493, -1, -1);
                            a((Closeable) fileOutputStream);
                            a((Closeable) inputStream);
                            a(zipFile);
                            return null;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream2 = fileOutputStream;
                    a((Closeable) fileOutputStream2);
                    a((Closeable) inputStream);
                    a(zipFile);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
                a((Closeable) fileOutputStream2);
                a((Closeable) inputStream);
                a(zipFile);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
            zipFile = null;
            a((Closeable) fileOutputStream2);
            a((Closeable) inputStream);
            a(zipFile);
            throw th;
        }
    }
}
