package pl.droidsonroids.gif;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final String f84210a = System.mapLibraryName("pl_droidsonroids_gif");

    private f() {
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @SuppressLint({"UnsafeDynamicallyLoadedCode"})
    static void a(Context context) {
        synchronized (f.class) {
            System.load(b(context).getAbsolutePath());
        }
    }

    private static ZipEntry a(ZipFile zipFile) {
        for (String str : Build.VERSION.SDK_INT >= 21 ? Build.SUPPORTED_ABIS : new String[]{Build.CPU_ABI, Build.CPU_ABI2}) {
            ZipEntry entry = zipFile.getEntry("lib/" + str + "/" + f84210a);
            if (entry != null) {
                return entry;
            }
        }
        return null;
    }

    private static ZipFile a(File file) {
        ZipFile zipFile;
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i >= 5) {
                zipFile = null;
                break;
            }
            try {
                zipFile = new ZipFile(file, 1);
                break;
            } catch (IOException unused) {
                i = i2;
            }
        }
        if (zipFile != null) {
            return zipFile;
        }
        throw new IllegalStateException("Could not open APK file: " + file.getAbsolutePath());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        a((java.io.Closeable) r1);
        a((java.io.Closeable) r6);
        r4.setReadable(true, false);
        r4.setExecutable(true, false);
        r4.setWritable(true);
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009a A[Catch:{ IOException -> 0x0085, all -> 0x0081, all -> 0x00be }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00cc A[SYNTHETIC, Splitter:B:52:0x00cc] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.io.File b(android.content.Context r9) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = f84210a
            r0.append(r1)
            java.lang.String r1 = "1.2.15"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "lib"
            r3 = 0
            java.io.File r2 = r9.getDir(r2, r3)
            r1.<init>(r2, r0)
            boolean r2 = r1.isFile()
            if (r2 == 0) goto L_0x0026
            return r1
        L_0x0026:
            java.io.File r2 = new java.io.File
            java.io.File r4 = r9.getCacheDir()
            r2.<init>(r4, r0)
            boolean r0 = r2.isFile()
            if (r0 == 0) goto L_0x0036
            return r2
        L_0x0036:
            java.lang.String r0 = "pl_droidsonroids_gif_surface"
            java.lang.String r0 = java.lang.System.mapLibraryName(r0)
            pl.droidsonroids.gif.f$1 r4 = new pl.droidsonroids.gif.f$1
            r4.<init>(r0)
            a((java.io.File) r1, (java.io.FilenameFilter) r4)
            a((java.io.File) r2, (java.io.FilenameFilter) r4)
            android.content.pm.ApplicationInfo r9 = r9.getApplicationInfo()
            java.io.File r0 = new java.io.File
            java.lang.String r9 = r9.sourceDir
            r0.<init>(r9)
            r9 = 0
            java.util.zip.ZipFile r0 = a((java.io.File) r0)     // Catch:{ all -> 0x00c6 }
            r4 = r1
            r1 = 0
        L_0x0059:
            int r5 = r1 + 1
            r6 = 5
            if (r1 >= r6) goto L_0x00c0
            java.util.zip.ZipEntry r1 = a((java.util.zip.ZipFile) r0)     // Catch:{ all -> 0x00be }
            if (r1 == 0) goto L_0x00a3
            java.io.InputStream r1 = r0.getInputStream(r1)     // Catch:{ IOException -> 0x0095, all -> 0x008b }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0089, all -> 0x0087 }
            r6.<init>(r4)     // Catch:{ IOException -> 0x0089, all -> 0x0087 }
            a((java.io.InputStream) r1, (java.io.OutputStream) r6)     // Catch:{ IOException -> 0x0085, all -> 0x0081 }
            a((java.io.Closeable) r1)     // Catch:{ all -> 0x00be }
            a((java.io.Closeable) r6)     // Catch:{ all -> 0x00be }
            r9 = 1
            r4.setReadable(r9, r3)     // Catch:{ all -> 0x00be }
            r4.setExecutable(r9, r3)     // Catch:{ all -> 0x00be }
            r4.setWritable(r9)     // Catch:{ all -> 0x00be }
            goto L_0x00c0
        L_0x0081:
            r9 = move-exception
            r2 = r9
            r9 = r6
            goto L_0x008e
        L_0x0085:
            goto L_0x0097
        L_0x0087:
            r2 = move-exception
            goto L_0x008e
        L_0x0089:
            r6 = r9
            goto L_0x0097
        L_0x008b:
            r1 = move-exception
            r2 = r1
            r1 = r9
        L_0x008e:
            a((java.io.Closeable) r1)     // Catch:{ all -> 0x00be }
            a((java.io.Closeable) r9)     // Catch:{ all -> 0x00be }
            throw r2     // Catch:{ all -> 0x00be }
        L_0x0095:
            r1 = r9
            r6 = r1
        L_0x0097:
            r7 = 2
            if (r5 <= r7) goto L_0x009b
            r4 = r2
        L_0x009b:
            a((java.io.Closeable) r1)     // Catch:{ all -> 0x00be }
            a((java.io.Closeable) r6)     // Catch:{ all -> 0x00be }
            r1 = r5
            goto L_0x0059
        L_0x00a3:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00be }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00be }
            java.lang.String r2 = "Library "
            r1.<init>(r2)     // Catch:{ all -> 0x00be }
            java.lang.String r2 = f84210a     // Catch:{ all -> 0x00be }
            r1.append(r2)     // Catch:{ all -> 0x00be }
            java.lang.String r2 = " for supported ABIs not found in APK file"
            r1.append(r2)     // Catch:{ all -> 0x00be }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00be }
            r9.<init>(r1)     // Catch:{ all -> 0x00be }
            throw r9     // Catch:{ all -> 0x00be }
        L_0x00be:
            r9 = move-exception
            goto L_0x00ca
        L_0x00c0:
            if (r0 == 0) goto L_0x00c5
            r0.close()     // Catch:{ IOException -> 0x00c5 }
        L_0x00c5:
            return r4
        L_0x00c6:
            r0 = move-exception
            r8 = r0
            r0 = r9
            r9 = r8
        L_0x00ca:
            if (r0 == 0) goto L_0x00cf
            r0.close()     // Catch:{ IOException -> 0x00cf }
        L_0x00cf:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.droidsonroids.gif.f.b(android.content.Context):java.io.File");
    }

    private static void a(File file, FilenameFilter filenameFilter) {
        File[] listFiles = file.getParentFile().listFiles(filenameFilter);
        if (listFiles != null) {
            for (File delete : listFiles) {
                delete.delete();
            }
        }
    }

    private static void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }
}
