package com.facebook.webpsupport;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import com.ss.android.ugc.webpcompat.WebpCompatManager;
import com.taobao.android.dexposed.DexposedBridge;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import me.ele.lancet.base.annotations.Insert;
import me.ele.lancet.base.annotations.TargetClass;

public final class a {
    @Insert
    @TargetClass
    static Bitmap a(FileDescriptor fileDescriptor) {
        if (Build.VERSION.SDK_INT > 17) {
            return BitmapFactory.decodeFileDescriptor(fileDescriptor);
        }
        try {
            return (Bitmap) DexposedBridge.invokeOriginalMethod(WebpCompatManager.decodeFileDescriptorMethod, null, new Object[]{fileDescriptor, null, null});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Insert
    @TargetClass
    static Bitmap a(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        if (Build.VERSION.SDK_INT > 17) {
            return BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
        }
        try {
            return (Bitmap) DexposedBridge.invokeOriginalMethod(WebpCompatManager.decodeFileDescriptorMethod, null, new Object[]{fileDescriptor, rect, options});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Insert
    @TargetClass
    static Bitmap a(InputStream inputStream) {
        if (Build.VERSION.SDK_INT > 17) {
            return BitmapFactory.decodeStream(inputStream);
        }
        try {
            return (Bitmap) DexposedBridge.invokeOriginalMethod(WebpCompatManager.decodeStreamMethod, null, new Object[]{inputStream, null, null});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Insert
    @TargetClass
    static Bitmap a(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        if (Build.VERSION.SDK_INT > 17) {
            return BitmapFactory.decodeStream(inputStream, rect, options);
        }
        try {
            return (Bitmap) DexposedBridge.invokeOriginalMethod(WebpCompatManager.decodeStreamMethod, null, new Object[]{inputStream, rect, options});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Insert
    @TargetClass
    static Bitmap a(String str) {
        if (Build.VERSION.SDK_INT > 17) {
            return BitmapFactory.decodeFile(str);
        }
        try {
            return (Bitmap) DexposedBridge.invokeOriginalMethod(WebpCompatManager.decodeFileMethod, null, new Object[]{str, null});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Insert
    @TargetClass
    static Bitmap a(String str, BitmapFactory.Options options) {
        if (Build.VERSION.SDK_INT > 17) {
            return BitmapFactory.decodeFile(str, options);
        }
        try {
            return (Bitmap) DexposedBridge.invokeOriginalMethod(WebpCompatManager.decodeFileMethod, null, new Object[]{str, options});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Insert
    @TargetClass
    static Bitmap a(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        if (Build.VERSION.SDK_INT > 17) {
            return BitmapFactory.decodeByteArray(bArr, i, i2, options);
        }
        try {
            return (Bitmap) DexposedBridge.invokeOriginalMethod(WebpCompatManager.decodeByteArrayMethod, null, new Object[]{bArr, Integer.valueOf(i), Integer.valueOf(i2), options});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
