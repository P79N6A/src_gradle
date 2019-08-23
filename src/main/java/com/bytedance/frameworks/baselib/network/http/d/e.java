package com.bytedance.frameworks.baselib.network.http.d;

import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.f;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

public final class e {
    public static void a(Closeable closeable) {
        a(closeable, (String) null);
    }

    public static boolean a(String str) {
        if (str == null) {
            return false;
        }
        int indexOf = str.indexOf("application/octet-stream");
        if (indexOf >= 0) {
            indexOf = str.indexOf("ssmix=", indexOf + 24);
        }
        if (indexOf > 0) {
            return true;
        }
        return false;
    }

    private static void a(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
                Logger.debug();
            }
        }
    }

    public static void a(byte[] bArr, int i) throws IOException {
        if (bArr != null && i > 0) {
            byte[] bArr2 = {-99, -114, Byte.MAX_VALUE, 90};
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2 % 4]);
            }
        }
    }

    public static byte[] a(boolean z, int i, InputStream inputStream, int[] iArr) throws IOException {
        int i2;
        if (i <= 0) {
            i = 5242880;
        }
        if (i < 1048576) {
            i = 1048576;
        }
        if (inputStream == null) {
            return null;
        }
        if (z) {
            try {
                inputStream = new GZIPInputStream(inputStream);
            } catch (EOFException e2) {
                if (!z || i2 <= 0) {
                    throw e2;
                }
            } catch (IOException e3) {
                String message = e3.getMessage();
                if (z && i2 > 0) {
                    if (!"CRC mismatch".equals(message)) {
                        if ("Size mismatch".equals(message)) {
                        }
                    }
                }
                throw e3;
            } catch (Throwable th) {
                a((Closeable) inputStream);
                throw th;
            }
        }
        byte[] bArr = new byte[8192];
        i2 = 0;
        while (true) {
            if (i2 + 4096 > bArr.length) {
                byte[] bArr2 = new byte[(bArr.length * 2)];
                System.arraycopy(bArr, 0, bArr2, 0, i2);
                bArr = bArr2;
            }
            int read = inputStream.read(bArr, i2, 4096);
            if (read <= 0) {
                break;
            }
            i2 += read;
            if (i > 0 && i2 > i) {
                a((Closeable) inputStream);
                return null;
            }
        }
        if (i2 > 0) {
            iArr[0] = i2;
            a((Closeable) inputStream);
            return bArr;
        }
        a((Closeable) inputStream);
        return null;
    }

    public static byte[] a(boolean z, int i, InputStream inputStream, int[] iArr, f fVar) throws IOException {
        if (inputStream == null) {
            return null;
        }
        try {
            byte[] a2 = a(z, -1, inputStream, iArr);
            if (a2 == null || iArr[0] <= 0) {
                return null;
            }
            return a2;
        } catch (Exception e2) {
            fVar.b();
        } catch (Throwable unused) {
        }
        throw e2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x014c, code lost:
        a((java.io.Closeable) null, "close instream exception ");
        a((java.io.Closeable) null, "close outstream exception ");
        a((java.io.Closeable) null, "close random file exception ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x015c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x015d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x015e, code lost:
        r1 = null;
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0161, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0162, code lost:
        r1 = null;
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0174, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0175, code lost:
        r5 = null;
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0178, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0179, code lost:
        r5 = null;
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:?, code lost:
        r5.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        if (com.bytedance.common.utility.StringUtils.isEmpty(r32) != false) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005e, code lost:
        r0 = new java.io.File(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r0.exists() == false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0069, code lost:
        r0.mkdirs();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006c, code lost:
        r0 = java.io.File.createTempFile("tempimage", ".tmp", new java.io.File(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x010d, code lost:
        r26.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0110, code lost:
        if (r15 <= 0) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        r14.seek(0);
        r1 = new java.io.FileOutputStream(new java.io.File(r6, r33));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r2 = r14.read(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0127, code lost:
        if (r2 == -1) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0129, code lost:
        r1.write(r0, 0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x012e, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0132, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0133, code lost:
        r13 = r1;
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0139, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x013a, code lost:
        r13 = r1;
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0140, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0141, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0143, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0144, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        r5.delete();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:11:0x002d, B:18:0x0045] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:122:0x0181 */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0193 A[SYNTHETIC, Splitter:B:126:0x0193] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.io.InputStream r26, long r27, com.bytedance.frameworks.baselib.network.http.f r29, int r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, com.bytedance.frameworks.baselib.network.http.util.d<java.lang.String> r34, java.lang.String r35, com.bytedance.frameworks.baselib.network.http.util.h r36) throws java.lang.Exception {
        /*
            r1 = r26
            r2 = r27
            r4 = r30
            r5 = r31
            r6 = r32
            r7 = r34
            r8 = r35
            r9 = r36
            r10 = 0
            if (r1 != 0) goto L_0x0014
            return r10
        L_0x0014:
            r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r13 = 0
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x016e
            r11 = 0
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0025
            r2 = 4096(0x1000, double:2.0237E-320)
            goto L_0x0033
        L_0x0025:
            if (r4 <= 0) goto L_0x0033
            long r14 = (long) r4
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x002d
            goto L_0x0033
        L_0x002d:
            com.bytedance.frameworks.baselib.network.http.util.b r0 = new com.bytedance.frameworks.baselib.network.http.util.b     // Catch:{ Exception -> 0x0178, all -> 0x0174 }
            r0.<init>(r4, r2)     // Catch:{ Exception -> 0x0178, all -> 0x0174 }
            throw r0     // Catch:{ Exception -> 0x0178, all -> 0x0174 }
        L_0x0033:
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x0178, all -> 0x0174 }
            r0.<init>(r5)     // Catch:{ Exception -> 0x0178, all -> 0x0174 }
            boolean r14 = r0.exists()     // Catch:{ Exception -> 0x0178, all -> 0x0174 }
            if (r14 != 0) goto L_0x0041
            r0.mkdirs()     // Catch:{ Exception -> 0x0178, all -> 0x0174 }
        L_0x0041:
            java.lang.String r0 = "tempimage"
            java.lang.String r14 = ".tmp"
            java.io.File r15 = new java.io.File     // Catch:{ IOException -> 0x0051 }
            r15.<init>(r5)     // Catch:{ IOException -> 0x0051 }
            java.io.File r0 = java.io.File.createTempFile(r0, r14, r15)     // Catch:{ IOException -> 0x0051 }
            r6 = r5
        L_0x004f:
            r5 = r0
            goto L_0x007a
        L_0x0051:
            r0 = move-exception
            boolean r14 = com.bytedance.common.utility.StringUtils.isEmpty(r32)     // Catch:{ Exception -> 0x0178, all -> 0x0174 }
            if (r14 != 0) goto L_0x016d
            boolean r5 = r6.equals(r5)     // Catch:{ Exception -> 0x0178, all -> 0x0174 }
            if (r5 != 0) goto L_0x016d
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x0178, all -> 0x0174 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x0178, all -> 0x0174 }
            boolean r5 = r0.exists()     // Catch:{ Exception -> 0x0178, all -> 0x0174 }
            if (r5 != 0) goto L_0x006c
            r0.mkdirs()     // Catch:{ Exception -> 0x0178, all -> 0x0174 }
        L_0x006c:
            java.lang.String r0 = "tempimage"
            java.lang.String r5 = ".tmp"
            java.io.File r14 = new java.io.File     // Catch:{ Exception -> 0x0178, all -> 0x0174 }
            r14.<init>(r6)     // Catch:{ Exception -> 0x0178, all -> 0x0174 }
            java.io.File r0 = java.io.File.createTempFile(r0, r5, r14)     // Catch:{ Exception -> 0x0178, all -> 0x0174 }
            goto L_0x004f
        L_0x007a:
            if (r5 != 0) goto L_0x0091
            java.lang.String r0 = "close instream exception "
            a((java.io.Closeable) r1, (java.lang.String) r0)
            java.lang.String r0 = "close outstream exception "
            a((java.io.Closeable) r13, (java.lang.String) r0)
            java.lang.String r0 = "close random file exception "
            a((java.io.Closeable) r13, (java.lang.String) r0)
            if (r5 == 0) goto L_0x0090
            r5.delete()     // Catch:{ Exception -> 0x0090 }
        L_0x0090:
            return r10
        L_0x0091:
            java.io.RandomAccessFile r14 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x016a, all -> 0x0167 }
            java.lang.String r0 = "rw"
            r14.<init>(r5, r0)     // Catch:{ Exception -> 0x016a, all -> 0x0167 }
            r14.setLength(r11)     // Catch:{ Exception -> 0x0165 }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch:{ Exception -> 0x0165 }
            r16 = r11
            r15 = 0
        L_0x00a2:
            int r11 = r1.read(r0)     // Catch:{ Exception -> 0x0165 }
            r12 = -1
            if (r11 == r12) goto L_0x010d
            if (r9 == 0) goto L_0x00cd
            boolean r12 = r9.f19878a     // Catch:{ Exception -> 0x0165 }
            if (r12 == 0) goto L_0x00cd
            r29.a()     // Catch:{ Exception -> 0x0165 }
            r29.b()     // Catch:{ Exception -> 0x0165 }
            r14.close()     // Catch:{ Exception -> 0x0165 }
            java.lang.String r0 = "close instream exception "
            a((java.io.Closeable) r1, (java.lang.String) r0)
            java.lang.String r0 = "close outstream exception "
            a((java.io.Closeable) r13, (java.lang.String) r0)
            java.lang.String r0 = "close random file exception "
            a((java.io.Closeable) r13, (java.lang.String) r0)
            if (r5 == 0) goto L_0x00cc
            r5.delete()     // Catch:{ Exception -> 0x00cc }
        L_0x00cc:
            return r10
        L_0x00cd:
            int r15 = r15 + r11
            if (r4 <= 0) goto L_0x00dc
            if (r15 > r4) goto L_0x00d3
            goto L_0x00dc
        L_0x00d3:
            r14.close()     // Catch:{ Exception -> 0x0165 }
            com.bytedance.frameworks.baselib.network.http.util.b r0 = new com.bytedance.frameworks.baselib.network.http.util.b     // Catch:{ Exception -> 0x016a, all -> 0x0167 }
            r0.<init>(r4, r2)     // Catch:{ Exception -> 0x016a, all -> 0x0167 }
            throw r0     // Catch:{ Exception -> 0x016a, all -> 0x0167 }
        L_0x00dc:
            r14.write(r0, r10, r11)     // Catch:{ Exception -> 0x0165 }
            if (r7 == 0) goto L_0x010b
            if (r8 == 0) goto L_0x010b
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0165 }
            r18 = 0
            long r18 = r11 - r16
            r20 = 500(0x1f4, double:2.47E-321)
            int r22 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r22 < 0) goto L_0x010b
            r23 = r11
            long r10 = (long) r15     // Catch:{ Exception -> 0x0165 }
            int r12 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x00fe
            int r10 = r15 * 100
            long r10 = (long) r10     // Catch:{ Exception -> 0x0165 }
            long r10 = r10 / r2
            int r10 = (int) r10     // Catch:{ Exception -> 0x0165 }
            goto L_0x0100
        L_0x00fe:
            r10 = 80
        L_0x0100:
            r11 = 99
            if (r10 < r11) goto L_0x0106
            r10 = 99
        L_0x0106:
            r7.a(r10, r8)     // Catch:{ Exception -> 0x0165 }
            r16 = r23
        L_0x010b:
            r10 = 0
            goto L_0x00a2
        L_0x010d:
            r26.close()     // Catch:{ Exception -> 0x0165 }
            if (r15 <= 0) goto L_0x0146
            r1 = 0
            r14.seek(r1)     // Catch:{ Exception -> 0x0143, all -> 0x0140 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0143, all -> 0x0140 }
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0143, all -> 0x0140 }
            r3 = r33
            r2.<init>(r6, r3)     // Catch:{ Exception -> 0x0143, all -> 0x0140 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0143, all -> 0x0140 }
        L_0x0123:
            int r2 = r14.read(r0)     // Catch:{ Exception -> 0x0139, all -> 0x0132 }
            if (r2 == r12) goto L_0x012e
            r3 = 0
            r1.write(r0, r3, r2)     // Catch:{ Exception -> 0x0139, all -> 0x0132 }
            goto L_0x0123
        L_0x012e:
            r1.close()     // Catch:{ Exception -> 0x0139, all -> 0x0132 }
            goto L_0x0146
        L_0x0132:
            r0 = move-exception
            r25 = r13
            r13 = r1
            r1 = r25
            goto L_0x0182
        L_0x0139:
            r0 = move-exception
            r25 = r13
            r13 = r1
            r1 = r25
            goto L_0x017b
        L_0x0140:
            r0 = move-exception
            r1 = r13
            goto L_0x0182
        L_0x0143:
            r0 = move-exception
            r1 = r13
            goto L_0x017b
        L_0x0146:
            r14.close()     // Catch:{ Exception -> 0x0143, all -> 0x0140 }
            r5.delete()     // Catch:{ Exception -> 0x0161, all -> 0x015d }
            java.lang.String r0 = "close instream exception "
            a((java.io.Closeable) r13, (java.lang.String) r0)
            java.lang.String r0 = "close outstream exception "
            a((java.io.Closeable) r13, (java.lang.String) r0)
            java.lang.String r0 = "close random file exception "
            a((java.io.Closeable) r13, (java.lang.String) r0)
            r0 = 1
            return r0
        L_0x015d:
            r0 = move-exception
            r1 = r13
            r14 = r1
            goto L_0x0182
        L_0x0161:
            r0 = move-exception
            r1 = r13
            r14 = r1
            goto L_0x017b
        L_0x0165:
            r0 = move-exception
            goto L_0x017b
        L_0x0167:
            r0 = move-exception
            r14 = r13
            goto L_0x0182
        L_0x016a:
            r0 = move-exception
            r14 = r13
            goto L_0x017b
        L_0x016d:
            throw r0     // Catch:{ Exception -> 0x0178, all -> 0x0174 }
        L_0x016e:
            com.bytedance.frameworks.baselib.network.http.util.b r0 = new com.bytedance.frameworks.baselib.network.http.util.b     // Catch:{ Exception -> 0x0178, all -> 0x0174 }
            r0.<init>(r4, r11)     // Catch:{ Exception -> 0x0178, all -> 0x0174 }
            throw r0     // Catch:{ Exception -> 0x0178, all -> 0x0174 }
        L_0x0174:
            r0 = move-exception
            r5 = r13
            r14 = r5
            goto L_0x0182
        L_0x0178:
            r0 = move-exception
            r5 = r13
            r14 = r5
        L_0x017b:
            r29.b()     // Catch:{ Throwable -> 0x0181 }
            goto L_0x0181
        L_0x017f:
            r0 = move-exception
            goto L_0x0182
        L_0x0181:
            throw r0     // Catch:{ all -> 0x017f }
        L_0x0182:
            java.lang.String r2 = "close instream exception "
            a((java.io.Closeable) r1, (java.lang.String) r2)
            java.lang.String r1 = "close outstream exception "
            a((java.io.Closeable) r13, (java.lang.String) r1)
            java.lang.String r1 = "close random file exception "
            a((java.io.Closeable) r14, (java.lang.String) r1)
            if (r5 == 0) goto L_0x0196
            r5.delete()     // Catch:{ Exception -> 0x0196 }
        L_0x0196:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.d.e.a(java.io.InputStream, long, com.bytedance.frameworks.baselib.network.http.f, int, java.lang.String, java.lang.String, java.lang.String, com.bytedance.frameworks.baselib.network.http.util.d, java.lang.String, com.bytedance.frameworks.baselib.network.http.util.h):boolean");
    }
}
