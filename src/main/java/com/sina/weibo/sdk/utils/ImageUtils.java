package com.sina.weibo.sdk.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageUtils {
    private static boolean isFileExisted(String str) {
        if (!TextUtils.isEmpty(str) && new File(str).exists()) {
            return true;
        }
        return false;
    }

    private static boolean isParentExist(File file) {
        if (file == null) {
            return false;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null || parentFile.exists()) {
            return false;
        }
        if (file.exists() || file.mkdirs()) {
            return true;
        }
        return false;
    }

    public static boolean isWifi(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || activeNetworkInfo.getType() != 1) {
            return false;
        }
        return true;
    }

    private static void delete(File file) {
        if (file != null && file.exists() && !file.delete()) {
            throw new RuntimeException(String.valueOf(file.getAbsolutePath()) + " doesn't be deleted!");
        }
    }

    private static boolean deleteDependon(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        int i = 1;
        while (!z && i <= 5 && file.isFile() && file.exists()) {
            z = file.delete();
            if (!z) {
                i++;
            }
        }
        return z;
    }

    private static void makesureFileExist(String str) {
        if (str != null) {
            File file = new File(str);
            if (!file.exists() && isParentExist(file)) {
                if (file.exists()) {
                    delete(file);
                }
                try {
                    file.createNewFile();
                } catch (IOException unused) {
                }
            }
        }
    }

    public static boolean revitionPostImageSize(Context context, String str) {
        try {
            if (NetworkHelper.isWifiValid(context)) {
                revitionImageSizeHD(str, 1600, 75);
            } else {
                revitionImageSize(str, 1024, 75);
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[ExcHandler: FileNotFoundException (unused java.io.FileNotFoundException), SYNTHETIC, Splitter:B:6:0x0014] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap safeDecodeBimtapFile(java.lang.String r6, android.graphics.BitmapFactory.Options r7) {
        /*
            if (r7 != 0) goto L_0x000b
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r1 = 1
            r0.inSampleSize = r1
            goto L_0x000c
        L_0x000b:
            r0 = r7
        L_0x000c:
            r1 = 0
            r2 = 0
            r3 = r2
            r4 = r3
        L_0x0010:
            r5 = 5
            if (r1 < r5) goto L_0x0014
            goto L_0x0027
        L_0x0014:
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ OutOfMemoryError -> 0x0028, FileNotFoundException -> 0x0027 }
            r5.<init>(r6)     // Catch:{ OutOfMemoryError -> 0x0028, FileNotFoundException -> 0x0027 }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r5, r2, r7)     // Catch:{ OutOfMemoryError -> 0x0025, FileNotFoundException -> 0x0027 }
            r5.close()     // Catch:{ FileNotFoundException | IOException -> 0x0023, OutOfMemoryError -> 0x0021 }
            goto L_0x0023
        L_0x0021:
            r4 = r3
            goto L_0x0025
        L_0x0023:
            r4 = r3
            goto L_0x0027
        L_0x0025:
            r3 = r5
            goto L_0x0028
        L_0x0027:
            return r4
        L_0x0028:
            int r5 = r0.inSampleSize
            int r5 = r5 * 2
            r0.inSampleSize = r5
            r3.close()     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            int r1 = r1 + 1
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sina.weibo.sdk.utils.ImageUtils.safeDecodeBimtapFile(java.lang.String, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    private static void revitionImageSize(String str, int i, int i2) throws IOException {
        if (i <= 0) {
            throw new IllegalArgumentException("size must be greater than 0!");
        } else if (!isFileExisted(str)) {
            if (str == null) {
                str = "null";
            }
            throw new FileNotFoundException(str);
        } else if (BitmapHelper.verifyBitmap(str)) {
            FileInputStream fileInputStream = new FileInputStream(str);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(fileInputStream, null, options);
            try {
                fileInputStream.close();
            } catch (Exception unused) {
            }
            int i3 = 0;
            while (true) {
                if ((options.outWidth >> i3) <= i && (options.outHeight >> i3) <= i) {
                    break;
                }
                i3++;
            }
            options.inSampleSize = (int) Math.pow(2.0d, (double) i3);
            options.inJustDecodeBounds = false;
            Bitmap safeDecodeBimtapFile = safeDecodeBimtapFile(str, options);
            if (safeDecodeBimtapFile != null) {
                deleteDependon(str);
                makesureFileExist(str);
                FileOutputStream fileOutputStream = new FileOutputStream(str);
                if (options.outMimeType == null || !options.outMimeType.contains("png")) {
                    safeDecodeBimtapFile.compress(Bitmap.CompressFormat.JPEG, i2, fileOutputStream);
                } else {
                    safeDecodeBimtapFile.compress(Bitmap.CompressFormat.PNG, i2, fileOutputStream);
                }
                try {
                    fileOutputStream.close();
                } catch (Exception unused2) {
                }
                safeDecodeBimtapFile.recycle();
                return;
            }
            throw new IOException("Bitmap decode error!");
        } else {
            throw new IOException("");
        }
    }

    private static void revitionImageSizeHD(String str, int i, int i2) throws IOException {
        int i3;
        Bitmap createBitmap;
        if (i <= 0) {
            throw new IllegalArgumentException("size must be greater than 0!");
        } else if (!isFileExisted(str)) {
            if (str == null) {
                str = "null";
            }
            throw new FileNotFoundException(str);
        } else if (BitmapHelper.verifyBitmap(str)) {
            int i4 = i * 2;
            FileInputStream fileInputStream = new FileInputStream(str);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(fileInputStream, null, options);
            try {
                fileInputStream.close();
            } catch (Exception unused) {
            }
            int i5 = 0;
            while (true) {
                if ((options.outWidth >> i5) <= i4 && (options.outHeight >> i5) <= i4) {
                    break;
                }
                i5++;
            }
            options.inSampleSize = (int) Math.pow(2.0d, (double) i5);
            options.inJustDecodeBounds = false;
            Bitmap safeDecodeBimtapFile = safeDecodeBimtapFile(str, options);
            if (safeDecodeBimtapFile != null) {
                deleteDependon(str);
                makesureFileExist(str);
                if (safeDecodeBimtapFile.getWidth() > safeDecodeBimtapFile.getHeight()) {
                    i3 = safeDecodeBimtapFile.getWidth();
                } else {
                    i3 = safeDecodeBimtapFile.getHeight();
                }
                float f2 = ((float) i) / ((float) i3);
                if (f2 < 1.0f) {
                    while (true) {
                        try {
                            createBitmap = Bitmap.createBitmap((int) (((float) safeDecodeBimtapFile.getWidth()) * f2), (int) (((float) safeDecodeBimtapFile.getHeight()) * f2), Bitmap.Config.ARGB_8888);
                            break;
                        } catch (OutOfMemoryError unused2) {
                            System.gc();
                            double d2 = (double) f2;
                            Double.isNaN(d2);
                            f2 = (float) (d2 * 0.8d);
                        }
                    }
                    if (createBitmap == null) {
                        safeDecodeBimtapFile.recycle();
                    }
                    Canvas canvas = new Canvas(createBitmap);
                    Matrix matrix = new Matrix();
                    matrix.setScale(f2, f2);
                    canvas.drawBitmap(safeDecodeBimtapFile, matrix, new Paint());
                    safeDecodeBimtapFile.recycle();
                    safeDecodeBimtapFile = createBitmap;
                }
                FileOutputStream fileOutputStream = new FileOutputStream(str);
                if (options.outMimeType == null || !options.outMimeType.contains("png")) {
                    safeDecodeBimtapFile.compress(Bitmap.CompressFormat.JPEG, i2, fileOutputStream);
                } else {
                    safeDecodeBimtapFile.compress(Bitmap.CompressFormat.PNG, i2, fileOutputStream);
                }
                try {
                    fileOutputStream.close();
                } catch (Exception unused3) {
                }
                safeDecodeBimtapFile.recycle();
                return;
            }
            throw new IOException("Bitmap decode error!");
        } else {
            throw new IOException("");
        }
    }
}
