package com.bytedance.frameworks.plugin.f;

import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class f {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        a(inputStream, outputStream, 0);
    }

    public static void a(String str, String str2) throws IOException {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            File file = new File(str);
            File file2 = new File(str2);
            if (file.exists() && file.isFile() && file.canRead()) {
                if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                    file2.getParentFile().mkdirs();
                }
                try {
                    a((InputStream) new FileInputStream(str), (OutputStream) new FileOutputStream(str2), file.length());
                } catch (IOException e2) {
                    if (file2.exists()) {
                        file2.delete();
                    }
                    throw e2;
                }
            }
        }
    }

    private static void a(InputStream inputStream, OutputStream outputStream, long j) throws IOException {
        if (inputStream != null && outputStream != null) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
            try {
                byte[] bArr = new byte[4096];
                int i = 0;
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    bufferedOutputStream.write(bArr, 0, read);
                    i += read;
                }
                bufferedOutputStream.flush();
                if (j > 0) {
                    if (((long) i) != j) {
                        throw new IOException("copy is not completed");
                    }
                }
            } finally {
                bufferedInputStream.close();
                bufferedOutputStream.close();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0065 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.util.zip.ZipFile r9, java.util.zip.ZipEntry r10, java.io.File r11) throws java.io.IOException {
        /*
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r9.getInputStream(r10)     // Catch:{ IOException -> 0x0055, all -> 0x0048 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0045, all -> 0x0042 }
            r3.<init>(r11)     // Catch:{ IOException -> 0x0045, all -> 0x0042 }
            long r4 = r10.getSize()     // Catch:{ IOException -> 0x0040, all -> 0x003e }
            r10 = 4096(0x1000, float:5.74E-42)
            byte[] r10 = new byte[r10]     // Catch:{ IOException -> 0x0040, all -> 0x003e }
            r6 = 0
        L_0x0014:
            int r7 = r2.read(r10)     // Catch:{ IOException -> 0x0040, all -> 0x003e }
            r8 = -1
            if (r7 == r8) goto L_0x0020
            r3.write(r10, r1, r7)     // Catch:{ IOException -> 0x0040, all -> 0x003e }
            int r6 = r6 + r7
            goto L_0x0014
        L_0x0020:
            long r6 = (long) r6     // Catch:{ IOException -> 0x0040, all -> 0x003e }
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 == 0) goto L_0x002e
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0040, all -> 0x003e }
            java.lang.String r10 = "文件未复制完成"
            r0.<init>(r10)     // Catch:{ IOException -> 0x0040, all -> 0x003e }
            r10 = 0
            goto L_0x002f
        L_0x002e:
            r10 = 1
        L_0x002f:
            if (r10 == 0) goto L_0x0034
            r3.flush()     // Catch:{ IOException -> 0x0040, all -> 0x003e }
        L_0x0034:
            r9.close()
            a(r2)
            a(r3)
            goto L_0x0063
        L_0x003e:
            r10 = move-exception
            goto L_0x004b
        L_0x0040:
            r10 = move-exception
            goto L_0x0058
        L_0x0042:
            r10 = move-exception
            r3 = r0
            goto L_0x004b
        L_0x0045:
            r10 = move-exception
            r3 = r0
            goto L_0x0058
        L_0x0048:
            r10 = move-exception
            r2 = r0
            r3 = r2
        L_0x004b:
            r9.close()
            a(r2)
            a(r3)
            throw r10
        L_0x0055:
            r10 = move-exception
            r2 = r0
            r3 = r2
        L_0x0058:
            r0 = r10
            r9.close()
            a(r2)
            a(r3)
            r10 = 0
        L_0x0063:
            if (r10 == 0) goto L_0x0066
            return
        L_0x0066:
            r11.delete()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.f.f.a(java.util.zip.ZipFile, java.util.zip.ZipEntry, java.io.File):void");
    }
}
