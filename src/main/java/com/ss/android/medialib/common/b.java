package com.ss.android.medialib.common;

import android.media.ExifInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29622a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final String f29623b = "b";

    public static int a(String str) {
        ExifInterface exifInterface;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f29622a, true, 17071, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, null, f29622a, true, 17071, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        try {
            exifInterface = new ExifInterface(str2);
        } catch (IOException unused) {
            exifInterface = null;
        }
        if (exifInterface == null) {
            return 0;
        }
        int attributeInt = exifInterface.getAttributeInt("Orientation", 0);
        if (attributeInt == 3) {
            return 180;
        }
        if (attributeInt == 6) {
            return 90;
        }
        if (attributeInt != 8) {
            return 0;
        }
        return 270;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b8, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0081 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00a6 */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00af A[SYNTHETIC, Splitter:B:30:0x00af] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b4 A[SYNTHETIC, Splitter:B:34:0x00b4] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bd A[SYNTHETIC, Splitter:B:41:0x00bd] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c2 A[SYNTHETIC, Splitter:B:45:0x00c2] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.graphics.Bitmap r21, java.lang.String r22, android.graphics.Bitmap.CompressFormat r23) {
        /*
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            r12 = 1
            r4[r12] = r1
            r13 = 2
            r4[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = f29622a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<android.graphics.Bitmap> r5 = android.graphics.Bitmap.class
            r9[r11] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r12] = r5
            java.lang.Class<android.graphics.Bitmap$CompressFormat> r5 = android.graphics.Bitmap.CompressFormat.class
            r9[r13] = r5
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = 0
            r7 = 1
            r8 = 17069(0x42ad, float:2.3919E-41)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0053
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r0
            r14[r12] = r1
            r14[r13] = r2
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = f29622a
            r17 = 1
            r18 = 17069(0x42ad, float:2.3919E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1
            java.lang.Class<android.graphics.Bitmap$CompressFormat> r1 = android.graphics.Bitmap.CompressFormat.class
            r0[r13] = r1
            java.lang.Class r20 = java.lang.Void.TYPE
            r19 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            return
        L_0x0053:
            java.lang.String r3 = f29623b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Bitmap "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r5 = "saving"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.ss.android.vesdk.y.a(r3, r4)
            r3 = 0
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            r4.<init>(r1)     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x00a6 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x00a6 }
            r3 = 100
            r0.compress(r2, r3, r5)     // Catch:{ IOException -> 0x00a0, all -> 0x009d }
            r5.flush()     // Catch:{ IOException -> 0x00a0, all -> 0x009d }
            r5.close()     // Catch:{ IOException -> 0x0081 }
        L_0x0081:
            r4.close()     // Catch:{ IOException -> 0x0084 }
        L_0x0084:
            java.lang.String r0 = f29623b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Bitmap "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " saved!"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.ss.android.vesdk.y.a(r0, r1)
            return
        L_0x009d:
            r0 = move-exception
            r3 = r5
            goto L_0x00bb
        L_0x00a0:
            r3 = r5
            goto L_0x00a6
        L_0x00a2:
            r0 = move-exception
            r4 = r3
            goto L_0x00bb
        L_0x00a5:
            r4 = r3
        L_0x00a6:
            java.lang.String r0 = f29623b     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = "Err when saving bitmap..."
            com.ss.android.vesdk.y.d(r0, r1)     // Catch:{ all -> 0x00ba }
            if (r3 == 0) goto L_0x00b2
            r3.close()     // Catch:{ IOException -> 0x00b2 }
        L_0x00b2:
            if (r4 == 0) goto L_0x00b9
            r4.close()     // Catch:{ IOException -> 0x00b8 }
            goto L_0x00b9
        L_0x00b8:
            return
        L_0x00b9:
            return
        L_0x00ba:
            r0 = move-exception
        L_0x00bb:
            if (r3 == 0) goto L_0x00c0
            r3.close()     // Catch:{ IOException -> 0x00c0 }
        L_0x00c0:
            if (r4 == 0) goto L_0x00c5
            r4.close()     // Catch:{ IOException -> 0x00c5 }
        L_0x00c5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.common.b.a(android.graphics.Bitmap, java.lang.String, android.graphics.Bitmap$CompressFormat):void");
    }
}
