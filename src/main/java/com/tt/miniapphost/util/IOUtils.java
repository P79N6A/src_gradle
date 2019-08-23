package com.tt.miniapphost.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.android.dexposed.ClassUtils;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.process.annotation.AnyProcess;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.Enumeration;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

@AnyProcess
public class IOUtils {
    private static final String[] PATH_PROJECTION = {"_data"};

    public static File getCacheDirectory(Context context) {
        return getCacheDirectory(context, true);
    }

    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                AppBrandLogger.eWithThrowable("ContentValues", "", e2);
            }
        }
    }

    public static File getAppUpdateDir(Context context) {
        return new File(getAppbrandFilesDir(context), "update");
    }

    public static File getAppbrandFilesDir(Context context) {
        return new File(context.getFilesDir(), "appbrand");
    }

    private static boolean hasExternalStoragePermission(Context context) {
        if (context.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        return false;
    }

    private static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    private static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    private static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static void removeDir(String str) throws Exception {
        delete(new File(str));
    }

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

    public static byte[] readBytes(String str) {
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            fileInputStream.close();
            return bArr;
        } catch (Exception e2) {
            AppBrandLogger.eWithThrowable("ContentValues", "", e2);
            return null;
        }
    }

    public static void clearDir(String str) throws Exception {
        File file = new File(str);
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                if (listFiles[i].isDirectory()) {
                    removeDir(listFiles[i].getAbsolutePath());
                } else if (listFiles[i].isFile()) {
                    listFiles[i].delete();
                }
            }
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

    public static File getExternalCacheDir(Context context) {
        String str;
        File file;
        try {
            str = Environment.getExternalStorageState();
        } catch (Exception unused) {
            str = "";
        }
        if ("mounted".equals(str)) {
            file = context.getExternalCacheDir();
        } else {
            file = null;
        }
        if (file == null) {
            return new File(new File(new File(new File(Environment.getExternalStorageDirectory(), "Android"), "data"), context.getPackageName()), "cache");
        }
        return file;
    }

    public static long getZipTrueSize(String str) {
        long j = 0;
        try {
            Enumeration<? extends ZipEntry> entries = new ZipFile(str).entries();
            while (entries.hasMoreElements()) {
                j += ((ZipEntry) entries.nextElement()).getSize();
            }
        } catch (IOException e2) {
            AppBrandLogger.eWithThrowable("ContentValues", "", e2);
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
                            AppBrandLogger.eWithThrowable("ContentValues", "", e3);
                        }
                        throw th;
                    }
                }
                String replace = String.format("%32s", new Object[]{new BigInteger(1, instance.digest()).toString(16)}).replace(' ', '0');
                try {
                    fileInputStream.close();
                } catch (IOException e4) {
                    AppBrandLogger.eWithThrowable("ContentValues", "", e4);
                }
                return replace;
            } catch (FileNotFoundException unused) {
                return null;
            }
        } catch (NoSuchAlgorithmException unused2) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0033, code lost:
        if (r0.exists() == false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File createTmpFile(android.content.Context r2) throws java.io.IOException {
        /*
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            java.lang.String r1 = "mounted"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = android.os.Environment.DIRECTORY_DCIM
            java.io.File r0 = android.os.Environment.getExternalStoragePublicDirectory(r0)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x003a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = android.os.Environment.DIRECTORY_DCIM
            r0.append(r1)
            java.lang.String r1 = "/Camera"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.io.File r0 = android.os.Environment.getExternalStoragePublicDirectory(r0)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x003a
        L_0x0035:
            r0 = 1
            java.io.File r0 = getCacheDirectory(r2, r0)
        L_0x003a:
            java.lang.String r2 = "IMG_"
            java.lang.String r1 = ".jpg"
            java.io.File r2 = java.io.File.createTempFile(r2, r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapphost.util.IOUtils.createTmpFile(android.content.Context):java.io.File");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0030 A[SYNTHETIC, Splitter:B:17:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044 A[SYNTHETIC, Splitter:B:25:0x0044] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap decodeFile(java.io.File r4) {
        /*
            r0 = 0
            r1 = 6
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch:{ FileNotFoundException -> 0x0023, all -> 0x0021 }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x0023, all -> 0x0021 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0023, all -> 0x0021 }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0023, all -> 0x0021 }
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r3, r0, r2)     // Catch:{ FileNotFoundException -> 0x001f }
            r3.close()     // Catch:{ Exception -> 0x0014 }
            goto L_0x003f
        L_0x0014:
            r0 = move-exception
            java.lang.String r2 = "ContentValues"
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            com.tt.miniapphost.AppBrandLogger.stacktrace(r1, r2, r0)
            goto L_0x003f
        L_0x001f:
            r4 = move-exception
            goto L_0x0025
        L_0x0021:
            r4 = move-exception
            goto L_0x0042
        L_0x0023:
            r4 = move-exception
            r3 = r0
        L_0x0025:
            java.lang.String r2 = "ContentValues"
            java.lang.StackTraceElement[] r4 = r4.getStackTrace()     // Catch:{ all -> 0x0040 }
            com.tt.miniapphost.AppBrandLogger.stacktrace(r1, r2, r4)     // Catch:{ all -> 0x0040 }
            if (r3 == 0) goto L_0x003e
            r3.close()     // Catch:{ Exception -> 0x0034 }
            goto L_0x003e
        L_0x0034:
            r4 = move-exception
            java.lang.String r2 = "ContentValues"
            java.lang.StackTraceElement[] r4 = r4.getStackTrace()
            com.tt.miniapphost.AppBrandLogger.stacktrace(r1, r2, r4)
        L_0x003e:
            r4 = r0
        L_0x003f:
            return r4
        L_0x0040:
            r4 = move-exception
            r0 = r3
        L_0x0042:
            if (r0 == 0) goto L_0x0052
            r0.close()     // Catch:{ Exception -> 0x0048 }
            goto L_0x0052
        L_0x0048:
            r0 = move-exception
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            java.lang.String r2 = "ContentValues"
            com.tt.miniapphost.AppBrandLogger.stacktrace(r1, r2, r0)
        L_0x0052:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapphost.util.IOUtils.decodeFile(java.io.File):android.graphics.Bitmap");
    }

    public static String fileSize(long j) {
        if (j <= 0) {
            return PushConstants.PUSH_TYPE_NOTIFY;
        }
        double d2 = (double) j;
        int log10 = (int) (Math.log10(d2) / Math.log10(1024.0d));
        StringBuilder sb = new StringBuilder();
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.#");
        double pow = Math.pow(1024.0d, (double) log10);
        Double.isNaN(d2);
        sb.append(decimalFormat.format(d2 / pow));
        sb.append(" ");
        sb.append(new String[]{"B", "kB", "MB", "GB", "TB"}[log10]);
        return sb.toString();
    }

    public static File getExternalFilesDir(Context context) {
        String str;
        try {
            str = Environment.getExternalStorageState();
        } catch (Exception unused) {
            str = "";
        }
        File file = null;
        if ("mounted".equals(str)) {
            file = context.getExternalFilesDir(null);
        }
        if (file == null) {
            file = new File(new File(new File(new File(Environment.getExternalStorageDirectory(), "Android"), "data"), context.getPackageName()), "files");
        }
        if (file != null && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static String getFilesDirPath(Context context) throws NullPointerException {
        String str;
        if (context != null) {
            try {
                if (context.getFilesDir() != null) {
                    str = context.getFilesDir().getPath();
                } else {
                    File dir = context.getDir("/data/data/" + context.getPackageName() + "/files/", 0);
                    if (dir != null) {
                        str = dir.getPath();
                    }
                    str = null;
                }
            } catch (Throwable unused) {
            }
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            throw new NullPointerException("Cannot Create Files Dir");
        }
        throw new NullPointerException("Context is NUll");
    }

    public static String getSizeByUnit(double d2) {
        if (d2 == 0.0d) {
            return "0K";
        }
        if (d2 >= 1048576.0d) {
            return String.format(Locale.getDefault(), "%.1f", new Object[]{Double.valueOf(d2 / 1048576.0d)}) + "M";
        }
        return String.format(Locale.getDefault(), "%.1f", new Object[]{Double.valueOf(d2 / 1024.0d)}) + "K";
    }

    public static void unZipFolder(String str, String str2) throws Exception {
        unZipFolder((InputStream) new FileInputStream(str), str2);
    }

    public static boolean checkMD5(String str, File file) {
        if (TextUtils.isEmpty(str) || file == null) {
            return false;
        }
        String calculateMD5 = calculateMD5(file);
        if (calculateMD5 == null) {
            return false;
        }
        return calculateMD5.toLowerCase().startsWith(str.toLowerCase());
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

    public static File getIndividualCacheDirectory(Context context, String str) {
        File cacheDirectory = getCacheDirectory(context);
        File file = new File(cacheDirectory, str);
        if (file.exists() || file.mkdir()) {
            return file;
        }
        return cacheDirectory;
    }

    public static String readString(String str, String str2) {
        try {
            return new String(readBytes(str), str2);
        } catch (Exception e2) {
            AppBrandLogger.eWithThrowable("ContentValues", "", e2);
            return null;
        }
    }

    public static void writeBytes(String str, byte[] bArr) throws IOException {
        if (bArr != null && bArr.length != 0) {
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.write(bArr, 0, bArr.length);
            dataOutputStream.close();
            fileOutputStream.close();
        }
    }

    public static String getFromAssets(Context context, String str) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open(str)));
            String str2 = "";
            while (true) {
                if (bufferedReader.readLine() == null) {
                    return str2;
                }
                str2 = str2 + r0;
            }
        } catch (Exception e2) {
            AppBrandLogger.eWithThrowable("ContentValues", "", e2);
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getVideoThumbPath(android.content.Context r7, int r8) {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r7.getContentResolver()     // Catch:{ all -> 0x0036 }
            android.net.Uri r2 = android.provider.MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI     // Catch:{ all -> 0x0036 }
            java.lang.String[] r3 = PATH_PROJECTION     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = "kind = 1 AND video_id = ?"
            r7 = 1
            java.lang.String[] r5 = new java.lang.String[r7]     // Catch:{ all -> 0x0036 }
            java.lang.String r7 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0036 }
            r8 = 0
            r5[r8] = r7     // Catch:{ all -> 0x0036 }
            r6 = 0
            android.database.Cursor r7 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0036 }
            if (r7 == 0) goto L_0x0030
            boolean r1 = r7.moveToFirst()     // Catch:{ all -> 0x002d }
            if (r1 != 0) goto L_0x0023
            goto L_0x0030
        L_0x0023:
            java.lang.String r8 = r7.getString(r8)     // Catch:{ all -> 0x002d }
            if (r7 == 0) goto L_0x002c
            r7.close()
        L_0x002c:
            return r8
        L_0x002d:
            r8 = move-exception
            r0 = r7
            goto L_0x0037
        L_0x0030:
            if (r7 == 0) goto L_0x0035
            r7.close()
        L_0x0035:
            return r0
        L_0x0036:
            r8 = move-exception
        L_0x0037:
            if (r0 == 0) goto L_0x003c
            r0.close()
        L_0x003c:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapphost.util.IOUtils.getVideoThumbPath(android.content.Context, int):java.lang.String");
    }

    public static File getCacheDirectory(Context context, boolean z) {
        String str;
        File file;
        try {
            str = Environment.getExternalStorageState();
        } catch (NullPointerException unused) {
            str = "";
        } catch (IncompatibleClassChangeError unused2) {
            str = "";
        }
        if (!z || !"mounted".equals(str) || !hasExternalStoragePermission(context)) {
            file = null;
        } else {
            file = getExternalCacheDir(context);
        }
        if (file == null) {
            file = context.getCacheDir();
        }
        if (file != null) {
            return file;
        }
        return new File("/data/data/" + context.getPackageName() + "/cache/");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b A[SYNTHETIC, Splitter:B:15:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003b A[SYNTHETIC, Splitter:B:24:0x003b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] getFromAssetsByte(android.content.Context r2, java.lang.String r3) {
        /*
            r0 = 0
            android.content.res.Resources r2 = r2.getResources()     // Catch:{ Exception -> 0x0038, all -> 0x0027 }
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch:{ Exception -> 0x0038, all -> 0x0027 }
            java.io.InputStream r2 = r2.open(r3)     // Catch:{ Exception -> 0x0038, all -> 0x0027 }
            int r3 = r2.available()     // Catch:{ Exception -> 0x0039, all -> 0x0025 }
            byte[] r3 = new byte[r3]     // Catch:{ Exception -> 0x0039, all -> 0x0025 }
            r2.read(r3)     // Catch:{ Exception -> 0x0039, all -> 0x0025 }
            if (r2 == 0) goto L_0x0024
            r2.close()     // Catch:{ Exception -> 0x001c }
            goto L_0x0024
        L_0x001c:
            r2 = move-exception
            java.lang.String r0 = "ContentValues"
            java.lang.String r1 = ""
            com.tt.miniapphost.AppBrandLogger.eWithThrowable(r0, r1, r2)
        L_0x0024:
            return r3
        L_0x0025:
            r3 = move-exception
            goto L_0x0029
        L_0x0027:
            r3 = move-exception
            r2 = r0
        L_0x0029:
            if (r2 == 0) goto L_0x0037
            r2.close()     // Catch:{ Exception -> 0x002f }
            goto L_0x0037
        L_0x002f:
            r2 = move-exception
            java.lang.String r0 = "ContentValues"
            java.lang.String r1 = ""
            com.tt.miniapphost.AppBrandLogger.eWithThrowable(r0, r1, r2)
        L_0x0037:
            throw r3
        L_0x0038:
            r2 = r0
        L_0x0039:
            if (r2 == 0) goto L_0x0047
            r2.close()     // Catch:{ Exception -> 0x003f }
            goto L_0x0047
        L_0x003f:
            r2 = move-exception
            java.lang.String r3 = "ContentValues"
            java.lang.String r1 = ""
            com.tt.miniapphost.AppBrandLogger.eWithThrowable(r3, r1, r2)
        L_0x0047:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapphost.util.IOUtils.getFromAssetsByte(android.content.Context, java.lang.String):byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x007c A[SYNTHETIC, Splitter:B:48:0x007c] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x008a A[SYNTHETIC, Splitter:B:53:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x009a A[SYNTHETIC, Splitter:B:60:0x009a] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00a8 A[SYNTHETIC, Splitter:B:65:0x00a8] */
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
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            r3.<init>(r8)     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x006a, all -> 0x0066 }
            r8.<init>(r9)     // Catch:{ IOException -> 0x006a, all -> 0x0066 }
            r9 = 1024(0x400, float:1.435E-42)
            byte[] r9 = new byte[r9]     // Catch:{ IOException -> 0x0064, all -> 0x0062 }
        L_0x003f:
            int r0 = r3.read(r9)     // Catch:{ IOException -> 0x0064, all -> 0x0062 }
            if (r0 <= 0) goto L_0x0049
            r8.write(r9, r2, r0)     // Catch:{ IOException -> 0x0064, all -> 0x0062 }
            goto L_0x003f
        L_0x0049:
            r3.close()     // Catch:{ IOException -> 0x004d }
            goto L_0x0055
        L_0x004d:
            r9 = move-exception
            java.lang.String r0 = "ContentValues"
            java.lang.String r2 = ""
            com.tt.miniapphost.AppBrandLogger.eWithThrowable(r0, r2, r9)
        L_0x0055:
            r8.close()     // Catch:{ IOException -> 0x0059 }
            goto L_0x0061
        L_0x0059:
            r8 = move-exception
            java.lang.String r9 = "ContentValues"
            java.lang.String r0 = ""
            com.tt.miniapphost.AppBrandLogger.eWithThrowable(r9, r0, r8)
        L_0x0061:
            return r1
        L_0x0062:
            r9 = move-exception
            goto L_0x0068
        L_0x0064:
            r9 = move-exception
            goto L_0x006c
        L_0x0066:
            r9 = move-exception
            r8 = r0
        L_0x0068:
            r0 = r3
            goto L_0x0098
        L_0x006a:
            r9 = move-exception
            r8 = r0
        L_0x006c:
            r0 = r3
            goto L_0x0073
        L_0x006e:
            r9 = move-exception
            r8 = r0
            goto L_0x0098
        L_0x0071:
            r9 = move-exception
            r8 = r0
        L_0x0073:
            java.lang.String r1 = "ContentValues"
            java.lang.String r3 = ""
            com.tt.miniapphost.AppBrandLogger.eWithThrowable(r1, r3, r9)     // Catch:{ all -> 0x0097 }
            if (r0 == 0) goto L_0x0088
            r0.close()     // Catch:{ IOException -> 0x0080 }
            goto L_0x0088
        L_0x0080:
            r9 = move-exception
            java.lang.String r0 = "ContentValues"
            java.lang.String r1 = ""
            com.tt.miniapphost.AppBrandLogger.eWithThrowable(r0, r1, r9)
        L_0x0088:
            if (r8 == 0) goto L_0x0096
            r8.close()     // Catch:{ IOException -> 0x008e }
            goto L_0x0096
        L_0x008e:
            r8 = move-exception
            java.lang.String r9 = "ContentValues"
            java.lang.String r0 = ""
            com.tt.miniapphost.AppBrandLogger.eWithThrowable(r9, r0, r8)
        L_0x0096:
            return r2
        L_0x0097:
            r9 = move-exception
        L_0x0098:
            if (r0 == 0) goto L_0x00a6
            r0.close()     // Catch:{ IOException -> 0x009e }
            goto L_0x00a6
        L_0x009e:
            r0 = move-exception
            java.lang.String r1 = "ContentValues"
            java.lang.String r2 = ""
            com.tt.miniapphost.AppBrandLogger.eWithThrowable(r1, r2, r0)
        L_0x00a6:
            if (r8 == 0) goto L_0x00b4
            r8.close()     // Catch:{ IOException -> 0x00ac }
            goto L_0x00b4
        L_0x00ac:
            r8 = move-exception
            java.lang.String r0 = "ContentValues"
            java.lang.String r1 = ""
            com.tt.miniapphost.AppBrandLogger.eWithThrowable(r0, r1, r8)
        L_0x00b4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapphost.util.IOUtils.copyFolder(java.io.File, java.io.File):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: android.net.Uri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getFilePathByUri(android.content.Context r11, android.net.Uri r12) {
        /*
            java.lang.String r0 = "file"
            java.lang.String r1 = r12.getScheme()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0011
            java.lang.String r11 = r12.getPath()
            return r11
        L_0x0011:
            java.lang.String r0 = "content"
            java.lang.String r1 = r12.getScheme()
            boolean r0 = r0.equals(r1)
            r1 = 19
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0051
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r1) goto L_0x0051
            android.content.ContentResolver r5 = r11.getContentResolver()
            java.lang.String[] r7 = new java.lang.String[r3]
            java.lang.String r11 = "_data"
            r7[r2] = r11
            r8 = 0
            r9 = 0
            r10 = 0
            r6 = r12
            android.database.Cursor r11 = r5.query(r6, r7, r8, r9, r10)
            if (r11 == 0) goto L_0x0050
            boolean r12 = r11.moveToFirst()
            if (r12 == 0) goto L_0x004d
            java.lang.String r12 = "_data"
            int r12 = r11.getColumnIndexOrThrow(r12)
            if (r12 < 0) goto L_0x004d
            java.lang.String r12 = r11.getString(r12)
            r4 = r12
        L_0x004d:
            r11.close()
        L_0x0050:
            return r4
        L_0x0051:
            java.lang.String r0 = "content"
            java.lang.String r5 = r12.getScheme()
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x00fc
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L_0x00fc
            boolean r0 = android.provider.DocumentsContract.isDocumentUri(r11, r12)
            if (r0 == 0) goto L_0x00fc
            boolean r0 = isExternalStorageDocument(r12)
            if (r0 == 0) goto L_0x009c
            java.lang.String r11 = android.provider.DocumentsContract.getDocumentId(r12)
            java.lang.String r12 = ":"
            java.lang.String[] r11 = r11.split(r12)
            r12 = r11[r2]
            java.lang.String r0 = "primary"
            boolean r12 = r0.equalsIgnoreCase(r12)
            if (r12 == 0) goto L_0x00fc
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            r12.append(r0)
            java.lang.String r0 = "/"
            r12.append(r0)
            r11 = r11[r3]
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            return r11
        L_0x009c:
            boolean r0 = isDownloadsDocument(r12)
            if (r0 == 0) goto L_0x00bd
            java.lang.String r12 = android.provider.DocumentsContract.getDocumentId(r12)
            java.lang.String r0 = "content://downloads/public_downloads"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            long r1 = r12.longValue()
            android.net.Uri r12 = android.content.ContentUris.withAppendedId(r0, r1)
            java.lang.String r11 = getDataColumn(r11, r12, r4, r4)
            return r11
        L_0x00bd:
            boolean r0 = isMediaDocument(r12)
            if (r0 == 0) goto L_0x00fc
            java.lang.String r12 = android.provider.DocumentsContract.getDocumentId(r12)
            java.lang.String r0 = ":"
            java.lang.String[] r12 = r12.split(r0)
            r0 = r12[r2]
            java.lang.String r1 = "image"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00da
            android.net.Uri r4 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            goto L_0x00ef
        L_0x00da:
            java.lang.String r1 = "video"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00e5
            android.net.Uri r4 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            goto L_0x00ef
        L_0x00e5:
            java.lang.String r1 = "audio"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00ef
            android.net.Uri r4 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
        L_0x00ef:
            java.lang.String[] r0 = new java.lang.String[r3]
            r12 = r12[r3]
            r0[r2] = r12
            java.lang.String r12 = "_id=?"
            java.lang.String r11 = getDataColumn(r11, r4, r12, r0)
            return r11
        L_0x00fc:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapphost.util.IOUtils.getFilePathByUri(android.content.Context, android.net.Uri):java.lang.String");
    }

    public static void unZipFolder(InputStream inputStream, String str) throws Exception {
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null) {
                String name = nextEntry.getName();
                if (nextEntry.isDirectory()) {
                    String substring = name.substring(0, name.length() - 1);
                    new File(str + File.separator + substring).mkdirs();
                } else {
                    File file = new File(str + File.separator + name);
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

    private static int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 >= i2 && i7 / i5 >= i) {
                i5 *= 2;
            }
        }
        return i5;
    }

    public static File getAppRunDir(Context context, String str, String str2) {
        File appbrandFilesDir = getAppbrandFilesDir(context);
        return new File(appbrandFilesDir, str + File.separator + str2);
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

    /* JADX WARNING: Removed duplicated region for block: B:30:0x004f A[SYNTHETIC, Splitter:B:30:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005d A[SYNTHETIC, Splitter:B:35:0x005d] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x006d A[SYNTHETIC, Splitter:B:43:0x006d] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x007b A[SYNTHETIC, Splitter:B:48:0x007b] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x007f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void copyAssets(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
        /*
            android.content.res.AssetManager r2 = r2.getAssets()
            r0 = 0
            java.io.InputStream r2 = r2.open(r3)     // Catch:{ IOException -> 0x006a, all -> 0x004b }
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x0049, all -> 0x0047 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0049, all -> 0x0047 }
            java.io.File r4 = r3.getParentFile()     // Catch:{ IOException -> 0x0049, all -> 0x0047 }
            boolean r4 = r4.exists()     // Catch:{ IOException -> 0x0049, all -> 0x0047 }
            if (r4 != 0) goto L_0x001f
            java.io.File r4 = r3.getParentFile()     // Catch:{ IOException -> 0x0049, all -> 0x0047 }
            r4.mkdirs()     // Catch:{ IOException -> 0x0049, all -> 0x0047 }
        L_0x001f:
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0049, all -> 0x0047 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0049, all -> 0x0047 }
            copyFile(r2, r4)     // Catch:{ IOException -> 0x0045, all -> 0x0042 }
            if (r2 == 0) goto L_0x0035
            r2.close()     // Catch:{ IOException -> 0x002d }
            goto L_0x0035
        L_0x002d:
            r2 = move-exception
            java.lang.String r3 = "ContentValues"
            java.lang.String r0 = ""
            com.tt.miniapphost.AppBrandLogger.eWithThrowable(r3, r0, r2)
        L_0x0035:
            r4.close()     // Catch:{ IOException -> 0x0039 }
            return
        L_0x0039:
            r2 = move-exception
            java.lang.String r3 = "ContentValues"
            java.lang.String r4 = ""
            com.tt.miniapphost.AppBrandLogger.eWithThrowable(r3, r4, r2)
            return
        L_0x0042:
            r3 = move-exception
            r0 = r4
            goto L_0x004d
        L_0x0045:
            r0 = r4
            goto L_0x006b
        L_0x0047:
            r3 = move-exception
            goto L_0x004d
        L_0x0049:
            goto L_0x006b
        L_0x004b:
            r3 = move-exception
            r2 = r0
        L_0x004d:
            if (r2 == 0) goto L_0x005b
            r2.close()     // Catch:{ IOException -> 0x0053 }
            goto L_0x005b
        L_0x0053:
            r2 = move-exception
            java.lang.String r4 = "ContentValues"
            java.lang.String r1 = ""
            com.tt.miniapphost.AppBrandLogger.eWithThrowable(r4, r1, r2)
        L_0x005b:
            if (r0 == 0) goto L_0x0069
            r0.close()     // Catch:{ IOException -> 0x0061 }
            goto L_0x0069
        L_0x0061:
            r2 = move-exception
            java.lang.String r4 = "ContentValues"
            java.lang.String r0 = ""
            com.tt.miniapphost.AppBrandLogger.eWithThrowable(r4, r0, r2)
        L_0x0069:
            throw r3
        L_0x006a:
            r2 = r0
        L_0x006b:
            if (r2 == 0) goto L_0x0079
            r2.close()     // Catch:{ IOException -> 0x0071 }
            goto L_0x0079
        L_0x0071:
            r2 = move-exception
            java.lang.String r3 = "ContentValues"
            java.lang.String r4 = ""
            com.tt.miniapphost.AppBrandLogger.eWithThrowable(r3, r4, r2)
        L_0x0079:
            if (r0 == 0) goto L_0x007f
            r0.close()     // Catch:{ IOException -> 0x0039 }
            return
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapphost.util.IOUtils.copyAssets(android.content.Context, java.lang.String, java.lang.String):void");
    }

    static Bitmap decodeSampledBitmapFromFile(File file, int i, int i2) throws IOException {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        options.inSampleSize = calculateInSampleSize(options, i, i2);
        options.inJustDecodeBounds = false;
        Bitmap decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        if (decodeFile == null) {
            return decodeFile;
        }
        Matrix matrix = new Matrix();
        int attributeInt = new ExifInterface(file.getAbsolutePath()).getAttributeInt("Orientation", 0);
        if (attributeInt == 6) {
            matrix.postRotate(90.0f);
        } else if (attributeInt == 3) {
            matrix.postRotate(180.0f);
        } else if (attributeInt == 8) {
            matrix.postRotate(270.0f);
        }
        return Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x006c A[SYNTHETIC, Splitter:B:45:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x007a A[SYNTHETIC, Splitter:B:50:0x007a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int copyFile(java.io.File r4, java.io.File r5, boolean r6) {
        /*
            java.io.File r0 = r5.getParentFile()
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0011
            java.io.File r0 = r5.getParentFile()
            r0.mkdirs()
        L_0x0011:
            r0 = 0
            boolean r1 = r5.exists()     // Catch:{ Exception -> 0x0061, all -> 0x005e }
            if (r1 != 0) goto L_0x001b
            r5.createNewFile()     // Catch:{ Exception -> 0x0061, all -> 0x005e }
        L_0x001b:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0061, all -> 0x005e }
            r1.<init>(r4)     // Catch:{ Exception -> 0x0061, all -> 0x005e }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x005a, all -> 0x0056 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x005a, all -> 0x0056 }
            r5 = 4096(0x1000, float:5.74E-42)
            byte[] r5 = new byte[r5]     // Catch:{ Exception -> 0x0054, all -> 0x0052 }
        L_0x0029:
            int r0 = r1.read(r5)     // Catch:{ Exception -> 0x0054, all -> 0x0052 }
            r3 = 0
            if (r0 <= 0) goto L_0x0034
            r2.write(r5, r3, r0)     // Catch:{ Exception -> 0x0054, all -> 0x0052 }
            goto L_0x0029
        L_0x0034:
            if (r6 == 0) goto L_0x0039
            r4.delete()     // Catch:{ Exception -> 0x0054, all -> 0x0052 }
        L_0x0039:
            r1.close()     // Catch:{ Exception -> 0x003d }
            goto L_0x0045
        L_0x003d:
            r4 = move-exception
            java.lang.String r5 = "ContentValues"
            java.lang.String r6 = ""
            com.tt.miniapphost.AppBrandLogger.eWithThrowable(r5, r6, r4)
        L_0x0045:
            r2.close()     // Catch:{ Exception -> 0x0049 }
            goto L_0x0051
        L_0x0049:
            r4 = move-exception
            java.lang.String r5 = "ContentValues"
            java.lang.String r6 = ""
            com.tt.miniapphost.AppBrandLogger.eWithThrowable(r5, r6, r4)
        L_0x0051:
            return r3
        L_0x0052:
            r4 = move-exception
            goto L_0x0058
        L_0x0054:
            r4 = move-exception
            goto L_0x005c
        L_0x0056:
            r4 = move-exception
            r2 = r0
        L_0x0058:
            r0 = r1
            goto L_0x006a
        L_0x005a:
            r4 = move-exception
            r2 = r0
        L_0x005c:
            r0 = r1
            goto L_0x0063
        L_0x005e:
            r4 = move-exception
            r2 = r0
            goto L_0x006a
        L_0x0061:
            r4 = move-exception
            r2 = r0
        L_0x0063:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch:{ all -> 0x0069 }
            r5.<init>(r4)     // Catch:{ all -> 0x0069 }
            throw r5     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r4 = move-exception
        L_0x006a:
            if (r0 == 0) goto L_0x0078
            r0.close()     // Catch:{ Exception -> 0x0070 }
            goto L_0x0078
        L_0x0070:
            r5 = move-exception
            java.lang.String r6 = "ContentValues"
            java.lang.String r0 = ""
            com.tt.miniapphost.AppBrandLogger.eWithThrowable(r6, r0, r5)
        L_0x0078:
            if (r2 == 0) goto L_0x0086
            r2.close()     // Catch:{ Exception -> 0x007e }
            goto L_0x0086
        L_0x007e:
            r5 = move-exception
            java.lang.String r6 = "ContentValues"
            java.lang.String r0 = ""
            com.tt.miniapphost.AppBrandLogger.eWithThrowable(r6, r0, r5)
        L_0x0086:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapphost.util.IOUtils.copyFile(java.io.File, java.io.File, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getDataColumn(android.content.Context r7, android.net.Uri r8, java.lang.String r9, java.lang.String[] r10) {
        /*
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]
            java.lang.String r0 = "_data"
            r1 = 0
            r3[r1] = r0
            r0 = 0
            android.content.ContentResolver r1 = r7.getContentResolver()     // Catch:{ all -> 0x0035 }
            r6 = 0
            r2 = r8
            r4 = r9
            r5 = r10
            android.database.Cursor r7 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0035 }
            if (r7 == 0) goto L_0x002f
            boolean r8 = r7.moveToFirst()     // Catch:{ all -> 0x002d }
            if (r8 == 0) goto L_0x002f
            java.lang.String r8 = "_data"
            int r8 = r7.getColumnIndexOrThrow(r8)     // Catch:{ all -> 0x002d }
            java.lang.String r8 = r7.getString(r8)     // Catch:{ all -> 0x002d }
            if (r7 == 0) goto L_0x002c
            r7.close()
        L_0x002c:
            return r8
        L_0x002d:
            r8 = move-exception
            goto L_0x0037
        L_0x002f:
            if (r7 == 0) goto L_0x0034
            r7.close()
        L_0x0034:
            return r0
        L_0x0035:
            r8 = move-exception
            r7 = r0
        L_0x0037:
            if (r7 == 0) goto L_0x003c
            r7.close()
        L_0x003c:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapphost.util.IOUtils.getDataColumn(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File compressImage(java.io.File r2, int r3, int r4, android.graphics.Bitmap.CompressFormat r5, int r6, java.lang.String r7) throws java.io.IOException {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            java.io.File r0 = r0.getParentFile()
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x0012
            r0.mkdirs()
        L_0x0012:
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x003f }
            r1.<init>(r7)     // Catch:{ all -> 0x003f }
            android.graphics.Bitmap r3 = decodeSampledBitmapFromFile(r2, r3, r4)     // Catch:{ all -> 0x003d }
            if (r3 == 0) goto L_0x002d
            r3.compress(r5, r6, r1)     // Catch:{ all -> 0x003d }
            r1.flush()
            r1.close()
            java.io.File r2 = new java.io.File
            r2.<init>(r7)
            return r2
        L_0x002d:
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x003d }
            r3.<init>(r7)     // Catch:{ all -> 0x003d }
            r4 = 0
            copyFile(r2, r3, r4)     // Catch:{ all -> 0x003d }
            r1.flush()
            r1.close()
            return r3
        L_0x003d:
            r2 = move-exception
            goto L_0x0041
        L_0x003f:
            r2 = move-exception
            r1 = r0
        L_0x0041:
            if (r1 == 0) goto L_0x0049
            r1.flush()
            r1.close()
        L_0x0049:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapphost.util.IOUtils.compressImage(java.io.File, int, int, android.graphics.Bitmap$CompressFormat, int, java.lang.String):java.io.File");
    }
}
