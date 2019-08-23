package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;

public class BitmapEncoder implements ResourceEncoder<Bitmap> {
    public static final Option<Bitmap.CompressFormat> COMPRESSION_FORMAT = Option.memory("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
    public static final Option<Integer> COMPRESSION_QUALITY = Option.memory("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);
    @Nullable
    private final ArrayPool arrayPool;

    @Deprecated
    public BitmapEncoder() {
    }

    @NonNull
    public EncodeStrategy getEncodeStrategy(@NonNull Options options) {
        return EncodeStrategy.TRANSFORMED;
    }

    public BitmapEncoder(@NonNull ArrayPool arrayPool2) {
        this.arrayPool = arrayPool2;
    }

    private Bitmap.CompressFormat getFormat(Bitmap bitmap, Options options) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) options.get(COMPRESSION_FORMAT);
        if (compressFormat != null) {
            return compressFormat;
        }
        if (bitmap.hasAlpha()) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:18|19|(0)|26|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005c, code lost:
        if (r2 != null) goto L_0x004a;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x005b */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0058 A[SYNTHETIC, Splitter:B:24:0x0058] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean encode(@android.support.annotation.NonNull com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> r5, @android.support.annotation.NonNull java.io.File r6, @android.support.annotation.NonNull com.bumptech.glide.load.Options r7) {
        /*
            r4 = this;
            java.lang.Object r5 = r5.get()
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            android.graphics.Bitmap$CompressFormat r0 = r4.getFormat(r5, r7)
            java.lang.String r1 = "encode: [%dx%d] %s"
            int r2 = r5.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r5.getHeight()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.bumptech.glide.util.pool.GlideTrace.beginSectionFormat(r1, r2, r3, r0)
            com.bumptech.glide.util.LogTime.getLogTime()     // Catch:{ all -> 0x0063 }
            com.bumptech.glide.load.Option<java.lang.Integer> r1 = COMPRESSION_QUALITY     // Catch:{ all -> 0x0063 }
            java.lang.Object r7 = r7.get(r1)     // Catch:{ all -> 0x0063 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x0063 }
            int r7 = r7.intValue()     // Catch:{ all -> 0x0063 }
            r1 = 0
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x004e, all -> 0x0055 }
            r3.<init>(r6)     // Catch:{ IOException -> 0x004e, all -> 0x0055 }
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r6 = r4.arrayPool     // Catch:{ IOException -> 0x0053, all -> 0x0050 }
            if (r6 == 0) goto L_0x0042
            com.bumptech.glide.load.data.BufferedOutputStream r6 = new com.bumptech.glide.load.data.BufferedOutputStream     // Catch:{ IOException -> 0x0053, all -> 0x0050 }
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2 = r4.arrayPool     // Catch:{ IOException -> 0x0053, all -> 0x0050 }
            r6.<init>(r3, r2)     // Catch:{ IOException -> 0x0053, all -> 0x0050 }
            r2 = r6
            goto L_0x0043
        L_0x0042:
            r2 = r3
        L_0x0043:
            r5.compress(r0, r7, r2)     // Catch:{ IOException -> 0x004e, all -> 0x0055 }
            r2.close()     // Catch:{ IOException -> 0x004e, all -> 0x0055 }
            r1 = 1
        L_0x004a:
            r2.close()     // Catch:{ IOException -> 0x005f }
            goto L_0x005f
        L_0x004e:
            goto L_0x005c
        L_0x0050:
            r5 = move-exception
            r2 = r3
            goto L_0x0056
        L_0x0053:
            r2 = r3
            goto L_0x005c
        L_0x0055:
            r5 = move-exception
        L_0x0056:
            if (r2 == 0) goto L_0x005b
            r2.close()     // Catch:{ IOException -> 0x005b }
        L_0x005b:
            throw r5     // Catch:{ all -> 0x0063 }
        L_0x005c:
            if (r2 == 0) goto L_0x005f
            goto L_0x004a
        L_0x005f:
            com.bumptech.glide.util.pool.GlideTrace.endSection()
            return r1
        L_0x0063:
            r5 = move-exception
            com.bumptech.glide.util.pool.GlideTrace.endSection()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.BitmapEncoder.encode(com.bumptech.glide.load.engine.Resource, java.io.File, com.bumptech.glide.load.Options):boolean");
    }
}
