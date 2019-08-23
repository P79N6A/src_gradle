package com.bytedance.common.utility.tools;

import android.content.Context;
import android.os.Build;
import com.bytedance.common.utility.io.IOUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class SafelyLibraryLoader {
    private static List<String> sLoadedLibs = new ArrayList();

    private static File getLibraryFolder(Context context) {
        if (context == null || context.getFilesDir() == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "libso");
        if (!file.exists()) {
            IOUtils.mkdir(file.getAbsolutePath());
        }
        return file;
    }

    private static File getLibraryFile(Context context, String str) {
        String mapLibraryName = System.mapLibraryName(str);
        File libraryFolder = getLibraryFolder(context);
        if (libraryFolder != null) {
            return new File(libraryFolder, mapLibraryName);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0040, code lost:
        return true;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x001a */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0020 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0022 A[SYNTHETIC, Splitter:B:19:0x0022] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean loadLibrary(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.Class<com.bytedance.common.utility.tools.SafelyLibraryLoader> r0 = com.bytedance.common.utility.tools.SafelyLibraryLoader.class
            monitor-enter(r0)
            java.util.List<java.lang.String> r1 = sLoadedLibs     // Catch:{ all -> 0x0043 }
            boolean r1 = r1.contains(r6)     // Catch:{ all -> 0x0043 }
            r2 = 1
            if (r1 == 0) goto L_0x000e
            monitor-exit(r0)
            return r2
        L_0x000e:
            r1 = 0
            java.lang.System.loadLibrary(r6)     // Catch:{ UnsatisfiedLinkError -> 0x001a, Throwable -> 0x0018 }
            java.util.List<java.lang.String> r3 = sLoadedLibs     // Catch:{ UnsatisfiedLinkError -> 0x001a, Throwable -> 0x0018 }
            r3.add(r6)     // Catch:{ UnsatisfiedLinkError -> 0x001a, Throwable -> 0x0018 }
            goto L_0x003f
        L_0x0018:
            monitor-exit(r0)
            return r1
        L_0x001a:
            java.io.File r3 = getLibraryFile(r5, r6)     // Catch:{ all -> 0x0043 }
            if (r3 != 0) goto L_0x0022
            monitor-exit(r0)
            return r1
        L_0x0022:
            boolean r4 = r3.exists()     // Catch:{ all -> 0x0043 }
            if (r4 == 0) goto L_0x002b
            r3.delete()     // Catch:{ all -> 0x0043 }
        L_0x002b:
            java.lang.String r5 = unpackLibrary(r5, r6, r3)     // Catch:{ all -> 0x0043 }
            if (r5 == 0) goto L_0x0033
            monitor-exit(r0)
            return r1
        L_0x0033:
            java.lang.String r5 = r3.getAbsolutePath()     // Catch:{ Throwable -> 0x0041 }
            java.lang.System.load(r5)     // Catch:{ Throwable -> 0x0041 }
            java.util.List<java.lang.String> r5 = sLoadedLibs     // Catch:{ Throwable -> 0x0041 }
            r5.add(r6)     // Catch:{ Throwable -> 0x0041 }
        L_0x003f:
            monitor-exit(r0)
            return r2
        L_0x0041:
            monitor-exit(r0)
            return r1
        L_0x0043:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.tools.SafelyLibraryLoader.loadLibrary(android.content.Context, java.lang.String):boolean");
    }

    private static String unpackLibrary(Context context, String str, File file) {
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
                    ZipEntry entry2 = zipFile.getEntry(sb.toString());
                    if (entry2 == null) {
                        String str3 = "Library entry not found:" + r6;
                        IOUtils.close((Closeable) null);
                        IOUtils.close((Closeable) null);
                        IOUtils.close(zipFile);
                        return str3;
                    }
                    entry = entry2;
                }
                file.createNewFile();
                InputStream inputStream2 = zipFile.getInputStream(entry);
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (Throwable th) {
                    Throwable th2 = th;
                    inputStream = inputStream2;
                    th = th2;
                    IOUtils.close((Closeable) fileOutputStream2);
                    IOUtils.close((Closeable) inputStream);
                    IOUtils.close(zipFile);
                    throw th;
                }
                try {
                    byte[] bArr = new byte[16384];
                    while (true) {
                        int read = inputStream2.read(bArr);
                        if (read > 0) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            IOUtils.setPermissions(file.getAbsolutePath(), 493);
                            IOUtils.close((Closeable) fileOutputStream);
                            IOUtils.close((Closeable) inputStream2);
                            IOUtils.close(zipFile);
                            return null;
                        }
                    }
                } catch (Throwable th3) {
                    fileOutputStream2 = fileOutputStream;
                    inputStream = inputStream2;
                    th = th3;
                    IOUtils.close((Closeable) fileOutputStream2);
                    IOUtils.close((Closeable) inputStream);
                    IOUtils.close(zipFile);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
                IOUtils.close((Closeable) fileOutputStream2);
                IOUtils.close((Closeable) inputStream);
                IOUtils.close(zipFile);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
            zipFile = null;
            IOUtils.close((Closeable) fileOutputStream2);
            IOUtils.close((Closeable) inputStream);
            IOUtils.close(zipFile);
            throw th;
        }
    }
}
