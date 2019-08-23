package com.ss.android.ugc.effectmanager.common.f;

import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class d {
    private static boolean a() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Exception unused) {
            return false;
        }
    }

    public static void e(String str) {
        a(new File(str));
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    public static InputStream d(String str) {
        FileInputStream fileInputStream;
        File file = new File(str);
        if (!a(file.getPath())) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Exception unused) {
            fileInputStream = null;
        }
        return fileInputStream;
    }

    public static boolean b(String str) {
        if (!a() || TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (!file.exists() || !file.canWrite() || !file.delete()) {
            return false;
        }
        return true;
    }

    public static void a(File file) {
        if (file != null && file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                if (listFiles.length == 0) {
                    file.delete();
                    return;
                }
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        a(file2);
                    } else {
                        file2.delete();
                    }
                }
                file.delete();
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0036 */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0048 A[SYNTHETIC, Splitter:B:25:0x0048] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004f A[SYNTHETIC, Splitter:B:29:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0056 A[SYNTHETIC, Splitter:B:36:0x0056] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x005d A[SYNTHETIC, Splitter:B:40:0x005d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String c(java.lang.String r4) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            java.lang.String r4 = r0.getPath()
            boolean r4 = a((java.lang.String) r4)
            if (r4 == 0) goto L_0x0061
            java.lang.String r4 = ""
            r1 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ Exception -> 0x0053, all -> 0x0043 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0053, all -> 0x0043 }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0041, all -> 0x003e }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0041, all -> 0x003e }
        L_0x001c:
            java.lang.String r1 = r0.readLine()     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            if (r1 == 0) goto L_0x0033
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            r3.<init>()     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            r3.append(r4)     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            r3.append(r1)     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            r4 = r1
            goto L_0x001c
        L_0x0033:
            r2.close()     // Catch:{ IOException -> 0x0036 }
        L_0x0036:
            r0.close()     // Catch:{ IOException -> 0x0060 }
            goto L_0x0060
        L_0x003a:
            r4 = move-exception
            goto L_0x0046
        L_0x003c:
            r1 = r0
            goto L_0x0054
        L_0x003e:
            r4 = move-exception
            r0 = r1
            goto L_0x0046
        L_0x0041:
            goto L_0x0054
        L_0x0043:
            r4 = move-exception
            r0 = r1
            r2 = r0
        L_0x0046:
            if (r2 == 0) goto L_0x004d
            r2.close()     // Catch:{ IOException -> 0x004c }
            goto L_0x004d
        L_0x004c:
        L_0x004d:
            if (r0 == 0) goto L_0x0052
            r0.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            throw r4
        L_0x0053:
            r2 = r1
        L_0x0054:
            if (r2 == 0) goto L_0x005b
            r2.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x005b
        L_0x005a:
        L_0x005b:
            if (r1 == 0) goto L_0x0060
            r1.close()     // Catch:{ IOException -> 0x0060 }
        L_0x0060:
            return r4
        L_0x0061:
            java.lang.String r4 = ""
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.common.f.d.c(java.lang.String):java.lang.String");
    }

    public static File a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            try {
                File parentFile = file.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                file.createNewFile();
            } catch (IOException unused) {
            }
        }
        return file;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.util.zip.ZipInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.io.BufferedOutputStream} */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.zip.ZipInputStream] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b4 A[SYNTHETIC, Splitter:B:46:0x00b4] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b9 A[Catch:{ IOException -> 0x00bc }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r5, java.lang.String r6) throws com.ss.android.ugc.effectmanager.common.c.c {
        /*
            r0 = 0
            java.util.zip.ZipInputStream r1 = new java.util.zip.ZipInputStream     // Catch:{ IOException -> 0x00a3, all -> 0x00a0 }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x00a3, all -> 0x00a0 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00a3, all -> 0x00a0 }
            r3.<init>(r5)     // Catch:{ IOException -> 0x00a3, all -> 0x00a0 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x00a3, all -> 0x00a0 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x00a3, all -> 0x00a0 }
        L_0x0010:
            java.util.zip.ZipEntry r5 = r1.getNextEntry()     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            if (r5 == 0) goto L_0x0090
            java.lang.String r2 = r5.getName()     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            boolean r5 = r5.isDirectory()     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            if (r5 == 0) goto L_0x003d
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            r3.<init>()     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            r3.append(r6)     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            java.lang.String r4 = java.io.File.separator     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            r3.append(r4)     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            r3.append(r2)     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            java.lang.String r2 = r3.toString()     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            r5.<init>(r2)     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            r5.mkdirs()     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            goto L_0x0010
        L_0x003d:
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            r3.<init>()     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            r3.append(r6)     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            java.lang.String r4 = java.io.File.separator     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            r3.append(r4)     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            r3.append(r2)     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            java.lang.String r2 = r3.toString()     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            r5.<init>(r2)     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            boolean r2 = r5.exists()     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            if (r2 == 0) goto L_0x0060
            r5.delete()     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            goto L_0x0067
        L_0x0060:
            java.io.File r2 = r5.getParentFile()     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            r2.mkdirs()     // Catch:{ IOException -> 0x009c, all -> 0x009a }
        L_0x0067:
            r5.createNewFile()     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            r3.<init>(r5)     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            r2.<init>(r3)     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            r5 = 2048(0x800, float:2.87E-42)
            byte[] r5 = new byte[r5]     // Catch:{ IOException -> 0x008e, all -> 0x008c }
        L_0x0078:
            int r0 = r1.read(r5)     // Catch:{ IOException -> 0x008e, all -> 0x008c }
            r3 = -1
            if (r0 == r3) goto L_0x0084
            r3 = 0
            r2.write(r5, r3, r0)     // Catch:{ IOException -> 0x008e, all -> 0x008c }
            goto L_0x0078
        L_0x0084:
            r2.flush()     // Catch:{ IOException -> 0x008e, all -> 0x008c }
            r2.close()     // Catch:{ IOException -> 0x008e, all -> 0x008c }
            r0 = r2
            goto L_0x0010
        L_0x008c:
            r5 = move-exception
            goto L_0x00b1
        L_0x008e:
            r5 = move-exception
            goto L_0x009e
        L_0x0090:
            r1.close()     // Catch:{ IOException -> 0x0099 }
            if (r0 == 0) goto L_0x0098
            r0.close()     // Catch:{ IOException -> 0x0099 }
        L_0x0098:
            return
        L_0x0099:
            return
        L_0x009a:
            r5 = move-exception
            goto L_0x00b2
        L_0x009c:
            r5 = move-exception
            r2 = r0
        L_0x009e:
            r0 = r1
            goto L_0x00a5
        L_0x00a0:
            r5 = move-exception
            r1 = r0
            goto L_0x00b2
        L_0x00a3:
            r5 = move-exception
            r2 = r0
        L_0x00a5:
            com.ss.android.ugc.effectmanager.common.c.c r6 = new com.ss.android.ugc.effectmanager.common.c.c     // Catch:{ all -> 0x00af }
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x00af }
            r6.<init>(r5)     // Catch:{ all -> 0x00af }
            throw r6     // Catch:{ all -> 0x00af }
        L_0x00af:
            r5 = move-exception
            r1 = r0
        L_0x00b1:
            r0 = r2
        L_0x00b2:
            if (r1 == 0) goto L_0x00b7
            r1.close()     // Catch:{ IOException -> 0x00bc }
        L_0x00b7:
            if (r0 == 0) goto L_0x00bc
            r0.close()     // Catch:{ IOException -> 0x00bc }
        L_0x00bc:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.common.f.d.a(java.lang.String, java.lang.String):void");
    }
}
