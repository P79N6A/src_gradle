package com.ss.android.medialib.jni;

import android.graphics.Bitmap;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ttve.nativePort.b;

@Keep
public class BitmapJni {
    public static ChangeQuickRedirect changeQuickRedirect;

    private static native int nativeCompressBitmap(Bitmap bitmap, String str, int i);

    static {
        b.a();
    }

    public static int compressBitmap(Bitmap bitmap, String str, int i) {
        if (!PatchProxy.isSupport(new Object[]{bitmap, str, Integer.valueOf(i)}, null, changeQuickRedirect, true, 17438, new Class[]{Bitmap.class, String.class, Integer.TYPE}, Integer.TYPE)) {
            return nativeCompressBitmap(bitmap, str, i);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{bitmap, str, Integer.valueOf(i)}, null, changeQuickRedirect, true, 17438, new Class[]{Bitmap.class, String.class, Integer.TYPE}, Integer.TYPE)).intValue();
    }
}
