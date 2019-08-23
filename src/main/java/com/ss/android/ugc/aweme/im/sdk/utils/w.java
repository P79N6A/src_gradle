package com.ss.android.ugc.aweme.im.sdk.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.bytedance.common.utility.io.FileUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import java.io.File;
import java.security.MessageDigest;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52667a;

    private static boolean a(int[] iArr, int i, int i2, int i3, int i4) {
        if (i <= i3 && i <= i4) {
            return false;
        }
        float f2 = ((float) i) / ((float) i2);
        float f3 = (float) i3;
        float f4 = (float) i4;
        if (f2 > f3 / f4) {
            i4 = (int) (f3 / f2);
        } else {
            i3 = (int) (f4 * f2);
        }
        iArr[0] = i3;
        iArr[1] = i4;
        return true;
    }

    public static String a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f52667a, true, 53512, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, null, f52667a, true, 53512, new Class[]{String.class}, String.class);
        }
        if (!TextUtils.isEmpty(str) && FileUtils.exists(str)) {
            String c2 = c(str);
            if (!TextUtils.isEmpty(c2)) {
                return GlobalContext.getContext().getFilesDir().getPath() + "/thumb/" + c2 + ".jpg";
            }
        }
        return str;
    }

    public static void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f52667a, true, 53515, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, null, f52667a, true, 53515, new Class[]{String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            File file = new File(a(str));
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public static boolean d(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f52667a, true, 53519, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, null, f52667a, true, 53519, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (str == null || !str.toLowerCase().equals("gif")) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean e(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f52667a, true, 53520, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, null, f52667a, true, 53520, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (str == null || !str.toLowerCase().equals("webp")) {
            return false;
        } else {
            return true;
        }
    }

    public static String c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f52667a, true, 53517, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, null, f52667a, true, 53517, new Class[]{String.class}, String.class);
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            if (PatchProxy.isSupport(new Object[]{digest}, null, f52667a, true, 53518, new Class[]{byte[].class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{digest}, null, f52667a, true, 53518, new Class[]{byte[].class}, String.class);
            }
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b2 : digest) {
                String hexString = Integer.toHexString(b2 & 255);
                if (hexString.length() == 1) {
                    hexString = PushConstants.PUSH_TYPE_NOTIFY + hexString;
                }
                stringBuffer.append(hexString);
            }
            return stringBuffer.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static int a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f52667a, true, 53506, new Class[]{String.class, String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f52667a, true, 53506, new Class[]{String.class, String.class}, Integer.TYPE)).intValue();
        } else if (!FileUtils.exists(str) || FileUtils.isGif(new File(str3))) {
            return 1;
        } else {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str3, options);
            int[] iArr = new int[2];
            if (!a(iArr, options.outWidth, options.outHeight)) {
                return 1;
            }
            Bitmap a2 = a(str3, options, iArr[0], iArr[1]);
            if (a2 == null || TextUtils.isEmpty(str2)) {
                return 2;
            }
            File a3 = a(a2, str4);
            if (!a3.exists() || a3.length() > 3145728) {
                return 2;
            }
            return 3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b5, code lost:
        if (r1 != null) goto L_0x00a6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b0 A[SYNTHETIC, Splitter:B:20:0x00b0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.io.File a(android.graphics.Bitmap r19, java.lang.String r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f52667a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.graphics.Bitmap> r4 = android.graphics.Bitmap.class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class<java.io.File> r9 = java.io.File.class
            r4 = 0
            r6 = 1
            r7 = 53510(0xd106, float:7.4983E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0048
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f52667a
            r15 = 1
            r16 = 53510(0xd106, float:7.4983E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class<java.io.File> r18 = java.io.File.class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.io.File r0 = (java.io.File) r0
            return r0
        L_0x0048:
            r2 = 0
            java.io.File r3 = new java.io.File
            r3.<init>(r1)
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r10] = r3
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f52667a
            r15 = 1
            r16 = 53514(0xd10a, float:7.4989E-41)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class<java.io.File> r4 = java.io.File.class
            r1[r10] = r4
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r17 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r1 == 0) goto L_0x0088
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r10] = r3
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f52667a
            r15 = 1
            r16 = 53514(0xd10a, float:7.4989E-41)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class<java.io.File> r4 = java.io.File.class
            r1[r10] = r4
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r17 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.booleanValue()
            goto L_0x009a
        L_0x0088:
            java.io.File r1 = r3.getParentFile()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L_0x009a
            java.io.File r1 = r3.getParentFile()
            boolean r1 = r1.mkdirs()
        L_0x009a:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x00b4, all -> 0x00ac }
            r1.<init>(r3)     // Catch:{ FileNotFoundException -> 0x00b4, all -> 0x00ac }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ FileNotFoundException -> 0x00b5, all -> 0x00aa }
            r4 = 100
            r0.compress(r2, r4, r1)     // Catch:{ FileNotFoundException -> 0x00b5, all -> 0x00aa }
        L_0x00a6:
            r1.close()     // Catch:{ IOException -> 0x00b8 }
            goto L_0x00b8
        L_0x00aa:
            r0 = move-exception
            goto L_0x00ae
        L_0x00ac:
            r0 = move-exception
            r1 = r2
        L_0x00ae:
            if (r1 == 0) goto L_0x00b3
            r1.close()     // Catch:{ IOException -> 0x00b3 }
        L_0x00b3:
            throw r0
        L_0x00b4:
            r1 = r2
        L_0x00b5:
            if (r1 == 0) goto L_0x00b8
            goto L_0x00a6
        L_0x00b8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.utils.w.a(android.graphics.Bitmap, java.lang.String):java.io.File");
    }

    private static int a(BitmapFactory.Options options, int i, int i2) {
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

    private static boolean a(int[] iArr, int i, int i2) {
        boolean z;
        int i3;
        int i4;
        if (i > i2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i3 = i2;
        } else {
            i3 = i;
        }
        if (!z) {
            i = i2;
        }
        int i5 = 1920;
        int i6 = 1080;
        if (i3 <= 1080 && i <= 1920) {
            return false;
        }
        float f2 = ((float) i3) / ((float) i);
        if (f2 >= 0.5625f) {
            i5 = (int) (1080.0f / f2);
        } else {
            i6 = (int) (f2 * 1920.0f);
        }
        if (z) {
            i4 = i5;
        } else {
            i4 = i6;
        }
        iArr[0] = i4;
        if (z) {
            i5 = i6;
        }
        iArr[1] = i5;
        return true;
    }

    public static int a(String str, String str2, int i, int i2) {
        Bitmap bitmap;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, Integer.valueOf(i), Integer.valueOf(i2)}, null, f52667a, true, 53507, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str3, str4, Integer.valueOf(i), Integer.valueOf(i2)}, null, f52667a, true, 53507, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (!FileUtils.exists(str) || FileUtils.isGif(new File(str3))) {
            return 1;
        } else {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str3, options);
            int[] iArr = new int[2];
            if (!a(iArr, options.outWidth, options.outHeight, i, i2)) {
                bitmap = BitmapFactory.decodeFile(str);
            } else {
                bitmap = a(str3, options, iArr[0], iArr[1]);
            }
            if (bitmap == null || TextUtils.isEmpty(str2) || !a(bitmap, str4).exists()) {
                return 2;
            }
            return 3;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x008d */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap a(java.lang.String r21, android.graphics.BitmapFactory.Options r22, int r23, int r24) {
        /*
            r1 = r22
            r2 = 4
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r21
            r11 = 1
            r3[r11] = r1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r23)
            r12 = 2
            r3[r12] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r24)
            r13 = 3
            r3[r13] = r4
            com.meituan.robust.ChangeQuickRedirect r5 = f52667a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r10] = r4
            java.lang.Class<android.graphics.BitmapFactory$Options> r4 = android.graphics.BitmapFactory.Options.class
            r8[r11] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8[r12] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8[r13] = r4
            java.lang.Class<android.graphics.Bitmap> r9 = android.graphics.Bitmap.class
            r4 = 0
            r6 = 1
            r7 = 53509(0xd105, float:7.4982E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0071
            java.lang.Object[] r14 = new java.lang.Object[r2]
            r14[r10] = r21
            r14[r11] = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r23)
            r14[r12] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r24)
            r14[r13] = r0
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = f52667a
            r17 = 1
            r18 = 53509(0xd105, float:7.4982E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class<android.graphics.BitmapFactory$Options> r1 = android.graphics.BitmapFactory.Options.class
            r0[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r13] = r1
            java.lang.Class<android.graphics.Bitmap> r20 = android.graphics.Bitmap.class
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            return r0
        L_0x0071:
            r2 = 0
            r1.inJustDecodeBounds = r10     // Catch:{ OutOfMemoryError -> 0x008c, Exception -> 0x0085 }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r21, r22)     // Catch:{ OutOfMemoryError -> 0x008c, Exception -> 0x0085 }
            if (r3 == 0) goto L_0x0083
            r4 = r23
            r5 = r24
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createScaledBitmap(r3, r4, r5, r11)     // Catch:{ OutOfMemoryError -> 0x008d, Exception -> 0x0086 }
            r3 = r4
        L_0x0083:
            r0 = r3
            goto L_0x00e9
        L_0x0085:
            r3 = r2
        L_0x0086:
            if (r3 == 0) goto L_0x008b
            r3.recycle()
        L_0x008b:
            return r2
        L_0x008c:
            r3 = r2
        L_0x008d:
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x00ea }
            r12[r10] = r1     // Catch:{ Exception -> 0x00ea }
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f52667a     // Catch:{ Exception -> 0x00ea }
            r15 = 1
            r16 = 53511(0xd107, float:7.4985E-41)
            java.lang.Class[] r4 = new java.lang.Class[r11]     // Catch:{ Exception -> 0x00ea }
            java.lang.Class<android.graphics.BitmapFactory$Options> r5 = android.graphics.BitmapFactory.Options.class
            r4[r10] = r5     // Catch:{ Exception -> 0x00ea }
            java.lang.Class r18 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x00ea }
            r17 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x00ea }
            if (r4 == 0) goto L_0x00c8
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x00ea }
            r12[r10] = r1     // Catch:{ Exception -> 0x00ea }
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f52667a     // Catch:{ Exception -> 0x00ea }
            r15 = 1
            r16 = 53511(0xd107, float:7.4985E-41)
            java.lang.Class[] r4 = new java.lang.Class[r11]     // Catch:{ Exception -> 0x00ea }
            java.lang.Class<android.graphics.BitmapFactory$Options> r5 = android.graphics.BitmapFactory.Options.class
            r4[r10] = r5     // Catch:{ Exception -> 0x00ea }
            java.lang.Class r18 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x00ea }
            r17 = r4
            java.lang.Object r4 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x00ea }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ Exception -> 0x00ea }
            int r4 = r4.intValue()     // Catch:{ Exception -> 0x00ea }
            goto L_0x00e3
        L_0x00c8:
            int r4 = r1.outWidth     // Catch:{ Exception -> 0x00ea }
            int r5 = r1.outHeight     // Catch:{ Exception -> 0x00ea }
            if (r4 <= r5) goto L_0x00cf
            r10 = 1
        L_0x00cf:
            r4 = 1080(0x438, float:1.513E-42)
            r5 = 1920(0x780, float:2.69E-42)
            if (r10 == 0) goto L_0x00d8
            r6 = 1920(0x780, float:2.69E-42)
            goto L_0x00da
        L_0x00d8:
            r6 = 1080(0x438, float:1.513E-42)
        L_0x00da:
            if (r10 == 0) goto L_0x00dd
            goto L_0x00df
        L_0x00dd:
            r4 = 1920(0x780, float:2.69E-42)
        L_0x00df:
            int r4 = a((android.graphics.BitmapFactory.Options) r1, (int) r6, (int) r4)     // Catch:{ Exception -> 0x00ea }
        L_0x00e3:
            r1.inSampleSize = r4     // Catch:{ Exception -> 0x00ea }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r21, r22)     // Catch:{ Exception -> 0x00ea }
        L_0x00e9:
            return r0
        L_0x00ea:
            if (r3 == 0) goto L_0x00f0
            r3.recycle()
        L_0x00f0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.utils.w.a(java.lang.String, android.graphics.BitmapFactory$Options, int, int):android.graphics.Bitmap");
    }
}
