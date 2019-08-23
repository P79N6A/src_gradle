package com.ss.android.medialib;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Locale;

@Keep
public class OpenGLUtils {
    private static final String FAIL_RES = String.format(Locale.US, "{%s: false}", new Object[]{"\"res\""});
    public static ChangeQuickRedirect changeQuickRedirect;

    @Keep
    public static String loadTexture(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, changeQuickRedirect, true, 16587, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, null, changeQuickRedirect, true, 16587, new Class[]{String.class}, String.class);
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        if (decodeFile == null) {
            return FAIL_RES;
        }
        int loadTexture = loadTexture(decodeFile, -1, false);
        return String.format(Locale.US, "{%s: true, %s: %d, %s: %d, %s: %d}", new Object[]{"\"res\"", "\"width\"", Integer.valueOf(decodeFile.getWidth()), "\"height\"", Integer.valueOf(decodeFile.getHeight()), "\"textureId\"", Integer.valueOf(loadTexture)});
    }

    public static int loadTexture(Bitmap bitmap, int i) {
        Bitmap bitmap2 = bitmap;
        if (!PatchProxy.isSupport(new Object[]{bitmap2, Integer.valueOf(i)}, null, changeQuickRedirect, true, 16588, new Class[]{Bitmap.class, Integer.TYPE}, Integer.TYPE)) {
            return loadTexture(bitmap2, i, false);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{bitmap2, Integer.valueOf(i)}, null, changeQuickRedirect, true, 16588, new Class[]{Bitmap.class, Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public static int loadTexture(Bitmap bitmap, int i, boolean z) {
        Bitmap bitmap2 = bitmap;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{bitmap2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 16589, new Class[]{Bitmap.class, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{bitmap2, Integer.valueOf(i), Byte.valueOf(z)}, null, changeQuickRedirect, true, 16589, new Class[]{Bitmap.class, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)).intValue();
        } else if (bitmap2 == null) {
            return -1;
        } else {
            int[] iArr = new int[1];
            if (i2 == -1) {
                GLES20.glGenTextures(1, iArr, 0);
                GLES20.glBindTexture(3553, iArr[0]);
                GLES20.glTexParameterf(3553, 10240, 9729.0f);
                GLES20.glTexParameterf(3553, 10241, 9729.0f);
                GLES20.glTexParameterf(3553, 10242, 33071.0f);
                GLES20.glTexParameterf(3553, 10243, 33071.0f);
                GLUtils.texImage2D(3553, 0, bitmap2, 0);
            } else {
                GLES20.glBindTexture(3553, i2);
                GLUtils.texImage2D(3553, 0, bitmap2, 0);
                iArr[0] = i2;
            }
            if (z) {
                bitmap.recycle();
            }
            return iArr[0];
        }
    }
}
