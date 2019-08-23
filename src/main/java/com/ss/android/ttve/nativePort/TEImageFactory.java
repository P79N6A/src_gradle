package com.ss.android.ttve.nativePort;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

@Keep
public class TEImageFactory {

    @Keep
    public static class ImageInfo {
        Bitmap bitmap;
        int height;
        String mimeType;
        int rotation;
        int width;

        public Bitmap getBitmap() {
            return this.bitmap;
        }

        public int getHeight() {
            return this.height;
        }

        public String getMimeType() {
            return this.mimeType;
        }

        public int getRotation() {
            return this.rotation;
        }

        public int getWidth() {
            return this.width;
        }
    }

    public static void recycleBitmap(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    public static ImageInfo decodeFile(ContentResolver contentResolver, @NonNull String str) {
        return decodeFile(contentResolver, str, null);
    }

    public static ImageInfo getImageInfo(ContentResolver contentResolver, @NonNull String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        decodeFileCompat(contentResolver, str, options);
        ImageInfo imageInfo = new ImageInfo();
        imageInfo.width = options.outWidth;
        imageInfo.height = options.outHeight;
        imageInfo.mimeType = options.outMimeType;
        return imageInfo;
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
            com.ss.android.vesdk.r r2 = new com.ss.android.vesdk.r
            r3 = -29
            java.lang.String r0 = "contentResolver should not be null after Android Q"
            r2.<init>(r3, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.nativePort.TEImageFactory.getRotation(android.content.ContentResolver, java.lang.String):int");
    }

    public static ImageInfo decodeFile(ContentResolver contentResolver, @NonNull String str, @Nullable BitmapFactory.Options options) {
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap decodeFileCompat = decodeFileCompat(contentResolver, str, options);
        if (decodeFileCompat == null) {
            return null;
        }
        if (decodeFileCompat.getConfig() != Bitmap.Config.ARGB_8888) {
            Bitmap copy = decodeFileCompat.copy(Bitmap.Config.ARGB_8888, false);
            recycleBitmap(decodeFileCompat);
            decodeFileCompat = copy;
        }
        ImageInfo imageInfo = new ImageInfo();
        imageInfo.width = decodeFileCompat.getWidth();
        imageInfo.height = decodeFileCompat.getHeight();
        imageInfo.bitmap = decodeFileCompat;
        imageInfo.mimeType = "bitmap";
        imageInfo.rotation = getRotation(contentResolver, str);
        return imageInfo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0035 A[SYNTHETIC, Splitter:B:18:0x0035] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x003c A[SYNTHETIC, Splitter:B:26:0x003c] */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap decodeFileCompat(android.content.ContentResolver r3, @android.support.annotation.NonNull java.lang.String r4, android.graphics.BitmapFactory.Options r5) {
        /*
            java.lang.String r0 = "content"
            boolean r0 = r4.startsWith(r0)
            r1 = 0
            if (r0 != 0) goto L_0x000e
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeFile(r4, r5)
            goto L_0x003f
        L_0x000e:
            if (r3 == 0) goto L_0x0040
            android.net.Uri r4 = android.net.Uri.parse(r4)
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r3 = r3.openFileDescriptor(r4, r0)     // Catch:{ FileNotFoundException -> 0x0039, all -> 0x0031 }
            java.io.FileDescriptor r4 = r3.getFileDescriptor()     // Catch:{ FileNotFoundException -> 0x003a, all -> 0x002f }
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch:{ FileNotFoundException -> 0x003a, all -> 0x002f }
            r2 = -1
            r0.<init>(r2, r2, r2, r2)     // Catch:{ FileNotFoundException -> 0x003a, all -> 0x002f }
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeFileDescriptor(r4, r0, r5)     // Catch:{ FileNotFoundException -> 0x003a, all -> 0x002f }
            if (r3 == 0) goto L_0x002d
            r3.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            r1 = r4
            goto L_0x003f
        L_0x002f:
            r4 = move-exception
            goto L_0x0033
        L_0x0031:
            r4 = move-exception
            r3 = r1
        L_0x0033:
            if (r3 == 0) goto L_0x0038
            r3.close()     // Catch:{ IOException -> 0x0038 }
        L_0x0038:
            throw r4
        L_0x0039:
            r3 = r1
        L_0x003a:
            if (r3 == 0) goto L_0x003f
            r3.close()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            return r1
        L_0x0040:
            com.ss.android.vesdk.r r3 = new com.ss.android.vesdk.r
            r4 = -29
            java.lang.String r5 = "contentResolver should not be null after Android Q"
            r3.<init>(r4, r5)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.nativePort.TEImageFactory.decodeFileCompat(android.content.ContentResolver, java.lang.String, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }
}
