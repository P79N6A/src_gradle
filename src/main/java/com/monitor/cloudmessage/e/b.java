package com.monitor.cloudmessage.e;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.zip.CRC32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f27353a = "b";

    /* JADX WARNING: Removed duplicated region for block: B:21:0x002a A[SYNTHETIC, Splitter:B:21:0x002a] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0030 A[SYNTHETIC, Splitter:B:27:0x0030] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 != 0) goto L_0x0034
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0034
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x0014
            goto L_0x0034
        L_0x0014:
            r0 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x002e, all -> 0x0027 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x002e, all -> 0x0027 }
            boolean r3 = a((java.io.InputStream) r2, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ Exception -> 0x0025, all -> 0x0022 }
            r2.close()     // Catch:{ Exception -> 0x0021 }
        L_0x0021:
            return r3
        L_0x0022:
            r3 = move-exception
            r0 = r2
            goto L_0x0028
        L_0x0025:
            r0 = r2
            goto L_0x002e
        L_0x0027:
            r3 = move-exception
        L_0x0028:
            if (r0 == 0) goto L_0x002d
            r0.close()     // Catch:{ Exception -> 0x002d }
        L_0x002d:
            throw r3
        L_0x002e:
            if (r0 == 0) goto L_0x0033
            r0.close()     // Catch:{ Exception -> 0x0033 }
        L_0x0033:
            return r1
        L_0x0034:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.monitor.cloudmessage.e.b.a(java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    public static File a(Context context) {
        File externalFilesDir = context.getExternalFilesDir("cloudMessage");
        if (externalFilesDir == null) {
            externalFilesDir = new File(context.getFilesDir(), "cloudMessage");
        }
        if (!externalFilesDir.exists()) {
            externalFilesDir.mkdir();
        }
        return externalFilesDir;
    }

    public static boolean a(String str) {
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        int length = listFiles.length;
        boolean z = true;
        for (int i = 0; i < length; i++) {
            if (!listFiles[i].isDirectory() ? !z || !listFiles[i].delete() : !z || !a(listFiles[i].getAbsolutePath())) {
                z = false;
            } else {
                z = true;
            }
        }
        if (!z || !file.delete()) {
            return false;
        }
        return true;
    }

    public static void a(String str, String str2) throws Exception {
        a(str2, new File(str));
    }

    private static void a(String str, File file) throws Exception {
        ZipOutputStream zipOutputStream = null;
        try {
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(new FileOutputStream(str));
            try {
                a(zipOutputStream2, file, "");
                c.a(zipOutputStream2);
            } catch (Throwable th) {
                th = th;
                zipOutputStream = zipOutputStream2;
                c.a(zipOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c.a(zipOutputStream);
            throw th;
        }
    }

    public static void a(String str, String... strArr) {
        ZipOutputStream zipOutputStream;
        FileOutputStream fileOutputStream;
        CheckedOutputStream checkedOutputStream;
        Exception e2;
        ZipOutputStream zipOutputStream2;
        try {
            fileOutputStream = new FileOutputStream(new File(str));
            try {
                checkedOutputStream = new CheckedOutputStream(fileOutputStream, new CRC32());
                try {
                    zipOutputStream2 = new ZipOutputStream(checkedOutputStream);
                } catch (Exception e3) {
                    e = e3;
                    zipOutputStream2 = null;
                    e2 = e;
                    try {
                        throw new RuntimeException(e2);
                    } catch (Throwable th) {
                        th = th;
                        c.a(zipOutputStream);
                        c.a(checkedOutputStream);
                        c.a(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    zipOutputStream = null;
                    th = th;
                    c.a(zipOutputStream);
                    c.a(checkedOutputStream);
                    c.a(fileOutputStream);
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                checkedOutputStream = null;
                zipOutputStream2 = null;
                e2 = e;
                throw new RuntimeException(e2);
            } catch (Throwable th3) {
                th = th3;
                checkedOutputStream = null;
                zipOutputStream = null;
                th = th;
                c.a(zipOutputStream);
                c.a(checkedOutputStream);
                c.a(fileOutputStream);
                throw th;
            }
            try {
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    File file = new File(strArr[i]);
                    if (file.exists()) {
                        a(file, zipOutputStream2, "");
                        i++;
                    } else {
                        throw new RuntimeException(r4 + "不存在！");
                    }
                }
                c.a(zipOutputStream2);
                c.a(checkedOutputStream);
                c.a(fileOutputStream);
            } catch (Exception e5) {
                e2 = e5;
                throw new RuntimeException(e2);
            }
        } catch (Exception e6) {
            e = e6;
            checkedOutputStream = null;
            fileOutputStream = null;
            zipOutputStream2 = null;
            e2 = e;
            throw new RuntimeException(e2);
        } catch (Throwable th4) {
            th = th4;
            checkedOutputStream = null;
            fileOutputStream = null;
            zipOutputStream = null;
            th = th;
            c.a(zipOutputStream);
            c.a(checkedOutputStream);
            c.a(fileOutputStream);
            throw th;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b(java.lang.String r3, java.lang.String r4) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.monitor.cloudmessage.a.a()
            android.content.Context r1 = com.monitor.cloudmessage.a.b()
            int r2 = r3.hashCode()
            switch(r2) {
                case -1481211727: goto L_0x0046;
                case -1427366653: goto L_0x003c;
                case -1301710629: goto L_0x0032;
                case -540898700: goto L_0x0028;
                case 70125656: goto L_0x001e;
                case 1506669642: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0050
        L_0x0014:
            java.lang.String r2 = "data_package_file"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x0050
            r3 = 3
            goto L_0x0051
        L_0x001e:
            java.lang.String r2 = "sd_package"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x0050
            r3 = 0
            goto L_0x0051
        L_0x0028:
            java.lang.String r2 = "data_package_cache"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x0050
            r3 = 5
            goto L_0x0051
        L_0x0032:
            java.lang.String r2 = "sd_package_cache"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x0050
            r3 = 4
            goto L_0x0051
        L_0x003c:
            java.lang.String r2 = "sd_package_file"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x0050
            r3 = 2
            goto L_0x0051
        L_0x0046:
            java.lang.String r2 = "data_package"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x0050
            r3 = 1
            goto L_0x0051
        L_0x0050:
            r3 = -1
        L_0x0051:
            r2 = 0
            switch(r3) {
                case 0: goto L_0x00a5;
                case 1: goto L_0x0092;
                case 2: goto L_0x0083;
                case 3: goto L_0x0074;
                case 4: goto L_0x0065;
                case 5: goto L_0x0056;
                default: goto L_0x0055;
            }
        L_0x0055:
            return r2
        L_0x0056:
            java.io.File r3 = r1.getCacheDir()
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            return r3
        L_0x0065:
            java.io.File r3 = r1.getExternalCacheDir()
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            return r3
        L_0x0074:
            java.io.File r3 = r1.getFilesDir()
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            return r3
        L_0x0083:
            java.io.File r3 = r1.getExternalFilesDir(r2)
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            return r3
        L_0x0092:
            java.io.File r3 = r1.getFilesDir()
            java.io.File r3 = r3.getParentFile()
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            return r3
        L_0x00a5:
            java.io.File r3 = r1.getExternalFilesDir(r2)
            java.io.File r3 = r3.getParentFile()
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.monitor.cloudmessage.e.b.b(java.lang.String, java.lang.String):java.lang.String");
    }

    private static void b(File file, ZipOutputStream zipOutputStream, String str) {
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            for (File a2 : listFiles) {
                a(a2, zipOutputStream, str);
            }
        }
    }

    private static void a(File file, ZipOutputStream zipOutputStream, String str) {
        if (file.isDirectory()) {
            b(file, zipOutputStream, str + file.getName() + File.separator);
            return;
        }
        PrintStream printStream = System.out;
        printStream.println("压缩：" + str + file.getName());
        c(file, zipOutputStream, str);
    }

    private static void c(File file, ZipOutputStream zipOutputStream, String str) {
        BufferedInputStream bufferedInputStream;
        FileInputStream fileInputStream;
        if (file.exists()) {
            FileInputStream fileInputStream2 = null;
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    bufferedInputStream = new BufferedInputStream(fileInputStream);
                } catch (Exception e2) {
                    e = e2;
                    bufferedInputStream = null;
                    fileInputStream2 = fileInputStream;
                    try {
                        throw new RuntimeException(e);
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        c.a(bufferedInputStream);
                        c.a(fileInputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream = null;
                    c.a(bufferedInputStream);
                    c.a(fileInputStream);
                    throw th;
                }
                try {
                    zipOutputStream.putNextEntry(new ZipEntry(str + file.getName()));
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = bufferedInputStream.read(bArr, 0, 8192);
                        if (read != -1) {
                            zipOutputStream.write(bArr, 0, read);
                        } else {
                            c.a(bufferedInputStream);
                            c.a(fileInputStream);
                            return;
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    fileInputStream2 = fileInputStream;
                    throw new RuntimeException(e);
                } catch (Throwable th3) {
                    th = th3;
                    c.a(bufferedInputStream);
                    c.a(fileInputStream);
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                bufferedInputStream = null;
                throw new RuntimeException(e);
            } catch (Throwable th4) {
                th = th4;
                fileInputStream = null;
                bufferedInputStream = null;
                c.a(bufferedInputStream);
                c.a(fileInputStream);
                throw th;
            }
        }
    }

    private static void a(ZipOutputStream zipOutputStream, File file, String str) throws Exception {
        FileInputStream fileInputStream;
        String str2;
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            zipOutputStream.putNextEntry(new ZipEntry(str + "/"));
            if (str.length() == 0) {
                str2 = "";
            } else {
                str2 = str + "/";
            }
            for (File a2 : listFiles) {
                a(zipOutputStream, a2, str2 + listFiles[r0].getName());
            }
            return;
        }
        zipOutputStream.putNextEntry(new ZipEntry(str));
        try {
            fileInputStream = new FileInputStream(file);
            try {
                System.out.println(str);
                while (true) {
                    int read = fileInputStream.read();
                    if (read != -1) {
                        zipOutputStream.write(read);
                    } else {
                        c.a(fileInputStream);
                        return;
                    }
                }
            } catch (Throwable th) {
                th = th;
                c.a(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            c.a(fileInputStream);
            throw th;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:26|27|(0)|34|35|36) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0049 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x0052 */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0046 A[SYNTHETIC, Splitter:B:32:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x004f A[SYNTHETIC, Splitter:B:40:0x004f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(java.io.InputStream r4, java.lang.String r5, java.lang.String r6) {
        /*
            r0 = 0
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x004d, all -> 0x0043 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x004d, all -> 0x0043 }
            boolean r5 = r2.exists()     // Catch:{ Exception -> 0x004d, all -> 0x0043 }
            if (r5 != 0) goto L_0x0017
            boolean r5 = r2.mkdirs()     // Catch:{ Exception -> 0x004d, all -> 0x0043 }
            if (r5 != 0) goto L_0x0017
            r4.close()     // Catch:{ Exception -> 0x0016 }
        L_0x0016:
            return r1
        L_0x0017:
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x004d, all -> 0x0043 }
            r5.<init>(r2, r6)     // Catch:{ Exception -> 0x004d, all -> 0x0043 }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x004d, all -> 0x0043 }
            r6.<init>(r5)     // Catch:{ Exception -> 0x004d, all -> 0x0043 }
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch:{ Exception -> 0x0041, all -> 0x003e }
        L_0x0025:
            int r2 = r4.read(r5)     // Catch:{ Exception -> 0x0041, all -> 0x003e }
            r3 = -1
            if (r2 == r3) goto L_0x0030
            r6.write(r5, r1, r2)     // Catch:{ Exception -> 0x0041, all -> 0x003e }
            goto L_0x0025
        L_0x0030:
            r6.flush()     // Catch:{ Exception -> 0x0041, all -> 0x003e }
            r6.close()     // Catch:{ Exception -> 0x0041, all -> 0x003e }
            r4.close()     // Catch:{ Exception -> 0x004d, all -> 0x0043 }
            r4.close()     // Catch:{ Exception -> 0x003c }
        L_0x003c:
            r4 = 1
            return r4
        L_0x003e:
            r5 = move-exception
            r0 = r6
            goto L_0x0044
        L_0x0041:
            r0 = r6
            goto L_0x004d
        L_0x0043:
            r5 = move-exception
        L_0x0044:
            if (r0 == 0) goto L_0x0049
            r0.close()     // Catch:{ Exception -> 0x0049 }
        L_0x0049:
            r4.close()     // Catch:{ Exception -> 0x004c }
        L_0x004c:
            throw r5
        L_0x004d:
            if (r0 == 0) goto L_0x0052
            r0.close()     // Catch:{ Exception -> 0x0052 }
        L_0x0052:
            r4.close()     // Catch:{ Exception -> 0x0055 }
        L_0x0055:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.monitor.cloudmessage.e.b.a(java.io.InputStream, java.lang.String, java.lang.String):boolean");
    }
}
