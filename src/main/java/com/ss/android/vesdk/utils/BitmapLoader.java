package com.ss.android.vesdk.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import com.ss.android.medialib.common.c;
import java.io.IOException;

@Keep
public class BitmapLoader {
    private static Bitmap makeDimensionEven(@Nullable Bitmap bitmap) {
        int i;
        boolean z;
        if (bitmap == null) {
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if ((bitmap.getWidth() & 1) == 1) {
                i = bitmap.getWidth() - 1;
                z = true;
            } else {
                i = width;
                z = false;
            }
            if ((bitmap.getHeight() & 1) == 1) {
                height = bitmap.getHeight() - 1;
                z = true;
            }
            if (!z) {
                return bitmap;
            }
            if (i > 0) {
                if (height > 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i, height);
                    bitmap.recycle();
                    return createBitmap;
                }
            }
            return null;
        } catch (OutOfMemoryError e2) {
            c.c("makeDimensionEven", e2.getMessage());
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        if (r2 != null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003f, code lost:
        if (r2 != null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0043, code lost:
        if (r2 != null) goto L_0x0030;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003a A[SYNTHETIC, Splitter:B:22:0x003a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getRotation(android.content.ContentResolver r2, @android.support.annotation.NonNull java.lang.String r3) {
        /*
            java.lang.String r0 = "content"
            boolean r0 = r3.startsWith(r0)
            r1 = 0
            if (r0 != 0) goto L_0x0012
            android.media.ExifInterface r2 = new android.media.ExifInterface     // Catch:{ IOException -> 0x0010 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0010 }
            r1 = r2
            goto L_0x0046
        L_0x0010:
            goto L_0x0046
        L_0x0012:
            if (r2 == 0) goto L_0x0064
            android.net.Uri r3 = android.net.Uri.parse(r3)
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r2 = r2.openFileDescriptor(r3, r0)     // Catch:{ FileNotFoundException -> 0x0042, IOException -> 0x003e, all -> 0x0036 }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ FileNotFoundException -> 0x0043, IOException -> 0x003f, all -> 0x0034 }
            r0 = 24
            if (r3 < r0) goto L_0x002e
            android.media.ExifInterface r3 = new android.media.ExifInterface     // Catch:{ FileNotFoundException -> 0x0043, IOException -> 0x003f, all -> 0x0034 }
            java.io.FileDescriptor r0 = r2.getFileDescriptor()     // Catch:{ FileNotFoundException -> 0x0043, IOException -> 0x003f, all -> 0x0034 }
            r3.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0043, IOException -> 0x003f, all -> 0x0034 }
            r1 = r3
        L_0x002e:
            if (r2 == 0) goto L_0x0046
        L_0x0030:
            r2.close()     // Catch:{ IOException -> 0x0010 }
            goto L_0x0046
        L_0x0034:
            r3 = move-exception
            goto L_0x0038
        L_0x0036:
            r3 = move-exception
            r2 = r1
        L_0x0038:
            if (r2 == 0) goto L_0x003d
            r2.close()     // Catch:{ IOException -> 0x003d }
        L_0x003d:
            throw r3
        L_0x003e:
            r2 = r1
        L_0x003f:
            if (r2 == 0) goto L_0x0046
            goto L_0x0030
        L_0x0042:
            r2 = r1
        L_0x0043:
            if (r2 == 0) goto L_0x0046
            goto L_0x0030
        L_0x0046:
            r2 = 0
            if (r1 == 0) goto L_0x0063
            java.lang.String r3 = "Orientation"
            int r3 = r1.getAttributeInt(r3, r2)
            r0 = 3
            if (r3 == r0) goto L_0x0060
            r0 = 6
            if (r3 == r0) goto L_0x005d
            r0 = 8
            if (r3 == r0) goto L_0x005a
            return r2
        L_0x005a:
            r2 = 270(0x10e, float:3.78E-43)
            return r2
        L_0x005d:
            r2 = 90
            return r2
        L_0x0060:
            r2 = 180(0xb4, float:2.52E-43)
            return r2
        L_0x0063:
            return r2
        L_0x0064:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "contentResolver should not be null after Android Q"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.utils.BitmapLoader.getRotation(android.content.ContentResolver, java.lang.String):int");
    }

    @Keep
    public static Bitmap loadBitmap(String str, int i, int i2) {
        ExifInterface exifInterface;
        Bitmap bitmap;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (i > 0 && i2 > 0) {
            options.inSampleSize = calculateInSampleSize(null, str, i, i2);
        }
        try {
            Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
            try {
                exifInterface = new ExifInterface(str);
            } catch (IOException unused) {
                exifInterface = null;
            }
            int i3 = 0;
            if (exifInterface != null) {
                int attributeInt = exifInterface.getAttributeInt("Orientation", 0);
                if (attributeInt == 3) {
                    i3 = 180;
                } else if (attributeInt == 6) {
                    i3 = 90;
                } else if (attributeInt == 8) {
                    i3 = 270;
                }
            }
            if (i3 != 0) {
                Matrix matrix = new Matrix();
                matrix.postRotate((float) i3);
                bitmap = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
                if (decodeFile != null && !decodeFile.isRecycled()) {
                    decodeFile.recycle();
                }
            } else {
                bitmap = decodeFile;
            }
            return makeDimensionEven(bitmap);
        } catch (OutOfMemoryError e2) {
            c.c("loadBitmap", e2.getMessage());
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r5 != null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0063, code lost:
        if (r5 != null) goto L_0x0036;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0058 A[SYNTHETIC, Splitter:B:30:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005e A[SYNTHETIC, Splitter:B:33:0x005e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int calculateInSampleSize(android.content.ContentResolver r5, java.lang.String r6, int r7, int r8) {
        /*
            r0 = 1
            r1 = -1
            if (r7 == r1) goto L_0x007f
            if (r8 != r1) goto L_0x0008
            goto L_0x007f
        L_0x0008:
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options
            r2.<init>()
            r2.inJustDecodeBounds = r0
            java.lang.String r3 = "content"
            boolean r3 = r6.startsWith(r3)
            if (r3 != 0) goto L_0x001b
            android.graphics.BitmapFactory.decodeFile(r6, r2)
            goto L_0x0066
        L_0x001b:
            android.net.Uri r6 = android.net.Uri.parse(r6)
            r3 = 0
            if (r5 == 0) goto L_0x0042
            java.lang.String r4 = "r"
            android.os.ParcelFileDescriptor r5 = r5.openFileDescriptor(r6, r4)     // Catch:{ FileNotFoundException -> 0x0062, OutOfMemoryError -> 0x004c }
            java.io.FileDescriptor r6 = r5.getFileDescriptor()     // Catch:{ FileNotFoundException -> 0x0063, OutOfMemoryError -> 0x003f, all -> 0x003c }
            android.graphics.Rect r3 = new android.graphics.Rect     // Catch:{ FileNotFoundException -> 0x0063, OutOfMemoryError -> 0x003f, all -> 0x003c }
            r3.<init>(r1, r1, r1, r1)     // Catch:{ FileNotFoundException -> 0x0063, OutOfMemoryError -> 0x003f, all -> 0x003c }
            android.graphics.BitmapFactory.decodeFileDescriptor(r6, r3, r2)     // Catch:{ FileNotFoundException -> 0x0063, OutOfMemoryError -> 0x003f, all -> 0x003c }
            if (r5 == 0) goto L_0x0066
        L_0x0036:
            r5.close()     // Catch:{ IOException -> 0x003a }
            goto L_0x0066
        L_0x003a:
            goto L_0x0066
        L_0x003c:
            r6 = move-exception
            r3 = r5
            goto L_0x005c
        L_0x003f:
            r6 = move-exception
            r3 = r5
            goto L_0x004d
        L_0x0042:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch:{ FileNotFoundException -> 0x0062, OutOfMemoryError -> 0x004c }
            java.lang.String r6 = "contentResolver should not be null after Android Q"
            r5.<init>(r6)     // Catch:{ FileNotFoundException -> 0x0062, OutOfMemoryError -> 0x004c }
            throw r5     // Catch:{ FileNotFoundException -> 0x0062, OutOfMemoryError -> 0x004c }
        L_0x004a:
            r6 = move-exception
            goto L_0x005c
        L_0x004c:
            r6 = move-exception
        L_0x004d:
            java.lang.String r5 = "loadBitmap"
            java.lang.String r6 = r6.getMessage()     // Catch:{ all -> 0x004a }
            com.ss.android.medialib.common.c.c(r5, r6)     // Catch:{ all -> 0x004a }
            if (r3 == 0) goto L_0x0066
            r3.close()     // Catch:{ IOException -> 0x003a }
            goto L_0x0066
        L_0x005c:
            if (r3 == 0) goto L_0x0061
            r3.close()     // Catch:{ IOException -> 0x0061 }
        L_0x0061:
            throw r6
        L_0x0062:
            r5 = r3
        L_0x0063:
            if (r5 == 0) goto L_0x0066
            goto L_0x0036
        L_0x0066:
            int r5 = r2.outHeight
            int r6 = r2.outWidth
            r1 = 0
            if (r5 > r8) goto L_0x006f
            if (r6 <= r7) goto L_0x007a
        L_0x006f:
            float r6 = (float) r6
            float r7 = (float) r7
            float r6 = r6 / r7
            float r5 = (float) r5
            float r7 = (float) r8
            float r5 = r5 / r7
            float r5 = java.lang.Math.min(r5, r6)
            int r1 = (int) r5
        L_0x007a:
            int r5 = java.lang.Math.max(r0, r1)
            return r5
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.utils.BitmapLoader.calculateInSampleSize(android.content.ContentResolver, java.lang.String, int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004f, code lost:
        if (r9 != null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005d, code lost:
        if (r9 != null) goto L_0x0051;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0058 A[SYNTHETIC, Splitter:B:30:0x0058] */
    @android.support.annotation.Keep
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap loadBitmapCompat(android.content.ContentResolver r7, java.lang.String r8, int r9, int r10) {
        /*
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            java.lang.String r1 = "content"
            boolean r1 = r8.startsWith(r1)
            if (r1 != 0) goto L_0x0013
            android.graphics.Bitmap r7 = loadBitmap(r8, r9, r10)
            goto L_0x0090
        L_0x0013:
            if (r9 <= 0) goto L_0x001d
            if (r10 <= 0) goto L_0x001d
            int r9 = calculateInSampleSize(r7, r8, r9, r10)
            r0.inSampleSize = r9
        L_0x001d:
            if (r7 == 0) goto L_0x0091
            android.net.Uri r9 = android.net.Uri.parse(r8)
            r10 = 0
            java.lang.String r1 = "r"
            android.os.ParcelFileDescriptor r9 = r7.openFileDescriptor(r9, r1)     // Catch:{ FileNotFoundException -> 0x005c, OutOfMemoryError -> 0x0044, all -> 0x0041 }
            java.io.FileDescriptor r1 = r9.getFileDescriptor()     // Catch:{ FileNotFoundException -> 0x005d, OutOfMemoryError -> 0x003f }
            android.graphics.Rect r2 = new android.graphics.Rect     // Catch:{ FileNotFoundException -> 0x005d, OutOfMemoryError -> 0x003f }
            r3 = -1
            r2.<init>(r3, r3, r3, r3)     // Catch:{ FileNotFoundException -> 0x005d, OutOfMemoryError -> 0x003f }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFileDescriptor(r1, r2, r0)     // Catch:{ FileNotFoundException -> 0x005d, OutOfMemoryError -> 0x003f }
            if (r9 == 0) goto L_0x003d
            r9.close()     // Catch:{ IOException -> 0x003d }
        L_0x003d:
            r10 = r0
            goto L_0x0060
        L_0x003f:
            r0 = move-exception
            goto L_0x0046
        L_0x0041:
            r7 = move-exception
            r9 = r10
            goto L_0x0056
        L_0x0044:
            r0 = move-exception
            r9 = r10
        L_0x0046:
            java.lang.String r1 = "loadBitmap"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0055 }
            com.ss.android.medialib.common.c.c(r1, r0)     // Catch:{ all -> 0x0055 }
            if (r9 == 0) goto L_0x0060
        L_0x0051:
            r9.close()     // Catch:{ IOException -> 0x0060 }
            goto L_0x0060
        L_0x0055:
            r7 = move-exception
        L_0x0056:
            if (r9 == 0) goto L_0x005b
            r9.close()     // Catch:{ IOException -> 0x005b }
        L_0x005b:
            throw r7
        L_0x005c:
            r9 = r10
        L_0x005d:
            if (r9 == 0) goto L_0x0060
            goto L_0x0051
        L_0x0060:
            int r7 = getRotation(r7, r8)
            if (r7 == 0) goto L_0x008b
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            float r7 = (float) r7
            r5.postRotate(r7)
            r1 = 0
            r2 = 0
            int r3 = r10.getWidth()
            int r4 = r10.getHeight()
            r6 = 1
            r0 = r10
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6)
            if (r10 == 0) goto L_0x008c
            boolean r8 = r10.isRecycled()
            if (r8 != 0) goto L_0x008c
            r10.recycle()
            goto L_0x008c
        L_0x008b:
            r7 = r10
        L_0x008c:
            android.graphics.Bitmap r7 = makeDimensionEven(r7)
        L_0x0090:
            return r7
        L_0x0091:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r8 = "contentResolver should not be null after Android Q"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.utils.BitmapLoader.loadBitmapCompat(android.content.ContentResolver, java.lang.String, int, int):android.graphics.Bitmap");
    }
}
