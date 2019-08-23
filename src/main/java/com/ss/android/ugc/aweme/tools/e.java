package com.ss.android.ugc.aweme.tools;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74689a;

    public static void a(Bitmap bitmap) {
        if (PatchProxy.isSupport(new Object[]{bitmap}, null, f74689a, true, 86947, new Class[]{Bitmap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap}, null, f74689a, true, 86947, new Class[]{Bitmap.class}, Void.TYPE);
            return;
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    private static void a(OutputStream outputStream) {
        if (PatchProxy.isSupport(new Object[]{outputStream}, null, f74689a, true, 86946, new Class[]{OutputStream.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{outputStream}, null, f74689a, true, 86946, new Class[]{OutputStream.class}, Void.TYPE);
        } else if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static Bitmap a(@NonNull String str, @NonNull int[] iArr) {
        int i;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, iArr}, null, f74689a, true, 86945, new Class[]{String.class, int[].class}, Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[]{str2, iArr}, null, f74689a, true, 86945, new Class[]{String.class, int[].class}, Bitmap.class);
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            options.inPreferredConfig = Bitmap.Config.RGB_565;
            BitmapFactory.decodeFile(str2, options);
            options.inJustDecodeBounds = false;
            int i2 = options.outWidth;
            int i3 = options.outHeight;
            int i4 = iArr[0];
            int i5 = iArr[1];
            if (i2 >= i3 && i2 > i4) {
                i = i2 / i4;
            } else if (i2 >= i3 || i3 <= i5) {
                i = 1;
            } else {
                i = i3 / i5;
            }
            if (i <= 0) {
                i = 1;
            }
            options.inSampleSize = i;
            return BitmapFactory.decodeFile(str2, options);
        }
    }

    public static boolean a(Bitmap bitmap, File file, int i, Bitmap.CompressFormat compressFormat) {
        Bitmap bitmap2 = bitmap;
        File file2 = file;
        Bitmap.CompressFormat compressFormat2 = compressFormat;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{bitmap2, file2, Integer.valueOf(i), compressFormat2}, null, f74689a, true, 86944, new Class[]{Bitmap.class, File.class, Integer.TYPE, Bitmap.CompressFormat.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{bitmap2, file2, Integer.valueOf(i), compressFormat2}, null, f74689a, true, 86944, new Class[]{Bitmap.class, File.class, Integer.TYPE, Bitmap.CompressFormat.class}, Boolean.TYPE)).booleanValue();
        }
        BufferedOutputStream bufferedOutputStream = null;
        try {
            if (bitmap.isRecycled()) {
                a((OutputStream) null);
                return false;
            }
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file2));
            try {
                bitmap2.compress(compressFormat2, i, bufferedOutputStream2);
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
}
