package com.amap.api.mapcore2d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;

public class bd {
    private static byte[] a(Bitmap bitmap) throws IOException {
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (int i = 0; i < 32; i++) {
                byteArrayOutputStream.write(0);
            }
            int i2 = width - 2;
            int[] iArr = new int[i2];
            bitmap.getPixels(iArr, 0, width, 1, 0, i2, 1);
            boolean z = iArr[0] == -16777216;
            boolean z2 = iArr[iArr.length - 1] == -16777216;
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < length; i5++) {
                if (i3 != iArr[i5]) {
                    i4++;
                    a((OutputStream) byteArrayOutputStream, i5);
                    i3 = iArr[i5];
                }
            }
            if (z2) {
                i4++;
                a((OutputStream) byteArrayOutputStream, length);
            }
            int i6 = i4 + 1;
            if (z) {
                i6--;
            }
            if (z2) {
                i6--;
            }
            int i7 = height - 2;
            int[] iArr2 = new int[i7];
            bitmap.getPixels(iArr2, 0, 1, 0, 1, 1, i7);
            boolean z3 = iArr2[0] == -16777216;
            boolean z4 = iArr2[iArr2.length - 1] == -16777216;
            int length2 = iArr2.length;
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < length2; i10++) {
                if (i8 != iArr2[i10]) {
                    i9++;
                    a((OutputStream) byteArrayOutputStream, i10);
                    i8 = iArr2[i10];
                }
            }
            if (z4) {
                i9++;
                a((OutputStream) byteArrayOutputStream, length2);
            }
            int i11 = i9 + 1;
            if (z3) {
                i11--;
            }
            if (z4) {
                i11--;
            }
            int i12 = 0;
            while (true) {
                int i13 = i6 * i11;
                if (i12 < i13) {
                    a((OutputStream) byteArrayOutputStream, 1);
                    i12++;
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArray[0] = 1;
                    byteArray[1] = (byte) i4;
                    byteArray[2] = (byte) i9;
                    byteArray[3] = (byte) i13;
                    a(bitmap, byteArray);
                    return byteArray;
                }
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Bitmap a(InputStream inputStream) throws Exception {
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
            byte[] a2 = a(decodeStream);
            if (a2 == null || !NinePatch.isNinePatchChunk(a2)) {
                return decodeStream;
            }
            Bitmap createBitmap = Bitmap.createBitmap(decodeStream, 1, 1, decodeStream.getWidth() - 2, decodeStream.getHeight() - 2);
            decodeStream.recycle();
            Field declaredField = createBitmap.getClass().getDeclaredField("mNinePatchChunk");
            declaredField.setAccessible(true);
            declaredField.set(createBitmap, a2);
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Bitmap b(Context context, String str) throws Exception {
        InputStream open = context.getAssets().open(str);
        Bitmap a2 = a(open);
        open.close();
        return a2;
    }

    private static void a(OutputStream outputStream, int i) throws IOException {
        outputStream.write((i >> 0) & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    private static int a(byte[] bArr, int i) {
        int i2 = (bArr[i + 1] & 255) << 8;
        return ((bArr[i + 3] & 255) << 24) | i2 | (bArr[i + 0] & 255) | ((bArr[i + 2] & 255) << 16);
    }

    public static Drawable a(Context context, String str) throws Exception {
        Bitmap b2 = b(context, str);
        if (b2.getNinePatchChunk() == null) {
            return new BitmapDrawable(b2);
        }
        Rect rect = new Rect();
        a(b2.getNinePatchChunk(), rect);
        NinePatchDrawable ninePatchDrawable = new NinePatchDrawable(context.getResources(), b2, b2.getNinePatchChunk(), rect, null);
        return ninePatchDrawable;
    }

    private static void a(Bitmap bitmap, byte[] bArr) {
        int[] iArr = new int[(bitmap.getWidth() - 2)];
        bitmap.getPixels(iArr, 0, iArr.length, 1, bitmap.getHeight() - 1, iArr.length, 1);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= iArr.length) {
                break;
            } else if (-16777216 == iArr[i2]) {
                a(bArr, 12, i2);
                break;
            } else {
                i2++;
            }
        }
        int length = iArr.length - 1;
        while (true) {
            if (length < 0) {
                break;
            } else if (-16777216 == iArr[length]) {
                a(bArr, 16, (iArr.length - length) - 2);
                break;
            } else {
                length--;
            }
        }
        int[] iArr2 = new int[(bitmap.getHeight() - 2)];
        bitmap.getPixels(iArr2, 0, 1, bitmap.getWidth() - 1, 0, 1, iArr2.length);
        while (true) {
            if (i >= iArr2.length) {
                break;
            } else if (-16777216 == iArr2[i]) {
                a(bArr, 20, i);
                break;
            } else {
                i++;
            }
        }
        for (int length2 = iArr2.length - 1; length2 >= 0; length2--) {
            if (-16777216 == iArr2[length2]) {
                a(bArr, 24, (iArr2.length - length2) - 2);
                return;
            }
        }
    }

    private static void a(byte[] bArr, Rect rect) {
        rect.left = a(bArr, 12);
        rect.right = a(bArr, 16);
        rect.top = a(bArr, 20);
        rect.bottom = a(bArr, 24);
    }

    private static void a(byte[] bArr, int i, int i2) {
        bArr[i + 0] = (byte) (i2 >> 0);
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i + 2] = (byte) (i2 >> 16);
        bArr[i + 3] = (byte) (i2 >> 24);
    }
}
