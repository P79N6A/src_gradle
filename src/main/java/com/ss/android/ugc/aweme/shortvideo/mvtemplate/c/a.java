package com.ss.android.ugc.aweme.shortvideo.mvtemplate.c;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.media.ExifInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.video.b;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68503a;

    public static int[] a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f68503a, true, 78095, new Class[]{String.class}, int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[]{str2}, null, f68503a, true, 78095, new Class[]{String.class}, int[].class);
        } else if (!b.b(str)) {
            return null;
        } else {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str2, options);
            return new int[]{options.outWidth, options.outHeight};
        }
    }

    public static boolean a(Bitmap bitmap, File file, int i, Bitmap.CompressFormat compressFormat) {
        Bitmap bitmap2 = bitmap;
        File file2 = file;
        Bitmap.CompressFormat compressFormat2 = compressFormat;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{bitmap2, file2, 100, compressFormat2}, null, f68503a, true, 78096, new Class[]{Bitmap.class, File.class, Integer.TYPE, Bitmap.CompressFormat.class}, Boolean.TYPE)) {
            Object[] objArr = {bitmap2, file2, 100, compressFormat2};
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, f68503a, true, 78096, new Class[]{Bitmap.class, File.class, Integer.TYPE, Bitmap.CompressFormat.class}, Boolean.TYPE)).booleanValue();
        }
        BufferedOutputStream bufferedOutputStream = null;
        try {
            if (bitmap.isRecycled()) {
                a((OutputStream) null);
                return false;
            }
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file2));
            try {
                bitmap2.compress(compressFormat2, 100, bufferedOutputStream2);
                bufferedOutputStream2.flush();
                a((OutputStream) bufferedOutputStream2);
            } catch (Exception unused) {
                bufferedOutputStream = bufferedOutputStream2;
                a((OutputStream) bufferedOutputStream);
                z = false;
                return z;
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream = bufferedOutputStream2;
                a((OutputStream) bufferedOutputStream);
                throw th;
            }
            return z;
        } catch (Exception unused2) {
            a((OutputStream) bufferedOutputStream);
            z = false;
            return z;
        } catch (Throwable th2) {
            th = th2;
            a((OutputStream) bufferedOutputStream);
            throw th;
        }
    }

    private static void a(Bitmap bitmap) {
        if (PatchProxy.isSupport(new Object[]{bitmap}, null, f68503a, true, 78090, new Class[]{Bitmap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap}, null, f68503a, true, 78090, new Class[]{Bitmap.class}, Void.TYPE);
            return;
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    public static int b(String str) {
        String str2 = str;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f68503a, true, 78097, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, null, f68503a, true, 78097, new Class[]{String.class}, Integer.TYPE)).intValue();
        } else if (!b.b(str)) {
            return 0;
        } else {
            try {
                int attributeInt = new ExifInterface(str2).getAttributeInt("Orientation", 1);
                if (attributeInt == 3) {
                    i = 180;
                } else if (attributeInt == 6) {
                    i = 90;
                } else if (attributeInt == 8) {
                    i = 270;
                }
                return i;
            } catch (Exception unused) {
                return 0;
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap a(java.io.File r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f68503a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.io.File> r3 = java.io.File.class
            r7[r9] = r3
            java.lang.Class<android.graphics.Bitmap> r8 = android.graphics.Bitmap.class
            r3 = 0
            r5 = 1
            r6 = 78098(0x13112, float:1.09439E-40)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f68503a
            r13 = 1
            r14 = 78098(0x13112, float:1.09439E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.io.File> r0 = java.io.File.class
            r15[r9] = r0
            java.lang.Class<android.graphics.Bitmap> r16 = android.graphics.Bitmap.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            return r0
        L_0x0037:
            boolean r1 = r17.exists()
            r2 = 0
            if (r1 != 0) goto L_0x003f
            return r2
        L_0x003f:
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.RGB_565
            r1.inPreferredConfig = r3
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0061, all -> 0x005c }
            r3.<init>(r0)     // Catch:{ Exception -> 0x0061, all -> 0x005c }
            java.lang.String r0 = r17.getAbsolutePath()     // Catch:{ Exception -> 0x0062, all -> 0x0059 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r0, r1)     // Catch:{ Exception -> 0x0062, all -> 0x0059 }
            r3.close()     // Catch:{ Exception -> 0x0058 }
        L_0x0058:
            return r0
        L_0x0059:
            r0 = move-exception
            r2 = r3
            goto L_0x005d
        L_0x005c:
            r0 = move-exception
        L_0x005d:
            r2.close()     // Catch:{ Exception -> 0x0060 }
        L_0x0060:
            throw r0
        L_0x0061:
            r3 = r2
        L_0x0062:
            r3.close()     // Catch:{ Exception -> 0x0065 }
        L_0x0065:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.c.a.a(java.io.File):android.graphics.Bitmap");
    }

    private static void a(OutputStream outputStream) {
        if (PatchProxy.isSupport(new Object[]{outputStream}, null, f68503a, true, 78091, new Class[]{OutputStream.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{outputStream}, null, f68503a, true, 78091, new Class[]{OutputStream.class}, Void.TYPE);
        } else if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    private static Bitmap a(Bitmap bitmap, int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{bitmap, Integer.valueOf(i)}, null, f68503a, true, 78089, new Class[]{Bitmap.class, Integer.TYPE}, Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[]{bitmap, Integer.valueOf(i)}, null, f68503a, true, 78089, new Class[]{Bitmap.class, Integer.TYPE}, Bitmap.class);
        } else if (i2 == 0 || bitmap == null) {
            return bitmap;
        } else {
            Matrix matrix = new Matrix();
            matrix.setRotate((float) i2);
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
            a(bitmap);
            return createBitmap;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap a(android.graphics.Bitmap r23, int r24, int r25, int r26) {
        /*
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = 4
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r24)
            r12 = 1
            r4[r12] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r25)
            r13 = 2
            r4[r13] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r26)
            r14 = 3
            r4[r14] = r5
            com.meituan.robust.ChangeQuickRedirect r6 = f68503a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<android.graphics.Bitmap> r5 = android.graphics.Bitmap.class
            r9[r11] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r9[r12] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r9[r13] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r9[r14] = r5
            java.lang.Class<android.graphics.Bitmap> r10 = android.graphics.Bitmap.class
            r5 = 0
            r7 = 1
            r8 = 78088(0x13108, float:1.09425E-40)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object[] r15 = new java.lang.Object[r3]
            r15[r11] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r24)
            r15[r12] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r25)
            r15[r13] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r26)
            r15[r14] = r0
            r16 = 0
            com.meituan.robust.ChangeQuickRedirect r17 = f68503a
            r18 = 1
            r19 = 78088(0x13108, float:1.09425E-40)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r0[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r14] = r1
            java.lang.Class<android.graphics.Bitmap> r21 = android.graphics.Bitmap.class
            r20 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            return r0
        L_0x007e:
            r3 = r26
            android.graphics.Bitmap r0 = a(r0, r3)
            int r3 = r0.getWidth()
            float r3 = (float) r3
            int r4 = r0.getHeight()
            float r4 = (float) r4
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1073741824(0x40000000, float:2.0)
            r10 = 0
            if (r1 <= r2) goto L_0x00b1
            float r7 = (float) r1
            float r7 = r7 * r5
            float r5 = (float) r2
            float r7 = r7 / r5
            float r5 = r3 / r7
            int r8 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x00a6
            float r4 = r4 - r5
            float r4 = r4 / r6
        L_0x00a2:
            r6 = r4
            r4 = r5
            r5 = 0
            goto L_0x00d5
        L_0x00a6:
            float r5 = r4 * r7
            float r3 = r3 - r5
            float r3 = r3 / r6
        L_0x00aa:
            r6 = 0
            r22 = r5
            r5 = r3
            r3 = r22
            goto L_0x00d5
        L_0x00b1:
            if (r1 >= r2) goto L_0x00c6
            float r7 = (float) r2
            float r7 = r7 * r5
            float r5 = (float) r1
            float r7 = r7 / r5
            float r5 = r4 / r7
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x00c1
            float r3 = r3 - r5
            float r3 = r3 / r6
            goto L_0x00aa
        L_0x00c1:
            float r5 = r3 * r7
            float r4 = r4 - r5
            float r4 = r4 / r6
            goto L_0x00a2
        L_0x00c6:
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x00d0
            float r3 = r3 - r4
            float r3 = r3 / r6
            r5 = r3
            r3 = r4
            r6 = 0
            goto L_0x00d5
        L_0x00d0:
            float r4 = r4 - r3
            float r4 = r4 / r6
            r6 = r4
            r5 = 0
            r4 = r3
        L_0x00d5:
            android.graphics.Matrix r8 = new android.graphics.Matrix
            r8.<init>()
            float r7 = (float) r1
            float r7 = r7 / r3
            float r9 = (float) r2
            float r9 = r9 / r4
            r8.postScale(r7, r9)
            int r5 = (int) r5
            int r6 = (int) r6
            int r7 = (int) r3
            int r9 = (int) r4
            r13 = 0
            r3 = r0
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r9
            r9 = r13
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r4, r5, r6, r7, r8, r9)
            if (r3 != 0) goto L_0x00f4
            r0 = 0
            return r0
        L_0x00f4:
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.RGB_565
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r2, r4)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r1)
            android.graphics.PaintFlagsDrawFilter r4 = new android.graphics.PaintFlagsDrawFilter
            r4.<init>(r11, r14)
            r2.setDrawFilter(r4)
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r4.setAntiAlias(r12)
            r2.drawBitmap(r3, r10, r10, r4)
            a((android.graphics.Bitmap) r0)
            a((android.graphics.Bitmap) r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.c.a.a(android.graphics.Bitmap, int, int, int):android.graphics.Bitmap");
    }

    public static Bitmap a(String str, int i, int i2, int i3, int i4) {
        boolean z;
        float f2;
        int i5;
        int i6;
        String str2 = str;
        int i7 = i;
        int i8 = i2;
        int i9 = i3;
        int i10 = i4;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, null, f68503a, true, 78085, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Bitmap.class)) {
            Object[] objArr = {str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, f68503a, true, 78085, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Bitmap.class);
        }
        Bitmap a2 = a(new File(str2));
        if (a2 == null) {
            return null;
        }
        if (i10 == 1) {
            return a(a2, i7, i8, i9);
        }
        if (i10 == 3) {
            Object[] objArr2 = {a2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            if (PatchProxy.isSupport(objArr2, null, f68503a, true, 78087, new Class[]{Bitmap.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Bitmap.class)) {
                Object[] objArr3 = {a2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                return (Bitmap) PatchProxy.accessDispatch(objArr3, null, f68503a, true, 78087, new Class[]{Bitmap.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Bitmap.class);
            }
            Bitmap a3 = a(a2, i9);
            int width = a3.getWidth();
            int height = a3.getHeight();
            if (width < height || width <= i7) {
                if (width >= height || height <= i8) {
                    f2 = 1.0f;
                } else {
                    f2 = (((float) i8) * 1.0f) / ((float) height);
                }
                z = false;
            } else {
                f2 = (((float) i7) * 1.0f) / ((float) width);
                z = true;
            }
            if (f2 <= 0.0f) {
                f2 = 1.0f;
            }
            Matrix matrix = new Matrix();
            matrix.postScale(f2, f2);
            if (width <= 0 || height <= 0) {
                return null;
            }
            Bitmap createBitmap = Bitmap.createBitmap(a3, 0, 0, width, height, matrix, false);
            if (createBitmap == null) {
                return null;
            }
            if (z) {
                i5 = (i8 - createBitmap.getHeight()) / 2;
                i6 = 0;
            } else {
                i6 = (i7 - createBitmap.getWidth()) / 2;
                i5 = 0;
            }
            Bitmap createBitmap2 = Bitmap.createBitmap(i7, i8, Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(createBitmap2);
            canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            canvas.drawBitmap(createBitmap, (float) i6, (float) i5, paint);
            a(a3);
            a(createBitmap);
            return createBitmap2;
        } else if (i10 != 2) {
            return a(a2, i7, i8, i9);
        } else {
            Object[] objArr4 = {a2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            if (PatchProxy.isSupport(objArr4, null, f68503a, true, 78086, new Class[]{Bitmap.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Bitmap.class)) {
                Object[] objArr5 = {a2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                return (Bitmap) PatchProxy.accessDispatch(objArr5, null, f68503a, true, 78086, new Class[]{Bitmap.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Bitmap.class);
            }
            Bitmap a4 = a(a2, i9);
            int width2 = a4.getWidth();
            int height2 = a4.getHeight();
            float f3 = (((float) i7) * 1.0f) / ((float) width2);
            Matrix matrix2 = new Matrix();
            matrix2.postScale(f3, f3);
            if (width2 <= 0 || height2 <= 0) {
                return null;
            }
            Bitmap createBitmap3 = Bitmap.createBitmap(a4, 0, 0, width2, height2, matrix2, false);
            if (createBitmap3 == null) {
                return null;
            }
            int height3 = (i8 - createBitmap3.getHeight()) / 2;
            if (height3 < 0) {
                height3 = 0;
            }
            Bitmap createBitmap4 = Bitmap.createBitmap(i7, i8, Bitmap.Config.RGB_565);
            Canvas canvas2 = new Canvas(createBitmap4);
            canvas2.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
            Paint paint2 = new Paint();
            paint2.setAntiAlias(true);
            canvas2.drawBitmap(createBitmap3, 0.0f, (float) height3, paint2);
            a(a4);
            a(createBitmap3);
            return createBitmap4;
        }
    }
}
