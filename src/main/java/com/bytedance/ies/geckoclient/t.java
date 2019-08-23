package com.bytedance.ies.geckoclient;

import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    private static byte[] f20843a = {80, 75, 3, 4};

    /* renamed from: b  reason: collision with root package name */
    private static byte[] f20844b = {80, 75, 5, 6};

    public final boolean a(String str) {
        return a(new File(str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x003c A[SYNTHETIC, Splitter:B:26:0x003c] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0042 A[SYNTHETIC, Splitter:B:32:0x0042] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(java.io.File r4) {
        /*
            boolean r0 = r4.exists()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r4.isDirectory()
            if (r0 == 0) goto L_0x000f
            return r1
        L_0x000f:
            r0 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0040, all -> 0x0038 }
            r2.<init>(r4)     // Catch:{ Exception -> 0x0040, all -> 0x0038 }
            r4 = 4
            byte[] r0 = new byte[r4]     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            int r3 = r2.read(r0, r1, r4)     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            if (r3 != r4) goto L_0x0030
            byte[] r4 = f20843a     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            boolean r4 = java.util.Arrays.equals(r4, r0)     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            if (r4 != 0) goto L_0x002e
            byte[] r4 = f20844b     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            boolean r4 = java.util.Arrays.equals(r4, r0)     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            if (r4 == 0) goto L_0x0030
        L_0x002e:
            r4 = 1
            r1 = 1
        L_0x0030:
            r2.close()     // Catch:{ Exception -> 0x0045 }
            goto L_0x0045
        L_0x0034:
            r4 = move-exception
            goto L_0x003a
        L_0x0036:
            r0 = r2
            goto L_0x0040
        L_0x0038:
            r4 = move-exception
            r2 = r0
        L_0x003a:
            if (r2 == 0) goto L_0x003f
            r2.close()     // Catch:{ Exception -> 0x003f }
        L_0x003f:
            throw r4
        L_0x0040:
            if (r0 == 0) goto L_0x0045
            r0.close()     // Catch:{ Exception -> 0x0045 }
        L_0x0045:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.geckoclient.t.a(java.io.File):boolean");
    }

    public static boolean a(String str, String str2) throws Exception {
        File file;
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(str));
        do {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null) {
                file = new File(nextEntry.getName());
                while (!TextUtils.isEmpty(file.getParent())) {
                    file = file.getParentFile();
                }
            } else {
                zipInputStream.close();
                return false;
            }
        } while (!TextUtils.equals(file.getPath(), str2));
        zipInputStream.close();
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0128  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r8, java.lang.String r9, java.lang.String r10) throws java.lang.Exception {
        /*
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r8)
            r0.<init>(r1)
            r8 = 0
            java.lang.String r1 = ""
            r2 = r8
        L_0x000e:
            java.util.zip.ZipEntry r3 = r0.getNextEntry()     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            if (r3 == 0) goto L_0x00c1
            java.lang.String r4 = r3.getName()     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            if (r5 == 0) goto L_0x0036
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
        L_0x0023:
            java.lang.String r5 = r1.getParent()     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            if (r5 != 0) goto L_0x0032
            java.io.File r1 = r1.getParentFile()     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            goto L_0x0023
        L_0x0032:
            java.lang.String r1 = r1.getPath()     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
        L_0x0036:
            if (r4 == 0) goto L_0x000e
            boolean r5 = r4.startsWith(r10)     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            if (r5 == 0) goto L_0x000e
            boolean r3 = r3.isDirectory()     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            r5 = 0
            if (r3 == 0) goto L_0x0072
            int r3 = r4.length()     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            int r3 = r3 + -1
            java.lang.String r3 = r4.substring(r5, r3)     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            r5.<init>()     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            r5.append(r9)     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            java.lang.String r6 = java.io.File.separator     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            r5.append(r6)     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            r5.append(r3)     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            java.lang.String r3 = r5.toString()     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            r4.<init>(r3)     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            boolean r3 = r4.exists()     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            if (r3 != 0) goto L_0x000e
            r4.mkdirs()     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            goto L_0x000e
        L_0x0072:
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            r6.<init>()     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            r6.append(r9)     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            java.lang.String r7 = java.io.File.separator     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            r6.append(r7)     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            r6.append(r4)     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            java.lang.String r4 = r6.toString()     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            java.io.File r4 = r3.getParentFile()     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            boolean r4 = r4.exists()     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            if (r4 != 0) goto L_0x009c
            java.io.File r4 = r3.getParentFile()     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            r4.mkdirs()     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
        L_0x009c:
            r3.createNewFile()     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            r4.<init>(r3)     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch:{ Exception -> 0x00bf, all -> 0x00bc }
        L_0x00a8:
            int r3 = r0.read(r2)     // Catch:{ Exception -> 0x00bf, all -> 0x00bc }
            r6 = -1
            if (r3 == r6) goto L_0x00b6
            r4.write(r2, r5, r3)     // Catch:{ Exception -> 0x00bf, all -> 0x00bc }
            r4.flush()     // Catch:{ Exception -> 0x00bf, all -> 0x00bc }
            goto L_0x00a8
        L_0x00b6:
            r4.close()     // Catch:{ Exception -> 0x00bf, all -> 0x00bc }
            r2 = r4
            goto L_0x000e
        L_0x00bc:
            r8 = move-exception
            r2 = r4
            goto L_0x0119
        L_0x00bf:
            r2 = r4
            goto L_0x0123
        L_0x00c1:
            r0.close()     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            java.lang.String r10 = "/"
            boolean r10 = r1.endsWith(r10)     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            if (r10 == 0) goto L_0x00d3
            java.lang.String r10 = "/"
            java.lang.String r3 = ""
            r1.replace(r10, r3)     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
        L_0x00d3:
            java.io.File r10 = new java.io.File     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            r3.<init>()     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            r3.append(r9)     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            java.lang.String r9 = java.io.File.separator     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            r3.append(r9)     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            r3.append(r1)     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            java.lang.String r9 = java.io.File.separator     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            r3.append(r9)     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            java.lang.String r9 = "gecko_activate_done"
            r3.append(r9)     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            java.lang.String r9 = r3.toString()     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            r10.<init>(r9)     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            boolean r9 = r10.exists()     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            if (r9 != 0) goto L_0x00ff
            r10.createNewFile()     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
        L_0x00ff:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            java.lang.String r10 = "unzip file done:"
            r9.<init>(r10)     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            r9.append(r1)     // Catch:{ Exception -> 0x0114, all -> 0x0112 }
            r0.close()
            if (r2 == 0) goto L_0x0111
            r2.close()
        L_0x0111:
            return r1
        L_0x0112:
            r8 = move-exception
            goto L_0x0119
        L_0x0114:
            goto L_0x0123
        L_0x0116:
            r9 = move-exception
            r2 = r8
            r8 = r9
        L_0x0119:
            r0.close()
            if (r2 == 0) goto L_0x0121
            r2.close()
        L_0x0121:
            throw r8
        L_0x0122:
            r2 = r8
        L_0x0123:
            r0.close()
            if (r2 == 0) goto L_0x012b
            r2.close()
        L_0x012b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.geckoclient.t.a(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }
}
