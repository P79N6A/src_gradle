package com.meizu.cloud.pushsdk.notification.c;

import com.meizu.cloud.pushinternal.DebugLogger;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private final File f27246a;

    /* renamed from: b  reason: collision with root package name */
    private final File f27247b;

    /* renamed from: c  reason: collision with root package name */
    private String f27248c = this.f27247b.getAbsolutePath();

    public e(String str, String str2) {
        this.f27246a = new File(str);
        this.f27247b = new File(str2);
        DebugLogger.i("ZipExtractTask", "Extract mInput file = " + this.f27246a.toString());
        DebugLogger.i("ZipExtractTask", "Extract mOutput file = " + this.f27247b.toString());
    }

    private int a(InputStream inputStream, OutputStream outputStream) {
        String str;
        StringBuilder sb;
        byte[] bArr = new byte[8192];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 8192);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream, 8192);
        int i = 0;
        while (true) {
            try {
                int read = bufferedInputStream.read(bArr, 0, 8192);
                if (read == -1) {
                    break;
                }
                bufferedOutputStream.write(bArr, 0, read);
                i += read;
            } catch (IOException e2) {
                DebugLogger.e("ZipExtractTask", "Extracted IOException:" + e2.toString());
                try {
                    bufferedOutputStream.close();
                } catch (IOException e3) {
                    DebugLogger.e("ZipExtractTask", "out.close() IOException e=" + e3.toString());
                }
                try {
                    bufferedInputStream.close();
                } catch (IOException e4) {
                    e = e4;
                    str = "ZipExtractTask";
                    sb = new StringBuilder("in.close() IOException e=");
                }
            } catch (Throwable th) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e5) {
                    DebugLogger.e("ZipExtractTask", "out.close() IOException e=" + e5.toString());
                }
                try {
                    bufferedInputStream.close();
                } catch (IOException e6) {
                    DebugLogger.e("ZipExtractTask", "in.close() IOException e=" + e6.toString());
                }
                throw th;
            }
        }
        bufferedOutputStream.flush();
        try {
            bufferedOutputStream.close();
        } catch (IOException e7) {
            DebugLogger.e("ZipExtractTask", "out.close() IOException e=" + e7.toString());
        }
        try {
            bufferedInputStream.close();
        } catch (IOException e8) {
            e = e8;
            str = "ZipExtractTask";
            sb = new StringBuilder("in.close() IOException e=");
        }
        return i;
        sb.append(e.toString());
        DebugLogger.e(str, sb.toString());
        return i;
    }

    private void b() {
        if (this.f27246a != null && this.f27246a.exists()) {
            if (this.f27246a.delete()) {
                DebugLogger.i("ZipExtractTask", "Delete file:" + this.f27246a.toString() + " after extracted.");
                return;
            }
            DebugLogger.i("ZipExtractTask", "Can't delete file:" + this.f27246a.toString() + " after extracted.");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.util.zip.ZipFile] */
    /* JADX WARNING: type inference failed for: r2v6, types: [java.util.zip.ZipFile] */
    /* JADX WARNING: type inference failed for: r2v11, types: [java.util.zip.ZipFile] */
    /* JADX WARNING: type inference failed for: r2v14 */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* JADX WARNING: type inference failed for: r2v19 */
    /* JADX WARNING: type inference failed for: r2v22 */
    /* JADX WARNING: type inference failed for: r2v32 */
    /* JADX WARNING: type inference failed for: r2v33 */
    /* JADX WARNING: type inference failed for: r2v34 */
    /* JADX WARNING: type inference failed for: r2v35 */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0117, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x011a, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x011b, code lost:
        r10 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x011e, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x011f, code lost:
        r10 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0122, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0123, code lost:
        r10 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x014a, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x014b, code lost:
        r6 = "ZipExtractTask";
        r7 = new java.lang.StringBuilder("Extracted IOException:");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0182, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0183, code lost:
        r6 = "ZipExtractTask";
        r7 = new java.lang.StringBuilder("Extracted IOException:");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ac, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ad, code lost:
        r6 = "ZipExtractTask";
        r7 = new java.lang.StringBuilder("Extracted IOException:");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0202, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0203, code lost:
        com.meizu.cloud.pushinternal.DebugLogger.e("ZipExtractTask", "Extracted IOException:" + r1.toString());
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0117 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0145 A[SYNTHETIC, Splitter:B:62:0x0145] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x017e A[SYNTHETIC, Splitter:B:73:0x017e] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01a8 A[SYNTHETIC, Splitter:B:83:0x01a8] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01fe A[SYNTHETIC, Splitter:B:93:0x01fe] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long c() {
        /*
            r13 = this;
            long r0 = android.os.SystemClock.currentThreadTimeMillis()
            r2 = 0
            r3 = 0
            r4 = 0
            java.util.zip.ZipFile r6 = new java.util.zip.ZipFile     // Catch:{ ZipException -> 0x018d, IOException -> 0x0163, Exception -> 0x012a }
            java.io.File r7 = r13.f27246a     // Catch:{ ZipException -> 0x018d, IOException -> 0x0163, Exception -> 0x012a }
            r6.<init>(r7)     // Catch:{ ZipException -> 0x018d, IOException -> 0x0163, Exception -> 0x012a }
            java.util.Enumeration r7 = r6.entries()     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
        L_0x0013:
            boolean r8 = r7.hasMoreElements()     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            if (r8 == 0) goto L_0x00d4
            java.lang.Object r8 = r7.nextElement()     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            java.util.zip.ZipEntry r8 = (java.util.zip.ZipEntry) r8     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            boolean r9 = r8.isDirectory()     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            if (r9 != 0) goto L_0x0013
            java.lang.String r9 = r8.getName()     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            if (r9 == 0) goto L_0x003c
            java.lang.String r10 = "../"
            boolean r10 = r9.contains(r10)     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            if (r10 != 0) goto L_0x0034
            goto L_0x003c
        L_0x0034:
            java.lang.Exception r7 = new java.lang.Exception     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            java.lang.String r8 = "unsecurity zip file"
            r7.<init>(r8)     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            throw r7     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
        L_0x003c:
            if (r2 != 0) goto L_0x0070
            if (r9 == 0) goto L_0x0070
            java.lang.String r10 = "/"
            java.lang.String[] r10 = r9.split(r10)     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            r10 = r10[r3]     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            java.lang.String r2 = "ZipExtractTask"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ ZipException -> 0x006d, IOException -> 0x006a, Exception -> 0x0067, all -> 0x0117 }
            java.lang.String r12 = "Extract temp directory="
            r11.<init>(r12)     // Catch:{ ZipException -> 0x006d, IOException -> 0x006a, Exception -> 0x0067, all -> 0x0117 }
            java.io.File r12 = r13.f27247b     // Catch:{ ZipException -> 0x006d, IOException -> 0x006a, Exception -> 0x0067, all -> 0x0117 }
            r11.append(r12)     // Catch:{ ZipException -> 0x006d, IOException -> 0x006a, Exception -> 0x0067, all -> 0x0117 }
            java.lang.String r12 = "/"
            r11.append(r12)     // Catch:{ ZipException -> 0x006d, IOException -> 0x006a, Exception -> 0x0067, all -> 0x0117 }
            r11.append(r10)     // Catch:{ ZipException -> 0x006d, IOException -> 0x006a, Exception -> 0x0067, all -> 0x0117 }
            java.lang.String r11 = r11.toString()     // Catch:{ ZipException -> 0x006d, IOException -> 0x006a, Exception -> 0x0067, all -> 0x0117 }
            com.meizu.cloud.pushinternal.DebugLogger.i(r2, r11)     // Catch:{ ZipException -> 0x006d, IOException -> 0x006a, Exception -> 0x0067, all -> 0x0117 }
            r2 = r10
            goto L_0x0070
        L_0x0067:
            r7 = move-exception
            goto L_0x011c
        L_0x006a:
            r7 = move-exception
            goto L_0x0120
        L_0x006d:
            r7 = move-exception
            goto L_0x0124
        L_0x0070:
            java.io.File r10 = new java.io.File     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            java.io.File r11 = r13.f27247b     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            r10.<init>(r11, r9)     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            java.io.File r9 = r10.getParentFile()     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            boolean r9 = r9.exists()     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            if (r9 != 0) goto L_0x00c0
            java.io.File r9 = r10.getParentFile()     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            boolean r9 = r9.mkdirs()     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            if (r9 == 0) goto L_0x00a7
            java.lang.String r9 = "ZipExtractTask"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            java.lang.String r12 = "Make Destination directory="
            r11.<init>(r12)     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            java.io.File r12 = r10.getParentFile()     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            java.lang.String r12 = r12.getAbsolutePath()     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            r11.append(r12)     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            java.lang.String r11 = r11.toString()     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
        L_0x00a3:
            com.meizu.cloud.pushinternal.DebugLogger.i(r9, r11)     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            goto L_0x00c0
        L_0x00a7:
            java.lang.String r9 = "ZipExtractTask"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            java.lang.String r12 = "Can't make destination directory="
            r11.<init>(r12)     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            java.io.File r12 = r10.getParentFile()     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            java.lang.String r12 = r12.getAbsolutePath()     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            r11.append(r12)     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            java.lang.String r11 = r11.toString()     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            goto L_0x00a3
        L_0x00c0:
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            r9.<init>(r10)     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            java.io.InputStream r8 = r6.getInputStream(r8)     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            int r8 = r13.a(r8, r9)     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            long r10 = (long) r8     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            long r4 = r4 + r10
            r9.close()     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            goto L_0x0013
        L_0x00d4:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            r7.<init>()     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            java.io.File r8 = r13.f27247b     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            r7.append(r8)     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            java.lang.String r8 = "/"
            r7.append(r8)     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            r7.append(r2)     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            java.lang.String r7 = r7.toString()     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            java.lang.String r8 = r13.f27248c     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            boolean r8 = r8.equals(r7)     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            if (r8 != 0) goto L_0x00f8
            java.lang.String r8 = r13.f27248c     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            com.meizu.cloud.pushsdk.notification.c.a.a(r7, r8)     // Catch:{ ZipException -> 0x0122, IOException -> 0x011e, Exception -> 0x011a, all -> 0x0117 }
            r3 = 1
        L_0x00f8:
            r6.close()     // Catch:{ IOException -> 0x00fc }
            goto L_0x0114
        L_0x00fc:
            r6 = move-exception
            java.lang.String r7 = "ZipExtractTask"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Extracted IOException:"
            r8.<init>(r9)
            java.lang.String r6 = r6.toString()
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            com.meizu.cloud.pushinternal.DebugLogger.e(r7, r6)
        L_0x0114:
            r10 = r2
            goto L_0x01b7
        L_0x0117:
            r0 = move-exception
            goto L_0x01fc
        L_0x011a:
            r7 = move-exception
            r10 = r2
        L_0x011c:
            r2 = r6
            goto L_0x012c
        L_0x011e:
            r7 = move-exception
            r10 = r2
        L_0x0120:
            r2 = r6
            goto L_0x0165
        L_0x0122:
            r7 = move-exception
            r10 = r2
        L_0x0124:
            r2 = r6
            goto L_0x018f
        L_0x0126:
            r0 = move-exception
            r6 = r2
            goto L_0x01fc
        L_0x012a:
            r7 = move-exception
            r10 = r2
        L_0x012c:
            java.lang.String r6 = "ZipExtractTask"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0126 }
            java.lang.String r9 = "Extracted Exception "
            r8.<init>(r9)     // Catch:{ all -> 0x0126 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0126 }
            r8.append(r7)     // Catch:{ all -> 0x0126 }
            java.lang.String r7 = r8.toString()     // Catch:{ all -> 0x0126 }
            com.meizu.cloud.pushinternal.DebugLogger.e(r6, r7)     // Catch:{ all -> 0x0126 }
            if (r2 == 0) goto L_0x01b7
            r2.close()     // Catch:{ IOException -> 0x014a }
            goto L_0x01b7
        L_0x014a:
            r2 = move-exception
            java.lang.String r6 = "ZipExtractTask"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Extracted IOException:"
            r7.<init>(r8)
        L_0x0154:
            java.lang.String r2 = r2.toString()
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            com.meizu.cloud.pushinternal.DebugLogger.e(r6, r2)
            goto L_0x01b7
        L_0x0163:
            r7 = move-exception
            r10 = r2
        L_0x0165:
            java.lang.String r6 = "ZipExtractTask"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0126 }
            java.lang.String r9 = "Extracted IOException:"
            r8.<init>(r9)     // Catch:{ all -> 0x0126 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0126 }
            r8.append(r7)     // Catch:{ all -> 0x0126 }
            java.lang.String r7 = r8.toString()     // Catch:{ all -> 0x0126 }
            com.meizu.cloud.pushinternal.DebugLogger.e(r6, r7)     // Catch:{ all -> 0x0126 }
            if (r2 == 0) goto L_0x01b7
            r2.close()     // Catch:{ IOException -> 0x0182 }
            goto L_0x01b7
        L_0x0182:
            r2 = move-exception
            java.lang.String r6 = "ZipExtractTask"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Extracted IOException:"
            r7.<init>(r8)
            goto L_0x0154
        L_0x018d:
            r7 = move-exception
            r10 = r2
        L_0x018f:
            java.lang.String r6 = "ZipExtractTask"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0126 }
            java.lang.String r9 = "ZipException :"
            r8.<init>(r9)     // Catch:{ all -> 0x0126 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0126 }
            r8.append(r7)     // Catch:{ all -> 0x0126 }
            java.lang.String r7 = r8.toString()     // Catch:{ all -> 0x0126 }
            com.meizu.cloud.pushinternal.DebugLogger.e(r6, r7)     // Catch:{ all -> 0x0126 }
            if (r2 == 0) goto L_0x01b7
            r2.close()     // Catch:{ IOException -> 0x01ac }
            goto L_0x01b7
        L_0x01ac:
            r2 = move-exception
            java.lang.String r6 = "ZipExtractTask"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Extracted IOException:"
            r7.<init>(r8)
            goto L_0x0154
        L_0x01b7:
            long r6 = android.os.SystemClock.currentThreadTimeMillis()
            java.lang.String r2 = "ZipExtractTask"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Extract file "
            r8.<init>(r9)
            java.io.File r9 = r13.f27246a
            r8.append(r9)
            java.lang.String r9 = ", UseTime ="
            r8.append(r9)
            long r6 = r6 - r0
            java.lang.String r0 = java.lang.String.valueOf(r6)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            com.meizu.cloud.pushinternal.DebugLogger.i(r2, r0)
            if (r3 == 0) goto L_0x01f8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r1 = r13.f27247b
            r0.append(r1)
            java.lang.String r1 = "/"
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.meizu.cloud.pushsdk.notification.c.a.b(r0)
        L_0x01f8:
            r13.b()
            return r4
        L_0x01fc:
            if (r6 == 0) goto L_0x021a
            r6.close()     // Catch:{ IOException -> 0x0202 }
            goto L_0x021a
        L_0x0202:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Extracted IOException:"
            r2.<init>(r3)
            java.lang.String r1 = r1.toString()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "ZipExtractTask"
            com.meizu.cloud.pushinternal.DebugLogger.e(r2, r1)
        L_0x021a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.notification.c.e.c():long");
    }

    public boolean a() {
        return c() > 0;
    }
}
