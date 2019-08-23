package com.tt.miniapphost.util;

import android.text.TextUtils;
import com.taobao.android.dexposed.ClassUtils;
import com.tt.miniapphost.AppBrandLogger;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class FileUtil {
    public static void clearDir(File file) {
        if (file != null && file.exists() && file.isDirectory()) {
            delete(file);
        }
    }

    public static String getFileExtension(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(ClassUtils.PACKAGE_SEPARATOR);
        if (lastIndexOf > 0) {
            return str.substring(lastIndexOf);
        }
        return "";
    }

    public static long getFileSize(File file) {
        if (file == null || !file.exists()) {
            return 0;
        }
        return getFileSizeInner(file);
    }

    private static long getFileSizeInner(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        long j = 0;
        for (File fileSize : file.listFiles()) {
            j += getFileSize(fileSize);
        }
        return j;
    }

    public static byte[] readBytes(String str) {
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            fileInputStream.close();
            return bArr;
        } catch (Exception e2) {
            AppBrandLogger.stacktrace(6, "FileUtil", e2.getStackTrace());
            return null;
        }
    }

    public static void delete(File file) {
        if (file.isFile()) {
            file.delete();
            return;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                file.delete();
                return;
            }
            for (File delete : listFiles) {
                delete(delete);
            }
            file.delete();
        }
    }

    public static long getDirSizeNonRecursive(File file) {
        long j = 0;
        if (file == null || !file.exists() || !file.isDirectory()) {
            return 0;
        }
        for (File length : file.listFiles()) {
            j += length.length();
        }
        return j;
    }

    public static String calculateMD5(File file) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[1024];
                while (true) {
                    try {
                        int read = fileInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        instance.update(bArr, 0, read);
                    } catch (IOException e2) {
                        throw new RuntimeException("Unable to process file for MD5", e2);
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e3) {
                            AppBrandLogger.e("FileUtil", "Exception on closing MD5 input stream", e3);
                        }
                        throw th;
                    }
                }
                String replace = String.format("%32s", new Object[]{new BigInteger(1, instance.digest()).toString(16)}).replace(' ', '0');
                try {
                    fileInputStream.close();
                } catch (IOException e4) {
                    AppBrandLogger.e("FileUtil", "Exception on closing MD5 input stream", e4);
                }
                return replace;
            } catch (FileNotFoundException e5) {
                AppBrandLogger.e("FileUtil", "Exception while getting FileInputStream", e5);
                return null;
            }
        } catch (NoSuchAlgorithmException e6) {
            AppBrandLogger.e("FileUtil", "Exception while getting digest", e6);
            return null;
        }
    }

    private static void copyFile(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static String readString(String str, String str2) {
        try {
            return new String(readBytes(str), str2);
        } catch (Exception e2) {
            AppBrandLogger.stacktrace(6, "FileUtil", e2.getStackTrace());
            return null;
        }
    }

    public static boolean checkMD5(String str, File file) {
        if (TextUtils.isEmpty(str) || file == null) {
            AppBrandLogger.e("FileUtil", "MD5 string empty or updateFile null");
            return false;
        }
        String calculateMD5 = calculateMD5(file);
        if (calculateMD5 == null) {
            AppBrandLogger.e("FileUtil", "calculatedDigest null");
            return false;
        }
        AppBrandLogger.d("FileUtil", "Calculated digest: ", calculateMD5);
        AppBrandLogger.d("FileUtil", "Provided digest: ", str);
        return calculateMD5.toLowerCase().startsWith(str.toLowerCase());
    }

    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:12|13|14|15|16|17) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002d */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x003f A[SYNTHETIC, Splitter:B:28:0x003f] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0046 A[SYNTHETIC, Splitter:B:32:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x004d A[SYNTHETIC, Splitter:B:39:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0054 A[SYNTHETIC, Splitter:B:43:0x0054] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean writeByteToFile(java.lang.String r2, byte[] r3) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x0008
            r2 = 0
            return r2
        L_0x0008:
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            r2 = 0
            boolean r1 = r0.exists()     // Catch:{ Exception -> 0x004a, all -> 0x003b }
            if (r1 == 0) goto L_0x0017
            r0.delete()     // Catch:{ Exception -> 0x004a, all -> 0x003b }
        L_0x0017:
            r0.createNewFile()     // Catch:{ Exception -> 0x004a, all -> 0x003b }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x004a, all -> 0x003b }
            r1.<init>(r0)     // Catch:{ Exception -> 0x004a, all -> 0x003b }
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x0039, all -> 0x0035 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0039, all -> 0x0035 }
            r0.write(r3)     // Catch:{ Exception -> 0x0033, all -> 0x0031 }
            r0.flush()     // Catch:{ Exception -> 0x0033, all -> 0x0031 }
            r1.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            r0.close()     // Catch:{ Exception -> 0x0057 }
            goto L_0x0057
        L_0x0031:
            r3 = move-exception
            goto L_0x0037
        L_0x0033:
            r2 = r0
            goto L_0x004b
        L_0x0035:
            r3 = move-exception
            r0 = r2
        L_0x0037:
            r2 = r1
            goto L_0x003d
        L_0x0039:
            goto L_0x004b
        L_0x003b:
            r3 = move-exception
            r0 = r2
        L_0x003d:
            if (r2 == 0) goto L_0x0044
            r2.close()     // Catch:{ IOException -> 0x0043 }
            goto L_0x0044
        L_0x0043:
        L_0x0044:
            if (r0 == 0) goto L_0x0049
            r0.close()     // Catch:{ Exception -> 0x0049 }
        L_0x0049:
            throw r3
        L_0x004a:
            r1 = r2
        L_0x004b:
            if (r1 == 0) goto L_0x0052
            r1.close()     // Catch:{ IOException -> 0x0051 }
            goto L_0x0052
        L_0x0051:
        L_0x0052:
            if (r2 == 0) goto L_0x0057
            r2.close()     // Catch:{ Exception -> 0x0057 }
        L_0x0057:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapphost.util.FileUtil.writeByteToFile(java.lang.String, byte[]):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0083 A[SYNTHETIC, Splitter:B:48:0x0083] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0093 A[SYNTHETIC, Splitter:B:53:0x0093] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a5 A[SYNTHETIC, Splitter:B:60:0x00a5] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b5 A[SYNTHETIC, Splitter:B:65:0x00b5] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean copyFolder(java.io.File r8, java.io.File r9) {
        /*
            boolean r0 = r8.isDirectory()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0030
            boolean r0 = r9.exists()
            if (r0 != 0) goto L_0x0011
            r9.mkdir()
        L_0x0011:
            java.lang.String[] r0 = r8.list()
            int r3 = r0.length
            r4 = 0
        L_0x0017:
            if (r4 >= r3) goto L_0x002f
            r5 = r0[r4]
            java.io.File r6 = new java.io.File
            r6.<init>(r8, r5)
            java.io.File r7 = new java.io.File
            r7.<init>(r9, r5)
            boolean r5 = copyFolder(r6, r7)
            if (r5 != 0) goto L_0x002c
            return r2
        L_0x002c:
            int r4 = r4 + 1
            goto L_0x0017
        L_0x002f:
            return r1
        L_0x0030:
            r0 = 0
            r3 = 6
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0076, all -> 0x0073 }
            r4.<init>(r8)     // Catch:{ IOException -> 0x0076, all -> 0x0073 }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x006f, all -> 0x006b }
            r8.<init>(r9)     // Catch:{ IOException -> 0x006f, all -> 0x006b }
            r9 = 1024(0x400, float:1.435E-42)
            byte[] r9 = new byte[r9]     // Catch:{ IOException -> 0x0069, all -> 0x0067 }
        L_0x0040:
            int r0 = r4.read(r9)     // Catch:{ IOException -> 0x0069, all -> 0x0067 }
            if (r0 <= 0) goto L_0x004a
            r8.write(r9, r2, r0)     // Catch:{ IOException -> 0x0069, all -> 0x0067 }
            goto L_0x0040
        L_0x004a:
            r4.close()     // Catch:{ IOException -> 0x004e }
            goto L_0x0058
        L_0x004e:
            r9 = move-exception
            java.lang.String r0 = "FileUtil"
            java.lang.StackTraceElement[] r9 = r9.getStackTrace()
            com.tt.miniapphost.AppBrandLogger.stacktrace(r3, r0, r9)
        L_0x0058:
            r8.close()     // Catch:{ IOException -> 0x005c }
            goto L_0x0066
        L_0x005c:
            r8 = move-exception
            java.lang.String r9 = "FileUtil"
            java.lang.StackTraceElement[] r8 = r8.getStackTrace()
            com.tt.miniapphost.AppBrandLogger.stacktrace(r3, r9, r8)
        L_0x0066:
            return r1
        L_0x0067:
            r9 = move-exception
            goto L_0x006d
        L_0x0069:
            r9 = move-exception
            goto L_0x0071
        L_0x006b:
            r9 = move-exception
            r8 = r0
        L_0x006d:
            r0 = r4
            goto L_0x00a3
        L_0x006f:
            r9 = move-exception
            r8 = r0
        L_0x0071:
            r0 = r4
            goto L_0x0078
        L_0x0073:
            r9 = move-exception
            r8 = r0
            goto L_0x00a3
        L_0x0076:
            r9 = move-exception
            r8 = r0
        L_0x0078:
            java.lang.String r1 = "FileUtil"
            java.lang.StackTraceElement[] r9 = r9.getStackTrace()     // Catch:{ all -> 0x00a2 }
            com.tt.miniapphost.AppBrandLogger.stacktrace(r3, r1, r9)     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x0091
            r0.close()     // Catch:{ IOException -> 0x0087 }
            goto L_0x0091
        L_0x0087:
            r9 = move-exception
            java.lang.String r0 = "FileUtil"
            java.lang.StackTraceElement[] r9 = r9.getStackTrace()
            com.tt.miniapphost.AppBrandLogger.stacktrace(r3, r0, r9)
        L_0x0091:
            if (r8 == 0) goto L_0x00a1
            r8.close()     // Catch:{ IOException -> 0x0097 }
            goto L_0x00a1
        L_0x0097:
            r8 = move-exception
            java.lang.String r9 = "FileUtil"
            java.lang.StackTraceElement[] r8 = r8.getStackTrace()
            com.tt.miniapphost.AppBrandLogger.stacktrace(r3, r9, r8)
        L_0x00a1:
            return r2
        L_0x00a2:
            r9 = move-exception
        L_0x00a3:
            if (r0 == 0) goto L_0x00b3
            r0.close()     // Catch:{ IOException -> 0x00a9 }
            goto L_0x00b3
        L_0x00a9:
            r0 = move-exception
            java.lang.String r1 = "FileUtil"
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            com.tt.miniapphost.AppBrandLogger.stacktrace(r3, r1, r0)
        L_0x00b3:
            if (r8 == 0) goto L_0x00c3
            r8.close()     // Catch:{ IOException -> 0x00b9 }
            goto L_0x00c3
        L_0x00b9:
            r8 = move-exception
            java.lang.StackTraceElement[] r8 = r8.getStackTrace()
            java.lang.String r0 = "FileUtil"
            com.tt.miniapphost.AppBrandLogger.stacktrace(r3, r0, r8)
        L_0x00c3:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapphost.util.FileUtil.copyFolder(java.io.File, java.io.File):boolean");
    }

    public static void unZipFolder(String str, String str2) throws Exception {
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(str));
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null) {
                String name = nextEntry.getName();
                if (nextEntry.isDirectory()) {
                    String substring = name.substring(0, name.length() - 1);
                    new File(str2 + File.separator + substring).mkdirs();
                } else {
                    File file = new File(str2 + File.separator + name);
                    if (!file.getParentFile().exists()) {
                        file.getParentFile().mkdirs();
                    }
                    file.createNewFile();
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = zipInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                        fileOutputStream.flush();
                    }
                    fileOutputStream.close();
                }
            } else {
                zipInputStream.close();
                return;
            }
        }
    }

    public static boolean writeStringToFile(String str, String str2, String str3) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (!file.exists()) {
            file.createNewFile();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        bufferedWriter.write(str2);
        bufferedWriter.flush();
        bufferedWriter.close();
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0061 A[SYNTHETIC, Splitter:B:35:0x0061] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0071 A[SYNTHETIC, Splitter:B:40:0x0071] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0075 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x007b A[SYNTHETIC, Splitter:B:48:0x007b] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x008b A[SYNTHETIC, Splitter:B:53:0x008b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void copyAssets(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
        /*
            android.content.res.AssetManager r2 = r2.getAssets()
            r0 = 0
            r1 = 6
            java.io.InputStream r2 = r2.open(r3)     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x004d, all -> 0x004b }
            r3.<init>(r4)     // Catch:{ IOException -> 0x004d, all -> 0x004b }
            java.io.File r4 = r3.getParentFile()     // Catch:{ IOException -> 0x004d, all -> 0x004b }
            boolean r4 = r4.exists()     // Catch:{ IOException -> 0x004d, all -> 0x004b }
            if (r4 != 0) goto L_0x0020
            java.io.File r4 = r3.getParentFile()     // Catch:{ IOException -> 0x004d, all -> 0x004b }
            r4.mkdirs()     // Catch:{ IOException -> 0x004d, all -> 0x004b }
        L_0x0020:
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x004d, all -> 0x004b }
            r4.<init>(r3)     // Catch:{ IOException -> 0x004d, all -> 0x004b }
            copyFile(r2, r4)     // Catch:{ IOException -> 0x0049, all -> 0x0047 }
            if (r2 == 0) goto L_0x0038
            r2.close()     // Catch:{ IOException -> 0x002e }
            goto L_0x0038
        L_0x002e:
            r2 = move-exception
            java.lang.String r3 = "FileUtil"
            java.lang.StackTraceElement[] r2 = r2.getStackTrace()
            com.tt.miniapphost.AppBrandLogger.stacktrace(r1, r3, r2)
        L_0x0038:
            r4.close()     // Catch:{ IOException -> 0x003c }
            return
        L_0x003c:
            r2 = move-exception
            java.lang.String r3 = "FileUtil"
            java.lang.StackTraceElement[] r2 = r2.getStackTrace()
            com.tt.miniapphost.AppBrandLogger.stacktrace(r1, r3, r2)
            return
        L_0x0047:
            r3 = move-exception
            goto L_0x0078
        L_0x0049:
            r3 = move-exception
            goto L_0x004f
        L_0x004b:
            r3 = move-exception
            goto L_0x0079
        L_0x004d:
            r3 = move-exception
            r4 = r0
        L_0x004f:
            r0 = r2
            goto L_0x0056
        L_0x0051:
            r3 = move-exception
            r2 = r0
            goto L_0x0079
        L_0x0054:
            r3 = move-exception
            r4 = r0
        L_0x0056:
            java.lang.String r2 = "FileUtil"
            java.lang.StackTraceElement[] r3 = r3.getStackTrace()     // Catch:{ all -> 0x0076 }
            com.tt.miniapphost.AppBrandLogger.stacktrace(r1, r2, r3)     // Catch:{ all -> 0x0076 }
            if (r0 == 0) goto L_0x006f
            r0.close()     // Catch:{ IOException -> 0x0065 }
            goto L_0x006f
        L_0x0065:
            r2 = move-exception
            java.lang.String r3 = "FileUtil"
            java.lang.StackTraceElement[] r2 = r2.getStackTrace()
            com.tt.miniapphost.AppBrandLogger.stacktrace(r1, r3, r2)
        L_0x006f:
            if (r4 == 0) goto L_0x0075
            r4.close()     // Catch:{ IOException -> 0x003c }
            return
        L_0x0075:
            return
        L_0x0076:
            r3 = move-exception
            r2 = r0
        L_0x0078:
            r0 = r4
        L_0x0079:
            if (r2 == 0) goto L_0x0089
            r2.close()     // Catch:{ IOException -> 0x007f }
            goto L_0x0089
        L_0x007f:
            r2 = move-exception
            java.lang.String r4 = "FileUtil"
            java.lang.StackTraceElement[] r2 = r2.getStackTrace()
            com.tt.miniapphost.AppBrandLogger.stacktrace(r1, r4, r2)
        L_0x0089:
            if (r0 == 0) goto L_0x0099
            r0.close()     // Catch:{ IOException -> 0x008f }
            goto L_0x0099
        L_0x008f:
            r2 = move-exception
            java.lang.StackTraceElement[] r2 = r2.getStackTrace()
            java.lang.String r4 = "FileUtil"
            com.tt.miniapphost.AppBrandLogger.stacktrace(r1, r4, r2)
        L_0x0099:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapphost.util.FileUtil.copyAssets(android.content.Context, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0071 A[SYNTHETIC, Splitter:B:45:0x0071] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0081 A[SYNTHETIC, Splitter:B:50:0x0081] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int copyFile(java.io.File r5, java.io.File r6, boolean r7) {
        /*
            java.io.File r0 = r6.getParentFile()
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0011
            java.io.File r0 = r6.getParentFile()
            r0.mkdirs()
        L_0x0011:
            r0 = 0
            r1 = 6
            boolean r2 = r6.exists()     // Catch:{ Exception -> 0x0066, all -> 0x0063 }
            if (r2 != 0) goto L_0x001c
            r6.createNewFile()     // Catch:{ Exception -> 0x0066, all -> 0x0063 }
        L_0x001c:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0066, all -> 0x0063 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0066, all -> 0x0063 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x005f, all -> 0x005b }
            r3.<init>(r6)     // Catch:{ Exception -> 0x005f, all -> 0x005b }
            r6 = 4096(0x1000, float:5.74E-42)
            byte[] r6 = new byte[r6]     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
        L_0x002a:
            int r0 = r2.read(r6)     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
            r4 = 0
            if (r0 <= 0) goto L_0x0035
            r3.write(r6, r4, r0)     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
            goto L_0x002a
        L_0x0035:
            if (r7 == 0) goto L_0x003a
            r5.delete()     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
        L_0x003a:
            r2.close()     // Catch:{ Exception -> 0x003e }
            goto L_0x0048
        L_0x003e:
            r5 = move-exception
            java.lang.String r6 = "FileUtil"
            java.lang.StackTraceElement[] r5 = r5.getStackTrace()
            com.tt.miniapphost.AppBrandLogger.stacktrace(r1, r6, r5)
        L_0x0048:
            r3.close()     // Catch:{ Exception -> 0x004c }
            goto L_0x0056
        L_0x004c:
            r5 = move-exception
            java.lang.String r6 = "FileUtil"
            java.lang.StackTraceElement[] r5 = r5.getStackTrace()
            com.tt.miniapphost.AppBrandLogger.stacktrace(r1, r6, r5)
        L_0x0056:
            return r4
        L_0x0057:
            r5 = move-exception
            goto L_0x005d
        L_0x0059:
            r5 = move-exception
            goto L_0x0061
        L_0x005b:
            r5 = move-exception
            r3 = r0
        L_0x005d:
            r0 = r2
            goto L_0x006f
        L_0x005f:
            r5 = move-exception
            r3 = r0
        L_0x0061:
            r0 = r2
            goto L_0x0068
        L_0x0063:
            r5 = move-exception
            r3 = r0
            goto L_0x006f
        L_0x0066:
            r5 = move-exception
            r3 = r0
        L_0x0068:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch:{ all -> 0x006e }
            r6.<init>(r5)     // Catch:{ all -> 0x006e }
            throw r6     // Catch:{ all -> 0x006e }
        L_0x006e:
            r5 = move-exception
        L_0x006f:
            if (r0 == 0) goto L_0x007f
            r0.close()     // Catch:{ Exception -> 0x0075 }
            goto L_0x007f
        L_0x0075:
            r6 = move-exception
            java.lang.String r7 = "FileUtil"
            java.lang.StackTraceElement[] r6 = r6.getStackTrace()
            com.tt.miniapphost.AppBrandLogger.stacktrace(r1, r7, r6)
        L_0x007f:
            if (r3 == 0) goto L_0x008f
            r3.close()     // Catch:{ Exception -> 0x0085 }
            goto L_0x008f
        L_0x0085:
            r6 = move-exception
            java.lang.StackTraceElement[] r6 = r6.getStackTrace()
            java.lang.String r7 = "FileUtil"
            com.tt.miniapphost.AppBrandLogger.stacktrace(r1, r7, r6)
        L_0x008f:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapphost.util.FileUtil.copyFile(java.io.File, java.io.File, boolean):int");
    }
}
