package com.ss.android.ugc.aweme.utils;

import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75970a;

    public static void a(Bitmap bitmap) {
        if (PatchProxy.isSupport(new Object[]{bitmap}, null, f75970a, true, 88019, new Class[]{Bitmap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap}, null, f75970a, true, 88019, new Class[]{Bitmap.class}, Void.TYPE);
            return;
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    private static void a(OutputStream outputStream) {
        if (PatchProxy.isSupport(new Object[]{outputStream}, null, f75970a, true, 88018, new Class[]{OutputStream.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{outputStream}, null, f75970a, true, 88018, new Class[]{OutputStream.class}, Void.TYPE);
        } else if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean a(Bitmap bitmap, File file, int i, Bitmap.CompressFormat compressFormat) {
        Bitmap bitmap2 = bitmap;
        File file2 = file;
        Bitmap.CompressFormat compressFormat2 = compressFormat;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{bitmap2, file2, 100, compressFormat2}, null, f75970a, true, 88017, new Class[]{Bitmap.class, File.class, Integer.TYPE, Bitmap.CompressFormat.class}, Boolean.TYPE)) {
            Object[] objArr = {bitmap2, file2, 100, compressFormat2};
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, f75970a, true, 88017, new Class[]{Bitmap.class, File.class, Integer.TYPE, Bitmap.CompressFormat.class}, Boolean.TYPE)).booleanValue();
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
}
