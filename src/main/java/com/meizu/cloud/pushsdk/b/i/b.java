package com.meizu.cloud.pushsdk.b.i;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.NetworkOnMainThreadException;
import android.widget.ImageView;
import com.meizu.cloud.pushsdk.b.a.c;
import com.meizu.cloud.pushsdk.b.b.a;
import com.meizu.cloud.pushsdk.b.c.k;
import com.meizu.cloud.pushsdk.b.g.f;
import com.meizu.cloud.pushsdk.b.g.l;
import java.io.IOException;
import java.net.URLConnection;

public class b {
    public static int a(int i, int i2, int i3, int i4) {
        double d2 = (double) i;
        double d3 = (double) i3;
        Double.isNaN(d2);
        Double.isNaN(d3);
        double d4 = (double) i2;
        double d5 = (double) i4;
        Double.isNaN(d4);
        Double.isNaN(d5);
        double min = Math.min(d2 / d3, d4 / d5);
        float f2 = 1.0f;
        while (true) {
            float f3 = 2.0f * f2;
            if (((double) f3) > min) {
                return (int) f2;
            }
            f2 = f3;
        }
    }

    private static int a(int i, int i2, int i3, int i4, ImageView.ScaleType scaleType) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i == 0 ? i3 : i;
        }
        if (i == 0) {
            double d2 = (double) i2;
            double d3 = (double) i4;
            Double.isNaN(d2);
            Double.isNaN(d3);
            double d4 = (double) i3;
            Double.isNaN(d4);
            return (int) (d4 * (d2 / d3));
        } else if (i2 == 0) {
            return i;
        } else {
            double d5 = (double) i4;
            double d6 = (double) i3;
            Double.isNaN(d5);
            Double.isNaN(d6);
            double d7 = d5 / d6;
            if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                double d8 = (double) i;
                Double.isNaN(d8);
                double d9 = (double) i2;
                if (d8 * d7 < d9) {
                    Double.isNaN(d9);
                    i = (int) (d9 / d7);
                }
                return i;
            }
            double d10 = (double) i;
            Double.isNaN(d10);
            double d11 = (double) i2;
            if (d10 * d7 > d11) {
                Double.isNaN(d11);
                i = (int) (d11 / d7);
            }
            return i;
        }
    }

    public static c<Bitmap> a(k kVar, int i, int i2, Bitmap.Config config, ImageView.ScaleType scaleType) {
        Bitmap bitmap;
        byte[] bArr = new byte[0];
        try {
            bArr = f.a((l) kVar.b().a()).i();
        } catch (IOException unused) {
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (i == 0 && i2 == 0) {
            options.inPreferredConfig = config;
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i3 = options.outWidth;
            int i4 = options.outHeight;
            int a2 = a(i, i2, i3, i4, scaleType);
            int a3 = a(i2, i, i4, i3, scaleType);
            options.inJustDecodeBounds = false;
            options.inSampleSize = a(i3, i4, a2, a3);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (decodeByteArray == null || (decodeByteArray.getWidth() <= a2 && decodeByteArray.getHeight() <= a3)) {
                bitmap = decodeByteArray;
            } else {
                bitmap = Bitmap.createScaledBitmap(decodeByteArray, a2, a3, true);
                decodeByteArray.recycle();
            }
        }
        return bitmap == null ? c.a(b(new a(kVar))) : c.a(bitmap);
    }

    public static a a(a aVar) {
        aVar.a("connectionError");
        aVar.a(0);
        aVar.b(aVar.getMessage());
        return aVar;
    }

    public static a a(a aVar, com.meizu.cloud.pushsdk.b.a.b bVar, int i) {
        a a2 = bVar.a(aVar);
        a2.a(i);
        a2.a("responseFromServerError");
        return a2;
    }

    public static a a(Exception exc) {
        a aVar = new a((Throwable) exc);
        aVar.a((Build.VERSION.SDK_INT < 11 || !(exc instanceof NetworkOnMainThreadException)) ? "connectionError" : "networkOnMainThreadError");
        aVar.a(0);
        return aVar;
    }

    public static String a(String str) {
        String contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(str);
        return contentTypeFor == null ? "application/octet-stream" : contentTypeFor;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|(1:6)|7|(3:8|9|(1:11)(1:33))|12|(2:14|15)|16|17|34) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0039 */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046 A[SYNTHETIC, Splitter:B:25:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004b A[SYNTHETIC, Splitter:B:29:0x004b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.meizu.cloud.pushsdk.b.c.k r3, java.lang.String r4, java.lang.String r5) throws java.io.IOException {
        /*
            r0 = 2048(0x800, float:2.87E-42)
            byte[] r0 = new byte[r0]
            r1 = 0
            com.meizu.cloud.pushsdk.b.c.l r3 = r3.b()     // Catch:{ all -> 0x0042 }
            java.io.InputStream r3 = r3.b()     // Catch:{ all -> 0x0042 }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0040 }
            r2.<init>(r4)     // Catch:{ all -> 0x0040 }
            boolean r4 = r2.exists()     // Catch:{ all -> 0x0040 }
            if (r4 != 0) goto L_0x001b
            r2.mkdirs()     // Catch:{ all -> 0x0040 }
        L_0x001b:
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0040 }
            r4.<init>(r2, r5)     // Catch:{ all -> 0x0040 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ all -> 0x0040 }
            r5.<init>(r4)     // Catch:{ all -> 0x0040 }
        L_0x0025:
            int r4 = r3.read(r0)     // Catch:{ all -> 0x003d }
            r1 = -1
            if (r4 == r1) goto L_0x0031
            r1 = 0
            r5.write(r0, r1, r4)     // Catch:{ all -> 0x003d }
            goto L_0x0025
        L_0x0031:
            r5.flush()     // Catch:{ all -> 0x003d }
            if (r3 == 0) goto L_0x0039
            r3.close()     // Catch:{ IOException -> 0x0039 }
        L_0x0039:
            r5.close()     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            return
        L_0x003d:
            r4 = move-exception
            r1 = r5
            goto L_0x0044
        L_0x0040:
            r4 = move-exception
            goto L_0x0044
        L_0x0042:
            r4 = move-exception
            r3 = r1
        L_0x0044:
            if (r3 == 0) goto L_0x0049
            r3.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            if (r1 == 0) goto L_0x004e
            r1.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.b.i.b.a(com.meizu.cloud.pushsdk.b.c.k, java.lang.String, java.lang.String):void");
    }

    public static a b(a aVar) {
        aVar.a(0);
        aVar.a("parseError");
        aVar.b(aVar.getMessage());
        return aVar;
    }
}
