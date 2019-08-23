package com.huawei.android.pushselfshow.utils.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.huawei.android.pushagent.utils.a.e;

public class a {
    public Bitmap a(Context context, Bitmap bitmap, float f2, float f3) {
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            Matrix matrix = new Matrix();
            matrix.postScale(f2 / ((float) width), f3 / ((float) height));
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
            if (createBitmap != null) {
                e.a("PushSelfShowLog", "reScaleBitmap success");
                return createBitmap;
            }
        } catch (Exception e2) {
            e.c("PushSelfShowLog", "reScaleBitmap fail ,error ：" + e2, e2);
        }
        return bitmap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0117 A[SYNTHETIC, Splitter:B:43:0x0117] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0150 A[SYNTHETIC, Splitter:B:58:0x0150] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap a(android.content.Context r8, java.lang.String r9) {
        /*
            r7 = this;
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            java.lang.String r2 = "image"
            r1.<init>(r2)     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            r1.append(r2)     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            java.lang.String r2 = com.huawei.android.pushselfshow.utils.b.b.a((android.content.Context) r8)     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            boolean r4 = r3.exists()     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            if (r4 != 0) goto L_0x0056
            java.lang.String r4 = "PushSelfShowLog"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            java.lang.String r6 = "mkdir: "
            r5.<init>(r6)     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            java.lang.String r6 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            r5.append(r6)     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            com.huawei.android.pushagent.utils.a.e.a(r4, r5)     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            boolean r4 = r3.mkdirs()     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            if (r4 != 0) goto L_0x0056
            java.lang.String r4 = "PushSelfShowLog"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            java.lang.String r6 = "file mkdir failed ,path is "
            r5.<init>(r6)     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            java.lang.String r3 = r3.getPath()     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            r5.append(r3)     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            java.lang.String r3 = r5.toString()     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            com.huawei.android.pushagent.utils.a.e.a(r4, r3)     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
        L_0x0056:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            r3.<init>()     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            r3.append(r2)     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            java.lang.String r2 = java.io.File.separator     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            r3.append(r2)     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            r3.append(r1)     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            java.lang.String r2 = "PushSelfShowLog"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            java.lang.String r4 = "try to download image to "
            r3.<init>(r4)     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            r3.append(r1)     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            com.huawei.android.pushagent.utils.a.e.a(r2, r3)     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            com.huawei.android.pushselfshow.utils.b.b r2 = new com.huawei.android.pushselfshow.utils.b.b     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            r2.<init>()     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            boolean r8 = r2.b(r8, r9, r1)     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            if (r8 == 0) goto L_0x00b8
            java.lang.String r8 = "PushSelfShowLog"
            java.lang.String r9 = "download successed"
            com.huawei.android.pushagent.utils.a.e.a(r8, r9)     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            android.graphics.BitmapFactory$Options r8 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            r8.<init>()     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            r9 = 0
            r8.inDither = r9     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            r9 = 1
            r8.inPurgeable = r9     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            r8.inSampleSize = r9     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            r8.inPreferredConfig = r9     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            java.io.File r9 = new java.io.File     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            r9.<init>(r1)     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r1, r0, r8)     // Catch:{ Exception -> 0x00b0 }
            r0 = r1
            goto L_0x00c1
        L_0x00b0:
            r8 = move-exception
            goto L_0x00fe
        L_0x00b2:
            r8 = move-exception
            goto L_0x014e
        L_0x00b5:
            r8 = move-exception
            r1 = r0
            goto L_0x00fe
        L_0x00b8:
            java.lang.String r8 = "PushSelfShowLog"
            java.lang.String r9 = "download failed"
            com.huawei.android.pushagent.utils.a.e.a(r8, r9)     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            r8 = r0
            r9 = r8
        L_0x00c1:
            if (r0 == 0) goto L_0x00c9
            r0.close()     // Catch:{ Exception -> 0x00c7 }
            goto L_0x00c9
        L_0x00c7:
            r9 = move-exception
            goto L_0x00e0
        L_0x00c9:
            if (r9 == 0) goto L_0x014b
            boolean r0 = r9.isFile()     // Catch:{ Exception -> 0x00c7 }
            if (r0 == 0) goto L_0x014b
            boolean r9 = r9.delete()     // Catch:{ Exception -> 0x00c7 }
            if (r9 == 0) goto L_0x014b
            java.lang.String r9 = "PushSelfShowLog"
            java.lang.String r0 = "image delete success"
            com.huawei.android.pushagent.utils.a.e.a(r9, r0)     // Catch:{ Exception -> 0x00c7 }
            goto L_0x014b
        L_0x00e0:
            java.lang.String r0 = "PushSelfShowLog"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "is.close() error"
            r1.<init>(r2)
            java.lang.String r2 = r9.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.huawei.android.pushagent.utils.a.e.c(r0, r1, r9)
            goto L_0x014b
        L_0x00f8:
            r8 = move-exception
            r9 = r0
            goto L_0x014e
        L_0x00fb:
            r8 = move-exception
            r9 = r0
            r1 = r9
        L_0x00fe:
            java.lang.String r2 = "PushSelfShowLog"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x014c }
            java.lang.String r4 = "getRemoteImage  failed  ,errorinfo is "
            r3.<init>(r4)     // Catch:{ all -> 0x014c }
            java.lang.String r4 = r8.toString()     // Catch:{ all -> 0x014c }
            r3.append(r4)     // Catch:{ all -> 0x014c }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x014c }
            com.huawei.android.pushagent.utils.a.e.c(r2, r3, r8)     // Catch:{ all -> 0x014c }
            if (r1 == 0) goto L_0x011d
            r1.close()     // Catch:{ Exception -> 0x011b }
            goto L_0x011d
        L_0x011b:
            r8 = move-exception
            goto L_0x0133
        L_0x011d:
            if (r9 == 0) goto L_0x014a
            boolean r8 = r9.isFile()     // Catch:{ Exception -> 0x011b }
            if (r8 == 0) goto L_0x014a
            boolean r8 = r9.delete()     // Catch:{ Exception -> 0x011b }
            if (r8 == 0) goto L_0x014a
            java.lang.String r8 = "PushSelfShowLog"
            java.lang.String r9 = "image delete success"
            com.huawei.android.pushagent.utils.a.e.a(r8, r9)     // Catch:{ Exception -> 0x011b }
            goto L_0x014a
        L_0x0133:
            java.lang.String r9 = "PushSelfShowLog"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "is.close() error"
            r1.<init>(r2)
            java.lang.String r2 = r8.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.huawei.android.pushagent.utils.a.e.c(r9, r1, r8)
        L_0x014a:
            r8 = r0
        L_0x014b:
            return r8
        L_0x014c:
            r8 = move-exception
            r0 = r1
        L_0x014e:
            if (r0 == 0) goto L_0x0156
            r0.close()     // Catch:{ Exception -> 0x0154 }
            goto L_0x0156
        L_0x0154:
            r9 = move-exception
            goto L_0x016c
        L_0x0156:
            if (r9 == 0) goto L_0x0183
            boolean r0 = r9.isFile()     // Catch:{ Exception -> 0x0154 }
            if (r0 == 0) goto L_0x0183
            boolean r9 = r9.delete()     // Catch:{ Exception -> 0x0154 }
            if (r9 == 0) goto L_0x0183
            java.lang.String r9 = "PushSelfShowLog"
            java.lang.String r0 = "image delete success"
            com.huawei.android.pushagent.utils.a.e.a(r9, r0)     // Catch:{ Exception -> 0x0154 }
            goto L_0x0183
        L_0x016c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "is.close() error"
            r0.<init>(r1)
            java.lang.String r1 = r9.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "PushSelfShowLog"
            com.huawei.android.pushagent.utils.a.e.c(r1, r0, r9)
        L_0x0183:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushselfshow.utils.c.a.a(android.content.Context, java.lang.String):android.graphics.Bitmap");
    }
}
