package com.bytedance.common.utility.io;

import android.os.StatFs;
import android.text.TextUtils;
import com.bytedance.common.utility.reflect.JavaCalls;
import com.taobao.android.dexposed.ClassUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipFile;

public class IOUtils {
    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void close(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean mkdir(String str) {
        return new File(str).mkdirs();
    }

    public static void deleteFile(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isFile()) {
                file.delete();
            }
        }
    }

    public static boolean exists(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    public static String getFileExtension(String str) {
        int lastIndexOf = str.lastIndexOf(ClassUtils.PACKAGE_SEPARATOR);
        if (lastIndexOf < 0 || lastIndexOf >= str.length() - 1) {
            return "";
        }
        return str.substring(lastIndexOf + 1).toUpperCase();
    }

    public static String getFileNameWithoutExtension(String str) {
        String fileName = getFileName(str);
        if (fileName != null && fileName.length() > 0) {
            int lastIndexOf = fileName.lastIndexOf(46);
            if (lastIndexOf > 0) {
                return fileName.substring(0, lastIndexOf);
            }
        }
        return fileName;
    }

    public static boolean canWrite(File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        File file2 = new File(file, ClassUtils.PACKAGE_SEPARATOR + System.currentTimeMillis());
        boolean mkdir = file2.mkdir();
        if (mkdir) {
            mkdir = file2.delete();
        }
        return mkdir;
    }

    public static long getAllBytes(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            if (!TextUtils.isEmpty(str) && new File(str).exists()) {
                StatFs statFs = new StatFs(str);
                return ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount());
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    public static long getAvailableBytes(String str) {
        try {
            if (!TextUtils.isEmpty(str) && new File(str).exists()) {
                StatFs statFs = new StatFs(str);
                return ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    public static String getFileName(String str) {
        if (str.endsWith("/")) {
            str = str.substring(0, str.length() - 1);
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf <= 0 || lastIndexOf >= str.length() - 1) {
            return str;
        }
        return str.substring(lastIndexOf + 1);
    }

    public static long getFileSize(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        File file = new File(str);
        if (!file.exists()) {
            return 0;
        }
        long length = file.length();
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int length2 = listFiles.length;
                int i = 0;
                while (i < length2) {
                    try {
                        length += getFileSize(listFiles[i].getAbsolutePath());
                        i++;
                    } catch (StackOverflowError unused) {
                        return 0;
                    } catch (OutOfMemoryError unused2) {
                        return 0;
                    }
                }
            }
        }
        return length;
    }

    public static String getParentFilePath(String str) {
        if (str.endsWith("/")) {
            str = str.substring(0, str.length() - 1);
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            return str.substring(0, lastIndexOf);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x001e A[SYNTHETIC, Splitter:B:15:0x001e] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0026 A[SYNTHETIC, Splitter:B:22:0x0026] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String readFileFirstLine(java.lang.String r3) {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0022, all -> 0x001b }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ Exception -> 0x0022, all -> 0x001b }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0022, all -> 0x001b }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0022, all -> 0x001b }
            java.lang.String r3 = r1.readLine()     // Catch:{ Exception -> 0x0019, all -> 0x0016 }
            r1.close()     // Catch:{ Exception -> 0x0019, all -> 0x0016 }
            r1.close()     // Catch:{ IOException -> 0x0015 }
        L_0x0015:
            return r3
        L_0x0016:
            r3 = move-exception
            r0 = r1
            goto L_0x001c
        L_0x0019:
            r0 = r1
            goto L_0x0022
        L_0x001b:
            r3 = move-exception
        L_0x001c:
            if (r0 == 0) goto L_0x0021
            r0.close()     // Catch:{ IOException -> 0x0021 }
        L_0x0021:
            throw r3
        L_0x0022:
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x0029
            r0.close()     // Catch:{ IOException -> 0x0029 }
        L_0x0029:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.io.IOUtils.readFileFirstLine(java.lang.String):java.lang.String");
    }

    public static void clearPath(String str) {
        String str2;
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            for (String str3 : file.list()) {
                if (str.endsWith(File.separator)) {
                    str2 = str + str3;
                } else {
                    str2 = str + File.separator + str3;
                }
                File file2 = new File(str2);
                if (file2.isFile()) {
                    file2.delete();
                }
                if (file2.isDirectory()) {
                    deletePath(str2);
                }
            }
        }
    }

    public static void deletePath(String str) {
        String str2;
        File file = new File(str);
        if (file.exists()) {
            if (file.isFile()) {
                file.delete();
                return;
            }
            String[] list = file.list();
            if (list != null) {
                for (String str3 : list) {
                    if (str3 != null) {
                        if (str.endsWith(File.separator)) {
                            str2 = str + str3;
                        } else {
                            str2 = str + File.separator + str3;
                        }
                        File file2 = new File(str2);
                        if (file2.isFile()) {
                            file2.delete();
                        }
                        if (file2.isDirectory()) {
                            deletePath(str2);
                        }
                    }
                }
                file.delete();
            }
        }
    }

    public static boolean copyFile(String str, String str2) {
        return copyFile(new File(str), new File(str2));
    }

    public static boolean renameFile(String str, String str2) {
        File file = new File(str);
        File file2 = new File(str2);
        if (!file.exists()) {
            return false;
        }
        return file.renameTo(file2);
    }

    public static void setPermissions(String str, int i) {
        JavaCalls.callStaticMethod("android.os.FileUtils", str, Integer.valueOf(i), -1, -1);
    }

    public static boolean copyFile(File file, File file2) {
        if (!file.exists() || !file.isFile() || file2.isDirectory()) {
            return false;
        }
        if (file2.exists()) {
            file2.delete();
        }
        try {
            byte[] bArr = new byte[2048];
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read != -1) {
                    bufferedOutputStream.write(bArr, 0, read);
                } else {
                    bufferedInputStream.close();
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                    return true;
                }
            }
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x002c A[SYNTHETIC, Splitter:B:20:0x002c] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0032 A[SYNTHETIC, Splitter:B:26:0x0032] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0038 A[SYNTHETIC, Splitter:B:32:0x0038] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void write(java.lang.String r3, java.lang.String r4, boolean r5) {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x0036, Throwable -> 0x0030, all -> 0x0029 }
            r1.<init>(r3)     // Catch:{ IOException -> 0x0036, Throwable -> 0x0030, all -> 0x0029 }
            boolean r2 = r1.exists()     // Catch:{ IOException -> 0x0036, Throwable -> 0x0030, all -> 0x0029 }
            if (r2 != 0) goto L_0x0016
            java.io.File r2 = r1.getParentFile()     // Catch:{ IOException -> 0x0036, Throwable -> 0x0030, all -> 0x0029 }
            r2.mkdirs()     // Catch:{ IOException -> 0x0036, Throwable -> 0x0030, all -> 0x0029 }
            r1.createNewFile()     // Catch:{ IOException -> 0x0036, Throwable -> 0x0030, all -> 0x0029 }
        L_0x0016:
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch:{ IOException -> 0x0036, Throwable -> 0x0030, all -> 0x0029 }
            r1.<init>(r3, r5)     // Catch:{ IOException -> 0x0036, Throwable -> 0x0030, all -> 0x0029 }
            r1.write(r4)     // Catch:{ IOException -> 0x0027, Throwable -> 0x0025, all -> 0x0022 }
            r1.close()     // Catch:{ Exception -> 0x0021 }
        L_0x0021:
            return
        L_0x0022:
            r3 = move-exception
            r0 = r1
            goto L_0x002a
        L_0x0025:
            r0 = r1
            goto L_0x0030
        L_0x0027:
            r0 = r1
            goto L_0x0036
        L_0x0029:
            r3 = move-exception
        L_0x002a:
            if (r0 == 0) goto L_0x002f
            r0.close()     // Catch:{ Exception -> 0x002f }
        L_0x002f:
            throw r3
        L_0x0030:
            if (r0 == 0) goto L_0x003c
            r0.close()     // Catch:{ Exception -> 0x0035 }
        L_0x0035:
            return
        L_0x0036:
            if (r0 == 0) goto L_0x003c
            r0.close()     // Catch:{ Exception -> 0x003b }
        L_0x003b:
            return
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.io.IOUtils.write(java.lang.String, java.lang.String, boolean):void");
    }
}
